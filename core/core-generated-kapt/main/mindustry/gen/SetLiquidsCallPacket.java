package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.type.LiquidStack;

public class SetLiquidsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Building build;

  public LiquidStack[] liquids;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBuilding(WRITE, build);
    mindustry.io.TypeIO.writeLiquidStacks(WRITE, liquids);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    build = mindustry.io.TypeIO.readBuilding(READ);
    liquids = mindustry.io.TypeIO.readLiquidStacks(READ);
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setLiquids(build, liquids);
  }
}
