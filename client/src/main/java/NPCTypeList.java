import deob.ObfuscatedName;

@ObfuscatedName("wi")
public class NPCTypeList {

    @ObfuscatedName("wi.u")
    public final ModeGame field7279;

    @ObfuscatedName("wi.j")
    public final Language field7284;

    @ObfuscatedName("wi.a")
    public boolean field7278;

    @ObfuscatedName("wi.s")
    public final Js5 field7277;

    @ObfuscatedName("wi.c")
    public final Js5 field7280;

    @ObfuscatedName("wi.m")
    public final SoftLruHashTable field7281 = new SoftLruHashTable(64);

    @ObfuscatedName("wi.t")
    public final SoftLruHashTable field7285 = new SoftLruHashTable(50);

    @ObfuscatedName("wi.l")
    public final SoftLruHashTable field7283 = new SoftLruHashTable(5);

    @ObfuscatedName("wi.f")
    public int field7276;

    @ObfuscatedName("wi.d")
    public final String[] field7282;

    public NPCTypeList(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, Js5 arg4) {
        this.field7279 = arg0;
        this.field7284 = arg1;
        this.field7278 = arg2;
        this.field7277 = arg3;
        this.field7280 = arg4;
        if (this.field7277 != null) {
            int var6 = this.field7277.capacity() - 1;
            Js5ConfigGroup.NPCTYPE.method3071();
            this.field7277.getGroupCapacity(var6);
        }
        if (ModeGame.field6407 == this.field7279) {
            this.field7282 = new String[]{null, null, null, null, null, LocalisedText.field6874.get(this.field7284)};
        } else {
            this.field7282 = new String[]{null, null, null, null, null, null};
        }
    }

    @ObfuscatedName("wi.u(IB)Lwq;")
    public NPCType get(int arg0) {
        SoftLruHashTable var2 = this.field7281;
        NPCType var3;
        synchronized (this.field7281) {
            var3 = (NPCType) this.field7281.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7277;
        byte[] var6;
        synchronized (this.field7277) {
            var6 = this.field7277.fetchFile(Js5ConfigGroup.NPCTYPE.method3073(arg0), Js5ConfigGroup.NPCTYPE.method3075(arg0));
        }
        NPCType var8 = new NPCType();
        var8.field7211 = arg0;
        var8.field7210 = this;
        var8.op = (String[]) this.field7282.clone();
        if (var6 != null) {
            var8.method12507(new Packet(var6));
        }
        var8.method12509();
        SoftLruHashTable var9 = this.field7281;
        synchronized (this.field7281) {
            this.field7281.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("wi.j(ZS)V")
    public void method12561(boolean arg0) {
        if (this.field7278 != arg0) {
            this.field7278 = arg0;
            this.method12558();
        }
    }

    @ObfuscatedName("wi.a(II)V")
    public void method12557(int arg0) {
        this.field7276 = arg0;
        SoftLruHashTable var2 = this.field7285;
        synchronized (this.field7285) {
            this.field7285.method7922();
        }
        SoftLruHashTable var4 = this.field7283;
        synchronized (this.field7283) {
            this.field7283.method7922();
        }
    }

    @ObfuscatedName("wi.s(B)V")
    public void method12558() {
        SoftLruHashTable var1 = this.field7281;
        synchronized (this.field7281) {
            this.field7281.method7922();
        }
        SoftLruHashTable var3 = this.field7285;
        synchronized (this.field7285) {
            this.field7285.method7922();
        }
        SoftLruHashTable var5 = this.field7283;
        synchronized (this.field7283) {
            this.field7283.method7922();
        }
    }

    @ObfuscatedName("wi.c(S)V")
    public void method12559() {
        SoftLruHashTable var1 = this.field7285;
        synchronized (this.field7285) {
            this.field7285.method7922();
        }
        SoftLruHashTable var3 = this.field7283;
        synchronized (this.field7283) {
            this.field7283.method7922();
        }
    }

    @ObfuscatedName("wi.m(II)V")
    public void method12556(int arg0) {
        SoftLruHashTable var2 = this.field7281;
        synchronized (this.field7281) {
            this.field7281.method7921(arg0);
        }
        SoftLruHashTable var4 = this.field7285;
        synchronized (this.field7285) {
            this.field7285.method7921(arg0);
        }
        SoftLruHashTable var6 = this.field7283;
        synchronized (this.field7283) {
            this.field7283.method7921(arg0);
        }
    }

    @ObfuscatedName("wi.t(I)V")
    public void method12555() {
        SoftLruHashTable var1 = this.field7281;
        synchronized (this.field7281) {
            this.field7281.removeSoft();
        }
        SoftLruHashTable var3 = this.field7285;
        synchronized (this.field7285) {
            this.field7285.removeSoft();
        }
        SoftLruHashTable var5 = this.field7283;
        synchronized (this.field7283) {
            this.field7283.removeSoft();
        }
    }
}
