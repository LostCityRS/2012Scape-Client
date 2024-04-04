import deob.ObfuscatedName;

@ObfuscatedName("qd")
public class ObjTypeListRelated {

    @ObfuscatedName("qd.u")
    public int field4857;

    @ObfuscatedName("qd.j")
    public int field4859;

    @ObfuscatedName("qd.a")
    public IterableMap field4856;

    @ObfuscatedName("qd.s")
    public DualIterableQueue field4858 = new DualIterableQueue();

    public ObjTypeListRelated(int arg0) {
        this.field4857 = arg0;
        this.field4859 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4856 = new IterableMap(var2);
    }

    @ObfuscatedName("qd.u(Lqu;)Ljava/lang/Object;")
    public final Object method8006(CacheKey arg0) {
        long var2 = arg0.method7998();
        for (CacheEntry var4 = (CacheEntry) this.field4856.getNode(var2); var4 != null; var4 = (CacheEntry) this.field4856.method11924()) {
            if (var4.field10375.method7994(arg0)) {
                Object var5 = var4.method16728();
                if (var5 != null) {
                    if (var4.method16730()) {
                        HardCacheEntry var6 = new HardCacheEntry(arg0, var5, var4.field10374);
                        this.field4856.put(var6, var4.field4228);
                        this.field4858.addFirst(var6);
                        var6.field9554 = 0L;
                        var4.remove();
                        var4.dualRemove();
                    } else {
                        this.field4858.addFirst(var4);
                        var4.field9554 = 0L;
                    }
                    return var5;
                }
                var4.remove();
                var4.dualRemove();
                this.field4859 += var4.field10374;
            }
        }
        return null;
    }

    @ObfuscatedName("qd.j(Lqu;)V")
    public final void method8002(CacheKey arg0) {
        long var2 = arg0.method7998();
        for (CacheEntry var4 = (CacheEntry) this.field4856.getNode(var2); var4 != null; var4 = (CacheEntry) this.field4856.method11924()) {
            if (var4.field10375.method7994(arg0)) {
                this.method8003(var4);
                break;
            }
        }
    }

    @ObfuscatedName("qd.a(Lajb;)V")
    public final void method8003(CacheEntry arg0) {
        if (arg0 != null) {
            arg0.remove();
            arg0.dualRemove();
            this.field4859 += arg0.field10374;
        }
    }

    @ObfuscatedName("qd.s(Ljava/lang/Object;Lqu;)V")
    public final void method8009(Object arg0, CacheKey arg1) {
        this.method8005(arg0, arg1, 1);
    }

    @ObfuscatedName("qd.c(Ljava/lang/Object;Lqu;I)V")
    public final void method8005(Object arg0, CacheKey arg1, int arg2) {
        if (arg2 > this.field4857) {
            throw new IllegalStateException();
        }
        this.method8002(arg1);
        this.field4859 -= arg2;
        while (this.field4859 < 0) {
            CacheEntry var4 = (CacheEntry) this.field4858.method11729();
            this.method8003(var4);
        }
        HardCacheEntry var5 = new HardCacheEntry(arg1, arg0, arg2);
        this.field4856.put(var5, arg1.method7998());
        this.field4858.addFirst(var5);
        var5.field9554 = 0L;
    }

    @ObfuscatedName("qd.m(I)V")
    public final void method8022(int arg0) {
        for (CacheEntry var2 = (CacheEntry) this.field4858.last(); var2 != null; var2 = (CacheEntry) this.field4858.previous()) {
            if (var2.method16730()) {
                if (var2.method16728() == null) {
                    var2.remove();
                    var2.dualRemove();
                    this.field4859 += var2.field10374;
                }
            } else if (++var2.field9554 > (long) arg0) {
                SoftCacheEntry var3 = new SoftCacheEntry(var2.field10375, var2.method16728(), var2.field10374);
                this.field4856.put(var3, var2.field4228);
                DualIterableQueue.method2355(var3, var2);
                var2.remove();
                var2.dualRemove();
            }
        }
    }

    @ObfuscatedName("qd.t()V")
    public final void method8026() {
        this.field4858.clear();
        this.field4856.clear();
        this.field4859 = this.field4857;
    }

    @ObfuscatedName("qd.l()I")
    public final int method8008() {
        return this.field4857;
    }

    @ObfuscatedName("qd.f()I")
    public final int method8000() {
        return this.field4859;
    }

    @ObfuscatedName("qd.d()V")
    public final void method8010() {
        for (CacheEntry var1 = (CacheEntry) this.field4858.last(); var1 != null; var1 = (CacheEntry) this.field4858.previous()) {
            if (var1.method16730()) {
                var1.remove();
                var1.dualRemove();
                this.field4859 += var1.field10374;
            }
        }
    }
}
