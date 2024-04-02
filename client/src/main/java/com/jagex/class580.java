package com.jagex;

import deob.ObfuscatedName;
import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ur")
public abstract class class580 {

	@ObfuscatedName("ur.u")
	public String field6814;

	@ObfuscatedName("ur.j")
	public int field6815;

	@ObfuscatedName("je.u(Ljava/lang/String;IS)Lur;")
	public static class580 method4864(String arg0, int arg1) {
		class877 var2 = new class877();
		var2.field6814 = arg0;
		var2.field6815 = arg1;
		return var2;
	}

	@ObfuscatedName("ur.a(S)Ljava/net/Socket;")
	public Socket method12147() throws IOException {
		return new Socket(this.field6814, this.field6815);
	}

	@ObfuscatedName("ur.j(S)Ljava/net/Socket;")
	public abstract Socket method12150() throws IOException;
}
