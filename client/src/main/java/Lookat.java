import deob.ObfuscatedName;

@ObfuscatedName("td")
public abstract class Lookat {

    @ObfuscatedName("td.u")
    public final Camera field6645;

    public Lookat(Camera arg0) {
        this.field6645 = arg0;
    }

    @ObfuscatedName("td.u(FB)V")
    public abstract void method11540(float arg0);

    @ObfuscatedName("td.j(I)Z")
    public abstract boolean method11541();

    @ObfuscatedName("td.c(Laet;I)V")
    public abstract void method11542(Packet arg0);

    @ObfuscatedName("td.s(Lfi;Lkc;III)V")
    public abstract void method11543(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3);

    @ObfuscatedName("td.a(S)Lko;")
    public abstract Vector3 method11550();
}
