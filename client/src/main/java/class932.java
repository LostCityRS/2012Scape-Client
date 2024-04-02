
import deob.ObfuscatedName;

@ObfuscatedName("aiw")
public class class932 extends class789 {

	// $FF: synthetic field
	public final class220 this$0;

	@ObfuscatedName("aiw.s")
	public int field10214;

	@ObfuscatedName("aiw.c")
	public byte field10213;

	@ObfuscatedName("aiw.m")
	public int field10215;

	@ObfuscatedName("aiw.t")
	public String field10216;

	public class932(class220 arg0) {
		this.this$0 = arg0;
		this.field10214 = -1;
	}

	@ObfuscatedName("aiw.u(Laet;B)V")
	public void method14985(class814 arg0) {
		this.field10214 = arg0.method15239();
		this.field10213 = arg0.method15238();
		this.field10215 = arg0.method15239();
		arg0.method15246();
		this.field10216 = arg0.method15337();
	}

	@ObfuscatedName("aiw.j(Ladh;B)V")
	public void method14986(class788 arg0) {
		class217 var2 = arg0.field9429[this.field10214];
		var2.field2342 = this.field10213;
		var2.field2341 = this.field10215;
		var2.field2343 = this.field10216;
	}
}
