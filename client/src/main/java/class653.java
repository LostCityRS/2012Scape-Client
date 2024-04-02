
import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("xi")
public class class653 extends class95 implements GlInterfaceRelated {

	@ObfuscatedName("xi.d")
	public int field7515;

	public class653(GlToolkit arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.field7515 = arg1;
	}

	public class653(GlToolkit arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.field7515 = arg1;
	}

	@ObfuscatedName("xi.u()I")
	public int method2231() {
		return this.field1105;
	}

	@ObfuscatedName("xi.j()I")
	public int method2239() {
		return this.field7515;
	}

	@ObfuscatedName("xi.a()J")
	public long method2233() {
		return 0L;
	}

	@ObfuscatedName("xi.o()V")
	public void method2249() {
		this.field1113.method13365(this);
	}

	@ObfuscatedName("xi.s(I[BI)V")
	public void method2234(int arg0, byte[] arg1, int arg2) {
		this.method2250(arg1, arg2);
		this.field7515 = arg0;
	}
}
