
import deob.ObfuscatedName;

@ObfuscatedName("go")
public abstract class Position {

	@ObfuscatedName("go.u")
	public final Camera field2340;

	public Position(Camera arg0) {
		this.field2340 = arg0;
	}

	@ObfuscatedName("go.u(FLmv;[[[IB)V")
	public abstract void method4014(float arg0, class361 arg1, int[][][] arg2);

	@ObfuscatedName("go.a(I)Lko;")
	public abstract Vector3 method4016();

	@ObfuscatedName("go.s(B)Ladu;")
	public abstract CoordFine method4017();

	@ObfuscatedName("go.m(Laet;B)V")
	public abstract void method4018(Packet arg0);

	@ObfuscatedName("go.c(Lfi;III)V")
	public abstract void method4029(Vector3i arg0, int arg1, int arg2);

	@ObfuscatedName("go.j(B)Z")
	public abstract boolean method4030();
}
