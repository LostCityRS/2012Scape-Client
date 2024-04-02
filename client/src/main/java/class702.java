
import deob.ObfuscatedName;
import java.util.Arrays;

@ObfuscatedName("zh")
public class class702 extends class150 {

	@ObfuscatedName("zh.j")
	public final int field8493;

	@ObfuscatedName("zh.a")
	public final int field8492;

	@ObfuscatedName("zh.s")
	public final int field8494;

	@ObfuscatedName("zh.c")
	public final int[] field8495;

	public class702(class814 arg0) {
		super(arg0);
		this.field8493 = arg0.method15239();
		this.field8495 = new int[class365.method2553().length];
		this.field8492 = arg0.method15411();
		Arrays.fill(this.field8495, 0, this.field8495.length, this.field8492);
		this.field8494 = arg0.method15379();
	}

	@ObfuscatedName("zh.j(I)V")
	public void method2873() {
		class719 var1 = Statics.field1537[this.field8493].method2854();
		if (this.field8494 == 0) {
			client.method8263(var1, this.field8495, 0, false);
		} else {
			client.method12477(var1, new int[] { this.field8492 }, new int[] { 0 }, new int[] { this.field8494 });
		}
	}

	@ObfuscatedName("zh.s(B)Z")
	public boolean method2883() {
		class509 var1 = Statics.field566.method11144(this.field8492);
		return var1.method11129();
	}
}
