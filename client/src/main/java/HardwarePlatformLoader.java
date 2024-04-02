
import deob.ObfuscatedName;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

@ObfuscatedName("nb")
public class HardwarePlatformLoader implements class617 {

	@ObfuscatedName("nb.u")
	public final Js5 field4159;

	@ObfuscatedName("nb.j")
	public final String field4158;

	@ObfuscatedName("nb.a")
	public Hashtable field4157 = new Hashtable();

	@ObfuscatedName("nb.s")
	public Hashtable field4160 = new Hashtable();

	public HardwarePlatformLoader(Js5 arg0) {
		this.field4159 = arg0;
		String var2 = "";
		if (class616.field7296.startsWith("win") || class616.field7296.startsWith("windows 7")) {
			var2 = var2 + "windows/";
		} else if (class616.field7296.startsWith("linux")) {
			var2 = var2 + "linux/";
		} else if (class616.field7296.startsWith("mac")) {
			var2 = var2 + "macos/";
		}
		String var3;
		if (class616.field7297.startsWith("amd64") || class616.field7297.startsWith("x86_64")) {
			var3 = var2 + "x86_64/";
		} else if (class616.field7297.startsWith("i386") || class616.field7297.startsWith("i486") || class616.field7297.startsWith("i586") || class616.field7297.startsWith("x86")) {
			var3 = var2 + "x86/";
		} else if (class616.field7297.startsWith("ppc")) {
			var3 = var2 + "ppc/";
		} else {
			var3 = var2 + "universal/";
		}
		this.field4158 = var3;
	}

	@ObfuscatedName("ex.u(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3306(String arg0) {
		if (class616.field7296.startsWith("win")) {
			return arg0 + ".dll";
		} else if (class616.field7296.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (class616.field7296.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@ObfuscatedName("nb.j(Ljava/lang/String;I)I")
	public int method6796(String arg0) {
		if (this.field4157.containsKey(arg0)) {
			return 100;
		}
		String var2 = method3306(arg0);
		if (var2 == null) {
			return -1;
		}
		String var3 = null;
		if (var3 == null) {
			var3 = this.field4158 + var2;
			if (!this.field4159.method5644(var3, "")) {
				return -1;
			}
		}
		if (!this.field4159.method5648(var3)) {
			return this.field4159.method5650(var3);
		}
		byte[] var4 = this.field4159.method5645(var3, "");
		Object var5 = null;
		File var6;
		try {
			var6 = CacheUtil.method8410(var2);
		} catch (RuntimeException var15) {
			return -1;
		}
		if (var4 == null || var6 == null) {
			return -1;
		}
		boolean var8 = true;
		byte[] var9 = class575.method15684(var6);
		if (var9 != null && var4.length == var9.length) {
			for (int var10 = 0; var10 < var9.length; var10++) {
				if (var4[var10] != var9[var10]) {
					var8 = false;
					break;
				}
			}
		} else {
			var8 = false;
		}
		try {
			if (!var8) {
				try {
					FileOutputStream var11 = new FileOutputStream(var6);
					var11.write(var4, 0, var4.length);
					var11.close();
				} catch (IOException var14) {
					throw new RuntimeException();
				}
			}
		} catch (Throwable var16) {
			return -1;
		}
		this.method6797(arg0, var6);
		return 100;
	}

	@ObfuscatedName("nb.a(Ljava/lang/String;Ljava/io/File;B)V")
	public void method6797(String arg0, File arg1) {
		this.field4157.put(arg0, arg1);
	}

	@ObfuscatedName("nb.s(Ljava/lang/String;I)Z")
	public boolean method6803(String arg0) {
		return this.field4157.containsKey(arg0);
	}

	@ObfuscatedName("nb.c(Ljava/lang/String;I)Z")
	public boolean method6799(String arg0) {
		return this.field4160.containsKey(arg0);
	}

	@ObfuscatedName("nb.m(Ljava/lang/String;B)Z")
	public boolean method6800(String arg0) {
		return this.method6801(arg0, class391.class);
	}

	@ObfuscatedName("nb.t(Ljava/lang/String;Ljava/lang/Class;B)Z")
	public boolean method6801(String arg0, Class arg1) {
		Class var3 = (Class) this.field4160.get(arg0);
		if (var3 != null) {
			return var3.getClassLoader() == arg1.getClassLoader();
		}
		File var4 = null;
		if (var4 == null) {
			var4 = (File) this.field4157.get(arg0);
		}
		if (var4 != null) {
			try {
				var4 = new File(var4.getCanonicalPath());
				Class var5 = Class.forName("java.lang.Runtime");
				Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
				Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
				Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				var7.invoke(var8, Boolean.TRUE);
				var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
				var7.invoke(var8, Boolean.FALSE);
				this.field4160.put(arg0, arg1);
				return true;
			} catch (NoSuchMethodException var11) {
				System.load(var4.getPath());
				this.field4160.put(arg0, class391.class);
				return true;
			} catch (Throwable var12) {
			}
		}
		return false;
	}

	@ObfuscatedName("nb.l(B)Z")
	public boolean method6802() {
		Hashtable var1 = new Hashtable();
		Enumeration var2 = this.field4160.keys();
		while (var2.hasMoreElements()) {
			String var3 = (String) var2.nextElement();
			var1.put(var3, this.field4160.get(var3));
		}
		try {
			Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
			Class var5 = Class.forName("java.lang.ClassLoader");
			Field var6 = var5.getDeclaredField("nativeLibraries");
			Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
			var7.invoke(var6, Boolean.TRUE);
			try {
				Enumeration var8 = this.field4160.keys();
				while (var8.hasMoreElements()) {
					String var9 = (String) var8.nextElement();
					try {
						File var10 = (File) this.field4157.get(var9);
						Class var11 = (Class) this.field4160.get(var9);
						Vector var12 = (Vector) var6.get(var11.getClassLoader());
						for (int var13 = 0; var13 < var12.size(); var13++) {
							try {
								Object var14 = var12.elementAt(var13);
								Field var15 = var14.getClass().getDeclaredField("name");
								var7.invoke(var15, Boolean.TRUE);
								try {
									String var16 = (String) var15.get(var14);
									if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
										Field var17 = var14.getClass().getDeclaredField("handle");
										Method var18 = var14.getClass().getDeclaredMethod("finalize");
										var7.invoke(var17, Boolean.TRUE);
										var7.invoke(var18, Boolean.TRUE);
										try {
											var18.invoke(var14);
											var17.set(var14, Integer.valueOf(0));
											var1.remove(var9);
										} catch (Throwable var25) {
										}
										var7.invoke(var18, Boolean.FALSE);
										var7.invoke(var17, Boolean.FALSE);
									}
								} catch (Throwable var26) {
								}
								var7.invoke(var15, Boolean.FALSE);
							} catch (Throwable var27) {
							}
						}
					} catch (Throwable var28) {
					}
				}
			} catch (Throwable var29) {
			}
			var7.invoke(var6, Boolean.FALSE);
		} catch (Throwable var30) {
		}
		this.field4160 = var1;
		return this.field4160.isEmpty();
	}
}
