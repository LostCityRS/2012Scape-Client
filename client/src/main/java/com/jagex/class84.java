package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bs")
public class class84 {

	@ObfuscatedName("bs.u")
	public final int field1061;

	public class84(class682 arg0, int arg1) {
		this.field1061 = OpenGL.glGenLists(arg1);
	}

	@ObfuscatedName("bs.u(I)V")
	public void method2182(int arg0) {
		OpenGL.glNewList(this.field1061 + arg0, 4864);
	}

	@ObfuscatedName("bs.j()V")
	public void method2183() {
		OpenGL.glEndList();
	}

	@ObfuscatedName("bs.a(C)V")
	public void method2188(char arg0) {
		OpenGL.glCallList(this.field1061 + arg0);
	}
}
