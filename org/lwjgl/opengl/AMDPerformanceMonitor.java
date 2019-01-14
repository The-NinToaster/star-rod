package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;












public final class AMDPerformanceMonitor
{
  public static final int GL_COUNTER_TYPE_AMD = 35776;
  public static final int GL_COUNTER_RANGE_AMD = 35777;
  public static final int GL_UNSIGNED_INT64_AMD = 35778;
  public static final int GL_PERCENTAGE_AMD = 35779;
  public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 35780;
  public static final int GL_PERFMON_RESULT_SIZE_AMD = 35781;
  public static final int GL_PERFMON_RESULT_AMD = 35782;
  
  private AMDPerformanceMonitor() {}
  
  public static void glGetPerfMonitorGroupsAMD(IntBuffer numGroups, IntBuffer groups)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorGroupsAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (numGroups != null)
      BufferChecks.checkBuffer(numGroups, 1);
    BufferChecks.checkDirect(groups);
    nglGetPerfMonitorGroupsAMD(MemoryUtil.getAddressSafe(numGroups), groups.remaining(), MemoryUtil.getAddress(groups), function_pointer);
  }
  
  static native void nglGetPerfMonitorGroupsAMD(long paramLong1, int paramInt, long paramLong2, long paramLong3);
  
  public static void glGetPerfMonitorCountersAMD(int group, IntBuffer numCounters, IntBuffer maxActiveCounters, IntBuffer counters) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCountersAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(numCounters, 1);
    BufferChecks.checkBuffer(maxActiveCounters, 1);
    if (counters != null)
      BufferChecks.checkDirect(counters);
    nglGetPerfMonitorCountersAMD(group, MemoryUtil.getAddress(numCounters), MemoryUtil.getAddress(maxActiveCounters), counters == null ? 0 : counters.remaining(), MemoryUtil.getAddressSafe(counters), function_pointer);
  }
  
  static native void nglGetPerfMonitorCountersAMD(int paramInt1, long paramLong1, long paramLong2, int paramInt2, long paramLong3, long paramLong4);
  
  public static void glGetPerfMonitorGroupStringAMD(int group, IntBuffer length, ByteBuffer groupString) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorGroupStringAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    if (groupString != null)
      BufferChecks.checkDirect(groupString);
    nglGetPerfMonitorGroupStringAMD(group, groupString == null ? 0 : groupString.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddressSafe(groupString), function_pointer);
  }
  
  static native void nglGetPerfMonitorGroupStringAMD(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetPerfMonitorGroupStringAMD(int group, int bufSize) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorGroupStringAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer groupString_length = APIUtil.getLengths(caps);
    ByteBuffer groupString = APIUtil.getBufferByte(caps, bufSize);
    nglGetPerfMonitorGroupStringAMD(group, bufSize, MemoryUtil.getAddress0(groupString_length), MemoryUtil.getAddress(groupString), function_pointer);
    groupString.limit(groupString_length.get(0));
    return APIUtil.getString(caps, groupString);
  }
  
  public static void glGetPerfMonitorCounterStringAMD(int group, int counter, IntBuffer length, ByteBuffer counterString) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCounterStringAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    if (counterString != null)
      BufferChecks.checkDirect(counterString);
    nglGetPerfMonitorCounterStringAMD(group, counter, counterString == null ? 0 : counterString.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddressSafe(counterString), function_pointer);
  }
  
  static native void nglGetPerfMonitorCounterStringAMD(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
  
  public static String glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCounterStringAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer counterString_length = APIUtil.getLengths(caps);
    ByteBuffer counterString = APIUtil.getBufferByte(caps, bufSize);
    nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, MemoryUtil.getAddress0(counterString_length), MemoryUtil.getAddress(counterString), function_pointer);
    counterString.limit(counterString_length.get(0));
    return APIUtil.getString(caps, counterString);
  }
  
  public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, ByteBuffer data) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCounterInfoAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 16);
    nglGetPerfMonitorCounterInfoAMD(group, counter, pname, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetPerfMonitorCounterInfoAMD(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGenPerfMonitorsAMD(IntBuffer monitors) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenPerfMonitorsAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(monitors);
    nglGenPerfMonitorsAMD(monitors.remaining(), MemoryUtil.getAddress(monitors), function_pointer);
  }
  
  static native void nglGenPerfMonitorsAMD(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenPerfMonitorsAMD() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenPerfMonitorsAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer monitors = APIUtil.getBufferInt(caps);
    nglGenPerfMonitorsAMD(1, MemoryUtil.getAddress(monitors), function_pointer);
    return monitors.get(0);
  }
  
  public static void glDeletePerfMonitorsAMD(IntBuffer monitors) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeletePerfMonitorsAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(monitors);
    nglDeletePerfMonitorsAMD(monitors.remaining(), MemoryUtil.getAddress(monitors), function_pointer);
  }
  
  static native void nglDeletePerfMonitorsAMD(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeletePerfMonitorsAMD(int monitor) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeletePerfMonitorsAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeletePerfMonitorsAMD(1, APIUtil.getInt(caps, monitor), function_pointer);
  }
  
  public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, IntBuffer counterList) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSelectPerfMonitorCountersAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(counterList);
    nglSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.remaining(), MemoryUtil.getAddress(counterList), function_pointer);
  }
  
  static native void nglSelectPerfMonitorCountersAMD(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int counter) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSelectPerfMonitorCountersAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglSelectPerfMonitorCountersAMD(monitor, enable, group, 1, APIUtil.getInt(caps, counter), function_pointer);
  }
  
  public static void glBeginPerfMonitorAMD(int monitor) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBeginPerfMonitorAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBeginPerfMonitorAMD(monitor, function_pointer);
  }
  
  static native void nglBeginPerfMonitorAMD(int paramInt, long paramLong);
  
  public static void glEndPerfMonitorAMD(int monitor) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEndPerfMonitorAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEndPerfMonitorAMD(monitor, function_pointer);
  }
  
  static native void nglEndPerfMonitorAMD(int paramInt, long paramLong);
  
  public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, IntBuffer data, IntBuffer bytesWritten) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCounterDataAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(data);
    if (bytesWritten != null)
      BufferChecks.checkBuffer(bytesWritten, 1);
    nglGetPerfMonitorCounterDataAMD(monitor, pname, data.remaining(), MemoryUtil.getAddress(data), MemoryUtil.getAddressSafe(bytesWritten), function_pointer);
  }
  
  static native void nglGetPerfMonitorCounterDataAMD(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
  
  public static int glGetPerfMonitorCounterDataAMD(int monitor, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetPerfMonitorCounterDataAMD;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer data = APIUtil.getBufferInt(caps);
    nglGetPerfMonitorCounterDataAMD(monitor, pname, 4, MemoryUtil.getAddress(data), 0L, function_pointer);
    return data.get(0);
  }
}
