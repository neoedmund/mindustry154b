package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.net.Packet;

public class TextInputCallPacket2 extends Packet {
  private byte[] DATA = NODATA;

  public int textInputId;

  public String title;

  public String message;

  public int textLength;

  public String def;

  public boolean numeric;

  public boolean allowEmpty;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(textInputId);
    mindustry.io.TypeIO.writeString(WRITE, title);
    mindustry.io.TypeIO.writeString(WRITE, message);
    WRITE.i(textLength);
    mindustry.io.TypeIO.writeString(WRITE, def);
    WRITE.bool(numeric);
    WRITE.bool(allowEmpty);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    textInputId = READ.i();
    title = mindustry.io.TypeIO.readString(READ);
    message = mindustry.io.TypeIO.readString(READ);
    textLength = READ.i();
    def = mindustry.io.TypeIO.readString(READ);
    numeric = READ.bool();
    allowEmpty = READ.bool();
  }

  @Override
  public void handleClient() {
    mindustry.ui.Menus.textInput(textInputId, title, message, textLength, def, numeric, allowEmpty);
  }
}
