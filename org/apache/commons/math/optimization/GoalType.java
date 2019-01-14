package org.apache.commons.math.optimization;

import java.io.Serializable;

public enum GoalType
  implements Serializable
{
  MAXIMIZE,  MINIMIZE;
  
  private GoalType() {}
}
