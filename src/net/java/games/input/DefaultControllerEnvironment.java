package net.java.games.input;

import java.io.File;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;
import net.java.games.util.plugins.Plugins;



















































class DefaultControllerEnvironment
  extends ControllerEnvironment
{
  static String libPath;
  private ArrayList controllers;
  
  static void loadLibrary(String lib_name)
  {
    AccessController.doPrivileged(new PrivilegedAction() {
      private final String val$lib_name;
      
      public final Object run() { String lib_path = System.getProperty("net.java.games.input.librarypath");
        if (lib_path != null) {
          System.load(lib_path + File.separator + System.mapLibraryName(val$lib_name));
        } else
          System.loadLibrary(val$lib_name);
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
  



  private final String val$default_value;
  

  private Collection loadedPlugins = new ArrayList();
  




  public DefaultControllerEnvironment() {}
  



  public Controller[] getControllers()
  {
    if (controllers == null)
    {
      controllers = new ArrayList();
      AccessController.doPrivileged(new PrivilegedAction() {
        public Object run() {
          DefaultControllerEnvironment.this.scanControllers();
          return null;
        }
        
      });
      String pluginClasses = getPrivilegedProperty("jinput.plugins", "") + " " + getPrivilegedProperty("net.java.games.input.plugins", "");
      if ((!getPrivilegedProperty("jinput.useDefaultPlugin", "true").toLowerCase().trim().equals("false")) && (!getPrivilegedProperty("net.java.games.input.useDefaultPlugin", "true").toLowerCase().trim().equals("false"))) {
        String osName = getPrivilegedProperty("os.name", "").trim();
        if (osName.equals("Linux")) {
          pluginClasses = pluginClasses + " net.java.games.input.LinuxEnvironmentPlugin";
        } else if (osName.equals("Mac OS X")) {
          pluginClasses = pluginClasses + " net.java.games.input.OSXEnvironmentPlugin";
        } else if ((osName.equals("Windows XP")) || (osName.equals("Windows Vista"))) {
          pluginClasses = pluginClasses + " net.java.games.input.DirectAndRawInputEnvironmentPlugin";
        } else if ((osName.equals("Windows 98")) || (osName.equals("Windows 2000"))) {
          pluginClasses = pluginClasses + " net.java.games.input.DirectInputEnvironmentPlugin";
        } else if (osName.startsWith("Windows")) {
          System.out.println("WARNING: Found unknown Windows version: " + osName);
          System.out.println("Attempting to use default windows plug-in.");
          System.out.flush();
          pluginClasses = pluginClasses + " net.java.games.input.DirectAndRawInputEnvironmentPlugin";
        } else {
          System.out.println("Trying to use default plugin, OS name " + osName + " not recognised");
        }
      }
      
      StringTokenizer pluginClassTok = new StringTokenizer(pluginClasses, " \t\n\r\f,;:");
      while (pluginClassTok.hasMoreTokens()) {
        String className = pluginClassTok.nextToken();
        try {
          if (!loadedPlugins.contains(className)) {
            System.out.println("Loading: " + className);
            Class ceClass = Class.forName(className);
            ControllerEnvironment ce = (ControllerEnvironment)ceClass.newInstance();
            if (ce.isSupported()) {
              addControllers(ce.getControllers());
              loadedPlugins.add(ce.getClass().getName());
            } else {
              logln(ceClass.getName() + " is not supported");
            }
          }
        } catch (Throwable e) {
          e.printStackTrace();
        }
      }
    }
    Controller[] ret = new Controller[controllers.size()];
    Iterator it = controllers.iterator();
    int i = 0;
    while (it.hasNext()) {
      ret[i] = ((Controller)it.next());
      i++;
    }
    return ret;
  }
  
  private void scanControllers()
  {
    String pluginPathName = getPrivilegedProperty("jinput.controllerPluginPath");
    if (pluginPathName == null) {
      pluginPathName = "controller";
    }
    
    scanControllersAt(getPrivilegedProperty("java.home") + File.separator + "lib" + File.separator + pluginPathName);
    
    scanControllersAt(getPrivilegedProperty("user.dir") + File.separator + pluginPathName);
  }
  
  private void scanControllersAt(String path)
  {
    File file = new File(path);
    if (!file.exists()) {
      return;
    }
    try {
      Plugins plugins = new Plugins(file);
      Class[] envClasses = plugins.getExtends(ControllerEnvironment.class);
      for (int i = 0; i < envClasses.length; i++) {
        try {
          ControllerEnvironment.logln("ControllerEnvironment " + envClasses[i].getName() + " loaded by " + envClasses[i].getClassLoader());
          

          ControllerEnvironment ce = (ControllerEnvironment)envClasses[i].newInstance();
          
          if (ce.isSupported()) {
            addControllers(ce.getControllers());
            loadedPlugins.add(ce.getClass().getName());
          } else {
            logln(envClasses[i].getName() + " is not supported");
          }
        } catch (Throwable e) {
          e.printStackTrace();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  


  private void addControllers(Controller[] c)
  {
    for (int i = 0; i < c.length; i++) {
      controllers.add(c[i]);
    }
  }
  
  public boolean isSupported() {
    return true;
  }
}
