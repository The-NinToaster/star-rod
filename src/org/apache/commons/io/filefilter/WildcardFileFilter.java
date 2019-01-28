package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
















































public class WildcardFileFilter
  extends AbstractFileFilter
  implements Serializable
{
  private final String[] wildcards;
  private final IOCase caseSensitivity;
  
  public WildcardFileFilter(String wildcard)
  {
    this(wildcard, null);
  }
  






  public WildcardFileFilter(String wildcard, IOCase caseSensitivity)
  {
    if (wildcard == null) {
      throw new IllegalArgumentException("The wildcard must not be null");
    }
    wildcards = new String[] { wildcard };
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  








  public WildcardFileFilter(String[] wildcards)
  {
    this(wildcards, null);
  }
  









  public WildcardFileFilter(String[] wildcards, IOCase caseSensitivity)
  {
    if (wildcards == null) {
      throw new IllegalArgumentException("The wildcard array must not be null");
    }
    this.wildcards = new String[wildcards.length];
    System.arraycopy(wildcards, 0, this.wildcards, 0, wildcards.length);
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  






  public WildcardFileFilter(List<String> wildcards)
  {
    this(wildcards, null);
  }
  







  public WildcardFileFilter(List<String> wildcards, IOCase caseSensitivity)
  {
    if (wildcards == null) {
      throw new IllegalArgumentException("The wildcard list must not be null");
    }
    this.wildcards = ((String[])wildcards.toArray(new String[wildcards.size()]));
    this.caseSensitivity = (caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity);
  }
  








  public boolean accept(File dir, String name)
  {
    for (String wildcard : wildcards) {
      if (FilenameUtils.wildcardMatch(name, wildcard, caseSensitivity)) {
        return true;
      }
    }
    return false;
  }
  






  public boolean accept(File file)
  {
    String name = file.getName();
    for (String wildcard : wildcards) {
      if (FilenameUtils.wildcardMatch(name, wildcard, caseSensitivity)) {
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
    if (wildcards != null) {
      for (int i = 0; i < wildcards.length; i++) {
        if (i > 0) {
          buffer.append(",");
        }
        buffer.append(wildcards[i]);
      }
    }
    buffer.append(")");
    return buffer.toString();
  }
}
