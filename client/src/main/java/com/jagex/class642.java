package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xe")
public class class642 extends class81 {

	@ObfuscatedName("xe.w")
	public final int field7449;

	public class642(class682 arg0, class124 arg1, class139 arg2, int arg3, byte[] arg4, class124 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.field7449 = arg3;
		this.field1054.method13315(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.field1049, 0, class682.method13335(this.field1050, this.field1051), this.field7449, 0, class682.method13334(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2055(true);
	}

	@ObfuscatedName("xe.ag(Z)V")
	public void method12783(boolean arg0) {
		this.field1054.method13315(this);
		OpenGL.glTexParameteri(this.field1049, 10242, arg0 ? 10497 : 33071);
	}
}
