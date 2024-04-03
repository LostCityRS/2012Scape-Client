import deob.ObfuscatedName;

@ObfuscatedName("aa")
public class aa extends HardShadow implements SoftwareRendererRelated {

    public long nativeid;

    public aa(ja arg0) {
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            SoftwareRendererRelated2.method2358(this);
        }
    }

    @ObfuscatedName("aa.ma(Z)V")
    public native void method92(boolean arg0);
}
