import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("tv")
public class DualIterableQueue implements Iterable {

    @ObfuscatedName("tv.u")
    public SecondaryNode field6662 = new SecondaryNode();

    @ObfuscatedName("tv.j")
    public SecondaryNode field6663;

    public DualIterableQueue() {
        this.field6662.field9552 = this.field6662;
        this.field6662.field9553 = this.field6662;
    }

    @ObfuscatedName("tv.u(I)V")
    public void method11733() {
        while (this.field6662.field9552 != this.field6662) {
            this.field6662.field9552.method15142();
        }
    }

    @ObfuscatedName("tv.j(Ladi;I)V")
    public void method11728(SecondaryNode arg0) {
        if (arg0.field9553 != null) {
            arg0.method15142();
        }
        arg0.field9553 = this.field6662.field9553;
        arg0.field9552 = this.field6662;
        arg0.field9553.field9552 = arg0;
        arg0.field9552.field9553 = arg0;
    }

    @ObfuscatedName("rs.a(Ladi;Ladi;I)V")
    public static void method8542(SecondaryNode arg0, SecondaryNode arg1) {
        if (arg0.field9553 != null) {
            arg0.method15142();
        }
        arg0.field9553 = arg1.field9553;
        arg0.field9552 = arg1;
        arg0.field9553.field9552 = arg0;
        arg0.field9552.field9553 = arg0;
    }

    @ObfuscatedName("cr.s(Ladi;Ladi;B)V")
    public static void method2355(SecondaryNode arg0, SecondaryNode arg1) {
        if (arg0.field9553 != null) {
            arg0.method15142();
        }
        arg0.field9553 = arg1;
        arg0.field9552 = arg1.field9552;
        arg0.field9553.field9552 = arg0;
        arg0.field9552.field9553 = arg0;
    }

    @ObfuscatedName("tv.c(I)Ladi;")
    public SecondaryNode method11729() {
        SecondaryNode var1 = this.field6662.field9552;
        if (this.field6662 == var1) {
            return null;
        } else {
            var1.method15142();
            return var1;
        }
    }

    @ObfuscatedName("tv.m(I)Ladi;")
    public SecondaryNode method11756() {
        return this.method11731(null);
    }

    @ObfuscatedName("tv.t(Ladi;I)Ladi;")
    public SecondaryNode method11731(SecondaryNode arg0) {
        SecondaryNode var2;
        if (arg0 == null) {
            var2 = this.field6662.field9552;
        } else {
            var2 = arg0;
        }
        if (this.field6662 == var2) {
            this.field6663 = null;
            return null;
        } else {
            this.field6663 = var2.field9552;
            return var2;
        }
    }

    @ObfuscatedName("tv.l(I)Ladi;")
    public SecondaryNode method11744() {
        SecondaryNode var1 = this.field6663;
        if (this.field6662 == var1) {
            this.field6663 = null;
            return null;
        } else {
            this.field6663 = var1.field9552;
            return var1;
        }
    }

    @ObfuscatedName("tv.f(I)I")
    public int method11732() {
        int var1 = 0;
        for (SecondaryNode var2 = this.field6662.field9552; var2 != this.field6662; var2 = var2.field9552) {
            var1++;
        }
        return var1;
    }

    public Iterator iterator() {
        return new DualIterableQueueIterator(this);
    }
}
