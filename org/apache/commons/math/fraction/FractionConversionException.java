package org.apache.commons.math.fraction;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.exception.util.LocalizedFormats;






























public class FractionConversionException
  extends ConvergenceException
{
  private static final long serialVersionUID = -4661812640132576263L;
  
  public FractionConversionException(double value, int maxIterations)
  {
    super(LocalizedFormats.FAILED_FRACTION_CONVERSION, new Object[] { Double.valueOf(value), Integer.valueOf(maxIterations) });
  }
  






  public FractionConversionException(double value, long p, long q)
  {
    super(LocalizedFormats.FRACTION_CONVERSION_OVERFLOW, new Object[] { Double.valueOf(value), Long.valueOf(p), Long.valueOf(q) });
  }
}
