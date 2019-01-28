package org.lwjgl.opengl;

import org.lwjgl.BufferChecks;











public final class EXTBlendMinmax
{
  public static final int GL_FUNC_ADD_EXT = 32774;
  public static final int GL_MIN_EXT = 32775;
  public static final int GL_MAX_EXT = 32776;
  public static final int GL_BLEND_EQUATION_EXT = 32777;
  
  private EXTBlendMinmax() {}
  
  public static void glBlendEquationEXT(int mode)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendEquationEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendEquationEXT(mode, function_pointer);
  }
  
  static native void nglBlendEquationEXT(int paramInt, long paramLong);
}
