import deob.ObfuscatedName;

@ObfuscatedName("kd")
public class SplineRelated {

    @ObfuscatedName("kd.u")
    public final Vector3[] field3483 = new Vector3[4];

    @ObfuscatedName("kd.j")
    public float field3482;

    @ObfuscatedName("kd.a")
    public float[] field3481;

    public SplineRelated() {
        for (int var1 = 0; var1 < 4; var1++) {
            this.field3483[var1] = new Vector3();
        }
        this.method5491();
    }

    @ObfuscatedName("kd.u()V")
    public void method5491() {
        this.field3482 = -1.0F;
        this.field3481 = null;
    }

    @ObfuscatedName("kd.j(ILko;)V")
    public void method5492(int arg0, Vector3 arg1) {
        this.field3483[arg0].method5334(arg1);
        this.method5491();
    }

    @ObfuscatedName("kd.a(I)Lko;")
    public Vector3 method5493(int arg0) {
        return this.field3483[arg0];
    }

    @ObfuscatedName("kd.s(F)Lko;")
    public Vector3 method5490(float arg0) {
        Vector3 var2 = new Vector3();
        float var3 = arg0 * arg0;
        float var4 = arg0 * var3;
        float var5 = (this.field3483[1].x - this.field3483[0].x) * 3.0F;
        float var6 = (this.field3483[2].x - this.field3483[1].x) * 3.0F - var5;
        float var7 = this.field3483[3].x - this.field3483[0].x - var5 - var6;
        var2.x = arg0 * var5 + var3 * var6 + var4 * var7 + this.field3483[0].x;
        float var8 = (this.field3483[1].field3476 - this.field3483[0].field3476) * 3.0F;
        float var9 = (this.field3483[2].field3476 - this.field3483[1].field3476) * 3.0F - var8;
        float var10 = this.field3483[3].field3476 - this.field3483[0].field3476 - var8 - var9;
        var2.field3476 = arg0 * var8 + var3 * var9 + var4 * var10 + this.field3483[0].field3476;
        float var11 = (this.field3483[1].z - this.field3483[0].z) * 3.0F;
        float var12 = (this.field3483[2].z - this.field3483[1].z) * 3.0F - var11;
        float var13 = this.field3483[3].z - this.field3483[0].z - var11 - var12;
        var2.z = arg0 * var11 + var3 * var12 + var4 * var13 + this.field3483[0].z;
        return var2;
    }

    @ObfuscatedName("kd.c()F")
    public float method5495() {
        if (this.field3482 == -1.0F) {
            this.method5497();
        }
        return this.field3482;
    }

    @ObfuscatedName("kd.m(F)F")
    public float method5494(float arg0) {
        if (this.field3482 == -1.0F) {
            this.method5497();
        }
        if (arg0 <= 0.0F) {
            return 0.0F;
        } else if (arg0 >= this.field3482) {
            return 1.0F;
        } else {
            float var2 = 0.0F;
            float var3 = this.field3481[0];
            for (int var4 = 0; var4 < this.field3481.length; var4++) {
                if (arg0 < var3) {
                    float var5 = (arg0 - var2) / (var3 - var2);
                    float var6 = (float) (var4 - 1) / (float) this.field3481.length;
                    float var7 = (float) var4 / (float) this.field3481.length;
                    return (var7 - var6) * var5 + var6;
                }
                var2 = var3;
                var3 += this.field3481[var4];
            }
            float var8 = (arg0 - var2) / (var3 - var2);
            float var9 = (float) (this.field3481.length - 1) / (float) this.field3481.length;
            return (1.0F - var9) * var8 + var9;
        }
    }

    @ObfuscatedName("kd.t()V")
    public void method5497() {
        byte var1 = 20;
        Vector3 var2 = this.method5490(0.0F);
        float var3 = 0.0F;
        for (int var4 = 1; var4 <= var1; var4++) {
            Vector3 var5 = this.method5490((float) var4 / (float) var1);
            var3 += Vector3.method5377(var5, var2).method5338();
            var2 = var5;
        }
        int var6 = (int) (var3 / 20.0F);
        if (var6 < var1) {
            var6 = var1;
        }
        this.field3481 = new float[var6];
        Vector3 var7 = this.method5490(0.0F);
        float var8 = 0.0F;
        for (int var9 = 1; var9 <= var6; var9++) {
            Vector3 var10 = this.method5490((float) var9 / (float) var6);
            float var11 = Vector3.method5377(var10, var7).method5338();
            var8 += var11;
            this.field3481[var9 - 1] = var11;
            var7 = var10;
        }
        this.field3482 = var8;
    }
}
