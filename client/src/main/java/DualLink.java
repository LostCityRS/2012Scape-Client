import deob.ObfuscatedName;

@ObfuscatedName("acl")
public class DualLink extends Link {

    @ObfuscatedName("acl.a")
    public DualLink field9265;

    @ObfuscatedName("acl.s")
    public DualLink field9266;

    @ObfuscatedName("acl.a(B)V")
    public void method14730() {
        if (this.field9266 != null) {
            this.field9266.field9265 = this.field9265;
            this.field9265.field9266 = this.field9266;
            this.field9265 = null;
            this.field9266 = null;
        }
    }
}
