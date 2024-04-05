import deob.ObfuscatedName;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("vo")
public class ReflectionChecker {

    @ObfuscatedName("vo.u")
    public static IterableQueue field7044 = new IterableQueue();

    public ReflectionChecker() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ux.u(I)V")
    public static void method11905() {
        field7044 = new IterableQueue();
    }

    @ObfuscatedName("eb.j(I)Z")
    public static boolean hasCheck() {
        ClassCheckNode var0 = (ClassCheckNode) field7044.head();
        return var0 != null;
    }

    @ObfuscatedName("kw.a(Lajl;I)V")
    public static void performCheck(PacketBit arg0) {
        ClassCheckNode var1 = (ClassCheckNode) field7044.head();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.pos;
        arg0.p4(var1.field9740);
        for (int var3 = 0; var3 < var1.field9741; var3++) {
            if (var1.field9738[var3] == 0) {
                try {
                    int var4 = var1.field9737[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field9739[var3];
                        int var6 = var5.getInt(null);
                        arg0.p1(0);
                        arg0.p4(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field9739[var3];
                        var7.setInt(null, var1.field9735[var3]);
                        arg0.p1(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field9739[var3];
                        int var9 = var8.getModifiers();
                        arg0.p1(0);
                        arg0.p4(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field9736[var3];
                        byte[][] var11 = var1.field9742[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke(null, var12);
                        if (var15 == null) {
                            arg0.p1(0);
                        } else if (var15 instanceof Number) {
                            arg0.p1(1);
                            arg0.p8(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.p1(2);
                            arg0.pjstr((String) var15);
                        } else {
                            arg0.p1(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field9736[var3];
                        int var17 = var16.getModifiers();
                        arg0.p1(0);
                        arg0.p4(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.p1(-10);
                } catch (InvalidClassException var31) {
                    arg0.p1(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.p1(-12);
                } catch (OptionalDataException var33) {
                    arg0.p1(-13);
                } catch (IllegalAccessException var34) {
                    arg0.p1(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.p1(-15);
                } catch (InvocationTargetException var36) {
                    arg0.p1(-16);
                } catch (SecurityException var37) {
                    arg0.p1(-17);
                } catch (IOException var38) {
                    arg0.p1(-18);
                } catch (NullPointerException var39) {
                    arg0.p1(-19);
                } catch (Exception var40) {
                    arg0.p1(-20);
                } catch (Throwable var41) {
                    arg0.p1(-21);
                }
            } else {
                arg0.p1(var1.field9738[var3]);
            }
        }
        arg0.addcrc(var2);
        var1.unlink();
    }

    @ObfuscatedName("dc.s(Laet;II)V")
    public static void method2794(Packet arg0, int arg1) {
        ClassCheckNode var2 = new ClassCheckNode();
        var2.field9741 = arg0.g1();
        var2.field9740 = arg0.g4s();
        var2.field9737 = new int[var2.field9741];
        var2.field9738 = new int[var2.field9741];
        var2.field9739 = new Field[var2.field9741];
        var2.field9735 = new int[var2.field9741];
        var2.field9736 = new Method[var2.field9741];
        var2.field9742 = new byte[var2.field9741][][];
        for (int var3 = 0; var3 < var2.field9741; var3++) {
            try {
                int var4 = arg0.g1();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.gjstr();
                    String var6 = arg0.gjstr();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.g4s();
                    }
                    var2.field9737[var3] = var4;
                    var2.field9735[var3] = var7;
                    if (Statics.method16251(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9739[var3] = Statics.method16251(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.gjstr();
                    String var9 = arg0.gjstr();
                    int var10 = arg0.g1();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.gjstr();
                    }
                    String var13 = arg0.gjstr();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.g4s();
                            var14[var15] = new byte[var16];
                            arg0.gdata(var14[var15], 0, var16);
                        }
                    }
                    var2.field9737[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = Statics.method16251(var11[var18]);
                    }
                    Class var19 = Statics.method16251(var13);
                    if (Statics.method16251(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = Statics.method16251(var8).getDeclaredMethods();
                    Method[] var21 = var20;
                    for (int var22 = 0; var22 < var21.length; var22++) {
                        Method var23 = var21[var22];
                        if (var23.getName().equals(var9)) {
                            Class[] var24 = var23.getParameterTypes();
                            if (var17.length == var24.length) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < var17.length; var26++) {
                                    if (var17[var26] != var24[var26]) {
                                        var25 = false;
                                        break;
                                    }
                                }
                                if (var25 && var19 == var23.getReturnType()) {
                                    var2.field9736[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field9742[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field9738[var3] = -1;
            } catch (SecurityException var33) {
                var2.field9738[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field9738[var3] = -3;
            } catch (Exception var35) {
                var2.field9738[var3] = -4;
            } catch (Throwable var36) {
                var2.field9738[var3] = -5;
            }
        }
        field7044.addTail(var2);
    }
}
