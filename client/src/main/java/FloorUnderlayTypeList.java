
import deob.ObfuscatedName;

@ObfuscatedName("ux")
public class FloorUnderlayTypeList {

	@ObfuscatedName("ux.u")
	public final Js5 field6710;

	@ObfuscatedName("ux.j")
	public final WeightedCache field6711 = new WeightedCache(128);

	public FloorUnderlayTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		this.field6710 = arg2;
		this.field6710.method5637(class161.field1640.field1668);
	}

	@ObfuscatedName("ux.u(IB)Luc;")
	public FloorUnderlayType method11895(int arg0) {
		WeightedCache var2 = this.field6711;
		FloorUnderlayType var3;
		synchronized (this.field6711) {
			var3 = (FloorUnderlayType) this.field6711.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field6710;
		byte[] var6;
		synchronized (this.field6710) {
			var6 = this.field6710.method5627(class161.field1640.field1668, arg0);
		}
		FloorUnderlayType var8 = new FloorUnderlayType();
		if (var6 != null) {
			var8.method11909(new Packet(var6));
		}
		WeightedCache var9 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ux.j(I)V")
	public void method11894() {
		WeightedCache var1 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7922();
		}
	}

	@ObfuscatedName("ux.a(IB)V")
	public void method11896(int arg0) {
		WeightedCache var2 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7921(arg0);
		}
	}

	@ObfuscatedName("ux.s(B)V")
	public void method11899() {
		WeightedCache var1 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7925();
		}
	}
}
