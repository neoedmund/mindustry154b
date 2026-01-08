package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.entities.Units;
import mindustry.net.Packet;

public class UnitSpawnCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Units.UnitSyncContainer container;

  @Override
  public int getPriority() {
    return 0;
  }

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeUnitContainer(WRITE, container);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    container = mindustry.io.TypeIO.readUnitContainer(READ);
  }

  @Override
  public void handleClient() {
    mindustry.entities.Units.unitSpawn(container);
  }
}
