import deob.ObfuscatedName;

@ObfuscatedName("rq")
public class ObjReference {

    @ObfuscatedName("rq.u")
    public final CoordGrid field5241;

    @ObfuscatedName("rq.j")
    public final int field5242;

    public ObjReference(CoordGrid arg0, int arg1) {
        this.field5241 = arg0;
        this.field5242 = arg1;
    }

    @ObfuscatedName("rq.u(I)Lali;")
    public ObjStackEntity method11076() {
        ObjStackList var1 = (ObjStackList) client.field9088.method11923((long) (this.field5241.level << 28 | this.field5241.z << 14 | this.field5241.x));
        if (var1 == null) {
            return null;
        }
        CoordGrid var2 = client.field8980.method6214();
        int var3 = this.field5241.x - var2.x;
        int var4 = this.field5241.z - var2.z;
        if (var3 >= 0 && var4 >= 0 && var3 < client.field8980.method6220() && var4 < client.field8980.method6193()) {
            for (Obj var5 = (Obj) var1.field9313.method11563(); var5 != null; var5 = (Obj) var1.field9313.method11567()) {
                if (this.field5242 == var5.field9311) {
                    return (ObjStackEntity) client.field8980.method6098().method7436(this.field5241.level, var3, var4);
                }
            }
        }
        return null;
    }
}
