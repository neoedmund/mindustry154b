package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.net.Packet;

public class ClientBinaryPacketUnreliableCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public String type;

  public byte[] contents;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeString(WRITE, type);
    mindustry.io.TypeIO.writeBytes(WRITE, contents);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    type = mindustry.io.TypeIO.readString(READ);
    contents = mindustry.io.TypeIO.readBytes(READ);
  }

  @Override
  public void handleClient() {
    mindustry.core.NetClient.clientBinaryPacketUnreliable(type, contents);
  }
}
