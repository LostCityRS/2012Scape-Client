package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("akj")
public class class993 extends class918 {

	@ObfuscatedName("akj.z")
	public class718 field10570;

	@ObfuscatedName("akj.n")
	public int[] field10571 = null;

	public class993(class718 arg0, class174 arg1) {
		super(arg1);
		this.field10570 = arg0;
	}

	@ObfuscatedName("akj.k()I")
	public final int method16994() {
		return this.field10571[this.field10570.method3401()];
	}

	@ObfuscatedName("akj.u(I)Z")
	public boolean method16248(int arg0) {
		if (this.field10571 == null) {
			this.field10571 = new int[this.field10570.method3331()];
		}
		class716 var2 = (class716) this.field10570.method3332(arg0);
		this.field10571[arg0] = OpenGL.glGetUniformLocation(var2.field8571, this.method16233());
		return this.field10571[arg0] != -1;
	}

	@ObfuscatedName("akj.m(I)I")
	public final int method16237(int arg0) {
		return this.field10571[arg0];
	}
}
