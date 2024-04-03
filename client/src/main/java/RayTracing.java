import deob.ObfuscatedName;

@ObfuscatedName("kt")
public class RayTracing {

    public RayTracing() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kt.u(Lko;Lko;Lko;F[Lko;)V")
    public static void method5379(Vector3 arg0, Vector3 arg1, Vector3 arg2, float arg3, Vector3[] arg4) {
        Vector3 var5 = Vector3.method5377(arg0, arg2);
        float var6 = Vector3.method5306(var5, var5) - arg3 * arg3;
        float var7 = Vector3.method5306(arg1, var5);
        float var8 = var7 * var7 - var6;
        if (var8 < 0.0F) {
            arg4[1] = null;
            arg4[0] = null;
        } else if (var8 >= 9.765625E-4F) {
            float var10 = (float) Math.sqrt((double) var8);
            arg4[0] = Vector3.method5288();
            arg4[0].method5334(arg0);
            arg4[0].method5299(Vector3.method5317(Vector3.create(arg1), -var7 - var10));
            arg4[1] = Vector3.method5288();
            arg4[1].method5334(arg0);
            arg4[1].method5299(Vector3.method5317(Vector3.create(arg1), -var7 + var10));
        } else {
            arg4[0] = Vector3.method5288();
            arg4[0].method5334(arg0);
            arg4[0].method5299(Vector3.method5317(Vector3.create(arg1), -var7));
            arg4[1] = null;
        }
    }
}
