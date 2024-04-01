package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("rz")
public class ClientScriptHelpers {

	@ObfuscatedName("rz.u")
	public static class452 cache = new class452(128);

	public ClientScriptHelpers() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jw.j(II)Lajg;")
	public static ClientScript getScript(int id) {
		ClientScript var1 = (ClientScript) cache.get(id);
		if (var1 != null) {
			return var1;
		}
		byte[] src = Statics.clientScriptsJs5.getFile(id, 0);
		if (src == null || src.length <= 1) {
			return null;
		}
		ClientScript script;
		try {
			script = decode(src);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex.getMessage() + " " + id);
		}
		script.id = id;
		cache.put(script, id);
		return script;
	}

	@ObfuscatedName("agt.a(Lwy;III)Lajg;")
	public static ClientScript getByTrigger(ClientTriggerType arg0, int arg1, int arg2) {
		int var3 = arg0.id | arg1 << 10;
		ClientScript var4 = (ClientScript) cache.get((long) var3 << 16);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Statics.clientScriptsJs5.method5635(Statics.clientScriptsJs5.method5642(var3));
		if (var5 == null) {
			int var8 = arg0.id | arg2 + 65536 << 10;
			ClientScript var9 = (ClientScript) cache.get((long) var8 << 16);
			if (var9 != null) {
				return var9;
			}
			byte[] var10 = Statics.clientScriptsJs5.method5635(Statics.clientScriptsJs5.method5642(var8));
			if (var10 == null) {
				int var13 = arg0.id | 0x3FFFC00;
				ClientScript var14 = (ClientScript) cache.get((long) var13 << 16);
				if (var14 != null) {
					return var14;
				}
				byte[] var15 = Statics.clientScriptsJs5.method5635(Statics.clientScriptsJs5.method5642(var13));
				if (var15 == null) {
					return null;
				} else if (var15.length <= 1) {
					return null;
				} else {
					ClientScript var16;
					try {
						var16 = decode(var15);
					} catch (Exception var20) {
						throw new RuntimeException(var20.getMessage() + " " + var13);
					}
					var16.trigger = arg0;
					cache.put(var16, (long) var13 << 16);
					return var16;
				}
			} else if (var10.length <= 1) {
				return null;
			} else {
				ClientScript var11;
				try {
					var11 = decode(var10);
				} catch (Exception var19) {
					throw new RuntimeException(var19.getMessage() + " " + var8);
				}
				var11.trigger = arg0;
				cache.put(var11, (long) var8 << 16);
				return var11;
			}
		} else if (var5.length <= 1) {
			return null;
		} else {
			ClientScript var6;
			try {
				var6 = decode(var5);
			} catch (Exception var18) {
				throw new RuntimeException(var18.getMessage() + " " + var3);
			}
			var6.trigger = arg0;
			cache.put(var6, (long) var3 << 16);
			return var6;
		}
	}

	@ObfuscatedName("jv.s([BI)Lajg;")
	public static ClientScript decode(byte[] src) {
		return new ClientScript(new Packet(src));
	}
}
