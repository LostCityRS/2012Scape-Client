import deob.ObfuscatedName;

@ObfuscatedName("is")
public class QuickChatPhrase {

    @ObfuscatedName("is.u")
    public int field2655;

    @ObfuscatedName("is.j")
    public QuickChatPhraseType field2656;

    @ObfuscatedName("is.a")
    public int[] field2657;

    @ObfuscatedName("dl.u(Laet;I)Lis;")
    public static QuickChatPhrase method2602(Packet arg0) {
        QuickChatPhrase var1 = new QuickChatPhrase();
        var1.field2655 = arg0.method15239();
        var1.field2656 = Statics.field3779.method12176(var1.field2655);
        return var1;
    }
}
