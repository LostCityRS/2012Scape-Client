import deob.ObfuscatedName;

@ObfuscatedName("dv")
public final class CutsceneVarDomain implements VarIntDomain {

    @ObfuscatedName("dv.l(II)I")
    public int getVarBit(int arg0) {
        IntNode var2 = (IntNode) CutsceneManager.field1529.get((long) arg0 | 0x100000000L);
        return var2 == null ? Statics.field2669.getVarBit(arg0) : var2.value;
    }

    @ObfuscatedName("dv.t(II)I")
    public int garVarInt(int arg0) {
        IntNode var2 = (IntNode) CutsceneManager.field1529.get((long) arg0);
        return var2 == null ? Statics.field2669.garVarInt(arg0) : var2.value;
    }
}
