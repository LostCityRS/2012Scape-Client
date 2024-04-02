package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ai")
public class class57 {

	public class57() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aw.u(Lid;Liv;IIIIIIIIII)V")
	public static void method1884(class265 arg0, class263 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		Statics.field748 = arg0;
		Statics.field6761 = arg1;
		Statics.field750 = arg2;
		Statics.field752 = arg3;
		Statics.field751 = arg4;
		Statics.field3502 = arg5;
		Statics.field749 = arg6;
		Statics.field3716 = arg7;
		Statics.field7347 = arg8;
		Statics.field753 = null;
		Statics.field5243 = null;
		Statics.field8719 = null;
		Statics.field754 = arg9;
		Statics.field635 = arg10;
		method14267();
		Statics.field1201 = true;
	}

	@ObfuscatedName("abs.j(B)Z")
	public static boolean method14267() {
		boolean var0 = true;
		if (Statics.field753 == null) {
			if (Statics.field7387.method5630(Statics.field749)) {
				Statics.field753 = class125.method2598(Statics.field7387, Statics.field749);
			} else {
				var0 = false;
			}
		}
		if (Statics.field5243 == null) {
			if (Statics.field7387.method5630(Statics.field3716)) {
				Statics.field5243 = class125.method2598(Statics.field7387, Statics.field3716);
			} else {
				var0 = false;
			}
		}
		if (Statics.field8719 == null) {
			if (Statics.field7387.method5630(Statics.field7347)) {
				Statics.field8719 = class125.method2598(Statics.field7387, Statics.field7347);
			} else {
				var0 = false;
			}
		}
		if (Statics.field10224 == null) {
			if (Statics.field8745.method5630(Statics.field635)) {
				Statics.field10224 = class603.method14876(Statics.field8745, Statics.field635);
			} else {
				var0 = false;
			}
		}
		if (Statics.field4566 == null) {
			if (Statics.field7387.method5630(Statics.field635)) {
				Statics.field4566 = (class685[]) class125.method2593(Statics.field7387, Statics.field635);
			} else {
				var0 = false;
			}
		}
		return var0;
	}
}
