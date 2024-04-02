package jagtheora.misc;

import deob.ObfuscatedName;

public abstract class SimplePeer {

	public long peer;

	static {
		init();
	}

	@ObfuscatedName("jagtheora/misc/SimplePeer.u()Z")
	public final boolean method52() {
		return this.peer == 0L;
	}

	public final void setPeer(long arg0) {
		this.peer = arg0;
	}

	@ObfuscatedName("jagtheora/misc/SimplePeer.j()V")
	public final void method53() {
		if (!this.method52()) {
			this.clear();
		}
	}

	public void finalize() throws Throwable {
		if (!this.method52()) {
			this.method53();
		}
		super.finalize();
	}

	static native void init();

	public abstract void clear();
}
