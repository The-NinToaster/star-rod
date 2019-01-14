package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Proxy;


































public class ClassLoaderObjectInputStream
  extends ObjectInputStream
{
  private final ClassLoader classLoader;
  
  public ClassLoaderObjectInputStream(ClassLoader classLoader, InputStream inputStream)
    throws IOException, StreamCorruptedException
  {
    super(inputStream);
    this.classLoader = classLoader;
  }
  










  protected Class<?> resolveClass(ObjectStreamClass objectStreamClass)
    throws IOException, ClassNotFoundException
  {
    Class<?> clazz = Class.forName(objectStreamClass.getName(), false, classLoader);
    
    if (clazz != null)
    {
      return clazz;
    }
    
    return super.resolveClass(objectStreamClass);
  }
  












  protected Class<?> resolveProxyClass(String[] interfaces)
    throws IOException, ClassNotFoundException
  {
    Class<?>[] interfaceClasses = new Class[interfaces.length];
    for (int i = 0; i < interfaces.length; i++) {
      interfaceClasses[i] = Class.forName(interfaces[i], false, classLoader);
    }
    try {
      return Proxy.getProxyClass(classLoader, interfaceClasses);
    } catch (IllegalArgumentException e) {}
    return super.resolveProxyClass(interfaces);
  }
}
