package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;


























































public final class GL33
{
  public static final int GL_SRC1_COLOR = 35065;
  public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
  public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
  public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;
  public static final int GL_ANY_SAMPLES_PASSED = 35887;
  public static final int GL_SAMPLER_BINDING = 35097;
  public static final int GL_RGB10_A2UI = 36975;
  public static final int GL_TEXTURE_SWIZZLE_R = 36418;
  public static final int GL_TEXTURE_SWIZZLE_G = 36419;
  public static final int GL_TEXTURE_SWIZZLE_B = 36420;
  public static final int GL_TEXTURE_SWIZZLE_A = 36421;
  public static final int GL_TEXTURE_SWIZZLE_RGBA = 36422;
  public static final int GL_TIME_ELAPSED = 35007;
  public static final int GL_TIMESTAMP = 36392;
  public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;
  public static final int GL_INT_2_10_10_10_REV = 36255;
  
  private GL33() {}
  
  public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocationIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    nglBindFragDataLocationIndexed(program, colorNumber, index, MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglBindFragDataLocationIndexed(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocationIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindFragDataLocationIndexed(program, colorNumber, index, APIUtil.getBufferNT(caps, name), function_pointer);
  }
  
  public static int glGetFragDataIndex(int program, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataIndex;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetFragDataIndex(program, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetFragDataIndex(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGetFragDataIndex(int program, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataIndex;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetFragDataIndex(program, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static void glGenSamplers(IntBuffer samplers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(samplers);
    nglGenSamplers(samplers.remaining(), MemoryUtil.getAddress(samplers), function_pointer);
  }
  
  static native void nglGenSamplers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenSamplers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer samplers = APIUtil.getBufferInt(caps);
    nglGenSamplers(1, MemoryUtil.getAddress(samplers), function_pointer);
    return samplers.get(0);
  }
  
  public static void glDeleteSamplers(IntBuffer samplers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(samplers);
    nglDeleteSamplers(samplers.remaining(), MemoryUtil.getAddress(samplers), function_pointer);
  }
  
  static native void nglDeleteSamplers(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteSamplers(int sampler) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteSamplers(1, APIUtil.getInt(caps, sampler), function_pointer);
  }
  
  public static boolean glIsSampler(int sampler) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsSampler;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsSampler(sampler, function_pointer);
    return __result;
  }
  
  static native boolean nglIsSampler(int paramInt, long paramLong);
  
  public static void glBindSampler(int unit, int sampler) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindSampler;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindSampler(unit, sampler, function_pointer);
  }
  
  static native void nglBindSampler(int paramInt1, int paramInt2, long paramLong);
  
  public static void glSamplerParameteri(int sampler, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglSamplerParameteri(sampler, pname, param, function_pointer);
  }
  
  static native void nglSamplerParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glSamplerParameterf(int sampler, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameterf;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglSamplerParameterf(sampler, pname, param, function_pointer);
  }
  
  static native void nglSamplerParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
  
  public static void glSamplerParameter(int sampler, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglSamplerParameteriv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglSamplerParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glSamplerParameter(int sampler, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglSamplerParameterfv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglSamplerParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glSamplerParameterI(int sampler, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglSamplerParameterIiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglSamplerParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glSamplerParameterIu(int sampler, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSamplerParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglSamplerParameterIuiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglSamplerParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetSamplerParameter(int sampler, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetSamplerParameteriv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetSamplerParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetSamplerParameteri(int sampler, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetSamplerParameteriv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetSamplerParameter(int sampler, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetSamplerParameterfv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetSamplerParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetSamplerParameterf(int sampler, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetSamplerParameterfv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetSamplerParameterI(int sampler, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetSamplerParameterIiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetSamplerParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetSamplerParameterIi(int sampler, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetSamplerParameterIiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetSamplerParameterIu(int sampler, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetSamplerParameterIuiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetSamplerParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetSamplerParameterIui(int sampler, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSamplerParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetSamplerParameterIuiv(sampler, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glQueryCounter(int id, int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glQueryCounter;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglQueryCounter(id, target, function_pointer);
  }
  
  static native void nglQueryCounter(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetQueryObject(int id, int pname, LongBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryObjecti64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetQueryObjecti64v(id, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetQueryObjecti64v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static long glGetQueryObject(int id, int pname)
  {
    return glGetQueryObjecti64(id, pname);
  }
  
  public static long glGetQueryObjecti64(int id, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryObjecti64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    LongBuffer params = APIUtil.getBufferLong(caps);
    nglGetQueryObjecti64v(id, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetQueryObjectu(int id, int pname, LongBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryObjectui64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetQueryObjectui64v(id, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetQueryObjectui64v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static long glGetQueryObjectu(int id, int pname)
  {
    return glGetQueryObjectui64(id, pname);
  }
  
  public static long glGetQueryObjectui64(int id, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryObjectui64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    LongBuffer params = APIUtil.getBufferLong(caps);
    nglGetQueryObjectui64v(id, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glVertexAttribDivisor(int index, int divisor) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribDivisor;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribDivisor(index, divisor, function_pointer);
  }
  
  static native void nglVertexAttribDivisor(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexP2ui(int type, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexP2ui(type, value, function_pointer);
  }
  
  static native void nglVertexP2ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexP3ui(int type, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexP3ui(type, value, function_pointer);
  }
  
  static native void nglVertexP3ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexP4ui(int type, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexP4ui(type, value, function_pointer);
  }
  
  static native void nglVertexP4ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexP2u(int type, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 2);
    nglVertexP2uiv(type, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexP2uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexP3u(int type, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 3);
    nglVertexP3uiv(type, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexP3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexP4u(int type, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexP4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglVertexP4uiv(type, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexP4uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glTexCoordP1ui(int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexCoordP1ui(type, coords, function_pointer);
  }
  
  static native void nglTexCoordP1ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glTexCoordP2ui(int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexCoordP2ui(type, coords, function_pointer);
  }
  
  static native void nglTexCoordP2ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glTexCoordP3ui(int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexCoordP3ui(type, coords, function_pointer);
  }
  
  static native void nglTexCoordP3ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glTexCoordP4ui(int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexCoordP4ui(type, coords, function_pointer);
  }
  
  static native void nglTexCoordP4ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glTexCoordP1u(int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 1);
    nglTexCoordP1uiv(type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglTexCoordP1uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glTexCoordP2u(int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 2);
    nglTexCoordP2uiv(type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglTexCoordP2uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glTexCoordP3u(int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 3);
    nglTexCoordP3uiv(type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglTexCoordP3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glTexCoordP4u(int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexCoordP4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 4);
    nglTexCoordP4uiv(type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglTexCoordP4uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glMultiTexCoordP1ui(int texture, int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexCoordP1ui(texture, type, coords, function_pointer);
  }
  
  static native void nglMultiTexCoordP1ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexCoordP2ui(int texture, int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexCoordP2ui(texture, type, coords, function_pointer);
  }
  
  static native void nglMultiTexCoordP2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexCoordP3ui(int texture, int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexCoordP3ui(texture, type, coords, function_pointer);
  }
  
  static native void nglMultiTexCoordP3ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexCoordP4ui(int texture, int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMultiTexCoordP4ui(texture, type, coords, function_pointer);
  }
  
  static native void nglMultiTexCoordP4ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glMultiTexCoordP1u(int texture, int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 1);
    nglMultiTexCoordP1uiv(texture, type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglMultiTexCoordP1uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glMultiTexCoordP2u(int texture, int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 2);
    nglMultiTexCoordP2uiv(texture, type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglMultiTexCoordP2uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glMultiTexCoordP3u(int texture, int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 3);
    nglMultiTexCoordP3uiv(texture, type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglMultiTexCoordP3uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glMultiTexCoordP4u(int texture, int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiTexCoordP4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 4);
    nglMultiTexCoordP4uiv(texture, type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglMultiTexCoordP4uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glNormalP3ui(int type, int coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNormalP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNormalP3ui(type, coords, function_pointer);
  }
  
  static native void nglNormalP3ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glNormalP3u(int type, IntBuffer coords) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNormalP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(coords, 3);
    nglNormalP3uiv(type, MemoryUtil.getAddress(coords), function_pointer);
  }
  
  static native void nglNormalP3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glColorP3ui(int type, int color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglColorP3ui(type, color, function_pointer);
  }
  
  static native void nglColorP3ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glColorP4ui(int type, int color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorP4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglColorP4ui(type, color, function_pointer);
  }
  
  static native void nglColorP4ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glColorP3u(int type, IntBuffer color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(color, 3);
    nglColorP3uiv(type, MemoryUtil.getAddress(color), function_pointer);
  }
  
  static native void nglColorP3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glColorP4u(int type, IntBuffer color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorP4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(color, 4);
    nglColorP4uiv(type, MemoryUtil.getAddress(color), function_pointer);
  }
  
  static native void nglColorP4uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glSecondaryColorP3ui(int type, int color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSecondaryColorP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglSecondaryColorP3ui(type, color, function_pointer);
  }
  
  static native void nglSecondaryColorP3ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glSecondaryColorP3u(int type, IntBuffer color) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSecondaryColorP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(color, 3);
    nglSecondaryColorP3uiv(type, MemoryUtil.getAddress(color), function_pointer);
  }
  
  static native void nglSecondaryColorP3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribP1ui(index, type, normalized, value, function_pointer);
  }
  
  static native void nglVertexAttribP1ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
  
  public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribP2ui(index, type, normalized, value, function_pointer);
  }
  
  static native void nglVertexAttribP2ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
  
  public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribP3ui(index, type, normalized, value, function_pointer);
  }
  
  static native void nglVertexAttribP3ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
  
  public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribP4ui(index, type, normalized, value, function_pointer);
  }
  
  static native void nglVertexAttribP4ui(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, long paramLong);
  
  public static void glVertexAttribP1u(int index, int type, boolean normalized, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 1);
    nglVertexAttribP1uiv(index, type, normalized, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexAttribP1uiv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glVertexAttribP2u(int index, int type, boolean normalized, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 2);
    nglVertexAttribP2uiv(index, type, normalized, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexAttribP2uiv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glVertexAttribP3u(int index, int type, boolean normalized, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 3);
    nglVertexAttribP3uiv(index, type, normalized, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexAttribP3uiv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glVertexAttribP4u(int index, int type, boolean normalized, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribP4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglVertexAttribP4uiv(index, type, normalized, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglVertexAttribP4uiv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
}
