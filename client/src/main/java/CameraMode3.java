import deob.ObfuscatedName;

@ObfuscatedName("px")
public class CameraMode3 {

    public CameraMode3() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.u(FLko;Lkn;Lko;Lko;Lko;FI)V")
    public static void method3664(float arg0, Vector3 arg1, Quaternion arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, float arg6) {
        if (arg3.method5296(arg1)) {
            return;
        }
        Vector3 var7 = Vector3.create(0.0F, 0.0F, 0.0F);
        Vector3 var8 = Vector3.create(Vector3.method5377(arg3, arg1));
        var8.method5318(arg2);
        Vector3 var9 = Vector3.method5377(var8, var7);
        float var10 = var9.method5338();
        if (arg5.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var10 > 5120.0F) {
            arg1.method5334(arg3);
            arg4.reset();
            return;
        }
        arg2.method5220();
        Vector3 var11 = Vector3.create(1.0F, 0.0F, 0.0F);
        Vector3 var12 = Vector3.create(0.0F, 1.0F, 0.0F);
        Vector3 var13 = Vector3.create(0.0F, 0.0F, 1.0F);
        var11.method5318(arg2);
        var12.method5318(arg2);
        var13.method5318(arg2);
        Vector3 var14 = Vector3.create(Vector3.method5306(var11, arg4), Vector3.method5306(var12, arg4), Vector3.method5306(var13, arg4));
        Vector3 var15 = Vector3.create(var14);
        Vector3 var16 = Vector3.create(arg5.x * var9.x, arg5.y * var9.y, arg5.z * var9.z);
        var15.method5289(var16, arg0);
        var15.method5309(arg6);
        Vector3 var17 = Vector3.method5317(var11, var15.x);
        var17.method5289(var12, var15.y);
        var17.method5289(var13, var15.z);
        arg4.method5334(var17);
        if (var10 < 1.0F) {
            arg1.method5334(arg3);
            arg4.reset();
        } else {
            arg1.method5299(Vector3.method5317(arg4, arg0));
        }
    }
}
