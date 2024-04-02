package jaclib.memory;

import deob.ObfuscatedName;

public final class Stream {

	@ObfuscatedName("jaclib/memory/Stream.u")
	public Buffer field362;

	@ObfuscatedName("jaclib/memory/Stream.j")
	public int field363;

	@ObfuscatedName("jaclib/memory/Stream.a")
	public int field364;

	@ObfuscatedName("jaclib/memory/Stream.s")
	public int field365;

	@ObfuscatedName("jaclib/memory/Stream.c")
	public final byte[] field366;

	@ObfuscatedName("jaclib/memory/Stream.m")
	public static final boolean field367 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	public Stream(int arg0) {
		this.field366 = new byte[arg0];
	}

	public Stream(Buffer arg0) {
		this(arg0, 0, arg0.method31());
	}

	public Stream(Buffer arg0, int arg1, int arg2) {
		this(arg0.method31() < 4096 ? arg0.method31() : 4096);
		this.method35(arg0, arg1, arg2);
	}

	@ObfuscatedName("jaclib/memory/Stream.u(Ljaclib/memory/Buffer;II)V")
	public void method35(Buffer arg0, int arg1, int arg2) {
		this.method41();
		this.field362 = arg0;
		this.field364 = arg1;
		this.field363 = arg1 + arg2;
		if (this.field363 > arg0.method31()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jaclib/memory/Stream.j()I")
	public int method36() {
		return this.field365 + this.field364;
	}

	@ObfuscatedName("jaclib/memory/Stream.a(I)V")
	public void method37(int arg0) {
		this.method41();
		this.field364 = arg0;
	}

	@ObfuscatedName("jaclib/memory/Stream.s(I)V")
	public void method38(int arg0) {
		if (this.field365 >= this.field366.length) {
			this.method41();
		}
		this.field366[++this.field365 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jaclib/memory/Stream.c(F)V")
	public void method39(float arg0) {
		if (this.field365 + 3 >= this.field366.length) {
			this.method41();
		}
		int var2 = floatToRawIntBits(arg0);
		this.field366[++this.field365 - 1] = (byte) (var2 >> 24);
		this.field366[++this.field365 - 1] = (byte) (var2 >> 16);
		this.field366[++this.field365 - 1] = (byte) (var2 >> 8);
		this.field366[++this.field365 - 1] = (byte) var2;
	}

	@ObfuscatedName("jaclib/memory/Stream.m(F)V")
	public void method40(float arg0) {
		if (this.field365 + 3 >= this.field366.length) {
			this.method41();
		}
		int var2 = floatToRawIntBits(arg0);
		this.field366[++this.field365 - 1] = (byte) var2;
		this.field366[++this.field365 - 1] = (byte) (var2 >> 8);
		this.field366[++this.field365 - 1] = (byte) (var2 >> 16);
		this.field366[++this.field365 - 1] = (byte) (var2 >> 24);
	}

	@ObfuscatedName("jaclib/memory/Stream.t()V")
	public void method41() {
		if (this.field365 <= 0) {
			return;
		}
		if (this.field365 + this.field364 > this.field363) {
			throw new RuntimeException();
		}
		this.field362.method13(this.field366, 0, this.field364, this.field365);
		this.field364 += this.field365;
		this.field365 = 0;
	}

	public static native int floatToRawIntBits(float arg0);

	public static final native byte getLSB(int arg0);
}
