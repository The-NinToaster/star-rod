package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.ByteBuffer;




































final class KeyboardEventQueue
  extends EventQueue
  implements KeyListener
{
  private static final int[] KEY_MAP = new int[65535];
  
  private final byte[] key_states = new byte['Ā'];
  

  private final ByteBuffer event = ByteBuffer.allocate(18);
  
  private final Component component;
  private boolean has_deferred_event;
  private long deferred_nanos;
  private int deferred_key_code;
  private int deferred_key_location;
  private byte deferred_key_state;
  private int deferred_character;
  
  static
  {
    KEY_MAP[48] = 11;
    KEY_MAP[49] = 2;
    KEY_MAP[50] = 3;
    KEY_MAP[51] = 4;
    KEY_MAP[52] = 5;
    KEY_MAP[53] = 6;
    KEY_MAP[54] = 7;
    KEY_MAP[55] = 8;
    KEY_MAP[56] = 9;
    KEY_MAP[57] = 10;
    KEY_MAP[65] = 30;
    
    KEY_MAP[107] = 78;
    



    KEY_MAP[65406] = 184;
    

    KEY_MAP['Ȁ'] = 145;
    KEY_MAP[66] = 48;
    
    KEY_MAP[92] = 43;
    KEY_MAP[8] = 14;
    

    KEY_MAP[67] = 46;
    
    KEY_MAP[20] = 58;
    KEY_MAP['Ȃ'] = 144;
    
    KEY_MAP[93] = 27;
    
    KEY_MAP['ȁ'] = 146;
    KEY_MAP[44] = 51;
    

    KEY_MAP[28] = 121;
    

    KEY_MAP[68] = 32;
    















    KEY_MAP[110] = 83;
    KEY_MAP[127] = 211;
    KEY_MAP[111] = 181;
    
    KEY_MAP[40] = 208;
    KEY_MAP[69] = 18;
    KEY_MAP[35] = 207;
    KEY_MAP[10] = 28;
    KEY_MAP[61] = 13;
    KEY_MAP[27] = 1;
    

    KEY_MAP[70] = 33;
    KEY_MAP[112] = 59;
    KEY_MAP[121] = 68;
    KEY_MAP[122] = 87;
    KEY_MAP[123] = 88;
    KEY_MAP[61440] = 100;
    KEY_MAP[61441] = 101;
    KEY_MAP[61442] = 102;
    



    KEY_MAP[113] = 60;
    




    KEY_MAP[114] = 61;
    KEY_MAP[115] = 62;
    KEY_MAP[116] = 63;
    KEY_MAP[117] = 64;
    KEY_MAP[118] = 65;
    KEY_MAP[119] = 66;
    KEY_MAP[120] = 67;
    


    KEY_MAP[71] = 34;
    
    KEY_MAP[72] = 35;
    


    KEY_MAP[36] = 199;
    KEY_MAP[73] = 23;
    
    KEY_MAP[''] = 210;
    
    KEY_MAP[74] = 36;
    


    KEY_MAP[75] = 37;
    KEY_MAP[21] = 112;
    
    KEY_MAP[25] = 148;
    




    KEY_MAP[76] = 38;
    KEY_MAP[37] = 203;
    

    KEY_MAP[77] = 50;
    
    KEY_MAP[45] = 12;
    
    KEY_MAP[106] = 55;
    KEY_MAP[78] = 49;
    
    KEY_MAP[''] = 69;
    
    KEY_MAP[96] = 82;
    KEY_MAP[97] = 79;
    KEY_MAP[98] = 80;
    KEY_MAP[99] = 81;
    KEY_MAP[100] = 75;
    KEY_MAP[101] = 76;
    KEY_MAP[102] = 77;
    KEY_MAP[103] = 71;
    KEY_MAP[104] = 72;
    KEY_MAP[105] = 73;
    KEY_MAP[79] = 24;
    KEY_MAP[91] = 26;
    KEY_MAP[80] = 25;
    KEY_MAP[34] = 209;
    KEY_MAP[33] = 201;
    
    KEY_MAP[19] = 197;
    KEY_MAP[46] = 52;
    



    KEY_MAP[81] = 16;
    

    KEY_MAP[82] = 19;
    KEY_MAP[39] = 205;
    

    KEY_MAP[83] = 31;
    KEY_MAP[''] = 70;
    KEY_MAP[59] = 39;
    KEY_MAP[108] = 83;
    
    KEY_MAP[47] = 53;
    KEY_MAP[32] = 57;
    KEY_MAP[65480] = 149;
    KEY_MAP[109] = 74;
    KEY_MAP[84] = 20;
    KEY_MAP[9] = 15;
    KEY_MAP[85] = 22;
    

    KEY_MAP[38] = 200;
    KEY_MAP[86] = 47;
    KEY_MAP[87] = 17;
    KEY_MAP[88] = 45;
    KEY_MAP[89] = 21;
    KEY_MAP[90] = 44;
  }
  
  KeyboardEventQueue(Component component) {
    super(18);
    this.component = component;
  }
  
  public void register() {
    component.addKeyListener(this);
  }
  







  private void putKeyboardEvent(int key_code, byte state, int character, long nanos, boolean repeat)
  {
    event.clear();
    event.putInt(key_code).put(state).putInt(character).putLong(nanos).put((byte)(repeat ? 1 : 0));
    event.flip();
    putEvent(event);
  }
  
  public synchronized void poll(ByteBuffer key_down_buffer) {
    flushDeferredEvent();
    int old_position = key_down_buffer.position();
    key_down_buffer.put(key_states);
    key_down_buffer.position(old_position);
  }
  
  public synchronized void copyEvents(ByteBuffer dest) {
    flushDeferredEvent();
    super.copyEvents(dest);
  }
  
  private synchronized void handleKey(int key_code, int key_location, byte state, int character, long nanos) {
    if (character == 65535)
      character = 0;
    if (state == 1) {
      boolean repeat = false;
      if (has_deferred_event)
        if ((nanos == deferred_nanos) && (deferred_key_code == key_code) && (deferred_key_location == key_location))
        {
          has_deferred_event = false;
          repeat = true;
        } else {
          flushDeferredEvent();
        }
      putKeyEvent(key_code, key_location, state, character, nanos, repeat);
    } else {
      flushDeferredEvent();
      has_deferred_event = true;
      deferred_nanos = nanos;
      deferred_key_code = key_code;
      deferred_key_location = key_location;
      deferred_key_state = state;
      deferred_character = character;
    }
  }
  
  private void flushDeferredEvent() {
    if (has_deferred_event) {
      putKeyEvent(deferred_key_code, deferred_key_location, deferred_key_state, deferred_character, deferred_nanos, false);
      has_deferred_event = false;
    }
  }
  
  private void putKeyEvent(int key_code, int key_location, byte state, int character, long nanos, boolean repeat) {
    int key_code_mapped = getMappedKeyCode(key_code, key_location);
    
    if (key_states[key_code_mapped] == state)
      repeat = true;
    key_states[key_code_mapped] = state;
    int key_int_char = character & 0xFFFF;
    putKeyboardEvent(key_code_mapped, state, key_int_char, nanos, repeat);
  }
  
  private int getMappedKeyCode(int key_code, int position)
  {
    switch (key_code) {
    case 18: 
      if (position == 3) {
        return 184;
      }
      return 56;
    case 157: 
      if (position == 3) {
        return 220;
      }
      return 219;
    case 16: 
      if (position == 3) {
        return 54;
      }
      return 42;
    case 17: 
      if (position == 3) {
        return 157;
      }
      return 29;
    }
    return KEY_MAP[key_code];
  }
  
  public void keyPressed(KeyEvent e)
  {
    handleKey(e.getKeyCode(), e.getKeyLocation(), (byte)1, e.getKeyChar(), e.getWhen() * 1000000L);
  }
  
  public void keyReleased(KeyEvent e) {
    handleKey(e.getKeyCode(), e.getKeyLocation(), (byte)0, 0, e.getWhen() * 1000000L);
  }
  
  public void unregister() {}
  
  public void keyTyped(KeyEvent e) {}
}
