import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@ObfuscatedName("u")
public class PingProvider implements Runnable {

    @ObfuscatedName("u.u")
    public String field483;

    @ObfuscatedName("u.j")
    public InetAddress field486;

    @ObfuscatedName("u.a")
    public volatile long field485 = -1L;

    @ObfuscatedName("u.s")
    public volatile boolean field484 = true;

    @ObfuscatedName("u.u(Ljava/lang/String;I)V")
    public void method1233(String arg0) {
        this.field483 = arg0;
        this.field486 = null;
        this.field485 = -1L;
        if (this.field483 != null) {
            try {
                this.field486 = InetAddress.getByName(this.field483);
            } catch (UnknownHostException var3) {
            }
        }
    }

    @ObfuscatedName("u.j(I)J")
    public long method1232() {
        return this.field485;
    }

    @ObfuscatedName("u.a(I)V")
    public void method1223() {
        this.field484 = false;
    }

    public void run() {
        while (this.field484) {
            this.method1226();
        }
    }

    @ObfuscatedName("u.s(I)V")
    public void method1226() {
        if (this.field486 != null) {
            try {
                byte[] var1 = this.field486.getAddress();
                this.field485 = Ping.method84(var1[0], var1[1], var1[2], var1[3], 10000L);
            } catch (Throwable var3) {
            }
        }
        PreciseSleep.method7052(1000L);
    }
}
