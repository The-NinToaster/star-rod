package org.apache.commons.math;

import org.apache.commons.math.exception.util.DummyLocalizable;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;

























public class ConvergenceException
  extends MathException
{
  private static final long serialVersionUID = -1111352570797662604L;
  
  public ConvergenceException()
  {
    super(LocalizedFormats.CONVERGENCE_FAILED, new Object[0]);
  }
  







  @Deprecated
  public ConvergenceException(String pattern, Object... arguments)
  {
    this(new DummyLocalizable(pattern), arguments);
  }
  






  public ConvergenceException(Localizable pattern, Object... arguments)
  {
    super(pattern, arguments);
  }
  



  public ConvergenceException(Throwable cause)
  {
    super(cause);
  }
  








  @Deprecated
  public ConvergenceException(Throwable cause, String pattern, Object... arguments)
  {
    this(cause, new DummyLocalizable(pattern), arguments);
  }
  







  public ConvergenceException(Throwable cause, Localizable pattern, Object... arguments)
  {
    super(cause, pattern, arguments);
  }
}
