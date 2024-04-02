package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {

	public DSPState(VorbisInfo arg0) {
		this.init(arg0);
		if (this.method52()) {
			throw new IllegalStateException();
		}
	}

	public native void init(VorbisInfo arg0);

	public native void blockIn(VorbisBlock arg0);

	public native float[][] pcmOut(int arg0);

	public native void read(int arg0);

	public native double granuleTime();

	public native void clear();
}
