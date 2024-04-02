
import deob.ObfuscatedName;
import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

@ObfuscatedName("abi")
public class class748 extends class300 implements class259 {

	@ObfuscatedName("abi.m")
	public final int field8817;

	public class748(class898 arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, class124.field1296, class139.field1501, arg2 && arg0.field9995, arg1 * arg1 * 6);
		this.field8817 = arg1;
		if (this.field3328) {
			this.field3325 = IDirect3DDevice.CreateCubeTexture(this.field3326.field9975, this.field8817, 0, 1024, 21, 1);
		} else {
			this.field3325 = IDirect3DDevice.CreateCubeTexture(this.field3326.field9975, this.field8817, 1, 0, 21, 1);
		}
		ByteBuffer var5 = this.field3326.field8244;
		for (int var6 = 0; var6 < 6; var6++) {
			var5.clear();
			var5.asIntBuffer().put(arg3[var6]);
			IDirect3DCubeTexture.Upload(this.field3325, var6, 0, 0, 0, this.field8817, this.field8817, this.field8817 * 4, 0, this.field3326.field8245);
		}
	}

	@ObfuscatedName("abi.au()V")
	public void method4527() {
		this.field3326.method16045(this);
	}

	@ObfuscatedName("abi.s()V")
	public void method168() {
		super.method168();
	}

	@ObfuscatedName("abi.ae(Lhd;)V")
	public void method4525(class241 arg0) {
		super.method4525(arg0);
	}
}
