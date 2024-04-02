
import deob.ObfuscatedName;
import java.awt.Component;

@ObfuscatedName("ob")
public abstract class Mouse {

	@ObfuscatedName("qp.u(Ljava/awt/Component;ZB)Lob;")
	public static Mouse method8198(Component arg0, boolean arg1) {
		return new JavaMouse(arg0, arg1);
	}

	@ObfuscatedName("vt.j(II)V")
	public static void method12209(int arg0) {
		JavaMouseEvent.method1351(arg0);
	}

	@ObfuscatedName("ob.t(B)Z")
	public boolean method7248() {
		return this.method7250() || this.method7251() || this.method7252();
	}

	@ObfuscatedName("ob.a(I)V")
	public abstract void method7249();

	@ObfuscatedName("ob.s(B)Z")
	public abstract boolean method7250();

	@ObfuscatedName("ob.c(I)Z")
	public abstract boolean method7251();

	@ObfuscatedName("ob.m(B)Z")
	public abstract boolean method7252();

	@ObfuscatedName("ob.l(I)I")
	public abstract int method7254();

	@ObfuscatedName("ob.f(I)I")
	public abstract int method7255();

	@ObfuscatedName("ob.d(B)Ladv;")
	public abstract BasicMouseEvent method7256();

	@ObfuscatedName("ob.z(I)V")
	public abstract void method7257();
}
