package org.lwjgl.opencl;

import java.nio.ByteBuffer;










































public final class APPLEContextLoggingUtil
{
  public static final CLContextCallback SYSTEM_LOG_CALLBACK;
  public static final CLContextCallback STD_OUT_CALLBACK;
  public static final CLContextCallback STD_ERR_CALLBACK;
  
  private APPLEContextLoggingUtil() {}
  
  static
  {
    if (CLCapabilities.CL_APPLE_ContextLoggingFunctions) {
      SYSTEM_LOG_CALLBACK = new CLContextCallback(CallbackUtil.getLogMessageToSystemLogAPPLE()) {
        protected void handleMessage(String errinfo, ByteBuffer private_info) { throw new UnsupportedOperationException();
        }
      };
      STD_OUT_CALLBACK = new CLContextCallback(CallbackUtil.getLogMessageToStdoutAPPLE()) {
        protected void handleMessage(String errinfo, ByteBuffer private_info) { throw new UnsupportedOperationException();
        }
      };
      STD_ERR_CALLBACK = new CLContextCallback(CallbackUtil.getLogMessageToStderrAPPLE()) {
        protected void handleMessage(String errinfo, ByteBuffer private_info) { throw new UnsupportedOperationException(); }
      };
    } else {
      SYSTEM_LOG_CALLBACK = null;
      STD_OUT_CALLBACK = null;
      STD_ERR_CALLBACK = null;
    }
  }
}
