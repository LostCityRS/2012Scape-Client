import deob.ObfuscatedName;

@ObfuscatedName("ry")
public class FloorOverlayType {

    @ObfuscatedName("ry.j")
    public FloorOverlayTypeList field5088;

    @ObfuscatedName("ry.a")
    public int field5089;

    @ObfuscatedName("ry.s")
    public int field5094 = 0;

    @ObfuscatedName("ry.c")
    public int field5092 = -1;

    @ObfuscatedName("ry.m")
    public boolean field5103 = true;

    @ObfuscatedName("ry.t")
    public int field5091 = -1;

    @ObfuscatedName("ry.l")
    public int field5087 = 512;

    @ObfuscatedName("ry.f")
    public boolean field5095 = true;

    @ObfuscatedName("ry.d")
    public int field5096 = 8;

    @ObfuscatedName("ry.z")
    public boolean field5097 = false;

    @ObfuscatedName("ry.n")
    public int field5102 = 1190717;

    @ObfuscatedName("ry.o")
    public int field5099 = 50139712;

    @ObfuscatedName("ry.q")
    public int field5100 = 255;

    @ObfuscatedName("ry.p")
    public int field5101 = 63;

    @ObfuscatedName("ry.w")
    public int field5090 = 0;

    @ObfuscatedName("ry.b")
    public int field5098 = 64;

    @ObfuscatedName("ry.u(Laet;I)V")
    public void method8494(Packet arg0) {
        while (true) {
            int var2 = arg0.method15220();
            if (var2 == 0) {
                return;
            }
            this.method8488(arg0, var2);
        }
    }

    @ObfuscatedName("ry.j(Laet;II)V")
    public void method8488(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field5094 = method5934(arg0.method15241());
        } else if (arg1 == 2) {
            this.field5092 = arg0.method15220();
        } else if (arg1 == 3) {
            this.field5092 = arg0.method15239();
            if (this.field5092 == 65535) {
                this.field5092 = -1;
            }
        } else if (arg1 == 5) {
            this.field5103 = false;
        } else if (arg1 == 7) {
            this.field5091 = method5934(arg0.method15241());
        } else if (arg1 == 8) {
            this.field5088.field5108 = this.field5089;
        } else if (arg1 == 9) {
            this.field5087 = arg0.method15239() << 2;
        } else if (arg1 == 10) {
            this.field5095 = false;
        } else if (arg1 == 11) {
            this.field5096 = arg0.method15220();
        } else if (arg1 == 12) {
            this.field5097 = true;
        } else if (arg1 == 13) {
            this.field5102 = arg0.method15241();
        } else if (arg1 == 14) {
            this.field5099 = (arg0.method15220() << 2) * 1678505033;
        } else if (arg1 == 16) {
            this.field5100 = arg0.method15220();
        } else if (arg1 == 20) {
            this.field5101 = arg0.method15239();
        } else if (arg1 == 21) {
            this.field5090 = arg0.method15220();
        } else if (arg1 == 22) {
            this.field5098 = arg0.method15239();
        }
    }

    @ObfuscatedName("ry.a(B)V")
    public void method8489() {
        this.field5096 = this.field5096 << 8 | this.field5089;
    }

    @ObfuscatedName("lt.s(IB)I")
    public static int method5934(int arg0) {
        return arg0 == 16711935 ? -1 : ColourUtils.method16884(arg0);
    }
}
