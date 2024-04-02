package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aar")
public class class710 extends class150 {

	@ObfuscatedName("aar.j")
	public final int field8525;

	@ObfuscatedName("aar.a")
	public final int field8526;

	public class710(class814 arg0) {
		super(arg0);
		this.field8525 = arg0.method15239() * -1821374901;
		this.field8526 = arg0.method15379() * 691031831;
	}

	@ObfuscatedName("aar.j(I)V")
	public void method2873() {
		client.field8992 = client.field9213 * -1110992273;
		client.field8993 = client.field9213 * 1850038217 + this.field8525 * -1133015179;
		Statics.field4666 = client.field8994 * 513907271;
		Statics.field6400 = client.field9147 * 141302721;
		Statics.field6565 = client.field8996 * -1143694313;
		Statics.field2631 = client.field8997 * -204291459;
		client.field8994 = (this.field8526 * -1477977945 >>> 24) * 1812442741;
		client.field9147 = (this.field8526 * -1477977945 >>> 16 & 0xFF) * -1381063135;
		client.field8996 = (this.field8526 * -1477977945 >>> 8 & 0xFF) * 1396123895;
		client.field8997 = (this.field8526 * -1477977945 & 0xFF) * 1623974435;
	}
}
