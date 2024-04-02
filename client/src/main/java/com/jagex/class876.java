package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agp")
public class class876 extends class629 implements class557 {

	@ObfuscatedName("agp.u(I)V")
	public void method11847() {
		class792 var1 = class792.method14781(class280.field2952, client.field8975.field834);
		var1.field9467.method15293(this.field7384 * 1036141017);
		var1.field9467.method15222(this.field7382 * -758589183);
		var1.field9467.method15308(this.field7386 * 1939840803);
		var1.field9467.method15285(this.field7373 * -1197328181);
		var1.field9467.method15318(this.field7380 * 165909263);
		var1.field9467.method15287(this.field7378 * 647891515);
		var1.field9467.method15285(this.field7381 * -2070106267);
		client.field8975.method1913(var1);
	}

	@ObfuscatedName("agp.f(IB)V")
	public void method15943(int arg0) {
		this.field7386 = arg0 * -693204853;
	}

	@ObfuscatedName("agp.d(II)V")
	public void method15941(int arg0) {
		this.field7384 = (this.field7384 * 1036141017 | arg0) * -760336791;
	}

	@ObfuscatedName("agp.z(II)V")
	public void method15939(int arg0) {
		this.field7380 = arg0 * -1090061329;
	}

	@ObfuscatedName("agp.n(IIB)V")
	public void method15942(int arg0, int arg1) {
		if (arg0 == 0 && arg1 > 32767) {
			arg1 = 32767;
		} else if (arg1 > 8388607) {
			arg1 = 8388607;
		}
		switch(arg0) {
			case 0:
				this.field7378 = arg1 * 442908403;
				break;
			case 1:
				this.field7382 = arg1 * -1406654719;
				break;
			case 2:
				this.field7381 = arg1 * 1059842669;
				break;
			case 3:
				this.field7373 = arg1 * -866751261;
		}
	}
}
