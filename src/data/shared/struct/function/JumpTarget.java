package data.shared.struct.function;

import java.util.TreeSet;

public class JumpTarget
  implements Comparable<JumpTarget>
{
  public final int functionAddr;
  public final int targetAddr;
  public final boolean fromJumpTable;
  public int jumpTableAddress;
  public TreeSet<Integer> jumpTableIndicies;
  
  public JumpTarget(int functionAddr, int targetAddr)
  {
    this(functionAddr, targetAddr, false);
  }
  
  public JumpTarget(int functionAddr, int targetAddr, boolean fromJumpTable)
  {
    this.functionAddr = functionAddr;
    this.targetAddr = targetAddr;
    this.fromJumpTable = fromJumpTable;
    
    jumpTableAddress = 0;
    jumpTableIndicies = new TreeSet();
  }
  

  public int hashCode()
  {
    int prime = 31;
    int result = 1;
    result = 31 * result + targetAddr;
    return result;
  }
  

  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    JumpTarget other = (JumpTarget)obj;
    if (targetAddr != targetAddr)
      return false;
    return true;
  }
  

  public int compareTo(JumpTarget other)
  {
    return targetAddr - targetAddr;
  }
}
