
import deob.ObfuscatedName;

@ObfuscatedName("aku")
public abstract class class974 extends class836 {

	@ObfuscatedName("aku.b")
	public short field10510;

	@ObfuscatedName("aku.x")
	public short field10508;

	@ObfuscatedName("aku.i")
	public short field10509;

	@ObfuscatedName("aku.v")
	public short field10511;

	@ObfuscatedName("aku.k")
	public boolean field10512;

	@ObfuscatedName("aku.h")
	public byte field10513;

	public class974(class423 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
		super(arg0);
		this.field9807 = (byte) arg1;
		this.field9809 = (byte) arg2;
		this.method8551(new class317((float) arg3, (float) arg4, (float) arg5));
		this.field10510 = (short) arg6;
		this.field10508 = (short) arg7;
		this.field10509 = (short) arg8;
		this.field10511 = (short) arg9;
		this.field10512 = arg10;
		this.field10513 = arg11;
	}

	@ObfuscatedName("aku.dz(I)V")
	public void method14006() {
	}

	@ObfuscatedName("aku.fu([Lacg;I)I")
	public int method15639(class780[] arg0) {
		int var2 = 0;
		label115: for (int var3 = this.field10510; var3 <= this.field10508; var3++) {
			label113: for (int var4 = this.field10509; var4 <= this.field10511; var4++) {
				long var5 = this.field9808.field4526[this.field9807][var3][var4];
				long var7 = 0L;
				while (true) {
					label108: while (true) {
						if (var7 > 48L) {
							continue label113;
						}
						int var9 = (int) (var5 >>> (int) var7 & 0xFFFFL);
						if (var9 <= 0) {
							continue label113;
						}
						class427 var10 = this.field9808.field4539[var9 - 1];
						for (int var11 = 0; var11 < var2; var11++) {
							if (arg0[var11] == var10.field4588) {
								var7 += 16L;
								continue label108;
							}
						}
						arg0[var2++] = var10.field4588;
						if (var2 == 4) {
							break label115;
						}
						var7 += 16L;
					}
				}
			}
		}
		for (int var12 = var2; var12 < 4; var12++) {
			arg0[var12] = null;
		}
		if (this.field10513 != 0) {
			int var13 = this.field10510 - this.field9808.field4521;
			int var14 = this.field10509 - this.field9808.field4503;
			short var15;
			int var16;
			int var17;
			short var18;
			if (this.field10513 == 1) {
				if (var14 > var13) {
					var15 = this.field10510;
					var16 = this.field10509 - 1;
					var17 = this.field10510 + 1;
					var18 = this.field10509;
				} else {
					var15 = this.field10510;
					var16 = this.field10509 + 1;
					var17 = this.field10510 - 1;
					var18 = this.field10509;
				}
			} else if (var14 > -var13) {
				var15 = this.field10510;
				var16 = this.field10509 - 1;
				var17 = this.field10510 - 1;
				var18 = this.field10509;
			} else {
				var15 = this.field10510;
				var16 = this.field10509 + 1;
				var17 = this.field10510 + 1;
				var18 = this.field10509;
			}
			label79: for (int var19 = 0; var19 < var2; var19++) {
				long var20 = this.field9808.field4526[this.field9807][var15][var16];
				while (var20 != 0L) {
					class427 var22 = this.field9808.field4539[(int) ((var20 & 0xFFFFL) - 1L)];
					var20 >>>= 0x10;
					if (arg0[var19] == var22.field4588) {
						continue label79;
					}
				}
				long var23 = this.field9808.field4526[this.field9807][var17][var18];
				while (var23 != 0L) {
					class427 var25 = this.field9808.field4539[(int) ((var23 & 0xFFFFL) - 1L)];
					var23 >>>= 0x10;
					if (arg0[var19] == var25.field4588) {
						continue label79;
					}
				}
				for (int var26 = var19; var26 < var2 - 1; var26++) {
					arg0[var26] = arg0[var26 + 1];
				}
				var2--;
			}
		}
		return var2;
	}

	@ObfuscatedName("aku.fh(Lra;I)Z")
	public boolean method15634(class14 arg0) {
		return this.field9808.field4493.method7602(this.field9809, this.field10510, this.field10508, this.field10509, this.field10511, this.method12810(arg0));
	}

	@ObfuscatedName("aku.fz(I)Z")
	public boolean method15635() {
		for (int var1 = this.field10510; var1 <= this.field10508; var1++) {
			for (int var2 = this.field10509; var2 <= this.field10511; var2++) {
				int var3 = this.field9808.field4531 + (var1 - this.field9808.field4521);
				if (var3 >= 0 && var3 < this.field9808.field4544.length) {
					int var4 = this.field9808.field4531 + (var2 - this.field9808.field4503);
					if (var4 >= 0 && var4 < this.field9808.field4544.length && this.field9808.field4544[var3][var4]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
