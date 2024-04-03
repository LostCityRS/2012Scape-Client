import deob.ObfuscatedName;

@ObfuscatedName("aly")
public class VariableRateSoundPacket extends BasicVariableRateSoundPacket {

    @ObfuscatedName("aly.f")
    public float[] field10573;

    public VariableRateSoundPacket(int arg0, VorbisSound arg1, float[] arg2, int arg3, int arg4, boolean arg5) {
        this.field10295 = arg0;
        this.field10573 = arg2;
        this.field10294 = arg3;
        this.field10292 = arg4;
        this.field10293 = arg5;
    }

    @ObfuscatedName("aly.u()I")
    public int method16496() {
        return this.field10573.length;
    }

    @ObfuscatedName("aly.j(III)Laib;")
    public SoundStream method16502(int arg0, int arg1, int arg2) {
        return this.field10573 == null || this.field10573.length == 0 ? null : new VariableRateSoundStream(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("aly.f()[F")
    public float[] method17104() {
        return this.field10573;
    }
}
