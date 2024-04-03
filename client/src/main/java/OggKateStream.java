import deob.ObfuscatedName;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

@ObfuscatedName("ajr")
public class OggKateStream extends OggStream {

    @ObfuscatedName("ajr.l")
    public int field10422;

    @ObfuscatedName("ajr.f")
    public int field10425;

    @ObfuscatedName("ajr.d")
    public String field10427;

    @ObfuscatedName("ajr.z")
    public String field10426;

    @ObfuscatedName("ajr.n")
    public float field10428;

    @ObfuscatedName("ajr.o")
    public float field10429;

    @ObfuscatedName("ajr.q")
    public String field10430;

    public OggKateStream(OggStreamState arg0) {
        super(arg0);
    }

    @ObfuscatedName("ajr.j(Ljagtheora/ogg/OggPacket;I)V")
    public void method15150(OggPacket arg0) {
        if (this.field9558 > 0 && !"SUB".equals(this.field10426)) {
            return;
        }
        Packet var2 = new Packet(arg0.getData());
        int var3 = var2.g1();
        if (this.field9558 <= 8) {
            if ((var3 | 0x80) == 0) {
                throw new IllegalStateException();
            }
            if (this.field9558 == 0) {
                var2.pos += 23;
                this.field10422 = var2.ig4();
                this.field10425 = var2.ig4();
                if (this.field10422 == 0 || this.field10425 == 0) {
                    throw new IllegalStateException();
                }
                Packet var4 = new Packet(16);
                var2.gdata(var4.data, 0, 16);
                this.field10427 = var4.gjstr();
                var4.pos = 0;
                var2.gdata(var4.data, 0, 16);
                this.field10426 = var4.gjstr();
            }
            return;
        }
        if (var3 == 0) {
            long var5 = var2.ig8();
            long var7 = var2.ig8();
            long var9 = var2.ig8();
            if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
                throw new IllegalStateException();
            }
            this.field10428 = (float) ((long) this.field10425 * var5) / (float) this.field10422;
            this.field10429 = (float) ((var5 + var7) * (long) this.field10425) / (float) this.field10422;
            int var11 = var2.ig4();
            if (var11 < 0 || var11 > var2.data.length - var2.pos) {
                throw new IllegalStateException();
            }
            this.field10430 = Statics.method2786(var2.data, var2.pos, var11);
        }
        if ((var3 | 0x80) != 0) {
            return;
        }
    }

    @ObfuscatedName("ajr.z(I)Ljava/lang/String;")
    public String method16824() {
        return this.field10427;
    }

    @ObfuscatedName("ajr.n(I)F")
    public float method16825() {
        return this.field10428;
    }

    @ObfuscatedName("ajr.o(I)F")
    public float method16826() {
        return this.field10429;
    }

    @ObfuscatedName("ajr.q(I)Ljava/lang/String;")
    public String method16823() {
        return this.field10430;
    }

    @ObfuscatedName("ajr.a(I)V")
    public void method15153() {
    }
}
