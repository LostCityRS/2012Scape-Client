import deob.ObfuscatedName;

@ObfuscatedName("ajs")
public class MiniMenuEntry extends SecondaryNode {

    @ObfuscatedName("ajs.t")
    public final String opbase;

    @ObfuscatedName("ajs.l")
    public final String field10339;

    @ObfuscatedName("ajs.f")
    public final int field10331;

    @ObfuscatedName("ajs.d")
    public final int field10332;

    @ObfuscatedName("ajs.z")
    public final boolean field10336;

    @ObfuscatedName("ajs.n")
    public final long field10333;

    @ObfuscatedName("ajs.o")
    public final int sceneBaseTileX;

    @ObfuscatedName("ajs.q")
    public final int sceneBaseTileZ;

    @ObfuscatedName("ajs.p")
    public final boolean field10337;

    @ObfuscatedName("ajs.w")
    public final long field10330;

    @ObfuscatedName("ajs.b")
    public final boolean field10338;

    @ObfuscatedName("ajs.x")
    public int menuAction;

    @ObfuscatedName("ajs.i")
    public String field10341;

    public MiniMenuEntry(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.opbase = arg1;
        this.field10339 = arg0;
        this.field10331 = arg2;
        this.menuAction = arg3;
        this.field10332 = arg4;
        this.field10333 = arg5;
        this.sceneBaseTileX = arg6;
        this.sceneBaseTileZ = arg7;
        this.field10336 = arg8;
        this.field10337 = arg9;
        this.field10330 = arg10;
        this.field10338 = arg11;
    }
}
