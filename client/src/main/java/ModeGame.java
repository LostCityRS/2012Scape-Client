import deob.ObfuscatedName;

@ObfuscatedName("sv")
public class ModeGame {

    @ObfuscatedName("sv.u")
    public static final ModeGame field6407 = new ModeGame("runescape", "RuneScape", 0);

    @ObfuscatedName("sv.j")
    public static final ModeGame STELLARDAWN = new ModeGame("stellardawn", "Stellar Dawn", 1);

    @ObfuscatedName("sv.a")
    public static final ModeGame field6403 = new ModeGame("game3", "Game 3", 2);

    @ObfuscatedName("sv.s")
    public static final ModeGame field6406 = new ModeGame("game4", "Game 4", 3);

    @ObfuscatedName("sv.c")
    public static final ModeGame field6405 = new ModeGame("game5", "Game 5", 4);

    @ObfuscatedName("sv.m")
    public final String field6404;

    @ObfuscatedName("sv.t")
    public final String field6401;

    @ObfuscatedName("sv.l")
    public final int game;

    @ObfuscatedName("vh.u(S)[Lsv;")
    public static ModeGame[] method12452() {
        return new ModeGame[]{field6406, field6403, STELLARDAWN, field6405, field6407};
    }

    public ModeGame(String arg0, String arg1, int arg2) {
        this.field6404 = arg0;
        this.field6401 = arg1;
        this.game = arg2;
    }

    @ObfuscatedName("aaf.j(II)Lsv;")
    public static ModeGame method14061(int arg0) {
        ModeGame[] var1 = method12452();
        for (int var2 = 0; var2 < var1.length; var2++) {
            ModeGame var3 = var1[var2];
            if (var3.game == arg0) {
                return var3;
            }
        }
        return null;
    }
}
