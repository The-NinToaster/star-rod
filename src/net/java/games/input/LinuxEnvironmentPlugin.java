package net.java.games.input;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import net.java.games.util.plugins.Plugin;



























public final class LinuxEnvironmentPlugin
  extends ControllerEnvironment
  implements Plugin
{
  private static final String LIBNAME = "jinput-linux";
  private static final String POSTFIX64BIT = "64";
  private static boolean supported = false;
  
  private final Controller[] controllers;
  private final List devices = new ArrayList();
  private static final LinuxDeviceThread device_thread = new LinuxDeviceThread();
  






  static void loadLibrary(String lib_name)
  {
    AccessController.doPrivileged(new PrivilegedAction() {
      private final String val$lib_name;
      
      public final Object run() { String lib_path = System.getProperty("net.java.games.input.librarypath");
        try {
          if (lib_path != null) {
            System.load(lib_path + File.separator + System.mapLibraryName(val$lib_name));
          } else
            System.loadLibrary(val$lib_name);
        } catch (UnsatisfiedLinkError e) {
          ControllerEnvironment.logln("Failed to load library: " + e.getMessage());
          e.printStackTrace();
          LinuxEnvironmentPlugin.access$002(false);
        }
        return null;
      }
    });
  }
  
  static String getPrivilegedProperty(String property) {
    (String)AccessController.doPrivileged(new PrivilegedAction() { private final String val$property;
      
      public Object run() { return System.getProperty(val$property); }
    });
  }
  

  static String getPrivilegedProperty(String property, final String default_value)
  {
    (String)AccessController.doPrivileged(new PrivilegedAction() { private final String val$property;
      
      public Object run() { return System.getProperty(val$property, default_value); }
    });
  }
  
  static
  {
    String osName = getPrivilegedProperty("os.name", "").trim();
    if (osName.equals("Linux")) {
      supported = true;
      if ("i386".equals(getPrivilegedProperty("os.arch"))) {
        loadLibrary("jinput-linux");
      } else {
        loadLibrary("jinput-linux64");
      }
    }
  }
  
  public static final Object execute(LinuxDeviceTask task) throws IOException {
    return device_thread.execute(task);
  }
  
  public LinuxEnvironmentPlugin() {
    if (isSupported()) {
      controllers = enumerateControllers();
      logln("Linux plugin claims to have found " + controllers.length + " controllers");
      AccessController.doPrivileged(new PrivilegedAction()
      {
        public final Object run() {
          Runtime.getRuntime().addShutdownHook(new LinuxEnvironmentPlugin.ShutdownHook(LinuxEnvironmentPlugin.this, null));
          return null;
        }
      });
    } else {
      controllers = new Controller[0];
    }
  }
  


  private final String val$default_value;
  
  public final Controller[] getControllers()
  {
    return controllers;
  }
  
  private static final Component[] createComponents(List event_components, LinuxEventDevice device) {
    LinuxEventComponent[][] povs = new LinuxEventComponent[4][2];
    List components = new ArrayList();
    for (int i = 0; i < event_components.size(); i++) {
      LinuxEventComponent event_component = (LinuxEventComponent)event_components.get(i);
      Component.Identifier identifier = event_component.getIdentifier();
      
      if (identifier == Component.Identifier.Axis.POV) {
        int native_code = event_component.getDescriptor().getCode();
        switch (native_code) {
        case 16: 
          povs[0][0] = event_component;
          break;
        case 17: 
          povs[0][1] = event_component;
          break;
        case 18: 
          povs[1][0] = event_component;
          break;
        case 19: 
          povs[1][1] = event_component;
          break;
        case 20: 
          povs[2][0] = event_component;
          break;
        case 21: 
          povs[2][1] = event_component;
          break;
        case 22: 
          povs[3][0] = event_component;
          break;
        case 23: 
          povs[3][1] = event_component;
          break;
        default: 
          logln("Unknown POV instance: " + native_code);
        }
      }
      else if (identifier != null) {
        LinuxComponent component = new LinuxComponent(event_component);
        components.add(component);
        device.registerComponent(event_component.getDescriptor(), component);
      }
    }
    for (int i = 0; i < povs.length; i++) {
      LinuxEventComponent x = povs[i][0];
      LinuxEventComponent y = povs[i][1];
      if ((x != null) && (y != null)) {
        LinuxComponent controller_component = new LinuxPOV(x, y);
        components.add(controller_component);
        device.registerComponent(x.getDescriptor(), controller_component);
        device.registerComponent(y.getDescriptor(), controller_component);
      }
    }
    Component[] components_array = new Component[components.size()];
    components.toArray(components_array);
    return components_array;
  }
  
  private static final Mouse createMouseFromDevice(LinuxEventDevice device, Component[] components) throws IOException {
    Mouse mouse = new LinuxMouse(device, components, new Controller[0], device.getRumblers());
    if ((mouse.getX() != null) && (mouse.getY() != null) && (mouse.getPrimaryButton() != null)) {
      return mouse;
    }
    return null;
  }
  
  private static final Keyboard createKeyboardFromDevice(LinuxEventDevice device, Component[] components) throws IOException {
    Keyboard keyboard = new LinuxKeyboard(device, components, new Controller[0], device.getRumblers());
    return keyboard;
  }
  
  private static final Controller createJoystickFromDevice(LinuxEventDevice device, Component[] components, Controller.Type type) throws IOException {
    Controller joystick = new LinuxAbstractController(device, components, new Controller[0], device.getRumblers(), type);
    return joystick;
  }
  
  private static final Controller createControllerFromDevice(LinuxEventDevice device) throws IOException {
    List event_components = device.getComponents();
    Component[] components = createComponents(event_components, device);
    Controller.Type type = device.getType();
    
    if (type == Controller.Type.MOUSE)
      return createMouseFromDevice(device, components);
    if (type == Controller.Type.KEYBOARD)
      return createKeyboardFromDevice(device, components);
    if ((type == Controller.Type.STICK) || (type == Controller.Type.GAMEPAD)) {
      return createJoystickFromDevice(device, components, type);
    }
    return null;
  }
  
  private final Controller[] enumerateControllers() {
    List controllers = new ArrayList();
    List eventControllers = new ArrayList();
    List jsControllers = new ArrayList();
    enumerateEventControllers(eventControllers);
    enumerateJoystickControllers(jsControllers);
    
    for (int i = 0; i < eventControllers.size(); i++) {
      for (int j = 0; j < jsControllers.size(); j++) {
        Controller evController = (Controller)eventControllers.get(i);
        Controller jsController = (Controller)jsControllers.get(j);
        


        if (evController.getName().equals(jsController.getName()))
        {
          Component[] evComponents = evController.getComponents();
          Component[] jsComponents = jsController.getComponents();
          if (evComponents.length == jsComponents.length) {
            boolean foundADifference = false;
            
            for (int k = 0; k < evComponents.length; k++)
            {
              if (evComponents[k].getIdentifier() != jsComponents[k].getIdentifier()) {
                foundADifference = true;
              }
            }
            
            if (!foundADifference) {
              controllers.add(new LinuxCombinedController((LinuxAbstractController)eventControllers.remove(i), (LinuxJoystickAbstractController)jsControllers.remove(j)));
              i--;
              j--;
              break;
            }
          }
        }
      }
    }
    controllers.addAll(eventControllers);
    controllers.addAll(jsControllers);
    
    Controller[] controllers_array = new Controller[controllers.size()];
    controllers.toArray(controllers_array);
    return controllers_array;
  }
  
  private static final Component.Identifier.Button getButtonIdentifier(int index) {
    switch (index) {
    case 0: 
      return Component.Identifier.Button._0;
    case 1: 
      return Component.Identifier.Button._1;
    case 2: 
      return Component.Identifier.Button._2;
    case 3: 
      return Component.Identifier.Button._3;
    case 4: 
      return Component.Identifier.Button._4;
    case 5: 
      return Component.Identifier.Button._5;
    case 6: 
      return Component.Identifier.Button._6;
    case 7: 
      return Component.Identifier.Button._7;
    case 8: 
      return Component.Identifier.Button._8;
    case 9: 
      return Component.Identifier.Button._9;
    case 10: 
      return Component.Identifier.Button._10;
    case 11: 
      return Component.Identifier.Button._11;
    case 12: 
      return Component.Identifier.Button._12;
    case 13: 
      return Component.Identifier.Button._13;
    case 14: 
      return Component.Identifier.Button._14;
    case 15: 
      return Component.Identifier.Button._15;
    case 16: 
      return Component.Identifier.Button._16;
    case 17: 
      return Component.Identifier.Button._17;
    case 18: 
      return Component.Identifier.Button._18;
    case 19: 
      return Component.Identifier.Button._19;
    case 20: 
      return Component.Identifier.Button._20;
    case 21: 
      return Component.Identifier.Button._21;
    case 22: 
      return Component.Identifier.Button._22;
    case 23: 
      return Component.Identifier.Button._23;
    case 24: 
      return Component.Identifier.Button._24;
    case 25: 
      return Component.Identifier.Button._25;
    case 26: 
      return Component.Identifier.Button._26;
    case 27: 
      return Component.Identifier.Button._27;
    case 28: 
      return Component.Identifier.Button._28;
    case 29: 
      return Component.Identifier.Button._29;
    case 30: 
      return Component.Identifier.Button._30;
    case 31: 
      return Component.Identifier.Button._31;
    }
    return null;
  }
  
  private static final Controller createJoystickFromJoystickDevice(LinuxJoystickDevice device)
  {
    List components = new ArrayList();
    byte[] axisMap = device.getAxisMap();
    char[] buttonMap = device.getButtonMap();
    LinuxJoystickAxis[] hatBits = new LinuxJoystickAxis[6];
    
    for (int i = 0; i < device.getNumButtons(); i++) {
      Component.Identifier button_id = LinuxNativeTypesMap.getButtonID(buttonMap[i]);
      if (button_id != null) {
        LinuxJoystickButton button = new LinuxJoystickButton(button_id);
        device.registerButton(i, button);
        components.add(button);
      }
    }
    for (int i = 0; i < device.getNumAxes(); i++)
    {
      Component.Identifier.Axis axis_id = (Component.Identifier.Axis)LinuxNativeTypesMap.getAbsAxisID(axisMap[i]);
      LinuxJoystickAxis axis = new LinuxJoystickAxis(axis_id);
      
      device.registerAxis(i, axis);
      
      if (axisMap[i] == 16) {
        hatBits[0] = axis;
      } else if (axisMap[i] == 17) {
        hatBits[1] = axis;
        axis = new LinuxJoystickPOV(Component.Identifier.Axis.POV, hatBits[0], hatBits[1]);
        device.registerPOV((LinuxJoystickPOV)axis);
        components.add(axis);
      } else if (axisMap[i] == 18) {
        hatBits[2] = axis;
      } else if (axisMap[i] == 19) {
        hatBits[3] = axis;
        axis = new LinuxJoystickPOV(Component.Identifier.Axis.POV, hatBits[2], hatBits[3]);
        device.registerPOV((LinuxJoystickPOV)axis);
        components.add(axis);
      } else if (axisMap[i] == 20) {
        hatBits[4] = axis;
      } else if (axisMap[i] == 21) {
        hatBits[5] = axis;
        axis = new LinuxJoystickPOV(Component.Identifier.Axis.POV, hatBits[4], hatBits[5]);
        device.registerPOV((LinuxJoystickPOV)axis);
        components.add(axis);
      } else {
        components.add(axis);
      }
    }
    
    return new LinuxJoystickAbstractController(device, (Component[])components.toArray(new Component[0]), new Controller[0], new Rumbler[0]);
  }
  
  private final void enumerateJoystickControllers(List controllers) {
    File[] joystick_device_files = enumerateJoystickDeviceFiles("/dev/input");
    if ((joystick_device_files == null) || (joystick_device_files.length == 0)) {
      joystick_device_files = enumerateJoystickDeviceFiles("/dev");
      if (joystick_device_files == null)
        return;
    }
    for (int i = 0; i < joystick_device_files.length; i++) {
      File event_file = joystick_device_files[i];
      try {
        String path = getAbsolutePathPrivileged(event_file);
        LinuxJoystickDevice device = new LinuxJoystickDevice(path);
        Controller controller = createJoystickFromJoystickDevice(device);
        if (controller != null) {
          controllers.add(controller);
          devices.add(device);
        } else {
          device.close();
        }
      } catch (IOException e) { logln("Failed to open device (" + event_file + "): " + e.getMessage());
      }
    }
  }
  
  private static final File[] enumerateJoystickDeviceFiles(String dev_path) {
    File dev = new File(dev_path);
    listFilesPrivileged(dev, new FilenameFilter() {
      public final boolean accept(File dir, String name) {
        return name.startsWith("js");
      }
    });
  }
  
  private static String getAbsolutePathPrivileged(File file) {
    (String)AccessController.doPrivileged(new PrivilegedAction() { private final File val$file;
      
      public Object run() { return val$file.getAbsolutePath(); }
    });
  }
  
  private static File[] listFilesPrivileged(File dir, final FilenameFilter filter)
  {
    (File[])AccessController.doPrivileged(new PrivilegedAction() { private final File val$dir;
      
      public Object run() { return val$dir.listFiles(filter); }
    });
  }
  
  private final FilenameFilter val$filter;
  private final void enumerateEventControllers(List controllers) {
    File dev = new File("/dev/input");
    File[] event_device_files = listFilesPrivileged(dev, new FilenameFilter() {
      public final boolean accept(File dir, String name) {
        return name.startsWith("event");
      }
    });
    if (event_device_files == null)
      return;
    for (int i = 0; i < event_device_files.length; i++) {
      File event_file = event_device_files[i];
      try {
        String path = getAbsolutePathPrivileged(event_file);
        LinuxEventDevice device = new LinuxEventDevice(path);
        try {
          Controller controller = createControllerFromDevice(device);
          if (controller != null) {
            controllers.add(controller);
            devices.add(device);
          } else {
            device.close();
          }
        } catch (IOException e) { logln("Failed to create Controller: " + e.getMessage());
          device.close();
        }
      } catch (IOException e) {
        logln("Failed to open device (" + event_file + "): " + e.getMessage());
      }
    }
  }
  
  private final class ShutdownHook extends Thread { ShutdownHook(LinuxEnvironmentPlugin.1 x1) { this(); }
    
    public final void run() { for (int i = 0; i < devices.size(); i++)
        try {
          LinuxDevice device = (LinuxDevice)devices.get(i);
          device.close();
        } catch (IOException e) {
          ControllerEnvironment.logln("Failed to close device: " + e.getMessage());
        }
    }
    
    private ShutdownHook() {}
  }
  
  public boolean isSupported() { return supported; }
}
