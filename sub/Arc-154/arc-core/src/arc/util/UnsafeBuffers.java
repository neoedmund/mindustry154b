package arc.util;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/***
 * neoe: no more unsafe
 */
public class UnsafeBuffers {
	final public static Field address, capacity;

	final public static boolean failed = false;

	static {
		try {
			address = Buffer.class.getDeclaredField("address");
			address.setAccessible(true);
			capacity = Buffer.class.getDeclaredField("capacity");
			capacity.setAccessible(true);
		} catch (Exception e) {
			throw new AssertionError(e);
		}
	}

	public static ByteBuffer wrapAddress(long addr, int length) {
		ByteBuffer bb = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
		try {
			address.setLong(bb, addr);
			capacity.setInt(bb, length);
			bb.clear();
			return bb;
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		}
	}

	public static long getAddr(Buffer bb) {
		try {
			return address.getLong(bb);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		}
	}

	public static void copy(Buffer src, int srcPos, Buffer dst, int dstPos, int length) {
		ByteBuffer a = wrapAddress(getAddr(src) + srcPos, length);
		ByteBuffer b = wrapAddress(getAddr(dst) + dstPos, length);
		b.put(a);
	}
}
