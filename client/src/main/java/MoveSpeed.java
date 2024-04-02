
import deob.ObfuscatedName;

@ObfuscatedName("mk")
public class MoveSpeed implements SerializableEnum {

	@ObfuscatedName("mk.u")
	public static final MoveSpeed field3923 = new MoveSpeed((byte) -1);

	@ObfuscatedName("mk.j")
	public static final MoveSpeed field3920 = new MoveSpeed((byte) 0);

	@ObfuscatedName("mk.a")
	public static final MoveSpeed field3921 = new MoveSpeed((byte) 1);

	@ObfuscatedName("mk.s")
	public static final MoveSpeed field3922 = new MoveSpeed((byte) 2);

	@ObfuscatedName("mk.m")
	public byte field3924;

	@ObfuscatedName("cc.u(I)[Lmk;")
	public static MoveSpeed[] method2553() {
		return new MoveSpeed[] { field3923, field3921, field3920, field3922 };
	}

	public MoveSpeed(byte arg0) {
		this.field3924 = arg0;
	}

	@ObfuscatedName("mk.j(B)I")
	public int method6339() {
		return this.field3924;
	}

	@ObfuscatedName("mk.a(B)I")
	public int method6349() {
		return this.field3924 + 1;
	}
}
