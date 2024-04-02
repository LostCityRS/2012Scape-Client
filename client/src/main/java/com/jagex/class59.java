package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("al")
public class class59 {

	@ObfuscatedName("al.u")
	public static boolean field770 = false;

	public class59() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aka.u(I)V")
	public static void method16899() {
		if (field770) {
			return;
		}
		method2468(client.world.getScene().field4500);
		if (client.world.getScene().field4508 != null) {
			method2468(client.world.getScene().field4508);
		}
		field770 = true;
	}

	@ObfuscatedName("ck.j([[[Lou;B)V")
	public static void method2468(class424[][][] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			class424[][] var2 = arg0[var1];
			for (int var3 = 0; var3 < var2.length; var3++) {
				for (int var4 = 0; var4 < var2[var3].length; var4++) {
					class424 var5 = var2[var3][var4];
					if (var5 != null) {
						if (var5.field4552 instanceof Location) {
							((Location) var5.field4552).method2409();
						}
						if (var5.field4546 instanceof Location) {
							((Location) var5.field4546).method2409();
						}
						if (var5.field4551 instanceof Location) {
							((Location) var5.field4551).method2409();
						}
						if (var5.field4548 instanceof Location) {
							((Location) var5.field4548).method2409();
						}
						if (var5.field4550 instanceof Location) {
							((Location) var5.field4550).method2409();
						}
						for (class430 var6 = var5.field4554; var6 != null; var6 = var6.field4641) {
							class974 var7 = var6.field4642;
							if (var7 instanceof Location) {
								((Location) var7).method2409();
							}
						}
					}
				}
			}
		}
	}
}
