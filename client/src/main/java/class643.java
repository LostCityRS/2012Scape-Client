
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xf")
public class class643 extends class85 {

	@ObfuscatedName("xf.c")
	public class84 field7453;

	@ObfuscatedName("xf.m")
	public int field7459;

	@ObfuscatedName("xf.t")
	public float[] field7455;

	@ObfuscatedName("xf.l")
	public float field7454;

	@ObfuscatedName("xf.f")
	public class86 field7457;

	@ObfuscatedName("xf.d")
	public final class89 field7458;

	@ObfuscatedName("xf.z")
	public static final float[] field7450 = new float[4];

	public class643(class682 arg0, class89 arg1) {
		super(arg0);
		this.field7458 = arg1;
		if (this.field1062.field8184 && this.field1062.field8195 >= 2) {
			this.field7457 = class86.method2216(this.field1062, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.field7457 == null) {
				return;
			}
			int[][] var3 = class969.method15136(64, 256, 0, 4, 4, 3, 0.4F, false);
			int[][] var4 = class969.method15136(64, 256, 8, 4, 4, 3, 0.4F, false);
			int var5 = 0;
			this.field7455 = new float[32768];
			for (int var6 = 0; var6 < 256; var6++) {
				int[] var7 = var3[var6];
				int[] var8 = var4[var6];
				for (int var9 = 0; var9 < 64; var9++) {
					this.field7455[var5++] = (float) var7[var9] / 4096.0F;
					this.field7455[var5++] = (float) var8[var9] / 4096.0F;
				}
			}
			this.method12787();
		}
	}

	@ObfuscatedName("xf.u()Z")
	public boolean method2190() {
		return true;
	}

	@ObfuscatedName("xf.y()V")
	public void method12787() {
		this.field7453 = new class84(this.field1062, 2);
		this.field7453.method2182(0);
		this.field1062.method13314(1);
		this.field1062.method13319(-16777216);
		this.field1062.method13271(260, 7681);
		this.field1062.method13267(0, 34166, 770);
		this.field1062.method13314(0);
		OpenGL.glBindProgramARB(34336, this.field7457.field1065);
		OpenGL.glEnable(34336);
		this.field7453.method2183();
		this.field7453.method2182(1);
		this.field1062.method13314(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.field1062.method13316(0);
		this.field1062.method13267(0, 5890, 770);
		this.field1062.method13314(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.field7453.method2183();
	}

	@ObfuscatedName("xf.j(Z)V")
	public void method2189(boolean arg0) {
		if (this.field7453 == null) {
			return;
		}
		this.field7453.method2188('\u0000');
		this.field1062.method13314(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.field1062.field8117.field3480, 0);
		OpenGL.glMatrixMode(5888);
		this.field1062.method13314(0);
		if (this.field1062.field8109 == this.field7459) {
			return;
		}
		int var2 = this.field1062.field8109 % 5000 * 128 / 5000;
		for (int var3 = 0; var3 < 64; var3++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.field7455, var2);
			var2 += 2;
		}
		if (this.field7458.field1084) {
			this.field7454 = (float) (this.field1062.field8109 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.field7459 = this.field1062.field8109;
	}

	@ObfuscatedName("xf.a(Z)V")
	public void method2191(boolean arg0) {
	}

	@ObfuscatedName("xf.s()V")
	public void method2192() {
		if (this.field7453 != null) {
			this.field7453.method2188('\u0001');
			this.field1062.method13314(1);
			this.field1062.method13315(null);
			this.field1062.method13314(0);
		}
	}

	@ObfuscatedName("xf.c(II)V")
	public void method2193(int arg0, int arg1) {
		if (this.field7453 == null) {
			return;
		}
		this.field1062.method13314(1);
		if ((arg0 & 0x80) != 0) {
			this.field1062.method13315(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.field7458.field1084) {
				this.field1062.method13315(this.field7458.field1078);
			} else {
				this.field1062.method13315(this.field7458.field1082[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.field7458.field1084) {
			this.field1062.method13315(this.field7458.field1078);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field7454, 0.0F, 0.0F, 1.0F);
		} else {
			int var3 = this.field1062.field8109 % 4000 * 16 / 4000;
			this.field1062.method13315(this.field7458.field1082[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.field1062.method13314(0);
		if ((arg0 & 0x40) == 0) {
			field7450[0] = this.field1062.field8158 * this.field1062.field8136;
			field7450[1] = this.field1062.field8158 * this.field1062.field8156;
			field7450[2] = this.field1062.field8179 * this.field1062.field8158;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, field7450, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		int var4 = arg0 & 0x3;
		if (var4 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var4 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@ObfuscatedName("xf.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		this.field1062.method13315(arg0);
		this.field1062.method13316(arg1);
	}
}
