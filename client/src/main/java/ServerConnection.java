import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("ad")
public class ServerConnection {

    @ObfuscatedName("ad.j")
    public Stream field827;

    @ObfuscatedName("ad.a")
    public IterableQueue field829 = new IterableQueue();

    @ObfuscatedName("ad.s")
    public int field826 = 0;

    @ObfuscatedName("ad.c")
    public Packet field830 = new Packet(1600);

    @ObfuscatedName("ad.m")
    public Isaac randomOut;

    @ObfuscatedName("ad.t")
    public PacketBit field832 = new PacketBit(15000);

    @ObfuscatedName("ad.l")
    public Isaac field833;

    @ObfuscatedName("ad.f")
    public ServerProt field840 = null;

    @ObfuscatedName("ad.d")
    public int field835 = 0;

    @ObfuscatedName("ad.z")
    public boolean field836 = true;

    @ObfuscatedName("ad.n")
    public int field837 = 0;

    @ObfuscatedName("ad.o")
    public int field839 = 0;

    @ObfuscatedName("ad.q")
    public int field845;

    @ObfuscatedName("ad.p")
    public int field842;

    @ObfuscatedName("ad.w")
    public int field841;

    @ObfuscatedName("ad.b")
    public int field838;

    @ObfuscatedName("ad.x")
    public ServerProt field843;

    @ObfuscatedName("ad.i")
    public ServerProt field844;

    @ObfuscatedName("ad.v")
    public ServerProt field831;

    @ObfuscatedName("ad.k")
    public boolean field846 = false;

    @ObfuscatedName("ad.h")
    public PingProvider field847 = new PingProvider();

    public ServerConnection() {
        Thread var1 = new Thread(this.field847);
        var1.setPriority(1);
        var1.start();
    }

    @ObfuscatedName("ad.u(I)V")
    public final void method1935() {
        this.field829.method11557();
        this.field826 = 0;
    }

    @ObfuscatedName("ad.j(I)V")
    public final void method1912() throws IOException {
        if (this.field827 == null || this.field826 <= 0) {
            return;
        }
        this.field830.pos = 0;
        while (true) {
            ClientMessage var1 = (ClientMessage) this.field829.method11563();
            if (var1 == null || var1.field9465 > this.field830.data.length - this.field830.pos) {
                this.field827.method7193(this.field830.data, 0, this.field830.pos);
                this.field845 += this.field830.pos;
                this.field839 = 0;
                break;
            }
            this.field830.pdata(var1.field9467.data, 0, var1.field9465);
            this.field826 -= var1.field9465;
            var1.method6979();
            var1.field9467.method15282();
            var1.method15023();
        }
    }

    @ObfuscatedName("ad.a(Lada;B)V")
    public final void queue(ClientMessage arg0) {
        this.field829.method11558(arg0);
        arg0.field9465 = arg0.field9467.pos;
        arg0.field9467.pos = 0;
        this.field826 += arg0.field9465;
    }

    @ObfuscatedName("ad.s(I)V")
    public void method1933() {
        if (client.loopCycle % 50 == 0) {
            this.field841 = this.field845;
            this.field845 = 0;
            this.field838 = this.field842;
            this.field842 = 0;
        }
    }

    @ObfuscatedName("ad.c(Lov;Ljava/lang/String;I)V")
    public void method1911(Stream arg0, String arg1) {
        this.field827 = arg0;
        this.field847.method1233(arg1);
    }

    @ObfuscatedName("ad.m(I)V")
    public void method1916() {
        if (this.field827 != null) {
            this.field827.method7192();
            this.field827 = null;
        }
        this.field847.method1233(null);
    }

    @ObfuscatedName("ad.t(I)V")
    public void method1917() {
        this.field827 = null;
        this.field847.method1233(null);
    }

    @ObfuscatedName("ad.l(I)Lov;")
    public Stream getStream() {
        return this.field827;
    }
}
