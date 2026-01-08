package mindustry.gen;

/**
 * Bits used: 48 / 64
 * <br>  dir [0..8]
 * <br>  portal [8..16]
 * <br>  cost [16..48]
 */
public final class IntraEdge {
  public static final long bitMaskDir = (long)(0b0000000000000000000000000000000000000000000000000000000011111111L);

  public static final long bitMaskPortal = (long)(0b0000000000000000000000000000000000000000000000001111111100000000L);

  public static final long bitMaskCost = (long)(0b0000000000000000111111111111111111111111111111110000000000000000L);

  public static int dir(long intraedge) {
    return (int)((intraedge >>> 0) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long dir(long intraedge, int value) {
    return (long)((intraedge & (~0b0000000000000000000000000000000000000000000000000000000011111111L)) | ((long)value << 0L));
  }

  public static int portal(long intraedge) {
    return (int)((intraedge >>> 8) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long portal(long intraedge, int value) {
    return (long)((intraedge & (~0b0000000000000000000000000000000000000000000000001111111100000000L)) | ((long)value << 8L));
  }

  public static float cost(long intraedge) {
    return Float.intBitsToFloat((int)((intraedge >>> 16) & 0b0000000000000000000000000000000011111111111111111111111111111111L));
  }

  public static long cost(long intraedge, float value) {
    return (long)((intraedge & (~0b0000000000000000111111111111111111111111111111110000000000000000L)) | ((long)Float.floatToIntBits(value) << 16L));
  }

  public static long get(int dir, int portal, float cost) {
    return (long)((((long)dir << 0L) & 0b0000000000000000000000000000000000000000000000000000000011111111L) | (((long)portal << 8L) & 0b0000000000000000000000000000000000000000000000001111111100000000L) | ((long)Float.floatToIntBits(cost) << 16L));
  }
}
