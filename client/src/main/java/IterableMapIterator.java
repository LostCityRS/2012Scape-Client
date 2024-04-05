import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("uk")
public class IterableMapIterator implements Iterator {

    @ObfuscatedName("uk.u")
    public IterableMap field6730;

    @ObfuscatedName("uk.j")
    public Node field6729;

    @ObfuscatedName("uk.a")
    public int field6731;

    @ObfuscatedName("uk.s")
    public Node field6728 = null;

    public IterableMapIterator(IterableMap arg0) {
        this.field6730 = arg0;
        this.method11950();
    }

    @ObfuscatedName("uk.f(I)V")
    public void method11950() {
        this.field6729 = this.field6730.field6725[0].prev;
        this.field6731 = 1;
        this.field6728 = null;
    }

    @ObfuscatedName("uk.d(B)Lnz;")
    public Node method11955() {
        this.method11950();
        return (Node) this.next();
    }

    public Object next() {
        if (this.field6730.field6725[this.field6731 - 1] != this.field6729) {
            Node var1 = this.field6729;
            this.field6729 = var1.prev;
            this.field6728 = var1;
            return var1;
        }
        Node var2;
        do {
            if (this.field6731 >= this.field6730.field6722) {
                return null;
            }
            var2 = this.field6730.field6725[++this.field6731 - 1].prev;
        } while (this.field6730.field6725[this.field6731 - 1] == var2);
        this.field6729 = var2.prev;
        this.field6728 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field6730.field6725[this.field6731 - 1] != this.field6729) {
            return true;
        }
        while (this.field6731 < this.field6730.field6722) {
            if (this.field6730.field6725[++this.field6731 - 1].prev != this.field6730.field6725[this.field6731 - 1]) {
                this.field6729 = this.field6730.field6725[this.field6731 - 1].prev;
                return true;
            }
            this.field6729 = this.field6730.field6725[this.field6731 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field6728 == null) {
            throw new IllegalStateException();
        }
        this.field6728.unlink();
        this.field6728 = null;
    }
}
