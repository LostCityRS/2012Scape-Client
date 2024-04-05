import deob.ObfuscatedName;

@ObfuscatedName("adi")
public class SecondaryNode extends Node {

    @ObfuscatedName("adi.s")
    public long secondaryKey;

    @ObfuscatedName("adi.c")
    public SecondaryNode secondaryNext;

    @ObfuscatedName("adi.m")
    public SecondaryNode secondaryPrev;

    @ObfuscatedName("adi.r(B)V")
    public void unlinkSecondary() {
        if (this.secondaryPrev != null) {
            this.secondaryPrev.secondaryNext = this.secondaryNext;
            this.secondaryNext.secondaryPrev = this.secondaryPrev;
            this.secondaryNext = null;
            this.secondaryPrev = null;
        }
    }
}
