package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.game.MapObjectives;
import mindustry.net.Packet;

public class CreateMarkerCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int id;

  public MapObjectives.ObjectiveMarker marker;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(id);
    mindustry.io.TypeIO.writeObjectiveMarker(WRITE, marker);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    id = READ.i();
    marker = mindustry.io.TypeIO.readObjectiveMarker(READ);
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.createMarker(id, marker);
  }
}
