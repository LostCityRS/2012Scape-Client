import deob.ObfuscatedName;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("vo")
public class ReflectionCheck {

    @ObfuscatedName("vo.u")
    public static LinkedList queue = new LinkedList();

    public ReflectionCheck() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ux.u(I)V")
    public static void clear() {
        queue = new LinkedList();
    }

    @ObfuscatedName("eb.j(I)Z")
    public static boolean hasCheck() {
        ReflectionCheckNode check = (ReflectionCheckNode) queue.head();
        return check != null;
    }

    @ObfuscatedName("kw.a(Lajl;I)V")
    public static void performCheck(PacketBit buf) {
        ReflectionCheckNode check = (ReflectionCheckNode) queue.head();
        if (check == null) {
            return;
        }
        int start = buf.pos;
        buf.p4(check.id);
        for (int i = 0; i < check.size; i++) {
            if (check.errors[i] == 0) {
                try {
                    int type = check.types[i];
                    if (type == 0) {
                        Field field = check.fieldRequests[i];
                        int value = field.getInt(null);
                        buf.p1(0);
                        buf.p4(value);
                    } else if (type == 1) {
                        Field field = check.fieldRequests[i];
                        field.setInt(null, check.fieldValues[i]);
                        buf.p1(0);
                    } else if (type == 2) {
                        Field field = check.fieldRequests[i];
                        int modifiers = field.getModifiers();
                        buf.p1(0);
                        buf.p4(modifiers);
                    }
                    if (type == 3) {
                        Method method = check.methodRequests[i];
                        byte[][] encodedArguments = check.methodArguments[i];
                        Object[] arguments = new Object[encodedArguments.length];
                        for (int j = 0; j < encodedArguments.length; j++) {
                            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(encodedArguments[j]));
                            arguments[j] = in.readObject();
                        }
                        Object result = method.invoke(null, arguments);
                        if (result == null) {
                            buf.p1(0);
                        } else if (result instanceof Number) {
                            buf.p1(1);
                            buf.p8(((Number) result).longValue());
                        } else if (result instanceof String) {
                            buf.p1(2);
                            buf.pjstr((String) result);
                        } else {
                            buf.p1(4);
                        }
                    } else if (type == 4) {
                        Method method = check.methodRequests[i];
                        int modifiers = method.getModifiers();
                        buf.p1(0);
                        buf.p4(modifiers);
                    }
                } catch (ClassNotFoundException ignore) {
                    buf.p1(-10);
                } catch (InvalidClassException ignore) {
                    buf.p1(-11);
                } catch (StreamCorruptedException ignore) {
                    buf.p1(-12);
                } catch (OptionalDataException ignore) {
                    buf.p1(-13);
                } catch (IllegalAccessException ignore) {
                    buf.p1(-14);
                } catch (IllegalArgumentException ignore) {
                    buf.p1(-15);
                } catch (InvocationTargetException ignore) {
                    buf.p1(-16);
                } catch (SecurityException ignore) {
                    buf.p1(-17);
                } catch (IOException ignore) {
                    buf.p1(-18);
                } catch (NullPointerException ignore) {
                    buf.p1(-19);
                } catch (Exception ignore) {
                    buf.p1(-20);
                } catch (Throwable ignore) {
                    buf.p1(-21);
                }
            } else {
                buf.p1(check.errors[i]);
            }
        }
        buf.addcrc(start);
        check.unlink();
    }

    @ObfuscatedName("dc.s(Laet;II)V")
    public static void push(Packet buf, int length) {
        ReflectionCheckNode check = new ReflectionCheckNode();
        check.size = buf.g1();
        check.id = buf.g4s();
        check.types = new int[check.size];
        check.errors = new int[check.size];
        check.fieldRequests = new Field[check.size];
        check.fieldValues = new int[check.size];
        check.methodRequests = new Method[check.size];
        check.methodArguments = new byte[check.size][][];
        for (int i = 0; i < check.size; i++) {
            try {
                int type = buf.g1();
                if (type == 0 || type == 1 || type == 2) {
                    String className = buf.gjstr();
                    String fieldName = buf.gjstr();
                    int value = 0;
                    if (type == 1) {
                        value = buf.g4s();
                    }
                    check.types[i] = type;
                    check.fieldValues[i] = value;
                    if (Statics.classForName(className).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    check.fieldRequests[i] = Statics.classForName(className).getDeclaredField(fieldName);
                } else if (type == 3 || type == 4) {
                    String className = buf.gjstr();
                    String methodName = buf.gjstr();
                    int parameters = buf.g1();
                    String[] parameterNames = new String[parameters];
                    for (int j = 0; j < parameters; j++) {
                        parameterNames[j] = buf.gjstr();
                    }
                    String var13 = buf.gjstr();
                    byte[][] arguments = new byte[parameters][];
                    if (type == 3) {
                        for (int j = 0; j < parameters; j++) {
                            int len = buf.g4s();
                            arguments[j] = new byte[len];
                            buf.gdata(arguments[j], 0, len);
                        }
                    }
                    check.types[i] = type;
                    Class[] parameterTypes = new Class[parameters];
                    for (int j = 0; j < parameters; j++) {
                        parameterTypes[j] = Statics.classForName(parameterNames[j]);
                    }
                    Class var19 = Statics.classForName(var13);
                    if (Statics.classForName(className).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = Statics.classForName(className).getDeclaredMethods();
                    Method[] var21 = var20;
                    for (int var22 = 0; var22 < var21.length; var22++) {
                        Method var23 = var21[var22];
                        if (var23.getName().equals(methodName)) {
                            Class[] var24 = var23.getParameterTypes();
                            if (parameterTypes.length == var24.length) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < parameterTypes.length; var26++) {
                                    if (parameterTypes[var26] != var24[var26]) {
                                        var25 = false;
                                        break;
                                    }
                                }
                                if (var25 && var19 == var23.getReturnType()) {
                                    check.methodRequests[i] = var23;
                                }
                            }
                        }
                    }
                    check.methodArguments[i] = arguments;
                }
            } catch (ClassNotFoundException ignore) {
                check.errors[i] = -1;
            } catch (SecurityException ignore) {
                check.errors[i] = -2;
            } catch (NullPointerException ignore) {
                check.errors[i] = -3;
            } catch (Exception ignore) {
                check.errors[i] = -4;
            } catch (Throwable ignore) {
                check.errors[i] = -5;
            }
        }
        queue.addTail(check);
    }
}
