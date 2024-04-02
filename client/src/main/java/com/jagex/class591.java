package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vz")
public class class591 implements class457 {

	@ObfuscatedName("vz.u")
	public int field7047;

	@ObfuscatedName("vz.j")
	public int field7052;

	@ObfuscatedName("vz.a")
	public int field7049;

	@ObfuscatedName("vz.s")
	public int field7050;

	@ObfuscatedName("vz.c")
	public int field7048;

	@ObfuscatedName("vz.m")
	public int field7051;

	@ObfuscatedName("vz.t")
	public boolean field7053;

	@ObfuscatedName("vz.u()J")
	public long method7998() {
		long[] var1 = class814.field9628;
		long var2 = -1L;
		long var4 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field7047 * -947087927)) & 0xFFL)];
		long var6 = var4 >>> 8 ^ var1[(int) ((var4 ^ (long) (this.field7052 * -1407539879 >> 8)) & 0xFFL)];
		long var8 = var6 >>> 8 ^ var1[(int) ((var6 ^ (long) (this.field7052 * -1407539879)) & 0xFFL)];
		long var10 = var8 >>> 8 ^ var1[(int) ((var8 ^ (long) (this.field7049 * -535689633 >> 24)) & 0xFFL)];
		long var12 = var10 >>> 8 ^ var1[(int) ((var10 ^ (long) (this.field7049 * -535689633 >> 16)) & 0xFFL)];
		long var14 = var12 >>> 8 ^ var1[(int) ((var12 ^ (long) (this.field7049 * -535689633 >> 8)) & 0xFFL)];
		long var16 = var14 >>> 8 ^ var1[(int) ((var14 ^ (long) (this.field7049 * -535689633)) & 0xFFL)];
		long var18 = var16 >>> 8 ^ var1[(int) ((var16 ^ (long) (this.field7050 * 161384325)) & 0xFFL)];
		long var20 = var18 >>> 8 ^ var1[(int) ((var18 ^ (long) (this.field7048 * -672969617 >> 24)) & 0xFFL)];
		long var22 = var20 >>> 8 ^ var1[(int) ((var20 ^ (long) (this.field7048 * -672969617 >> 16)) & 0xFFL)];
		long var24 = var22 >>> 8 ^ var1[(int) ((var22 ^ (long) (this.field7048 * -672969617 >> 8)) & 0xFFL)];
		long var26 = var24 >>> 8 ^ var1[(int) ((var24 ^ (long) (this.field7048 * -672969617)) & 0xFFL)];
		long var28 = var26 >>> 8 ^ var1[(int) ((var26 ^ (long) (this.field7051 * 1594212949)) & 0xFFL)];
		return var28 >>> 8 ^ var1[(int) ((var28 ^ (long) (this.field7053 ? 1 : 0)) & 0xFFL)];
	}

	@ObfuscatedName("vz.j(Lqu;)Z")
	public boolean method7994(class457 arg0) {
		if (!(arg0 instanceof class591)) {
			return false;
		}
		class591 var2 = (class591) arg0;
		if (this.field7047 * -947087927 != var2.field7047 * -947087927) {
			return false;
		} else if (this.field7052 * -1407539879 != var2.field7052 * -1407539879) {
			return false;
		} else if (this.field7049 * -535689633 != var2.field7049 * -535689633) {
			return false;
		} else if (this.field7050 * 161384325 != var2.field7050 * 161384325) {
			return false;
		} else if (this.field7048 * -672969617 != var2.field7048 * -672969617) {
			return false;
		} else if (this.field7051 * 1594212949 == var2.field7051 * 1594212949) {
			return this.field7053 == var2.field7053;
		} else {
			return false;
		}
	}
}
