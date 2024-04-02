package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {

	public native int decodeHeader(TheoraInfo arg0, TheoraComment arg1, OggPacket arg2);

	public native void clear();
}
