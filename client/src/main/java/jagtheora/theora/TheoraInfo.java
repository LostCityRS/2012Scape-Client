package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {

	public byte versionMajor;

	public byte versionMinor;

	public byte versionSubMinor;

	public int frameWidth;

	public int frameHeight;

	public int picWidth;

	public int picHeight;

	public int picX;

	public int picY;

	public int fpsNumerator;

	public int fpsDenominator;

	public int aspectNumerator;

	public int aspectDenominator;

	public int colourSpace;

	public int pixelFormat;

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
