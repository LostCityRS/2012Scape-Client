package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("qp")
public class class469 {

	@ObfuscatedName("qp.u")
	public static int field4983 = 251278027;

	@ObfuscatedName("qp.j")
	public static int field4982 = -242548920;

	@ObfuscatedName("qp.o")
	public static int field4972 = 735165842;

	@ObfuscatedName("qp.q")
	public final class14 field4973;

	@ObfuscatedName("qp.p")
	public final class470[][] field4968;

	@ObfuscatedName("qp.w")
	public int field4975 = 0;

	@ObfuscatedName("qp.b")
	public int field4978 = 1653075315;

	@ObfuscatedName("qp.x")
	public long field4977 = 0L;

	@ObfuscatedName("qp.i")
	public boolean field4970 = false;

	@ObfuscatedName("qp.v")
	public final class470 field4976;

	@ObfuscatedName("qp.k")
	public final class470 field4965;

	@ObfuscatedName("qp.h")
	public final class470 field4981;

	@ObfuscatedName("qp.r")
	public final class470 field4962;

	@ObfuscatedName("qp.g")
	public final class317 field4980 = new class317(-50.0F, -60.0F, -50.0F);

	@ObfuscatedName("qp.y")
	public final class451 field4984 = new class451(8);

	@ObfuscatedName("qp.e")
	public final class451 field4985 = new class451(8);

	public class469(class14 arg0, int arg1, int arg2) {
		this.field4973 = arg0;
		this.field4968 = new class470[arg1][arg2];
		if (Statics.field9860 != null) {
			Statics.field4971 = this.method8185(Statics.field9860[0], Statics.field9860[1], Statics.field9860[2], Statics.field9860[3], Statics.field9860[4], Statics.field9860[5]);
		}
		Statics.field5193 = null;
		this.field4976 = new class470();
		this.field4965 = new class470();
		this.field4981 = new class470();
		this.field4962 = new class470();
		this.method8154();
	}

	@ObfuscatedName("qp.u(Lml;B)V")
	public void method8144(class359 arg0) {
		if (client.method11059(client.field8923 * 1964982599) || client.method12902(client.field8923 * 1964982599)) {
			this.method8152(Statics.field6769 * -1985663873 >> 12, Statics.field8424 * -1872881929 >> 12, field4972 * 1239626049);
		} else {
			int var2 = -1;
			int var3 = -1;
			if (Statics.field2119 != null) {
				var2 = Statics.field2119.field8642[0] >> 3;
				var3 = Statics.field2119.field8643[0] >> 3;
			}
			if (var2 >= 0 && var2 < arg0.method6220() >> 3 && var3 >= 0 && var3 < arg0.method6193() >> 3) {
				this.method8152(var2, var3, field4972 * 1239626049);
			} else {
				this.method8152(arg0.method6220() >> 4, arg0.method6193() >> 4, 0);
			}
		}
		this.method8160();
		this.method8194();
		this.method8156();
		this.method8173();
	}

	@ObfuscatedName("qp.j(I)Lqf;")
	public class470 method8174() {
		return this.field4965;
	}

	@ObfuscatedName("qp.a(Lqp;I)V")
	public void method8145(class469 arg0) {
		this.field4965.method8211(arg0.field4965);
		this.field4981.method8211(arg0.field4981);
		this.field4962.method8211(arg0.field4962);
		this.field4977 = arg0.field4977;
		this.field4975 = arg0.field4975;
		this.field4978 = arg0.field4978;
	}

	@ObfuscatedName("qp.s(I)V")
	public void method8178() {
		this.field4984.method7922();
		this.field4985.method7922();
	}

	@ObfuscatedName("qp.c(IIIIIII)Ldj;")
	public class127 method8185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		class127 var9 = (class127) this.field4984.method7916(var7);
		if (var9 == null) {
			class127 var10 = this.field4973.method788(arg0, arg1, arg2, arg3, arg4, arg5);
			this.field4984.method7937(var10, var7);
			return var10;
		} else {
			return var9;
		}
	}

	@ObfuscatedName("qp.m(IIIII)Lmq;")
	public class366 method8193(int arg0, int arg1, int arg2, int arg3) {
		long var5 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		class366 var7 = (class366) this.field4985.method7916(var5);
		if (var7 == null) {
			var7 = Statics.field4678.method7361(arg0, arg1, arg2, arg3, Statics.field6360);
			this.field4985.method7937(var7, var5);
		}
		return var7;
	}

	@ObfuscatedName("qp.t(IILqf;I)V")
	public void method8149(int arg0, int arg1, class470 arg2) {
		this.field4968[arg0][arg1] = arg2;
	}

	@ObfuscatedName("qp.l(I)V")
	public void method8150() {
		for (int var1 = 0; var1 < this.field4968.length; var1++) {
			for (int var2 = 0; var2 < this.field4968[var1].length; var2++) {
				this.field4968[var1][var2] = this.field4976;
			}
		}
	}

	@ObfuscatedName("qp.f(IIB)V")
	public void method8159(int arg0, int arg1) {
		class470 var3 = this.field4968[arg0][arg1];
		if (var3 != null) {
			this.field4980.method5334(var3.field4990);
		}
		this.method8194();
	}

	@ObfuscatedName("qp.d(IIIB)V")
	public void method8152(int arg0, int arg1, int arg2) {
		class470 var4 = this.field4968[arg0][arg1];
		if (var4 == null) {
			var4 = this.field4976;
		}
		if (this.field4970) {
			this.field4970 = false;
			arg2 = 0;
		}
		if (this.field4962.method8208(var4)) {
			return;
		}
		this.field4962.method8211(var4);
		this.field4977 = class153.method5554() * 29368792406694023L;
		this.field4975 = (this.field4978 = arg2 * -1653075315) * -1661049229;
		if (this.field4975 * -1830610841 == 0) {
			return;
		}
		this.field4981.method8211(this.field4965);
		if (this.field4965.field4986 == null) {
			return;
		}
		if (this.field4965.field4986.method6384()) {
			this.field4965.field4986 = this.field4981.field4986 = this.field4965.field4986.method6365();
		}
		if (this.field4965.field4986 != null && this.field4965.field4986 != this.field4962.field4986) {
			this.field4965.field4986.method6386(this.field4962.field4986);
		}
	}

	@ObfuscatedName("qp.z(I)V")
	public void method8160() {
		if (this.field4978 * 1911488581 < 0) {
			return;
		}
		long var1 = class153.method5554();
		this.field4978 = (int) ((long) this.field4978 - (var1 - this.field4977 * 6360426234378923319L) * -1653075315L);
		if (this.field4978 * 1911488581 > 0) {
			this.field4965.method8218(this.field4973, this.field4981, this.field4962, (float) (this.field4975 * -1830610841 - this.field4978 * 1911488581) / (float) (this.field4975 * -1830610841));
		} else {
			this.field4965.method8211(this.field4962);
			if (this.field4965.field4986 != null) {
				this.field4965.field4986.method6374();
			}
			this.field4978 = 1653075315;
		}
		this.field4977 = var1 * 29368792406694023L;
	}

	@ObfuscatedName("qp.n(B)V")
	public void method8154() {
		this.field4970 = true;
	}

	@ObfuscatedName("qp.o(I)V")
	public void method8194() {
		this.field4973.method529(((float) Statics.field4961.field9642.method15672() * 0.1F + 0.7F + client.field8980.method6141()) * this.field4965.field4987);
		this.field4973.method530(this.field4965.field4991 * 305355105, this.field4965.field4988, this.field4965.field4996, (float) ((int) this.field4980.field3475 << 2), (float) ((int) this.field4980.field3476 << 2), (float) ((int) this.field4980.field3477 << 2));
		this.field4973.method549(this.field4965.field4993);
	}

	@ObfuscatedName("qp.q(I)V")
	public void method8173() {
		byte var1 = 0;
		int var2 = (this.field4965.field4997 * 1804944707 + 256 << 2) + var1;
		this.field4973.method532(this.field4965.field4989 * -1895459855, Statics.field4961.field9646.method15696() == 1 ? var2 : -1, 0);
	}

	@ObfuscatedName("qp.p(I)V")
	public void method8156() {
		this.field4973.method542(this.field4965.field4994, this.field4965.field4992, this.field4965.field4995);
	}

	@ObfuscatedName("qp.w(I)V")
	public void method8158() {
		this.field4973.method529(((float) Statics.field4961.field9642.method15672() * 0.1F + 0.7F + client.field8980.method6141()) * 1.1523438F);
		this.field4973.method530(field4983 * 630054173, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.field4973.method532(field4982 * -1282087091, -1, 0);
		this.field4973.method549(Statics.field4971);
	}
}
