import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeap;

@ObfuscatedName("ahb")
public class GlHeap extends Heap {

    @ObfuscatedName("ahb.s")
    public NativeHeap field10173;

    public GlHeap(int arg0) {
        this.field10173 = new NativeHeap(arg0);
    }

    @ObfuscatedName("ahb.u()V")
    public void method16226() {
        this.field10173.method71();
    }
}
