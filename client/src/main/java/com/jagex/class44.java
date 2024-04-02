package com.jagex;

import deob.ObfuscatedName;
import java.net.InetAddress;
import java.net.UnknownHostException;

@ObfuscatedName("x")
public class class44 implements Runnable {

	@ObfuscatedName("x.u")
	public InetAddress field636;

	@ObfuscatedName("x.j")
	public volatile String field637;

	public class44(int arg0) throws UnknownHostException {
		this.field636 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	@ObfuscatedName("x.u(B)Ljava/lang/String;")
	public String method1594() {
		return this.field637;
	}

	public void run() {
		this.field637 = this.field636.getHostName();
	}
}
