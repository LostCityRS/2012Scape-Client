
import deob.ObfuscatedName;
import java.math.BigInteger;

@ObfuscatedName("aet")
public class Packet extends Node {

	@ObfuscatedName("aet.s")
	public byte[] field9629;

	@ObfuscatedName("aet.c")
	public int field9626;

	@ObfuscatedName("aet.m")
	public static int[] field9627 = new int[256];

	@ObfuscatedName("aet.l")
	public static long[] field9628;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field9627[var0] = var1;
		}
		field9628 = new long[256];
		for (int var3 = 0; var3 < 256; var3++) {
			long var4 = (long) var3;
			for (int var6 = 0; var6 < 8; var6++) {
				if ((var4 & 0x1L) == 1L) {
					var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var4 >>>= 0x1;
				}
			}
			field9628[var3] = var4;
		}
	}

	@ObfuscatedName("ic.u([BIII)I")
	public static int method4692(byte[] arg0, int arg1, int arg2) {
		int var3 = -1;
		for (int var4 = arg1; var4 < arg2; var4++) {
			var3 = var3 >>> 8 ^ field9627[(var3 ^ arg0[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("pb.j([BIS)I")
	public static int method7834(byte[] arg0, int arg1) {
		return method4692(arg0, 0, arg1);
	}

	public Packet(int arg0) {
		this.field9629 = Statics.method11364(arg0);
		this.field9626 = 0;
	}

	public Packet(byte[] arg0) {
		this.field9629 = arg0;
		this.field9626 = 0;
	}

	@ObfuscatedName("aet.a(I)V")
	public void method15282() {
		if (this.field9629 != null) {
			class532.method7068(this.field9629);
		}
		this.field9629 = null;
	}

	@ObfuscatedName("aet.s(II)V")
	public void method15308(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.c(II)V")
	public void method15287(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.m(II)V")
	public void method15221(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("aet.t(IB)V")
	public void method15222(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.l(II)V")
	public void method15223(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.f(II)V")
	public void method15274(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("aet.d(J)V")
	public void method15234(long arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 32);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.z(J)V")
	public void method15420(long arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 56);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 48);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 40);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 32);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.n(JII)V")
	public void method15227(long arg0, int arg1) {
		int var5 = arg1 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		for (int var4 = var5 * 8; var4 >= 0; var4 -= 8) {
			this.field9629[++this.field9626 - 1] = (byte) (arg0 >> var4);
		}
	}

	@ObfuscatedName("aet.q(Ljava/lang/String;I)V")
	public void method15228(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field9626 += Cp1252.method7770(arg0, 0, arg0.length(), this.field9629, this.field9626);
		this.field9629[++this.field9626 - 1] = 0;
	}

	@ObfuscatedName("zi.x(Ljava/lang/String;B)I")
	public static int method13882(String arg0) {
		return arg0.length() + 2;
	}

	@ObfuscatedName("aet.k(Ljava/lang/String;I)V")
	public void method15229(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field9629[++this.field9626 - 1] = 0;
		this.field9626 += Cp1252.method7770(arg0, 0, arg0.length(), this.field9629, this.field9626);
		this.field9629[++this.field9626 - 1] = 0;
	}

	@ObfuscatedName("aet.h(Ljava/lang/CharSequence;B)V")
	public void method15230(CharSequence arg0) {
		int var2 = class479.method7859(arg0);
		this.field9629[++this.field9626 - 1] = 0;
		this.method15315(var2);
		this.field9626 += class479.method4006(this.field9629, this.field9626, arg0);
	}

	@ObfuscatedName("aet.r([BIIB)V")
	public void method15276(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			this.field9629[++this.field9626 - 1] = arg0[var4];
		}
	}

	@ObfuscatedName("aet.g(II)V")
	public void method15256(int arg0) {
		this.field9629[this.field9626 - arg0 - 4] = (byte) (arg0 >> 24);
		this.field9629[this.field9626 - arg0 - 3] = (byte) (arg0 >> 16);
		this.field9629[this.field9626 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field9629[this.field9626 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.y(II)V")
	public void method15233(int arg0) {
		this.field9629[this.field9626 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field9629[this.field9626 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.e(II)V")
	public void method15251(int arg0) {
		this.field9629[this.field9626 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("aet.ay(II)V")
	public void method15235(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method15308(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method15287(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aet.af(II)V")
	public void method15315(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method15308(arg0 >>> 28 | 0x80);
					}
					this.method15308(arg0 >>> 21 | 0x80);
				}
				this.method15308(arg0 >>> 14 | 0x80);
			}
			this.method15308(arg0 >>> 7 | 0x80);
		}
		this.method15308(arg0 & 0x7F);
	}

	@ObfuscatedName("aet.ar(I)I")
	public int method15220() {
		return this.field9629[++this.field9626 - 1] & 0xFF;
	}

	@ObfuscatedName("aet.an(I)B")
	public byte method15238() {
		return this.field9629[++this.field9626 - 1];
	}

	@ObfuscatedName("aet.ap(I)I")
	public int method15239() {
		this.field9626 += 2;
		return ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + (this.field9629[this.field9626 - 1] & 0xFF);
	}

	@ObfuscatedName("aet.ag(I)I")
	public int method15240() {
		this.field9626 += 2;
		int var1 = ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + (this.field9629[this.field9626 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("aet.as(B)I")
	public int method15241() {
		this.field9626 += 3;
		return (this.field9629[this.field9626 - 1] & 0xFF) + ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + ((this.field9629[this.field9626 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("aet.ai(B)I")
	public int method15242() {
		this.field9626 += 3;
		int var1 = (this.field9629[this.field9626 - 1] & 0xFF) + ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + ((this.field9629[this.field9626 - 3] & 0xFF) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}
		return var1;
	}

	@ObfuscatedName("aet.ao(I)I")
	public int method15379() {
		this.field9626 += 4;
		return (this.field9629[this.field9626 - 1] & 0xFF) + ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + ((this.field9629[this.field9626 - 4] & 0xFF) << 24) + ((this.field9629[this.field9626 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("aet.al(I)I")
	public int method15341() {
		this.field9626 += 4;
		return (this.field9629[this.field9626 - 4] & 0xFF) + ((this.field9629[this.field9626 - 3] & 0xFF) << 8) + ((this.field9629[this.field9626 - 1] & 0xFF) << 24) + ((this.field9629[this.field9626 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("aet.at(B)J")
	public long method15245() {
		long var1 = (long) this.method15220() & 0xFFFFFFFFL;
		long var3 = (long) this.method15379() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("aet.ax(I)J")
	public long method15246() {
		long var1 = (long) this.method15379() & 0xFFFFFFFFL;
		long var3 = (long) this.method15379() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("aet.aw(I)J")
	public long method15247() {
		long var1 = (long) this.method15341() & 0xFFFFFFFFL;
		long var3 = (long) this.method15341() & 0xFFFFFFFFL;
		return (var3 << 32) + var1;
	}

	@ObfuscatedName("aet.aa(II)J")
	public long method15231(int arg0) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		int var2 = var5 * 8;
		long var3 = 0L;
		while (var2 >= 0) {
			var3 |= ((long) this.field9629[++this.field9626 - 1] & 0xFFL) << var2;
			var2 -= 8;
		}
		return var3;
	}

	@ObfuscatedName("aet.am(I)F")
	public float method15324() {
		return Float.intBitsToFloat(this.method15379());
	}

	@ObfuscatedName("aet.ad(B)Ljava/lang/String;")
	public String method15219() {
		if (this.field9629[this.field9626] == 0) {
			this.field9626++;
			return null;
		} else {
			return this.method15337();
		}
	}

	@ObfuscatedName("aet.az(S)Ljava/lang/String;")
	public String method15337() {
		int var1 = this.field9626;
		while (this.field9629[++this.field9626 - 1] != 0) {
		}
		int var2 = this.field9626 - var1 - 1;
		return var2 == 0 ? "" : Cp1252.method6881(this.field9629, var1, var2);
	}

	@ObfuscatedName("aet.ak(S)Ljava/lang/String;")
	public String method15366() {
		byte var1 = this.field9629[++this.field9626 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.field9626;
		while (this.field9629[++this.field9626 - 1] != 0) {
		}
		int var3 = this.field9626 - var2 - 1;
		return var3 == 0 ? "" : Cp1252.method6881(this.field9629, var2, var3);
	}

	@ObfuscatedName("aet.av(B)Ljava/lang/String;")
	public String method15232() {
		byte var1 = this.field9629[++this.field9626 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.method15261();
		if (this.field9626 + var2 > this.field9629.length) {
			throw new IllegalStateException("");
		}
		String var3 = Statics.method2786(this.field9629, this.field9626, var2);
		this.field9626 += var2;
		return var3;
	}

	@ObfuscatedName("aet.aj([BIIB)V")
	public void method15263(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = this.field9629[++this.field9626 - 1];
		}
	}

	@ObfuscatedName("aet.ah(B)I")
	public int method15254() {
		int var1 = this.field9629[this.field9626] & 0xFF;
		return var1 < 128 ? this.method15220() - 64 : this.method15239() - 49152;
	}

	@ObfuscatedName("aet.au(I)I")
	public int method15277() {
		int var1 = this.field9629[this.field9626] & 0xFF;
		return var1 < 128 ? this.method15220() : this.method15239() - 32768;
	}

	@ObfuscatedName("aet.ae(B)I")
	public int method15355() {
		int var1 = this.field9629[this.field9626] & 0xFF;
		return var1 < 128 ? this.method15220() - 1 : this.method15239() - 32769;
	}

	@ObfuscatedName("aet.ac(I)I")
	public int method15258() {
		int var1 = 0;
		int var2;
		for (var2 = this.method15277(); var2 == 32767; var2 = this.method15277()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("aet.aq(B)I")
	public int method15259() {
		return this.field9629[this.field9626] < 0 ? this.method15379() & Integer.MAX_VALUE : this.method15239();
	}

	@ObfuscatedName("aet.ab(B)I")
	public int method15411() {
		if (this.field9629[this.field9626] < 0) {
			return this.method15379() & Integer.MAX_VALUE;
		} else {
			int var1 = this.method15239();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("aet.bq(B)I")
	public int method15261() {
		byte var1 = this.field9629[++this.field9626 - 1];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.field9629[++this.field9626 - 1];
		}
		return var2 | var1;
	}

	@ObfuscatedName("aet.bz([IB)V")
	public void method15262(int[] arg0) {
		int var2 = this.field9626 / 8;
		this.field9626 = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.method15379();
			int var5 = this.method15379();
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
				var6 -= var7;
				var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
			}
			this.field9626 -= 8;
			this.method15223(var4);
			this.method15223(var5);
		}
	}

	@ObfuscatedName("aet.bv([IIII)V")
	public void method15280(int[] arg0, int arg1, int arg2) {
		int var4 = this.field9626;
		this.field9626 = arg1;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method15379();
			int var8 = this.method15379();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
				var9 += var10;
				var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
			}
			this.field9626 -= 8;
			this.method15223(var7);
			this.method15223(var8);
		}
		this.field9626 = var4;
	}

	@ObfuscatedName("aet.bj([IIII)V")
	public void method15336(int[] arg0, int arg1, int arg2) {
		int var4 = this.field9626;
		this.field9626 = arg1;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method15379();
			int var8 = this.method15379();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
			}
			this.field9626 -= 8;
			this.method15223(var7);
			this.method15223(var8);
		}
		this.field9626 = var4;
	}

	@ObfuscatedName("aet.bf(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void method15265(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field9626;
		this.field9626 = 0;
		byte[] var4 = new byte[var3];
		this.method15263(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		this.field9626 = 0;
		this.method15287(var7.length);
		this.method15276(var7, 0, var7.length);
	}

	@ObfuscatedName("aet.bt(IB)I")
	public int method15266(int arg0) {
		int var2 = method4692(this.field9629, arg0, this.field9626);
		this.method15223(var2);
		return var2;
	}

	@ObfuscatedName("aet.bg(I)Z")
	public boolean method15267() {
		this.field9626 -= 4;
		int var1 = method4692(this.field9629, 0, this.field9626);
		int var2 = this.method15379();
		return var1 == var2;
	}

	@ObfuscatedName("aet.bl(II)V")
	public void method15268(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("aet.bk(II)V")
	public void method15269(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) -arg0;
	}

	@ObfuscatedName("aet.bs(IB)V")
	public void method15318(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (128 - arg0);
	}

	@ObfuscatedName("aet.bn(I)I")
	public int method15271() {
		return this.field9629[++this.field9626 - 1] - 128 & 0xFF;
	}

	@ObfuscatedName("aet.ba(B)I")
	public int method15272() {
		return -this.field9629[++this.field9626 - 1] & 0xFF;
	}

	@ObfuscatedName("aet.bd(I)I")
	public int method15273() {
		return 128 - this.field9629[++this.field9626 - 1] & 0xFF;
	}

	@ObfuscatedName("aet.bc(I)B")
	public byte method15392() {
		return (byte) (this.field9629[++this.field9626 - 1] - 128);
	}

	@ObfuscatedName("aet.br(I)B")
	public byte method15275() {
		return (byte) -this.field9629[++this.field9626 - 1];
	}

	@ObfuscatedName("aet.bp(I)B")
	public byte method15329() {
		return (byte) (128 - this.field9629[++this.field9626 - 1]);
	}

	@ObfuscatedName("aet.bi(II)V")
	public void method15293(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("aet.bx(II)V")
	public void method15278(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("aet.bm(II)V")
	public void method15279(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 + 128);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("aet.bb(I)I")
	public int method15248() {
		this.field9626 += 2;
		return ((this.field9629[this.field9626 - 1] & 0xFF) << 8) + (this.field9629[this.field9626 - 2] & 0xFF);
	}

	@ObfuscatedName("aet.be(I)I")
	public int method15281() {
		this.field9626 += 2;
		return ((this.field9629[this.field9626 - 2] & 0xFF) << 8) + (this.field9629[this.field9626 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("aet.bw(I)I")
	public int method15391() {
		this.field9626 += 2;
		return ((this.field9629[this.field9626 - 1] & 0xFF) << 8) + (this.field9629[this.field9626 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("aet.bo(I)I")
	public int method15283() {
		this.field9626 += 2;
		int var1 = ((this.field9629[this.field9626 - 1] & 0xFF) << 8) + (this.field9629[this.field9626 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("aet.bh(I)I")
	public int method15284() {
		this.field9626 += 2;
		int var1 = ((this.field9629[this.field9626 - 1] & 0xFF) << 8) + (this.field9629[this.field9626 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("aet.by(II)V")
	public void method15285(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("aet.bu(I)I")
	public int method15286() {
		this.field9626 += 3;
		return (this.field9629[this.field9626 - 1] & 0xFF) + ((this.field9629[this.field9626 - 2] & 0xFF) << 16) + ((this.field9629[this.field9626 - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("aet.cl(II)V")
	public void method15345(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("aet.cq(II)V")
	public void method15397(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("aet.co(II)V")
	public void method15289(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 16);
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 24);
		this.field9629[++this.field9626 - 1] = (byte) arg0;
		this.field9629[++this.field9626 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("aet.cb(I)I")
	public int method15331() {
		this.field9626 += 4;
		return (this.field9629[this.field9626 - 4] & 0xFF) + ((this.field9629[this.field9626 - 3] & 0xFF) << 8) + ((this.field9629[this.field9626 - 2] & 0xFF) << 16) + ((this.field9629[this.field9626 - 1] & 0xFF) << 24);
	}

	@ObfuscatedName("aet.cm(I)I")
	public int method15342() {
		this.field9626 += 4;
		return (this.field9629[this.field9626 - 3] & 0xFF) + ((this.field9629[this.field9626 - 4] & 0xFF) << 8) + ((this.field9629[this.field9626 - 2] & 0xFF) << 24) + ((this.field9629[this.field9626 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("aet.cw(I)I")
	public int method15311() {
		this.field9626 += 4;
		return (this.field9629[this.field9626 - 2] & 0xFF) + ((this.field9629[this.field9626 - 1] & 0xFF) << 8) + ((this.field9629[this.field9626 - 4] & 0xFF) << 16) + ((this.field9629[this.field9626 - 3] & 0xFF) << 24);
	}

	@ObfuscatedName("aet.cx([BIII)V")
	public void method15292(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = (byte) (this.field9629[++this.field9626 - 1] - 128);
		}
	}
}
