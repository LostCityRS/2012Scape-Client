package com.jagex;

import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("ahd")
public abstract class class892 extends class675 {

	@ObfuscatedName("ahd.u")
	public final class681 field9937;

	@ObfuscatedName("ahd.j")
	public final Canvas field9935;

	@ObfuscatedName("ahd.a")
	public int field9936;

	@ObfuscatedName("ahd.s")
	public int field9940;

	@ObfuscatedName("ahd.c")
	public int[] field9938;

	@ObfuscatedName("ahd.m")
	public float[] field9939;

	@ObfuscatedName("ahd.t")
	public boolean field9934;

	@ObfuscatedName("aw.n(Lyt;Ljava/awt/Canvas;IIB)Lahd;")
	public static class892 method1885(class681 arg0, Canvas arg1, int arg2, int arg3) {
		return new class989(arg0, arg1, arg2, arg3);
	}

	public class892(class681 arg0, Canvas arg1, int arg2, int arg3) {
		this.field9935 = arg1;
		this.field9937 = arg0;
		this.field9936 = arg2 * 1308265281;
		this.field9940 = arg3 * -1159253079;
	}

	@ObfuscatedName("ahd.x(I)V")
	public void method16008() {
		this.field9938 = new int[this.field9940 * 882188441 * this.field9936 * -1047359];
		this.field9939 = new float[this.field9940 * 882188441 * this.field9936 * -1047359];
		if (this.field9934) {
			this.field9937.method13197(this.field9936 * -1047359, this.field9940 * 882188441, this.field9938, this.field9939);
		}
	}

	@ObfuscatedName("ahd.ar(II)V")
	public final void method923(int arg0, int arg1) {
		if (this.field9936 * -1047359 != arg0 || this.field9940 * 882188441 != arg1) {
			this.field9936 = arg0 * 1308265281;
			this.field9940 = arg1 * -1159253079;
			this.method16008();
		}
	}

	@ObfuscatedName("ahd.u()I")
	public int method921() {
		return this.field9936 * -1047359;
	}

	@ObfuscatedName("ahd.j()I")
	public int method922() {
		return this.field9940 * 882188441;
	}

	@ObfuscatedName("ahd.s()Z")
	public final boolean method954() {
		this.field9937.method13197(this.field9936 * -1047359, this.field9940 * 882188441, this.field9938, this.field9939);
		this.field9934 = true;
		return true;
	}

	@ObfuscatedName("ahd.c()Z")
	public final boolean method925() {
		this.field9934 = false;
		return true;
	}
}
