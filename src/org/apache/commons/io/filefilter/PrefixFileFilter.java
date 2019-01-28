package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;











































public class PrefixFileFilter
  extends AbstractFileFilter
  implements Serializable
{
  private final String[] prefixes;
  private final IOCase caseSensitivity;
  
  public PrefixFileFilter(String prefix)
  {
    this(prefix, IOCase.SENSITIVE);
  }
  








  public PrefixFileFilter(String prefix, IOCase caseSensitivity)
  {
    if (prefix == null) {
      throw new IllegalArgumentException("The prefix must not be null");
    }
    prefixes = new String[] { prefix };
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  








  public PrefixFileFilter(String[] prefixes)
  {
    this(prefixes, IOCase.SENSITIVE);
  }
  











  public PrefixFileFilter(String[] prefixes, IOCase caseSensitivity)
  {
    if (prefixes == null) {
      throw new IllegalArgumentException("The array of prefixes must not be null");
    }
    this.prefixes = new String[prefixes.length];
    System.arraycopy(prefixes, 0, this.prefixes, 0, prefixes.length);
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  






  public PrefixFileFilter(List<String> prefixes)
  {
    this(prefixes, IOCase.SENSITIVE);
  }
  









  public PrefixFileFilter(List<String> prefixes, IOCase caseSensitivity)
  {
    if (prefixes == null) {
      throw new IllegalArgumentException("The list of prefixes must not be null");
    }
    this.prefixes = ((String[])prefixes.toArray(new String[prefixes.size()]));
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  






  public boolean accept(File file)
  {
    String name = file.getName();
    for (String prefix : prefixes) {
      if (caseSensitivity.checkStartsWith(name, prefix)) {
        return true;
      }
    }
    return false;
  }
  







  public boolean accept(File file, String name)
  {
    for (String prefix : prefixes) {
      if (caseSensitivity.checkStartsWith(name, prefix)) {
        return true;
      }
    }
    return false;
  }
  





  public String toString()
  {
    StringBuilder buffer = new StringBuilder();
    buffer.append(super.toString());
    buffer.append("(");
    if (prefixes != null) {
      for (int i = 0; i < prefixes.length; i++) {
        if (i > 0) {
          buffer.append(",");
        }
        buffer.append(prefixes[i]);
      }
    }
    buffer.append(")");
    return buffer.toString();
  }
}
