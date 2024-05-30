import deob.ObfuscatedName;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("vl")
public class TimeFormatter {

    @ObfuscatedName("vl.u")
    public static final String[][] field7181 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}};

    @ObfuscatedName("vl.a")
    public static Calendar field7180 = Calendar.getInstance();

    @ObfuscatedName("vl.s")
    public static Calendar field7179 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    public TimeFormatter() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("uc.u(JIB)Ljava/lang/String;")
    public static String method11921(long arg0, int arg1) {
        method11113(arg0);
        int var3 = field7180.get(Calendar.DATE);
        int var4 = field7180.get(Calendar.MONTH);
        int var5 = field7180.get(Calendar.YEAR);
        return arg1 == 3 ? method15440(arg0, arg1) : Integer.toString(var3 / 10) + var3 % 10 + "-" + field7181[arg1][var4] + "-" + var5;
    }

    @ObfuscatedName("nn.j(JIZI)Ljava/lang/String;")
    public static String method6888(long arg0, int arg1, boolean arg2) {
        Calendar var4;
        if (arg2) {
            method2425(arg0);
            var4 = field7179;
        } else {
            method11113(arg0);
            var4 = field7180;
        }
        int var5 = var4.get(Calendar.DATE);
        int var6 = var4.get(Calendar.MONTH);
        int var7 = var4.get(Calendar.YEAR);
        int var8 = var4.get(Calendar.HOUR_OF_DAY);
        int var9 = var4.get(Calendar.MINUTE);
        return arg1 == 3 ? method12091(arg0, arg1, arg2) : Integer.toString(var5 / 10) + var5 % 10 + "-" + field7181[arg1][var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
    }

    @ObfuscatedName("un.a(JIZI)Ljava/lang/String;")
    public static String method12091(long arg0, int arg1, boolean arg2) {
        Calendar var4;
        if (arg2) {
            method2425(arg0);
            var4 = field7179;
        } else {
            method11113(arg0);
            var4 = field7180;
        }
        int var5 = var4.get(Calendar.DATE);
        int var6 = var4.get(Calendar.MONTH) + 1;
        int var7 = var4.get(Calendar.YEAR);
        int var8 = var4.get(Calendar.HOUR_OF_DAY);
        int var9 = var4.get(Calendar.MINUTE);
        return Integer.toString(var5 / 10) + var5 % 10 + "/" + var6 / 10 + var6 % 10 + "/" + var7 % 100 / 10 + var7 % 10 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
    }

    @ObfuscatedName("aet.s(JIB)Ljava/lang/String;")
    public static String method15440(long arg0, int arg1) {
        method11113(arg0);
        int var3 = field7180.get(Calendar.DATE);
        int var4 = field7180.get(Calendar.MONTH) + 1;
        int var5 = field7180.get(Calendar.YEAR);
        return Integer.toString(var3 / 10) + var3 % 10 + "/" + var4 / 10 + var4 % 10 + "/" + var5 % 100 / 10 + var5 % 10;
    }

    @ObfuscatedName("uu.c(J)I")
    public static int method12062(long arg0) {
        return (int) (arg0 / 86400000L) - 11745;
    }

    @ObfuscatedName("ch.m(J)V")
    public static void method2425(long arg0) {
        field7179.setTime(new Date(arg0));
    }

    @ObfuscatedName("se.t(J)V")
    public static void method11113(long arg0) {
        field7180.setTime(new Date(arg0));
    }

    @ObfuscatedName("fx.l(II)[I")
    public static int[] method3586(int arg0) {
        int[] var1 = new int[3];
        method11113(method5541(arg0));
        var1[0] = field7180.get(Calendar.DATE);
        var1[1] = field7180.get(Calendar.MONTH);
        var1[2] = field7180.get(Calendar.YEAR);
        return var1;
    }

    @ObfuscatedName("tz.f(IIIIIIB)J")
    public static long method11488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7179.clear();
        field7179.set(arg5, arg4, arg3, arg2, arg1, arg0);
        return field7179.getTime().getTime();
    }

    @ObfuscatedName("kf.d(II)J")
    public static long method5541(int arg0) {
        return (long) (arg0 + 11745) * 86400000L;
    }

    @ObfuscatedName("sh.z(J)I")
    public static int method11221(long arg0) {
        method11113(arg0);
        return field7180.get(Calendar.YEAR);
    }
}
