package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("tu")
public class class554 {

	@ObfuscatedName("tu.u")
	public int field6685;

	@ObfuscatedName("tu.j")
	public int field6689;

	@ObfuscatedName("tu.a")
	public int field6686;

	@ObfuscatedName("tu.s")
	public class947 field6687;

	@ObfuscatedName("tu.c")
	public class947 field6688;

	@ObfuscatedName("tu.m")
	public boolean field6684 = false;

	@ObfuscatedName("tu.u(Lst;Lso;II[IB)Z")
	public final boolean method11837(class510 arg0, class509 arg1, int arg2, int arg3, int[] arg4) {
		if (this.field6684) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.field6689 = arg4[arg2];
			this.field6687 = arg0.method11146(this.field6689 >> 16);
			this.field6689 &= 0xFFFF;
			if (this.field6687 == null) {
				return false;
			}
			if (arg1.field6333 && arg3 != -1 && arg3 < arg4.length) {
				this.field6686 = arg4[arg3];
				this.field6688 = arg0.method11146(this.field6686 >> 16);
				this.field6686 &= 0xFFFF;
			}
			if (arg1.field6332) {
				this.field6685 |= 0x200;
			}
			if (this.field6687.method16654(this.field6689)) {
				this.field6685 |= 0x80;
			}
			if (this.field6687.method16653(this.field6689)) {
				this.field6685 |= 0x100;
			}
			if (this.field6687.method16655(this.field6689)) {
				this.field6685 |= 0x400;
			}
			if (this.field6688 != null) {
				if (this.field6688.method16654(this.field6686)) {
					this.field6685 |= 0x80;
				}
				if (this.field6688.method16653(this.field6686)) {
					this.field6685 |= 0x100;
				}
				if (this.field6688.method16655(this.field6686)) {
					this.field6685 |= 0x400;
				}
			}
			this.field6685 |= 0x20;
			this.field6684 = true;
			return true;
		}
	}

	@ObfuscatedName("tu.j(I)V")
	public final void method11839() {
		this.field6684 = false;
		this.field6685 = 0;
		this.field6688 = null;
		this.field6687 = null;
	}
}
