package org.apache.commons.math.optimization;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.util.FastMath;
























































public class MultiStartUnivariateRealOptimizer
  implements UnivariateRealOptimizer
{
  private static final long serialVersionUID = 5983375963110961019L;
  private final UnivariateRealOptimizer optimizer;
  private int maxIterations;
  private int maxEvaluations;
  private int totalIterations;
  private int totalEvaluations;
  private int starts;
  private RandomGenerator generator;
  private double[] optima;
  private double[] optimaValues;
  
  public MultiStartUnivariateRealOptimizer(UnivariateRealOptimizer optimizer, int starts, RandomGenerator generator)
  {
    this.optimizer = optimizer;
    totalIterations = 0;
    this.starts = starts;
    this.generator = generator;
    optima = null;
    setMaximalIterationCount(Integer.MAX_VALUE);
    setMaxEvaluations(Integer.MAX_VALUE);
  }
  
  public double getFunctionValue()
  {
    return optimaValues[0];
  }
  
  public double getResult()
  {
    return optima[0];
  }
  
  public double getAbsoluteAccuracy()
  {
    return optimizer.getAbsoluteAccuracy();
  }
  
  public int getIterationCount()
  {
    return totalIterations;
  }
  
  public int getMaximalIterationCount()
  {
    return maxIterations;
  }
  
  public int getMaxEvaluations()
  {
    return maxEvaluations;
  }
  
  public int getEvaluations()
  {
    return totalEvaluations;
  }
  
  public double getRelativeAccuracy()
  {
    return optimizer.getRelativeAccuracy();
  }
  
  public void resetAbsoluteAccuracy()
  {
    optimizer.resetAbsoluteAccuracy();
  }
  
  public void resetMaximalIterationCount()
  {
    optimizer.resetMaximalIterationCount();
  }
  
  public void resetRelativeAccuracy()
  {
    optimizer.resetRelativeAccuracy();
  }
  
  public void setAbsoluteAccuracy(double accuracy)
  {
    optimizer.setAbsoluteAccuracy(accuracy);
  }
  
  public void setMaximalIterationCount(int count)
  {
    maxIterations = count;
  }
  
  public void setMaxEvaluations(int maxEvaluations)
  {
    this.maxEvaluations = maxEvaluations;
  }
  
  public void setRelativeAccuracy(double accuracy)
  {
    optimizer.setRelativeAccuracy(accuracy);
  }
  

























  public double[] getOptima()
    throws IllegalStateException
  {
    if (optima == null) {
      throw MathRuntimeException.createIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET, new Object[0]);
    }
    return (double[])optima.clone();
  }
  

















  public double[] getOptimaValues()
    throws IllegalStateException
  {
    if (optimaValues == null) {
      throw MathRuntimeException.createIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET, new Object[0]);
    }
    return (double[])optimaValues.clone();
  }
  


  public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
    throws ConvergenceException, FunctionEvaluationException
  {
    optima = new double[starts];
    optimaValues = new double[starts];
    totalIterations = 0;
    totalEvaluations = 0;
    

    for (int i = 0; i < starts; i++)
    {
      try {
        optimizer.setMaximalIterationCount(maxIterations - totalIterations);
        optimizer.setMaxEvaluations(maxEvaluations - totalEvaluations);
        double bound1 = i == 0 ? min : min + generator.nextDouble() * (max - min);
        double bound2 = i == 0 ? max : min + generator.nextDouble() * (max - min);
        optima[i] = optimizer.optimize(f, goalType, FastMath.min(bound1, bound2), FastMath.max(bound1, bound2));
        

        optimaValues[i] = optimizer.getFunctionValue();
      } catch (FunctionEvaluationException fee) {
        optima[i] = NaN.0D;
        optimaValues[i] = NaN.0D;
      } catch (ConvergenceException ce) {
        optima[i] = NaN.0D;
        optimaValues[i] = NaN.0D;
      }
      
      totalIterations += optimizer.getIterationCount();
      totalEvaluations += optimizer.getEvaluations();
    }
    


    int lastNaN = optima.length;
    for (int i = 0; i < lastNaN; i++) {
      if (Double.isNaN(optima[i])) {
        optima[i] = optima[(--lastNaN)];
        optima[(lastNaN + 1)] = NaN.0D;
        optimaValues[i] = optimaValues[(--lastNaN)];
        optimaValues[(lastNaN + 1)] = NaN.0D;
      }
    }
    
    double currX = optima[0];
    double currY = optimaValues[0];
    for (int j = 1; j < lastNaN; j++) {
      double prevY = currY;
      currX = optima[j];
      currY = optimaValues[j];
      if (((goalType == GoalType.MAXIMIZE ? 1 : 0) ^ (currY < prevY ? 1 : 0)) != 0)
      {
        int i = j - 1;
        double mIX = optima[i];
        double mIY = optimaValues[i];
        while (i >= 0) { if (((goalType == GoalType.MAXIMIZE ? 1 : 0) ^ (currY < mIY ? 1 : 0)) == 0) break;
          optima[(i + 1)] = mIX;
          optimaValues[(i + 1)] = mIY;
          if (i-- != 0) {
            mIX = optima[i];
            mIY = optimaValues[i];
          } else {
            mIX = NaN.0D;
            mIY = NaN.0D;
          }
        }
        optima[(i + 1)] = currX;
        optimaValues[(i + 1)] = currY;
        currX = optima[j];
        currY = optimaValues[j];
      }
    }
    
    if (Double.isNaN(optima[0])) {
      throw new OptimizationException(LocalizedFormats.NO_CONVERGENCE_WITH_ANY_START_POINT, new Object[] { Integer.valueOf(starts) });
    }
    



    return optima[0];
  }
  


  public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
    throws ConvergenceException, FunctionEvaluationException
  {
    return optimize(f, goalType, min, max);
  }
}
