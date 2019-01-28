package org.apache.commons.math.stat.clustering;

import java.io.Serializable;
import java.util.Collection;
import org.apache.commons.math.util.MathUtils;






























public class EuclideanIntegerPoint
  implements Clusterable<EuclideanIntegerPoint>, Serializable
{
  private static final long serialVersionUID = 3946024775784901369L;
  private final int[] point;
  
  public EuclideanIntegerPoint(int[] point)
  {
    this.point = point;
  }
  



  public int[] getPoint()
  {
    return point;
  }
  
  public double distanceFrom(EuclideanIntegerPoint p)
  {
    return MathUtils.distance(point, p.getPoint());
  }
  
  public EuclideanIntegerPoint centroidOf(Collection<EuclideanIntegerPoint> points)
  {
    int[] centroid = new int[getPoint().length];
    for (EuclideanIntegerPoint p : points) {
      for (int i = 0; i < centroid.length; i++) {
        centroid[i] += p.getPoint()[i];
      }
    }
    for (int i = 0; i < centroid.length; i++) {
      centroid[i] /= points.size();
    }
    return new EuclideanIntegerPoint(centroid);
  }
  

  public boolean equals(Object other)
  {
    if (!(other instanceof EuclideanIntegerPoint)) {
      return false;
    }
    int[] otherPoint = ((EuclideanIntegerPoint)other).getPoint();
    if (point.length != otherPoint.length) {
      return false;
    }
    for (int i = 0; i < point.length; i++) {
      if (point[i] != otherPoint[i]) {
        return false;
      }
    }
    return true;
  }
  

  public int hashCode()
  {
    int hashCode = 0;
    int[] arr$ = point;int len$ = arr$.length; for (int i$ = 0; i$ < len$; i$++) { Integer i = Integer.valueOf(arr$[i$]);
      hashCode += i.hashCode() * 13 + 7;
    }
    return hashCode;
  }
  




  public String toString()
  {
    StringBuilder buff = new StringBuilder("(");
    int[] coordinates = getPoint();
    for (int i = 0; i < coordinates.length; i++) {
      buff.append(coordinates[i]);
      if (i < coordinates.length - 1) {
        buff.append(",");
      }
    }
    buff.append(")");
    return buff.toString();
  }
}
