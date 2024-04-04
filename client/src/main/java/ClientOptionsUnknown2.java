import deob.ObfuscatedName;

@ObfuscatedName("afe")
public class ClientOptionsUnknown2 extends ClientOption {

    public ClientOptionsUnknown2(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsUnknown2(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afe.z(B)V")
    public void method15883() {
        int var1 = this.field6462.toolkitDefault.getValue();
        if (var1 != 3 && var1 != 5) {
            this.value = 0;
        }
        if (this.field6462.method15462().method11398() < 2) {
            this.value = 0;
        }
        if (this.value != 0 && this.value != 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afe.u(I)I")
    public int getDefault() {
        int var1 = this.field6462.toolkitDefault.getValue();
        return var1 == 3 || var1 == 5 ? 0 : 0;
    }

    @ObfuscatedName("afe.j(IB)I")
    public int canSetValue(int arg0) {
        if (arg0 == 0) {
            return 1;
        } else if (this.field6462.method15462().method11398() < 2) {
            return 3;
        } else {
            int var2 = this.field6462.toolkitDefault.getValue();
            return var2 == 3 || var2 == 5 ? 1 : 3;
        }
    }

    @ObfuscatedName("afe.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afe.n(I)I")
    public int method15884() {
        return this.value;
    }
}
