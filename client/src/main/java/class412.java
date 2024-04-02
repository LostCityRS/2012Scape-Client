
import deob.ObfuscatedName;
import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("os")
public class class412 implements Runnable {

	@ObfuscatedName("os.u")
	public Thread field4318;

	@ObfuscatedName("os.j")
	public OutputStream field4317;

	@ObfuscatedName("os.a")
	public int field4319;

	@ObfuscatedName("os.s")
	public byte[] field4320;

	@ObfuscatedName("os.c")
	public int field4321 = 0;

	@ObfuscatedName("os.m")
	public int field4324 = 0;

	@ObfuscatedName("os.t")
	public IOException field4322;

	@ObfuscatedName("os.l")
	public boolean field4323;

	public class412(OutputStream arg0, int arg1) {
		this.field4317 = arg0;
		this.field4319 = arg1 + 1;
		this.field4320 = new byte[this.field4319];
		this.field4318 = new Thread(this);
		this.field4318.setDaemon(true);
		this.field4318.start();
	}

	@ObfuscatedName("os.u(B)Z")
	public boolean method7217() {
		if (!this.field4323) {
			return false;
		}
		try {
			this.field4317.close();
			if (this.field4322 == null) {
				this.field4322 = new IOException("");
			}
		} catch (IOException var2) {
			if (this.field4322 == null) {
				this.field4322 = new IOException(var2);
			}
		}
		return true;
	}

	public void run() {
		do {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field4322 != null) {
						return;
					}
					if (this.field4321 <= this.field4324) {
						var2 = this.field4324 - this.field4321;
					} else {
						var2 = this.field4324 + (this.field4319 - this.field4321);
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.field4317.flush();
					} catch (IOException var15) {
						this.field4322 = var15;
						return;
					}
					if (this.method7217()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException var16) {
					}
				}
			}
			try {
				if (this.field4321 + var2 <= this.field4319) {
					this.field4317.write(this.field4320, this.field4321, var2);
				} else {
					int var6 = this.field4319 - this.field4321;
					this.field4317.write(this.field4320, this.field4321, var6);
					this.field4317.write(this.field4320, 0, var2 - var6);
				}
			} catch (IOException var14) {
				IOException var7 = var14;
				synchronized (this) {
					this.field4322 = var7;
					return;
				}
			}
			synchronized (this) {
				this.field4321 = (this.field4321 + var2) % this.field4319;
			}
		} while (!this.method7217());
	}

	@ObfuscatedName("os.j([BIII)V")
	public void method7219(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.field4322 != null) {
				throw new IOException(this.field4322.toString());
			}
			int var5;
			if (this.field4321 <= this.field4324) {
				var5 = this.field4321 + (this.field4319 - this.field4324) - 1;
			} else {
				var5 = this.field4321 - this.field4324 - 1;
			}
			if (var5 < arg2) {
				throw new IOException("");
			}
			if (this.field4324 + arg2 <= this.field4319) {
				System.arraycopy(arg0, arg1, this.field4320, this.field4324, arg2);
			} else {
				int var6 = this.field4319 - this.field4324;
				System.arraycopy(arg0, arg1, this.field4320, this.field4324, var6);
				System.arraycopy(arg0, arg1 + var6, this.field4320, 0, arg2 - var6);
			}
			this.field4324 = (this.field4324 + arg2) % this.field4319;
			this.notifyAll();
		}
	}

	@ObfuscatedName("os.a(B)V")
	public void method7222() {
		synchronized (this) {
			this.field4323 = true;
			this.notifyAll();
		}
		try {
			this.field4318.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("os.s(B)V")
	public void method7220() {
		this.field4317 = new class879();
	}
}
