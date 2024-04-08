import deob.ObfuscatedName;

@ObfuscatedName("ace")
public final class ServerKeyProperties extends Node {

    @ObfuscatedName("ace.z")
    public static final ServerKeyProperties NONE = new ServerKeyProperties(0, -1);

    @ObfuscatedName("ace.n")
    public final int events;

    @ObfuscatedName("ace.o")
    public final int targetParam;

    public ServerKeyProperties(int arg0, int arg1) {
        this.events = arg0;
        this.targetParam = arg1;
    }

    @ObfuscatedName("ace.u(S)Z")
    public final boolean isPauseButton() {
        return (this.events & 0x1) != 0;
    }

    @ObfuscatedName("ace.j(IB)Z")
    public final boolean isOpTransmitted(int arg0) {
        return (this.events >> arg0 + 1 & 0x1) != 0;
    }

    @ObfuscatedName("ace.a(I)I")
    public final int getTargetMask() {
        return unpackTargetMask(this.events);
    }

    @ObfuscatedName("aey.s(II)I")
    public static final int unpackTargetMask(int arg0) {
        return arg0 >> 11 & 0x7F;
    }

    @ObfuscatedName("ace.c(I)I")
    public final int method14946() {
        return this.events >> 18 & 0x7;
    }

    @ObfuscatedName("ace.m(I)Z")
    public final boolean method14930() {
        return (this.events >> 21 & 0x1) != 0;
    }

    @ObfuscatedName("ace.t(I)Z")
    public final boolean method14931() {
        return (this.events >> 22 & 0x1) != 0;
    }

    @ObfuscatedName("ace.l(B)Z")
    public final boolean method14933() {
        return (this.events >> 23 & 0x1) != 0;
    }
}
