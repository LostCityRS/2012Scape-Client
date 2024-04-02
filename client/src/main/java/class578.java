
import deob.ObfuscatedName;

@ObfuscatedName("uq")
public class class578 {

	@ObfuscatedName("uq.u")
	public final class334 field6804;

	@ObfuscatedName("uq.j")
	public final class451 field6805 = new class451(128);

	public class578(class527 arg0, class519 arg1, class334 arg2) {
		this.field6804 = arg2;
		if (this.field6804 != null) {
			int var4 = this.field6804.method5638() - 1;
			class161.field1647.method3071();
			this.field6804.method5637(var4);
		}
	}

	@ObfuscatedName("uq.u(II)Lud;")
	public class579 method12116(int arg0) {
		class451 var2 = this.field6805;
		class579 var3;
		synchronized (this.field6805) {
			var3 = (class579) this.field6805.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		byte[] var5 = this.field6804.method5627(class161.field1647.method3073(arg0), class161.field1647.method3075(arg0));
		class579 var6 = new class579();
		if (var5 != null) {
			var6.method12121(new Packet(var5));
		}
		class451 var7 = this.field6805;
		synchronized (this.field6805) {
			this.field6805.method7937(var6, (long) arg0);
			return var6;
		}
	}
}
