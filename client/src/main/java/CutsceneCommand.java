import deob.ObfuscatedName;

@ObfuscatedName("xx")
public class CutsceneCommand {

    @ObfuscatedName("xx.u")
    public static final CutsceneCommand field7424 = new CutsceneCommand(6, 0);

    @ObfuscatedName("xx.j")
    public static final CutsceneCommand field7400 = new CutsceneCommand(10, 1);

    @ObfuscatedName("xx.a")
    public static final CutsceneCommand field7408 = new CutsceneCommand(24, 2);

    @ObfuscatedName("xx.s")
    public static final CutsceneCommand field7402 = new CutsceneCommand(18, 3);

    @ObfuscatedName("xx.c")
    public static final CutsceneCommand field7403 = new CutsceneCommand(30, 10);

    @ObfuscatedName("xx.m")
    public static final CutsceneCommand field7430 = new CutsceneCommand(22, 11);

    @ObfuscatedName("xx.t")
    public static final CutsceneCommand field7401 = new CutsceneCommand(23, 12);

    @ObfuscatedName("xx.l")
    public static final CutsceneCommand field7406 = new CutsceneCommand(15, 13);

    @ObfuscatedName("xx.f")
    public static final CutsceneCommand field7431 = new CutsceneCommand(4, 14);

    @ObfuscatedName("xx.d")
    public static final CutsceneCommand field7425 = new CutsceneCommand(19, 15);

    @ObfuscatedName("xx.z")
    public static final CutsceneCommand field7409 = new CutsceneCommand(28, 16);

    @ObfuscatedName("xx.n")
    public static final CutsceneCommand field7410 = new CutsceneCommand(12, 17);

    @ObfuscatedName("xx.o")
    public static final CutsceneCommand field7411 = new CutsceneCommand(3, 20);

    @ObfuscatedName("xx.q")
    public static final CutsceneCommand field7407 = new CutsceneCommand(2, 21);

    @ObfuscatedName("xx.p")
    public static final CutsceneCommand field7413 = new CutsceneCommand(1, 22);

    @ObfuscatedName("xx.w")
    public static final CutsceneCommand field7414 = new CutsceneCommand(7, 30);

    @ObfuscatedName("xx.b")
    public static final CutsceneCommand field7415 = new CutsceneCommand(8, 31);

    @ObfuscatedName("xx.x")
    public static final CutsceneCommand field7416 = new CutsceneCommand(21, 32);

    @ObfuscatedName("xx.i")
    public static final CutsceneCommand field7399 = new CutsceneCommand(0, 33);

    @ObfuscatedName("xx.v")
    public static final CutsceneCommand field7426 = new CutsceneCommand(9, 40);

    @ObfuscatedName("xx.k")
    public static final CutsceneCommand field7427 = new CutsceneCommand(25, 41);

    @ObfuscatedName("xx.h")
    public static final CutsceneCommand field7420 = new CutsceneCommand(13, 42);

    @ObfuscatedName("xx.r")
    public static final CutsceneCommand field7421 = new CutsceneCommand(20, 43);

    @ObfuscatedName("xx.g")
    public static final CutsceneCommand field7422 = new CutsceneCommand(29, 50);

    @ObfuscatedName("xx.y")
    public static final CutsceneCommand field7423 = new CutsceneCommand(11, 51);

    @ObfuscatedName("xx.e")
    public static final CutsceneCommand field7404 = new CutsceneCommand(27, 52);

    @ObfuscatedName("xx.ay")
    public static final CutsceneCommand field7417 = new CutsceneCommand(16, 53);

    @ObfuscatedName("xx.af")
    public static final CutsceneCommand field7419 = new CutsceneCommand(26, 60);

    @ObfuscatedName("xx.ar")
    public static final CutsceneCommand field7405 = new CutsceneCommand(17, 61);

    @ObfuscatedName("xx.an")
    public static final CutsceneCommand field7428 = new CutsceneCommand(14, 70);

    @ObfuscatedName("xx.ap")
    public static final CutsceneCommand field7429 = new CutsceneCommand(5, 255);

    @ObfuscatedName("xx.ag")
    public final int field7412;

    @ObfuscatedName("xx.as")
    public int field7418;

    @ObfuscatedName("af.u(I)[Lxx;")
    public static CutsceneCommand[] method1689() {
        return new CutsceneCommand[]{field7408, field7424, field7420, field7400, field7430, field7416, field7407, field7422, field7402, field7405, field7425, field7406, field7431, field7428, field7399, field7403, field7414, field7417, field7409, field7401, field7410, field7413, field7404, field7427, field7415, field7421, field7429, field7419, field7426, field7423, field7411};
    }

    public CutsceneCommand(int arg0, int arg1) {
        this.field7412 = arg0;
        this.field7418 = arg1;
    }

    @ObfuscatedName("uq.j(IB)Lxx;")
    public static CutsceneCommand method12118(int arg0) {
        CutsceneCommand[] var1 = method1689();
        CutsceneCommand[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            CutsceneCommand var4 = var2[var3];
            if (var4.field7418 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
