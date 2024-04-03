import deob.ObfuscatedName;

@ObfuscatedName("ajl")
public class PacketBit extends Packet {

    @ObfuscatedName("ajl.n")
    public Isaac isaac;

    @ObfuscatedName("ajl.o")
    public static final int[] BITMASK = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

    @ObfuscatedName("ajl.q")
    public int bitPos;

    public PacketBit(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ajl.ir(Lue;I)V")
    public void setIsaac(Isaac arg0) {
        this.isaac = arg0;
    }

    @ObfuscatedName("ajl.ie(II)V")
    public void pIsaac1(int arg0) {
        this.data[++this.pos - 1] = (byte) (arg0 + this.isaac.method11968());
    }

    @ObfuscatedName("ajl.ii(I)Z")
    public boolean isIsaac1or2() {
        int var1 = this.data[this.pos] - this.isaac.method11963() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ajl.in(I)I")
    public int gIsaac1or2() {
        int var1 = this.data[++this.pos - 1] - this.isaac.method11968() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.data[++this.pos - 1] - this.isaac.method11968() & 0xFF);
    }

    @ObfuscatedName("ajl.ih([BIIB)V")
    public void gIsaacArrayBuffer(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.data[++this.pos - 1] - this.isaac.method11968());
        }
    }

    @ObfuscatedName("ajl.ig(I)V")
    public void bits() {
        this.bitPos = this.pos * 8;
    }

    @ObfuscatedName("ajl.ia(II)I")
    public int gBit(int arg0) {
        int var2 = this.bitPos >> 3;
        int var3 = 8 - (this.bitPos & 0x7);
        int var4 = 0;
        this.bitPos += arg0;
        while (arg0 > var3) {
            var4 += (this.data[var2++] & BITMASK[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.data[var2] & BITMASK[var3]) + var4;
        } else {
            var5 = (this.data[var2] >> var3 - arg0 & BITMASK[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ajl.iw(I)V")
    public void bytes() {
        this.pos = (this.bitPos + 7) / 8;
    }

    @ObfuscatedName("ajl.iq(II)I")
    public int bitsAvailable(int arg0) {
        return arg0 * 8 - this.bitPos;
    }
}
