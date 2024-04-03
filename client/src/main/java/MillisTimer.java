import deob.ObfuscatedName;
import jaclib.nanotime.QueryPerformanceCounter;

@ObfuscatedName("acc")
public class MillisTimer extends Timer {

    @ObfuscatedName("acc.u")
    public long field9243 = 0L;

    @ObfuscatedName("acc.j")
    public long field9246 = 0L;

    @ObfuscatedName("acc.a")
    public long field9244 = 0L;

    @ObfuscatedName("acc.s")
    public long[] field9245 = new long[10];

    @ObfuscatedName("acc.c")
    public int field9242 = 0;

    @ObfuscatedName("acc.m")
    public int field9247 = 1;

    public MillisTimer() {
        this.field9246 = this.field9243 = QueryPerformanceCounter.nanoTime();
        if (this.field9243 == 0L) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("acc.a(B)V")
    public void method6833() {
        this.field9244 = 0L;
        if (this.field9246 > this.field9243) {
            this.field9243 += this.field9246 - this.field9243;
        }
    }

    @ObfuscatedName("acc.s(B)J")
    public long method6839() {
        this.field9243 += this.method14724();
        return this.field9246 > this.field9243 ? (this.field9246 - this.field9243) / 1000000L : 0L;
    }

    @ObfuscatedName("acc.c(J)I")
    public int method6832(long arg0) {
        if (this.field9246 > this.field9243) {
            this.field9244 += this.field9246 - this.field9243;
            this.field9243 += this.field9246 - this.field9243;
            this.field9246 += arg0;
            return 1;
        }
        int var3 = 0;
        do {
            var3++;
            this.field9246 += arg0;
        } while (var3 < 10 && this.field9246 < this.field9243);
        if (this.field9246 < this.field9243) {
            this.field9246 = this.field9243;
        }
        return var3;
    }

    @ObfuscatedName("acc.m(I)J")
    public long method6843() {
        return this.field9243;
    }

    @ObfuscatedName("acc.w(I)J")
    public long method14724() {
        long var1 = QueryPerformanceCounter.nanoTime();
        long var3 = var1 - this.field9244;
        this.field9244 = var1;
        if (var3 > -5000000000L && var3 < 5000000000L) {
            this.field9245[this.field9242] = var3;
            this.field9242 = (this.field9242 + 1) % 10;
            if (this.field9247 < 1) {
                this.field9247++;
            }
        }
        long var5 = 0L;
        for (int var7 = 1; var7 <= this.field9247; var7++) {
            var5 += this.field9245[(this.field9242 - var7 + 10) % 10];
        }
        return var5 / (long) this.field9247;
    }
}
