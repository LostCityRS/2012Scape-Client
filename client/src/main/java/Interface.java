import deob.ObfuscatedName;

@ObfuscatedName("ej")
public class Interface {

    @ObfuscatedName("ej.u")
    public Component[] field1732;

    @ObfuscatedName("ej.j")
    public Component[] field1733;

    @ObfuscatedName("ej.a")
    public boolean field1734;

    public Interface(boolean arg0, Component[] arg1) {
        this.field1732 = arg1;
        this.field1734 = arg0;
    }

    @ObfuscatedName("ej.u(S)[Lew;")
    public Component[] getComponents() {
        return this.field1733 == null ? this.field1732 : this.field1733;
    }

    @ObfuscatedName("ej.j(B)[Lew;")
    public Component[] method3105() {
        if (this.field1733 == null) {
            int var1 = this.field1732.length;
            this.field1733 = new Component[var1];
            System.arraycopy(this.field1732, 0, this.field1733, 0, this.field1732.length);
        }
        return this.field1733;
    }

    @ObfuscatedName("ej.a(II)Lew;")
    public Component method3108(int arg0) {
        if (this.field1732[0].id >>> 16 != arg0 >>> 16) {
            throw new IllegalArgumentException();
        }
        return this.field1732[arg0 & 0xFFFF];
    }
}
