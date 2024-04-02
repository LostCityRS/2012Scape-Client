
import deob.ObfuscatedName;

@ObfuscatedName("o")
public class class29 extends class674 {

	@ObfuscatedName("o.j")
	public class19 field478;

	@ObfuscatedName("o.a")
	public class20 field479 = null;

	@ObfuscatedName("o.s")
	public class9 field481 = null;

	@ObfuscatedName("o.c")
	public int field480 = 0;

	@ObfuscatedName("o.m")
	public int field482 = 0;

	public class29(class19 arg0) {
		this.field478 = arg0;
	}

	@ObfuscatedName("o.u()I")
	public int method921() {
		return this.field480;
	}

	@ObfuscatedName("o.j()I")
	public int method922() {
		return this.field482;
	}

	@ObfuscatedName("o.s()Z")
	public boolean method954() {
		this.field478.method976(this.field479 == null ? 0L : this.field479.nativeid, this.field481 == null ? 0L : this.field481.nativeid);
		return true;
	}

	@ObfuscatedName("o.c()Z")
	public boolean method925() {
		return true;
	}

	@ObfuscatedName("o.x(ILde;)V")
	public void method1206(int arg0, class136 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		} else if (this.field481 == null || arg1 == null || this.field481.method164() == arg1.method164() && this.field481.method165() == arg1.method165()) {
			this.field479 = (class20) arg1;
			if (arg1 != null) {
				this.field480 = arg1.method164();
				this.field482 = arg1.method165();
			} else if (this.field481 == null) {
				this.field480 = 0;
				this.field482 = 0;
			}
			if (this.field478.method457() == this) {
				this.method954();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("o.n(Ldo;)V")
	public void method1207(class132 arg0) {
		if (this.field479 != null && arg0 != null && (this.field479.method164() != arg0.method164() || this.field479.method165() != arg0.method165())) {
			throw new RuntimeException();
		}
		this.field481 = (class9) arg0;
		if (arg0 != null) {
			this.field480 = arg0.method164();
			this.field482 = arg0.method165();
		} else if (this.field479 == null) {
			this.field480 = 0;
			this.field482 = 0;
		}
		if (this.field478.method457() == this) {
			this.method954();
		}
	}

	@ObfuscatedName("o.r()Z")
	public boolean method1208() {
		return true;
	}

	@ObfuscatedName("o.g(IIIIIIZZ)V")
	public void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		long var9 = 0L;
		long var11 = 0L;
		if (this.field479 == null) {
			arg6 = false;
		} else {
			var9 = this.field479.nativeid;
		}
		if (this.field481 == null) {
			arg7 = false;
		} else {
			var11 = this.field481.nativeid;
		}
		this.method1209(this.field478.nativeid, var9, var11, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("o.a()V")
	public void method944() {
	}

	@ObfuscatedName("o.BA(JJJIIIIIIZZ)V")
	public native void method1209(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
