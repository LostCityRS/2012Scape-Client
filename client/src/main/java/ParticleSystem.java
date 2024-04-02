
import deob.ObfuscatedName;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("qw")
public class ParticleSystem {

	@ObfuscatedName("qw.u")
	public boolean field4945 = false;

	@ObfuscatedName("qw.j")
	public boolean field4941 = false;

	@ObfuscatedName("qw.a")
	public class991[] field4933 = new class991[8192];

	@ObfuscatedName("qw.s")
	public int field4934 = 0;

	@ObfuscatedName("qw.c")
	public long field4935;

	@ObfuscatedName("qw.m")
	public long field4936;

	@ObfuscatedName("qw.t")
	public List field4937 = new LinkedList();

	@ObfuscatedName("qw.l")
	public int field4938 = 0;

	@ObfuscatedName("qw.f")
	public List field4944 = new LinkedList();

	@ObfuscatedName("qw.d")
	public int field4932 = 0;

	@ObfuscatedName("qw.z")
	public boolean field4939 = false;

	@ObfuscatedName("qw.n")
	public boolean field4942 = false;

	@ObfuscatedName("qw.o")
	public int field4943;

	@ObfuscatedName("qw.q")
	public ParticleList field4940 = new ParticleList();

	@ObfuscatedName("qw.p")
	public static boolean[] field4931 = new boolean[32];

	@ObfuscatedName("qw.w")
	public static boolean[] field4946 = new boolean[8];

	@ObfuscatedName("qw.u(IZ)Lqw;")
	public static ParticleSystem method8123(int arg0, boolean arg1) {
		if (ParticleSystemRenderer.field4928 == ParticleSystemRenderer.field4923) {
			return new ParticleSystem(arg0, arg1);
		} else {
			ParticleSystem var2 = Statics.field4927[ParticleSystemRenderer.field4923];
			ParticleSystemRenderer.field4923 = ParticleSystemRenderer.field4923 + 1 & class130.field1351[ParticleSystemRenderer.field4929];
			var2.method8099(arg0, arg1);
			return var2;
		}
	}

	public ParticleSystem(int arg0, boolean arg1) {
		this.method8099(arg0, arg1);
	}

	@ObfuscatedName("qw.j(IZ)V")
	public void method8099(int arg0, boolean arg1) {
		Statics.field4686.add(this);
		this.field4936 = arg0;
		this.field4935 = arg0;
		this.field4939 = true;
		this.field4942 = arg1;
	}

	@ObfuscatedName("qw.a()V")
	public void method8100() {
		this.field4939 = true;
	}

	@ObfuscatedName("qw.s()V")
	public void method8101() {
		this.field4945 = true;
		Iterator var1 = this.field4944.iterator();
		while (var1.hasNext()) {
			class811 var2 = (class811) var1.next();
			if (var2.field9602.field2760 == 1) {
				var2.method6979();
			}
		}
		for (int var3 = 0; var3 < this.field4933.length; var3++) {
			if (this.field4933[var3] != null) {
				this.field4933[var3].method16977();
				this.field4933[var3] = null;
			}
		}
		this.field4934 = 0;
		this.field4937 = new LinkedList();
		this.field4938 = 0;
		this.field4944 = new LinkedList();
		this.field4932 = 0;
	}

	@ObfuscatedName("qw.c()V")
	public void method8102() {
		this.field4941 = true;
	}

	@ObfuscatedName("qw.m()V")
	public void method8103() {
		this.field4941 = false;
	}

	@ObfuscatedName("qw.t(Lra;J)Z")
	public boolean method8104(RendererToolkit arg0, long arg1) {
		if (this.field4936 == this.field4935) {
			this.method8103();
		} else {
			this.method8102();
		}
		if (arg1 - this.field4936 > 750L) {
			this.method8101();
			return false;
		}
		int var4 = (int) (arg1 - this.field4935);
		if (this.field4939) {
			Iterator var5 = this.field4937.iterator();
			while (var5.hasNext()) {
				class465 var6 = (class465) var5.next();
				for (int var7 = 0; var7 < var6.field4901.field2709; var7++) {
					var6.method8070(arg0, arg1, 1, !this.field4941);
				}
			}
			this.field4939 = false;
		}
		Iterator var8 = this.field4937.iterator();
		while (var8.hasNext()) {
			class465 var9 = (class465) var8.next();
			var9.method8070(arg0, arg1, var4, !this.field4941);
		}
		this.field4935 = arg1;
		return true;
	}

	@ObfuscatedName("qw.l(J)V")
	public void method8105(long arg0) {
		this.field4936 = arg0;
	}

	@ObfuscatedName("qw.f(Lra;J[Ldx;[Lct;Z)V")
	public void method8106(RendererToolkit arg0, long arg1, ModelParticleEmitter[] arg2, ModelParticleEffector[] arg3, boolean arg4) {
		if (!this.field4945) {
			this.method8107(arg0, arg2, arg4);
			this.method8098(arg3, arg4);
			this.field4936 = arg1;
		}
	}

	@ObfuscatedName("qw.d(Lra;[Ldx;Z)V")
	public void method8107(RendererToolkit arg0, ModelParticleEmitter[] arg1, boolean arg2) {
		for (int var4 = 0; var4 < 32; var4++) {
			field4931[var4] = false;
		}
		Iterator var5 = this.field4937.iterator();
		while (true) {
			label62: while (var5.hasNext()) {
				class465 var6 = (class465) var5.next();
				if (arg1 != null) {
					for (int var7 = 0; var7 < arg1.length; var7++) {
						if (arg1[var7] == var6.field4916 || arg1[var7].field1372 == var6.field4916) {
							field4931[var7] = true;
							var6.method8069();
							var6.field4907 = false;
							continue label62;
						}
					}
				}
				if (!arg2) {
					if (var6.field4903 == 0) {
						var5.remove();
						this.field4938--;
					} else {
						var6.field4907 = true;
					}
				}
			}
			if (arg1 != null) {
				for (int var8 = 0; var8 < arg1.length && var8 != 32 && this.field4938 != 32; var8++) {
					if (!field4931[var8]) {
						class465 var9 = new class465(arg0, arg1[var8], this, this.field4936);
						this.field4937.add(var9);
						this.field4938++;
						field4931[var8] = true;
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("qw.z([Lct;Z)V")
	public void method8098(ModelParticleEffector[] arg0, boolean arg1) {
		for (int var3 = 0; var3 < 8; var3++) {
			field4946[var3] = false;
		}
		Iterator var4 = this.field4944.iterator();
		while (true) {
			label71: while (var4.hasNext()) {
				class811 var5 = (class811) var4.next();
				if (arg0 != null) {
					for (int var6 = 0; var6 < arg0.length; var6++) {
						if (arg0[var6] == var5.field9600 || arg0[var6].field1238 == var5.field9600) {
							field4946[var6] = true;
							var5.method15214();
							continue label71;
						}
					}
				}
				if (!arg1) {
					var5.method6979();
					this.field4932--;
					if (var5.method6982()) {
						var5.method6979();
						ParticleSystemRenderer.field4920--;
					}
				}
			}
			if (arg0 != null) {
				for (int var7 = 0; var7 < arg0.length && var7 != 8 && this.field4932 != 8; var7++) {
					if (!field4946[var7]) {
						class811 var8 = null;
						if (arg0[var7].method2534().field2760 == 1 && ParticleSystemRenderer.field4920 < 32) {
							var8 = new class811(arg0[var7], this);
							ParticleSystemRenderer.field4924.method11927(var8, (long) arg0[var7].field1243);
							ParticleSystemRenderer.field4920++;
						}
						if (var8 == null) {
							var8 = new class811(arg0[var7], this);
						}
						this.field4944.add(var8);
						this.field4932++;
						field4946[var7] = true;
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("qw.n()Ldp;")
	public ParticleList method8109() {
		this.field4940.field1311.method11676();
		for (int var1 = 0; var1 < this.field4933.length; var1++) {
			if (this.field4933[var1] != null && this.field4933[var1].field10561 != null) {
				this.field4940.field1311.method11668(this.field4933[var1]);
			}
		}
		return this.field4940;
	}

	@ObfuscatedName("qw.o(IIIII)V")
	public void method8110(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field4943 = arg0;
	}

	@ObfuscatedName("qw.q(Loo;Lra;)V")
	public void method8133(Scene arg0, RendererToolkit arg1) {
		this.field4940.field1311.method11676();
		Iterator var3 = this.field4937.iterator();
		while (var3.hasNext()) {
			class465 var4 = (class465) var3.next();
			var4.method8071(arg0, arg1, this.field4935);
		}
	}

	@ObfuscatedName("qw.p()Ldp;")
	public ParticleList method8112() {
		return this.field4940;
	}
}
