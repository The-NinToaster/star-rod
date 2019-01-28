package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;
























































public final class GL41
{
  public static final int GL_SHADER_COMPILER = 36346;
  public static final int GL_NUM_SHADER_BINARY_FORMATS = 36345;
  public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
  public static final int GL_MAX_VARYING_VECTORS = 36348;
  public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
  public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
  public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
  public static final int GL_FIXED = 5132;
  public static final int GL_LOW_FLOAT = 36336;
  public static final int GL_MEDIUM_FLOAT = 36337;
  public static final int GL_HIGH_FLOAT = 36338;
  public static final int GL_LOW_INT = 36339;
  public static final int GL_MEDIUM_INT = 36340;
  public static final int GL_HIGH_INT = 36341;
  public static final int GL_RGB565 = 36194;
  public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367;
  public static final int GL_PROGRAM_BINARY_LENGTH = 34625;
  public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 34814;
  public static final int GL_PROGRAM_BINARY_FORMATS = 34815;
  public static final int GL_VERTEX_SHADER_BIT = 1;
  public static final int GL_FRAGMENT_SHADER_BIT = 2;
  public static final int GL_GEOMETRY_SHADER_BIT = 4;
  public static final int GL_TESS_CONTROL_SHADER_BIT = 8;
  public static final int GL_TESS_EVALUATION_SHADER_BIT = 16;
  public static final int GL_ALL_SHADER_BITS = -1;
  public static final int GL_PROGRAM_SEPARABLE = 33368;
  public static final int GL_ACTIVE_PROGRAM = 33369;
  public static final int GL_PROGRAM_PIPELINE_BINDING = 33370;
  public static final int GL_MAX_VIEWPORTS = 33371;
  public static final int GL_VIEWPORT_SUBPIXEL_BITS = 33372;
  public static final int GL_VIEWPORT_BOUNDS_RANGE = 33373;
  public static final int GL_LAYER_PROVOKING_VERTEX = 33374;
  public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 33375;
  public static final int GL_UNDEFINED_VERTEX = 33376;
  
  private GL41() {}
  
  public static void glReleaseShaderCompiler()
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReleaseShaderCompiler;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglReleaseShaderCompiler(function_pointer);
  }
  
  static native void nglReleaseShaderCompiler(long paramLong);
  
  public static void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glShaderBinary;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(shaders);
    BufferChecks.checkDirect(binary);
    nglShaderBinary(shaders.remaining(), MemoryUtil.getAddress(shaders), binaryformat, MemoryUtil.getAddress(binary), binary.remaining(), function_pointer);
  }
  
  static native void nglShaderBinary(int paramInt1, long paramLong1, int paramInt2, long paramLong2, int paramInt3, long paramLong3);
  
  public static void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderPrecisionFormat;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(range, 2);
    BufferChecks.checkBuffer(precision, 1);
    nglGetShaderPrecisionFormat(shadertype, precisiontype, MemoryUtil.getAddress(range), MemoryUtil.getAddress(precision), function_pointer);
  }
  
  static native void nglGetShaderPrecisionFormat(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glDepthRangef(float n, float f) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDepthRangef;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDepthRangef(n, f, function_pointer);
  }
  
  static native void nglDepthRangef(float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glClearDepthf(float d) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearDepthf;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClearDepthf(d, function_pointer);
  }
  
  static native void nglClearDepthf(float paramFloat, long paramLong);
  
  public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramBinary;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkBuffer(binaryFormat, 1);
    BufferChecks.checkDirect(binary);
    nglGetProgramBinary(program, binary.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(binaryFormat), MemoryUtil.getAddress(binary), function_pointer);
  }
  
  static native void nglGetProgramBinary(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramBinary;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(binary);
    nglProgramBinary(program, binaryFormat, MemoryUtil.getAddress(binary), binary.remaining(), function_pointer);
  }
  
  static native void nglProgramBinary(int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2);
  
  public static void glProgramParameteri(int program, int pname, int value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramParameteri(program, pname, value, function_pointer);
  }
  
  static native void nglProgramParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glUseProgramStages(int pipeline, int stages, int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUseProgramStages;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUseProgramStages(pipeline, stages, program, function_pointer);
  }
  
  static native void nglUseProgramStages(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glActiveShaderProgram(int pipeline, int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glActiveShaderProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglActiveShaderProgram(pipeline, program, function_pointer);
  }
  

  static native void nglActiveShaderProgram(int paramInt1, int paramInt2, long paramLong);
  
  public static int glCreateShaderProgram(int type, ByteBuffer string)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShaderProgramv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(string);
    BufferChecks.checkNullTerminated(string);
    int __result = nglCreateShaderProgramv(type, 1, MemoryUtil.getAddress(string), function_pointer);
    return __result;
  }
  


  static native int nglCreateShaderProgramv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  public static int glCreateShaderProgram(int type, int count, ByteBuffer strings)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShaderProgramv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(strings);
    BufferChecks.checkNullTerminated(strings, count);
    int __result = nglCreateShaderProgramv2(type, count, MemoryUtil.getAddress(strings), function_pointer);
    return __result;
  }
  
  static native int nglCreateShaderProgramv2(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glCreateShaderProgram(int type, ByteBuffer[] strings) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShaderProgramv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkArray(strings, 1);
    int __result = nglCreateShaderProgramv3(type, strings.length, strings, function_pointer);
    return __result;
  }
  
  static native int nglCreateShaderProgramv3(int paramInt1, int paramInt2, ByteBuffer[] paramArrayOfByteBuffer, long paramLong);
  
  public static int glCreateShaderProgram(int type, CharSequence string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShaderProgramv;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCreateShaderProgramv(type, 1, APIUtil.getBufferNT(caps, string), function_pointer);
    return __result;
  }
  
  public static int glCreateShaderProgram(int type, CharSequence[] strings)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShaderProgramv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkArray(strings);
    int __result = nglCreateShaderProgramv2(type, strings.length, APIUtil.getBufferNT(caps, strings), function_pointer);
    return __result;
  }
  
  public static void glBindProgramPipeline(int pipeline) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindProgramPipeline;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindProgramPipeline(pipeline, function_pointer);
  }
  
  static native void nglBindProgramPipeline(int paramInt, long paramLong);
  
  public static void glDeleteProgramPipelines(IntBuffer pipelines) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(pipelines);
    nglDeleteProgramPipelines(pipelines.remaining(), MemoryUtil.getAddress(pipelines), function_pointer);
  }
  
  static native void nglDeleteProgramPipelines(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteProgramPipelines(int pipeline) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteProgramPipelines(1, APIUtil.getInt(caps, pipeline), function_pointer);
  }
  
  public static void glGenProgramPipelines(IntBuffer pipelines) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(pipelines);
    nglGenProgramPipelines(pipelines.remaining(), MemoryUtil.getAddress(pipelines), function_pointer);
  }
  
  static native void nglGenProgramPipelines(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenProgramPipelines() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer pipelines = APIUtil.getBufferInt(caps);
    nglGenProgramPipelines(1, MemoryUtil.getAddress(pipelines), function_pointer);
    return pipelines.get(0);
  }
  
  public static boolean glIsProgramPipeline(int pipeline) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsProgramPipeline;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsProgramPipeline(pipeline, function_pointer);
    return __result;
  }
  
  static native boolean nglIsProgramPipeline(int paramInt, long paramLong);
  
  public static void glGetProgramPipeline(int pipeline, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramPipelineiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetProgramPipelineiv(pipeline, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetProgramPipelineiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetProgramPipelinei(int pipeline, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramPipelineiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetProgramPipelineiv(pipeline, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glProgramUniform1i(int program, int location, int v0) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1i(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glProgramUniform2i(int program, int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2i(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glProgramUniform3i(int program, int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3i(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4i(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glProgramUniform1f(int program, int location, float v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1f(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1f(int paramInt1, int paramInt2, float paramFloat, long paramLong);
  
  public static void glProgramUniform2f(int program, int location, float v0, float v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2f(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2f(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glProgramUniform3f(int program, int location, float v0, float v1, float v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3f(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3f(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4f(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4f(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glProgramUniform1d(int program, int location, double v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1d(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1d(int paramInt1, int paramInt2, double paramDouble, long paramLong);
  
  public static void glProgramUniform2d(int program, int location, double v0, double v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2d(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2d(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glProgramUniform3d(int program, int location, double v0, double v1, double v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3d(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3d(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glProgramUniform4d(int program, int location, double v0, double v1, double v2, double v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4d(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4d(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glProgramUniform1(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1iv(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1iv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2iv(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2iv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3iv(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3iv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4iv(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4iv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform1(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1fv(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1fv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2fv(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2fv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3fv(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3fv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4(int program, int location, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4fv(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4fv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform1(int program, int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1dv(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1dv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2(int program, int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2dv(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2dv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3(int program, int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3dv(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3dv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4(int program, int location, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4dv(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4dv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform1ui(int program, int location, int v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform1ui(program, location, v0, function_pointer);
  }
  
  static native void nglProgramUniform1ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glProgramUniform2ui(int program, int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform2ui(program, location, v0, v1, function_pointer);
  }
  
  static native void nglProgramUniform2ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform3ui(program, location, v0, v1, v2, function_pointer);
  }
  
  static native void nglProgramUniform3ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglProgramUniform4ui(program, location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglProgramUniform4ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glProgramUniform1u(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform1uiv(program, location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform1uiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform2u(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform2uiv(program, location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform2uiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform3u(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform3uiv(program, location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform3uiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniform4u(int program, int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniform4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniform4uiv(program, location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniform4uiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2dv(program, location, value.remaining() >> 2, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3dv(program, location, value.remaining() / 9, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4dv(program, location, value.remaining() >> 4, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x3(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x3fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x2(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x2fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x4(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x4fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x2(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x2fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x4(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x4fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x3(int program, int location, boolean transpose, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x3fv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x3(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x3dv(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x3dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x2(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x2dv(program, location, value.remaining() / 6, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x2dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix2x4(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix2x4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix2x4dv(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix2x4dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x2(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x2dv(program, location, value.remaining() >> 3, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x2dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix3x4(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix3x4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix3x4dv(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix3x4dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glProgramUniformMatrix4x3(int program, int location, boolean transpose, DoubleBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glProgramUniformMatrix4x3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglProgramUniformMatrix4x3dv(program, location, value.remaining() / 12, transpose, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglProgramUniformMatrix4x3dv(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glValidateProgramPipeline(int pipeline) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glValidateProgramPipeline;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglValidateProgramPipeline(pipeline, function_pointer);
  }
  
  static native void nglValidateProgramPipeline(int paramInt, long paramLong);
  
  public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramPipelineInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(infoLog);
    nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(infoLog), function_pointer);
  }
  
  static native void nglGetProgramPipelineInfoLog(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramPipelineInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer infoLog_length = APIUtil.getLengths(caps);
    ByteBuffer infoLog = APIUtil.getBufferByte(caps, bufSize);
    nglGetProgramPipelineInfoLog(pipeline, bufSize, MemoryUtil.getAddress0(infoLog_length), MemoryUtil.getAddress(infoLog), function_pointer);
    infoLog.limit(infoLog_length.get(0));
    return APIUtil.getString(caps, infoLog);
  }
  
  public static void glVertexAttribL1d(int index, double x) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL1d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribL1d(index, x, function_pointer);
  }
  
  static native void nglVertexAttribL1d(int paramInt, double paramDouble, long paramLong);
  
  public static void glVertexAttribL2d(int index, double x, double y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL2d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribL2d(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttribL2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glVertexAttribL3d(int index, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL3d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribL3d(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttribL3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glVertexAttribL4d(int index, double x, double y, double z, double w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL4d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribL4d(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttribL4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glVertexAttribL1(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL1dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 1);
    nglVertexAttribL1dv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribL1dv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribL2(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL2dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 2);
    nglVertexAttribL2dv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribL2dv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribL3(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL3dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 3);
    nglVertexAttribL3dv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribL3dv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribL4(int index, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribL4dv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribL4dv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribL4dv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribLPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(pointer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = pointer;
    nglVertexAttribLPointer(index, size, 5130, stride, MemoryUtil.getAddress(pointer), function_pointer); }
  
  static native void nglVertexAttribLPointer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribLPointer(int index, int size, int stride, long pointer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribLPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglVertexAttribLPointerBO(index, size, 5130, stride, pointer_buffer_offset, function_pointer);
  }
  
  static native void nglVertexAttribLPointerBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribL(int index, int pname, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribLdv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribLdv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribLdv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glViewportArray(int first, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glViewportArrayv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglViewportArrayv(first, v.remaining() >> 2, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglViewportArrayv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glViewportIndexedf(int index, float x, float y, float w, float h) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glViewportIndexedf;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglViewportIndexedf(index, x, y, w, h, function_pointer);
  }
  
  static native void nglViewportIndexedf(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glViewportIndexed(int index, FloatBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glViewportIndexedfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglViewportIndexedfv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglViewportIndexedfv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glScissorArray(int first, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glScissorArrayv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglScissorArrayv(first, v.remaining() >> 2, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglScissorArrayv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glScissorIndexed(int index, int left, int bottom, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glScissorIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglScissorIndexed(index, left, bottom, width, height, function_pointer);
  }
  
  static native void nglScissorIndexed(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glScissorIndexed(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glScissorIndexedv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglScissorIndexedv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglScissorIndexedv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDepthRangeArray(int first, DoubleBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDepthRangeArrayv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(v);
    nglDepthRangeArrayv(first, v.remaining() >> 1, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglDepthRangeArrayv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glDepthRangeIndexed(int index, double n, double f) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDepthRangeIndexed;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDepthRangeIndexed(index, n, f, function_pointer);
  }
  
  static native void nglDepthRangeIndexed(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glGetFloat(int target, int index, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloati_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetFloati_v(target, index, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetFloati_v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetFloat(int target, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFloati_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer data = APIUtil.getBufferFloat(caps);
    nglGetFloati_v(target, index, MemoryUtil.getAddress(data), function_pointer);
    return data.get(0);
  }
  
  public static void glGetDouble(int target, int index, DoubleBuffer data) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoublei_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetDoublei_v(target, index, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetDoublei_v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static double glGetDouble(int target, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDoublei_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    DoubleBuffer data = APIUtil.getBufferDouble(caps);
    nglGetDoublei_v(target, index, MemoryUtil.getAddress(data), function_pointer);
    return data.get(0);
  }
}
