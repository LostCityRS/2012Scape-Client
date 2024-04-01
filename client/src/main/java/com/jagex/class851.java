package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("afs")
public class class851 extends class537 {

	@ObfuscatedName("afs.m")
	public boolean field9845 = true;

	@ObfuscatedName("afs.t")
	public boolean field9844 = false;

	public class851(class815 arg0) {
		super(arg0);
	}

	public class851(int arg0, class815 arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afs.z(I)V")
	public void method15773() {
		if (this.field6461 < 0 || this.field6461 > 5) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afs.u(I)I")
	public int method11386() {
		this.field9844 = true;
		return 2;
	}

	@ObfuscatedName("afs.n(I)Z")
	public boolean method15775() {
		return true;
	}

	@ObfuscatedName("afs.j(IB)I")
	public int method11387(int arg0) {
		return arg0 == 3 && !class618.method11710().method6803("jagdx") ? 3 : 2;
	}

	@ObfuscatedName("afs.s(II)V")
	public void method11389(int arg0) {
		this.field9844 = false;
		this.field6461 = arg0;
	}

	@ObfuscatedName("afs.o(B)I")
	public int method15781() {
		return this.field6461;
	}

	@ObfuscatedName("afs.q(I)Z")
	public boolean method15776() {
		return this.field9845;
	}

	@ObfuscatedName("afs.p(ZB)V")
	public void method15780(boolean arg0) {
		this.field9845 = arg0;
	}
}
