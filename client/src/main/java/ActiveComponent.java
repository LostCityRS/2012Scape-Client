import deob.ObfuscatedName;

@ObfuscatedName("rr")
public class ActiveComponent {

    @ObfuscatedName("rr.u")
    public Component field5240;

    @ObfuscatedName("rr.j")
    public Interface field5239;

    @ObfuscatedName("rr.u(I)Lew;")
    public Component method11061() {
        return this.field5239.method3108(this.field5240.id);
    }

    @ObfuscatedName("rr.j(III)Z")
    public boolean method11062(int arg0, int arg1) {
        Component var3 = Component.get(arg0, arg1);
        if (var3 == null) {
            this.method11063();
            return false;
        } else {
            this.field5239 = Statics.field1756[arg0 >> 16];
            this.field5240 = var3;
            return true;
        }
    }

    @ObfuscatedName("rr.a(Lej;IIB)Z")
    public boolean method11066(Interface arg0, int arg1, int arg2) {
        if (arg0 != null) {
            Component var4 = arg0.method3108(arg1);
            if (var4 != null) {
                this.field5239 = arg0;
                this.field5240 = var4;
                return true;
            }
        }
        this.method11063();
        return false;
    }

    @ObfuscatedName("rr.s(I)V")
    public void method11063() {
        this.field5239 = null;
        this.field5240 = null;
    }
}
