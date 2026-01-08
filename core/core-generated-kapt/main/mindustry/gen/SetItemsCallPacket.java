package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.type.ItemStack;

public class SetItemsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Building build;

  public ItemStack[] items;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBuilding(WRITE, build);
    mindustry.io.TypeIO.writeItemStacks(WRITE, items);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    build = mindustry.io.TypeIO.readBuilding(READ);
    items = mindustry.io.TypeIO.readItemStacks(READ);
  }

  @Override
  public void handleClient() {
    mindustry.input.InputHandler.setItems(build, items);
  }
}
