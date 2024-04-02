package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aiy")
public class class934 extends class789 {

	// $FF: synthetic field
	public final class220 this$0;

	@ObfuscatedName("aiy.s")
	public String field10220;

	@ObfuscatedName("aiy.c")
	public byte field10218;

	@ObfuscatedName("aiy.m")
	public byte field10219;

	public class934(class220 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("aiy.u(Laet;B)V")
	public void method14985(Packet arg0) {
		this.field10220 = arg0.fastgstr();
		if (this.field10220 != null) {
			arg0.g1();
			this.field10218 = arg0.g1b();
			this.field10219 = arg0.g1b();
		}
	}

	@ObfuscatedName("aiy.j(Ladh;B)V")
	public void method14986(class788 arg0) {
		arg0.field9427 = this.field10220;
		if (this.field10220 != null) {
			arg0.field9434 = this.field10218;
			arg0.field9432 = this.field10219;
		}
	}
}
