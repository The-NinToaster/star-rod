package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;

public final class EXTDirectStateAccess
{
  public static final int GL_PROGRAM_MATRIX_EXT = 36397;
  public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 36398;
  public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 36399;
  
  private EXTDirectStateAccess() {}
  
  public static void glClientAttribDefaultEXT(int mask)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClientAttribDefaultEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClientAttribDefaultEXT(mask, function_pointer);
  }
  
  static native void nglClientAttribDefaultEXT(int paramInt, long paramLong);
  
  public static void glPushClientAttribDefaultEXT(int mask) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glPushClientAttribDefaultEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglPushClientAttribDefaultEXT(mask, function_pointer);
  }
  
  static native void nglPushClientAttribDefaultEXT(int paramInt, long paramLong);
  
  public static void glMatrixLoadEXT(int matrixMode, FloatBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixLoadfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixLoadfEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixLoadfEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixLoadEXT(int matrixMode, DoubleBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixLoaddEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixLoaddEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixLoaddEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixMultEXT(int matrixMode, FloatBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixMultfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixMultfEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixMultfEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixMultEXT(int matrixMode, DoubleBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixMultdEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixMultdEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixMultdEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixLoadIdentityEXT(int matrixMode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixLoadIdentityEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixLoadIdentityEXT(matrixMode, function_pointer);
  }
  
  static native void nglMatrixLoadIdentityEXT(int paramInt, long paramLong);
  
  public static void glMatrixRotatefEXT(int matrixMode, float angle, float x, float y, float z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixRotatefEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixRotatefEXT(matrixMode, angle, x, y, z, function_pointer);
  }
  
  static native void nglMatrixRotatefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glMatrixRotatedEXT(int matrixMode, double angle, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixRotatedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixRotatedEXT(matrixMode, angle, x, y, z, function_pointer);
  }
  
  static native void nglMatrixRotatedEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glMatrixScalefEXT(int matrixMode, float x, float y, float z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixScalefEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixScalefEXT(matrixMode, x, y, z, function_pointer);
  }
  
  static native void nglMatrixScalefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glMatrixScaledEXT(int matrixMode, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixScaledEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixScaledEXT(matrixMode, x, y, z, function_pointer);
  }
  
  static native void nglMatrixScaledEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glMatrixTranslatefEXT(int matrixMode, float x, float y, float z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixTranslatefEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixTranslatefEXT(matrixMode, x, y, z, function_pointer);
  }
  
  static native void nglMatrixTranslatefEXT(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glMatrixTranslatedEXT(int matrixMode, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixTranslatedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixTranslatedEXT(matrixMode, x, y, z, function_pointer);
  }
  
  static native void nglMatrixTranslatedEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glMatrixOrthoEXT(int matrixMode, double l, double r, double b, double t, double n, double f) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixOrthoEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixOrthoEXT(matrixMode, l, r, b, t, n, f, function_pointer);
  }
  
  static native void nglMatrixOrthoEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
  
  public static void glMatrixFrustumEXT(int matrixMode, double l, double r, double b, double t, double n, double f) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixFrustumEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixFrustumEXT(matrixMode, l, r, b, t, n, f, function_pointer);
  }
  
  static native void nglMatrixFrustumEXT(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, long paramLong);
  
  public static void glMatrixPushEXT(int matrixMode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixPushEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixPushEXT(matrixMode, function_pointer);
  }
  
  static native void nglMatrixPushEXT(int paramInt, long paramLong);
  
  public static void glMatrixPopEXT(int matrixMode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixPopEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMatrixPopEXT(matrixMode, function_pointer);
  }
  
  static native void nglMatrixPopEXT(int paramInt, long paramLong);
  
  public static void glTextureParameteriEXT(int texture, int target, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameteriEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameteriEXT(texture, target, pname, param, function_pointer);
  }
  
  static native void nglTextureParameteriEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glTextureParameterEXT(int texture, int target, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 4);
    nglTextureParameterivEXT(texture, target, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglTextureParameterivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glTextureParameterfEXT(int texture, int target, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameterfEXT(texture, target, pname, param, function_pointer);
  }
  
  static native void nglTextureParameterfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
  
  public static void glTextureParameterEXT(int texture, int target, int pname, FloatBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 4);
    nglTextureParameterfvEXT(texture, target, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglTextureParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureImage1DEXTBO(texture, target, level, internalformat, width, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureImage2DEXTBO(texture, target, level, internalformat, width, height, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage1DEXTBO(texture, target, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage2DEXTBO(texture, target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border, function_pointer);
  }
  
  static native void nglCopyTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
  
  public static void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border, function_pointer);
  }
  
  static native void nglCopyTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
  
  public static void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width, function_pointer);
  }
  
  static native void nglCopyTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
  
  public static void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetTextureImageEXT(texture, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetTextureImageEXT(texture, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetTextureImageEXT(texture, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetTextureImageEXT(texture, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetTextureImageEXT(texture, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetTextureImageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetTextureImageEXTBO(texture, target, level, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetTextureImageEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetTextureParameterEXT(int texture, int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureParameterfvEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static float glGetTextureParameterfEXT(int texture, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetTextureParameterfvEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameterEXT(int texture, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureParameterivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameteriEXT(int texture, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameterivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureLevelParameterEXT(int texture, int target, int level, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureLevelParameterfvEXT(texture, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureLevelParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static float glGetTextureLevelParameterfEXT(int texture, int target, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetTextureLevelParameterfvEXT(texture, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureLevelParameterEXT(int texture, int target, int level, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureLevelParameterivEXT(texture, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureLevelParameterivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static int glGetTextureLevelParameteriEXT(int texture, int target, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureLevelParameterivEXT(texture, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglTextureImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureImage3DEXTBO(texture, target, level, internalformat, width, height, depth, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage3DEXTBO(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
  
  public static void glBindMultiTextureEXT(int texunit, int target, int texture) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindMultiTextureEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindMultiTextureEXT(texunit, target, texture, function_pointer);
  }
  
  static native void nglBindMultiTextureEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, DoubleBuffer pointer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(pointer);
    nglMultiTexCoordPointerEXT(texunit, size, 5130, stride, MemoryUtil.getAddress(pointer), function_pointer);
  }
  
  public static void glMultiTexCoordPointerEXT(int texunit, int size, int stride, FloatBuffer pointer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(pointer);
    nglMultiTexCoordPointerEXT(texunit, size, 5126, stride, MemoryUtil.getAddress(pointer), function_pointer); }
  
  static native void nglMultiTexCoordPointerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglMultiTexCoordPointerEXTBO(texunit, size, type, stride, pointer_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexCoordPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexEnvfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexEnvfEXT(texunit, target, pname, param, function_pointer);
  }
  
  static native void nglMultiTexEnvfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
  
  public static void glMultiTexEnvEXT(int texunit, int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexEnvfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexEnvfvEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexEnvfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexEnviEXT(int texunit, int target, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexEnviEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexEnviEXT(texunit, target, pname, param, function_pointer);
  }
  
  static native void nglMultiTexEnviEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glMultiTexEnvEXT(int texunit, int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexEnvivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexEnvivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexEnvivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexGendEXT(int texunit, int coord, int pname, double param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGendEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexGendEXT(texunit, coord, pname, param, function_pointer);
  }
  
  static native void nglMultiTexGendEXT(int paramInt1, int paramInt2, int paramInt3, double paramDouble, long paramLong);
  
  public static void glMultiTexGenEXT(int texunit, int coord, int pname, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGendvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexGendvEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexGendvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGenfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexGenfEXT(texunit, coord, pname, param, function_pointer);
  }
  
  static native void nglMultiTexGenfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
  
  public static void glMultiTexGenEXT(int texunit, int coord, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGenfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexGenfvEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexGenfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGeniEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexGeniEXT(texunit, coord, pname, param, function_pointer);
  }
  
  static native void nglMultiTexGeniEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glMultiTexGenEXT(int texunit, int coord, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexGenivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexGenivEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexGenivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexEnvEXT(int texunit, int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexEnvfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexEnvfvEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexEnvfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexEnvEXT(int texunit, int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexEnvivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexEnvivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexEnvivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexGendvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexGendvEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexGendvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexGenfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexGenfvEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexGenfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexGenEXT(int texunit, int coord, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexGenivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexGenivEXT(texunit, coord, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexGenivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameteriEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexParameteriEXT(texunit, target, pname, param, function_pointer);
  }
  
  static native void nglMultiTexParameteriEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glMultiTexParameterEXT(int texunit, int target, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 4);
    nglMultiTexParameterivEXT(texunit, target, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglMultiTexParameterivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterfEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexParameterfEXT(texunit, target, pname, param, function_pointer);
  }
  
  static native void nglMultiTexParameterfEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat, long paramLong);
  
  public static void glMultiTexParameterEXT(int texunit, int target, int pname, FloatBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 4);
    nglMultiTexParameterfvEXT(texunit, target, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglMultiTexParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage1DStorage(pixels, format, type, width));
    nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexImage1DEXTBO(texunit, target, level, internalformat, width, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage2DStorage(pixels, format, type, width, height));
    nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexImage2DEXTBO(texunit, target, level, internalformat, width, height, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexSubImage1DEXTBO(texunit, target, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexSubImage2DEXTBO(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border, function_pointer);
  }
  
  static native void nglCopyMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
  
  public static void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border, function_pointer);
  }
  
  static native void nglCopyMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
  
  public static void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width, function_pointer);
  }
  
  static native void nglCopyMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
  
  public static void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetMultiTexImageEXT(texunit, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetMultiTexImageEXT(texunit, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetMultiTexImageEXT(texunit, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetMultiTexImageEXT(texunit, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, 1, 1, 1));
    nglGetMultiTexImageEXT(texunit, target, level, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetMultiTexImageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetMultiTexImageEXTBO(texunit, target, level, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetMultiTexImageEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetMultiTexParameterEXT(int texunit, int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexParameterfvEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static float glGetMultiTexParameterfEXT(int texunit, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetMultiTexParameterfvEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetMultiTexParameterEXT(int texunit, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexParameterivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexParameterivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetMultiTexParameteriEXT(int texunit, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetMultiTexParameterivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetMultiTexLevelParameterEXT(int texunit, int target, int level, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexLevelParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexLevelParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static float glGetMultiTexLevelParameterfEXT(int texunit, int target, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexLevelParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetMultiTexLevelParameterEXT(int texunit, int target, int level, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexLevelParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexLevelParameterivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static int glGetMultiTexLevelParameteriEXT(int texunit, int target, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexLevelParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer);
  }
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    if (pixels != null)
      BufferChecks.checkBuffer(pixels, GLChecks.calculateTexImage3DStorage(pixels, format, type, width, height, depth));
    nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, MemoryUtil.getAddressSafe(pixels), function_pointer); }
  
  static native void nglMultiTexImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexImage3DEXTBO(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglMultiTexSubImage3DEXTBO(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglMultiTexSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
  
  public static void glEnableClientStateIndexedEXT(int array, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableClientStateIndexedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableClientStateIndexedEXT(array, index, function_pointer);
  }
  
  static native void nglEnableClientStateIndexedEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDisableClientStateIndexedEXT(int array, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableClientStateIndexedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableClientStateIndexedEXT(array, index, function_pointer);
  }
  
  static native void nglDisableClientStateIndexedEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glEnableClientStateiEXT(int array, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableClientStateiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableClientStateiEXT(array, index, function_pointer);
  }
  
  static native void nglEnableClientStateiEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDisableClientStateiEXT(int array, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableClientStateiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableClientStateiEXT(array, index, function_pointer);
  }
  
  static native void nglDisableClientStateiEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetFloatIndexedEXT(int pname, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloatIndexedvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 16);
    nglGetFloatIndexedvEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetFloatIndexedvEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetFloatIndexedEXT(int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloatIndexedvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetFloatIndexedvEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetDoubleIndexedEXT(int pname, int index, DoubleBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoubleIndexedvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 16);
    nglGetDoubleIndexedvEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetDoubleIndexedvEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static double glGetDoubleIndexedEXT(int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoubleIndexedvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    DoubleBuffer params = APIUtil.getBufferDouble(caps);
    nglGetDoubleIndexedvEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static ByteBuffer glGetPointerIndexedEXT(int pname, int index, long result_size) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPointerIndexedvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetPointerIndexedvEXT(pname, index, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetPointerIndexedvEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetFloatEXT(int pname, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloati_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 16);
    nglGetFloati_vEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetFloati_vEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetFloatEXT(int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloati_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetFloati_vEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetDoubleEXT(int pname, int index, DoubleBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoublei_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 16);
    nglGetDoublei_vEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetDoublei_vEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static double glGetDoubleEXT(int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoublei_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    DoubleBuffer params = APIUtil.getBufferDouble(caps);
    nglGetDoublei_vEXT(pname, index, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static ByteBuffer glGetPointerEXT(int pname, int index, long result_size) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPointeri_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetPointeri_vEXT(pname, index, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetPointeri_vEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glEnableIndexedEXT(int cap, int index) { EXTDrawBuffers2.glEnableIndexedEXT(cap, index); }
  
  public static void glDisableIndexedEXT(int cap, int index)
  {
    EXTDrawBuffers2.glDisableIndexedEXT(cap, index);
  }
  
  public static boolean glIsEnabledIndexedEXT(int cap, int index) {
    return EXTDrawBuffers2.glIsEnabledIndexedEXT(cap, index);
  }
  
  public static void glGetIntegerIndexedEXT(int pname, int index, IntBuffer params) {
    EXTDrawBuffers2.glGetIntegerIndexedEXT(pname, index, params);
  }
  
  public static int glGetIntegerIndexedEXT(int pname, int index)
  {
    return EXTDrawBuffers2.glGetIntegerIndexedEXT(pname, index);
  }
  
  public static void glGetBooleanIndexedEXT(int pname, int index, ByteBuffer params) {
    EXTDrawBuffers2.glGetBooleanIndexedEXT(pname, index, params);
  }
  
  public static boolean glGetBooleanIndexedEXT(int pname, int index)
  {
    return EXTDrawBuffers2.glGetBooleanIndexedEXT(pname, index);
  }
  
  public static void glNamedProgramStringEXT(int program, int target, int format, ByteBuffer string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramStringEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(string);
    nglNamedProgramStringEXT(program, target, format, string.remaining(), MemoryUtil.getAddress(string), function_pointer);
  }
  
  static native void nglNamedProgramStringEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glNamedProgramStringEXT(int program, int target, int format, CharSequence string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramStringEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedProgramStringEXT(program, target, format, string.length(), APIUtil.getBuffer(caps, string), function_pointer);
  }
  
  public static void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameter4dEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglNamedProgramLocalParameter4dEXT(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glNamedProgramLocalParameter4EXT(int program, int target, int index, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameter4dvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglNamedProgramLocalParameter4dvEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParameter4dvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameter4fEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglNamedProgramLocalParameter4fEXT(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glNamedProgramLocalParameter4EXT(int program, int target, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameter4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglNamedProgramLocalParameter4fvEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParameter4fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetNamedProgramLocalParameterEXT(int program, int target, int index, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramLocalParameterdvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedProgramLocalParameterdvEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedProgramLocalParameterdvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetNamedProgramLocalParameterEXT(int program, int target, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramLocalParameterfvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedProgramLocalParameterfvEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedProgramLocalParameterfvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetNamedProgramEXT(int program, int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedProgramivEXT(program, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedProgramivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetNamedProgramEXT(int program, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedProgramivEXT(program, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetNamedProgramStringEXT(int program, int target, int pname, ByteBuffer string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramStringEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(string);
    nglGetNamedProgramStringEXT(program, target, pname, MemoryUtil.getAddress(string), function_pointer);
  }
  
  static native void nglGetNamedProgramStringEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static String glGetNamedProgramStringEXT(int program, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramStringEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    int programLength = glGetNamedProgramEXT(program, target, 34343);
    ByteBuffer paramString = APIUtil.getBufferByte(caps, programLength);
    nglGetNamedProgramStringEXT(program, target, pname, MemoryUtil.getAddress(paramString), function_pointer);
    paramString.limit(programLength);
    return APIUtil.getString(caps, paramString);
  }
  
  public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureImage3DEXTBO(texture, target, level, internalformat, width, height, depth, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureImage2DEXTBO(texture, target, level, internalformat, width, height, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureImage1DEXTBO(texture, target, level, internalformat, width, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage3DEXTBO(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage2DEXTBO(texture, target, level, xoffset, yoffset, width, height, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage1DEXTBO(texture, target, level, xoffset, width, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ByteBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedTextureImageEXT(texture, target, level, MemoryUtil.getAddress(img), function_pointer);
  }
  
  public static void glGetCompressedTextureImageEXT(int texture, int target, int level, IntBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedTextureImageEXT(texture, target, level, MemoryUtil.getAddress(img), function_pointer);
  }
  
  public static void glGetCompressedTextureImageEXT(int texture, int target, int level, ShortBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedTextureImageEXT(texture, target, level, MemoryUtil.getAddress(img), function_pointer); }
  
  static native void nglGetCompressedTextureImageEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureImageEXT(int texture, int target, int level, long img_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetCompressedTextureImageEXTBO(texture, target, level, img_buffer_offset, function_pointer);
  }
  
  static native void nglGetCompressedTextureImageEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexImage3DEXTBO(texunit, target, level, internalformat, width, height, depth, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexImage2DEXTBO(texunit, target, level, internalformat, width, height, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexImage1DEXTBO(texunit, target, level, internalformat, width, border, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexSubImage3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexSubImage3DEXTBO(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexSubImage3DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexSubImage2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexSubImage2DEXTBO(texunit, target, level, xoffset, yoffset, width, height, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexSubImage2DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedMultiTexSubImage1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedMultiTexSubImage1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedMultiTexSubImage1DEXTBO(texunit, target, level, xoffset, width, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedMultiTexSubImage1DEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ByteBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedMultiTexImageEXT(texunit, target, level, MemoryUtil.getAddress(img), function_pointer);
  }
  
  public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, IntBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedMultiTexImageEXT(texunit, target, level, MemoryUtil.getAddress(img), function_pointer);
  }
  
  public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, ShortBuffer img) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(img);
    nglGetCompressedMultiTexImageEXT(texunit, target, level, MemoryUtil.getAddress(img), function_pointer); }
  
  static native void nglGetCompressedMultiTexImageEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedMultiTexImageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetCompressedMultiTexImageEXTBO(texunit, target, level, img_buffer_offset, function_pointer);
  }
  
  static native void nglGetCompressedMultiTexImageEXTBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMatrixLoadTransposeEXT(int matrixMode, FloatBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixLoadTransposefEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixLoadTransposefEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixLoadTransposefEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixLoadTransposeEXT(int matrixMode, DoubleBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixLoadTransposedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixLoadTransposedEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixLoadTransposedEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixMultTransposeEXT(int matrixMode, FloatBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixMultTransposefEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixMultTransposefEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixMultTransposefEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMatrixMultTransposeEXT(int matrixMode, DoubleBuffer m) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMatrixMultTransposedEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(m, 16);
    nglMatrixMultTransposedEXT(matrixMode, MemoryUtil.getAddress(m), function_pointer);
  }
  
  static native void nglMatrixMultTransposedEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glNamedBufferDataEXT(int buffer, long data_size, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedBufferDataEXT(buffer, data_size, 0L, usage, function_pointer);
  }
  
  public static void glNamedBufferDataEXT(int buffer, ByteBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferDataEXT(buffer, data.remaining(), MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferDataEXT(int buffer, DoubleBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferDataEXT(buffer, data.remaining() << 3, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferDataEXT(int buffer, FloatBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferDataEXT(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferDataEXT(int buffer, IntBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferDataEXT(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferDataEXT(int buffer, ShortBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferDataEXT(buffer, data.remaining() << 1, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  static native void nglNamedBufferDataEXT(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3);
  
  public static void glNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, MemoryUtil.getAddress(data), function_pointer);
  }
  











  static native void nglNamedBufferSubDataEXT(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  










  public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBufferEXT(buffer, access, glGetNamedBufferParameterEXT(buffer, 34660), old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  





















  public static ByteBuffer glMapNamedBufferEXT(int buffer, int access, long length, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBufferEXT(buffer, access, length, old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglMapNamedBufferEXT(int paramInt1, int paramInt2, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
  
  public static boolean glUnmapNamedBufferEXT(int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUnmapNamedBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglUnmapNamedBufferEXT(buffer, function_pointer);
    return __result;
  }
  
  static native boolean nglUnmapNamedBufferEXT(int paramInt, long paramLong);
  
  public static void glGetNamedBufferParameterEXT(int buffer, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedBufferParameterivEXT(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedBufferParameterivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetNamedBufferParameterEXT(int buffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedBufferParameterivEXT(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static ByteBuffer glGetNamedBufferPointerEXT(int buffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferPointervEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetNamedBufferPointervEXT(buffer, pname, glGetNamedBufferParameterEXT(buffer, 34660), function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetNamedBufferPointervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubDataEXT(int buffer, long offset, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 3, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubDataEXT(int buffer, long offset, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubDataEXT(int buffer, long offset, IntBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubDataEXT(int buffer, long offset, ShortBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining() << 1, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetNamedBufferSubDataEXT(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glProgramUniform1fEXT(int program, int location, float v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1fEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1fEXT(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1fEXT(int paramInt1, int paramInt2, float paramFloat, long paramLong);
  
  public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2fEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2fEXT(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3fEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3fEXT(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4fEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4fEXT(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4fEXT(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glProgramUniform1iEXT(int program, int location, int v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1iEXT(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1iEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2iEXT(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3iEXT(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4iEXT(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glProgramUniform1EXT(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1fvEXT(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2EXT(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3EXT(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3fvEXT(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4EXT(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4fvEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform1EXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1ivEXT(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1ivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2EXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2ivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3EXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3ivEXT(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3ivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4EXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4ivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x3EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x3fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x2EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x2fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x4EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x2EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x2fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x2fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x4EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x4fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x3EXT(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x3fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x3fvEXT(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureBufferEXT(texture, target, internalformat, buffer, function_pointer);
  }
  
  static native void nglTextureBufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexBufferEXT(texunit, target, internalformat, buffer, function_pointer);
  }
  
  static native void nglMultiTexBufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glTextureParameterIEXT(int texture, int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTextureParameterIivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glTextureParameterIEXT(int texture, int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameterIivEXT(texture, target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glTextureParameterIuEXT(int texture, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTextureParameterIuivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glTextureParameterIuEXT(int texture, int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameterIuivEXT(texture, target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glGetTextureParameterIEXT(int texture, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureParameterIivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameterIiEXT(int texture, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameterIivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameterIuEXT(int texture, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTextureParameterIuivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameterIuiEXT(int texture, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameterIuivEXT(texture, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glMultiTexParameterIEXT(int texunit, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexParameterIivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexParameterIEXT(int texunit, int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexParameterIivEXT(texunit, target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glMultiTexParameterIuEXT(int texunit, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglMultiTexParameterIuivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglMultiTexParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glMultiTexParameterIuEXT(int texunit, int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexParameterIuivEXT(texunit, target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glGetMultiTexParameterIEXT(int texunit, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexParameterIivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetMultiTexParameterIiEXT(int texunit, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetMultiTexParameterIivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetMultiTexParameterIuEXT(int texunit, int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMultiTexParameterIuivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMultiTexParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetMultiTexParameterIuiEXT(int texunit, int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMultiTexParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetMultiTexParameterIuivEXT(texunit, target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glProgramUniform1uiEXT(int program, int location, int v0) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1uiEXT(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2uiEXT(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3uiEXT(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4uiEXT(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glProgramUniform1uEXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1uivEXT(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1uivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2uEXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2uivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3uEXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3uivEXT(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3uivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4uEXT(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4uivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParameters4EXT(int program, int target, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameters4fvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParameters4fvEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameterI4iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglNamedProgramLocalParameterI4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
  
  public static void glNamedProgramLocalParameterI4EXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameterI4ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglNamedProgramLocalParameterI4ivEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParameterI4ivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParametersI4EXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParametersI4ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParametersI4ivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameterI4uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglNamedProgramLocalParameterI4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong);
  
  public static void glNamedProgramLocalParameterI4uEXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParameterI4uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglNamedProgramLocalParameterI4uivEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParameterI4uivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glNamedProgramLocalParametersI4uEXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedProgramLocalParametersI4uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglNamedProgramLocalParametersI4uivEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glGetNamedProgramLocalParameterIEXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramLocalParameterIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedProgramLocalParameterIivEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedProgramLocalParameterIivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetNamedProgramLocalParameterIuEXT(int program, int target, int index, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedProgramLocalParameterIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedProgramLocalParameterIuivEXT(program, target, index, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedProgramLocalParameterIuivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedRenderbufferStorageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height, function_pointer);
  }
  
  static native void nglNamedRenderbufferStorageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glGetNamedRenderbufferParameterEXT(int renderbuffer, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedRenderbufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedRenderbufferParameterivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetNamedRenderbufferParameterEXT(int renderbuffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedRenderbufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedRenderbufferStorageMultisampleEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height, function_pointer);
  }
  
  static native void nglNamedRenderbufferStorageMultisampleEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedRenderbufferStorageMultisampleCoverageEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height, function_pointer);
  }
  
  static native void nglNamedRenderbufferStorageMultisampleCoverageEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCheckNamedFramebufferStatusEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCheckNamedFramebufferStatusEXT(framebuffer, target, function_pointer);
    return __result;
  }
  
  static native int nglCheckNamedFramebufferStatusEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTexture1DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level, function_pointer);
  }
  
  static native void nglNamedFramebufferTexture1DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTexture2DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level, function_pointer);
  }
  
  static native void nglNamedFramebufferTexture2DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTexture3DEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset, function_pointer);
  }
  
  static native void nglNamedFramebufferTexture3DEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferRenderbufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer, function_pointer);
  }
  
  static native void nglNamedFramebufferRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glGetNamedFramebufferAttachmentParameterEXT(int framebuffer, int attachment, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferAttachmentParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedFramebufferAttachmentParameterivEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetNamedFramebufferAttachmentParameterEXT(int framebuffer, int attachment, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferAttachmentParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGenerateTextureMipmapEXT(int texture, int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenerateTextureMipmapEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglGenerateTextureMipmapEXT(texture, target, function_pointer);
  }
  
  static native void nglGenerateTextureMipmapEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGenerateMultiTexMipmapEXT(int texunit, int target) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenerateMultiTexMipmapEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglGenerateMultiTexMipmapEXT(texunit, target, function_pointer);
  }
  
  static native void nglGenerateMultiTexMipmapEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glFramebufferDrawBufferEXT(int framebuffer, int mode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferDrawBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferDrawBufferEXT(framebuffer, mode, function_pointer);
  }
  
  static native void nglFramebufferDrawBufferEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glFramebufferDrawBuffersEXT(int framebuffer, IntBuffer bufs) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferDrawBuffersEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(bufs);
    nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), MemoryUtil.getAddress(bufs), function_pointer);
  }
  
  static native void nglFramebufferDrawBuffersEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glFramebufferReadBufferEXT(int framebuffer, int mode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferReadBufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferReadBufferEXT(framebuffer, mode, function_pointer);
  }
  
  static native void nglFramebufferReadBufferEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetFramebufferParameterEXT(int framebuffer, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFramebufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 4);
    nglGetFramebufferParameterivEXT(framebuffer, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetFramebufferParameterivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetFramebufferParameterEXT(int framebuffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFramebufferParameterivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetFramebufferParameterivEXT(framebuffer, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readoffset, long writeoffset, long size) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedCopyBufferSubDataEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, readoffset, writeoffset, size, function_pointer);
  }
  
  static native void nglNamedCopyBufferSubDataEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTextureEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTextureEXT(framebuffer, attachment, texture, level, function_pointer);
  }
  
  static native void nglNamedFramebufferTextureEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTextureLayerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer, function_pointer);
  }
  
  static native void nglNamedFramebufferTextureLayerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTextureFaceEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face, function_pointer);
  }
  
  static native void nglNamedFramebufferTextureFaceEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureRenderbufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureRenderbufferEXT(texture, target, renderbuffer, function_pointer);
  }
  
  static native void nglTextureRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexRenderbufferEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexRenderbufferEXT(texunit, target, renderbuffer, function_pointer);
  }
  
  static native void nglMultiTexRenderbufferEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayVertexOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayVertexOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayColorOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayColorOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayEdgeFlagOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayEdgeFlagOffsetEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayIndexOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayIndexOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayNormalOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayNormalOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayTexCoordOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayTexCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayMultiTexCoordOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayMultiTexCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayFogCoordOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayFogCoordOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArraySecondaryColorOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArraySecondaryColorOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayVertexAttribOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayVertexAttribOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayVertexAttribIOffsetEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, offset, function_pointer);
  }
  
  static native void nglVertexArrayVertexAttribIOffsetEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glEnableVertexArrayEXT(int vaobj, int array) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableVertexArrayEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableVertexArrayEXT(vaobj, array, function_pointer);
  }
  
  static native void nglEnableVertexArrayEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDisableVertexArrayEXT(int vaobj, int array) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableVertexArrayEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableVertexArrayEXT(vaobj, array, function_pointer);
  }
  
  static native void nglDisableVertexArrayEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glEnableVertexArrayAttribEXT(int vaobj, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableVertexArrayAttribEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableVertexArrayAttribEXT(vaobj, index, function_pointer);
  }
  
  static native void nglEnableVertexArrayAttribEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDisableVertexArrayAttribEXT(int vaobj, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableVertexArrayAttribEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableVertexArrayAttribEXT(vaobj, index, function_pointer);
  }
  
  static native void nglDisableVertexArrayAttribEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetVertexArrayIntegerEXT(int vaobj, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIntegervEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 16);
    nglGetVertexArrayIntegervEXT(vaobj, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetVertexArrayIntegervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetVertexArrayIntegerEXT(int vaobj, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIntegervEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetVertexArrayIntegervEXT(vaobj, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static ByteBuffer glGetVertexArrayPointerEXT(int vaobj, int pname, long result_size) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayPointervEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetVertexArrayPointervEXT(vaobj, pname, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetVertexArrayPointervEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexArrayIntegerEXT(int vaobj, int index, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIntegeri_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 16);
    nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetVertexArrayIntegeri_vEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetVertexArrayIntegeriEXT(int vaobj, int index, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIntegeri_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static ByteBuffer glGetVertexArrayPointerEXT(int vaobj, int index, int pname, long result_size) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayPointeri_vEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  






  static native ByteBuffer nglGetVertexArrayPointeri_vEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  






  public static ByteBuffer glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBufferRangeEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access, old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(java.nio.ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglMapNamedBufferRangeEXT(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
  
  public static void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFlushMappedNamedBufferRangeEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFlushMappedNamedBufferRangeEXT(buffer, offset, length, function_pointer);
  }
  
  static native void nglFlushMappedNamedBufferRangeEXT(int paramInt, long paramLong1, long paramLong2, long paramLong3);
}
