package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.type.Item;

public class SetTileItemsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Item item;

  public int amount;

  public int[] positions;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeItem(WRITE, item);
    WRITE.i(amount);
    mindustry.io.TypeIO.writeInts(WRITE, positions);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    item = mindustry.io.TypeIO.readItem(READ);
    amount = READ.i();
    positions = mindustry.io.TypeIO.readInts(READ);
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setTileItems(item, amount, positions);
  }
}
