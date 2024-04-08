import deob.ObfuscatedName;

@ObfuscatedName("dn")
public final class CutsceneEntity {

    @ObfuscatedName("dn.j")
    public final int field1559;

    @ObfuscatedName("dn.a")
    public final int field1560;

    @ObfuscatedName("dn.s")
    public boolean field1563 = false;

    @ObfuscatedName("dn.c")
    public NpcEntity field1558 = null;

    @ObfuscatedName("dn.m")
    public PlayerEntity field1562 = null;

    @ObfuscatedName("dn.t")
    public int[] field1564;

    public CutsceneEntity(Packet arg0, int arg1) {
        this.field1559 = arg1;
        int var3 = arg0.g1();
        switch (var3) {
            case 0:
                this.field1560 = arg0.gSmart2or4null();
                break;
            case 1:
                this.field1560 = -1;
                break;
            default:
                this.field1560 = -1;
        }
        arg0.gjstr();
    }

    @ObfuscatedName("dn.u(IIIIB)V")
    public void method2851(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1563) {
            this.field1563 = true;
            if (this.field1560 >= 0) {
                this.field1558 = new NpcEntity(client.world.getScene(), 25);
                this.field1558.slot = this.field1559;
                this.field1558.field8618 = client.loopCycle;
                this.field1558.setType(Statics.npcTypes.get(this.field1560));
                this.field1558.setSize(this.field1558.type.size);
                this.field1558.turnspeed = this.field1558.type.turnspeed << 3;
                this.field1558.field8600 = ++CutsceneManager.field1530 - 1;
            } else {
                this.field1562 = new PlayerEntity(client.world.getScene(), 25);
                this.field1562.getAppearance(Statics.field416);
                this.field1562.slot = this.field1559;
                this.field1562.field8618 = client.loopCycle;
                this.field1562.field8600 = ++CutsceneManager.field1530 - 1;
            }
        }
        if (this.field1560 >= 0) {
            this.field1558.move(arg2, arg0, arg1, true, this.field1558.size());
            this.field1558.turn(arg3, true);
        } else {
            this.field1562.level = this.field1562.field9809 = (byte) arg2;
            this.field1562.tele(arg0, arg1);
            this.field1562.turn(arg3, true);
        }
    }

    @ObfuscatedName("dn.j(I)V")
    public void method2852() {
        this.field1558 = null;
        this.field1562 = null;
        this.field1563 = false;
    }

    @ObfuscatedName("dn.a(IIII)V")
    public void method2853(int arg0, int arg1, int arg2) {
        if (this.field1558 == null) {
            this.field1562.level = this.field1562.field9809 = (byte) arg0;
            this.field1562.tele(arg1, arg2);
        } else {
            this.field1558.move(arg0, arg1, arg2, true, this.field1558.size());
        }
    }

    @ObfuscatedName("dn.s(B)Laay;")
    public PathingEntity method2854() {
        return this.field1558 == null ? this.field1562 : this.field1558;
    }

    @ObfuscatedName("dn.c(I)Z")
    public boolean method2860() {
        if (this.field1560 < 0) {
            return true;
        }
        NPCType var1 = Statics.npcTypes.get(this.field1560);
        boolean var2 = var1.method12513();
        if (this.field1564 == null) {
            BASType var3 = Statics.field3769.method7784(var1.bas);
            this.field1564 = var3.method7754();
        }
        int[] var4 = this.field1564;
        for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            var2 &= Statics.field566.method11144(var6).method11129();
        }
        return var2;
    }
}
