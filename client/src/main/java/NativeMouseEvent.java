
import deob.ObfuscatedName;
import java.awt.Point;

@ObfuscatedName("ajn")
public class NativeMouseEvent extends BasicMouseEvent {

	@ObfuscatedName("ajn.x")
	public int field10472;

	@ObfuscatedName("ajn.az")
	public static NativeMouseEvent[] field10450 = new NativeMouseEvent[0];

	@ObfuscatedName("ajn.aj")
	public int field10456;

	@ObfuscatedName("ajn.ah")
	public int field10469;

	@ObfuscatedName("ajn.au")
	public long field10463;

	@ObfuscatedName("ajn.ae")
	public int field10441;

	@ObfuscatedName("og.an(IIIIB)Lajn;")
	public static NativeMouseEvent method7166(int arg0, int arg1, int arg2, int arg3) {
		NativeMouseEvent[] var4 = field10450;
		synchronized (field10450) {
			NativeMouseEvent var5;
			if (Statics.field8716 == 0) {
				var5 = new NativeMouseEvent();
			} else {
				var5 = field10450[--Statics.field8716];
			}
			var5.field10441 = arg0;
			var5.field10472 = arg1;
			var5.field10456 = arg2;
			var5.field10469 = arg3;
			var5.field10463 = MonotonicTime.method5554();
			return var5;
		}
	}

	@ObfuscatedName("ajn.t(I)V")
	public void method15186() {
		NativeMouseEvent[] var1 = field10450;
		synchronized (field10450) {
			if (Statics.field8716 < Statics.field2081 - 1) {
				field10450[++Statics.field8716 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ajn.ap(I)I")
	public int method16842() {
		return this.field10469;
	}

	@ObfuscatedName("ajn.ag(I)I")
	public int method16844() {
		return this.field10456;
	}

	@ObfuscatedName("ajn.as(I)Z")
	public boolean method16850() {
		switch(this.field10456) {
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
		switch(this.field10456) {
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
		switch(this.field10456) {
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
		this.field10441 -= arg0.x;
		this.field10472 -= arg0.y;
	}

	@ObfuscatedName("ajn.c(B)J")
	public long method15185() {
		return this.field10463;
	}

	@ObfuscatedName("ajn.j(B)I")
	public int method15182() {
		return this.field10441;
	}

	@ObfuscatedName("ajn.a(I)I")
	public int method15183() {
		return this.field10472;
	}
}
