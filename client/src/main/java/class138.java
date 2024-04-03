import deob.ObfuscatedName;

@ObfuscatedName("du")
public class class138 {

    @ObfuscatedName("du.u")
    public static short[] field1487 = new short[500];

    @ObfuscatedName("du.j")
    public static short[] field1479 = new short[500];

    @ObfuscatedName("du.a")
    public static short[] field1480 = new short[500];

    @ObfuscatedName("du.s")
    public static short[] field1484 = new short[500];

    @ObfuscatedName("du.c")
    public static short[] field1482 = new short[500];

    @ObfuscatedName("du.m")
    public static byte[] field1483 = new byte[500];

    @ObfuscatedName("du.t")
    public class779 field1496 = null;

    @ObfuscatedName("du.l")
    public int field1485 = 0;

    @ObfuscatedName("du.f")
    public short[] field1486;

    @ObfuscatedName("du.d")
    public short[] field1494;

    @ObfuscatedName("du.z")
    public short[] field1481;

    @ObfuscatedName("du.n")
    public short[] field1489;

    @ObfuscatedName("du.o")
    public short[] field1490;

    @ObfuscatedName("du.q")
    public byte[] field1488;

    @ObfuscatedName("du.p")
    public boolean field1492 = false;

    @ObfuscatedName("du.w")
    public boolean field1493 = false;

    @ObfuscatedName("du.b")
    public boolean field1491 = false;

    public class138(byte[] arg0, class779 arg1) {
        this.field1496 = arg1;
        try {
            Packet var3 = new Packet(arg0);
            Packet var4 = new Packet(arg0);
            var3.method15220();
            var3.field9626 += 2;
            int var5 = var3.method15239();
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9626 = var3.field9626 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1496.field9365[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method15220();
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1487[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1479[var6] = var12;
                    } else {
                        field1479[var6] = (short) var4.method15254();
                    }
                    if ((var11 & 0x2) == 0) {
                        field1480[var6] = var12;
                    } else {
                        field1480[var6] = (short) var4.method15254();
                    }
                    if ((var11 & 0x4) == 0) {
                        field1484[var6] = var12;
                    } else {
                        field1484[var6] = (short) var4.method15254();
                    }
                    field1483[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1479[var6] = (short) (field1479[var6] << 2 & 0x3FFF);
                        field1480[var6] = (short) (field1480[var6] << 2 & 0x3FFF);
                        field1484[var6] = (short) (field1484[var6] << 2 & 0x3FFF);
                    }
                    field1482[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1482[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1492 = true;
                    } else if (var10 == 7) {
                        this.field1493 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1491 = true;
                    }
                    var6++;
                }
            }
            if (var4.field9626 != arg0.length) {
                throw new RuntimeException();
            }
            this.field1485 = var6;
            this.field1486 = new short[var6];
            this.field1494 = new short[var6];
            this.field1481 = new short[var6];
            this.field1489 = new short[var6];
            this.field1490 = new short[var6];
            this.field1488 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1486[var13] = field1487[var13];
                this.field1494[var13] = field1479[var13];
                this.field1481[var13] = field1480[var13];
                this.field1489[var13] = field1484[var13];
                this.field1490[var13] = field1482[var13];
                this.field1488[var13] = field1483[var13];
            }
        } catch (Exception var15) {
            this.field1485 = 0;
            this.field1492 = false;
            this.field1493 = false;
        }
    }
}
