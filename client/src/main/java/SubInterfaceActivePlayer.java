import deob.ObfuscatedName;

@ObfuscatedName("ajd")
public class SubInterfaceActivePlayer extends SubInterface {

    @ObfuscatedName("ajd.m")
    public final int field10478;

    public SubInterfaceActivePlayer(int arg0, int arg1, int arg2) {
        super(arg0, arg1);
        this.field10478 = arg2;
    }

    @ObfuscatedName("ajd.u(B)Z")
    public boolean method15469() {
        PlayerEntity var1 = client.players[this.field10478];
        if (var1 == null) {
            return false;
        } else {
            ScriptRunner.method2842(ClientTriggerType.field7314, this.field9679, -1, var1, this.field10478);
            return true;
        }
    }
}
