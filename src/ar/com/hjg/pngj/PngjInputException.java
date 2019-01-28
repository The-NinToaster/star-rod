package ar.com.hjg.pngj;

public class PngjInputException
  extends PngjException
{
  private static final long serialVersionUID = 1L;
  
  public PngjInputException(String message, Throwable cause)
  {
    super(message, cause);
  }
  
  public PngjInputException(String message) {
    super(message);
  }
  
  public PngjInputException(Throwable cause) {
    super(cause);
  }
}
