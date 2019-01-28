package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;
import org.lwjgl.PointerBuffer;



















































public final class GL45
{
  public static final int GL_NEGATIVE_ONE_TO_ONE = 37726;
  public static final int GL_ZERO_TO_ONE = 37727;
  public static final int GL_CLIP_ORIGIN = 37724;
  public static final int GL_CLIP_DEPTH_MODE = 37725;
  public static final int GL_QUERY_WAIT_INVERTED = 36375;
  public static final int GL_QUERY_NO_WAIT_INVERTED = 36376;
  public static final int GL_QUERY_BY_REGION_WAIT_INVERTED = 36377;
  public static final int GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 36378;
  public static final int GL_MAX_CULL_DISTANCES = 33529;
  public static final int GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 33530;
  public static final int GL_TEXTURE_TARGET = 4102;
  public static final int GL_QUERY_TARGET = 33514;
  public static final int GL_TEXTURE_BINDING = 33515;
  public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 33531;
  public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 33532;
  public static final int GL_GUILTY_CONTEXT_RESET = 33363;
  public static final int GL_INNOCENT_CONTEXT_RESET = 33364;
  public static final int GL_UNKNOWN_CONTEXT_RESET = 33365;
  public static final int GL_CONTEXT_ROBUST_ACCESS = 37107;
  public static final int GL_RESET_NOTIFICATION_STRATEGY = 33366;
  public static final int GL_LOSE_CONTEXT_ON_RESET = 33362;
  public static final int GL_NO_RESET_NOTIFICATION = 33377;
  public static final int GL_CONTEXT_LOST = 1287;
  
  private GL45() {}
  
  public static void glClipControl(int origin, int depth)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClipControl;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClipControl(origin, depth, function_pointer);
  }
  
  static native void nglClipControl(int paramInt1, int paramInt2, long paramLong);
  
  public static void glCreateTransformFeedbacks(IntBuffer ids) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglCreateTransformFeedbacks(ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglCreateTransformFeedbacks(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateTransformFeedbacks() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateTransformFeedbacks;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer ids = APIUtil.getBufferInt(caps);
    nglCreateTransformFeedbacks(1, MemoryUtil.getAddress(ids), function_pointer);
    return ids.get(0);
  }
  
  public static void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTransformFeedbackBufferBase;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTransformFeedbackBufferBase(xfb, index, buffer, function_pointer);
  }
  
  static native void nglTransformFeedbackBufferBase(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTransformFeedbackBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTransformFeedbackBufferRange(xfb, index, buffer, offset, size, function_pointer);
  }
  
  static native void nglTransformFeedbackBufferRange(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glGetTransformFeedback(int xfb, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbackiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetTransformFeedbackiv(xfb, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetTransformFeedbackiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTransformFeedbacki(int xfb, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbackiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetTransformFeedbackiv(xfb, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glGetTransformFeedback(int xfb, int pname, int index, IntBuffer param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbacki_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetTransformFeedbacki_v(xfb, pname, index, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetTransformFeedbacki_v(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetTransformFeedbacki(int xfb, int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbacki_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetTransformFeedbacki_v(xfb, pname, index, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glGetTransformFeedback(int xfb, int pname, int index, LongBuffer param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbacki64_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetTransformFeedbacki64_v(xfb, pname, index, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetTransformFeedbacki64_v(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static long glGetTransformFeedbacki64(int xfb, int pname, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbacki64_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    LongBuffer param = APIUtil.getBufferLong(caps);
    nglGetTransformFeedbacki64_v(xfb, pname, index, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glCreateBuffers(IntBuffer buffers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(buffers);
    nglCreateBuffers(buffers.remaining(), MemoryUtil.getAddress(buffers), function_pointer);
  }
  
  static native void nglCreateBuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateBuffers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer buffers = APIUtil.getBufferInt(caps);
    nglCreateBuffers(1, MemoryUtil.getAddress(buffers), function_pointer);
    return buffers.get(0);
  }
  
  public static void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining(), MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  public static void glNamedBufferStorage(int buffer, DoubleBuffer data, int flags) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining() << 3, MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  public static void glNamedBufferStorage(int buffer, FloatBuffer data, int flags) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  public static void glNamedBufferStorage(int buffer, IntBuffer data, int flags) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  public static void glNamedBufferStorage(int buffer, ShortBuffer data, int flags) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining() << 1, MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  public static void glNamedBufferStorage(int buffer, LongBuffer data, int flags) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferStorage(buffer, data.remaining() << 3, MemoryUtil.getAddress(data), flags, function_pointer);
  }
  
  static native void nglNamedBufferStorage(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3);
  
  public static void glNamedBufferStorage(int buffer, long size, int flags) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedBufferStorage(buffer, size, 0L, flags, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, long data_size, int usage) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedBufferData(buffer, data_size, 0L, usage, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, ByteBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferData(buffer, data.remaining(), MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, DoubleBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferData(buffer, data.remaining() << 3, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, FloatBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferData(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, IntBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferData(buffer, data.remaining() << 2, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  public static void glNamedBufferData(int buffer, ShortBuffer data, int usage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferData(buffer, data.remaining() << 1, MemoryUtil.getAddress(data), usage, function_pointer);
  }
  
  static native void nglNamedBufferData(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3);
  
  public static void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubData(buffer, offset, data.remaining(), MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubData(int buffer, long offset, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubData(buffer, offset, data.remaining() << 3, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubData(int buffer, long offset, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubData(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubData(int buffer, long offset, IntBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubData(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glNamedBufferSubData(int buffer, long offset, ShortBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglNamedBufferSubData(buffer, offset, data.remaining() << 1, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglNamedBufferSubData(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size, function_pointer);
  }
  
  static native void nglCopyNamedBufferSubData(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedBufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 1);
    nglClearNamedBufferData(buffer, internalformat, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglClearNamedBufferData(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 1);
    nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  





  static native void nglClearNamedBufferSubData(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, long paramLong3, long paramLong4);
  





  public static ByteBuffer glMapNamedBuffer(int buffer, int access, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBuffer(buffer, access, glGetNamedBufferParameteri(buffer, 34660), old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  










  public static ByteBuffer glMapNamedBuffer(int buffer, int access, long length, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBuffer(buffer, access, length, old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglMapNamedBuffer(int paramInt1, int paramInt2, long paramLong1, ByteBuffer paramByteBuffer, long paramLong2);
  
  public static ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, ByteBuffer old_buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapNamedBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapNamedBufferRange(buffer, offset, length, access, old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglMapNamedBufferRange(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
  
  public static boolean glUnmapNamedBuffer(int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUnmapNamedBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglUnmapNamedBuffer(buffer, function_pointer);
    return __result;
  }
  
  static native boolean nglUnmapNamedBuffer(int paramInt, long paramLong);
  
  public static void glFlushMappedNamedBufferRange(int buffer, long offset, long length) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFlushMappedNamedBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFlushMappedNamedBufferRange(buffer, offset, length, function_pointer);
  }
  
  static native void nglFlushMappedNamedBufferRange(int paramInt, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glGetNamedBufferParameter(int buffer, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetNamedBufferParameteriv(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedBufferParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetNamedBufferParameteri(int buffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedBufferParameteriv(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetNamedBufferParameter(int buffer, int pname, LongBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameteri64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedBufferParameteri64v(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedBufferParameteri64v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static long glGetNamedBufferParameteri64(int buffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferParameteri64v;
    BufferChecks.checkFunctionAddress(function_pointer);
    LongBuffer params = APIUtil.getBufferLong(caps);
    nglGetNamedBufferParameteri64v(buffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static ByteBuffer glGetNamedBufferPointer(int buffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferPointerv;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer __result = nglGetNamedBufferPointerv(buffer, pname, glGetNamedBufferParameteri(buffer, 34660), function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglGetNamedBufferPointerv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubData(buffer, offset, data.remaining(), MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubData(int buffer, long offset, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubData(buffer, offset, data.remaining() << 3, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubData(int buffer, long offset, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubData(int buffer, long offset, IntBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetNamedBufferSubData(int buffer, long offset, ShortBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedBufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    nglGetNamedBufferSubData(buffer, offset, data.remaining() << 1, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetNamedBufferSubData(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glCreateFramebuffers(IntBuffer framebuffers) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(framebuffers);
    nglCreateFramebuffers(framebuffers.remaining(), MemoryUtil.getAddress(framebuffers), function_pointer);
  }
  
  static native void nglCreateFramebuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateFramebuffers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer framebuffers = APIUtil.getBufferInt(caps);
    nglCreateFramebuffers(1, MemoryUtil.getAddress(framebuffers), function_pointer);
    return framebuffers.get(0);
  }
  
  public static void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferRenderbuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer, function_pointer);
  }
  
  static native void nglNamedFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glNamedFramebufferParameteri(int framebuffer, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferParameteri(framebuffer, pname, param, function_pointer);
  }
  
  static native void nglNamedFramebufferParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTexture;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTexture(framebuffer, attachment, texture, level, function_pointer);
  }
  
  static native void nglNamedFramebufferTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferTextureLayer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer, function_pointer);
  }
  
  static native void nglNamedFramebufferTextureLayer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glNamedFramebufferDrawBuffer(int framebuffer, int mode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferDrawBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferDrawBuffer(framebuffer, mode, function_pointer);
  }
  
  static native void nglNamedFramebufferDrawBuffer(int paramInt1, int paramInt2, long paramLong);
  
  public static void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferDrawBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(bufs);
    nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), MemoryUtil.getAddress(bufs), function_pointer);
  }
  
  static native void nglNamedFramebufferDrawBuffers(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glNamedFramebufferReadBuffer(int framebuffer, int mode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedFramebufferReadBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedFramebufferReadBuffer(framebuffer, mode, function_pointer);
  }
  
  static native void nglNamedFramebufferReadBuffer(int paramInt1, int paramInt2, long paramLong);
  
  public static void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glInvalidateNamedFramebufferData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(attachments);
    nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), MemoryUtil.getAddress(attachments), function_pointer);
  }
  
  static native void nglInvalidateNamedFramebufferData(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glInvalidateNamedFramebufferSubData;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(attachments);
    nglInvalidateNamedFramebufferSubData(framebuffer, attachments.remaining(), MemoryUtil.getAddress(attachments), x, y, width, height, function_pointer);
  }
  
  static native void nglInvalidateNamedFramebufferSubData(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong2);
  
  public static void glClearNamedFramebuffer(int framebuffer, int buffer, int drawbuffer, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedFramebufferiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 1);
    nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearNamedFramebufferiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glClearNamedFramebufferu(int framebuffer, int buffer, int drawbuffer, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedFramebufferuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearNamedFramebufferuiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glClearNamedFramebuffer(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedFramebufferfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 1);
    nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearNamedFramebufferfv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glClearNamedFramebufferfi(int framebuffer, int buffer, float depth, int stencil) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearNamedFramebufferfi;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClearNamedFramebufferfi(framebuffer, buffer, depth, stencil, function_pointer);
  }
  
  static native void nglClearNamedFramebufferfi(int paramInt1, int paramInt2, float paramFloat, int paramInt3, long paramLong);
  
  public static void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlitNamedFramebuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, function_pointer);
  }
  
  static native void nglBlitNamedFramebuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, long paramLong);
  
  public static int glCheckNamedFramebufferStatus(int framebuffer, int target) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCheckNamedFramebufferStatus;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCheckNamedFramebufferStatus(framebuffer, target, function_pointer);
    return __result;
  }
  
  static native int nglCheckNamedFramebufferStatus(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetNamedFramebufferParameter(int framebuffer, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedFramebufferParameteriv(framebuffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedFramebufferParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetNamedFramebufferParameter(int framebuffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedFramebufferParameteriv(framebuffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetNamedFramebufferAttachmentParameter(int framebuffer, int attachment, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferAttachmentParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedFramebufferAttachmentParameteriv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetNamedFramebufferAttachmentParameter(int framebuffer, int attachment, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedFramebufferAttachmentParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glCreateRenderbuffers(IntBuffer renderbuffers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(renderbuffers);
    nglCreateRenderbuffers(renderbuffers.remaining(), MemoryUtil.getAddress(renderbuffers), function_pointer);
  }
  
  static native void nglCreateRenderbuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateRenderbuffers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer renderbuffers = APIUtil.getBufferInt(caps);
    nglCreateRenderbuffers(1, MemoryUtil.getAddress(renderbuffers), function_pointer);
    return renderbuffers.get(0);
  }
  
  public static void glNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedRenderbufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedRenderbufferStorage(renderbuffer, internalformat, width, height, function_pointer);
  }
  
  static native void nglNamedRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glNamedRenderbufferStorageMultisample;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height, function_pointer);
  }
  
  static native void nglNamedRenderbufferStorageMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glGetNamedRenderbufferParameter(int renderbuffer, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedRenderbufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetNamedRenderbufferParameteriv(renderbuffer, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetNamedRenderbufferParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetNamedRenderbufferParameter(int renderbuffer, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetNamedRenderbufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetNamedRenderbufferParameteriv(renderbuffer, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glCreateTextures(int target, IntBuffer textures) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateTextures;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(textures);
    nglCreateTextures(target, textures.remaining(), MemoryUtil.getAddress(textures), function_pointer);
  }
  
  static native void nglCreateTextures(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glCreateTextures(int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateTextures;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer textures = APIUtil.getBufferInt(caps);
    nglCreateTextures(target, 1, MemoryUtil.getAddress(textures), function_pointer);
    return textures.get(0);
  }
  
  public static void glTextureBuffer(int texture, int internalformat, int buffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureBuffer(texture, internalformat, buffer, function_pointer);
  }
  
  static native void nglTextureBuffer(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureBufferRange(texture, internalformat, buffer, offset, size, function_pointer);
  }
  
  static native void nglTextureBufferRange(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glTextureStorage1D(int texture, int levels, int internalformat, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureStorage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureStorage1D(texture, levels, internalformat, width, function_pointer);
  }
  
  static native void nglTextureStorage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glTextureStorage2D(int texture, int levels, int internalformat, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureStorage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureStorage2D(texture, levels, internalformat, width, height, function_pointer);
  }
  
  static native void nglTextureStorage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureStorage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureStorage3D(texture, levels, internalformat, width, height, depth, function_pointer);
  }
  
  static native void nglTextureStorage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureStorage2DMultisample;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations, function_pointer);
  }
  
  static native void nglTextureStorage2DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, long paramLong);
  
  public static void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureStorage3DMultisample;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations, function_pointer);
  }
  
  static native void nglTextureStorage3DMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, long paramLong);
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1D(texture, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1D(texture, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1D(texture, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1D(texture, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, 1, 1));
    nglTextureSubImage1D(texture, level, xoffset, width, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage1DBO(texture, level, xoffset, width, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, 1));
    nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage2DBO(texture, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(pixels, GLChecks.calculateImageStorage(pixels, format, type, width, height, depth));
    nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglTextureSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglTextureSubImage3DBO(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglTextureSubImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage1DBO(texture, level, xoffset, width, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data.remaining(), MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int data_imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage2DBO(texture, level, xoffset, yoffset, width, height, format, data_imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(data);
    nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglCompressedTextureSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCompressedTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglCompressedTextureSubImage3DBO(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data_buffer_offset, function_pointer);
  }
  
  static native void nglCompressedTextureSubImage3DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong1, long paramLong2);
  
  public static void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage1D(texture, level, xoffset, x, y, width, function_pointer);
  }
  
  static native void nglCopyTextureSubImage1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyTextureSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long paramLong);
  
  public static void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyTextureSubImage3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyTextureSubImage3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong);
  
  public static void glTextureParameterf(int texture, int pname, float param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterf;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameterf(texture, pname, param, function_pointer);
  }
  
  static native void nglTextureParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
  
  public static void glTextureParameter(int texture, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTextureParameterfv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glTextureParameteri(int texture, int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureParameteri(texture, pname, param, function_pointer);
  }
  
  static native void nglTextureParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glTextureParameterI(int texture, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglTextureParameterIiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glTextureParameterIu(int texture, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglTextureParameterIuiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glTextureParameter(int texture, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTextureParameteriv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTextureParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGenerateTextureMipmap(int texture) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenerateTextureMipmap;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglGenerateTextureMipmap(texture, function_pointer);
  }
  
  static native void nglGenerateTextureMipmap(int paramInt, long paramLong);
  
  public static void glBindTextureUnit(int unit, int texture) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindTextureUnit;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindTextureUnit(unit, texture, function_pointer);
  }
  
  static native void nglBindTextureUnit(int paramInt1, int paramInt2, long paramLong);
  
  public static void glGetTextureImage(int texture, int level, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureImage(texture, level, format, type, pixels.remaining(), MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetTextureImage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetTextureImage(int texture, int level, int format, int type, int pixels_bufSize, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetTextureImageBO(texture, level, format, type, pixels_bufSize, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetTextureImageBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureImage(texture, level, pixels.remaining(), MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureImage(int texture, int level, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureImage(texture, level, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureImage(int texture, int level, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureImage(texture, level, pixels.remaining() << 1, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetCompressedTextureImage(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureImage(int texture, int level, int pixels_bufSize, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetCompressedTextureImageBO(texture, level, pixels_bufSize, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetCompressedTextureImageBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetTextureLevelParameter(int texture, int level, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureLevelParameterfv(texture, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureLevelParameterfv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static float glGetTextureLevelParameterf(int texture, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetTextureLevelParameterfv(texture, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureLevelParameter(int texture, int level, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureLevelParameteriv(texture, level, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureLevelParameteriv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetTextureLevelParameteri(int texture, int level, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureLevelParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureLevelParameteriv(texture, level, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameter(int texture, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureParameterfv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetTextureParameterf(int texture, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetTextureParameterfv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameterI(int texture, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureParameterIiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameterIi(int texture, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameterIiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameterIu(int texture, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureParameterIuiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameterIui(int texture, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameterIuiv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTextureParameter(int texture, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 1);
    nglGetTextureParameteriv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTextureParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTextureParameteri(int texture, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTextureParameteriv(texture, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glCreateVertexArrays(IntBuffer arrays) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(arrays);
    nglCreateVertexArrays(arrays.remaining(), MemoryUtil.getAddress(arrays), function_pointer);
  }
  
  static native void nglCreateVertexArrays(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateVertexArrays() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer arrays = APIUtil.getBufferInt(caps);
    nglCreateVertexArrays(1, MemoryUtil.getAddress(arrays), function_pointer);
    return arrays.get(0);
  }
  
  public static void glDisableVertexArrayAttrib(int vaobj, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisableVertexArrayAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisableVertexArrayAttrib(vaobj, index, function_pointer);
  }
  
  static native void nglDisableVertexArrayAttrib(int paramInt1, int paramInt2, long paramLong);
  
  public static void glEnableVertexArrayAttrib(int vaobj, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnableVertexArrayAttrib;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnableVertexArrayAttrib(vaobj, index, function_pointer);
  }
  
  static native void nglEnableVertexArrayAttrib(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexArrayElementBuffer(int vaobj, int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayElementBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayElementBuffer(vaobj, buffer, function_pointer);
  }
  
  static native void nglVertexArrayElementBuffer(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayVertexBuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride, function_pointer);
  }
  
  static native void nglVertexArrayVertexBuffer(int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2);
  
  public static void glVertexArrayVertexBuffers(int vaobj, int first, int count, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayVertexBuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (buffers != null)
      BufferChecks.checkBuffer(buffers, count);
    if (offsets != null)
      BufferChecks.checkBuffer(offsets, count);
    if (strides != null)
      BufferChecks.checkBuffer(strides, count);
    nglVertexArrayVertexBuffers(vaobj, first, count, MemoryUtil.getAddressSafe(buffers), MemoryUtil.getAddressSafe(offsets), MemoryUtil.getAddressSafe(strides), function_pointer);
  }
  
  static native void nglVertexArrayVertexBuffers(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayAttribFormat;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset, function_pointer);
  }
  
  static native void nglVertexArrayAttribFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, long paramLong);
  
  public static void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayAttribIFormat;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset, function_pointer);
  }
  
  static native void nglVertexArrayAttribIFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayAttribLFormat;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset, function_pointer);
  }
  
  static native void nglVertexArrayAttribLFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayAttribBinding;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayAttribBinding(vaobj, attribindex, bindingindex, function_pointer);
  }
  
  static native void nglVertexArrayAttribBinding(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexArrayBindingDivisor;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexArrayBindingDivisor(vaobj, bindingindex, divisor, function_pointer);
  }
  
  static native void nglVertexArrayBindingDivisor(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glGetVertexArray(int vaobj, int pname, IntBuffer param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetVertexArrayiv(vaobj, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetVertexArrayiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetVertexArray(int vaobj, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetVertexArrayiv(vaobj, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glGetVertexArrayIndexed(int vaobj, int index, int pname, IntBuffer param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIndexediv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetVertexArrayIndexediv(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetVertexArrayIndexediv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetVertexArrayIndexed(int vaobj, int index, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIndexediv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer param = APIUtil.getBufferInt(caps);
    nglGetVertexArrayIndexediv(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glGetVertexArrayIndexed64i(int vaobj, int index, int pname, LongBuffer param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIndexed64iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(param, 1);
    nglGetVertexArrayIndexed64iv(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
  }
  
  static native void nglGetVertexArrayIndexed64iv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexArrayIndexed64iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    LongBuffer param = APIUtil.getBufferLong(caps);
    nglGetVertexArrayIndexed64iv(vaobj, index, pname, MemoryUtil.getAddress(param), function_pointer);
    return param.get(0);
  }
  
  public static void glCreateSamplers(IntBuffer samplers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(samplers);
    nglCreateSamplers(samplers.remaining(), MemoryUtil.getAddress(samplers), function_pointer);
  }
  
  static native void nglCreateSamplers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateSamplers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateSamplers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer samplers = APIUtil.getBufferInt(caps);
    nglCreateSamplers(1, MemoryUtil.getAddress(samplers), function_pointer);
    return samplers.get(0);
  }
  
  public static void glCreateProgramPipelines(IntBuffer pipelines) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(pipelines);
    nglCreateProgramPipelines(pipelines.remaining(), MemoryUtil.getAddress(pipelines), function_pointer);
  }
  
  static native void nglCreateProgramPipelines(int paramInt, long paramLong1, long paramLong2);
  
  public static int glCreateProgramPipelines() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateProgramPipelines;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer pipelines = APIUtil.getBufferInt(caps);
    nglCreateProgramPipelines(1, MemoryUtil.getAddress(pipelines), function_pointer);
    return pipelines.get(0);
  }
  
  public static void glCreateQueries(int target, IntBuffer ids) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateQueries;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(ids);
    nglCreateQueries(target, ids.remaining(), MemoryUtil.getAddress(ids), function_pointer);
  }
  
  static native void nglCreateQueries(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glCreateQueries(int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCreateQueries;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer ids = APIUtil.getBufferInt(caps);
    nglCreateQueries(target, 1, MemoryUtil.getAddress(ids), function_pointer);
    return ids.get(0);
  }
  
  public static void glMemoryBarrierByRegion(int barriers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMemoryBarrierByRegion;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMemoryBarrierByRegion(barriers, function_pointer);
  }
  
  static native void nglMemoryBarrierByRegion(int paramInt, long paramLong);
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining(), MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetTextureSubImage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int pixels_bufSize, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetTextureSubImageBO(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_bufSize, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetTextureSubImageBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining(), MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglGetCompressedTextureSubImage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int pixels_bufSize, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCompressedTextureSubImage;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetCompressedTextureSubImageBO(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels_bufSize, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglGetCompressedTextureSubImageBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong1, long paramLong2);
  
  public static void glTextureBarrier() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTextureBarrier;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTextureBarrier(function_pointer);
  }
  
  static native void nglTextureBarrier(long paramLong);
  
  public static int glGetGraphicsResetStatus() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetGraphicsResetStatus;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetGraphicsResetStatus(function_pointer);
    return __result;
  }
  
  static native int nglGetGraphicsResetStatus(long paramLong);
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, DoubleBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 3, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, MemoryUtil.getAddress(pixels), function_pointer);
  }
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(pixels);
    nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, MemoryUtil.getAddress(pixels), function_pointer); }
  
  static native void nglReadnPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int pixels_bufSize, long pixels_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glReadnPixels;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglReadnPixelsBO(x, y, width, height, format, type, pixels_bufSize, pixels_buffer_offset, function_pointer);
  }
  
  static native void nglReadnPixelsBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2);
  
  public static void glGetnUniform(int program, int location, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetnUniformfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetnUniformfv(program, location, params.remaining(), MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetnUniformfv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetnUniform(int program, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetnUniformiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetnUniformiv(program, location, params.remaining(), MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetnUniformiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetnUniformu(int program, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetnUniformuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetnUniformuiv(program, location, params.remaining(), MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetnUniformuiv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
}
