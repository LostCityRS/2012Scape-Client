
import deob.ObfuscatedName;

@ObfuscatedName("dn")
public final class CutsceneEntity {

	@ObfuscatedName("dn.j")
	public final int field1559;

	@ObfuscatedName("dn.a")
	public final int field1560;

	@ObfuscatedName("dn.s")
	public boolean field1563 = false;

	@ObfuscatedName("dn.c")
	public NpcEntity field1558 = null;

	@ObfuscatedName("dn.m")
	public PlayerEntity field1562 = null;

	@ObfuscatedName("dn.t")
	public int[] field1564;

	public CutsceneEntity(Packet arg0, int arg1) {
		this.field1559 = arg1;
		int var3 = arg0.method15220();
		switch(var3) {
			case 0:
				this.field1560 = arg0.method15411();
				break;
			case 1:
				this.field1560 = -1;
				break;
			default:
				this.field1560 = -1;
		}
		arg0.method15337();
	}

	@ObfuscatedName("dn.u(IIIIB)V")
	public void method2851(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field1563) {
			this.field1563 = true;
			if (this.field1560 >= 0) {
				this.field1558 = new NpcEntity(client.field8980.method6098(), 25);
				this.field1558.field8593 = this.field1559;
				this.field1558.field8618 = client.field9213;
				this.field1558.method16149(Statics.field3774.method12565(this.field1560));
				this.field1558.method13979(this.field1558.field10075.field7213);
				this.field1558.field8636 = this.field1558.field10075.field7241 << 3;
				this.field1558.field8600 = ++CutsceneManager.field1530 - 1;
			} else {
				this.field1562 = new PlayerEntity(client.field8980.method6098(), 25);
				this.field1562.method16116(Statics.field416);
				this.field1562.field8593 = this.field1559;
				this.field1562.field8618 = client.field9213;
				this.field1562.field8600 = ++CutsceneManager.field1530 - 1;
			}
		}
		if (this.field1560 >= 0) {
			this.field1558.method16153(arg2, arg0, arg1, true, this.field1558.method13954());
			this.field1558.method13946(arg3, true);
		} else {
			this.field1562.field9807 = this.field1562.field9809 = (byte) arg2;
			this.field1562.method16123(arg0, arg1);
			this.field1562.method13946(arg3, true);
		}
	}

	@ObfuscatedName("dn.j(I)V")
	public void method2852() {
		this.field1558 = null;
		this.field1562 = null;
		this.field1563 = false;
	}

	@ObfuscatedName("dn.a(IIII)V")
	public void method2853(int arg0, int arg1, int arg2) {
		if (this.field1558 == null) {
			this.field1562.field9807 = this.field1562.field9809 = (byte) arg0;
			this.field1562.method16123(arg1, arg2);
		} else {
			this.field1558.method16153(arg0, arg1, arg2, true, this.field1558.method13954());
		}
	}

	@ObfuscatedName("dn.s(B)Laay;")
	public PathingEntity method2854() {
		return this.field1558 == null ? this.field1562 : this.field1558;
	}

	@ObfuscatedName("dn.c(I)Z")
	public boolean method2860() {
		if (this.field1560 < 0) {
			return true;
		}
		NPCType var1 = Statics.field3774.method12565(this.field1560);
		boolean var2 = var1.method12513();
		if (this.field1564 == null) {
			BASType var3 = Statics.field3769.method7784(var1.field7217);
			this.field1564 = var3.method7754();
		}
		int[] var4 = this.field1564;
		for (int var5 = 0; var5 < var4.length; var5++) {
			int var6 = var4[var5];
			var2 &= Statics.field566.method11144(var6).method11129();
		}
		return var2;
	}
}
