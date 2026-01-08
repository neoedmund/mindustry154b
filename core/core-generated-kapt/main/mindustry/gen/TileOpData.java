package mindustry.gen;

/**
 * Bits used: 24 / 32
 * <br>  data [0..8]
 * <br>  floorData [8..16]
 * <br>  overlayData [16..24]
 */
public final class TileOpData {
  public static final int bitMaskData = (int)(0b00000000000000000000000011111111L);

  public static final int bitMaskFloorData = (int)(0b00000000000000001111111100000000L);

  public static final int bitMaskOverlayData = (int)(0b00000000111111110000000000000000L);

  public static byte data(int tileopdata) {
    return (byte)((tileopdata >>> 0) & 0b00000000000000000000000011111111L);
  }

  public static int data(int tileopdata, byte value) {
    return (int)((tileopdata & (~0b00000000000000000000000011111111L)) | ((int)value << 0L));
  }

  public static byte floorData(int tileopdata) {
    return (byte)((tileopdata >>> 8) & 0b00000000000000000000000011111111L);
  }

  public static int floorData(int tileopdata, byte value) {
    return (int)((tileopdata & (~0b00000000000000001111111100000000L)) | ((int)value << 8L));
  }

  public static byte overlayData(int tileopdata) {
    return (byte)((tileopdata >>> 16) & 0b00000000000000000000000011111111L);
  }

  public static int overlayData(int tileopdata, byte value) {
    return (int)((tileopdata & (~0b00000000111111110000000000000000L)) | ((int)value << 16L));
  }

  public static int get(byte data, byte floorData, byte overlayData) {
    return (int)((((int)data << 0L) & 0b00000000000000000000000011111111L) | (((int)floorData << 8L) & 0b00000000000000001111111100000000L) | (((int)overlayData << 16L) & 0b00000000111111110000000000000000L));
  }
}
