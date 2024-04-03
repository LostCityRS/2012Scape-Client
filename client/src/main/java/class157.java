import deob.ObfuscatedName;

@ObfuscatedName("eq")
public class class157 {

    @ObfuscatedName("eq.s")
    public final Js5 field1594;

    @ObfuscatedName("eq.c")
    public final int field1591;

    @ObfuscatedName("eq.m")
    public MidiSong field1593;

    @ObfuscatedName("eq.t")
    public MixBuss field1588;

    @ObfuscatedName("eq.l")
    public class377 field1595 = null;

    @ObfuscatedName("eq.f")
    public int field1596 = 0;

    public class157(Js5 arg0, int arg1) {
        this.field1594 = arg0;
        this.field1591 = arg1;
        this.field1588 = new MixBuss();
        this.field1588.method16283(9, 128);
    }

    @ObfuscatedName("eq.u(B)Laih;")
    public MixBuss method3002() {
        return this.field1588;
    }

    @ObfuscatedName("eq.j(I)Lacw;")
    public MidiSong method3009() {
        return this.field1593;
    }

    @ObfuscatedName("eq.a(B)Z")
    public boolean method2999() {
        class155.method7561();
        if (this.field1596 == 0) {
            this.field1593 = MidiSong.method14909(this.field1594, this.field1591, 0);
            if (this.field1593 == null) {
                return false;
            }
            this.field1595 = new class377(Statics.field1581, Statics.field1580);
            this.field1596 = 1;
        }
        if (this.field1596 == 1) {
            if (!this.field1588.method16375(this.field1593, Statics.field1586, this.field1595, 22050)) {
                return false;
            }
            this.field1596 = 2;
        }
        return true;
    }

    @ObfuscatedName("eq.s(B)Z")
    public boolean method3000() {
        return this.field1596 == 2;
    }
}
