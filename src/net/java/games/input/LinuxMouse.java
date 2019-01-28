package net.java.games.input;

import java.io.IOException;







































final class LinuxMouse
  extends Mouse
{
  private final Controller.PortType port;
  private final LinuxEventDevice device;
  
  protected LinuxMouse(LinuxEventDevice device, Component[] components, Controller[] children, Rumbler[] rumblers)
    throws IOException
  {
    super(device.getName(), components, children, rumblers);
    this.device = device;
    port = device.getPortType();
  }
  
  public final Controller.PortType getPortType() {
    return port;
  }
  
  public final void pollDevice() throws IOException {
    device.pollKeyStates();
  }
  
  protected final boolean getNextDeviceEvent(Event event) throws IOException {
    return LinuxControllers.getNextDeviceEvent(event, device);
  }
}
