package org.apache.commons.math.fraction;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;


































public class ProperFractionFormat
  extends FractionFormat
{
  private static final long serialVersionUID = 760934726031766749L;
  private NumberFormat wholeFormat;
  
  public ProperFractionFormat()
  {
    this(getDefaultNumberFormat());
  }
  





  public ProperFractionFormat(NumberFormat format)
  {
    this(format, (NumberFormat)format.clone(), (NumberFormat)format.clone());
  }
  









  public ProperFractionFormat(NumberFormat wholeFormat, NumberFormat numeratorFormat, NumberFormat denominatorFormat)
  {
    super(numeratorFormat, denominatorFormat);
    setWholeFormat(wholeFormat);
  }
  












  public StringBuffer format(Fraction fraction, StringBuffer toAppendTo, FieldPosition pos)
  {
    pos.setBeginIndex(0);
    pos.setEndIndex(0);
    
    int num = fraction.getNumerator();
    int den = fraction.getDenominator();
    int whole = num / den;
    num %= den;
    
    if (whole != 0) {
      getWholeFormat().format(whole, toAppendTo, pos);
      toAppendTo.append(' ');
      num = Math.abs(num);
    }
    getNumeratorFormat().format(num, toAppendTo, pos);
    toAppendTo.append(" / ");
    getDenominatorFormat().format(den, toAppendTo, pos);
    

    return toAppendTo;
  }
  



  public NumberFormat getWholeFormat()
  {
    return wholeFormat;
  }
  













  public Fraction parse(String source, ParsePosition pos)
  {
    Fraction ret = super.parse(source, pos);
    if (ret != null) {
      return ret;
    }
    
    int initialIndex = pos.getIndex();
    

    parseAndIgnoreWhitespace(source, pos);
    

    Number whole = getWholeFormat().parse(source, pos);
    if (whole == null)
    {


      pos.setIndex(initialIndex);
      return null;
    }
    

    parseAndIgnoreWhitespace(source, pos);
    

    Number num = getNumeratorFormat().parse(source, pos);
    if (num == null)
    {


      pos.setIndex(initialIndex);
      return null;
    }
    
    if (num.intValue() < 0)
    {
      pos.setIndex(initialIndex);
      return null;
    }
    

    int startIndex = pos.getIndex();
    char c = parseNextCharacter(source, pos);
    switch (c)
    {

    case '\000': 
      return new Fraction(num.intValue(), 1);
    

    case '/': 
      break;
    

    default: 
      pos.setIndex(initialIndex);
      pos.setErrorIndex(startIndex);
      return null;
    }
    
    
    parseAndIgnoreWhitespace(source, pos);
    

    Number den = getDenominatorFormat().parse(source, pos);
    if (den == null)
    {


      pos.setIndex(initialIndex);
      return null;
    }
    
    if (den.intValue() < 0)
    {
      pos.setIndex(initialIndex);
      return null;
    }
    
    int w = whole.intValue();
    int n = num.intValue();
    int d = den.intValue();
    return new Fraction((Math.abs(w) * d + n) * MathUtils.sign(w), d);
  }
  




  public void setWholeFormat(NumberFormat format)
  {
    if (format == null) {
      throw new NullArgumentException(LocalizedFormats.WHOLE_FORMAT);
    }
    wholeFormat = format;
  }
}
