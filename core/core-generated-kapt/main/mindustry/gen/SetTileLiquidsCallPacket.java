package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.type.Liquid;

public class SetTileLiquidsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Liquid liquid;

  public float amount;

  public int[] positions;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeLiquid(WRITE, liquid);
    WRITE.f(amount);
    mindustry.io.TypeIO.writeInts(WRITE, positions);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    liquid = mindustry.io.TypeIO.readLiquid(READ);
    amount = READ.f();
    positions = mindustry.io.TypeIO.readInts(READ);
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setTileLiquids(liquid, amount, positions);
  }
}
