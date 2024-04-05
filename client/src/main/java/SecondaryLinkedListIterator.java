import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("tp")
public class SecondaryLinkedListIterator implements Iterator {

    @ObfuscatedName("tp.u")
    public SecondaryLinkedList list;

    @ObfuscatedName("tp.j")
    public SecondaryNode cursor;

    @ObfuscatedName("tp.a")
    public SecondaryNode field6659 = null;

    public SecondaryLinkedListIterator(SecondaryLinkedList list) {
        this.list = list;
        this.cursor = this.list.sentinel.secondaryNext;
        this.field6659 = null;
    }

    @ObfuscatedName("tp.f(I)V")
    public void method11713() {
        this.cursor = this.list.sentinel.secondaryNext;
        this.field6659 = null;
    }

    @ObfuscatedName("tp.d(I)Ladi;")
    public SecondaryNode method11715() {
        this.method11713();
        return (SecondaryNode) this.next();
    }

    public Object next() {
        SecondaryNode node = this.cursor;
        if (this.list.sentinel == node) {
            node = null;
            this.cursor = null;
        } else {
            this.cursor = node.secondaryNext;
        }
        this.field6659 = node;
        return node;
    }

    public boolean hasNext() {
        return this.list.sentinel != this.cursor;
    }

    public void remove() {
        if (this.field6659 == null) {
            throw new IllegalStateException();
        }
        this.field6659.unlinkSecondary();
        this.field6659 = null;
    }
}
