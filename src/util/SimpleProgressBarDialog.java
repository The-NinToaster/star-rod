package util;

import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JProgressBar;




public class SimpleProgressBarDialog
{
  private JFrame frame;
  private JProgressBar progressBar;
  
  public SimpleProgressBarDialog(String name, String msg)
  {
    frame = new JFrame(name);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(0);
    progressBar = new JProgressBar();
    progressBar.setValue(0);
    progressBar.setStringPainted(true);
    progressBar.setBorder(BorderFactory.createTitledBorder(msg));
    frame.add(progressBar, "North");
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
  
  public void setProgress(int val)
  {
    progressBar.setValue(val);
  }
  
  public void dismiss()
  {
    frame.setDefaultCloseOperation(2);
    frame.dispatchEvent(new WindowEvent(frame, 201));
  }
  



  public void destroy()
  {
    frame.setDefaultCloseOperation(3);
    frame.dispatchEvent(new WindowEvent(frame, 201));
  }
}
