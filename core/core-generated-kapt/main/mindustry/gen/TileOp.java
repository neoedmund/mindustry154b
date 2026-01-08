package mindustry.gen;

/**
 * Bits used: 63 / 64
 * <br>  x [0..14]
 * <br>  y [14..28]
 * <br>  type [28..31]
 * <br>  value [31..63]
 */
public final class TileOp {
  public static final long bitMaskX = (long)(0b0000000000000000000000000000000000000000000000000011111111111111L);

  public static final long bitMaskY = (long)(0b0000000000000000000000000000000000001111111111111100000000000000L);

  public static final long bitMaskType = (long)(0b0000000000000000000000000000000001110000000000000000000000000000L);

  public static final long bitMaskValue = (long)(0b0111111111111111111111111111111110000000000000000000000000000000L);

  public static int x(long tileop) {
    return (int)((tileop >>> 0) & 0b0000000000000000000000000000000000000000000000000011111111111111L);
  }

  public static long x(long tileop, int value) {
    return (long)((tileop & (~0b0000000000000000000000000000000000000000000000000011111111111111L)) | ((long)value << 0L));
  }

  public static int y(long tileop) {
    return (int)((tileop >>> 14) & 0b0000000000000000000000000000000000000000000000000011111111111111L);
  }

  public static long y(long tileop, int value) {
    return (long)((tileop & (~0b0000000000000000000000000000000000001111111111111100000000000000L)) | ((long)value << 14L));
  }

  public static int type(long tileop) {
    return (int)((tileop >>> 28) & 0b0000000000000000000000000000000000000000000000000000000000000111L);
  }

  public static long type(long tileop, int value) {
    return (long)((tileop & (~0b0000000000000000000000000000000001110000000000000000000000000000L)) | ((long)value << 28L));
  }

  public static int value(long tileop) {
    return (int)((tileop >>> 31) & 0b0000000000000000000000000000000011111111111111111111111111111111L);
  }

  public static long value(long tileop, int value) {
    return (long)((tileop & (~0b0111111111111111111111111111111110000000000000000000000000000000L)) | ((long)value << 31L));
  }

  public static long get(int x, int y, int type, int value) {
    return (long)((((long)x << 0L) & 0b0000000000000000000000000000000000000000000000000011111111111111L) | (((long)y << 14L) & 0b0000000000000000000000000000000000001111111111111100000000000000L) | (((long)type << 28L) & 0b0000000000000000000000000000000001110000000000000000000000000000L) | (((long)value << 31L) & 0b0111111111111111111111111111111110000000000000000000000000000000L));
  }
}
