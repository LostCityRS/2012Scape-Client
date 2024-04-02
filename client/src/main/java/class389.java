
import deob.ObfuscatedName;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("nx")
public class class389 {

	@ObfuscatedName("nx.u")
	public static boolean field4164 = false;

	@ObfuscatedName("nx.a")
	public static Hashtable field4163 = new Hashtable(16);

	public class389() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gc.u(Ljava/io/File;I)V")
	public static void method3964(File arg0) {
		Statics.field4162 = arg0;
		if (!Statics.field4162.exists()) {
			throw new RuntimeException("");
		}
		field4164 = true;
	}

	@ObfuscatedName("qg.j(Ljava/lang/String;S)Ljava/io/File;")
	public static File method8410(String arg0) {
		if (!field4164) {
			throw new RuntimeException("");
		}
		File var1 = (File) field4163.get(arg0);
		if (var1 != null) {
			return var1;
		}
		File var2 = new File(Statics.field4162, arg0);
		RandomAccessFile var3 = null;
		try {
			File var4 = new File(var2.getParent());
			if (!var4.exists()) {
				throw new RuntimeException("");
			}
			var3 = new RandomAccessFile(var2, "rw");
			int var5 = var3.read();
			var3.seek(0L);
			var3.write(var5);
			var3.seek(0L);
			var3.close();
			field4163.put(arg0, var2);
			return var2;
		} catch (Exception var10) {
			try {
				if (var3 != null) {
					var3.close();
					Object var7 = null;
				}
			} catch (Exception var9) {
			}
			throw new RuntimeException();
		}
	}
}
