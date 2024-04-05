import deob.ObfuscatedName;

@ObfuscatedName("nz")
public class Node {

    @ObfuscatedName("nz.u")
    public long key;

    @ObfuscatedName("nz.j")
    public Node next;

    @ObfuscatedName("nz.a")
    public Node prev;

    @ObfuscatedName("nz.p(I)V")
    public void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }

    @ObfuscatedName("nz.w(B)Z")
    public boolean isLinked() {
        return this.prev != null;
    }
}
