package org.lwjgl.util.vector;

import java.io.Serializable;
import java.nio.FloatBuffer;

public abstract class Matrix
  implements Serializable
{
  protected Matrix() {}
  
  public abstract Matrix setIdentity();
  
  public abstract Matrix invert();
  
  public abstract Matrix load(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix loadTranspose(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix negate();
  
  public abstract Matrix store(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix storeTranspose(FloatBuffer paramFloatBuffer);
  
  public abstract Matrix transpose();
  
  public abstract Matrix setZero();
  
  public abstract float determinant();
}
