package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;




































































































































public final class GL40
{
  public static final int GL_DRAW_INDIRECT_BUFFER = 36671;
  public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 36675;
  public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 34943;
  public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 36442;
  public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 36443;
  public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 36444;
  public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 36445;
  public static final int GL_MAX_VERTEX_STREAMS = 36465;
  public static final int GL_DOUBLE_VEC2 = 36860;
  public static final int GL_DOUBLE_VEC3 = 36861;
  public static final int GL_DOUBLE_VEC4 = 36862;
  public static final int GL_DOUBLE_MAT2 = 36678;
  public static final int GL_DOUBLE_MAT3 = 36679;
  public static final int GL_DOUBLE_MAT4 = 36680;
  public static final int GL_DOUBLE_MAT2x3 = 36681;
  public static final int GL_DOUBLE_MAT2x4 = 36682;
  public static final int GL_DOUBLE_MAT3x2 = 36683;
  public static final int GL_DOUBLE_MAT3x4 = 36684;
  public static final int GL_DOUBLE_MAT4x2 = 36685;
  public static final int GL_DOUBLE_MAT4x3 = 36686;
  public static final int GL_SAMPLE_SHADING = 35894;
  public static final int GL_MIN_SAMPLE_SHADING_VALUE = 35895;
  public static final int GL_ACTIVE_SUBROUTINES = 36325;
  public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 36326;
  public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 36423;
  public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 36424;
  public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 36425;
  public static final int GL_MAX_SUBROUTINES = 36327;
  public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 36328;
  public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 36426;
  public static final int GL_COMPATIBLE_SUBROUTINES = 36427;
  public static final int GL_PATCHES = 14;
  public static final int GL_PATCH_VERTICES = 36466;
  public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 36467;
  public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 36468;
  public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 36469;
  public static final int GL_TESS_GEN_MODE = 36470;
  public static final int GL_TESS_GEN_SPACING = 36471;
  public static final int GL_TESS_GEN_VERTEX_ORDER = 36472;
  public static final int GL_TESS_GEN_POINT_MODE = 36473;
  public static final int GL_ISOLINES = 36474;
  public static final int GL_FRACTIONAL_ODD = 36475;
  public static final int GL_FRACTIONAL_EVEN = 36476;
  public static final int GL_MAX_PATCH_VERTICES = 36477;
  public static final int GL_MAX_TESS_GEN_LEVEL = 36478;
  public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 36479;
  public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 36480;
  public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 36481;
  public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 36482;
  public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 36483;
  public static final int GL_MAX_TESS_PATCH_COMPONENTS = 36484;
  public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 36485;
  public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 36486;
  public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 36489;
  public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 36490;
  public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 34924;
  public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 34925;
  public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 36382;
  public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 36383;
  public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 34032;
  public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 34033;
  public static final int GL_TESS_EVALUATION_SHADER = 36487;
  public static final int GL_TESS_CONTROL_SHADER = 36488;
  public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 36873;
  public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 36874;
  public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 36875;
  public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 36876;
  public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 36877;
  public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 36878;
  public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 36879;
  public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 36446;
  public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB = 36447;
  public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB = 36767;
  public static final int GL_TRANSFORM_FEEDBACK = 36386;
  public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 36387;
  public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 36388;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
  public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;
  public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;
  
  private GL40() {}
  
  public static void glBlendEquationi(int buf, int mode)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendEquationi;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendEquationi(buf, mode, function_pointer);
  }
  
  static native void nglBlendEquationi(int paramInt1, int paramInt2, long paramLong);
  
  public static void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendEquationSeparatei;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendEquationSeparatei(buf, modeRGB, modeAlpha, function_pointer);
  }
  
  static native void nglBlendEquationSeparatei(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glBlendFunci(int buf, int src, int dst) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendFunci;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendFunci(buf, src, dst, function_pointer);
  }
  
  static native void nglBlendFunci(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendFuncSeparatei;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha, function_pointer);
  }
  
  static native void nglBlendFuncSeparatei(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glDrawArraysIndirect(int mode, ByteBuffer indirect) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawArraysIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, 16);
    nglDrawArraysIndirect(mode, MemoryUtil.getAddress(indirect), function_pointer); }
  
  static native void nglDrawArraysIndirect(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDrawArraysIndirect(int mode, long indirect_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawArraysIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOenabled(caps);
    nglDrawArraysIndirectBO(mode, indirect_buffer_offset, function_pointer);
  }
  
  static native void nglDrawArraysIndirectBO(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawArraysIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, 4);
    nglDrawArraysIndirect(mode, MemoryUtil.getAddress(indirect), function_pointer);
  }
  
  public static void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawElementsIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, 20);
    nglDrawElementsIndirect(mode, type, MemoryUtil.getAddress(indirect), function_pointer); }
  
  static native void nglDrawElementsIndirect(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glDrawElementsIndirect(int mode, int type, long indirect_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawElementsIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOenabled(caps);
    nglDrawElementsIndirectBO(mode, type, indirect_buffer_offset, function_pointer);
  }
  
  static native void nglDrawElementsIndirectBO(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawElementsIndirect;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, 5);
    nglDrawElementsIndirect(mode, type, MemoryUtil.getAddress(indirect), function_pointer);
  }
  
  public static void glUniform1d(int location, double x) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform1d(location, x, function_pointer);
  }
  
  static native void nglUniform1d(int paramInt, double paramDouble, long paramLong);
  
  public static void glUniform2d(int location, double x, double y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform2d(location, x, y, function_pointer);
  }
  
  static native void nglUniform2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glUniform3d(int location, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform3d(location, x, y, z, function_pointer);
  }
  
  static native void nglUniform3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glUniform4d(int location, double x, double y, double z, double w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform4d(location, x, y, z, w, function_pointer);
  }
  
  static native void nglUniform4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glUniform1(int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform1dv(location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform1dv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform2(int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform2dv(location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform2dv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform3(int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform3dv(location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform3dv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform4(int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform4dv(location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform4dv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix2(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix2dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix3(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix3dv(location, value.remaining() / 9, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix3dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix4(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix4dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix2x3(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix2x3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix2x3dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix2x4(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix2x4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix2x4dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix3x2(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix3x2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix3x2dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix3x4(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix3x4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix3x4dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix4x2(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix4x2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix4x2dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix4x3(int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix4x3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniformMatrix4x3dv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glGetUniform(int program, int location, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformdv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetUniformdv(program, location, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetUniformdv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glMinSampleShading(float value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMinSampleShading;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMinSampleShading(value, function_pointer);
  }
  
  static native void nglMinSampleShading(float paramFloat, long paramLong);
  
  public static int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSubroutineUniformLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetSubroutineUniformLocation(program, shadertype, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetSubroutineUniformLocation(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSubroutineUniformLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetSubroutineUniformLocation(program, shadertype, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSubroutineIndex;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetSubroutineIndex(program, shadertype, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetSubroutineIndex(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSubroutineIndex;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetSubroutineIndex(program, shadertype, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, IntBuffer values) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineUniformiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(values, 1);
    nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, MemoryUtil.getAddress(values), function_pointer);
  }
  


  static native void nglGetActiveSubroutineUniformiv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname)
  {
    return glGetActiveSubroutineUniformi(program, shadertype, index, pname);
  }
  
  public static int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineUniformiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer values = APIUtil.getBufferInt(caps);
    nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, MemoryUtil.getAddress(values), function_pointer);
    return values.get(0);
  }
  
  public static void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineUniformName;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(name);
    nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglGetActiveSubroutineUniformName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineUniformName;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, bufsize);
    nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  
  public static void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineName;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(name);
    nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglGetActiveSubroutineName(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveSubroutineName;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, bufsize);
    nglGetActiveSubroutineName(program, shadertype, index, bufsize, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  
  public static void glUniformSubroutinesu(int shadertype, IntBuffer indices) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformSubroutinesuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(indices);
    nglUniformSubroutinesuiv(shadertype, indices.remaining(), MemoryUtil.getAddress(indices), function_pointer);
  }
  
  static native void nglUniformSubroutinesuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetUniformSubroutineu(int shadertype, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformSubroutineuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetUniformSubroutineuiv(shadertype, location, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetUniformSubroutineuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetUniformSubroutineu(int shadertype, int location)
  {
    return glGetUniformSubroutineui(shadertype, location);
  }
  
  public static int glGetUniformSubroutineui(int shadertype, int location)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformSubroutineuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetUniformSubroutineuiv(shadertype, location, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetProgramStage(int program, int shadertype, int pname, IntBuffer values) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramStageiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(values, 1);
    nglGetProgramStageiv(program, shadertype, pname, MemoryUtil.getAddress(values), function_pointer);
  }
  


  static native void nglGetProgramStageiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetProgramStage(int program, int shadertype, int pname)
  {
    return glGetProgramStagei(program, shadertype, pname);
  }
  
  public static int glGetProgramStagei(int program, int shadertype, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramStageiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer values = APIUtil.getBufferInt(caps);
    nglGetProgramStageiv(program, shadertype, pname, MemoryUtil.getAddress(values), function_pointer);
    return values.get(0);
  }
  
  public static void glPatchParameteri(int pname, int value) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glPatchParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglPatchParameteri(pname, value, function_pointer);
  }
  
  static native void nglPatchParameteri(int paramInt1, int paramInt2, long paramLong);
  
  public static void glPatchParameter(int pname, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glPatchParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(values, 4);
    nglPatchParameterfv(pname, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglPatchParameterfv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glBindTransformFeedback(int target, int id) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindTransformFeedback(target, id, function_pointer);
  }
  
  static native void nglBindTransformFeedback(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDeleteTransformFeedbacks(IntBuffer ids) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglDeleteTransformFeedbacks(ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglDeleteTransformFeedbacks(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteTransformFeedbacks(int id) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteTransformFeedbacks(1, APIUtil.getInt(caps, id), function_pointer);
  }
  
  public static void glGenTransformFeedbacks(IntBuffer ids) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglGenTransformFeedbacks(ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglGenTransformFeedbacks(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenTransformFeedbacks() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer ids = APIUtil.getBufferInt(caps);
    nglGenTransformFeedbacks(1, MemoryUtil.getAddress(ids), function_pointer);
    return ids.get(0);
  }
  
  public static boolean glIsTransformFeedback(int id) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsTransformFeedback(id, function_pointer);
    return __result;
  }
  
  static native boolean nglIsTransformFeedback(int paramInt, long paramLong);
  
  public static void glPauseTransformFeedback() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glPauseTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglPauseTransformFeedback(function_pointer);
  }
  
  static native void nglPauseTransformFeedback(long paramLong);
  
  public static void glResumeTransformFeedback() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glResumeTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglResumeTransformFeedback(function_pointer);
  }
  
  static native void nglResumeTransformFeedback(long paramLong);
  
  public static void glDrawTransformFeedback(int mode, int id) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDrawTransformFeedback(mode, id, function_pointer);
  }
  
  static native void nglDrawTransformFeedback(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDrawTransformFeedbackStream(int mode, int id, int stream) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawTransformFeedbackStream;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDrawTransformFeedbackStream(mode, id, stream, function_pointer);
  }
  
  static native void nglDrawTransformFeedbackStream(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glBeginQueryIndexed(int target, int index, int id) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBeginQueryIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBeginQueryIndexed(target, index, id, function_pointer);
  }
  
  static native void nglBeginQueryIndexed(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glEndQueryIndexed(int target, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEndQueryIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEndQueryIndexed(target, index, function_pointer);
  }
  
  static native void nglEndQueryIndexed(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetQueryIndexed(int target, int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryIndexediv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetQueryIndexediv(target, index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetQueryIndexediv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetQueryIndexed(int target, int index, int pname)
  {
    return glGetQueryIndexedi(target, index, pname);
  }
  
  public static int glGetQueryIndexedi(int target, int index, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetQueryIndexediv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetQueryIndexediv(target, index, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
}
