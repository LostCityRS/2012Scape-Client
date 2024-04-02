package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wa")
public class class27 extends class11 implements class10 {

	public long nativeid;

	public class27(class19 arg0, class23 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
		this.method1197(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("wa.l(Lja;Lba;II[I[I)V")
	public native void method1197(class19 arg0, class23 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

	@ObfuscatedName("wa.ma(Z)V")
	public native void method92(boolean arg0);
}
