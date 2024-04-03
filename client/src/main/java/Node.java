import deob.ObfuscatedName;

@ObfuscatedName("nz")
public class Node {

    @ObfuscatedName("nz.u")
    public long field4228;

    @ObfuscatedName("nz.j")
    public Node field4226;

    @ObfuscatedName("nz.a")
    public Node field4227;

    @ObfuscatedName("nz.p(I)V")
    public void method6979() {
        if (this.field4227 != null) {
            this.field4227.field4226 = this.field4226;
            this.field4226.field4227 = this.field4227;
            this.field4226 = null;
            this.field4227 = null;
        }
    }

    @ObfuscatedName("nz.w(B)Z")
    public boolean method6982() {
        return this.field4227 != null;
    }
}
