import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("ad")
public class ServerConnection {

    @ObfuscatedName("ad.j")
    public Stream stream;

    @ObfuscatedName("ad.a")
    public LinkedList writeQueue = new LinkedList();

    @ObfuscatedName("ad.s")
    public int writePos = 0;

    @ObfuscatedName("ad.c")
    public Packet out = new Packet(1600);

    @ObfuscatedName("ad.m")
    public Isaac randomOut;

    @ObfuscatedName("ad.t")
    public PacketBit in = new PacketBit(15000);

    @ObfuscatedName("ad.l")
    public Isaac randomIn;

    @ObfuscatedName("ad.f")
    public ServerProt packetType = null;

    @ObfuscatedName("ad.d")
    public int packetSize = 0;

    @ObfuscatedName("ad.z")
    public boolean field836 = true;

    @ObfuscatedName("ad.n")
    public int idleNetCycles = 0;

    @ObfuscatedName("ad.o")
    public int numConnections = 0;

    @ObfuscatedName("ad.q")
    public int totalBytesSent;

    @ObfuscatedName("ad.p")
    public int readPos;

    @ObfuscatedName("ad.w")
    public int outBytesPerSecond;

    @ObfuscatedName("ad.b")
    public int inBytesPerSecond;

    @ObfuscatedName("ad.x")
    public ServerProt lastPacketType0;

    @ObfuscatedName("ad.i")
    public ServerProt lastPacketType1;

    @ObfuscatedName("ad.v")
    public ServerProt lastPacketType2;

    @ObfuscatedName("ad.k")
    public boolean disconnected = false;

    @ObfuscatedName("ad.h")
    public PingProvider pingProvider = new PingProvider();

    public ServerConnection() {
        Thread var1 = new Thread(this.pingProvider);
        var1.setPriority(1);
        var1.start();
    }

    @ObfuscatedName("ad.u(I)V")
    public final void method1935() {
        this.writeQueue.clearBridged();
        this.writePos = 0;
    }

    @ObfuscatedName("ad.j(I)V")
    public final void method1912() throws IOException {
        if (this.stream == null || this.writePos <= 0) {
            return;
        }
        this.out.pos = 0;
        while (true) {
            ClientMessage var1 = (ClientMessage) this.writeQueue.head();
            if (var1 == null || var1.field9465 > this.out.data.length - this.out.pos) {
                this.stream.method7193(this.out.data, 0, this.out.pos);
                this.totalBytesSent += this.out.pos;
                this.numConnections = 0;
                break;
            }
            this.out.pdata(var1.buf.data, 0, var1.field9465);
            this.writePos -= var1.field9465;
            var1.unlink();
            var1.buf.release();
            var1.method15023();
        }
    }

    @ObfuscatedName("ad.a(Lada;B)V")
    public final void queue(ClientMessage arg0) {
        this.writeQueue.addTail(arg0);
        arg0.field9465 = arg0.buf.pos;
        arg0.buf.pos = 0;
        this.writePos += arg0.field9465;
    }

    @ObfuscatedName("ad.s(I)V")
    public void method1933() {
        if (client.loopCycle % 50 == 0) {
            this.outBytesPerSecond = this.totalBytesSent;
            this.totalBytesSent = 0;
            this.inBytesPerSecond = this.readPos;
            this.readPos = 0;
        }
    }

    @ObfuscatedName("ad.c(Lov;Ljava/lang/String;I)V")
    public void method1911(Stream arg0, String arg1) {
        this.stream = arg0;
        this.pingProvider.method1233(arg1);
    }

    @ObfuscatedName("ad.m(I)V")
    public void method1916() {
        if (this.stream != null) {
            this.stream.method7192();
            this.stream = null;
        }
        this.pingProvider.method1233(null);
    }

    @ObfuscatedName("ad.t(I)V")
    public void closeForcefully() {
        this.stream = null;
        this.pingProvider.method1233(null);
    }

    @ObfuscatedName("ad.l(I)Lov;")
    public Stream getStream() {
        return this.stream;
    }
}
