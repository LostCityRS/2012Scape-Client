import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("th")
public class IterableQueueIterator implements Iterator {

    @ObfuscatedName("th.u")
    public IterableQueue field6654;

    @ObfuscatedName("th.j")
    public Node field6657;

    @ObfuscatedName("th.a")
    public Node field6656 = null;

    public IterableQueueIterator(IterableQueue arg0) {
        this.field6654 = arg0;
        this.field6657 = this.field6654.sentinel.prev;
        this.field6656 = null;
    }

    @ObfuscatedName("th.f(Ltq;I)V")
    public void method11691(IterableQueue arg0) {
        this.field6654 = arg0;
        this.field6657 = this.field6654.sentinel.prev;
        this.field6656 = null;
    }

    @ObfuscatedName("th.d(I)V")
    public void method11692() {
        this.field6657 = this.field6654.sentinel.prev;
        this.field6656 = null;
    }

    @ObfuscatedName("th.z(B)Lnz;")
    public Node method11701() {
        this.method11692();
        return (Node) this.next();
    }

    public Object next() {
        Node var1 = this.field6657;
        if (this.field6654.sentinel == var1) {
            var1 = null;
            this.field6657 = null;
        } else {
            this.field6657 = var1.prev;
        }
        this.field6656 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field6654.sentinel != this.field6657;
    }

    public void remove() {
        if (this.field6656 == null) {
            throw new IllegalStateException();
        }
        this.field6656.unlink();
        this.field6656 = null;
    }
}
