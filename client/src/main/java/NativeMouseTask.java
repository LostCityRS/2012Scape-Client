
import deob.ObfuscatedName;

@ObfuscatedName("rf")
public final class NativeMouseTask implements Runnable {

	public void run() {
		try {
			Statics.field9906.run();
		} catch (Throwable var2) {
		}
		Statics.field9906 = null;
	}
}
