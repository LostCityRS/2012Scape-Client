
import deob.ObfuscatedName;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@ObfuscatedName("akz")
public class GpuRendererWeakReference extends WeakReference {

	@ObfuscatedName("akz.u")
	public final int field10525;

	@ObfuscatedName("akz.j")
	public GpuRendererWeakReference field10524;

	public GpuRendererWeakReference(Object arg0, ReferenceQueue arg1, int arg2, Object arg3) {
		super(arg0, arg1);
		this.field10525 = arg2;
	}
}
