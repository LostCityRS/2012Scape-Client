
import deob.ObfuscatedName;

@ObfuscatedName("vb")
public class class598 {

	@ObfuscatedName("vb.u")
	public final Js5 field7161;

	@ObfuscatedName("vb.j")
	public int field7160;

	@ObfuscatedName("vb.a")
	public final WeightedCache field7159 = new WeightedCache(64);

	public class598(ModeGame arg0, class519 arg1, Js5 arg2) {
		this.field7161 = arg2;
		this.field7160 = this.field7161.method5637(class161.field1644.field1668);
	}

	@ObfuscatedName("vb.u(IS)Lvr;")
	public class597 method12359(int arg0) {
		WeightedCache var2 = this.field7159;
		class597 var3;
		synchronized (this.field7159) {
			var3 = (class597) this.field7159.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field7161;
		byte[] var6;
		synchronized (this.field7161) {
			var6 = this.field7161.method5627(class161.field1644.field1668, arg0);
		}
		class597 var8 = new class597();
		if (var6 != null) {
			var8.method12349(new Packet(var6));
		}
		WeightedCache var9 = this.field7159;
		synchronized (this.field7159) {
			this.field7159.method7937(var8, (long) arg0);
			return var8;
		}
	}
}
