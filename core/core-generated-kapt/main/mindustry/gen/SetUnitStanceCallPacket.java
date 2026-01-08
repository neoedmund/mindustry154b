package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.ai.UnitStance;
import mindustry.net.NetConnection;
import mindustry.net.Packet;

public class SetUnitStanceCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Player player;

  public int[] unitIds;

  public UnitStance stance;

  public boolean enable;

  @Override
  public void write(Writes WRITE) {
    if(mindustry.Vars.net.server()) {
      mindustry.io.TypeIO.writeEntity(WRITE, player);
    }
    mindustry.io.TypeIO.writeInts(WRITE, unitIds);
    mindustry.io.TypeIO.writeStance(WRITE, stance);
    WRITE.bool(enable);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    if(mindustry.Vars.net.client()) {
      player = mindustry.io.TypeIO.readEntity(READ);
    }
    unitIds = mindustry.io.TypeIO.readInts(READ);
    stance = mindustry.io.TypeIO.readStance(READ);
    enable = READ.bool();
  }

  @Override
  public void handleServer(NetConnection con) {
    if(con.player == null || con.kicked) {
      return;
    }
    mindustry.gen.Player player = con.player;
    mindustry.input.InputHandler.setUnitStance(player, unitIds, stance, enable);
    mindustry.gen.Call.setUnitStance__forward(con, player, unitIds, stance, enable);
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setUnitStance(player, unitIds, stance, enable);
  }
}
