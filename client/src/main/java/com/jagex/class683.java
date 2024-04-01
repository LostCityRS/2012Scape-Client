package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

@ObfuscatedName("yk")
public abstract class class683 extends class14 {

	@ObfuscatedName("yk.y")
	public static final Object field8259 = new Object();

	@ObfuscatedName("yk.e")
	public class615 field8232 = new class615();

	@ObfuscatedName("yk.ao")
	public final class334 field8310;

	@ObfuscatedName("yk.al")
	public boolean field8242;

	@ObfuscatedName("yk.at")
	public int[] field8243;

	@ObfuscatedName("yk.ax")
	public ByteBuffer field8244;

	@ObfuscatedName("yk.aw")
	public long field8245;

	@ObfuscatedName("yk.aa")
	public final int field8372 = 4194304;

	@ObfuscatedName("yk.am")
	public Unsafe field8247;

	@ObfuscatedName("yk.ad")
	public class221 field8248;

	@ObfuscatedName("yk.az")
	public NativeHeap field8338;

	@ObfuscatedName("yk.ak")
	public class547 field8362 = new class547();

	@ObfuscatedName("yk.av")
	public int field8325;

	@ObfuscatedName("yk.aj")
	public int field8252;

	@ObfuscatedName("yk.ah")
	public int field8334;

	@ObfuscatedName("yk.au")
	public class314 field8302 = new class314();

	@ObfuscatedName("yk.ae")
	public class320 field8255 = new class320();

	@ObfuscatedName("yk.ac")
	public class314 field8256 = new class314();

	@ObfuscatedName("yk.aq")
	public class314 field8257 = new class314();

	@ObfuscatedName("yk.ab")
	public class320 field8258 = new class320();

	@ObfuscatedName("yk.bq")
	public class320 field8322 = new class320();

	@ObfuscatedName("yk.bz")
	public class314 field8260 = new class314();

	@ObfuscatedName("yk.bv")
	public class320 field8261 = new class320();

	@ObfuscatedName("yk.bj")
	public static final class320 field8358 = new class320();

	@ObfuscatedName("yk.bf")
	public class314 field8351 = new class314();

	@ObfuscatedName("yk.bt")
	public class320 field8264 = new class320();

	@ObfuscatedName("yk.bg")
	public class320 field8357 = new class320();

	@ObfuscatedName("yk.bl")
	public Vector3 field8266 = new Vector3();

	@ObfuscatedName("yk.bk")
	public float[] field8254 = new float[4];

	@ObfuscatedName("yk.bs")
	public boolean field8268 = false;

	@ObfuscatedName("yk.bn")
	public class238 field8269 = class238.field2500;

	@ObfuscatedName("yk.ba")
	public boolean field8270 = false;

	@ObfuscatedName("yk.bd")
	public class320 field8321 = new class320();

	@ObfuscatedName("yk.bc")
	public class320 field8297 = new class320();

	@ObfuscatedName("yk.br")
	public boolean field8273 = false;

	@ObfuscatedName("yk.bp")
	public class320 field8368 = new class320();

	@ObfuscatedName("yk.bi")
	public class320 field8275 = new class320();

	@ObfuscatedName("yk.bx")
	public class320 field8276 = this.field8275;

	@ObfuscatedName("yk.bm")
	public class320 field8332 = new class320();

	@ObfuscatedName("yk.bb")
	public class320 field8318 = new class320();

	@ObfuscatedName("yk.be")
	public class320 field8279 = new class320();

	@ObfuscatedName("yk.bw")
	public float[][] field8280 = new float[6][4];

	@ObfuscatedName("yk.bo")
	public float field8281;

	@ObfuscatedName("yk.bh")
	public float field8282;

	@ObfuscatedName("yk.by")
	public float field8283;

	@ObfuscatedName("yk.bu")
	public float field8284;

	@ObfuscatedName("yk.cl")
	public float field8285 = 0.0F;

	@ObfuscatedName("yk.cq")
	public float field8286 = 1.0F;

	@ObfuscatedName("yk.co")
	public float field8233 = 0.0F;

	@ObfuscatedName("yk.cb")
	public float field8288 = 1.0F;

	@ObfuscatedName("yk.cm")
	public float field8289 = 50.0F;

	@ObfuscatedName("yk.cw")
	public float field8290 = 3584.0F;

	@ObfuscatedName("yk.cx")
	public int field8291 = 0;

	@ObfuscatedName("yk.cn")
	public int field8292 = 0;

	@ObfuscatedName("yk.cf")
	public int field8293 = 0;

	@ObfuscatedName("yk.cs")
	public int field8294 = 0;

	@ObfuscatedName("yk.cr")
	public int field8295 = 0;

	@ObfuscatedName("yk.cp")
	public int field8296 = 0;

	@ObfuscatedName("yk.ci")
	public int field8311 = 0;

	@ObfuscatedName("yk.ca")
	public int field8265 = 0;

	@ObfuscatedName("yk.ch")
	public int field8299 = 0;

	@ObfuscatedName("yk.cv")
	public int field8300 = 0;

	@ObfuscatedName("yk.ck")
	public int field8301 = 0;

	@ObfuscatedName("yk.cd")
	public int field8376 = 0;

	@ObfuscatedName("yk.ce")
	public int field8303 = 0;

	@ObfuscatedName("yk.ct")
	public int field8246 = 0;

	@ObfuscatedName("yk.cu")
	public boolean field8305 = true;

	@ObfuscatedName("yk.cc")
	public boolean field8367 = false;

	@ObfuscatedName("yk.cg")
	public boolean field8307 = false;

	@ObfuscatedName("yk.cj")
	public boolean field8231 = false;

	@ObfuscatedName("yk.cy")
	public boolean field8309 = true;

	@ObfuscatedName("yk.cz")
	public boolean field8287 = false;

	@ObfuscatedName("yk.dl")
	public float[] field8272 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("yk.dj")
	public float[] field8308 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@ObfuscatedName("yk.dp")
	public float[] field8313 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("yk.dw")
	public float[] field8271 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@ObfuscatedName("yk.di")
	public int field8378 = -33488896;

	@ObfuscatedName("yk.dg")
	public float field8316 = 1.0F;

	@ObfuscatedName("yk.do")
	public float field8317 = 1.0F;

	@ObfuscatedName("yk.db")
	public float field8237 = 1.0F;

	@ObfuscatedName("yk.dx")
	public float field8319 = 1.0F;

	@ObfuscatedName("yk.dh")
	public float field8320 = -1.0F;

	@ObfuscatedName("yk.de")
	public float field8373 = -1.0F;

	@ObfuscatedName("yk.dk")
	public class780[] field8365;

	@ObfuscatedName("yk.du")
	public int field8323;

	@ObfuscatedName("yk.dz")
	public int field8324;

	@ObfuscatedName("yk.ds")
	public int field8263 = 8;

	@ObfuscatedName("yk.dc")
	public int field8326 = 3;

	@ObfuscatedName("yk.dy")
	public int field8327;

	@ObfuscatedName("yk.dt")
	public int field8371;

	@ObfuscatedName("yk.dd")
	public int field8253 = 0;

	@ObfuscatedName("yk.da")
	public class254[] field8330;

	@ObfuscatedName("yk.dr")
	public class320[] field8331;

	@ObfuscatedName("yk.df")
	public class250[] field8306;

	@ObfuscatedName("yk.dv")
	public class253[] field8333;

	@ObfuscatedName("yk.dn")
	public class253[] field8356;

	@ObfuscatedName("yk.dm")
	public int field8335;

	@ObfuscatedName("yk.dq")
	public final class233 field8336;

	@ObfuscatedName("yk.et")
	public class239 field8312;

	@ObfuscatedName("yk.eu")
	public class239 field8359;

	@ObfuscatedName("yk.eg")
	public class667 field8278;

	@ObfuscatedName("yk.ev")
	public class667 field8315;

	@ObfuscatedName("yk.er")
	public boolean field8341 = false;

	@ObfuscatedName("yk.eq")
	public class252 field8342;

	@ObfuscatedName("yk.en")
	public class222 field8240;

	@ObfuscatedName("yk.ez")
	public final class222[] field8344 = new class222[16];

	@ObfuscatedName("yk.eh")
	public class200 field8345;

	@ObfuscatedName("yk.ed")
	public class203 field8346;

	@ObfuscatedName("yk.ee")
	public class202 field8347;

	@ObfuscatedName("yk.es")
	public class201 field8314;

	@ObfuscatedName("yk.ej")
	public class908 field8349;

	@ObfuscatedName("yk.ew")
	public class908 field8350;

	@ObfuscatedName("yk.el")
	public class907 field8277;

	@ObfuscatedName("yk.ei")
	public class232 field8352;

	@ObfuscatedName("yk.ex")
	public final class231[] field8355 = new class231[2];

	@ObfuscatedName("yk.eb")
	public class680 field8386;

	@ObfuscatedName("yk.ec")
	public boolean field8274;

	@ObfuscatedName("yk.ea")
	public boolean field8249 = false;

	@ObfuscatedName("yk.em")
	public int field8236;

	@ObfuscatedName("yk.ey")
	public class137 field8360;

	@ObfuscatedName("yk.ek")
	public boolean field8361;

	@ObfuscatedName("yk.ep")
	public boolean field8250 = true;

	@ObfuscatedName("yk.fd")
	public int field8363 = -1;

	@ObfuscatedName("yk.fr")
	public int field8364 = -1;

	@ObfuscatedName("yk.fa")
	public int field8390 = 0;

	@ObfuscatedName("yk.fc")
	public float field8251;

	@ObfuscatedName("yk.fp")
	public float field8304;

	@ObfuscatedName("yk.fv")
	public int field8370 = 1;

	@ObfuscatedName("yk.fn")
	public class248 field8369 = class248.field2543;

	@ObfuscatedName("yk.fl")
	public boolean field8241 = true;

	@ObfuscatedName("yk.ff")
	public boolean field8377 = true;

	@ObfuscatedName("yk.fx")
	public final int field8383;

	@ObfuscatedName("yk.fy")
	public int field8391;

	@ObfuscatedName("yk.fj")
	public int field8374;

	@ObfuscatedName("yk.fo")
	public boolean field8375 = false;

	@ObfuscatedName("yk.fm")
	public class242 field8267;

	@ObfuscatedName("yk.fk")
	public int field8348;

	@ObfuscatedName("yk.fg")
	public int field8337;

	@ObfuscatedName("yk.fu")
	public int field8379;

	@ObfuscatedName("yk.fh")
	public boolean field8380;

	@ObfuscatedName("yk.fz")
	public boolean field8381;

	@ObfuscatedName("yk.fi")
	public boolean field8382;

	@ObfuscatedName("yk.fb")
	public boolean field8339;

	@ObfuscatedName("yk.fw")
	public boolean field8384;

	@ObfuscatedName("yk.fs")
	public class228 field8385;

	@ObfuscatedName("yk.fe")
	public class228 field8328;

	@ObfuscatedName("yk.fq")
	public class228 field8387;

	@ObfuscatedName("yk.ft")
	public class230 field8388;

	@ObfuscatedName("yk.gw")
	public class230 field8389;

	@ObfuscatedName("yk.gn")
	public class230 field8298;

	@ObfuscatedName("yk.gp")
	public class230 field8343;

	@ObfuscatedName("yk.gq")
	public class230 field8392;

	@ObfuscatedName("yk.gz")
	public class258 field8393;

	@ObfuscatedName("yk.gk")
	public class678[] field8394;

	@ObfuscatedName("yk.gc")
	public class678[] field8395;

	@ObfuscatedName("yk.gm")
	public class320 field8396;

	@ObfuscatedName("yk.gh")
	public class314 field8397;

	@ObfuscatedName("yk.ge")
	public boolean field8398;

	@ObfuscatedName("yk.gr")
	public int field8399;

	@ObfuscatedName("yk.d(Lgv;)V")
	public void method13586(class227 arg0) {
		this.field8232.method12611(arg0, field8259);
	}

	@ObfuscatedName("yk.n(Lgv;)V")
	public void method13485(class227 arg0) {
		this.field8232.method12608(arg0);
	}

	@ObfuscatedName("yk.q()V")
	public void method13486() {
		ArrayList var1 = this.field8232.method12609();
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			class227 var3 = (class227) var2.next();
			var3.method168();
		}
	}

	@ObfuscatedName("yk.h()Z")
	public final boolean method13489() {
		return this.field8242;
	}

	@ObfuscatedName("yk.da(Ljava/lang/String;Ljava/lang/String;)[B")
	public byte[] method13491(String arg0, String arg1) {
		return this.field8310.method5645(arg0, arg1);
	}

	@ObfuscatedName("yk.ma([B)Lem;")
	public class173 method13492(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new class173(arg0);
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfuscatedName("yk.oa()Z")
	public static boolean method13494() {
		return class618.method11710().method6800("jaclib");
	}

	public class683(class16 arg0, class334 arg1, int arg2, int arg3) {
		super(arg0);
		new Stream();
		this.field8394 = new class678[7];
		this.field8395 = new class678[7];
		this.field8396 = new class320();
		this.field8397 = new class314();
		this.field8399 = -1;
		try {
			this.field8310 = arg1;
			this.field8383 = arg2;
			this.field8348 = arg3;
			class482.method8092(false, true);
			if (this.field400 == null) {
				this.field8336 = null;
			} else {
				this.field8336 = new class233(this, this.field400);
			}
			if (this.field8348 == 0) {
				this.field8243 = Statics.field5084;
			} else {
				this.field8243 = Statics.field5085;
			}
			try {
				Field var5 = Unsafe.class.getDeclaredField("theUnsafe");
				var5.setAccessible(true);
				this.field8247 = (Unsafe) var5.get(null);
			} catch (Exception var8) {
			}
			this.field8244 = ByteBuffer.allocateDirect(4194304);
			this.field8244.order(ByteOrder.nativeOrder());
			this.field8245 = DirectBufferHelper.getDirectBufferAddress(this.field8244);
		} catch (Throwable var9) {
			var9.printStackTrace();
			this.method442();
			if (var9 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var9;
			}
			throw new RuntimeException("");
		}
		this.method502(this.method593(131072));
	}

	@ObfuscatedName("yk.os()V")
	public final void method13495() {
		this.field8330 = new class254[this.field8337];
		this.field8331 = new class320[this.field8337];
		this.field8306 = new class250[this.field8337];
		this.field8333 = new class253[this.field8337];
		this.field8356 = new class253[this.field8337];
		for (int var1 = 0; var1 < this.field8337; var1++) {
			this.field8356[var1] = class253.field2574;
			this.field8333[var1] = class253.field2574;
			this.field8306[var1] = class250.field2550;
			this.field8331[var1] = new class320();
		}
		this.field8365 = new class780[this.field8379 - 2];
		int[] var2 = new int[] { -1 };
		this.field8312 = this.method13552(1, 1, false, var2, 0, 0);
		var2[0] = -16777216;
		this.field8359 = this.method13552(1, 1, false, var2, 0, 0);
		this.method502(new class917(262144));
		this.field8392 = this.method13585(new class243[] { new class243(new class237[] { class237.field2495, class237.field2483 }) });
		this.method13585(new class243[] { new class243(new class237[] { class237.field2495, class237.field2488 }) });
		this.field8343 = this.method13585(new class243[] { new class243(class237.field2495), new class243(class237.field2488), new class243(class237.field2483), new class243(class237.field2480) });
		this.field8298 = this.method13585(new class243[] { new class243(class237.field2495), new class243(class237.field2488), new class243(class237.field2483) });
		for (int var3 = 0; var3 < 7; var3++) {
			this.field8394[var3] = new class678(this, 0, 0, false, false);
			this.field8395[var3] = new class678(this, 0, 0, true, true);
		}
		this.method13496();
		this.field8393 = this.method13797(true);
		this.method13497();
		this.method467();
		this.method753();
		this.method587();
		this.field8278 = new class667(this, this.field8312);
		this.field8315 = new class667(this, this.field8359);
		this.method505(3, 0);
	}

	@ObfuscatedName("yk.oq()V")
	public final void method13496() {
		this.field8248 = new class221(this);
		this.field8242 = false;
		try {
			this.field8345 = new class722(this);
			this.field8346 = new class728(this);
			this.field8347 = new class726(this);
			this.field8314 = new class724(this);
			this.field8349 = new class908(this, this.field8248, false);
			this.field8350 = new class908(this, this.field8248, true);
			this.field8277 = new class907(this, this.field8248);
		} catch (Exception var4) {
			var4.printStackTrace();
			this.field8345 = new class721(this);
			this.field8346 = new class727(this);
			this.field8347 = new class725(this);
			this.field8314 = new class723(this);
			this.field8349 = null;
			this.field8350 = null;
			this.field8277 = null;
			this.field8242 = true;
		}
		int var2;
		int var3;
		if (this.field412 == null) {
			var3 = 0;
			var2 = 0;
		} else {
			var2 = this.field412.method921();
			var3 = this.field412.method922();
		}
		this.field8352 = new class232(this, var2, var3);
		if (!this.field8242) {
			this.field8355[1] = new class742(this);
			this.field8352.method4338(this.field8355[1]);
		}
		if (this.field8240 != null) {
			this.field8240.method4143();
			this.field8240 = null;
		}
		this.method13499();
	}

	@ObfuscatedName("yk.ob(I)Lgu;")
	public class222 method13739(int arg0) {
		return this.field8344[arg0];
	}

	@ObfuscatedName("yk.ox()V")
	public void method13497() {
		this.method13637(7);
		this.method13564();
	}

	@ObfuscatedName("yk.oe()V")
	public final void method13564() {
		this.method13540();
		this.method13541();
		this.method13618();
		this.method13544();
		this.method13842();
		this.method13543();
		this.method13628();
		this.method13536();
		this.method13537();
		this.method13581();
		this.method13580();
		this.method13701();
		this.method13576();
		this.method13633();
		for (int var1 = this.field8337 - 1; var1 >= 0; var1--) {
			this.method13629(var1);
			this.method13779();
			this.method13572();
			this.method13741();
		}
		this.method13569();
		this.method13493();
	}

	@ObfuscatedName("yk.ow()V")
	public void method13583() {
		this.field8352.method4322();
		this.field8328.method168();
		this.field8385.method168();
		this.field8387.method168();
		for (int var1 = 0; var1 < 7; var1++) {
			this.field8395[var1].method13137();
		}
		this.field8267.method4466();
		this.field8393.method168();
		this.field8342.method4496();
		this.field8342 = null;
	}

	@ObfuscatedName("yk.oi()V")
	public void method13499() {
		this.field8352.method4315();
		for (int var1 = 0; var1 < this.field8355.length; var1++) {
			if (this.field8355[var1] != null && this.field8355[var1].method4282()) {
				this.field8355[var1].method4281();
			}
		}
		this.field8267 = new class242(this);
		this.method13500();
		this.method13501();
		this.method13502();
		this.field8267.method4468(this);
		this.field8342 = new class252(this, 1024);
	}

	@ObfuscatedName("yk.ot()V")
	public final void method13500() {
		this.field8328 = this.method13584(false);
		short var1 = 160;
		this.field8328.method4269(var1, 32);
		this.field8244.clear();
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putInt(-1);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putInt(-1);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putInt(-1);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putInt(-1);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(1.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putInt(-1);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8328.method4452(0, this.field8244.position(), this.field8245);
		this.field8389 = this.method13585(new class243[] { new class243(new class237[] { class237.field2495, class237.field2488, class237.field2483, class237.field2483 }) });
	}

	@ObfuscatedName("yk.oc()V")
	public final void method13501() {
		this.field8385 = this.method13584(true);
		this.field8385.method4269(24, 12);
		this.field8388 = this.method13585(new class243[] { new class243(class237.field2495) });
	}

	@ObfuscatedName("yk.oy()V")
	public final void method13502() {
		this.field8387 = this.method13584(false);
		this.field8387.method4269(3096, 12);
		this.field8244.clear();
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		this.field8244.putFloat(0.0F);
		for (int var1 = 0; var1 <= 256; var1++) {
			double var2 = (double) (var1 * 2) * 3.141592653589793D / 256.0D;
			float var4 = (float) Math.cos(var2);
			float var5 = (float) Math.sin(var2);
			this.field8244.putFloat(var5);
			this.field8244.putFloat(var4);
			this.field8244.putFloat(0.0F);
		}
		this.field8387.method4452(0, this.field8244.position(), this.field8245);
	}

	@ObfuscatedName("yk.op(FFFFFF)Z")
	public boolean method13832(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field8244.clear();
		this.field8244.putFloat(arg0);
		this.field8244.putFloat(arg1);
		this.field8244.putFloat(arg2);
		this.field8244.putFloat(arg3);
		this.field8244.putFloat(arg4);
		this.field8244.putFloat(arg5);
		return this.field8385.method4452(0, this.field8244.position(), this.field8245);
	}

	@ObfuscatedName("yk.w()V")
	public void method443() {
		if (this.field8375) {
			return;
		}
		this.method13583();
		this.field8336.method4352();
		for (class399 var1 = this.field8362.method11563(); var1 != null; var1 = this.field8362.method11567()) {
			((class917) var1).method16230();
		}
		class482.method2790(false, true);
		for (int var2 = 0; var2 < this.field8344.length; var2++) {
			if (this.field8344[var2] != null) {
				this.field8344[var2].method4135();
				this.field8344[var2] = null;
			}
		}
		for (int var3 = 0; var3 < this.field8355.length; var3++) {
			if (this.field8355[var3] != null) {
				this.field8355[var3].method4308();
				this.field8355[var3] = null;
			}
		}
		this.method13486();
		this.method444(0);
		this.field8375 = true;
	}

	@ObfuscatedName("yk.i()Z")
	public final boolean method629() {
		return true;
	}

	@ObfuscatedName("yk.v()Z")
	public final boolean method447() {
		return true;
	}

	@ObfuscatedName("yk.g()Z")
	public final boolean method448() {
		return true;
	}

	@ObfuscatedName("yk.ay()Z")
	public final boolean method450() {
		return this.field8355[1] != null;
	}

	@ObfuscatedName("yk.af()Z")
	public final boolean method451() {
		return true;
	}

	@ObfuscatedName("yk.e()Z")
	public final boolean method449() {
		return true;
	}

	@ObfuscatedName("yk.an()Z")
	public final boolean method765() {
		return true;
	}

	@ObfuscatedName("yk.ap()Z")
	public final boolean method454() {
		return true;
	}

	@ObfuscatedName("yk.ag()Z")
	public final boolean method455() {
		return false;
	}

	@ObfuscatedName("yk.ar()Z")
	public final boolean method452() {
		return this.field8339;
	}

	@ObfuscatedName("yk.b(I)V")
	public void method444(int arg0) {
		if (this.field8336 != null) {
			this.field8336.method4357();
		}
		this.field8391 = arg0 & Integer.MAX_VALUE;
	}

	@ObfuscatedName("yk.ou()Lgy;")
	public class224 method13508() {
		return this.field8342 == null ? class224.field2416 : this.field8342.method4507();
	}

	@ObfuscatedName("yk.by()V")
	public void method509() {
		if (this.field8342 != null) {
			this.field8342.method4503();
		}
	}

	@ObfuscatedName("yk.bu()V")
	public void method510() {
		if (this.field8342 != null) {
			this.field8342.method4502();
		}
	}

	@ObfuscatedName("yk.cl()V")
	public void method511() {
		if (this.field8342 != null) {
			this.field8342.method4501();
		}
	}

	@ObfuscatedName("yk.oz()V")
	public void method13814() {
		this.method13510();
	}

	@ObfuscatedName("yk.oj()V")
	public void method13510() {
		this.method13530();
		this.method13671();
		this.method13802();
		this.method490();
		this.method753();
	}

	@ObfuscatedName("yk.cg()Z")
	public final boolean method539() {
		if (this.field8355[1] == null || this.field8355[1].method4282()) {
			return false;
		}
		boolean var1 = this.field8352.method4338(this.field8355[1]);
		if (var1) {
			this.field8336.method4352();
		}
		return var1;
	}

	@ObfuscatedName("yk.cj()V")
	public final void method558() {
		if (this.field8355[1] != null && this.field8355[1].method4282()) {
			this.field8352.method4318(this.field8355[1]);
			this.field8336.method4352();
		}
	}

	@ObfuscatedName("yk.cy()Z")
	public final boolean method600() {
		return this.field8355[1] != null && this.field8355[1].method4282();
	}

	@ObfuscatedName("yk.dl(FFFFFF)V")
	public final void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		class742.field8795 = arg0;
		class742.field8792 = arg1;
		class742.field8789 = arg2;
		class742.field8803 = arg5;
	}

	@ObfuscatedName("yk.dj(IIII)V")
	public final void method514(int arg0, int arg1, int arg2, int arg3) {
		this.field8352.method4337(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("yk.dp()V")
	public final void method545() {
		this.field8352.method4312();
	}

	@ObfuscatedName("yk.bi(I)Lv;")
	public final class28 method593(int arg0) {
		class917 var2 = new class917(arg0);
		this.field8362.method11558(var2);
		return var2;
	}

	@ObfuscatedName("yk.bx(Lv;)V")
	public final void method502(class28 arg0) {
		this.field8338 = ((class917) arg0).field10174;
	}

	@ObfuscatedName("yk.or(IZ)Ljaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method13512(int arg0, boolean arg1) {
		return this.field8338.method70(arg0, arg1);
	}

	@ObfuscatedName("yk.od(I)Lin;")
	public final class258 method13559(int arg0) {
		if (this.field8393.method4451() < arg0 * 2) {
			this.field8393.method4535(arg0);
		}
		return this.field8393;
	}

	@ObfuscatedName("yk.za()I")
	public final int method552() {
		return this.field8325 + this.field8252 + this.field8334;
	}

	@ObfuscatedName("yk.bb(IIZZ)Lce;")
	public final class118 method658(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new class667(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("yk.bo(Lds;Z)Lce;")
	public final class118 method517(class140 arg0, boolean arg1) {
		class118 var4;
		if (arg0.method2721() == 0 || arg0.method2763() == 0) {
			var4 = this.method506(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			int[] var3 = arg0.method2735(false);
			var4 = this.method506(var3, 0, arg0.method2721(), arg0.method2721(), arg0.method2763());
		}
		var4.method1036(arg0.method2722(), arg0.method2724(), arg0.method2732(), arg0.method2734());
		return var4;
	}

	@ObfuscatedName("yk.be([IIIIIZ)Lce;")
	public final class118 method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new class667(this, arg3, arg4, arg0, arg1, arg2);
	}

	@ObfuscatedName("yk.bh(IIIIZ)Lce;")
	public final class118 method508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		class667 var6 = new class667(this, arg2, arg3, arg4, false);
		var6.method1086(0, 0, arg2, arg3, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("yk.co(Lvm;[Lzv;Z)Ll;")
	public final class15 method712(class603 arg0, class685[] arg1, boolean arg2) {
		return new class690(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("yk.cq(II[I[I)Lta;")
	public final class11 method571(int arg0, int arg1, int[] arg2, int[] arg3) {
		return class670.method12944(this, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("yk.cw(I)V")
	public final void method673(int arg0) {
	}

	@ObfuscatedName("yk.cx(Ldw;IIII)Lqa;")
	public final class13 method625(class129 arg0, int arg1, int arg2, int arg3, int arg4) {
		return new class678(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("yk.cn(II)I")
	public final int method519(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@ObfuscatedName("yk.cf(II)I")
	public final int method520(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("yk.cs(II[[I[[IIII)Lxa;")
	public final class12 method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new class673(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("yk.cb()Lka;")
	public final class320 method781() {
		return this.field8396;
	}

	@ObfuscatedName("yk.cm()Lkc;")
	public final class314 method516() {
		return this.field8397;
	}

	@ObfuscatedName("yk.ct(IIIIII)Ldj;")
	public final class127 method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return new class897(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("yk.cc(Ldj;)V")
	public final void method549(class127 arg0) {
		this.field8386 = (class680) arg0;
	}

	@ObfuscatedName("yk.ok()Lih;")
	public final class259 method13516() {
		return this.field8386 == null ? null : this.field8386.method13190();
	}

	@ObfuscatedName("yk.aq()V")
	public void method490() {
		this.field8295 = 0;
		this.field8296 = 0;
		this.field8311 = this.field412.method921();
		this.field8265 = this.field412.method922();
		this.method13776();
	}

	@ObfuscatedName("yk.ab(IIII)V")
	public void method474(int arg0, int arg1, int arg2, int arg3) {
		this.field8295 = arg0;
		this.field8296 = arg1;
		this.field8311 = arg2;
		this.field8265 = arg3;
		this.method13776();
	}

	@ObfuscatedName("yk.oh()V")
	public final void method13776() {
		if (class238.field2498 == this.field8269) {
			this.field8299 = this.field8295;
			this.field8300 = this.field8296;
			this.field8301 = this.field8311;
			this.field8376 = this.field8265;
			this.field8285 = this.field8233;
			this.field8286 = this.field8288;
		} else {
			this.field8299 = 0;
			this.field8300 = 0;
			this.field8301 = this.field412.method921();
			this.field8376 = this.field412.method922();
			this.field8285 = 0.0F;
			this.field8286 = 1.0F;
		}
		this.method13493();
		this.field8282 = (float) this.field8311 / 2.0F;
		this.field8284 = (float) this.field8265 / 2.0F;
		this.field8281 = (float) this.field8295 + this.field8282;
		this.field8283 = (float) this.field8296 + this.field8284;
	}

	@ObfuscatedName("yk.GA(FF)V")
	public void method475(float arg0, float arg1) {
		this.field8233 = arg0;
		this.field8288 = arg1;
		this.method13776();
	}

	@ObfuscatedName("yk.qa([I)V")
	public final void method453(int[] arg0) {
		arg0[0] = this.field8293;
		arg0[1] = this.field8291;
		arg0[2] = this.field8294;
		arg0[3] = this.field8292;
	}

	@ObfuscatedName("yk.L()V")
	public final void method753() {
		if (this.field412 == null) {
			this.field8292 = 0;
			this.field8294 = 0;
			this.field8291 = 0;
			this.field8293 = 0;
		} else {
			this.field8291 = 0;
			this.field8293 = 0;
			this.field8294 = this.field412.method921();
			this.field8292 = this.field412.method922();
		}
		if (this.field8398) {
			this.field8398 = false;
			this.method13520();
		}
	}

	@ObfuscatedName("yk.r(IIII)V")
	public final void method659(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.field412 == null) {
			var6 = 0;
			var5 = 0;
		} else {
			var5 = this.field412.method921();
			var6 = this.field412.method922();
		}
		if (arg0 <= 0 && arg2 >= var5 - 1 && arg1 <= 0 && arg3 >= var6 - 1) {
			this.method753();
			return;
		}
		this.field8293 = arg0 >= 0 ? arg0 : 0;
		this.field8294 = arg2 <= var5 ? arg2 : var5;
		this.field8291 = arg1 >= 0 ? arg1 : 0;
		this.field8292 = arg3 <= var6 ? arg3 : var6;
		if (!this.field8398 && (this.field8341 || this.method13508() == class224.field2416)) {
			this.field8398 = true;
			this.method13520();
		}
		this.method13519();
	}

	@ObfuscatedName("yk.o(IIII)V")
	public final void method478(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (this.field412 == null) {
			var6 = 0;
			var5 = 0;
		} else {
			var5 = this.field412.method921();
			var6 = this.field412.method922();
		}
		int var7 = arg0 >= 0 ? arg0 : 0;
		int var8 = arg2 <= var5 ? arg2 : var5;
		int var9 = arg1 >= 0 ? arg1 : 0;
		int var10 = arg3 <= var6 ? arg3 : var6;
		boolean var11 = false;
		if (this.field8293 < var7) {
			this.field8293 = var7;
			var11 = true;
		}
		if (this.field8294 > var8) {
			this.field8294 = var8;
			var11 = true;
		}
		if (this.field8291 < var9) {
			this.field8291 = var9;
			var11 = true;
		}
		if (this.field8292 > var10) {
			this.field8292 = var10;
			var11 = true;
		}
		if (!var11) {
			return;
		}
		if (!this.field8398 && (this.field8341 || this.method13508() == class224.field2416)) {
			this.field8398 = true;
			this.method13520();
		}
		this.method13519();
	}

	@ObfuscatedName("yk.pv(II)V")
	public final void method13659(int arg0, int arg1) {
		this.field8303 = arg0;
		this.field8246 = arg1;
		this.method13493();
		this.method13519();
	}

	@ObfuscatedName("yk.bq(Z)V")
	public void method515(boolean arg0) {
		this.field8341 = arg0;
	}

	@ObfuscatedName("yk.pq()Lka;")
	public final class320 method13690() {
		return class238.field2498 == this.field8269 ? this.field8258 : field8358;
	}

	@ObfuscatedName("yk.px()Lka;")
	public final class320 method13522() {
		return class238.field2498 == this.field8269 ? this.field8322 : field8358;
	}

	@ObfuscatedName("yk.ci(Lkc;)V")
	public final void method524(class314 arg0) {
		this.field8256 = arg0;
		this.field8258.method5385(this.field8256);
		this.field8257.method5115(arg0);
		this.field8257.method5102();
		this.field8322.method5385(this.field8257);
		this.method13524();
		if (class238.field2498 == this.field8269) {
			this.method13525();
		}
	}

	@ObfuscatedName("yk.ca()Lkc;")
	public class314 method525() {
		return this.field8256;
	}

	@ObfuscatedName("yk.ch(Lka;)V")
	public final void method784(class320 arg0) {
		this.field8368.method5412(arg0);
		this.method13524();
		if (class238.field2498 == this.field8269) {
			this.method13533();
		}
	}

	@ObfuscatedName("yk.pt()V")
	public final void method13524() {
		this.field8318.method5412(this.field8258);
		this.field8318.method5384(this.field8368);
		this.field8318.method5405(this.field8280[0]);
		this.field8318.method5460(this.field8280[1]);
		this.field8318.method5401(this.field8280[2]);
		this.field8318.method5434(this.field8280[3]);
		this.field8318.method5403(this.field8280[4]);
		this.field8318.method5459(this.field8280[5]);
		this.field8279.method5412(this.field8318);
		this.method13638(this.field8279);
	}

	@ObfuscatedName("yk.cv()Lka;")
	public final class320 method528() {
		return this.field8368;
	}

	@ObfuscatedName("yk.pa()V")
	public final void method13525() {
		this.field8268 = false;
	}

	@ObfuscatedName("yk.ps()Lka;")
	public class320 method13526() {
		return this.field8255;
	}

	@ObfuscatedName("yk.pn()Lkc;")
	public class314 method13624() {
		if (class238.field2498 != this.field8269) {
			return this.field8302;
		}
		if (!this.field8268) {
			this.field8260.method5115(this.field8302);
			this.field8260.method5117(this.field8256);
			this.field8261.method5385(this.field8260);
			this.field8268 = true;
		}
		return this.field8260;
	}

	@ObfuscatedName("yk.po()Lka;")
	public class320 method13504() {
		if (class238.field2498 == this.field8269) {
			if (!this.field8268) {
				this.method13624();
			}
			return this.field8261;
		} else {
			return this.field8255;
		}
	}

	@ObfuscatedName("yk.pb()Lka;")
	public final class320 method13528() {
		return this.field8279;
	}

	@ObfuscatedName("yk.pw()Lka;")
	public final class320 method13511() {
		return this.field8332;
	}

	@ObfuscatedName("yk.pr()V")
	public final void method13802() {
		if (class238.field2500 == this.field8269) {
			return;
		}
		class238 var1 = this.field8269;
		this.field8269 = class238.field2500;
		if (class238.field2498 == var1) {
			this.method13525();
		}
		this.field8276 = this.field8275;
		this.method13533();
		this.method13776();
		this.field8374 &= 0xFFFFFFF0;
	}

	@ObfuscatedName("yk.pc()V")
	public final void method13610() {
		if (class238.field2499 == this.field8269) {
			return;
		}
		class238 var1 = this.field8269;
		this.field8269 = class238.field2499;
		if (class238.field2498 == var1) {
			this.method13525();
		}
		this.method13531();
		this.field8276 = this.field8321;
		this.method13533();
		this.method13776();
		this.field8374 &= 0xFFFFFFF7;
	}

	@ObfuscatedName("yk.pj()V")
	public final void method13530() {
		this.field8270 = false;
		if (class238.field2499 == this.field8269) {
			this.method13531();
			this.method13533();
		}
	}

	@ObfuscatedName("yk.pi()V")
	public final void method13515() {
		if (class238.field2498 == this.field8269) {
			return;
		}
		this.field8269 = class238.field2498;
		this.method13525();
		this.method13532();
		this.field8276 = this.field8368;
		this.method13533();
		this.method13776();
		this.field8374 &= 0xFFFFFFF8;
	}

	@ObfuscatedName("yk.pl()V")
	public final void method13671() {
		this.field8273 = false;
		this.method13532();
		if (class238.field2498 == this.field8269) {
			this.method13533();
		}
	}

	@ObfuscatedName("yk.pf()V")
	public final void method13531() {
		if (this.field8270) {
			return;
		}
		int var1;
		int var2;
		if (this.field412 == null) {
			var2 = 0;
			var1 = 0;
		} else {
			var1 = this.field412.method921();
			var2 = this.field412.method922();
		}
		class320 var3 = this.field8321;
		if (var1 == 0 || var2 == 0) {
			var3.method5453();
		} else {
			var3.method5393(0.0F, (float) var1, 0.0F, (float) var2, -1.0F, 1.0F);
		}
		this.field8297.method5412(var3);
		this.method13638(this.field8297);
		this.field8270 = true;
	}

	@ObfuscatedName("yk.pm()V")
	public final void method13532() {
		if (!this.field8273) {
			this.field8273 = true;
		}
	}

	@ObfuscatedName("yk.pk()V")
	public final void method13533() {
		this.field8332.method5412(this.field8276);
		this.method13638(this.field8332);
		this.field8290 = (this.field8332.field3480[14] - this.field8332.field3480[15]) / (this.field8332.field3480[11] - this.field8332.field3480[10]);
		this.field8289 = -this.field8332.field3480[14] / this.field8332.field3480[10];
		this.method13579();
	}

	@ObfuscatedName("yk.RA(Z)V")
	public final void method526(boolean arg0) {
		this.field8305 = arg0;
		this.method13537();
	}

	@ObfuscatedName("yk.pz(Z)V")
	public final void method13620(boolean arg0) {
		if (this.field8307 != arg0) {
			this.field8307 = arg0;
			this.method13536();
			this.field8374 &= 0xFFFFFFF0;
		}
	}

	@ObfuscatedName("yk.pg(Z)V")
	public final void method13728(boolean arg0) {
		if (this.field8367 != arg0) {
			this.field8367 = arg0;
			this.method13537();
			this.field8374 &= 0xFFFFFFF0;
		}
	}

	@ObfuscatedName("yk.do(FFF[F)V")
	public void method550(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field8318.field3480[11] * arg2 + this.field8318.field3480[7] * arg1 + this.field8318.field3480[3] * arg0 + this.field8318.field3480[15];
		float var6 = this.field8318.field3480[8] * arg2 + this.field8318.field3480[4] * arg1 + this.field8318.field3480[0] * arg0 + this.field8318.field3480[12];
		float var7 = this.field8318.field3480[9] * arg2 + this.field8318.field3480[5] * arg1 + this.field8318.field3480[1] * arg0 + this.field8318.field3480[13];
		float var8 = this.field8258.field3480[10] * arg2 + this.field8258.field3480[6] * arg1 + this.field8258.field3480[2] * arg0 + this.field8258.field3480[14];
		arg3[0] = this.field8282 * var6 / var5 + this.field8281;
		arg3[1] = this.field8284 * var7 / var5 + this.field8283;
		arg3[2] = var8;
	}

	@ObfuscatedName("yk.dg(FFF[F)V")
	public void method567(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field8318.field3480[10] * arg2 + this.field8318.field3480[6] * arg1 + this.field8318.field3480[2] * arg0 + this.field8318.field3480[14];
		float var6 = this.field8318.field3480[11] * arg2 + this.field8318.field3480[7] * arg1 + this.field8318.field3480[3] * arg0 + this.field8318.field3480[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field8318.field3480[8] * arg2 + this.field8318.field3480[4] * arg1 + this.field8318.field3480[0] * arg0 + this.field8318.field3480[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field8318.field3480[9] * arg2 + this.field8318.field3480[5] * arg1 + this.field8318.field3480[1] * arg0 + this.field8318.field3480[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field8258.field3480[10] * arg2 + this.field8258.field3480[6] * arg1 + this.field8258.field3480[2] * arg0 + this.field8258.field3480[14];
			arg3[0] = this.field8282 * var7 / var6 + this.field8281;
			arg3[1] = this.field8284 * var8 / var6 + this.field8283;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("yk.bp(IIIIII)I")
	public int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field8318.field3480[10] * (float) arg2 + this.field8318.field3480[6] * (float) arg1 + this.field8318.field3480[2] * (float) arg0 + this.field8318.field3480[14];
		float var9 = this.field8318.field3480[10] * (float) arg5 + this.field8318.field3480[6] * (float) arg4 + this.field8318.field3480[2] * (float) arg3 + this.field8318.field3480[14];
		float var10 = this.field8318.field3480[11] * (float) arg2 + this.field8318.field3480[7] * (float) arg1 + this.field8318.field3480[3] * (float) arg0 + this.field8318.field3480[15];
		float var11 = this.field8318.field3480[11] * (float) arg5 + this.field8318.field3480[7] * (float) arg4 + this.field8318.field3480[3] * (float) arg3 + this.field8318.field3480[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field8318.field3480[8] * (float) arg2 + this.field8318.field3480[4] * (float) arg1 + this.field8318.field3480[0] * (float) arg0 + this.field8318.field3480[12];
		float var13 = this.field8318.field3480[8] * (float) arg5 + this.field8318.field3480[4] * (float) arg4 + this.field8318.field3480[0] * (float) arg3 + this.field8318.field3480[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field8318.field3480[9] * (float) arg2 + this.field8318.field3480[5] * (float) arg1 + this.field8318.field3480[1] * (float) arg0 + this.field8318.field3480[13];
		float var15 = this.field8318.field3480[9] * (float) arg5 + this.field8318.field3480[5] * (float) arg4 + this.field8318.field3480[1] * (float) arg3 + this.field8318.field3480[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("yk.ck()I")
	public final int method768() {
		return this.field8379 - 2;
	}

	@ObfuscatedName("yk.qu(Z)V")
	public final void method13539(boolean arg0) {
		if (this.field8231 != arg0) {
			this.field8231 = arg0;
			this.method13618();
			this.field8374 &= 0xFFFFFFF8;
		}
	}

	@ObfuscatedName("yk.ce(I[Lacg;)V")
	public final void method535(int arg0, class780[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field8365[var3] = arg1[var3];
		}
		this.field8324 = arg0;
		if (class238.field2498 == this.field8269) {
			this.method13544();
		}
	}

	@ObfuscatedName("yk.IA(F)V")
	public final void method529(float arg0) {
		if (this.field8319 != arg0) {
			this.field8319 = arg0;
			this.method13540();
			this.method13543();
		}
	}

	@ObfuscatedName("yk.m(IFFFFF)V")
	public final void method530(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.field8378 * 16777215 != arg0;
		if (var7 || this.field8320 != arg1 || this.field8373 != arg2) {
			this.field8378 = arg0 * 33488896;
			this.field8320 = arg1;
			this.field8373 = arg2;
			if (var7) {
				this.field8316 = (float) (this.field8378 * 16777215 & 0xFF0000) / 1.671168E7F;
				this.field8317 = (float) (this.field8378 * 16777215 & 0xFF00) / 65280.0F;
				this.field8237 = (float) (this.field8378 * 16777215 & 0xFF) / 255.0F;
				this.method13540();
			}
			this.method13541();
		}
		if (this.field8313[0] != arg3 || this.field8313[1] != arg4 || this.field8313[2] != arg5) {
			this.field8313[0] = arg3;
			this.field8313[1] = arg4;
			this.field8313[2] = arg5;
			this.field8271[0] = -arg3;
			this.field8271[1] = -arg4;
			this.field8271[2] = -arg5;
			float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
			this.field8272[0] = arg3 * var8;
			this.field8272[1] = arg4 * var8;
			this.field8272[2] = arg5 * var8;
			this.field8308[0] = -this.field8272[0];
			this.field8308[1] = -this.field8272[1];
			this.field8308[2] = -this.field8272[2];
			this.method13842();
			this.field8327 = (int) (arg3 * 256.0F / arg4);
			this.field8371 = (int) (arg5 * 256.0F / arg4);
		}
		this.method13543();
	}

	@ObfuscatedName("yk.J(I)V")
	public final void method531(int arg0) {
		this.field8326 = 0;
		while (arg0 > 1) {
			this.field8326++;
			arg0 >>= 0x1;
		}
		this.field8263 = 0x1 << this.field8326;
	}

	@ObfuscatedName("yk.qt()V")
	public final void method13544() {
		if (this.method13489()) {
			this.method13545();
		}
		this.field8323 = this.field8324;
		this.field8324 = 0;
	}

	@ObfuscatedName("yk.ql(IIZ[I)Lhc;")
	public final class239 method13548(int arg0, int arg1, boolean arg2, int[] arg3) {
		return this.method13552(arg0, arg1, arg2, arg3, 0, 0);
	}

	@ObfuscatedName("yk.qp(Lcy;IIZ[B)Lhc;")
	public final class239 method13549(class124 arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
		return this.method13599(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@ObfuscatedName("yk.qf(Lcy;IIZ[F)Lhc;")
	public final class239 method13697(class124 arg0, int arg1, int arg2, boolean arg3, float[] arg4) {
		return this.method13630(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@ObfuscatedName("yk.qs()I")
	public final int method13556() {
		return this.field8253;
	}

	@ObfuscatedName("yk.qk(I)V")
	public final void method13629(int arg0) {
		if (this.field8253 != arg0) {
			this.field8253 = arg0;
			this.method13719();
		}
	}

	@ObfuscatedName("yk.qg(Lip;)V")
	public final void method13557(class254 arg0) {
		if (this.field8330[this.field8253] == arg0) {
			return;
		}
		this.field8330[this.field8253] = arg0;
		if (arg0 == null) {
			this.field8312.method4527();
		} else {
			arg0.method4527();
		}
		this.field8374 &= 0xFFFFFFFE;
	}

	@ObfuscatedName("yk.rk(I)V")
	public final void method13791(int arg0) {
		switch(arg0) {
			case 0:
				this.method13632(class253.field2574, class253.field2574);
				break;
			case 1:
				this.method13632(class253.field2573, class253.field2573);
				break;
			case 2:
				this.method13632(class253.field2577, class253.field2573);
				break;
			case 3:
				this.method13632(class253.field2575, class253.field2574);
				break;
			case 4:
				this.method13632(class253.field2576, class253.field2576);
		}
	}

	@ObfuscatedName("yk.ry(Lhi;Lhi;)V")
	public final void method13632(class253 arg0, class253 arg1) {
		boolean var3 = false;
		if (this.field8333[this.field8253] != arg0) {
			this.field8333[this.field8253] = arg0;
			this.method13779();
			var3 = true;
		}
		if (this.field8356[this.field8253] != arg1) {
			this.field8356[this.field8253] = arg1;
			this.method13572();
			var3 = true;
		}
		if (var3) {
			this.field8374 &= 0xFFFFFFF2;
		}
	}

	@ObfuscatedName("yk.rd(ILhp;)V")
	public final void method13560(int arg0, class249 arg1) {
		this.method13561(arg0, arg1, false, false);
	}

	@ObfuscatedName("yk.ri(ILhp;)V")
	public final void method13562(int arg0, class249 arg1) {
		this.method13563(arg0, arg1, false);
	}

	@ObfuscatedName("yk.rm(I)V")
	public void method13621(int arg0) {
		if (this.field8335 != arg0) {
			this.field8335 = arg0;
			this.method13569();
		}
	}

	@ObfuscatedName("yk.rj()Lka;")
	public final class320 method13565() {
		return this.field8331[this.field8253];
	}

	@ObfuscatedName("yk.rw()Lka;")
	public final class320 method13566() {
		return this.field8331[this.field8253];
	}

	@ObfuscatedName("yk.rc(Lhr;)V")
	public final void method13567(class250 arg0) {
		this.field8306[this.field8253] = arg0;
		this.method13568();
	}

	@ObfuscatedName("yk.rh()V")
	public final void method13741() {
		if (this.field8306[this.field8253] != class250.field2550) {
			this.field8306[this.field8253] = class250.field2550;
			this.field8331[this.field8253].method5453();
			this.method13568();
		}
	}

	@ObfuscatedName("yk.rt()V")
	public final void method13568() {
		this.method13570();
	}

	@ObfuscatedName("yk.rz()Ldk;")
	public class137 method13573() {
		return this.field8360;
	}

	@ObfuscatedName("yk.dw(ILdk;)V")
	public final void method503(int arg0, class137 arg1) {
		this.field8236 = arg0;
		this.field8360 = arg1;
		this.field8274 = true;
	}

	@ObfuscatedName("yk.di(ILdk;)V")
	public final void method547(int arg0, class137 arg1) {
		if (!this.field8274) {
			throw new RuntimeException("");
		}
		this.field8236 = arg0;
		this.field8360 = arg1;
		if (this.field8249) {
			this.field8344[3].method4133();
			this.field8344[3].method4134();
		}
	}

	@ObfuscatedName("yk.O()V")
	public final void method548() {
		this.field8274 = false;
	}

	@ObfuscatedName("yk.re(I)V")
	public final void method13592(int arg0) {
		if (this.field8370 == arg0) {
			return;
		}
		class248 var2;
		boolean var3;
		boolean var4;
		if (arg0 == 1) {
			var2 = class248.field2543;
			var3 = true;
			var4 = true;
		} else if (arg0 == 2) {
			var2 = class248.field2540;
			var3 = false;
			var4 = true;
		} else if (arg0 == 128) {
			var2 = class248.field2541;
			var3 = true;
			var4 = true;
		} else {
			var2 = class248.field2542;
			var3 = false;
			var4 = false;
		}
		if (this.field8377 != var3) {
			this.field8377 = var3;
			this.method13633();
		}
		if (this.field8241 != var4) {
			this.field8241 = var4;
			this.method13701();
		}
		if (this.field8369 != var2) {
			this.field8369 = var2;
			this.method13576();
		}
		this.field8370 = arg0;
		this.field8374 &= 0xFFFFFFF3;
	}

	@ObfuscatedName("yk.rg(I)V")
	public final void method13575(int arg0) {
		if (this.field8399 != arg0) {
			this.field8399 = arg0;
			this.method13576();
		}
	}

	@ObfuscatedName("yk.rq(Z)V")
	public final void method13578(boolean arg0) {
		if (this.field8361 != arg0) {
			this.field8361 = arg0;
			this.method13581();
			this.field8374 &= 0xFFFFFFF0;
		}
	}

	@ObfuscatedName("yk.c(III)V")
	public final void method532(int arg0, int arg1, int arg2) {
		if (this.field8363 == arg0 && this.field8364 == arg1 && this.field8390 == arg2) {
			return;
		}
		this.field8363 = arg0;
		this.field8364 = arg1;
		this.field8390 = arg2;
		this.method13579();
		this.method13581();
	}

	@ObfuscatedName("yk.rv()V")
	public final void method13579() {
		if (this.field8240 != null) {
			this.field8240.method4134();
		}
		this.method13580();
	}

	@ObfuscatedName("yk.DA(ILta;II)V")
	public final void method684(int arg0, class11 arg1, int arg2, int arg3) {
		this.method526(false);
		this.field8315.method1044(0.0F, 0.0F, (float) this.method457().method921(), 0.0F, 0.0F, (float) this.method457().method922(), 0, arg1, arg2, arg3);
		this.method526(true);
	}

	@ObfuscatedName("yk.B(IIIIII)V")
	public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field8305) {
			this.method526(false);
			this.field8278.method2502(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method526(true);
		} else {
			this.field8278.method2502(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
	}

	@ObfuscatedName("yk.bl(IIIIII)V")
	public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var8 = arg2 - 1;
		int var9 = arg3 - 1;
		byte var7 = 0;
		if (this instanceof class899) {
			var7 = -1;
		}
		this.method825(arg0, arg1 + var7, arg0 + var8, arg1 + var7, arg4, arg5);
		this.method825(arg0, arg1 + var9 + var7, arg0 + var8, arg1 + var9 + var7, arg4, arg5);
		this.method825(arg0, arg1, arg0, arg1 + var9, arg4, arg5);
		this.method825(arg0 + var8, arg1, arg0 + var8, arg1 + var9, arg4, arg5);
	}

	@ObfuscatedName("yk.N(IIIIII[BII)V")
	public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("yk.bk(IIFIIFIIFIIII)V")
	public final void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
	}

	@ObfuscatedName("yk.CA(IIIII)V")
	public final void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
	}

	@ObfuscatedName("yk.XA(IIIII)V")
	public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method825(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@ObfuscatedName("yk.G(IIIII)V")
	public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method825(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@ObfuscatedName("yk.bs(IIIIII)V")
	public final void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method499(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@ObfuscatedName("yk.bd(IIIIIIIII)V")
	public void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		float var12;
		if (var10 == 0.0F && var11 == 0.0F) {
			var12 = 1.0F;
		} else {
			float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
			var12 = var10 * var13;
			var11 *= var13;
		}
		this.method13610();
		class222 var14 = this.field8344[13];
		var14.method4130();
		var14.method4132(arg4);
		this.method13592(arg5);
		var14.method4136();
		this.method13582(false);
		int var15 = arg8 % (arg6 + arg7);
		float var16 = (float) arg6 * var12;
		float var17 = (float) arg6 * var11;
		float var18 = 0.0F;
		float var19 = 0.0F;
		float var20 = var16;
		float var21 = var17;
		if (var15 > arg6) {
			var18 = (float) (arg6 + arg7 - var15) * var12;
			var19 = (float) (arg6 + arg7 - var15) * var11;
		} else {
			var20 = (float) (arg6 - var15) * var12;
			var21 = (float) (arg6 - var15) * var11;
		}
		float var22 = (float) arg0 + var18;
		float var23 = (float) arg1 + var19;
		float var24 = (float) arg7 * var12;
		float var25 = (float) arg7 * var11;
		while (true) {
			if (arg2 > arg0) {
				if (var22 > (float) arg2) {
					break;
				}
				if (var20 + var22 > (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			} else {
				if (var22 < (float) arg2) {
					break;
				}
				if (var20 + var22 < (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			}
			if (arg3 > arg1) {
				if (var23 > (float) arg3) {
					break;
				}
				if (var21 + var23 > (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			} else {
				if (var23 < (float) arg3) {
					break;
				}
				if (var21 + var23 < (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			}
			if (!this.method13832(var22, var23, 0.0F, var20 + var22, var21 + var23, 0.0F)) {
				return;
			}
			this.method13777();
			var22 += var20 + var24;
			var23 += var21 + var25;
			var20 = var16;
			var21 = var17;
		}
		this.method13582(true);
		var14.method4143();
	}

	@ObfuscatedName("yk.bc(IIIIIILta;IIIII)V")
	public void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	}

	@ObfuscatedName("yk.bn(IIIIIILta;II)V")
	public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
	}

	@ObfuscatedName("yk.br(IIIIIII)V")
	public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = (int) ((float) arg0 + 1.0F);
		int var9 = (int) ((float) arg1 + 1.0F);
		int var10 = (int) ((float) arg2 + 1.0F);
		int var11 = (int) ((float) arg3 + 1.0F);
		float var12 = (float) (var10 - var8);
		float var13 = (float) (var11 - var9);
		float var14 = 1.0F / (float) Math.sqrt((double) (var12 * var12 + var13 * var13));
		float var15 = var12 * var14;
		float var16 = var13 * var14;
		int var17 = (int) ((float) var8 - var15);
		int var18 = (int) ((float) var9 - var16);
		float var19 = -var16;
		float var21 = (float) arg5 * 0.5F * var19;
		float var22 = (float) arg5 * 0.5F * var15;
		this.field8278.method2504((float) var17 - var21, (float) var18 - var22, (float) var10 - var21, (float) var11 - var22, (float) var17 + var21, (float) var18 + var22, 0, arg4, arg6);
	}

	@ObfuscatedName("yk.cp(Ldp;)V")
	public final void method733(class128 arg0) {
		this.field8267.method4478(this, arg0);
	}

	@ObfuscatedName("yk.sw()V")
	public final void method13777() {
		this.method13587(0, this.field8385);
		this.method13688(this.field8388);
		this.method13619(class255.field2581, 0, 1);
	}

	@ObfuscatedName("yk.sy()V")
	public final void method13593() {
		this.method13594(class255.field2580, 2);
	}

	@ObfuscatedName("yk.sm(Lir;I)V")
	public final void method13594(class255 arg0, int arg1) {
		this.method13587(0, this.field8328);
		this.method13688(this.field8389);
		this.method13619(arg0, 0, arg1);
	}

	@ObfuscatedName("yk.ss()V")
	public final void method13597() {
		if (this.field8374 == 2) {
			return;
		}
		this.method13610();
		this.method13578(false);
		this.method13539(false);
		this.method13620(false);
		this.method13728(false);
		this.field8374 = 2;
	}

	@ObfuscatedName("yk.sq()V")
	public final void method13598() {
		if (this.field8374 == 8) {
			return;
		}
		this.method13515();
		this.method13578(true);
		this.method13620(true);
		this.method13728(true);
		this.method13592(1);
		this.field8374 = 8;
	}

	@ObfuscatedName("yk.x()Z")
	public abstract boolean method13487();

	@ObfuscatedName("yk.k()Z")
	public abstract boolean method13488();

	@ObfuscatedName("yk.y(Ljava/lang/String;)Lec;")
	public abstract class172 method13490(String arg0);

	@ObfuscatedName("yk.pd()V")
	public abstract void method13493();

	@ObfuscatedName("yk.pe()V")
	public abstract void method13519();

	@ObfuscatedName("yk.pp()V")
	public abstract void method13520();

	@ObfuscatedName("yk.sp(I)V")
	public abstract void method13523(int arg0);

	@ObfuscatedName("yk.py()V")
	public abstract void method13536();

	@ObfuscatedName("yk.pu()V")
	public abstract void method13537();

	@ObfuscatedName("yk.qm()V")
	public abstract void method13540();

	@ObfuscatedName("yk.qi()V")
	public abstract void method13541();

	@ObfuscatedName("yk.qy(Lcy;Ldz;II)Lii;")
	public abstract class257 method13542(class124 arg0, class139 arg1, int arg2, int arg3);

	@ObfuscatedName("yk.qq()V")
	public abstract void method13543();

	@ObfuscatedName("yk.qo()V")
	public abstract void method13545();

	@ObfuscatedName("yk.qr(Lcy;Ldz;)Z")
	public abstract boolean method13546(class124 arg0, class139 arg1);

	@ObfuscatedName("yk.qw(Lcy;Ldz;)Z")
	public abstract boolean method13547(class124 arg0, class139 arg1);

	@ObfuscatedName("yk.qc(Lcy;Ldz;II)Lhc;")
	public abstract class239 method13550(class124 arg0, class139 arg1, int arg2, int arg3);

	@ObfuscatedName("yk.qh(IIZ[III)Lhc;")
	public abstract class239 method13552(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

	@ObfuscatedName("yk.qv(IZ[[I)Lih;")
	public abstract class259 method13553(int arg0, boolean arg1, int[][] arg2);

	@ObfuscatedName("yk.qe(Lcy;IIIZ[B)Lgt;")
	public abstract class225 method13554(class124 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

	@ObfuscatedName("yk.qb()V")
	public abstract void method13558();

	@ObfuscatedName("yk.rs(ILhp;ZZ)V")
	public abstract void method13561(int arg0, class249 arg1, boolean arg2, boolean arg3);

	@ObfuscatedName("yk.rx(ILhp;Z)V")
	public abstract void method13563(int arg0, class249 arg1, boolean arg2);

	@ObfuscatedName("yk.rp()V")
	public abstract void method13569();

	@ObfuscatedName("yk.ru()V")
	public abstract void method13570();

	@ObfuscatedName("yk.rl()V")
	public abstract void method13572();

	@ObfuscatedName("yk.rn()V")
	public abstract void method13576();

	@ObfuscatedName("yk.se()V")
	public abstract void method13580();

	@ObfuscatedName("yk.sd()V")
	public abstract void method13581();

	@ObfuscatedName("yk.so(Z)V")
	public abstract void method13582(boolean arg0);

	@ObfuscatedName("yk.sz(Z)Lhe;")
	public abstract class228 method13584(boolean arg0);

	@ObfuscatedName("yk.sb([Lhu;)Lhy;")
	public abstract class230 method13585(class243[] arg0);

	@ObfuscatedName("yk.sl(ILhe;)V")
	public abstract void method13587(int arg0, class228 arg1);

	@ObfuscatedName("yk.sf(Lin;)V")
	public abstract void method13588(class258 arg0);

	@ObfuscatedName("yk.su(Lin;Lir;IIII)V")
	public abstract void method13595(class258 arg0, class255 arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("yk.sh(Lir;IIII)V")
	public abstract void method13596(class255 arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("yk.qj(Lcy;IIZ[BII)Lhc;")
	public abstract class239 method13599(class124 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6);

	@ObfuscatedName("yk.qd()V")
	public abstract void method13618();

	@ObfuscatedName("yk.sn(Lir;II)V")
	public abstract void method13619(class255 arg0, int arg1, int arg2);

	@ObfuscatedName("yk.qn()V")
	public abstract void method13628();

	@ObfuscatedName("yk.qz(Lcy;IIZ[FII)Lhc;")
	public abstract class239 method13630(class124 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

	@ObfuscatedName("yk.rb()V")
	public abstract void method13633();

	@ObfuscatedName("yk.ro(I)V")
	public abstract void method13637(int arg0);

	@ObfuscatedName("yk.ph(Lka;)V")
	public abstract void method13638(class320 arg0);

	@ObfuscatedName("yk.sa(Lhy;)V")
	public abstract void method13688(class230 arg0);

	@ObfuscatedName("yk.rr()V")
	public abstract void method13701();

	@ObfuscatedName("yk.ra()V")
	public abstract void method13719();

	@ObfuscatedName("yk.oo()F")
	public abstract float method13750();

	@ObfuscatedName("yk.of(Lka;Lka;Lka;)V")
	public abstract void method13764(class320 arg0, class320 arg1, class320 arg2);

	@ObfuscatedName("yk.rf()V")
	public abstract void method13779();

	@ObfuscatedName("yk.st(Z)Lin;")
	public abstract class258 method13797(boolean arg0);

	@ObfuscatedName("yk.qx()V")
	public abstract void method13842();
}
