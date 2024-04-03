package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {

    public TheoraComment() {
        this.init();
        if (this.method52()) {
            throw new IllegalStateException();
        }
    }

    public native void init();

    public native void clear();
}
