
import deob.ObfuscatedName;
import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("aer")
public class NativeMouse extends IcmpService {

	@ObfuscatedName("aer.j")
	public final List field9812 = new ArrayList();

	@ObfuscatedName("mp.s(Lrp;I)V")
	public static void method6260(class494 arg0) {
		if (Statics.field9906 == null) {
			throw new IllegalStateException("");
		}
		Statics.field9906.field9812.add(arg0);
	}

	@ObfuscatedName("dc.c(B)Z")
	public static boolean method2792() {
		try {
			if (!available()) {
				return false;
			}
		} catch (Throwable var2) {
			return false;
		}
		if (Statics.field9906 != null) {
			throw new IllegalStateException("");
		}
		Statics.field9906 = new NativeMouse();
		Thread var1 = new Thread(new NativeMouseTask());
		var1.setDaemon(true);
		var1.start();
		return true;
	}

	@ObfuscatedName("wj.m(S)V")
	public static void method12637() {
		if (Statics.field9906 == null) {
			return;
		}
		try {
			Statics.field9906.quit();
		} catch (Throwable var1) {
		}
		Statics.field9906 = null;
	}

	public void notify(int arg0) {
		Iterator var2 = this.field9812.iterator();
		while (var2.hasNext()) {
			class494 var3 = (class494) var2.next();
			var3.method8306(arg0 == 0);
		}
	}

	public void notify(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field9812.iterator();
		while (var4.hasNext()) {
			class494 var5 = (class494) var4.next();
			var5.method8307(arg0, arg1, arg2);
		}
	}
}
