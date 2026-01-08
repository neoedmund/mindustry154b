package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.logic.LMarkerControl;
import mindustry.net.Packet;

public class UpdateMarkerTextCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int id;

  public LMarkerControl type;

  public boolean fetch;

  public String text;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(id);
    mindustry.io.TypeIO.writeMarkerControl(WRITE, type);
    WRITE.bool(fetch);
    mindustry.io.TypeIO.writeString(WRITE, text);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    id = READ.i();
    type = mindustry.io.TypeIO.readMarkerControl(READ);
    fetch = READ.bool();
    text = mindustry.io.TypeIO.readString(READ);
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.updateMarkerText(id, type, fetch, text);
  }
}
