package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;

public class HideFollowUpMenuCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int menuId;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(menuId);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    menuId = READ.i();
  }

  @Override
  public void handleClient() {
    mindustry.ui.Menus.hideFollowUpMenu(menuId);
  }
}
