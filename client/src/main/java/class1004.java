
import deob.ObfuscatedName;
import java.lang.ref.SoftReference;

@ObfuscatedName("alq")
public class class1004 extends class952 {

	@ObfuscatedName("alq.l")
	public SoftReference field10601;

	public class1004(Object arg0, int arg1) {
		super(arg1);
		this.field10601 = new SoftReference(arg0);
	}

	@ObfuscatedName("alq.u(B)Ljava/lang/Object;")
	public Object method16722() {
		return this.field10601.get();
	}

	@ObfuscatedName("alq.j(B)Z")
	public boolean method16724() {
		return true;
	}
}
