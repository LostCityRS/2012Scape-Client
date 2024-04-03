package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer {

    public DecoderContext(TheoraInfo arg0, SetupInfo arg1) {
        this.init(arg0, arg1);
        if (this.method52()) {
            throw new IllegalArgumentException("");
        }
    }

    public native void init(TheoraInfo arg0, SetupInfo arg1);

    public native int decodePacketIn(OggPacket arg0, GranulePos arg1);

    public native int decodeFrame(Frame arg0);

    public native long granuleFrame(GranulePos arg0);

    public native double granuleTime(GranulePos arg0);

    public native int getMaxPostProcessingLevel();

    public native int setPostProcessingLevel(int arg0);

    public native int setGranulePosition(long arg0);

    public native void clear();
}
