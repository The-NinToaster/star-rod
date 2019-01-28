package org.apache.commons.io.output;

import java.io.OutputStream;


























public class CountingOutputStream
  extends ProxyOutputStream
{
  private long count = 0L;
  




  public CountingOutputStream(OutputStream out)
  {
    super(out);
  }
  








  protected synchronized void beforeWrite(int n)
  {
    count += n;
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
