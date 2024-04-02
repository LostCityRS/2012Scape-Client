
import deob.ObfuscatedName;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("lc")
public final class class344 {

	@ObfuscatedName("lc.u")
	public final Map field3717;

	@ObfuscatedName("lc.j")
	public final SortedQueue field3718;

	@ObfuscatedName("lc.a")
	public final SortedQueue field3719;

	@ObfuscatedName("lc.s")
	public final long field3720;

	@ObfuscatedName("lc.c")
	public final class342 field3721;

	@ObfuscatedName("lc.m")
	public final int field3722;

	public class344(int arg0, class342 arg1) {
		this(-1L, arg0, arg1);
	}

	public class344(long arg0, int arg1, class342 arg2) {
		this.field3720 = arg0;
		this.field3722 = arg1;
		this.field3721 = arg2;
		if (this.field3722 == -1) {
			this.field3717 = new HashMap(64);
			this.field3718 = new SortedQueue(64);
			this.field3719 = null;
		} else if (this.field3721 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.field3717 = new HashMap(this.field3722);
			this.field3718 = new SortedQueue(this.field3722);
			this.field3719 = new SortedQueue(this.field3722);
		}
	}

	@ObfuscatedName("lc.u(B)Z")
	public boolean method5953() {
		return this.field3722 != -1;
	}

	@ObfuscatedName("lc.j(Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method5949(Object arg0) {
		synchronized (this) {
			if (this.field3720 != -1L) {
				this.method5952();
			}
			class343 var3 = (class343) this.field3717.get(arg0);
			if (var3 == null) {
				return null;
			} else {
				this.method5951(var3, false);
				return var3.field3715;
			}
		}
	}

	@ObfuscatedName("lc.a(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;")
	public Object method5954(Object arg0, Object arg1) {
		synchronized (this) {
			if (this.field3720 != -1L) {
				this.method5952();
			}
			class343 var4 = (class343) this.field3717.get(arg0);
			if (var4 != null) {
				Object var5 = var4.field3715;
				var4.field3715 = arg1;
				this.method5951(var4, false);
				return var5;
			}
			if (this.method5953() && this.field3717.size() == this.field3722) {
				class343 var6 = (class343) this.field3719.remove();
				this.field3717.remove(var6.field3713);
				this.field3718.remove(var6);
			}
			class343 var7 = new class343(arg1, arg0);
			this.field3717.put(arg0, var7);
			this.method5951(var7, true);
			return null;
		}
	}

	@ObfuscatedName("lc.s(Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method5960(Object arg0) {
		synchronized (this) {
			if (this.field3720 != -1L) {
				this.method5952();
			}
			class343 var3 = (class343) this.field3717.remove(arg0);
			if (var3 == null) {
				return null;
			}
			this.field3718.remove(var3);
			if (this.method5953()) {
				this.field3719.remove(var3);
			}
			return var3.field3715;
		}
	}

	@ObfuscatedName("lc.c(Llw;ZB)V")
	public void method5951(class343 arg0, boolean arg1) {
		if (!arg1) {
			this.field3718.remove(arg0);
			if (this.method5953() && !this.field3719.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.field3714 = System.currentTimeMillis();
		if (this.method5953()) {
			switch(this.field3721.field3711) {
				case 0:
					arg0.field3712 = arg0.field3714;
					break;
				case 1:
					arg0.field3712++;
			}
			this.field3719.add(arg0);
		}
		this.field3718.add(arg0);
	}

	@ObfuscatedName("lc.m(I)V")
	public void method5952() {
		if (this.field3720 == -1L) {
			throw new IllegalStateException("");
		}
		long var1 = System.currentTimeMillis() - this.field3720;
		while (!this.field3718.isEmpty()) {
			class343 var3 = (class343) this.field3718.peek();
			if (var3.field3714 >= var1) {
				return;
			}
			this.field3717.remove(var3.field3713);
			this.field3718.remove(var3);
			if (this.method5953()) {
				this.field3719.remove(var3);
			}
		}
	}

	@ObfuscatedName("lc.t(I)V")
	public void method5955() {
		synchronized (this) {
			this.field3717.clear();
			this.field3718.clear();
			if (this.method5953()) {
				this.field3719.clear();
			}
		}
	}
}
