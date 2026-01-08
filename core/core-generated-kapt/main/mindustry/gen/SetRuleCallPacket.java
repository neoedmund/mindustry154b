package mindustry.gen;

import arc.util.io.Reads;
import arc.util.io.Writes;
import java.lang.Override;
import java.lang.String;
import mindustry.net.Packet;

public class SetRuleCallPacket extends Packet {
  private byte[] DATA = NODATA;

  public String rule;

  public String jsonData;

  @Override
  public void write(Writes WRITE) {
    mindustry.io.TypeIO.writeString(WRITE, rule);
    mindustry.io.TypeIO.writeString(WRITE, jsonData);
  }

  @Override
  public void read(Reads READ, int LENGTH) {
    DATA = READ.b(LENGTH);
  }

  @Override
  public void handled() {
    BAIS.setBytes(DATA);
    rule = mindustry.io.TypeIO.readString(READ);
    jsonData = mindustry.io.TypeIO.readString(READ);
  }

  @Override
  public void handleClient() {
    mindustry.core.NetClient.setRule(rule, jsonData);
  }
}
