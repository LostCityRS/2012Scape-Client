
import deob.ObfuscatedName;

@ObfuscatedName("ajx")
public class class950 extends class800 {

	@ObfuscatedName("ajx.t")
	public String field10357;

	@ObfuscatedName("ajx.l")
	public int[] field10359;

	@ObfuscatedName("ajx.f")
	public char[] field10358;

	@ObfuscatedName("ajx.d")
	public int[] field10356;

	@ObfuscatedName("ajx.z")
	public char[] field10360;

	@ObfuscatedName("ajx.u(Laet;I)V")
	public void method16690(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method16691(arg0, var2);
		}
	}

	@ObfuscatedName("ajx.j(Laet;II)V")
	public void method16691(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field10357 = arg0.method15337();
		} else if (arg1 == 2) {
			int var3 = arg0.method15220();
			this.field10359 = new int[var3];
			this.field10358 = new char[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field10359[var4] = arg0.method15239();
				byte var5 = arg0.method15238();
				this.field10358[var4] = var5 == 0 ? 0 : class524.method16898(var5);
			}
		} else if (arg1 == 3) {
			int var6 = arg0.method15220();
			this.field10356 = new int[var6];
			this.field10360 = new char[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.field10356[var7] = arg0.method15239();
				byte var8 = arg0.method15238();
				this.field10360[var7] = var8 == 0 ? 0 : class524.method16898(var8);
			}
		} else if (arg1 == 4) {
		}
	}

	@ObfuscatedName("ajx.a(CB)I")
	public int method16692(char arg0) {
		if (this.field10359 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field10359.length; var2++) {
			if (this.field10358[var2] == arg0) {
				return this.field10359[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("ajx.s(CI)I")
	public int method16699(char arg0) {
		if (this.field10356 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field10356.length; var2++) {
			if (this.field10360[var2] == arg0) {
				return this.field10356[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("ajx.c(B)V")
	public void method16694() {
		if (this.field10356 != null) {
			for (int var1 = 0; var1 < this.field10356.length; var1++) {
				this.field10356[var1] |= 0x8000;
			}
		}
		if (this.field10359 != null) {
			for (int var2 = 0; var2 < this.field10359.length; var2++) {
				this.field10359[var2] |= 0x8000;
			}
		}
	}
}
