import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("tp")
public class DualIterableQueueIterator implements Iterator {

    @ObfuscatedName("tp.u")
    public DualIterableQueue field6661;

    @ObfuscatedName("tp.j")
    public SecondaryNode field6660;

    @ObfuscatedName("tp.a")
    public SecondaryNode field6659 = null;

    public DualIterableQueueIterator(DualIterableQueue arg0) {
        this.field6661 = arg0;
        this.field6660 = this.field6661.field6662.field9552;
        this.field6659 = null;
    }

    @ObfuscatedName("tp.f(I)V")
    public void method11713() {
        this.field6660 = this.field6661.field6662.field9552;
        this.field6659 = null;
    }

    @ObfuscatedName("tp.d(I)Ladi;")
    public SecondaryNode method11715() {
        this.method11713();
        return (SecondaryNode) this.next();
    }

    public Object next() {
        SecondaryNode var1 = this.field6660;
        if (this.field6661.field6662 == var1) {
            var1 = null;
            this.field6660 = null;
        } else {
            this.field6660 = var1.field9552;
        }
        this.field6659 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field6661.field6662 != this.field6660;
    }

    public void remove() {
        if (this.field6659 == null) {
            throw new IllegalStateException();
        }
        this.field6659.method15142();
        this.field6659 = null;
    }
}
