
import deob.ObfuscatedName;

@ObfuscatedName("rh")
public class class492 {

	@ObfuscatedName("rh.j")
	public int field5147 = 4;

	@ObfuscatedName("rh.a")
	public int[] field5155 = null;

	@ObfuscatedName("rh.s")
	public int[] field5148 = null;

	@ObfuscatedName("rh.m")
	public int field5151 = 4;

	@ObfuscatedName("rh.l")
	public int field5160 = 4;

	@ObfuscatedName("rh.d")
	public int field5164 = 7;

	@ObfuscatedName("rh.z")
	public int field5156 = -1;

	@ObfuscatedName("rh.n")
	public int field5162;

	@ObfuscatedName("rh.o")
	public int field5158;

	@ObfuscatedName("rh.q")
	public boolean field5159 = true;

	@ObfuscatedName("rh.p")
	public short[][] field5146;

	@ObfuscatedName("rh.w")
	public short[][][] field5161;

	@ObfuscatedName("rh.b")
	public boolean field5149 = true;

	@ObfuscatedName("rh.x")
	public int field5163 = 2;

	@ObfuscatedName("rh.i")
	public boolean field5157 = true;

	@ObfuscatedName("rh.v")
	public int field5165 = 3;

	@ObfuscatedName("rh.k")
	public int field5166 = -1;

	@ObfuscatedName("rh.h")
	public int field5167 = -1;

	public class492(class334 arg0) {
		byte[] var2 = arg0.method5635(class491.field5141.field5145);
		this.method8613(new Packet(var2));
	}

	@ObfuscatedName("rh.u(Laet;I)V")
	public void method8613(Packet arg0) {
		boolean var2 = false;
		while (true) {
			while (true) {
				int var3 = arg0.method15220();
				if (var3 == 0) {
					if (!var2) {
						if (this.field5155 == null) {
							this.field5147 = 4;
							this.field5155 = new int[4];
							this.field5148 = new int[4];
						}
						for (int var4 = 0; var4 < this.field5155.length; var4++) {
							this.field5155[var4] = 0;
							this.field5148[var4] = var4 * 20;
						}
					}
					return;
				}
				if (var3 == 1) {
					if (this.field5155 == null) {
						this.field5147 = 4;
						this.field5155 = new int[4];
						this.field5148 = new int[4];
					}
					for (int var5 = 0; var5 < this.field5155.length; var5++) {
						this.field5155[var5] = arg0.method15240();
						this.field5148[var5] = arg0.method15240();
					}
					var2 = true;
				} else if (var3 == 2) {
					this.field5156 = arg0.method15411();
				} else if (var3 == 3) {
					this.field5147 = arg0.method15220();
					this.field5155 = new int[this.field5147];
					this.field5148 = new int[this.field5147];
				} else if (var3 == 4) {
					this.field5159 = false;
				} else if (var3 == 5) {
					this.field5162 = arg0.method15241();
				} else if (var3 == 6) {
					this.field5158 = arg0.method15241();
				} else if (var3 == 7) {
					this.field5146 = new short[10][4];
					this.field5161 = new short[10][4][];
					for (int var6 = 0; var6 < 10; var6++) {
						for (int var7 = 0; var7 < 4; var7++) {
							int var8 = arg0.method15239();
							if (var8 == 65535) {
								var8 = -1;
							}
							this.field5146[var6][var7] = (short) var8;
							int var9 = arg0.method15239();
							this.field5161[var6][var7] = new short[var9];
							for (int var10 = 0; var10 < var9; var10++) {
								int var11 = arg0.method15239();
								if (var11 == 65535) {
									var11 = -1;
								}
								this.field5161[var6][var7][var10] = (short) var11;
							}
						}
					}
				} else if (var3 == 8) {
					this.field5149 = false;
				} else if (var3 == 9) {
					this.field5163 = arg0.method15220();
				} else if (var3 == 10) {
					this.field5157 = false;
				} else if (var3 == 11) {
					this.field5165 = arg0.method15220();
				} else if (var3 == 12) {
					this.field5166 = arg0.method15239();
					this.field5167 = arg0.method15239();
				} else if (var3 == 13) {
					this.field5160 = arg0.method15220();
				} else if (var3 == 14) {
					this.field5151 = arg0.method15220();
				} else if (var3 == 15) {
					this.field5164 = arg0.method15220();
				}
			}
		}
	}
}
