package mindustry.gen;

/**
 * Bits used: 56 / 64
 * <br>  extraData [0..32]
 * <br>  data [32..40]
 * <br>  floorData [40..48]
 * <br>  overlayData [48..56]
 */
public final class PackedTileData {
  public static final long bitMaskExtraData = (long)(0b0000000000000000000000000000000011111111111111111111111111111111L);

  public static final long bitMaskData = (long)(0b0000000000000000000000001111111100000000000000000000000000000000L);

  public static final long bitMaskFloorData = (long)(0b0000000000000000111111110000000000000000000000000000000000000000L);

  public static final long bitMaskOverlayData = (long)(0b0000000011111111000000000000000000000000000000000000000000000000L);

  public static int extraData(long packedtiledata) {
    return (int)((packedtiledata >>> 0) & 0b0000000000000000000000000000000011111111111111111111111111111111L);
  }

  public static long extraData(long packedtiledata, int value) {
    return (long)((packedtiledata & (~0b0000000000000000000000000000000011111111111111111111111111111111L)) | ((long)value << 0L));
  }

  public static byte data(long packedtiledata) {
    return (byte)((packedtiledata >>> 32) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long data(long packedtiledata, byte value) {
    return (long)((packedtiledata & (~0b0000000000000000000000001111111100000000000000000000000000000000L)) | ((long)value << 32L));
  }

  public static byte floorData(long packedtiledata) {
    return (byte)((packedtiledata >>> 40) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long floorData(long packedtiledata, byte value) {
    return (long)((packedtiledata & (~0b0000000000000000111111110000000000000000000000000000000000000000L)) | ((long)value << 40L));
  }

  public static byte overlayData(long packedtiledata) {
    return (byte)((packedtiledata >>> 48) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long overlayData(long packedtiledata, byte value) {
    return (long)((packedtiledata & (~0b0000000011111111000000000000000000000000000000000000000000000000L)) | ((long)value << 48L));
  }

  public static long get(int extraData, byte data, byte floorData, byte overlayData) {
    return (long)((((long)extraData << 0L) & 0b0000000000000000000000000000000011111111111111111111111111111111L) | (((long)data << 32L) & 0b0000000000000000000000001111111100000000000000000000000000000000L) | (((long)floorData << 40L) & 0b0000000000000000111111110000000000000000000000000000000000000000L) | (((long)overlayData << 48L) & 0b0000000011111111000000000000000000000000000000000000000000000000L));
  }
}
