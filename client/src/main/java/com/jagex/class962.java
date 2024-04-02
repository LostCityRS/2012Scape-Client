package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.awt.Point;

@ObfuscatedName("ajn")
public class class962 extends class809 {

	@ObfuscatedName("ajn.x")
	public int field10472;

	@ObfuscatedName("ajn.az")
	public static class962[] field10450 = new class962[0];

	@ObfuscatedName("ajn.aj")
	public int field10456;

	@ObfuscatedName("ajn.ah")
	public int field10469;

	@ObfuscatedName("ajn.au")
	public long field10463;

	@ObfuscatedName("ajn.ae")
	public int field10441;

	@ObfuscatedName("og.an(IIIIB)Lajn;")
	public static class962 method7166(int arg0, int arg1, int arg2, int arg3) {
		class962[] var4 = field10450;
		synchronized (field10450) {
			class962 var5;
			if (Statics.field8716 * 1159079519 == 0) {
				var5 = new class962();
			} else {
				var5 = field10450[(Statics.field8716 -= -452741729) * 1159079519];
			}
			var5.field10441 = arg0 * -2057332357;
			var5.field10472 = arg1 * -176191733;
			var5.field10456 = arg2 * 150965471;
			var5.field10469 = arg3 * 275158317;
			var5.field10463 = class153.method5554() * 5749524601580320829L;
			return var5;
		}
	}

	@ObfuscatedName("ajn.t(I)V")
	public void method15186() {
		class962[] var1 = field10450;
		synchronized (field10450) {
			if (Statics.field8716 * 1159079519 < Statics.field2081 * 1965394085 - 1) {
				field10450[(Statics.field8716 += -452741729) * 1159079519 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ajn.ap(I)I")
	public int method16842() {
		return this.field10469 * 1162183333;
	}

	@ObfuscatedName("ajn.ag(I)I")
	public int method16844() {
		return this.field10456 * -957403361;
	}

	@ObfuscatedName("ajn.as(I)Z")
	public boolean method16850() {
		switch(this.field10456 * -957403361) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@ObfuscatedName("ajn.s(I)I")
	public int method15184() {
		switch(this.field10456 * -957403361) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@ObfuscatedName("ajn.u(I)I")
	public int method15181() {
		switch(this.field10456 * -957403361) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@ObfuscatedName("ajn.ai(Ljava/awt/Point;B)V")
	public void method16843(Point arg0) {
		this.field10441 -= arg0.x * -2057332357;
		this.field10472 -= arg0.y * -176191733;
	}

	@ObfuscatedName("ajn.c(B)J")
	public long method15185() {
		return this.field10463 * -4480059076866351339L;
	}

	@ObfuscatedName("ajn.j(B)I")
	public int method15182() {
		return this.field10441 * 1850891699;
	}

	@ObfuscatedName("ajn.a(I)I")
	public int method15183() {
		return this.field10472 * -239498077;
	}
}
