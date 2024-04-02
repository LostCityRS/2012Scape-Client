
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xu")
public class class645 extends class85 {

	@ObfuscatedName("xu.s")
	public class84 field7466;

	@ObfuscatedName("xu.c")
	public class89 field7467;

	@ObfuscatedName("xu.m")
	public static final float[] field7468 = new float[4];

	public class645(class682 arg0, class89 arg1) {
		super(arg0);
		this.field7467 = arg1;
		this.field7466 = new class84(arg0, 2);
		this.field7466.method2182(0);
		this.field1062.method13314(1);
		if (this.field7467.field1084) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.field1062.method13314(0);
		this.field7466.method2183();
		this.field7466.method2182(1);
		this.field1062.method13314(1);
		if (this.field7467.field1084) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.field1062.method13314(0);
		this.field7466.method2183();
	}

	@ObfuscatedName("xu.u()Z")
	public boolean method2190() {
		return true;
	}

	@ObfuscatedName("xu.j(Z)V")
	public void method2189(boolean arg0) {
		this.field7466.method2188('\u0000');
		if (this.field7467.field1084) {
			this.field1062.method13314(1);
			this.field1062.method13315(this.field7467.field1081);
			this.field1062.method13314(0);
		}
	}

	@ObfuscatedName("xu.a(Z)V")
	public void method2191(boolean arg0) {
	}

	@ObfuscatedName("xu.s()V")
	public void method2192() {
		this.field7466.method2188('\u0001');
		this.field1062.method13314(1);
		this.field1062.method13315(null);
		this.field1062.method13314(0);
	}

	@ObfuscatedName("xu.c(II)V")
	public void method2193(int arg0, int arg1) {
		float var3 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.field1062.method13314(1);
		if (var6) {
			field7468[0] = var5;
			field7468[1] = 0.0F;
			field7468[2] = 0.0F;
			field7468[3] = 0.0F;
		} else {
			field7468[0] = 0.0F;
			field7468[1] = 0.0F;
			field7468[2] = var5;
			field7468[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, field7468, 0);
		field7468[0] = 0.0F;
		field7468[1] = var5;
		field7468[2] = 0.0F;
		field7468[3] = (float) this.field1062.field8109 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, field7468, 0);
		if (this.field7467.field1084) {
			field7468[0] = 0.0F;
			field7468[1] = 0.0F;
			field7468[2] = 0.0F;
			field7468[3] = (float) this.field1062.field8109 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, field7468, 0);
		} else {
			int var7 = (int) ((float) this.field1062.field8109 * var4 * 16.0F);
			this.field1062.method13315(this.field7467.field1083[var7 % 16]);
		}
		this.field1062.method13314(0);
	}

	@ObfuscatedName("xu.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		this.field1062.method13315(arg0);
		this.field1062.method13316(arg1);
	}
}
