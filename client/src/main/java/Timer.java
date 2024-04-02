
import deob.ObfuscatedName;

@ObfuscatedName("nk")
public abstract class Timer {

	@ObfuscatedName("nk.j(J)I")
	public final int method6831(long arg0) {
		long var3 = this.method6839();
		if (var3 > 0L) {
			PreciseSleep.method7052(var3);
		}
		return this.method6832(arg0);
	}

	@ObfuscatedName("nk.c(J)I")
	public abstract int method6832(long arg0);

	@ObfuscatedName("nk.a(B)V")
	public abstract void method6833();

	@ObfuscatedName("nk.s(B)J")
	public abstract long method6839();

	@ObfuscatedName("nk.m(I)J")
	public abstract long method6843();
}
