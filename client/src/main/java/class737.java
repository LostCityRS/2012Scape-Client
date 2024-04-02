
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

@ObfuscatedName("abp")
public class class737 extends class300 implements class225 {

	@ObfuscatedName("abp.m")
	public final int field8779;

	@ObfuscatedName("abp.t")
	public final int field8780;

	@ObfuscatedName("abp.l")
	public final int field8781;

	public class737(DxToolkit arg0, class124 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, arg1, class139.field1501, false, arg2 * arg3 * arg4);
		this.field8779 = arg2;
		this.field8780 = arg3;
		this.field8781 = arg4;
		this.field3325 = IDirect3DDevice.CreateVolumeTexture(this.field3326.field9975, arg2, arg3, arg4, 1, 0, DxToolkit.method16037(arg1, this.field3329), 1);
		ByteBuffer var8 = this.field3326.field8244;
		var8.clear();
		var8.put(arg6);
		IDirect3DVolumeTexture.Upload(this.field3325, 0, 0, 0, 0, this.field8779, this.field8780, this.field8781, arg1.field1306 * this.field8779, 0, this.field3326.field8245);
	}

	@ObfuscatedName("abp.bg()J")
	public long method4923() {
		return this.field3325;
	}

	@ObfuscatedName("abp.au()V")
	public void method4527() {
		this.field3326.method16043(this);
	}

	@ObfuscatedName("abp.ae(Lhd;)V")
	public void method4525(GpuTextureRelated arg0) {
		super.method4525(arg0);
	}

	@ObfuscatedName("abp.s()V")
	public void method168() {
		super.method168();
	}
}
