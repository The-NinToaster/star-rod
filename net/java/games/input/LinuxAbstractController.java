package net.java.games.input;

import java.io.IOException;







































final class LinuxAbstractController
  extends AbstractController
{
  private final Controller.PortType port;
  private final LinuxEventDevice device;
  private final Controller.Type type;
  
  protected LinuxAbstractController(LinuxEventDevice device, Component[] components, Controller[] children, Rumbler[] rumblers, Controller.Type type)
    throws IOException
  {
    super(device.getName(), components, children, rumblers);
    this.device = device;
    port = device.getPortType();
    this.type = type;
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
  
  public Controller.Type getType() {
    return type;
  }
}
