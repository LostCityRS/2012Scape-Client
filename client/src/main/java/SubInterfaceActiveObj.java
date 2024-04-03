import deob.ObfuscatedName;

@ObfuscatedName("ajh")
public class SubInterfaceActiveObj extends SubIfType {

    @ObfuscatedName("ajh.m")
    public final ObjReference field10479;

    public SubInterfaceActiveObj(int arg0, int arg1, ObjReference arg2) {
        super(arg0, arg1);
        this.field10479 = arg2;
    }

    @ObfuscatedName("ajh.u(B)Z")
    public boolean method15469() {
        ObjStackEntity var1 = this.field10479.method11076();
        if (var1 == null) {
            return false;
        } else {
            ScriptRunner.method7276(ClientTriggerType.field7316, this.field9679, -1, this.field10479, var1);
            return true;
        }
    }
}
