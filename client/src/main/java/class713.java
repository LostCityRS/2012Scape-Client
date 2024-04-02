
import deob.ObfuscatedName;

@ObfuscatedName("aah")
public class class713 extends class150 {

	@ObfuscatedName("aah.s")
	public final int field8547;

	@ObfuscatedName("aah.c")
	public final int field8539;

	@ObfuscatedName("aah.m")
	public final int field8543;

	@ObfuscatedName("aah.t")
	public final int field8551;

	@ObfuscatedName("aah.l")
	public final int field8544;

	@ObfuscatedName("aah.f")
	public final int field8541;

	@ObfuscatedName("aah.d")
	public final int field8546;

	@ObfuscatedName("aah.z")
	public final int field8548;

	@ObfuscatedName("aah.n")
	public final int field8549;

	@ObfuscatedName("aah.o")
	public final int field8550;

	@ObfuscatedName("aah.q")
	public final int field8542;

	@ObfuscatedName("aah.p")
	public final int field8552;

	@ObfuscatedName("aah.w")
	public final int field8553;

	public class713(class814 arg0, int arg1, int arg2) {
		super(arg0);
		if (arg1 == 0) {
			int var4 = arg0.method15379();
			this.field8543 = var4 >>> 16;
			this.field8551 = var4 & 0xFFFF;
			this.field8539 = -1;
		} else {
			this.field8543 = -1;
			this.field8551 = -1;
			this.field8539 = arg0.method15239();
		}
		if (arg2 == 0) {
			int var5 = arg0.method15379();
			this.field8546 = (var5 >>> 16) * 512;
			this.field8548 = (var5 & 0xFFFF) * 262144;
			this.field8541 = -1;
		} else {
			this.field8546 = -512;
			this.field8548 = -262144;
			this.field8541 = arg0.method15239();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.field8547 = arg0.method15220();
		} else {
			this.field8547 = -1;
		}
		this.field8550 = arg0.method15239();
		this.field8544 = arg0.method15220();
		this.field8549 = arg0.method15220();
		this.field8542 = arg0.method15241();
		this.field8552 = arg0.method15239();
		this.field8553 = arg0.method15220();
	}

	@ObfuscatedName("aah.j(I)V")
	public void method2873() {
		int var1;
		int var2;
		int var3;
		if (this.field8543 >= 0) {
			var1 = this.field8543 * 512 + 256;
			var2 = this.field8551 * 512 + 256;
			var3 = this.field8547;
		} else {
			class719 var4 = Statics.field1537[this.field8539].method2854();
			class317 var5 = var4.method8565().field3464;
			var1 = (int) var5.field3475;
			var2 = (int) var5.field3477;
			var3 = var4.field9807;
		}
		int var6;
		int var7;
		if (this.field8551 >= 0) {
			var6 = this.field8546 * 262144 + 256;
			var7 = this.field8548 * 512 + 256;
		} else {
			class719 var8 = Statics.field1537[this.field8541].method2854();
			class317 var9 = var8.method8565().field3464;
			var6 = (int) var9.field3475;
			var7 = (int) var9.field3477;
			if (var3 < 0) {
				var3 = var8.field9807;
			}
		}
		int var10 = this.field8553 << 2;
		class1009 var11 = new class1009(client.field8980.method6098(), this.field8550, var3, var3, var1, var2, this.field8544 << 2, client.field9213, client.field9213 + this.field8542, this.field8552, var10, this.field8539 + 1, this.field8541 + 1, this.field8549 << 2, false, 0, 0);
		var11.method17162(var6, var7, this.field8549 << 2, client.field9213 + this.field8542);
		client.field9007.method11558(new class945(var11));
	}

	@ObfuscatedName("aah.s(B)Z")
	public boolean method2883() {
		class507 var1 = Statics.field4213.method11082(this.field8550);
		boolean var2 = var1.method11104();
		class509 var3 = Statics.field566.method11144(var1.field5252);
		return var2 & var3.method11129();
	}
}
