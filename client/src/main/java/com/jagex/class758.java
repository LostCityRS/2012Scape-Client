package com.jagex;

import deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("abs")
public class class758 extends class337 {

	@ObfuscatedName("abs.b")
	public class411 field8882;

	@ObfuscatedName("abs.m(I)V")
	public void method5741() {
		try {
			this.field8882.method7192();
		} catch (Exception var2) {
		}
		this.field8882 = null;
		this.field3602 += 1113119499;
		this.field3591 = -107951525;
		this.field3601 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@ObfuscatedName("abs.t(I)Z")
	public boolean method5742() {
		if (this.field8882 != null) {
			long var1 = class153.method5554();
			int var3 = (int) (var1 - this.field3599 * -4807432177504247471L);
			this.field3599 = var1 * 5610354289062987697L;
			if (var3 > 200) {
				var3 = 200;
			}
			this.field3598 += var3 * 81189605;
			if (this.field3598 * -982363411 > 30000) {
				try {
					this.field8882.method7192();
				} catch (Exception var29) {
				}
				this.field8882 = null;
			}
		}
		if (this.field8882 == null) {
			return this.method5764() == 0 && this.method5739() == 0;
		}
		try {
			for (class1003 var5 = (class1003) this.field3594.method11756(); var5 != null; var5 = (class1003) this.field3594.method11744()) {
				this.field3597.field9626 = 0;
				this.field3597.method15308(1);
				this.field3597.method15234(var5.field9554 * 4148779780871537789L);
				this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
				this.field3595.method11728(var5);
			}
			for (class1003 var6 = (class1003) this.field3605.method11756(); var6 != null; var6 = (class1003) this.field3605.method11744()) {
				this.field3597.field9626 = 0;
				this.field3597.method15308(0);
				this.field3597.method15234(var6.field9554 * 4148779780871537789L);
				this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
				this.field3596.method11728(var6);
			}
			for (int var7 = 0; var7 < 100; var7++) {
				int var8 = this.field8882.method7189();
				if (var8 < 0) {
					throw new IOException();
				}
				if (var8 == 0) {
					break;
				}
				this.field3598 = 0;
				byte var9 = 0;
				if (this.field3592 == null) {
					var9 = 10;
				} else if (this.field3592.field10600 * -1248349533 == 0) {
					var9 = 1;
				}
				if (var9 > 0) {
					int var10 = var9 - this.field3590.field9626 * 803401371;
					if (var10 > var8) {
						var10 = var8;
					}
					this.field8882.method7196(this.field3590.field9629, this.field3590.field9626 * 803401371, var10);
					if (this.field3601 != 0) {
						for (int var11 = 0; var11 < var10; var11++) {
							this.field3590.field9629[this.field3590.field9626 * 803401371 + var11] ^= this.field3601;
						}
					}
					this.field3590.field9626 += var10 * -1748220013;
					if (this.field3590.field9626 * 803401371 >= var9) {
						if (this.field3592 == null) {
							this.field3590.field9626 = 0;
							int var12 = this.field3590.method15220();
							int var13 = this.field3590.method15379();
							int var14 = this.field3590.method15220();
							int var15 = this.field3590.method15379();
							int var16 = var14 & 0x7F;
							boolean var17 = (var14 & 0x80) != 0;
							long var18 = ((long) var12 << 32) + (long) var13;
							Object var20 = null;
							class1003 var21;
							if (var17) {
								for (var21 = (class1003) this.field3596.method11756(); var21 != null && var21.field9554 * 4148779780871537789L != var18; var21 = (class1003) this.field3596.method11744()) {
								}
							} else {
								for (var21 = (class1003) this.field3595.method11756(); var21 != null && var21.field9554 * 4148779780871537789L != var18; var21 = (class1003) this.field3595.method11744()) {
								}
							}
							if (var21 == null) {
								throw new IOException();
							}
							int var22 = var16 == 0 ? 5 : 9;
							this.field3592 = var21;
							this.field3592.field10599 = new class814(var15 + var22 + this.field3592.field10598);
							this.field3592.field10599.method15308(var16);
							this.field3592.field10599.method15223(var15);
							this.field3592.field10600 = 1461430894;
							this.field3590.field9626 = 0;
						} else if (this.field3592.field10600 * -1248349533 != 0) {
							throw new IOException();
						} else if (this.field3590.field9629[0] == -1) {
							this.field3592.field10600 = -1571843829;
							this.field3590.field9626 = 0;
						} else {
							this.field3592 = null;
						}
					}
				} else {
					int var23 = this.field3592.field10599.field9629.length - this.field3592.field10598;
					int var24 = 512 - this.field3592.field10600 * -1248349533;
					if (var24 > var23 - this.field3592.field10599.field9626 * 803401371) {
						var24 = var23 - this.field3592.field10599.field9626 * 803401371;
					}
					if (var24 > var8) {
						var24 = var8;
					}
					this.field8882.method7196(this.field3592.field10599.field9629, this.field3592.field10599.field9626 * 803401371, var24);
					if (this.field3601 != 0) {
						for (int var25 = 0; var25 < var24; var25++) {
							this.field3592.field10599.field9629[this.field3592.field10599.field9626 * 803401371 + var25] ^= this.field3601;
						}
					}
					this.field3592.field10599.field9626 += var24 * -1748220013;
					this.field3592.field10600 += var24 * -1571843829;
					if (this.field3592.field10599.field9626 * 803401371 == var23) {
						this.field3592.method15142();
						this.field3592.field10352 = false;
						this.field3592 = null;
					} else if (this.field3592.field10600 * -1248349533 == 512) {
						this.field3592.field10600 = 0;
					}
				}
			}
			return true;
		} catch (IOException var30) {
			try {
				this.field8882.method7192();
			} catch (Exception var28) {
			}
			this.field8882 = null;
			this.field3602 += 1113119499;
			this.field3591 = -215903050;
			return this.method5764() == 0 && this.method5739() == 0;
		}
	}

	@ObfuscatedName("abs.l(Ljava/lang/Object;ZI)V")
	public void method5743(Object arg0, boolean arg1) {
		if (this.field8882 != null) {
			try {
				this.field8882.method7192();
			} catch (Exception var10) {
			}
			this.field8882 = null;
		}
		this.field8882 = (class411) arg0;
		this.method14261();
		this.method5744(arg1);
		this.field3590.field9626 = 0;
		this.field3592 = null;
		while (true) {
			class1003 var4 = (class1003) this.field3595.method11729();
			if (var4 == null) {
				while (true) {
					class1003 var5 = (class1003) this.field3596.method11729();
					if (var5 == null) {
						if (this.field3601 != 0) {
							try {
								this.field3597.field9626 = 0;
								this.field3597.method15308(4);
								this.field3597.method15308(this.field3601);
								this.field3597.method15223(0);
								this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
							} catch (IOException var9) {
								try {
									this.field8882.method7192();
								} catch (Exception var8) {
								}
								this.field8882 = null;
								this.field3602 += 1113119499;
								this.field3591 = -215903050;
							}
						}
						this.field3598 = 0;
						this.field3599 = class153.method5554() * 5610354289062987697L;
						return;
					}
					this.field3605.method11728(var5);
				}
			}
			this.field3594.method11728(var4);
		}
	}

	@ObfuscatedName("abs.bq(I)V")
	public void method14261() {
		if (this.field8882 == null) {
			return;
		}
		try {
			this.field3597.field9626 = 0;
			this.field3597.method15308(6);
			this.field3597.method15222(3);
			this.field3597.method15287(0);
			this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
		} catch (IOException var4) {
			try {
				this.field8882.method7192();
			} catch (Exception var3) {
			}
			this.field8882 = null;
			this.field3602 += 1113119499;
			this.field3591 = -215903050;
		}
	}

	@ObfuscatedName("abs.f(ZB)V")
	public void method5744(boolean arg0) {
		if (this.field8882 == null) {
			return;
		}
		try {
			this.field3597.field9626 = 0;
			this.field3597.method15308(arg0 ? 2 : 3);
			this.field3597.method15234(0L);
			this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
		} catch (IOException var5) {
			try {
				this.field8882.method7192();
			} catch (Exception var4) {
			}
			this.field8882 = null;
			this.field3602 += 1113119499;
			this.field3591 = -215903050;
		}
	}

	@ObfuscatedName("abs.d(B)V")
	public void method5745() {
		if (this.field8882 == null) {
			return;
		}
		try {
			this.field3597.field9626 = 0;
			this.field3597.method15308(7);
			this.field3597.method15234(0L);
			this.field8882.method7193(this.field3597.field9629, 0, this.field3597.field9629.length);
		} catch (IOException var4) {
			try {
				this.field8882.method7192();
			} catch (Exception var3) {
			}
			this.field8882 = null;
			this.field3602 += 1113119499;
			this.field3591 = -215903050;
		}
	}

	@ObfuscatedName("abs.z(I)V")
	public void method5777() {
		if (this.field8882 != null) {
			this.field8882.method7192();
		}
	}

	@ObfuscatedName("abs.n(B)V")
	public void method5747() {
		if (this.field8882 != null) {
			this.field8882.method7203();
		}
	}
}
