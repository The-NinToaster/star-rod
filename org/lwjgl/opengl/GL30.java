package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferChecks;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;



































































































































































































































































































































public final class GL30
{
  public static final int GL_MAJOR_VERSION = 33307;
  public static final int GL_MINOR_VERSION = 33308;
  public static final int GL_NUM_EXTENSIONS = 33309;
  public static final int GL_CONTEXT_FLAGS = 33310;
  public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 1;
  public static final int GL_DEPTH_BUFFER = 33315;
  public static final int GL_STENCIL_BUFFER = 33316;
  public static final int GL_COMPRESSED_RED = 33317;
  public static final int GL_COMPRESSED_RG = 33318;
  public static final int GL_COMPARE_REF_TO_TEXTURE = 34894;
  public static final int GL_CLIP_DISTANCE0 = 12288;
  public static final int GL_CLIP_DISTANCE1 = 12289;
  public static final int GL_CLIP_DISTANCE2 = 12290;
  public static final int GL_CLIP_DISTANCE3 = 12291;
  public static final int GL_CLIP_DISTANCE4 = 12292;
  public static final int GL_CLIP_DISTANCE5 = 12293;
  public static final int GL_CLIP_DISTANCE6 = 12294;
  public static final int GL_CLIP_DISTANCE7 = 12295;
  public static final int GL_MAX_CLIP_DISTANCES = 3378;
  public static final int GL_MAX_VARYING_COMPONENTS = 35659;
  public static final int GL_BUFFER_ACCESS_FLAGS = 37151;
  public static final int GL_BUFFER_MAP_LENGTH = 37152;
  public static final int GL_BUFFER_MAP_OFFSET = 37153;
  public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 35069;
  public static final int GL_SAMPLER_BUFFER = 36290;
  public static final int GL_SAMPLER_CUBE_SHADOW = 36293;
  public static final int GL_UNSIGNED_INT_VEC2 = 36294;
  public static final int GL_UNSIGNED_INT_VEC3 = 36295;
  public static final int GL_UNSIGNED_INT_VEC4 = 36296;
  public static final int GL_INT_SAMPLER_1D = 36297;
  public static final int GL_INT_SAMPLER_2D = 36298;
  public static final int GL_INT_SAMPLER_3D = 36299;
  public static final int GL_INT_SAMPLER_CUBE = 36300;
  public static final int GL_INT_SAMPLER_2D_RECT = 36301;
  public static final int GL_INT_SAMPLER_1D_ARRAY = 36302;
  public static final int GL_INT_SAMPLER_2D_ARRAY = 36303;
  public static final int GL_INT_SAMPLER_BUFFER = 36304;
  public static final int GL_UNSIGNED_INT_SAMPLER_1D = 36305;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D = 36306;
  public static final int GL_UNSIGNED_INT_SAMPLER_3D = 36307;
  public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 36308;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 36309;
  public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 36310;
  public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 36311;
  public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 36312;
  public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 35076;
  public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 35077;
  public static final int GL_QUERY_WAIT = 36371;
  public static final int GL_QUERY_NO_WAIT = 36372;
  public static final int GL_QUERY_BY_REGION_WAIT = 36373;
  public static final int GL_QUERY_BY_REGION_NO_WAIT = 36374;
  public static final int GL_MAP_READ_BIT = 1;
  public static final int GL_MAP_WRITE_BIT = 2;
  public static final int GL_MAP_INVALIDATE_RANGE_BIT = 4;
  public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 8;
  public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 16;
  public static final int GL_MAP_UNSYNCHRONIZED_BIT = 32;
  public static final int GL_CLAMP_VERTEX_COLOR = 35098;
  public static final int GL_CLAMP_FRAGMENT_COLOR = 35099;
  public static final int GL_CLAMP_READ_COLOR = 35100;
  public static final int GL_FIXED_ONLY = 35101;
  public static final int GL_DEPTH_COMPONENT32F = 36012;
  public static final int GL_DEPTH32F_STENCIL8 = 36013;
  public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 36269;
  public static final int GL_TEXTURE_RED_TYPE = 35856;
  public static final int GL_TEXTURE_GREEN_TYPE = 35857;
  public static final int GL_TEXTURE_BLUE_TYPE = 35858;
  public static final int GL_TEXTURE_ALPHA_TYPE = 35859;
  public static final int GL_TEXTURE_LUMINANCE_TYPE = 35860;
  public static final int GL_TEXTURE_INTENSITY_TYPE = 35861;
  public static final int GL_TEXTURE_DEPTH_TYPE = 35862;
  public static final int GL_UNSIGNED_NORMALIZED = 35863;
  public static final int GL_RGBA32F = 34836;
  public static final int GL_RGB32F = 34837;
  public static final int GL_ALPHA32F = 34838;
  public static final int GL_RGBA16F = 34842;
  public static final int GL_RGB16F = 34843;
  public static final int GL_ALPHA16F = 34844;
  public static final int GL_R11F_G11F_B10F = 35898;
  public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 35899;
  public static final int GL_RGB9_E5 = 35901;
  public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 35902;
  public static final int GL_TEXTURE_SHARED_SIZE = 35903;
  public static final int GL_FRAMEBUFFER = 36160;
  public static final int GL_READ_FRAMEBUFFER = 36008;
  public static final int GL_DRAW_FRAMEBUFFER = 36009;
  public static final int GL_RENDERBUFFER = 36161;
  public static final int GL_STENCIL_INDEX1 = 36166;
  public static final int GL_STENCIL_INDEX4 = 36167;
  public static final int GL_STENCIL_INDEX8 = 36168;
  public static final int GL_STENCIL_INDEX16 = 36169;
  public static final int GL_RENDERBUFFER_WIDTH = 36162;
  public static final int GL_RENDERBUFFER_HEIGHT = 36163;
  public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
  public static final int GL_RENDERBUFFER_RED_SIZE = 36176;
  public static final int GL_RENDERBUFFER_GREEN_SIZE = 36177;
  public static final int GL_RENDERBUFFER_BLUE_SIZE = 36178;
  public static final int GL_RENDERBUFFER_ALPHA_SIZE = 36179;
  public static final int GL_RENDERBUFFER_DEPTH_SIZE = 36180;
  public static final int GL_RENDERBUFFER_STENCIL_SIZE = 36181;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303;
  public static final int GL_FRAMEBUFFER_DEFAULT = 33304;
  public static final int GL_INDEX = 33314;
  public static final int GL_COLOR_ATTACHMENT0 = 36064;
  public static final int GL_COLOR_ATTACHMENT1 = 36065;
  public static final int GL_COLOR_ATTACHMENT2 = 36066;
  public static final int GL_COLOR_ATTACHMENT3 = 36067;
  public static final int GL_COLOR_ATTACHMENT4 = 36068;
  public static final int GL_COLOR_ATTACHMENT5 = 36069;
  public static final int GL_COLOR_ATTACHMENT6 = 36070;
  public static final int GL_COLOR_ATTACHMENT7 = 36071;
  public static final int GL_COLOR_ATTACHMENT8 = 36072;
  public static final int GL_COLOR_ATTACHMENT9 = 36073;
  public static final int GL_COLOR_ATTACHMENT10 = 36074;
  public static final int GL_COLOR_ATTACHMENT11 = 36075;
  public static final int GL_COLOR_ATTACHMENT12 = 36076;
  public static final int GL_COLOR_ATTACHMENT13 = 36077;
  public static final int GL_COLOR_ATTACHMENT14 = 36078;
  public static final int GL_COLOR_ATTACHMENT15 = 36079;
  public static final int GL_DEPTH_ATTACHMENT = 36096;
  public static final int GL_STENCIL_ATTACHMENT = 36128;
  public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
  public static final int GL_FRAMEBUFFER_COMPLETE = 36053;
  public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
  public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
  public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
  public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
  public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
  public static final int GL_FRAMEBUFFER_UNDEFINED = 33305;
  public static final int GL_FRAMEBUFFER_BINDING = 36006;
  public static final int GL_RENDERBUFFER_BINDING = 36007;
  public static final int GL_MAX_COLOR_ATTACHMENTS = 36063;
  public static final int GL_MAX_RENDERBUFFER_SIZE = 34024;
  public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
  public static final int GL_HALF_FLOAT = 5131;
  public static final int GL_RENDERBUFFER_SAMPLES = 36011;
  public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;
  public static final int GL_MAX_SAMPLES = 36183;
  public static final int GL_DRAW_FRAMEBUFFER_BINDING = 36006;
  public static final int GL_READ_FRAMEBUFFER_BINDING = 36010;
  public static final int GL_RGBA_INTEGER_MODE = 36254;
  public static final int GL_RGBA32UI = 36208;
  public static final int GL_RGB32UI = 36209;
  public static final int GL_ALPHA32UI = 36210;
  public static final int GL_RGBA16UI = 36214;
  public static final int GL_RGB16UI = 36215;
  public static final int GL_ALPHA16UI = 36216;
  public static final int GL_RGBA8UI = 36220;
  public static final int GL_RGB8UI = 36221;
  public static final int GL_ALPHA8UI = 36222;
  public static final int GL_RGBA32I = 36226;
  public static final int GL_RGB32I = 36227;
  public static final int GL_ALPHA32I = 36228;
  public static final int GL_RGBA16I = 36232;
  public static final int GL_RGB16I = 36233;
  public static final int GL_ALPHA16I = 36234;
  public static final int GL_RGBA8I = 36238;
  public static final int GL_RGB8I = 36239;
  public static final int GL_ALPHA8I = 36240;
  public static final int GL_RED_INTEGER = 36244;
  public static final int GL_GREEN_INTEGER = 36245;
  public static final int GL_BLUE_INTEGER = 36246;
  public static final int GL_ALPHA_INTEGER = 36247;
  public static final int GL_RGB_INTEGER = 36248;
  public static final int GL_RGBA_INTEGER = 36249;
  public static final int GL_BGR_INTEGER = 36250;
  public static final int GL_BGRA_INTEGER = 36251;
  public static final int GL_TEXTURE_1D_ARRAY = 35864;
  public static final int GL_TEXTURE_2D_ARRAY = 35866;
  public static final int GL_PROXY_TEXTURE_2D_ARRAY = 35867;
  public static final int GL_PROXY_TEXTURE_1D_ARRAY = 35865;
  public static final int GL_TEXTURE_BINDING_1D_ARRAY = 35868;
  public static final int GL_TEXTURE_BINDING_2D_ARRAY = 35869;
  public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 35071;
  public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE = 34894;
  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
  public static final int GL_SAMPLER_1D_ARRAY = 36288;
  public static final int GL_SAMPLER_2D_ARRAY = 36289;
  public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 36291;
  public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 36292;
  public static final int GL_DEPTH_STENCIL = 34041;
  public static final int GL_UNSIGNED_INT_24_8 = 34042;
  public static final int GL_DEPTH24_STENCIL8 = 35056;
  public static final int GL_TEXTURE_STENCIL_SIZE = 35057;
  public static final int GL_COMPRESSED_RED_RGTC1 = 36283;
  public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 36284;
  public static final int GL_COMPRESSED_RG_RGTC2 = 36285;
  public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 36286;
  public static final int GL_R8 = 33321;
  public static final int GL_R16 = 33322;
  public static final int GL_RG8 = 33323;
  public static final int GL_RG16 = 33324;
  public static final int GL_R16F = 33325;
  public static final int GL_R32F = 33326;
  public static final int GL_RG16F = 33327;
  public static final int GL_RG32F = 33328;
  public static final int GL_R8I = 33329;
  public static final int GL_R8UI = 33330;
  public static final int GL_R16I = 33331;
  public static final int GL_R16UI = 33332;
  public static final int GL_R32I = 33333;
  public static final int GL_R32UI = 33334;
  public static final int GL_RG8I = 33335;
  public static final int GL_RG8UI = 33336;
  public static final int GL_RG16I = 33337;
  public static final int GL_RG16UI = 33338;
  public static final int GL_RG32I = 33339;
  public static final int GL_RG32UI = 33340;
  public static final int GL_RG = 33319;
  public static final int GL_RG_INTEGER = 33320;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 35982;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 35972;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 35973;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 35983;
  public static final int GL_INTERLEAVED_ATTRIBS = 35980;
  public static final int GL_SEPARATE_ATTRIBS = 35981;
  public static final int GL_PRIMITIVES_GENERATED = 35975;
  public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 35976;
  public static final int GL_RASTERIZER_DISCARD = 35977;
  public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 35978;
  public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 35979;
  public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 35968;
  public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 35971;
  public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 35967;
  public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 35958;
  public static final int GL_VERTEX_ARRAY_BINDING = 34229;
  public static final int GL_FRAMEBUFFER_SRGB = 36281;
  public static final int GL_FRAMEBUFFER_SRGB_CAPABLE = 36282;
  
  private GL30() {}
  
  public static String glGetStringi(int name, int index)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetStringi;
    BufferChecks.checkFunctionAddress(function_pointer);
    String __result = nglGetStringi(name, index, function_pointer);
    return __result;
  }
  
  static native String nglGetStringi(int paramInt1, int paramInt2, long paramLong);
  
  public static void glClearBuffer(int buffer, int drawbuffer, FloatBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearBufferfv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglClearBufferfv(buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearBufferfv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glClearBuffer(int buffer, int drawbuffer, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearBufferiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglClearBufferiv(buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearBufferiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glClearBufferu(int buffer, int drawbuffer, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearBufferuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(value, 4);
    nglClearBufferuiv(buffer, drawbuffer, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglClearBufferuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClearBufferfi;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClearBufferfi(buffer, drawbuffer, depth, stencil, function_pointer);
  }
  
  static native void nglClearBufferfi(int paramInt1, int paramInt2, float paramFloat, int paramInt3, long paramLong);
  
  public static void glVertexAttribI1i(int index, int x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI1i(index, x, function_pointer);
  }
  
  static native void nglVertexAttribI1i(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexAttribI2i(int index, int x, int y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI2i(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttribI2i(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexAttribI3i(int index, int x, int y, int z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI3i(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttribI3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glVertexAttribI4i(int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4i;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI4i(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttribI4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexAttribI1ui(int index, int x) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI1ui(index, x, function_pointer);
  }
  
  static native void nglVertexAttribI1ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glVertexAttribI2ui(int index, int x, int y) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI2ui(index, x, y, function_pointer);
  }
  
  static native void nglVertexAttribI2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glVertexAttribI3ui(int index, int x, int y, int z) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI3ui(index, x, y, z, function_pointer);
  }
  
  static native void nglVertexAttribI3ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glVertexAttribI4ui(int index, int x, int y, int z, int w) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglVertexAttribI4ui(index, x, y, z, w, function_pointer);
  }
  
  static native void nglVertexAttribI4ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glVertexAttribI1(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 1);
    nglVertexAttribI1iv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI1iv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI2(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 2);
    nglVertexAttribI2iv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI2iv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI3(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 3);
    nglVertexAttribI3iv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI3iv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4iv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4iv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4iv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI1u(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 1);
    nglVertexAttribI1uiv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI1uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI2u(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 2);
    nglVertexAttribI2uiv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI2uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI3u(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 3);
    nglVertexAttribI3uiv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI3uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4u(int index, IntBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4uiv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4uiv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4(int index, ByteBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4bv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4bv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4bv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4sv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4sv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4sv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4u(int index, ByteBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4ubv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4ubv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4ubv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribI4u(int index, ShortBuffer v) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribI4usv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(v, 4);
    nglVertexAttribI4usv(index, MemoryUtil.getAddress(v), function_pointer);
  }
  
  static native void nglVertexAttribI4usv(int paramInt, long paramLong1, long paramLong2);
  
  public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointer(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointer(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer);
  }
  
  public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOdisabled(caps);
    BufferChecks.checkDirect(buffer);
    if (LWJGLUtil.CHECKS) getReferencesglVertexAttribPointer_buffer[index] = buffer;
    nglVertexAttribIPointer(index, size, type, stride, MemoryUtil.getAddress(buffer), function_pointer); }
  
  static native void nglVertexAttribIPointer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glVertexAttribIPointer(int index, int size, int type, int stride, long buffer_buffer_offset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glVertexAttribIPointer;
    BufferChecks.checkFunctionAddress(function_pointer);
    GLChecks.ensureArrayVBOenabled(caps);
    nglVertexAttribIPointerBO(index, size, type, stride, buffer_buffer_offset, function_pointer);
  }
  
  static native void nglVertexAttribIPointerBO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribI(int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribIiv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetVertexAttribIu(int index, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetVertexAttribIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetVertexAttribIuiv(index, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetVertexAttribIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform1ui(int location, int v0) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform1ui(location, v0, function_pointer);
  }
  
  static native void nglUniform1ui(int paramInt1, int paramInt2, long paramLong);
  
  public static void glUniform2ui(int location, int v0, int v1) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform2ui(location, v0, v1, function_pointer);
  }
  
  static native void nglUniform2ui(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glUniform3ui(int location, int v0, int v1, int v2) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform3ui(location, v0, v1, v2, function_pointer);
  }
  
  static native void nglUniform3ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4ui;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglUniform4ui(location, v0, v1, v2, v3, function_pointer);
  }
  
  static native void nglUniform4ui(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glUniform1u(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform1uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform1uiv(location, value.remaining(), MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform1uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform2u(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform2uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform2uiv(location, value.remaining() >> 1, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform2uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform3u(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform3uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform3uiv(location, value.remaining() / 3, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform3uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glUniform4u(int location, IntBuffer value) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glUniform4uiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(value);
    nglUniform4uiv(location, value.remaining() >> 2, MemoryUtil.getAddress(value), function_pointer);
  }
  
  static native void nglUniform4uiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glGetUniformu(int program, int location, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetUniformuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(params);
    nglGetUniformuiv(program, location, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetUniformuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    nglBindFragDataLocation(program, colorNumber, MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglBindFragDataLocation(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFragDataLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindFragDataLocation(program, colorNumber, APIUtil.getBufferNT(caps, name), function_pointer);
  }
  
  public static int glGetFragDataLocation(int program, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(name);
    BufferChecks.checkNullTerminated(name);
    int __result = nglGetFragDataLocation(program, MemoryUtil.getAddress(name), function_pointer);
    return __result;
  }
  
  static native int nglGetFragDataLocation(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGetFragDataLocation(int program, CharSequence name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFragDataLocation;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglGetFragDataLocation(program, APIUtil.getBufferNT(caps, name), function_pointer);
    return __result;
  }
  
  public static void glBeginConditionalRender(int id, int mode) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBeginConditionalRender;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBeginConditionalRender(id, mode, function_pointer);
  }
  
  static native void nglBeginConditionalRender(int paramInt1, int paramInt2, long paramLong);
  
  public static void glEndConditionalRender() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEndConditionalRender;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEndConditionalRender(function_pointer);
  }
  






  static native void nglEndConditionalRender(long paramLong);
  






  public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glMapBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (old_buffer != null)
      BufferChecks.checkDirect(old_buffer);
    ByteBuffer __result = nglMapBufferRange(target, offset, length, access, old_buffer, function_pointer);
    return (LWJGLUtil.CHECKS) && (__result == null) ? null : __result.order(ByteOrder.nativeOrder());
  }
  
  static native ByteBuffer nglMapBufferRange(int paramInt1, long paramLong1, long paramLong2, int paramInt2, ByteBuffer paramByteBuffer, long paramLong3);
  
  public static void glFlushMappedBufferRange(int target, long offset, long length) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFlushMappedBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFlushMappedBufferRange(target, offset, length, function_pointer);
  }
  
  static native void nglFlushMappedBufferRange(int paramInt, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glClampColor(int target, int clamp) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glClampColor;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglClampColor(target, clamp, function_pointer);
  }
  
  static native void nglClampColor(int paramInt1, int paramInt2, long paramLong);
  
  public static boolean glIsRenderbuffer(int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsRenderbuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsRenderbuffer(renderbuffer, function_pointer);
    return __result;
  }
  
  static native boolean nglIsRenderbuffer(int paramInt, long paramLong);
  
  public static void glBindRenderbuffer(int target, int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindRenderbuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindRenderbuffer(target, renderbuffer, function_pointer);
  }
  
  static native void nglBindRenderbuffer(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDeleteRenderbuffers(IntBuffer renderbuffers) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(renderbuffers);
    nglDeleteRenderbuffers(renderbuffers.remaining(), MemoryUtil.getAddress(renderbuffers), function_pointer);
  }
  
  static native void nglDeleteRenderbuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteRenderbuffers(int renderbuffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteRenderbuffers(1, APIUtil.getInt(caps, renderbuffer), function_pointer);
  }
  
  public static void glGenRenderbuffers(IntBuffer renderbuffers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(renderbuffers);
    nglGenRenderbuffers(renderbuffers.remaining(), MemoryUtil.getAddress(renderbuffers), function_pointer);
  }
  
  static native void nglGenRenderbuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenRenderbuffers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenRenderbuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer renderbuffers = APIUtil.getBufferInt(caps);
    nglGenRenderbuffers(1, MemoryUtil.getAddress(renderbuffers), function_pointer);
    return renderbuffers.get(0);
  }
  
  public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glRenderbufferStorage;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglRenderbufferStorage(target, internalformat, width, height, function_pointer);
  }
  
  static native void nglRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glGetRenderbufferParameter(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetRenderbufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetRenderbufferParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetRenderbufferParameteriv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetRenderbufferParameter(int target, int pname)
  {
    return glGetRenderbufferParameteri(target, pname);
  }
  
  public static int glGetRenderbufferParameteri(int target, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetRenderbufferParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetRenderbufferParameteriv(target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static boolean glIsFramebuffer(int framebuffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsFramebuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsFramebuffer(framebuffer, function_pointer);
    return __result;
  }
  
  static native boolean nglIsFramebuffer(int paramInt, long paramLong);
  
  public static void glBindFramebuffer(int target, int framebuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindFramebuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindFramebuffer(target, framebuffer, function_pointer);
  }
  
  static native void nglBindFramebuffer(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDeleteFramebuffers(IntBuffer framebuffers) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(framebuffers);
    nglDeleteFramebuffers(framebuffers.remaining(), MemoryUtil.getAddress(framebuffers), function_pointer);
  }
  
  static native void nglDeleteFramebuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteFramebuffers(int framebuffer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDeleteFramebuffers(1, APIUtil.getInt(caps, framebuffer), function_pointer);
  }
  
  public static void glGenFramebuffers(IntBuffer framebuffers) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(framebuffers);
    nglGenFramebuffers(framebuffers.remaining(), MemoryUtil.getAddress(framebuffers), function_pointer);
  }
  
  static native void nglGenFramebuffers(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenFramebuffers() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenFramebuffers;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer framebuffers = APIUtil.getBufferInt(caps);
    nglGenFramebuffers(1, MemoryUtil.getAddress(framebuffers), function_pointer);
    return framebuffers.get(0);
  }
  
  public static int glCheckFramebufferStatus(int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCheckFramebufferStatus;
    BufferChecks.checkFunctionAddress(function_pointer);
    int __result = nglCheckFramebufferStatus(target, function_pointer);
    return __result;
  }
  
  static native int nglCheckFramebufferStatus(int paramInt, long paramLong);
  
  public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferTexture1D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferTexture1D(target, attachment, textarget, texture, level, function_pointer);
  }
  
  static native void nglFramebufferTexture1D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferTexture2D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferTexture2D(target, attachment, textarget, texture, level, function_pointer);
  }
  
  static native void nglFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferTexture3D;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferTexture3D(target, attachment, textarget, texture, level, zoffset, function_pointer);
  }
  
  static native void nglFramebufferTexture3D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferRenderbuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer, function_pointer);
  }
  
  static native void nglFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glGetFramebufferAttachmentParameter(int target, int attachment, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFramebufferAttachmentParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetFramebufferAttachmentParameteriv(target, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  


  static native void nglGetFramebufferAttachmentParameteriv(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  

  @Deprecated
  public static int glGetFramebufferAttachmentParameter(int target, int attachment, int pname)
  {
    return glGetFramebufferAttachmentParameteri(target, attachment, pname);
  }
  
  public static int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFramebufferAttachmentParameteriv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetFramebufferAttachmentParameteriv(target, attachment, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGenerateMipmap(int target) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenerateMipmap;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglGenerateMipmap(target, function_pointer);
  }
  

  static native void nglGenerateMipmap(int paramInt, long paramLong);
  

  public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glRenderbufferStorageMultisample;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglRenderbufferStorageMultisample(target, samples, internalformat, width, height, function_pointer);
  }
  








  static native void nglRenderbufferStorageMultisample(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  







  public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBlitFramebuffer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, function_pointer);
  }
  
  static native void nglBlitFramebuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong);
  
  public static void glTexParameterI(int target, int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTexParameterIiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTexParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glTexParameterIi(int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexParameterIiv(target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glTexParameterIu(int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglTexParameterIuiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglTexParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static void glTexParameterIui(int target, int pname, int param) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTexParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglTexParameterIuiv(target, pname, APIUtil.getInt(caps, param), function_pointer);
  }
  
  public static void glGetTexParameterI(int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTexParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTexParameterIiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTexParameterIiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTexParameterIi(int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTexParameterIiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTexParameterIiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetTexParameterIu(int target, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTexParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetTexParameterIuiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetTexParameterIuiv(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetTexParameterIui(int target, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTexParameterIuiv;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetTexParameterIuiv(target, pname, MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFramebufferTextureLayer;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFramebufferTextureLayer(target, attachment, texture, level, layer, function_pointer);
  }
  
  static native void nglFramebufferTextureLayer(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong);
  
  public static void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glColorMaski;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglColorMaski(buf, r, g, b, a, function_pointer);
  }
  
  static native void nglColorMaski(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong);
  
  public static void glGetBoolean(int value, int index, ByteBuffer data) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetBooleani_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 4);
    nglGetBooleani_v(value, index, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetBooleani_v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static boolean glGetBoolean(int value, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetBooleani_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    ByteBuffer data = APIUtil.getBufferByte(caps, 1);
    nglGetBooleani_v(value, index, MemoryUtil.getAddress(data), function_pointer);
    return data.get(0) == 1;
  }
  
  public static void glGetInteger(int value, int index, IntBuffer data) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetIntegeri_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(data, 4);
    nglGetIntegeri_v(value, index, MemoryUtil.getAddress(data), function_pointer);
  }
  
  static native void nglGetIntegeri_v(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetInteger(int value, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetIntegeri_v;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer data = APIUtil.getBufferInt(caps);
    nglGetIntegeri_v(value, index, MemoryUtil.getAddress(data), function_pointer);
    return data.get(0);
  }
  
  public static void glEnablei(int target, int index) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEnablei;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEnablei(target, index, function_pointer);
  }
  
  static native void nglEnablei(int paramInt1, int paramInt2, long paramLong);
  
  public static void glDisablei(int target, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDisablei;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglDisablei(target, index, function_pointer);
  }
  
  static native void nglDisablei(int paramInt1, int paramInt2, long paramLong);
  
  public static boolean glIsEnabledi(int target, int index) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsEnabledi;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsEnabledi(target, index, function_pointer);
    return __result;
  }
  
  static native boolean nglIsEnabledi(int paramInt1, int paramInt2, long paramLong);
  
  public static void glBindBufferRange(int target, int index, int buffer, long offset, long size) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindBufferRange;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindBufferRange(target, index, buffer, offset, size, function_pointer);
  }
  
  static native void nglBindBufferRange(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3);
  
  public static void glBindBufferBase(int target, int index, int buffer) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindBufferBase;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBindBufferBase(target, index, buffer, function_pointer);
  }
  
  static native void nglBindBufferBase(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public static void glBeginTransformFeedback(int primitiveMode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBeginTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglBeginTransformFeedback(primitiveMode, function_pointer);
  }
  
  static native void nglBeginTransformFeedback(int paramInt, long paramLong);
  
  public static void glEndTransformFeedback() { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glEndTransformFeedback;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglEndTransformFeedback(function_pointer);
  }
  
  static native void nglEndTransformFeedback(long paramLong);
  
  public static void glTransformFeedbackVaryings(int program, int count, ByteBuffer varyings, int bufferMode) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTransformFeedbackVaryings;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(varyings);
    BufferChecks.checkNullTerminated(varyings, count);
    nglTransformFeedbackVaryings(program, count, MemoryUtil.getAddress(varyings), bufferMode, function_pointer);
  }
  
  static native void nglTransformFeedbackVaryings(int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2);
  
  public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glTransformFeedbackVaryings;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkArray(varyings);
    nglTransformFeedbackVaryings(program, varyings.length, APIUtil.getBufferNT(caps, varyings), bufferMode, function_pointer);
  }
  
  public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbackVarying;
    BufferChecks.checkFunctionAddress(function_pointer);
    if (length != null)
      BufferChecks.checkBuffer(length, 1);
    BufferChecks.checkBuffer(size, 1);
    BufferChecks.checkBuffer(type, 1);
    BufferChecks.checkDirect(name);
    nglGetTransformFeedbackVarying(program, index, name.remaining(), MemoryUtil.getAddressSafe(length), MemoryUtil.getAddress(size), MemoryUtil.getAddress(type), MemoryUtil.getAddress(name), function_pointer);
  }
  
  static native void nglGetTransformFeedbackVarying(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
  
  public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetTransformFeedbackVarying;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(size, 1);
    BufferChecks.checkBuffer(type, 1);
    IntBuffer name_length = APIUtil.getLengths(caps);
    ByteBuffer name = APIUtil.getBufferByte(caps, bufSize);
    nglGetTransformFeedbackVarying(program, index, bufSize, MemoryUtil.getAddress0(name_length), MemoryUtil.getAddress(size), MemoryUtil.getAddress(type), MemoryUtil.getAddress(name), function_pointer);
    name.limit(name_length.get(0));
    return APIUtil.getString(caps, name);
  }
  
  public static void glBindVertexArray(int array) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glBindVertexArray;
    BufferChecks.checkFunctionAddress(function_pointer);
    StateTracker.bindVAO(caps, array);
    nglBindVertexArray(array, function_pointer);
  }
  
  static native void nglBindVertexArray(int paramInt, long paramLong);
  
  public static void glDeleteVertexArrays(IntBuffer arrays) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    StateTracker.deleteVAO(caps, arrays);
    BufferChecks.checkDirect(arrays);
    nglDeleteVertexArrays(arrays.remaining(), MemoryUtil.getAddress(arrays), function_pointer);
  }
  
  static native void nglDeleteVertexArrays(int paramInt, long paramLong1, long paramLong2);
  
  public static void glDeleteVertexArrays(int array) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glDeleteVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    StateTracker.deleteVAO(caps, array);
    nglDeleteVertexArrays(1, APIUtil.getInt(caps, array), function_pointer);
  }
  
  public static void glGenVertexArrays(IntBuffer arrays) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkDirect(arrays);
    nglGenVertexArrays(arrays.remaining(), MemoryUtil.getAddress(arrays), function_pointer);
  }
  
  static native void nglGenVertexArrays(int paramInt, long paramLong1, long paramLong2);
  
  public static int glGenVertexArrays() {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGenVertexArrays;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer arrays = APIUtil.getBufferInt(caps);
    nglGenVertexArrays(1, MemoryUtil.getAddress(arrays), function_pointer);
    return arrays.get(0);
  }
  
  public static boolean glIsVertexArray(int array) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glIsVertexArray;
    BufferChecks.checkFunctionAddress(function_pointer);
    boolean __result = nglIsVertexArray(array, function_pointer);
    return __result;
  }
  
  static native boolean nglIsVertexArray(int paramInt, long paramLong);
}
