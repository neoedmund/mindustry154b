package mindustry.gen;

/**
 * Bits used: 64 / 64
 * <br>  pos [0..32]
 * <br>  time [32..64]
 */
public final class Indicator {
  public static final long bitMaskPos = (long)(0b0000000000000000000000000000000011111111111111111111111111111111L);

  public static final long bitMaskTime = (long)(0b1111111111111111111111111111111100000000000000000000000000000000L);

  public static int pos(long indicator) {
    return (int)((indicator >>> 0) & 0b0000000000000000000000000000000011111111111111111111111111111111L);
  }

  public static long pos(long indicator, int value) {
    return (long)((indicator & (~0b0000000000000000000000000000000011111111111111111111111111111111L)) | ((long)value << 0L));
  }

  public static float time(long indicator) {
    return Float.intBitsToFloat((int)((indicator >>> 32) & 0b0000000000000000000000000000000011111111111111111111111111111111L));
  }

  public static long time(long indicator, float value) {
    return (long)((indicator & (~0b1111111111111111111111111111111100000000000000000000000000000000L)) | ((long)Float.floatToIntBits(value) << 32L));
  }

  public static long get(int pos, float time) {
    return (long)((((long)pos << 0L) & 0b0000000000000000000000000000000011111111111111111111111111111111L) | ((long)Float.floatToIntBits(time) << 32L));
  }
}
