package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {

	public long position;

	static {
		init();
	}

	public static native void init();

	public native void clear();
}
