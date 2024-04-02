
import deob.ObfuscatedName;

@ObfuscatedName("im")
public class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("im.u(Lqz;[IJ)Ljava/lang/String;")
	public String method4638(class473 arg0, int[] arg1, long arg2) {
		if (class473.field5031 == arg0) {
			EnumType var5 = Statics.field1244.method12116(arg1[0]);
			return var5.method12120((int) arg2);
		} else if (class473.field5017 == arg0 || class473.field5023 == arg0) {
			ObjType var6 = Statics.field3492.method12316((int) arg2);
			return var6.field7125;
		} else if (class473.field5019 == arg0 || class473.field5020 == arg0 || class473.field5024 == arg0) {
			return Statics.field1244.method12116(arg1[0]).method12120((int) arg2);
		} else {
			return null;
		}
	}
}
