import deob.ObfuscatedName;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

@ObfuscatedName("et")
public final class TimeZones {

    @ObfuscatedName("et.j")
    public static final HashMap field1574 = new HashMap();

    static {
        Calendar.getInstance(method2906("Europe/London"));
    }

    public TimeZones() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.u(Ljava/util/Date;Ljava/lang/String;B)Ljava/lang/String;")
    public static String method2901(Date arg0, String arg1) {
        return method2902(arg0, arg1, method2909(), Language.field6376);
    }

    @ObfuscatedName("et.j(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lsn;I)Ljava/lang/String;")
    public static String method2902(Date arg0, String arg1, TimeZone arg2, Language arg3) {
        if (Statics.field1572 == null) {
            Statics.field1572 = new HashMap(7);
            Language[] var4 = Statics.method11191();
            for (int var5 = 0; var5 < var4.length; var5++) {
                Language var6 = var4[var5];
                Statics.field1572.put(var6, new ConcurrentLinkedQueue());
            }
        }
        ConcurrentLinkedQueue var7 = (ConcurrentLinkedQueue) Statics.field1572.get(arg3);
        SimpleDateFormat var8 = (SimpleDateFormat) var7.poll();
        if (var8 == null) {
            var8 = new SimpleDateFormat(arg1, arg3.method11188());
        } else {
            var8.applyPattern(arg1);
        }
        var8.setTimeZone(arg2);
        String var9 = var8.format(arg0);
        var7.add(var8);
        return var9;
    }

    @ObfuscatedName("et.a(I)Ljava/util/TimeZone;")
    public static TimeZone method2909() {
        return method2906("Europe/London");
    }

    @ObfuscatedName("et.s(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method2906(String arg0) {
        HashMap var1 = field1574;
        synchronized (field1574) {
            TimeZone var2 = (TimeZone) field1574.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field1574.put(arg0, var2);
            }
            return var2;
        }
    }
}
