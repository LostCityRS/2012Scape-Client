
import deob.ObfuscatedName;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

@ObfuscatedName("ws")
public final class class615 {

	@ObfuscatedName("ws.u")
	public int field7295;

	@ObfuscatedName("ws.j")
	public class980[] field7294 = new class980[16];

	@ObfuscatedName("ws.a")
	public ReferenceQueue field7293 = new ReferenceQueue();

	@ObfuscatedName("ws.u(Ljava/lang/Object;Ljava/lang/Object;I)V")
	public void method12611(Object arg0, Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method12607();
		int var3 = System.identityHashCode(arg0);
		int var4 = var3 & this.field7294.length - 1;
		class980 var5 = this.field7294[var4];
		if (var5 == null) {
			this.field7294[var4] = new class980(arg0, this.field7293, var3, arg1);
			this.field7295++;
			if (this.field7295 >= this.field7294.length) {
				this.method12610();
			}
			return;
		}
		while (var5.get() != arg0) {
			if (var5.field10524 == null) {
				var5.field10524 = new class980(arg0, this.field7293, var3, arg1);
				this.field7295++;
				if (this.field7295 >= this.field7294.length) {
					this.method12610();
				}
				break;
			}
			var5 = var5.field10524;
		}
	}

	@ObfuscatedName("ws.j(Ljava/lang/Object;B)V")
	public void method12608(Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method12607();
		int var2 = System.identityHashCode(arg0);
		int var3 = var2 & this.field7294.length - 1;
		class980 var4 = this.field7294[var3];
		if (var4 == null) {
			return;
		}
		if (var4.get() == arg0) {
			this.field7294[var3] = var4.field10524;
			this.field7295--;
			return;
		}
		while (true) {
			class980 var5 = var4.field10524;
			if (var5 == null) {
				break;
			}
			if (var5.get() == arg0) {
				var4.field10524 = var5.field10524;
				this.field7295--;
				break;
			}
			var4 = var5;
		}
	}

	@ObfuscatedName("ws.a(S)Ljava/util/ArrayList;")
	public ArrayList method12609() {
		this.method12607();
		ArrayList var1 = new ArrayList(this.field7295);
		class980[] var2 = this.field7294;
		for (int var3 = 0; var3 < var2.length; var3++) {
			for (class980 var4 = var2[var3]; var4 != null; var4 = var4.field10524) {
				Object var5 = var4.get();
				if (var5 != null) {
					var1.add(var5);
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("ws.s(B)V")
	public void method12610() {
		class980[] var1 = this.field7294;
		this.field7294 = new class980[var1.length * 2];
		class980[] var2 = var1;
		class980 var5;
		for (int var3 = 0; var3 < var2.length; var3++) {
			for (class980 var4 = var2[var3]; var4 != null; var4 = var5) {
				var5 = var4.field10524;
				int var6 = var4.field10525 & this.field7294.length - 1;
				var4.field10524 = this.field7294[var6];
				this.field7294[var6] = var4;
			}
		}
	}

	@ObfuscatedName("ws.c(I)V")
	public void method12607() {
		while (true) {
			class980 var1 = (class980) this.field7293.poll();
			if (var1 == null) {
				return;
			}
			int var2 = var1.field10525 & this.field7294.length - 1;
			class980 var3 = this.field7294[var2];
			if (var1 == var3) {
				this.field7294[var2] = var1.field10524;
				this.field7295--;
			} else {
				while (var3 != null && var3.field10524 != var1) {
					var3 = var3.field10524;
				}
				if (var3 != null) {
					var3.field10524 = var1.field10524;
					this.field7295--;
				}
			}
		}
	}
}
