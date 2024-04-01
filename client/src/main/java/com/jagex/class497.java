package com.jagex;

import deob.ObfuscatedName;
import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("rl")
public class class497 implements Runnable {

	@ObfuscatedName("rl.u")
	public final Object field5184 = new Object();

	@ObfuscatedName("rl.j")
	public Thread field5183 = new Thread(this);

	@ObfuscatedName("rl.a")
	public final Queue field5182 = new LinkedList();

	public class497() {
		this.field5183.setDaemon(true);
		this.field5183.start();
	}

	@ObfuscatedName("rl.u(Ljava/lang/String;I)Lru;")
	public class495 method8637(String arg0) {
		if (this.field5183 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			class495 var2 = new class495(arg0);
			this.method8644(var2);
			return var2;
		}
	}

	@ObfuscatedName("rl.j(I)V")
	public void method8636() {
		if (this.field5183 == null) {
			return;
		}
		this.method8644(this.field5184);
		try {
			this.field5183.join();
		} catch (InterruptedException var2) {
		}
		this.field5183 = null;
	}

	@ObfuscatedName("rl.a(Ljava/lang/Object;I)V")
	public void method8644(Object arg0) {
		Queue var2 = this.field5182;
		synchronized (this.field5182) {
			this.field5182.add(arg0);
			this.field5182.notify();
		}
	}

	public void run() {
		while (true) {
			Queue var1 = this.field5182;
			class495 var4;
			synchronized (this.field5182) {
				Object var2;
				for (var2 = this.field5182.poll(); var2 == null; var2 = this.field5182.poll()) {
					try {
						this.field5182.wait();
					} catch (InterruptedException var10) {
					}
				}
				if (this.field5184 == var2) {
					return;
				}
				var4 = (class495) var2;
			}
			int var7;
			try {
				byte[] var6 = InetAddress.getByName(var4.field5177).getAddress();
				var7 = Ping.method84(var6[0], var6[1], var6[2], var6[3], 1000L);
			} catch (Throwable var9) {
				var7 = 1000;
			}
			var4.field5178 = var7;
		}
	}
}
