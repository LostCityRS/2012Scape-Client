
import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class class481 {

	@ObfuscatedName("qb.u")
	public class480 field5064;

	@ObfuscatedName("qb.j")
	public String field5058;

	@ObfuscatedName("qb.a")
	public String field5059;

	@ObfuscatedName("qb.s")
	public int[][] field5060;

	@ObfuscatedName("qb.c")
	public int[][] field5061;

	@ObfuscatedName("qb.m")
	public int field5078 = 0;

	@ObfuscatedName("qb.t")
	public int field5063 = 0;

	@ObfuscatedName("qb.l")
	public boolean field5057 = false;

	@ObfuscatedName("qb.f")
	public int field5065;

	@ObfuscatedName("qb.d")
	public int[] field5066;

	@ObfuscatedName("qb.z")
	public int[] field5076;

	@ObfuscatedName("qb.n")
	public int[][] field5068;

	@ObfuscatedName("qb.o")
	public int field5067;

	@ObfuscatedName("qb.q")
	public int[] field5062;

	@ObfuscatedName("qb.p")
	public int[] field5071;

	@ObfuscatedName("qb.w")
	public int[] field5072;

	@ObfuscatedName("qb.b")
	public String[] field5073;

	@ObfuscatedName("qb.x")
	public int[] field5074;

	@ObfuscatedName("qb.i")
	public int[] field5075;

	@ObfuscatedName("qb.v")
	public int[] field5070;

	@ObfuscatedName("qb.k")
	public String[] field5077;

	@ObfuscatedName("qb.h")
	public IterableMap field5069;

	@ObfuscatedName("qb.r")
	public int field5079 = -1;

	@ObfuscatedName("qb.u(Laet;B)V")
	public void method8412(Packet arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method8413(arg0, var2);
		}
	}

	@ObfuscatedName("qb.j(Laet;IB)V")
	public void method8413(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field5058 = arg0.method15366();
		} else if (arg1 == 2) {
			this.field5059 = arg0.method15366();
		} else if (arg1 == 3) {
			int var3 = arg0.method15220();
			this.field5060 = new int[var3][3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field5060[var4][0] = arg0.method15239();
				this.field5060[var4][1] = arg0.method15379();
				this.field5060[var4][2] = arg0.method15379();
			}
		} else if (arg1 == 4) {
			int var5 = arg0.method15220();
			this.field5061 = new int[var5][3];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field5061[var6][0] = arg0.method15239();
				this.field5061[var6][1] = arg0.method15379();
				this.field5061[var6][2] = arg0.method15379();
			}
		} else if (arg1 == 5) {
			arg0.method15239();
		} else if (arg1 == 6) {
			this.field5078 = arg0.method15220();
		} else if (arg1 == 7) {
			this.field5063 = arg0.method15220();
		} else if (arg1 == 8) {
			this.field5057 = true;
		} else if (arg1 == 9) {
			this.field5065 = arg0.method15220();
		} else if (arg1 == 10) {
			int var7 = arg0.method15220();
			this.field5066 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field5066[var8] = arg0.method15379();
			}
		} else if (arg1 == 12) {
			arg0.method15379();
		} else if (arg1 == 13) {
			int var9 = arg0.method15220();
			this.field5076 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field5076[var10] = arg0.method15239();
			}
		} else if (arg1 == 14) {
			int var11 = arg0.method15220();
			this.field5068 = new int[var11][2];
			for (int var12 = 0; var12 < var11; var12++) {
				this.field5068[var12][0] = arg0.method15220();
				this.field5068[var12][1] = arg0.method15220();
			}
		} else if (arg1 == 15) {
			this.field5067 = arg0.method15239();
		} else if (arg1 == 17) {
			this.field5079 = arg0.method15411();
		} else if (arg1 == 18) {
			int var13 = arg0.method15220();
			this.field5062 = new int[var13];
			this.field5071 = new int[var13];
			this.field5072 = new int[var13];
			this.field5073 = new String[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field5062[var14] = arg0.method15379();
				this.field5071[var14] = arg0.method15379();
				this.field5072[var14] = arg0.method15379();
				this.field5073[var14] = arg0.method15337();
			}
		} else if (arg1 == 19) {
			int var15 = arg0.method15220();
			this.field5074 = new int[var15];
			this.field5075 = new int[var15];
			this.field5070 = new int[var15];
			this.field5077 = new String[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.field5074[var16] = arg0.method15379();
				this.field5075[var16] = arg0.method15379();
				this.field5070[var16] = arg0.method15379();
				this.field5077[var16] = arg0.method15337();
			}
		} else if (arg1 == 249) {
			int var17 = arg0.method15220();
			if (this.field5069 == null) {
				int var18 = class595.method2839(var17);
				this.field5069 = new IterableMap(var18);
			}
			for (int var19 = 0; var19 < var17; var19++) {
				boolean var20 = arg0.method15220() == 1;
				int var21 = arg0.method15241();
				Node var22;
				if (var20) {
					var22 = new ObjectNode(arg0.method15337());
				} else {
					var22 = new class802(arg0.method15379());
				}
				this.field5069.method11927(var22, (long) var21);
			}
		}
	}

	@ObfuscatedName("qb.a(I)V")
	public void method8438() {
		if (this.field5059 == null) {
			this.field5059 = this.field5058;
		}
	}

	@ObfuscatedName("qb.s(III)I")
	public int method8415(int arg0, int arg1) {
		if (this.field5069 == null) {
			return arg1;
		} else {
			class802 var3 = (class802) this.field5069.method11923((long) arg0);
			return var3 == null ? arg1 : var3.field9556;
		}
	}

	@ObfuscatedName("qb.c(ILjava/lang/String;B)Ljava/lang/String;")
	public String method8440(int arg0, String arg1) {
		if (this.field5069 == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.field5069.method11923((long) arg0);
			return var3 == null ? arg1 : (String) var3.field9550;
		}
	}

	@ObfuscatedName("qb.m(Lug;I)Z")
	public boolean method8448(class567 arg0) {
		if (this.field5060 != null) {
			for (int var2 = 0; var2 < this.field5060.length; var2++) {
				if (arg0.method1664(this.field5060[var2][0]) >= this.field5060[var2][1]) {
					return true;
				}
			}
		}
		if (this.field5061 != null) {
			for (int var3 = 0; var3 < this.field5061.length; var3++) {
				if (arg0.method1646(this.field5061[var3][0]) >= this.field5061[var3][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("qb.t(Lug;I)Z")
	public boolean method8429(class567 arg0) {
		if (this.field5060 != null) {
			for (int var2 = 0; var2 < this.field5060.length; var2++) {
				if (arg0.method1664(this.field5060[var2][0]) >= this.field5060[var2][2]) {
					return true;
				}
			}
		}
		if (this.field5061 != null) {
			for (int var3 = 0; var3 < this.field5061.length; var3++) {
				if (arg0.method1646(this.field5061[var3][0]) >= this.field5061[var3][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("qb.l(Lug;[II)Z")
	public boolean method8428(class567 arg0, int[] arg1) {
		if (this.field5064.method8402(arg0) < this.field5067) {
			return false;
		}
		if (this.field5068 != null) {
			for (int var3 = 0; var3 < this.field5068.length; var3++) {
				if (arg1[this.field5068[var3][0]] < this.field5068[var3][1]) {
					return false;
				}
			}
		}
		if (this.field5076 != null) {
			for (int var4 = 0; var4 < this.field5076.length; var4++) {
				if (!this.field5064.method8401(this.field5076[var4]).method8429(arg0)) {
					return false;
				}
			}
		}
		if (this.field5062 != null) {
			for (int var5 = 0; var5 < this.field5062.length; var5++) {
				int var6 = arg0.method1664(this.field5062[var5]);
				if (var6 < this.field5071[var5] || var6 > this.field5072[var5]) {
					return false;
				}
			}
		}
		if (this.field5074 != null) {
			for (int var7 = 0; var7 < this.field5074.length; var7++) {
				int var8 = arg0.method1646(this.field5074[var7]);
				if (var8 < this.field5075[var7] || var8 > this.field5070[var7]) {
					return false;
				}
			}
		}
		return true;
	}

	@ObfuscatedName("qb.f(Lug;I)Z")
	public boolean method8420(class567 arg0) {
		return this.field5064.method8402(arg0) >= this.field5067;
	}

	@ObfuscatedName("qb.d([III)Z")
	public boolean method8421(int[] arg0, int arg1) {
		if (this.field5068 == null || arg1 < 0 || arg1 >= this.field5068.length) {
			return false;
		} else {
			return arg0[this.field5068[arg1][0]] >= this.field5068[arg1][1];
		}
	}

	@ObfuscatedName("qb.z(Lug;II)Z")
	public boolean method8423(class567 arg0, int arg1) {
		if (this.field5076 == null || arg1 < 0 || arg1 >= this.field5076.length) {
			return false;
		} else {
			return this.field5064.method8401(this.field5076[arg1]).method8429(arg0);
		}
	}

	@ObfuscatedName("qb.n(Lug;IB)Z")
	public boolean method8411(class567 arg0, int arg1) {
		if (this.field5062 == null || arg1 < 0 || arg1 >= this.field5062.length) {
			return false;
		} else {
			int var3 = arg0.method1664(this.field5062[arg1]);
			return var3 >= this.field5071[arg1] && var3 <= this.field5072[arg1];
		}
	}

	@ObfuscatedName("qb.o(Lug;IB)Z")
	public boolean method8424(class567 arg0, int arg1) {
		if (this.field5074 == null || arg1 < 0 || arg1 >= this.field5074.length) {
			return false;
		} else {
			int var3 = arg0.method1646(this.field5074[arg1]);
			return var3 >= this.field5075[arg1] && var3 <= this.field5070[arg1];
		}
	}
}
