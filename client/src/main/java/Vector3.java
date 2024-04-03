import deob.ObfuscatedName;

@ObfuscatedName("ko")
public class Vector3 {

    @ObfuscatedName("ko.u")
    public static Vector3[] pool;

    @ObfuscatedName("ko.s")
    public float x;

    @ObfuscatedName("ko.c")
    public float y;

    @ObfuscatedName("ko.m")
    public float z;

    static {
        new Vector3(0.0F, 0.0F, 0.0F);
        pool = new Vector3[0];
    }

    @ObfuscatedName("ko.u(I)V")
    public static void init(int arg0) {
        Statics.poolCapacity = arg0;
        pool = new Vector3[arg0];
        Statics.poolSize = 0;
    }

    @ObfuscatedName("ko.j()Lko;")
    public static Vector3 create() {
        Vector3[] var0 = pool;
        synchronized (pool) {
            if (Statics.poolSize == 0) {
                return new Vector3();
            } else {
                pool[--Statics.poolSize].reset();
                return pool[Statics.poolSize];
            }
        }
    }

    @ObfuscatedName("ko.a(FFF)Lko;")
    public static Vector3 method5294(float arg0, float arg1, float arg2) {
        Vector3[] var3 = pool;
        synchronized (pool) {
            if (Statics.poolSize == 0) {
                return new Vector3(arg0, arg1, arg2);
            } else {
                pool[--Statics.poolSize].method5373(arg0, arg1, arg2);
                return pool[Statics.poolSize];
            }
        }
    }

    @ObfuscatedName("ko.s(Lko;)Lko;")
    public static Vector3 create(Vector3 arg0) {
        Vector3[] var1 = pool;
        synchronized (pool) {
            if (Statics.poolSize == 0) {
                return new Vector3(arg0);
            } else {
                pool[--Statics.poolSize].method5334(arg0);
                return pool[Statics.poolSize];
            }
        }
    }

    @ObfuscatedName("ko.c()V")
    public void release() {
        Vector3[] var1 = pool;
        synchronized (pool) {
            if (Statics.poolSize < Statics.poolCapacity - 1) {
                pool[Statics.poolSize++] = this;
            }
        }
    }

    public Vector3() {
    }

    public Vector3(float arg0, float arg1, float arg2) {
        this.x = arg0;
        this.y = arg1;
        this.z = arg2;
    }

    public Vector3(Vector3 arg0) {
        this.x = arg0.x;
        this.y = arg0.y;
        this.z = arg0.z;
    }

    public Vector3(Packet arg0) {
        this.x = arg0.gFloat();
        this.y = arg0.gFloat();
        this.z = arg0.gFloat();
    }

    @ObfuscatedName("ko.m(Laet;)V")
    public void method5292(Packet arg0) {
        this.x = arg0.gFloat();
        this.y = arg0.gFloat();
        this.z = arg0.gFloat();
    }

    @ObfuscatedName("ko.t(FFF)V")
    public void method5373(float arg0, float arg1, float arg2) {
        this.x = arg0;
        this.y = arg1;
        this.z = arg2;
    }

    @ObfuscatedName("ko.l(Lko;)V")
    public void method5334(Vector3 arg0) {
        this.method5373(arg0.x, arg0.y, arg0.z);
    }

    @ObfuscatedName("ko.f()V")
    public final void reset() {
        this.z = 0.0F;
        this.y = 0.0F;
        this.x = 0.0F;
    }

    @ObfuscatedName("ko.d(Lko;)Z")
    public boolean method5296(Vector3 arg0) {
        return this.x == arg0.x && this.y == arg0.y && this.z == arg0.z;
    }

    @ObfuscatedName("ko.z()V")
    public final void method5329() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    @ObfuscatedName("ko.n()V")
    public final void method5313() {
        float var1 = 1.0F / this.method5338();
        this.x *= var1;
        this.y *= var1;
        this.z *= var1;
    }

    @ObfuscatedName("ko.o(Lko;)V")
    public final void method5299(Vector3 arg0) {
        this.x += arg0.x;
        this.y += arg0.y;
        this.z += arg0.z;
    }

    @ObfuscatedName("ko.q(Lko;F)V")
    public final void method5289(Vector3 arg0, float arg1) {
        this.x += arg0.x * arg1;
        this.y += arg0.y * arg1;
        this.z += arg0.z * arg1;
    }

    @ObfuscatedName("ko.p(Lko;Lko;)Lko;")
    public static final Vector3 method5301(Vector3 arg0, Vector3 arg1) {
        Vector3 var2 = create(arg0);
        var2.method5299(arg1);
        return var2;
    }

    @ObfuscatedName("ko.w(Lko;)V")
    public final void method5302(Vector3 arg0) {
        this.x -= arg0.x;
        this.y -= arg0.y;
        this.z -= arg0.z;
    }

    @ObfuscatedName("ko.b(FFF)V")
    public final void method5346(float arg0, float arg1, float arg2) {
        this.x -= arg0;
        this.y -= arg1;
        this.z -= arg2;
    }

    @ObfuscatedName("ko.x(Lko;Lko;)Lko;")
    public static final Vector3 method5377(Vector3 arg0, Vector3 arg1) {
        Vector3 var2 = create(arg0);
        var2.method5302(arg1);
        return var2;
    }

    @ObfuscatedName("ko.i(Lko;)F")
    public final float method5362(Vector3 arg0) {
        return this.z * arg0.z + this.y * arg0.y + this.x * arg0.x;
    }

    @ObfuscatedName("ko.v(Lko;Lko;)F")
    public static final float method5306(Vector3 arg0, Vector3 arg1) {
        return arg0.method5362(arg1);
    }

    @ObfuscatedName("ko.k(Lko;)V")
    public final void method5307(Vector3 arg0) {
        this.method5373(this.y * arg0.z - this.z * arg0.y, this.z * arg0.x - this.x * arg0.z, this.x * arg0.y - this.y * arg0.x);
    }

    @ObfuscatedName("ko.h(Lko;Lko;)Lko;")
    public static final Vector3 method5308(Vector3 arg0, Vector3 arg1) {
        Vector3 var2 = create(arg0);
        var2.method5307(arg1);
        return var2;
    }

    @ObfuscatedName("ko.r()F")
    public final float method5338() {
        return (float) Math.sqrt((double) (this.z * this.z + this.y * this.y + this.x * this.x));
    }

    @ObfuscatedName("ko.g()V")
    public final void method5310() {
        if (this.x < 0.0F) {
            this.x *= -1.0F;
        }
        if (this.y < 0.0F) {
            this.y *= -1.0F;
        }
        if (this.z < 0.0F) {
            this.z *= -1.0F;
        }
    }

    @ObfuscatedName("ko.y(Lko;)V")
    public final void method5311(Vector3 arg0) {
        this.x *= arg0.x;
        this.y *= arg0.y;
        this.z *= arg0.z;
    }

    @ObfuscatedName("ko.e(Lko;Lko;)Lko;")
    public static final Vector3 method5312(Vector3 arg0, Vector3 arg1) {
        Vector3 var2 = create(arg0);
        var2.method5311(arg1);
        return var2;
    }

    @ObfuscatedName("ko.ay(F)V")
    public final void method5357(float arg0) {
        this.x *= arg0;
        this.y *= arg0;
        this.z *= arg0;
    }

    @ObfuscatedName("ko.af(Lko;)V")
    public final void method5314(Vector3 arg0) {
        this.x /= arg0.x;
        this.y /= arg0.y;
        this.z /= arg0.z;
    }

    @ObfuscatedName("ko.ar(Lko;Lko;)Lko;")
    public static final Vector3 method5315(Vector3 arg0, Vector3 arg1) {
        Vector3 var2 = create(arg0);
        var2.method5314(arg1);
        return var2;
    }

    @ObfuscatedName("ko.an(F)V")
    public final void method5309(float arg0) {
        this.x /= arg0;
        this.y /= arg0;
        this.z /= arg0;
    }

    @ObfuscatedName("ko.ap(Lko;F)Lko;")
    public static final Vector3 method5317(Vector3 arg0, float arg1) {
        Vector3 var2 = create(arg0);
        var2.method5357(arg1);
        return var2;
    }

    @ObfuscatedName("ko.ag(Lkn;)V")
    public final void method5318(Quaternion arg0) {
        Quaternion var2 = Quaternion.method5207(this.x, this.y, this.z, 0.0F);
        Quaternion var3 = Quaternion.method5221(arg0);
        Quaternion var4 = Quaternion.method5228(var3, var2);
        var4.method5266(arg0);
        this.method5373(var4.field3465, var4.field3469, var4.field3470);
        var2.method5209();
        var3.method5209();
        var4.method5209();
    }

    @ObfuscatedName("ko.as(Lkc;)V")
    public final void method5319(Matrix4x3 arg0) {
        float var2 = this.x;
        float var3 = this.y;
        this.x = this.z * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2 + arg0.field3460;
        this.y = this.z * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3 + arg0.field3450;
        this.z = this.z * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2 + arg0.field3458;
    }

    @ObfuscatedName("ko.ai(Lkc;)V")
    public final void method5324(Matrix4x3 arg0) {
        float var2 = this.x;
        float var3 = this.y;
        this.x = this.z * arg0.field3457 + arg0.field3454 * var3 + arg0.field3453 * var2;
        this.y = this.z * arg0.field3461 + arg0.field3452 * var2 + arg0.field3451 * var3;
        this.z = this.z * arg0.field3459 + arg0.field3462 * var3 + arg0.field3456 * var2;
    }

    @ObfuscatedName("ko.ao(Lko;F)V")
    public final void method5321(Vector3 arg0, float arg1) {
        this.method5357(1.0F - arg1);
        this.method5299(method5317(arg0, arg1));
    }

    public String toString() {
        return this.x + ", " + this.y + ", " + this.z;
    }
}
