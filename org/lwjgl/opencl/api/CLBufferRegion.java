package org.lwjgl.opencl.api;

import org.lwjgl.PointerBuffer;






































public final class CLBufferRegion
{
  public static final int STRUCT_SIZE = 2 * PointerBuffer.getPointerSize();
  private final int origin;
  private final int size;
  
  public CLBufferRegion(int origin, int size)
  {
    this.origin = origin;
    this.size = size;
  }
  
  public int getOrigin() {
    return origin;
  }
  
  public int getSize() {
    return size;
  }
}
