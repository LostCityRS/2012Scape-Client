
import deob.ObfuscatedName;

@ObfuscatedName("st")
public class class510 {

	@ObfuscatedName("st.u")
	public final Js5 field6342;

	@ObfuscatedName("st.j")
	public final WeightedCache field6341 = new WeightedCache(64);

	@ObfuscatedName("st.a")
	public final WeightedCache field6340 = new WeightedCache(100);

	public class510(ModeGame arg0, class519 arg1, Js5 arg2, Js5 arg3, Js5 arg4) {
		this.field6342 = arg2;
		if (this.field6342 != null) {
			int var6 = this.field6342.method5638() - 1;
			class161.field1637.method3071();
			this.field6342.method5637(var6);
		}
		class947.method16191(arg3, arg4, 2);
	}

	@ObfuscatedName("st.u(II)Lso;")
	public SeqType method11144(int arg0) {
		WeightedCache var2 = this.field6341;
		SeqType var3;
		synchronized (this.field6341) {
			var3 = (SeqType) this.field6341.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field6342;
		byte[] var6;
		synchronized (this.field6342) {
			var6 = this.field6342.method5627(class161.field1637.method3073(arg0), class161.field1637.method3075(arg0));
		}
		SeqType var8 = new SeqType();
		var8.field6318 = arg0;
		var8.field6317 = this;
		if (var6 != null) {
			var8.method11122(new Packet(var6));
		}
		var8.method11124();
		WeightedCache var9 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("st.j(II)Laje;")
	public class947 method11146(int arg0) {
		WeightedCache var2 = this.field6340;
		synchronized (this.field6340) {
			class947 var3 = (class947) this.field6340.method7916((long) arg0);
			if (var3 == null) {
				var3 = new class947(arg0);
				this.field6340.method7937(var3, (long) arg0);
			}
			return var3.method16652() ? var3 : null;
		}
	}

	@ObfuscatedName("st.a(I)V")
	public void method11143() {
		WeightedCache var1 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7922();
		}
		WeightedCache var3 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7922();
		}
	}

	@ObfuscatedName("st.s(II)V")
	public void method11147(int arg0) {
		WeightedCache var2 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7921(arg0);
		}
		WeightedCache var4 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7921(arg0);
		}
	}

	@ObfuscatedName("st.c(I)V")
	public void method11148() {
		WeightedCache var1 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7925();
		}
		WeightedCache var3 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7925();
		}
	}
}
