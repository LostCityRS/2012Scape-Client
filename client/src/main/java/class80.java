
import deob.ObfuscatedName;

@ObfuscatedName("bt")
public class class80 {

	@ObfuscatedName("bt.a")
	public final class682 field1031;

	@ObfuscatedName("bt.s")
	public final class100 field1032;

	@ObfuscatedName("bt.c")
	public final int field1035;

	@ObfuscatedName("bt.m")
	public final int field1040;

	@ObfuscatedName("bt.t")
	public boolean field1033 = true;

	@ObfuscatedName("bt.l")
	public int field1034 = -1;

	@ObfuscatedName("bt.f")
	public final int field1037;

	@ObfuscatedName("bt.d")
	public class108 field1038;

	@ObfuscatedName("bt.z")
	public class655 field1036;

	@ObfuscatedName("bt.n")
	public class640 field1029;

	public class80(class682 arg0, class100 arg1, class672 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field1031 = arg0;
		this.field1032 = arg1;
		this.field1035 = arg6;
		this.field1040 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		for (int var13 = 0; var13 < var9; var13++) {
			int var14 = arg2.field387 * (var12 + var13) + var11;
			for (int var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.field7687[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		this.field1037 = var10;
		if (var10 > 0) {
			class814 var17 = new class814(var10 * 2);
			if (this.field1031.field8149) {
				for (int var18 = 0; var18 < var9; var18++) {
					int var19 = arg2.field387 * (var12 + var18) + var11;
					for (int var20 = 0; var20 < var9; var20++) {
						short[] var21 = arg2.field7687[var19++];
						if (var21 != null) {
							for (int var22 = 0; var22 < var21.length; var22++) {
								var17.method15287(var21[var22] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (int var23 = 0; var23 < var9; var23++) {
					int var24 = arg2.field387 * (var12 + var23) + var11;
					for (int var25 = 0; var25 < var9; var25++) {
						short[] var26 = arg2.field7687[var24++];
						if (var26 != null) {
							for (int var27 = 0; var27 < var26.length; var27++) {
								var17.method15221(var26[var27] & 0xFFFF);
							}
						}
					}
				}
			}
			this.field1038 = this.field1031.method13345(5123, var17.field9629, var17.field9626, false);
			this.field1036 = new class655(this.field1031, 5123, null, 1);
		} else {
			this.field1029 = null;
		}
	}

	@ObfuscatedName("bt.u()V")
	public void method2030() {
		this.method2032(this.field1038, this.field1037);
	}

	@ObfuscatedName("bt.j([BI)V")
	public void method2041(byte[] arg0, int arg1) {
		this.field1036.method2338(5123, arg0, arg1 * 2);
		this.method2032(this.field1036, arg1);
	}

	@ObfuscatedName("bt.a(Lcf;I)V")
	public void method2032(class108 arg0, int arg1) {
		if (arg1 != 0) {
			this.method2033();
			this.field1031.method13315(this.field1029);
			this.field1031.method13307(arg0, 4, 0, arg1);
		}
	}

	@ObfuscatedName("bt.s()V")
	public void method2033() {
		if (!this.field1033) {
			return;
		}
		this.field1033 = false;
		byte[] var1 = this.field1032.field1142;
		byte[] var2 = this.field1031.field8230;
		int var3 = 0;
		int var4 = this.field1032.field1139;
		int var5 = this.field1032.field1139 * this.field1040 + this.field1035;
		for (int var6 = -128; var6 < 0; var6++) {
			var3 = (var3 << 8) - var3;
			for (int var7 = -128; var7 < 0; var7++) {
				if (var1[var5++] != 0) {
					var3++;
				}
			}
			var5 += var4 - 128;
		}
		if (this.field1029 != null && this.field1034 == var3) {
			this.field1033 = false;
			return;
		}
		this.field1034 = var3;
		int var8 = 0;
		int var9 = this.field1040 * var4 + this.field1035;
		for (int var10 = -128; var10 < 0; var10++) {
			for (int var11 = -128; var11 < 0; var11++) {
				if (var1[var9] == 0) {
					int var12 = 0;
					if (var1[var9 - 1] != 0) {
						var12++;
					}
					if (var1[var9 + 1] != 0) {
						var12++;
					}
					if (var1[var9 - var4] != 0) {
						var12++;
					}
					if (var1[var4 + var9] != 0) {
						var12++;
					}
					var2[var8++] = (byte) (var12 * 17);
				} else {
					var2[var8++] = 68;
				}
				var9++;
			}
			var9 += this.field1032.field1139 - 128;
		}
		if (this.field1029 == null) {
			this.field1029 = new class640(this.field1031, 3553, class124.field1297, class139.field1501, 128, 128, false, this.field1031.field8230, class124.field1297, false);
			this.field1029.method12765(false, false);
			this.field1029.method2055(true);
		} else {
			this.field1029.method12769(0, 0, 128, 128, this.field1031.field8230, class124.field1297, 0, 0, false);
		}
	}
}
