package mindustry.gen;

/**
 * Bits used: 32 / 32
 * <br>  cluster [0..22]
 * <br>  dir [22..24]
 * <br>  portal [24..32]
 */
public final class NodeIndex {
  public static final int bitMaskCluster = (int)(0b00000000001111111111111111111111L);

  public static final int bitMaskDir = (int)(0b00000000110000000000000000000000L);

  public static final int bitMaskPortal = (int)(0b11111111000000000000000000000000L);

  public static int cluster(int nodeindex) {
    return (int)((nodeindex >>> 0) & 0b00000000001111111111111111111111L);
  }

  public static int cluster(int nodeindex, int value) {
    return (int)((nodeindex & (~0b00000000001111111111111111111111L)) | ((int)value << 0L));
  }

  public static int dir(int nodeindex) {
    return (int)((nodeindex >>> 22) & 0b00000000000000000000000000000011L);
  }

  public static int dir(int nodeindex, int value) {
    return (int)((nodeindex & (~0b00000000110000000000000000000000L)) | ((int)value << 22L));
  }

  public static int portal(int nodeindex) {
    return (int)((nodeindex >>> 24) & 0b00000000000000000000000011111111L);
  }

  public static int portal(int nodeindex, int value) {
    return (int)((nodeindex & (~0b11111111000000000000000000000000L)) | ((int)value << 24L));
  }

  public static int get(int cluster, int dir, int portal) {
    return (int)((((int)cluster << 0L) & 0b00000000001111111111111111111111L) | (((int)dir << 22L) & 0b00000000110000000000000000000000L) | (((int)portal << 24L) & 0b11111111000000000000000000000000L));
  }
}
