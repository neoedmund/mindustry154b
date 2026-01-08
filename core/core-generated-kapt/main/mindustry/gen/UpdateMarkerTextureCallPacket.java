package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.net.Packet;

public class UpdateMarkerTextureCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int id;

  public String textureName;

  @Override
  public void write(Writes WRITE) {
    WRITE.i(id);
    mindustry.io.TypeIO.writeString(WRITE, textureName);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    id = READ.i();
    textureName = mindustry.io.TypeIO.readString(READ);
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.updateMarkerTexture(id, textureName);
  }
}
