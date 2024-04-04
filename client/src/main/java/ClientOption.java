import deob.ObfuscatedName;

@ObfuscatedName("tb")
public abstract class ClientOption {

    @ObfuscatedName("tb.s")
    public ClientOptions field6462;

    @ObfuscatedName("tb.c")
    public int value;

    public ClientOption(ClientOptions arg0) {
        this.field6462 = arg0;
        this.value = this.getDefault();
    }

    public ClientOption(int arg0, ClientOptions arg1) {
        this.value = arg0;
        this.field6462 = arg1;
    }

    @ObfuscatedName("tb.a(IB)V")
    public void method11388(int arg0) {
        if (this.canSetValue(arg0) != 3) {
            this.setValue(arg0);
        }
    }

    @ObfuscatedName("tb.u(I)I")
    public abstract int getDefault();

    @ObfuscatedName("tb.j(IB)I")
    public abstract int canSetValue(int arg0);

    @ObfuscatedName("tb.s(II)V")
    public abstract void setValue(int arg0);
}
