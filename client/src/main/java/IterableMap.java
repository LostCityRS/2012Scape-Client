import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("uo")
public final class IterableMap implements Iterable {

    @ObfuscatedName("uo.u")
    public int field6722;

    @ObfuscatedName("uo.j")
    public Node[] field6725;

    @ObfuscatedName("uo.a")
    public long field6724;

    @ObfuscatedName("uo.s")
    public Node field6727;

    @ObfuscatedName("uo.c")
    public Node field6726;

    @ObfuscatedName("uo.m")
    public int field6723 = 0;

    public IterableMap(int arg0) {
        this.field6722 = arg0;
        this.field6725 = new Node[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            Node var3 = this.field6725[var2] = new Node();
            var3.field4226 = var3;
            var3.field4227 = var3;
        }
    }

    @ObfuscatedName("uo.u(J)Lnz;")
    public Node getNode(long arg0) {
        this.field6724 = arg0;
        Node var3 = this.field6725[(int) (arg0 & (long) (this.field6722 - 1))];
        for (this.field6727 = var3.field4226; this.field6727 != var3; this.field6727 = this.field6727.field4226) {
            if (this.field6727.field4228 == arg0) {
                Node var4 = this.field6727;
                this.field6727 = this.field6727.field4226;
                return var4;
            }
        }
        this.field6727 = null;
        return null;
    }

    @ObfuscatedName("uo.j(I)Lnz;")
    public Node method11924() {
        if (this.field6727 == null) {
            return null;
        }
        Node var1 = this.field6725[(int) (this.field6724 & (long) (this.field6722 - 1))];
        while (this.field6727 != var1) {
            if (this.field6727.field4228 == this.field6724) {
                Node var2 = this.field6727;
                this.field6727 = this.field6727.field4226;
                return var2;
            }
            this.field6727 = this.field6727.field4226;
        }
        this.field6727 = null;
        return null;
    }

    @ObfuscatedName("uo.a([Lnz;I)I")
    public int method11933(Node[] arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6722; var3++) {
            Node var4 = this.field6725[var3];
            for (Node var5 = var4.field4226; var5 != var4; var5 = var5.field4226) {
                arg0[var2++] = var5;
            }
        }
        return var2;
    }

    @ObfuscatedName("uo.s(B)I")
    public int length() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field6722; var2++) {
            Node var3 = this.field6725[var2];
            for (Node var4 = var3.field4226; var4 != var3; var4 = var4.field4226) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("uo.c(Lnz;J)V")
    public void method11927(Node arg0, long arg1) {
        if (arg0.field4227 != null) {
            arg0.remove();
        }
        Node var4 = this.field6725[(int) (arg1 & (long) (this.field6722 - 1))];
        arg0.field4227 = var4.field4227;
        arg0.field4226 = var4;
        arg0.field4227.field4226 = arg0;
        arg0.field4226.field4227 = arg0;
        arg0.field4228 = arg1;
    }

    @ObfuscatedName("uo.m(I)V")
    public void method11925() {
        for (int var1 = 0; var1 < this.field6722; var1++) {
            Node var2 = this.field6725[var1];
            while (true) {
                Node var3 = var2.field4226;
                if (var2 == var3) {
                    break;
                }
                var3.remove();
            }
        }
        this.field6727 = null;
        this.field6726 = null;
    }

    @ObfuscatedName("uo.t(B)Lnz;")
    public Node method11928() {
        this.field6723 = 0;
        return this.method11929();
    }

    @ObfuscatedName("uo.l(B)Lnz;")
    public Node method11929() {
        if (this.field6723 > 0 && this.field6725[this.field6723 - 1] != this.field6726) {
            Node var1 = this.field6726;
            this.field6726 = var1.field4226;
            return var1;
        }
        Node var2;
        do {
            if (this.field6723 >= this.field6722) {
                return null;
            }
            var2 = this.field6725[++this.field6723 - 1].field4226;
        } while (this.field6725[this.field6723 - 1] == var2);
        this.field6726 = var2.field4226;
        return var2;
    }

    public Iterator iterator() {
        return new IterableMapIterator(this);
    }
}
