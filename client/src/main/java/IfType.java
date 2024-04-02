
import deob.ObfuscatedName;

@ObfuscatedName("ej")
public class IfType {

	@ObfuscatedName("ej.u")
	public ComType[] field1732;

	@ObfuscatedName("ej.j")
	public ComType[] field1733;

	@ObfuscatedName("ej.a")
	public boolean field1734;

	public IfType(boolean arg0, ComType[] arg1) {
		this.field1732 = arg1;
		this.field1734 = arg0;
	}

	@ObfuscatedName("ej.u(S)[Lew;")
	public ComType[] method3104() {
		return this.field1733 == null ? this.field1732 : this.field1733;
	}

	@ObfuscatedName("ej.j(B)[Lew;")
	public ComType[] method3105() {
		if (this.field1733 == null) {
			int var1 = this.field1732.length;
			this.field1733 = new ComType[var1];
			System.arraycopy(this.field1732, 0, this.field1733, 0, this.field1732.length);
		}
		return this.field1733;
	}

	@ObfuscatedName("ej.a(II)Lew;")
	public ComType method3108(int arg0) {
		if (this.field1732[0].field1764 >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.field1732[arg0 & 0xFFFF];
	}
}
