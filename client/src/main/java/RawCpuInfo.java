import deob.ObfuscatedName;

@ObfuscatedName("uv")
public class RawCpuInfo {

    @ObfuscatedName("uv.u")
    public final int field6824;

    @ObfuscatedName("uv.j")
    public final int field6821;

    @ObfuscatedName("uv.a")
    public final int field6822;

    @ObfuscatedName("uv.s")
    public final int field6823;

    @ObfuscatedName("uv.c")
    public final int field6820;

    public RawCpuInfo(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6824 = arg0;
        this.field6821 = arg1;
        this.field6822 = arg2;
        this.field6823 = arg3;
        this.field6820 = arg4;
    }

    public int hashCode() {
        return this.field6824;
    }
}
