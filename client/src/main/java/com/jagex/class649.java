package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xv")
public class class649 extends class85 {

	@ObfuscatedName("xv.m")
	public final boolean field7481;

	@ObfuscatedName("xv.t")
	public boolean field7486;

	@ObfuscatedName("xv.l")
	public boolean field7487;

	@ObfuscatedName("xv.f")
	public boolean field7488 = false;

	@ObfuscatedName("xv.d")
	public class640 field7489;

	@ObfuscatedName("xv.z")
	public class86 field7490;

	@ObfuscatedName("xv.n")
	public class86 field7491;

	@ObfuscatedName("xv.o")
	public class86 field7492;

	@ObfuscatedName("xv.q")
	public class86 field7493;

	@ObfuscatedName("xv.p")
	public static final float[] field7485 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	public class649(class682 arg0) {
		super(arg0);
		if (this.field1062.field8184) {
			this.field7493 = class86.method2216(this.field1062, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.field7492 = class86.method2216(this.field1062, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.field7491 = class86.method2216(this.field1062, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.field7490 = class86.method2216(this.field1062, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.field7493 != null & this.field7492 != null & this.field7491 != null & this.field7490 != null) {
				this.field7489 = new class640(arg0, 3553, class124.field1297, class139.field1501, 2, 1, false, new byte[] { 0, -1 }, class124.field1297, false);
				this.field7489.method12765(false, false);
				this.field7481 = true;
			} else {
				this.field7481 = false;
			}
		} else {
			this.field7481 = false;
		}
	}

	@ObfuscatedName("xv.u()Z")
	public boolean method2190() {
		return this.field7481;
	}

	@ObfuscatedName("xv.j(Z)V")
	public void method2189(boolean arg0) {
		this.field7487 = arg0;
		this.field1062.method13314(1);
		this.field1062.method13315(this.field7489);
		this.field1062.method13271(34165, 7681);
		this.field1062.method13318(0, 34166, 768);
		this.field1062.method13318(2, 5890, 770);
		this.field1062.method13267(0, 34168, 770);
		this.field1062.method13314(0);
		this.method12794();
	}

	@ObfuscatedName("xv.a(Z)V")
	public void method2191(boolean arg0) {
	}

	@ObfuscatedName("xv.s()V")
	public void method2192() {
		if (this.field7486) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.field7486 = false;
		}
		this.field1062.method13314(1);
		this.field1062.method13315(null);
		this.field1062.method13271(8448, 8448);
		this.field1062.method13318(0, 5890, 768);
		this.field1062.method13318(2, 34166, 770);
		this.field1062.method13267(0, 5890, 770);
		this.field1062.method13314(0);
		if (this.field7488) {
			this.field1062.method13318(0, 5890, 768);
			this.field1062.method13267(0, 5890, 770);
			this.field7488 = false;
		}
	}

	@ObfuscatedName("xv.y()V")
	public void method12794() {
		class320 var1 = this.field1062.field8116;
		if (this.field7487) {
			OpenGL.glBindProgramARB(34336, this.field1062.field8143 == Integer.MAX_VALUE ? this.field7492.field1065 : this.field7490.field1065);
		} else {
			OpenGL.glBindProgramARB(34336, this.field1062.field8143 == Integer.MAX_VALUE ? this.field7493.field1065 : this.field7491.field1065);
		}
		float var2 = (float) this.field1062.field8143;
		float var3 = var1.field3480[4] * var2 + var1.field3480[12];
		float var4 = var1.field3480[5] * var2 + var1.field3480[13];
		float var5 = var1.field3480[6] * var2 + var1.field3480[14];
		field7485[0] = -var1.field3480[4];
		field7485[1] = -var1.field3480[5];
		field7485[2] = -var1.field3480[6];
		field7485[3] = -(field7485[2] * var5 + field7485[0] * var3 + field7485[1] * var4);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, field7485[0], field7485[1], field7485[2], field7485[3]);
		OpenGL.glEnable(34336);
		this.field7486 = true;
		this.method12793();
	}

	@ObfuscatedName("xv.e()V")
	public void method12793() {
		if (!this.field7486) {
			return;
		}
		float var1 = this.field1062.field8130;
		float var2 = this.field1062.field8196;
		float var3 = var1 - (var1 - var2) * 0.125F;
		float var4 = var1 - (var1 - var2) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, var3, 256.0F / (float) this.field1062.field8177.field1471, (float) this.field1062.field8177.field1474 / 255.0F);
		this.field1062.method13314(1);
		this.field1062.method13319(this.field1062.field8177.field1475);
		this.field1062.method13314(0);
	}

	@ObfuscatedName("xv.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		if (arg0 != null) {
			if (this.field7488) {
				this.field1062.method13318(0, 5890, 768);
				this.field1062.method13267(0, 5890, 770);
				this.field7488 = false;
			}
			this.field1062.method13315(arg0);
			this.field1062.method13316(arg1);
		} else if (!this.field7488) {
			this.field1062.method13315(this.field1062.field8186);
			this.field1062.method13316(1);
			this.field1062.method13318(0, 34168, 768);
			this.field1062.method13267(0, 34168, 770);
			this.field7488 = true;
		}
	}

	@ObfuscatedName("xv.c(II)V")
	public void method2193(int arg0, int arg1) {
	}
}
