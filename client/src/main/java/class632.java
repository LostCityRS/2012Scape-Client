
import deob.ObfuscatedName;

@ObfuscatedName("wb")
public class class632 {

	@ObfuscatedName("wb.u")
	public class264[] field7395;

	@ObfuscatedName("wb.u(Laet;I)V")
	public void method12719(Packet arg0) {
		this.field7395 = new class264[arg0.method15220()];
		class266[] var2 = class266.method8288();
		for (int var3 = 0; var3 < this.field7395.length; var3++) {
			this.field7395[var3] = this.method12720(arg0, var2[arg0.method15220()]);
		}
	}

	@ObfuscatedName("wb.j(Laet;Lio;B)Lij;")
	public class264 method12720(Packet arg0, class266 arg1) {
		if (class266.field2623 == arg1) {
			return class260.method11849(arg0);
		} else if (class266.field2620 == arg1) {
			return class752.method12157(arg0);
		} else if (class266.field2626 == arg1) {
			return class261.method2548(arg0);
		} else if (class266.field2622 == arg1) {
			return class753.method12717(arg0);
		} else if (class266.field2624 == arg1) {
			return class269.method7324(arg0);
		} else if (class266.field2621 == arg1) {
			return class751.method2607(arg0);
		} else if (class266.field2625 == arg1) {
			return class750.method4623(arg0);
		} else if (class266.field2619 == arg1) {
			return class268.method2822(arg0);
		} else if (class266.field2627 == arg1) {
			return class267.method3522(arg0);
		} else if (class266.field2628 == arg1) {
			return class909.method15894(arg0);
		} else {
			return null;
		}
	}
}
