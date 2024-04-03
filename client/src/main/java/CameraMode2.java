import deob.ObfuscatedName;

@ObfuscatedName("pa")
public class CameraMode2 {

    public CameraMode2() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.u(FLko;Lkn;Lko;Lko;Lko;Lko;FFI)V")
    public static void method1697(float arg0, Vector3 arg1, Quaternion arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, Vector3 arg6, float arg7, float arg8) {
        if (arg3.method5296(arg1)) {
            return;
        }
        Vector3 var9 = Vector3.method5294(0.0F, 0.0F, 0.0F);
        Vector3 var10 = Vector3.create(Vector3.method5377(arg3, arg1));
        var10.method5318(arg2);
        Vector3 var11 = Vector3.method5377(var10, var9);
        float var12 = var11.method5338();
        if (arg7 > 0.0F) {
            arg5 = Vector3.create(arg5);
            arg5.method5357(var12 / arg7 * arg8);
        }
        if (arg5.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var12 > 5120.0F) {
            arg1.method5334(arg3);
            arg4.reset();
            return;
        }
        arg2.method5220();
        Vector3 var13 = Vector3.method5294(1.0F, 0.0F, 0.0F);
        Vector3 var14 = Vector3.method5294(0.0F, 1.0F, 0.0F);
        Vector3 var15 = Vector3.method5294(0.0F, 0.0F, 1.0F);
        var13.method5318(arg2);
        var14.method5318(arg2);
        var15.method5318(arg2);
        Vector3 var16 = Vector3.method5294(Vector3.method5306(var13, arg4), Vector3.method5306(var14, arg4), Vector3.method5306(var15, arg4));
        Vector3 var17 = Vector3.create(var16);
        var17.method5310();
        Vector3 var18 = Vector3.method5315(Vector3.method5312(var17, var17), Vector3.method5317(arg5, 2.0F));
        Vector3 var19 = Vector3.create(var11);
        var19.method5310();
        Vector3 var20 = Vector3.create(var16);
        if (var18.x > var19.x) {
            if (var11.x < 0.0F) {
                var20.x += arg5.x * arg0;
                if (var20.x > 0.0F) {
                    var20.x = 0.0F;
                }
            } else {
                var20.x -= arg5.x * arg0;
                if (var20.x < 0.0F) {
                    var20.x = 0.0F;
                }
            }
        } else if (var17.x < arg6.x) {
            if (var11.x < 0.0F) {
                var20.x -= arg5.x * arg0;
                if (var20.x < -arg6.x) {
                    var20.x = -arg6.x;
                }
            } else {
                var20.x += arg5.x * arg0;
                if (var20.x > arg6.x) {
                    var20.x = arg6.x;
                }
            }
        }
        if (var18.y > var19.y) {
            if (var11.y < 0.0F) {
                var20.y += arg5.y * arg0;
                if (var20.y > 0.0F) {
                    var20.y = 0.0F;
                }
            } else {
                var20.y -= arg5.y * arg0;
                if (var20.y < 0.0F) {
                    var20.y = 0.0F;
                }
            }
        } else if (var17.y < arg6.y) {
            if (var11.y < 0.0F) {
                var20.y -= arg5.y * arg0;
                if (var20.y < -arg6.y) {
                    var20.y = -arg6.y;
                }
            } else {
                var20.y += arg5.y * arg0;
                if (var20.y > arg6.y) {
                    var20.y = arg6.y;
                }
            }
        }
        if (var18.z > var19.z) {
            if (var11.z < 0.0F) {
                var20.z += arg5.z * arg0;
                if (var20.z > 0.0F) {
                    var20.z = 0.0F;
                }
            } else {
                var20.z -= arg5.z * arg0;
                if (var20.z < 0.0F) {
                    var20.z = 0.0F;
                }
            }
        } else if (var17.z < arg6.z) {
            if (var11.z < 0.0F) {
                var20.z -= arg5.z * arg0;
                if (var20.z < -arg6.z) {
                    var20.z = -arg6.z;
                }
            } else {
                var20.z += arg5.z * arg0;
                if (var20.z > arg6.z) {
                    var20.z = arg6.z;
                }
            }
        }
        Vector3 var21 = Vector3.method5317(var13, var20.x);
        var21.method5289(var14, var20.y);
        var21.method5289(var15, var20.z);
        arg4.method5321(var21, 0.8F);
        if (var12 < 10.0F) {
            arg1.method5334(arg3);
            arg4.reset();
        } else {
            arg1.method5299(Vector3.method5317(arg4, arg0));
        }
        var17.release();
        var20.release();
        var19.release();
    }
}
