package com.jagex;

import deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("mx")
public class class356 {

	public class356() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("rd.u(ZI)V")
	public static void method8512(boolean arg0) {
		class395.method3461();
		if (!client.method1608(client.state)) {
			return;
		}
		ServerConnection[] var1 = client.field9011;
		for (int var2 = 0; var2 < var1.length; var2++) {
			ServerConnection var3 = var1[var2];
			var3.field839++;
			if (var3.field839 < 50 && !arg0) {
				return;
			}
			var3.field839 = 0;
			if (!var3.field846 && var3.getStream() != null) {
				class792 var4 = class792.method14781(class280.field2873, var3.randomOut);
				var3.method1913(var4);
				try {
					var3.method1912();
				} catch (IOException var6) {
					var3.field846 = true;
				}
			}
		}
		class395.method3461();
	}
}
