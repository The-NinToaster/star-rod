package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;

public final class AMDMultiDrawIndirect
{
  private AMDMultiDrawIndirect() {}
  
  public static void glMultiDrawArraysIndirectAMD(int mode, ByteBuffer indirect, int primcount, int stride)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawArraysIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, (stride == 0 ? 16 : stride) * primcount);
    nglMultiDrawArraysIndirectAMD(mode, org.lwjgl.MemoryUtil.getAddress(indirect), primcount, stride, function_pointer); }
  
  static native void nglMultiDrawArraysIndirectAMD(int paramInt1, long paramLong1, int paramInt2, int paramInt3, long paramLong2);
  
  public static void glMultiDrawArraysIndirectAMD(int mode, long indirect_buffer_offset, int primcount, int stride) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawArraysIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOenabled(caps);
    nglMultiDrawArraysIndirectAMDBO(mode, indirect_buffer_offset, primcount, stride, function_pointer);
  }
  
  static native void nglMultiDrawArraysIndirectAMDBO(int paramInt1, long paramLong1, int paramInt2, int paramInt3, long paramLong2);
  
  public static void glMultiDrawArraysIndirectAMD(int mode, IntBuffer indirect, int primcount, int stride) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawArraysIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, (stride == 0 ? 4 : stride >> 2) * primcount);
    nglMultiDrawArraysIndirectAMD(mode, org.lwjgl.MemoryUtil.getAddress(indirect), primcount, stride, function_pointer);
  }
  
  public static void glMultiDrawElementsIndirectAMD(int mode, int type, ByteBuffer indirect, int primcount, int stride) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawElementsIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, (stride == 0 ? 20 : stride) * primcount);
    nglMultiDrawElementsIndirectAMD(mode, type, org.lwjgl.MemoryUtil.getAddress(indirect), primcount, stride, function_pointer); }
  
  static native void nglMultiDrawElementsIndirectAMD(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, long paramLong2);
  
  public static void glMultiDrawElementsIndirectAMD(int mode, int type, long indirect_buffer_offset, int primcount, int stride) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawElementsIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOenabled(caps);
    nglMultiDrawElementsIndirectAMDBO(mode, type, indirect_buffer_offset, primcount, stride, function_pointer);
  }
  
  static native void nglMultiDrawElementsIndirectAMDBO(int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, long paramLong2);
  
  public static void glMultiDrawElementsIndirectAMD(int mode, int type, IntBuffer indirect, int primcount, int stride) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMultiDrawElementsIndirectAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureIndirectBOdisabled(caps);
    BufferChecks.checkBuffer(indirect, (stride == 0 ? 5 : stride >> 2) * primcount);
    nglMultiDrawElementsIndirectAMD(mode, type, org.lwjgl.MemoryUtil.getAddress(indirect), primcount, stride, function_pointer);
  }
}
