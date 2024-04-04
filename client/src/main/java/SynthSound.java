import deob.ObfuscatedName;

@ObfuscatedName("mr")
public class SynthSound {

    @ObfuscatedName("mr.j")
    public SynthInstrument[] instruments = new SynthInstrument[10];

    @ObfuscatedName("mr.a")
    public int start;

    @ObfuscatedName("mr.s")
    public int end;

    @ObfuscatedName("mr.u(Lls;II)Lmr;")
    public static SynthSound method6466(Js5 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.fetchFile(arg1, arg2);
        return var3 == null ? null : new SynthSound(new Packet(var3));
    }

    public SynthSound(Packet arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.g1();
            if (var3 != 0) {
                arg0.pos--;
                this.instruments[var2] = new SynthInstrument();
                this.instruments[var2].method6600(arg0);
            }
        }
        this.start = arg0.g2();
        this.end = arg0.g2();
    }

    @ObfuscatedName("mr.j()Lalu;")
    public SynthSoundPacket toSoundPacket() {
        byte[] var1 = this.getSamples();
        return new SynthSoundPacket(22050, var1, this.start * 22050 / 1000, this.end * 22050 / 1000);
    }

    @ObfuscatedName("mr.a()I")
    public final int getStart() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.instruments[var2] != null && this.instruments[var2].start / 20 < var1) {
                var1 = this.instruments[var2].start / 20;
            }
        }
        if (this.start < this.end && this.start / 20 < var1) {
            var1 = this.start / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.instruments[var3] != null) {
                this.instruments[var3].start -= var1 * 20;
            }
        }
        if (this.start < this.end) {
            this.start -= var1 * 20;
            this.end -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("mr.s()[B")
    public final byte[] getSamples() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.instruments[var2] != null && this.instruments[var2].start + this.instruments[var2].length > var1) {
                var1 = this.instruments[var2].start + this.instruments[var2].length;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.instruments[var5] != null) {
                int var6 = this.instruments[var5].length * 22050 / 1000;
                int var7 = this.instruments[var5].start * 22050 / 1000;
                int[] var8 = this.instruments[var5].getSamples(var6, this.instruments[var5].length);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
