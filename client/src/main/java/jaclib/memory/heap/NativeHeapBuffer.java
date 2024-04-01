package jaclib.memory.heap;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.u")
	public final int field370;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.j")
	public final NativeHeap field371;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.a")
	public final int field372;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.s")
	public boolean field373 = true;

	public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
		this.field371 = arg0;
		this.field372 = arg1;
		this.field370 = arg2;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.d()Z")
	public final synchronized boolean method61() {
		return this.field371.method69() && this.field373;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.j()J")
	public final long method32() {
		return this.field371.getBufferAddress(this.field372);
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.u()I")
	public final int method31() {
		return this.field370;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.a([BIII)V")
	public final synchronized void method13(byte[] arg0, int arg1, int arg2, int arg3) {
		if (!this.method61() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field370) {
			throw new RuntimeException();
		}
		this.field371.put(this.field372, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.z()V")
	public final synchronized void method62() {
		if (this.method61()) {
			this.field371.deallocateBuffer(this.field372);
		}
		this.field373 = false;
	}

	public final synchronized void finalize() throws Throwable {
		super.finalize();
		this.method62();
	}
}
