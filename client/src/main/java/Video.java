import deob.ObfuscatedName;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

@ObfuscatedName("nw")
public abstract class Video {

    @ObfuscatedName("nw.a")
    public final byte[] field4232;

    @ObfuscatedName("nw.s")
    public final OggPage field4236;

    @ObfuscatedName("nw.c")
    public final OggPacket field4230;

    @ObfuscatedName("nw.m")
    public final OggSyncState field4235;

    @ObfuscatedName("nw.t")
    public final IterableMap field4234;

    @ObfuscatedName("nw.l")
    public boolean field4237;

    @ObfuscatedName("nw.f")
    public boolean field4238;

    @ObfuscatedName("nw.d")
    public boolean field4239;

    @ObfuscatedName("nw.z")
    public OggTheoraStream field4240;

    @ObfuscatedName("nw.n")
    public OggVorbisStream field4243;

    @ObfuscatedName("nw.o")
    public OggKateStream field4241;

    @ObfuscatedName("nw.q")
    public String field4233;

    @ObfuscatedName("nw.p")
    public boolean field4244;

    public Video(int arg0) {
        if (!NativeLibraries.method11710().method6800("jagtheora")) {
            throw new RuntimeException("");
        }
        this.field4232 = new byte[arg0];
        this.field4235 = new OggSyncState();
        this.field4236 = new OggPage();
        this.field4230 = new OggPacket();
        this.field4234 = new IterableMap(8);
    }

    @ObfuscatedName("nw.j(B)Ladp;")
    public OggStream method7005() throws IOException {
        if (this.field4238) {
            throw new IllegalStateException();
        } else if (this.field4239) {
            return null;
        } else {
            while (this.field4235.pageOut(this.field4236) <= 0) {
                int var1 = this.method7032(this.field4232);
                if (var1 == -1) {
                    this.field4239 = true;
                    return null;
                }
                if (var1 == 0) {
                    return null;
                }
                if (!this.field4235.write(this.field4232, var1)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field4236.getSerialNumber();
            if (!this.field4236.isBOS()) {
                OggStream var9 = (OggStream) this.field4234.method11923((long) var2);
                if (!var9.field9557.pageIn(this.field4236)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field4236)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field4230) == 1) {
                OggStream var4;
                if (this.field4240 == null && this.field4230.isTheora()) {
                    this.field4240 = new OggTheoraStream(var3);
                    var4 = this.field4240;
                } else if (this.field4243 == null && this.field4230.isVorbis()) {
                    this.field4243 = new OggVorbisStream(var3);
                    var4 = this.field4243;
                } else {
                    byte[] var5 = this.field4230.getData();
                    StringBuilder var6 = new StringBuilder();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new OggKateStream(var3);
                    } else {
                        var4 = new OggOtherStream(var3);
                    }
                }
                this.field4234.method11927(var4, (long) var2);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @ObfuscatedName("nw.a(I)V")
    public void method7006() throws IOException {
        if (this.field4244) {
            return;
        }
        while (!this.field4238) {
            OggStream var1;
            if (this.field4237) {
                var1 = (OggStream) this.field4234.method11923((long) this.field4236.getSerialNumber());
            } else {
                var1 = this.method7005();
                if (var1 == null) {
                    if (this.field4239) {
                        this.method7010();
                    }
                    return;
                }
                if (var1 == null) {
                    throw new IllegalStateException();
                }
                this.field4237 = true;
            }
            if (this.field4243 == var1) {
                if (this.field4243.method16794() >= 50) {
                    return;
                }
                while (this.field4243.field9557.packetOut(this.field4230) == 1) {
                    this.field4243.method15152(this.field4230);
                    this.method7008();
                    if (this.field4240 != null) {
                        double var2 = this.field4240.method16809();
                        for (int var4 = 0; var4 < 10 && this.method7042(); var4++) {
                            this.method7007();
                            if (this.field4238) {
                                return;
                            }
                        }
                        if (var2 < this.field4240.method16809()) {
                            return;
                        }
                    }
                    if (this.field4243.method16794() >= 50) {
                        return;
                    }
                }
            } else if (var1 instanceof OggKateStream) {
                this.method7008();
            } else if (this.field4240 != var1) {
                while (var1.field9557.packetOut(this.field4230) == 1) {
                    if (var1.field9558 == 1 && var1 instanceof OggKateStream) {
                        this.method7003(this.field4233);
                    }
                    var1.method15152(this.field4230);
                }
            } else if (this.field4243 == null && !this.field4244) {
                for (int var5 = 0; var5 < 10 && this.method7042(); var5++) {
                    this.method7007();
                    if (this.field4238) {
                        return;
                    }
                }
                return;
            }
            this.field4237 = false;
        }
    }

    @ObfuscatedName("nw.s(I)V")
    public void method7007() throws IOException {
        while (this.field4240.field9557.packetOut(this.field4230) != 1) {
            OggStream var1 = this.method7005();
            if (var1 == null) {
                if (this.field4239) {
                    this.method7010();
                }
                return;
            }
            if (this.field4241 == var1) {
                this.method7008();
            }
        }
        this.field4240.method15152(this.field4230);
    }

    @ObfuscatedName("nw.c(I)V")
    public void method7008() {
        for (OggStream var1 = (OggStream) this.field4234.method11928(); var1 != null; var1 = (OggStream) this.field4234.method11929()) {
            if (var1 instanceof OggKateStream) {
                OggKateStream var2 = (OggKateStream) var1;
                while ((var2.field9558 <= 8 || this.method7039() > (double) var2.method16826()) && var2.field9557.packetOut(this.field4230) == 1) {
                    var2.method15152(this.field4230);
                }
            }
        }
        this.method7003(this.field4233);
    }

    @ObfuscatedName("nw.m(I)Z")
    public boolean method7042() {
        if (this.field4243 == null) {
            double var1 = (double) this.field4240.method16812();
            return var1 == 0.0D || (double) MonotonicTime.method5554() >= (double) this.field4240.method16816() + 1000.0D / var1;
        } else {
            return !this.field4240.method16810() || this.method7039() > this.field4240.method16809();
        }
    }

    @ObfuscatedName("nw.t(I)V")
    public void method7010() {
        for (OggStream var1 = (OggStream) this.field4234.method11928(); var1 != null; var1 = (OggStream) this.field4234.method11929()) {
            if (this.field4240 != var1) {
                while (var1.field9557.packetOut() == 1) {
                    var1.method15152(this.field4230);
                }
            }
        }
        if (this.field4240 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10 && this.method7042(); var2++) {
            if (this.field4240.field9557.packetOut() != 1) {
                this.method7022();
                return;
            }
            this.field4240.method15152(this.field4230);
        }
    }

    @ObfuscatedName("nw.l(B)V")
    public void method7022() {
        if (this.field4238) {
            return;
        }
        for (OggStream var1 = (OggStream) this.field4234.method11928(); var1 != null; var1 = (OggStream) this.field4234.method11929()) {
            var1.method15153();
            var1.field9557.method53();
        }
        this.field4230.method53();
        this.field4236.method53();
        this.field4235.method53();
        this.field4238 = true;
    }

    @ObfuscatedName("nw.f(B)Lajv;")
    public OggTheoraStream method7029() {
        return this.field4240;
    }

    @ObfuscatedName("nw.d(I)Lajp;")
    public OggVorbisStream method7009() {
        return this.field4243;
    }

    @ObfuscatedName("nw.z(I)Lajr;")
    public OggKateStream method7014() {
        return this.field4241;
    }

    @ObfuscatedName("nw.n(I)Z")
    public boolean method7015() {
        if (this.field4238 || this.field4239) {
            return this.field4243 == null || this.field4243.method16794() <= 0;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nw.o(Ljava/lang/String;B)V")
    public void method7003(String arg0) {
        this.field4233 = arg0;
        if (this.field4233 == null) {
            this.field4241 = null;
            return;
        }
        if (this.field4241 != null && !this.field4233.equals(this.field4241.method16824())) {
            this.field4241 = null;
        }
        if (this.field4241 != null) {
            return;
        }
        for (OggStream var2 = (OggStream) this.field4234.method11928(); var2 != null; var2 = (OggStream) this.field4234.method11929()) {
            if (var2 instanceof OggKateStream) {
                OggKateStream var3 = (OggKateStream) var2;
                if (this.field4233.equals(var3.method16824())) {
                    this.field4241 = var3;
                    return;
                }
            }
        }
    }

    @ObfuscatedName("nw.q(S)D")
    public double method7039() {
        if (this.field4243 == null) {
            return this.field4240 == null ? 0.0D : this.field4240.method16809();
        } else {
            return this.field4243.method16793();
        }
    }

    @ObfuscatedName("nw.p(ZS)V")
    public void method7018(boolean arg0) {
        if (this.field4243 != null) {
            OggVorbisStreamRelated1 var2 = this.field4243.method16795();
            if (var2 != null) {
                var2.method16473(arg0);
            }
        }
        this.field4244 = !this.field4244;
    }

    @ObfuscatedName("nw.u([BI)I")
    public abstract int method7032(byte[] arg0) throws IOException;
}
