package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aeg")
public class class815 extends class399 {

	@ObfuscatedName("aeg.l")
	public final class527 field9639;

	@ObfuscatedName("aeg.f")
	public final class538 field9638;

	@ObfuscatedName("aeg.d")
	public class856 field9637;

	@ObfuscatedName("aeg.z")
	public class856 field9665;

	@ObfuscatedName("aeg.n")
	public class855 field9673;

	@ObfuscatedName("aeg.o")
	public class839 field9642;

	@ObfuscatedName("aeg.q")
	public class852 field9643;

	@ObfuscatedName("aeg.p")
	public class859 field9644;

	@ObfuscatedName("aeg.w")
	public class840 field9645;

	@ObfuscatedName("aeg.b")
	public class842 field9646;

	@ObfuscatedName("aeg.x")
	public class858 field9647;

	@ObfuscatedName("aeg.i")
	public class845 field9671;

	@ObfuscatedName("aeg.v")
	public class857 field9649;

	@ObfuscatedName("aeg.k")
	public class838 field9650;

	@ObfuscatedName("aeg.h")
	public class848 field9651;

	@ObfuscatedName("aeg.r")
	public class847 field9641;

	@ObfuscatedName("aeg.g")
	public class844 field9648;

	@ObfuscatedName("aeg.y")
	public class846 field9660;

	@ObfuscatedName("aeg.e")
	public class846 field9655;

	@ObfuscatedName("aeg.ay")
	public class853 field9677;

	@ObfuscatedName("aeg.af")
	public class854 field9657;

	@ObfuscatedName("aeg.ar")
	public class843 field9658;

	@ObfuscatedName("aeg.an")
	public class841 field9659;

	@ObfuscatedName("aeg.ap")
	public class851 field9670;

	@ObfuscatedName("aeg.ag")
	public class851 field9661;

	@ObfuscatedName("aeg.as")
	public class849 field9666;

	@ObfuscatedName("aeg.ai")
	public class850 field9663;

	@ObfuscatedName("aeg.ao")
	public class850 field9664;

	@ObfuscatedName("aeg.al")
	public class867 field9640;

	@ObfuscatedName("aeg.at")
	public class861 field9633;

	@ObfuscatedName("aeg.ax")
	public class862 field9652;

	@ObfuscatedName("aeg.aw")
	public class860 field9668;

	@ObfuscatedName("aeg.aa")
	public class863 field9669;

	@ObfuscatedName("aeg.am")
	public class864 field9667;

	@ObfuscatedName("aeg.ad")
	public class866 field9654;

	@ObfuscatedName("aeg.az")
	public class866 field9672;

	@ObfuscatedName("aeg.ak")
	public class866 field9653;

	@ObfuscatedName("aeg.av")
	public class866 field9674;

	@ObfuscatedName("aeg.aj")
	public class866 field9675;

	@ObfuscatedName("aeg.ah")
	public class865 field9676;

	public class815(class527 arg0, int arg1) {
		this.field9639 = arg0;
		this.field9638 = new class538(GameShell.field4152, GameShell.field4144, Statics.field4150.toLowerCase().indexOf("arm") != -1);
		this.field9661 = new class851(arg1, this);
		this.method15445(true);
	}

	public class815(Packet arg0, class527 arg1, int arg2) {
		this.field9639 = arg1;
		this.field9638 = new class538(GameShell.field4152, GameShell.field4144, Statics.field4150.indexOf("arm") != -1);
		this.field9661 = new class851(arg2, this);
		this.method15443(arg0);
	}

	@ObfuscatedName("aeg.u(Laet;I)V")
	public void method15443(Packet arg0) {
		if (arg0 == null || arg0.data == null) {
			this.method15445(true);
		} else {
			int var2 = arg0.g1();
			if (var2 < 23) {
				try {
					this.method15446(arg0, var2);
				} catch (Exception var4) {
					this.method15445(true);
				}
				this.method15445(false);
			} else if (var2 > 27) {
				this.method15445(true);
			} else {
				this.field9637 = new class856(arg0.g1(), this);
				this.field9665 = new class856(this.field9637.method15829(), this);
				this.field9673 = new class855(arg0.g1(), this);
				this.field9642 = new class839(arg0.g1(), this);
				this.field9643 = new class852(arg0.g1(), this);
				if (var2 >= 27) {
					this.field9644 = new class859(arg0.g1(), this);
				}
				this.field9645 = new class840(arg0.g1(), this);
				this.field9646 = new class842(arg0.g1(), this);
				this.field9647 = new class858(arg0.g1(), this);
				this.field9671 = new class845(arg0.g1(), this);
				this.field9649 = new class857(arg0.g1(), this);
				this.field9650 = new class838(arg0.g1(), this);
				this.field9651 = new class848(arg0.g1(), this);
				if (var2 >= 24) {
					this.field9641 = new class847(arg0.g1(), this);
				}
				this.field9648 = new class844(arg0.g1(), this);
				this.field9660 = new class846(arg0.g1(), this);
				this.field9655 = new class846(this.field9660.method15735(), this);
				this.field9677 = new class853(arg0.g1(), this);
				if (var2 >= 25) {
					this.field9657 = new class854(arg0.g1(), this);
				}
				this.field9658 = new class843(arg0.g1(), this);
				if (var2 <= 25) {
					arg0.pos++;
				}
				this.field9659 = new class841(arg0.g1(), this);
				this.field9670 = new class851(arg0.g1(), this);
				this.field9661 = new class851(this.field9670.method15781(), this);
				arg0.g1();
				this.field9666 = new class849(arg0.g1(), this);
				this.field9663 = new class850(arg0.g1(), this);
				this.field9664 = new class850(this.field9663.method15766(), this);
				this.field9640 = new class867(arg0.g1(), this);
				this.field9633 = new class861(arg0.g1(), this);
				this.field9652 = new class862(arg0.g1(), this);
				this.field9668 = new class860(arg0.g1(), this);
				this.field9669 = new class863(arg0.g1(), this);
				if (var2 >= 26) {
					this.field9667 = new class864(arg0.g1(), this);
				}
				this.field9654 = new class866(arg0.g1(), this);
				this.field9672 = new class866(arg0.g1(), this);
				this.field9653 = new class866(arg0.g1(), this);
				this.field9674 = new class866(arg0.g1(), this);
				this.field9675 = new class866(arg0.g1(), this);
				this.field9676 = new class865(arg0.g1(), this);
				this.method15445(false);
			}
		}
		this.method15444();
	}

	@ObfuscatedName("aeg.j(ZB)V")
	public void method15445(boolean arg0) {
		if (arg0 || this.field9637 == null) {
			this.field9637 = new class856(this);
		}
		if (arg0 || this.field9665 == null) {
			this.field9665 = new class856(this.field9637.method15829(), this);
		}
		if (arg0 || this.field9673 == null) {
			this.field9673 = new class855(this);
		}
		if (arg0 || this.field9642 == null) {
			this.field9642 = new class839(this);
		}
		if (arg0 || this.field9643 == null) {
			this.field9643 = new class852(this);
		}
		if (arg0 || this.field9644 == null) {
			this.field9644 = new class859(this);
		}
		if (arg0 || this.field9645 == null) {
			this.field9645 = new class840(this);
		}
		if (arg0 || this.field9646 == null) {
			this.field9646 = new class842(this);
		}
		if (arg0 || this.field9647 == null) {
			this.field9647 = new class858(this);
		}
		if (arg0 || this.field9671 == null) {
			this.field9671 = new class845(this);
		}
		if (arg0 || this.field9649 == null) {
			this.field9649 = new class857(this);
		}
		if (arg0 || this.field9650 == null) {
			this.field9650 = new class838(this);
		}
		if (arg0 || this.field9651 == null) {
			this.field9651 = new class848(this);
		}
		if (arg0 || this.field9641 == null) {
			this.field9641 = new class847(this);
		}
		if (arg0 || this.field9648 == null) {
			this.field9648 = new class844(this);
		}
		if (arg0 || this.field9660 == null) {
			this.field9660 = new class846(this);
		}
		if (arg0 || this.field9655 == null) {
			this.field9655 = new class846(this.field9660.method15735(), this);
		}
		if (arg0 || this.field9677 == null) {
			this.field9677 = new class853(this);
		}
		if (arg0 || this.field9657 == null) {
			this.field9657 = new class854(this);
		}
		if (arg0 || this.field9658 == null) {
			this.field9658 = new class843(this);
		}
		if (arg0 || this.field9659 == null) {
			this.field9659 = new class841(this);
		}
		if (arg0 || this.field9670 == null) {
			this.field9670 = new class851(this);
		}
		if (arg0 || this.field9661 == null) {
			this.field9661 = new class851(this.field9670.method15781(), this);
		}
		if (arg0 || this.field9666 == null) {
			this.field9666 = new class849(this);
		}
		if (arg0 || this.field9663 == null) {
			this.field9663 = new class850(this);
		}
		if (arg0 || this.field9664 == null) {
			this.field9664 = new class850(this.field9663.method15766(), this);
		}
		if (arg0 || this.field9640 == null) {
			this.field9640 = new class867(this);
		}
		if (arg0 || this.field9633 == null) {
			this.field9633 = new class861(this);
		}
		if (arg0 || this.field9652 == null) {
			this.field9652 = new class862(this);
		}
		if (arg0 || this.field9668 == null) {
			this.field9668 = new class860(this);
		}
		if (arg0 || this.field9669 == null) {
			this.field9669 = new class863(this);
		}
		if (arg0 || this.field9667 == null) {
			this.field9667 = new class864(this);
		}
		if (arg0 || this.field9654 == null) {
			this.field9654 = new class866(this);
		}
		if (arg0 || this.field9672 == null) {
			this.field9672 = new class866(this);
		}
		if (arg0 || this.field9653 == null) {
			this.field9653 = new class866(this);
		}
		if (arg0 || this.field9674 == null) {
			this.field9674 = new class866(this);
		}
		if (arg0 || this.field9675 == null) {
			this.field9675 = new class866(this);
		}
		if (arg0 || this.field9676 == null) {
			this.field9676 = new class865(this);
		}
	}

	@ObfuscatedName("aeg.a(Laet;II)V")
	public void method15446(Packet arg0, int arg1) {
		this.field9642 = new class839(arg0.g1(), this);
		arg0.pos++;
		this.field9660 = new class846(arg0.g1() + 1, this);
		this.field9671 = new class845(arg0.g1(), this);
		arg0.pos++;
		this.field9649 = new class857(arg0.g1(), this);
		this.field9645 = new class840(arg0.g1(), this);
		arg0.g1();
		this.field9658 = new class843(arg0.g1(), this);
		int var3 = arg0.g1();
		int var4 = 0;
		if (arg1 >= 17) {
			var4 = arg0.g1();
		}
		this.field9651 = new class848(var3 > var4 ? var3 : var4, this);
		boolean var5 = true;
		boolean var6 = true;
		boolean var7;
		if (arg1 >= 2) {
			var7 = arg0.g1() == 1;
			if (arg1 >= 17) {
				var6 = arg0.g1() == 1;
			}
		} else {
			var7 = arg0.g1() == 1;
			arg0.g1();
		}
		this.field9650 = new class838(var7 | var6 ? 1 : 0, this);
		this.field9666 = new class849(arg0.g1(), this);
		this.field9646 = new class842(arg0.g1(), this);
		this.field9637 = new class856(arg0.g1(), this);
		this.field9676 = new class865(arg0.g1(), this);
		this.field9654 = new class866(arg0.g1(), this);
		if (arg1 >= 20) {
			this.field9653 = new class866(arg0.g1(), this);
		} else {
			this.field9653 = new class866(this.field9654.method15899(), this);
		}
		this.field9674 = new class866(arg0.g1(), this);
		this.field9672 = new class866(arg0.g1(), this);
		if (arg1 >= 21) {
			this.field9675 = new class866(arg0.g1(), this);
		} else {
			this.field9675 = new class866(this.field9674.method15899(), this);
		}
		if (arg1 >= 1) {
			arg0.g2();
			arg0.g2();
		}
		if (arg1 >= 3 && arg1 < 6) {
			arg0.g1();
		}
		if (arg1 >= 4) {
			this.field9648 = new class844(arg0.g1(), this);
		}
		arg0.g4s();
		if (arg1 >= 6) {
			this.field9663 = new class850(arg0.g1(), this);
		}
		if (arg1 >= 7) {
			this.field9669 = new class863(arg0.g1(), this);
		}
		if (arg1 >= 8) {
			arg0.g1();
		}
		if (arg1 >= 9) {
			this.field9643 = new class852(arg0.g1(), this);
		}
		if (arg1 >= 10) {
			this.field9673 = new class855(arg0.g1(), this);
		}
		if (arg1 >= 11) {
			this.field9640 = new class867(arg0.g1(), this);
		}
		if (arg1 >= 12) {
			this.field9649 = new class857(arg0.g1(), this);
		}
		if (arg1 >= 13) {
			this.field9647 = new class858(arg0.g1(), this);
		}
		if (arg1 >= 14) {
			this.field9670 = new class851(arg0.g1(), this);
		}
		if (arg1 >= 15) {
			this.field9652 = new class862(arg0.g1(), this);
		}
		if (arg1 >= 16) {
			this.field9659 = new class841(arg0.g1(), this);
		}
		if (arg1 >= 18) {
			this.field9633 = new class861(arg0.g1(), this);
		}
		if (arg1 >= 19) {
			this.field9677 = new class853(arg0.g1(), this);
		}
		if (arg1 >= 22) {
			this.field9668 = new class860(arg0.g1(), this);
		}
	}

	@ObfuscatedName("aeg.s(I)Laet;")
	public Packet method15447() {
		Packet var1 = new Packet(40);
		var1.p1(27);
		var1.p1(this.field9637.method15829());
		var1.p1(this.field9673.method15816());
		var1.p1(this.field9642.method15672());
		var1.p1(this.field9643.method15792());
		var1.p1(this.field9644.method15853());
		var1.p1(this.field9645.method15679());
		var1.p1(this.field9646.method15696());
		var1.p1(this.field9647.method15843());
		var1.p1(this.field9671.method15725());
		var1.p1(this.field9649.method15837());
		var1.p1(this.field9650.method15667());
		var1.p1(this.field9651.method15747());
		var1.p1(this.field9641.method15741());
		var1.p1(this.field9648.method15716());
		var1.p1(this.field9660.method15735());
		var1.p1(this.field9677.method15794());
		var1.p1(this.field9657.method15807());
		var1.p1(this.field9658.method15709());
		var1.p1(this.field9659.method15686());
		var1.p1(this.field9670.method15781());
		var1.p1(0);
		var1.p1(this.field9666.method15755());
		var1.p1(this.field9663.method15766());
		var1.p1(this.field9640.method15908());
		var1.p1(this.field9633.method15868());
		var1.p1(this.field9652.method15874());
		var1.p1(this.field9668.method15859());
		var1.p1(this.field9669.method15877());
		var1.p1(this.field9667.method15884());
		var1.p1(this.field9654.method15899());
		var1.p1(this.field9672.method15899());
		var1.p1(this.field9653.method15899());
		var1.p1(this.field9674.method15899());
		var1.p1(this.field9675.method15899());
		var1.p1(this.field9676.method15891());
		return var1;
	}

	@ObfuscatedName("aeg.c(Ltb;II)V")
	public void method15448(class537 arg0, int arg1) {
		arg0.method11388(arg1);
		this.method15444();
	}

	@ObfuscatedName("aeg.m(Lafs;ZI)V")
	public void method15449(class851 arg0, boolean arg1) {
		arg0.method15780(arg1);
		this.method15444();
	}

	@ObfuscatedName("aeg.t(I)V")
	public void method15444() {
		this.field9637.method15826();
		this.field9665.method15826();
		this.field9673.method15818();
		this.field9642.method15673();
		this.field9643.method15789();
		this.field9644.method15851();
		this.field9645.method15677();
		this.field9646.method15695();
		this.field9647.method15841();
		this.field9671.method15723();
		this.field9649.method15835();
		this.field9650.method15665();
		this.field9651.method15748();
		this.field9641.method15746();
		this.field9648.method15715();
		this.field9660.method15734();
		this.field9655.method15734();
		this.field9677.method15796();
		this.field9657.method15804();
		this.field9658.method15706();
		this.field9659.method15685();
		this.field9670.method15773();
		this.field9661.method15773();
		this.field9666.method15754();
		this.field9663.method15764();
		this.field9664.method15764();
		this.field9640.method15906();
		this.field9633.method15867();
		this.field9652.method15873();
		this.field9668.method15860();
		this.field9669.method15878();
		this.field9667.method15883();
		this.field9654.method15897();
		this.field9672.method15897();
		this.field9653.method15897();
		this.field9674.method15897();
		this.field9675.method15897();
		this.field9676.method15888();
	}

	@ObfuscatedName("aeg.l(I)Lsv;")
	public class527 method15452() {
		return this.field9639;
	}

	@ObfuscatedName("aeg.f(B)Ltr;")
	public class538 method15462() {
		return this.field9638;
	}
}
