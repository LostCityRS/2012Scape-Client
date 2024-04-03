import deob.ObfuscatedName;

@ObfuscatedName("mf")
public class LocTint {

    @ObfuscatedName("mf.u")
    public final int field3783;

    @ObfuscatedName("mf.j")
    public final int field3782;

    @ObfuscatedName("mf.a")
    public final int field3781;

    @ObfuscatedName("mf.s")
    public final int field3784;

    public LocTint() {
        this.field3783 = (int) (Math.random() * 4.0D) + 32;
        this.field3782 = (int) (Math.random() * 2.0D) + 3;
        this.field3781 = (int) (Math.random() * 3.0D) + 16;
        if (Statics.clientOptions.field9659.method15686() == 1) {
            this.field3784 = (int) (Math.random() * 6.0D);
        } else {
            this.field3784 = (int) (Math.random() * 12.0D);
        }
    }

    public LocTint(int arg0, int arg1, int arg2, int arg3) {
        this.field3783 = arg0;
        this.field3782 = arg1;
        this.field3781 = arg2;
        this.field3784 = arg3;
    }
}
