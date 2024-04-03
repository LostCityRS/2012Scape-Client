import deob.ObfuscatedName;

@ObfuscatedName("jj")
public class JavascriptFunction {

    @ObfuscatedName("jj.u")
    public static final JavascriptFunction field3150 = new JavascriptFunction(12);

    @ObfuscatedName("jj.j")
    public static final JavascriptFunction field3141 = new JavascriptFunction(8);

    @ObfuscatedName("jj.a")
    public static final JavascriptFunction field3142 = new JavascriptFunction(14);

    @ObfuscatedName("jj.s")
    public static final JavascriptFunction field3140 = new JavascriptFunction(15);

    @ObfuscatedName("jj.c")
    public static final JavascriptFunction field3144 = new JavascriptFunction(2);

    @ObfuscatedName("jj.m")
    public static final JavascriptFunction field3153 = new JavascriptFunction(7);

    @ObfuscatedName("jj.t")
    public static final JavascriptFunction field3145 = new JavascriptFunction(11);

    @ObfuscatedName("jj.l")
    public static final JavascriptFunction field3147 = new JavascriptFunction(6);

    @ObfuscatedName("jj.f")
    public static final JavascriptFunction field3148 = new JavascriptFunction(3);

    @ObfuscatedName("jj.d")
    public static final JavascriptFunction field3152 = new JavascriptFunction(1);

    @ObfuscatedName("jj.z")
    public static final JavascriptFunction field3143 = new JavascriptFunction(10);

    @ObfuscatedName("jj.n")
    public static final JavascriptFunction field3151 = new JavascriptFunction(4);

    @ObfuscatedName("jj.o")
    public static final JavascriptFunction field3149 = new JavascriptFunction(5);

    @ObfuscatedName("jj.q")
    public static final JavascriptFunction field3146 = new JavascriptFunction(9);

    @ObfuscatedName("jj.p")
    public static final JavascriptFunction field3154 = new JavascriptFunction(13);

    @ObfuscatedName("jj.w")
    public final int field3155;

    public JavascriptFunction(int arg0) {
        this.field3155 = arg0;
    }

    @ObfuscatedName("jj.u(I)Ljava/lang/String;")
    public String method4757() {
        return "_" + this.field3155;
    }

    @ObfuscatedName("jj.j([Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method4758(Object[] arg0) throws Throwable {
        return BrowserControl.method12168(Statics.field6387, this.method4757(), arg0);
    }

    @ObfuscatedName("jj.a(I)Ljava/lang/Object;")
    public Object method4759() throws Throwable {
        return BrowserControl.method12167(Statics.field6387, this.method4757());
    }

    @ObfuscatedName("jj.s([Ljava/lang/Object;B)V")
    public void method4763(Object[] arg0) {
        try {
            this.method4758(arg0);
        } catch (Throwable var3) {
        }
    }

    @ObfuscatedName("jj.c(I)V")
    public void method4761() {
        try {
            this.method4759();
        } catch (Throwable var2) {
        }
    }
}
