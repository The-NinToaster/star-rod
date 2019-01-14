package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;






























public class CountingInputStream
  extends ProxyInputStream
{
  private long count;
  
  public CountingInputStream(InputStream in)
  {
    super(in);
  }
  










  public synchronized long skip(long length)
    throws IOException
  {
    long skip = super.skip(length);
    count += skip;
    return skip;
  }
  






  protected synchronized void afterRead(int n)
  {
    if (n != -1) {
      count += n;
    }
  }
  










  public int getCount()
  {
    long result = getByteCount();
    if (result > 2147483647L) {
      throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
    }
    return (int)result;
  }
  









  public int resetCount()
  {
    long result = resetByteCount();
    if (result > 2147483647L) {
      throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
    }
    return (int)result;
  }
  









  public synchronized long getByteCount()
  {
    return count;
  }
  









  public synchronized long resetByteCount()
  {
    long tmp = count;
    count = 0L;
    return tmp;
  }
}
