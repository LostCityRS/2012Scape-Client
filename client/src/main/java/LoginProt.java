import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class LoginProt {

    @ObfuscatedName("jc.u")
    public static final LoginProt field2965 = new LoginProt(14, 0);

    @ObfuscatedName("jc.j")
    public static final LoginProt field2960 = new LoginProt(15, -1);

    @ObfuscatedName("jc.a")
    public static final LoginProt field2961 = new LoginProt(16, -2);

    @ObfuscatedName("jc.s")
    public static final LoginProt field2962 = new LoginProt(19, -2);

    @ObfuscatedName("jc.c")
    public static final LoginProt field2963 = new LoginProt(23, 4);

    @ObfuscatedName("jc.m")
    public static final LoginProt field2964 = new LoginProt(24, -1);

    @ObfuscatedName("jc.t")
    public static final LoginProt field2968 = new LoginProt(26, 0);

    @ObfuscatedName("jc.l")
    public static final LoginProt field2966 = new LoginProt(27, 0);

    @ObfuscatedName("jc.f")
    public static final LoginProt field2959 = new LoginProt(28, -2);

    @ObfuscatedName("jc.d")
    public static final LoginProt field2969 = new LoginProt(29, -2);

    @ObfuscatedName("jc.z")
    public static final LoginProt field2967 = new LoginProt(30, -2);

    @ObfuscatedName("jc.n")
    public final int field2970;

    @ObfuscatedName("jc.o")
    public static final LoginProt[] field2971 = new LoginProt[32];

    static {
        LoginProt[] var0 = method6889();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2971[var0[var1].field2970] = var0[var1];
        }
    }

    @ObfuscatedName("nn.u(I)[Ljc;")
    public static LoginProt[] method6889() {
        return new LoginProt[]{field2963, field2964, field2960, field2961, field2965, field2968, field2966, field2969, field2959, field2967, field2962};
    }

    public LoginProt(int arg0, int arg1) {
        this.field2970 = arg0;
    }
}
