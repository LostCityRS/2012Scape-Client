
import deob.ObfuscatedName;

@ObfuscatedName("rz")
public class ClientScriptHelpers {

	@ObfuscatedName("rz.u")
	public static ClientScriptCache field5186 = new ClientScriptCache(128);

	public ClientScriptHelpers() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jw.j(II)Lajg;")
	public static ClientScript method4892(int arg0) {
		ClientScript var1 = (ClientScript) field5186.method7965((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field6651.method5627(arg0, 0);
		if (var2 == null || var2.length <= 1) {
			return null;
		}
		ClientScript var3;
		try {
			var3 = method4724(var2);
		} catch (Exception var5) {
			throw new RuntimeException(var5.getMessage() + " " + arg0);
		}
		field5186.method7958(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("agt.a(Lwy;III)Lajg;")
	public static ClientScript method15968(ClientTriggerType arg0, int arg1, int arg2) {
		int var3 = arg0.field7320 | arg1 << 10;
		ClientScript var4 = (ClientScript) field5186.method7965((long) var3 << 16);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Statics.field6651.method5635(Statics.field6651.method5642(var3));
		if (var5 == null) {
			int var8 = arg0.field7320 | arg2 + 65536 << 10;
			ClientScript var9 = (ClientScript) field5186.method7965((long) var8 << 16);
			if (var9 != null) {
				return var9;
			}
			byte[] var10 = Statics.field6651.method5635(Statics.field6651.method5642(var8));
			if (var10 == null) {
				int var13 = arg0.field7320 | 0x3FFFC00;
				ClientScript var14 = (ClientScript) field5186.method7965((long) var13 << 16);
				if (var14 != null) {
					return var14;
				}
				byte[] var15 = Statics.field6651.method5635(Statics.field6651.method5642(var13));
				if (var15 == null) {
					return null;
				} else if (var15.length <= 1) {
					return null;
				} else {
					ClientScript var16;
					try {
						var16 = method4724(var15);
					} catch (Exception var20) {
						throw new RuntimeException(var20.getMessage() + " " + var13);
					}
					var16.field10388 = arg0;
					field5186.method7958(var16, (long) var13 << 16);
					return var16;
				}
			} else if (var10.length <= 1) {
				return null;
			} else {
				ClientScript var11;
				try {
					var11 = method4724(var10);
				} catch (Exception var19) {
					throw new RuntimeException(var19.getMessage() + " " + var8);
				}
				var11.field10388 = arg0;
				field5186.method7958(var11, (long) var8 << 16);
				return var11;
			}
		} else if (var5.length <= 1) {
			return null;
		} else {
			ClientScript var6;
			try {
				var6 = method4724(var5);
			} catch (Exception var18) {
				throw new RuntimeException(var18.getMessage() + " " + var3);
			}
			var6.field10388 = arg0;
			field5186.method7958(var6, (long) var3 << 16);
			return var6;
		}
	}

	@ObfuscatedName("jv.s([BI)Lajg;")
	public static ClientScript method4724(byte[] arg0) {
		return new ClientScript(new Packet(arg0));
	}
}
