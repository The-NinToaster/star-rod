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
import org.lwjgl.PointerBuffer;























































































public final class GL20
{
  public static final int GL_SHADING_LANGUAGE_VERSION = 35724;
  public static final int GL_CURRENT_PROGRAM = 35725;
  public static final int GL_SHADER_TYPE = 35663;
  public static final int GL_DELETE_STATUS = 35712;
  public static final int GL_COMPILE_STATUS = 35713;
  public static final int GL_LINK_STATUS = 35714;
  public static final int GL_VALIDATE_STATUS = 35715;
  public static final int GL_INFO_LOG_LENGTH = 35716;
  public static final int GL_ATTACHED_SHADERS = 35717;
  public static final int GL_ACTIVE_UNIFORMS = 35718;
  public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
  public static final int GL_ACTIVE_ATTRIBUTES = 35721;
  public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
  public static final int GL_SHADER_SOURCE_LENGTH = 35720;
  public static final int GL_SHADER_OBJECT = 35656;
  public static final int GL_FLOAT_VEC2 = 35664;
  public static final int GL_FLOAT_VEC3 = 35665;
  public static final int GL_FLOAT_VEC4 = 35666;
  public static final int GL_INT_VEC2 = 35667;
  public static final int GL_INT_VEC3 = 35668;
  public static final int GL_INT_VEC4 = 35669;
  public static final int GL_BOOL = 35670;
  public static final int GL_BOOL_VEC2 = 35671;
  public static final int GL_BOOL_VEC3 = 35672;
  public static final int GL_BOOL_VEC4 = 35673;
  public static final int GL_FLOAT_MAT2 = 35674;
  public static final int GL_FLOAT_MAT3 = 35675;
  public static final int GL_FLOAT_MAT4 = 35676;
  public static final int GL_SAMPLER_1D = 35677;
  public static final int GL_SAMPLER_2D = 35678;
  public static final int GL_SAMPLER_3D = 35679;
  public static final int GL_SAMPLER_CUBE = 35680;
  public static final int GL_SAMPLER_1D_SHADOW = 35681;
  public static final int GL_SAMPLER_2D_SHADOW = 35682;
  public static final int GL_VERTEX_SHADER = 35633;
  public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658;
  public static final int GL_MAX_VARYING_FLOATS = 35659;
  public static final int GL_MAX_VERTEX_ATTRIBS = 34921;
  public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
  public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
  public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
  public static final int GL_MAX_TEXTURE_COORDS = 34929;
  public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
  public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 34371;
  public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
  public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
  public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
  public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
  public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
  public static final int GL_CURRENT_VERTEX_ATTRIB = 34342;
  public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
  public static final int GL_FRAGMENT_SHADER = 35632;
  public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657;
  public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723;
  public static final int GL_MAX_DRAW_BUFFERS = 34852;
  public static final int GL_DRAW_BUFFER0 = 34853;
  public static final int GL_DRAW_BUFFER1 = 34854;
  public static final int GL_DRAW_BUFFER2 = 34855;
  public static final int GL_DRAW_BUFFER3 = 34856;
  public static final int GL_DRAW_BUFFER4 = 34857;
  public static final int GL_DRAW_BUFFER5 = 34858;
  public static final int GL_DRAW_BUFFER6 = 34859;
  public static final int GL_DRAW_BUFFER7 = 34860;
  public static final int GL_DRAW_BUFFER8 = 34861;
  public static final int GL_DRAW_BUFFER9 = 34862;
  public static final int GL_DRAW_BUFFER10 = 34863;
  public static final int GL_DRAW_BUFFER11 = 34864;
  public static final int GL_DRAW_BUFFER12 = 34865;
  public static final int GL_DRAW_BUFFER13 = 34866;
  public static final int GL_DRAW_BUFFER14 = 34867;
  public static final int GL_DRAW_BUFFER15 = 34868;
  public static final int GL_POINT_SPRITE = 34913;
  public static final int GL_COORD_REPLACE = 34914;
  public static final int GL_POINT_SPRITE_COORD_ORIGIN = 36000;
  public static final int GL_LOWER_LEFT = 36001;
  public static final int GL_UPPER_LEFT = 36002;
  public static final int GL_STENCIL_BACK_FUNC = 34816;
  public static final int GL_STENCIL_BACK_FAIL = 34817;
  public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
  public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
  public static final int GL_STENCIL_BACK_REF = 36003;
  public static final int GL_STENCIL_BACK_VALUE_MASK = 36004;
  public static final int GL_STENCIL_BACK_WRITEMASK = 36005;
  public static final int GL_BLEND_EQUATION_RGB = 32777;
  public static final int GL_BLEND_EQUATION_ALPHA = 34877;
  
  private GL20() {}
  
  public static void glShaderSource(int shader, ByteBuffer string)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glShaderSource;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(string);
    nglShaderSource(shader, 1, MemoryUtil.getAddress(string), string.remaining(), function_pointer);
  }
  
  static native void nglShaderSource(int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2);
  
  public static void glShaderSource(int shader, CharSequence string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glShaderSource;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglShaderSource(shader, 1, APIUtil.getBuffer(caps, string), string.length(), function_pointer);
  }
  
  public static void glShaderSource(int shader, CharSequence[] strings)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glShaderSource;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkArray(strings);
    nglShaderSource3(shader, strings.length, APIUtil.getBuffer(caps, strings), APIUtil.getLengths(caps, strings), function_pointer);
  }
  
  static native void nglShaderSource3(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static int glCreateShader(int type) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCreateShader(type, function_pointer);
    return __result;
  }
  
  static native int nglCreateShader(int paramInt, long paramLong);
  
  public static boolean glIsShader(int shader) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsShader(shader, function_pointer);
    return __result;
  }
  
  static native boolean nglIsShader(int paramInt, long paramLong);
  
  public static void glCompileShader(int shader) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompileShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCompileShader(shader, function_pointer);
  }
  
  static native void nglCompileShader(int paramInt, long paramLong);
  
  public static void glDeleteShader(int shader) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteShader(shader, function_pointer);
  }
  
  static native void nglDeleteShader(int paramInt, long paramLong);
  
  public static int glCreateProgram() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCreateProgram(function_pointer);
    return __result;
  }
  
  static native int nglCreateProgram(long paramLong);
  
  public static boolean glIsProgram(int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsProgram(program, function_pointer);
    return __result;
  }
  
  static native boolean nglIsProgram(int paramInt, long paramLong);
  
  public static void glAttachShader(int program, int shader) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glAttachShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglAttachShader(program, shader, function_pointer);
  }
  
  static native void nglAttachShader(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDetachShader(int program, int shader) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDetachShader;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDetachShader(program, shader, function_pointer);
  }
  
  static native void nglDetachShader(int paramInt1, int paramInt2, long paramLong);
  
  public static void glLinkProgram(int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glLinkProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglLinkProgram(program, function_pointer);
  }
  
  static native void nglLinkProgram(int paramInt, long paramLong);
  
  public static void glUseProgram(int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUseProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUseProgram(program, function_pointer);
  }
  
  static native void nglUseProgram(int paramInt, long paramLong);
  
  public static void glValidateProgram(int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glValidateProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglValidateProgram(program, function_pointer);
  }
  
  static native void nglValidateProgram(int paramInt, long paramLong);
  
  public static void glDeleteProgram(int program) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteProgram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteProgram(program, function_pointer);
  }
  
  static native void nglDeleteProgram(int paramInt, long paramLong);
  
  public static void glUniform1f(int location, float v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform1f(location, v0, function_pointer);
  }
  
  static native void nglUniform1f(int paramInt, float paramFloat, long paramLong);
  
  public static void glUniform2f(int location, float v0, float v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform2f(location, v0, v1, function_pointer);
  }
  
  static native void nglUniform2f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glUniform3f(int location, float v0, float v1, float v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform3f(location, v0, v1, v2, function_pointer);
  }
  
  static native void nglUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glUniform4f(int location, float v0, float v1, float v2, float v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform4f(location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glUniform1i(int location, int v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform1i(location, v0, function_pointer);
  }
  
  static native void nglUniform1i(int paramInt1, int paramInt2, long paramLong);
  
  public static void glUniform2i(int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform2i(location, v0, v1, function_pointer);
  }
  
  static native void nglUniform2i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glUniform3i(int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform3i(location, v0, v1, v2, function_pointer);
  }
  
  static native void nglUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glUniform4i(int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform4i(location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glUniform1(int location, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform1fv(location, values.remaining(), MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform1fv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform2(int location, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform2fv(location, values.remaining() >> 1, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform2fv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform3(int location, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform3fv(location, values.remaining() / 3, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform3fv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform4(int location, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform4fv(location, values.remaining() >> 2, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform4fv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform1(int location, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform1iv(location, values.remaining(), MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform1iv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform2(int location, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform2iv(location, values.remaining() >> 1, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform2iv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform3(int location, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform3iv(location, values.remaining() / 3, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform3iv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform4(int location, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(values);
    nglUniform4iv(location, values.remaining() >> 2, MemoryUtil.getAddress(values), function_pointer);
  }
  
  static native void nglUniform4iv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer matrices) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix2fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(matrices);
    nglUniformMatrix2fv(location, matrices.remaining() >> 2, transpose, MemoryUtil.getAddress(matrices), function_pointer);
  }
  
  static native void nglUniformMatrix2fv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer matrices) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix3fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(matrices);
    nglUniformMatrix3fv(location, matrices.remaining() / 9, transpose, MemoryUtil.getAddress(matrices), function_pointer);
  }
  
  static native void nglUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer matrices) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniformMatrix4fv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(matrices);
    nglUniformMatrix4fv(location, matrices.remaining() >> 4, transpose, MemoryUtil.getAddress(matrices), function_pointer);
  }
  
  static native void nglUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2);
  
  public static void glGetShader(int shader, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetShaderiv(shader, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetShaderiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetShader(int shader, int pname)
  {
    return glGetShaderi(shader, pname);
  }
  
  public static int glGetShaderi(int shader, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetShaderiv(shader, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetProgram(int program, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetProgramiv(program, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetProgramiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetProgram(int program, int pname)
  {
    return glGetProgrami(program, pname);
  }
  
  public static int glGetProgrami(int program, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetProgramiv(program, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(infoLog);
    nglGetShaderInfoLog(shader, infoLog.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(infoLog), function_pointer);
  }
  
  static native void nglGetShaderInfoLog(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetShaderInfoLog(int shader, int maxLength) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer infoLog_length = APIUtil.getLengths(caps);
    ByteBuffer infoLog = APIUtil.getBufferByte(caps, maxLength);
    nglGetShaderInfoLog(shader, maxLength, MemoryUtil.getAddress0(infoLog_length), MemoryUtil.getAddress(infoLog), function_pointer);
    infoLog.limit(infoLog_length.get(0));
    return APIUtil.getString(caps, infoLog);
  }
  
  public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(infoLog);
    nglGetProgramInfoLog(program, infoLog.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(infoLog), function_pointer);
  }
  
  static native void nglGetProgramInfoLog(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetProgramInfoLog(int program, int maxLength) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetProgramInfoLog;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer infoLog_length = APIUtil.getLengths(caps);
    ByteBuffer infoLog = APIUtil.getBufferByte(caps, maxLength);
    nglGetProgramInfoLog(program, maxLength, MemoryUtil.getAddress0(infoLog_length), MemoryUtil.getAddress(infoLog), function_pointer);
    infoLog.limit(infoLog_length.get(0));
    return APIUtil.getString(caps, infoLog);
  }
  
  public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetAttachedShaders;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (count != null)
      BufferChecks.checkBuffer(count, 1);
    BufferChecks.checkDirect(shaders);
    nglGetAttachedShaders(program, shaders.remaining(), MemoryUtil.getAddressSafe(count), MemoryUtil.getAddress(shaders), function_pointer);
  }
  



  static native void nglGetAttachedShaders(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  


  public static int glGetUniformLocation(int program, ByteBuffer name)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(name, 1);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetUniformLocation(program, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetUniformLocation(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGetUniformLocation(int program, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetUniformLocation(program, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveUniform;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkBuffer(size, 1);
    BufferChecks.checkBuffer(type, 1);
    BufferChecks.checkDirect(name);
    nglGetActiveUniform(program, index, name.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(size), MemoryUtil.getAddress(type), MemoryUtil.getAddress(name), function_pointer);
  }
  


  static native void nglGetActiveUniform(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
  

  public static String glGetActiveUniform(int program, int index, int maxLength, IntBuffer sizeType)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveUniform;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(sizeType, 2);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, maxLength);
    nglGetActiveUniform(program, index, maxLength, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress(sizeType), MemoryUtil.getAddress(sizeType, sizeType.position() + 1), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  




  public static String glGetActiveUniform(int program, int index, int maxLength)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveUniform;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, maxLength);
    nglGetActiveUniform(program, index, maxLength, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress0(APIUtil.getBufferInt(caps)), MemoryUtil.getAddress(APIUtil.getBufferInt(caps), 1), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  




  public static int glGetActiveUniformSize(int program, int index)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveUniform;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer size = APIUtil.getBufferInt(caps);
    nglGetActiveUniform(program, index, 1, 0L, MemoryUtil.getAddress(size), MemoryUtil.getAddress(size, 1), APIUtil.getBufferByte0(caps), function_pointer);
    return size.get(0);
  }
  




  public static int glGetActiveUniformType(int program, int index)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveUniform;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer type = APIUtil.getBufferInt(caps);
    nglGetActiveUniform(program, index, 0, 0L, MemoryUtil.getAddress(type, 1), MemoryUtil.getAddress(type), APIUtil.getBufferByte0(caps), function_pointer);
    return type.get(0);
  }
  
  public static void glGetUniform(int program, int location, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetUniformfv(program, location, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetUniformfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetUniform(int program, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetUniformiv(program, location, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetUniformiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderSource;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkDirect(source);
    nglGetShaderSource(shader, source.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(source), function_pointer);
  }
  
  static native void nglGetShaderSource(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetShaderSource(int shader, int maxLength) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetShaderSource;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer source_length = APIUtil.getLengths(caps);
    ByteBuffer source = APIUtil.getBufferByte(caps, maxLength);
    nglGetShaderSource(shader, maxLength, MemoryUtil.getAddress0(source_length), MemoryUtil.getAddress(source), function_pointer);
    source.limit(source_length.get(0));
    return APIUtil.getString(caps, source);
  }
  
  public static void glVertexAttrib1s(int index, short x) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1s;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1s(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1s(int paramInt, short paramShort, long paramLong);
  
  public static void glVertexAttrib1f(int index, float x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1f(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1f(int paramInt, float paramFloat, long paramLong);
  
  public static void glVertexAttrib1d(int index, double x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib1d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib1d(index, x, function_pointer);
  }
  
  static native void nglVertexAttrib1d(int paramInt, double paramDouble, long paramLong);
  
  public static void glVertexAttrib2s(int index, short x, short y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2s;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2s(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2s(int paramInt, short paramShort1, short paramShort2, long paramLong);
  
  public static void glVertexAttrib2f(int index, float x, float y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2f(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2f(int paramInt, float paramFloat1, float paramFloat2, long paramLong);
  
  public static void glVertexAttrib2d(int index, double x, double y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib2d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib2d(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttrib2d(int paramInt, double paramDouble1, double paramDouble2, long paramLong);
  
  public static void glVertexAttrib3s(int index, short x, short y, short z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3s;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3s(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3s(int paramInt, short paramShort1, short paramShort2, short paramShort3, long paramLong);
  
  public static void glVertexAttrib3f(int index, float x, float y, float z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3f(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, long paramLong);
  
  public static void glVertexAttrib3d(int index, double x, double y, double z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib3d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib3d(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttrib3d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, long paramLong);
  
  public static void glVertexAttrib4s(int index, short x, short y, short z, short w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4s;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4s(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4s(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, long paramLong);
  
  public static void glVertexAttrib4f(int index, float x, float y, float z, float w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4f;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4f(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, long paramLong);
  
  public static void glVertexAttrib4d(int index, double x, double y, double z, double w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4d;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4d(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4d(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, long paramLong);
  
  public static void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttrib4Nub;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttrib4Nub(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttrib4Nub(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong);
  
  public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, 5130, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, 5126, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, unsigned ? 5121 : 5120, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, unsigned ? 5125 : 5124, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, unsigned ? 5123 : 5122, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer); }
  
  static native void nglVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglVertexAttribPointerBO(index, size, type, normalized, stride, buffer_buffer_offset, function_pointer);
  }
  
  static native void nglVertexAttribPointerBO(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer buffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribPointer(index, size, type, normalized, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glEnableVertexAttribArray(int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableVertexAttribArray;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableVertexAttribArray(index, function_pointer);
  }
  
  static native void nglEnableVertexAttribArray(int paramInt, long paramLong);
  
  public static void glDisableVertexAttribArray(int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableVertexAttribArray;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableVertexAttribArray(index, function_pointer);
  }
  
  static native void nglDisableVertexAttribArray(int paramInt, long paramLong);
  
  public static void glGetVertexAttrib(int index, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribfv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttrib(int index, int pname, DoubleBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribdv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribdv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribdv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttrib(int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribiv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static ByteBuffer glGetVertexAttribPointer(int index, int pname, long result_size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribPointerv;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetVertexAttribPointerv(index, pname, result_size, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetVertexAttribPointerv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribPointer(int index, int pname, ByteBuffer pointer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribPointerv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(pointer, PointerBuffer.getPointerSize());
    nglGetVertexAttribPointerv2(index, pname, MemoryUtil.getAddress(pointer), function_pointer);
  }
  
  static native void nglGetVertexAttribPointerv2(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindAttribLocation(int program, int index, ByteBuffer name) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindAttribLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    nglBindAttribLocation(program, index, MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglBindAttribLocation(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindAttribLocation(int program, int index, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindAttribLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindAttribLocation(program, index, APIUtil.getBufferNT(caps, name), function_pointer);
  }
  
  public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkBuffer(size, 1);
    BufferChecks.checkBuffer(type, 1);
    BufferChecks.checkDirect(name);
    nglGetActiveAttrib(program, index, name.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(size), MemoryUtil.getAddress(type), MemoryUtil.getAddress(name), function_pointer);
  }
  


  static native void nglGetActiveAttrib(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
  

  public static String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer sizeType)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(sizeType, 2);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, maxLength);
    nglGetActiveAttrib(program, index, maxLength, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress(sizeType), MemoryUtil.getAddress(sizeType, sizeType.position() + 1), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  




  public static String glGetActiveAttrib(int program, int index, int maxLength)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, maxLength);
    nglGetActiveAttrib(program, index, maxLength, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress0(APIUtil.getBufferInt(caps)), MemoryUtil.getAddress(APIUtil.getBufferInt(caps), 1), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  




  public static int glGetActiveAttribSize(int program, int index)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer size = APIUtil.getBufferInt(caps);
    nglGetActiveAttrib(program, index, 0, 0L, MemoryUtil.getAddress(size), MemoryUtil.getAddress(size, 1), APIUtil.getBufferByte0(caps), function_pointer);
    return size.get(0);
  }
  




  public static int glGetActiveAttribType(int program, int index)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetActiveAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer type = APIUtil.getBufferInt(caps);
    nglGetActiveAttrib(program, index, 0, 0L, MemoryUtil.getAddress(type, 1), MemoryUtil.getAddress(type), APIUtil.getBufferByte0(caps), function_pointer);
    return type.get(0);
  }
  
  public static int glGetAttribLocation(int program, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetAttribLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetAttribLocation(program, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetAttribLocation(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGetAttribLocation(int program, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetAttribLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetAttribLocation(program, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static void glDrawBuffers(IntBuffer buffers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(buffers);
    nglDrawBuffers(buffers.remaining(), MemoryUtil.getAddress(buffers), function_pointer);
  }
  
  static native void nglDrawBuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDrawBuffers(int buffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDrawBuffers(1, APIUtil.getInt(caps, buffer), function_pointer);
  }
  
  public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glStencilOpSeparate;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglStencilOpSeparate(face, sfail, dpfail, dppass, function_pointer);
  }
  
  static native void nglStencilOpSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glStencilFuncSeparate(int face, int func, int ref, int mask) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glStencilFuncSeparate;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglStencilFuncSeparate(face, func, ref, mask, function_pointer);
  }
  
  static native void nglStencilFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glStencilMaskSeparate(int face, int mask) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glStencilMaskSeparate;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglStencilMaskSeparate(face, mask, function_pointer);
  }
  
  static native void nglStencilMaskSeparate(int paramInt1, int paramInt2, long paramLong);
  
  public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlendEquationSeparate;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlendEquationSeparate(modeRGB, modeAlpha, function_pointer);
  }
  
  static native void nglBlendEquationSeparate(int paramInt1, int paramInt2, long paramLong);
}
