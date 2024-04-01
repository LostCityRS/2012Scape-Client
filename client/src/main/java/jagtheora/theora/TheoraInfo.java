package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {

	public int frameWidth;

	public int frameHeight;

	public int fpsNumerator;

	public int fpsDenominator;

	static {
		initFields();
	}

	public TheoraInfo() {
		this.init();
		if (this.method52()) {
			throw new IllegalStateException();
		}
	}

	public static native void initFields();

	public native void init();

	public native void clear();
}
