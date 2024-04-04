import deob.ObfuscatedName;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.*;

@ObfuscatedName("ajv")
public class OggTheoraStream extends OggStream {

    @ObfuscatedName("ajv.l")
    public final SetupInfo field10407 = new SetupInfo();

    @ObfuscatedName("ajv.f")
    public final TheoraInfo field10408 = new TheoraInfo();

    @ObfuscatedName("ajv.d")
    public final TheoraComment field10409 = new TheoraComment();

    @ObfuscatedName("ajv.z")
    public DecoderContext field10420;

    @ObfuscatedName("ajv.n")
    public GranulePos field10411;

    @ObfuscatedName("ajv.o")
    public Frame field10405;

    @ObfuscatedName("ajv.q")
    public double field10413;

    @ObfuscatedName("ajv.p")
    public long field10414;

    @ObfuscatedName("ajv.w")
    public boolean field10406;

    @ObfuscatedName("ajv.b")
    public boolean field10416;

    @ObfuscatedName("ajv.x")
    public int field10410;

    @ObfuscatedName("ajv.i")
    public int field10418;

    @ObfuscatedName("ajv.v")
    public boolean field10419;

    @ObfuscatedName("ajv.k")
    public Object field10415;

    @ObfuscatedName("ajv.h")
    public boolean field10421;

    public OggTheoraStream(OggStreamState arg0) {
        super(arg0);
    }

    @ObfuscatedName("ajv.j(Ljagtheora/ogg/OggPacket;I)V")
    public void method15150(OggPacket arg0) {
        if (!this.field10406) {
            int var2 = this.field10407.decodeHeader(this.field10408, this.field10409, arg0);
            if (var2 == 0) {
                this.field10406 = true;
                if (this.field10408.frameWidth > 2048 || this.field10408.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field10420 = new DecoderContext(this.field10408, this.field10407);
                this.field10411 = new GranulePos();
                this.field10405 = new Frame(this.field10408.frameWidth, this.field10408.frameHeight);
                this.field10410 = this.field10420.getMaxPostProcessingLevel();
                this.method16807(this.field10418);
            } else if (var2 < 0) {
                throw new IllegalStateException("" + var2);
            }
            return;
        }
        this.field10414 = MonotonicTime.get();
        int var3 = this.field10420.decodePacketIn(arg0, this.field10411);
        if (var3 < 0) {
            throw new IllegalStateException("" + var3);
        }
        this.field10420.granuleFrame(this.field10411);
        this.field10413 = this.field10420.granuleTime(this.field10411);
        if (this.field10419) {
            boolean var4 = arg0.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field10419 = false;
        }
        if (!this.field10416 || arg0.isKeyFrame() == 1) {
            if (this.field10420.decodeFrame(this.field10405) != 0) {
                throw new IllegalStateException("" + var3);
            }
            this.field10421 = true;
        }
    }

    @ObfuscatedName("ajv.z(IB)V")
    public void method16807(int arg0) {
        this.field10418 = arg0;
        if (!this.field10406) {
            return;
        }
        if (this.field10418 > this.field10410) {
            this.field10418 = this.field10410;
        }
        if (this.field10418 < 0) {
            this.field10418 = 0;
        }
        this.field10420.setPostProcessingLevel(this.field10418);
    }

    @ObfuscatedName("ajv.n(I)F")
    public float method16812() {
        return this.field10406 && !this.field10408.method52() ? (float) this.field10408.fpsNumerator / (float) this.field10408.fpsDenominator : 0.0F;
    }

    @ObfuscatedName("ajv.o(B)D")
    public double method16809() {
        return this.field10413;
    }

    @ObfuscatedName("ajv.q(I)J")
    public long method16816() {
        return this.field10414;
    }

    @ObfuscatedName("ajv.x(I)Z")
    public boolean method16810() {
        return this.field10406;
    }

    @ObfuscatedName("ajv.a(I)V")
    public void method15153() {
        if (this.field10405 != null) {
            this.field10405.method53();
        }
        if (this.field10420 != null) {
            this.field10420.method53();
            this.field10420 = null;
        }
        if (this.field10411 != null) {
            this.field10411.method53();
            this.field10411 = null;
        }
        this.field10408.method53();
        this.field10409.method53();
        this.field10407.method53();
    }

    @ObfuscatedName("ajv.k(Lnl;I)Ljava/lang/Object;")
    public Object method16817(OggTheoraStreamRelated arg0) {
        if (this.field10405 == null) {
            return null;
        } else if (this.field10421 || this.field10415 == null) {
            this.field10415 = arg0.method7002(this.field10405.pixels, 0, this.field10405.field360, this.field10405.field360, this.field10405.field361, false);
            this.field10421 = false;
            return this.field10415;
        } else {
            return this.field10415;
        }
    }
}
