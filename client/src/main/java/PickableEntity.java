
import deob.ObfuscatedName;
import java.util.Stack;

@ObfuscatedName("oz")
public class PickableEntity {

	@ObfuscatedName("oz.u")
	public static Stack field4565 = new Stack();

	@ObfuscatedName("oz.j")
	public GraphEntity field4563;

	@ObfuscatedName("oz.a")
	public boolean field4564;

	@ObfuscatedName("oz.s")
	public PickableEntityList field4562;

	@ObfuscatedName("vu.u(ZI)Loz;")
	public static PickableEntity method12205(boolean arg0) {
		Stack var1 = field4565;
		synchronized (field4565) {
			PickableEntity var2;
			if (field4565.isEmpty()) {
				var2 = new PickableEntity();
			} else {
				var2 = (PickableEntity) field4565.pop();
			}
			var2.field4564 = arg0;
			return var2;
		}
	}

	@ObfuscatedName("cj.j(Loz;B)V")
	public static void method2573(PickableEntity arg0) {
		arg0.field4563 = null;
		Stack var1 = field4565;
		synchronized (field4565) {
			if (field4565.size() < 200) {
				field4565.push(arg0);
			}
		}
	}

	@ObfuscatedName("oz.s(Lra;III)Z")
	public boolean method7568(RendererToolkit arg0, int arg1, int arg2) {
		int var4 = this.field4563.method15633();
		if (this.field4563.field9811 != null) {
			for (int var5 = 0; var5 < this.field4563.field9811.length; var5++) {
				this.field4563.field9811[var5].field1517 <<= var4;
				if (this.field4563.field9811[var5].method2795(this.field4562.field4472 + arg1, this.field4562.field4470 + arg2) && this.field4563.method12814(arg0, arg1, arg2)) {
					this.field4563.field9811[var5].field1517 >>= var4;
					return true;
				}
				this.field4563.field9811[var5].field1517 >>= var4;
			}
		}
		return false;
	}
}
