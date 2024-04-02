package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ww")
public class class625 {

	@ObfuscatedName("ww.a")
	public static final char[] field7341 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@ObfuscatedName("ww.s")
	public static final char[] field7339 = new char[] { '[', ']', '#' };

	public class625() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ns.u(Lwx;I)I")
	public static final int method6974(class624 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.field7335) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@ObfuscatedName("tl.j(CI)Z")
	public static final boolean method11852(char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (class526.method8060(arg0)) {
			return true;
		} else {
			char[] var1 = field7341;
			for (int var2 = 0; var2 < var1.length; var2++) {
				char var3 = var1[var2];
				if (arg0 == var3) {
					return true;
				}
			}
			char[] var4 = field7339;
			for (int var5 = 0; var5 < var4.length; var5++) {
				char var6 = var4[var5];
				if (arg0 == var6) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("jf.s(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method4744(CharSequence arg0) {
		return method12504(arg0, null);
	}

	@ObfuscatedName("wf.c(Ljava/lang/CharSequence;Lwx;I)Ljava/lang/String;")
	public static String method12504(CharSequence arg0, class624 arg1) {
		if (arg0 == null) {
			return null;
		}
		int var2 = 0;
		int var3 = arg0.length();
		while (var2 < var3 && Statics.method7788(arg0.charAt(var2))) {
			var2++;
		}
		while (var3 > var2 && Statics.method7788(arg0.charAt(var3 - 1))) {
			var3--;
		}
		int var4 = var3 - var2;
		if (var4 < 1 || var4 > method6974(arg1)) {
			return null;
		}
		StringBuilder var5 = new StringBuilder(var4);
		for (int var6 = var2; var6 < var3; var6++) {
			char var7 = arg0.charAt(var6);
			if (method11852(var7)) {
				char var8 = method4713(var7);
				if (var8 != 0) {
					var5.append(var8);
				}
			}
		}
		if (var5.length() == 0) {
			return null;
		} else {
			return var5.toString();
		}
	}

	@ObfuscatedName("it.m(CI)C")
	public static char method4713(char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}
}
