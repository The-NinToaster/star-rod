package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;







public final class ARBShadingLanguageInclude
{
  public static final int GL_SHADER_INCLUDE_ARB = 36270;
  public static final int GL_NAMED_STRING_LENGTH_ARB = 36329;
  public static final int GL_NAMED_STRING_TYPE_ARB = 36330;
  
  private ARBShadingLanguageInclude() {}
  
  public static void glNamedStringARB(int type, ByteBuffer name, ByteBuffer string)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkDirect(string);
    nglNamedStringARB(type, name.remaining(), MemoryUtil.getAddress(name), string.remaining(), MemoryUtil.getAddress(string), function_pointer);
  }
  
  static native void nglNamedStringARB(int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2, long paramLong3);
  
  public static void glNamedStringARB(int type, CharSequence name, CharSequence string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedStringARB(type, name.length(), APIUtil.getBuffer(caps, name), string.length(), APIUtil.getBuffer(caps, string, name.length()), function_pointer);
  }
  
  public static void glDeleteNamedStringARB(ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    nglDeleteNamedStringARB(name.remaining(), MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglDeleteNamedStringARB(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteNamedStringARB(CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteNamedStringARB(name.length(), APIUtil.getBuffer(caps, name), function_pointer);
  }
  
  public static void glCompileShaderIncludeARB(int shader, int count, ByteBuffer path) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompileShaderIncludeARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(path);
    BufferChecks.checkNullTerminated(path, count);
    nglCompileShaderIncludeARB(shader, count, MemoryUtil.getAddress(path), 0L, function_pointer);
  }
  
  static native void nglCompileShaderIncludeARB(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glCompileShaderIncludeARB(int shader, CharSequence[] path) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompileShaderIncludeARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkArray(path);
    nglCompileShaderIncludeARB2(shader, path.length, APIUtil.getBuffer(caps, path), APIUtil.getLengths(caps, path), function_pointer);
  }
  
  static native void nglCompileShaderIncludeARB2(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static boolean glIsNamedStringARB(ByteBuffer name) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    boolean __result = nglIsNamedStringARB(name.remaining(), MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native boolean nglIsNamedStringARB(int paramInt, long paramLong1, long paramLong2);
  
  public static boolean glIsNamedStringARB(CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsNamedStringARB(name.length(), APIUtil.getBuffer(caps, name), function_pointer);
    return __result;
  }
  
  public static void glGetNamedStringARB(ByteBuffer name, IntBuffer stringlen, ByteBuffer string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    if (stringlen != null)
      BufferChecks.checkBuffer(stringlen, 1);
    BufferChecks.checkDirect(string);
    nglGetNamedStringARB(name.remaining(), MemoryUtil.getAddress(name), string.remaining(), MemoryUtil.getAddressSafe(stringlen), MemoryUtil.getAddress(string), function_pointer);
  }
  
  static native void nglGetNamedStringARB(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glGetNamedStringARB(CharSequence name, IntBuffer stringlen, ByteBuffer string) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (stringlen != null)
      BufferChecks.checkBuffer(stringlen, 1);
    BufferChecks.checkDirect(string);
    nglGetNamedStringARB(name.length(), APIUtil.getBuffer(caps, name), string.remaining(), MemoryUtil.getAddressSafe(stringlen), MemoryUtil.getAddress(string), function_pointer);
  }
  
  public static String glGetNamedStringARB(CharSequence name, int bufSize)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer string_length = APIUtil.getLengths(caps);
    ByteBuffer string = APIUtil.getBufferByte(caps, bufSize + name.length());
    nglGetNamedStringARB(name.length(), APIUtil.getBuffer(caps, name), bufSize, MemoryUtil.getAddress0(string_length), MemoryUtil.getAddress(string), function_pointer);
    string.limit(name.length() + string_length.get(0));
    return APIUtil.getString(caps, string);
  }
  
  public static void glGetNamedStringARB(ByteBuffer name, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringivARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedStringivARB(name.remaining(), MemoryUtil.getAddress(name), pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedStringivARB(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3);
  
  public static void glGetNamedStringiARB(CharSequence name, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringivARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedStringivARB(name.length(), APIUtil.getBuffer(caps, name), pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  public static int glGetNamedStringiARB(CharSequence name, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedStringivARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedStringivARB(name.length(), APIUtil.getBuffer(caps, name), pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
}
