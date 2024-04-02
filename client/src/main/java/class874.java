
import deob.ObfuscatedName;

@ObfuscatedName("agh")
public class class874 extends AnimationNode {

	@ObfuscatedName("agh.b")
	public boolean field9899 = false;

	@ObfuscatedName("agh.x")
	public PathingEntity field9900;

	public class874(PathingEntity arg0, boolean arg1) {
		super(arg1);
		this.field9900 = arg0;
	}

	@ObfuscatedName("agh.e(Lso;II)V")
	public void method11789(class509 arg0, int arg1) {
		if (!this.field9899 || !this.field9900.field8597.method11767() || this.field9900.field8597.method11776()) {
			Statics.method12343(arg0, arg1, this.field9900);
		}
	}
}
