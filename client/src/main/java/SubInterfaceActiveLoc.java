import deob.ObfuscatedName;

@ObfuscatedName("ajq")
public class SubInterfaceActiveLoc extends SubInterface {

    @ObfuscatedName("ajq.m")
    public final LocReference field10477;

    public SubInterfaceActiveLoc(int arg0, int arg1, LocReference arg2) {
        super(arg0, arg1);
        this.field10477 = arg2;
    }

    @ObfuscatedName("ajq.u(B)Z")
    public boolean process() {
        Location var1 = this.field10477.method8725();
        if (var1 == null) {
            return false;
        } else {
            ScriptRunner.method1972(ClientTriggerType.field7305, this.field9679, -1, var1);
            return true;
        }
    }
}
