package com.jagex;

import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("lj")
public abstract class class348 implements class240 {

	@ObfuscatedName("lj.a")
	public final class899 field3744;

	@ObfuscatedName("lj.s")
	public final int field3743;

	@ObfuscatedName("lj.c")
	public final boolean field3746;

	@ObfuscatedName("lj.m")
	public int field3747 = -1;

	@ObfuscatedName("lj.t")
	public int field3749;

	@ObfuscatedName("lj.l")
	public int field3742;

	@ObfuscatedName("lj.f")
	public NativeHeapBuffer field3750;

	@ObfuscatedName("lj.d")
	public static final int[] field3751 = new int[1];

	public class348(class899 arg0, int arg1, boolean arg2) {
		this.field3744 = arg0;
		this.field3743 = arg1;
		this.field3746 = arg2;
	}

	@ObfuscatedName("lj.e()V")
	public void method5994() {
		if (this.field3747 >= 0) {
			return;
		}
		if (this.field3744.field10003) {
			OpenGL.glGenBuffersARB(1, field3751, 0);
			this.field3747 = field3751[0];
			OpenGL.glBindBufferARB(this.field3743, this.field3747);
		} else {
			this.field3747 = 0;
		}
	}

	@ObfuscatedName("lj.t()I")
	public int method4451() {
		return this.field3749;
	}

	@ObfuscatedName("lj.ay()J")
	public long method5995() {
		return this.field3747 == 0 ? this.field3750.method32() : 0L;
	}

	@ObfuscatedName("lj.af()V")
	public void method5996() {
		if (this.field3744.field10003) {
			OpenGL.glBindBufferARB(this.field3743, this.field3747);
		}
	}

	@ObfuscatedName("lj.v(I)V")
	public void method4535(int arg0) {
		if (arg0 > this.field3742) {
			this.method5994();
			if (this.field3747 > 0) {
				OpenGL.glBindBufferARB(this.field3743, this.field3747);
				OpenGL.glBufferDataARBub(this.field3743, arg0, null, 0, this.field3746 ? 35040 : 35044);
				this.field3744.field8252 += arg0 - this.field3742;
			} else {
				this.field3750 = this.field3744.method13512(arg0, false);
			}
			this.field3742 = arg0;
		}
		this.field3749 = arg0;
	}

	@ObfuscatedName("lj.f(II)J")
	public long method4453(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.field3743, this.field3747);
		return OpenGL.glMapBufferARB(this.field3743, 35001) + (long) arg0;
	}

	@ObfuscatedName("lj.d()V")
	public void method4454() {
		OpenGL.glUnmapBufferARB(this.field3743);
	}

	@ObfuscatedName("lj.l(IIJ)Z")
	public boolean method4452(int arg0, int arg1, long arg2) {
		this.method5994();
		if (this.field3747 > 0) {
			OpenGL.glBindBufferARB(this.field3743, this.field3747);
			OpenGL.glBufferSubDataARBa(this.field3743, arg0, arg1, arg2);
		} else {
			this.field3750.field371.copy(this.field3750.method32() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@ObfuscatedName("lj.s()V")
	public void method168() {
		if (this.field3747 > 0) {
			this.field3744.method16083(this.field3747, this.field3749);
			this.field3747 = -1;
		}
	}

	public void finalize() throws Throwable {
		this.method168();
		super.finalize();
	}
}
