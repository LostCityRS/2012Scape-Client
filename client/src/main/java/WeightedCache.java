import deob.ObfuscatedName;

@ObfuscatedName("pm")
public final class WeightedCache {

    @ObfuscatedName("pm.u")
    public int field4826;

    @ObfuscatedName("pm.j")
    public int field4827;

    @ObfuscatedName("pm.a")
    public IterableMap field4828;

    @ObfuscatedName("pm.s")
    public DualIterableQueue field4829;

    public WeightedCache(int arg0) {
        this(arg0, arg0);
    }

    public WeightedCache(int arg0, int arg1) {
        this.field4829 = new DualIterableQueue();
        this.field4826 = arg0;
        this.field4827 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field4828 = new IterableMap(var3);
    }

    @ObfuscatedName("pm.u(J)Ljava/lang/Object;")
    public Object method7916(long arg0) {
        WeightedNode var3 = (WeightedNode) this.field4828.getNode(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method16722();
        if (var4 == null) {
            var3.unlink();
            var3.dualRemove();
            this.field4827 += var3.field10373;
            return null;
        }
        if (var3.method16724()) {
            HardWeightedNode var5 = new HardWeightedNode(var4, var3.field10373);
            this.field4828.put(var5, var3.field4228);
            this.field4829.addFirst(var5);
            var5.field9554 = 0L;
            var3.unlink();
            var3.dualRemove();
        } else {
            this.field4829.addFirst(var3);
            var3.field9554 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("pm.j(J)V")
    public void method7917(long arg0) {
        WeightedNode var3 = (WeightedNode) this.field4828.getNode(arg0);
        this.method7950(var3);
    }

    @ObfuscatedName("pm.a(Lajc;B)V")
    public void method7950(WeightedNode arg0) {
        if (arg0 != null) {
            arg0.unlink();
            arg0.dualRemove();
            this.field4827 += arg0.field10373;
        }
    }

    @ObfuscatedName("pm.s(Ljava/lang/Object;J)V")
    public void method7937(Object arg0, long arg1) {
        this.method7918(arg0, arg1, 1);
    }

    @ObfuscatedName("pm.c(Ljava/lang/Object;JII)V")
    public void method7918(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field4826) {
            throw new IllegalStateException();
        }
        this.method7917(arg1);
        this.field4827 -= arg2;
        while (this.field4827 < 0) {
            WeightedNode var5 = (WeightedNode) this.field4829.method11729();
            this.method7950(var5);
        }
        HardWeightedNode var6 = new HardWeightedNode(arg0, arg2);
        this.field4828.put(var6, arg1);
        this.field4829.addFirst(var6);
        var6.field9554 = 0L;
    }

    @ObfuscatedName("pm.m(II)V")
    public void method7921(int arg0) {
        for (WeightedNode var2 = (WeightedNode) this.field4829.last(); var2 != null; var2 = (WeightedNode) this.field4829.previous()) {
            if (var2.method16724()) {
                if (var2.method16722() == null) {
                    var2.unlink();
                    var2.dualRemove();
                    this.field4827 += var2.field10373;
                }
            } else if (++var2.field9554 > (long) arg0) {
                SoftWeightedNode var3 = new SoftWeightedNode(var2.method16722(), var2.field10373);
                this.field4828.put(var3, var2.field4228);
                DualIterableQueue.method2355(var3, var2);
                var2.unlink();
                var2.dualRemove();
            }
        }
    }

    @ObfuscatedName("pm.t(S)V")
    public void method7922() {
        this.field4829.clear();
        this.field4828.clear();
        this.field4827 = this.field4826;
    }

    @ObfuscatedName("pm.l(B)I")
    public int method7923() {
        return this.field4826;
    }

    @ObfuscatedName("pm.f(I)I")
    public int method7924() {
        return this.field4827;
    }

    @ObfuscatedName("pm.d(I)I")
    public int method7926() {
        int var1 = 0;
        for (WeightedNode var2 = (WeightedNode) this.field4829.last(); var2 != null; var2 = (WeightedNode) this.field4829.previous()) {
            if (!var2.method16724()) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("pm.z(B)V")
    public void method7925() {
        for (WeightedNode var1 = (WeightedNode) this.field4829.last(); var1 != null; var1 = (WeightedNode) this.field4829.previous()) {
            if (var1.method16724()) {
                var1.unlink();
                var1.dualRemove();
                this.field4827 += var1.field10373;
            }
        }
    }

    @ObfuscatedName("pm.n(B)Ljava/lang/Object;")
    public Object method7931() {
        WeightedNode var1 = (WeightedNode) this.field4828.method11928();
        while (var1 != null) {
            Object var2 = var1.method16722();
            if (var2 != null) {
                return var2;
            }
            WeightedNode var3 = var1;
            var1 = (WeightedNode) this.field4828.method11929();
            var3.unlink();
            var3.dualRemove();
            this.field4827 += var3.field10373;
        }
        return null;
    }

    @ObfuscatedName("pm.o(B)Ljava/lang/Object;")
    public Object method7949() {
        WeightedNode var1 = (WeightedNode) this.field4828.method11929();
        while (var1 != null) {
            Object var2 = var1.method16722();
            if (var2 != null) {
                return var2;
            }
            WeightedNode var3 = var1;
            var1 = (WeightedNode) this.field4828.method11929();
            var3.unlink();
            var3.dualRemove();
            this.field4827 += var3.field10373;
        }
        return null;
    }
}
