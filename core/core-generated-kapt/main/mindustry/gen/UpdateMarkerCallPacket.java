package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.logic.LMarkerControl;
import mindustry.net.Packet;

public class UpdateMarkerCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int id;

  public LMarkerControl control;

  public double p1;

  public double p2;

  public double p3;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(id);
    mindustry.io.TypeIO.writeMarkerControl(WRITE, control);
    WRITE.d(p1);
    WRITE.d(p2);
    WRITE.d(p3);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    id = READ.i();
    control = mindustry.io.TypeIO.readMarkerControl(READ);
    p1 = READ.d();
    p2 = READ.d();
    p3 = READ.d();
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.updateMarker(id, control, p1, p2, p3);
  }
}
