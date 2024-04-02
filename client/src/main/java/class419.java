
import deob.ObfuscatedName;

@ObfuscatedName("ot")
public class class419 {

	@ObfuscatedName("ot.u")
	public final class334 field4463;

	@ObfuscatedName("ot.j")
	public final class451 field4462 = new class451(16);

	public class419(class527 arg0, class519 arg1, class334 arg2) {
		this.field4463 = arg2;
		this.field4463.method5637(class161.field1654.field1668);
	}

	@ObfuscatedName("ot.u(II)Loi;")
	public class418 method7360(int arg0) {
		class451 var2 = this.field4462;
		class418 var3;
		synchronized (this.field4462) {
			var3 = (class418) this.field4462.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4463;
		byte[] var6;
		synchronized (this.field4463) {
			var6 = this.field4463.method5627(class161.field1654.field1668, arg0);
		}
		class418 var8 = new class418();
		if (var6 != null) {
			var8.method7354(new class814(var6));
		}
		class451 var9 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ot.j(IIIILfj;I)Lmq;")
	public class366 method7361(int arg0, int arg1, int arg2, int arg3, class187 arg4) {
		class367[] var6 = null;
		class418 var7 = this.method7360(arg0);
		if (var7.field4457 != null) {
			var6 = new class367[var7.field4457.length];
			for (int var8 = 0; var8 < var6.length; var8++) {
				class186 var9 = arg4.method3601(var7.field4457[var8]);
				var6[var8] = new class367(var9.field2156, var9.field2150, var9.field2152, var9.field2153, var9.field2154, var9.field2151, var9.field2155, var9.field2159, var9.field2158, var9.field2157, var9.field2160);
			}
		}
		return new class366(var7.field4459, var6, var7.field4458, arg1, arg2, arg3, var7.field4460, var7.field4461);
	}

	@ObfuscatedName("ot.a(B)V")
	public void method7363() {
		class451 var1 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7922();
		}
	}

	@ObfuscatedName("ot.s(IB)V")
	public void method7368(int arg0) {
		class451 var2 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7921(arg0);
		}
	}

	@ObfuscatedName("ot.c(I)V")
	public void method7364() {
		class451 var1 = this.field4462;
		synchronized (this.field4462) {
			this.field4462.method7925();
		}
	}
}
