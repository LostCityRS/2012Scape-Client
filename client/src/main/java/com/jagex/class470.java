package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("qf")
public class class470 {

	@ObfuscatedName("qf.u")
	public int field4991;

	@ObfuscatedName("qf.j")
	public float field4987;

	@ObfuscatedName("qf.a")
	public float field4988;

	@ObfuscatedName("qf.s")
	public float field4996;

	@ObfuscatedName("qf.c")
	public class317 field4990;

	@ObfuscatedName("qf.m")
	public int field4989;

	@ObfuscatedName("qf.t")
	public int field4997;

	@ObfuscatedName("qf.l")
	public class127 field4993;

	@ObfuscatedName("qf.f")
	public float field4992;

	@ObfuscatedName("qf.d")
	public float field4995;

	@ObfuscatedName("qf.z")
	public float field4994;

	@ObfuscatedName("qf.n")
	public class366 field4986;

	public class470() {
		this.method8202();
	}

	public class470(class814 arg0, class469 arg1) {
		this.method8205(arg0, arg1);
	}

	@ObfuscatedName("qf.u(I)V")
	public void method8202() {
		this.field4991 = class469.field4983 * 418787645;
		this.field4990 = class317.method5294(-50.0F, -60.0F, -50.0F);
		this.field4987 = 1.1523438F;
		this.field4988 = 0.69921875F;
		this.field4996 = 1.2F;
		this.field4989 = class469.field4982 * 649491741;
		this.field4997 = 0;
		this.field4993 = Statics.field4971;
		this.field4992 = 1.0F;
		this.field4995 = 0.25F;
		this.field4994 = 1.0F;
		this.field4986 = Statics.field5193;
	}

	@ObfuscatedName("qf.j(Lqf;B)V")
	public void method8211(class470 arg0) {
		this.field4991 = arg0.field4991;
		this.field4987 = arg0.field4987;
		this.field4988 = arg0.field4988;
		this.field4996 = arg0.field4996;
		this.field4990.method5334(arg0.field4990);
		this.field4989 = arg0.field4989;
		this.field4997 = arg0.field4997;
		this.field4993 = arg0.field4993;
		this.field4992 = arg0.field4992;
		this.field4995 = arg0.field4995;
		this.field4994 = arg0.field4994;
		this.field4986 = arg0.field4986;
	}

	@ObfuscatedName("qf.a(Lra;Lqf;Lqf;FB)V")
	public void method8218(class14 arg0, class470 arg1, class470 arg2, float arg3) {
		this.field4991 = class482.method15824(arg1.field4991 * 305355105, arg2.field4991 * 305355105, arg3 * 255.0F) * 1419184801;
		this.field4988 = (arg2.field4988 - arg1.field4988) * arg3 + arg1.field4988;
		this.field4996 = (arg2.field4996 - arg1.field4996) * arg3 + arg1.field4996;
		this.field4987 = (arg2.field4987 - arg1.field4987) * arg3 + arg1.field4987;
		this.field4994 = (arg2.field4994 - arg1.field4994) * arg3 + arg1.field4994;
		this.field4992 = (arg2.field4992 - arg1.field4992) * arg3 + arg1.field4992;
		this.field4995 = (arg2.field4995 - arg1.field4995) * arg3 + arg1.field4995;
		this.field4989 = class482.method15824(arg1.field4989 * -1895459855, arg2.field4989 * -1895459855, arg3 * 255.0F) * -1876099823;
		this.field4997 = (int) ((float) (arg2.field4997 * 1804944707 - arg1.field4997 * 1804944707) * arg3 + (float) (arg1.field4997 * 1804944707)) * 1859940203;
		if (arg1.field4993 != arg2.field4993) {
			this.field4993 = arg0.method537(arg1.field4993, arg2.field4993, arg3, this.field4993);
		}
		if (arg1.field4986 == arg2.field4986) {
			return;
		}
		if (arg1.field4986 == null) {
			this.field4986 = arg2.field4986;
			if (this.field4986 != null) {
				this.field4986.method6378((int) (arg3 * 255.0F), 0);
			}
		} else {
			this.field4986 = arg1.field4986;
			if (this.field4986 != null) {
				this.field4986.method6378((int) (arg3 * 255.0F), 255);
			}
		}
	}

	@ObfuscatedName("qf.s(Laet;Lqp;I)V")
	public void method8205(class814 arg0, class469 arg1) {
		int var3 = arg0.method15220();
		if (Statics.field4961.field9650.method15667() == 1 && Statics.field5187.method768() > 0) {
			if ((var3 & 0x1) == 0) {
				this.field4991 = class469.field4983 * 418787645;
			} else {
				this.field4991 = arg0.method15379() * 1419184801;
			}
			if ((var3 & 0x2) == 0) {
				this.field4987 = 1.1523438F;
			} else {
				this.field4987 = (float) arg0.method15239() / 256.0F;
			}
			if ((var3 & 0x4) == 0) {
				this.field4988 = 0.69921875F;
			} else {
				this.field4988 = (float) arg0.method15239() / 256.0F;
			}
			if ((var3 & 0x8) == 0) {
				this.field4996 = 1.2F;
			} else {
				this.field4996 = (float) arg0.method15239() / 256.0F;
			}
		} else {
			if ((var3 & 0x1) != 0) {
				arg0.method15379();
			}
			if ((var3 & 0x2) != 0) {
				arg0.method15239();
			}
			if ((var3 & 0x4) != 0) {
				arg0.method15239();
			}
			if ((var3 & 0x8) != 0) {
				arg0.method15239();
			}
			this.field4991 = class469.field4983 * 418787645;
			this.field4996 = 1.2F;
			this.field4988 = 0.69921875F;
			this.field4987 = 1.1523438F;
		}
		if ((var3 & 0x10) == 0) {
			this.field4990 = class317.method5294(-50.0F, -60.0F, -50.0F);
		} else {
			this.field4990 = class317.method5294((float) arg0.method15240(), (float) arg0.method15240(), (float) arg0.method15240());
		}
		if ((var3 & 0x20) == 0) {
			this.field4989 = class469.field4982 * 649491741;
		} else {
			this.field4989 = arg0.method15379() * -1876099823;
		}
		if ((var3 & 0x40) == 0) {
			this.field4997 = 0;
		} else {
			this.field4997 = arg0.method15239() * 1859940203;
		}
		if ((var3 & 0x80) == 0) {
			this.field4993 = Statics.field4971;
			return;
		}
		int var4 = arg0.method15239();
		int var5 = arg0.method15239();
		int var6 = arg0.method15239();
		int var7 = arg0.method15239();
		int var8 = arg0.method15239();
		int var9 = arg0.method15239();
		this.field4993 = arg1.method8185(var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("qf.c(Laet;S)V")
	public void method8206(class814 arg0) {
		this.field4992 = (float) (arg0.method15220() * 8) / 255.0F;
		this.field4995 = (float) (arg0.method15220() * 8) / 255.0F;
		this.field4994 = (float) (arg0.method15220() * 8) / 255.0F;
	}

	@ObfuscatedName("qf.m(Laet;Lqp;I)V")
	public void method8207(class814 arg0, class469 arg1) {
		int var3 = arg0.method15239();
		int var4 = arg0.method15240();
		int var5 = arg0.method15240();
		int var6 = arg0.method15240();
		int var7 = arg0.method15239();
		Statics.field3358 = var7 * -1978862663;
		this.field4986 = arg1.method8193(var3, var4, var5, var6);
	}

	@ObfuscatedName("qf.t(Lqf;I)Z")
	public boolean method8208(class470 arg0) {
		return this.field4991 * 305355105 == arg0.field4991 * 305355105 && this.field4987 == arg0.field4987 && this.field4988 == arg0.field4988 && this.field4996 == arg0.field4996 && this.field4995 == arg0.field4995 && this.field4992 == arg0.field4992 && this.field4994 == arg0.field4994 && this.field4989 * -1895459855 == arg0.field4989 * -1895459855 && this.field4997 * 1804944707 == arg0.field4997 * 1804944707 && this.field4993 == arg0.field4993 && this.field4986 == arg0.field4986;
	}

	@ObfuscatedName("qf.l(B)I")
	public int method8226() {
		return this.field4989 * -1895459855;
	}

	@ObfuscatedName("qf.f(I)Lmq;")
	public class366 method8210() {
		return this.field4986;
	}
}
