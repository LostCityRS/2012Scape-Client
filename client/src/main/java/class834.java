
import deob.ObfuscatedName;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("aec")
public class class834 extends class478 {

	@ObfuscatedName("aec.m")
	public final Queue field9805 = new LinkedList();

	@ObfuscatedName("aec.al(Lajn;I)V")
	public void method15627(class962 arg0) {
		this.field9805.add(arg0);
		if (this.field9805.size() > 10) {
			this.field9805.poll();
		}
	}

	@ObfuscatedName("aec.t(B)V")
	public void method8357() {
		class962 var1 = (class962) this.field9805.poll();
		if (var1 == null) {
			return;
		}
		class792 var2 = class792.method14781(class280.field2956, client.field8975.field834);
		var2.field9467.method15268(var1.method16844() << 1 | var1.method16842() & 0x1);
		var2.field9467.method15278(this.method8354(var1, 65535));
		var2.field9467.method15289(var1.method15182() | var1.method15183() << 16);
		client.field8975.method1913(var2);
		var1.method15186();
	}

	@ObfuscatedName("aec.l(I)Z")
	public boolean method8358() {
		return !this.field9805.isEmpty() || this.field5048 < class153.method5554() - 2000L;
	}

	@ObfuscatedName("aec.f(I)Lada;")
	public class792 method8375() {
		return class792.method14781(class280.field2947, client.field8975.field834);
	}

	@ObfuscatedName("aec.at(Laet;Lajn;I)V")
	public void method15626(class814 arg0, class962 arg1) {
		arg0.method15308(arg1.method16842());
	}

	@ObfuscatedName("aec.c(I)I")
	public int method8355() {
		return 1;
	}

	@ObfuscatedName("aec.m(Laet;Ladv;B)V")
	public void method8356(class814 arg0, class809 arg1) {
		this.method15626(arg0, (class962) arg1);
	}
}
