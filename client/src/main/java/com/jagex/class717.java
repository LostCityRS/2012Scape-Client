package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaz")
public final class class717 extends class172 {

	@ObfuscatedName("aaz.f")
	public final class898 field8586;

	@ObfuscatedName("aaz.d")
	public class715 field8585;

	@ObfuscatedName("aaz.z")
	public boolean field8587;

	public class717(class898 arg0, class173 arg1) {
		super(arg0, arg1);
		this.field8586 = arg0;
		this.field8587 = false;
	}

	@ObfuscatedName("aaz.c(Lyk;Lei;)Leo;")
	public class168 method3404(class683 arg0, class167 arg1) {
		return new class715((class898) arg0, this, arg1);
	}

	@ObfuscatedName("aaz.z(Leo;)Z")
	public boolean method3335(class168 arg0) {
		if (this.field8585 == arg0) {
			return true;
		} else if (arg0.method3272()) {
			this.field8585 = (class715) arg0;
			this.field2079 = this.method3345(arg0);
			if (this.field2079 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.field8587) {
				this.field8586.method16028(this.field8585.field8557);
				this.field8586.method16029(this.field8585.field8556);
				this.field8586.field9990 = this.field8585;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aaz.q(Ley;)Laig;")
	public class918 method3338(class174 arg0) {
		return new class992(this, arg0);
	}

	@ObfuscatedName("aaz.u()V")
	public void method3325() {
		if (this.field8585 == null) {
			throw new class981();
		}
		this.field8586.method16028(this.field8585.field8557);
		this.field8586.method16029(this.field8585.field8556);
		this.field8586.field9990 = this.field8585;
		this.field8587 = true;
	}

	@ObfuscatedName("aaz.j()V")
	public void method3416() {
		this.field8586.method16028(0L);
		this.field8586.method16029(0L);
		this.field8587 = false;
		this.field8586.field9990 = null;
		this.field8586.method13629(1);
		this.field8586.method13557(null);
		this.field8586.method13629(0);
		this.field8586.method13557(null);
	}

	@ObfuscatedName("aaz.a()Z")
	public boolean method3327() {
		return this.field8586.field9990 == this.field8585;
	}
}
