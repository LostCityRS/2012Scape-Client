
import deob.ObfuscatedName;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@ObfuscatedName("gf")
public class class213 implements Runnable {

	@ObfuscatedName("gf.u")
	public class209[] field2332;

	@ObfuscatedName("gf.j")
	public Thread field2331;

	@ObfuscatedName("gf.a")
	public volatile boolean field2330;

	@ObfuscatedName("gf.u(II)Lgm;")
	public class209 method3991(int arg0) {
		return this.field2332 == null || arg0 < 0 || arg0 >= this.field2332.length ? null : this.field2332[arg0];
	}

	@ObfuscatedName("gf.j(I)Z")
	public boolean method3992() {
		if (this.field2330) {
			return true;
		}
		if (this.field2331 == null) {
			this.field2331 = new Thread(this);
			this.field2331.start();
		}
		return this.field2330;
	}

	public void run() {
		try {
			int var1 = Statics.field6683 == ModeWhere.field6368 ? 80 : Statics.field6773.field6768 + 7000;
			BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Statics.field6773.field6765 + ":" + var1 + "/news.ws?game=" + client.field9163.field6408)).openStream())));
			String var3 = var2.readLine();
			ArrayList var4 = new ArrayList();
			while (var3 != null) {
				var4.add(var3);
				var3 = var2.readLine();
			}
			String[] var5 = new String[var4.size()];
			var4.toArray(var5);
			if (var5.length % 3 != 0) {
				return;
			}
			this.field2332 = new class209[var5.length / 3];
			for (int var6 = 0; var6 < var5.length; var6 += 3) {
				this.field2332[var6 / 3] = new class209(var5[var6], var5[var6 + 1], var5[var6 + 2]);
			}
		} catch (IOException var8) {
		}
		this.field2330 = true;
	}
}
