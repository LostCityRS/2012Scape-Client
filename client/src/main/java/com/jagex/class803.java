package com.jagex;

import deob.ObfuscatedName;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

@ObfuscatedName("adp")
public abstract class class803 extends class399 {

	@ObfuscatedName("adp.s")
	public final OggStreamState field9557;

	@ObfuscatedName("adp.c")
	public int field9558;

	public class803(OggStreamState arg0) {
		this.field9557 = arg0;
	}

	@ObfuscatedName("adp.u(Ljagtheora/ogg/OggPacket;I)V")
	public void method15152(OggPacket arg0) {
		this.method15150(arg0);
		this.field9558 += -874170737;
	}

	@ObfuscatedName("adp.j(Ljagtheora/ogg/OggPacket;I)V")
	public abstract void method15150(OggPacket arg0);

	@ObfuscatedName("adp.a(I)V")
	public abstract void method15153();
}
