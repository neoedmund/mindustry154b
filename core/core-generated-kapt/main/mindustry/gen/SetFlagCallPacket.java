package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.net.Packet;

public class SetFlagCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public String flag;

  public boolean add;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeString(WRITE, flag);
    WRITE.bool(add);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    flag = mindustry.io.TypeIO.readString(READ);
    add = READ.bool();
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.setFlag(flag, add);
  }
}
