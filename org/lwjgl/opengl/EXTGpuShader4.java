package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;












public final class EXTGpuShader4
{
  public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 35069;
  public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
  public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
  public static final int GL_SAMPLER_BUFFER_EXT = 36290;
  public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
  public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;
  public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 36293;
  public static final int GL_UNSIGNED_INT_VEC2_EXT = 36294;
  public static final int GL_UNSIGNED_INT_VEC3_EXT = 36295;
  public static final int GL_UNSIGNED_INT_VEC4_EXT = 36296;
  public static final int GL_INT_SAMPLER_1D_EXT = 36297;
  public static final int GL_INT_SAMPLER_2D_EXT = 36298;
  public static final int GL_INT_SAMPLER_3D_EXT = 36299;
  public static final int GL_INT_SAMPLER_CUBE_EXT = 36300;
  public static final int GL_INT_SAMPLER_2D_RECT_EXT = 36301;
  public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 36302;
  public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 36303;
  public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
  public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 36305;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 36306;
  public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 36307;
  public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 36308;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 36309;
  public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 36310;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 36311;
  public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
  public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 35076;
  public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 35077;
  
  private EXTGpuShader4() {}
  
  public static void glVertexAttribI1iEXT(int index, int x)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI1iEXT(index, x, function_pointer);
  }
  
  static native void nglVertexAttribI1iEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexAttribI2iEXT(int index, int x, int y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI2iEXT(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttribI2iEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexAttribI3iEXT(int index, int x, int y, int z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI3iEXT(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttribI3iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glVertexAttribI4iEXT(int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4iEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI4iEXT(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttribI4iEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexAttribI1uiEXT(int index, int x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI1uiEXT(index, x, function_pointer);
  }
  
  static native void nglVertexAttribI1uiEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexAttribI2uiEXT(int index, int x, int y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI2uiEXT(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttribI2uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexAttribI3uiEXT(int index, int x, int y, int z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI3uiEXT(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttribI3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI4uiEXT(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttribI4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexAttribI1EXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 1);
    nglVertexAttribI1ivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI1ivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI2EXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 2);
    nglVertexAttribI2ivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI2ivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI3EXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 3);
    nglVertexAttribI3ivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI3ivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4EXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4ivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4ivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4ivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI1uEXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 1);
    nglVertexAttribI1uivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI1uivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI2uEXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 2);
    nglVertexAttribI2uivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI2uivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI3uEXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 3);
    nglVertexAttribI3uivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI3uivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4uEXT(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4uivEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4uivEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4EXT(int index, ByteBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4bvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4bvEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4bvEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4EXT(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4svEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4svEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4svEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4uEXT(int index, ByteBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4ubvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4ubvEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4ubvEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4uEXT(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4usvEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4usvEXT(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4usvEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ByteBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, IntBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ShortBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointerEXT(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer); }
  
  static native void nglVertexAttribIPointerEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, long buffer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointerEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglVertexAttribIPointerEXTBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
  }
  
  static native void nglVertexAttribIPointerEXTBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribIEXT(int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribIivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribIivEXT(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribIivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribIuEXT(int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribIuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribIuivEXT(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribIuivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform1uiEXT(int location, int v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform1uiEXT(location, v0, function_pointer);
  }
  
  static native void nglUniform1uiEXT(int paramInt1, int paramInt2, long paramLong);
  
  public static void glUniform2uiEXT(int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform2uiEXT(location, v0, v1, function_pointer);
  }
  
  static native void nglUniform2uiEXT(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glUniform3uiEXT(int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform3uiEXT(location, v0, v1, v2, function_pointer);
  }
  
  static native void nglUniform3uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4uiEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform4uiEXT(location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglUniform4uiEXT(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glUniform1uEXT(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform1uivEXT(location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform1uivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform2uEXT(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform2uivEXT(location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform2uivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform3uEXT(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform3uivEXT(location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform3uivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform4uEXT(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4uivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform4uivEXT(location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform4uivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetUniformuEXT(int program, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformuivEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetUniformuivEXT(program, location, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetUniformuivEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindFragDataLocationEXT(int program, int colorNumber, ByteBuffer name) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocationEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    nglBindFragDataLocationEXT(program, colorNumber, MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglBindFragDataLocationEXT(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindFragDataLocationEXT(int program, int colorNumber, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocationEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindFragDataLocationEXT(program, colorNumber, APIUtil.getBufferNT(caps, name), function_pointer);
  }
  
  public static int glGetFragDataLocationEXT(int program, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataLocationEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetFragDataLocationEXT(program, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetFragDataLocationEXT(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGetFragDataLocationEXT(int program, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataLocationEXT;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetFragDataLocationEXT(program, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
}
