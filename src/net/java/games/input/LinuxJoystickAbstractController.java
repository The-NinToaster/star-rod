package net.java.games.input;

import java.io.IOException;








































final class LinuxJoystickAbstractController
  extends AbstractController
{
  private final LinuxJoystickDevice device;
  
  protected LinuxJoystickAbstractController(LinuxJoystickDevice device, Component[] components, Controller[] children, Rumbler[] rumblers)
  {
    super(device.getName(), components, children, rumblers);
    this.device = device;
  }
  
  protected final void setDeviceEventQueueSize(int size) throws IOException {
    device.setBufferSize(size);
  }
  
  public final void pollDevice() throws IOException {
    device.poll();
  }
  
  protected final boolean getNextDeviceEvent(Event event) throws IOException {
    return device.getNextEvent(event);
  }
  
  public Controller.Type getType() {
    return Controller.Type.STICK;
  }
}
