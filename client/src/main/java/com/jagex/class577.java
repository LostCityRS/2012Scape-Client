package com.jagex;

import deob.ObfuscatedName;
import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("um")
public class class577 {

	@ObfuscatedName("um.j")
	public class576 field6792;

	@ObfuscatedName("um.a")
	public byte[] field6793;

	@ObfuscatedName("um.s")
	public long field6794 = 918362414322076087L;

	@ObfuscatedName("um.c")
	public int field6795;

	@ObfuscatedName("um.m")
	public byte[] field6800;

	@ObfuscatedName("um.t")
	public long field6797 = 4711942960767810149L;

	@ObfuscatedName("um.l")
	public int field6791 = 0;

	@ObfuscatedName("um.f")
	public long field6799;

	@ObfuscatedName("um.d")
	public long field6798;

	@ObfuscatedName("um.z")
	public long field6801;

	@ObfuscatedName("um.n")
	public long field6796;

	public class577(class576 arg0, int arg1, int arg2) throws IOException {
		this.field6792 = arg0;
		this.field6801 = (this.field6798 = arg0.method12077() * 4409138617070843699L) * -6320419225334284127L;
		this.field6793 = new byte[arg1];
		this.field6800 = new byte[arg2];
		this.field6799 = 0L;
	}

	@ObfuscatedName("um.u(B)V")
	public void method12097() throws IOException {
		this.method12101();
		this.field6792.method12076();
	}

	@ObfuscatedName("um.j(J)V")
	public void method12109(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.field6799 = arg0 * -7252138411791333143L;
	}

	@ObfuscatedName("um.a(I)J")
	public long method12096() {
		return this.field6801 * -6597773001463207141L;
	}

	@ObfuscatedName("um.s([BI)V")
	public void method12099(byte[] arg0) throws IOException {
		this.method12095(arg0, 0, arg0.length);
	}

	@ObfuscatedName("um.c([BIIB)V")
	public void method12095(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.field6797 * 1828702160574257299L != -1L && this.field6799 * -7257770405880721575L >= this.field6797 * 1828702160574257299L && this.field6799 * -7257770405880721575L + (long) arg2 <= this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731)) {
				System.arraycopy(this.field6800, (int) (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L), arg0, arg1, arg2);
				this.field6799 += (long) arg2 * -7252138411791333143L;
				return;
			}
			long var4 = this.field6799 * -7257770405880721575L;
			int var6 = arg1;
			int var7 = arg2;
			if (this.field6799 * -7257770405880721575L >= this.field6794 * 64194722644794361L && this.field6799 * -7257770405880721575L < this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925)) {
				int var8 = (int) ((long) (this.field6795 * 473365925) - (this.field6799 * -7257770405880721575L - this.field6794 * 64194722644794361L));
				if (var8 > arg2) {
					var8 = arg2;
				}
				System.arraycopy(this.field6793, (int) (this.field6799 * -7257770405880721575L - this.field6794 * 64194722644794361L), arg0, arg1, var8);
				this.field6799 += (long) var8 * -7252138411791333143L;
				arg1 += var8;
				arg2 -= var8;
			}
			if (arg2 > this.field6793.length) {
				this.field6792.method12074(this.field6799 * -7257770405880721575L);
				this.field6796 = this.field6799 * -2696943953916274455L;
				while (arg2 > 0) {
					int var9 = this.field6792.method12078(arg0, arg1, arg2);
					if (var9 == -1) {
						break;
					}
					this.field6796 += (long) var9 * -3008640061264956399L;
					this.field6799 += (long) var9 * -7252138411791333143L;
					arg1 += var9;
					arg2 -= var9;
				}
			} else if (arg2 > 0) {
				this.method12100();
				int var10 = arg2;
				if (arg2 > this.field6795 * 473365925) {
					var10 = this.field6795 * 473365925;
				}
				System.arraycopy(this.field6793, 0, arg0, arg1, var10);
				arg1 += var10;
				arg2 -= var10;
				this.field6799 += (long) var10 * -7252138411791333143L;
			}
			if (this.field6797 * 1828702160574257299L != -1L) {
				if (this.field6797 * 1828702160574257299L > this.field6799 * -7257770405880721575L && arg2 > 0) {
					int var11 = (int) (this.field6797 * 1828702160574257299L - this.field6799 * -7257770405880721575L) + arg1;
					if (var11 > arg1 + arg2) {
						var11 = arg1 + arg2;
					}
					while (arg1 < var11) {
						arg0[arg1++] = 0;
						arg2--;
						this.field6799 += -7252138411791333143L;
					}
				}
				long var12 = -1L;
				long var14 = -1L;
				if (this.field6797 * 1828702160574257299L >= var4 && this.field6797 * 1828702160574257299L < (long) var7 + var4) {
					var12 = this.field6797 * 1828702160574257299L;
				} else if (var4 >= this.field6797 * 1828702160574257299L && var4 < this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731)) {
					var12 = var4;
				}
				if (this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731) > var4 && this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731) <= (long) var7 + var4) {
					var14 = this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731);
				} else if ((long) var7 + var4 > this.field6797 * 1828702160574257299L && (long) var7 + var4 <= this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731)) {
					var14 = (long) var7 + var4;
				}
				if (var12 > -1L && var14 > var12) {
					int var16 = (int) (var14 - var12);
					System.arraycopy(this.field6800, (int) (var12 - this.field6797 * 1828702160574257299L), arg0, (int) (var12 - var4) + var6, var16);
					if (var14 > this.field6799 * -7257770405880721575L) {
						arg2 = (int) ((long) arg2 - (var14 - this.field6799 * -7257770405880721575L));
						this.field6799 = var14 * -7252138411791333143L;
					}
				}
			}
		} catch (IOException var18) {
			this.field6796 = 3008640061264956399L;
			throw var18;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("um.m(I)V")
	public void method12100() throws IOException {
		this.field6795 = 0;
		if (this.field6799 * -7257770405880721575L != this.field6796 * -6176101259733861135L) {
			this.field6792.method12074(this.field6799 * -7257770405880721575L);
			this.field6796 = this.field6799 * -2696943953916274455L;
		}
		this.field6794 = this.field6799 * 4563398218570212961L;
		while (this.field6795 * 473365925 < this.field6793.length) {
			int var1 = this.field6793.length - this.field6795 * 473365925;
			if (var1 > 200000000) {
				var1 = 200000000;
			}
			int var2 = this.field6792.method12078(this.field6793, this.field6795 * 473365925, var1);
			if (var2 == -1) {
				break;
			}
			this.field6796 += (long) var2 * -3008640061264956399L;
			this.field6795 += var2 * 1679270445;
		}
	}

	@ObfuscatedName("um.t([BIII)V")
	public void method12102(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (this.field6799 * -7257770405880721575L + (long) arg2 > this.field6801 * -6597773001463207141L) {
				this.field6801 = (this.field6799 * -7257770405880721575L + (long) arg2) * 4911536382666405651L;
			}
			if (this.field6797 * 1828702160574257299L != -1L && (this.field6799 * -7257770405880721575L < this.field6797 * 1828702160574257299L || this.field6799 * -7257770405880721575L > this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731))) {
				this.method12101();
			}
			if (this.field6797 * 1828702160574257299L != -1L && this.field6799 * -7257770405880721575L + (long) arg2 > this.field6797 * 1828702160574257299L + (long) this.field6800.length) {
				int var4 = (int) ((long) this.field6800.length - (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L));
				System.arraycopy(arg0, arg1, this.field6800, (int) (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L), var4);
				this.field6799 += (long) var4 * -7252138411791333143L;
				arg1 += var4;
				arg2 -= var4;
				this.field6791 = this.field6800.length * 1172955613;
				this.method12101();
			}
			if (arg2 > this.field6800.length) {
				if (this.field6799 * -7257770405880721575L != this.field6796 * -6176101259733861135L) {
					this.field6792.method12074(this.field6799 * -7257770405880721575L);
					this.field6796 = this.field6799 * -2696943953916274455L;
				}
				this.field6792.method12075(arg0, arg1, arg2);
				this.field6796 += (long) arg2 * -3008640061264956399L;
				if (this.field6796 * -6176101259733861135L > this.field6798 * 5095369064601213947L) {
					this.field6798 = this.field6796 * -1805769769817511165L;
				}
				long var5 = -1L;
				long var7 = -1L;
				if (this.field6799 * -7257770405880721575L >= this.field6794 * 64194722644794361L && this.field6799 * -7257770405880721575L < this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925)) {
					var5 = this.field6799 * -7257770405880721575L;
				} else if (this.field6794 * 64194722644794361L >= this.field6799 * -7257770405880721575L && this.field6794 * 64194722644794361L < this.field6799 * -7257770405880721575L + (long) arg2) {
					var5 = this.field6794 * 64194722644794361L;
				}
				if (this.field6799 * -7257770405880721575L + (long) arg2 > this.field6794 * 64194722644794361L && this.field6799 * -7257770405880721575L + (long) arg2 <= this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925)) {
					var7 = this.field6799 * -7257770405880721575L + (long) arg2;
				} else if (this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925) > this.field6799 * -7257770405880721575L && this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925) <= this.field6799 * -7257770405880721575L + (long) arg2) {
					var7 = this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925);
				}
				if (var5 > -1L && var7 > var5) {
					int var9 = (int) (var7 - var5);
					System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field6799 * -7257770405880721575L), this.field6793, (int) (var5 - this.field6794 * 64194722644794361L), var9);
				}
				this.field6799 += (long) arg2 * -7252138411791333143L;
			} else if (arg2 > 0) {
				if (this.field6797 * 1828702160574257299L == -1L) {
					this.field6797 = this.field6799 * 58145026544584675L;
				}
				System.arraycopy(arg0, arg1, this.field6800, (int) (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L), arg2);
				this.field6799 += (long) arg2 * -7252138411791333143L;
				if (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L > (long) (this.field6791 * -769294731)) {
					this.field6791 = (int) (this.field6799 * -7257770405880721575L - this.field6797 * 1828702160574257299L) * 1172955613;
				}
			}
		} catch (IOException var11) {
			this.field6796 = 3008640061264956399L;
			throw var11;
		}
	}

	@ObfuscatedName("um.l(I)V")
	public void method12101() throws IOException {
		if (this.field6797 * 1828702160574257299L == -1L) {
			return;
		}
		if (this.field6797 * 1828702160574257299L != this.field6796 * -6176101259733861135L) {
			this.field6792.method12074(this.field6797 * 1828702160574257299L);
			this.field6796 = this.field6797 * 6646222329602391491L;
		}
		this.field6792.method12075(this.field6800, 0, this.field6791 * -769294731);
		this.field6796 += (long) this.field6791 * 549582918332639685L;
		if (this.field6796 * -6176101259733861135L > this.field6798 * 5095369064601213947L) {
			this.field6798 = this.field6796 * -1805769769817511165L;
		}
		long var1 = -1L;
		long var3 = -1L;
		if (this.field6797 * 1828702160574257299L >= this.field6794 * 64194722644794361L && this.field6797 * 1828702160574257299L < this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925)) {
			var1 = this.field6797 * 1828702160574257299L;
		} else if (this.field6794 * 64194722644794361L >= this.field6797 * 1828702160574257299L && this.field6794 * 64194722644794361L < this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731)) {
			var1 = this.field6794 * 64194722644794361L;
		}
		if (this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731) > this.field6794 * 64194722644794361L && this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731) <= this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925)) {
			var3 = this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731);
		} else if (this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925) > this.field6797 * 1828702160574257299L && this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925) <= this.field6797 * 1828702160574257299L + (long) (this.field6791 * -769294731)) {
			var3 = this.field6794 * 64194722644794361L + (long) (this.field6795 * 473365925);
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			System.arraycopy(this.field6800, (int) (var1 - this.field6797 * 1828702160574257299L), this.field6793, (int) (var1 - this.field6794 * 64194722644794361L), var5);
		}
		this.field6797 = 4711942960767810149L;
		this.field6791 = 0;
	}
}
