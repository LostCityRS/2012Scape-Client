
import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("ja")
public class ja extends RendererToolkit implements class10 {

	public long nativeid = 0L;

	@ObfuscatedName("ja.y")
	public boolean field459 = false;

	@ObfuscatedName("ja.e")
	public ba field437;

	@ObfuscatedName("ja.ay")
	public IterableQueue field438 = new IterableQueue();

	@ObfuscatedName("ja.af")
	public int field453 = 4096;

	@ObfuscatedName("ja.ar")
	public int field440 = 4096;

	@ObfuscatedName("ja.an")
	public Matrix4x4 field441;

	@ObfuscatedName("ja.ap")
	public Matrix4x3 field442;

	@ObfuscatedName("ja.ag")
	public Matrix4x3 field443;

	@ObfuscatedName("ja.as")
	public Matrix4x4 field464;

	@ObfuscatedName("ja.ai")
	public Matrix4x4 field445;

	@ObfuscatedName("ja.ao")
	public Matrix4x4 field436;

	@ObfuscatedName("ja.al")
	public float field447;

	@ObfuscatedName("ja.at")
	public float field448;

	@ObfuscatedName("ja.ax")
	public float field450;

	@ObfuscatedName("ja.aw")
	public float field451;

	@ObfuscatedName("ja.aa")
	public int field457;

	@ObfuscatedName("ja.am")
	public a[] field452;

	@ObfuscatedName("ja.ah")
	public static int[] field446 = new int[Math.max(Math.max(104, 20), 24573)];

	@ObfuscatedName("ja.au")
	public static float[] field469 = new float[20];

	@ObfuscatedName("ja.ae")
	public static int[] field460 = new int[6];

	@ObfuscatedName("ja.ac")
	public static int[] field461 = field446;

	@ObfuscatedName("ja.aq")
	public static float[] field462 = field469;

	@ObfuscatedName("ja.ab")
	public static int[] field463 = field446;

	@ObfuscatedName("ja.bq")
	public static int[] field439 = field446;

	@ObfuscatedName("ja.bz")
	public static int[] field465 = new int[8191];

	@ObfuscatedName("ja.bv")
	public static int[] field466 = new int[8191];

	@ObfuscatedName("ja.bj")
	public static short[] field458 = new short[8191];

	@ObfuscatedName("ja.bf")
	public static byte[] field468 = new byte[8191];

	@ObfuscatedName("ja.bt")
	public boolean field449 = false;

	public ja(Canvas arg0, BillboardTypeList arg1, int arg2, int arg3) {
		super(arg1);
		try {
			if (!NativeLibraries.method11710().method6800("sw3d")) {
				throw new RuntimeException("");
			}
			class111.method2360();
			this.method966(this.field400, this.field400.method894(), 0);
			ColourUtils.method8092(false, true);
			this.field449 = true;
			this.field441 = new Matrix4x4();
			new Vector3();
			this.field442 = new Matrix4x3();
			new Quaternion();
			this.field464 = new Matrix4x4();
			this.field445 = new Matrix4x4();
			this.field436 = new Matrix4x4();
			this.method524(new Matrix4x3());
			this.method784(new Matrix4x4());
			this.method985(1);
			this.method986(0);
			if (arg0 != null) {
				this.method459(arg0, arg2, arg3);
				this.method462(arg0);
			}
			int var5 = this.field400.method894();
			for (short var6 = 0; var6 < var5; var6++) {
				Material var7 = this.field400.method889(var6);
				if (var7 != null) {
					this.method974(var6, var7.field1260, var7.field1262.method6339(), var7.field1270, var7.field1248, var7.field1264, var7.field1252 == 64, var7.field1266, var7.field1267, var7.field1268, var7.field1261, var7.field1250, var7.field1265, var7.field1276, var7.field1273, var7.field1274, var7.field1275, var7.field1245, var7.field1277, var7.field1278);
				}
			}
		} catch (Throwable var9) {
			this.method442();
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ja.h()V")
	public void method992() {
		System.gc();
		System.runFinalization();
		class111.method2359();
	}

	public synchronized void finalize() {
		this.method442();
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("ja.of(Ldp;Z)V")
	public void method1022(ParticleList arg0, boolean arg1) {
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		for (class914 var8 = (class914) arg0.field1311.method11670(); var8 != null; var8 = (class914) arg0.field1311.method11671()) {
			field439[var3++] = var8.field10145;
			field439[var3++] = var8.field10146;
			field439[var3++] = var8.field10147;
			field465[var4++] = var8.field10144;
			field458[var6++] = (short) var8.field10149;
			field466[var5++] = var8.field10148;
			if (arg1) {
				field468[var7++] = var8.field10151;
			}
		}
	}

	@ObfuscatedName("ja.t()Lcg;")
	public ToolkitInfo method456() {
		return new ToolkitInfo(0, "SSE", 1, "CPU", 0L);
	}

	@ObfuscatedName("ja.f(II)V")
	public void method653(int arg0, int arg1) throws class881 {
		za var3 = (za) this.method458();
		if (var3 == null) {
			throw new IllegalStateException();
		}
		var3.method919(arg0, arg1);
		if (this.field400 != null) {
			this.field400.method890();
		}
	}

	@ObfuscatedName("ja.z()V")
	public void method441() {
	}

	@ObfuscatedName("ja.w()V")
	public void method443() {
		if (this.field459) {
			return;
		}
		this.field452 = null;
		this.field437 = null;
		this.field441 = null;
		for (ba var1 = (ba) this.field438.method11563(); var1 != null; var1 = (ba) this.field438.method11567()) {
			var1.method1153();
		}
		this.field438.method11557();
		this.method969();
		if (this.field449) {
			ColourUtils.method2790(false, true);
			this.field449 = false;
		}
		this.method992();
		class111.method2361();
		this.field459 = true;
	}

	@ObfuscatedName("ja.b(I)V")
	public void method444(int arg0) {
		class111.method2359();
		this.method970(arg0);
		for (ba var2 = (ba) this.field438.method11563(); var2 != null; var2 = (ba) this.field438.method11567()) {
			var2.method1152();
		}
	}

	@ObfuscatedName("ja.i()Z")
	public boolean method629() {
		return true;
	}

	@ObfuscatedName("ja.v()Z")
	public boolean method447() {
		return true;
	}

	@ObfuscatedName("ja.g()Z")
	public boolean method448() {
		return true;
	}

	@ObfuscatedName("ja.ay()Z")
	public boolean method450() {
		return false;
	}

	@ObfuscatedName("ja.af()Z")
	public boolean method451() {
		return false;
	}

	@ObfuscatedName("ja.e()Z")
	public boolean method449() {
		return true;
	}

	@ObfuscatedName("ja.ar()Z")
	public boolean method452() {
		return false;
	}

	@ObfuscatedName("ja.an()Z")
	public boolean method765() {
		return true;
	}

	@ObfuscatedName("ja.ap()Z")
	public boolean method454() {
		return true;
	}

	@ObfuscatedName("ja.ag()Z")
	public boolean method455() {
		return true;
	}

	@ObfuscatedName("ja.ck()I")
	public int method768() {
		return 4;
	}

	@ObfuscatedName("ja.db(Z)V")
	public void method471(boolean arg0) {
	}

	@ObfuscatedName("ja.ac()V")
	public void method587() {
	}

	@ObfuscatedName("ja.ak(Ljava/awt/Canvas;II)Lya;")
	public class675 method735(Canvas arg0, int arg1, int arg2) {
		return new za(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("ja.aq()V")
	public void method490() {
		this.field447 = (float) this.method457().method921() / 2.0F;
		this.field450 = (float) this.method457().method922() / 2.0F;
		this.field448 = this.field447;
		this.field451 = this.field450;
		this.method979();
	}

	@ObfuscatedName("ja.ab(IIII)V")
	public void method474(int arg0, int arg1, int arg2, int arg3) {
		this.field447 = (float) arg2 / 2.0F;
		this.field450 = (float) arg3 / 2.0F;
		this.field448 = (float) arg0 + this.field447;
		this.field451 = (float) arg1 + this.field450;
		this.method980(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.bl(IIIIII)V")
	public void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method493(arg0, arg1, arg2, arg4, arg5);
		this.method493(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method494(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.method494(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@ObfuscatedName("ja.bk(IIFIIFIIFIIII)V")
	public void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ja.bs(IIIIII)V")
	public void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method967(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ja.bn(IIIIIILta;II)V")
	public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
		this.method968(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("ja.br(IIIIIII)V")
	public void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.method987().method98(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.bc(IIIIIILta;IIIII)V")
	public void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("ja.bd(IIIIIIIII)V")
	public void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("ja.bp(IIIIII)I")
	public int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field436.field3480[10] * (float) arg2 + this.field436.field3480[6] * (float) arg1 + this.field436.field3480[2] * (float) arg0 + this.field436.field3480[14];
		float var9 = this.field436.field3480[10] * (float) arg5 + this.field436.field3480[6] * (float) arg4 + this.field436.field3480[2] * (float) arg3 + this.field436.field3480[14];
		float var10 = this.field436.field3480[11] * (float) arg2 + this.field436.field3480[7] * (float) arg1 + this.field436.field3480[3] * (float) arg0 + this.field436.field3480[15];
		float var11 = this.field436.field3480[11] * (float) arg5 + this.field436.field3480[7] * (float) arg4 + this.field436.field3480[3] * (float) arg3 + this.field436.field3480[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field436.field3480[8] * (float) arg2 + this.field436.field3480[4] * (float) arg1 + this.field436.field3480[0] * (float) arg0 + this.field436.field3480[12];
		float var13 = this.field436.field3480[8] * (float) arg5 + this.field436.field3480[4] * (float) arg4 + this.field436.field3480[0] * (float) arg3 + this.field436.field3480[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field436.field3480[9] * (float) arg2 + this.field436.field3480[5] * (float) arg1 + this.field436.field3480[1] * (float) arg0 + this.field436.field3480[13];
		float var15 = this.field436.field3480[9] * (float) arg5 + this.field436.field3480[5] * (float) arg4 + this.field436.field3480[1] * (float) arg3 + this.field436.field3480[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("ja.do(FFF[F)V")
	public void method550(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field436.field3480[11] * arg2 + this.field436.field3480[7] * arg1 + this.field436.field3480[3] * arg0 + this.field436.field3480[15];
		float var6 = this.field436.field3480[8] * arg2 + this.field436.field3480[4] * arg1 + this.field436.field3480[0] * arg0 + this.field436.field3480[12];
		float var7 = this.field436.field3480[9] * arg2 + this.field436.field3480[5] * arg1 + this.field436.field3480[1] * arg0 + this.field436.field3480[13];
		float var8 = this.field464.field3480[10] * arg2 + this.field464.field3480[6] * arg1 + this.field464.field3480[2] * arg0 + this.field464.field3480[14];
		arg3[0] = this.field447 * var6 / var5 + this.field448;
		arg3[1] = this.field450 * var7 / var5 + this.field451;
		arg3[2] = var8;
	}

	@ObfuscatedName("ja.dg(FFF[F)V")
	public void method567(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field436.field3480[10] * arg2 + this.field436.field3480[6] * arg1 + this.field436.field3480[2] * arg0 + this.field436.field3480[14];
		float var6 = this.field436.field3480[11] * arg2 + this.field436.field3480[7] * arg1 + this.field436.field3480[3] * arg0 + this.field436.field3480[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field436.field3480[8] * arg2 + this.field436.field3480[4] * arg1 + this.field436.field3480[0] * arg0 + this.field436.field3480[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field436.field3480[9] * arg2 + this.field436.field3480[5] * arg1 + this.field436.field3480[1] * arg0 + this.field436.field3480[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field464.field3480[10] * arg2 + this.field464.field3480[6] * arg1 + this.field464.field3480[2] * arg0 + this.field464.field3480[14];
			arg3[0] = this.field447 * var7 / var6 + this.field448;
			arg3[1] = this.field450 * var8 / var6 + this.field451;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("ja.bi(I)Lv;")
	public class28 method593(int arg0) {
		ba var2 = new ba(this, arg0);
		this.field438.method11558(var2);
		return var2;
	}

	@ObfuscatedName("ja.bx(Lv;)V")
	public void method502(class28 arg0) {
		this.field437 = (ba) arg0;
		this.method971(arg0);
	}

	@ObfuscatedName("ja.bb(IIZZ)Lce;")
	public class118 method658(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new fa(this, arg0, arg1, arg3);
	}

	@ObfuscatedName("ja.be([IIIIIZ)Lce;")
	public class118 method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new fa(this, arg0, arg1, arg2, arg3, arg4, false);
	}

	@ObfuscatedName("ja.bo(Lds;Z)Lce;")
	public class118 method517(SpriteData arg0, boolean arg1) {
		fa var3 = new fa(this, arg0.method2735(false), 0, arg0.method2721(), arg0.method2721(), arg0.method2763(), false);
		var3.method1036(arg0.method2722(), arg0.method2724(), arg0.method2732(), arg0.method2734());
		return var3;
	}

	@ObfuscatedName("ja.bh(IIIIZ)Lce;")
	public class118 method508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new fa(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@ObfuscatedName("ja.cq(II[I[I)Lta;")
	public class11 method571(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new wa(this, this.field437, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ja.co(Lvm;[Lzv;Z)Ll;")
	public class15 method712(FontMetrics arg0, PalettedSpriteData[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].field8415;
			var5[var7] = arg1[var7].field8409;
			if (arg1[var7].field8416 != null) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new ea(this, this.field437, arg0, arg1, null);
			} else {
				return new m(this, this.field437, arg0, arg1, null);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.field437, arg0, arg1, null);
		}
	}

	@ObfuscatedName("ja.cw(I)V")
	public void method673(int arg0) {
		this.field453 = this.field440 = arg0;
		if (this.field457 > 1) {
			throw new IllegalStateException();
		}
		this.method985(this.field457);
		this.method986(0);
	}

	@ObfuscatedName("ja.cx(Ldw;IIII)Lqa;")
	public Model method625(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
		return new h(this, this.field437, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ja.cn(II)I")
	public int method519(int arg0, int arg1) {
		int var3 = arg0 & 0xFFFFF;
		int var4 = arg1 & 0xFFFFF;
		return var3 & var4 ^ var4;
	}

	@ObfuscatedName("ja.cf(II)I")
	public int method520(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("ja.cs(II[[I[[IIII)Lxa;")
	public FloorModel method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new i(this, this.field437, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("ja.cb()Lka;")
	public Matrix4x4 method781() {
		return this.field441;
	}

	@ObfuscatedName("ja.cm()Lkc;")
	public Matrix4x3 method516() {
		return this.field442;
	}

	@ObfuscatedName("ja.oa(I)V")
	public void method985(int arg0) {
		this.field457 = arg0;
		this.field452 = new a[this.field457];
		for (int var2 = 0; var2 < this.field457; var2++) {
			this.field452[var2] = new a(this, this.field453, this.field440);
		}
	}

	@ObfuscatedName("ja.os(I)V")
	public void method986(int arg0) {
		this.field452[arg0].method110();
	}

	@ObfuscatedName("ja.oq()La;")
	public a method987() {
		for (int var1 = 0; var1 < this.field457; var1++) {
			if (this.field452[var1].field377 == Thread.currentThread()) {
				return this.field452[var1];
			}
		}
		return null;
	}

	@ObfuscatedName("ja.cp(Ldp;)V")
	public void method733(ParticleList arg0) {
		if (!arg0.field1311.method11674()) {
			this.method1022(arg0, false);
			this.method987().method96(this, field439, field465, field466, field458, arg0.field1311.method11681());
		}
	}

	@ObfuscatedName("ja.ci(Lkc;)V")
	public void method524(Matrix4x3 arg0) {
		this.field443 = arg0;
		this.field464.method5385(arg0);
		this.method1001(this.field464.field3480);
		this.field436.method5383(this.field464, this.field445);
	}

	@ObfuscatedName("ja.ca()Lkc;")
	public Matrix4x3 method525() {
		return this.field443;
	}

	@ObfuscatedName("ja.ch(Lka;)V")
	public void method784(Matrix4x4 arg0) {
		this.field445 = arg0;
		this.method977(this.field445.field3480);
		this.field436.method5383(this.field464, this.field445);
	}

	@ObfuscatedName("ja.cv()Lka;")
	public Matrix4x4 method528() {
		return this.field445;
	}

	@ObfuscatedName("ja.ce(I[Lacg;)V")
	public void method535(int arg0, Light[] arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			field461[var3++] = arg1[var4].method14888();
			field461[var3++] = arg1[var4].method14882();
			field461[var3++] = arg1[var4].method14879();
			field461[var3++] = arg1[var4].method14880();
			field462[var4] = arg1[var4].method14893();
			field461[var3++] = arg1[var4].method14881();
		}
		this.method972(arg0, field461, field462);
	}

	@ObfuscatedName("ja.ct(IIIIII)Ldj;")
	public class127 method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("ja.cu(Ldj;Ldj;FLdj;)Ldj;")
	public class127 method537(class127 arg0, class127 arg1, float arg2, class127 arg3) {
		return null;
	}

	@ObfuscatedName("ja.cc(Ldj;)V")
	public void method549(class127 arg0) {
	}

	@ObfuscatedName("ja.dj(IIII)V")
	public void method514(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("ja.dp()V")
	public void method545() {
	}

	@ObfuscatedName("ja.cg()Z")
	public boolean method539() {
		return false;
	}

	@ObfuscatedName("ja.cj()V")
	public void method558() {
	}

	@ObfuscatedName("ja.cy()Z")
	public boolean method600() {
		return false;
	}

	@ObfuscatedName("ja.dl(FFFFFF)V")
	public void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("ja.di(ILdk;)V")
	public final void method547(int arg0, WaterFogData arg1) {
		this.method989(arg0, arg1.field1475, arg1.field1471, arg1.field1474);
	}

	@ObfuscatedName("ja.dw(ILdk;)V")
	public final void method503(int arg0, WaterFogData arg1) {
		this.method990(arg0, arg1.field1475, arg1.field1471, arg1.field1474);
	}

	@ObfuscatedName("ja.av()Lyu;")
	public class674 method467() {
		return new class29(this);
	}

	@ObfuscatedName("ja.ob(II)Lde;")
	public class136 method991(int arg0, int arg1) {
		return (fa) this.method658(arg0, arg1, false, true);
	}

	@ObfuscatedName("ja.aj(IILcy;Ldz;I)Lde;")
	public class136 method468(int arg0, int arg1, class124 arg2, class139 arg3, int arg4) {
		return this.method991(arg0, arg1);
	}

	@ObfuscatedName("ja.ah(II)Ldo;")
	public class132 method637(int arg0, int arg1) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.au(III)Ldo;")
	public class132 method541(int arg0, int arg1, int arg2) {
		return new oa(arg0, arg1);
	}

	@ObfuscatedName("ja.q(Lma;II)V")
	public native void method966(BillboardTypeList arg0, int arg1, int arg2);

	@ObfuscatedName("ja.YA(IIIIII)V")
	public native void method967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.R(IIIIIILta;II)V")
	public native void method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8);

	@ObfuscatedName("ja.da()V")
	public native void method969();

	@ObfuscatedName("ja.Y(I)V")
	public native void method970(int arg0);

	@ObfuscatedName("ja.n(Lv;)V")
	public native void method971(class28 arg0);

	@ObfuscatedName("ja.Q(I[I[F)V")
	public native void method972(int arg0, int[] arg1, float[] arg2);

	@ObfuscatedName("ja.V(SSIBBIZBBBBZZZZZBZZI)V")
	public native void method974(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

	@ObfuscatedName("ja.F(S[ISIBBIZBBBBZZZZZBZZI)V")
	public native void method975(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

	@ObfuscatedName("ja.ma(Z)V")
	public native void method92(boolean arg0);

	@ObfuscatedName("ja.d(JJ)V")
	public native void method976(long arg0, long arg1);

	@ObfuscatedName("ja.za()I")
	public native int method552();

	@ObfuscatedName("ja.ba(II)V")
	public native void method505(int arg0, int arg1);

	@ObfuscatedName("ja.ae(IIII)[I")
	public native int[] method691(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.wa([F)V")
	public native void method977(float[] arg0);

	@ObfuscatedName("ja.PA(Lza;)V")
	public native void method978(za arg0);

	@ObfuscatedName("ja.k()V")
	public native void method979();

	@ObfuscatedName("ja.A(IIII)V")
	public native void method980(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.GA(FF)V")
	public native void method475(float arg0, float arg1);

	@ObfuscatedName("ja.r(IIII)V")
	public native void method659(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.B(IIIIII)V")
	public native void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ja.N(IIIIII[BII)V")
	public native void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ja.DA(ILta;II)V")
	public native void method684(int arg0, class11 arg1, int arg2, int arg3);

	@ObfuscatedName("ja.IA(F)V")
	public native void method529(float arg0);

	@ObfuscatedName("ja.m(IFFFFF)V")
	public native void method530(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ja.J(I)V")
	public native void method531(int arg0);

	@ObfuscatedName("ja.c(III)V")
	public native void method532(int arg0, int arg1, int arg2);

	@ObfuscatedName("ja.JA(IIII)V")
	public native void method989(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.M(IIII)V")
	public native void method990(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.O()V")
	public native void method548();

	@ObfuscatedName("ja.RA(Z)V")
	public native void method526(boolean arg0);

	@ObfuscatedName("ja.qa([I)V")
	public native void method453(int[] arg0);

	@ObfuscatedName("ja.XA(IIIII)V")
	public native void method493(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.AA([F)V")
	public native void method1001(float[] arg0);

	@ObfuscatedName("ja.G(IIIII)V")
	public native void method494(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ja.L()V")
	public native void method753();

	@ObfuscatedName("ja.o(IIII)V")
	public native void method478(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ja.CA(IIIII)V")
	public native void method601(int arg0, int arg1, int arg2, int arg3, int arg4);
}
