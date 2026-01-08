package mindustry.gen;

/**
 * Bits used: 8 / 8
 * <br>  character [0..6]
 * <br>  rotation [6..8]
 */
public final class CharOverlayData {
  public static final byte bitMaskCharacter = (byte)(0b00111111L);

  public static final byte bitMaskRotation = (byte)(0b11000000L);

  public static byte character(byte charoverlaydata) {
    return (byte)((charoverlaydata >>> 0) & 0b00111111L);
  }

  public static byte character(byte charoverlaydata, byte value) {
    return (byte)((charoverlaydata & (~0b00111111L)) | ((byte)value << 0L));
  }

  public static byte rotation(byte charoverlaydata) {
    return (byte)((charoverlaydata >>> 6) & 0b00000011L);
  }

  public static byte rotation(byte charoverlaydata, byte value) {
    return (byte)((charoverlaydata & (~0b11000000L)) | ((byte)value << 6L));
  }

  public static byte get(byte character, byte rotation) {
    return (byte)((((byte)character << 0L) & 0b00111111L) | (((byte)rotation << 6L) & 0b11000000L));
  }
}
