import deob.ObfuscatedName;

@ObfuscatedName("aje")
public class FrameSet extends SecondaryNode {

    @ObfuscatedName("aje.f")
    public int field10349;

    @ObfuscatedName("aje.d")
    public byte[][] field10348;

    @ObfuscatedName("aje.z")
    public AnimFrame[] field10350;

    @ObfuscatedName("aha.u(Lls;Lls;II)V")
    public static void method16191(Js5 arg0, Js5 arg1, int arg2) {
        Statics.field674 = arg0;
        Statics.field10347 = arg1;
    }

    public FrameSet(int arg0) {
        this.field10349 = arg0;
    }

    @ObfuscatedName("aje.j(B)Z")
    public boolean method16652() {
        if (this.field10350 != null) {
            return true;
        }
        if (this.field10348 == null) {
            Js5 var1 = Statics.field674;
            synchronized (Statics.field674) {
                if (!Statics.field674.method5631(this.field10349)) {
                    return false;
                }
                int[] var2 = Statics.field674.method5683(this.field10349);
                this.field10348 = new byte[var2.length][];
                for (int var3 = 0; var3 < var2.length; var3++) {
                    this.field10348[var3] = Statics.field674.method5627(this.field10349, var2[var3]);
                }
            }
        }
        boolean var5 = true;
        for (int var6 = 0; var6 < this.field10348.length; var6++) {
            byte[] var7 = this.field10348[var6];
            Packet var8 = new Packet(var7);
            var8.pos = 1;
            int var9 = var8.g2();
            Js5 var10 = Statics.field10347;
            synchronized (Statics.field10347) {
                var5 &= Statics.field10347.method5630(var9);
            }
        }
        if (!var5) {
            return false;
        }
        IterableQueue var12 = new IterableQueue();
        Js5 var13 = Statics.field674;
        int[] var15;
        synchronized (Statics.field674) {
            int var14 = Statics.field674.method5637(this.field10349);
            this.field10350 = new AnimFrame[var14];
            var15 = Statics.field674.method5683(this.field10349);
        }
        for (int var17 = 0; var17 < var15.length; var17++) {
            byte[] var18 = this.field10348[var17];
            Packet var19 = new Packet(var18);
            var19.pos = 1;
            int var20 = var19.g2();
            AnimBase var21 = null;
            for (AnimBase var22 = (AnimBase) var12.method11563(); var22 != null; var22 = (AnimBase) var12.method11567()) {
                if (var22.field9357 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                Js5 var23 = Statics.field10347;
                synchronized (Statics.field10347) {
                    var21 = new AnimBase(var20, Statics.field10347.method5635(var20));
                }
                var12.method11558(var21);
            }
            this.field10350[var15[var17]] = new AnimFrame(var18, var21);
        }
        this.field10348 = null;
        return true;
    }

    @ObfuscatedName("aje.a(II)Z")
    public boolean method16653(int arg0) {
        return this.field10350[arg0].field1492;
    }

    @ObfuscatedName("aje.s(II)Z")
    public boolean method16654(int arg0) {
        return this.field10350[arg0].field1493;
    }

    @ObfuscatedName("aje.c(IS)Z")
    public boolean method16655(int arg0) {
        return this.field10350[arg0].field1491;
    }
}
