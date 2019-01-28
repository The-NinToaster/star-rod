package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.MemoryUtil;





public final class ARBImaging
{
  public static final int GL_BLEND_COLOR = 32773;
  public static final int GL_FUNC_ADD = 32774;
  public static final int GL_MIN = 32775;
  public static final int GL_MAX = 32776;
  public static final int GL_BLEND_EQUATION = 32777;
  public static final int GL_FUNC_SUBTRACT = 32778;
  public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
  public static final int GL_COLOR_MATRIX = 32945;
  public static final int GL_COLOR_MATRIX_STACK_DEPTH = 32946;
  public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 32947;
  public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 32948;
  public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 32949;
  public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 32950;
  public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 32951;
  public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 32952;
  public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 32953;
  public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 32954;
  public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 32955;
  public static final int GL_COLOR_TABLE = 32976;
  public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 32977;
  public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 32978;
  public static final int GL_PROXY_COLOR_TABLE = 32979;
  public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 32980;
  public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 32981;
  public static final int GL_COLOR_TABLE_SCALE = 32982;
  public static final int GL_COLOR_TABLE_BIAS = 32983;
  public static final int GL_COLOR_TABLE_FORMAT = 32984;
  public static final int GL_COLOR_TABLE_WIDTH = 32985;
  public static final int GL_COLOR_TABLE_RED_SIZE = 32986;
  public static final int GL_COLOR_TABLE_GREEN_SIZE = 32987;
  public static final int GL_COLOR_TABLE_BLUE_SIZE = 32988;
  public static final int GL_COLOR_TABLE_ALPHA_SIZE = 32989;
  public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 32990;
  public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 32991;
  public static final int GL_CONVOLUTION_1D = 32784;
  public static final int GL_CONVOLUTION_2D = 32785;
  public static final int GL_SEPARABLE_2D = 32786;
  public static final int GL_CONVOLUTION_BORDER_MODE = 32787;
  public static final int GL_CONVOLUTION_FILTER_SCALE = 32788;
  public static final int GL_CONVOLUTION_FILTER_BIAS = 32789;
  public static final int GL_REDUCE = 32790;
  public static final int GL_CONVOLUTION_FORMAT = 32791;
  public static final int GL_CONVOLUTION_WIDTH = 32792;
  public static final int GL_CONVOLUTION_HEIGHT = 32793;
  public static final int GL_MAX_CONVOLUTION_WIDTH = 32794;
  public static final int GL_MAX_CONVOLUTION_HEIGHT = 32795;
  public static final int GL_POST_CONVOLUTION_RED_SCALE = 32796;
  public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 32797;
  public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 32798;
  public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 32799;
  public static final int GL_POST_CONVOLUTION_RED_BIAS = 32800;
  public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 32801;
  public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 32802;
  public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 32803;
  public static final int GL_IGNORE_BORDER = 33104;
  public static final int GL_CONSTANT_BORDER = 33105;
  public static final int GL_REPLICATE_BORDER = 33107;
  public static final int GL_CONVOLUTION_BORDER_COLOR = 33108;
  public static final int GL_HISTOGRAM = 32804;
  public static final int GL_PROXY_HISTOGRAM = 32805;
  public static final int GL_HISTOGRAM_WIDTH = 32806;
  public static final int GL_HISTOGRAM_FORMAT = 32807;
  public static final int GL_HISTOGRAM_RED_SIZE = 32808;
  public static final int GL_HISTOGRAM_GREEN_SIZE = 32809;
  public static final int GL_HISTOGRAM_BLUE_SIZE = 32810;
  public static final int GL_HISTOGRAM_ALPHA_SIZE = 32811;
  public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 32812;
  public static final int GL_HISTOGRAM_SINK = 32813;
  public static final int GL_MINMAX = 32814;
  public static final int GL_MINMAX_FORMAT = 32815;
  public static final int GL_MINMAX_SINK = 32816;
  public static final int GL_TABLE_TOO_LARGE = 32817;
  
  private ARBImaging() {}
  
  public static void glColorTable(int target, int internalFormat, int width, int format, int type, ByteBuffer data)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorTable(target, internalFormat, width, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glColorTable(int target, int internalFormat, int width, int format, int type, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorTable(target, internalFormat, width, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glColorTable(int target, int internalFormat, int width, int format, int type, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorTable(target, internalFormat, width, format, type, MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglColorTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glColorTable(int target, int internalFormat, int width, int format, int type, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglColorTableBO(target, internalFormat, width, format, type, data_buffer_offset, function_pointer);
  }
  
  static native void nglColorTableBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glColorSubTable(int target, int start, int count, int format, int type, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorSubTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorSubTable(target, start, count, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glColorSubTable(int target, int start, int count, int format, int type, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorSubTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorSubTable(target, start, count, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glColorSubTable(int target, int start, int count, int format, int type, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorSubTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(data, 256);
    nglColorSubTable(target, start, count, format, type, MemoryUtil.getAddress(data), function_pointer); }
  
  static native void nglColorSubTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glColorSubTable(int target, int start, int count, int format, int type, long data_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorSubTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglColorSubTableBO(target, start, count, format, type, data_buffer_offset, function_pointer);
  }
  
  static native void nglColorSubTableBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glColorTableParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTableParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglColorTableParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglColorTableParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glColorTableParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorTableParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglColorTableParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglColorTableParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glCopyColorSubTable(int target, int start, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyColorSubTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyColorSubTable(target, start, x, y, width, function_pointer);
  }
  
  static native void nglCopyColorSubTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyColorTable(target, internalformat, x, y, width, function_pointer);
  }
  
  static native void nglCopyColorTable(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glGetColorTable(int target, int format, int type, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 256);
    nglGetColorTable(target, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetColorTable(int target, int format, int type, DoubleBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 256);
    nglGetColorTable(target, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  public static void glGetColorTable(int target, int format, int type, FloatBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetColorTable;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 256);
    nglGetColorTable(target, format, type, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetColorTable(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetColorTableParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetColorTableParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetColorTableParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetColorTableParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetColorTableParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetColorTableParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetColorTableParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetColorTableParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBlendEquation(int mode) { GL14.glBlendEquation(mode); }
  
  public static void glBlendColor(float red, float green, float blue, float alpha)
  {
    GL14.glBlendColor(red, green, blue, alpha);
  }
  
  public static void glHistogram(int target, int width, int internalformat, boolean sink) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglHistogram(target, width, internalformat, sink, function_pointer);
  }
  
  static native void nglHistogram(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, long paramLong);
  
  public static void glResetHistogram(int target) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glResetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglResetHistogram(target, function_pointer);
  }
  
  static native void nglResetHistogram(int paramInt, long paramLong);
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, ByteBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 256);
    nglGetHistogram(target, reset, format, type, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, DoubleBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 256);
    nglGetHistogram(target, reset, format, type, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 256);
    nglGetHistogram(target, reset, format, type, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 256);
    nglGetHistogram(target, reset, format, type, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, ShortBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 256);
    nglGetHistogram(target, reset, format, type, MemoryUtil.getAddress(values), function_pointer); }
  
  static native void nglGetHistogram(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetHistogram(int target, boolean reset, int format, int type, long values_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogram;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetHistogramBO(target, reset, format, type, values_buffer_offset, function_pointer);
  }
  
  static native void nglGetHistogramBO(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetHistogramParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogramParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 256);
    nglGetHistogramParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetHistogramParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetHistogramParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetHistogramParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 256);
    nglGetHistogramParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetHistogramParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glMinmax(int target, int internalformat, boolean sink) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglMinmax(target, internalformat, sink, function_pointer);
  }
  
  static native void nglMinmax(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong);
  
  public static void glResetMinmax(int target) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glResetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglResetMinmax(target, function_pointer);
  }
  
  static native void nglResetMinmax(int paramInt, long paramLong);
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, ByteBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 4);
    nglGetMinmax(target, reset, format, types, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, DoubleBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 4);
    nglGetMinmax(target, reset, format, types, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, FloatBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 4);
    nglGetMinmax(target, reset, format, types, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, IntBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 4);
    nglGetMinmax(target, reset, format, types, MemoryUtil.getAddress(values), function_pointer);
  }
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, ShortBuffer values) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkBuffer(values, 4);
    nglGetMinmax(target, reset, format, types, MemoryUtil.getAddress(values), function_pointer); }
  
  static native void nglGetMinmax(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMinmax(int target, boolean reset, int format, int types, long values_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmax;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetMinmaxBO(target, reset, format, types, values_buffer_offset, function_pointer);
  }
  
  static native void nglGetMinmaxBO(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetMinmaxParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmaxParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMinmaxParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMinmaxParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetMinmaxParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetMinmaxParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetMinmaxParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetMinmaxParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ByteBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
    nglConvolutionFilter1D(target, internalformat, width, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, DoubleBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
    nglConvolutionFilter1D(target, internalformat, width, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, FloatBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
    nglConvolutionFilter1D(target, internalformat, width, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, IntBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
    nglConvolutionFilter1D(target, internalformat, width, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ShortBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, 1, 1));
    nglConvolutionFilter1D(target, internalformat, width, format, type, MemoryUtil.getAddress(image), function_pointer); }
  
  static native void nglConvolutionFilter1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long image_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglConvolutionFilter1DBO(target, internalformat, width, format, type, image_buffer_offset, function_pointer);
  }
  
  static native void nglConvolutionFilter1DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
  
  public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
    nglConvolutionFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
    nglConvolutionFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkBuffer(image, GLChecks.calculateImageStorage(image, format, type, width, height, 1));
    nglConvolutionFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(image), function_pointer); }
  
  static native void nglConvolutionFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long image_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglConvolutionFilter2DBO(target, internalformat, width, height, format, type, image_buffer_offset, function_pointer);
  }
  
  static native void nglConvolutionFilter2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2);
  
  public static void glConvolutionParameterf(int target, int pname, float params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionParameterf;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglConvolutionParameterf(target, pname, params, function_pointer);
  }
  
  static native void nglConvolutionParameterf(int paramInt1, int paramInt2, float paramFloat, long paramLong);
  
  public static void glConvolutionParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglConvolutionParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglConvolutionParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glConvolutionParameteri(int target, int pname, int params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionParameteri;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglConvolutionParameteri(target, pname, params, function_pointer);
  }
  
  static native void nglConvolutionParameteri(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glConvolutionParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glConvolutionParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglConvolutionParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglConvolutionParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyConvolutionFilter1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyConvolutionFilter1D(target, internalformat, x, y, width, function_pointer);
  }
  
  static native void nglCopyConvolutionFilter1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCopyConvolutionFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCopyConvolutionFilter2D(target, internalformat, x, y, width, height, function_pointer);
  }
  
  static native void nglCopyConvolutionFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glGetConvolutionFilter(int target, int format, int type, ByteBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(image);
    nglGetConvolutionFilter(target, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glGetConvolutionFilter(int target, int format, int type, DoubleBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(image);
    nglGetConvolutionFilter(target, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glGetConvolutionFilter(int target, int format, int type, FloatBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(image);
    nglGetConvolutionFilter(target, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glGetConvolutionFilter(int target, int format, int type, IntBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(image);
    nglGetConvolutionFilter(target, format, type, MemoryUtil.getAddress(image), function_pointer);
  }
  
  public static void glGetConvolutionFilter(int target, int format, int type, ShortBuffer image) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(image);
    nglGetConvolutionFilter(target, format, type, MemoryUtil.getAddress(image), function_pointer); }
  
  static native void nglGetConvolutionFilter(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetConvolutionFilter(int target, int format, int type, long image_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetConvolutionFilterBO(target, format, type, image_buffer_offset, function_pointer);
  }
  
  static native void nglGetConvolutionFilterBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static void glGetConvolutionParameter(int target, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionParameterfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetConvolutionParameterfv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetConvolutionParameterfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetConvolutionParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetConvolutionParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetConvolutionParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetConvolutionParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ByteBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, DoubleBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, FloatBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, IntBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ShortBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, ByteBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, DoubleBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, FloatBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, IntBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, DoubleBuffer row, ShortBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, ByteBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, DoubleBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, FloatBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, IntBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, FloatBuffer row, ShortBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, ByteBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, DoubleBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, FloatBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, IntBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, IntBuffer row, ShortBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, ByteBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, DoubleBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, FloatBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, IntBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer);
  }
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ShortBuffer row, ShortBuffer column) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    nglSeparableFilter2D(target, internalformat, width, height, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), function_pointer); }
  
  static native void nglSeparableFilter2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row_buffer_offset, long column_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glSeparableFilter2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureUnpackPBOenabled(caps);
    nglSeparableFilter2DBO(target, internalformat, width, height, format, type, row_buffer_offset, column_buffer_offset, function_pointer);
  }
  
  static native void nglSeparableFilter2DBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, DoubleBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, IntBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ShortBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ByteBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, DoubleBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, IntBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, DoubleBuffer row, ShortBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ByteBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, DoubleBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, IntBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, FloatBuffer row, ShortBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ByteBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, DoubleBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, IntBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, IntBuffer row, ShortBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ByteBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, DoubleBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, IntBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, ByteBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, DoubleBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, IntBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer);
  }
  
  public static void glGetSeparableFilter(int target, int format, int type, ShortBuffer row, ShortBuffer column, ShortBuffer span) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOdisabled(caps);
    BufferChecks.checkDirect(row);
    BufferChecks.checkDirect(column);
    BufferChecks.checkDirect(span);
    nglGetSeparableFilter(target, format, type, MemoryUtil.getAddress(row), MemoryUtil.getAddress(column), MemoryUtil.getAddress(span), function_pointer); }
  
  static native void nglGetSeparableFilter(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public static void glGetSeparableFilter(int target, int format, int type, long row_buffer_offset, long column_buffer_offset, long span_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetSeparableFilter;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensurePackPBOenabled(caps);
    nglGetSeparableFilterBO(target, format, type, row_buffer_offset, column_buffer_offset, span_buffer_offset, function_pointer);
  }
  
  static native void nglGetSeparableFilterBO(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4);
}
