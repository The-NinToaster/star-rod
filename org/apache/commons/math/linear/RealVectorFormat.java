package org.apache.commons.math.linear;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.CompositeFormat;

























































public class RealVectorFormat
  extends CompositeFormat
{
  private static final long serialVersionUID = -708767813036157690L;
  private static final String DEFAULT_PREFIX = "{";
  private static final String DEFAULT_SUFFIX = "}";
  private static final String DEFAULT_SEPARATOR = "; ";
  private final String prefix;
  private final String suffix;
  private final String separator;
  private final String trimmedPrefix;
  private final String trimmedSuffix;
  private final String trimmedSeparator;
  private final NumberFormat format;
  
  public RealVectorFormat()
  {
    this("{", "}", "; ", getDefaultNumberFormat());
  }
  



  public RealVectorFormat(NumberFormat format)
  {
    this("{", "}", "; ", format);
  }
  






  public RealVectorFormat(String prefix, String suffix, String separator)
  {
    this(prefix, suffix, separator, getDefaultNumberFormat());
  }
  








  public RealVectorFormat(String prefix, String suffix, String separator, NumberFormat format)
  {
    this.prefix = prefix;
    this.suffix = suffix;
    this.separator = separator;
    trimmedPrefix = prefix.trim();
    trimmedSuffix = suffix.trim();
    trimmedSeparator = separator.trim();
    this.format = format;
  }
  




  public static Locale[] getAvailableLocales()
  {
    return NumberFormat.getAvailableLocales();
  }
  



  public String getPrefix()
  {
    return prefix;
  }
  



  public String getSuffix()
  {
    return suffix;
  }
  



  public String getSeparator()
  {
    return separator;
  }
  



  public NumberFormat getFormat()
  {
    return format;
  }
  



  public static RealVectorFormat getInstance()
  {
    return getInstance(Locale.getDefault());
  }
  




  public static RealVectorFormat getInstance(Locale locale)
  {
    return new RealVectorFormat(getDefaultNumberFormat(locale));
  }
  






  public static String formatRealVector(RealVector v)
  {
    return getInstance().format(v);
  }
  









  public StringBuffer format(RealVector vector, StringBuffer toAppendTo, FieldPosition pos)
  {
    pos.setBeginIndex(0);
    pos.setEndIndex(0);
    

    toAppendTo.append(prefix);
    

    for (int i = 0; i < vector.getDimension(); i++) {
      if (i > 0) {
        toAppendTo.append(separator);
      }
      formatDouble(vector.getEntry(i), format, toAppendTo, pos);
    }
    

    toAppendTo.append(suffix);
    
    return toAppendTo;
  }
  















  public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos)
  {
    if ((obj instanceof RealVector)) {
      return format((RealVector)obj, toAppendTo, pos);
    }
    
    throw MathRuntimeException.createIllegalArgumentException(LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR, new Object[] { obj.getClass().getName() });
  }
  








  public ArrayRealVector parse(String source)
    throws ParseException
  {
    ParsePosition parsePosition = new ParsePosition(0);
    ArrayRealVector result = parse(source, parsePosition);
    if (parsePosition.getIndex() == 0) {
      throw MathRuntimeException.createParseException(parsePosition.getErrorIndex(), LocalizedFormats.UNPARSEABLE_REAL_VECTOR, new Object[] { source });
    }
    

    return result;
  }
  





  public ArrayRealVector parse(String source, ParsePosition pos)
  {
    int initialIndex = pos.getIndex();
    

    parseAndIgnoreWhitespace(source, pos);
    if (!parseFixedstring(source, trimmedPrefix, pos)) {
      return null;
    }
    

    List<Number> components = new ArrayList();
    for (boolean loop = true; loop;)
    {
      if (!components.isEmpty()) {
        parseAndIgnoreWhitespace(source, pos);
        if (!parseFixedstring(source, trimmedSeparator, pos)) {
          loop = false;
        }
      }
      
      if (loop) {
        parseAndIgnoreWhitespace(source, pos);
        Number component = parseNumber(source, format, pos);
        if (component != null) {
          components.add(component);
        }
        else
        {
          pos.setIndex(initialIndex);
          return null;
        }
      }
    }
    


    parseAndIgnoreWhitespace(source, pos);
    if (!parseFixedstring(source, trimmedSuffix, pos)) {
      return null;
    }
    

    double[] data = new double[components.size()];
    for (int i = 0; i < data.length; i++) {
      data[i] = ((Number)components.get(i)).doubleValue();
    }
    return new ArrayRealVector(data, false);
  }
  








  public Object parseObject(String source, ParsePosition pos)
  {
    return parse(source, pos);
  }
}
