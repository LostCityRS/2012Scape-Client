package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

@ObfuscatedName("nv")
public abstract class class385 implements class388, Runnable, FocusListener, WindowListener {

	@ObfuscatedName("nv.j")
	public static long field4120 = 20000000L;

	@ObfuscatedName("nv.a")
	public static int field4121 = 0;

	@ObfuscatedName("nv.m")
	public static long[] field4123 = new long[32];

	@ObfuscatedName("nv.l")
	public static long[] field4145 = new long[32];

	@ObfuscatedName("nv.w")
	public static int field4147 = 0;

	@ObfuscatedName("nv.b")
	public static int field4127 = 0;

	@ObfuscatedName("nv.i")
	public static String field4128 = null;

	@ObfuscatedName("nv.g")
	public static volatile boolean field4143 = true;

	@ObfuscatedName("nv.e")
	public static int field4130 = 500;

	@ObfuscatedName("nv.ay")
	public static volatile boolean field4131 = false;

	@ObfuscatedName("nv.af")
	public static volatile long field4132 = 0L;

	@ObfuscatedName("nv.an")
	public static boolean field4146 = false;

	@ObfuscatedName("nv.ap")
	public static volatile boolean field4134 = true;

	@ObfuscatedName("nv.ak")
	public static class577 field4155 = null;

	@ObfuscatedName("nv.av")
	public static class577 field4119 = null;

	@ObfuscatedName("nv.aj")
	public static class577 field4154 = null;

	@ObfuscatedName("nv.bq")
	public static class384 field4148 = null;

	@ObfuscatedName("nv.bz")
	public static long field4149 = 0L;

	@ObfuscatedName("nv.bv")
	public static boolean field4153 = false;

	@ObfuscatedName("nv.bj")
	public boolean field4151 = false;

	@ObfuscatedName("nv.bf")
	public static int field4152 = -1;

	@ObfuscatedName("nv.bt")
	public static int field4144 = 1;

	@ObfuscatedName("nv.bg")
	public boolean field4139 = false;

	public void supplyApplet(Applet arg0) {
		Statics.field6387 = arg0;
	}

	@ObfuscatedName("nv.u(Lnh;Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
	public final void method6717(class392 arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		try {
			this.method6678(class384.field4117, arg7);
			Statics.field2204 = Statics.field4125 = arg0.method6856();
			Statics.field10343 = Statics.field4677 = arg0.method6868();
			field4147 = 0;
			field4127 = 0;
			if (Statics.method5937() == class384.field4116) {
				Statics.field2204 += arg0.method6855() * 2;
				Statics.field10343 += arg0.method6859() * 2;
				this.method6725(arg0.method6860());
			}
			Statics.field10526 = Statics.field6387;
			this.method6652(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (Throwable var10) {
			class983.method16252(null, var10);
			this.method6675("crash");
		}
	}

	@ObfuscatedName("nv.j(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	public final void method6652(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
		Statics.field2304 = arg3;
		Statics.field1597 = arg2;
		Statics.field10528 = arg4;
		Statics.field10530 = arg5;
		Statics.field3788 = "Unknown";
		Statics.field726 = "1.1";
		try {
			Statics.field3788 = System.getProperty("java.vendor");
			Statics.field726 = System.getProperty("java.version");
		} catch (Exception var33) {
		}
		try {
			Statics.field3501 = System.getProperty("os.name");
		} catch (Exception var32) {
			Statics.field3501 = "Unknown";
		}
		Statics.field2247 = Statics.field3501.toLowerCase();
		try {
			Statics.field4150 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var31) {
			Statics.field4150 = "";
		}
		try {
			Statics.field862 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var30) {
			Statics.field862 = "";
		}
		try {
			Statics.field7436 = System.getProperty("user.home");
			if (Statics.field7436 != null) {
				Statics.field7436 = Statics.field7436 + "/";
			}
		} catch (Exception var29) {
		}
		try {
			if (Statics.field2247.startsWith("win")) {
				if (Statics.field7436 == null) {
					Statics.field7436 = System.getenv("USERPROFILE");
				}
			} else if (Statics.field7436 == null) {
				Statics.field7436 = System.getenv("HOME");
			}
			if (Statics.field7436 != null) {
				Statics.field7436 = Statics.field7436 + "/";
			}
		} catch (Exception var28) {
		}
		if (Statics.field7436 == null) {
			Statics.field7436 = "~/";
		}
		try {
			Statics.field7138 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var27) {
		}
		Statics.field943 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field7436, "/tmp/", "" };
		Statics.field2339 = new String[] { ".jagex_cache_" + Statics.field1597, ".file_store_" + Statics.field1597 };
		int var14 = 0;
		label131: while (var14 < 4) {
			Statics.field2390 = this.method6738(arg0, arg1, var14);
			if (!Statics.field2390.exists()) {
				Statics.field2390.mkdirs();
			}
			File[] var15 = Statics.field2390.listFiles();
			if (var15 == null) {
				break;
			}
			File[] var16 = var15;
			int var17 = 0;
			while (true) {
				if (var17 >= var16.length) {
					break label131;
				}
				File var18 = var16[var17];
				if (!this.method6655(var18, false)) {
					var14++;
					break;
				}
				var17++;
			}
		}
		class389.method3964(Statics.field2390);
		method14984();
		field4119 = new class577(new class576(class389.method8410("main_file_cache.dat2"), "rw", 786432000L), 5200, 0);
		field4154 = new class577(new class576(class389.method8410("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Statics.field4245 = new class577[Statics.field2304];
		for (int var19 = 0; var19 < Statics.field2304; var19++) {
			Statics.field4245[var19] = new class577(new class576(class389.method8410("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}
		try {
			Statics.field4013 = new class561();
		} catch (Exception var26) {
			class560.field6700 = false;
		}
		Statics.field4133 = new class386();
		ThreadGroup var21 = Thread.currentThread().getThreadGroup();
		for (ThreadGroup var22 = var21.getParent(); var22 != null; var22 = var22.getParent()) {
			var21 = var22;
		}
		Thread[] var23 = new Thread[1000];
		var21.enumerate(var23);
		for (int var24 = 0; var24 < var23.length; var24++) {
			if (var23[var24] != null && var23[var24].getName().startsWith("AWT")) {
				var23[var24].setPriority(1);
			}
		}
		Thread var25 = new Thread(this);
		var25.setDaemon(true);
		var25.start();
		var25.setPriority(1);
	}

	@ObfuscatedName("nv.a(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public File method6738(String arg0, String arg1, int arg2) {
		String var4 = arg2 == 0 ? "" : "" + arg2;
		Statics.field3918 = new File(Statics.field7436, "jagex_cl_" + arg0 + "_" + arg1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		if (Statics.field3918.exists()) {
			try {
				class576 var8 = new class576(Statics.field3918, "rw", 10000L);
				class814 var9 = new class814((int) var8.method12077());
				while (var9.field9626 < var9.field9629.length) {
					int var10 = var8.method12078(var9.field9629, var9.field9626, var9.field9629.length - var9.field9626);
					if (var10 == -1) {
						throw new IOException();
					}
					var9.field9626 += var10;
				}
				var9.field9626 = 0;
				int var11 = var9.method15220();
				if (var11 < 1 || var11 > 3) {
					throw new IOException("" + var11);
				}
				int var12 = 0;
				if (var11 > 1) {
					var12 = var9.method15220();
				}
				if (var11 <= 2) {
					var5 = var9.method15366();
					if (var12 == 1) {
						var6 = var9.method15366();
					}
				} else {
					var5 = var9.method15232();
					if (var12 == 1) {
						var6 = var9.method15232();
					}
				}
				var8.method12076();
			} catch (IOException var29) {
				var29.printStackTrace();
			}
			if (var5 != null) {
				File var14 = new File(var5);
				if (!var14.exists()) {
					var5 = null;
				}
			}
			if (var5 != null) {
				File var15 = new File(var5, "test.dat");
				if (!this.method6655(var15, true)) {
					var5 = null;
				}
			}
		}
		if (var5 == null && arg2 == 0) {
			label103: for (int var16 = 0; var16 < Statics.field2339.length; var16++) {
				for (int var17 = 0; var17 < Statics.field943.length; var17++) {
					File var18 = new File(Statics.field943[var17] + Statics.field2339[var16] + File.separatorChar + arg0 + File.separatorChar);
					if (var18.exists() && this.method6655(new File(var18, "test.dat"), true)) {
						var5 = var18.toString();
						var7 = true;
						break label103;
					}
				}
			}
		}
		if (var5 == null) {
			var5 = Statics.field7436 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			var7 = true;
		}
		if (var6 != null) {
			File var19 = new File(var6);
			File var20 = new File(var5);
			try {
				File[] var21 = var19.listFiles();
				File[] var22 = var21;
				for (int var23 = 0; var23 < var22.length; var23++) {
					File var24 = var22[var23];
					File var25 = new File(var20, var24.getName());
					boolean var26 = var24.renameTo(var25);
					if (!var26) {
						throw new IOException();
					}
				}
			} catch (Exception var28) {
				var28.printStackTrace();
			}
			var7 = true;
		}
		if (var7) {
			this.method6654(new File(var5), null);
		}
		return new File(var5);
	}

	@ObfuscatedName("nv.s(Ljava/io/File;I)Z")
	public boolean method6653(File arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.exists()) {
			return false;
		} else if (!arg0.isDirectory()) {
			return false;
		} else if (arg0.listFiles().length != 0) {
			return false;
		} else if (this.method6655(new File(arg0, "test.dat"), true)) {
			this.method6654(arg0, Statics.field2390);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("nv.c(Ljava/io/File;Ljava/io/File;I)V")
	public void method6654(File arg0, File arg1) {
		try {
			class576 var3 = new class576(Statics.field3918, "rw", 10000L);
			class814 var4 = new class814(500);
			var4.method15308(3);
			var4.method15308(arg1 == null ? 0 : 1);
			var4.method15230(arg0.getPath());
			if (arg1 != null) {
				var4.method15230(arg1.getPath());
			}
			var3.method12075(var4.field9629, 0, var4.field9626);
			var3.method12076();
		} catch (IOException var6) {
			var6.printStackTrace();
		}
	}

	@ObfuscatedName("nv.m(Ljava/io/File;ZB)Z")
	public boolean method6655(File arg0, boolean arg1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(arg0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (Exception var6) {
			return false;
		}
	}

	@ObfuscatedName("is.t(B)Ljava/io/File;")
	public static File method4634() {
		return Statics.field2390;
	}

	@ObfuscatedName("go.l(Ljava/lang/String;Ljava/lang/String;ZI)Lun;")
	public static class576 method4031(String arg0, String arg1, boolean arg2) {
		File var3 = new File(Statics.field2390, "preferences" + arg0 + ".dat");
		if (var3.exists()) {
			try {
				return new class576(var3, "rw", 10000L);
			} catch (IOException var14) {
			}
		}
		String var6 = "";
		if (Statics.field1597 == 33) {
			var6 = "_rc";
		} else if (Statics.field1597 == 34) {
			var6 = "_wip";
		}
		File var7 = new File(Statics.field7436, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
		if (!arg2 && var7.exists()) {
			try {
				return new class576(var7, "rw", 10000L);
			} catch (IOException var13) {
			}
		}
		try {
			return new class576(var3, "rw", 10000L);
		} catch (IOException var12) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("adh.f(I)V")
	public static void method14984() {
		try {
			File var0 = new File(Statics.field7436, "random.dat");
			if (var0.exists()) {
				field4155 = new class577(new class576(var0, "rw", 25L), 24, 0);
			} else {
				label34: for (int var1 = 0; var1 < Statics.field2339.length; var1++) {
					for (int var2 = 0; var2 < Statics.field943.length; var2++) {
						File var3 = new File(Statics.field943[var2] + Statics.field2339[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							field4155 = new class577(new class576(var3, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (field4155 == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				int var5 = var4.read();
				var4.seek(0L);
				var4.write(var5);
				var4.seek(0L);
				var4.close();
				field4155 = new class577(new class576(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var7) {
		}
	}

	@ObfuscatedName("fj.d(Laet;I)V")
	public static void method3615(class814 arg0) {
		byte[] var1 = new byte[24];
		try {
			field4155.method12109(0L);
			field4155.method12099(var1);
			int var2;
			for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
			}
			if (var2 >= 24) {
				throw new IOException();
			}
		} catch (Exception var5) {
			for (int var4 = 0; var4 < 24; var4++) {
				var1[var4] = -1;
			}
		}
		arg0.method15276(var1, 0, 24);
	}

	@ObfuscatedName("nv.o(Ljava/lang/String;I)V")
	public synchronized void method6725(String arg0) {
		Statics.field1197 = new Frame();
		Statics.field1197.setTitle(arg0);
		Statics.field1197.setResizable(true);
		Statics.field1197.addWindowListener(this);
		Statics.field1197.setBackground(Color.black);
		Statics.field1197.setVisible(true);
		Statics.field1197.toFront();
		Insets var2 = Statics.field1197.getInsets();
		Statics.field1197.setSize(Statics.field2204 + var2.left + var2.right, Statics.field10343 + var2.top + var2.bottom);
	}

	@ObfuscatedName("nv.q(I)V")
	public synchronized void method6657() {
		this.method6679();
		Container var1 = method16494();
		Statics.field1231 = new class979(var1);
		this.method6667(var1);
	}

	@ObfuscatedName("aiq.p(I)Ljava/awt/Container;")
	public static Container method16494() {
		if (Statics.field1587 == null) {
			return Statics.field1197 == null ? Statics.field6387 : Statics.field1197;
		} else {
			return Statics.field1587;
		}
	}

	@ObfuscatedName("nv.w(Ljava/awt/Container;I)V")
	public void method6667(Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Statics.field1231);
		Statics.field1231.setSize(Statics.field4125, Statics.field4677);
		Statics.field1231.setVisible(true);
		if (Statics.field1197 == arg0) {
			Insets var2 = Statics.field1197.getInsets();
			Statics.field1231.setLocation(field4147 + var2.left, field4127 + var2.top);
		} else {
			Statics.field1231.setLocation(field4147, field4127);
		}
		Statics.field1231.addFocusListener(this);
		Statics.field1231.requestFocus();
		Statics.field578 = true;
		field4134 = true;
		Statics.field1231.setFocusTraversalKeysEnabled(false);
		field4143 = true;
		field4131 = false;
		field4132 = class153.method5554();
	}

	@ObfuscatedName("nv.b(I)V")
	public void method6679() {
		if (Statics.field1231 != null) {
			Statics.field1231.removeFocusListener(this);
			Statics.field1231.getParent().setBackground(Color.black);
			Statics.field1231.getParent().remove(Statics.field1231);
		}
	}

	@ObfuscatedName("nv.x(I)Z")
	public final boolean method6660() {
		String var1 = Statics.field6387.getDocumentBase().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
			return true;
		} else if (var1.equals("stellardawn.com") || var1.endsWith(".stellardawn.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}
			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method6675("invalidhost");
				return false;
			}
		}
	}

	public void run() {
		try {
			this.method6755();
		} catch (ThreadDeath var7) {
			throw var7;
		} catch (Throwable var8) {
			class983.method16252(this.method6701(), var8);
			this.method6675("crash");
		} finally {
			this.method6664(true);
		}
	}

	@ObfuscatedName("nv.i(I)V")
	public void method6755() {
		if (Statics.field3788 != null) {
			String var1 = Statics.field3788.toLowerCase();
			if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
				String var2 = Statics.field726;
				if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
					this.method6675("wrongjava");
					return;
				}
				if (var2.startsWith("1.6.0_")) {
					int var3;
					for (var3 = 6; var3 < var2.length() && class526.method14808(var2.charAt(var3)); var3++) {
					}
					String var4 = var2.substring(6, var3);
					if (class526.method7735(var4) && class526.method5598(var4) < 10) {
						this.method6675("wrongjava");
						return;
					}
				}
			}
		}
		method16494().setFocusCycleRoot(true);
		field4152 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		field4144 = Runtime.getRuntime().availableProcessors();
		this.method6657();
		this.method6671();
		Statics.field8481 = Statics.method4777();
		while (field4149 == 0L || class153.method5554() < field4149) {
			Statics.field4138 = Statics.field8481.method6831(field4120);
			for (int var5 = 0; var5 < Statics.field4138; var5++) {
				this.method6661();
			}
			this.method6662();
			method1840(Statics.field1231);
		}
	}

	@ObfuscatedName("ax.v(Ljava/lang/Object;S)V")
	public static void method1840(Object arg0) {
		if (Statics.field7138 == null) {
			return;
		}
		for (int var1 = 0; var1 < 50 && Statics.field7138.peekEvent() != null; var1++) {
			class154.method7052(1L);
		}
		try {
			if (arg0 != null) {
				Statics.field7138.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("nv.k(B)V")
	public void method6661() {
		long var1 = class153.method5554();
		long var3 = field4145[Statics.field6664];
		field4145[Statics.field6664] = var1;
		Statics.field6664 = Statics.field6664 + 1 & 0x1F;
		if (var3 != 0L && var1 > var3) {
		}
		synchronized (this) {
			Statics.field578 = field4134;
		}
		this.method6672();
	}

	@ObfuscatedName("nv.h(I)V")
	public void method6662() {
		long var1 = class153.method5554();
		long var3 = field4123[Statics.field1198];
		field4123[Statics.field1198] = var1;
		Statics.field1198 = Statics.field1198 + 1 & 0x1F;
		if (var3 != 0L && var1 > var3) {
			int var5 = (int) (var1 - var3);
			field4121 = ((var5 >> 1) + 32000) / var5;
		}
		if (++field4130 - 1 > 50) {
			field4130 -= 50;
			field4143 = true;
			Statics.field1231.setSize(Statics.field4125, Statics.field4677);
			Statics.field1231.setVisible(true);
			if (Statics.field1197 != null && Statics.field1587 == null) {
				Insets var6 = Statics.field1197.getInsets();
				Statics.field1231.setLocation(field4147 + var6.left, field4127 + var6.top);
			} else {
				Statics.field1231.setLocation(field4147, field4127);
			}
		}
		this.method6673();
	}

	@ObfuscatedName("nv.r(I)Ljava/lang/String;")
	public String method6701() {
		return null;
	}

	@ObfuscatedName("nv.g(ZI)V")
	public final void method6664(boolean arg0) {
		synchronized (this) {
			if (field4153) {
				return;
			}
			field4153 = true;
		}
		try {
			this.method6674();
		} catch (Exception var11) {
		}
		try {
			field4119.method12097();
			for (int var5 = 0; var5 < Statics.field2304; var5++) {
				Statics.field4245[var5].method12097();
			}
			field4154.method12097();
			field4155.method12097();
		} catch (Exception var12) {
		}
		if (this.field4139) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable var10) {
			}
		}
		Statics.method2362(true);
		if (class618.method5944()) {
			class618.method11710().method6802();
		}
		if (Statics.field1231 != null) {
			try {
				Statics.field1231.removeFocusListener(this);
				Statics.field1231.getParent().remove(Statics.field1231);
			} catch (Exception var9) {
			}
		}
		if (Statics.field1197 != null) {
			Statics.field1197.setVisible(false);
			Statics.field1197.dispose();
			Statics.field1197 = null;
		}
	}

	@ObfuscatedName("dd.y(I)I")
	public static final int method2809() {
		return (int) (1000000000L / field4120);
	}

	@ObfuscatedName("ch.e(I)V")
	public static final void method2427() {
		Statics.field8481.method6833();
		for (int var0 = 0; var0 < 32; var0++) {
			field4123[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field4145[var1] = 0L;
		}
		Statics.field4138 = 0;
	}

	@ObfuscatedName("zi.ay(I)J")
	public static long method13883() {
		return Statics.field8481.method6843();
	}

	public void start() {
		if (!field4153) {
			field4149 = 0L;
		}
	}

	public void stop() {
		if (!field4153) {
			field4149 = class153.method5554() + 4000L;
		}
	}

	public void destroy() {
		if (!field4153) {
			field4149 = class153.method5554();
			class154.method7052(5000L);
			this.method6664(false);
		}
	}

	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	public final synchronized void paint(Graphics arg0) {
		if (field4153) {
			return;
		}
		field4143 = true;
		if (class153.method5554() - field4132 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= Statics.field2204 && var2.height >= Statics.field10343) {
				field4131 = true;
			}
		}
	}

	public final void focusGained(FocusEvent arg0) {
		field4134 = true;
		field4143 = true;
	}

	public final void focusLost(FocusEvent arg0) {
		field4134 = false;
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		field4146 = true;
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("js.ag(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V")
	public static final void method4801(int arg0, String arg1, Color arg2, Color arg3, Color arg4) {
		try {
			Graphics var5 = Statics.field1231.getGraphics();
			if (Statics.field2112 == null) {
				Statics.field2112 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Statics.field1209 == null) {
					Statics.field1209 = Statics.field1231.createImage(Statics.field4125, Statics.field4677);
				}
				Graphics var6 = Statics.field1209.getGraphics();
				var6.setColor(Color.black);
				var6.fillRect(0, 0, Statics.field4125, Statics.field4677);
				int var7 = Statics.field4125 / 2 - 152;
				int var8 = Statics.field4677 / 2 - 18;
				var6.setColor(arg3);
				var6.drawRect(var7, var8, 303, 33);
				var6.setColor(arg2);
				var6.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(var7 + 1, var8 + 1, 301, 31);
				var6.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
				var6.setFont(Statics.field2112);
				var6.setColor(arg4);
				var6.drawString(arg1, var7 + (304 - arg1.length() * 6) / 2, var8 + 22);
				if (field4128 != null) {
					var6.setFont(Statics.field2112);
					var6.setColor(arg4);
					var6.drawString(field4128, Statics.field4125 / 2 - field4128.length() * 6 / 2, Statics.field4677 / 2 - 26);
				}
				var5.drawImage(Statics.field1209, 0, 0, null);
			} catch (Exception var13) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Statics.field4125, Statics.field4677);
				int var10 = Statics.field4125 / 2 - 152;
				int var11 = Statics.field4677 / 2 - 18;
				var5.setColor(arg3);
				var5.drawRect(var10, var11, 303, 33);
				var5.setColor(arg2);
				var5.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var10 + 1, var11 + 1, 301, 31);
				var5.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
				var5.setFont(Statics.field2112);
				var5.setColor(arg4);
				if (field4128 != null) {
					var5.setFont(Statics.field2112);
					var5.setColor(arg4);
					var5.drawString(field4128, Statics.field4125 / 2 - field4128.length() * 6 / 2, Statics.field4677 / 2 - 26);
				}
				var5.drawString(arg1, var10 + (304 - arg1.length() * 6) / 2, var11 + 22);
			}
		} catch (Exception var14) {
			Statics.field1231.repaint();
		}
	}

	@ObfuscatedName("az.as(I)V")
	public static final void method1947() {
		Statics.field1209 = null;
		Statics.field2112 = null;
	}

	@ObfuscatedName("nv.ai(Ljava/lang/String;S)V")
	public void method6675(String arg0) {
		if (this.field4151) {
			return;
		}
		this.field4151 = true;
		System.out.println("error_game_" + arg0);
		try {
			class582.method12167(Statics.field6387, "loggedout");
		} catch (Throwable var5) {
		}
		try {
			Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("nv.ao(I)Z")
	public boolean method6676() {
		this.field4139 = class618.method11710().method6800("jaclib");
		if (this.field4139) {
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable var2) {
			}
		}
		return this.field4139;
	}

	@ObfuscatedName("nv.al(B)Z")
	public boolean method6677() {
		return class618.method11710().method6800("jagtheora");
	}

	@ObfuscatedName("nv.at(Lnt;ZI)V")
	public void method6678(class384 arg0, boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (class384.field4117 == arg0 || class384.field4118 == arg0) {
			field4148 = arg0;
			if (field4148 != class384.field4118 && arg1) {
				field4148 = class384.field4116;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("nv.af(B)V")
	public abstract void method6671();

	@ObfuscatedName("nv.ar(B)V")
	public abstract void method6672();

	@ObfuscatedName("nv.an(I)V")
	public abstract void method6673();

	@ObfuscatedName("nv.ap(I)V")
	public abstract void method6674();

	public abstract void init();
}
