package com.jagex;

import deob.ObfuscatedName;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("uf")
public class class573 {

	@ObfuscatedName("uf.u")
	public int field6768;

	@ObfuscatedName("uf.j")
	public String field6765;

	@ObfuscatedName("uf.a")
	public int field6764 = 43594;

	@ObfuscatedName("uf.s")
	public int field6766 = 443;

	@ObfuscatedName("uf.c")
	public boolean field6767 = true;

	@ObfuscatedName("uf.m")
	public boolean field6763 = false;

	@ObfuscatedName("uf.u(B)Ljava/net/Socket;")
	public Socket method12025() throws IOException {
		System.out.println("Connecting to: " + this.field6765 + ":" + (this.field6767 ? this.field6766 : this.field6764));
		return this.field6763 ? class580.method4864(this.field6765, this.field6767 ? this.field6766 : this.field6764).method12150() : new Socket(InetAddress.getByName(this.field6765), this.field6767 ? this.field6766 : this.field6764);
	}

	@ObfuscatedName("uf.j(I)V")
	public void method12026() {
		if (!this.field6767) {
			this.field6767 = true;
			this.field6763 = true;
		} else if (this.field6763) {
			this.field6763 = false;
		} else {
			this.field6767 = false;
		}
	}

	@ObfuscatedName("uf.a(Luf;B)Z")
	public boolean method12027(class573 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.field6768 == arg0.field6768 && this.field6765.equals(arg0.field6765);
		}
	}
}
