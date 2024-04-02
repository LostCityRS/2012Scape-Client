package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("mo")
public class RebuildRequest {

	@ObfuscatedName("mo.u")
	public RebuildType field3786;

	@ObfuscatedName("mo.j")
	public PacketBit buf;

	public RebuildRequest(RebuildType arg0, PacketBit arg1) {
		this.field3786 = arg0;
		this.buf = arg1;
	}
}
