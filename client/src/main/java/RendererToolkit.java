
import deob.ObfuscatedName;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

@ObfuscatedName("ra")
public abstract class RendererToolkit {

	@ObfuscatedName("ra.t")
	public static boolean[] field398 = new boolean[8];

	@ObfuscatedName("ra.l")
	public final int field397;

	@ObfuscatedName("ra.f")
	public final MaterialTypeList field400;

	@ObfuscatedName("ra.v")
	public int field411 = -1;

	@ObfuscatedName("ra.k")
	public class126 field412;

	@ObfuscatedName("ra.h")
	public class675 field415;

	@ObfuscatedName("ra.r")
	public Hashtable field401 = new Hashtable();

	@ObfuscatedName("ra.g")
	public final class674[] field407 = new class674[4];

	@ObfuscatedName("sh.u(ILjava/awt/Canvas;Lma;Lls;II)Lra;")
	public static RendererToolkit method11222(int arg0, Canvas arg1, MaterialTypeList arg2, Js5 arg3, int arg4) {
		int var5 = 0;
		int var6 = 0;
		if (arg1 != null) {
			Dimension var7 = arg1.getSize();
			var5 = var7.width;
			var6 = var7.height;
		}
		return method11995(arg0, arg1, arg2, arg3, arg4, var5, var6);
	}

	@ObfuscatedName("uj.j(ILjava/awt/Canvas;Lma;Lls;IIII)Lra;")
	public static synchronized RendererToolkit method11995(int arg0, Canvas arg1, MaterialTypeList arg2, Js5 arg3, int arg4, int arg5, int arg6) {
		if (arg0 == 0) {
			return PureJavaToolkitFactory.method13911(arg1, arg2, arg5, arg6);
		} else if (arg0 == 2) {
			return SoftwareToolkitFactory.method1619(arg1, arg2, arg5, arg6);
		} else if (arg0 == 1) {
			return GlToolkitFactory.method2346(arg1, arg2, arg4);
		} else if (arg0 == 5) {
			return GlxToolkitFactory.method6008(arg1, arg2, arg3, arg4);
		} else if (arg0 == 3) {
			return DxToolkitFactory.method4912(arg1, arg2, arg3, arg4);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("eb.a(IB)Z")
	public static boolean method3321(int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@ObfuscatedName("abq.s(IB)Z")
	public static boolean method14198(int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	public RendererToolkit(MaterialTypeList arg0) {
		this.field400 = arg0;
		int var2 = -1;
		for (int var3 = 0; var3 < 8; var3++) {
			if (!field398[var3]) {
				field398[var3] = true;
				var2 = var3;
				break;
			}
		}
		if (var2 == -1) {
			throw new IllegalStateException("");
		}
		this.field397 = var2;
	}

	@ObfuscatedName("ra.l(I)V")
	public final void method466() throws class881 {
		this.method653(0, 0);
	}

	@ObfuscatedName("ra.p(I)V")
	public void method442() {
		field398[this.field397] = false;
		Enumeration var1 = this.field401.keys();
		while (var1.hasMoreElements()) {
			Canvas var2 = (Canvas) var1.nextElement();
			class675 var3 = (class675) this.field401.get(var2);
			var3.method944();
		}
		this.method443();
	}

	public void finalize() {
		this.method442();
	}

	@ObfuscatedName("ajw.as(Ljava/awt/Canvas;I)V")
	public static void method16838(Canvas arg0) {
		try {
			Class var1 = Class.forName("java.awt.Canvas");
			Method var2 = var1.getMethod("setIgnoreRepaint", Boolean.TYPE);
			var2.invoke(arg0, Boolean.TRUE);
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("ra.ai([I)V")
	public void method703(int[] arg0) {
		if (this.field415 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.field415.method921();
			arg0[1] = this.field415.method922();
		}
	}

	@ObfuscatedName("ra.ao(I)Ldl;")
	public final class126 method457() {
		return this.field412;
	}

	@ObfuscatedName("ra.al(I)Lya;")
	public final class675 method458() {
		return this.field415;
	}

	@ObfuscatedName("ra.at(Ljava/awt/Canvas;III)V")
	public final void method459(Canvas arg0, int arg1, int arg2) {
		if (!this.field401.containsKey(arg0)) {
			method16838(arg0);
			this.method460(arg0, this.method735(arg0, arg1, arg2));
		}
	}

	@ObfuscatedName("ra.ax(Ljava/awt/Canvas;Lya;B)V")
	public final void method460(Canvas arg0, class675 arg1) {
		if (arg1 == null) {
			throw new RuntimeException();
		}
		this.field401.put(arg0, arg1);
	}

	@ObfuscatedName("ra.aw(Ljava/awt/Canvas;I)V")
	public final void method461(Canvas arg0) {
		if (this.field401.containsKey(arg0)) {
			class675 var2 = (class675) this.field401.get(arg0);
			var2.method944();
			this.field401.remove(arg0);
		}
	}

	@ObfuscatedName("ra.aa(Ljava/awt/Canvas;I)V")
	public final void method462(Canvas arg0) {
		class675 var2 = (class675) this.field401.get(arg0);
		if (var2 == null) {
			throw new RuntimeException();
		} else if (this.field411 <= 0 && this.field415 == this.field412) {
			if (this.field412 != null) {
				this.field412.method925();
			}
			if (this.field411 < 0) {
				this.field412 = var2;
			}
			this.field415 = var2;
			var2.method954();
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ra.am(Ljava/awt/Canvas;III)V")
	public final void method463(Canvas arg0, int arg1, int arg2) {
		class675 var4 = (class675) this.field401.get(arg0);
		if (var4 == null) {
			throw new RuntimeException();
		}
		var4.method923(arg1, arg2);
	}

	@ObfuscatedName("ra.ad(Lyu;B)V")
	public final void method464(class674 arg0) {
		if (this.field411 >= 3) {
			throw new RuntimeException();
		}
		if (this.field411 >= 0) {
			this.field407[this.field411].method925();
		} else {
			this.field415.method925();
		}
		this.field412 = this.field407[++this.field411] = arg0;
		arg0.method954();
	}

	@ObfuscatedName("ra.az(Lyu;B)V")
	public final void method696(class674 arg0) {
		if (this.field411 < 0 || this.field407[this.field411] != arg0) {
			throw new RuntimeException();
		}
		this.field407[--this.field411 + 1] = null;
		arg0.method925();
		if (this.field411 >= 0) {
			this.field412 = this.field407[this.field411];
			this.field407[this.field411].method954();
		} else {
			this.field412 = this.field415;
			this.field415.method954();
		}
	}

	@ObfuscatedName("ra.bq(Z)V")
	public void method515(boolean arg0) {
	}

	@ObfuscatedName("ra.bz(IIIIII)V")
	public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method488(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("ra.bv(IIIIII)V")
	public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method489(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("ra.bj(IIIIB)V")
	public final void method484(int arg0, int arg1, int arg2, int arg3) {
		this.method601(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("ra.bf(IIIII)V")
	public final void method485(int arg0, int arg1, int arg2, int arg3) {
		this.method493(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("ra.bt(IIIII)V")
	public final void method486(int arg0, int arg1, int arg2, int arg3) {
		this.method494(arg0, arg1, arg2, arg3, 1);
	}

	@ObfuscatedName("ra.bg(IIIIII)V")
	public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method825(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@ObfuscatedName("ra.bm(IIZI)Lce;")
	public Sprite method777(int arg0, int arg1, boolean arg2) {
		return this.method658(arg0, arg1, arg2, false);
	}

	@ObfuscatedName("ra.bw([IIIIIB)Lce;")
	public Sprite method506(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		return this.method513(arg0, arg1, arg2, arg3, arg4, true);
	}

	@ObfuscatedName("ra.by()V")
	public void method509() {
	}

	@ObfuscatedName("ra.bu()V")
	public void method510() {
	}

	@ObfuscatedName("ra.cl()V")
	public void method511() {
	}

	@ObfuscatedName("ra.cr(I)Z")
	public boolean method495() {
		return true;
	}

	@ObfuscatedName("ra.cd(IIIIIF)Lacg;")
	public Light method534(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return new Light(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("ra.cz(FFFB)V")
	public void method542(float arg0, float arg1, float arg2) {
		this.method543(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ra.bn(IIIIIILta;II)V")
	public abstract void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8);

	@ObfuscatedName("ra.z()V")
	public abstract void method441();

	@ObfuscatedName("ra.w()V")
	public abstract void method443();

	@ObfuscatedName("ra.b(I)V")
	public abstract void method444(int arg0);

	@ObfuscatedName("ra.v()Z")
	public abstract boolean method447();

	@ObfuscatedName("ra.g()Z")
	public abstract boolean method448();

	@ObfuscatedName("ra.e()Z")
	public abstract boolean method449();

	@ObfuscatedName("ra.ay()Z")
	public abstract boolean method450();

	@ObfuscatedName("ra.af()Z")
	public abstract boolean method451();

	@ObfuscatedName("ra.ar()Z")
	public abstract boolean method452();

	@ObfuscatedName("ra.qa([I)V")
	public abstract void method453(int[] arg0);

	@ObfuscatedName("ra.ap()Z")
	public abstract boolean method454();

	@ObfuscatedName("ra.ag()Z")
	public abstract boolean method455();

	@ObfuscatedName("ra.t()Lcg;")
	public abstract ToolkitInfo method456();

	@ObfuscatedName("ra.av()Lyu;")
	public abstract class674 method467();

	@ObfuscatedName("ra.aj(IILcy;Ldz;I)Lde;")
	public abstract GraphicsDeletable method468(int arg0, int arg1, class124 arg2, DataType arg3, int arg4);

	@ObfuscatedName("ra.db(Z)V")
	public abstract void method471(boolean arg0);

	@ObfuscatedName("ra.ab(IIII)V")
	public abstract void method474(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ra.GA(FF)V")
	public abstract void method475(float arg0, float arg1);

	@ObfuscatedName("ra.o(IIII)V")
	public abstract void method478(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ra.bl(IIIIII)V")
	public abstract void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ra.B(IIIIII)V")
	public abstract void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ra.aq()V")
	public abstract void method490();

	@ObfuscatedName("ra.bk(IIFIIFIIFIIII)V")
	public abstract void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12);

	@ObfuscatedName("ra.XA(IIIII)V")
	public abstract void method493(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ra.G(IIIII)V")
	public abstract void method494(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ra.bd(IIIIIIIII)V")
	public abstract void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

	@ObfuscatedName("ra.bc(IIIIIILta;IIIII)V")
	public abstract void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("ra.br(IIIIIII)V")
	public abstract void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("ra.bp(IIIIII)I")
	public abstract int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ra.bx(Lv;)V")
	public abstract void method502(Heap arg0);

	@ObfuscatedName("ra.dw(ILdk;)V")
	public abstract void method503(int arg0, WaterFogData arg1);

	@ObfuscatedName("ra.ba(II)V")
	public abstract void method505(int arg0, int arg1);

	@ObfuscatedName("ra.bh(IIIIZ)Lce;")
	public abstract Sprite method508(int arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ra.be([IIIIIZ)Lce;")
	public abstract Sprite method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("ra.dj(IIII)V")
	public abstract void method514(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ra.cm()Lkc;")
	public abstract Matrix4x3 method516();

	@ObfuscatedName("ra.bo(Lds;Z)Lce;")
	public abstract Sprite method517(SpriteData arg0, boolean arg1);

	@ObfuscatedName("ra.cn(II)I")
	public abstract int method519(int arg0, int arg1);

	@ObfuscatedName("ra.cf(II)I")
	public abstract int method520(int arg0, int arg1);

	@ObfuscatedName("ra.cs(II[[I[[IIII)Lxa;")
	public abstract FloorModel method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("ra.ci(Lkc;)V")
	public abstract void method524(Matrix4x3 arg0);

	@ObfuscatedName("ra.ca()Lkc;")
	public abstract Matrix4x3 method525();

	@ObfuscatedName("ra.RA(Z)V")
	public abstract void method526(boolean arg0);

	@ObfuscatedName("ra.cv()Lka;")
	public abstract Matrix4x4 method528();

	@ObfuscatedName("ra.IA(F)V")
	public abstract void method529(float arg0);

	@ObfuscatedName("ra.m(IFFFFF)V")
	public abstract void method530(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ra.J(I)V")
	public abstract void method531(int arg0);

	@ObfuscatedName("ra.c(III)V")
	public abstract void method532(int arg0, int arg1, int arg2);

	@ObfuscatedName("ra.ce(I[Lacg;)V")
	public abstract void method535(int arg0, Light[] arg1);

	@ObfuscatedName("ra.cu(Ldj;Ldj;FLdj;)Ldj;")
	public abstract class127 method537(class127 arg0, class127 arg1, float arg2, class127 arg3);

	@ObfuscatedName("ra.cg()Z")
	public abstract boolean method539();

	@ObfuscatedName("ra.au(III)Ldo;")
	public abstract class132 method541(int arg0, int arg1, int arg2);

	@ObfuscatedName("ra.dl(FFFFFF)V")
	public abstract void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

	@ObfuscatedName("ra.dp()V")
	public abstract void method545();

	@ObfuscatedName("ra.di(ILdk;)V")
	public abstract void method547(int arg0, WaterFogData arg1);

	@ObfuscatedName("ra.O()V")
	public abstract void method548();

	@ObfuscatedName("ra.cc(Ldj;)V")
	public abstract void method549(class127 arg0);

	@ObfuscatedName("ra.do(FFF[F)V")
	public abstract void method550(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("ra.za()I")
	public abstract int method552();

	@ObfuscatedName("ra.cj()V")
	public abstract void method558();

	@ObfuscatedName("ra.dg(FFF[F)V")
	public abstract void method567(float arg0, float arg1, float arg2, float[] arg3);

	@ObfuscatedName("ra.cq(II[I[I)Lta;")
	public abstract class11 method571(int arg0, int arg1, int[] arg2, int[] arg3);

	@ObfuscatedName("ra.ac()V")
	public abstract void method587();

	@ObfuscatedName("ra.bi(I)Lv;")
	public abstract Heap method593(int arg0);

	@ObfuscatedName("ra.cy()Z")
	public abstract boolean method600();

	@ObfuscatedName("ra.CA(IIIII)V")
	public abstract void method601(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ra.cx(Ldw;IIII)Lqa;")
	public abstract Model method625(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ra.i()Z")
	public abstract boolean method629();

	@ObfuscatedName("ra.ah(II)Ldo;")
	public abstract class132 method637(int arg0, int arg1);

	@ObfuscatedName("ra.f(II)V")
	public abstract void method653(int arg0, int arg1) throws class881;

	@ObfuscatedName("ra.bb(IIZZ)Lce;")
	public abstract Sprite method658(int arg0, int arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("ra.r(IIII)V")
	public abstract void method659(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ra.cw(I)V")
	public abstract void method673(int arg0);

	@ObfuscatedName("ra.DA(ILta;II)V")
	public abstract void method684(int arg0, class11 arg1, int arg2, int arg3);

	@ObfuscatedName("ra.ae(IIII)[I")
	public abstract int[] method691(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("ra.co(Lvm;[Lzv;Z)Ll;")
	public abstract FontType method712(FontMetrics arg0, PalettedSpriteData[] arg1, boolean arg2);

	@ObfuscatedName("ra.cp(Ldp;)V")
	public abstract void method733(ParticleList arg0);

	@ObfuscatedName("ra.ak(Ljava/awt/Canvas;II)Lya;")
	public abstract class675 method735(Canvas arg0, int arg1, int arg2);

	@ObfuscatedName("ra.N(IIIIII[BII)V")
	public abstract void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

	@ObfuscatedName("ra.L()V")
	public abstract void method753();

	@ObfuscatedName("ra.an()Z")
	public abstract boolean method765();

	@ObfuscatedName("ra.ck()I")
	public abstract int method768();

	@ObfuscatedName("ra.cb()Lka;")
	public abstract Matrix4x4 method781();

	@ObfuscatedName("ra.ch(Lka;)V")
	public abstract void method784(Matrix4x4 arg0);

	@ObfuscatedName("ra.ct(IIIIII)Ldj;")
	public abstract class127 method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ra.bs(IIIIII)V")
	public abstract void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
