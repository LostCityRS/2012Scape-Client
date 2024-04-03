import deob.ObfuscatedName;

@ObfuscatedName("ro")
public class LocReference {

    @ObfuscatedName("ro.u")
    public final CoordGrid field5196;

    @ObfuscatedName("ro.j")
    public final int field5195;

    @ObfuscatedName("ro.a")
    public final int field5194;

    public LocReference(CoordGrid arg0, int arg1, int arg2, int arg3) {
        this.field5196 = arg0;
        this.field5195 = arg1;
        this.field5194 = arg3;
    }

    @ObfuscatedName("ro.u(I)I")
    public int method8722() {
        return client.field8986[this.field5195];
    }

    @ObfuscatedName("ro.j(B)Lca;")
    public Location method8725() {
        Location var1 = this.method8723();
        if (var1 == null) {
            return null;
        } else if (var1.method2401() == this.field5194) {
            return var1;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ro.a(I)Lca;")
    public Location method8723() {
        int var1 = this.field5196.level;
        CoordGrid var2 = client.world.method6214();
        int var3 = this.field5196.x - var2.x;
        int var4 = this.field5196.z - var2.z;
        if (var3 < 0 || var4 < 0 || var3 >= client.world.getSizeX() || var4 >= client.world.getSizeZ()) {
            return null;
        }
        switch (this.method8722()) {
            case 0:
                return (Location) client.world.getScene().method7433(var1, var3, var4);
            case 1:
                return (Location) client.world.getScene().method7435(var1, var3, var4);
            case 2:
                return (Location) client.world.getScene().method7437(var1, var3, var4, client.field9216);
            case 3:
                return (Location) client.world.getScene().method7517(var1, var3, var4);
            default:
                return null;
        }
    }
}
