package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Object;
import java.lang.Override;
import mindustry.net.Packet;

public class SyncVariableCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Building building;

  public int variable;

  public Object value;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBuilding(WRITE, building);
    WRITE.i(variable);
    mindustry.io.TypeIO.writeObject(WRITE, value);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    building = mindustry.io.TypeIO.readBuilding(READ);
    variable = READ.i();
    value = mindustry.io.TypeIO.readObject(READ);
  }

  @Override
  public void handleClient() {
    mindustry.logic.LExecutor.syncVariable(building, variable, value);
  }
}
