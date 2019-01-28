package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;


















































































public class ReaderInputStream
  extends InputStream
{
  private static final int DEFAULT_BUFFER_SIZE = 1024;
  private final Reader reader;
  private final CharsetEncoder encoder;
  private final CharBuffer encoderIn;
  private final ByteBuffer encoderOut;
  private CoderResult lastCoderResult;
  private boolean endOfInput;
  
  public ReaderInputStream(Reader reader, CharsetEncoder encoder)
  {
    this(reader, encoder, 1024);
  }
  







  public ReaderInputStream(Reader reader, CharsetEncoder encoder, int bufferSize)
  {
    this.reader = reader;
    this.encoder = encoder;
    encoderIn = CharBuffer.allocate(bufferSize);
    encoderIn.flip();
    encoderOut = ByteBuffer.allocate(128);
    encoderOut.flip();
  }
  






  public ReaderInputStream(Reader reader, Charset charset, int bufferSize)
  {
    this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), bufferSize);
  }
  










  public ReaderInputStream(Reader reader, Charset charset)
  {
    this(reader, charset, 1024);
  }
  






  public ReaderInputStream(Reader reader, String charsetName, int bufferSize)
  {
    this(reader, Charset.forName(charsetName), bufferSize);
  }
  






  public ReaderInputStream(Reader reader, String charsetName)
  {
    this(reader, charsetName, 1024);
  }
  





  public ReaderInputStream(Reader reader)
  {
    this(reader, Charset.defaultCharset());
  }
  




  private void fillBuffer()
    throws IOException
  {
    if ((!endOfInput) && ((lastCoderResult == null) || (lastCoderResult.isUnderflow()))) {
      encoderIn.compact();
      int position = encoderIn.position();
      


      int c = reader.read(encoderIn.array(), position, encoderIn.remaining());
      if (c == -1) {
        endOfInput = true;
      } else {
        encoderIn.position(position + c);
      }
      encoderIn.flip();
    }
    encoderOut.compact();
    lastCoderResult = encoder.encode(encoderIn, encoderOut, endOfInput);
    encoderOut.flip();
  }
  









  public int read(byte[] b, int off, int len)
    throws IOException
  {
    if (b == null) {
      throw new NullPointerException("Byte array must not be null");
    }
    if ((len < 0) || (off < 0) || (off + len > b.length)) {
      throw new IndexOutOfBoundsException("Array Size=" + b.length + ", offset=" + off + ", length=" + len);
    }
    
    int read = 0;
    if (len == 0) {
      return 0;
    }
    while (len > 0) {
      if (encoderOut.hasRemaining()) {
        int c = Math.min(encoderOut.remaining(), len);
        encoderOut.get(b, off, c);
        off += c;
        len -= c;
        read += c;
      } else {
        fillBuffer();
        if ((endOfInput) && (!encoderOut.hasRemaining())) {
          break;
        }
      }
    }
    return (read == 0) && (endOfInput) ? -1 : read;
  }
  







  public int read(byte[] b)
    throws IOException
  {
    return read(b, 0, b.length);
  }
  





  public int read()
    throws IOException
  {
    do
    {
      if (encoderOut.hasRemaining()) {
        return encoderOut.get() & 0xFF;
      }
      fillBuffer();
    } while ((!endOfInput) || (encoderOut.hasRemaining()));
    return -1;
  }
  







  public void close()
    throws IOException
  {
    reader.close();
  }
}
