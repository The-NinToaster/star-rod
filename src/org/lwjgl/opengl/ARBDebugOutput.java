package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;
































public final class ARBDebugOutput
{
  public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 33346;
  public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 37187;
  public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 37188;
  public static final int GL_DEBUG_LOGGED_MESSAGES_ARB = 37189;
  public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 33347;
  public static final int GL_DEBUG_CALLBACK_FUNCTION_ARB = 33348;
  public static final int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 33349;
  public static final int GL_DEBUG_SOURCE_API_ARB = 33350;
  public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 33351;
  public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 33352;
  public static final int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 33353;
  public static final int GL_DEBUG_SOURCE_APPLICATION_ARB = 33354;
  public static final int GL_DEBUG_SOURCE_OTHER_ARB = 33355;
  public static final int GL_DEBUG_TYPE_ERROR_ARB = 33356;
  public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 33357;
  public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 33358;
  public static final int GL_DEBUG_TYPE_PORTABILITY_ARB = 33359;
  public static final int GL_DEBUG_TYPE_PERFORMANCE_ARB = 33360;
  public static final int GL_DEBUG_TYPE_OTHER_ARB = 33361;
  public static final int GL_DEBUG_SEVERITY_HIGH_ARB = 37190;
  public static final int GL_DEBUG_SEVERITY_MEDIUM_ARB = 37191;
  public static final int GL_DEBUG_SEVERITY_LOW_ARB = 37192;
  
  private ARBDebugOutput() {}
  
  public static void glDebugMessageControlARB(int source, int type, int severity, IntBuffer ids, boolean enabled)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDebugMessageControlARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (ids != null)
      BufferChecks.checkDirect(ids);
    nglDebugMessageControlARB(source, type, severity, ids == null ? 0 : ids.remaining(), MemoryUtil.getAddressSafe(ids), enabled, function_pointer);
  }
  
  static native void nglDebugMessageControlARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, boolean paramBoolean, long paramLong2);
  
  public static void glDebugMessageInsertARB(int source, int type, int id, int severity, ByteBuffer buf) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDebugMessageInsertARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(buf);
    nglDebugMessageInsertARB(source, type, id, severity, buf.remaining(), MemoryUtil.getAddress(buf), function_pointer);
  }
  
  static native void nglDebugMessageInsertARB(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glDebugMessageInsertARB(int source, int type, int id, int severity, CharSequence buf) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDebugMessageInsertARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDebugMessageInsertARB(source, type, id, severity, buf.length(), APIUtil.getBuffer(caps, buf), function_pointer);
  }
  






  public static void glDebugMessageCallbackARB(ARBDebugOutputCallback callback)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDebugMessageCallbackARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    long userParam = callback == null ? 0L : CallbackUtil.createGlobalRef(callback.getHandler());
    CallbackUtil.registerContextCallbackARB(userParam);
    nglDebugMessageCallbackARB(callback == null ? 0L : callback.getPointer(), userParam, function_pointer);
  }
  
  static native void nglDebugMessageCallbackARB(long paramLong1, long paramLong2, long paramLong3);
  
  public static int glGetDebugMessageLogARB(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetDebugMessageLogARB;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (sources != null)
      BufferChecks.checkBuffer(sources, count);
    if (types != null)
      BufferChecks.checkBuffer(types, count);
    if (ids != null)
      BufferChecks.checkBuffer(ids, count);
    if (severities != null)
      BufferChecks.checkBuffer(severities, count);
    if (lengths != null)
      BufferChecks.checkBuffer(lengths, count);
    if (messageLog != null)
      BufferChecks.checkDirect(messageLog);
    int __result = nglGetDebugMessageLogARB(count, messageLog == null ? 0 : messageLog.remaining(), MemoryUtil.getAddressSafe(sources), MemoryUtil.getAddressSafe(types), MemoryUtil.getAddressSafe(ids), MemoryUtil.getAddressSafe(severities), MemoryUtil.getAddressSafe(lengths), MemoryUtil.getAddressSafe(messageLog), function_pointer);
    return __result;
  }
  
  static native int nglGetDebugMessageLogARB(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7);
}
