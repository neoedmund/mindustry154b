package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;

public class DestroyPayloadCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Building build;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBuilding(WRITE, build);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    build = mindustry.io.TypeIO.readBuilding(READ);
  }

  @Override
  public void handleClient() {
    mindustry.game.Teams.destroyPayload(build);
  }
}
