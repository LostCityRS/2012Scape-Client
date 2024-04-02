
import deob.ObfuscatedName;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@ObfuscatedName("oy")
public class PickableEntityList {

	@ObfuscatedName("oy.u")
	public List field4471 = new LinkedList();

	@ObfuscatedName("oy.j")
	public boolean field4473 = false;

	@ObfuscatedName("oy.a")
	public int field4472 = 0;

	@ObfuscatedName("oy.s")
	public int field4470 = 0;

	public PickableEntityList(boolean arg0) {
		this.field4473 = arg0;
	}

	@ObfuscatedName("oy.u(I)V")
	public void method7384() {
		Iterator var1 = this.field4471.iterator();
		while (var1.hasNext()) {
			PickableEntity var2 = (PickableEntity) var1.next();
			var1.remove();
			PickableEntity.method2573(var2);
		}
	}

	@ObfuscatedName("oy.j(Loz;B)V")
	public void method7390(PickableEntity arg0) {
		GraphEntity var2 = arg0.field4563;
		boolean var3 = true;
		ScreenBoundingBox[] var4 = arg0.field4563.field9811;
		for (int var5 = 0; var5 < var4.length; var5++) {
			if (var4[var5].field1521) {
				var3 = false;
				break;
			}
		}
		if (var3) {
			return;
		}
		arg0.field4562 = this;
		if (this.field4473) {
			Iterator var6 = this.field4471.iterator();
			while (var6.hasNext()) {
				PickableEntity var7 = (PickableEntity) var6.next();
				if (var7.field4563 == var2) {
					var6.remove();
					PickableEntity.method2573(var7);
				}
			}
		}
		ListIterator var8 = this.field4471.listIterator();
		PickableEntity var9;
		do {
			if (!var8.hasNext()) {
				this.field4471.add(arg0);
				return;
			}
			var9 = (PickableEntity) var8.next();
		} while (var2.field9810 < var9.field4563.field9810);
		var8.previous();
		var8.add(arg0);
	}
}
