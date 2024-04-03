package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPacket extends SimplePeer {

    public native int isHeader();

    public native int isKeyFrame();

    public native boolean isTheora();

    public native boolean isVorbis();

    public native byte[] getData();

    public native void clear();
}
