
import deob.ObfuscatedName;

@ObfuscatedName("ok")
public class class429 {

	@ObfuscatedName("ok.u")
	public int field4635;

	@ObfuscatedName("ok.j")
	public int field4632;

	@ObfuscatedName("ok.a")
	public int field4638;

	@ObfuscatedName("ok.s")
	public int field4631;

	@ObfuscatedName("ok.c")
	public int field4639;

	@ObfuscatedName("ok.m")
	public int field4636;

	@ObfuscatedName("ok.t")
	public int field4637;

	@ObfuscatedName("ok.l")
	public int field4633;

	@ObfuscatedName("ok.f")
	public int field4634;

	@ObfuscatedName("ok.d")
	public int field4640;

	public class429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.field4635 = arg0;
		this.field4632 = arg1;
		this.field4638 = arg2;
		this.field4631 = arg3 * arg3;
		this.field4639 = this.field4635 + arg4;
		this.field4636 = this.field4635 + arg5;
		this.field4637 = this.field4632 + arg6;
		this.field4633 = this.field4632 + arg7;
		this.field4634 = this.field4638 + arg8;
		this.field4640 = this.field4638 + arg9;
	}

	@ObfuscatedName("ok.u(IIIIIIIIII)V")
	public void method7641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.field4635 = arg0;
		this.field4632 = arg1;
		this.field4638 = arg2;
		this.field4631 = arg3 * arg3;
		this.field4639 = this.field4635 + arg4;
		this.field4636 = this.field4635 + arg5;
		this.field4637 = this.field4632 + arg6;
		this.field4633 = this.field4632 + arg7;
		this.field4634 = this.field4638 + arg8;
		this.field4640 = this.field4638 + arg9;
	}

	@ObfuscatedName("ok.j(III)Z")
	public boolean method7645(int arg0, int arg1, int arg2) {
		if (arg0 < this.field4639 || arg0 > this.field4636) {
			return false;
		} else if (arg1 < this.field4637 || arg1 > this.field4633) {
			return false;
		} else if (arg2 >= this.field4634 && arg2 <= this.field4640) {
			int var4 = arg0 - this.field4635;
			int var5 = arg2 - this.field4638;
			return var4 * var4 + var5 * var5 < this.field4631;
		} else {
			return false;
		}
	}
}
