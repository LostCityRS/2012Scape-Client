
import deob.ObfuscatedName;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;

@ObfuscatedName("za")
public class za extends class675 implements class10 {

	public long nativeid;

	@ObfuscatedName("za.u")
	public Canvas field430;

	@ObfuscatedName("za.j")
	public int field431;

	@ObfuscatedName("za.a")
	public int field432;

	@ObfuscatedName("za.s")
	public ja field433;

	@ObfuscatedName("za.c")
	public static boolean field434 = false;

	public za(ja arg0, Canvas arg1, int arg2, int arg3) {
		this.field433 = arg0;
		this.field430 = arg1;
		this.field431 = arg2;
		this.field432 = arg3;
		this.method924(arg0, this.field430, arg2, arg3);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("za.r(Ljava/lang/Exception;)V")
	public void method916(Exception arg0) {
		if (field434) {
			if (MonotonicTime.method5554() - Statics.field435 >= 30000L) {
				throw new RuntimeException(arg0.getMessage());
			}
			this.field430.repaint();
		} else {
			Statics.field435 = MonotonicTime.method5554();
			field434 = true;
		}
	}

	@ObfuscatedName("za.ay()I")
	public int method918() {
		return this.method919(0, 0);
	}

	@ObfuscatedName("za.af(II)I")
	public int method919(int arg0, int arg1) {
		try {
			synchronized (this.field430.getTreeLock()) {
				Component var4 = this.field430;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = this.field430.getWidth();
				while (var4 != null) {
					Container var9 = var4.getParent();
					if (var9 instanceof Frame) {
						var7 = ((Frame) var9).getInsets().top;
					}
					if (var9 == null) {
						break;
					}
					var5 += var4.getX();
					var6 += var4.getY();
					int var10 = var4.getWidth();
					if (var10 < var8) {
						var8 = var10;
					}
					var4 = var9;
				}
				this.method953(arg0, arg1, var5, var6, this.field431, this.field432, var8, var7);
				field434 = false;
				return 0;
			}
		} catch (Exception var14) {
			this.method916(var14);
			return -1;
		}
	}

	@ObfuscatedName("za.ar(II)V")
	public void method923(int arg0, int arg1) {
		this.field431 = arg0;
		this.field432 = arg1;
		this.method917(this.field430, arg0, arg1);
		if (this.field433.method457() == this) {
			this.method954();
		}
	}

	@ObfuscatedName("za.u()I")
	public int method921() {
		return this.field431;
	}

	@ObfuscatedName("za.j()I")
	public int method922() {
		return this.field432;
	}

	@ObfuscatedName("za.a()V")
	public void method944() {
		if (this.field433.method457() == this) {
			this.method925();
		}
		this.method92(true);
		this.nativeid = 0L;
		this.field430 = null;
	}

	@ObfuscatedName("za.s()Z")
	public boolean method954() {
		this.field433.method978(this);
		return true;
	}

	@ObfuscatedName("za.c()Z")
	public boolean method925() {
		return true;
	}

	@ObfuscatedName("za.ma(Z)V")
	public native void method92(boolean arg0);

	@ObfuscatedName("za.wa(Ljava/awt/Canvas;II)V")
	public native void method917(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("za.n(Lja;Ljava/awt/Canvas;II)V")
	public native void method924(ja arg0, Canvas arg1, int arg2, int arg3);

	@ObfuscatedName("za.H(IIIIIIII)V")
	public native void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
