package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;




































































public final class NVVertexProgram
  extends NVProgram
{
  public static final int GL_VERTEX_PROGRAM_NV = 34336;
  public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 34370;
  public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 34371;
  public static final int GL_VERTEX_STATE_PROGRAM_NV = 34337;
  public static final int GL_ATTRIB_ARRAY_SIZE_NV = 34339;
  public static final int GL_ATTRIB_ARRAY_STRIDE_NV = 34340;
  public static final int GL_ATTRIB_ARRAY_TYPE_NV = 34341;
  public static final int GL_CURRENT_ATTRIB_NV = 34342;
  public static final int GL_PROGRAM_PARAMETER_NV = 34372;
  public static final int GL_ATTRIB_ARRAY_POINTER_NV = 34373;
  public static final int GL_TRACK_MATRIX_NV = 34376;
  public static final int GL_TRACK_MATRIX_TRANSFORM_NV = 34377;
  public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 34350;
  public static final int GL_MAX_TRACK_MATRICES_NV = 34351;
  public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 34368;
  public static final int GL_CURRENT_MATRIX_NV = 34369;
  public static final int GL_VERTEX_PROGRAM_BINDING_NV = 34378;
  public static final int GL_MODELVIEW_PROJECTION_NV = 34345;
  public static final int GL_MATRIX0_NV = 34352;
  public static final int GL_MATRIX1_NV = 34353;
  public static final int GL_MATRIX2_NV = 34354;
  public static final int GL_MATRIX3_NV = 34355;
  public static final int GL_MATRIX4_NV = 34356;
  public static final int GL_MATRIX5_NV = 34357;
  public static final int GL_MATRIX6_NV = 34358;
  public static final int GL_MATRIX7_NV = 34359;
  public static final int GL_IDENTITY_NV = 34346;
  public static final int GL_INVERSE_NV = 34347;
  public static final int GL_TRANSPOSE_NV = 34348;
  public static final int GL_INVERSE_TRANSPOSE_NV = 34349;
  public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = 34384;
  public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = 34385;
  public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = 34386;
  public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = 34387;
  public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = 34388;
  public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = 34389;
  public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = 34390;
  public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = 34391;
  public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = 34392;
  public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = 34393;
  public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = 34394;
  public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = 34395;
  public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = 34396;
  public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = 34397;
  public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = 34398;
  public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = 34399;
  public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = 34400;
  public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = 34401;
  public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = 34402;
  public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = 34403;
  public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = 34404;
  public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = 34405;
  public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = 34406;
  public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = 34407;
  public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = 34408;
  public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = 34409;
  public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = 34410;
  public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = 34411;
  public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = 34412;
  public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = 34413;
  public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = 34414;
  public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = 34415;
  public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = 34416;
  public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = 34417;
  public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = 34418;
  public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = 34419;
  public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = 34420;
  public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = 34421;
  public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = 34422;
  public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = 34423;
  public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = 34424;
  public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = 34425;
  public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = 34426;
  public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = 34427;
  public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = 34428;
  public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = 34429;
  public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = 34430;
  public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = 34431;
  
  private NVVertexProgram() {}
  
  public static void glExecuteProgramNV(int target, int id, FloatBuffer params)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glExecuteProgramNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglExecuteProgramNV(target, id, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglExecuteProgramNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetProgramParameterNV(int target, int index, int parameterName, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetProgramParameterfvNV(target, index, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetProgramParameterfvNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetProgramParameterNV(int target, int index, int parameterName, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramParameterdvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetProgramParameterdvNV(target, index, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetProgramParameterdvNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetTrackMatrixNV(int target, int address, int parameterName, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTrackMatrixivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTrackMatrixivNV(target, address, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTrackMatrixivNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribNV(int index, int parameterName, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribfvNV(index, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribfvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribNV(int index, int parameterName, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribdvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribdvNV(index, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribdvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribNV(int index, int parameterName, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribivNV(index, parameterName, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribivNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static ByteBuffer glGetVertexAttribPointerNV(int index, int parameterName, long result_size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribPointervNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetVertexAttribPointervNV(index, parameterName, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetVertexAttribPointervNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glProgramParameter4fNV(int target, int index, float x, float y, float z, float w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramParameter4fNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramParameter4fNV(target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglProgramParameter4fNV(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glProgramParameter4dNV(int target, int index, double x, double y, double z, double w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramParameter4dNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramParameter4dNV(target, index, x, y, z, w, function_pointer);
  }
  
  static native void nglProgramParameter4dNV(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glProgramParameters4NV(int target, int index, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramParameters4fvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglProgramParameters4fvNV(target, index, params.remaining() >> 2, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglProgramParameters4fvNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramParameters4NV(int target, int index, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramParameters4dvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglProgramParameters4dvNV(target, index, params.remaining() >> 2, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglProgramParameters4dvNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glTrackMatrixNV(int target, int address, int matrix, int transform) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTrackMatrixNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTrackMatrixNV(target, address, matrix, transform, function_pointer);
  }
  
  static native void nglTrackMatrixNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, DoubleBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointerNV(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, FloatBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointerNV(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, ByteBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointerNV(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, IntBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointerNV(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, ShortBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointerNV(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer); }
  
  static native void nglVertexAttribPointerNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribPointerNV(int index, int size, int type, int stride, long buffer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointerNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglVertexAttribPointerNVBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
  }
  
  static native void nglVertexAttribPointerNVBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttrib1sNV(int index, short x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1sNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1sNV(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1sNV(int paramInt, short paramShort, long paramLong);
  
  public static void glVertexAttrib1fNV(int index, float x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1fNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1fNV(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1fNV(int paramInt, float paramFloat, long paramLong);
  
  public static void glVertexAttrib1dNV(int index, double x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1dNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1dNV(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1dNV(int paramInt, double paramDouble, long paramLong);
  
  public static void glVertexAttrib2sNV(int index, short x, short y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2sNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2sNV(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2sNV(int paramInt, short paramShort1, short paramShort2, long paramLong);
  
  public static void glVertexAttrib2fNV(int index, float x, float y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2fNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2fNV(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2fNV(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glVertexAttrib2dNV(int index, double x, double y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2dNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2dNV(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2dNV(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glVertexAttrib3sNV(int index, short x, short y, short z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3sNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3sNV(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3sNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
  
  public static void glVertexAttrib3fNV(int index, float x, float y, float z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3fNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3fNV(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3fNV(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glVertexAttrib3dNV(int index, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3dNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3dNV(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3dNV(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glVertexAttrib4sNV(int index, short x, short y, short z, short w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4sNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4sNV(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4sNV(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
  
  public static void glVertexAttrib4fNV(int index, float x, float y, float z, float w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4fNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4fNV(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4fNV(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glVertexAttrib4dNV(int index, double x, double y, double z, double w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4dNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4dNV(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4dNV(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glVertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4ubNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4ubNV(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4ubNV(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
  
  public static void glVertexAttribs1NV(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs1svNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs1svNV(index, v.remaining(), MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs1svNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs1NV(int index, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs1fvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs1fvNV(index, v.remaining(), MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs1fvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs1NV(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs1dvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs1dvNV(index, v.remaining(), MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs1dvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs2NV(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs2svNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs2svNV(index, v.remaining() >> 1, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs2svNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs2NV(int index, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs2fvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs2fvNV(index, v.remaining() >> 1, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs2fvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs2NV(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs2dvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs2dvNV(index, v.remaining() >> 1, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs2dvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs3NV(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs3svNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs3svNV(index, v.remaining() / 3, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs3svNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs3NV(int index, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs3fvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs3fvNV(index, v.remaining() / 3, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs3fvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs3NV(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs3dvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs3dvNV(index, v.remaining() / 3, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs3dvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs4NV(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs4svNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs4svNV(index, v.remaining() >> 2, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs4svNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs4NV(int index, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs4fvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs4fvNV(index, v.remaining() >> 2, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs4fvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glVertexAttribs4NV(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribs4dvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglVertexAttribs4dvNV(index, v.remaining() >> 2, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribs4dvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
}
