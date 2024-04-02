package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xy")
public class class637 {

	public class637() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qc.u(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8264(String arg0) {
		StringBuilder var1 = new StringBuilder();
		int var2 = arg0.length();
		for (int var3 = 0; var3 < var2; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 == '%' && var2 > var3 + 2) {
				char var5 = arg0.charAt(var3 + 1);
				boolean var6 = false;
				int var7;
				if (var5 >= '0' && var5 <= '9') {
					var7 = var5 - '0';
				} else if (var5 >= 'a' && var5 <= 'f') {
					var7 = var5 + '\n' - 97;
				} else {
					if (var5 < 'A' || var5 > 'F') {
						var1.append('%');
						continue;
					}
					var7 = var5 + '\n' - 65;
				}
				int var8 = var7 * 16;
				char var9 = arg0.charAt(var3 + 2);
				int var10;
				if (var9 >= '0' && var9 <= '9') {
					var10 = var9 - '0' + var8;
				} else if (var9 >= 'a' && var9 <= 'f') {
					var10 = var9 + '\n' - 97 + var8;
				} else {
					if (var9 < 'A' || var9 > 'F') {
						var1.append('%');
						continue;
					}
					var10 = var9 + '\n' - 65 + var8;
				}
				if (var10 != 0 && class524.method5617((byte) var10)) {
					var1.append(class524.method16898((byte) var10));
				}
				var3 += 2;
			} else if (var4 == '+') {
				var1.append(' ');
			} else {
				var1.append(var4);
			}
		}
		return var1.toString();
	}

	@ObfuscatedName("ib.j(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method4609(CharSequence arg0) {
		int var1 = arg0.length();
		StringBuilder var2 = new StringBuilder(var1);
		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 >= 'a' && var4 <= 'z' || !(var4 < 'A' || var4 > 'Z') || var4 >= '0' && var4 <= '9' || var4 == '.' || var4 == '-' || var4 == '*' || var4 == '_') {
				var2.append(var4);
			} else if (var4 == ' ') {
				var2.append('+');
			} else {
				byte var5 = class524.method2474(var4);
				var2.append('%');
				int var6 = var5 >> 4 & 0xF;
				if (var6 >= 10) {
					var2.append((char) (var6 + 55));
				} else {
					var2.append((char) (var6 + 48));
				}
				int var7 = var5 & 0xF;
				if (var7 >= 10) {
					var2.append((char) (var7 + 55));
				} else {
					var2.append((char) (var7 + 48));
				}
			}
		}
		return var2.toString();
	}
}
