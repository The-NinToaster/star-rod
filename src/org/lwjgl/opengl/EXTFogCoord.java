package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferChecks;

public final class EXTFogCoord
{
  public static final int GL_FOG_COORDINATE_SOURCE_EXT = 33872;
  public static final int GL_FOG_COORDINATE_EXT = 33873;
  public static final int GL_FRAGMENT_DEPTH_EXT = 33874;
  public static final int GL_CURRENT_FOG_COORDINATE_EXT = 33875;
  public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 33876;
  public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 33877;
  public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 33878;
  public static final int GL_FOG_COORDINATE_ARRAY_EXT = 33879;
  
  private EXTFogCoord() {}
  
  public static void glFogCoordfEXT(float coord)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFogCoordfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFogCoordfEXT(coord, function_pointer);
  }
  
  static native void nglFogCoordfEXT(float paramFloat, long paramLong);
  
  public static void glFogCoorddEXT(double coord) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFogCoorddEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFogCoorddEXT(coord, function_pointer);
  }
  
  static native void nglFogCoorddEXT(double paramDouble, long paramLong);
  
  public static void glFogCoordPointerEXT(int stride, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFogCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(data);
    if (org.lwjgl.LWJGLUtil.CHECKS) getReferencesEXT_fog_coord_glFogCoordPointerEXT_data = data;
    nglFogCoordPointerEXT(5130, stride, org.lwjgl.MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glFogCoordPointerEXT(int stride, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFogCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(data);
    if (org.lwjgl.LWJGLUtil.CHECKS) getReferencesEXT_fog_coord_glFogCoordPointerEXT_data = data;
    nglFogCoordPointerEXT(5126, stride, org.lwjgl.MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglFogCoordPointerEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glFogCoordPointerEXT(int type, int stride, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFogCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglFogCoordPointerEXTBO(type, stride, data_buffer_offset, function_pointer);
  }
  
  static native void nglFogCoordPointerEXTBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
}
