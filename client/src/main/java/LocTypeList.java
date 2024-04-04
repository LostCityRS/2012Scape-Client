import deob.ObfuscatedName;

@ObfuscatedName("tz")
public class LocTypeList {

    @ObfuscatedName("tz.u")
    public final ModeGame field6557;

    @ObfuscatedName("tz.j")
    public final Language field6552;

    @ObfuscatedName("tz.a")
    public boolean field6553;

    @ObfuscatedName("tz.s")
    public final Js5 field6554;

    @ObfuscatedName("tz.c")
    public final Js5 field6555;

    @ObfuscatedName("tz.t")
    public WeightedCache field6561 = new WeightedCache(256);

    @ObfuscatedName("tz.l")
    public final WeightedCache field6558 = new WeightedCache(500);

    @ObfuscatedName("tz.f")
    public final WeightedCache field6559 = new WeightedCache(30);

    @ObfuscatedName("tz.d")
    public final WeightedCache field6560 = new WeightedCache(50);

    @ObfuscatedName("tz.z")
    public int field6551;

    @ObfuscatedName("tz.n")
    public final String[] field6563;

    @ObfuscatedName("tz.o")
    public ModelUnlit[] field6562 = new ModelUnlit[4];

    @ObfuscatedName("tz.q")
    public Pair field6564 = new Pair(null, null);

    public LocTypeList(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, Js5 arg4) {
        this.field6557 = arg0;
        this.field6552 = arg1;
        this.field6553 = arg2;
        this.field6554 = arg3;
        this.field6555 = arg4;
        if (this.field6554 != null) {
            int var6 = this.field6554.method5638() - 1;
            Js5ConfigGroup.LOCTYPE.method3071();
            this.field6554.method5637(var6);
        }
        if (ModeGame.field6407 == this.field6557) {
            this.field6563 = new String[]{null, null, null, null, null, LocalisedText.field6874.get(this.field6552)};
        } else {
            this.field6563 = new String[]{null, null, null, null, null, null};
        }
    }

    @ObfuscatedName("tz.u(II)Ltg;")
    public LocType get(int arg0) {
        WeightedCache var2 = this.field6561;
        LocType var3;
        synchronized (this.field6561) {
            var3 = (LocType) this.field6561.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field6554;
        byte[] var6;
        synchronized (this.field6554) {
            var6 = this.field6554.method5627(Js5ConfigGroup.LOCTYPE.method3073(arg0), Js5ConfigGroup.LOCTYPE.method3075(arg0));
        }
        LocType var8 = new LocType();
        var8.field6474 = arg0;
        var8.field6473 = this;
        var8.field6505 = (String[]) this.field6563.clone();
        if (var6 != null) {
            var8.method11408(new Packet(var6));
        }
        var8.method11410();
        if (var8.field6481) {
            var8.field6491 = 0;
            var8.field6492 = false;
        }
        if (!this.field6553 && var8.field6542) {
            var8.field6505 = null;
            var8.field6545 = null;
        }
        WeightedCache var9 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("tz.j(ZB)V")
    public void method11472(boolean arg0) {
        if (this.field6553 != arg0) {
            this.field6553 = arg0;
            this.method11479();
        }
    }

    @ObfuscatedName("tz.a(II)V")
    public void method11473(int arg0) {
        this.field6551 = arg0;
        WeightedCache var2 = this.field6558;
        synchronized (this.field6558) {
            this.field6558.method7922();
        }
        WeightedCache var4 = this.field6559;
        synchronized (this.field6559) {
            this.field6559.method7922();
        }
        WeightedCache var6 = this.field6560;
        synchronized (this.field6560) {
            this.field6560.method7922();
        }
    }

    @ObfuscatedName("tz.s(II)V")
    public void resizeCache(int arg0) {
        this.field6561 = new WeightedCache(arg0);
    }

    @ObfuscatedName("tz.c(I)V")
    public void method11479() {
        WeightedCache var1 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method7922();
        }
        WeightedCache var3 = this.field6558;
        synchronized (this.field6558) {
            this.field6558.method7922();
        }
        WeightedCache var5 = this.field6559;
        synchronized (this.field6559) {
            this.field6559.method7922();
        }
        WeightedCache var7 = this.field6560;
        synchronized (this.field6560) {
            this.field6560.method7922();
        }
        this.field6562 = new ModelUnlit[4];
        this.field6564 = new Pair(null, null);
    }

    @ObfuscatedName("tz.m(IB)V")
    public void method11487(int arg0) {
        WeightedCache var2 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method7921(arg0);
        }
        WeightedCache var4 = this.field6558;
        synchronized (this.field6558) {
            this.field6558.method7921(arg0);
        }
        WeightedCache var6 = this.field6559;
        synchronized (this.field6559) {
            this.field6559.method7921(arg0);
        }
        WeightedCache var8 = this.field6560;
        synchronized (this.field6560) {
            this.field6560.method7921(arg0);
        }
    }

    @ObfuscatedName("tz.t(I)V")
    public void method11477() {
        WeightedCache var1 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method7925();
        }
        WeightedCache var3 = this.field6558;
        synchronized (this.field6558) {
            this.field6558.method7925();
        }
        WeightedCache var5 = this.field6559;
        synchronized (this.field6559) {
            this.field6559.method7925();
        }
        WeightedCache var7 = this.field6560;
        synchronized (this.field6560) {
            this.field6560.method7925();
        }
    }
}
