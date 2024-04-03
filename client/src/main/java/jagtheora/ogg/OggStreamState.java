package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {

    public OggStreamState(int arg0) {
        if (!this.init(arg0)) {
            throw new IllegalStateException();
        }
    }

    public native boolean init(int arg0);

    public native boolean isEOS();

    public native boolean pageIn(OggPage arg0);

    public native int packetOut(OggPacket arg0);

    public native int packetOut();

    public native int packetPeek(OggPacket arg0);

    public native int packetPeek();

    public native boolean resetSerialNo(int arg0);

    public native boolean reset();

    public native void clear();
}
