import deob.ObfuscatedName;

@ObfuscatedName("mk")
public class MoveSpeed implements SerializableEnum {

    @ObfuscatedName("mk.u")
    public static final MoveSpeed STATIONARY = new MoveSpeed((byte) -1);

    @ObfuscatedName("mk.j")
    public static final MoveSpeed CRAWL = new MoveSpeed((byte) 0);

    @ObfuscatedName("mk.a")
    public static final MoveSpeed WALK = new MoveSpeed((byte) 1);

    @ObfuscatedName("mk.s")
    public static final MoveSpeed RUN = new MoveSpeed((byte) 2);

    @ObfuscatedName("mk.m")
    public byte id;

    @ObfuscatedName("cc.u(I)[Lmk;")
    public static MoveSpeed[] values() {
        return new MoveSpeed[]{STATIONARY, WALK, CRAWL, RUN};
    }

    public MoveSpeed(byte arg0) {
        this.id = arg0;
    }

    @ObfuscatedName("mk.j(B)I")
    public int getId() {
        return this.id;
    }

    @ObfuscatedName("mk.a(B)I")
    public int method6349() {
        return this.id + 1;
    }
}
