import deob.ObfuscatedName;

@ObfuscatedName("gr")
public class LoadingScreenClear implements LoadingScreenElement {

    @ObfuscatedName("gr.u")
    public final LoadingScreenClearConfig field2326;

    public LoadingScreenClear(LoadingScreenClearConfig arg0) {
        this.field2326 = arg0;
    }

    @ObfuscatedName("gr.j(ZI)V")
    public void method3932(boolean arg0) {
        if (arg0) {
            client.toolkit.B(0, 0, GameShell.canvasWid, GameShell.canvasHei, this.field2326.field2590, 0);
        }
    }

    @ObfuscatedName("gr.u(B)V")
    public void method3936() {
    }

    @ObfuscatedName("gr.a(I)Z")
    public boolean method3931() {
        return true;
    }
}
