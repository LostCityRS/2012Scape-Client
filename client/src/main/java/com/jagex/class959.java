package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

@ObfuscatedName("ajr")
public class class959 extends class803 {

	@ObfuscatedName("ajr.l")
	public int field10422;

	@ObfuscatedName("ajr.f")
	public int field10425;

	@ObfuscatedName("ajr.d")
	public String field10427;

	@ObfuscatedName("ajr.z")
	public String field10426;

	@ObfuscatedName("ajr.n")
	public float field10428;

	@ObfuscatedName("ajr.o")
	public float field10429;

	@ObfuscatedName("ajr.q")
	public String field10430;

	public class959(OggStreamState arg0) {
		super(arg0);
	}

	@ObfuscatedName("ajr.j(Ljagtheora/ogg/OggPacket;I)V")
	public void method15150(OggPacket arg0) {
		if (this.field9558 * -352769937 > 0 && !"SUB".equals(this.field10426)) {
			return;
		}
		class814 var2 = new class814(arg0.getData());
		int var3 = var2.method15220();
		if (this.field9558 * -352769937 <= 8) {
			if ((var3 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.field9558 * -352769937 == 0) {
				var2.field9626 += -1554354635;
				this.field10422 = var2.method15341() * 711873985;
				this.field10425 = var2.method15341() * 1528496519;
				if (this.field10422 * 1731115585 == 0 || this.field10425 * -640486345 == 0) {
					throw new IllegalStateException();
				}
				class814 var4 = new class814(16);
				var2.method15263(var4.field9629, 0, 16);
				this.field10427 = var4.method15337();
				var4.field9626 = 0;
				var2.method15263(var4.field9629, 0, 16);
				this.field10426 = var4.method15337();
			}
			return;
		}
		if (var3 == 0) {
			long var5 = var2.method15247();
			long var7 = var2.method15247();
			long var9 = var2.method15247();
			if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
				throw new IllegalStateException();
			}
			this.field10428 = (float) ((long) (this.field10425 * -640486345) * var5) / (float) (this.field10422 * 1731115585);
			this.field10429 = (float) ((var5 + var7) * (long) (this.field10425 * -640486345)) / (float) (this.field10422 * 1731115585);
			int var11 = var2.method15341();
			if (var11 < 0 || var11 > var2.field9629.length - var2.field9626 * 803401371) {
				throw new IllegalStateException();
			}
			this.field10430 = Statics.method2786(var2.field9629, var2.field9626 * 803401371, var11);
		}
		if ((var3 | 0x80) != 0) {
			return;
		}
	}

	@ObfuscatedName("ajr.z(I)Ljava/lang/String;")
	public String method16824() {
		return this.field10427;
	}

	@ObfuscatedName("ajr.n(I)F")
	public float method16825() {
		return this.field10428;
	}

	@ObfuscatedName("ajr.o(I)F")
	public float method16826() {
		return this.field10429;
	}

	@ObfuscatedName("ajr.q(I)Ljava/lang/String;")
	public String method16823() {
		return this.field10430;
	}

	@ObfuscatedName("ajr.a(I)V")
	public void method15153() {
	}
}
