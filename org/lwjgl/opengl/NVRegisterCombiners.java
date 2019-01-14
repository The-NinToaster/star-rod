package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferChecks;

public final class NVRegisterCombiners
{
  public static final int GL_REGISTER_COMBINERS_NV = 34082;
  public static final int GL_COMBINER0_NV = 34128;
  public static final int GL_COMBINER1_NV = 34129;
  public static final int GL_COMBINER2_NV = 34130;
  public static final int GL_COMBINER3_NV = 34131;
  public static final int GL_COMBINER4_NV = 34132;
  public static final int GL_COMBINER5_NV = 34133;
  public static final int GL_COMBINER6_NV = 34134;
  public static final int GL_COMBINER7_NV = 34135;
  public static final int GL_VARIABLE_A_NV = 34083;
  public static final int GL_VARIABLE_B_NV = 34084;
  public static final int GL_VARIABLE_C_NV = 34085;
  public static final int GL_VARIABLE_D_NV = 34086;
  public static final int GL_VARIABLE_E_NV = 34087;
  public static final int GL_VARIABLE_F_NV = 34088;
  public static final int GL_VARIABLE_G_NV = 34089;
  public static final int GL_CONSTANT_COLOR0_NV = 34090;
  public static final int GL_CONSTANT_COLOR1_NV = 34091;
  public static final int GL_PRIMARY_COLOR_NV = 34092;
  public static final int GL_SECONDARY_COLOR_NV = 34093;
  public static final int GL_SPARE0_NV = 34094;
  public static final int GL_SPARE1_NV = 34095;
  public static final int GL_UNSIGNED_IDENTITY_NV = 34102;
  public static final int GL_UNSIGNED_INVERT_NV = 34103;
  public static final int GL_EXPAND_NORMAL_NV = 34104;
  public static final int GL_EXPAND_NEGATE_NV = 34105;
  public static final int GL_HALF_BIAS_NORMAL_NV = 34106;
  public static final int GL_HALF_BIAS_NEGATE_NV = 34107;
  public static final int GL_SIGNED_IDENTITY_NV = 34108;
  public static final int GL_SIGNED_NEGATE_NV = 34109;
  public static final int GL_E_TIMES_F_NV = 34097;
  public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 34098;
  public static final int GL_SCALE_BY_TWO_NV = 34110;
  public static final int GL_SCALE_BY_FOUR_NV = 34111;
  public static final int GL_SCALE_BY_ONE_HALF_NV = 34112;
  public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 34113;
  public static final int GL_DISCARD_NV = 34096;
  public static final int GL_COMBINER_INPUT_NV = 34114;
  public static final int GL_COMBINER_MAPPING_NV = 34115;
  public static final int GL_COMBINER_COMPONENT_USAGE_NV = 34116;
  public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = 34117;
  public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = 34118;
  public static final int GL_COMBINER_MUX_SUM_NV = 34119;
  public static final int GL_COMBINER_SCALE_NV = 34120;
  public static final int GL_COMBINER_BIAS_NV = 34121;
  public static final int GL_COMBINER_AB_OUTPUT_NV = 34122;
  public static final int GL_COMBINER_CD_OUTPUT_NV = 34123;
  public static final int GL_COMBINER_SUM_OUTPUT_NV = 34124;
  public static final int GL_NUM_GENERAL_COMBINERS_NV = 34126;
  public static final int GL_COLOR_SUM_CLAMP_NV = 34127;
  public static final int GL_MAX_GENERAL_COMBINERS_NV = 34125;
  
  private NVRegisterCombiners() {}
  
  public static void glCombinerParameterfNV(int pname, float param)
  {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerParameterfNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCombinerParameterfNV(pname, param, function_pointer);
  }
  
  static native void nglCombinerParameterfNV(int paramInt, float paramFloat, long paramLong);
  
  public static void glCombinerParameterNV(int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglCombinerParameterfvNV(pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglCombinerParameterfvNV(int paramInt, long paramLong1, long paramLong2);
  
  public static void glCombinerParameteriNV(int pname, int param) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerParameteriNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCombinerParameteriNV(pname, param, function_pointer);
  }
  
  static native void nglCombinerParameteriNV(int paramInt1, int paramInt2, long paramLong);
  
  public static void glCombinerParameterNV(int pname, IntBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglCombinerParameterivNV(pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglCombinerParameterivNV(int paramInt, long paramLong1, long paramLong2);
  
  public static void glCombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerInputNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCombinerInputNV(stage, portion, variable, input, mapping, componentUsage, function_pointer);
  }
  
  static native void nglCombinerInputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong);
  
  public static void glCombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct, boolean cdDotProduct, boolean muxSum) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glCombinerOutputNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglCombinerOutputNV(stage, portion, abOutput, cdOutput, sumOutput, scale, bias, abDotProduct, cdDotProduct, muxSum, function_pointer);
  }
  
  static native void nglCombinerOutputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong);
  
  public static void glFinalCombinerInputNV(int variable, int input, int mapping, int componentUsage) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glFinalCombinerInputNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    nglFinalCombinerInputNV(variable, input, mapping, componentUsage, function_pointer);
  }
  
  static native void nglFinalCombinerInputNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public static void glGetCombinerInputParameterNV(int stage, int portion, int variable, int pname, FloatBuffer params) { ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerInputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetCombinerInputParameterfvNV(stage, portion, variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetCombinerInputParameterfvNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static float glGetCombinerInputParameterfNV(int stage, int portion, int variable, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerInputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetCombinerInputParameterfvNV(stage, portion, variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetCombinerInputParameterNV(int stage, int portion, int variable, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerInputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetCombinerInputParameterivNV(stage, portion, variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetCombinerInputParameterivNV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  
  public static int glGetCombinerInputParameteriNV(int stage, int portion, int variable, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerInputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetCombinerInputParameterivNV(stage, portion, variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetCombinerOutputParameterNV(int stage, int portion, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerOutputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetCombinerOutputParameterfvNV(stage, portion, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetCombinerOutputParameterfvNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static float glGetCombinerOutputParameterfNV(int stage, int portion, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerOutputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetCombinerOutputParameterfvNV(stage, portion, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetCombinerOutputParameterNV(int stage, int portion, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerOutputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetCombinerOutputParameterivNV(stage, portion, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetCombinerOutputParameterivNV(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2);
  
  public static int glGetCombinerOutputParameteriNV(int stage, int portion, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetCombinerOutputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetCombinerOutputParameterivNV(stage, portion, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetFinalCombinerInputParameterNV(int variable, int pname, FloatBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFinalCombinerInputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetFinalCombinerInputParameterfvNV(variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetFinalCombinerInputParameterfvNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static float glGetFinalCombinerInputParameterfNV(int variable, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFinalCombinerInputParameterfvNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    FloatBuffer params = APIUtil.getBufferFloat(caps);
    nglGetFinalCombinerInputParameterfvNV(variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
  
  public static void glGetFinalCombinerInputParameterNV(int variable, int pname, IntBuffer params) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFinalCombinerInputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    BufferChecks.checkBuffer(params, 4);
    nglGetFinalCombinerInputParameterivNV(variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
  }
  
  static native void nglGetFinalCombinerInputParameterivNV(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static int glGetFinalCombinerInputParameteriNV(int variable, int pname) {
    ContextCapabilities caps = GLContext.getCapabilities();
    long function_pointer = glGetFinalCombinerInputParameterivNV;
    BufferChecks.checkFunctionAddress(function_pointer);
    IntBuffer params = APIUtil.getBufferInt(caps);
    nglGetFinalCombinerInputParameterivNV(variable, pname, org.lwjgl.MemoryUtil.getAddress(params), function_pointer);
    return params.get(0);
  }
}
