package org.apache.commons.math;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Locale;
import org.apache.commons.math.exception.MathThrowable;
import org.apache.commons.math.exception.util.DummyLocalizable;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;






































public class MathException
  extends Exception
  implements MathThrowable
{
  private static final long serialVersionUID = 7428019509644517071L;
  private final Localizable pattern;
  private final Object[] arguments;
  
  public MathException()
  {
    pattern = LocalizedFormats.SIMPLE_MESSAGE;
    arguments = new Object[] { "" };
  }
  







  @Deprecated
  public MathException(String pattern, Object... arguments)
  {
    this(new DummyLocalizable(pattern), arguments);
  }
  







  public MathException(Localizable pattern, Object... arguments)
  {
    this.pattern = pattern;
    this.arguments = (arguments == null ? new Object[0] : (Object[])arguments.clone());
  }
  






  public MathException(Throwable rootCause)
  {
    super(rootCause);
    pattern = LocalizedFormats.SIMPLE_MESSAGE;
    arguments = new Object[] { rootCause == null ? "" : rootCause.getMessage() };
  }
  










  @Deprecated
  public MathException(Throwable rootCause, String pattern, Object... arguments)
  {
    this(rootCause, new DummyLocalizable(pattern), arguments);
  }
  









  public MathException(Throwable rootCause, Localizable pattern, Object... arguments)
  {
    super(rootCause);
    this.pattern = pattern;
    this.arguments = (arguments == null ? new Object[0] : (Object[])arguments.clone());
  }
  





  @Deprecated
  public String getPattern()
  {
    return pattern.getSourceString();
  }
  




  public Localizable getSpecificPattern()
  {
    return null;
  }
  




  public Localizable getGeneralPattern()
  {
    return pattern;
  }
  
  public Object[] getArguments()
  {
    return (Object[])arguments.clone();
  }
  






  public String getMessage(Locale locale)
  {
    if (pattern != null) {
      return new MessageFormat(pattern.getLocalizedString(locale), locale).format(arguments);
    }
    return "";
  }
  

  public String getMessage()
  {
    return getMessage(Locale.US);
  }
  

  public String getLocalizedMessage()
  {
    return getMessage(Locale.getDefault());
  }
  



  public void printStackTrace()
  {
    printStackTrace(System.err);
  }
  





  public void printStackTrace(PrintStream out)
  {
    synchronized (out) {
      PrintWriter pw = new PrintWriter(out, false);
      printStackTrace(pw);
      
      pw.flush();
    }
  }
}
