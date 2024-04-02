package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abd")
public class class755 extends class290 {

	@ObfuscatedName("abd.n")
	public byte[] field8841;

	@ObfuscatedName("abd.o")
	public int field8840;

	@ObfuscatedName("abd.q")
	public int field8836;

	@ObfuscatedName("abd.p")
	public int field8837;

	@ObfuscatedName("abd.w")
	public int field8838;

	@ObfuscatedName("abd.b")
	public int field8834;

	@ObfuscatedName("abd.x")
	public final int field8835;

	@ObfuscatedName("abd.i")
	public final int field8839;

	@ObfuscatedName("abd.v")
	public final int field8842;

	public class755(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field8835 = (int) (arg7 * 4096.0F);
		this.field8839 = (int) (arg6 * 4096.0F);
		this.field8840 = this.field8842 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@ObfuscatedName("abd.j()V")
	public void method4813() {
		this.field8838 = 0;
		this.field8834 = 0;
	}

	@ObfuscatedName("abd.s(II)V")
	public void method4815(int arg0, int arg1) {
		if (arg0 == 0) {
			this.field8837 = this.field8839 - (arg1 < 0 ? -arg1 : arg1);
			this.field8837 = this.field8837 * this.field8837 >> 12;
			this.field8836 = 4096;
			this.field8834 = this.field8837;
			return;
		}
		this.field8836 = this.field8837 * this.field8835 >> 12;
		if (this.field8836 < 0) {
			this.field8836 = 0;
		} else if (this.field8836 > 4096) {
			this.field8836 = 4096;
		}
		this.field8837 = this.field8839 - (arg1 < 0 ? -arg1 : arg1);
		this.field8837 = this.field8837 * this.field8837 >> 12;
		this.field8837 = this.field8837 * this.field8836 >> 12;
		this.field8834 += this.field8840 * this.field8837 >> 12;
		this.field8840 = this.field8842 * this.field8840 >> 12;
	}

	@ObfuscatedName("abd.a()V")
	public void method4814() {
		this.field8840 = this.field8842;
		this.field8834 >>= 0x4;
		if (this.field8834 < 0) {
			this.field8834 = 0;
		} else if (this.field8834 > 255) {
			this.field8834 = 255;
		}
		this.method14224(this.field8838++, (byte) this.field8834);
		this.field8834 = 0;
	}

	@ObfuscatedName("abd.y(IB)V")
	public void method14224(int arg0, byte arg1) {
		this.field8841[arg0] = arg1;
	}
}
