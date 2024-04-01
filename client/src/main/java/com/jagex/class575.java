package com.jagex;

import deob.ObfuscatedName;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@ObfuscatedName("ut")
public final class class575 {

	public class575() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dc.u(Ljava/io/File;[BII)V")
	public static void method2789(File arg0, byte[] arg1, int arg2) throws IOException {
		DataInputStream var3 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			var3.readFully(arg1, 0, arg2);
		} catch (EOFException var5) {
		}
		var3.close();
	}

	@ObfuscatedName("ek.j(Ljava/io/File;IB)[B")
	public static byte[] method3492(File arg0, int arg1) {
		try {
			byte[] var2 = new byte[arg1];
			method2789(arg0, var2, arg1);
			return var2;
		} catch (IOException var4) {
			return null;
		}
	}

	@ObfuscatedName("afp.a(Ljava/io/File;B)[B")
	public static byte[] method15684(File arg0) {
		return method3492(arg0, (int) arg0.length());
	}
}
