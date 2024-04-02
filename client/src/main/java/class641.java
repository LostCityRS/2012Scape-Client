
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xl")
public class class641 extends GlTexture {

	@ObfuscatedName("xl.h")
	public final int field7448;

	public class641(GlToolkit arg0, class124 arg1, class139 arg2, int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.field7448 = arg3;
		this.field1054.method13315(this);
		for (int var5 = 0; var5 < 6; var5++) {
			OpenGL.glTexImage2Dub(var5 + 34069, 0, GlToolkit.method13335(this.field1050, this.field1051), arg3, arg3, 0, GlToolkit.method13334(this.field1050), 5121, null, 0);
		}
		this.method2055(true);
	}

	public class641(GlToolkit arg0, class124 arg1, class139 arg2, int arg3, boolean arg4, int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.field7448 = arg3;
		this.field1054.method13315(this);
		if (arg4) {
			for (int var7 = 0; var7 < 6; var7++) {
				method2053(var7 + 34069, GlToolkit.method13335(this.field1050, this.field1051), arg3, arg3, 32993, this.field1054.field8215, arg5[var7]);
			}
		} else {
			for (int var8 = 0; var8 < 6; var8++) {
				OpenGL.glTexImage2Di(var8 + 34069, 0, GlToolkit.method13335(this.field1050, this.field1051), arg3, arg3, 0, 32993, this.field1054.field8215, arg5[var8], 0);
			}
		}
		this.method2055(true);
	}

	public class641(GlToolkit arg0, class124 arg1, class139 arg2, int arg3, boolean arg4, byte[][] arg5, class124 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.field7448 = arg3;
		this.field1054.method13315(this);
		for (int var8 = 0; var8 < 6; var8++) {
			OpenGL.glTexImage2Dub(var8 + 34069, 0, GlToolkit.method13335(this.field1050, this.field1051), arg3, arg3, 0, GlToolkit.method13334(arg6), 5121, arg5[var8], 0);
		}
		this.method2055(true);
	}

	@ObfuscatedName("xl.ag(II)Lde;")
	public class136 method12780(int arg0, int arg1) {
		return new class97(this, arg0, arg1);
	}
}
