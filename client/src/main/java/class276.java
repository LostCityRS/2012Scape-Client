
import deob.ObfuscatedName;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("if")
public class class276 implements Iterator {

	@ObfuscatedName("if.u")
	public class978 field2777;

	@ObfuscatedName("if.j")
	public int field2775 = 0;

	@ObfuscatedName("if.a")
	public int field2776 = this.field2777.field10517;

	public class276(class978 arg0) {
		this.field2777 = arg0;
	}

	public boolean hasNext() {
		return this.field2775 < this.field2777.field10520;
	}

	public Object next() {
		if (this.field2777.field10517 != this.field2776) {
			throw new ConcurrentModificationException();
		} else if (this.field2775 < this.field2777.field10520) {
			Object var1 = this.field2777.field10519[this.field2775].field2774;
			this.field2775++;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
