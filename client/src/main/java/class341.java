
import deob.ObfuscatedName;

@ObfuscatedName("lt")
public class class341 {

	@ObfuscatedName("lt.u")
	public final class334 field3704;

	@ObfuscatedName("lt.j")
	public final class334 field3705;

	@ObfuscatedName("lt.a")
	public final class451 field3706 = new class451(64);

	public class341(class519 arg0, class334 arg1, class334 arg2) {
		this.field3704 = arg1;
		this.field3705 = arg2;
		if (this.field3704 != null) {
			this.field3704.method5637(0);
		}
		if (this.field3705 != null) {
			this.field3705.method5637(0);
		}
	}

	@ObfuscatedName("lt.u(IB)Lajx;")
	public class950 method5933(int arg0) {
		class950 var2 = (class950) this.field3706.method7916((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.field3705.method5627(0, arg0 & 0x7FFF);
		} else {
			var3 = this.field3704.method5627(0, arg0);
		}
		class950 var4 = new class950();
		if (var3 != null) {
			var4.method16690(new class814(var3));
		}
		if (arg0 >= 32768) {
			var4.method16694();
		}
		this.field3706.method7937(var4, (long) arg0);
		return var4;
	}
}
