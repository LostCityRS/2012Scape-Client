
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("fe")
public abstract class Camera {

	@ObfuscatedName("fe.u")
	public final CameraRelated field2227;

	@ObfuscatedName("fe.j")
	public CameraControlMode field2219;

	@ObfuscatedName("fe.a")
	public CameraProjectionMode field2220;

	@ObfuscatedName("fe.s")
	public LookatMode field2221;

	@ObfuscatedName("fe.c")
	public Lookat field2222;

	@ObfuscatedName("fe.m")
	public PositionMode field2234;

	@ObfuscatedName("fe.t")
	public Position field2224;

	@ObfuscatedName("fe.l")
	public final CameraTrackableProvider field2240;

	@ObfuscatedName("fe.f")
	public CameraLinearMovementMode field2226;

	@ObfuscatedName("fe.d")
	public int field2238;

	@ObfuscatedName("fe.z")
	public float field2228;

	@ObfuscatedName("fe.n")
	public final Vector3 field2229 = new Vector3();

	@ObfuscatedName("fe.o")
	public final Vector3 field2230 = new Vector3();

	@ObfuscatedName("fe.p")
	public final Vector3 field2232 = new Vector3();

	@ObfuscatedName("fe.w")
	public final Vector3 field2233 = new Vector3();

	@ObfuscatedName("fe.b")
	public final Vector3 field2246 = new Vector3();

	@ObfuscatedName("fe.x")
	public final Vector3 field2235 = new Vector3();

	@ObfuscatedName("fe.i")
	public float field2245;

	@ObfuscatedName("fe.v")
	public float field2237;

	@ObfuscatedName("fe.k")
	public float field2223;

	@ObfuscatedName("fe.h")
	public float field2239;

	@ObfuscatedName("fe.r")
	public float field2218;

	@ObfuscatedName("fe.g")
	public float field2241;

	@ObfuscatedName("fe.y")
	public boolean field2242;

	@ObfuscatedName("fe.e")
	public boolean field2243;

	@ObfuscatedName("fe.ay")
	public int field2244 = 0;

	@ObfuscatedName("fe.af")
	public float field2236 = 1.0F;

	@ObfuscatedName("fe.ar")
	public IterableMap field2225 = new IterableMap(8);

	public Camera(CameraRelated arg0, CameraTrackableProvider arg1) {
		this.field2227 = arg0;
		this.field2240 = arg1;
		this.method3688(true);
	}

	@ObfuscatedName("fe.u(ZI)V")
	public void method3688(boolean arg0) {
		this.field2220 = CameraProjectionMode.field2205;
		this.field2221 = null;
		this.field2222 = null;
		this.field2234 = null;
		this.field2224 = null;
		if (CameraRelated.field2188 != this.field2227 && arg0) {
			this.field2219 = CameraControlMode.field2203;
		} else {
			this.field2219 = CameraControlMode.field2202;
		}
		this.field2226 = CameraLinearMovementMode.field2197;
		this.field2229.method5373(100.0F, 100.0F, 100.0F);
		this.field2230.method5373(100.0F, 100.0F, 100.0F);
		this.field2228 = 0.05F;
		this.field2232.method5373(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2233.method5373(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2246.method5373(1.0F, 1.0F, 1.0F);
		this.field2235.method5373(1.0F, 1.0F, 1.0F);
		this.field2245 = 1.1F;
		this.field2237 = 1.1F;
		this.field2223 = 50.0F;
		this.field2239 = 10000.0F;
		this.field2241 = 1.5707964F;
		this.field2218 = 1.5707964F;
		this.field2238 = 5;
		this.field2242 = true;
		this.field2243 = true;
		this.field2244 = 0;
		this.field2236 = 1.0F;
		this.field2225.method11925();
	}

	@ObfuscatedName("fe.j(FLmv;[[[II)V")
	public void method3727(float arg0, class361 arg1, int[][][] arg2) {
		if (this.field2222 != null) {
			this.field2222.method11540(arg0);
		}
		if (this.field2224 != null) {
			this.field2224.method4014(arg0, arg1, arg2);
		}
		Iterator var4 = this.field2225.iterator();
		while (var4.hasNext()) {
			CameraEffect var5 = (CameraEffect) var4.next();
			var5.method16667(arg0);
		}
	}

	@ObfuscatedName("fe.a(ZFLko;Lkn;Lko;Lko;I)V")
	public void method3811(boolean arg0, float arg1, Vector3 arg2, Quaternion arg3, Vector3 arg4, Vector3 arg5) {
		if (CameraLinearMovementMode.field2196 == this.field2226) {
			class437.method7675(arg1, arg2, arg4, arg5, arg0 ? this.field2233 : this.field2232, arg0 ? this.field2230 : this.field2229, (float) this.field2244, this.field2236);
		} else if (CameraLinearMovementMode.field2197 == this.field2226) {
			class438.method1697(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2233 : this.field2232, arg0 ? this.field2230 : this.field2229, (float) this.field2244, this.field2236);
		} else if (CameraLinearMovementMode.field2199 == this.field2226) {
			class436.method3664(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2235 : this.field2246, arg0 ? this.field2237 : this.field2245);
		}
	}

	@ObfuscatedName("fe.s(Lfh;I)V")
	public void method3691(CameraControlMode arg0) {
		this.field2219 = arg0;
	}

	@ObfuscatedName("fe.c(Lfo;ZI)Ltd;")
	public Lookat method3692(LookatMode arg0, boolean arg1) throws CameraException {
		if (CameraControlMode.field2202 == this.field2219 && !arg1) {
			throw new CameraException();
		}
		this.field2221 = arg0;
		if (LookatMode.field2165 == arg0) {
			this.field2222 = new LookatEntity(this);
		} else if (LookatMode.field2169 == arg0) {
			this.field2222 = new LookatOrientation(this);
		} else if (LookatMode.field2167 == arg0) {
			this.field2222 = new LookatPoint(this);
		} else if (LookatMode.field2164 == arg0) {
			this.field2222 = new LookatSpline_Sub1(this);
		} else if (LookatMode.field2168 == arg0) {
			this.field2222 = new LookatSpline_Sub2(this);
		} else if (LookatMode.field2170 == arg0) {
			this.field2222 = new Lookat_Sub1(this);
		}
		return this.field2222;
	}

	@ObfuscatedName("fe.m(Lfg;ZI)Lgo;")
	public Position method3693(PositionMode arg0, boolean arg1) throws CameraException {
		if (CameraControlMode.field2202 == this.field2219 && !arg1) {
			throw new CameraException();
		}
		this.field2234 = arg0;
		if (PositionMode.field2193 == arg0) {
			this.field2224 = new PositionEntity(this);
		} else if (PositionMode.field2192 == arg0) {
			this.field2224 = new PositionPoint(this);
		} else if (PositionMode.field2191 == arg0) {
			this.field2224 = new PositionSpline_Sub1(this);
		} else if (PositionMode.field2194 == arg0) {
			this.field2224 = new PositionSpline_Sub2(this);
		}
		return this.field2224;
	}

	@ObfuscatedName("fe.t(B)Z")
	public boolean method3715() {
		if (CameraRelated.field2188 == this.field2227 && CameraControlMode.field2202 == this.field2219) {
			return true;
		} else {
			return CameraRelated.field2189 == this.field2227 && CameraControlMode.field2203 == this.field2219;
		}
	}

	@ObfuscatedName("fe.l(FI)V")
	public void method3695(float arg0) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
	}

	@ObfuscatedName("fe.f(FB)V")
	public void method3696(float arg0) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
		this.field2228 = arg0;
	}

	@ObfuscatedName("fe.d(Lfu;B)V")
	public void method3697(CameraLinearMovementMode arg0) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
		this.field2226 = arg0;
	}

	@ObfuscatedName("fe.z(Lko;I)V")
	public void method3698(Vector3 arg0) throws CameraException {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2232.method5334(arg0);
	}

	@ObfuscatedName("fe.n(Lko;I)V")
	public void method3755(Vector3 arg0) throws CameraException {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2233.method5334(arg0);
	}

	@ObfuscatedName("fe.o(Lko;B)V")
	public void method3700(Vector3 arg0) throws CameraException {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2229.method5334(arg0);
	}

	@ObfuscatedName("fe.q(Lko;B)V")
	public void method3771(Vector3 arg0) throws CameraException {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2230.method5334(arg0);
	}

	@ObfuscatedName("fe.p(Lko;FI)V")
	public void method3702(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method3715() || this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2246.method5334(arg0);
		this.field2235.method5334(arg0);
		this.field2245 = arg1;
		this.field2237 = arg1;
	}

	@ObfuscatedName("fe.w(Lko;FB)V")
	public void method3768(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method3715() || this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2246.method5334(arg0);
		this.field2245 = arg1;
	}

	@ObfuscatedName("fe.b(Lko;FI)V")
	public void method3687(Vector3 arg0, float arg1) throws CameraException {
		if (!this.method3715() || this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2235.method5334(arg0);
		this.field2237 = arg1;
	}

	@ObfuscatedName("fe.x(FFS)V")
	public void method3705(float arg0, float arg1) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
		this.field2223 = arg0;
		this.field2239 = arg1;
	}

	@ObfuscatedName("fe.i(FFB)V")
	public void method3739(float arg0, float arg1) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
		this.field2218 = arg0;
		this.field2241 = arg1;
	}

	@ObfuscatedName("fe.v(ZZB)V")
	public void method3707(boolean arg0, boolean arg1) throws CameraException {
		if (!this.method3715()) {
			throw new CameraException();
		}
		this.field2242 = arg0;
		this.field2243 = arg1;
	}

	@ObfuscatedName("fe.k(IFI)V")
	public void method3708(int arg0, float arg1) throws CameraException {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new CameraException();
		}
		this.field2244 = arg0;
		this.field2236 = arg1;
	}

	@ObfuscatedName("fe.h(Laja;I)V")
	public void method3709(CameraEffect arg0) {
		this.field2225.method11927(arg0, (long) arg0.field10351);
	}

	@ObfuscatedName("fe.r(II)V")
	public void method3710(int arg0) {
		CameraEffect var2 = (CameraEffect) this.field2225.method11923((long) arg0);
		if (var2 != null) {
			var2.method6979();
		}
	}

	@ObfuscatedName("fe.g(IB)Laja;")
	public CameraEffect method3711(int arg0) {
		return (CameraEffect) this.field2225.method11923((long) arg0);
	}

	@ObfuscatedName("fe.y(I)V")
	public void method3750() {
		this.field2225.method11925();
	}

	@ObfuscatedName("fe.e(I)Z")
	public boolean method3735() {
		if (this.field2222 == null || this.field2224 == null) {
			return false;
		} else if (this.field2222.method11541()) {
			return this.field2224.method4030();
		} else {
			return false;
		}
	}

	@ObfuscatedName("fe.ay(Lfi;Lkc;Lka;III)V")
	public void method3713(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2, int arg3, int arg4) {
		if (this.field2222 == null || this.field2224 == null) {
			return;
		}
		this.field2222.method11543(arg0, arg1, arg3, arg4);
		this.field2224.method4029(arg0, arg3, arg4);
		if (CameraProjectionMode.field2205 == this.field2220) {
			arg2.method5394(this.field2223, this.field2239, this.field2218, this.field2241);
		} else {
			arg2.method5395(this.field2223, this.field2239, (float) this.field2238);
		}
		Iterator var6 = this.field2225.iterator();
		while (var6.hasNext()) {
			CameraEffect var7 = (CameraEffect) var6.next();
			var7.method16668(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("fe.af(I)Lfh;")
	public CameraControlMode method3764() {
		return this.field2219;
	}

	@ObfuscatedName("fe.ar(I)Lgo;")
	public Position method3699() {
		return this.field2224;
	}

	@ObfuscatedName("fe.an(I)Ltd;")
	public Lookat method3716() {
		return this.field2222;
	}

	@ObfuscatedName("fe.ap(I)Lfb;")
	public CameraTrackableProvider method3717() {
		return this.field2240;
	}

	@ObfuscatedName("fe.ag(I)Lfo;")
	public LookatMode method3751() {
		return this.field2221;
	}

	@ObfuscatedName("fe.as(B)Lfg;")
	public PositionMode method3719() {
		return this.field2234;
	}

	@ObfuscatedName("fe.ai(I)Lko;")
	public Vector3 method3720() {
		return this.field2224 == null ? null : this.field2224.method4016();
	}

	@ObfuscatedName("fe.ao(I)Lko;")
	public Vector3 method3828() {
		return this.field2222 == null ? null : this.field2222.method11550();
	}

	@ObfuscatedName("fe.al(B)Ladu;")
	public CoordFine method3722() {
		return this.field2224 == null ? null : this.field2224.method4017();
	}

	@ObfuscatedName("fe.at(B)F")
	public float method3723() {
		Vector3 var1 = this.method3720();
		Vector3 var2 = this.method3828();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			Vector3 var4 = Vector3.method5377(var2, var1);
			float var5 = (float) Math.sqrt((double) (var4.field3477 * var4.field3477 + var4.field3475 * var4.field3475));
			var3 = (float) Math.atan2((double) -var4.field3476, (double) var5);
			var1.method5291();
			var2.method5291();
		}
		return var3;
	}

	@ObfuscatedName("fe.ax(B)F")
	public float method3791() {
		Vector3 var1 = this.method3720();
		Vector3 var2 = this.method3828();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			Vector3 var4 = Vector3.method5377(var1, var2);
			var4.field3476 = 0.0F;
			var3 = (float) Math.atan2((double) var4.field3475, (double) var4.field3477);
			var1.method5291();
			var2.method5291();
		}
		return (float) (3.141592653589793D - (double) var3);
	}

	@ObfuscatedName("fe.aw(B)F")
	public float method3725() {
		return 0.0F;
	}

	@ObfuscatedName("fe.aa(I)Lkn;")
	public Quaternion method3726() {
		Quaternion var1 = Quaternion.method5206();
		var1.method5217(this.method3791(), this.method3723(), this.method3725());
		return var1;
	}

	@ObfuscatedName("fe.am(B)Lko;")
	public Vector3 method3809() {
		return this.field2232;
	}

	@ObfuscatedName("fe.ad(B)Lko;")
	public Vector3 method3728() {
		return this.field2233;
	}

	@ObfuscatedName("fe.az(B)F")
	public float method3729() {
		return this.field2228;
	}

	@ObfuscatedName("fe.ak(I)Lko;")
	public Vector3 method3730() {
		return this.field2229;
	}

	@ObfuscatedName("fe.av(S)Lko;")
	public Vector3 method3724() {
		return this.field2230;
	}

	@ObfuscatedName("fe.aj(B)F")
	public float method3732() {
		return this.field2223;
	}

	@ObfuscatedName("fe.ah(I)F")
	public float method3778() {
		return this.field2239;
	}

	@ObfuscatedName("fe.au(I)Z")
	public boolean method3734() {
		return this.field2242;
	}

	@ObfuscatedName("fe.ae(I)Z")
	public boolean method3765() {
		return this.field2243;
	}
}
