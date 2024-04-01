package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alp")
public class class1003 extends class949 {

	@ObfuscatedName("alp.d")
	public Packet field10599;

	@ObfuscatedName("alp.z")
	public int field10600;

	@ObfuscatedName("alp.n")
	public byte field10598;

	@ObfuscatedName("alp.u(I)[B")
	public byte[] method16685() {
		if (this.field10352 || this.field10599.pos < this.field10599.data.length - this.field10598) {
			throw new RuntimeException();
		}
		return this.field10599.data;
	}

	@ObfuscatedName("alp.j(I)I")
	public int method16687() {
		return this.field10599 == null ? 0 : this.field10599.pos * 100 / (this.field10599.data.length - this.field10598);
	}
}
