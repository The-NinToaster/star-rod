package net.java.games.input;

import java.io.IOException;








































class LinuxJoystickAxis
  extends AbstractComponent
{
  private float value;
  private boolean analog;
  
  public LinuxJoystickAxis(Component.Identifier.Axis axis_id)
  {
    this(axis_id, true);
  }
  
  public LinuxJoystickAxis(Component.Identifier.Axis axis_id, boolean analog) {
    super(axis_id.getName(), axis_id);
    this.analog = analog;
  }
  
  public final boolean isRelative() {
    return false;
  }
  
  public final boolean isAnalog() {
    return analog;
  }
  
  final void setValue(float value) {
    this.value = value;
    resetHasPolled();
  }
  
  protected final float poll() throws IOException {
    return value;
  }
}
