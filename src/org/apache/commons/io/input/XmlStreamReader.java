package org.apache.commons.io.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;



















































public class XmlStreamReader
  extends Reader
{
  private static final int BUFFER_SIZE = 4096;
  private static final String UTF_8 = "UTF-8";
  private static final String US_ASCII = "US-ASCII";
  private static final String UTF_16BE = "UTF-16BE";
  private static final String UTF_16LE = "UTF-16LE";
  private static final String UTF_16 = "UTF-16";
  private static final String EBCDIC = "CP1047";
  private static final ByteOrderMark[] BOMS = { ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE };
  



  private static final ByteOrderMark[] XML_GUESS_BYTES = { new ByteOrderMark("UTF-8", new int[] { 60, 63, 120, 109 }), new ByteOrderMark("UTF-16BE", new int[] { 0, 60, 0, 63 }), new ByteOrderMark("UTF-16LE", new int[] { 60, 0, 63, 0 }), new ByteOrderMark("CP1047", new int[] { 76, 111, 167, 148 }) };
  



  private final Reader reader;
  



  private final String encoding;
  



  private final String defaultEncoding;
  




  public String getDefaultEncoding()
  {
    return defaultEncoding;
  }
  










  public XmlStreamReader(File file)
    throws IOException
  {
    this(new FileInputStream(file));
  }
  









  public XmlStreamReader(InputStream is)
    throws IOException
  {
    this(is, true);
  }
  

























  public XmlStreamReader(InputStream is, boolean lenient)
    throws IOException
  {
    this(is, lenient, null);
  }
  


























  public XmlStreamReader(InputStream is, boolean lenient, String defaultEncoding)
    throws IOException
  {
    this.defaultEncoding = defaultEncoding;
    BOMInputStream bom = new BOMInputStream(new BufferedInputStream(is, 4096), false, BOMS);
    BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
    encoding = doRawStream(bom, pis, lenient);
    reader = new InputStreamReader(pis, encoding);
  }
  















  public XmlStreamReader(URL url)
    throws IOException
  {
    this(url.openConnection(), null);
  }
  

















  public XmlStreamReader(URLConnection conn, String defaultEncoding)
    throws IOException
  {
    this.defaultEncoding = defaultEncoding;
    boolean lenient = true;
    String contentType = conn.getContentType();
    InputStream is = conn.getInputStream();
    BOMInputStream bom = new BOMInputStream(new BufferedInputStream(is, 4096), false, BOMS);
    BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
    if (((conn instanceof HttpURLConnection)) || (contentType != null)) {
      encoding = doHttpStream(bom, pis, contentType, lenient);
    } else {
      encoding = doRawStream(bom, pis, lenient);
    }
    reader = new InputStreamReader(pis, encoding);
  }
  
















  public XmlStreamReader(InputStream is, String httpContentType)
    throws IOException
  {
    this(is, httpContentType, true);
  }
  

































  public XmlStreamReader(InputStream is, String httpContentType, boolean lenient, String defaultEncoding)
    throws IOException
  {
    this.defaultEncoding = defaultEncoding;
    BOMInputStream bom = new BOMInputStream(new BufferedInputStream(is, 4096), false, BOMS);
    BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
    encoding = doHttpStream(bom, pis, httpContentType, lenient);
    reader = new InputStreamReader(pis, encoding);
  }
  
































  public XmlStreamReader(InputStream is, String httpContentType, boolean lenient)
    throws IOException
  {
    this(is, httpContentType, lenient, null);
  }
  




  public String getEncoding()
  {
    return encoding;
  }
  







  public int read(char[] buf, int offset, int len)
    throws IOException
  {
    return reader.read(buf, offset, len);
  }
  




  public void close()
    throws IOException
  {
    reader.close();
  }
  









  private String doRawStream(BOMInputStream bom, BOMInputStream pis, boolean lenient)
    throws IOException
  {
    String bomEnc = bom.getBOMCharsetName();
    String xmlGuessEnc = pis.getBOMCharsetName();
    String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
    try {
      return calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
    } catch (XmlStreamReaderException ex) {
      if (lenient) {
        return doLenientDetection(null, ex);
      }
      throw ex;
    }
  }
  











  private String doHttpStream(BOMInputStream bom, BOMInputStream pis, String httpContentType, boolean lenient)
    throws IOException
  {
    String bomEnc = bom.getBOMCharsetName();
    String xmlGuessEnc = pis.getBOMCharsetName();
    String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
    try {
      return calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient);
    }
    catch (XmlStreamReaderException ex) {
      if (lenient) {
        return doLenientDetection(httpContentType, ex);
      }
      throw ex;
    }
  }
  









  private String doLenientDetection(String httpContentType, XmlStreamReaderException ex)
    throws IOException
  {
    if ((httpContentType != null) && (httpContentType.startsWith("text/html"))) {
      httpContentType = httpContentType.substring("text/html".length());
      httpContentType = "text/xml" + httpContentType;
      try {
        return calculateHttpEncoding(httpContentType, ex.getBomEncoding(), ex.getXmlGuessEncoding(), ex.getXmlEncoding(), true);
      }
      catch (XmlStreamReaderException ex2) {
        ex = ex2;
      }
    }
    String encoding = ex.getXmlEncoding();
    if (encoding == null) {
      encoding = ex.getContentTypeEncoding();
    }
    if (encoding == null) {
      encoding = defaultEncoding == null ? "UTF-8" : defaultEncoding;
    }
    return encoding;
  }
  










  String calculateRawEncoding(String bomEnc, String xmlGuessEnc, String xmlEnc)
    throws IOException
  {
    if (bomEnc == null) {
      if ((xmlGuessEnc == null) || (xmlEnc == null)) {
        return defaultEncoding == null ? "UTF-8" : defaultEncoding;
      }
      if ((xmlEnc.equals("UTF-16")) && ((xmlGuessEnc.equals("UTF-16BE")) || (xmlGuessEnc.equals("UTF-16LE"))))
      {
        return xmlGuessEnc;
      }
      return xmlEnc;
    }
    

    if (bomEnc.equals("UTF-8")) {
      if ((xmlGuessEnc != null) && (!xmlGuessEnc.equals("UTF-8"))) {
        String msg = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] { bomEnc, xmlGuessEnc, xmlEnc });
        throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
      }
      if ((xmlEnc != null) && (!xmlEnc.equals("UTF-8"))) {
        String msg = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] { bomEnc, xmlGuessEnc, xmlEnc });
        throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
      }
      return bomEnc;
    }
    

    if ((bomEnc.equals("UTF-16BE")) || (bomEnc.equals("UTF-16LE"))) {
      if ((xmlGuessEnc != null) && (!xmlGuessEnc.equals(bomEnc))) {
        String msg = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] { bomEnc, xmlGuessEnc, xmlEnc });
        throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
      }
      if ((xmlEnc != null) && (!xmlEnc.equals("UTF-16")) && (!xmlEnc.equals(bomEnc))) {
        String msg = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[] { bomEnc, xmlGuessEnc, xmlEnc });
        throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
      }
      return bomEnc;
    }
    

    String msg = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", new Object[] { bomEnc, xmlGuessEnc, xmlEnc });
    throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
  }
  















  String calculateHttpEncoding(String httpContentType, String bomEnc, String xmlGuessEnc, String xmlEnc, boolean lenient)
    throws IOException
  {
    if ((lenient) && (xmlEnc != null)) {
      return xmlEnc;
    }
    

    String cTMime = getContentTypeMime(httpContentType);
    String cTEnc = getContentTypeEncoding(httpContentType);
    boolean appXml = isAppXml(cTMime);
    boolean textXml = isTextXml(cTMime);
    

    if ((!appXml) && (!textXml)) {
      String msg = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", new Object[] { cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc });
      throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
    }
    

    if (cTEnc == null) {
      if (appXml) {
        return calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
      }
      return defaultEncoding == null ? "US-ASCII" : defaultEncoding;
    }
    


    if ((cTEnc.equals("UTF-16BE")) || (cTEnc.equals("UTF-16LE"))) {
      if (bomEnc != null) {
        String msg = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", new Object[] { cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc });
        throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
      }
      return cTEnc;
    }
    

    if (cTEnc.equals("UTF-16")) {
      if ((bomEnc != null) && (bomEnc.startsWith("UTF-16"))) {
        return bomEnc;
      }
      String msg = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", new Object[] { cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc });
      throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
    }
    
    return cTEnc;
  }
  





  static String getContentTypeMime(String httpContentType)
  {
    String mime = null;
    if (httpContentType != null) {
      int i = httpContentType.indexOf(";");
      if (i >= 0) {
        mime = httpContentType.substring(0, i);
      } else {
        mime = httpContentType;
      }
      mime = mime.trim();
    }
    return mime;
  }
  
  private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
  







  static String getContentTypeEncoding(String httpContentType)
  {
    String encoding = null;
    if (httpContentType != null) {
      int i = httpContentType.indexOf(";");
      if (i > -1) {
        String postMime = httpContentType.substring(i + 1);
        Matcher m = CHARSET_PATTERN.matcher(postMime);
        encoding = m.find() ? m.group(1) : null;
        encoding = encoding != null ? encoding.toUpperCase(Locale.US) : null;
      }
    }
    return encoding;
  }
  
  public static final Pattern ENCODING_PATTERN = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);
  
  private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
  
  private static final String RAW_EX_2 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
  
  private static final String HTTP_EX_1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
  
  private static final String HTTP_EX_2 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
  private static final String HTTP_EX_3 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
  
  private static String getXmlProlog(InputStream is, String guessedEnc)
    throws IOException
  {
    String encoding = null;
    if (guessedEnc != null) {
      byte[] bytes = new byte['က'];
      is.mark(4096);
      int offset = 0;
      int max = 4096;
      int c = is.read(bytes, offset, max);
      int firstGT = -1;
      String xmlProlog = null;
      while ((c != -1) && (firstGT == -1) && (offset < 4096)) {
        offset += c;
        max -= c;
        c = is.read(bytes, offset, max);
        xmlProlog = new String(bytes, 0, offset, guessedEnc);
        firstGT = xmlProlog.indexOf('>');
      }
      if (firstGT == -1) {
        if (c == -1) {
          throw new IOException("Unexpected end of XML stream");
        }
        throw new IOException("XML prolog or ROOT element not found on first " + offset + " bytes");
      }
      


      int bytesRead = offset;
      if (bytesRead > 0) {
        is.reset();
        BufferedReader bReader = new BufferedReader(new StringReader(xmlProlog.substring(0, firstGT + 1)));
        
        StringBuffer prolog = new StringBuffer();
        String line = bReader.readLine();
        while (line != null) {
          prolog.append(line);
          line = bReader.readLine();
        }
        Matcher m = ENCODING_PATTERN.matcher(prolog);
        if (m.find()) {
          encoding = m.group(1).toUpperCase();
          encoding = encoding.substring(1, encoding.length() - 1);
        }
      }
    }
    return encoding;
  }
  






  static boolean isAppXml(String mime)
  {
    return (mime != null) && ((mime.equals("application/xml")) || (mime.equals("application/xml-dtd")) || (mime.equals("application/xml-external-parsed-entity")) || ((mime.startsWith("application/")) && (mime.endsWith("+xml"))));
  }
  










  static boolean isTextXml(String mime)
  {
    return (mime != null) && ((mime.equals("text/xml")) || (mime.equals("text/xml-external-parsed-entity")) || ((mime.startsWith("text/")) && (mime.endsWith("+xml"))));
  }
}
