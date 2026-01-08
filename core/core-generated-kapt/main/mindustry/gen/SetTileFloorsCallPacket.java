package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.net.Packet;
import mindustry.world.Block;

public class SetTileFloorsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public Block block;

  public int[] positions;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeBlock(WRITE, block);
    mindustry.io.TypeIO.writeInts(WRITE, positions);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    block = mindustry.io.TypeIO.readBlock(READ);
    positions = mindustry.io.TypeIO.readInts(READ);
  }

  @Override
  public void handleClient() {
    mindustry.world.Tile.setTileFloors(block, positions);
  }
}
