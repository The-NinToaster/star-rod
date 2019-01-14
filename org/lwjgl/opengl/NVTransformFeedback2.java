package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;









public final class NVTransformFeedback2
{
  public static final int GL_TRANSFORM_FEEDBACK_NV = 36386;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 36387;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 36388;
  public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 36389;
  
  private NVTransformFeedback2() {}
  
  public static void glBindTransformFeedbackNV(int target, int id)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindTransformFeedbackNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindTransformFeedbackNV(target, id, function_pointer);
  }
  
  static native void nglBindTransformFeedbackNV(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDeleteTransformFeedbacksNV(IntBuffer ids) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteTransformFeedbacksNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglDeleteTransformFeedbacksNV(ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglDeleteTransformFeedbacksNV(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteTransformFeedbacksNV(int id) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteTransformFeedbacksNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteTransformFeedbacksNV(1, APIUtil.getInt(caps, id), function_pointer);
  }
  
  public static void glGenTransformFeedbacksNV(IntBuffer ids) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenTransformFeedbacksNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglGenTransformFeedbacksNV(ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglGenTransformFeedbacksNV(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenTransformFeedbacksNV() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenTransformFeedbacksNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer ids = APIUtil.getBufferInt(caps);
    nglGenTransformFeedbacksNV(1, MemoryUtil.getAddress(ids), function_pointer);
    return ids.get(0);
  }
  
  public static boolean glIsTransformFeedbackNV(int id) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsTransformFeedbackNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsTransformFeedbackNV(id, function_pointer);
    return __result;
  }
  
  static native boolean nglIsTransformFeedbackNV(int paramInt, long paramLong);
  
  public static void glPauseTransformFeedbackNV() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glPauseTransformFeedbackNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglPauseTransformFeedbackNV(function_pointer);
  }
  
  static native void nglPauseTransformFeedbackNV(long paramLong);
  
  public static void glResumeTransformFeedbackNV() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glResumeTransformFeedbackNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglResumeTransformFeedbackNV(function_pointer);
  }
  
  static native void nglResumeTransformFeedbackNV(long paramLong);
  
  public static void glDrawTransformFeedbackNV(int mode, int id) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDrawTransformFeedbackNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDrawTransformFeedbackNV(mode, id, function_pointer);
  }
  
  static native void nglDrawTransformFeedbackNV(int paramInt1, int paramInt2, long paramLong);
}
