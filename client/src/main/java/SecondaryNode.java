import deob.ObfuscatedName;

@ObfuscatedName("adi")
public class SecondaryNode extends Node {

    @ObfuscatedName("adi.s")
    public long field9554;

    @ObfuscatedName("adi.c")
    public SecondaryNode dualPrev;

    @ObfuscatedName("adi.m")
    public SecondaryNode field9553;

    @ObfuscatedName("adi.r(B)V")
    public void dualRemove() {
        if (this.field9553 != null) {
            this.field9553.dualPrev = this.dualPrev;
            this.dualPrev.field9553 = this.field9553;
            this.dualPrev = null;
            this.field9553 = null;
        }
    }
}
