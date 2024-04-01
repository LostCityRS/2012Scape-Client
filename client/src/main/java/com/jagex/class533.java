package com.jagex;

import deob.ObfuscatedName;
import java.nio.ByteBuffer;
import java.util.Arrays;

@ObfuscatedName("tw")
public abstract class class533 {

	public class533() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("lw.a(Ljava/lang/Object;IIB)[B")
	public static byte[] method5943(Object arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			byte[] var3 = (byte[]) arg0;
			return Arrays.copyOfRange(var3, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			ByteBuffer var4 = (ByteBuffer) arg0;
			byte[] var5 = new byte[arg2];
			var4.position(arg1);
			var4.get(var5, 0, arg2);
			return var5;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
