package mindustry.gen;

/**
 * Bits used: 48 / 64
 * <br>  pos [0..32]
 * <br>  costId [32..40]
 * <br>  team [40..48]
 */
public final class FieldIndex {
  public static final long bitMaskPos = (long)(0b0000000000000000000000000000000011111111111111111111111111111111L);

  public static final long bitMaskCostId = (long)(0b0000000000000000000000001111111100000000000000000000000000000000L);

  public static final long bitMaskTeam = (long)(0b0000000000000000111111110000000000000000000000000000000000000000L);

  public static int pos(long fieldindex) {
    return (int)((fieldindex >>> 0) & 0b0000000000000000000000000000000011111111111111111111111111111111L);
  }

  public static long pos(long fieldindex, int value) {
    return (long)((fieldindex & (~0b0000000000000000000000000000000011111111111111111111111111111111L)) | ((long)value << 0L));
  }

  public static int costId(long fieldindex) {
    return (int)((fieldindex >>> 32) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long costId(long fieldindex, int value) {
    return (long)((fieldindex & (~0b0000000000000000000000001111111100000000000000000000000000000000L)) | ((long)value << 32L));
  }

  public static int team(long fieldindex) {
    return (int)((fieldindex >>> 40) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long team(long fieldindex, int value) {
    return (long)((fieldindex & (~0b0000000000000000111111110000000000000000000000000000000000000000L)) | ((long)value << 40L));
  }

  public static long get(int pos, int costId, int team) {
    return (long)((((long)pos << 0L) & 0b0000000000000000000000000000000011111111111111111111111111111111L) | (((long)costId << 32L) & 0b0000000000000000000000001111111100000000000000000000000000000000L) | (((long)team << 40L) & 0b0000000000000000111111110000000000000000000000000000000000000000L));
  }
}
