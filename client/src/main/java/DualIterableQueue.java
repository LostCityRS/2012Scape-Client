import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("tv")
public class DualIterableQueue implements Iterable {

    @ObfuscatedName("tv.u")
    public SecondaryNode sentinel = new SecondaryNode();

    @ObfuscatedName("tv.j")
    public SecondaryNode field6663;

    public DualIterableQueue() {
        this.sentinel.dualPrev = this.sentinel;
        this.sentinel.field9553 = this.sentinel;
    }

    @ObfuscatedName("tv.u(I)V")
    public void clear() {
        while (this.sentinel.dualPrev != this.sentinel) {
            this.sentinel.dualPrev.dualRemove();
        }
    }

    @ObfuscatedName("tv.j(Ladi;I)V")
    public void addFirst(SecondaryNode arg0) {
        if (arg0.field9553 != null) {
            arg0.dualRemove();
        }
        arg0.field9553 = this.sentinel.field9553;
        arg0.dualPrev = this.sentinel;
        arg0.field9553.dualPrev = arg0;
        arg0.dualPrev.field9553 = arg0;
    }

    @ObfuscatedName("rs.a(Ladi;Ladi;I)V")
    public static void method8542(SecondaryNode arg0, SecondaryNode arg1) {
        if (arg0.field9553 != null) {
            arg0.dualRemove();
        }
        arg0.field9553 = arg1.field9553;
        arg0.dualPrev = arg1;
        arg0.field9553.dualPrev = arg0;
        arg0.dualPrev.field9553 = arg0;
    }

    @ObfuscatedName("cr.s(Ladi;Ladi;B)V")
    public static void method2355(SecondaryNode arg0, SecondaryNode arg1) {
        if (arg0.field9553 != null) {
            arg0.dualRemove();
        }
        arg0.field9553 = arg1;
        arg0.dualPrev = arg1.dualPrev;
        arg0.field9553.dualPrev = arg0;
        arg0.dualPrev.field9553 = arg0;
    }

    @ObfuscatedName("tv.c(I)Ladi;")
    public SecondaryNode method11729() {
        SecondaryNode var1 = this.sentinel.dualPrev;
        if (this.sentinel == var1) {
            return null;
        } else {
            var1.dualRemove();
            return var1;
        }
    }

    @ObfuscatedName("tv.m(I)Ladi;")
    public SecondaryNode last() {
        return this.method11731(null);
    }

    @ObfuscatedName("tv.t(Ladi;I)Ladi;")
    public SecondaryNode method11731(SecondaryNode arg0) {
        SecondaryNode var2;
        if (arg0 == null) {
            var2 = this.sentinel.dualPrev;
        } else {
            var2 = arg0;
        }
        if (this.sentinel == var2) {
            this.field6663 = null;
            return null;
        } else {
            this.field6663 = var2.dualPrev;
            return var2;
        }
    }

    @ObfuscatedName("tv.l(I)Ladi;")
    public SecondaryNode previous() {
        SecondaryNode var1 = this.field6663;
        if (this.sentinel == var1) {
            this.field6663 = null;
            return null;
        } else {
            this.field6663 = var1.dualPrev;
            return var1;
        }
    }

    @ObfuscatedName("tv.f(I)I")
    public int method11732() {
        int var1 = 0;
        for (SecondaryNode var2 = this.sentinel.dualPrev; var2 != this.sentinel; var2 = var2.dualPrev) {
            var1++;
        }
        return var1;
    }

    public Iterator iterator() {
        return new DualIterableQueueIterator(this);
    }
}
