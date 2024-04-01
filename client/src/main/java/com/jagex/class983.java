package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("akf")
public class class983 extends RuntimeException {

	@ObfuscatedName("akf.m")
	public String field10531;

	@ObfuscatedName("akf.l")
	public Throwable field10529;

	public class983(Throwable arg0, String arg1) {
		this.field10531 = arg1;
		this.field10529 = arg0;
		this.initCause(arg0);
	}

	@ObfuscatedName("aiv.u(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void report(String arg0, Throwable arg1) {
		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = method6882(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg0;
			}
			method12861(var2);
			String var3 = class637.method4609(var2);
			if (Statics.field10526 == null) {
				return;
			}
			String var4 = "Unknown";
			String var5 = "1.1";
			try {
				var4 = System.getProperty("java.vendor");
				var5 = System.getProperty("java.version");
			} catch (Exception var10) {
			}
			URL var7 = new URL(Statics.field10526.getCodeBase(), "clienterror.ws?c=" + Statics.field10528 + "&cs=" + Statics.field10530 + "&u=" + (Statics.field10527 == null ? "" + Statics.field10532 : class637.method4609(Statics.field10527)) + "&v1=" + class637.method4609(var4) + "&v2=" + class637.method4609(var5) + "&e=" + var3);
			DataInputStream var8 = new DataInputStream(var7.openStream());
			var8.read();
			var8.close();
		} catch (Exception var11) {
			// var11.printStackTrace();
		}
	}

	@ObfuscatedName("aff.j(Ljava/lang/Throwable;Ljava/lang/String;)Lakf;")
	public static class983 method15876(Throwable arg0, String arg1) {
		class983 var2;
		if (arg0 instanceof class983) {
			var2 = (class983) arg0;
			var2.field10531 = var2.field10531 + ' ' + arg1;
		} else {
			var2 = new class983(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("np.a(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method6882(Throwable arg0) throws IOException {
		arg0.printStackTrace();
		String var2;
		if (arg0 instanceof class983) {
			class983 var1 = (class983) arg0;
			var2 = var1.field10531 + " | ";
			arg0 = var1.field10529;
		} else {
			var2 = "";
		}
		StringWriter var3 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var3);
		arg0.printStackTrace(var4);
		var4.close();
		String var5 = var3.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();
		while (true) {
			String var8 = var6.readLine();
			if (var8 == null) {
				return var2 + "| " + var7;
			}
			int var10 = var8.indexOf(40);
			int var11 = var8.indexOf(41, var10 + 1);
			String var12;
			if (var10 == -1) {
				var12 = var8;
			} else {
				var12 = var8.substring(0, var10);
			}
			String var13 = var12.trim();
			String var14 = var13.substring(var13.lastIndexOf(32) + 1);
			String var15 = var14.substring(var14.lastIndexOf(9) + 1);
			String var16 = var2 + var15;
			if (var10 != -1 && var11 != -1) {
				int var17 = var8.indexOf(".java:", var10);
				if (var17 >= 0) {
					var16 = var16 + var8.substring(var17 + 5, var11);
				}
			}
			var2 = var16 + ' ';
		}
	}

	@ObfuscatedName("xm.s(Ljava/lang/String;I)V")
	public static final void method12861(String arg0) {
		System.out.println("Error: " + method15965(arg0, "%0a", "\n"));
	}

	@ObfuscatedName("agj.c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static final String method15965(String arg0, String arg1, String arg2) {
		for (int var3 = arg0.indexOf(arg1); var3 != -1; var3 = arg0.indexOf(arg1, var3 + arg2.length())) {
			arg0 = arg0.substring(0, var3) + arg2 + arg0.substring(var3 + arg1.length());
		}
		return arg0;
	}
}
