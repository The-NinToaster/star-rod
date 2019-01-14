package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;

public final class ARBTransposeMatrix
{
  public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 34019;
  public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 34020;
  public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 34021;
  public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 34022;
  
  private ARBTransposeMatrix() {}
  
  public static void glLoadTransposeMatrixARB(FloatBuffer pfMtx)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glLoadTransposeMatrixfARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(pfMtx, 16);
    nglLoadTransposeMatrixfARB(MemoryUtil.getAddress(pfMtx), function_pointer);
  }
  
  static native void nglLoadTransposeMatrixfARB(long paramLong1, long paramLong2);
  
  public static void glMultTransposeMatrixARB(FloatBuffer pfMtx) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultTransposeMatrixfARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(pfMtx, 16);
    nglMultTransposeMatrixfARB(MemoryUtil.getAddress(pfMtx), function_pointer);
  }
  
  static native void nglMultTransposeMatrixfARB(long paramLong1, long paramLong2);
}
