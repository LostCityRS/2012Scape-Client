
import deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("aeh")
public class class821 extends class403 {

	@ObfuscatedName("aeh.b")
	public final byte[][] field9749 = new byte[10][];

	@ObfuscatedName("aeh.x")
	public final class334 field9747;

	@ObfuscatedName("aeh.i")
	public final int field9748;

	@ObfuscatedName("aeh.v")
	public int[] field9750;

	@ObfuscatedName("aeh.k")
	public int field9746;

	@ObfuscatedName("aeh.h")
	public final class814 field9751 = new class814(null);

	@ObfuscatedName("aeh.r")
	public final class814 field9752 = new class814(null);

	public class821(int arg0, class334 arg1, int arg2) {
		super(arg0);
		this.field9747 = arg1;
		this.field9748 = arg2;
	}

	@ObfuscatedName("aeh.u([BI)I")
	public int method7032(byte[] arg0) throws IOException {
		if (this.field9750 == null) {
			if (!this.field9747.method5629(this.field9748, 0)) {
				return 0;
			}
			byte[] var2 = this.field9747.method5627(this.field9748, 0);
			if (var2 == null) {
				throw new IllegalStateException("");
			}
			this.field9752.field9629 = var2;
			this.field9752.field9626 = 0;
			int var3 = var2.length >> 1;
			this.field9750 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field9750[var4] = this.field9752.method15239();
			}
		}
		if (this.field9746 >= this.field9750.length) {
			return -1;
		}
		this.method15486();
		this.field9752.field9629 = arg0;
		this.field9752.field9626 = 0;
		do {
			if (this.field9752.field9626 >= this.field9752.field9629.length) {
				this.field9752.field9629 = null;
				return arg0.length;
			}
			if (this.field9751.field9629 == null) {
				if (this.field9749[0] == null) {
					this.field9752.field9629 = null;
					return this.field9752.field9626;
				}
				this.field9751.field9629 = this.field9749[0];
			}
			int var5 = this.field9752.field9629.length - this.field9752.field9626;
			int var6 = this.field9751.field9629.length - this.field9751.field9626;
			if (var5 < var6) {
				this.field9751.method15263(this.field9752.field9629, this.field9752.field9626, var5);
				this.field9752.field9629 = null;
				return arg0.length;
			}
			this.field9752.method15276(this.field9751.field9629, this.field9751.field9626, var6);
			this.field9751.field9629 = null;
			this.field9751.field9626 = 0;
			this.field9746++;
			for (int var7 = 0; var7 < 9; var7++) {
				this.field9749[var7] = this.field9749[var7 + 1];
			}
			this.field9749[9] = null;
		} while (this.field9746 < this.field9750.length);
		this.field9752.field9629 = null;
		return this.field9752.field9626;
	}

	@ObfuscatedName("aeh.au(I)V")
	public void method15486() {
		if (this.field9750 == null) {
			return;
		}
		for (int var1 = 0; var1 < 10 && this.field9746 + var1 < this.field9750.length; var1++) {
			if (this.field9749[var1] == null && this.field9747.method5629(this.field9750[this.field9746 + var1], 0)) {
				this.field9749[var1] = this.field9747.method5627(this.field9750[this.field9746 + var1], 0);
			}
		}
	}
}
