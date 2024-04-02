
import deob.ObfuscatedName;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

@ObfuscatedName("ake")
public class class990 extends class894 {

	@ObfuscatedName("ake.j")
	public final Canvas field10556;

	@ObfuscatedName("ake.a")
	public final OpenGL field10554;

	@ObfuscatedName("ake.s")
	public final long field10553;

	@ObfuscatedName("ake.c")
	public int field10555;

	@ObfuscatedName("ake.m")
	public int field10557;

	public class990(GlxToolkit arg0, Canvas arg1) {
		this(arg0, arg1, arg0.field10029.prepareSurface(arg1));
	}

	public class990(GlxToolkit arg0, Canvas arg1, long arg2) {
		super(arg0);
		this.field10556 = arg1;
		this.field10554 = arg0.field10029;
		this.field10553 = arg2;
		this.method16969();
	}

	@ObfuscatedName("ake.u()I")
	public int method921() {
		return this.field10555;
	}

	@ObfuscatedName("ake.j()I")
	public int method922() {
		return this.field10557;
	}

	@ObfuscatedName("ake.ar(II)V")
	public void method923(int arg0, int arg1) {
		this.field10554.surfaceResized(this.field10553);
		this.method16969();
		super.method923(arg0, arg1);
	}

	@ObfuscatedName("ake.n()V")
	public void method16969() {
		Dimension var1 = this.field10556.getSize();
		this.field10557 = var1.height;
		this.field10555 = var1.width;
	}

	@ObfuscatedName("ake.ay()I")
	public int method918() {
		this.field10554.swapBuffers(this.field10553);
		return 0;
	}

	@ObfuscatedName("ake.af(II)I")
	public int method919(int arg0, int arg1) {
		return 0;
	}

	@ObfuscatedName("ake.s()Z")
	public boolean method954() {
		return this.field10554.setSurface(this.field10553) && super.method954();
	}

	@ObfuscatedName("ake.c()Z")
	public boolean method925() {
		return true;
	}

	@ObfuscatedName("ake.a()V")
	public void method944() {
		this.field10554.releaseSurface(this.field10556, this.field10553);
	}
}
