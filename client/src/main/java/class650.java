
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xs")
public class class650 extends class85 {

	@ObfuscatedName("xs.z")
	public class84 field7504;

	@ObfuscatedName("xs.n")
	public boolean field7506;

	@ObfuscatedName("xs.o")
	public boolean field7503 = false;

	@ObfuscatedName("xs.q")
	public class641[] field7507;

	public class650(class682 arg0) {
		super(arg0);
		if (arg0.field8206) {
			byte[][] var2 = new byte[6][16384];
			byte[][] var3 = new byte[6][16384];
			byte[][] var4 = new byte[6][16384];
			int var5 = 0;
			class317 var6 = new class317(0.0F, -1.0F, 0.0F);
			for (int var7 = 0; var7 < 128; var7++) {
				for (int var8 = 0; var8 < 128; var8++) {
					float var9 = (float) var8 * 2.0F / 128.0F - 1.0F;
					float var10 = (float) var7 * 2.0F / 128.0F - 1.0F;
					float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
					float var12 = var9 * var11;
					float var13 = var10 * var11;
					for (int var14 = 0; var14 < 6; var14++) {
						class317 var15;
						if (var14 == 0) {
							var15 = new class317(-var11, -var12, var13);
						} else if (var14 == 1) {
							var15 = new class317(var11, var12, var13);
						} else if (var14 == 2) {
							var15 = new class317(-var12, var13, -var11);
						} else if (var14 == 3) {
							var15 = new class317(-var12, -var13, var11);
						} else if (var14 == 4) {
							var15 = new class317(var12, var11, -var13);
						} else {
							var15 = new class317(var12, -var11, var13);
						}
						float var16 = var15.method5362(var6);
						float var17 = Math.max(0.0F, Math.min(1.0F, var16));
						int var18;
						int var19;
						int var20;
						if (var17 > 0.0F) {
							var18 = Math.min(255, (int) (Math.pow((double) var17, 128.0D) * 400.0D));
							var19 = Math.min(255, (int) (Math.pow((double) var17, 24.0D) * 400.0D));
							var20 = Math.min(255, (int) (Math.pow((double) var17, 5.0D) * 400.0D));
						} else {
							var20 = 0;
							var19 = 0;
							var18 = 0;
						}
						var3[var14][var5] = (byte) var18;
						var4[var14][var5] = (byte) var19;
						var2[var14][var5] = (byte) var20;
					}
					var5++;
				}
			}
			this.field7507 = new class641[3];
			this.field7507[0] = new class641(this.field1062, class124.field1297, class139.field1501, 128, false, var3, class124.field1297);
			this.field7507[1] = new class641(this.field1062, class124.field1297, class139.field1501, 128, false, var4, class124.field1297);
			this.field7507[2] = new class641(this.field1062, class124.field1297, class139.field1501, 128, false, var2, class124.field1297);
			this.method12797();
		}
	}

	@ObfuscatedName("xs.u()Z")
	public boolean method2190() {
		return true;
	}

	@ObfuscatedName("xs.y()V")
	public void method12797() {
		this.field7504 = new class84(this.field1062, 2);
		this.field7504.method2182(0);
		this.field1062.method13314(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.field7506) {
			this.field1062.method13271(260, 7681);
			this.field1062.method13318(0, 5890, 770);
			this.field1062.method13267(0, 34167, 770);
		} else {
			this.field1062.method13271(7681, 8448);
			this.field1062.method13318(0, 34168, 768);
			this.field1062.method13314(2);
			this.field1062.method13271(260, 7681);
			this.field1062.method13318(0, 34168, 768);
			this.field1062.method13318(1, 34168, 770);
			this.field1062.method13267(0, 34167, 770);
		}
		this.field1062.method13314(0);
		this.field7504.method2183();
		this.field7504.method2182(1);
		this.field1062.method13314(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.field7506) {
			this.field1062.method13271(8448, 8448);
			this.field1062.method13318(0, 5890, 768);
			this.field1062.method13267(0, 5890, 770);
		} else {
			this.field1062.method13271(8448, 8448);
			this.field1062.method13318(0, 5890, 768);
			this.field1062.method13314(2);
			this.field1062.method13271(8448, 8448);
			this.field1062.method13318(0, 5890, 768);
			this.field1062.method13318(1, 34168, 768);
			this.field1062.method13267(0, 5890, 770);
		}
		this.field1062.method13314(0);
		this.field7504.method2183();
	}

	@ObfuscatedName("xs.j(Z)V")
	public void method2189(boolean arg0) {
		if (this.field7504 == null || !arg0) {
			this.field1062.method13267(0, 34168, 770);
			return;
		}
		if (!this.field7506) {
			this.field1062.method13314(2);
			this.field1062.method13315(this.field1062.field8186);
			this.field1062.method13314(0);
		}
		this.field7504.method2188('\u0000');
		this.field7503 = true;
	}

	@ObfuscatedName("xs.a(Z)V")
	public void method2191(boolean arg0) {
		this.field1062.method13271(8448, 7681);
	}

	@ObfuscatedName("xs.s()V")
	public void method2192() {
		if (this.field7503) {
			if (!this.field7506) {
				this.field1062.method13314(2);
				this.field1062.method13315(null);
			}
			this.field1062.method13314(1);
			this.field1062.method13315(null);
			this.field1062.method13314(0);
			this.field7504.method2188('\u0001');
			this.field7503 = false;
		} else {
			this.field1062.method13267(0, 5890, 770);
		}
		this.field1062.method13271(8448, 8448);
	}

	@ObfuscatedName("xs.c(II)V")
	public void method2193(int arg0, int arg1) {
		if (this.field7503) {
			this.field1062.method13314(1);
			this.field1062.method13315(this.field7507[arg0 - 1]);
			this.field1062.method13314(0);
		}
	}

	@ObfuscatedName("xs.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		this.field1062.method13315(arg0);
		this.field1062.method13316(arg1);
	}
}
