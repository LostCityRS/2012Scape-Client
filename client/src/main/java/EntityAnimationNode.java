
import deob.ObfuscatedName;

@ObfuscatedName("agn")
public class EntityAnimationNode extends AnimationNode {

	@ObfuscatedName("agn.b")
	public GraphEntity field9901;

	public EntityAnimationNode(GraphEntity arg0, boolean arg1) {
		super(arg1);
		this.field9901 = arg0;
	}

	@ObfuscatedName("agn.e(Lso;II)V")
	public void method11789(class509 arg0, int arg1) {
		Statics.method12343(arg0, arg1, this.field9901);
	}
}
