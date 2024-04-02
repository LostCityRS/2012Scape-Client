
import deob.ObfuscatedName;

@ObfuscatedName("bc")
public class GlEffectList {

	@ObfuscatedName("bc.u")
	public GlEffect[] field1072;

	@ObfuscatedName("bc.j")
	public int field1070 = 0;

	@ObfuscatedName("bc.a")
	public int field1069 = 0;

	@ObfuscatedName("bc.s")
	public int field1068 = 0;

	@ObfuscatedName("bc.c")
	public final GlToolkit field1071;

	@ObfuscatedName("bc.m")
	public final GlEffectRelated1 field1067;

	@ObfuscatedName("bc.t")
	public final GlEffectRelated2 field1073;

	public GlEffectList(GlToolkit arg0) {
		this.field1071 = arg0;
		this.field1067 = new GlEffectRelated1(arg0);
		this.field1072 = new GlEffect[16];
		this.field1072[1] = new GlEnvironmentMapEffect(arg0);
		this.field1072[2] = new GlWaterEffect(arg0, this.field1067);
		this.field1072[4] = new GlUnderwaterEffect(arg0, this.field1067);
		this.field1072[5] = new GlLakeWaterEffect(arg0, this.field1067);
		this.field1072[6] = new GlLightAbsorbEffect(arg0);
		this.field1072[7] = new GlReflectionEffect(arg0);
		this.field1072[3] = this.field1073 = new GlEffectRelated2(arg0);
		this.field1072[8] = new GlHdWaterEffect(arg0, this.field1067);
		this.field1072[9] = new GlHdWaterWaveEffect(arg0, this.field1067);
		if (!this.field1072[8].method2190()) {
			this.field1072[8] = this.field1072[4];
		}
		if (!this.field1072[9].method2190()) {
			this.field1072[9] = this.field1072[8];
		}
	}

	@ObfuscatedName("bc.u(I)Z")
	public boolean method2220(int arg0) {
		return this.field1072[arg0].method2190();
	}

	@ObfuscatedName("bc.j(IIIZZ)V")
	public void method2225(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		boolean var6 = arg4 & this.field1071.method13269();
		if (!var6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.field1068 != arg0) {
			if (this.field1068 != 0) {
				this.field1072[this.field1068 & Integer.MAX_VALUE].method2192();
			}
			if (arg0 != 0) {
				this.field1072[arg0 & Integer.MAX_VALUE].method2189(arg3);
				this.field1072[arg0 & Integer.MAX_VALUE].method2191(arg3);
				this.field1072[arg0 & Integer.MAX_VALUE].method2193(arg1, arg2);
			}
			this.field1068 = arg0;
			this.field1070 = arg1;
			this.field1069 = arg2;
		} else if (this.field1068 != 0) {
			this.field1072[this.field1068 & Integer.MAX_VALUE].method2191(arg3);
			if (this.field1070 != arg1 || this.field1069 != arg2) {
				this.field1072[this.field1068 & Integer.MAX_VALUE].method2193(arg1, arg2);
				this.field1070 = arg1;
				this.field1069 = arg2;
			}
		}
	}

	@ObfuscatedName("bc.a(Lbg;I)Z")
	public boolean method2222(GlTexture arg0, int arg1) {
		if (this.field1068 == 0) {
			return false;
		} else {
			this.field1072[this.field1068 & Integer.MAX_VALUE].method2208(arg0, arg1);
			return true;
		}
	}
}
