package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;































public abstract class ProxyReader
  extends FilterReader
{
  public ProxyReader(Reader proxy)
  {
    super(proxy);
  }
  




  public int read()
    throws IOException
  {
    try
    {
      beforeRead(1);
      int c = in.read();
      afterRead(c != -1 ? 1 : -1);
      return c;
    } catch (IOException e) {
      handleIOException(e); }
    return -1;
  }
  





  public int read(char[] chr)
    throws IOException
  {
    try
    {
      beforeRead(chr != null ? chr.length : 0);
      int n = in.read(chr);
      afterRead(n);
      return n;
    } catch (IOException e) {
      handleIOException(e); }
    return -1;
  }
  







  public int read(char[] chr, int st, int len)
    throws IOException
  {
    try
    {
      beforeRead(len);
      int n = in.read(chr, st, len);
      afterRead(n);
      return n;
    } catch (IOException e) {
      handleIOException(e); }
    return -1;
  }
  






  public int read(CharBuffer target)
    throws IOException
  {
    try
    {
      beforeRead(target != null ? target.length() : 0);
      int n = in.read(target);
      afterRead(n);
      return n;
    } catch (IOException e) {
      handleIOException(e); }
    return -1;
  }
  





  public long skip(long ln)
    throws IOException
  {
    try
    {
      return in.skip(ln);
    } catch (IOException e) {
      handleIOException(e); }
    return 0L;
  }
  




  public boolean ready()
    throws IOException
  {
    try
    {
      return in.ready();
    } catch (IOException e) {
      handleIOException(e); }
    return false;
  }
  



  public void close()
    throws IOException
  {
    try
    {
      in.close();
    } catch (IOException e) {
      handleIOException(e);
    }
  }
  



  public synchronized void mark(int idx)
    throws IOException
  {
    try
    {
      in.mark(idx);
    } catch (IOException e) {
      handleIOException(e);
    }
  }
  


  public synchronized void reset()
    throws IOException
  {
    try
    {
      in.reset();
    } catch (IOException e) {
      handleIOException(e);
    }
  }
  




  public boolean markSupported()
  {
    return in.markSupported();
  }
  














  protected void beforeRead(int n)
    throws IOException
  {}
  













  protected void afterRead(int n)
    throws IOException
  {}
  













  protected void handleIOException(IOException e)
    throws IOException
  {
    throw e;
  }
}
