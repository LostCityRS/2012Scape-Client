
import deob.ObfuscatedName;
import java.util.BitSet;

@ObfuscatedName("adh")
public class ClanChannel extends Node {

	@ObfuscatedName("adh.s")
	public boolean field9433;

	@ObfuscatedName("adh.c")
	public boolean field9428 = true;

	@ObfuscatedName("adh.m")
	public ClanChannelUser[] field9429;

	@ObfuscatedName("adh.t")
	public int field9430 = 0;

	@ObfuscatedName("adh.l")
	public int[] field9431;

	@ObfuscatedName("adh.f")
	public long field9435;

	@ObfuscatedName("adh.d")
	public String field9427 = null;

	@ObfuscatedName("adh.z")
	public byte field9434;

	@ObfuscatedName("adh.n")
	public byte field9432;

	static {
		new BitSet(65536);
	}

	@ObfuscatedName("adh.u(IS)V")
	public void method14978(int arg0) {
		if (this.field9429 == null) {
			this.field9429 = new ClanChannelUser[arg0];
		} else {
			ArrayUtil.method11338(this.field9429, 0, this.field9429 = new ClanChannelUser[arg0], 0, this.field9430);
		}
	}

	public ClanChannel(Packet arg0) {
		this.method14967(arg0);
	}

	@ObfuscatedName("adh.j(I)[I")
	public int[] method14965() {
		if (this.field9431 == null) {
			String[] var1 = new String[this.field9430];
			this.field9431 = new int[this.field9430];
			int var2 = 0;
			while (var2 < this.field9430) {
				var1[var2] = this.field9429[var2].field2343;
				this.field9431[var2] = var2++;
			}
			Algorithms.method8077(var1, this.field9431);
		}
		return this.field9431;
	}

	@ObfuscatedName("adh.a(Lgi;I)V")
	public void method14981(ClanChannelUser arg0) {
		if (this.field9429 == null || this.field9430 >= this.field9429.length) {
			this.method14978(this.field9430 + 5);
		}
		this.field9429[++this.field9430 - 1] = arg0;
		this.field9431 = null;
	}

	@ObfuscatedName("adh.s(IB)V")
	public void method14964(int arg0) {
		this.field9430--;
		if (this.field9430 == 0) {
			this.field9429 = null;
		} else {
			ArrayUtil.method11338(this.field9429, arg0 + 1, this.field9429, arg0, this.field9430 - arg0);
		}
		this.field9431 = null;
	}

	@ObfuscatedName("adh.c(Ljava/lang/String;I)I")
	public int method14963(String arg0) {
		for (int var2 = 0; var2 < this.field9430; var2++) {
			if (this.field9429[var2].field2343.equalsIgnoreCase(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("adh.m(Laet;I)V")
	public void method14967(Packet arg0) {
		int var2 = arg0.method15220();
		if ((var2 & 0x1) != 0) {
			this.field9433 = true;
		}
		if ((var2 & 0x2) != 0) {
			this.field9428 = true;
		}
		this.field4228 = arg0.method15246();
		this.field9435 = arg0.method15246();
		this.field9427 = arg0.method15337();
		arg0.method15220();
		this.field9432 = arg0.method15238();
		this.field9434 = arg0.method15238();
		this.field9430 = arg0.method15239();
		if (this.field9430 <= 0) {
			return;
		}
		this.field9429 = new ClanChannelUser[this.field9430];
		for (int var3 = 0; var3 < this.field9430; var3++) {
			ClanChannelUser var4 = new ClanChannelUser();
			if (this.field9433) {
				arg0.method15246();
			}
			if (this.field9428) {
				var4.field2343 = arg0.method15337();
			}
			var4.field2342 = arg0.method15238();
			var4.field2341 = arg0.method15239();
			this.field9429[var3] = var4;
		}
	}
}
