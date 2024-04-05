import deob.ObfuscatedName;

@ObfuscatedName("nz")
public class Node {

    @ObfuscatedName("nz.u")
    public long field4228;

    @ObfuscatedName("nz.j")
    public Node prev;

    @ObfuscatedName("nz.a")
    public Node next;

    @ObfuscatedName("nz.p(I)V")
    public void unlink() {
        if (this.next != null) {
            this.next.prev = this.prev;
            this.prev.next = this.next;
            this.prev = null;
            this.next = null;
        }
    }

    @ObfuscatedName("nz.w(B)Z")
    public boolean method6982() {
        return this.next != null;
    }
}
