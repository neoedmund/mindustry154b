package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;

public class CompleteObjectiveCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int index;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(index);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    index = READ.i();
  }

  @Override
  public void handleClient() {
    mindustry.core.NetClient.completeObjective(index);
  }
}
