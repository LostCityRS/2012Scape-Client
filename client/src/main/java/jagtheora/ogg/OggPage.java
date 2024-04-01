package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPage extends SimplePeer {

	public native long getGranulePos();

	public native int getSerialNumber();

	public native long getPageNumber();

	public native int getCompletedPackets();

	public native int getVersion();

	public native boolean isContinued();

	public native boolean isBOS();

	public native boolean isEOS();

	public native void clear();
}
