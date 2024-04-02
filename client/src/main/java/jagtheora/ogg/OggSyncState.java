package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {

	public OggSyncState() {
		this.init();
		if (this.method52()) {
			throw new IllegalStateException();
		}
	}

	public native void init();

	public native boolean write(byte[] arg0, int arg1);

	public native long pageSeek(OggPage arg0);

	public native int pageOut(OggPage arg0);

	public native boolean reset();

	public native void clear();
}
