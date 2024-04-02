
import deob.ObfuscatedName;

@ObfuscatedName("bp")
public class class89 {

	@ObfuscatedName("bp.c")
	public boolean field1084;

	@ObfuscatedName("bp.m")
	public class640[] field1082 = null;

	@ObfuscatedName("bp.t")
	public class639 field1078 = null;

	@ObfuscatedName("bp.l")
	public class640[] field1083 = null;

	@ObfuscatedName("bp.f")
	public class639 field1081 = null;

	@ObfuscatedName("bp.d")
	public class639 field1086 = null;

	@ObfuscatedName("bp.u(Lyq;)V")
	public static void method2230(class682 arg0) {
		if (Statics.field1087 == null) {
			class912 var1 = new class912();
			byte[] var2 = var1.method16218(128, 128, 16);
			Statics.field1087 = Statics.method4122(var2, false);
		}
		if (Statics.field1085 == null) {
			class910 var3 = new class910();
			byte[] var4 = var3.method16209(128, 128, 16);
			Statics.field1085 = Statics.method4122(var4, false);
		}
		class103 var5 = arg0.field8090;
		if (var5.method2318() && Statics.field1089 == null) {
			byte[] var6 = class401.method6999(128, 128, 16, 8, new class820(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			Statics.field1089 = Statics.method4122(var6, false);
		}
	}

	public class89(class682 arg0) {
		this.field1084 = arg0.field8205;
		method2230(arg0);
		if (this.field1084) {
			byte[] var6 = Statics.method2896(Statics.field1087, false);
			this.field1078 = new class639(arg0, class124.field1299, class139.field1501, 128, 128, 16, var6, class124.field1299);
			byte[] var7 = Statics.method2896(Statics.field1085, false);
			this.field1081 = new class639(arg0, class124.field1299, class139.field1501, 128, 128, 16, var7, class124.field1299);
			class103 var8 = arg0.field8090;
			if (var8.method2318()) {
				byte[] var9 = Statics.method2896(Statics.field1089, false);
				this.field1086 = new class639(arg0, class124.field1296, class139.field1501, 128, 128, 16);
				class639 var10 = new class639(arg0, class124.field1304, class139.field1501, 128, 128, 16, var9, class124.field1304);
				if (var8.method2317(this.field1086, var10, 2.0F)) {
					this.field1086.method2046();
				} else {
					this.field1086.method2049();
					this.field1086 = null;
				}
				var10.method2049();
			}
		} else {
			this.field1082 = new class640[16];
			for (int var2 = 0; var2 < 16; var2++) {
				byte[] var3 = class533.method5943(Statics.field1087, var2 * 32768, 32768);
				this.field1082[var2] = new class640(arg0, 3553, class124.field1299, class139.field1501, 128, 128, true, var3, class124.field1299, false);
			}
			this.field1083 = new class640[16];
			for (int var4 = 0; var4 < 16; var4++) {
				byte[] var5 = class533.method5943(Statics.field1085, var4 * 32768, 32768);
				this.field1083[var4] = new class640(arg0, 3553, class124.field1299, class139.field1501, 128, 128, true, var5, class124.field1299, false);
			}
		}
	}
}
