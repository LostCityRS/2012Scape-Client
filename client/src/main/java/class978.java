
import deob.ObfuscatedName;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("akk")
public class class978 extends AbstractQueue {

	@ObfuscatedName("akk.u")
	public class275[] field10519;

	@ObfuscatedName("akk.j")
	public Map field10518;

	@ObfuscatedName("akk.a")
	public int field10520;

	@ObfuscatedName("akk.s")
	public final Comparator field10521;

	@ObfuscatedName("akk.c")
	public int field10517;

	public class978(int arg0) {
		this(arg0, (Comparator) null);
	}

	public class978(int arg0, Comparator arg1) {
		this.field10517 = 0;
		this.field10519 = new class275[arg0];
		this.field10518 = new HashMap();
		this.field10521 = arg1;
	}

	@ObfuscatedName("akk.u(B)V")
	public void method16917() {
		int var1 = (this.field10519.length << 1) + 1;
		this.field10519 = (class275[]) Arrays.copyOf(this.field10519, var1);
	}

	public int size() {
		return this.field10520;
	}

	public boolean offer(Object arg0) {
		if (this.field10518.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.field10517++;
		int var2 = this.field10520;
		if (var2 >= this.field10519.length) {
			this.method16917();
		}
		this.field10520++;
		if (var2 == 0) {
			this.field10519[0] = new class275(arg0, 0);
			this.field10518.put(arg0, this.field10519[0]);
		} else {
			this.field10519[var2] = new class275(arg0, var2);
			this.field10518.put(arg0, this.field10519[var2]);
			this.method16900(var2);
		}
		return true;
	}

	public Object peek() {
		return this.field10520 == 0 ? null : this.field10519[0].field2774;
	}

	public Object poll() {
		if (this.field10520 == 0) {
			return null;
		}
		this.field10517++;
		Object var1 = this.field10519[0].field2774;
		this.field10518.remove(var1);
		this.field10520--;
		if (this.field10520 == 0) {
			this.field10519[this.field10520] = null;
		} else {
			this.field10519[0] = this.field10519[this.field10520];
			this.field10519[0].field2773 = 0;
			this.field10519[this.field10520] = null;
			this.method16904(0);
		}
		return var1;
	}

	public boolean remove(Object arg0) {
		class275 var2 = (class275) this.field10518.remove(arg0);
		if (var2 == null) {
			return false;
		}
		this.field10517++;
		this.field10520--;
		if (this.field10520 == var2.field2773) {
			this.field10519[this.field10520] = null;
			return true;
		}
		class275 var3 = this.field10519[this.field10520];
		this.field10519[this.field10520] = null;
		this.field10519[var2.field2773] = var3;
		this.field10519[var2.field2773].field2773 = var2.field2773;
		this.method16904(var2.field2773);
		if (this.field10519[var2.field2773] == var3) {
			this.method16900(var2.field2773);
		}
		return true;
	}

	@ObfuscatedName("akk.j(II)V")
	public void method16900(int arg0) {
		class275 var2 = this.field10519[arg0];
		while (arg0 > 0) {
			int var3 = arg0 - 1 >>> 1;
			class275 var4 = this.field10519[var3];
			if (this.field10521 == null) {
				if (((Comparable) var2.field2774).compareTo(var4.field2774) >= 0) {
					break;
				}
			} else if (this.field10521.compare(var2.field2774, var4.field2774) >= 0) {
				break;
			}
			this.field10519[arg0] = var4;
			this.field10519[arg0].field2773 = arg0;
			arg0 = var3;
		}
		this.field10519[arg0] = var2;
		this.field10519[arg0].field2773 = arg0;
	}

	@ObfuscatedName("akk.a(II)V")
	public void method16904(int arg0) {
		class275 var2 = this.field10519[arg0];
		int var3 = this.field10520 >>> 1;
		while (arg0 < var3) {
			int var4 = (arg0 << 1) + 1;
			class275 var5 = this.field10519[var4];
			int var6 = (arg0 << 1) + 2;
			class275 var7 = this.field10519[var6];
			int var8;
			if (this.field10521 == null) {
				if (var6 < this.field10520 && ((Comparable) var5.field2774).compareTo(var7.field2774) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field10520 && this.field10521.compare(var5.field2774, var7.field2774) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.field10521 == null) {
				if (((Comparable) var2.field2774).compareTo(this.field10519[var8].field2774) <= 0) {
					break;
				}
			} else if (this.field10521.compare(var2.field2774, this.field10519[var8].field2774) <= 0) {
				break;
			}
			this.field10519[arg0] = this.field10519[var8];
			this.field10519[arg0].field2773 = arg0;
			arg0 = var8;
		}
		this.field10519[arg0] = var2;
		this.field10519[arg0].field2773 = arg0;
	}

	public boolean contains(Object arg0) {
		return this.field10518.containsKey(arg0);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field10521 == null) {
			Arrays.sort(var1);
		} else {
			Arrays.sort(var1, this.field10521);
		}
		return var1;
	}

	public Iterator iterator() {
		return new class276(this);
	}
}
