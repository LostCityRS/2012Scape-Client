import deob.ObfuscatedName;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("tq")
public class IterableQueue implements Iterable, Collection {

    @ObfuscatedName("tq.u")
    public Node sentinel = new Node();

    @ObfuscatedName("tq.j")
    public Node current;

    public IterableQueue() {
        this.sentinel.prev = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName("tq.u(S)V")
    public void clearBridged() {
        while (this.sentinel.prev != this.sentinel) {
            this.sentinel.prev.remove();
        }
    }

    @ObfuscatedName("tq.j(Lnz;I)V")
    public void addFirst(Node arg0) {
        if (arg0.next != null) {
            arg0.remove();
        }
        arg0.next = this.sentinel.next;
        arg0.prev = this.sentinel;
        arg0.next.prev = arg0;
        arg0.prev.next = arg0;
    }

    @ObfuscatedName("tq.a(Lnz;I)V")
    public void method11559(Node arg0) {
        if (arg0.next != null) {
            arg0.remove();
        }
        arg0.next = this.sentinel;
        arg0.prev = this.sentinel.prev;
        arg0.next.prev = arg0;
        arg0.prev.next = arg0;
    }

    @ObfuscatedName("cu.s(Lnz;Lnz;I)V")
    public static void method2546(Node arg0, Node arg1) {
        if (arg0.next != null) {
            arg0.remove();
        }
        arg0.next = arg1.next;
        arg0.prev = arg1;
        arg0.next.prev = arg0;
        arg0.prev.next = arg0;
    }

    @ObfuscatedName("tq.c(I)Lnz;")
    public Node method11560() {
        Node var1 = this.sentinel.prev;
        if (this.sentinel == var1) {
            return null;
        } else {
            var1.remove();
            return var1;
        }
    }

    @ObfuscatedName("tq.m(Ltq;Lnz;I)V")
    public void method11599(IterableQueue arg0, Node arg1) {
        Node var3 = this.sentinel.next;
        this.sentinel.next = arg1.next;
        arg1.next.prev = this.sentinel;
        if (this.sentinel != arg1) {
            arg1.next = arg0.sentinel.next;
            arg1.next.prev = arg1;
            var3.prev = arg0.sentinel;
            arg0.sentinel.next = var3;
        }
    }

    @ObfuscatedName("tq.t(Ltq;B)V")
    public void method11601(IterableQueue arg0) {
        if (this.sentinel.prev != this.sentinel) {
            this.method11599(arg0, this.sentinel.prev);
        }
    }

    @ObfuscatedName("tq.l(I)Lnz;")
    public Node last() {
        return this.method11564(null);
    }

    @ObfuscatedName("tq.f(Lnz;B)Lnz;")
    public Node method11564(Node arg0) {
        Node var2;
        if (arg0 == null) {
            var2 = this.sentinel.prev;
        } else {
            var2 = arg0;
        }
        if (this.sentinel == var2) {
            this.current = null;
            return null;
        } else {
            this.current = var2.prev;
            return var2;
        }
    }

    @ObfuscatedName("tq.d(I)Lnz;")
    public Node method11565() {
        return this.method11566(null);
    }

    @ObfuscatedName("tq.z(Lnz;I)Lnz;")
    public Node method11566(Node arg0) {
        Node var2;
        if (arg0 == null) {
            var2 = this.sentinel.next;
        } else {
            var2 = arg0;
        }
        if (this.sentinel == var2) {
            this.current = null;
            return null;
        } else {
            this.current = var2.next;
            return var2;
        }
    }

    @ObfuscatedName("tq.n(I)Lnz;")
    public Node prev() {
        Node var1 = this.current;
        if (this.sentinel == var1) {
            this.current = null;
            return null;
        } else {
            this.current = var1.prev;
            return var1;
        }
    }

    @ObfuscatedName("tq.o(I)Lnz;")
    public Node method11568() {
        Node var1 = this.current;
        if (this.sentinel == var1) {
            this.current = null;
            return null;
        } else {
            this.current = var1.next;
            return var1;
        }
    }

    @ObfuscatedName("tq.q(I)I")
    public int sizeBridged() {
        int var1 = 0;
        for (Node var2 = this.sentinel.prev; var2 != this.sentinel; var2 = var2.prev) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("tq.p(B)Z")
    public boolean method11585() {
        return this.sentinel.prev == this.sentinel;
    }

    @ObfuscatedName("tq.w(B)[Lnz;")
    public Node[] method11571() {
        Node[] var1 = new Node[this.sizeBridged()];
        int var2 = 0;
        for (Node var3 = this.sentinel.prev; var3 != this.sentinel; var3 = var3.prev) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new IterableQueueIterator(this);
    }

    public int size() {
        return this.sizeBridged();
    }

    public boolean isEmpty() {
        return this.method11585();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method11571();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (Node var3 = this.sentinel.prev; var3 != this.sentinel; var3 = var3.prev) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("tq.b(Lnz;I)Z")
    public boolean method11575(Node arg0) {
        this.addFirst(arg0);
        return true;
    }

    public boolean remove(Object arg0) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean addAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection arg0) {
        throw new RuntimeException();
    }

    public void clear() {
        this.clearBridged();
    }

    public boolean add(Object arg0) {
        return this.method11575((Node) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
