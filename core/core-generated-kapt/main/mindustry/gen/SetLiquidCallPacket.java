package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.type.Liquid;

public class SetLiquidCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Building build;

  public Liquid liquid;

  public float amount;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBuilding(WRITE, build);
    mindustry.io.TypeIO.writeLiquid(WRITE, liquid);
    WRITE.f(amount);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    build = mindustry.io.TypeIO.readBuilding(READ);
    liquid = mindustry.io.TypeIO.readLiquid(READ);
    amount = READ.f();
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setLiquid(build, liquid, amount);
  }
}
