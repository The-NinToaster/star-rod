package org.lwjgl.opengl;

import org.lwjgl.BufferChecks;



public final class EXTCompiledVertexArray
{
  public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 33192;
  public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 33193;
  
  private EXTCompiledVertexArray() {}
  
  public static void glLockArraysEXT(int first, int count)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glLockArraysEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglLockArraysEXT(first, count, function_pointer);
  }
  
  static native void nglLockArraysEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glUnlockArraysEXT() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUnlockArraysEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUnlockArraysEXT(function_pointer);
  }
  
  static native void nglUnlockArraysEXT(long paramLong);
}
