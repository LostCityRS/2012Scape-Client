
import deob.ObfuscatedName;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("og")
public class SocketStreamReader implements Runnable {

	@ObfuscatedName("og.u")
	public Thread field4306;

	@ObfuscatedName("og.j")
	public InputStream field4305;

	@ObfuscatedName("og.a")
	public int field4310;

	@ObfuscatedName("og.s")
	public byte[] field4307;

	@ObfuscatedName("og.c")
	public int field4308 = 0;

	@ObfuscatedName("og.m")
	public int field4309 = 0;

	@ObfuscatedName("og.t")
	public IOException field4304;

	public SocketStreamReader(InputStream arg0, int arg1) {
		this.field4305 = arg0;
		this.field4310 = arg1 + 1;
		this.field4307 = new byte[this.field4310];
		this.field4306 = new Thread(this);
		this.field4306.setDaemon(true);
		this.field4306.start();
	}

	public void run() {
		while (true) {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field4304 != null) {
						return;
					}
					if (this.field4308 == 0) {
						var2 = this.field4310 - this.field4309 - 1;
					} else if (this.field4308 <= this.field4309) {
						var2 = this.field4310 - this.field4309;
					} else {
						var2 = this.field4308 - this.field4309 - 1;
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var13) {
					}
				}
			}
			int var5;
			try {
				var5 = this.field4305.read(this.field4307, this.field4309, var2);
				if (var5 == -1) {
					throw new EOFException();
				}
			} catch (IOException var14) {
				IOException var6 = var14;
				synchronized (this) {
					this.field4304 = var6;
					return;
				}
			}
			synchronized (this) {
				this.field4309 = (this.field4309 + var5) % this.field4310;
			}
		}
	}

	@ObfuscatedName("og.u(II)Z")
	public boolean method7158(int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.field4310) {
			throw new IOException();
		}
		synchronized (this) {
			int var3;
			if (this.field4308 <= this.field4309) {
				var3 = this.field4309 - this.field4308;
			} else {
				var3 = this.field4309 + (this.field4310 - this.field4308);
			}
			if (var3 >= arg0) {
				return true;
			} else if (this.field4304 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.field4304.toString());
			}
		}
	}

	@ObfuscatedName("og.j(I)I")
	public int method7154() throws IOException {
		synchronized (this) {
			int var2;
			if (this.field4308 <= this.field4309) {
				var2 = this.field4309 - this.field4308;
			} else {
				var2 = this.field4309 + (this.field4310 - this.field4308);
			}
			if (this.field4304 != null) {
				throw new IOException(this.field4304.toString());
			}
			this.notifyAll();
			return var2;
		}
	}

	@ObfuscatedName("og.a([BIIB)I")
	public int method7148(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			int var5;
			if (this.field4308 <= this.field4309) {
				var5 = this.field4309 - this.field4308;
			} else {
				var5 = this.field4309 + (this.field4310 - this.field4308);
			}
			if (arg2 > var5) {
				arg2 = var5;
			}
			if (arg2 == 0 && this.field4304 != null) {
				throw new IOException(this.field4304.toString());
			}
			if (this.field4308 + arg2 <= this.field4310) {
				System.arraycopy(this.field4307, this.field4308, arg0, arg1, arg2);
			} else {
				int var6 = this.field4310 - this.field4308;
				System.arraycopy(this.field4307, this.field4308, arg0, arg1, var6);
				System.arraycopy(this.field4307, 0, arg0, arg1 + var6, arg2 - var6);
			}
			this.field4308 = (this.field4308 + arg2) % this.field4310;
			this.notifyAll();
			return arg2;
		}
	}

	@ObfuscatedName("og.s(I)V")
	public void method7146() {
		synchronized (this) {
			if (this.field4304 == null) {
				this.field4304 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.field4306.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("og.c(B)V")
	public void method7150() {
		this.field4305 = new BrokenInputStream();
	}
}
