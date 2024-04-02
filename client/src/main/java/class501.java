
import deob.ObfuscatedName;

@ObfuscatedName("ro")
public class class501 {

	@ObfuscatedName("ro.u")
	public final class453 field5196;

	@ObfuscatedName("ro.j")
	public final int field5195;

	@ObfuscatedName("ro.a")
	public final int field5194;

	public class501(class453 arg0, int arg1, int arg2, int arg3) {
		this.field5196 = arg0;
		this.field5195 = arg1;
		this.field5194 = arg3;
	}

	@ObfuscatedName("ro.u(I)I")
	public int method8722() {
		return client.field8986[this.field5195];
	}

	@ObfuscatedName("ro.j(B)Lca;")
	public class113 method8725() {
		class113 var1 = this.method8723();
		if (var1 == null) {
			return null;
		} else if (var1.method2401() == this.field5194) {
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ro.a(I)Lca;")
	public class113 method8723() {
		int var1 = this.field5196.field4837;
		class453 var2 = client.field8980.method6214();
		int var3 = this.field5196.field4836 - var2.field4836;
		int var4 = this.field5196.field4838 - var2.field4838;
		if (var3 < 0 || var4 < 0 || var3 >= client.field8980.method6220() || var4 >= client.field8980.method6193()) {
			return null;
		}
		switch(this.method8722()) {
			case 0:
				return (class113) client.field8980.method6098().method7433(var1, var3, var4);
			case 1:
				return (class113) client.field8980.method6098().method7435(var1, var3, var4);
			case 2:
				return (class113) client.field8980.method6098().method7437(var1, var3, var4, client.field9216);
			case 3:
				return (class113) client.field8980.method6098().method7517(var1, var3, var4);
			default:
				return null;
		}
	}
}
