package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import mindustry.net.NetConnection;
import mindustry.net.Packet;

public class ClientLogicDataUnreliableCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public String channel;

  public Object value;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeString(WRITE, channel);
    mindustry.io.TypeIO.writeObject(WRITE, value);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    channel = mindustry.io.TypeIO.readString(READ);
    value = mindustry.io.TypeIO.readObject(READ);
  }

  @Override
  public void handleServer(NetConnection con) {
    if(con.player == null || con.kicked) {
      return;
    }
    mindustry.gen.Player player = con.player;
    mindustry.core.NetServer.clientLogicDataUnreliable(player, channel, value);
  }
}
