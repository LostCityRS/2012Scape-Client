package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaf")
public class class724 extends class201 {

	@ObfuscatedName("aaf.c")
	public class172 field8691;

	@ObfuscatedName("aaf.m")
	public class918 field8690;

	@ObfuscatedName("aaf.t")
	public final class320 field8693 = new class320();

	@ObfuscatedName("aaf.l")
	public class918 field8689;

	@ObfuscatedName("aaf.f")
	public class918 field8692;

	@ObfuscatedName("aaf.d")
	public class918 field8694;

	public class724(class683 arg0) throws class883 {
		super(arg0);
		this.method14058();
	}

	@ObfuscatedName("aaf.d(I)Z")
	public boolean method14058() throws class883 {
		this.field8691 = this.field2274.method13490("Particle");
		this.field8689 = this.field8691.method3357("WVPMatrix");
		this.field8690 = this.field8691.method3357("DiffuseSampler");
		this.field8692 = this.field8691.method3357("TexCoordMatrix");
		this.field8694 = this.field8691.method3357("DiffuseColour");
		this.field8691.method3335(this.field8691.method3334());
		return true;
	}

	@ObfuscatedName("aaf.u(Lka;)V")
	public void method3875(class320 arg0) {
		this.field8693.method5412(arg0);
		this.field8693.method5384(this.field2274.field8279);
	}

	@ObfuscatedName("aaf.j(I)V")
	public void method3871(int arg0) {
		this.method14051();
		this.field2274.method13596(class255.field2582, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("aaf.a()V")
	public void method3872() {
		this.method14051();
		this.field2274.method13593();
	}

	@ObfuscatedName("aaf.z(B)V")
	public void method14051() {
		this.field8691.method3335(this.field8691.method3334());
		this.field8691.method3325();
		this.field8691.method3336(this.field8690, 0, this.field2271);
		this.field8691.method3371(this.field8689, this.field8693);
		this.field8691.method3356(this.field8692, this.field2273);
		this.field8691.method3381(this.field8694, this.field2272);
	}
}
