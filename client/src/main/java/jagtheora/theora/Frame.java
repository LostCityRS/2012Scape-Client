package jagtheora.theora;

import deob.ObfuscatedName;
import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {

	public int[] pixels;

	@ObfuscatedName("jagtheora/theora/Frame.u")
	public final int field360;

	@ObfuscatedName("jagtheora/theora/Frame.j")
	public final int field361;

	static {
		init();
	}

	public Frame(int arg0, int arg1) {
		this.field360 = arg0 * 1100592799;
		this.field361 = arg1 * 1932243891;
		this.pixels = new int[this.field361 * 737948539 * this.field360 * -1899502241];
	}

	public static native void init();

	public native void clear();
}
