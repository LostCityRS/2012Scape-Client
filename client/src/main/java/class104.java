
import deob.ObfuscatedName;

@ObfuscatedName("cm")
public class class104 {

	@ObfuscatedName("cm.u")
	public final class682 field1174;

	@ObfuscatedName("cm.j")
	public final class16 field1173;

	@ObfuscatedName("cm.a")
	public final class451 field1172 = new class451(6291456, 256);

	public class104(class682 arg0, class16 arg1) {
		this.field1174 = arg0;
		this.field1173 = arg1;
	}

	@ObfuscatedName("cm.u(I)Lxp;")
	public class640 method2335(int arg0) {
		return this.method2324(arg0, -1);
	}

	@ObfuscatedName("cm.j(II)Lxp;")
	public class640 method2324(int arg0, int arg1) {
		class640 var3 = (class640) this.field1172.method7916((long) arg0);
		if (var3 != null) {
			return var3;
		} else if (this.method2322(arg0, arg1)) {
			class120 var4 = this.field1173.method889(arg0);
			if (arg1 == -1) {
				arg1 = var4.field1252;
			}
			class640 var6;
			if (var4.field1245 && this.field1174.method600()) {
				float[] var5 = this.field1173.method888(arg0, 0.7F, arg1, arg1, false);
				var6 = new class640(this.field1174, 3553, class124.field1296, class139.field1505, arg1, arg1, var4.field1275 != 0, var5, class124.field1296);
			} else {
				int[] var7;
				if (class456.field4853 != var4.field1262 && class120.method12638(var4.field1270)) {
					var7 = this.field1173.method886(arg0, 0.7F, arg1, arg1, true);
				} else {
					var7 = this.field1173.method887(arg0, 0.7F, arg1, arg1, false);
				}
				var6 = new class640(this.field1174, 3553, arg1, arg1, var4.field1275 != 0, var7, 0, 0, false);
			}
			var6.method12765(var4.field1273, var4.field1274);
			this.field1172.method7918(var6, (long) arg0, arg1 * arg1);
			return var6;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cm.a(II)Z")
	public boolean method2322(int arg0, int arg1) {
		class120 var3 = this.field1173.method889(arg0);
		if (arg1 == -1) {
			arg1 = var3.field1252;
		}
		if (var3.field1245 && this.field1174.method600()) {
			return this.field1173.method898(arg0, class455.field4850, 0.7F, arg1, arg1, false);
		} else if (class456.field4853 != var3.field1262 && class120.method12638(var3.field1270)) {
			return this.field1173.method898(arg0, class455.field4849, 0.7F, arg1, arg1, true);
		} else {
			return this.field1173.method898(arg0, class455.field4848, 0.7F, arg1, arg1, false);
		}
	}

	@ObfuscatedName("cm.s()V")
	public void method2326() {
		this.field1172.method7921(5);
	}

	@ObfuscatedName("cm.c()V")
	public void method2327() {
		this.field1172.method7922();
	}
}
