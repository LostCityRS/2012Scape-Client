
import deob.ObfuscatedName;

@ObfuscatedName("ace")
public final class ServerKeyProperties extends Node {

	@ObfuscatedName("ace.z")
	public static final ServerKeyProperties field9419 = new ServerKeyProperties(0, -1);

	@ObfuscatedName("ace.n")
	public final int field9416;

	@ObfuscatedName("ace.o")
	public final int field9423;

	public ServerKeyProperties(int arg0, int arg1) {
		this.field9416 = arg0;
		this.field9423 = arg1;
	}

	@ObfuscatedName("ace.u(S)Z")
	public final boolean method14927() {
		return (this.field9416 & 0x1) != 0;
	}

	@ObfuscatedName("ace.j(IB)Z")
	public final boolean method14948(int arg0) {
		return (this.field9416 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("ace.a(I)I")
	public final int method14928() {
		return method15568(this.field9416);
	}

	@ObfuscatedName("aey.s(II)I")
	public static final int method15568(int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@ObfuscatedName("ace.c(I)I")
	public final int method14946() {
		return this.field9416 >> 18 & 0x7;
	}

	@ObfuscatedName("ace.m(I)Z")
	public final boolean method14930() {
		return (this.field9416 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("ace.t(I)Z")
	public final boolean method14931() {
		return (this.field9416 >> 22 & 0x1) != 0;
	}

	@ObfuscatedName("ace.l(B)Z")
	public final boolean method14933() {
		return (this.field9416 >> 23 & 0x1) != 0;
	}
}
