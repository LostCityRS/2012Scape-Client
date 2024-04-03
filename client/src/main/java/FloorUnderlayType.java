import deob.ObfuscatedName;

@ObfuscatedName("uc")
public class FloorUnderlayType {

    @ObfuscatedName("uc.u")
    public int field6716 = 0;

    @ObfuscatedName("uc.j")
    public int field6713 = -1;

    @ObfuscatedName("uc.a")
    public int field6715 = 512;

    @ObfuscatedName("uc.s")
    public boolean field6719 = true;

    @ObfuscatedName("uc.c")
    public boolean field6717 = true;

    @ObfuscatedName("uc.m")
    public int field6718;

    @ObfuscatedName("uc.t")
    public int field6714;

    @ObfuscatedName("uc.l")
    public int field6720;

    @ObfuscatedName("uc.f")
    public int field6721;

    @ObfuscatedName("uc.u(Laet;B)V")
    public void method11909(Packet arg0) {
        while (true) {
            int var2 = arg0.method15220();
            if (var2 == 0) {
                return;
            }
            this.method11918(arg0, var2);
        }
    }

    @ObfuscatedName("uc.j(Laet;II)V")
    public void method11918(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field6716 = arg0.method15241();
            this.method11916(this.field6716);
        } else if (arg1 == 2) {
            this.field6713 = arg0.method15239();
            if (this.field6713 == 65535) {
                this.field6713 = -1;
            }
        } else if (arg1 == 3) {
            this.field6715 = arg0.method15239() << 2;
        } else if (arg1 == 4) {
            this.field6719 = false;
        } else if (arg1 == 5) {
            this.field6717 = false;
        }
    }

    @ObfuscatedName("uc.a(IB)V")
    public void method11916(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field6714 = (int) (var14 * 256.0D);
        this.field6720 = (int) (var16 * 256.0D);
        if (this.field6714 < 0) {
            this.field6714 = 0;
        } else if (this.field6714 > 255) {
            this.field6714 = 255;
        }
        if (this.field6720 < 0) {
            this.field6720 = 0;
        } else if (this.field6720 > 255) {
            this.field6720 = 255;
        }
        if (var16 > 0.5D) {
            this.field6721 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field6721 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field6721 < 1) {
            this.field6721 = 1;
        }
        this.field6718 = (int) ((double) this.field6721 * var18);
    }
}
