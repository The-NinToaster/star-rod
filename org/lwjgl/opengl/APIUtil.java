package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.MemoryUtil;





































final class APIUtil
{
  private static final int INITIAL_BUFFER_SIZE = 256;
  private static final int INITIAL_LENGTHS_SIZE = 4;
  private static final int BUFFERS_SIZE = 32;
  private char[] array;
  private ByteBuffer buffer;
  private IntBuffer lengths;
  private final IntBuffer ints;
  private final LongBuffer longs;
  private final FloatBuffer floats;
  private final DoubleBuffer doubles;
  
  APIUtil()
  {
    array = new char['Ā'];
    buffer = BufferUtils.createByteBuffer(256);
    lengths = BufferUtils.createIntBuffer(4);
    
    ints = BufferUtils.createIntBuffer(32);
    longs = BufferUtils.createLongBuffer(32);
    
    floats = BufferUtils.createFloatBuffer(32);
    doubles = BufferUtils.createDoubleBuffer(32);
  }
  
  private static char[] getArray(ContextCapabilities caps, int size) {
    char[] array = util.array;
    
    if (array.length < size) {
      int sizeNew = array.length << 1;
      while (sizeNew < size) {
        sizeNew <<= 1;
      }
      array = new char[size];
      util.array = array;
    }
    
    return array;
  }
  
  static ByteBuffer getBufferByte(ContextCapabilities caps, int size) {
    ByteBuffer buffer = util.buffer;
    
    if (buffer.capacity() < size) {
      int sizeNew = buffer.capacity() << 1;
      while (sizeNew < size) {
        sizeNew <<= 1;
      }
      buffer = BufferUtils.createByteBuffer(size);
      util.buffer = buffer;
    } else {
      buffer.clear();
    }
    return buffer;
  }
  
  private static ByteBuffer getBufferByteOffset(ContextCapabilities caps, int size) {
    ByteBuffer buffer = util.buffer;
    
    if (buffer.capacity() < size) {
      int sizeNew = buffer.capacity() << 1;
      while (sizeNew < size) {
        sizeNew <<= 1;
      }
      ByteBuffer bufferNew = BufferUtils.createByteBuffer(size);
      bufferNew.put(buffer);
      util.buffer = (buffer = bufferNew);
    } else {
      buffer.position(buffer.limit());
      buffer.limit(buffer.capacity());
    }
    
    return buffer;
  }
  
  static IntBuffer getBufferInt(ContextCapabilities caps) { return util.ints; }
  
  static LongBuffer getBufferLong(ContextCapabilities caps) { return util.longs; }
  
  static FloatBuffer getBufferFloat(ContextCapabilities caps) { return util.floats; }
  
  static DoubleBuffer getBufferDouble(ContextCapabilities caps) { return util.doubles; }
  
  static IntBuffer getLengths(ContextCapabilities caps) {
    return getLengths(caps, 1);
  }
  
  static IntBuffer getLengths(ContextCapabilities caps, int size) {
    IntBuffer lengths = util.lengths;
    
    if (lengths.capacity() < size) {
      int sizeNew = lengths.capacity();
      while (sizeNew < size) {
        sizeNew <<= 1;
      }
      lengths = BufferUtils.createIntBuffer(size);
      util.lengths = lengths;
    } else {
      lengths.clear();
    }
    return lengths;
  }
  





  private static ByteBuffer encode(ByteBuffer buffer, CharSequence string)
  {
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if ((LWJGLUtil.DEBUG) && ('' <= c)) {
        buffer.put((byte)26);
      } else {
        buffer.put((byte)c);
      }
    }
    return buffer;
  }
  






  static String getString(ContextCapabilities caps, ByteBuffer buffer)
  {
    int length = buffer.remaining();
    char[] charArray = getArray(caps, length);
    
    for (int i = buffer.position(); i < buffer.limit(); i++) {
      charArray[(i - buffer.position())] = ((char)buffer.get(i));
    }
    return new String(charArray, 0, length);
  }
  






  static long getBuffer(ContextCapabilities caps, CharSequence string)
  {
    ByteBuffer buffer = encode(getBufferByte(caps, string.length()), string);
    buffer.flip();
    return MemoryUtil.getAddress0(buffer);
  }
  






  static long getBuffer(ContextCapabilities caps, CharSequence string, int offset)
  {
    ByteBuffer buffer = encode(getBufferByteOffset(caps, offset + string.length()), string);
    buffer.flip();
    return MemoryUtil.getAddress(buffer);
  }
  






  static long getBufferNT(ContextCapabilities caps, CharSequence string)
  {
    ByteBuffer buffer = encode(getBufferByte(caps, string.length() + 1), string);
    buffer.put((byte)0);
    buffer.flip();
    return MemoryUtil.getAddress0(buffer);
  }
  
  static int getTotalLength(CharSequence[] strings) {
    int length = 0;
    for (CharSequence string : strings) {
      length += string.length();
    }
    return length;
  }
  






  static long getBuffer(ContextCapabilities caps, CharSequence[] strings)
  {
    ByteBuffer buffer = getBufferByte(caps, getTotalLength(strings));
    
    for (CharSequence string : strings) {
      encode(buffer, string);
    }
    buffer.flip();
    return MemoryUtil.getAddress0(buffer);
  }
  






  static long getBufferNT(ContextCapabilities caps, CharSequence[] strings)
  {
    ByteBuffer buffer = getBufferByte(caps, getTotalLength(strings) + strings.length);
    
    for (CharSequence string : strings) {
      encode(buffer, string);
      buffer.put((byte)0);
    }
    
    buffer.flip();
    return MemoryUtil.getAddress0(buffer);
  }
  






  static long getLengths(ContextCapabilities caps, CharSequence[] strings)
  {
    IntBuffer buffer = getLengths(caps, strings.length);
    
    for (CharSequence string : strings) {
      buffer.put(string.length());
    }
    buffer.flip();
    return MemoryUtil.getAddress0(buffer);
  }
  
  static long getInt(ContextCapabilities caps, int value) {
    return MemoryUtil.getAddress0(getBufferInt(caps).put(0, value));
  }
  
  static long getBufferByte0(ContextCapabilities caps) {
    return MemoryUtil.getAddress0(getBufferByte(caps, 0));
  }
}
