package mindustry.gen;

/**
 * Bits used: 48 / 64
 * <br>  item [0..16]
 * <br>  time [16..48]
 */
public final class BufferItem {
  public static final long bitMaskItem = (long)(0b0000000000000000000000000000000000000000000000001111111111111111L);

  public static final long bitMaskTime = (long)(0b0000000000000000111111111111111111111111111111110000000000000000L);

  public static short item(long bufferitem) {
    return (short)((bufferitem >>> 0) & 0b0000000000000000000000000000000000000000000000001111111111111111L);
  }

  public static long item(long bufferitem, short value) {
    return (long)((bufferitem & (~0b0000000000000000000000000000000000000000000000001111111111111111L)) | ((long)value << 0L));
  }

  public static float time(long bufferitem) {
    return Float.intBitsToFloat((int)((bufferitem >>> 16) & 0b0000000000000000000000000000000011111111111111111111111111111111L));
  }

  public static long time(long bufferitem, float value) {
    return (long)((bufferitem & (~0b0000000000000000111111111111111111111111111111110000000000000000L)) | ((long)Float.floatToIntBits(value) << 16L));
  }

  public static long get(short item, float time) {
    return (long)((((long)item << 0L) & 0b0000000000000000000000000000000000000000000000001111111111111111L) | ((long)Float.floatToIntBits(time) << 16L));
  }
}
