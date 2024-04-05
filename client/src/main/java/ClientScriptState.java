import deob.ObfuscatedName;

@ObfuscatedName("rn")
public class ClientScriptState {

    @ObfuscatedName("rn.u")
    public int[] intLocals;

    @ObfuscatedName("rn.j")
    public Object[] objectLocals;

    @ObfuscatedName("rn.a")
    public long[] longLocals;

    @ObfuscatedName("rn.s")
    public boolean secondary;

    @ObfuscatedName("rn.c")
    public int[] arrayLocalsSizes = new int[5];

    @ObfuscatedName("rn.m")
    public int[][] arrayLocals = new int[5][5000];

    @ObfuscatedName("rn.t")
    public int[] intStack = new int[1000];

    @ObfuscatedName("rn.l")
    public int isp = 0;

    @ObfuscatedName("rn.f")
    public Object[] objectStack = new Object[1000];

    @ObfuscatedName("rn.d")
    public int osp = 0;

    @ObfuscatedName("rn.z")
    public long[] longStack = new long[1000];

    @ObfuscatedName("rn.n")
    public int lsp = 0;

    @ObfuscatedName("rn.o")
    public int fp = 0;

    @ObfuscatedName("rn.q")
    public ScriptFrame[] frames = new ScriptFrame[50];

    @ObfuscatedName("rn.p")
    public ActiveComponent activeComponent = new ActiveComponent();

    @ObfuscatedName("rn.w")
    public ActiveComponent activeComponent2 = new ActiveComponent();

    @ObfuscatedName("rn.b")
    public QuickChatPhrase activeChatPhrase;

    @ObfuscatedName("rn.x")
    public ClanSettings activeClanSettings;

    @ObfuscatedName("rn.i")
    public ClanChannel activeClanChannel;

    @ObfuscatedName("rn.v")
    public PathingEntity activeEntity;

    @ObfuscatedName("rn.k")
    public Location activeLoc;

    @ObfuscatedName("rn.h")
    public ObjStackEntity activeObj;

    @ObfuscatedName("rn.r")
    public int nestedCount = 0;

    @ObfuscatedName("rn.g")
    public int field5232;

    @ObfuscatedName("rn.y")
    public FileChooser field5233;

    @ObfuscatedName("rn.e")
    public int[] intOperands;

    @ObfuscatedName("rn.ay")
    public ClientScriptCommand[] instructions;

    @ObfuscatedName("rn.af")
    public int pc = -1;

    @ObfuscatedName("rn.ar")
    public ClientScript script;
}
