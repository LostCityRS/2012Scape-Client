import deob.ObfuscatedName;

import java.nio.ByteBuffer;
import java.util.Vector;

@ObfuscatedName("hh")
public class GpuPostProcessManager {

    @ObfuscatedName("hh.u")
    public GpuToolkit field2431;

    @ObfuscatedName("hh.j")
    public Framebuffer field2426;

    @ObfuscatedName("hh.a")
    public Framebuffer field2435;

    @ObfuscatedName("hh.s")
    public GpuTextureRelated1 field2428;

    @ObfuscatedName("hh.c")
    public GpuTextureRelated1 field2429;

    @ObfuscatedName("hh.m")
    public GpuTextureRelated1 field2430;

    @ObfuscatedName("hh.t")
    public GraphicsDeletable field2442;

    @ObfuscatedName("hh.l")
    public GraphicsDeletable field2432;

    @ObfuscatedName("hh.f")
    public GraphicsDeletable field2433;

    @ObfuscatedName("hh.d")
    public GraphicsDeletable field2425;

    @ObfuscatedName("hh.z")
    public EffectInterface field2437;

    @ObfuscatedName("hh.n")
    public EffectInterface field2427;

    @ObfuscatedName("hh.o")
    public int field2436;

    @ObfuscatedName("hh.q")
    public int field2438;

    @ObfuscatedName("hh.p")
    public DataType field2439;

    @ObfuscatedName("hh.w")
    public boolean field2434;

    @ObfuscatedName("hh.b")
    public Vector field2441 = new Vector();

    @ObfuscatedName("hh.x")
    public VertexBuffer field2440;

    @ObfuscatedName("hh.i")
    public VertexDeclaration field2443;

    @ObfuscatedName("hh.v")
    public int field2444 = 0;

    @ObfuscatedName("hh.k")
    public int field2445 = 0;

    public GpuPostProcessManager(GpuToolkit arg0, int arg1, int arg2) {
        this.field2431 = arg0;
        this.field2439 = DataType.field1501;
        this.field2436 = arg1;
        this.field2438 = arg2;
    }

    @ObfuscatedName("hh.u()V")
    public void method4319() {
        if (this.field2440 != null) {
            return;
        }
        this.field2440 = this.field2431.method13584(false);
        this.field2440.method4269(12, 4);
        ByteBuffer var1 = this.field2431.field8244;
        var1.clear();
        var1.putFloat(0.0F);
        var1.putFloat(1.0F);
        var1.putFloat(2.0F);
        this.field2440.method4452(0, var1.position(), this.field2431.field8245);
        this.field2443 = this.field2431.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(VertexDeclarationElementComponent.field2482)});
    }

    @ObfuscatedName("hh.j()V")
    public void method4314() {
        this.field2431.method13587(0, this.field2440);
        this.field2431.method13688(this.field2443);
        this.field2431.method13619(class255.field2582, 0, 1);
    }

    @ObfuscatedName("hh.a()V")
    public void method4315() {
        this.method4319();
        switch (this.field2444) {
            case 0:
                this.field2439 = DataType.field1501;
                break;
            case 1:
                this.field2439 = DataType.field1505;
                break;
            case 2:
                this.field2439 = DataType.field1506;
                break;
            default:
                throw new RuntimeException();
        }
        this.field2435 = this.field2431.method467();
        if (this.field2431.field8383 > 1 && this.field2431.field8381 && this.field2431.field8382) {
            this.field2426 = this.field2431.method467();
            this.field2425 = this.field2431.method468(this.field2436, this.field2438, TextureFormat.field1296, this.field2439, this.field2431.field8383);
            this.field2427 = this.field2431.method541(this.field2436, this.field2438, this.field2431.field8383);
        }
        this.field2428 = this.field2431.method13542(TextureFormat.field1296, this.field2439, this.field2436, this.field2438);
        this.field2442 = this.field2428.method4534(0);
        this.field2429 = this.field2431.method13542(TextureFormat.field1296, this.field2439, this.field2436, this.field2438);
        this.field2432 = this.field2429.method4534(0);
        this.field2430 = this.field2431.method13542(TextureFormat.field1296, this.field2439, this.field2436, this.field2438);
        this.field2433 = this.field2430.method4534(0);
        this.field2437 = this.field2431.method637(this.field2436, this.field2438);
        int var1 = this.field2441.size();
        for (int var2 = 0; var2 < var1; var2++) {
            GpuPostProcessEffect var3 = (GpuPostProcessEffect) this.field2441.elementAt(var2);
            var3.method4283(this.field2436, this.field2438);
        }
    }

    @ObfuscatedName("hh.s(Lho;)Z")
    public boolean method4338(GpuPostProcessEffect arg0) {
        return this.method4330(this.field2441.size(), arg0);
    }

    @ObfuscatedName("hh.c(ILho;)Z")
    public boolean method4330(int arg0, GpuPostProcessEffect arg1) {
        if (!arg1.method4279() && !arg1.method4287()) {
            this.method4318(arg1);
            return true;
        }
        this.field2441.insertElementAt(arg1, arg0);
        arg1.method4283(this.field2436, this.field2438);
        int var3 = arg1.method4306();
        if (var3 > this.field2444) {
            this.field2444 = var3;
        }
        arg1.field2423 = true;
        return true;
    }

    @ObfuscatedName("hh.m(Lho;)V")
    public void method4318(GpuPostProcessEffect arg0) {
        arg0.method4290();
        arg0.field2423 = false;
        this.field2441.removeElement(arg0);
    }

    @ObfuscatedName("hh.t(IIII)Z")
    public boolean method4337(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2441.isEmpty()) {
            return false;
        }
        if (this.field2436 != arg2 || this.field2438 != arg3 || this.field2431.field8383 != this.field2445) {
            this.field2445 = this.field2431.field8383;
            this.field2436 = arg2;
            this.field2438 = arg3;
            this.method4322();
            this.method4315();
        }
        this.field2435.method1206(0, this.field2433);
        if (this.field2437 != null) {
            this.field2435.method1207(this.field2437);
        }
        if (this.field2426 == null) {
            this.field2431.method464(this.field2435);
        } else {
            this.field2426.method1206(0, this.field2425);
            this.field2426.method1207(this.field2427);
            this.field2431.method464(this.field2426);
        }
        this.field2431.method505(3, -16777216);
        this.field2431.method13637(15);
        this.field2431.method13575(0);
        if (!this.field2435.method1208()) {
            throw new RuntimeException("");
        }
        this.field2434 = true;
        return true;
    }

    @ObfuscatedName("hh.l()V")
    public void method4312() {
        if (!this.field2434) {
            return;
        }
        if (this.field2426 != null) {
            this.field2431.method696(this.field2426);
            this.field2431.method464(this.field2435);
            this.field2426.method1210(0, 0, this.field2436, this.field2438, 0, 0, true, this.field2437 != null);
        }
        this.method4321();
        this.field2434 = false;
    }

    @ObfuscatedName("hh.f()V")
    public void method4321() {
        this.field2431.method515(true);
        this.field2431.method13597();
        this.field2431.method13592(0);
        this.field2431.method13791(1);
        this.field2431.method753();
        this.field2435.method1207(null);
        this.field2431.method13659(0, 0);
        int var1 = this.field2441.size();
        this.field2430.method4418();
        for (int var2 = 0; var2 < var1; var2++) {
            GpuPostProcessEffect var3 = (GpuPostProcessEffect) this.field2441.elementAt(var2);
            int var4 = var3.method4286();
            boolean var5 = var1 - 1 == var2;
            for (int var6 = 0; var6 < var4; var6++) {
                if (var5 && var4 - 1 == var6) {
                    this.field2431.method696(this.field2435);
                } else {
                    this.field2435.method1206(0, this.field2432);
                }
                GpuTextureRelated1 var7 = this.field2428;
                if (var6 == 0) {
                    var7 = this.field2430;
                }
                var3.method4284(var6, this.field2435, var7, this.field2437, this.field2430);
                this.method4314();
                var3.method4285(var6);
                GpuTextureRelated1 var8 = this.field2428;
                this.field2428 = this.field2429;
                this.field2429 = var8;
                GraphicsDeletable var9 = this.field2442;
                this.field2442 = this.field2432;
                this.field2432 = var9;
            }
        }
        this.field2431.method13592(1);
        this.field2431.method13791(0);
        this.field2431.method515(false);
    }

    @ObfuscatedName("hh.d()V")
    public void method4322() {
        if (this.field2426 != null) {
            this.field2426.method944();
            this.field2426 = null;
        }
        if (this.field2425 != null) {
            this.field2425.method168();
            this.field2425 = null;
        }
        if (this.field2427 != null) {
            this.field2427.method168();
            this.field2427 = null;
        }
        this.field2435.method944();
        this.field2442.method168();
        this.field2432.method168();
        this.field2433.method168();
        this.field2428.method168();
        this.field2429.method168();
        this.field2430.method168();
        this.field2437.method168();
        int var1 = this.field2441.size();
        for (int var2 = 0; var2 < var1; var2++) {
            GpuPostProcessEffect var3 = (GpuPostProcessEffect) this.field2441.elementAt(var2);
            var3.method4290();
        }
    }
}
