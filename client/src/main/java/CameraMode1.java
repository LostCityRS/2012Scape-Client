import deob.ObfuscatedName;

@ObfuscatedName("pt")
public class CameraMode1 {

    public CameraMode1() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pd.u(FLko;Lko;Lko;Lko;Lko;FFB)V")
    public static void method7675(float arg0, Vector3 arg1, Vector3 arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, float arg6, float arg7) {
        if (arg2.method5296(arg1)) {
            return;
        }
        Vector3 var8 = Vector3.method5377(arg2, arg1);
        float var9 = var8.method5338();
        if (arg6 > 0.0F) {
            arg4 = Vector3.create(arg4);
            arg4.method5357(var9 / arg6 * arg7);
        }
        if (arg4.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var9 > 5120.0F) {
            arg1.method5334(arg2);
            arg3.method5370();
            return;
        }
        Vector3 var10 = Vector3.create(arg3);
        var10.method5310();
        Vector3 var11 = Vector3.method5315(var10, arg4);
        Vector3 var12 = Vector3.method5312(var10, var11);
        Vector3 var13 = Vector3.create(arg3);
        Vector3 var14 = Vector3.create(var8);
        var14.method5310();
        if (var12.x > var14.x) {
            if (var8.x < 0.0F) {
                var13.x += arg4.x * arg0;
                if (var13.x > 0.0F) {
                    var13.x = 0.0F;
                }
            } else {
                var13.x -= arg4.x * arg0;
                if (var13.x < 0.0F) {
                    var13.x = 0.0F;
                }
            }
        } else if (var10.x < arg5.x) {
            if (var8.x < 0.0F) {
                var13.x -= arg4.x * arg0;
                if (var13.x < -arg5.x) {
                    var13.x = -arg5.x;
                }
            } else {
                var13.x += arg4.x * arg0;
                if (var13.x > arg5.x) {
                    var13.x = arg5.x;
                }
            }
        }
        if (var12.field3476 > var14.field3476) {
            if (var8.field3476 < 0.0F) {
                var13.field3476 += arg4.field3476 * arg0;
                if (var13.field3476 > 0.0F) {
                    var13.field3476 = 0.0F;
                }
            } else {
                var13.field3476 -= arg4.field3476 * arg0;
                if (var13.field3476 < 0.0F) {
                    var13.field3476 = 0.0F;
                }
            }
        } else if (var10.field3476 < arg5.field3476) {
            if (var8.field3476 < 0.0F) {
                var13.field3476 -= arg4.field3476 * arg0;
                if (var13.field3476 < -arg5.field3476) {
                    var13.field3476 = -arg5.field3476;
                }
            } else {
                var13.field3476 += arg4.field3476 * arg0;
                if (var13.field3476 > arg5.field3476) {
                    var13.field3476 = arg5.field3476;
                }
            }
        }
        if (var12.z > var14.z) {
            if (var8.z < 0.0F) {
                var13.z += arg4.z * arg0;
                if (var13.z > 0.0F) {
                    var13.z = 0.0F;
                }
            } else {
                var13.z -= arg4.z * arg0;
                if (var13.z < 0.0F) {
                    var13.z = 0.0F;
                }
            }
        } else if (var10.z < arg5.z) {
            if (var8.z < 0.0F) {
                var13.z -= arg4.z * arg0;
                if (var13.z < -arg5.z) {
                    var13.z = -arg5.z;
                }
            } else {
                var13.z += arg4.z * arg0;
                if (var13.z > arg5.z) {
                    var13.z = arg5.z;
                }
            }
        }
        arg3.method5321(var13, 0.8F);
        if (var9 < 10.0F && arg3.method5338() < 10.0F) {
            arg1.method5334(arg2);
            arg3.method5370();
        } else {
            arg1.method5299(Vector3.method5317(arg3, arg0));
        }
        var10.method5291();
        var13.method5291();
        var14.method5291();
    }
}
