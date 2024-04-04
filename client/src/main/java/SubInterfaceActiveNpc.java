import deob.ObfuscatedName;

@ObfuscatedName("aji")
public class SubInterfaceActiveNpc extends SubInterface {

    @ObfuscatedName("aji.m")
    public final int field10476;

    public SubInterfaceActiveNpc(int arg0, int arg1, int arg2) {
        super(arg0, arg1);
        this.field10476 = arg2;
    }

    @ObfuscatedName("aji.u(B)Z")
    public boolean process() {
        ObjectNode var1 = (ObjectNode) client.npcs.getNode((long) this.field10476);
        if (var1 == null) {
            return false;
        } else {
            ScriptRunner.method2842(ClientTriggerType.field7313, this.field9679, -1, (PathingEntity) var1.field9550, this.field10476);
            return true;
        }
    }
}
