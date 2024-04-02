package jaclib.memory.heap;

import deob.ObfuscatedName;

public final class NativeHeap {

	public long peer;

	@ObfuscatedName("jaclib/memory/heap/NativeHeap.u")
	public final int field374;

	@ObfuscatedName("jaclib/memory/heap/NativeHeap.j")
	public boolean field375;

	public NativeHeap(int arg0) {
		this.field374 = arg0;
		this.allocateHeap(this.field374);
		this.field375 = true;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeap.u()Z")
	public synchronized boolean method69() {
		return this.field375;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeap.j(IZ)Ljaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer method70(int arg0, boolean arg1) {
		if (!this.field375) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeap.a()V")
	public synchronized void method71() {
		if (this.field375) {
			this.deallocateHeap();
		}
		this.field375 = false;
	}

	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.method71();
	}

	public native void allocateHeap(int arg0);

	public native void deallocateHeap();

	public synchronized native int allocateBuffer(int arg0, boolean arg1);

	public synchronized native long getBufferAddress(int arg0);

	public synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

	public synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

	public synchronized native void deallocateBuffer(int arg0);

	public synchronized native void copy(long arg0, long arg1, int arg2);
}
