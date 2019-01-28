package org.lwjgl.opencl;

import java.util.HashMap;
import java.util.Map;





































final class CallbackUtil
{
  private static final Map<CLContext, Long> contextUserData = new HashMap();
  



  private CallbackUtil() {}
  



  static long createGlobalRef(Object obj)
  {
    return obj == null ? 0L : ncreateGlobalRef(obj);
  }
  






  private static native long ncreateGlobalRef(Object paramObject);
  






  static native void deleteGlobalRef(long paramLong);
  





  static void checkCallback(int errcode, long user_data)
  {
    if ((errcode != 0) && (user_data != 0L)) {
      deleteGlobalRef(user_data);
    }
  }
  
  static native long getContextCallback();
  
  static native long getMemObjectDestructorCallback();
  
  static native long getProgramCallback();
  
  static native long getNativeKernelCallback();
  
  static native long getEventCallback();
  
  static native long getPrintfCallback();
  
  static native long getLogMessageToSystemLogAPPLE();
  
  static native long getLogMessageToStdoutAPPLE();
  
  static native long getLogMessageToStderrAPPLE();
}
