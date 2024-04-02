
import deob.ObfuscatedName;

@ObfuscatedName("ot")
public class SkyBoxTypeList {

	@ObfuscatedName("ot.u")
	public final Js5 field4463;

	@ObfuscatedName("ot.j")
	public final WeightedCache field4462 = new WeightedCache(16);

	public SkyBoxTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		this.field4463 = arg2;
		this.field4463.method5637(class161.field1654.field1668);
	}

	@ObfuscatedName("ot.u(II)Loi;")
	public SkyBoxType method7360(int arg0) {
		WeightedCache var2 = this.field4462;
		SkyBoxType var3;
		synchronized (this.field4462) {
			var3 = (SkyBoxType) this.field4462.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		Js5 var5 = this.field4463;
		byte[] var6;
		synchronized (this.field4463) {
			var6 = this.field4463.method5627(class161.field1654.field1668, arg0);
		}
		SkyBoxType var8 = new SkyBoxType();
		if (var6 != null) {
			var8.method7354(new Packet(var6));
		}
		WeightedCache var9 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ot.j(IIIILfj;I)Lmq;")
	public class366 method7361(int arg0, int arg1, int arg2, int arg3, SkyDecorTypeList arg4) {
		class367[] var6 = null;
		SkyBoxType var7 = this.method7360(arg0);
		if (var7.field4457 != null) {
			var6 = new class367[var7.field4457.length];
			for (int var8 = 0; var8 < var6.length; var8++) {
				SkyDecorType var9 = arg4.method3601(var7.field4457[var8]);
				var6[var8] = new class367(var9.field2156, var9.field2150, var9.field2152, var9.field2153, var9.field2154, var9.field2151, var9.field2155, var9.field2159, var9.field2158, var9.field2157, var9.field2160);
			}
		}
		return new class366(var7.field4459, var6, var7.field4458, arg1, arg2, arg3, var7.field4460, var7.field4461);
	}

	@ObfuscatedName("ot.a(B)V")
	public void method7363() {
		WeightedCache var1 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7922();
		}
	}

	@ObfuscatedName("ot.s(IB)V")
	public void method7368(int arg0) {
		WeightedCache var2 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7921(arg0);
		}
	}

	@ObfuscatedName("ot.c(I)V")
	public void method7364() {
		WeightedCache var1 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7925();
		}
	}
}
