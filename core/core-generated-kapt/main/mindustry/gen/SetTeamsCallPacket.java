package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import mindustry.game.Team;
import mindustry.net.Packet;

public class SetTeamsCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public int[] positions;

  public Team team;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeInts(WRITE, positions);
    mindustry.io.TypeIO.writeTeam(WRITE, team);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    positions = mindustry.io.TypeIO.readInts(READ);
    team = mindustry.io.TypeIO.readTeam(READ);
  }

  @Override
  public void handleClient() {
    mindustry.world.Tile.setTeams(positions, team);
  }
}
