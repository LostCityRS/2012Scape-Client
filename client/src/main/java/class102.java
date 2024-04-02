
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("co")
public class class102 {

	@ObfuscatedName("co.u")
	public final GlToolkit field1148;

	@ObfuscatedName("co.j")
	public class890 field1149;

	@ObfuscatedName("co.a")
	public class890 field1165;

	@ObfuscatedName("co.s")
	public class890 field1151;

	@ObfuscatedName("co.c")
	public int field1154 = 0;

	@ObfuscatedName("co.m")
	public int field1153 = 0;

	@ObfuscatedName("co.t")
	public int field1150 = 1;

	@ObfuscatedName("co.l")
	public int field1155 = 1;

	@ObfuscatedName("co.f")
	public boolean field1164;

	@ObfuscatedName("co.d")
	public IterableQueue field1157 = new IterableQueue();

	@ObfuscatedName("co.z")
	public boolean field1158 = true;

	@ObfuscatedName("co.n")
	public boolean field1159 = true;

	@ObfuscatedName("co.o")
	public boolean field1160 = true;

	@ObfuscatedName("co.q")
	public boolean field1156 = true;

	@ObfuscatedName("co.p")
	public class640[] field1162 = new class640[2];

	@ObfuscatedName("co.w")
	public class656 field1163;

	@ObfuscatedName("co.b")
	public class640 field1166;

	@ObfuscatedName("co.x")
	public class656 field1152;

	@ObfuscatedName("co.i")
	public boolean field1168 = false;

	@ObfuscatedName("co.v")
	public int field1167 = 0;

	@ObfuscatedName("co.k")
	public class139 field1161 = class139.field1501;

	public class102(GlToolkit arg0) {
		this.field1148 = arg0;
		if (this.field1148.field8176 && this.field1148.field8208) {
			this.field1151 = this.field1149 = new class890(this.field1148);
			if (this.field1148.field8080 > 1 && this.field1148.field8122 && this.field1148.field8200) {
				this.field1151 = this.field1165 = new class890(this.field1148);
			}
		}
	}

	@ObfuscatedName("co.u()V")
	public void method2297() {
		this.field1149 = null;
		this.field1165 = null;
		this.field1151 = null;
		this.field1152 = null;
		this.field1166 = null;
		this.field1162 = null;
		this.field1163 = null;
		if (!this.field1157.method11585()) {
			for (Node var1 = this.field1157.method11563(); var1 != this.field1157.field6647; var1 = var1.field4226) {
				((class776) var1).method14820();
			}
		}
		this.field1155 = 1;
		this.field1150 = 1;
	}

	@ObfuscatedName("co.j()Z")
	public boolean method2298() {
		return this.field1151 != null;
	}

	@ObfuscatedName("co.a()Z")
	public boolean method2299() {
		if (this.field1159) {
			if (this.field1152 != null) {
				this.field1152.method168();
				this.field1152 = null;
			}
			if (this.field1166 != null) {
				this.field1166.method2048();
				this.field1166 = null;
			}
		}
		if (this.field1158) {
			if (this.field1163 != null) {
				this.field1163.method168();
				this.field1163 = null;
			}
			if (this.field1162[0] != null) {
				this.field1162[0].method2048();
				this.field1162[0] = null;
			}
			if (this.field1162[1] != null) {
				this.field1162[1].method2048();
				this.field1162[1] = null;
			}
		}
		if (this.field1159) {
			if (this.field1165 != null) {
				this.field1152 = new class656(this.field1148, class124.field1300, class139.field1503, this.field1150, this.field1155, this.field1148.field8080);
			}
			if (this.field1168) {
				this.field1166 = new class640(this.field1148, 34037, class124.field1300, class139.field1503, this.field1150, this.field1155);
			} else if (this.field1152 == null) {
				this.field1152 = new class656(this.field1148, class124.field1300, class139.field1503, this.field1150, this.field1155);
			}
			this.field1159 = false;
			this.field1160 = true;
			this.field1156 = true;
		}
		if (this.field1158) {
			if (this.field1165 != null) {
				this.field1163 = new class656(this.field1148, class124.field1296, this.field1161, this.field1150, this.field1155, this.field1148.field8080);
			}
			this.field1162[0] = new class640(this.field1148, 34037, class124.field1296, this.field1161, this.field1150, this.field1155);
			this.field1162[1] = this.field1167 > 1 ? new class640(this.field1148, 34037, class124.field1296, this.field1161, this.field1150, this.field1155) : null;
			this.field1158 = false;
			this.field1160 = true;
			this.field1156 = true;
		}
		if (this.field1160) {
			if (this.field1165 == null) {
				this.field1148.method464(this.field1149);
				this.field1149.method1207(null);
				this.field1149.method1206(0, null);
				this.field1149.method1206(1, null);
				this.field1149.method1206(0, this.field1162[0].method12762(0));
				this.field1149.method1206(1, this.field1167 > 1 ? this.field1162[1].method12762(0) : null);
				if (this.field1168) {
					this.field1149.method1207(this.field1166.method12764(0));
				} else {
					this.field1149.method1207(this.field1152);
				}
				this.field1148.method696(this.field1149);
			} else {
				this.field1148.method464(this.field1149);
				this.field1149.method1207(null);
				this.field1149.method1206(0, null);
				this.field1149.method1206(1, null);
				this.field1149.method1206(0, this.field1162[0].method12762(0));
				this.field1149.method1206(1, this.field1167 > 1 ? this.field1162[1].method12762(0) : null);
				if (this.field1168) {
					this.field1149.method1207(this.field1166.method12764(0));
				}
				this.field1148.method696(this.field1149);
				this.field1148.method464(this.field1165);
				this.field1165.method1207(null);
				this.field1165.method1206(0, null);
				this.field1165.method1206(0, this.field1163);
				this.field1165.method1207(this.field1152);
				this.field1148.method696(this.field1165);
			}
			this.field1160 = false;
			this.field1156 = true;
		}
		if (this.field1156) {
			this.field1148.method464(this.field1151);
			this.field1156 = !this.field1151.method1208();
			this.field1148.method696(this.field1151);
		}
		return !this.field1156;
	}

	@ObfuscatedName("co.s(IIII)Z")
	public boolean method2308(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1151 == null || this.field1157.method11585()) {
			return false;
		}
		if (this.field1150 != arg2 || this.field1155 != arg3) {
			this.field1150 = arg2;
			this.field1155 = arg3;
			for (Node var5 = this.field1157.method11563(); var5 != this.field1157.field6647; var5 = var5.field4226) {
				((class776) var5).method14821(this.field1150, this.field1155);
			}
			this.field1158 = true;
			this.field1159 = true;
			this.field1160 = true;
		}
		if (!this.method2299()) {
			return false;
		}
		this.field1154 = arg0;
		this.field1153 = arg1;
		this.field1164 = true;
		this.field1148.method13379(-this.field1154, this.field1155 + this.field1153 - this.field1148.method457().method922());
		this.field1148.method464(this.field1151);
		this.field1148.method505(3, 0);
		this.field1151.method16000(0);
		return true;
	}

	@ObfuscatedName("co.c()V")
	public void method2300() {
		if (!this.field1164) {
			return;
		}
		if (this.field1165 != null) {
			this.field1148.method696(this.field1165);
			this.field1148.method464(this.field1149);
			this.field1149.method16000(0);
			this.field1165.method1210(0, 0, this.field1150, this.field1155, 0, 0, true, this.field1168);
		}
		this.field1148.method13309();
		this.field1148.method13327(0);
		this.field1148.method13316(1);
		this.field1148.method753();
		int var1 = 0;
		int var2 = 1;
		class776 var4;
		for (class776 var3 = (class776) this.field1157.method11563(); var3 != null; var3 = var4) {
			var4 = (class776) this.field1157.method11567();
			int var5 = var3.method14832();
			for (int var6 = 0; var6 < var5; var6++) {
				var3.method14822(var6, this.field1162[var1], this.field1166);
				if (var4 == null && var5 - 1 == var6) {
					this.field1148.method696(this.field1149);
					this.field1148.method13379(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.field1155);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.field1154, this.field1153);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.field1154, this.field1155 + this.field1153);
					OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.field1154 + this.field1150, this.field1155 + this.field1153);
					OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1155);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.field1154 + this.field1150, this.field1153);
					OpenGL.glEnd();
				} else {
					this.field1149.method16000(var2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.field1155);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.field1155);
					OpenGL.glTexCoord2f((float) this.field1150, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.field1150, this.field1155);
					OpenGL.glTexCoord2f((float) this.field1150, (float) this.field1155);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.field1150, 0);
					OpenGL.glEnd();
				}
				var3.method14823(var6);
				var2 = var2 + 1 & 0x1;
				var1 = var1 + 1 & 0x1;
			}
		}
		this.field1164 = false;
	}

	@ObfuscatedName("co.m(Lacd;)Z")
	public boolean method2301(class776 arg0) {
		if (this.field1151 != null) {
			if (arg0.method14840() || arg0.method14844()) {
				this.field1157.method11558(arg0);
				this.method2303();
				if (this.method2299()) {
					if (this.field1150 != -1 && this.field1155 != -1) {
						arg0.method14821(this.field1150, this.field1155);
					}
					arg0.field9321 = true;
					return true;
				}
			}
			this.method2302(arg0);
		}
		return false;
	}

	@ObfuscatedName("co.t(Lacd;)V")
	public void method2302(class776 arg0) {
		arg0.field9321 = false;
		arg0.method14820();
		arg0.method6979();
		this.method2303();
	}

	@ObfuscatedName("co.l()V")
	public void method2303() {
		int var1 = 0;
		boolean var2 = false;
		class139 var3 = class139.field1501;
		for (class776 var4 = (class776) this.field1157.method11563(); var4 != null; var4 = (class776) this.field1157.method11567()) {
			class139 var5 = var4.method14826();
			if (var5.field1508 > var3.field1508) {
				var3 = var5;
			}
			var2 |= var4.method14825();
			var1 += var4.method14832();
		}
		if (this.field1161 != var3) {
			this.field1161 = var3;
			this.field1158 = true;
		}
		int var6 = this.field1167 > 2 ? 2 : this.field1167;
		int var7 = var1 > 2 ? 2 : var1;
		if (var6 != var7) {
			this.field1158 = true;
			this.field1160 = true;
		}
		if (this.field1168 != var2) {
			this.field1168 = var2;
			this.field1159 = true;
		}
		this.field1167 = var1;
	}
}
