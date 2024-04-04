import deob.ObfuscatedName;
import jaclib.ping.Ping;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public final class client extends GameShell {

    public static final int REVISION = 742;
    public static final int SUBREVISION = 2; // this client gamepack is actually 742-1, but servers expect 742-2

    public static final boolean ENABLE_HOST_CHECK = false;
    public static final boolean ENABLE_JS5_RSA = false;
    public static final boolean ENABLE_LOBBY = false;
    public static final boolean ENABLE_RSA = false;
    public static final boolean ENABLE_ISAAC = false;

    public static final boolean CUSTOM_SEND_MAC_ADDRESS = true; // servers out there expect additional data on login

    @ObfuscatedName("client.bx")
    public static ModeGame modeGame = null;

    @ObfuscatedName("client.bb")
    public static boolean field8903 = false;

    @ObfuscatedName("client.be")
    public static boolean field9193 = false;

    @ObfuscatedName("client.bw")
    public static String field8947 = null;

    @ObfuscatedName("client.bh")
    public static int field9043 = 0;

    @ObfuscatedName("client.bu")
    public static int loadingBarTheme = 0;

    @ObfuscatedName("client.cl")
    public static boolean field9004 = false;

    @ObfuscatedName("client.cq")
    public static byte[] field8909 = null;

    @ObfuscatedName("client.co")
    public static long field8910 = 0L;

    @ObfuscatedName("client.cm")
    public static boolean field8911 = false;

    @ObfuscatedName("client.cw")
    public static boolean field8912 = false;

    @ObfuscatedName("client.cx")
    public static String createAdditionalInfo = null;

    @ObfuscatedName("client.cn")
    public static String field9020 = null;

    @ObfuscatedName("client.cf")
    public static boolean field8915 = false;

    @ObfuscatedName("client.cs")
    public static boolean field9218 = false;

    @ObfuscatedName("client.cr")
    public static boolean field8987 = false;

    @ObfuscatedName("client.cp")
    public static boolean field8918 = false;

    @ObfuscatedName("client.ci")
    public static int field8919 = 0;

    @ObfuscatedName("client.ca")
    public static int field9015 = -1;

    @ObfuscatedName("client.ch")
    public static String gamepack = null;

    @ObfuscatedName("client.cv")
    public static String field8922 = null;

    @ObfuscatedName("client.cd")
    public static int state = 12;

    @ObfuscatedName("client.ce")
    public static Matrix4x4 field8924 = new Matrix4x4();

    @ObfuscatedName("client.ct")
    public static Matrix4x3 field8925 = new Matrix4x3();

    @ObfuscatedName("client.cu")
    public static Matrix4x3 field8979 = new Matrix4x3();

    @ObfuscatedName("client.cz")
    public static long field8927 = 0L;

    @ObfuscatedName("client.dl")
    public static boolean field8928 = false;

    @ObfuscatedName("client.dj")
    public static boolean field9226 = true;

    @ObfuscatedName("client.dw")
    public static int field8930 = 0;

    @ObfuscatedName("client.di")
    public static int loopCycle = 0;

    @ObfuscatedName("client.dg")
    public static boolean preferencesChangeNotified = true;

    @ObfuscatedName("client.do")
    public static boolean field8926 = false;

    @ObfuscatedName("client.db")
    public static boolean field9169 = false;

    @ObfuscatedName("client.dh")
    public static int systemUpdateTimer = 0;

    @ObfuscatedName("client.de")
    public static HintArrow[] field8936 = new HintArrow[8];

    @ObfuscatedName("client.dk")
    public static HintTrail[] field9044 = new HintTrail[10];

    @ObfuscatedName("client.dz")
    public static boolean field8938 = false;

    @ObfuscatedName("client.dc")
    public static boolean field8939 = false;

    @ObfuscatedName("client.dt")
    public static boolean field8940 = true;

    @ObfuscatedName("client.dd")
    public static long field9138 = (long) (Math.random() * 9.999999999E9D);

    @ObfuscatedName("client.da")
    public static boolean field9165 = false;

    @ObfuscatedName("client.dr")
    public static int field8943 = 0;

    @ObfuscatedName("client.df")
    public static boolean field8944 = false;

    @ObfuscatedName("client.dv")
    public static int field9017 = 0;

    @ObfuscatedName("client.dm")
    public static boolean field8946 = false;

    @ObfuscatedName("client.et")
    public static IterableQueue field9136 = new IterableQueue();

    @ObfuscatedName("client.eu")
    public static int field9002 = 0;

    @ObfuscatedName("client.er")
    public static int field8950 = 0;

    @ObfuscatedName("client.eq")
    public static KeyboardEvent[] field8951 = new KeyboardEvent[132];

    @ObfuscatedName("client.ez")
    public static int field8953 = 0;

    @ObfuscatedName("client.eh")
    public static KeyboardEvent[] keyboardEvents = new KeyboardEvent[77];

    @ObfuscatedName("client.ed")
    public static Color[] loadingBarFillColour = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};

    @ObfuscatedName("client.ee")
    public static Color[] loadingBarOutlineColour = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};

    @ObfuscatedName("client.es")
    public static Color[] loadingBarTextColour = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};

    @ObfuscatedName("client.ef")
    public static int field8958 = 0;

    @ObfuscatedName("client.ex")
    public static int field9164 = 0;

    @ObfuscatedName("client.gz")
    public static int field9215 = 0;

    @ObfuscatedName("client.gc")
    public static WeightedCache field9131 = new WeightedCache(8);

    @ObfuscatedName("client.gm")
    public static String field8962 = null;

    @ObfuscatedName("client.gr")
    public static final FontFactory field8914 = new ClientFontFactory();

    @ObfuscatedName("client.hz")
    public static IterableMap npcs = new IterableMap(64);

    @ObfuscatedName("client.hp")
    public static ObjectNode[] field8965 = new ObjectNode[1024];

    @ObfuscatedName("client.hr")
    public static int field8966 = 0;

    @ObfuscatedName("client.hv")
    public static int npcCount = 0;

    @ObfuscatedName("client.hg")
    public static int[] field9056 = new int[1024];

    @ObfuscatedName("client.hi")
    public static int field8969 = 0;

    @ObfuscatedName("client.ip")
    public static int[] field8970 = new int[251];

    @ObfuscatedName("client.ir")
    public static int field8971 = 0;

    @ObfuscatedName("client.ie")
    public static int field8972 = 0;

    @ObfuscatedName("client.ii")
    public static int[] field8973 = new int[1005];

    @ObfuscatedName("client.ih")
    public static final ServerConnection lobbyConnection = new ServerConnection();

    @ObfuscatedName("client.ig")
    public static final ServerConnection gameConnection = new ServerConnection();

    @ObfuscatedName("client.ia")
    public static final ServerConnection[] connections = new ServerConnection[]{gameConnection, lobbyConnection};

    @ObfuscatedName("client.iw")
    public static int currentIncrementVerifyId = 0;

    @ObfuscatedName("client.iq")
    public static boolean field8978 = false;

    @ObfuscatedName("client.iv")
    public static InetAddressLookupRequest field9192 = new InetAddressLookupRequest();

    @ObfuscatedName("client.io")
    public static World world = new World(false);

    @ObfuscatedName("client.ix")
    public static volatile boolean field8981 = false;

    @ObfuscatedName("client.iz")
    public static Object field8982 = new Object();

    @ObfuscatedName("client.is")
    public static Object field8983 = new Object();

    @ObfuscatedName("client.im")
    public static int[] field8984 = new int[64];

    @ObfuscatedName("client.ik")
    public static int field8985 = 0;

    @ObfuscatedName("client.iu")
    public static final int[] field8986 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};

    @ObfuscatedName("client.il")
    public static int cutsceneId = -1;

    @ObfuscatedName("client.it")
    public static int field8988 = 2;

    @ObfuscatedName("client.jv")
    public static boolean field8989 = false;

    @ObfuscatedName("client.jm")
    public static int field8906 = -1;

    @ObfuscatedName("client.jc")
    public static int field9029 = 0;

    @ObfuscatedName("client.jj")
    public static int field8992 = -1;

    @ObfuscatedName("client.jr")
    public static int field8993 = -1;

    @ObfuscatedName("client.jp")
    public static int field8994 = 255;

    @ObfuscatedName("client.jo")
    public static int field9147 = 0;

    @ObfuscatedName("client.jd")
    public static int field8996 = 0;

    @ObfuscatedName("client.je")
    public static int field8997 = 0;

    @ObfuscatedName("client.jw")
    public static int[] field9128 = new int[4096];

    @ObfuscatedName("client.jg")
    public static int[] field9231 = new int[4096];

    @ObfuscatedName("client.jt")
    public static int[] field9001 = new int[50];

    @ObfuscatedName("client.jy")
    public static int[] field9065 = new int[50];

    @ObfuscatedName("client.jq")
    public static final int[] field9003 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};

    @ObfuscatedName("client.jk")
    public static int field9050 = 0;

    @ObfuscatedName("client.jb")
    public static int field9005 = 2;

    @ObfuscatedName("client.jl")
    public static int field9006 = 0;

    @ObfuscatedName("client.kr")
    public static int field9100 = 2;

    @ObfuscatedName("client.kh")
    public static int field9008 = 0;

    @ObfuscatedName("client.kb")
    public static int field9009 = 1;

    @ObfuscatedName("client.ky")
    public static int field9174 = 0;

    @ObfuscatedName("client.ki")
    public static int field9087 = 0;

    @ObfuscatedName("client.ks")
    public static int field9012 = 1;

    @ObfuscatedName("client.kv")
    public static int field8976 = 0;

    @ObfuscatedName("client.ku")
    public static int field9014 = 1;

    @ObfuscatedName("client.kp")
    public static int field9122 = 0;

    @ObfuscatedName("client.kc")
    public static Random field9207 = new Random();

    @ObfuscatedName("client.kx")
    public static int sceneDelta = 0;

    @ObfuscatedName("client.kn")
    public static int field9154 = 0;

    @ObfuscatedName("client.ko")
    public static int field9019 = 0;

    @ObfuscatedName("client.kj")
    public static float field9171 = 1057.0F;

    @ObfuscatedName("client.kw")
    public static float field9021 = 0.0F;

    @ObfuscatedName("client.ke")
    public static float field9022 = 0.0F;

    @ObfuscatedName("client.km")
    public static float field8990 = 0.0F;

    @ObfuscatedName("client.kg")
    public static boolean field9016 = false;

    @ObfuscatedName("client.kk")
    public static boolean field8913 = false;

    @ObfuscatedName("client.lb")
    public static int field9026 = 1;

    @ObfuscatedName("client.lv")
    public static int field9027 = field9026 * 35 + 200;

    @ObfuscatedName("client.ls")
    public static boolean field9028 = true;

    @ObfuscatedName("client.lh")
    public static int field9173 = 0;

    @ObfuscatedName("client.lg")
    public static int[][][] cameraSpline = new int[2][][];

    @ObfuscatedName("client.lu")
    public static int cameraSplinePos = -1;

    @ObfuscatedName("client.lq")
    public static int field9034 = -1;

    @ObfuscatedName("client.lt")
    public static int cameraSplinePosOffset = 0;

    @ObfuscatedName("client.ln")
    public static int field8995 = 0;

    @ObfuscatedName("client.lw")
    public static int cameraSplineRate = 0;

    @ObfuscatedName("client.lc")
    public static int cameraSplineStart = 0;

    @ObfuscatedName("client.ld")
    public static int cameraSplineEnd = 0;

    @ObfuscatedName("client.ll")
    public static boolean cameraFinished = false;

    @ObfuscatedName("client.lm")
    public static boolean cameraSplineAtEnd = false;

    @ObfuscatedName("client.le")
    public static int field9042 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field9153 = new int[505];

    @ObfuscatedName("client.lx")
    public static int[] field9062 = new int[514];

    @ObfuscatedName("client.lp")
    public static int field9045 = 0;

    @ObfuscatedName("client.lr")
    public static LinkQueue coverMarkerClickboxes = new LinkQueue();

    @ObfuscatedName("client.la")
    public static int field9047 = 0;

    @ObfuscatedName("client.lf")
    public static float[] field9048 = new float[3];

    @ObfuscatedName("client.mx")
    public static int crossX = 0;

    @ObfuscatedName("client.mf")
    public static int crossY = 0;

    @ObfuscatedName("client.mo")
    public static int crossCycle = 0;

    @ObfuscatedName("client.ml")
    public static int crossMode = 0;

    @ObfuscatedName("client.mv")
    public static int field9053 = 0;

    @ObfuscatedName("client.mh")
    public static int field9210 = -1;

    @ObfuscatedName("client.mw")
    public static int[] field9058 = new int[2];

    @ObfuscatedName("client.mi")
    public static int[] field9222 = new int[2];

    @ObfuscatedName("client.mr")
    public static int[] field9097 = new int[2];

    @ObfuscatedName("client.mt")
    public static int[] field9061 = new int[2];

    @ObfuscatedName("client.mb")
    public static int[] field8945 = new int[2];

    @ObfuscatedName("client.ms")
    public static long field9063 = 0L;

    @ObfuscatedName("client.mg")
    public static boolean field9064 = true;

    @ObfuscatedName("client.me")
    public static int field9129 = 32;

    @ObfuscatedName("client.ma")
    public static int field9066 = 16;

    @ObfuscatedName("client.mm")
    public static int field9067 = 765;

    @ObfuscatedName("client.md")
    public static int field9068 = 553;

    @ObfuscatedName("client.my")
    public static PlayerEntity[] players = new PlayerEntity[2048];

    @ObfuscatedName("client.ng")
    public static int currentPlayerUid = -1;

    @ObfuscatedName("client.nf")
    public static boolean field8998 = false;

    @ObfuscatedName("client.nt")
    public static boolean field9142 = false;

    @ObfuscatedName("client.ny")
    public static int userStaffModLevel = 0;

    @ObfuscatedName("client.nb")
    public static int field8916 = 0;

    @ObfuscatedName("client.nu")
    public static boolean field9054 = false;

    @ObfuscatedName("client.nx")
    public static boolean field9077 = false;

    @ObfuscatedName("client.nk")
    public static boolean field9078 = false;

    @ObfuscatedName("client.nc")
    public static boolean field9079 = false;

    @ObfuscatedName("client.na")
    public static boolean field9176 = true;

    @ObfuscatedName("client.nh")
    public static boolean field9081 = false;

    @ObfuscatedName("client.nn")
    public static final short[] field9083 = new short[]{44, 45, 46, 47, 48, 49, 50, 51};

    @ObfuscatedName("client.ne")
    public static int[] field9084 = new int[8];

    @ObfuscatedName("client.nj")
    public static String[] field9085 = new String[8];

    @ObfuscatedName("client.ns")
    public static boolean[] field9086 = new boolean[8];

    @ObfuscatedName("client.nz")
    public static int field9172 = -1;

    @ObfuscatedName("client.ox")
    public static IterableMap field9088 = new IterableMap(64);

    @ObfuscatedName("client.oe")
    public static IterableQueue field9007 = new IterableQueue();

    @ObfuscatedName("client.ow")
    public static IterableMap field9090 = new IterableMap(16);

    @ObfuscatedName("client.oi")
    public static LinkQueue field9091 = new LinkQueue();

    @ObfuscatedName("client.ot")
    public static int[] field9092 = new int[25];

    @ObfuscatedName("client.oc")
    public static int[] field9093 = new int[25];

    @ObfuscatedName("client.oy")
    public static int[] field9094 = new int[25];

    @ObfuscatedName("client.op")
    public static int field8933 = 0;

    @ObfuscatedName("client.oo")
    public static int field9096 = -1;

    @ObfuscatedName("client.ou")
    public static int defaultCursor = -1;

    @ObfuscatedName("client.oz")
    public static int field9098 = -1;

    @ObfuscatedName("client.oj")
    public static int field9018 = -1;

    @ObfuscatedName("client.or")
    public static boolean targetModeActive = false;

    @ObfuscatedName("client.ok")
    public static int activeComponentId = -1;

    @ObfuscatedName("client.oh")
    public static int activeComponentInvobject = -1;

    @ObfuscatedName("client.pp")
    public static String field9103 = null;

    @ObfuscatedName("client.pq")
    public static String field9151 = null;

    @ObfuscatedName("client.px")
    public static volatile int topLevelInterface = -1;

    @ObfuscatedName("client.pt")
    public static IterableMap field9075 = new IterableMap(8);

    @ObfuscatedName("client.pa")
    public static int field9107 = 0;

    @ObfuscatedName("client.ps")
    public static Component field9108 = null;

    @ObfuscatedName("client.pn")
    public static int field9109 = 0;

    @ObfuscatedName("client.po")
    public static int field8905 = 0;

    @ObfuscatedName("client.pb")
    public static boolean field9111 = false;

    @ObfuscatedName("client.pw")
    public static boolean field9112 = false;

    @ObfuscatedName("client.ph")
    public static Component gameScreen = null;

    @ObfuscatedName("client.pr")
    public static boolean field9114 = false;

    @ObfuscatedName("client.pc")
    public static Component dragComponent = null;

    @ObfuscatedName("client.pj")
    public static Component field9116 = null;

    @ObfuscatedName("client.pi")
    public static int field9160 = 0;

    @ObfuscatedName("client.pl")
    public static int field8977 = 0;

    @ObfuscatedName("client.pf")
    public static Component field9119 = null;

    @ObfuscatedName("client.pk")
    public static boolean field9037 = false;

    @ObfuscatedName("client.pz")
    public static int field9203 = -1;

    @ObfuscatedName("client.pg")
    public static int field8942 = -1;

    @ObfuscatedName("client.py")
    public static int field9123 = -1;

    @ObfuscatedName("client.pu")
    public static int field8968 = -1;

    @ObfuscatedName("client.qu")
    public static boolean field9080 = false;

    @ObfuscatedName("client.qd")
    public static int field9126 = -1;

    @ObfuscatedName("client.qm")
    public static int field9127 = -1;

    @ObfuscatedName("client.qi")
    public static boolean field8991 = false;

    @ObfuscatedName("client.qo")
    public static int field9150 = 0;

    @ObfuscatedName("client.qr")
    public static boolean field9013 = false;

    @ObfuscatedName("client.qp")
    public static boolean minimapClicked = false;

    @ObfuscatedName("client.qj")
    public static int interfaceUpdateNum = 1;

    @ObfuscatedName("client.qv")
    public static int[] field9135 = new int[32];

    @ObfuscatedName("client.qe")
    public static int field9183 = 0;

    @ObfuscatedName("client.qy")
    public static int[] field9137 = new int[32];

    @ObfuscatedName("client.qs")
    public static int field9158 = 0;

    @ObfuscatedName("client.qk")
    public static int[] field9139 = new int[32];

    @ObfuscatedName("client.qg")
    public static int field9140 = 0;

    @ObfuscatedName("client.qb")
    public static int[] field9141 = new int[32];

    @ObfuscatedName("client.rk")
    public static int field9036 = 0;

    @ObfuscatedName("client.ry")
    public static int[] field9143 = new int[32];

    @ObfuscatedName("client.rd")
    public static int field9144 = 0;

    @ObfuscatedName("client.rs")
    public static int[] field9145 = new int[32];

    @ObfuscatedName("client.ri")
    public static int field9146 = 0;

    @ObfuscatedName("client.rx")
    public static int field9130 = 0;

    @ObfuscatedName("client.rm")
    public static int field9148 = 0;

    @ObfuscatedName("client.rj")
    public static int field9161 = 0;

    @ObfuscatedName("client.rw")
    public static int field9149 = 0;

    @ObfuscatedName("client.rc")
    public static int field8917 = 0;

    @ObfuscatedName("client.rh")
    public static int field9152 = 0;

    @ObfuscatedName("client.rt")
    public static int miscTransmitNum = 0;

    @ObfuscatedName("client.rf")
    public static int field9155 = 0;

    @ObfuscatedName("client.rl")
    public static boolean field9156 = false;

    @ObfuscatedName("client.rz")
    public static long field9157 = -1L;

    @ObfuscatedName("client.ro")
    public static IterableQueue hookRequests = new IterableQueue();

    @ObfuscatedName("client.rb")
    public static IterableQueue field9159 = new IterableQueue();

    @ObfuscatedName("client.rn")
    public static IterableQueue field9125 = new IterableQueue();

    @ObfuscatedName("client.rr")
    public static IterableMap field9010 = new IterableMap(512);

    @ObfuscatedName("client.se")
    public static int field9000 = 0;

    @ObfuscatedName("client.sd")
    public static int field8960 = -2;

    @ObfuscatedName("client.so")
    public static boolean[] field9204 = new boolean[100];

    @ObfuscatedName("client.st")
    public static boolean[] field9166 = new boolean[100];

    @ObfuscatedName("client.sz")
    public static Rectangle[] field9167 = new Rectangle[100];

    @ObfuscatedName("client.sb")
    public static int field8929;

    @ObfuscatedName("client.sa")
    public static final int[] field8920;

    @ObfuscatedName("client.sl")
    public static int field9170;

    @ObfuscatedName("client.sf")
    public static int field9105;

    @ObfuscatedName("client.sw")
    public static int[] field9198;

    @ObfuscatedName("client.sy")
    public static int[] field8967;

    @ObfuscatedName("client.sm")
    public static int[] field9186;

    @ObfuscatedName("client.sn")
    public static EntityChatLine[] field9175;

    @ObfuscatedName("client.su")
    public static final int[] field9073;

    @ObfuscatedName("client.sh")
    public static int field9177;

    @ObfuscatedName("client.sq")
    public static int field9178;

    @ObfuscatedName("client.sc")
    public static long[] field9180;

    @ObfuscatedName("client.sx")
    public static int field9181;

    @ObfuscatedName("client.sv")
    public static String field9182;

    @ObfuscatedName("client.sj")
    public static String field9220;

    @ObfuscatedName("client.tb")
    public static StockMarketSlot[] field9184;

    @ObfuscatedName("client.tf")
    public static int field9185;

    @ObfuscatedName("client.tl")
    public static ClientCameraTrackableProvider field8948;

    @ObfuscatedName("client.uw")
    public static boolean[] cameraModifierEnabled;

    @ObfuscatedName("client.ub")
    public static int[] field9189;

    @ObfuscatedName("client.us")
    public static int[] field9190;

    @ObfuscatedName("client.ux")
    public static int[] field9191;

    @ObfuscatedName("client.uc")
    public static int[] field9110;

    @ObfuscatedName("client.uo")
    public static short field8904;

    @ObfuscatedName("client.uk")
    public static short field9194;

    @ObfuscatedName("client.ug")
    public static short field9195;

    @ObfuscatedName("client.ue")
    public static short field9196;

    @ObfuscatedName("client.uj")
    public static short field9197;

    @ObfuscatedName("client.uz")
    public static short field9188;

    @ObfuscatedName("client.ua")
    public static short field9199;

    @ObfuscatedName("client.ui")
    public static short field9200;

    @ObfuscatedName("client.uh")
    public static int field9201;

    @ObfuscatedName("client.uf")
    public static int field9202;

    @ObfuscatedName("client.uu")
    public static int field9025;

    @ObfuscatedName("client.ut")
    public static int field9168;

    @ObfuscatedName("client.un")
    public static int field9205;

    @ObfuscatedName("client.um")
    public static int field9206;

    @ObfuscatedName("client.uq")
    public static int field9121;

    @ObfuscatedName("client.ur")
    public static Friend[] field9209;

    @ObfuscatedName("client.uv")
    public static LinkQueue field8934;

    @ObfuscatedName("client.uy")
    public static int field9211;

    @ObfuscatedName("client.vx")
    public static Ignore[] field8999;

    @ObfuscatedName("client.vt")
    public static Calendar field9214;

    @ObfuscatedName("client.vg")
    public static byte field9030;

    @ObfuscatedName("client.vo")
    public static PrimaryLayerEntityPredicate field9216;

    @ObfuscatedName("client.vn")
    public static long field9106;

    @ObfuscatedName("client.vq")
    public static long field9124;

    @ObfuscatedName("client.wf")
    public static final int[] field8955;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9167[var0] = new Rectangle();
        }
        field8929 = 0;
        field8920 = new int[4];
        field9170 = 0;
        field9105 = 50;
        field9198 = new int[field9105];
        field8967 = new int[field9105];
        field9186 = new int[field9105];
        field9175 = new EntityChatLine[field9105];
        field9073 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        field9177 = 0;
        field9178 = 0;
        field9180 = new long[100];
        field9181 = 0;
        field9182 = null;
        field9220 = null;
        field9184 = new StockMarketSlot[6];
        field9185 = 0;
        field8948 = new ClientCameraTrackableProvider();
        cameraModifierEnabled = new boolean[5];
        field9189 = new int[5];
        field9190 = new int[5];
        field9191 = new int[5];
        field9110 = new int[5];
        field8904 = 256;
        field9194 = 205;
        field9195 = 256;
        field9196 = 320;
        field9197 = 1;
        field9188 = 32767;
        field9199 = 1;
        field9200 = 32767;
        field9201 = 0;
        field9202 = 0;
        field9025 = 0;
        field9168 = 0;
        field9205 = 0;
        field9206 = 0;
        field9121 = 0;
        field9209 = new Friend[200];
        field8934 = new LinkQueue();
        field9211 = 0;
        field8999 = new Ignore[100];
        field9214 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field9030 = -6;
        field9216 = new PrimaryLayerLocEntityPredicate();
        field9106 = -1L;
        field9124 = -1L;
        field8955 = new int[4];
    }

    public final void init() {
        if (!this.method6660()) {
            return;
        }
        String var1 = "";
        JavConfigParameter[] var2 = JavConfigParameter.method2019();
        for (int var3 = 0; var3 < var2.length; var3++) {
            JavConfigParameter var4 = var2[var3];
            String var5 = Statics.field6387.getParameter(var4.field3261);
            if (var5 != null) {
                switch (Integer.parseInt(var4.field3261)) {
                    case 1:
                        field9015 = Integer.parseInt(var5);
                        break;
                    case 2:
                        createAdditionalInfo = var5;
                        if (createAdditionalInfo.length() > 100) {
                            createAdditionalInfo = null;
                        }
                    case 3:
                    case 4:
                        break;
                    case 5:
                        field9020 = var5;
                        break;
                    case 6:
                        Statics.field7543 = Integer.parseInt(var5);
                        break;
                    case 7:
                        modeGame = ModeGame.method14061(Integer.parseInt(var5));
                        break;
                    case 8:
                        if (Statics.field6782 == null) {
                            Statics.field6782 = new ServerAddress();
                        }
                        Statics.field6782.field6768 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field8998 = true;
                        }
                        break;
                    case 10:
                        if (Statics.field6782 == null) {
                            Statics.field6782 = new ServerAddress();
                        }
                        Statics.field6782.field6765 = var5;
                        break;
                    case 11:
                        Statics.field6683 = (ModeWhere) SerializableEnums.decode(ModeWhere.method11173(), Integer.parseInt(var5));
                        if (Statics.field6683 == ModeWhere.field6363) {
                            Statics.field6683 = ModeWhere.field6369;
                        } else if (!ModeWhere.method11177(Statics.field6683) && Statics.field6683 != ModeWhere.LIVE) {
                            Statics.field6683 = ModeWhere.LIVE;
                        }
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field9193 = true;
                        } else {
                            field9193 = false;
                        }
                        break;
                    case 13:
                        Statics.language = Language.method11189(Integer.parseInt(var5));
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field8918 = true;
                        } else {
                            field8918 = false;
                        }
                        break;
                    case 15:
                        if (var5.equals(TextUtil.field493)) {
                            field9004 = true;
                        } else {
                            field9004 = false;
                        }
                        break;
                    case 16:
                        loadingBarTheme = Integer.parseInt(var5);
                        if (loadingBarTheme < 0 || loadingBarTheme >= loadingBarFillColour.length) {
                            loadingBarTheme = 0;
                        }
                        break;
                    case 17:
                        field8922 = var5;
                        break;
                    case 18:
                        Statics.field6773 = new ServerAddress();
                        Statics.field6773.field6768 = Integer.parseInt(var5);
                        break;
                    case 19:
                    default:
                        JagException.method16252("", new RuntimeException());
                        break;
                    case 20:
                        field9043 = Integer.parseInt(var5);
                        break;
                    case 21:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field8903 = true;
                        } else {
                            field8903 = false;
                        }
                        break;
                    case 22:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field8915 = true;
                        } else {
                            field8915 = false;
                        }
                        break;
                    case 23:
                        var1 = var5;
                        break;
                    case 24:
                        if (var5 != null) {
                            field8909 = Base64.method2608(WebTools.method8264(var5));
                            if (field8909.length < 16) {
                                field8909 = null;
                            }
                        }
                        break;
                    case 25:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field9218 = true;
                        } else {
                            field9218 = false;
                        }
                        break;
                    case 26:
                        if (var5.equalsIgnoreCase(TextUtil.field493)) {
                            field8987 = true;
                        } else {
                            field8987 = false;
                        }
                        break;
                    case 27:
                        if (var5.equals(TextUtil.field493)) {
                            field8946 = true;
                        } else {
                            field8946 = false;
                        }
                        break;
                    case 28:
                        field8947 = var5;
                        break;
                    case 29:
                        Statics.field4685 = var5;
                        break;
                    case 30:
                        gamepack = var5;
                        break;
                    case 31:
                        Statics.field8439 = var5;
                        break;
                    case 32:
                        Statics.field6817 = var5;
                        break;
                    case 33:
                        Statics.field496 = ModeWhat.method7734(Integer.parseInt(var5));
                        if (Statics.field496 != ModeWhat.field6638 && Statics.field496 != ModeWhat.field6640 && Statics.field496 != ModeWhat.field6639 && Statics.field496 != ModeWhat.field6641) {
                            Statics.field496 = ModeWhat.field6641;
                        }
                        break;
                    case 34:
                        Statics.field7046 = Integer.parseInt(var5);
                        break;
                    case 35:
                        field8910 = Long.parseLong(var5);
                }
            }
        }
        if (field8947 == null) {
            field8947 = "";
        }
        GameShellFrameParameters var6 = new GameShellFrameParameters(field9067, field9068, field9129, field9066, modeGame.field6401);
        Statics.field1543 = this;
        String var7 = Statics.field496.field6643;
        int var8 = Statics.field496.field6644 + 32;
        if (!var1.equals("")) {
            var7 = var7 + "_" + var1;
            var8 = 0;
        }
        this.method6717(var6, modeGame.field6404, var7, var8, Statics.method15963(), 742, 1, field8918);
    }

    @ObfuscatedName("client.af(B)V")
    public final void maininit() {
        Frame var1 = new Frame(" ");
        var1.pack();
        var1.dispose();
        Statics.field9561 = new Component();
        method13896();
        Statics.field1210 = new Js5DiskCache();
        Statics.field848 = new ClientJs5TcpClient();
        int[] var2 = new int[]{20, 260};
        int[] var3 = new int[]{1000, 100};
        if (var2 == null || var3 == null) {
            Statics.field642 = null;
            Statics.field6421 = null;
            Statics.field6422 = null;
        } else {
            Statics.field642 = var2;
            Statics.field6421 = new int[var2.length];
            Statics.field6422 = new byte[var2.length][][];
            for (int var4 = 0; var4 < Statics.field642.length; var4++) {
                Statics.field6422[var4] = new byte[var3[var4]][];
            }
        }
        Vector3.init(100);
        Quaternion.method5208(10);
        Mouse.method12209(100);
        Statics.method15563(100);
        if (Statics.field6683 != ModeWhere.LIVE) {
            Statics.field2391 = new byte[50][];
        }
        Statics.options = Statics.method2808();
        if (Statics.options.field9667.method15884() == 1) {
            Scene.field4504 = false;
        }
        if (Statics.field6683 == ModeWhere.LIVE) {
            Statics.field6773.field6765 = Statics.field6387.getCodeBase().getHost();
        } else if (ModeWhere.method11177(Statics.field6683)) {
            Statics.field6773.field6765 = Statics.field6387.getCodeBase().getHost();
            Statics.field6773.field6764 = Statics.field6773.field6768 + 40000;
            Statics.field6782.field6764 = Statics.field6782.field6768 + 40000;
            Statics.field6773.field6766 = Statics.field6773.field6768 + 50000;
            Statics.field6782.field6766 = Statics.field6782.field6768 + 50000;
        } else if (Statics.field6683 == ModeWhere.field6363) {
            Statics.field6773.field6765 = TextUtil.field494;
            Statics.field6782.field6765 = TextUtil.field494;
            Statics.field6773.field6764 = Statics.field6773.field6768 + 40000;
            Statics.field6782.field6764 = Statics.field6782.field6768 + 40000;
            Statics.field6773.field6766 = Statics.field6773.field6768 + 50000;
            Statics.field6782.field6766 = Statics.field6782.field6768 + 50000;
        }
        Statics.field6772 = Statics.field6773;
        if (modeGame == ModeGame.field6407) {
            field8940 = false;
        }
        Statics.field2744 = LocType.field6530 = NPCType.field7209 = ObjType.field7118 = new short[256];
        try {
            Statics.field8726 = GameShell.method16494().getToolkit().getSystemClipboard();
        } catch (Exception var6) {
        }
        Statics.keyboard = Statics.method11115(Statics.canvas);
        Statics.mouse = Mouse.method8198(Statics.canvas, true);
        Statics.cam2 = new BasicCamera(field8948);
        if (Statics.field6683 != ModeWhere.LIVE) {
            field8926 = true;
        }
        field4128 = LocalisedText.field6938.get(Statics.language);
        Statics.asyncRebuild = new AsyncRebuild();
        (new Thread(Statics.asyncRebuild)).start();
    }

    @ObfuscatedName("client.ar(B)V")
    public final void mainloop() {
        if (Statics.options.field9661.getValue() != 2) {
            this.mainloop_inner();
            return;
        }
        try {
            this.mainloop_inner();
        } catch (ThreadDeath var3) {
            throw var3;
        } catch (Throwable var4) {
            JagException.method16252(var4.getMessage() + " " + this.method6701(), var4);
            field8928 = true;
            GraphicsPacketQueue.method12023(ToolkitType.field7362);
            Statics.method5600(0, false);
        }
    }

    @ObfuscatedName("client.ea(B)V")
    public void mainloop_inner() {
        if (state == 13) {
            return;
        }
        if (field8981) {
            Object var1 = field8983;
            synchronized (field8983) {
                field8983.notify();
            }
            Object var3 = field8982;
            synchronized (field8982) {
                try {
                    field8982.wait();
                } catch (InterruptedException var13) {
                }
            }
            field8981 = false;
        }
        loopCycle++;
        if (loopCycle % 1000 == 1) {
            GregorianCalendar var6 = new GregorianCalendar();
            Statics.field2113 = var6.get(11) * 600 + var6.get(12) * 10 + var6.get(13) / 6;
            field9207.setSeed((long) Statics.field2113);
        }
        gameConnection.method1933();
        lobbyConnection.method1933();
        this.method14320();
        if (Statics.field3562 != null) {
            Statics.field3562.method5576();
        }
        AudioRenderer.method7228();
        VideoTypeList.method16665();
        Statics.keyboard.method7231();
        Statics.mouse.method7249();
        if (Statics.renderer != null) {
            Statics.renderer.method444((int) MonotonicTime.get());
        }
        field8950 = 0;
        field8953 = 0;
        for (KeyboardEvent var7 = Statics.keyboard.method7237(); var7 != null; var7 = Statics.keyboard.method7237()) {
            int var8 = var7.method7297();
            if (var8 == 2 || var8 == 3) {
                char var9 = var7.method7298();
                if (DeveloperConsole.method5548() && (var9 == '`' || var9 == 167 || var9 == 178)) {
                    if (DeveloperConsole.method14925()) {
                        DeveloperConsole.method16885();
                    } else {
                        DeveloperConsole.method11726();
                    }
                } else if (field8950 < 132) {
                    field8951[field8950] = var7;
                    field8950++;
                }
            } else if (var8 == 0) {
                if (userStaffModLevel >= 2 && DeveloperConsole.method5548() && var7.method7286() == 28 && Statics.keyboard.isKeyHeld(82)) {
                    if (CameraManager.method14782()) {
                        CameraManager.method8391();
                    } else {
                        CameraManager.method8497();
                    }
                }
                if (field8953 < 77) {
                    keyboardEvents[field8953] = var7;
                    field8953++;
                }
            }
        }
        field9002 = 0;
        for (BasicMouseEvent var10 = Statics.mouse.method7256(); var10 != null; var10 = Statics.mouse.method7256()) {
            int var11 = var10.method15181();
            if (var11 == -1) {
                ClientWatch.method4631(var10);
            } else if (var11 == 6) {
                field9002 += var10.method15184();
                var10.method15186();
            } else if (BasicMouseEvent.method3926(var11)) {
                field9136.addFirst(var10);
                if (field9136.sizeBridged() > 10) {
                    BasicMouseEvent var12 = (BasicMouseEvent) field9136.method11560();
                    if (var12 != null) {
                        var12.method15186();
                    }
                }
            }
        }
        if (DeveloperConsole.method14925()) {
            DeveloperConsole.method12621();
        }
        if (Statics.method2888(state)) {
            Loading.method12645();
            GameShell.method2427();
        } else if (method12326(state)) {
            world.method6128();
        }
        if (isStateTitle(state) && !method12326(state)) {
            this.updateTitleScreen();
            AccountCreationManager.method5945();
            LoginManager.login();
        } else if (isStateLobby(state) && !method12326(state)) {
            this.updateTitleScreen();
            LoginManager.login();
        } else if (state == 4) {
            LoginManager.login();
        } else if (isStateGame(state) && !method12326(state)) {
            Statics.updateGame();
        } else if (state == 9 || state == 0) {
            LoginManager.login();
            if (LoginManager.field538 != -3 && LoginManager.field538 != 2 && LoginManager.field538 != 15) {
                if (state == 0) {
                    LoginManager.field546 = LoginManager.field509;
                    LoginManager.field540 = LoginManager.field543;
                    LoginManager.field547 = LoginManager.field538;
                    if (Statics.field6776) {
                        WorldSwitcher.method8621(Statics.field6775.field6768, Statics.field6775.field6765);
                        gameConnection.closeForcefully();
                        setState(9);
                    } else {
                        logout(LoginManager.field536);
                    }
                } else {
                    logout(false);
                }
            }
        }
        ObjIconFactory.method185(Statics.renderer);
        field9136.method11560();
    }

    @ObfuscatedName("client.an(I)V")
    public final void method6673() {
        if (Statics.options.field9661.getValue() != 2) {
            this.method14317();
            return;
        }
        try {
            this.method14317();
        } catch (ThreadDeath var3) {
            throw var3;
        } catch (Throwable var4) {
            JagException.method16252(var4.getMessage() + " " + this.method6701(), var4);
            field8928 = true;
            GraphicsPacketQueue.method12023(ToolkitType.field7362);
            Statics.method5600(0, false);
        }
    }

    @ObfuscatedName("client.em(B)V")
    public void method14317() {
        if (state == 13) {
            return;
        }
        long var1 = GameShell.method13883() / 1000000L - field8927;
        field8927 = GameShell.method13883() / 1000000L;
        boolean var3 = SoundRelated12.method7075();
        if (var3 && AudioRenderer.field4203 && Statics.field5198 != null) {
            Statics.field5198.method6497();
        }
        if (method6478(state)) {
            if (field9063 != 0L && MonotonicTime.get() > field9063) {
                setWindowMode(method12476(), -1, -1, false);
            } else if (!Statics.renderer.method447() && field4131) {
                method2867();
            }
        }
        if (Statics.fsFrame == null) {
            Container var4 = GameShell.method16494();
            int var5 = var4.getSize().width;
            int var6 = var4.getSize().height;
            if (Statics.field1197 == var4) {
                Insets var7 = Statics.field1197.getInsets();
                var5 -= var7.right + var7.left;
                var6 -= var7.top + var7.bottom;
            }
            if (Statics.field2204 != var5 || Statics.field10343 != var6 || field9165) {
                if (Statics.renderer == null || Statics.renderer.method448()) {
                    method13896();
                } else {
                    Statics.field2204 = var5;
                    Statics.field10343 = var6;
                }
                field9063 = MonotonicTime.get() + 500L;
                field9165 = false;
            }
        }
        if (Fullscreen.allowed && Statics.fsFrame != null && !Statics.field578 && method6478(state)) {
            setWindowMode(Statics.options.maxScreenSize.getValue(), -1, -1, false);
        }
        boolean var8 = false;
        if (field4143) {
            field4143 = false;
            var8 = true;
        }
        if (var8) {
            method3536();
        }
        if (Statics.renderer != null && Statics.renderer.method447() || method12476() != 1) {
            method1703();
        }
        if (Statics.method2888(state)) {
            Loading.method15611(var8);
        } else if (method3223(state)) {
            method2868();
        } else if (method8612(state)) {
            method2868();
        } else if (method12326(state)) {
            if (world.method6087() == RebuildStage.field3775) {
                int var9 = world.method6088() / 2;
                Statics.method2579(LocalisedText.field6938.get(Statics.language) + TextUtil.field492 + "(" + var9 + "%)", true, Statics.renderer, Statics.field560, Statics.field9813);
            } else if (world.method6087() == RebuildStage.field3776) {
                int var10 = world.method6224() / 2 + 50;
                Statics.method2579(LocalisedText.field6938.get(Statics.language) + TextUtil.field492 + "(" + var10 + "%)", true, Statics.renderer, Statics.field560, Statics.field9813);
            } else {
                Statics.method2579(LocalisedText.field6938.get(Statics.language), true, Statics.renderer, Statics.field560, Statics.field9813);
            }
        } else if (state == 1) {
            method8591(var1);
        } else if (state == 9) {
            Statics.method2579(LocalisedText.field6961.get(Statics.language) + TextUtil.field492 + LocalisedText.field7025.get(Statics.language), false, Statics.renderer, Statics.field560, Statics.field9813);
        } else if (state == 0) {
            Statics.method2579(LocalisedText.field6999.get(Statics.language), false, Statics.renderer, Statics.field560, Statics.field9813);
        }
        if (field8929 == 3) {
            for (int var11 = 0; var11 < field9000; var11++) {
                Rectangle var12 = field9167[var11];
                if (field9166[var11]) {
                    Statics.renderer.drawRectangle(var12.x, var12.y, var12.width, var12.height, -65281);
                } else {
                    Statics.renderer.drawRectangle(var12.x, var12.y, var12.width, var12.height, -16711936);
                }
            }
        }
        if (DeveloperConsole.method14925()) {
            DeveloperConsole.method12188(Statics.renderer);
        }
        if (!Statics.method2888(state) && !method12326(state) && topLevelInterface != -1) {
            try {
                Statics.renderer.method509();
                Statics.renderer.method466();
            } catch (RendererException var15) {
                JagException.method16252(var15.getMessage() + " " + this.method6701(), var15);
                switch (Statics.options.field9661.getValue()) {
                    case 3:
                        GraphicsPacketQueue.method1838(var15.method15970());
                        Statics.method5600(1, false);
                        break;
                    default:
                        Statics.method5600(0, false);
                }
            }
        }
        VideoTypeList.method12632();
        int var14 = Statics.options.field9652.method15874();
        if (var14 == 0) {
            PreciseSleep.method7052(15L);
        } else if (var14 == 1) {
            PreciseSleep.method7052(10L);
        } else if (var14 == 2) {
            PreciseSleep.method7052(5L);
        } else if (var14 == 3) {
            PreciseSleep.method7052(2L);
        }
        if (field8938) {
            method2923();
        }
        if (Statics.options.field9669.method15877() == 1 && state == 6 && topLevelInterface != -1) {
            Statics.options.method15448(Statics.options.field9669, 0);
            Statics.method1245();
        }
    }

    @ObfuscatedName("gb.ey(I)V")
    public static final void method4010() {
        String var0 = Statics.field8439 == null ? method11406() : Statics.field8439;
        Browser.method3613(var0, false, Statics.options.field9661.getValue() == 5, field8915, field9218);
    }

    @ObfuscatedName("client.ap(I)V")
    public final void method6674() {
        if (field9156) {
            method831();
        }
        Loading.method7247();
        if (Statics.renderer != null) {
            Statics.renderer.method442();
        }
        if (Fullscreen.allowed && Statics.fsFrame != null) {
            Statics.method2431(Statics.field4013, Statics.fsFrame);
            Statics.fsFrame = null;
        }
        gameConnection.method1916();
        gameConnection.pingProvider.method1223();
        lobbyConnection.method1916();
        lobbyConnection.pingProvider.method1223();
        Statics.method12330();
        Statics.field848.method5777();
        Statics.field1210.method5723();
        if (field9192 != null) {
            field9192.method8636();
            field9192 = null;
        }
        try {
            Ping.quit();
        } catch (Throwable var4) {
        }
        ClientWatch.method16253();
        try {
            DeveloperConsole.method11118();
        } catch (Exception var3) {
        }
        if (field4146) {
            method4010();
        }
    }

    @ObfuscatedName("client.r(I)Ljava/lang/String;")
    public String method6701() {
        String var1 = " ";
        try {
            CoordGrid var2 = world.getBase();
            var1 = var1 + var2.x + TextUtil.field488 + var2.z + TextUtil.field488 + world.getSizeX() + TextUtil.field488 + world.getSizeZ() + " ";
            if (Statics.localPlayerEntity == null) {
                var1 = var1 + Statics.currentPlayerLevel + TextUtil.field488 + Statics.currentPlayerLevel + TextUtil.field488 + Statics.currentPlayerLevel + TextUtil.field488 + " ";
            } else {
                var1 = var1 + Statics.currentPlayerLevel + TextUtil.field488 + (var2.x + Statics.localPlayerEntity.routeWaypointX[0]) + TextUtil.field488 + (var2.z + Statics.localPlayerEntity.routeWaypointZ[0]) + " ";
            }
            var1 = var1 + Statics.options.field9661.getValue() + " ";
            var1 = var1 + Statics.options.field9637.method15829() + " ";
            var1 = var1 + method12476() + " " + Statics.canvasWid + TextUtil.field488 + Statics.canvasHei + " ";
            var1 = var1 + Statics.options.field9650.method15667() + " ";
            var1 = var1 + Statics.options.field9651.method15747() + " ";
            var1 = var1 + Statics.options.field9666.method15755() + " ";
            var1 = var1 + Statics.options.field9659.method15686() + " ";
            var1 = var1 + Statics.options.field9673.method15816() + " ";
            var1 = var1 + "0 ";
            var1 = var1 + field4152 + " ";
            var1 = var1 + state + " ";
            if (Statics.field2305 == null) {
                var1 = var1 + -1;
            } else {
                var1 = var1 + Statics.field2305.field9703;
            }
            var1 = var1 + " ";
            if (gamepack == null) {
                var1 = var1 + TextUtil.field488;
            } else {
                var1 = var1 + gamepack;
            }
            try {
                if (Statics.options.field9661.getValue() == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get(client.class.getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var1 = var1 + " " + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var17) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var18) {
                        }
                    }
                }
            } catch (Throwable var19) {
            }
        } catch (Throwable var20) {
        }
        return var1;
    }

    @ObfuscatedName("mb.ep(II)Z")
    public static boolean method6478(int arg0) {
        return arg0 == 6 || arg0 == 15 || arg0 == 11 || arg0 == 1;
    }

    @ObfuscatedName("vc.fd(II)Z")
    public static boolean method12490(int arg0) {
        return arg0 == 11 || arg0 == 7;
    }

    @ObfuscatedName("vj.fr(II)Z")
    public static boolean method12326(int arg0) {
        return arg0 == 5 || arg0 == 19 || arg0 == 16 || arg0 == 7 || arg0 == 17;
    }

    @ObfuscatedName("rn.fa(II)Z")
    public static boolean isStateTitle(int arg0) {
        return arg0 == 6 || arg0 == 5 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
    }

    @ObfuscatedName("ei.fc(II)Z")
    public static boolean method3223(int arg0) {
        return arg0 == 6 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
    }

    @ObfuscatedName("yf.fp(II)Z")
    public static boolean isStateLobby(int arg0) {
        return arg0 == 15 || arg0 == 19 || arg0 == 11 || arg0 == 7;
    }

    @ObfuscatedName("rc.fv(IB)Z")
    public static boolean method8612(int arg0) {
        return arg0 == 15 || arg0 == 11;
    }

    @ObfuscatedName("k.fn(II)Z")
    public static boolean isStateGame(int arg0) {
        return arg0 == 1 || arg0 == 16 || arg0 == 4;
    }

    @ObfuscatedName("sj.fl(II)V")
    public static void setState(int arg0) {
        if (state == arg0) {
            return;
        }
        field9017 = 0;
        if (arg0 == 9 || arg0 == 0) {
            LoginManager.method3950();
        }
        if (arg0 != 9 && Statics.field3529 != null) {
            Statics.field3529.method7192();
            Statics.field3529 = null;
        }
        if (arg0 == 6) {
            method12035(state == 14 || state == 8 || topLevelInterface != Statics.field4825.field5162);
        }
        if (arg0 == 15) {
            method1350(topLevelInterface != Statics.field4825.field5158);
        }
        if (arg0 == 3 || arg0 == 4) {
            if (!LoginManager.method7860()) {
                return;
            }
        } else if (arg0 == 18 || arg0 == 11 && state != 7) {
            if (!LoginManager.method3950()) {
                return;
            }
        } else if (arg0 == 8) {
            AccountCreationManager.method15481();
        }
        if (method12326(arg0)) {
            world.method6112();
            ClientWorldMap.reset(true);
        }
        if (arg0 == 16 || arg0 == 6) {
            method12288();
        }
        boolean var1 = arg0 == 10 || isStateTitle(arg0) || isStateLobby(arg0);
        boolean var2 = state == 10 || isStateTitle(state) || isStateLobby(state);
        if (var1 != var2) {
            if (var1) {
                AudioRenderer.field4202 = AudioRenderer.field4205;
                if (Statics.options.field9675.method15899() == 0) {
                    SoundRelated12.method3311(2);
                } else {
                    SoundRelated12.method11764(2, Statics.field9367, AudioRenderer.field4205, 0, Statics.options.field9675.method15899(), false);
                    AudioRenderer.method2572();
                }
                Statics.field848.method5744(false);
            } else {
                SoundRelated12.method3311(2);
                Statics.field848.method5744(true);
            }
        }
        if (method12326(arg0) || arg0 == 9 || arg0 == 0) {
            Statics.renderer.method587();
        }
        state = arg0;
    }

    @ObfuscatedName("client.ff(B)V")
    public void method14320() {
        boolean var1 = Statics.field848.method5742();
        if (!var1) {
            this.method14321();
        }
    }

    @ObfuscatedName("client.fx(I)V")
    public void method14321() {
        if (Statics.field848.field3602 > field9215) {
            Statics.field6772.method12026();
            field9164 = Statics.field848.field3602 * 250 - 250;
            if (field9164 > 3000) {
                field9164 = 3000;
            }
            if (Statics.field848.field3602 >= 2 && Statics.field848.field3591 == 6) {
                this.method6675("js5connect_outofdate");
                state = 13;
                return;
            }
            if (Statics.field848.field3602 >= 1 && Statics.field848.field3591 == 48) {
                this.method6675("sessionexpired");
                state = 13;
                return;
            }
            if (Statics.field848.field3602 >= 4 && Statics.field848.field3591 == -1) {
                this.method6675("js5crc");
                state = 13;
                return;
            }
            if (Statics.field848.field3602 >= 4 && Statics.method2888(state)) {
                if (Statics.field848.field3591 == 7 || Statics.field848.field3591 == 9) {
                    this.method6675("js5connect_full");
                } else if (Statics.field848.field3591 <= 0) {
                    this.method6675("js5io");
                } else if (field8962 == null) {
                    this.method6675("js5connect");
                } else {
                    this.method6675("js5proxy_" + field8962.trim());
                }
                state = 13;
                return;
            }
        }
        field9215 = Statics.field848.field3602;
        if (field9164 > 0) {
            field9164--;
            return;
        }
        try {
            if (field8958 == 0) {
                Statics.field4215 = Statics.field6772.method12025();
                field8958++;
            }
            if (field8958 == 1) {
                Statics.field3614 = Stream.method12184(Statics.field4215, 125000);
                int var1 = gamepack.length() + 9;
                Packet var2 = new Packet(var1 + 2);
                var2.p1(LoginProt.INIT_JS5REMOTE_CONNECTION.id);
                var2.p1(var1);
                var2.p4(client.REVISION);
                var2.p4(client.SUBREVISION);
                var2.pjstr(gamepack);
                Statics.field3614.method7193(var2.data, 0, var1 + 2);
                field8958++;
                Statics.field4263 = MonotonicTime.get();
            }
            if (field8958 == 2) {
                if (Statics.field3614.method7212(1)) {
                    byte[] var3 = new byte[1];
                    int var4 = Statics.field3614.method7196(var3, 0, 1);
                    if (var3[0] != 0) {
                        this.method14702(var4);
                        return;
                    }
                    field8958++;
                } else if (MonotonicTime.get() - Statics.field4263 > 30000L) {
                    this.method14702(1001);
                    return;
                }
            }
            if (field8958 == 3) {
                LoadableResource[] var5 = LoadableResource.method12194();
                int var6 = var5.length * 4;
                if (Statics.field3614.method7212(var6)) {
                    Packet var7 = new Packet(var6);
                    Statics.field3614.method7196(var7.data, 0, var7.data.length);
                    for (int var8 = 0; var8 < var5.length; var8++) {
                        var5[var8].method12191(var7.g4s());
                    }
                    boolean var9 = Statics.method2888(state) || isStateTitle(state) || isStateLobby(state);
                    Statics.field848.method5743(Statics.field3614, !var9);
                    Statics.field4215 = null;
                    Statics.field3614 = null;
                    field8958 = 0;
                }
            }
        } catch (IOException var11) {
            this.method14702(1002);
        }
    }

    @ObfuscatedName("client.fy(II)V")
    public void method14702(int arg0) {
        Statics.field4215 = null;
        Statics.field3614 = null;
        field8958 = 0;
        Statics.field848.field3602++;
        Statics.field848.field3591 = arg0;
    }

    @ObfuscatedName("uf.fj(ZB)V")
    public static void method12035(boolean arg0) {
        if (arg0) {
            if (topLevelInterface != -1) {
                Component.method13890(topLevelInterface);
            }
            for (SubInterface var1 = (SubInterface) field9075.method11928(); var1 != null; var1 = (SubInterface) field9075.method11929()) {
                if (!var1.method6982()) {
                    var1 = (SubInterface) field9075.method11928();
                    if (var1 == null) {
                        break;
                    }
                }
                closeSubInterface(var1, true, false);
            }
            topLevelInterface = -1;
            field9075 = new IterableMap(8);
            Statics.method4591();
            topLevelInterface = Statics.field4825.field5162;
            method1969(false);
            method1703();
            ScriptRunner.method11505(topLevelInterface, null);
        }
        LoginManager.method12896();
        LoginManager.field536 = false;
        MiniMenu.method3475();
        defaultCursor = -1;
        Statics.method7913(field9096);
        Statics.localPlayerEntity = new PlayerEntity(null);
        Statics.localPlayerEntity.method8552((float) (world.getSizeX() * 512 / 2), 0.0F, (float) (world.getSizeZ() * 512 / 2));
        Statics.localPlayerEntity.routeWaypointX[0] = world.getSizeX() / 2;
        Statics.localPlayerEntity.routeWaypointZ[0] = world.getSizeZ() / 2;
        Statics.cameraZ = 0;
        Statics.cameraX = 0;
        if (Statics.cameraState == 3) {
            Statics.cameraX = Statics.cameraMoveToX << 9;
            Statics.cameraZ = Statics.cameraMoveToZ << 9;
        } else {
            method6648();
        }
        world.getEnvironmentManager().method8154();
    }

    @ObfuscatedName("t.fo(ZI)V")
    public static void method1350(boolean arg0) {
        if (arg0) {
            if (topLevelInterface != -1) {
                Component.method13890(topLevelInterface);
            }
            for (SubInterface var1 = (SubInterface) field9075.method11928(); var1 != null; var1 = (SubInterface) field9075.method11929()) {
                if (!var1.method6982()) {
                    var1 = (SubInterface) field9075.method11928();
                    if (var1 == null) {
                        break;
                    }
                }
                closeSubInterface(var1, true, false);
            }
            topLevelInterface = -1;
            field9075 = new IterableMap(8);
            Statics.method4591();
            topLevelInterface = Statics.field4825.field5158;
            method1969(false);
            method1703();
            ScriptRunner.method11505(topLevelInterface, null);
        }
        LoginManager.field536 = true;
    }

    @ObfuscatedName("pp.fm(Lee;ZIZB)Lls;")
    public static Js5 method7706(Js5Archive arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4456 == null) {
            Statics.field4456 = new Js5NetResourceProvider[Statics.method15963()];
        }
        DiskStore var4 = null;
        int var5 = arg0.method3089();
        if (field4119 != null) {
            var4 = new DiskStore(var5, field4119, Statics.field4245[var5], 1500000);
        }
        Statics.field4456[var5] = Statics.field3562.method5579(var5, var4, Statics.field7137);
        Statics.field4456[var5].method14250();
        return new Js5(Statics.field4456[var5], arg1, arg2);
    }

    @ObfuscatedName("ga.fk(I)Lad;")
    public static ServerConnection getCurrentConnection() {
        return isStateLobby(state) ? lobbyConnection : gameConnection;
    }

    @ObfuscatedName("iw.fu(ILjava/lang/String;ZS)V")
    public static void method4567(int arg0, String arg1, boolean arg2) {
        Loading.method7247();
        method11395();
        method11119();
        method11054(arg0, arg1, arg2);
        Statics.field6784.method4838();
        Statics.field6784.method4837(field8914);
        DefaultSprites.method2931(Statics.renderer);
        DefaultSprites.method15812(Statics.renderer, Statics.field7387);
        MiniMenu.setFormattingDefault();
        MiniMenu.method3288(Statics.field8538);
        method1703();
        method13901();
        if (state == 6) {
            setState(5);
        } else if (state == 15) {
            setState(19);
        } else if (state == 11) {
            setState(7);
        } else if (state == 1) {
            setState(16);
        } else if (state == 2 || state == 10) {
            Loading.method3502();
        } else if (state == 14) {
            setState(17);
        } else if (state == 16) {
            PositionedSound.method6259(false);
        }
    }

    @ObfuscatedName("rb.fh(ILjava/lang/String;ZI)V")
    public static void method11054(int arg0, String arg1, boolean arg2) {
        if (arg0 == 0) {
            Statics.renderer = RendererToolkit.create(0, Statics.canvas, Statics.field8465, Statics.field2670, Statics.options.field9665.method15829() * 2);
            if (arg1 != null) {
                Statics.renderer.ba(1, 0);
                FontMetrics var3 = FontMetrics.create(Statics.field8745, Statics.field552, 0);
                Font var4 = Statics.renderer.createFont(var3, (PalettedSpriteData[]) SpriteDataProvider.get(Statics.field7387, Statics.field552, 0), true);
                method3536();
                Statics.method2579(arg1, true, Statics.renderer, var4, var3);
            }
        } else {
            label230:
            {
                RendererToolkit var5 = null;
                if (arg1 != null) {
                    var5 = RendererToolkit.create(0, Statics.canvas, Statics.field8465, Statics.field2670, 0);
                    var5.ba(1, 0);
                    FontMetrics var6 = FontMetrics.create(Statics.field8745, Statics.field552, 0);
                    Font var7 = var5.createFont(var6, (PalettedSpriteData[]) SpriteDataProvider.get(Statics.field7387, Statics.field552, 0), true);
                    method3536();
                    Statics.method2579(arg1, true, var5, var7, var6);
                }
                try {
                    try {
                        Statics.renderer = RendererToolkit.create(arg0, Statics.canvas, Statics.field8465, Statics.field2670, Statics.options.field9665.method15829() * 2);
                        if (arg1 != null) {
                            var5.ba(1, 0);
                            FontMetrics var8 = FontMetrics.create(Statics.field8745, Statics.field552, 0);
                            Font var9 = var5.createFont(var8, (PalettedSpriteData[]) SpriteDataProvider.get(Statics.field7387, Statics.field552, 0), true);
                            method3536();
                            Statics.method2579(arg1, true, var5, var9, var8);
                        }
                        if (Statics.renderer.method629()) {
                            boolean var10 = true;
                            try {
                                var10 = Statics.field2305.field9703 > 256;
                            } catch (Throwable var26) {
                            }
                            Heap var12;
                            if (var10) {
                                var12 = Statics.renderer.method593(146800640);
                            } else {
                                var12 = Statics.renderer.method593(104857600);
                            }
                            Statics.renderer.method502(var12);
                        }
                        break label230;
                    } catch (Throwable var27) {
                        switch (arg0) {
                            case 1:
                                GraphicsPacketQueue.method12023(ToolkitType.field7357);
                                break;
                            case 2:
                                GraphicsPacketQueue.method12023(ToolkitType.field7365);
                                break;
                            case 3:
                                GraphicsPacketQueue.method12023(ToolkitType.field7358);
                        }
                    }
                    int var15 = Statics.options.field9661.getValue();
                    if (var15 == 2) {
                        field8928 = true;
                    }
                    Statics.options.method15448(Statics.options.field9661, 0);
                    method11054(var15, arg1, arg2);
                } finally {
                    if (var5 != null) {
                        try {
                            var5.method442();
                        } catch (Throwable var25) {
                        }
                    }
                }
                return;
            }
        }
        if (arg2) {
            Statics.options.method15449(Statics.options.field9661, !arg2);
        }
        Statics.options.method15448(Statics.options.field9661, arg0);
        if (!arg2) {
            Statics.options.method15449(Statics.options.field9661, !arg2);
        }
        Statics.method7897();
        Statics.renderer.method673(10000);
        Statics.renderer.J(32);
        world.method6235();
        if (Statics.renderer.method450()) {
            method1741(Statics.options.field9673.method15816() == 1);
        }
        world.method6086();
        world.getEnvironmentManager().method8154();
        preferencesChangeNotified = false;
        field9165 = true;
        Statics.field8518 = null;
        Statics.renderer.GA(0.0F, 1.0F);
    }

    @ObfuscatedName("ud.fz(Lka;ZFFFFIII)V")
    public static void method12142(Matrix4x4 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        int var8 = world.method6108();
        int var9 = world.method6096();
        arg0.method5397(arg2, arg3, arg4, arg5, (float) var9, (float) var8, (float) arg6, (float) arg7);
    }

    @ObfuscatedName("tb.fi(B)V")
    public static void method11395() {
        if (Statics.renderer == null) {
            return;
        }
        world.method6111();
        MiniMap.method7992();
        MiniMenu.setFormattingDefault();
        Statics.method3616();
        world.method6086();
        SkyBox.method2612();
        method5025(false);
        DefaultSprites.method3095();
        ClientWorldMap.reset(true);
        ClientWorldMap.method7071();
        Loading.method3502();
        for (int var0 = 0; var0 < field9044.length; var0++) {
            if (field9044[var0] != null) {
            }
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            PlayerEntity var2 = players[var1];
            if (var2 != null) {
                for (int var3 = 0; var3 < var2.field8651.length; var3++) {
                    var2.field8651[var3] = null;
                }
            }
        }
        for (int var4 = 0; var4 < field8966; var4++) {
            NpcEntity var5 = (NpcEntity) field8965[var4].value;
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field8651.length; var6++) {
                    var5.field8651[var6] = null;
                }
            }
        }
        field9090.clear();
        Statics.renderer.method442();
        Statics.renderer = null;
    }

    @ObfuscatedName("sd.fb(I)V")
    public static void method11119() {
        Statics.keyboard.method7233();
        Statics.mouse.method7257();
        Statics.field1543.addcanvas();
        Statics.canvas.setBackground(Color.black);
        field9018 = -1;
        Statics.keyboard = Statics.method11115(Statics.canvas);
        Statics.mouse = Mouse.method8198(Statics.canvas, true);
    }

    @ObfuscatedName("dn.fw(B)V")
    public static void method2867() {
        if (Statics.renderer.method455()) {
            Statics.renderer.method461(Statics.canvas);
            method11119();
            Dimension var0 = Statics.canvas.getSize();
            Statics.renderer.method459(Statics.canvas, var0.width, var0.height);
            Statics.renderer.method462(Statics.canvas);
        } else {
            Statics.method5600(Statics.options.field9661.getValue(), false);
        }
        method1703();
    }

    @ObfuscatedName("n.fs(III)I")
    public static int method1380(int arg0, int arg1) {
        if (Statics.field4825.field5156 == -1) {
            return 1;
        }
        if (arg0 != Statics.options.field9661.getValue()) {
            method4567(arg0, LocalisedText.field6960.get(Statics.language), true);
            if (Statics.options.field9661.getValue() != arg0) {
                return -1;
            }
        }
        try {
            Dimension var2 = Statics.canvas.getSize();
            Statics.method2579(LocalisedText.field6960.get(Statics.language), true, Statics.renderer, Statics.field560, Statics.field9813);
            ModelUnlit var3 = ModelUnlit.method2664(Statics.field4560, Statics.field4825.field5156, 0);
            long var4 = MonotonicTime.get();
            Statics.renderer.L();
            field8925.method5114(0.0F, 256.0F, 0.0F);
            Statics.renderer.method524(field8925);
            Matrix4x4 var6 = Statics.renderer.method781();
            var6.method5397((float) (var2.width / 2), (float) (var2.height / 2), 512.0F, 512.0F, (float) world.method6096(), (float) world.method6108(), (float) var2.width, (float) var2.height);
            Statics.renderer.method784(var6);
            Statics.renderer.IA(1.0F);
            Statics.renderer.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            Model var7 = Statics.renderer.method625(var3, 2048, 64, 64, 768);
            int var8 = 0;
            label42:
            for (int var9 = 0; var9 < 500; var9++) {
                Statics.renderer.ba(3, 0);
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        field8979.method5114((float) (((float) var11 - (float) var10 / 2.0F) * 512.0F), 0.0F, (float) ((var10 + 1) * 512));
                        var7.method271(field8979, null, 0);
                        var8++;
                        if (MonotonicTime.get() - var4 >= (long) arg1) {
                            break label42;
                        }
                    }
                }
            }
            Statics.renderer.method441();
            long var12 = (long) (var8 * 1000) / (MonotonicTime.get() - var4);
            Statics.renderer.ba(3, 0);
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @ObfuscatedName("vy.fe(B)I")
    public static int method12476() {
        if (Fullscreen.allowed && Statics.fsFrame != null) {
            return 3;
        } else if (field9064) {
            return 2;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ob.fq(IIIZI)V")
    public static void setWindowMode(int arg0, int arg1, int arg2, boolean arg3) {
        field9063 = 0L;
        int var4 = method12476();
        if (arg0 == 3 || var4 == 3) {
            arg3 = true;
        }
        if (!Statics.renderer.method448()) {
            arg3 = true;
        }
        method3588(var4, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fx.ft(IIIIZB)V")
    public static void method3588(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (Fullscreen.allowed && Statics.fsFrame != null && (arg1 != 3 || Statics.field6693 != arg2 || Statics.field3315 != arg3)) {
            Statics.method2431(Statics.field4013, Statics.fsFrame);
            Statics.fsFrame = null;
        }
        if (Fullscreen.allowed && arg1 == 3 && Statics.fsFrame == null) {
            Statics.fsFrame = Fullscreen.method6036(Statics.field4013, arg2, arg3, 0, 0);
            if (Statics.fsFrame != null) {
                Statics.field6693 = arg2;
                Statics.field3315 = arg3;
                Statics.method1245();
            }
        }
        if (arg1 == 3 && (!Fullscreen.allowed || Statics.fsFrame == null)) {
            method3588(arg0, Statics.options.maxScreenSize.getValue(), -1, -1, true);
            return;
        }
        Container var5 = GameShell.method16494();
        if (Statics.fsFrame != null) {
            Statics.field2204 = arg2;
            Statics.field10343 = arg3;
        } else if (Statics.field1197 == null) {
            Statics.field2204 = var5.getSize().width;
            Statics.field10343 = var5.getSize().height;
        } else {
            Insets var6 = Statics.field1197.getInsets();
            int var10001 = var6.right + var6.left;
            Statics.field2204 = Statics.field1197.getSize().width - var10001;
            int var9 = var6.top + var6.bottom;
            Statics.field10343 = Statics.field1197.getSize().height - var9;
        }
        if (Statics.field2204 <= 0) {
            Statics.field2204 = 1;
        }
        if (Statics.field10343 <= 0) {
            Statics.field10343 = 1;
        }
        if (arg1 == 1) {
            Statics.canvasWid = field9067;
            field4147 = (Statics.field2204 - field9067) / 2;
            Statics.canvasHei = field9068;
            field4127 = 0;
        } else {
            method4635();
        }
        if (Statics.field6683 != ModeWhere.LIVE && Statics.canvasWid < 1024 && Statics.canvasHei < 768) {
        }
        if (arg4) {
            method2867();
        } else {
            Statics.canvas.setSize(Statics.canvasWid, Statics.canvasHei);
            Statics.renderer.method463(Statics.canvas, Statics.canvasWid, Statics.canvasHei);
            if (Statics.field1197 == var5) {
                Insets var7 = Statics.field1197.getInsets();
                Statics.canvas.setLocation(field4147 + var7.left, field4127 + var7.top);
            } else {
                Statics.canvas.setLocation(field4147, field4127);
            }
        }
        if (arg1 >= 2) {
            field9064 = true;
        } else {
            field9064 = false;
        }
        method3538();
        if (topLevelInterface != -1) {
            method1969(true);
        }
        if (gameConnection.getStream() != null && isStateGame(state)) {
            method15612();
        }
        for (int var8 = 0; var8 < 100; var8++) {
            field9204[var8] = true;
        }
        field4143 = true;
    }

    @ObfuscatedName("aev.gw(B)V")
    public static void method15612() {
        ClientMessage var0 = ClientMessage.createMessage(ClientProt.WINDOW_STATUS, gameConnection.randomOut);
        var0.buf.p1(method12476());
        var0.buf.p2(Statics.canvasWid);
        var0.buf.p2(Statics.canvasHei);
        var0.buf.p1(Statics.options.field9665.method15829());
        gameConnection.queue(var0);
    }

    @ObfuscatedName("zq.gn(B)V")
    public static void method13896() {
        client var0 = Statics.field1543;
        synchronized (Statics.field1543) {
            if (Statics.fsFrame == null) {
                Container var1 = GameShell.method16494();
                if (var1 != null) {
                    Statics.field2204 = var1.getSize().width;
                    Statics.field10343 = var1.getSize().height;
                    if (Statics.field1197 == var1) {
                        Insets var2 = Statics.field1197.getInsets();
                        Statics.field2204 -= var2.right + var2.left;
                        Statics.field10343 -= var2.top + var2.bottom;
                    }
                    if (Statics.field2204 <= 0) {
                        Statics.field2204 = 1;
                    }
                    if (Statics.field10343 <= 0) {
                        Statics.field10343 = 1;
                    }
                    if (method12476() == 1) {
                        Statics.canvasWid = field9067;
                        field4147 = (Statics.field2204 - field9067) / 2;
                        Statics.canvasHei = field9068;
                        field4127 = 0;
                    } else {
                        method4635();
                    }
                    if (Statics.field6683 != ModeWhere.LIVE && Statics.canvasWid < 1024 && Statics.canvasHei < 768) {
                    }
                    Statics.canvas.setSize(Statics.canvasWid, Statics.canvasHei);
                    if (Statics.renderer != null) {
                        Statics.renderer.method463(Statics.canvas, Statics.canvasWid, Statics.canvasHei);
                    }
                    if (Statics.field1197 == var1) {
                        Insets var3 = Statics.field1197.getInsets();
                        Statics.canvas.setLocation(field4147 + var3.left, field4127 + var3.top);
                    } else {
                        Statics.canvas.setLocation(field4147, field4127);
                    }
                    method3538();
                    if (topLevelInterface != -1) {
                        method1969(true);
                    }
                    method3536();
                }
            }
        }
    }

    @ObfuscatedName("fc.gp(S)V")
    public static void method3538() {
        int var0 = Statics.canvasWid;
        int var1 = Statics.canvasHei;
        if (Statics.field2204 < var0) {
            var0 = Statics.field2204;
        }
        if (Statics.field10343 < var1) {
            var1 = Statics.field10343;
        }
        try {
            JavascriptFunction.field3144.method4763(new Object[]{var0, var1, method12476(), Statics.options.field9677.method15794()});
        } catch (Throwable var3) {
        }
    }

    @ObfuscatedName("is.gq(I)V")
    public static void method4635() {
        int var0 = 0;
        if (Statics.options != null) {
            var0 = Statics.options.field9677.method15794();
        }
        if (var0 == 2) {
            int var1 = Statics.field2204 > 800 ? 800 : Statics.field2204;
            int var2 = Statics.field10343 > 600 ? 600 : Statics.field10343;
            Statics.canvasWid = var1;
            field4147 = (Statics.field2204 - var1) / 2;
            Statics.canvasHei = var2;
            field4127 = 0;
        } else if (var0 == 1) {
            int var3 = Statics.field2204 > 1024 ? 1024 : Statics.field2204;
            int var4 = Statics.field10343 > 768 ? 768 : Statics.field10343;
            Statics.canvasWid = var3;
            field4147 = (Statics.field2204 - var3) / 2;
            Statics.canvasHei = var4;
            field4127 = 0;
        } else {
            Statics.canvasWid = Statics.field2204;
            field4147 = 0;
            Statics.canvasHei = Statics.field10343;
            field4127 = 0;
        }
    }

    @ObfuscatedName("fc.gz(I)V")
    public static void method3536() {
        if (Statics.fsFrame != null) {
            return;
        }
        int var0 = field4147;
        int var1 = field4127;
        int var2 = Statics.field2204 - Statics.canvasWid - var0;
        int var3 = Statics.field10343 - Statics.canvasHei - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = GameShell.method16494();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1197 == var4) {
                Insets var7 = Statics.field1197.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field10343);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2204, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2204 + var5 - var2, var6, var2, Statics.field10343);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field10343 + var6 - var3, Statics.field2204, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ag.gk(ZI)Z")
    public static boolean method1741(boolean arg0) {
        boolean var1 = Statics.renderer.method600();
        if (arg0 == var1) {
            return true;
        }
        if (!arg0) {
            Statics.renderer.method558();
        } else if (!Statics.renderer.method539()) {
            arg0 = false;
        }
        if (arg0 == var1) {
            return false;
        } else {
            Statics.options.method15448(Statics.options.field9673, arg0 ? 1 : 0);
            Statics.method1245();
            return true;
        }
    }

    @ObfuscatedName("zx.gm(B)V")
    public static void method13901() {
        int var0 = 0;
        if (Statics.options.field9650.method15667() == 1) {
            int var1 = var0 | 0x1;
            int var2 = var1 | 0x10;
            int var3 = var2 | 0x20;
            int var4 = var3 | 0x2;
            var0 = var4 | 0x4;
        }
        if (Statics.options.field9659.method15686() == 0) {
            var0 |= 0x40;
        }
        Component.method1903(var0);
        world.getLocTypeList().method11473(var0);
        Statics.asyncRebuild.method6040().getLocTypeList().method11473(var0);
        Statics.objTypes.method12295(var0);
        Statics.field3774.method12557(var0);
        Statics.field4213.method11084(var0);
        HintArrow.method5011(var0);
        HintTrail.method3109(var0);
        SpotShadowFactory.method7280(var0);
        Statics.method7906(var0);
        ClientInvCache.method1319(var0);
        world.method6102();
    }

    @ObfuscatedName("pt.gh(I)V")
    public static final void method7731() {
        cutsceneId = -1;
        field8988 = 2;
        Statics.field4561 = null;
        Statics.field416 = null;
        CutsceneManager.method2911();
    }

    @ObfuscatedName("zp.gr(ZB)V")
    public static final void logout(boolean arg0) {
        ServerConnection[] var1 = connections;
        for (int var2 = 0; var2 < var1.length; var2++) {
            ServerConnection var3 = var1[var2];
            try {
                var3.method1912();
            } catch (IOException var7) {
            }
            var3.method1916();
        }
        LoginManager.method14090();
        method5025(false);
        world.method6111();
        world.method6110();
        ClientWorldMap.reset(false);
        CameraManager.method8391();
        SoundRelated12.method3311(2);
        AudioRenderer.field4202 = -1;
        AudioRenderer.field4203 = false;
        AudioRenderer.method2572();
        PositionedSound.method6259(true);
        ClientWorldMap.method3465();
        ClientWorldMap.method3318();
        Statics.method1681();
        if (arg0) {
            setState(4);
            return;
        }
        setState(6);
        try {
            BrowserControl.method12167(Statics.field6387, "loggedout");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("et.gf(B)V")
    public static final void method2923() {
        Statics.field3615.method8501(5);
        Statics.field4450.method11896(5);
        Statics.field7650.method3911(5);
        world.getLocTypeList().method11487(5);
        Statics.field3774.method12556(5);
        Statics.objTypes.method12291(5);
        Statics.field566.method11147(5);
        Statics.field4213.method11085(5);
        Statics.field4645.method7661(5);
        Statics.field6667.method4882(5);
        Statics.field1510.method12006(5);
        Statics.field7196.method11310(5);
        Statics.field7390.method12674(5);
        Statics.field1202.method8292(5);
        Statics.field3769.method7775(5);
        Statics.field8499.method7865(5);
        Statics.field850.method12495(5);
        Statics.paramTypes.method12596(5);
        Statics.field4678.method7368(5);
        Statics.field6360.method3608(5);
        Statics.field785.method12455(5);
        Statics.field3770.method12373(5);
        Statics.field5037.method7818(5);
        Statics.field6705.method7327(5);
        PlayerModel.method4781(5);
        Component.method11405(50);
        Statics.field6784.method4846(50);
        HintArrow.method8096(5);
        SpotShadowFactory.method8061(5);
        field9131.method7921(5);
        MiniMenu.field620.method7921(5);
        ScriptRunner.field5207.method7921(5);
    }

    @ObfuscatedName("ki.gb(ZI)V")
    public static final void method5025(boolean arg0) {
        if (!arg0) {
            Statics.field3615.method8500();
            Statics.field4450.method11894();
            Statics.field7650.method3910();
            world.getLocTypeList().method11479();
            Statics.field3774.method12558();
            Statics.objTypes.method12296();
            Statics.field566.method11143();
            Statics.field4213.method11088();
            Statics.field4645.method7660();
            Statics.field6667.method4881();
            Statics.field1510.method12005();
            Statics.field7196.method11312();
            Statics.field7390.method12671();
            Statics.field1202.method8291();
            Statics.field3769.method7774();
            Statics.field850.method12496();
            Statics.field8499.clearCache();
            Statics.paramTypes.method12595();
            Statics.field4678.method7363();
            Statics.field6360.method3602();
            Statics.field785.method12464();
            Statics.field3770.method12372();
            Statics.field5037.method7817();
            Statics.field6705.method7329();
            PlayerModel.method1323();
            Component.method7973();
            Statics.field6784.method4849();
            ClientInvCache.method6970();
            if (Statics.field6683 != ModeWhere.LIVE) {
                for (int var1 = 0; var1 < Statics.field2391.length; var1++) {
                    Statics.field2391[var1] = null;
                }
                field8930 = 0;
            }
            world.getEnvironmentManager().method8178();
            HintArrow.method7558();
            SpotShadowFactory.method4036();
            ParticleEmitterType.method4807();
            ParticleEffectorType.method7882();
            ScriptRunner.field5207.method7922();
            field9131.method7922();
            MiniMenu.field620.method7922();
        }
        Statics.method4012();
        Statics.method7897();
    }

    @ObfuscatedName("qi.go(I)V")
    public static final void method8047() {
        if (isStateLobby(state) || isStateTitle(state)) {
            logout(false);
        } else {
            Statics.field3529 = gameConnection.getStream();
            gameConnection.closeForcefully();
            setState(9);
        }
    }

    @ObfuscatedName("ra.gi(I)V")
    public static void method831() {
        FileOnDisk var0 = null;
        try {
            var0 = GameShell.method4031("2", modeGame.field6404, true);
            Packet var1 = new Packet(field9155 * 6 + 3);
            var1.p1(1);
            var1.p2(field9155);
            for (int var2 = 0; var2 < Statics.field6666.length; var2++) {
                if (Statics.field2210[var2]) {
                    var1.p2(var2);
                    var1.p4(Statics.field6666[var2]);
                }
            }
            var0.method12075(var1.data, 0, var1.pos);
        } catch (Exception var6) {
        }
        try {
            if (var0 != null) {
                var0.method12076();
            }
        } catch (Exception var5) {
        }
        field9157 = MonotonicTime.get();
        field9156 = false;
    }

    @ObfuscatedName("client.ga(I)V")
    public final void updateTitleScreen() {
        if (state == 15 && !Statics.method16489() || state == 11 && LoginManager.field538 == 42 || state == 3 && (LoginManager.field537 == 49 || LoginManager.field537 == 52) || state == 14) {
            if (systemUpdateTimer > 1) {
                systemUpdateTimer--;
                miscTransmitNum = interfaceUpdateNum;
            }
            if (!MiniMenu.open) {
                MiniMenu.method1401();
            }
            if (state != 3 || LoginManager.field537 != 49 && LoginManager.field537 != 52) {
                for (int var1 = 0; var1 < 100 && readServerProt(lobbyConnection); var1++) {
                }
            }
        }
        method8601();
        ClientWatch.method4689();
        sceneDelta++;
        Statics.method11384(-1, -1);
        MiniMenu.updateMouseOverText(null, -1, -1);
        updateTopLevelInterface();
        interfaceUpdateNum++;
        for (int var2 = 0; var2 < field8966; var2++) {
            NpcEntity var3 = (NpcEntity) field8965[var2].value;
            if (var3 != null) {
                byte var4 = var3.type.field7220;
                if ((var4 & 0x1) != 0) {
                    int var5 = var3.size();
                    if ((var4 & 0x2) != 0 && var3.routeLength == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var6 != 0 || var7 != 0) {
                            int var8 = var3.routeWaypointX[0] + var6;
                            int var9 = var3.routeWaypointZ[0] + var7;
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > world.getSizeX() - var5 - 1) {
                                var8 = world.getSizeX() - var5 - 1;
                            }
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > world.getSizeZ() - var5 - 1) {
                                var9 = world.getSizeZ() - var5 - 1;
                            }
                            int var10 = PathFinder.method15625(var3.routeWaypointX[0], var3.routeWaypointZ[0], var5, PathFinderEntityRelated.method6645(var8, var9, var5, var5, 0), world.method6101(var3.level), true, field9001, field9065);
                            if (var10 > 0) {
                                if (var10 > 9) {
                                    var10 = 9;
                                }
                                for (int var11 = 0; var11 < var10; var11++) {
                                    var3.routeWaypointX[var11] = field9001[var10 - var11 - 1];
                                    var3.routeWaypointZ[var11] = field9065[var10 - var11 - 1];
                                    var3.field8645[var11] = MoveSpeed.field3921.id;
                                }
                                var3.routeLength = var10;
                            }
                        }
                    }
                    updateMovement(var3, true);
                    int var12 = Statics.method3510(var3);
                    method4714(var3);
                    method3581(var3, Statics.field6762, Statics.field2089, var12);
                    method12736(var3, Statics.field6762);
                    Statics.method11843(var3);
                    Quaternion var13 = Quaternion.method5206();
                    var13.method5217(Trig1.method5096(var3.field8638.method1387()), Trig1.method5096(var3.field8611.method1387()), Trig1.method5096(var3.field8639.method1387()));
                    var3.method8550(var13);
                    var13.method5209();
                }
            }
        }
        if ((state == 6 || state == 11 || state == 15 || state == 14) && (!Statics.method16489() || state == 11 && LoginManager.field538 == 42 || state == 3 && (LoginManager.field537 == 49 || LoginManager.field537 == 52)) && !Statics.method8399()) {
            if (Statics.cameraState == 3) {
                method11197();
            } else {
                method6648();
            }
            if (Statics.cameraX >> 9 < 14 || Statics.cameraX >> 9 >= world.getSizeX() - 14 || Statics.cameraZ >> 9 < 14 || Statics.cameraZ >> 9 >= world.getSizeZ() - 14) {
                world.method6135(new RebuildRequest(RebuildType.field3838, null));
            }
        }
        while (true) {
            HookRequest var14;
            Component var15;
            Component var16;
            do {
                var14 = (HookRequest) field9159.method11560();
                if (var14 == null) {
                    while (true) {
                        HookRequest var17;
                        Component var18;
                        Component var19;
                        do {
                            var17 = (HookRequest) field9125.method11560();
                            if (var17 == null) {
                                while (true) {
                                    HookRequest var20;
                                    Component var21;
                                    Component var22;
                                    do {
                                        var20 = (HookRequest) hookRequests.method11560();
                                        if (var20 == null) {
                                            if (dragComponent != null) {
                                                method7350();
                                            }
                                            if (loopCycle % 1500 == 0) {
                                                method12288();
                                            }
                                            if (state == 15 && !Statics.method16489() || state == 11 && LoginManager.field538 == 42 || state == 3 && (LoginManager.field537 == 49 || LoginManager.field537 == 52)) {
                                                MiniMenu.update();
                                            }
                                            WorldSwitcher.method11538();
                                            if (field9156 && field9157 < MonotonicTime.get() - 60000L) {
                                                method831();
                                            }
                                            for (TimestampMessage var23 = (TimestampMessage) field8934.method11649(); var23 != null; var23 = (TimestampMessage) field8934.method11644()) {
                                                if ((long) var23.field9262 < MonotonicTime.get() / 1000L - 5L) {
                                                    if (var23.field9264 > 0) {
                                                        ChatHistory.addMessage(5, 0, "", "", "", var23.field9263 + LocalisedText.field6986.get(Statics.language));
                                                    }
                                                    if (var23.field9264 == 0) {
                                                        ChatHistory.addMessage(5, 0, "", "", "", var23.field9263 + LocalisedText.field6987.get(Statics.language));
                                                    }
                                                    var23.method6975();
                                                }
                                            }
                                            if (state == 15 && !Statics.method16489() || state == 11 && LoginManager.field538 == 42 || state == 3 && (LoginManager.field537 == 49 || LoginManager.field537 == 52) || state == 14) {
                                                if (state != 11 && lobbyConnection.getStream() == null) {
                                                    logout(false);
                                                    return;
                                                }
                                                if (lobbyConnection != null) {
                                                    lobbyConnection.numConnections++;
                                                    if (lobbyConnection.numConnections > 50) {
                                                        ClientMessage var24 = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, lobbyConnection.randomOut);
                                                        lobbyConnection.queue(var24);
                                                    }
                                                    try {
                                                        lobbyConnection.method1912();
                                                    } catch (IOException var26) {
                                                        if (state == 11) {
                                                            lobbyConnection.method1916();
                                                        } else {
                                                            logout(false);
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.component;
                                        if (var21.parentlayer < 0) {
                                            break;
                                        }
                                        var22 = Component.method11381(var21.field1886);
                                    } while (var22 == null || var22.field1915 == null || var21.parentlayer >= var22.field1915.length || var22.field1915[var21.parentlayer] != var21);
                                    ScriptRunner.runHook(var20);
                                }
                            }
                            var18 = var17.component;
                            if (var18.parentlayer < 0) {
                                break;
                            }
                            var19 = Component.method11381(var18.field1886);
                        } while (var19 == null || var19.field1915 == null || var18.parentlayer >= var19.field1915.length || var19.field1915[var18.parentlayer] != var18);
                        ScriptRunner.runHook(var17);
                    }
                }
                var15 = var14.component;
                if (var15.parentlayer < 0) {
                    break;
                }
                var16 = Component.method11381(var15.field1886);
            } while (var16 == null || var16.field1915 == null || var15.parentlayer >= var16.field1915.length || var16.field1915[var15.parentlayer] != var15);
            ScriptRunner.runHook(var14);
        }
    }

    @ObfuscatedName("rj.gd(I)V")
    public static final void method8601() {
        for (int var0 = Statics.field2669.method1640(true); var0 != -1; var0 = Statics.field2669.method1640(false)) {
            method4113(var0);
            field9135[++field9183 - 1 & 0x1F] = var0;
        }
        for (DelayedStateChange var1 = DelayedStateChange.method12910(); var1 != null; var1 = DelayedStateChange.method12910()) {
            int var2 = var1.method16508();
            long var3 = var1.method16612();
            if (var2 == 1) {
                // varcs
                Statics.field6666[(int) var3] = var1.field10321;
                field9156 |= Statics.field2210[(int) var3];
                field9141[++field9036 - 1 & 0x1F] = (int) var3;
            } else if (var2 == 2) {
                // varcstrs
                Statics.field3498[(int) var3] = var1.field10300;
                field9143[++field9144 - 1 & 0x1F] = (int) var3;
            } else if (var2 == 3) {
                Component var5 = Component.method11381((int) var3);
                if (!var1.field10300.equals(var5.text)) {
                    var5.text = var1.field10300;
                    requestRedrawComponent(var5);
                }
            } else if (var2 == 22) {
                Component var6 = Component.method11381((int) var3);
                if (var6.field1860 != (var1.field10321 == 1)) {
                    var6.field1860 = var1.field10321 == 1;
                    requestRedrawComponent(var6);
                }
            } else if (var2 == 4) {
                Component var7 = Component.method11381((int) var3);
                int var8 = var1.field10321;
                int var9 = var1.field10298;
                int var10 = var1.field10299;
                if (var7.field1806 != var8 || var7.field1838 != var9 || var7.field1832 != var10) {
                    var7.field1806 = var8;
                    var7.field1838 = var9;
                    var7.field1832 = var10;
                    var7.field1930 = null;
                    requestRedrawComponent(var7);
                }
            } else if (var2 == 5) {
                Component var11 = Component.method11381((int) var3);
                if (var1.field10321 != var11.field1747) {
                    if (var1.field10321 == -1) {
                        var11.field1789 = null;
                    } else {
                        if (var11.field1789 == null) {
                            var11.field1789 = new InterfaceAnimationNode();
                        }
                        var11.field1789.method11769(var1.field10321);
                    }
                    var11.field1747 = var1.field10321;
                    requestRedrawComponent(var11);
                }
            } else if (var2 == 6) {
                int var12 = var1.field10321;
                int var13 = var12 >> 10 & 0x1F;
                int var14 = var12 >> 5 & 0x1F;
                int var15 = var12 & 0x1F;
                int var16 = (var15 << 3) + (var13 << 19) + (var14 << 11);
                Component var17 = Component.method11381((int) var3);
                if (var17.colour != var16) {
                    var17.colour = var16;
                    requestRedrawComponent(var17);
                }
            } else if (var2 == 7) {
                Component var18 = Component.method11381((int) var3);
                boolean var19 = var1.field10321 == 1;
                if (var18.field1807 != var19) {
                    var18.field1807 = var19;
                    requestRedrawComponent(var18);
                }
            } else if (var2 == 8) {
                Component var20 = Component.method11381((int) var3);
                if (var1.field10321 != var20.field1812 || var1.field10298 != var20.field1813 || var1.field10299 != var20.field1818) {
                    var20.field1812 = var1.field10321;
                    var20.field1813 = var1.field10298;
                    var20.field1818 = var1.field10299;
                    if (var20.invobject != -1) {
                        if (var20.field1819 > 0) {
                            var20.field1818 = var20.field1818 * 32 / var20.field1819;
                        } else if (var20.field1910 > 0) {
                            var20.field1818 = var20.field1818 * 32 / var20.field1910;
                        }
                    }
                    requestRedrawComponent(var20);
                }
            } else if (var2 == 9) {
                Component var21 = Component.method11381((int) var3);
                if (var1.field10321 != var21.invobject || var1.field10298 != var21.invcount) {
                    var21.invobject = var1.field10321;
                    var21.invcount = var1.field10298;
                    requestRedrawComponent(var21);
                }
            } else if (var2 == 10) {
                Component var22 = Component.method11381((int) var3);
                if (var1.field10321 != var22.field1810 || var1.field10298 != var22.field1824 || var1.field10299 != var22.field1814) {
                    var22.field1810 = var1.field10321;
                    var22.field1824 = var1.field10298;
                    var22.field1814 = var1.field10299;
                    requestRedrawComponent(var22);
                }
            } else if (var2 == 11) {
                Component var23 = Component.method11381((int) var3);
                var23.field1829 = 0;
                var23.field1776 = var23.field1772 = var1.field10321;
                var23.field1769 = 0;
                var23.field1777 = var23.field1774 = var1.field10298;
                requestRedrawComponent(var23);
            } else if (var2 == 12) {
                Component var24 = Component.method11381((int) var3);
                int var25 = var1.field10321;
                if (var24 != null && var24.type == 0) {
                    if (var25 > var24.field1894 - var24.renderheight) {
                        var25 = var24.field1894 - var24.renderheight;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var24.scrolly != var25) {
                        var24.scrolly = var25;
                        requestRedrawComponent(var24);
                    }
                }
            } else if (var2 == 14) {
                Component var26 = Component.method11381((int) var3);
                var26.field1797 = var1.field10321;
            } else if (var2 == 15) {
                MiniMap.mapFlag = true;
                MiniMap.mapFlagX = var1.field10321;
                MiniMap.mapFlagZ = var1.field10298;
            } else if (var2 == 16) {
                Component var27 = Component.method11381((int) var3);
                var27.field1793 = var1.field10321;
            } else if (var2 == 20) {
                Component var28 = Component.method11381((int) var3);
                var28.field1833 = var1.field10321 == 1;
            } else if (var2 == 21) {
                Component var29 = Component.method11381((int) var3);
                var29.field1805 = var1.field10321 == 1;
            } else if (var2 == 17) {
                Component var30 = Component.method11381((int) var3);
                var30.field1737 = var1.field10321;
            } else if (var2 == 18) {
                Component var31 = Component.method11381((int) var3);
                int var32 = (int) (var3 >> 32);
                var31.method3158(var32, (short) var1.field10321, (short) var1.field10298);
            } else if (var2 == 19) {
                Component var33 = Component.method11381((int) var3);
                int var34 = (int) (var3 >> 32);
                var33.method3131(var34, (short) var1.field10321, (short) var1.field10298);
            }
        }
    }

    @ObfuscatedName("tb.gj(I)V")
    public static final void method11396() {
        MiniMap.method3580(Statics.renderer);
        if (Statics.currentPlayerLevel != field9210) {
            Statics.method7076();
        }
    }

    @ObfuscatedName("acx.gu(I)V")
    public static final void method14780() {
        int[] var0 = ReceivePlayerPositions.highResolutionsIndices;
        for (int var1 = 0; var1 < ReceivePlayerPositions.highResolutionsCount; var1++) {
            PlayerEntity var2 = players[var0[var1]];
            if (var2 != null) {
                var2.method13962();
            }
        }
        for (int var3 = 0; var3 < npcCount; var3++) {
            long var4 = (long) field9056[var3];
            ObjectNode var6 = (ObjectNode) npcs.getNode(var4);
            if (var6 != null) {
                ((PathingEntity) var6.value).method13962();
            }
        }
        if (field8988 != 0) {
            return;
        }
        for (int var7 = 0; var7 < Statics.field1537.length; var7++) {
            CutsceneEntity var8 = Statics.field1537[var7];
            if (var8.field1563) {
                var8.method2854().method13962();
            }
        }
    }

    @ObfuscatedName("e.gy(I)[Lus;")
    public static FullscreenMode[] method1671() {
        if (Statics.field8518 == null) {
            FullscreenMode[] var0 = Statics.method11507(Statics.field4013);
            FullscreenMode[] var1 = new FullscreenMode[var0.length];
            int var2 = 0;
            int var3 = Statics.options.field9677.method15794();
            label71:
            for (int var4 = 0; var4 < var0.length; var4++) {
                FullscreenMode var5 = var0[var4];
                if ((var5.field6708 <= 0 || var5.field6708 >= 24) && var5.field6709 >= 800 && var5.field6707 >= 600 && (var3 != 2 || var5.field6709 <= 800 && var5.field6707 <= 600) && (var3 != 1 || var5.field6709 <= 1024 && var5.field6707 <= 768)) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        FullscreenMode var7 = var1[var6];
                        if (var5.field6709 == var7.field6709 && var5.field6707 == var7.field6707) {
                            if (var5.field6708 > var7.field6708) {
                                var1[var6] = var5;
                            }
                            continue label71;
                        }
                    }
                    var1[var2] = var5;
                    var2++;
                }
            }
            Statics.field8518 = new FullscreenMode[var2];
            System.arraycopy(var1, 0, Statics.field8518, 0, var2);
            int[] var8 = new int[Statics.field8518.length];
            for (int var9 = 0; var9 < Statics.field8518.length; var9++) {
                FullscreenMode var10 = Statics.field8518[var9];
                var8[var9] = var10.field6709 * var10.field6707;
            }
            Algorithms.method15733(var8, Statics.field8518);
        }
        return Statics.field8518;
    }

    @ObfuscatedName("nt.gt(I)V")
    public static final void method6648() {
        if (cameraSplinePos == -1 || field9034 == -1) {
            return;
        }

        int rate = (cameraSplineRate * (cameraSplineEnd - cameraSplineStart) >> 16) + cameraSplineStart;
        cameraSplineRate += rate;
        if (cameraSplineRate >= 65535) {
            cameraSplineRate = 65535;
            if (cameraSplineAtEnd) {
                cameraFinished = false;
            } else {
                cameraFinished = true;
            }
            cameraSplineAtEnd = true;
        } else {
            cameraFinished = false;
            cameraSplineAtEnd = false;
        }

        float t = (float) cameraSplineRate / 65535.0F;
        float[] pos = new float[3];
        int posIdx = cameraSplinePosOffset * 2;
        for (int i = 0; i < 3; i++) {
            int tp0 = cameraSpline[cameraSplinePos][posIdx][i] * 3;
            int tp1 = cameraSpline[cameraSplinePos][posIdx + 1][i] * 3;
            int tp2 = (cameraSpline[cameraSplinePos][posIdx + 2][i] - (cameraSpline[cameraSplinePos][posIdx + 3][i] - cameraSpline[cameraSplinePos][posIdx + 2][i])) * 3;
            int d = cameraSpline[cameraSplinePos][posIdx][i];
            int c = tp1 - tp0;
            int b = tp0 - tp1 * 2 + tp2;
            int a = cameraSpline[cameraSplinePos][posIdx + 2][i] - d + tp1 - tp2;
            pos[i] = (((float) a * t + (float) b) * t + (float) c) * t + (float) d;
        }

        CoordGrid areaBase = world.getBase();
        Statics.cameraX = (int) pos[0] - areaBase.x * 512;
        Statics.cameraY = (int) pos[1] * -1;
        Statics.cameraZ = (int) pos[2] - areaBase.z * 512;

        float[] look = new float[3];
        int lookIdx = field8995 * 2;
        for (int i = 0; i < 3; i++) {
            int tp0 = cameraSpline[field9034][lookIdx][i] * 3;
            int tp1 = cameraSpline[field9034][lookIdx + 1][i] * 3;
            int tp2 = (cameraSpline[field9034][lookIdx + 2][i] - (cameraSpline[field9034][lookIdx + 3][i] - cameraSpline[field9034][lookIdx + 2][i])) * 3;
            int d = cameraSpline[field9034][lookIdx][i];
            int c = tp1 - tp0;
            int b = tp0 - tp1 * 2 + tp2;
            int a = cameraSpline[field9034][lookIdx + 2][i] - d + tp1 - tp2;
            look[i] = (((float) a * t + (float) b) * t + (float) c) * t + (float) d;
        }

        float deltaX = look[0] - pos[0];
        float deltaY = (look[1] - pos[1]) * -1.0F;
        float deltaZ = look[2] - pos[2];
        double delta = Math.sqrt((double) (deltaX * deltaX + deltaZ * deltaZ));

        Statics.cameraPitch = (int) (Math.atan2((double) deltaY, delta) * 2607.5945876176133D) & 0x3FFF;
        Statics.cameraYaw = (int) (-Math.atan2((double) deltaX, (double) deltaZ) * 2607.5945876176133D) & 0x3FFF;
        Statics.cameraRoll = (cameraSplineRate * (cameraSpline[cameraSplinePos][posIdx + 2][3] - cameraSpline[cameraSplinePos][posIdx][3]) >> 16) + cameraSpline[cameraSplinePos][posIdx][3];
    }

    @ObfuscatedName("su.gx(B)V")
    public static final void method11197() {
        int var0 = Statics.cameraMoveToX * 512 + 256;
        int var1 = Statics.cameraMoveToZ * 512 + 256;
        int var2 = getHeightmapY(var0, var1, Statics.currentPlayerLevel) - Statics.cameraMoveToY;
        if (Statics.cameraMoveToRate >= 100) {
            Statics.cameraX = Statics.cameraMoveToX * 512 + 256;
            Statics.cameraZ = Statics.cameraMoveToZ * 512 + 256;
            Statics.cameraY = getHeightmapY(Statics.cameraX, Statics.cameraZ, Statics.currentPlayerLevel) - Statics.cameraMoveToY;
        } else {
            if (Statics.cameraX < var0) {
                Statics.cameraX += Statics.cameraMoveToRate * (var0 - Statics.cameraX) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraX > var0) {
                    Statics.cameraX = var0;
                }
            }
            if (Statics.cameraX > var0) {
                Statics.cameraX -= Statics.cameraMoveToRate * (Statics.cameraX - var0) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraX < var0) {
                    Statics.cameraX = var0;
                }
            }
            if (Statics.cameraY < var2) {
                Statics.cameraY += Statics.cameraMoveToRate * (var2 - Statics.cameraY) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraY > var2) {
                    Statics.cameraY = var2;
                }
            }
            if (Statics.cameraY > var2) {
                Statics.cameraY -= Statics.cameraMoveToRate * (Statics.cameraY - var2) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraY < var2) {
                    Statics.cameraY = var2;
                }
            }
            if (Statics.cameraZ < var1) {
                Statics.cameraZ += Statics.cameraMoveToRate * (var1 - Statics.cameraZ) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraZ > var1) {
                    Statics.cameraZ = var1;
                }
            }
            if (Statics.cameraZ > var1) {
                Statics.cameraZ -= Statics.cameraMoveToRate * (Statics.cameraZ - var1) / 1000 + Statics.cameraMoveToStep;
                if (Statics.cameraZ < var1) {
                    Statics.cameraZ = var1;
                }
            }
        }
        int var3 = Statics.cameraLookX * 512 + 256;
        int var4 = Statics.cameraLookZ * 512 + 256;
        int var5 = getHeightmapY(var3, var4, Statics.currentPlayerLevel) - Statics.cameraLookY;
        int var6 = var3 - Statics.cameraX;
        int var7 = var5 - Statics.cameraY;
        int var8 = var4 - Statics.cameraZ;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 2607.5945876176133D) & 0x3FFF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -2607.5945876176133D) & 0x3FFF;
        if (var10 < 1024) {
            var10 = 1024;
        }
        if (var10 > 3072) {
            var10 = 3072;
        }
        if (Statics.cameraPitch < var10) {
            Statics.cameraPitch += (var10 - Statics.cameraPitch >> 3) * Statics.cameraRotateSpeed / 1000 + Statics.cameraRotateAcceleration << 3;
            if (Statics.cameraPitch > var10) {
                Statics.cameraPitch = var10;
            }
        }
        if (Statics.cameraPitch > var10) {
            Statics.cameraPitch -= (Statics.cameraPitch - var10 >> 3) * Statics.cameraRotateSpeed / 1000 + Statics.cameraRotateAcceleration << 3;
            if (Statics.cameraPitch < var10) {
                Statics.cameraPitch = var10;
            }
        }
        int var12 = var11 - Statics.cameraYaw;
        if (var12 > 8192) {
            var12 -= 16384;
        }
        if (var12 < -8192) {
            var12 += 16384;
        }
        int var13 = var12 >> 3;
        if (var13 > 0) {
            Statics.cameraYaw += Statics.cameraRotateSpeed * var13 / 1000 + Statics.cameraRotateAcceleration << 3;
            Statics.cameraYaw &= 0x3FFF;
        }
        if (var13 < 0) {
            Statics.cameraYaw -= Statics.cameraRotateSpeed * -var13 / 1000 + Statics.cameraRotateAcceleration << 3;
            Statics.cameraYaw &= 0x3FFF;
        }
        int var14 = var11 - Statics.cameraYaw;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            Statics.cameraYaw = var11;
        }
        Statics.cameraRoll = 0;
    }

    @ObfuscatedName("aac.he(J)V")
    public static final void method14083(long arg0) {
        Vector3 var2 = Statics.localPlayerEntity.getTransform().trans;
        int var3 = field9050 + (int) var2.x;
        int var4 = field9006 + (int) var2.z;
        if (Statics.cameraOrbitX - var3 < -2000 || Statics.cameraOrbitX - var3 > 2000 || Statics.cameraOrbitZ - var4 < -2000 || Statics.cameraOrbitZ - var4 > 2000) {
            Statics.cameraOrbitX = var3;
            Statics.cameraOrbitZ = var4;
        }
        if (Statics.cameraOrbitX != var3) {
            int var5 = var3 - Statics.cameraOrbitX;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            Statics.cameraOrbitX += var6;
        }
        if (Statics.cameraOrbitZ != var4) {
            int var7 = var4 - Statics.cameraOrbitZ;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            Statics.cameraOrbitZ += var8;
        }
        field9021 += (float) arg0 * field9022 / 6.0F;
        field9171 += (float) arg0 * field8990 / 6.0F;
        method12187();
    }

    @ObfuscatedName("aex.hk(J)V")
    public static final void method15618(long arg0) {
        int var2 = field9154;
        int var3 = field9019;
        if (Statics.cameraOrbitX != var2) {
            int var4 = var2 - Statics.cameraOrbitX;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            Statics.cameraOrbitX += var5;
        }
        if (Statics.cameraOrbitZ != var3) {
            int var6 = var3 - Statics.cameraOrbitZ;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var7 > var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            Statics.cameraOrbitZ += var7;
        }
        field9021 += (float) arg0 * field9022 / 40.0F * 8.0F;
        field9171 += (float) arg0 * field8990 / 40.0F * 8.0F;
        method12187();
    }

    @ObfuscatedName("ei.hq(B)V")
    public static final void method3224() {
        if (!field9016) {
            field8990 += (-12.0F - field8990) / 2.0F;
            field9028 = true;
            field9016 = true;
        }
    }

    @ObfuscatedName("ru.hx(I)V")
    public static final void method8624() {
        if (!field8913) {
            field9022 += (24.0F - field9022) / 2.0F;
            field9028 = true;
            field8913 = true;
        }
    }

    @ObfuscatedName("dj.hs(I)V")
    public static final void method2613() {
        if (!field8913) {
            field9022 += (-24.0F - field9022) / 2.0F;
            field9028 = true;
            field8913 = true;
        }
    }

    @ObfuscatedName("rk.ha(IIII)V")
    public static void method8486(int arg0, int arg1, int arg2) {
        int var3 = arg0 << 3;
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        field9171 = var3;
        field9021 = var4;
        if (Statics.cameraState == 3) {
            Statics.cameraPitch = var3;
            Statics.cameraYaw = var4;
            Statics.cameraRoll = var5;
        }
        method12187();
        field9028 = true;
    }

    @ObfuscatedName("va.hb(I)V")
    public static final void method12187() {
        if (field9171 < 1089.0F) {
            field9171 = 1089.0F;
        }
        if (field9171 > 2985.0F) {
            field9171 = 2985.0F;
        }
        while (field9021 >= 16384.0F) {
            field9021 -= 16384.0F;
        }
        while (field9021 < 0.0F) {
            field9021 += 16384.0F;
        }
        SceneLevelTileFlags var0 = world.getSceneLevelTileFlags();
        Scene var1 = world.getScene();
        int var2 = Statics.cameraOrbitX >> 9;
        int var3 = Statics.cameraOrbitZ >> 9;
        int var4 = getHeightmapY(Statics.cameraOrbitX, Statics.cameraOrbitZ, Statics.currentPlayerLevel);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < world.getSizeX() - 4 && var3 < world.getSizeZ() - 4) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.currentPlayerLevel;
                    if (var8 < 3 && var0.isLinkBelow(var6, var7)) {
                        var8++;
                    }
                    int var9 = 0;
                    byte[][] var10 = world.method6099(var8);
                    if (var10 != null) {
                        var9 = (var10[var6][var7] & 0xFF) * 8 << 2;
                    }
                    if (var1.field4498 != null && var1.field4498[var8] != null) {
                        int var11 = var4 - (var1.field4498[var8].method199(var6, var7) - var9);
                        if (var11 > var5) {
                            var5 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var5 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 > field9173) {
            field9173 += (var12 - field9173) / 24;
        } else if (var12 < field9173) {
            field9173 += (var12 - field9173) / 80;
        }
    }

    @ObfuscatedName("rj.hc(IIIIIZI)V")
    public static final void cameraMoveTo(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        Statics.cameraMoveToX = arg0;
        Statics.cameraMoveToZ = arg1;
        Statics.cameraMoveToY = arg2;
        Statics.cameraMoveToStep = arg3;
        Statics.cameraMoveToRate = arg4;
        if (arg5 && Statics.cameraMoveToRate >= 100) {
            Statics.cameraX = Statics.cameraMoveToX * 512 + 256;
            Statics.cameraZ = Statics.cameraMoveToZ * 512 + 256;
            Statics.cameraY = getHeightmapY(Statics.cameraX, Statics.cameraZ, Statics.currentPlayerLevel) - Statics.cameraMoveToY;
        }
        Statics.cameraState = 3;
        Statics.field3308 = -1;
        Statics.field1941 = -1;
    }

    @ObfuscatedName("qz.hn(IIIIII)V")
    public static final void cameraLookAt(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.cameraLookX = arg0;
        Statics.cameraLookZ = arg1;
        Statics.cameraLookY = arg2;
        Statics.cameraRotateAcceleration = arg3;
        Statics.cameraRotateSpeed = arg4;
        if (Statics.cameraRotateSpeed >= 100) {
            int var5 = Statics.cameraLookX * 512 + 256;
            int var6 = Statics.cameraLookZ * 512 + 256;
            int var7 = getHeightmapY(var5, var6, Statics.currentPlayerLevel) - Statics.cameraLookY;
            int var8 = var5 - Statics.cameraX;
            int var9 = var7 - Statics.cameraY;
            int var10 = var6 - Statics.cameraZ;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            Statics.cameraPitch = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
            Statics.cameraYaw = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
            Statics.cameraRoll = 0;
            if (Statics.cameraPitch < 1024) {
                Statics.cameraPitch = 1024;
            }
            if (Statics.cameraPitch > 3072) {
                Statics.cameraPitch = 3072;
            }
        }
        Statics.cameraState = 3;
        Statics.field3308 = -1;
        Statics.field1941 = -1;
    }

    @ObfuscatedName("aay.hd(B)V")
    public static final void cameraReset() {
        for (int var0 = 0; var0 < 5; var0++) {
            cameraModifierEnabled[var0] = false;
        }
        cameraSplinePos = -1;
        field9034 = -1;
        Statics.cameraRotateAcceleration = 0;
        Statics.cameraRotateSpeed = 0;
        Statics.cameraState = 4;
        Statics.field3308 = -1;
        Statics.field1941 = -1;
    }

    @ObfuscatedName("we.hw(B)V")
    public static final void cameraSmoothReset() {
        for (int var0 = 0; var0 < 5; var0++) {
            cameraModifierEnabled[var0] = false;
        }
        cameraSplinePos = -1;
        field9034 = -1;
        Statics.cameraRotateAcceleration = 0;
        Statics.cameraRotateSpeed = 0;
        Statics.cameraState = 6;
        Statics.field3308 = -1;
        Statics.field1941 = -1;
        field9185 = loopCycle;
        Statics.field6412 = Statics.cameraX;
        Statics.field2632 = Statics.cameraY;
        Statics.field3493 = Statics.cameraZ;
        Statics.field6692 = Statics.cameraPitch;
        Statics.field7298 = Statics.cameraYaw;
    }

    @ObfuscatedName("fw.hu(I)V")
    public static final void updatePlayers() {
        int var0 = ReceivePlayerPositions.highResolutionsCount;
        int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
        for (int var2 = 0; var2 < var0; var2++) {
            PlayerEntity var3 = players[var1[var2]];
            if (var3 != null) {
                updateEntity(var3, false);
            }
        }
    }

    @ObfuscatedName("st.ht(I)V")
    public static final void updateNpcs() {
        for (int var0 = 0; var0 < npcCount; var0++) {
            int var1 = field9056[var0];
            ObjectNode var2 = (ObjectNode) npcs.getNode((long) var1);
            if (var2 != null) {
                NpcEntity var3 = (NpcEntity) var2.value;
                updateEntity(var3, false);
            }
        }
    }

    @ObfuscatedName("py.hl(Laay;ZI)V")
    public static final void updateEntity(PathingEntity arg0, boolean arg1) {
        int var2 = MoveSpeed.STATIONARY.id;
        int var3 = 0;
        if (arg0.forceMoveEndCycle > loopCycle) {
            updateForceMovement(arg0);
        } else if (arg0.forceMoveStartCycle >= loopCycle) {
            startForceMovement(arg0);
        } else {
            updateMovement(arg0, arg1);
            var2 = Statics.field6762;
            var3 = Statics.field2089;
        }
        Vector3 var4 = arg0.getTransform().trans;
        if ((int) var4.x < 512 || (int) var4.z < 512 || (int) var4.x >= (world.getSizeX() - 1) * 512 || (int) var4.z >= (world.getSizeZ() - 1) * 512) {
            arg0.field8597.method11769(-1);
            for (int var5 = 0; var5 < arg0.spotAnims.length; var5++) {
                arg0.spotAnims[var5].field1204 = -1;
                arg0.spotAnims[var5].field1203.method11769(-1);
            }
            arg0.field8615 = null;
            arg0.forceMoveEndCycle = 0;
            arg0.forceMoveStartCycle = 0;
            var2 = MoveSpeed.STATIONARY.id;
            var3 = 0;
            arg0.method8552((float) (arg0.routeWaypointX[0] * 512 + arg0.size() * 256), var4.y, (float) (arg0.routeWaypointZ[0] * 512 + arg0.size() * 256));
            arg0.method13952();
        }
        if (Statics.localPlayerEntity == arg0 && ((int) var4.x < 6144 || (int) var4.z < 6144 || (int) var4.x >= (world.getSizeX() - 12) * 512 || (int) var4.z >= (world.getSizeZ() - 12) * 512)) {
            arg0.field8597.method11769(-1);
            for (int var6 = 0; var6 < arg0.spotAnims.length; var6++) {
                arg0.spotAnims[var6].field1204 = -1;
                arg0.spotAnims[var6].field1203.method11769(-1);
            }
            arg0.field8615 = null;
            arg0.forceMoveEndCycle = 0;
            arg0.forceMoveStartCycle = 0;
            var2 = MoveSpeed.STATIONARY.id;
            var3 = 0;
            arg0.method8552((float) (arg0.routeWaypointX[0] * 512 + arg0.size() * 256), var4.y, (float) (arg0.routeWaypointZ[0] * 512 + arg0.size() * 256));
            arg0.method13952();
        }
        int var7 = Statics.method3510(arg0);
        method4714(arg0);
        method3581(arg0, var2, var3, var7);
        method12736(arg0, var2);
        Statics.method11843(arg0);
        Quaternion var8 = Quaternion.method5206();
        var8.method5217(Trig1.method5096(arg0.field8638.method1387()), Trig1.method5096(arg0.field8611.method1387()), Trig1.method5096(arg0.field8639.method1387()));
        arg0.method8550(var8);
        var8.method5209();
    }

    @ObfuscatedName("g.hj(Laay;I)V")
    public static final void updateForceMovement(PathingEntity arg0) {
        int var1 = arg0.forceMoveEndCycle - loopCycle;
        int var2 = arg0.field8619 * 512 + arg0.size() * 256;
        int var3 = arg0.field8621 * 512 + arg0.size() * 256;
        Vector3 var4 = arg0.getTransform().trans;
        arg0.method8552((float) ((var2 - (int) var4.x) / var1 + (int) var4.x), (float) var4.y, (float) ((var3 - (int) var4.z) / var1 + (int) var4.z));
        arg0.field8648 = 0;
        arg0.method14013(arg0.field8625);
    }

    @ObfuscatedName("qb.hf(Laay;B)V")
    public static final void startForceMovement(PathingEntity arg0) {
        AnimationNode var1 = arg0.field8597;
        if (loopCycle == arg0.forceMoveStartCycle || !var1.method11767() || var1.method11788(1)) {
            int var2 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
            int var3 = loopCycle - arg0.forceMoveEndCycle;
            int var4 = arg0.field8619 * 512 + arg0.size() * 256;
            int var5 = arg0.field8621 * 512 + arg0.size() * 256;
            int var6 = arg0.field8591 * 512 + arg0.size() * 256;
            int var7 = arg0.field8605 * 512 + arg0.size() * 256;
            Vector3 var8 = arg0.getTransform().trans;
            arg0.method8552((float) (((var2 - var3) * var4 + var3 * var6) / var2), (float) var8.y, (float) (((var2 - var3) * var5 + var3 * var7) / var2));
        }
        arg0.field8648 = 0;
        arg0.method13946(arg0.field8625, false);
    }

    @ObfuscatedName("ot.hz(Laay;ZI)V")
    public static final void updateMovement(PathingEntity arg0, boolean arg1) {
        BASType var2 = arg0.getBASType();
        if (arg0.routeLength == 0) {
            arg0.field8648 = 0;
            Statics.field6762 = MoveSpeed.STATIONARY.id;
            Statics.field2089 = 0;
            return;
        }
        if (arg0.field8597.method11767() && !arg0.field8597.method11776()) {
            SeqType var3 = arg0.field8597.method11804();
            if (arg0.field8646 > 0 && var3.field6323 == 0) {
                arg0.field8648++;
                Statics.field6762 = MoveSpeed.STATIONARY.id;
                Statics.field2089 = 0;
                return;
            }
            if (arg0.field8646 <= 0 && var3.field6330 == 0) {
                arg0.field8648++;
                Statics.field6762 = MoveSpeed.STATIONARY.id;
                Statics.field2089 = 0;
                return;
            }
        }
        for (int var4 = 0; var4 < arg0.spotAnims.length; var4++) {
            if (arg0.spotAnims[var4].field1204 != -1 && arg0.spotAnims[var4].field1203.method11776()) {
                EffectAnimType var5 = Statics.field4213.method11082(arg0.spotAnims[var4].field1204);
                if (var5.field5264 && var5.field5252 != -1) {
                    SeqType var6 = Statics.field566.method11144(var5.field5252);
                    if (arg0.field8646 > 0 && var6.field6323 == 0) {
                        arg0.field8648++;
                        Statics.field6762 = MoveSpeed.STATIONARY.id;
                        Statics.field2089 = 0;
                        return;
                    }
                    if (arg0.field8646 <= 0 && var6.field6330 == 0) {
                        arg0.field8648++;
                        Statics.field6762 = MoveSpeed.STATIONARY.id;
                        Statics.field2089 = 0;
                        return;
                    }
                }
            }
        }
        Vector3 var7 = Vector3.create(arg0.getTransform().trans);
        int var8 = (int) var7.x;
        int var9 = (int) var7.z;
        int var10 = arg0.routeWaypointX[arg0.routeLength - 1] * 512 + arg0.size() * 256;
        int var11 = arg0.routeWaypointZ[arg0.routeLength - 1] * 512 + arg0.size() * 256;
        if (var8 < var10) {
            if (var9 < var11) {
                arg0.method14013(10240);
            } else if (var9 > var11) {
                arg0.method14013(14336);
            } else {
                arg0.method14013(12288);
            }
        } else if (var8 > var10) {
            if (var9 < var11) {
                arg0.method14013(6144);
            } else if (var9 > var11) {
                arg0.method14013(2048);
            } else {
                arg0.method14013(4096);
            }
        } else if (var9 < var11) {
            arg0.method14013(8192);
        } else if (var9 > var11) {
            arg0.method14013(0);
        }
        byte var12 = arg0.field8645[arg0.routeLength - 1];
        if (!arg1 && (var10 - var8 > 1024 || var10 - var8 < -1024 || var11 - var9 > 1024 || var11 - var9 < -1024)) {
            arg0.method8552((float) var10, var7.y, (float) var11);
            arg0.method13946(arg0.field8637, false);
            arg0.routeLength--;
            if (arg0.field8646 > 0) {
                arg0.field8646--;
            }
            Statics.field6762 = MoveSpeed.STATIONARY.id;
            Statics.field2089 = 0;
            var7.release();
            return;
        }
        int var13 = 16;
        boolean var14 = true;
        if (arg0 instanceof NpcEntity) {
            var14 = ((NpcEntity) arg0).type.field7259;
        }
        if (var14) {
            int var15 = arg0.field8637 - arg0.field8638.field574;
            if (var15 != 0 && arg0.field8624 == -1 && arg0.field8636 != 0) {
                var13 = 8;
            }
            if (!arg1 && arg0.routeLength > 2) {
                var13 = 24;
            }
            if (!arg1 && arg0.routeLength > 3) {
                var13 = 32;
            }
        } else {
            if (!arg1 && arg0.routeLength > 1) {
                var13 = 24;
            }
            if (!arg1 && arg0.routeLength > 2) {
                var13 = 32;
            }
        }
        if (arg0.field8648 > 0 && arg0.routeLength > 1) {
            var13 = 32;
            arg0.field8648--;
        }
        if (MoveSpeed.field3922.id == var12) {
            var13 <<= 0x1;
        } else if (MoveSpeed.field3920.id == var12) {
            var13 >>= 0x1;
        }
        if (var2.field4704 != -1) {
            int var16 = var13 << 9;
            if (arg0.routeLength == 1) {
                int var17 = arg0.field8647 * arg0.field8647;
                int var18 = ((int) var7.x > var10 ? (int) var7.x - var10 : var10 - (int) var7.x) << 9;
                int var19 = ((int) var7.z > var11 ? (int) var7.z - var11 : var11 - (int) var7.z) << 9;
                int var20 = var18 > var19 ? var18 : var19;
                int var21 = var2.field4704 * 2 * var20;
                if (var17 > var21) {
                    arg0.field8647 /= 2;
                } else if (var17 / 2 > var20) {
                    arg0.field8647 -= var2.field4704;
                    if (arg0.field8647 < 0) {
                        arg0.field8647 = 0;
                    }
                } else if (arg0.field8647 < var16) {
                    arg0.field8647 += var2.field4704;
                    if (arg0.field8647 > var16) {
                        arg0.field8647 = var16;
                    }
                }
            } else if (arg0.field8647 < var16) {
                arg0.field8647 += var2.field4704;
                if (arg0.field8647 > var16) {
                    arg0.field8647 = var16;
                }
            } else if (arg0.field8647 > 0) {
                arg0.field8647 -= var2.field4704;
                if (arg0.field8647 < 0) {
                    arg0.field8647 = 0;
                }
            }
            var13 = arg0.field8647 >> 9;
            if (var13 < 1) {
                var13 = 1;
            }
        }
        Statics.field2089 = 0;
        if (var8 == var10 && var9 == var11) {
            Statics.field6762 = MoveSpeed.STATIONARY.id;
        } else {
            if (var8 < var10) {
                var7.x += var13;
                Statics.field2089 |= 0x4;
                if (var7.x > (float) var10) {
                    var7.x = var10;
                }
            } else if (var8 > var10) {
                var7.x -= var13;
                Statics.field2089 |= 0x8;
                if (var7.x < (float) var10) {
                    var7.x = var10;
                }
            }
            if (var9 < var11) {
                var7.z += var13;
                Statics.field2089 |= 0x1;
                if (var7.z > (float) var11) {
                    var7.z = var11;
                }
            } else if (var9 > var11) {
                var7.z -= var13;
                Statics.field2089 |= 0x2;
                if (var7.z < (float) var11) {
                    var7.z = var11;
                }
            }
            arg0.method8551(var7);
            if (var13 >= 32) {
                Statics.field6762 = MoveSpeed.field3922.id;
            } else {
                Statics.field6762 = var12;
            }
        }
        if ((int) var7.x == var10 && (int) var7.z == var11) {
            arg0.routeLength--;
            if (arg0.field8646 > 0) {
                arg0.field8646--;
            }
        }
        var7.release();
    }

    @ObfuscatedName("it.hr(Laay;I)V")
    public static final void method4714(PathingEntity arg0) {
        if (arg0.field8614 == null && arg0.field8654 == null) {
            return;
        }
        boolean var1 = true;
        CoordGrid var2 = world.getBase();
        for (int var3 = 0; var3 < arg0.field8614.length; var3++) {
            int var4 = -1;
            if (arg0.field8614 != null) {
                var4 = arg0.field8614[var3];
            }
            if (var4 != -1) {
                var1 = false;
                boolean var5 = false;
                boolean var6 = false;
                Vector3 var7 = arg0.getTransform().trans;
                int var11;
                int var12;
                if ((var4 & 0xc0000000) == 0xc0000000) {
                    int var8 = var4 & 0xFFFFFFF;
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3FFF;
                    var11 = (int) var7.x - ((var9 - var2.x) * 512 + 256);
                    var12 = (int) var7.z - ((var10 - var2.z) * 512 + 256);
                } else if ((var4 & 0x8000) == 0) {
                    ObjectNode var16 = (ObjectNode) npcs.getNode((long) var4);
                    if (var16 == null) {
                        arg0.method13949(var3, -1);
                        continue;
                    }
                    NpcEntity var17 = (NpcEntity) var16.value;
                    Vector3 var18 = var17.getTransform().trans;
                    var11 = (int) var7.x - (int) var18.x;
                    var12 = (int) var7.z - (int) var18.z;
                } else {
                    int var13 = var4 & 0x7FFF;
                    PlayerEntity var14 = players[var13];
                    if (var14 == null) {
                        arg0.method13949(var3, -1);
                        continue;
                    }
                    Vector3 var15 = var14.getTransform().trans;
                    var11 = (int) var7.x - (int) var15.x;
                    var12 = (int) var7.z - (int) var15.z;
                }
                if (var11 != 0 || var12 != 0) {
                    arg0.method13949(var3, (int) (Math.atan2((double) var11, (double) var12) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg0.method13949(var3, -1)) {
                var1 = false;
            }
        }
        if (var1) {
            arg0.field8614 = null;
            arg0.field8654 = null;
        }
    }

    @ObfuscatedName("xx.hv(Laay;II)V")
    public static void method12736(PathingEntity arg0, int arg1) {
        if (arg0.field8615 == null) {
            return;
        }
        MoveSpeed var2 = (MoveSpeed) SerializableEnums.decode(MoveSpeed.values(), arg1);
        int var3 = arg0.field8615[var2.method6349()];
        if (var3 != arg0.field8597.getSeqTypeId()) {
            arg0.field8597.method11771(var3, arg0.field8597.method11777());
            arg0.field8646 = arg0.routeLength;
        }
    }

    @ObfuscatedName("ff.hg(Laay;IIIB)V")
    public static void method3581(PathingEntity arg0, int arg1, int arg2, int arg3) {
        BASType var4 = arg0.getBASType();
        EntityWalkAnimationNode var5 = arg0.field8616;
        int var6 = arg0.field8637 - arg0.field8638.field574 & 0x3FFF;
        if (MoveSpeed.STATIONARY.id == arg1) {
            if (var6 == 0 && arg0.field8599 <= 25) {
                if (!var5.field9899 || !var4.method7749(var5.getSeqTypeId())) {
                    var5.method11773(var4.method7748(), false, true);
                    var5.field9899 = var5.method11767();
                }
            } else if (arg3 < 0 && var4.field4691 != -1) {
                var5.method11773(var4.field4691, false, true);
                var5.field9899 = false;
            } else if (arg3 > 0 && var4.field4703 != -1) {
                var5.method11773(var4.field4703, false, true);
                var5.field9899 = false;
            } else if (!var5.field9899 || !var4.method7749(var5.getSeqTypeId())) {
                var5.method11773(var4.method7748(), false, true);
                var5.field9899 = arg0.field8616.method11767();
            }
        } else if (arg0.field8624 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = field9003[arg2] - arg0.field8638.field574 & 0x3FFF;
            if (MoveSpeed.field3922.id == arg1 && var4.field4710 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var4.field4701 != -1) {
                    var5.method11773(var4.field4701, false, true);
                } else if (var7 >= 10240 && var7 < 14336 && var4.field4726 != -1) {
                    var5.method11773(var4.field4726, false, true);
                } else if (var7 <= 6144 || var7 >= 10240 || var4.field4699 == -1) {
                    var5.method11773(var4.field4710, false, true);
                } else {
                    var5.method11773(var4.field4699, false, true);
                }
            } else if (MoveSpeed.field3920.id == arg1 && var4.field4702 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var4.field4705 != -1) {
                    var5.method11773(var4.field4705, false, true);
                } else if (var7 >= 10240 && var7 < 14336 && var4.field4697 != -1) {
                    var5.method11773(var4.field4697, false, true);
                } else if (var7 <= 6144 || var7 >= 10240 || var4.field4692 == -1) {
                    var5.method11773(var4.field4702, false, true);
                } else {
                    var5.method11773(var4.field4692, false, true);
                }
            } else if (var7 > 2048 && var7 <= 6144 && var4.field4717 != -1) {
                var5.method11773(var4.field4717, false, true);
            } else if (var7 >= 10240 && var7 < 14336 && var4.field4696 != -1) {
                var5.method11773(var4.field4696, false, true);
            } else if (var7 <= 6144 || var7 >= 10240 || var4.field4695 == -1) {
                var5.method11773(var4.field4694, false, true);
            } else {
                var5.method11773(var4.field4695, false, true);
            }
            var5.field9899 = false;
        } else if (var6 == 0 && arg0.field8599 <= 25) {
            if (MoveSpeed.field3922.id == arg1 && var4.field4710 != -1) {
                var5.method11773(var4.field4710, false, true);
            } else if (MoveSpeed.field3920.id == arg1 && var4.field4702 != -1) {
                var5.method11773(var4.field4702, false, true);
            } else {
                var5.method11773(var4.field4694, false, true);
            }
            var5.field9899 = false;
        } else {
            if (MoveSpeed.field3922.id == arg1 && var4.field4710 != -1) {
                if (arg3 < 0 && var4.field4708 != -1) {
                    var5.method11773(var4.field4708, false, true);
                } else if (arg3 <= 0 || var4.field4709 == -1) {
                    var5.method11773(var4.field4710, false, true);
                } else {
                    var5.method11773(var4.field4709, false, true);
                }
            } else if (MoveSpeed.field3920.id == arg1 && var4.field4702 != -1) {
                if (arg3 < 0 && var4.field4706 != -1) {
                    var5.method11773(var4.field4706, false, true);
                } else if (arg3 <= 0 || var4.field4707 == -1) {
                    var5.method11773(var4.field4702, false, true);
                } else {
                    var5.method11773(var4.field4707, false, true);
                }
            } else if (arg3 < 0 && var4.field4693 != -1) {
                var5.method11773(var4.field4693, false, true);
            } else if (arg3 <= 0 || var4.field4711 == -1) {
                var5.method11773(var4.field4694, false, true);
            } else {
                var5.method11773(var4.field4711, false, true);
            }
            var5.field9899 = false;
        }
    }

    @ObfuscatedName("vy.ir(Laay;[I[I[IB)V")
    public static void method12477(PathingEntity arg0, int[] arg1, int[] arg2, int[] arg3) {
        for (int var4 = 0; var4 < arg1.length; var4++) {
            int var5 = arg1[var4];
            int var6 = arg3[var4];
            int var7 = arg2[var4];
            int var8 = 0;
            while (var6 != 0 && var8 < arg0.field8633.length) {
                if ((var6 & 0x1) != 0) {
                    if (var5 == -1) {
                        arg0.field8633[var8] = null;
                    } else {
                        SeqType var9 = Statics.field566.method11144(var5);
                        int var10 = var9.field6331;
                        UnknownEntityAnimationNode var11 = arg0.field8633[var8];
                        if (var11 != null && var11.method11767()) {
                            if (var5 == var11.getSeqTypeId()) {
                                if (var10 == 0) {
                                    arg0.field8633[var8] = null;
                                    var11 = null;
                                } else if (var10 == 1) {
                                    var11.method11785();
                                    var11.field10516 = var7;
                                } else if (var10 == 2) {
                                    var11.method11806();
                                }
                            } else if (var9.field6325 >= var11.method11804().field6325) {
                                arg0.field8633[var8] = null;
                                var11 = null;
                            }
                        }
                        if (var11 == null || !var11.method11767()) {
                            UnknownEntityAnimationNode var12 = arg0.field8633[var8] = new UnknownEntityAnimationNode(arg0);
                            var12.method11769(var5);
                            var12.field10516 = var7;
                        }
                    }
                }
                var8++;
                var6 >>>= 0x1;
            }
        }
    }

    @ObfuscatedName("dn.ie(I)V")
    public static final void method2868() {
        ParticleSystemRenderer.method2847(Statics.renderer, (long) loopCycle);
        if (topLevelInterface != -1) {
            method15619(topLevelInterface);
        }
        for (int var0 = 0; var0 < field9000; var0++) {
            field9166[var0] = field9204[var0];
            field9204[var0] = false;
        }
        field8960 = loopCycle;
        if (topLevelInterface != -1) {
            field9000 = 0;
            method4593();
        }
        Statics.renderer.L();
        MiniMenu.draw(Statics.renderer);
        int var1 = MiniMenu.method14087();
        if (var1 == -1) {
            var1 = defaultCursor;
        }
        if (var1 == -1) {
            var1 = field9096;
        }
        Statics.method7913(var1);
        sceneDelta = 0;
    }

    @ObfuscatedName("rm.ii(J)V")
    public static final void method8591(long arg0) {
        if (world.getScene() != null) {
            if (Statics.cameraState == 4 || Statics.cameraState == 6) {
                method14083(arg0);
            } else if (Statics.cameraState == 5) {
                method15618(arg0);
            }
        }
        ParticleSystemRenderer.method2847(Statics.renderer, (long) loopCycle);
        if (topLevelInterface != -1) {
            method15619(topLevelInterface);
        }
        for (int var2 = 0; var2 < field9000; var2++) {
            field9166[var2] = field9204[var2];
            field9204[var2] = false;
        }
        field8960 = loopCycle;
        Statics.method11384(-1, -1);
        if (topLevelInterface != -1) {
            field9000 = 0;
            method4593();
        }
        Statics.renderer.L();
        MiniMenu.draw(Statics.renderer);
        int var3 = MiniMenu.method14087();
        if (var3 == -1) {
            var3 = defaultCursor;
        }
        if (var3 == -1) {
            var3 = field9096;
        }
        Statics.method7913(var3);
        int var4 = Statics.localPlayerEntity.size() << 8;
        Vector3 var5 = Statics.localPlayerEntity.getTransform().trans;
        PositionedSound.method6033(Statics.localPlayerEntity.level, (int) var5.x + var4, (int) var5.z + var4, sceneDelta);
        sceneDelta = 0;
    }

    @ObfuscatedName("acm.in(IIIIZB)V")
    public static final void method14742(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (world.getScene() == null) {
            Statics.renderer.fillRectangle(arg0, arg1, arg2, arg3, -16777216);
            return;
        }
        Vector3 var5 = Statics.localPlayerEntity.getTransform().trans;
        boolean var6 = false;
        if (field8988 == 2) {
            if ((int) var5.x < 0 || (int) var5.x >= world.getSizeX() * 512 || (int) var5.z < 0 || (int) var5.z >= world.getSizeZ() * 512) {
                var6 = true;
            }
            if (Statics.cameraState == 2 && !Statics.cam2.method3735()) {
                var6 = true;
            }
        } else if (!field8989) {
            var6 = true;
        }
        if (var6) {
            Statics.renderer.fillRectangle(arg0, arg1, arg2, arg3, -16777216);
            return;
        }
        field9042++;
        if (Statics.localPlayerEntity != null && (int) var5.x - (Statics.localPlayerEntity.size() - 1) * 256 >> 9 == MiniMap.mapFlagX && (int) var5.z - (Statics.localPlayerEntity.size() - 1) * 256 >> 9 == MiniMap.mapFlagZ) {
            MiniMap.mapFlagX = -1;
            MiniMap.mapFlagZ = -1;
            DelayedStateChange.onMapFlag();
        }
        method11164();
        if (!arg4) {
            Statics.method12183();
        }
        method16189();
        Statics.method11240(arg0, arg1, arg2, arg3, true);
        int var7 = field9201;
        int var8 = field9202;
        int var9 = field9025;
        int var10 = field9168;
        Statics.method11384(var7, var8);
        if (Statics.cameraState == 4) {
            int var11 = (int) field9171;
            if (field9173 >> 8 > var11) {
                var11 = field9173 >> 8;
            }
            if (cameraModifierEnabled[4] && field9190[4] + 128 > var11) {
                var11 = field9190[4] + 128;
            }
            int var12 = field9008 + (int) field9021 & 0x3FFF;
            orbitCamera(Statics.cameraOrbitX, getHeightmapY((int) var5.x, (int) var5.z, Statics.currentPlayerLevel) - field9027, Statics.cameraOrbitZ, var11, var12, (var11 >> 3) * 3 + 600 << 2, var10);
        } else if (Statics.cameraState == 5) {
            int var13 = (int) field9171;
            if (field9173 >> 8 > var13) {
                var13 = field9173 >> 8;
            }
            if (cameraModifierEnabled[4] && field9190[4] + 128 > var13) {
                var13 = field9190[4] + 128;
            }
            int var14 = (int) field9021 & 0x3FFF;
            orbitCamera(Statics.cameraOrbitX, getHeightmapY(field9154, field9019, Statics.currentPlayerLevel) - field9027, Statics.cameraOrbitZ, var13, var14, (var13 >> 3) * 3 + 600 << 2, var10);
        } else if (Statics.cameraState == 6) {
            Statics.method14216(var10);
        }
        int var15 = Statics.cameraX;
        int var16 = Statics.cameraY;
        int var17 = Statics.cameraZ;
        int var18 = Statics.cameraPitch;
        int var19 = Statics.cameraYaw;
        for (int var20 = 0; var20 < 5; var20++) {
            if (cameraModifierEnabled[var20]) {
                int var21 = (int) (Math.random() * (double) (field9189[var20] * 2 + 1) - (double) field9189[var20] + Math.sin((double) field9191[var20] / 100.0D * (double) field9110[var20]) * (double) field9190[var20]);
                if (var20 == 0) {
                    Statics.cameraX += var21 << 2;
                }
                if (var20 == 1) {
                    Statics.cameraY += var21 << 2;
                }
                if (var20 == 2) {
                    Statics.cameraZ += var21 << 2;
                }
                if (var20 == 3) {
                    Statics.cameraYaw = Statics.cameraYaw + var21 & 0x3FFF;
                }
                if (var20 == 4) {
                    Statics.cameraPitch += var21;
                    if (Statics.cameraPitch < 1024) {
                        Statics.cameraPitch = 1024;
                    } else if (Statics.cameraPitch > 3072) {
                        Statics.cameraPitch = 3072;
                    }
                }
            }
        }
        if (Statics.cameraX < 0) {
            Statics.cameraX = 0;
        }
        if (Statics.cameraX > (world.getScene().field4495 << 9) - 1) {
            Statics.cameraX = (world.getScene().field4495 << 9) - 1;
        }
        if (Statics.cameraZ < 0) {
            Statics.cameraZ = 0;
        }
        if (Statics.cameraZ > (world.getScene().field4496 << 9) - 1) {
            Statics.cameraZ = (world.getScene().field4496 << 9) - 1;
        }
        method4694();
        Statics.renderer.method474(var7, var8, var9, var10);
        Statics.renderer.r(var7, var8, var7 + var9, var8 + var10);
        Environment var22 = world.getEnvironmentManager().getEnvironment();
        int var23 = var22.method8226();
        Vector3i var24 = new Vector3i();
        CoordGrid var25 = world.getBase();
        if (CameraManager.method14782()) {
            Statics.field3780.method3713(var24, field8925, field8924, var25.x << 9, var25.z << 9);
        } else if (Statics.cameraState == 2) {
            Statics.cam2.method3713(var24, field8925, field8924, var25.x << 9, var25.z << 9);
        } else {
            field8925.method5114((float) -Statics.cameraX, (float) -Statics.cameraY, (float) -Statics.cameraZ);
            field8925.method5178(0.0F, -1.0F, 0.0F, Trig1.method5096(-Statics.cameraYaw & 0x3FFF));
            field8925.method5178(-1.0F, 0.0F, 0.0F, Trig1.method5096(-Statics.cameraPitch & 0x3FFF));
            field8925.method5178(0.0F, 0.0F, -1.0F, Trig1.method5096(-Statics.cameraRoll & 0x3FFF));
            method12142(field8924, true, (float) (var9 / 2), (float) (var10 / 2), (float) (field9205 << 1), (float) (field9205 << 1), var9, var10);
        }
        Statics.renderer.method524(field8925);
        Statics.renderer.method784(field8924);
        if (var22.getSkybox() == null) {
            Statics.renderer.ba(3, var23);
        } else {
            Statics.renderer.IA(1.0F);
            Statics.renderer.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            var22.getSkybox().method6369(Statics.renderer, Statics.field3358 << 3, var7, var8, var9, var10, Statics.cameraPitch, Statics.cameraYaw, Statics.cameraRoll, var23, true, false);
        }
        MiniMenu.method2994(field8925, field8924, var9, var10);
        world.getEnvironmentManager().method8144(world);
        byte var26 = Statics.options.field9655.method15735() == 2 ? (byte) field9042 : 1;
        if (CameraManager.method14782() || Statics.cameraState == 2) {
            world.getScene().method7419(loopCycle, var24.field2212, var24.field2211, var24.field2213, world.method6129(), field9058, field9222, field9097, field9061, field8945, Statics.localPlayerEntity.level + 1, var26, (int) var5.x >> 9, (int) var5.z >> 9, Statics.options.field9645.method15679() == 0, true, 0, true);
        } else {
            world.getScene().method7419(loopCycle, Statics.cameraX, Statics.cameraY, Statics.cameraZ, world.method6129(), field9058, field9222, field9097, field9061, field8945, Statics.localPlayerEntity.level + 1, var26, (int) var5.x >> 9, (int) var5.z >> 9, Statics.options.field9645.method15679() == 0, true, 0, true);
        }
        field9017++;
        AudioRenderer.method3461();
        if (state == 1) {
            method11759(var7, var8, var9, var10, 256, 256);
            method12631(var7, var8, var9, var10, 256, 256);
            method1682(var7, var8, var9, var10, 256, 256);
            method2714(var7, var8, var9, var10);
        }
        world.getScene().method7423();
        Statics.cameraX = var15;
        Statics.cameraY = var16;
        Statics.cameraZ = var17;
        Statics.cameraPitch = var18;
        Statics.cameraYaw = var19;
        if (field9226 && Statics.field848.method5764() == 0) {
            field9226 = false;
        }
        if (field9226) {
            Statics.renderer.fillRectangle(var7, var8, var9, var10, -16777216);
            Statics.method2579(LocalisedText.field6938.get(Statics.language), false, Statics.renderer, Statics.field560, Statics.field9813);
        }
        method12142(field8924, false, (float) (var9 / 2 + var7), (float) (var10 / 2 + var8), (float) (field9205 << 1), (float) (field9205 << 1), var9, var10);
        Statics.renderer.method784(field8924);
        Statics.method3626(field8924);
    }

    @ObfuscatedName("nz.ia(BB)V")
    public static final void method6987(byte arg0) {
        byte[][][] var1 = world.method6129();
        if (var1 == null) {
            var1 = new byte[4][world.getSizeX()][world.getSizeZ()];
            world.method6107(var1);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < world.getSizeX(); var3++) {
                for (int var4 = 0; var4 < world.getSizeZ(); var4++) {
                    var1[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @ObfuscatedName("qs.iw(II)V")
    public static final void method8389(int arg0) {
        field9058 = new int[arg0];
        field9222 = new int[arg0];
        field9097 = new int[arg0];
        field9061 = new int[arg0];
        field8945 = new int[arg0];
    }

    @ObfuscatedName("ee.iq(I)V")
    public static final void method3096() {
        int var0 = 0;
        Scene var1 = world.getScene();
        for (int var2 = 0; var2 < world.getSizeX(); var2++) {
            for (int var3 = 0; var3 < world.getSizeZ(); var3++) {
                if (method14118(var1.field4497, var0, var2, var3, true)) {
                    var0++;
                }
                if (var0 >= 512) {
                    return;
                }
            }
        }
    }

    @ObfuscatedName("ic.iv(B)V")
    public static final void method4694() {
        if (Statics.options.field9655.method15735() != 2) {
            return;
        }
        byte[][][] var0 = world.method6129();
        byte var1 = (byte) (field9042 - 4 & 0xFF);
        int var2 = field9042 % world.getSizeX();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < world.getSizeZ(); var4++) {
                var0[var3][var2][var4] = var1;
            }
        }
        if (Statics.currentPlayerLevel == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            field9058[var5] = -1000000;
            field9222[var5] = 1000000;
            field9097[var5] = 0;
            field8945[var5] = 1000000;
            field9061[var5] = 0;
        }
        Vector3 var6 = Statics.localPlayerEntity.getTransform().trans;
        int var7 = (int) var6.x;
        int var8 = (int) var6.z;
        SceneLevelTileFlags var9 = world.getSceneLevelTileFlags();
        Scene var10 = world.getScene();
        if (Statics.cameraState != 4 && Statics.field1941 == -1) {
            int var11 = getHeightmapY(Statics.cameraX, Statics.cameraZ, Statics.currentPlayerLevel);
            if (var11 - Statics.cameraY < 3200 && (var9.levelTileFlags[Statics.currentPlayerLevel][Statics.cameraX >> 9][Statics.cameraZ >> 9] & 0x4) != 0) {
                method14118(var10.field4497, 1, Statics.cameraX >> 9, Statics.cameraZ >> 9, false);
            }
            return;
        }
        if (Statics.cameraState != 4) {
            var7 = Statics.field1941;
            var8 = Statics.field3308;
        }
        if ((var9.levelTileFlags[Statics.currentPlayerLevel][var7 >> 9][var8 >> 9] & 0x4) != 0) {
            method14118(var10.field4497, 0, var7 >> 9, var8 >> 9, false);
            return;
        }
        int var12 = Statics.cameraX >> 9;
        int var13 = Statics.cameraZ >> 9;
        int var14 = var7 >> 9;
        int var15 = var8 >> 9;
        if (var9.method5797(var12, var13)) {
            int var16 = getHeightmapY(Statics.cameraX, Statics.cameraZ, 3);
            if (Statics.cameraY >= var16) {
                method14118(var10.field4497, 1, var12, var13, false);
            }
            return;
        }
        if (Statics.cameraPitch >= 2560) {
            return;
        }
        int var17;
        if (var14 > var12) {
            var17 = var14 - var12;
        } else {
            var17 = var12 - var14;
        }
        int var18;
        if (var15 > var13) {
            var18 = var15 - var13;
        } else {
            var18 = var13 - var15;
        }
        if (var17 == 0 && var18 == 0 || var17 <= -world.getSizeX() || var17 >= world.getSizeX() || var18 <= -world.getSizeZ() || var18 >= world.getSizeZ()) {
            CoordGrid var23 = world.getBase();
            JagException.method16252(var12 + TextUtil.field488 + var13 + " " + var14 + TextUtil.field488 + var15 + " " + var23.x + TextUtil.field488 + var23.z, new RuntimeException());
            return;
        }
        if (var17 <= var18) {
            int var21 = var17 * 65536 / var18;
            int var22 = 32768;
            while (var13 != var15) {
                if (var13 < var15) {
                    var13++;
                } else if (var13 > var15) {
                    var13--;
                }
                if ((var9.levelTileFlags[Statics.currentPlayerLevel][var12][var13] & 0x4) != 0) {
                    method14118(var10.field4497, 1, var12, var13, false);
                    break;
                }
                var22 += var21;
                if (var22 >= 65536) {
                    var22 -= 65536;
                    if (var12 < var14) {
                        var12++;
                    } else if (var12 > var14) {
                        var12--;
                    }
                    if ((var9.levelTileFlags[Statics.currentPlayerLevel][var12][var13] & 0x4) != 0) {
                        method14118(var10.field4497, 1, var12, var13, false);
                        break;
                    }
                }
            }
            return;
        }
        int var19 = var18 * 65536 / var17;
        int var20 = 32768;
        while (var12 != var14) {
            if (var12 < var14) {
                var12++;
            } else if (var12 > var14) {
                var12--;
            }
            if ((var9.levelTileFlags[Statics.currentPlayerLevel][var12][var13] & 0x4) != 0) {
                method14118(var10.field4497, 1, var12, var13, false);
                break;
            }
            var20 += var19;
            if (var20 >= 65536) {
                var20 -= 65536;
                if (var13 < var15) {
                    var13++;
                } else if (var13 > var15) {
                    var13--;
                }
                if ((var9.levelTileFlags[Statics.currentPlayerLevel][var12][var13] & 0x4) != 0) {
                    method14118(var10.field4497, 1, var12, var13, false);
                    break;
                }
            }
        }
    }

    @ObfuscatedName("aav.ij([[[Lou;IIIZI)Z")
    public static final boolean method14118(Tile[][][] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        byte[][][] var5 = world.method6129();
        byte var6 = arg4 ? 1 : (byte) (field9042 & 0xFF);
        if (var5[Statics.currentPlayerLevel][arg2][arg3] == var6) {
            return false;
        }
        SceneLevelTileFlags var7 = world.getSceneLevelTileFlags();
        if ((var7.levelTileFlags[Statics.currentPlayerLevel][arg2][arg3] & 0x4) == 0) {
            return false;
        }
        byte var8 = 0;
        int var9 = 0;
        field9128[var8] = arg2;
        int var36 = var8 + 1;
        field9231[var8] = arg3;
        var5[Statics.currentPlayerLevel][arg2][arg3] = var6;
        while (var36 != var9) {
            int var10 = field9128[var9] & 0xFFFF;
            int var11 = field9128[var9] >> 16 & 0xFF;
            int var12 = field9128[var9] >> 24 & 0xFF;
            int var13 = field9231[var9] & 0xFFFF;
            int var14 = field9231[var9] >> 16 & 0xFF;
            var9 = var9 + 1 & 0xFFF;
            boolean var15 = false;
            if ((var7.levelTileFlags[Statics.currentPlayerLevel][var10][var13] & 0x4) == 0) {
                var15 = true;
            }
            boolean var16 = false;
            if (arg0 != null) {
                label242:
                for (int var17 = Statics.currentPlayerLevel + 1; var17 <= 3; var17++) {
                    if (arg0[var17] != null && (var7.levelTileFlags[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg0[var17][var10][var13] != null) {
                            if (arg0[var17][var10][var13].field4548 != null) {
                                int var18 = method7881(var11);
                                if (arg0[var17][var10][var13].field4548.field10507 == var18 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var18) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var19 = method7881(var12);
                                    if (arg0[var17][var10][var13].field4548.field10507 == var19 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var19) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var20 = method7881(var14);
                                    if (arg0[var17][var10][var13].field4548.field10507 == var20 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var20) {
                                        continue;
                                    }
                                }
                            }
                            Tile var21 = arg0[var17][var10][var13];
                            if (var21.field4554 != null) {
                                for (PrimaryLayerEntityList var22 = var21.field4554; var22 != null; var22 = var22.field4641) {
                                    PrimaryLayerEntity var23 = var22.field4642;
                                    if (var23 instanceof Location) {
                                        Location var24 = (Location) var23;
                                        int var25 = var24.method2390();
                                        int var26 = var24.method2391();
                                        if (var25 == 21) {
                                            var25 = 19;
                                        }
                                        int var27 = var25 | var26 << 6;
                                        if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
                                            continue label242;
                                        }
                                    }
                                }
                            }
                        }
                        Tile var28 = arg0[var17][var10][var13];
                        if (var28 != null && var28.field4554 != null) {
                            for (PrimaryLayerEntityList var29 = var28.field4554; var29 != null; var29 = var29.field4641) {
                                PrimaryLayerEntity var30 = var29.field4642;
                                if (var30.field10510 != var30.field10508 || var30.field10511 != var30.field10509) {
                                    for (int var31 = var30.field10510; var31 <= var30.field10508; var31++) {
                                        for (int var32 = var30.field10509; var32 <= var30.field10511; var32++) {
                                            var5[var17][var31][var32] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var5[var17][var10][var13] = var6;
                        var16 = true;
                    }
                }
            }
            if (var16) {
                int var33 = world.getScene().field4498[Statics.currentPlayerLevel + 1].method199(var10, var13);
                if (field9058[arg1] < var33) {
                    field9058[arg1] = var33;
                }
                int var34 = var10 << 9;
                int var35 = var13 << 9;
                if (field9222[arg1] > var34) {
                    field9222[arg1] = var34;
                } else if (field9097[arg1] < var34) {
                    field9097[arg1] = var34;
                }
                if (field8945[arg1] > var35) {
                    field8945[arg1] = var35;
                } else if (field9061[arg1] < var35) {
                    field9061[arg1] = var35;
                }
            }
            if (!var15) {
                if (var10 >= 1 && var5[Statics.currentPlayerLevel][var10 - 1][var13] != var6) {
                    field9128[var36] = var10 - 1 | 0x120000 | 0xD3000000;
                    field9231[var36] = var13 | 0x130000;
                    var36 = var36 + 1 & 0xFFF;
                    var5[Statics.currentPlayerLevel][var10 - 1][var13] = var6;
                }
                var13++;
                if (var13 < world.getSizeZ()) {
                    if (var10 - 1 >= 0 && var5[Statics.currentPlayerLevel][var10 - 1][var13] != var6 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10 - 1][var13 - 1] & 0x4) == 0) {
                        field9128[var36] = var10 - 1 | 0x120000 | 0x52000000;
                        field9231[var36] = var13 | 0x130000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10 - 1][var13] = var6;
                    }
                    if (var5[Statics.currentPlayerLevel][var10][var13] != var6) {
                        field9128[var36] = var10 | 0x520000 | 0x13000000;
                        field9231[var36] = var13 | 0x530000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10][var13] = var6;
                    }
                    if (var10 + 1 < world.getSizeX() && var5[Statics.currentPlayerLevel][var10 + 1][var13] != var6 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10 + 1][var13 - 1] & 0x4) == 0) {
                        field9128[var36] = var10 + 1 | 0x520000 | 0x92000000;
                        field9231[var36] = var13 | 0x530000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10 + 1][var13] = var6;
                    }
                }
                var13--;
                if (var10 + 1 < world.getSizeX() && var5[Statics.currentPlayerLevel][var10 + 1][var13] != var6) {
                    field9128[var36] = var10 + 1 | 0x920000 | 0x53000000;
                    field9231[var36] = var13 | 0x930000;
                    var36 = var36 + 1 & 0xFFF;
                    var5[Statics.currentPlayerLevel][var10 + 1][var13] = var6;
                }
                var13--;
                if (var13 >= 0) {
                    if (var10 - 1 >= 0 && var5[Statics.currentPlayerLevel][var10 - 1][var13] != var6 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10 - 1][var13 + 1] & 0x4) == 0) {
                        field9128[var36] = var10 - 1 | 0xD20000 | 0x12000000;
                        field9231[var36] = var13 | 0xD30000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10 - 1][var13] = var6;
                    }
                    if (var5[Statics.currentPlayerLevel][var10][var13] != var6) {
                        field9128[var36] = var10 | 0xD20000 | 0x93000000;
                        field9231[var36] = var13 | 0xD30000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10][var13] = var6;
                    }
                    if (var10 + 1 < world.getSizeX() && var5[Statics.currentPlayerLevel][var10 + 1][var13] != var6 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10][var13] & 0x4) == 0 && (var7.levelTileFlags[Statics.currentPlayerLevel][var10 + 1][var13 + 1] & 0x4) == 0) {
                        field9128[var36] = var10 + 1 | 0x920000 | 0xD2000000;
                        field9231[var36] = var13 | 0x930000;
                        var36 = var36 + 1 & 0xFFF;
                        var5[Statics.currentPlayerLevel][var10 + 1][var13] = var6;
                    }
                }
            }
        }
        if (field9058[arg1] != -1000000) {
            field9058[arg1] += 40;
            field9222[arg1] -= 512;
            field9097[arg1] += 512;
            field9061[arg1] += 512;
            field8945[arg1] -= 512;
        }
        return true;
    }

    @ObfuscatedName("ph.id(II)I")
    public static final int method7881(int arg0) {
        int var1 = arg0 & 0x3F;
        int var2 = arg0 >> 6 & 0x3;
        if (var1 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var1 == 19 || var1 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @ObfuscatedName("sb.io(I)V")
    public static final void method11164() {
        for (CoverMarkerClickbox var0 = (CoverMarkerClickbox) coverMarkerClickboxes.method11642(); var0 != null; var0 = (CoverMarkerClickbox) coverMarkerClickboxes.method11642()) {
            Statics.method14063(var0);
        }
        byte var1 = 0;
        byte var2 = 3;
        if (field8988 == 0) {
            for (int var3 = var1; var3 <= var2; var3++) {
                method14327(var3);
            }
            method14343();
            return;
        }
        method14608();
        for (int var4 = var1; var4 <= var2; var4++) {
            method14325();
            method14538(var4);
            method14327(var4);
        }
        method14328();
        method14343();
    }

    @ObfuscatedName("client.ib()V")
    public static final void method14608() {
        int var0 = ReceivePlayerPositions.highResolutionsCount;
        int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
        int var2 = Statics.options.field9649.method15837();
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            PlayerEntity var5 = players[var1[var4]];
            if (!var5.method16125()) {
                var5.field8600 = -1;
            } else if (var5.visibility) {
                var5.field8600 = -1;
            } else {
                var5.method14006();
                if (var5.field10510 >= 0 && var5.field10509 >= 0 && var5.field10508 < world.getSizeX() && var5.field10511 < world.getSizeZ()) {
                    var5.field10050 = var5.field8616.field9899 ? var3 : false;
                    if (Statics.localPlayerEntity == var5) {
                        var5.field8600 = Integer.MAX_VALUE;
                    } else {
                        int var6 = 0;
                        if (!var5.field8634) {
                            var6++;
                        }
                        if (!var5.field8612.method11647()) {
                            var6 += 2;
                        }
                        int var7 = var6 + (5 - var5.size() << 2);
                        if (var5.field10065 || var5.field10067) {
                            var7 += 512;
                        } else {
                            if (field9047 == 0) {
                                var7 += 32;
                            } else {
                                var7 += 128;
                            }
                            var7 += 256;
                        }
                        var5.field8600 = var7 + 1;
                    }
                } else {
                    var5.field8600 = -1;
                }
            }
        }
        for (int var8 = 0; var8 < npcCount; var8++) {
            NpcEntity var9 = (NpcEntity) ((ObjectNode) npcs.getNode((long) field9056[var8])).value;
            if (var9.method16154() && var9.type.method12517(Statics.field2669)) {
                var9.method14006();
                if (var9.field10510 >= 0 && var9.field10509 >= 0 && var9.field10508 < world.getSizeX() && var9.field10511 < world.getSizeZ()) {
                    int var10 = 0;
                    if (!var9.field8634) {
                        var10++;
                    }
                    if (!var9.field8612.method11647()) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.size() << 2);
                    if (field9047 == 0) {
                        if (var9.type.field7238) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (field9047 == 1) {
                        if (var9.type.field7238) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.type.field7246) {
                        var11 += 1024;
                    } else if (!var9.type.field7237) {
                        var11 += 256;
                    }
                    var9.field8600 = var11 + 1;
                } else {
                    var9.field8600 = -1;
                }
            } else {
                var9.field8600 = -1;
            }
        }
        for (int var12 = 0; var12 < field8936.length; var12++) {
            HintArrow var13 = field8936[var12];
            if (var13 != null) {
                if (var13.field776 == 1) {
                    ObjectNode var14 = (ObjectNode) npcs.getNode((long) var13.field772);
                    if (var14 != null) {
                        NpcEntity var15 = (NpcEntity) var14.value;
                        if (var15.field8600 >= 0) {
                            var15.field8600 += 2048;
                        }
                    }
                } else if (var13.field776 == 10) {
                    PlayerEntity var16 = players[var13.field772];
                    if (var16 != null && Statics.localPlayerEntity != var16 && var16.field8600 >= 0) {
                        var16.field8600 += 2048;
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.ix()V")
    public static final void method14325() {
        int[][] var0 = world.method6133();
        int var1 = world.getSizeX();
        int var2 = world.getSizeZ();
        for (int var3 = 0; var3 < var1; var3++) {
            int[] var4 = var0[var3];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = 0;
            }
        }
    }

    @ObfuscatedName("client.iz(I)V")
    public static final void method14538(int arg0) {
        int var1 = ReceivePlayerPositions.highResolutionsCount;
        int[] var2 = ReceivePlayerPositions.highResolutionsIndices;
        int[][] var3 = world.method6133();
        int[][] var4 = world.method6105();
        int var5;
        if (field8988 == 0) {
            var5 = Statics.field1537.length;
        } else {
            var5 = npcCount + var1;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            PathingEntity var8;
            if (field8988 == 0) {
                CutsceneEntity var7 = Statics.field1537[var6];
                if (!var7.field1563) {
                    continue;
                }
                var8 = var7.method2854();
            } else {
                if (var6 < var1) {
                    var8 = players[var2[var6]];
                } else {
                    var8 = (PathingEntity) ((ObjectNode) npcs.getNode((long) field9056[var6 - var1])).value;
                }
                if (var8.level != arg0 || var8.field8600 < 0) {
                    continue;
                }
            }
            int var9 = var8.size();
            Vector3 var10 = var8.getTransform().trans;
            if ((var9 & 0x1) == 0) {
                if (((int) var10.x & 0x1FF) != 0 || ((int) var10.z & 0x1FF) != 0) {
                    continue;
                }
            } else if (((int) var10.x & 0x1FF) != 256 || ((int) var10.z & 0x1FF) != 256) {
                continue;
            }
            int var10002;
            if (var9 == 1) {
                int var11 = (int) var10.x >> 9;
                int var12 = (int) var10.z >> 9;
                if (var8.field8600 > var3[var11][var12]) {
                    var3[var11][var12] = var8.field8600;
                    var4[var11][var12] = 1;
                } else if (var8.field8600 == var3[var11][var12]) {
                    var10002 = var4[var11][var12]++;
                }
            } else {
                int var13 = (var9 - 1) * 256 + 60;
                int var14 = (int) var10.x - var13 >> 9;
                int var15 = (int) var10.z - var13 >> 9;
                int var16 = (int) var10.x + var13 >> 9;
                int var17 = (int) var10.z + var13 >> 9;
                for (int var18 = var14; var18 <= var16; var18++) {
                    for (int var19 = var15; var19 <= var17; var19++) {
                        if (var8.field8600 > var3[var18][var19]) {
                            var3[var18][var19] = var8.field8600;
                            var4[var18][var19] = 1;
                        } else if (var8.field8600 == var3[var18][var19]) {
                            var10002 = var4[var18][var19]++;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.is(I)V")
    public static final void method14327(int arg0) {
        int var1 = ReceivePlayerPositions.highResolutionsCount;
        int[] var2 = ReceivePlayerPositions.highResolutionsIndices;
        int[][] var3 = world.method6133();
        int[][] var4 = world.method6105();
        int var5;
        if (field8988 == 0) {
            var5 = Statics.field1537.length;
        } else {
            var5 = field8939 ? var1 : npcCount + var1;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            PathingEntity var8;
            if (field8988 == 0) {
                CutsceneEntity var7 = Statics.field1537[var6];
                if (!var7.field1563) {
                    continue;
                }
                var8 = var7.method2854();
            } else {
                if (var6 < var1) {
                    var8 = players[var2[var6]];
                } else {
                    var8 = (PathingEntity) ((ObjectNode) npcs.getNode((long) field9056[var6 - var1])).value;
                }
                if (var8.level != arg0) {
                    continue;
                }
                if (var8.field8600 < 0) {
                    var8.field8634 = false;
                    continue;
                }
            }
            var8.field8598 = 0;
            int var9 = var8.size();
            Vector3 var10 = var8.getTransform().trans;
            if ((var9 & 0x1) == 0) {
                if (((int) var10.x & 0x1FF) != 0 || ((int) var10.z & 0x1FF) != 0) {
                    var8.field8634 = false;
                    continue;
                }
            } else if (((int) var10.x & 0x1FF) != 256 || ((int) var10.z & 0x1FF) != 256) {
                var8.field8634 = false;
                continue;
            }
            if (field8988 != 0) {
                int var10002;
                if (var9 == 1) {
                    int var11 = (int) var10.x >> 9;
                    int var12 = (int) var10.z >> 9;
                    if (var8.field8600 != var3[var11][var12]) {
                        var8.field8634 = true;
                        continue;
                    }
                    if (var4[var11][var12] > 1) {
                        var10002 = var4[var11][var12]--;
                        var8.field8634 = true;
                        continue;
                    }
                } else {
                    int var13 = (var9 - 1) * 256 + 252;
                    int var14 = (int) var10.x - var13 >> 9;
                    int var15 = (int) var10.z - var13 >> 9;
                    int var16 = (int) var10.x + var13 >> 9;
                    int var17 = (int) var10.z + var13 >> 9;
                    if (!method16493(var3, var4, var8.field8600, var14, var15, var16, var17)) {
                        for (int var18 = var14; var18 <= var16; var18++) {
                            for (int var19 = var15; var19 <= var17; var19++) {
                                if (var8.field8600 == var3[var18][var19]) {
                                    var10002 = var4[var18][var19]--;
                                }
                            }
                        }
                        var8.field8634 = true;
                        continue;
                    }
                }
            }
            var8.field8634 = false;
            var8.method8552(var10.x, (float) getHeightmapY((int) var10.x, (int) var10.z, var8.level), var10.z);
            world.getScene().method7412(var8, true);
        }
    }

    @ObfuscatedName("aiq.im([[I[[IIIIIII)Z")
    public static final boolean method16493(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var7 = arg3; var7 <= arg5; var7++) {
            for (int var8 = arg4; var8 <= arg6; var8++) {
                if (arg0[var7][var8] == arg2 && arg1[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("client.ik()V")
    public static final void method14328() {
        field9045 = 0;
        for (int var0 = 0; var0 < npcCount; var0++) {
            NpcEntity var1 = (NpcEntity) ((ObjectNode) npcs.getNode((long) field9056[var0])).value;
            if (var1.field8634 && var1.method13961() != -1) {
                int var2 = (var1.size() - 1) * 256 + 252;
                Vector3 var3 = var1.getTransform().trans;
                int var4 = (int) var3.x - var2 >> 9;
                int var5 = (int) var3.z - var2 >> 9;
                PathingEntity var6 = method11160(var1.level, var4, var5);
                if (var6 != null) {
                    int var7 = var6.localPlayerIndex;
                    if (var6 instanceof NpcEntity) {
                        var7 += 2048;
                    }
                    if (var6.field8598 == 0 && var6.method13961() != -1) {
                        field9153[field9045] = var7;
                        field9062[field9045] = var7;
                        field9045++;
                        var6.field8598++;
                    }
                    field9153[field9045] = var7;
                    field9062[field9045] = var1.localPlayerIndex + 2048;
                    field9045++;
                    var6.field8598++;
                }
            }
        }
        Algorithms.method4811(field9062, field9153, 0, field9045 - 1);
    }

    @ObfuscatedName("sz.iu(IIIB)Laay;")
    public static PathingEntity method11160(int arg0, int arg1, int arg2) {
        Tile var3 = world.getScene().field4497[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        PathingEntity var4 = null;
        int var5 = -1;
        for (PrimaryLayerEntityList var6 = var3.field4554; var6 != null; var6 = var6.field4641) {
            PrimaryLayerEntity var7 = var6.field4642;
            if (var7 instanceof PathingEntity) {
                PathingEntity var8 = (PathingEntity) var7;
                int var9 = (var8.size() - 1) * 256 + 252;
                Vector3 var10 = var8.getTransform().trans;
                int var11 = (int) var10.x - var9 >> 9;
                int var12 = (int) var10.z - var9 >> 9;
                int var13 = (int) var10.x + var9 >> 9;
                int var14 = (int) var10.z + var9 >> 9;
                if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var15 > var5) {
                        var4 = var8;
                        var5 = var15;
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("client.ic()V")
    public static final void method14343() {
        int var0 = ReceivePlayerPositions.highResolutionsCount;
        int[] var1 = ReceivePlayerPositions.highResolutionsIndices;
        int var2;
        if (field8988 == 0) {
            var2 = Statics.field1537.length;
        } else {
            var2 = field8939 ? var0 : npcCount + var0;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            PathingEntity var5;
            if (field8988 == 0) {
                CutsceneEntity var4 = Statics.field1537[var3];
                if (!var4.field1563) {
                    continue;
                }
                var5 = var4.method2854();
            } else {
                if (var3 < var0) {
                    var5 = players[var1[var3]];
                } else {
                    var5 = (PathingEntity) ((ObjectNode) npcs.getNode((long) field9056[var3 - var0])).value;
                }
                if (var5.field8600 < 0) {
                    continue;
                }
            }
            int var6 = var5.size();
            Vector3 var7 = var5.getTransform().trans;
            if ((var6 & 0x1) == 0) {
                if (((int) var7.x & 0x1FF) == 0 && ((int) var7.z & 0x1FF) == 0) {
                    continue;
                }
            } else if (((int) var7.x & 0x1FF) == 256 && ((int) var7.z & 0x1FF) == 256) {
                continue;
            }
            var5.method8552(var7.x, (float) getHeightmapY((int) var7.x, (int) var7.z, var5.level), var7.z);
            world.getScene().method7412(var5, true);
        }
    }

    @ObfuscatedName("wx.if(I)V")
    public static final void method12652() {
        Iterator var0 = field9090.iterator();
        while (var0.hasNext()) {
            SpotAnimationEntityNode var1 = (SpotAnimationEntityNode) var0.next();
            SpotAnimation var2 = var1.field10296;
            var2.method17177(1);
            if (var2.method17184()) {
                var1.remove();
                var2.method17182();
            }
        }
    }

    @ObfuscatedName("aha.il(I)V")
    public static final void method16189() {
        Iterator var0 = field9090.iterator();
        while (var0.hasNext()) {
            SpotAnimationEntityNode var1 = (SpotAnimationEntityNode) var0.next();
            SpotAnimation var2 = var1.field10296;
            if (world.getScene() != null && var2.method17178()) {
                world.getScene().method7412(var2, true);
            }
        }
    }

    @ObfuscatedName("tv.it(IIIIIII)V")
    public static final void method11759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (TextCoord var6 = (TextCoord) field9091.method11649(); var6 != null; var6 = (TextCoord) field9091.method11644()) {
            if (loopCycle >= var6.field9259) {
                var6.method6975();
            } else {
                Statics.method7732(var6.field9257, (var6.field9256 << 9) + 256, (var6.field9255 << 9) + 256, var6.field9260 * 2);
                Statics.field670.drawStringCentered(var6.field9261, (int) (field9048[0] + (float) arg0), (int) (field9048[1] + (float) arg1), var6.field9258 | 0xFF000000, 0);
            }
        }
    }

    @ObfuscatedName("ay.jv(IIIIIII)V")
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        HintArrow[] var6 = field8936;
        for (int var7 = 0; var7 < var6.length; var7++) {
            HintArrow var8 = var6[var7];
            if (var8 != null && var8.field776 == 2) {
                Statics.method7732(var8.field775, var8.field778, var8.field777, var8.field781 * 2);
                if (field9048[0] > -1.0F && loopCycle % 20 < 10) {
                    Sprite var9 = Statics.field6361[var8.field773];
                    int var10 = (int) (field9048[0] + (float) arg0 - 12.0F);
                    int var11 = (int) (field9048[1] + (float) arg1 - 28.0F);
                    var9.method2500(var10, var11);
                }
            }
        }
    }

    @ObfuscatedName("wl.jm(IIIIIII)V")
    public static final void method12631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = ReceivePlayerPositions.highResolutionsCount;
        int[] var7 = ReceivePlayerPositions.highResolutionsIndices;
        field9170 = 0;
        int var8;
        if (field8988 == 0) {
            var8 = Statics.field1537.length;
        } else {
            var8 = npcCount + var6;
        }
        for (int var9 = 0; var9 < var8; var9++) {
            NPCType var10 = null;
            PathingEntity var12;
            if (field8988 == 0) {
                CutsceneEntity var11 = Statics.field1537[var9];
                if (!var11.field1563) {
                    continue;
                }
                var12 = var11.method2854();
                if (field9042 != var12.field9810) {
                    continue;
                }
                if (var11.field1560 >= 0) {
                    var10 = ((NpcEntity) var12).type;
                    if (var10.multinpc != null) {
                        var10 = var10.getMultiNPC(Statics.field2669);
                        if (var10 == null) {
                            continue;
                        }
                    }
                }
            } else {
                if (var9 < var6) {
                    var12 = players[var7[var9]];
                } else {
                    var12 = (PathingEntity) ((ObjectNode) npcs.getNode((long) field9056[var9 - var6])).value;
                    var10 = ((NpcEntity) var12).type;
                    if (var10.multinpc != null) {
                        var10 = var10.getMultiNPC(Statics.field2669);
                        if (var10 == null) {
                            continue;
                        }
                    }
                }
                if (var12.field8600 < 0 || field9042 != var12.field9810 && Statics.localPlayerEntity.level != var12.level) {
                    continue;
                }
            }
            method7396(var12, var12.method12811());
            if (!(field9048[0] < 0.0F)) {
                if (var12.method13942()) {
                    EntityChatLine var13 = var12.method13963();
                    if (var13 != null && field9170 < field9105) {
                        field9186[field9170] = Statics.field2399.method12418(var13.method2477()) / 2;
                        field9198[field9170] = (int) field9048[0];
                        field8967[field9170] = (int) field9048[1];
                        field9175[field9170] = var13;
                        field9170++;
                    }
                }
                int var14 = (int) (field9048[1] + (float) arg1);
                int var15 = var14 - Statics.field2399.field7176;
                boolean var16 = false;
                if (!var12.field8634 && !var12.field8612.method11647()) {
                    for (Headbar var17 = (Headbar) var12.field8612.method11649(); var17 != null; var17 = (Headbar) var12.field8612.method11644()) {
                        HeadbarUpdate var18 = var17.method14734(loopCycle);
                        if (var18 != null) {
                            HeadbarType var19 = var17.field9268;
                            PlayerEntity var20 = players[var7[var9]];
                            Sprite var21;
                            Sprite var22;
                            if (var20 != null && var20.field10065) {
                                var21 = var19.method7307(Statics.renderer);
                                var22 = var19.method7301(Statics.renderer);
                            } else {
                                var21 = var19.method7305(Statics.renderer);
                                var22 = var19.method7304(Statics.renderer);
                            }
                            if (var21 != null && var22 != null) {
                                int var23 = 255;
                                boolean var24 = true;
                                int var25 = loopCycle - var18.field9271;
                                int var26 = var22.method1061() * var18.field9270 / 255;
                                int var29;
                                if (var18.field9272 > var25) {
                                    int var27 = var19.field4444 == 0 ? 0 : var25 / var19.field4444 * var19.field4444;
                                    int var28 = var22.method1061() * var18.field9269 / 255;
                                    var29 = (var26 - var28) * var27 / var18.field9272 + var28;
                                } else {
                                    var29 = var26;
                                    int var30 = var18.field9272 + var19.field4445 - var25;
                                    if (var19.field4443 >= 0) {
                                        var23 = (var30 << 8) / (var19.field4445 - var19.field4443);
                                    }
                                }
                                if (var18.field9270 > 0 && var29 < 2) {
                                    var29 = 2;
                                }
                                int var31 = var21.method1045();
                                int var32 = (int) (field9048[0] + (float) arg0 - (float) (var21.method1061() >> 1));
                                var15 -= var31;
                                if (var23 >= 0 && var23 < 255) {
                                    int var33 = var23 << 24;
                                    int var34 = var33 | 0xFFFFFF;
                                    var21.method1054(var32, var15, 0, var34, 1);
                                    Statics.renderer.o(var32, var15, var29 + var32, var15 + var31);
                                    var22.method1054(var32, var15, 0, var34, 1);
                                } else {
                                    var21.method2500(var32, var15);
                                    Statics.renderer.o(var32, var15, var29 + var32, var15 + var31);
                                    var22.method2500(var32, var15);
                                }
                                Statics.renderer.r(arg0, arg1, arg0 + arg2, arg1 + arg3);
                                var15 -= 2;
                                var16 = true;
                            }
                        } else if (var17.method14735()) {
                            var17.method6975();
                        }
                    }
                }
                if (!var16) {
                    var15 -= Statics.field4825.field5164 + 2;
                }
                if (!var12.field8634) {
                    if (var10 == null) {
                        PlayerEntity var35 = (PlayerEntity) var12;
                        if (var35.field10045 != -1) {
                            Sprite var36 = Statics.field2209[var35.field10045];
                            var15 -= var36.method1045();
                            var36.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15);
                            var15 -= 2;
                        }
                        if (var35.field10053 != -1) {
                            Sprite var37 = Statics.field9904[var35.field10053];
                            var15 -= var37.method1045();
                            var37.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15);
                            var15 -= 2;
                        }
                    } else if (var10.field7231 >= 0 && var10.field7231 < Statics.field9904.length) {
                        Sprite var38 = Statics.field9904[var10.field7231];
                        var15 -= var38.method1045();
                        var38.method2500((int) (field9048[0] + (float) arg0 - (float) (var38.method1061() >> 1)), var15);
                        var15 -= 2;
                    }
                }
                int var10000;
                if (!(var12 instanceof PlayerEntity)) {
                    int var45 = 0;
                    HintArrow[] var46 = field8936;
                    for (int var47 = 0; var47 < var46.length; var47++) {
                        HintArrow var48 = var46[var47];
                        if (var48 != null && var48.field776 == 1 && var48.field772 == field9056[var9 - var6]) {
                            Sprite var49 = Statics.field6361[var48.field773];
                            if (var49.method1045() > var45) {
                                var45 = var49.method1045();
                            }
                            boolean var50;
                            if (var48.field774 == 0) {
                                var50 = true;
                            } else {
                                int var51 = GameShell.method2809() * 1000 / var48.field774 / 2;
                                var50 = loopCycle % (var51 * 2) < var51;
                            }
                            if (var50) {
                                var49.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15 - var49.method1045());
                            }
                        }
                    }
                    if (var45 > 0) {
                        var10000 = var15 - (var45 + 2);
                    }
                } else if (var9 >= 0) {
                    int var39 = 0;
                    HintArrow[] var40 = field8936;
                    for (int var41 = 0; var41 < var40.length; var41++) {
                        HintArrow var42 = var40[var41];
                        if (var42 != null && var42.field776 == 10 && var42.field772 == var7[var9]) {
                            Sprite var43 = Statics.field6361[var42.field773];
                            if (var43.method1045() > var39) {
                                var39 = var43.method1045();
                            }
                            var43.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15 - var43.method1045());
                        }
                    }
                    if (var39 > 0) {
                        var10000 = var15 - (var39 + 2);
                    }
                }
                for (int var53 = 0; var53 < Statics.field4825.field5147; var53++) {
                    int var54 = var12.field8609[var53];
                    int var55 = var12.field8607[var53];
                    HitmarkType var56 = null;
                    int var57 = 0;
                    if (var55 >= 0) {
                        if (var54 <= loopCycle) {
                            continue;
                        }
                        var56 = Statics.field5037.method7826(var12.field8607[var53]);
                        var57 = var56.field4750;
                    } else if (var54 < 0) {
                        continue;
                    }
                    int var58 = var12.field8610[var53];
                    HitmarkType var59 = null;
                    if (var58 >= 0) {
                        var59 = Statics.field5037.method7826(var58);
                    }
                    if (var54 - var57 <= loopCycle) {
                        if (var56 == null) {
                            var12.field8609[var53] = -1;
                        } else {
                            int var60 = var12.method12811() / 2;
                            method7396(var12, var60);
                            if (field9048[0] > -1.0F) {
                                field9048[0] += Statics.field4825.field5155[var53];
                                field9048[1] += Statics.field4825.field5148[var53];
                                Object var61 = null;
                                Object var62 = null;
                                Object var63 = null;
                                Object var64 = null;
                                int var65 = 0;
                                int var66 = 0;
                                int var67 = 0;
                                int var68 = 0;
                                int var69 = 0;
                                int var70 = 0;
                                int var71 = 0;
                                int var72 = 0;
                                Sprite var73 = null;
                                Sprite var74 = null;
                                Sprite var75 = null;
                                Sprite var76 = null;
                                int var77 = 0;
                                int var78 = 0;
                                int var79 = 0;
                                int var80 = 0;
                                int var81 = 0;
                                int var82 = 0;
                                int var83 = 0;
                                int var84 = 0;
                                int var85 = 0;
                                Sprite var86 = var56.method7794(Statics.renderer);
                                if (var86 != null) {
                                    var65 = var86.method1061();
                                    int var87 = var86.method1045();
                                    if (var87 > var85) {
                                        var85 = var87;
                                    }
                                    var86.method1063(field8955);
                                    var69 = field8955[0];
                                }
                                Sprite var88 = var56.method7796(Statics.renderer);
                                if (var88 != null) {
                                    var66 = var88.method1061();
                                    int var89 = var88.method1045();
                                    if (var89 > var85) {
                                        var85 = var89;
                                    }
                                    var88.method1063(field8955);
                                    var70 = field8955[0];
                                }
                                Sprite var90 = var56.method7797(Statics.renderer);
                                if (var90 != null) {
                                    var67 = var90.method1061();
                                    int var91 = var90.method1045();
                                    if (var91 > var85) {
                                        var85 = var91;
                                    }
                                    var90.method1063(field8955);
                                    var71 = field8955[0];
                                }
                                Sprite var92 = var56.method7804(Statics.renderer);
                                if (var92 != null) {
                                    var68 = var92.method1061();
                                    int var93 = var92.method1045();
                                    if (var93 > var85) {
                                        var85 = var93;
                                    }
                                    var92.method1063(field8955);
                                    var72 = field8955[0];
                                }
                                if (var59 != null) {
                                    var73 = var59.method7794(Statics.renderer);
                                    if (var73 != null) {
                                        var77 = var73.method1061();
                                        int var94 = var73.method1045();
                                        if (var94 > var85) {
                                            var85 = var94;
                                        }
                                        var73.method1063(field8955);
                                        var81 = field8955[0];
                                    }
                                    var74 = var59.method7796(Statics.renderer);
                                    if (var74 != null) {
                                        var78 = var74.method1061();
                                        int var95 = var74.method1045();
                                        if (var95 > var85) {
                                            var85 = var95;
                                        }
                                        var74.method1063(field8955);
                                        var82 = field8955[0];
                                    }
                                    var75 = var59.method7797(Statics.renderer);
                                    if (var75 != null) {
                                        var79 = var75.method1061();
                                        int var96 = var75.method1045();
                                        if (var96 > var85) {
                                            var85 = var96;
                                        }
                                        var75.method1063(field8955);
                                        var83 = field8955[0];
                                    }
                                    var76 = var59.method7804(Statics.renderer);
                                    if (var76 != null) {
                                        var80 = var76.method1061();
                                        int var97 = var76.method1045();
                                        if (var97 > var85) {
                                            var85 = var97;
                                        }
                                        var76.method1063(field8955);
                                        var84 = field8955[0];
                                    }
                                }
                                Font var98 = Statics.field2163;
                                Font var99 = Statics.field2163;
                                FontMetrics var100 = Statics.field559;
                                FontMetrics var101 = Statics.field559;
                                int var102 = var56.field4744;
                                if (var102 >= 0) {
                                    Font var103 = (Font) Statics.field6784.method4859(field8914, var102, true, var56.field4742);
                                    FontMetrics var104 = Statics.field6784.method4843(field8914, var102);
                                    if (var103 != null && var104 != null) {
                                        var98 = var103;
                                        var100 = var104;
                                    }
                                }
                                if (var59 != null) {
                                    int var105 = var59.field4744;
                                    if (var105 >= 0) {
                                        Font var106 = (Font) Statics.field6784.method4859(field8914, var105, true, var59.field4742);
                                        FontMetrics var107 = Statics.field6784.method4843(field8914, var105);
                                        if (var106 != null && var107 != null) {
                                            var99 = var106;
                                            var101 = var107;
                                        }
                                    }
                                }
                                Object var108 = null;
                                String var109 = null;
                                boolean var110 = false;
                                int var111 = 0;
                                String var112 = var56.method7793(var12.field8608[var53]);
                                int var113 = var100.method12418(var112);
                                if (var59 != null) {
                                    var109 = var59.method7793(var12.field8623[var53]);
                                    var111 = var101.method12418(var109);
                                }
                                int var114 = 0;
                                int var115 = 0;
                                if (var66 > 0) {
                                    var114 = var113 / var66 + 1;
                                }
                                if (var59 != null && var78 > 0) {
                                    var115 = var111 / var78 + 1;
                                }
                                int var116 = 0;
                                int var117 = var116;
                                if (var65 > 0) {
                                    var116 += var65;
                                }
                                var116 += 2;
                                int var118 = var116;
                                if (var67 > 0) {
                                    var116 += var67;
                                }
                                int var119 = var116;
                                int var120 = var116;
                                int var122;
                                if (var66 > 0) {
                                    int var121 = var66 * var114;
                                    var122 = var116 + var121;
                                    var120 = (var121 - var113) / 2 + var116;
                                } else {
                                    var122 = var113 + var116;
                                }
                                int var123 = var122;
                                if (var68 > 0) {
                                    var122 += var68;
                                }
                                int var124 = 0;
                                int var125 = 0;
                                int var126 = 0;
                                int var127 = 0;
                                int var128 = 0;
                                if (var59 != null) {
                                    var122 += 2;
                                    var124 = var122;
                                    if (var77 > 0) {
                                        var122 += var77;
                                    }
                                    var122 += 2;
                                    var125 = var122;
                                    if (var79 > 0) {
                                        var122 += var79;
                                    }
                                    var126 = var122;
                                    var128 = var122;
                                    if (var78 > 0) {
                                        int var129 = var78 * var115;
                                        var122 += var129;
                                        var128 += (var129 - var111) / 2;
                                    } else {
                                        var122 += var111;
                                    }
                                    var127 = var122;
                                    if (var80 > 0) {
                                        var122 += var80;
                                    }
                                }
                                int var130 = var12.field8609[var53] - loopCycle;
                                int var131 = var56.field4738 - var56.field4738 * var130 / var56.field4750;
                                int var132 = var56.field4751 * var130 / var56.field4750 + -var56.field4751;
                                int var133 = (int) (field9048[0] + (float) arg0 - (float) (var122 >> 1) + (float) var131);
                                int var134 = (int) (field9048[1] + (float) arg1 - 12.0F + (float) var132);
                                int var135 = var134;
                                int var136 = var85 + var134;
                                int var137 = var56.field4755 + var134 + 15;
                                int var138 = var137 - var100.field7176;
                                int var139 = var100.field7177 + var137;
                                if (var138 < var134) {
                                    var135 = var138;
                                }
                                if (var139 > var136) {
                                    var136 = var139;
                                }
                                int var140 = 0;
                                if (var59 != null) {
                                    var140 = var59.field4755 + var134 + 15;
                                    int var141 = var140 - var101.field7176;
                                    int var142 = var101.field7177 + var140;
                                    if (var141 < var135) {
                                        ;
                                    }
                                    if (var142 > var136) {
                                        ;
                                    }
                                }
                                int var145 = 255;
                                if (var56.field4752 >= 0) {
                                    var145 = (var130 << 8) / (var56.field4750 - var56.field4752);
                                }
                                if (var145 >= 0 && var145 < 255) {
                                    int var146 = var145 << 24;
                                    int var147 = var146 | 0xFFFFFF;
                                    if (var86 != null) {
                                        var86.method1054(var117 + var133 - var69, var134, 0, var147, 1);
                                    }
                                    if (var90 != null) {
                                        var90.method1054(var118 + var133 - var71, var134, 0, var147, 1);
                                    }
                                    if (var88 != null) {
                                        for (int var148 = 0; var148 < var114; var148++) {
                                            var88.method1054(var66 * var148 + (var119 + var133 - var70), var134, 0, var147, 1);
                                        }
                                    }
                                    if (var92 != null) {
                                        var92.method1054(var123 + var133 - var72, var134, 0, var147, 1);
                                    }
                                    var98.method833(var112, var120 + var133, var137, var56.field4736 | var146, 0);
                                    if (var59 != null) {
                                        if (var73 != null) {
                                            var73.method1054(var124 + var133 - var81, var134, 0, var147, 1);
                                        }
                                        if (var75 != null) {
                                            var75.method1054(var125 + var133 - var83, var134, 0, var147, 1);
                                        }
                                        if (var74 != null) {
                                            for (int var149 = 0; var149 < var115; var149++) {
                                                var74.method1054(var78 * var149 + (var126 + var133 - var82), var134, 0, var147, 1);
                                            }
                                        }
                                        if (var76 != null) {
                                            var76.method1054(var127 + var133 - var84, var134, 0, var147, 1);
                                        }
                                        var99.method833(var109, var128 + var133, var140, var59.field4736 | var146, 0);
                                    }
                                } else {
                                    if (var86 != null) {
                                        var86.method2500(var117 + var133 - var69, var134);
                                    }
                                    if (var90 != null) {
                                        var90.method2500(var118 + var133 - var71, var134);
                                    }
                                    if (var88 != null) {
                                        for (int var150 = 0; var150 < var114; var150++) {
                                            var88.method2500(var66 * var150 + (var119 + var133 - var70), var134);
                                        }
                                    }
                                    if (var92 != null) {
                                        var92.method2500(var123 + var133 - var72, var134);
                                    }
                                    var98.method833(var112, var120 + var133, var137, var56.field4736 | 0xFF000000, 0);
                                    if (var59 != null) {
                                        if (var73 != null) {
                                            var73.method2500(var124 + var133 - var81, var134);
                                        }
                                        if (var75 != null) {
                                            var75.method2500(var125 + var133 - var83, var134);
                                        }
                                        if (var74 != null) {
                                            for (int var151 = 0; var151 < var115; var151++) {
                                                var74.method2500(var78 * var151 + (var126 + var133 - var82), var134);
                                            }
                                        }
                                        if (var76 != null) {
                                            var76.method2500(var127 + var133 - var84, var134);
                                        }
                                        var99.method833(var109, var128 + var133, var140, var59.field4736 | 0xFF000000, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var152 = 0; var152 < field9045; var152++) {
            int var153 = field9153[var152];
            PathingEntity var154;
            if (var153 < 2048) {
                var154 = players[var153];
            } else {
                var154 = (PathingEntity) ((ObjectNode) npcs.getNode((long) (var153 - 2048))).value;
            }
            int var155 = field9062[var152];
            PathingEntity var156;
            if (var155 < 2048) {
                var156 = players[var155];
            } else {
                var156 = (PathingEntity) ((ObjectNode) npcs.getNode((long) (var155 - 2048))).value;
            }
            Statics.method12479(var154, var156, --var154.field8598, arg0, arg1, arg2, arg3, arg4, arg5);
        }
        int var157 = Statics.field2399.field7177 + Statics.field2399.field7176 + 2;
        for (int var158 = 0; var158 < field9170; var158++) {
            int var159 = field9198[var158];
            int var160 = field8967[var158];
            int var161 = field9186[var158];
            boolean var162 = true;
            while (var162) {
                var162 = false;
                for (int var163 = 0; var163 < var158; var163++) {
                    if (var160 + 2 > field8967[var163] - var157 && var160 - var157 < field8967[var163] + 2 && var159 - var161 < field9198[var163] + field9186[var163] && var159 + var161 > field9198[var163] - field9186[var163] && field8967[var163] - var157 < var160) {
                        var160 = field8967[var163] - var157;
                        var162 = true;
                    }
                }
            }
            field8967[var158] = var160;
            String var164 = field9175[var158].method2477();
            if (field9107 == 0) {
                int var165 = 16776960;
                int var166 = field9175[var158].method2480();
                if (var166 < 6) {
                    var165 = field9073[var166];
                }
                if (var166 == 6) {
                    var165 = field9042 % 20 < 10 ? 16711680 : 16776960;
                }
                if (var166 == 7) {
                    var165 = field9042 % 20 < 10 ? 255 : 65535;
                }
                if (var166 == 8) {
                    var165 = field9042 % 20 < 10 ? 45056 : 8454016;
                }
                if (var166 == 9) {
                    int var167 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    if (var167 < 50) {
                        var165 = var167 * 1280 + 16711680;
                    } else if (var167 < 100) {
                        var165 = 16776960 - (var167 - 50) * 327680;
                    } else if (var167 < 150) {
                        var165 = (var167 - 100) * 5 + 65280;
                    }
                }
                if (var166 == 10) {
                    int var168 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    if (var168 < 50) {
                        var165 = var168 * 5 + 16711680;
                    } else if (var168 < 100) {
                        var165 = 16711935 - (var168 - 50) * 327680;
                    } else if (var168 < 150) {
                        var165 = (var168 - 100) * 327680 + 255 - (var168 - 100) * 5;
                    }
                }
                if (var166 == 11) {
                    int var169 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    if (var169 < 50) {
                        var165 = 16777215 - var169 * 327685;
                    } else if (var169 < 100) {
                        var165 = (var169 - 50) * 327685 + 65280;
                    } else if (var169 < 150) {
                        var165 = 16777215 - (var169 - 100) * 327680;
                    }
                }
                int var170 = var165 | 0xFF000000;
                int var171 = field9175[var158].method2479();
                if (var171 == 0) {
                    Statics.field670.drawStringCentered(var164, arg0 + var159, arg1 + var160, var170, -16777216);
                }
                if (var171 == 1) {
                    Statics.field670.method838(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042);
                }
                if (var171 == 2) {
                    Statics.field670.method839(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042);
                }
                if (var171 == 3) {
                    int var172 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    Statics.field670.method840(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042, var172);
                }
                if (var171 == 4) {
                    int var173 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    int var174 = var173 * (Statics.field2399.method12418(var164) + 100) / 150;
                    Statics.renderer.o(arg0 + var159 - 50, arg1, arg0 + var159 + 50, arg1 + arg3);
                    Statics.field670.method833(var164, arg0 + var159 + 50 - var174, arg1 + var160, var170, -16777216);
                    Statics.renderer.r(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (var171 == 5) {
                    int var175 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
                    int var176 = 0;
                    if (var175 < 25) {
                        var176 = var175 - 25;
                    } else if (var175 > 125) {
                        var176 = var175 - 125;
                    }
                    int var177 = Statics.field2399.field7177 + Statics.field2399.field7176;
                    Statics.renderer.o(arg0, arg1 + var160 - var177 - 1, arg0 + arg2, arg1 + var160 + 5);
                    Statics.field670.drawStringCentered(var164, arg0 + var159, arg1 + var160 + var176, var170, -16777216);
                    Statics.renderer.r(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field670.drawStringCentered(var164, arg0 + var159, arg1 + var160, -256, -16777216);
            }
        }
    }

    @ObfuscatedName("dk.jf(IIIIB)V")
    public static final void method2714(int arg0, int arg1, int arg2, int arg3) {
        int var4 = crossX;
        int var5 = crossY;
        if (crossMode == 1) {
            Sprite var6 = Statics.field2618[crossCycle / 100];
            var6.method2500(var4 - 8, var5 - 8);
        }
        if (crossMode == 2) {
            Sprite var7 = Statics.field2618[crossCycle / 100 + 4];
            var7.method2500(var4 - 8, var5 - 8);
        }
    }

    @ObfuscatedName("ya.jx(IIIIIIIB)V")
    public static final void method12995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field8988 != 2) {
            return;
        }
        int var7 = ReceivePlayerPositions.highResolutionsCount;
        int[] var8 = ReceivePlayerPositions.highResolutionsIndices;
        for (int var9 = 0; var9 < var7; var9++) {
            PlayerEntity var10 = players[var8[var9]];
            if (var10 != null) {
                var10.method13968(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
            }
        }
        for (int var11 = 0; var11 < npcCount; var11++) {
            int var12 = field9056[var11];
            ObjectNode var13 = (ObjectNode) npcs.getNode((long) var12);
            if (var13 != null) {
                ((PathingEntity) var13.value).method13968(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
            }
        }
    }

    @ObfuscatedName("ph.jj(Laes;II)V")
    public static final void method7883(GraphEntity arg0, int arg1) {
        method8592(arg0, arg1, true);
    }

    @ObfuscatedName("oy.jr(Laes;II)V")
    public static final void method7396(GraphEntity arg0, int arg1) {
        method8592(arg0, arg1, false);
    }

    @ObfuscatedName("rm.jh(Laes;IZB)V")
    public static final void method8592(GraphEntity arg0, int arg1, boolean arg2) {
        int var6;
        int var7;
        if (arg0 instanceof PrimaryLayerEntity && arg0 instanceof Location) {
            PrimaryLayerEntity var3 = (PrimaryLayerEntity) arg0;
            int var4 = var3.field10508 - var3.field10510 + 1 << 9;
            int var5 = var3.field10511 - var3.field10509 + 1 << 9;
            var6 = (var3.field10510 << 9) + var4 / 2;
            var7 = (var3.field10509 << 9) + var5 / 2;
        } else {
            Vector3 var8 = arg0.getTransform().trans;
            var6 = (int) var8.x;
            var7 = (int) var8.z;
        }
        method1979(arg0.level, var6, var7, 0, arg1, arg2);
    }

    @ObfuscatedName("ac.js(IIIIIZB)V")
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (world.getSizeX() - 2) * 512 || arg2 > (world.getSizeZ() - 2) * 512)) {
            float[] var6 = field9048;
            field9048[1] = -1.0F;
            var6[0] = -1.0F;
            return;
        }
        int var7 = getHeightmapY(arg1, arg2, arg0) - arg4;
        field8925.method5115(Statics.renderer.method525());
        field8925.method5116((float) arg3, 0.0F, 0.0F);
        Statics.renderer.method524(field8925);
        if (arg5) {
            Statics.renderer.method550((float) arg1, (float) var7, (float) arg2, field9048);
        } else {
            Statics.renderer.method567((float) arg1, (float) var7, (float) arg2, field9048);
        }
        field8925.method5116((float) -arg3, 0.0F, 0.0F);
        Statics.renderer.method524(field8925);
        field9048[0] -= field9201;
        field9048[1] -= field9202;
    }

    @ObfuscatedName("re.ja(IIIB)I")
    public static final int getHeightmapY(int arg0, int arg1, int arg2) {
        if (world.getScene() == null) {
            return 0;
        }
        int var3 = arg0 >> 9;
        int var4 = arg1 >> 9;
        if (var3 < 0 || var4 < 0 || var3 > world.getSizeX() - 1 || var4 > world.getSizeZ() - 1) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (world.getSceneLevelTileFlags().levelTileFlags[1][var3][var4] & 0x2) != 0) {
            var5 = arg2 + 1;
        }
        return world.getScene().field4498[var5].getFineHeight(arg0, arg1);
    }

    @ObfuscatedName("vi.jp(IIIIII)I")
    public static final int method12385(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (world.getScene() == null) {
            return 0;
        }
        if (arg4 < 3) {
            SceneLevelTileFlags var5 = world.getSceneLevelTileFlags();
            int var6 = arg0 >> 9;
            int var7 = arg1 >> 9;
            if (arg2 < 0 || arg3 < 0 || arg2 > world.getSizeX() - 1 || arg3 > world.getSizeZ() - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > world.getSizeX() - 1 || var7 > world.getSizeZ() - 1) {
                return 0;
            }
            boolean var8 = (var5.levelTileFlags[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
            if ((arg0 & 0x1FF) == 0) {
                boolean var9 = (var5.levelTileFlags[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                boolean var10 = (var5.levelTileFlags[1][var6][arg1 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (var5.levelTileFlags[1][arg2][arg3] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x1FF) == 0) {
                boolean var11 = (var5.levelTileFlags[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (var5.levelTileFlags[1][arg0 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (var5.levelTileFlags[1][arg2][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg4++;
            }
        }
        return world.getScene().field4498[arg4].getFineHeight(arg0, arg1);
    }

    @ObfuscatedName("ps.jo(IIIIIIIS)V")
    public static final void orbitCamera(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field9196 - field9195) * var7 / 100 + field9195;
        int var9 = arg5 * var8 >> 8;
        int var10 = 16384 - arg3 & 0x3FFF;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 0;
        int var13 = 0;
        int var14 = var9;
        if (var10 != 0) {
            var13 = Trig1.sin[var10] * -var9 >> 14;
            var14 = Trig1.cos[var10] * var9 >> 14;
        }
        if (var11 != 0) {
            var12 = Trig1.sin[var11] * var14 >> 14;
            var14 = Trig1.cos[var11] * var14 >> 14;
        }
        Statics.cameraX = arg0 - var12;
        Statics.cameraY = arg1 - var13;
        Statics.cameraZ = arg2 - var14;
        Statics.cameraPitch = arg3;
        Statics.cameraYaw = arg4;
        Statics.cameraRoll = 0;
    }

    @ObfuscatedName("lu.jd(IIJ)V")
    public static final void method5830(int arg0, int arg1, long arg2) {
        int var4 = (int) arg2 >> 14 & 0x1F;
        int var5 = (int) arg2 >> 20 & 0x3;
        int var6 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        LocShape var7 = (LocShape) SerializableEnums.decode(LocShape.method6247(), var4);
        PathFinderEntitySize var8;
        if (LocShape.field6572 == var7 || LocShape.field6588 == var7 || LocShape.field6589 == var7) {
            LocType var9 = world.getLocTypeList().get(var6);
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var9.width;
                var11 = var9.length;
            } else {
                var10 = var9.length;
                var11 = var9.width;
            }
            if (var5 != 0) {
            }
            var8 = PathFinderEntityRelated.method1767(arg0, arg1, var10, var11, LocShape.field6591, 0);
        } else if (LocShape.method2616(var7.field6590)) {
            var8 = PathFinderEntityRelated.method1767(arg0, arg1, 0, 0, var7, var5);
        } else {
            var8 = PathFinderEntityRelated.method7893(arg0, arg1, 0, 0, var7, var5);
        }
        method2677(arg0, arg1, true, var8);
    }

    @ObfuscatedName("ww.je(IIB)V")
    public static final void method12668(int arg0, int arg1) {
        if (modeGame == ModeGame.STELLARDAWN) {
            if (method2677(arg0, arg1, false, PathFinderEntityRelated.method11404(arg0, arg1, 1, 1, 0))) {
                return;
            }
            method2677(arg0, arg1, false, Statics.method7914(arg0, arg1, 1, 1));
        } else if (method2677(arg0, arg1, false, Statics.method7914(arg0, arg1, 1, 1))) {
            return;
        } else {
            method2677(arg0, arg1, false, PathFinderEntityRelated.method11404(arg0, arg1, 1, 1, 0));
        }
    }

    @ObfuscatedName("di.ju(IIZLpq;I)Z")
    public static final boolean method2677(int arg0, int arg1, boolean arg2, PathFinderEntitySize arg3) {
        int var4 = Statics.localPlayerEntity.routeWaypointX[0];
        int var5 = Statics.localPlayerEntity.routeWaypointZ[0];
        if (var4 < 0 || var4 >= world.getSizeX() || var5 < 0 || var5 >= world.getSizeZ()) {
            return false;
        } else if (arg0 >= 0 && arg0 < world.getSizeX() && arg1 >= 0 && arg1 < world.getSizeZ()) {
            int var6 = PathFinder.method15625(var4, var5, Statics.localPlayerEntity.size(), arg3, world.method6101(Statics.localPlayerEntity.level), arg2, field9001, field9065);
            if (var6 < 1) {
                return false;
            }
            MiniMap.mapFlagX = field9001[var6 - 1];
            MiniMap.mapFlagZ = field9065[var6 - 1];
            MiniMap.mapFlag = false;
            DelayedStateChange.onMapFlag();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lr.jw(Lahg;IIBI)V")
    public static final void method6031(PlayerEntity arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.routeWaypointX[0];
        int var5 = arg0.routeWaypointZ[0];
        if (var4 < 0 || var4 >= world.getSizeX() || var5 < 0 || var5 >= world.getSizeZ() || (arg1 < 0 || arg1 >= world.getSizeX() || arg2 < 0 || arg2 >= world.getSizeZ())) {
            return;
        }
        int var6 = PathFinder.method15625(var4, var5, arg0.size(), PathFinderEntityRelated.method3645(arg1, arg2), world.method6101(arg0.level), true, field9001, field9065);
        if (var6 >= 1 && var6 <= 3) {
            for (int var7 = 0; var7 < var6 - 1; var7++) {
                arg0.method16124(field9001[var7], field9065[var7], arg3);
            }
        }
    }

    @ObfuscatedName("ib.jg(Lad;I)Z")
    public static final boolean readServerProt(ServerConnection arg0) {
        try {
            return handleServerProt(arg0);
        } catch (IOException var6) {
            if (state == 11) {
                arg0.closeForcefully();
                return false;
            } else {
                method8047();
                return true;
            }
        } catch (Exception var7) {
            CoordGrid var3 = world.getBase();
            String var4 = (arg0.packetType == null ? -1 : arg0.packetType.id) + TextUtil.field488 + (arg0.lastPacketType1 == null ? -1 : arg0.lastPacketType1.id) + TextUtil.field488 + (arg0.lastPacketType2 == null ? -1 : arg0.lastPacketType2.id) + " " + arg0.packetSize + TextUtil.field488 + (var3.x + Statics.localPlayerEntity.routeWaypointX[0]) + TextUtil.field488 + (var3.z + Statics.localPlayerEntity.routeWaypointZ[0]) + " ";
            for (int var5 = 0; var5 < arg0.packetSize && var5 < 50; var5++) {
                var4 = var4 + arg0.in.data[var5] + TextUtil.field488;
            }
            JagException.method16252(var4, var7);
            logout(false);
            return true;
        }
    }

    @ObfuscatedName("pe.jt(Lad;I)Z")
    public static final boolean handleServerProt(ServerConnection conn) throws IOException {
        Stream stream = conn.getStream();
        PacketBit buf = conn.in;
        if (stream == null) {
            return false;
        }
        if (conn.packetType == null) {
            if (conn.field836) {
                if (!stream.method7212(1)) {
                    return false;
                }
                stream.method7196(conn.in.data, 0, 1);
                conn.readPos++;
                conn.idleNetCycles = 0;
                conn.field836 = false;
            }
            buf.pos = 0;
            if (buf.isIsaac1or2()) {
                if (!stream.method7212(1)) {
                    return false;
                }
                stream.method7196(conn.in.data, 1, 1);
                conn.readPos++;
                conn.idleNetCycles = 0;
            }
            conn.field836 = true;
            ServerProt[] var3 = ServerProt.values();
            int var4 = buf.gIsaac1or2();
            if (var4 < 0 || var4 >= var3.length) {
                throw new IOException(var4 + " " + buf.pos);
            }
            conn.packetType = var3[var4];
            conn.packetSize = conn.packetType.size;
        }
        if (conn.packetSize == -1) {
            if (!stream.method7212(1)) {
                return false;
            }
            stream.method7196(buf.data, 0, 1);
            conn.packetSize = buf.data[0] & 0xFF;
            conn.readPos++;
            conn.idleNetCycles = 0;
        }
        if (conn.packetSize == -2) {
            if (!stream.method7212(2)) {
                return false;
            }
            stream.method7196(buf.data, 0, 2);
            buf.pos = 0;
            conn.packetSize = buf.g2();
            conn.readPos += 2;
            conn.idleNetCycles = 0;
        }
        if (conn.packetSize > 0) {
            if (!stream.method7212(conn.packetSize)) {
                return false;
            }
            buf.pos = 0;
            stream.method7196(buf.data, 0, conn.packetSize);
            conn.readPos += conn.packetSize;
            conn.idleNetCycles = 0;
        }
        conn.lastPacketType2 = conn.lastPacketType1;
        conn.lastPacketType1 = conn.lastPacketType0;
        conn.lastPacketType0 = conn.packetType;
        if (ServerProt.field3010 == conn.packetType) {
            logout(LoginManager.field536);
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3108 == conn.packetType) {
            handleZoneProt(ZoneProt.field2800);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2982 == conn.packetType) {
            int var5 = buf.g4s_alt1();
            int var6 = buf.g4s();
            int var7 = buf.g4s_alt3();
            int var8 = buf.g4s_alt2();
            int var9 = buf.g2_alt2();
            int var10 = buf.g4s_alt2();
            int var11 = buf.g1_alt2();
            int var12 = buf.g4s_alt3();
            int var13 = buf.g1_alt2();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            CoordGrid var16 = new CoordGrid(buf.g4s_alt2());
            incrementVerifyId();
            method3589(var10, new SubInterfaceActiveLoc(var9, var11, new LocReference(var16, var14, var15, var8)), new int[]{var12, var5, var6, var7}, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3094 == conn.packetType) {
            int var17 = buf.g2_alt3();
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = buf.g1_alt3();
            int var19 = buf.g3_alt3();
            AudioRenderer.method5596(var17, var19, var18);
            conn.packetType = null;
            return true;
        } else if (ServerProt.RUNCLIENTSCRIPT == conn.packetType) {
            String var20 = buf.gjstr();
            Object[] var21 = new Object[var20.length() + 1];
            for (int var22 = var20.length() - 1; var22 >= 0; var22--) {
                if (var20.charAt(var22) == 's') {
                    var21[var22 + 1] = buf.gjstr();
                } else {
                    var21[var22 + 1] = Integer.valueOf(buf.g4s());
                }
            }
            var21[0] = Integer.valueOf(buf.g4s());
            incrementVerifyId();
            HookRequest var23 = new HookRequest();
            var23.onop = var21;
            ScriptRunner.runHook(var23);
            conn.packetType = null;
            return true;
        } else if (ServerProt.CLIENT_SETVARCSTR_LARGE == conn.packetType) {
            String var24 = buf.gjstr();
            int var25 = buf.g2();
            incrementVerifyId();
            DelayedStateChange.method14096(var25, var24);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3062 == conn.packetType) {
            Statics.field5051 = null;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3001 == conn.packetType) {
            int var26 = buf.g2();
            byte var27 = buf.g1b();
            if (Statics.field5051 == null) {
                Statics.field5051 = new Object[Statics.field7390.field7345];
            }
            Statics.field5051[var26] = Integer.valueOf(var27);
            field9145[++field9146 - 1 & 0x1F] = var26;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3057 == conn.packetType) {
            int var28 = buf.g1_alt3();
            byte var29 = buf.g1b_alt2();
            incrementVerifyId();
            AudioRenderer.method1349(var29, var28);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3005 == conn.packetType) {
            handleZoneProt(ZoneProt.field2810);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3070 == conn.packetType) {
            int var30 = buf.g4s_alt2();
            int var31 = buf.g4s();
            incrementVerifyId();
            DelayedStateChange.method1639(var30, var31);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3014 == conn.packetType) {
            int var32 = buf.g4s_alt1();
            int var33 = buf.g4s_alt2();
            int var34 = buf.g2();
            incrementVerifyId();
            DelayedStateChange.method2995(var33, 5, var34, var32);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3117 == conn.packetType) {
            int var35 = buf.g4s_alt2();
            incrementVerifyId();
            DelayedStateChange.method2995(var35, 5, currentPlayerUid, 0);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3038 == conn.packetType) {
            int var36 = buf.g4s_alt1();
            incrementVerifyId();
            if (var36 == -1) {
                Statics.field1941 = -1;
                Statics.field3308 = -1;
            } else {
                CoordGrid var37 = world.getBase();
                int var38 = var36 >> 14 & 0x3FFF;
                int var39 = var36 & 0x3FFF;
                int var40 = var38 - var37.x;
                if (var40 < 0) {
                    var40 = 0;
                } else if (var40 >= world.getSizeX()) {
                    var40 = world.getSizeX();
                }
                int var41 = var39 - var37.z;
                if (var41 < 0) {
                    var41 = 0;
                } else if (var41 >= world.getSizeZ()) {
                    var41 = world.getSizeZ();
                }
                Statics.field1941 = (var40 << 9) + 256;
                Statics.field3308 = (var41 << 9) + 256;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.VARC_SMALL == conn.packetType) {
            byte var42 = buf.g1b();
            int var43 = buf.g2_alt3();
            incrementVerifyId();
            DelayedStateChange.method3667(var43, var42);
            conn.packetType = null;
            return true;
        } else if (ServerProt.REBUILD_REGION == conn.packetType) {
            PacketBit var44 = new PacketBit(conn.packetSize);
            System.arraycopy(conn.in.data, conn.in.pos, var44.data, 0, conn.packetSize);
            method7731();
            if (Statics.options.field9667.method15884() == 1) {
                Statics.asyncRebuild.method6053(new RebuildRequest(RebuildType.REBUILD_REGION, var44));
            } else {
                world.method6135(new RebuildRequest(RebuildType.REBUILD_REGION, var44));
            }
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3027 == conn.packetType) {
            field9030 = buf.g1b();
            if (field9030 == 0 || field9030 == 1) {
                field9079 = true;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3132 == conn.packetType) {
            handleZoneProt(ZoneProt.field2804);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3046 == conn.packetType) {
            handleZoneProt(ZoneProt.field2809);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3009 == conn.packetType) {
            Loading.method186();
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3085 == conn.packetType) {
            CoordGrid var45 = new CoordGrid(buf.g4s_alt2());
            int var46 = buf.g4s_alt2();
            int var47 = buf.g2_alt3();
            int var48 = buf.g4s_alt1();
            int var49 = buf.g4s();
            int var50 = buf.g4s_alt1();
            int var51 = buf.g1_alt3();
            int var52 = buf.g2_alt3();
            int var53 = buf.g4s_alt2();
            incrementVerifyId();
            method3589(var46, new SubInterfaceActiveObj(var52, var51, new ObjReference(var45, var47)), new int[]{var49, var50, var48, var53}, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3104 == conn.packetType) {
            int var54 = buf.g4s();
            int var55 = buf.g4s_alt3();
            int var56 = var55 >> 28 & 0x3;
            int var57 = var55 >> 14 & 0x3FFF;
            int var58 = var55 & 0x3FFF;
            int var59 = buf.g1_alt3();
            int var60 = var59 >> 2;
            int var61 = var59 & 0x3;
            int var62 = field8986[var60];
            CoordGrid var63 = world.getBase();
            int var64 = var57 - var63.x;
            int var65 = var58 - var63.z;
            method3302(var56, var64, var65, var62, var60, var61, var54);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3008 == conn.packetType) {
            int var66 = buf.g4s();
            int var67 = buf.g2_alt1();
            int var68 = buf.g4s_alt3();
            incrementVerifyId();
            DelayedStateChange.method2995(var66, 3, var67, var68);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3033 == conn.packetType) {
            int var69 = buf.g2();
            String var70 = buf.gjstr();
            boolean var71 = buf.g1() == 1;
            Statics.field6775 = Statics.field6772;
            Statics.field6776 = var71;
            WorldSwitcher.method8621(var69, var70);
            Object var72 = null;
            setState(0);
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3125 == conn.packetType) {
            int var73 = buf.g1_alt2();
            int[] var74 = new int[MoveSpeed.values().length];
            for (int var75 = 0; var75 < MoveSpeed.values().length; var75++) {
                var74[var75] = buf.g4s_alt3();
            }
            int var76 = buf.g2_alt1();
            ObjectNode var77 = (ObjectNode) npcs.getNode((long) var76);
            if (var77 != null) {
                method8263((PathingEntity) var77.value, var74, var73, true);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3091 == conn.packetType) {
            String var78 = buf.gjstr();
            DeveloperConsole.method7065(var78, false, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3115 == conn.packetType) {
            while (buf.pos < conn.packetSize) {
                boolean var79 = buf.g1() == 1;
                String var80 = buf.gjstr();
                String var81 = buf.gjstr();
                int var82 = buf.g2();
                int var83 = buf.g1();
                boolean var84 = buf.g1() == 1;
                String var85 = "";
                int var86 = -1;
                int var87 = 0;
                if (var82 > 0) {
                    var85 = buf.gjstr();
                    var86 = buf.g1();
                    var87 = buf.g4s();
                }
                for (int var88 = 0; var88 < field9206; var88++) {
                    Friend var89 = field9209[var88];
                    if (var79) {
                        if (var81.equals(var89.field649)) {
                            var89.field649 = var80;
                            var89.field646 = var81;
                            var80 = null;
                            break;
                        }
                    } else if (var80.equals(var89.field649)) {
                        if (var89.field647 != var82) {
                            boolean var90 = true;
                            for (TimestampMessage var91 = (TimestampMessage) field8934.method11649(); var91 != null; var91 = (TimestampMessage) field8934.method11644()) {
                                if (var91.field9263.equals(var80)) {
                                    if (var82 != 0 && var91.field9264 == 0) {
                                        var91.method6975();
                                        var90 = false;
                                    } else if (var82 == 0 && var91.field9264 != 0) {
                                        var91.method6975();
                                        var90 = false;
                                    }
                                }
                            }
                            if (var90) {
                                field8934.method11640(new TimestampMessage(var80, var82));
                            }
                            var89.field647 = var82;
                        }
                        var89.field646 = var81;
                        var89.field648 = var85;
                        var89.field645 = var83;
                        var89.field650 = var86;
                        var89.field651 = var84;
                        var89.field652 = var87;
                        var80 = null;
                        break;
                    }
                }
                if (var80 != null && field9206 < 200) {
                    Friend var92 = new Friend();
                    field9209[field9206] = var92;
                    var92.field649 = var80;
                    var92.field646 = var81;
                    var92.field647 = var82;
                    var92.field648 = var85;
                    var92.field645 = var83;
                    var92.field650 = var86;
                    var92.field651 = var84;
                    var92.field652 = var87;
                    field9206++;
                }
            }
            field9121 = 2;
            field9148 = interfaceUpdateNum;
            boolean var93 = false;
            int var94 = field9206;
            while (var94 > 0) {
                boolean var95 = true;
                var94--;
                for (int var96 = 0; var96 < var94; var96++) {
                    boolean var97 = false;
                    Friend var98 = field9209[var96];
                    Friend var99 = field9209[var96 + 1];
                    if (Statics.field6772.field6768 != var98.field647 && Statics.field6772.field6768 == var99.field647) {
                        var97 = true;
                    }
                    if (!var97 && var98.field647 == 0 && var99.field647 != 0) {
                        var97 = true;
                    }
                    if (!var97 && !var98.field651 && var99.field651) {
                        var97 = true;
                    }
                    if (var97) {
                        Friend var100 = field9209[var96];
                        field9209[var96] = field9209[var96 + 1];
                        field9209[var96 + 1] = var100;
                        var95 = false;
                    }
                }
                if (var95) {
                    break;
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3031 == conn.packetType) {
            Statics.field8469 = buf.g3s();
            field9054 = buf.g1() == 1;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3055 == conn.packetType) {
            boolean var101 = buf.g1() == 1;
            String var102 = buf.gjstr();
            String var103 = var102;
            if (var101) {
                var103 = buf.gjstr();
            }
            int var104 = buf.g1();
            boolean var105 = false;
            if (var104 <= 1) {
                if (field9054 && !field9077 || field9081) {
                    var105 = true;
                } else if (var104 <= 1 && method11167(var103)) {
                    var105 = true;
                }
            }
            if (!var105) {
                String var106 = StringHelper.method4597(WordPack.method1205(buf));
                if (var104 == 2) {
                    ChatHistory.method13903(24, 0, TextUtil.method6076(1) + var102, TextUtil.method6076(1) + var103, var102, var106, null, -1);
                } else if (var104 == 1) {
                    ChatHistory.method13903(24, 0, TextUtil.method6076(0) + var102, TextUtil.method6076(0) + var103, var102, var106, null, -1);
                } else {
                    ChatHistory.method13903(24, 0, var102, var103, var102, var106, null, -1);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.UPDATE_RUNWEIGHT == conn.packetType) {
            field8905 = buf.g2s();
            miscTransmitNum = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3103 == conn.packetType) {
            int var107 = buf.g2();
            int var108 = buf.g1();
            incrementVerifyId();
            VideoTypeList.method7358(var107, var108, true);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3080 == conn.packetType) {
            int var109 = buf.g2();
            if (var109 == 65535) {
                var109 = -1;
            }
            int var110 = buf.g1();
            int var111 = buf.g2();
            int var112 = buf.g1();
            int var113 = buf.g2();
            AudioRenderer.method1717(var109, var110, var111, var112, false, var113);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2992 == conn.packetType) {
            int var114 = buf.g4s_alt2();
            int var115 = buf.g4s_alt3();
            incrementVerifyId();
            DelayedStateChange.method1974(var115, var114);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2989 == conn.packetType) {
            int var116 = buf.g4s_alt2();
            int var117 = buf.g4s_alt1();
            incrementVerifyId();
            DelayedStateChange.method12119(var116, var117);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3056 == conn.packetType) {
            int var118 = buf.g4s_alt3();
            if (Statics.field3210 != var118) {
                Statics.field3210 = var118;
                ScriptRunner.method1372(ClientTriggerType.field7308, -1, -1);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.CLIENT_SETVARCSTR_SMALL == conn.packetType) {
            int var119 = buf.g2_alt2();
            String var120 = buf.gjstr();
            incrementVerifyId();
            DelayedStateChange.method14096(var119, var120);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3042 == conn.packetType) {
            int var121 = buf.g2();
            int var122 = buf.g1();
            boolean var123 = (var122 & 0x1) == 1;
            ClientInvCache.method12901(var121, var123);
            int var124 = buf.g2();
            for (int var125 = 0; var125 < var124; var125++) {
                int var126 = buf.g1();
                if (var126 == 255) {
                    var126 = buf.g4s_alt1();
                }
                int var127 = buf.g2();
                ClientInvCache.method14728(var121, var125, var127 - 1, var126, var123);
            }
            field9137[++field9158 - 1 & 0x1F] = var121;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3015 == conn.packetType) {
            int var128 = buf.g1();
            CreateAccountReply var129 = (CreateAccountReply) SerializableEnums.decode(Statics.method2615(), var128);
            if (var129 == null) {
                var129 = CreateAccountReply.field6444;
            }
            AccountCreationManager.method1219(var129);
            conn.packetType = null;
            return true;
        } else if (ServerProt.REBUILD_NORMAL == conn.packetType) {
            PacketBit var130 = new PacketBit(conn.packetSize);
            System.arraycopy(conn.in.data, conn.in.pos, var130.data, 0, conn.packetSize);
            method7731();
            if (Statics.options.field9667.method15884() == 1) {
                Statics.asyncRebuild.method6053(new RebuildRequest(RebuildType.REBUILD_NORMAL, var130));
            } else {
                world.method6135(new RebuildRequest(RebuildType.REBUILD_NORMAL, var130));
            }
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3069 == conn.packetType) {
            int var131 = buf.g2();
            int var132 = buf.g1();
            boolean var133 = (var132 & 0x1) == 1;
            while (buf.pos < conn.packetSize) {
                int var134 = buf.gSmart1or2();
                int var135 = buf.g2();
                int var136 = 0;
                if (var135 != 0) {
                    var136 = buf.g1();
                    if (var136 == 255) {
                        var136 = buf.g4s();
                    }
                }
                ClientInvCache.method14728(var131, var134, var135 - 1, var136, var133);
            }
            field9137[++field9158 - 1 & 0x1F] = var131;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3133 == conn.packetType) {
            Statics.field769 = PrivateChatFilter.method11235(buf.g1());
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3032 == conn.packetType) {
            handleZoneProt(ZoneProt.field2803);
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_OPENSUB == conn.packetType) {
            int key1 = buf.g4s_alt1();
            int key2 = buf.g4s_alt1();
            int combinedId = buf.g4s_alt2();
            int type = buf.g1_alt3();
            int child = buf.g2_alt3();
            int key3 = buf.g4s_alt2();
            int key4 = buf.g4s_alt2();
            incrementVerifyId();
            method3589(combinedId, new SubInterface(child, type), new int[]{key1, key2, key3, key4}, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3101 == conn.packetType) {
            int var144 = buf.g2();
            if (var144 == 65535) {
                var144 = -1;
            }
            int var145 = buf.g2_alt3();
            if (var145 == 65535) {
                var145 = -1;
            }
            int var146 = buf.g4s_alt1();
            int var147 = buf.g2_alt1();
            incrementVerifyId();
            for (int var148 = var145; var148 <= var144; var148++) {
                long var149 = ((long) var146 << 32) + (long) var148;
                ServerKeyProperties var151 = (ServerKeyProperties) field9010.getNode(var149);
                ServerKeyProperties var152;
                if (var151 != null) {
                    var152 = new ServerKeyProperties(var151.field9416, var147);
                    var151.remove();
                } else if (var148 == -1) {
                    var152 = new ServerKeyProperties(Component.method11381(var146).field1841.field9416, var147);
                } else {
                    var152 = new ServerKeyProperties(0, var147);
                }
                field9010.put(var152, var149);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3111 == conn.packetType) {
            handleZoneProt(ZoneProt.field2813);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3090 == conn.packetType) {
            int var153 = buf.g2_alt1();
            int var154 = buf.g2_alt3();
            int var155 = buf.g4s_alt1();
            int var156 = buf.g2_alt3();
            incrementVerifyId();
            DelayedStateChange.method2995(var155, 7, var156 << 16 | var154, var153);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2975 == conn.packetType) {
            String var157 = buf.gjstr();
            int var158 = buf.g1_alt2();
            int var159 = buf.g2_alt3();
            if (var159 == 65535) {
                var159 = -1;
            }
            int var160 = buf.g1();
            if (var158 >= 1 && var158 <= 8) {
                if (var157.equalsIgnoreCase("null")) {
                    var157 = null;
                }
                field9085[var158 - 1] = var157;
                field9084[var158 - 1] = var159;
                field9086[var158 - 1] = var160 == 0;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3096 == conn.packetType) {
            int var161 = buf.g2();
            int var162 = buf.g2();
            int var163 = buf.g2();
            incrementVerifyId();
            if (Statics.field1756[var161] != null) {
                for (int var164 = var162; var164 < var163; var164++) {
                    int var165 = buf.g3();
                    if (var164 < Statics.field1756[var161].field1732.length && Statics.field1756[var161].field1732[var164] != null) {
                        Statics.field1756[var161].field1732[var164].field1850 = var165;
                    }
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3041 == conn.packetType) {
            boolean var166 = buf.g1() == 1;
            String var167 = buf.gjstr();
            long var168 = (long) buf.g2();
            long var170 = (long) buf.g3();
            int var172 = buf.g1();
            int var173 = buf.g2();
            long var174 = (var168 << 32) + var170;
            boolean var176 = false;
            Object var177 = null;
            ClanChannel var178 = var166 ? Statics.field8458 : Statics.field1515;
            if (var178 == null) {
                var176 = true;
            } else {
                int var179 = 0;
                while (true) {
                    if (var179 >= 100) {
                        if (var172 <= 1 && method11167(var167)) {
                            var176 = true;
                        }
                        break;
                    }
                    if (field9180[var179] == var174) {
                        var176 = true;
                        break;
                    }
                    var179++;
                }
            }
            if (!var176) {
                field9180[field9181] = var174;
                field9181 = (field9181 + 1) % 100;
                String var180 = Statics.field3779.method12176(var173).method16749(buf);
                int var181 = var166 ? 42 : 45;
                if (var172 == 2 || var172 == 3) {
                    ChatHistory.method13903(var181, 0, TextUtil.method6076(1) + var167, TextUtil.method6076(1) + var167, var167, var180, var178.field9427, var173);
                } else if (var172 == 1) {
                    ChatHistory.method13903(var181, 0, TextUtil.method6076(0) + var167, TextUtil.method6076(0) + var167, var167, var180, var178.field9427, var173);
                } else {
                    ChatHistory.method13903(var181, 0, var167, var167, var167, var180, var178.field9427, var173);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3121 == conn.packetType) {
            String var182 = buf.gjstr();
            int var183 = buf.g2();
            String var184 = Statics.field3779.method12176(var183).method16749(buf);
            ChatHistory.method13903(19, 0, var182, var182, var182, var184, null, var183);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3136 == conn.packetType) {
            field9149 = interfaceUpdateNum;
            boolean var185 = buf.g1() == 1;
            ClanSettingsDelta var186 = new ClanSettingsDelta(buf);
            ClanSettings var187;
            if (var185) {
                var187 = Statics.field2972;
            } else {
                var187 = Statics.field913;
            }
            var186.method4109(var187);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3000 == conn.packetType) {
            ReflectionChecker.method2794(buf, conn.packetSize);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3116 == conn.packetType) {
            buf.pos += 28;
            if (buf.checkcrc()) {
                Statics.method12450(buf, buf.pos - 28);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3017 == conn.packetType) {
            int var188 = buf.g4s();
            int var189 = buf.g4s_alt2();
            int var190 = buf.g2_alt1();
            if (var190 == 65535) {
                var190 = -1;
            }
            incrementVerifyId();
            DelayedStateChange.method15973(var188, var190, var189);
            ObjType var191 = Statics.objTypes.get(var190);
            DelayedStateChange.method3599(var188, var191.field7073, var191.field7077, var191.field7072);
            DelayedStateChange.method12633(var188, var191.field7076, var191.field7075, var191.field7088);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3109 == conn.packetType) {
            while (buf.pos < conn.packetSize) {
                int var192 = buf.g1();
                boolean var193 = (var192 & 0x1) == 1;
                String var194 = buf.gjstr();
                String var195 = buf.gjstr();
                for (int var196 = 0; var196 < field9211; var196++) {
                    Ignore var197 = field8999[var196];
                    if (var193) {
                        if (var195.equals(var197.field639)) {
                            var197.field639 = var194;
                            var197.field638 = var195;
                            var194 = null;
                            break;
                        }
                    } else if (var194.equals(var197.field639)) {
                        var197.field639 = var194;
                        var197.field638 = var195;
                        var194 = null;
                        break;
                    }
                }
                if (var194 != null && field9211 < 100) {
                    Ignore var198 = new Ignore();
                    field8999[field9211] = var198;
                    var198.field639 = var194;
                    var198.field638 = var195;
                    var198.field640 = (var192 & 0x2) == 2;
                    field9211++;
                }
            }
            field9148 = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2999 == conn.packetType) {
            int var199 = buf.g4s();
            Statics.hostNameProvider = new HostNameProvider(var199);
            Thread var200 = new Thread(Statics.hostNameProvider);
            var200.setPriority(1);
            var200.start();
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_SETHIDE == conn.packetType) {
            int var201 = buf.g4s_alt2();
            int var202 = buf.g1_alt2();
            incrementVerifyId();
            DelayedStateChange.method7351(var201, var202);
            conn.packetType = null;
            return true;
        } else if (ServerProt.MESSAGE_GAME == conn.packetType) {
            int var203 = buf.gSmart1or2();
            int var204 = buf.g4s();
            int var205 = buf.g1();
            String var206 = "";
            String var207 = var206;
            if ((var205 & 0x1) != 0) {
                var206 = buf.gjstr();
                if ((var205 & 0x2) == 0) {
                    var207 = var206;
                } else {
                    var207 = buf.gjstr();
                }
            }
            String var208 = buf.gjstr();
            if (var203 == 99) {
                DeveloperConsole.addLine(var208);
            } else if (var203 == 98) {
                DeveloperConsole.method11224(var208);
            } else if (var207.equals("") || !method11167(var207)) {
                ChatHistory.addMessage(var203, var204, var206, var207, var206, var208);
            } else {
                conn.packetType = null;
                return true;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS == conn.packetType) {
            Statics.field3161 = buf.g1();
            Statics.field6803 = buf.g1b() << 3;
            Statics.field3907 = buf.g1b() << 3;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3061 == conn.packetType) {
            boolean var209 = buf.g1() == 1;
            String var210 = buf.gjstr();
            String var211 = var210;
            if (var209) {
                var211 = buf.gjstr();
            }
            long var212 = buf.g8();
            long var214 = (long) buf.g2();
            long var216 = (long) buf.g3();
            int var218 = buf.g1();
            long var219 = (var214 << 32) + var216;
            boolean var221 = false;
            int var222 = 0;
            while (true) {
                if (var222 >= 100) {
                    if (var218 <= 1) {
                        if (field9054 && !field9077 || field9081) {
                            var221 = true;
                        } else if (method11167(var211)) {
                            var221 = true;
                        }
                    }
                    break;
                }
                if (field9180[var222] == var219) {
                    var221 = true;
                    break;
                }
                var222++;
            }
            if (!var221) {
                field9180[field9181] = var219;
                field9181 = (field9181 + 1) % 100;
                String var223 = StringHelper.method4597(WordPack.method1205(buf));
                if (var218 == 2 || var218 == 3) {
                    ChatHistory.method13903(9, 0, TextUtil.method6076(1) + var210, TextUtil.method6076(1) + var211, var210, var223, Base37.method8066(var212), -1);
                } else if (var218 == 1) {
                    ChatHistory.method13903(9, 0, TextUtil.method6076(0) + var210, TextUtil.method6076(0) + var211, var210, var223, Base37.method8066(var212), -1);
                } else {
                    ChatHistory.method13903(9, 0, var210, var211, var210, var223, Base37.method8066(var212), -1);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2986 == conn.packetType) {
            field8919 = buf.g2s();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3054 == conn.packetType) {
            int var224 = buf.g4s_alt3();
            boolean var225 = buf.g1() == 1;
            if (Statics.field3497 != var225 || Statics.field3584 != var224) {
                Statics.field3497 = var225;
                Statics.field3584 = var224;
                ScriptRunner.method1372(ClientTriggerType.field7310, -1, -1);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3134 == conn.packetType) {
            MiniMap.field762 = buf.g1();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3034 == conn.packetType) {
            if (Fullscreen.allowed && Statics.fsFrame != null) {
                setWindowMode(Statics.options.maxScreenSize.getValue(), -1, -1, false);
            }
            byte[] var226 = new byte[conn.packetSize];
            buf.gIsaacArrayBuffer(var226, 0, conn.packetSize);
            String var227 = Cp1252.method6881(var226, 0, conn.packetSize);
            String var228 = "opensn";
            if (!field8903 || !Browser.method1814(var227, 1, var228)) {
                Browser.method5599(var227, true, Statics.options.field9661.getValue() == 5, var228, field8915, field9218);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3051 == conn.packetType) {
            handleZoneProt(ZoneProt.field2801);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3075 == conn.packetType) {
            int var229 = buf.g2_alt2();
            incrementVerifyId();
            VideoTypeList.method2930(var229);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3087 == conn.packetType) {
            boolean var230 = buf.g1_alt2() == 1;
            int var231 = buf.g4s_alt3();
            incrementVerifyId();
            DelayedStateChange.method15850(var231, var230);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3052 == conn.packetType) {
            int var232 = buf.g1();
            int var233 = buf.g2_alt1();
            boolean var234 = (var232 & 0x1) == 1;
            ClientInvCache.method5568(var233, var234);
            field9137[++field9158 - 1 & 0x1F] = var233;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3112 == conn.packetType) {
            int var235 = buf.g1();
            if (buf.g1() == 0) {
                field9184[var235] = new StockMarketSlot();
            } else {
                buf.pos--;
                field9184[var235] = new StockMarketSlot(buf);
            }
            field9152 = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.UPDATE_RUNENERGY == conn.packetType) {
            field9109 = buf.g1();
            miscTransmitNum = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3082 == conn.packetType) {
            boolean var236 = buf.g1() == 1;
            String var237 = buf.gjstr();
            long var238 = (long) buf.g2();
            long var240 = (long) buf.g3();
            int var242 = buf.g1();
            long var243 = (var238 << 32) + var240;
            boolean var245 = false;
            Object var246 = null;
            ClanChannel var247 = var236 ? Statics.field8458 : Statics.field1515;
            if (var247 == null) {
                var245 = true;
            } else {
                int var248 = 0;
                while (true) {
                    if (var248 >= 100) {
                        if (var242 <= 1) {
                            if (field9054 && !field9077 || field9081) {
                                var245 = true;
                            } else if (method11167(var237)) {
                                var245 = true;
                            }
                        }
                        break;
                    }
                    if (field9180[var248] == var243) {
                        var245 = true;
                        break;
                    }
                    var248++;
                }
            }
            if (!var245) {
                field9180[field9181] = var243;
                field9181 = (field9181 + 1) % 100;
                String var249 = StringHelper.method4597(WordPack.method1205(buf));
                int var250 = var236 ? 41 : 44;
                if (var242 == 2 || var242 == 3) {
                    ChatHistory.method13903(var250, 0, TextUtil.method6076(1) + var237, TextUtil.method6076(1) + var237, var237, var249, var247.field9427, -1);
                } else if (var242 == 1) {
                    ChatHistory.method13903(var250, 0, TextUtil.method6076(0) + var237, TextUtil.method6076(0) + var237, var237, var249, var247.field9427, -1);
                } else {
                    ChatHistory.method13903(var250, 0, var237, var237, var237, var249, var247.field9427, -1);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3105 == conn.packetType) {
            int var251 = buf.g1();
            int var252 = buf.gSmart2or4null();
            if (field9044[var251] != null) {
                field9044[var251].method6952(world.getScene());
                field9044[var251] = null;
            }
            if (var252 != -1) {
                field9044[var251] = new HintTrail(Statics.renderer, buf, var252);
                field9044[var251].method6951(world.getScene());
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3110 == conn.packetType) {
            for (int var253 = 0; var253 < players.length; var253++) {
                if (players[var253] != null) {
                    players[var253].field8615 = null;
                    players[var253].field8597.method11769(-1);
                }
            }
            for (int var254 = 0; var254 < field8966; var254++) {
                ((PathingEntity) field8965[var254].value).field8615 = null;
                ((PathingEntity) field8965[var254].value).field8597.method11769(-1);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_SETEVENTS == conn.packetType) {
            int var255 = buf.g4s_alt1();
            int var256 = buf.g2_alt2();
            if (var256 == 65535) {
                var256 = -1;
            }
            int var257 = buf.g4s_alt2();
            int var258 = buf.g2();
            if (var258 == 65535) {
                var258 = -1;
            }
            incrementVerifyId();
            for (int var259 = var258; var259 <= var256; var259++) {
                long var260 = ((long) var257 << 32) + (long) var259;
                ServerKeyProperties var262 = (ServerKeyProperties) field9010.getNode(var260);
                ServerKeyProperties var263;
                if (var262 != null) {
                    var263 = new ServerKeyProperties(var255, var262.field9423);
                    var262.remove();
                } else if (var259 == -1) {
                    var263 = new ServerKeyProperties(var255, Component.method11381(var257).field1841.field9423);
                } else {
                    var263 = new ServerKeyProperties(var255, -1);
                }
                field9010.put(var263, var260);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3100 == conn.packetType) {
            Statics.cam2.method14033(buf, conn.packetSize);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3037 == conn.packetType) {
            Statics.field3161 = buf.g1();
            Statics.field3907 = buf.g1b_alt1() << 3;
            Statics.field6803 = buf.g1b_alt1() << 3;
            CoordGrid var264 = world.getBase();
            for (ObjStackList var265 = (ObjStackList) field9088.method11928(); var265 != null; var265 = (ObjStackList) field9088.method11929()) {
                int var266 = (int) (var265.field4228 >> 28 & 0x3L);
                int var267 = (int) (var265.field4228 & 0x3FFFL);
                int var268 = var267 - var264.x;
                int var269 = (int) (var265.field4228 >> 14 & 0x3FFFL);
                int var270 = var269 - var264.z;
                if (Statics.field3161 == var266 && var268 >= Statics.field6803 && var268 < Statics.field6803 + 8 && var270 >= Statics.field3907 && var270 < Statics.field3907 + 8) {
                    var265.remove();
                    if (var268 >= 0 && var270 >= 0 && var268 < world.getSizeX() && var270 < world.getSizeZ()) {
                        sortObjStacks(Statics.field3161, var268, var270);
                    }
                }
            }
            for (ChangeLocationRequest var271 = (ChangeLocationRequest) ChangeLocationRequest.field9278.last(); var271 != null; var271 = (ChangeLocationRequest) ChangeLocationRequest.field9278.prev()) {
                if (var271.field9291 >= Statics.field6803 && var271.field9291 < Statics.field6803 + 8 && var271.field9280 >= Statics.field3907 && var271.field9280 < Statics.field3907 + 8 && Statics.field3161 == var271.field9281) {
                    var271.field9290 = true;
                }
            }
            for (ChangeLocationRequest var272 = (ChangeLocationRequest) ChangeLocationRequest.field9292.last(); var272 != null; var272 = (ChangeLocationRequest) ChangeLocationRequest.field9292.prev()) {
                if (var272.field9291 >= Statics.field6803 && var272.field9291 < Statics.field6803 + 8 && var272.field9280 >= Statics.field3907 && var272.field9280 < Statics.field3907 + 8 && Statics.field3161 == var272.field9281) {
                    var272.field9290 = true;
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3039 == conn.packetType) {
            int var273 = buf.g4s_alt3();
            int var274 = buf.g2_alt3();
            int var275 = buf.g4s_alt1();
            int var276 = buf.g1_alt2();
            int var277 = buf.g4s_alt3();
            int var278 = buf.g4s_alt1();
            int var279 = buf.g2_alt3();
            int var280 = buf.g4s_alt3();
            incrementVerifyId();
            method3589(var277, new SubInterfaceActiveNpc(var274, var276, var279), new int[]{var275, var278, var280, var273}, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3028 == conn.packetType) {
            int var281 = buf.g2_alt2();
            int var282 = buf.g4s_alt3();
            incrementVerifyId();
            DelayedStateChange.method12737(var282, var281);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3079 == conn.packetType) {
            int var283 = buf.g2_alt2();
            incrementVerifyId();
            VideoTypeList.method11689(var283);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3083 == conn.packetType) {
            int var284 = buf.g2_alt1();
            int var285 = buf.g4s();
            incrementVerifyId();
            DelayedStateChange.method11469(var285, var284);
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_CLOSESUB == conn.packetType) {
            int var286 = buf.g4s_alt1();
            incrementVerifyId();
            SubInterface var287 = (SubInterface) field9075.getNode((long) var286);
            if (var287 != null) {
                closeSubInterface(var287, true, false);
            }
            if (field9108 != null) {
                requestRedrawComponent(field9108);
                field9108 = null;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2990 == conn.packetType) {
            int var288 = buf.g2();
            if (var288 == 65535) {
                var288 = -1;
            }
            int var289 = buf.g1();
            int var290 = buf.g2();
            int var291 = buf.g1();
            int var292 = buf.g2();
            AudioRenderer.method14082(var288, var289, var290, var291, var292);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3067 == conn.packetType) {
            int var293 = buf.g2();
            if (var293 == 65535) {
                var293 = -1;
            }
            AudioRenderer.method5712(var293);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3076 == conn.packetType) {
            int var294 = buf.g1();
            int var295 = buf.g1_alt2();
            if (var294 == 255) {
                var294 = -1;
                var295 = -1;
            }
            DelayedStateChange.method3292(var294, var295);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3073 == conn.packetType) {
            int var296 = buf.g1();
            CheckEmailReply var297 = (CheckEmailReply) SerializableEnums.decode(CheckEmailReply.method8272(), var296);
            if (var297 == null) {
                var297 = CheckEmailReply.field6455;
            }
            AccountCreationManager.method4554(var297);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3124 == conn.packetType) {
            method7723(buf.gjstr());
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3026 == conn.packetType) {
            handleZoneProt(ZoneProt.field2812);
            conn.packetType = null;
            return true;
        } else if (ServerProt.NO_TIMEOUT == conn.packetType) {
            conn.packetType = null;
            return false;
        } else if (ServerProt.CAM_RESET == conn.packetType) {
            incrementVerifyId();
            cameraReset();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3119 == conn.packetType) {
            int var298 = buf.g2();
            int var299 = buf.g4s();
            if (Statics.field5051 == null) {
                Statics.field5051 = new Object[Statics.field7390.field7345];
            }
            Statics.field5051[var298] = Integer.valueOf(var299);
            field9145[++field9146 - 1 & 0x1F] = var298;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3007 == conn.packetType) {
            boolean var300 = buf.g1() == 1;
            if (var300) {
                Statics.cameraState = 2;
            } else {
                cameraReset();
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3021 == conn.packetType) {
            handleZoneProt(ZoneProt.field2807);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3074 == conn.packetType) {
            int var301 = buf.g2();
            field8906 = -1;
            cutsceneId = var301;
            field8988 = 4;
            Statics.field4824.method5630(cutsceneId);
            MiniMenu.close();
            MiniMenu.method1401();
            int var302 = buf.g2();
            Statics.field4561 = new int[var302][4];
            for (int var303 = 0; var303 < var302; var303++) {
                for (int var304 = 0; var304 < 4; var304++) {
                    Statics.field4561[var303][var304] = buf.g4s();
                }
            }
            int var305 = buf.g1();
            Statics.field416 = new Packet(var305);
            Statics.field416.pdata(buf.data, buf.pos, var305);
            buf.pos += var305;
            conn.packetType = null;
            return false;
        } else if (ServerProt.field3097 == conn.packetType) {
            boolean var306 = buf.g1() == 1;
            byte[] var307 = new byte[conn.packetSize - 1];
            buf.gdata(var307, 0, conn.packetSize - 1);
            WorldSwitcher.method2587(var306, var307);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3049 == conn.packetType) {
            int var308 = buf.g1();
            int var309 = var308 >> 5;
            int var310 = var308 & 0x1F;
            if (var310 == 0) {
                field8936[var309] = null;
                conn.packetType = null;
                return true;
            }
            HintArrow var311 = new HintArrow();
            var311.field776 = var310;
            var311.field773 = buf.g1();
            if (var311.field773 >= 0 && var311.field773 < Statics.field6361.length) {
                if (var311.field776 == 1 || var311.field776 == 10) {
                    var311.field772 = buf.g2();
                    var311.field774 = buf.g2();
                    buf.pos += 4;
                } else if (var311.field776 >= 2 && var311.field776 <= 6) {
                    if (var311.field776 == 2) {
                        var311.field778 = 256;
                        var311.field777 = 256;
                    }
                    if (var311.field776 == 3) {
                        var311.field778 = 0;
                        var311.field777 = 256;
                    }
                    if (var311.field776 == 4) {
                        var311.field778 = 512;
                        var311.field777 = 256;
                    }
                    if (var311.field776 == 5) {
                        var311.field778 = 256;
                        var311.field777 = 0;
                    }
                    if (var311.field776 == 6) {
                        var311.field778 = 256;
                        var311.field777 = 512;
                    }
                    var311.field776 = 2;
                    var311.field775 = buf.g1();
                    CoordGrid var312 = world.getBase();
                    var311.field778 += buf.g2() - var312.x << 9;
                    var311.field777 += buf.g2() - var312.z << 9;
                    var311.field781 = buf.g1() << 2;
                    var311.field780 = buf.g2();
                }
                var311.field779 = buf.g4s();
                field8936[var309] = var311;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3023 == conn.packetType) {
            if (topLevelInterface != -1) {
                method6032(topLevelInterface, 0);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_SETTEXT == conn.packetType) {
            String var313 = buf.gjstr();
            int var314 = buf.g4s_alt3();
            incrementVerifyId();
            DelayedStateChange.method16188(var314, var313);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3050 == conn.packetType) {
            field9177 = buf.g1_alt2();
            field9178 = buf.g1_alt2();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2995 == conn.packetType) {
            int var315 = buf.g2();
            long var316 = buf.g8();
            if (Statics.field5051 == null) {
                Statics.field5051 = new Object[Statics.field7390.field7345];
            }
            Statics.field5051[var315] = Long.valueOf(var316);
            field9145[++field9146 - 1 & 0x1F] = var315;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3098 == conn.packetType) {
            field8917 = interfaceUpdateNum;
            boolean var318 = buf.g1() == 1;
            if (conn.packetSize != 1) {
                if (var318) {
                    Statics.field8458 = new ClanChannel(buf);
                } else {
                    Statics.field1515 = new ClanChannel(buf);
                }
                conn.packetType = null;
                return true;
            }
            if (var318) {
                Statics.field8458 = null;
            } else {
                Statics.field1515 = null;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3071 == conn.packetType) {
            handleZoneProt(ZoneProt.field2808);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3036 == conn.packetType) {
            String var319 = buf.gjstr();
            boolean var320 = buf.g1() == 1;
            String var321;
            if (var320) {
                var321 = buf.gjstr();
            } else {
                var321 = var319;
            }
            int var322 = buf.g2();
            byte var323 = buf.g1b();
            boolean var324 = false;
            if (var323 == -128) {
                var324 = true;
            }
            if (var324) {
                if (Statics.field7045 == 0) {
                    conn.packetType = null;
                    return true;
                }
                boolean var325 = false;
                int var326;
                for (var326 = 0; var326 < Statics.field7045 && (!Statics.field5180[var326].field786.equals(var321) || Statics.field5180[var326].field789 != var322); var326++) {
                }
                if (var326 < Statics.field7045) {
                    while (var326 < Statics.field7045 - 1) {
                        Statics.field5180[var326] = Statics.field5180[var326 + 1];
                        var326++;
                    }
                    Statics.field7045--;
                    Statics.field5180[Statics.field7045] = null;
                }
            } else {
                String var327 = buf.gjstr();
                FriendChatUser var328 = new FriendChatUser();
                var328.field791 = var319;
                var328.field786 = var321;
                var328.field787 = NamespaceUtil.method4744(var328.field786);
                var328.field789 = var322;
                var328.field788 = var323;
                var328.field790 = var327;
                int var329;
                for (var329 = Statics.field7045 - 1; var329 >= 0; var329--) {
                    int var330 = Statics.field5180[var329].field787.compareTo(var328.field787);
                    if (var330 == 0) {
                        Statics.field5180[var329].field789 = var322;
                        Statics.field5180[var329].field788 = var323;
                        Statics.field5180[var329].field790 = var327;
                        if (var321.equals(Statics.localPlayerEntity.nameUnfiltered)) {
                            Statics.field7353 = var323;
                        }
                        field9161 = interfaceUpdateNum;
                        conn.packetType = null;
                        return true;
                    }
                    if (var330 < 0) {
                        break;
                    }
                }
                if (Statics.field7045 >= Statics.field5180.length) {
                    conn.packetType = null;
                    return true;
                }
                for (int var331 = Statics.field7045 - 1; var331 > var329; var331--) {
                    Statics.field5180[var331 + 1] = Statics.field5180[var331];
                }
                if (Statics.field7045 == 0) {
                    Statics.field5180 = new FriendChatUser[100];
                }
                Statics.field5180[var329 + 1] = var328;
                Statics.field7045++;
                if (var321.equals(Statics.localPlayerEntity.nameUnfiltered)) {
                    Statics.field7353 = var323;
                }
            }
            field9161 = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3113 == conn.packetType) {
            AudioRenderer.method6849();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3077 == conn.packetType) {
            int var332 = buf.g2();
            if (var332 == 65535) {
                var332 = -1;
            }
            int var333 = buf.g1();
            int var334 = buf.g2();
            int var335 = buf.g1();
            AudioRenderer.method1717(var332, var333, var334, var335, true, 256);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3002 == conn.packetType) {
            Statics.field5051 = new Object[Statics.field7390.field7345];
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3135 == conn.packetType) {
            int var336 = buf.g4s_alt2();
            int var337 = buf.g1_alt3();
            int var338 = buf.g4s_alt3();
            int var339 = buf.g2_alt2();
            int var340 = buf.g2_alt2();
            int var341 = buf.g4s_alt3();
            int var342 = buf.g4s_alt2();
            int var343 = buf.g4s();
            incrementVerifyId();
            method3589(var343, new SubInterfaceActivePlayer(var339, var337, var340), new int[]{var342, var341, var338, var336}, false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3053 == conn.packetType) {
            int var344 = buf.g4s_alt1();
            int var345 = buf.g4s_alt2();
            incrementVerifyId();
            DelayedStateChange.method2995(var344, 1, var345, -1);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2988 == conn.packetType) {
            int var346 = buf.g2_alt1();
            int var347 = buf.g2();
            int var348 = buf.g4s();
            incrementVerifyId();
            DelayedStateChange.method7186(var348, (var346 << 16) + var347);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3063 == conn.packetType) {
            int var349 = buf.g2_alt2();
            int var350 = buf.g2_alt3();
            incrementVerifyId();
            method8486(var349, var350, 0);
            conn.packetType = null;
            return true;
        } else if (ServerProt.PLAYER_INFO == conn.packetType) {
            ReceivePlayerPositions.method1805(buf, conn.packetSize);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3084 == conn.packetType) {
            int var351 = buf.g1();
            int var352 = buf.g1_alt3();
            int var353 = buf.g1_alt2();
            int var354 = buf.g1();
            int var355 = buf.g2_alt2() << 2;
            incrementVerifyId();
            cameraLookAt(var354, var351, var355, var353, var352);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3066 == conn.packetType) {
            field8917 = interfaceUpdateNum;
            boolean var356 = buf.g1() == 1;
            ClanChannelDelta var357 = new ClanChannelDelta(buf);
            ClanChannel var358;
            if (var356) {
                var358 = Statics.field8458;
            } else {
                var358 = Statics.field1515;
            }
            var357.method4115(var358);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2984 == conn.packetType) {
            incrementVerifyId();
            cameraSmoothReset();
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3011 == conn.packetType) {
            int var359 = buf.g2();
            String var360 = buf.gjstr();
            if (Statics.field5051 == null) {
                Statics.field5051 = new Object[Statics.field7390.field7345];
            }
            Statics.field5051[var359] = var360;
            field9145[++field9146 - 1 & 0x1F] = var359;
            conn.packetType = null;
            return true;
        } else if (ServerProt.VARBIT_LARGE == conn.packetType) {
            int var361 = buf.g4s_alt1();
            int var362 = buf.g2();
            Statics.field2669.method1663(var362, var361);
            conn.packetType = null;
            return true;
        } else if (ServerProt.VARP_LARGE == conn.packetType) {
            int var363 = buf.g4s_alt1();
            int var364 = buf.g2_alt2();
            Statics.field2669.method1643(var364, var363);
            conn.packetType = null;
            return true;
        } else if (ServerProt.LOGOUT == conn.packetType) {
            logout(false);
            conn.packetType = null;
            return false;
        } else if (ServerProt.NPC_INFO == conn.packetType) {
            // method3676(false);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3013 == conn.packetType) {
            int var365 = buf.g4s();
            int var366 = buf.g2_alt2();
            incrementVerifyId();
            DelayedStateChange.method4033(var365, var366);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3130 == conn.packetType) {
            int var367 = buf.g2_alt3();
            int var368 = buf.g2();
            int var369 = buf.g1_alt2() * 4;
            int var370 = buf.g2_alt2();
            int var371 = buf.g2_alt1();
            int var372 = buf.g2_alt3();
            byte var373 = buf.g1b_alt2();
            int var374 = buf.g2_alt3();
            byte var375 = buf.g1b_alt2();
            int var376 = buf.g2s();
            int var377 = buf.g1();
            int var378 = buf.g1_alt3();
            if (var378 == 255) {
                var378 = -1;
            }
            int var379 = buf.g2s_alt1();
            int var380 = buf.g1_alt1();
            boolean var381 = (var377 & 0x1) != 0;
            boolean var382 = (var377 & 0x2) != 0;
            int var383 = var382 ? var377 >> 2 : -1;
            int var384;
            if (var382) {
                var384 = (byte) var380;
            } else {
                var384 = var380 * 4;
            }
            CoordGrid var385 = world.getBase();
            int var386 = var370 - var385.x * 2;
            int var387 = var372 - var385.z * 2;
            int var388 = var375 + var386;
            int var389 = var373 + var387;
            if (var386 >= 0 && var387 >= 0 && var386 < world.getSizeX() * 2 && var387 < world.getSizeX() * 2 && var388 >= 0 && var389 >= 0 && var388 < world.getSizeZ() * 2 && var389 < world.getSizeZ() * 2 && var368 != 65535) {
                int var390 = var386 * 256;
                int var391 = var387 * 256;
                int var392 = var388 * 256;
                int var393 = var389 * 256;
                int var394 = var384 << 2;
                int var395 = var369 << 2;
                int var396 = var367 << 2;
                Statics.method11760(var368, var376, var379, var383, var394, var395, var390, var391, var392, var393, var374, var371, var378, var396, var381, 0);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3019 == conn.packetType) {
            boolean var397 = buf.g1() == 1;
            String var398 = buf.gjstr();
            String var399 = var398;
            if (var397) {
                var399 = buf.gjstr();
            }
            long var400 = buf.g8();
            long var402 = (long) buf.g2();
            long var404 = (long) buf.g3();
            int var406 = buf.g1();
            int var407 = buf.g2();
            long var408 = (var402 << 32) + var404;
            boolean var410 = false;
            int var411 = 0;
            while (true) {
                if (var411 >= 100) {
                    if (var406 <= 1 && method11167(var399)) {
                        var410 = true;
                    }
                    break;
                }
                if (field9180[var411] == var408) {
                    var410 = true;
                    break;
                }
                var411++;
            }
            if (!var410) {
                field9180[field9181] = var408;
                field9181 = (field9181 + 1) % 100;
                String var412 = Statics.field3779.method12176(var407).method16749(buf);
                if (var406 == 2) {
                    ChatHistory.method13903(20, 0, TextUtil.method6076(1) + var398, TextUtil.method6076(1) + var399, var398, var412, Base37.method8066(var400), var407);
                } else if (var406 == 1) {
                    ChatHistory.method13903(20, 0, TextUtil.method6076(0) + var398, TextUtil.method6076(0) + var399, var398, var412, Base37.method8066(var400), var407);
                } else {
                    ChatHistory.method13903(20, 0, var398, var399, var398, var412, Base37.method8066(var400), var407);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2983 == conn.packetType) {
            Statics.field2400 = conn.packetSize > 2 ? buf.gjstr() : LocalisedText.field6994.get(Statics.language);
            field9172 = conn.packetSize > 0 ? buf.g2() : -1;
            if (field9172 == 65535) {
                field9172 = -1;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3129 == conn.packetType) {
            boolean var413 = buf.g1() == 1;
            incrementVerifyId();
            Statics.field6371 = var413;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3107 == conn.packetType) {
            handleZoneProt(ZoneProt.field2811);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3035 == conn.packetType) {
            int var414 = buf.g4s();
            int var415 = buf.g4s_alt2();
            int var416 = buf.g1_alt1();
            int var417 = buf.g1_alt2();
            int var418 = buf.g1_alt2();
            int var419 = var414 >> 28;
            int var420 = var414 >> 14 & 0x3FFF;
            int var421 = var414 & 0x3FFF;
            AudioRenderer.method15962(var419, var420, var421, var416, var417, var415, var418);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3102 == conn.packetType) {
            handleZoneProt(ZoneProt.field2805);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3016 == conn.packetType) {
            handleZoneProt(ZoneProt.field2806);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3058 == conn.packetType) {
            int var422 = buf.g4s_alt3();
            boolean var423 = buf.g1() == 1;
            incrementVerifyId();
            DelayedStateChange.method3226(var422, var423);
            conn.packetType = null;
            return true;
        } else if (ServerProt.URL_OPEN == conn.packetType) {
            if (Fullscreen.allowed && Statics.fsFrame != null) {
                setWindowMode(Statics.options.maxScreenSize.getValue(), -1, -1, false);
            }
            byte[] var424 = new byte[conn.packetSize - 1];
            boolean var425 = buf.g1() == 1;
            buf.gIsaacArrayBuffer(var424, 0, conn.packetSize - 1);
            Packet var426 = new Packet(var424);
            String var427 = var426.gjstr();
            if (var425) {
                String var428 = var426.gjstr();
                if (var428.length() == 0) {
                    var428 = var427;
                }
                if (!field8903 || Statics.field2247.startsWith("mac") || !Browser.method1814(var427, 1, JavascriptFunction.field3143.method4757())) {
                    Browser.method3613(var428, true, Statics.options.field9661.getValue() == 5, field8915, field9218);
                }
            } else {
                Browser.method3613(var427, true, Statics.options.field9661.getValue() == 5, field8915, field9218);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3006 == conn.packetType) {
            String var429 = buf.gjstr();
            String var430 = StringHelper.method4597(WordPack.method1205(buf));
            ChatHistory.addMessage(6, 0, var429, var429, var429, var430);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3137 == conn.packetType) {
            Statics.field3161 = buf.g1_alt3();
            Statics.field3907 = buf.g1b_alt2() << 3;
            Statics.field6803 = buf.g1b() << 3;
            while (buf.pos < conn.packetSize) {
                ZoneProt var431 = Statics.method8301()[buf.g1()];
                handleZoneProt(var431);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3048 == conn.packetType) {
            int var432 = buf.g1_alt1();
            incrementVerifyId();
            field9047 = var432;
            conn.packetType = null;
            return true;
        } else if (ServerProt.VARBIT_SMALL == conn.packetType) {
            int var433 = buf.g2_alt3();
            int var434 = buf.g1_alt2();
            Statics.field2669.method1663(var433, var434);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3114 == conn.packetType) {
            boolean var435 = buf.g1() == 1;
            String var436 = buf.gjstr();
            String var437 = var436;
            if (var435) {
                var437 = buf.gjstr();
            }
            int var438 = buf.g1();
            int var439 = buf.g2();
            boolean var440 = false;
            if (var438 <= 1 && method11167(var437)) {
                var440 = true;
            }
            if (!var440) {
                String var441 = Statics.field3779.method12176(var439).method16749(buf);
                if (var438 == 2) {
                    ChatHistory.method13903(25, 0, TextUtil.method6076(1) + var436, TextUtil.method6076(1) + var437, var436, var441, null, var439);
                } else if (var438 == 1) {
                    ChatHistory.method13903(25, 0, TextUtil.method6076(0) + var436, TextUtil.method6076(0) + var437, var436, var441, null, var439);
                } else {
                    ChatHistory.method13903(25, 0, var436, var437, var436, var441, null, var439);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3092 == conn.packetType) {
            int var442 = buf.g2();
            PlayerEntity var443;
            if (currentPlayerUid == var442) {
                var443 = Statics.localPlayerEntity;
            } else {
                var443 = players[var442];
            }
            if (var443 == null) {
                conn.packetType = null;
                return true;
            }
            int var444 = buf.g2();
            int var445 = buf.g1();
            boolean var446 = (var444 & 0x8000) != 0;
            if (var443.nameUnfiltered != null && var443.model != null) {
                boolean var447 = false;
                if (var445 <= 1) {
                    if (!var446 && (field9054 && !field9077 || field9081)) {
                        var447 = true;
                    } else if (method11167(var443.nameUnfiltered)) {
                        var447 = true;
                    }
                }
                if (!var447) {
                    int var448 = -1;
                    String var450;
                    if (var446) {
                        var444 &= 0x7FFF;
                        QuickChatPhrase var449 = QuickChatPhrase.method2602(buf);
                        var448 = var449.field2655;
                        var450 = var449.field2656.method16749(buf);
                    } else {
                        var450 = StringHelper.method4597(WordPack.method1205(buf));
                    }
                    var443.method16127(var450.trim(), var444 >> 8, var444 & 0xFF);
                    int var451;
                    if (var445 == 1 || var445 == 2) {
                        var451 = var446 ? 17 : 1;
                    } else {
                        var451 = var446 ? 17 : 2;
                    }
                    if (var445 == 2) {
                        ChatHistory.method13903(var451, 0, TextUtil.method6076(1) + var443.method16120(true), TextUtil.method6076(1) + var443.method16121(false), var443.name, var450, null, var448);
                    } else if (var445 == 1) {
                        ChatHistory.method13903(var451, 0, TextUtil.method6076(0) + var443.method16120(true), TextUtil.method6076(0) + var443.method16121(false), var443.name, var450, null, var448);
                    } else {
                        ChatHistory.method13903(var451, 0, var443.method16120(true), var443.method16121(false), var443.name, var450, null, var448);
                    }
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3126 == conn.packetType) {
            int var452 = buf.g4s();
            int var453 = buf.g4s();
            ClientMessage var454 = ClientMessage.createMessage(ClientProt.field2940, conn.randomOut);
            var454.buf.p1_alt2(field4121);
            var454.buf.p4_alt3(var452);
            var454.buf.p4(var453);
            conn.queue(var454);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3127 == conn.packetType) {
            int var455 = buf.g4s_alt1();
            int var456 = buf.g2();
            int var457 = buf.g2();
            int var458 = buf.g2_alt2();
            incrementVerifyId();
            DelayedStateChange.method3599(var455, var458, var457, var456);
            conn.packetType = null;
            return true;
        } else if (ServerProt.VARP_SMALL == conn.packetType) {
            byte var459 = buf.g1b_alt3();
            int var460 = buf.g2_alt1();
            Statics.field2669.method1643(var460, var459);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3060 == conn.packetType) {
            int var461 = buf.g4s();
            int var462 = buf.g2_alt3();
            if (var462 == 65535) {
                var462 = -1;
            }
            int var463 = buf.g1_alt1();
            int var464 = buf.g1_alt3();
            int var465 = buf.g2_alt3();
            int var466 = buf.g2_alt2();
            int var467 = var464 & 0x7;
            int var468 = var464 >> 3 & 0xF;
            if (var468 == 15) {
                var468 = -1;
            }
            boolean var469 = (var464 >> 7 & 0x1) == 1;
            if (var461 >> 30 != 0) {
                CoordGrid var470 = world.getBase();
                int var471 = var461 >> 28 & 0x3;
                int var472 = (var461 >> 14 & 0x3FFF) - var470.x;
                int var473 = (var461 & 0x3FFF) - var470.z;
                if (var472 >= 0 && var473 >= 0 && var472 < world.getSizeX() && var473 < world.getSizeZ()) {
                    if (var462 == -1) {
                        SpotAnimationEntityNode var474 = (SpotAnimationEntityNode) field9090.getNode((long) (var472 << 16 | var473));
                        if (var474 != null) {
                            var474.field10296.method17182();
                            var474.remove();
                        }
                    } else {
                        int var475 = var472 * 512 + 256;
                        int var476 = var473 * 512 + 256;
                        int var477 = var471;
                        if (var471 < 3 && world.getSceneLevelTileFlags().isLinkBelow(var472, var473)) {
                            var477 = var471 + 1;
                        }
                        SpotAnimation var478 = new SpotAnimation(world.getScene(), var462, var466, var471, var477, var475, getHeightmapY(var475, var476, var471) - var465, var476, var472, var472, var473, var473, var467, var469, 0);
                        field9090.put(new SpotAnimationEntityNode(var478), (long) (var472 << 16 | var473));
                    }
                }
            } else if (var461 >> 29 != 0) {
                int var479 = var461 & 0xFFFF;
                ObjectNode var480 = (ObjectNode) npcs.getNode((long) var479);
                if (var480 != null) {
                    NpcEntity var481 = (NpcEntity) var480.value;
                    EntitySpotAnim var482 = var481.spotAnims[var463];
                    if (var462 == 65535) {
                        var462 = -1;
                    }
                    boolean var483 = true;
                    int var484 = var482.field1204;
                    if (var462 != -1 && var484 != -1) {
                        if (var462 == var484) {
                            EffectAnimType var485 = Statics.field4213.method11082(var462);
                            if (var485.field5264 && var485.field5252 != -1) {
                                SeqType var486 = Statics.field566.method11144(var485.field5252);
                                int var487 = var486.field6331;
                                if (var487 == 0 || var487 == 2) {
                                    var483 = false;
                                } else if (var487 == 1) {
                                    var483 = true;
                                }
                            }
                        } else {
                            EffectAnimType var488 = Statics.field4213.method11082(var462);
                            EffectAnimType var489 = Statics.field4213.method11082(var484);
                            if (var488.field5252 != -1 && var489.field5252 != -1) {
                                SeqType var490 = Statics.field566.method11144(var488.field5252);
                                SeqType var491 = Statics.field566.method11144(var489.field5252);
                                if (var490.field6325 < var491.field6325) {
                                    var483 = false;
                                }
                            }
                        }
                    }
                    if (var483) {
                        var482.field1204 = var462;
                        var482.field1205 = var465;
                        var482.field1206 = var468;
                        if (var462 == -1) {
                            var482.field1203.method11769(-1);
                        } else {
                            EffectAnimType var492 = Statics.field4213.method11082(var462);
                            int var493 = var492.field5264 ? 0 : 2;
                            if (var469) {
                                var493 = 1;
                            }
                            var482.field1203.method11803(var492.field5252, var466, var493, false);
                        }
                    }
                }
            } else if (var461 >> 28 != 0) {
                int var494 = var461 & 0xFFFF;
                PlayerEntity var495;
                if (currentPlayerUid == var494) {
                    var495 = Statics.localPlayerEntity;
                } else {
                    var495 = players[var494];
                }
                if (var495 != null) {
                    EntitySpotAnim var496 = var495.spotAnims[var463];
                    if (var462 == 65535) {
                        var462 = -1;
                    }
                    boolean var497 = true;
                    int var498 = var496.field1204;
                    if (var462 != -1 && var498 != -1) {
                        if (var462 == var498) {
                            EffectAnimType var499 = Statics.field4213.method11082(var462);
                            if (var499.field5264 && var499.field5252 != -1) {
                                SeqType var500 = Statics.field566.method11144(var499.field5252);
                                int var501 = var500.field6331;
                                if (var501 == 0 || var501 == 2) {
                                    var497 = false;
                                } else if (var501 == 1) {
                                    var497 = true;
                                }
                            }
                        } else {
                            EffectAnimType var502 = Statics.field4213.method11082(var462);
                            EffectAnimType var503 = Statics.field4213.method11082(var498);
                            if (var502.field5252 != -1 && var503.field5252 != -1) {
                                SeqType var504 = Statics.field566.method11144(var502.field5252);
                                SeqType var505 = Statics.field566.method11144(var503.field5252);
                                if (var504.field6325 < var505.field6325) {
                                    var497 = false;
                                }
                            }
                        }
                    }
                    if (var497) {
                        var496.field1204 = var462;
                        var496.field1205 = var465;
                        var496.field1206 = var468;
                        var496.field1207 = var467;
                        if (var462 == -1) {
                            var496.field1203.method11769(-1);
                        } else {
                            EffectAnimType var506 = Statics.field4213.method11082(var462);
                            int var507 = var506.field5264 ? 0 : 2;
                            if (var469) {
                                var507 = 1;
                            }
                            var496.field1203.method11803(var506.field5252, var466, var507, false);
                        }
                    }
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3118 == conn.packetType) {
            boolean var508 = buf.g1() == 1;
            String var509 = buf.gjstr();
            String var510 = var509;
            if (var508) {
                var510 = buf.gjstr();
            }
            long var511 = (long) buf.g2();
            long var513 = (long) buf.g3();
            int var515 = buf.g1();
            int var516 = buf.g2();
            long var517 = (var511 << 32) + var513;
            boolean var519 = false;
            int var520 = 0;
            while (true) {
                if (var520 >= 100) {
                    if (var515 <= 1 && method11167(var510)) {
                        var519 = true;
                    }
                    break;
                }
                if (field9180[var520] == var517) {
                    var519 = true;
                    break;
                }
                var520++;
            }
            if (!var519) {
                field9180[field9181] = var517;
                field9181 = (field9181 + 1) % 100;
                String var521 = Statics.field3779.method12176(var516).method16749(buf);
                if (var515 == 2) {
                    ChatHistory.method13903(18, 0, TextUtil.method6076(1) + var509, TextUtil.method6076(1) + var510, var509, var521, null, var516);
                } else if (var515 == 1) {
                    ChatHistory.method13903(18, 0, TextUtil.method6076(0) + var509, TextUtil.method6076(0) + var510, var509, var521, null, var516);
                } else {
                    ChatHistory.method13903(18, 0, var509, var510, var509, var521, null, var516);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3043 == conn.packetType) {
            byte[] var522 = new byte[conn.packetSize];
            buf.gIsaacArrayBuffer(var522, 0, conn.packetSize);
            String var523 = Cp1252.method6881(var522, 0, conn.packetSize);
            if (field8903) {
                try {
                    JavascriptFunction.field3151.method4758(new Object[]{var523});
                } catch (Throwable var600) {
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3024 == conn.packetType) {
            int var525 = buf.g4s_alt1();
            incrementVerifyId();
            DelayedStateChange.method2995(var525, 3, currentPlayerUid, 0);
            conn.packetType = null;
            return true;
        } else if (ServerProt.CAM_SHAKE == conn.packetType) {
            int var526 = buf.g1_alt2();
            int var527 = buf.g1_alt2();
            int var528 = buf.g1_alt3();
            int var529 = buf.g2();
            int var530 = buf.g1_alt1();
            incrementVerifyId();
            cameraModifierEnabled[var526] = true;
            field9189[var526] = var528;
            field9190[var526] = var530;
            field9191[var526] = var527;
            field9110[var526] = var529;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3072 == conn.packetType) {
            int npcId = buf.g4s_alt3();
            int combinedId = buf.g4s();
            incrementVerifyId();
            DelayedStateChange.method2995(combinedId, 2, npcId, -1);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3088 == conn.packetType) {
            boolean var533 = buf.g1() == 1;
            String var534 = buf.gjstr();
            String var535 = var534;
            if (var533) {
                var535 = buf.gjstr();
            }
            long var536 = (long) buf.g2();
            long var538 = (long) buf.g3();
            int var540 = buf.g1();
            long var541 = (var536 << 32) + var538;
            boolean var543 = false;
            int var544 = 0;
            while (true) {
                if (var544 >= 100) {
                    if (var540 <= 1) {
                        if (field9054 && !field9077 || field9081) {
                            var543 = true;
                        } else if (method11167(var535)) {
                            var543 = true;
                        }
                    }
                    break;
                }
                if (field9180[var544] == var541) {
                    var543 = true;
                    break;
                }
                var544++;
            }
            if (!var543) {
                field9180[field9181] = var541;
                field9181 = (field9181 + 1) % 100;
                String var545 = StringHelper.method4597(WordPack.method1205(buf));
                if (var540 == 2) {
                    ChatHistory.method13903(7, 0, TextUtil.method6076(1) + var534, TextUtil.method6076(1) + var535, var534, var545, null, -1);
                } else if (var540 == 1) {
                    ChatHistory.method13903(7, 0, TextUtil.method6076(0) + var534, TextUtil.method6076(0) + var535, var534, var545, null, -1);
                } else {
                    ChatHistory.method13903(3, 0, var534, var535, var534, var545, null, -1);
                }
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.NPC_INFO_LARGE == conn.packetType) {
            method3676(true);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2976 == conn.packetType) {
            field9149 = interfaceUpdateNum;
            boolean var546 = buf.g1() == 1;
            if (conn.packetSize != 1) {
                if (var546) {
                    Statics.field2972 = new ClanSettings(buf);
                } else {
                    Statics.field913 = new ClanSettings(buf);
                }
                conn.packetType = null;
                return true;
            }
            if (var546) {
                Statics.field2972 = null;
            } else {
                Statics.field913 = null;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2993 == conn.packetType) {
            field9121 = 1;
            field9148 = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.UPDATE_REBOOT_TIMER == conn.packetType) {
            if (isStateLobby(state)) {
                systemUpdateTimer = (int) ((float) buf.g2() * 2.5F);
            } else {
                systemUpdateTimer = buf.g2() * 30;
            }
            miscTransmitNum = interfaceUpdateNum;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2991 == conn.packetType) {
            int var547 = buf.g2s_alt1();
            int var548 = buf.g4s_alt3();
            int var549 = buf.g2s_alt3();
            incrementVerifyId();
            DelayedStateChange.method6312(var548, var549, var547);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3068 == conn.packetType) {
            int var550 = buf.g1();
            int var551 = buf.g2();
            if (var551 == 65535) {
                var551 = -1;
            }
            int var552 = buf.g1_alt3();
            AudioRenderer.method11057(var551, var550, var552);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3078 == conn.packetType) {
            int var553 = buf.g2_alt1();
            int var554 = buf.g4s_alt1();
            int var555 = buf.g1_alt1();
            int var556 = buf.g2_alt2();
            incrementVerifyId();
            DelayedStateChange.method2497(var554, var555, var556, var553);
            conn.packetType = null;
            return true;
        } else if (ServerProt.UPDATE_STAT == conn.packetType) {
            int var557 = buf.g1_alt1();
            int var558 = buf.g1();
            int var559 = buf.g4s_alt3();
            field9094[var557] = var559;
            field9092[var557] = var558;
            field9093[var557] = 1;
            int var560 = SkillDefaults.field5134[var557] - 1;
            for (int var561 = 0; var561 < var560; var561++) {
                if (var559 >= SkillDefaults.field5135[var561]) {
                    field9093[var557] = var561 + 2;
                }
            }
            field9139[++field9140 - 1 & 0x1F] = var557;
            conn.packetType = null;
            return true;
        } else if (ServerProt.CLIENT_SETVARC_LARGE == conn.packetType) {
            int var562 = buf.g4s_alt1();
            int var563 = buf.g2_alt3();
            incrementVerifyId();
            DelayedStateChange.method3667(var563, var562);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2994 == conn.packetType) {
            Statics.field2669.method1647();
            field9183 += 32;
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3045 == conn.packetType) {
            int var564 = buf.g1_alt3();
            int var565 = buf.g1_alt3();
            int var566 = buf.g1();
            int var567 = buf.g1_alt3();
            int var568 = buf.g2_alt3() << 2;
            incrementVerifyId();
            cameraMoveTo(var567, var566, var568, var564, var565, true);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3018 == conn.packetType) {
            handleZoneProt(ZoneProt.field2814);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3059 == conn.packetType) {
            int var569 = buf.g4s_alt3();
            int var570 = buf.g2_alt3();
            int var571 = buf.g1();
            int var572 = buf.g2();
            incrementVerifyId();
            DelayedStateChange.method15139(var569, var571, var572, var570);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3120 == conn.packetType) {
            int var573 = buf.g2();
            DeveloperConsole.method2848(var573);
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3086 == conn.packetType) {
            field9176 = buf.g1_alt3() == 1;
            conn.packetType = null;
            return true;
        } else if (ServerProt.IF_OPENTOP == conn.packetType) {
            int key1 = buf.g4s_alt1();
            int id = buf.g2_alt3();
            int key2 = buf.g4s_alt2();
            int type = buf.g1_alt3();
            int key4 = buf.g4s();
            int key3 = buf.g4s();
            incrementVerifyId();
            if (type == 2) {
                closeMAp();
            }
            int[] var580 = new int[]{key1, key2, key3, key4};
            topLevelInterface = id;
            method6068(id, var580);
            method1969(false);
            ScriptRunner.method11505(topLevelInterface, var580);
            for (int var581 = 0; var581 < 100; var581++) {
                field9204[var581] = true;
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field3099 == conn.packetType) {
            int var582 = buf.g4s_alt3();
            int var583 = buf.g4s_alt2();
            incrementVerifyId();
            SubInterface var584 = (SubInterface) field9075.getNode((long) var582);
            SubInterface var585 = (SubInterface) field9075.getNode((long) var583);
            if (var585 != null) {
                closeSubInterface(var585, var584 == null || var584.field9679 != var585.field9679, false);
            }
            if (var584 != null) {
                var584.remove();
                field9075.put(var584, (long) var583);
            }
            Component var586 = Component.method11381(var582);
            if (var586 != null) {
                requestRedrawComponent(var586);
            }
            Component var587 = Component.method11381(var583);
            if (var587 != null) {
                requestRedrawComponent(var587);
                method12722(Statics.field1756[var587.id >>> 16], var587, true);
            }
            if (topLevelInterface != -1) {
                method6032(topLevelInterface, 1);
            }
            conn.packetType = null;
            return true;
        } else if (ServerProt.field2998 == conn.packetType) {
            field9161 = interfaceUpdateNum;
            if (conn.packetSize == 0) {
                field9182 = null;
                field9220 = null;
                Statics.field7045 = 0;
                Statics.field5180 = null;
                conn.packetType = null;
                return true;
            }
            field9220 = buf.gjstr();
            boolean var588 = buf.g1() == 1;
            if (var588) {
                buf.gjstr();
            }
            long var589 = buf.g8();
            field9182 = Statics.method5925(var589);
            Statics.field4311 = buf.g1b();
            int var591 = buf.g1();
            if (var591 == 255) {
                conn.packetType = null;
                return true;
            }
            Statics.field7045 = var591;
            FriendChatUser[] var592 = new FriendChatUser[100];
            for (int var593 = 0; var593 < Statics.field7045; var593++) {
                var592[var593] = new FriendChatUser();
                var592[var593].field791 = buf.gjstr();
                boolean var594 = buf.g1() == 1;
                if (var594) {
                    var592[var593].field786 = buf.gjstr();
                } else {
                    var592[var593].field786 = var592[var593].field791;
                }
                var592[var593].field787 = NamespaceUtil.method4744(var592[var593].field786);
                var592[var593].field789 = buf.g2();
                var592[var593].field788 = buf.g1b();
                var592[var593].field790 = buf.gjstr();
                if (var592[var593].field786.equals(Statics.localPlayerEntity.nameUnfiltered)) {
                    Statics.field7353 = var592[var593].field788;
                }
            }
            boolean var595 = false;
            int var596 = Statics.field7045;
            while (var596 > 0) {
                boolean var597 = true;
                var596--;
                for (int var598 = 0; var598 < var596; var598++) {
                    if (var592[var598].field787.compareTo(var592[var598 + 1].field787) > 0) {
                        FriendChatUser var599 = var592[var598];
                        var592[var598] = var592[var598 + 1];
                        var592[var598 + 1] = var599;
                        var597 = false;
                    }
                }
                if (var597) {
                    break;
                }
            }
            Statics.field5180 = var592;
            conn.packetType = null;
            return true;
        } else if (ServerProt.CUSTOM_OLDITEMSLOOK == conn.packetType) {
            buf.g1();
            conn.packetType = null;
            return true;
        } else {
            JagException.method16252((conn.packetType == null ? -1 : conn.packetType.id) + TextUtil.field488 + (conn.lastPacketType1 == null ? -1 : conn.lastPacketType1.id) + TextUtil.field488 + (conn.lastPacketType2 == null ? -1 : conn.lastPacketType2.id) + " " + conn.packetSize, new RuntimeException());
            logout(false);
            return true;
        }
    }

    @ObfuscatedName("zo.jy(Lit;B)V")
    public static final void handleZoneProt(ZoneProt arg0) {
        PacketBit buf = gameConnection.in;
        if (ZoneProt.field2806 == arg0) {
            int var2 = buf.g1();
            CoordGrid var3 = world.getBase();
            int var4 = (var2 & 0x7) + Statics.field3907;
            int var5 = var3.z + var4;
            int var6 = (var2 >> 4 & 0x7) + Statics.field6803;
            int var7 = var3.x + var6;
            int var8 = buf.g2();
            int var9 = buf.g2();
            int var10 = buf.g2();
            if (field9088 != null) {
                ObjStackList var11 = (ObjStackList) field9088.getNode((long) (Statics.field3161 << 28 | var5 << 14 | var7));
                if (var11 != null) {
                    for (Obj var12 = (Obj) var11.field9313.last(); var12 != null; var12 = (Obj) var11.field9313.prev()) {
                        if ((var8 & 0x7FFF) == var12.field9311 && var12.field9310 == var9) {
                            var12.remove();
                            var12.field9310 = var10;
                            method11367(Statics.field3161, var7, var5, var12);
                            break;
                        }
                    }
                    if (var6 >= 0 && var4 >= 0 && var6 < world.getSizeX() && var4 < world.getSizeZ()) {
                        sortObjStacks(Statics.field3161, var6, var4);
                    }
                }
            }
        } else if (ZoneProt.field2809 == arg0) {
            int var13 = buf.g2_alt1();
            int var14 = buf.g1_alt3();
            CoordGrid var15 = world.getBase();
            int var16 = (var14 & 0x7) + Statics.field3907;
            int var17 = var15.z + var16;
            int var18 = (var14 >> 4 & 0x7) + Statics.field6803;
            int var19 = var15.x + var18;
            ObjStackList var20 = (ObjStackList) field9088.getNode((long) (Statics.field3161 << 28 | var17 << 14 | var19));
            if (var20 != null) {
                for (Obj var21 = (Obj) var20.field9313.last(); var21 != null; var21 = (Obj) var20.field9313.prev()) {
                    if ((var13 & 0x7FFF) == var21.field9311) {
                        var21.remove();
                        break;
                    }
                }
                if (var20.field9313.method11585()) {
                    var20.remove();
                }
                if (var18 >= 0 && var16 >= 0 && var18 < world.getSizeX() && var16 < world.getSizeZ()) {
                    sortObjStacks(Statics.field3161, var18, var16);
                }
            }
        } else if (ZoneProt.field2811 == arg0) {
            int var22 = buf.g1_alt3();
            int var23 = var22 >> 2;
            int var24 = field8986[var23];
            int var25 = buf.g1_alt3();
            int var26 = buf.g4s_alt3();
            LocType var27 = world.getLocTypeList().get(var26);
            int var28 = buf.g1_alt3();
            int var29 = (var28 >> 4 & 0x7) + Statics.field6803;
            int var30 = (var28 & 0x7) + Statics.field3907;
            if (LocShape.field6588.field6590 == var23) {
                var23 = LocShape.field6572.field6590;
            }
            int var31 = 0;
            if (var27.field6475 != null) {
                int var32 = -1;
                for (int var33 = 0; var33 < var27.field6475.length; var33++) {
                    if (var27.field6475[var33] == var23) {
                        var32 = var33;
                        break;
                    }
                }
                var31 = var27.field6471[var32].length;
            }
            int var34 = 0;
            if (var27.field6479 != null) {
                var34 = var27.field6479.length;
            }
            int var35 = 0;
            if (var27.field6482 != null) {
                var35 = var27.field6482.length;
            }
            if ((var25 & 0x1) == 1) {
                ChangeLocationRequest.method14721(Statics.field3161, var29, var30, var24, var26, var23, null);
            } else {
                int[] var36 = null;
                if ((var25 & 0x2) == 2) {
                    var36 = new int[var31];
                    for (int var37 = 0; var37 < var31; var37++) {
                        var36[var37] = buf.g4s();
                    }
                }
                short[] var38 = null;
                if ((var25 & 0x4) == 4) {
                    var38 = new short[var34];
                    for (int var39 = 0; var39 < var34; var39++) {
                        var38[var39] = (short) buf.g2();
                    }
                }
                short[] var40 = null;
                if ((var25 & 0x8) == 8) {
                    var40 = new short[var35];
                    for (int var41 = 0; var41 < var35; var41++) {
                        var40[var41] = (short) buf.g2();
                    }
                }
                ChangeLocationRequest.method14721(Statics.field3161, var29, var30, var24, var26, var23, new LocTypeCustomisation(ChangeLocationRequest.field9279, var36, var38, var40));
                ChangeLocationRequest.field9279++;
            }
        } else if (ZoneProt.field2813 == arg0) {
            buf.g1();
            int var42 = buf.g1();
            int var43 = (var42 >> 4 & 0x7) + Statics.field6803;
            int var44 = (var42 & 0x7) + Statics.field3907;
            int var45 = buf.g2();
            int var46 = buf.g1();
            int var47 = buf.g3();
            String var48 = buf.gjstr();
            if (world.method6132() != RebuildType.field3839) {
                method6854(Statics.field3161, var43, var44, var46, var45, var47, var48);
            }
        } else if (ZoneProt.field2814 == arg0) {
            int var49 = buf.g4s_alt3();
            int var50 = buf.g1_alt3();
            int var51 = (var50 >> 4 & 0x7) + Statics.field6803;
            int var52 = (var50 & 0x7) + Statics.field3907;
            int var53 = buf.g1_alt1();
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = field8986[var54];
            if (world.method6132().method6251() || var51 >= 0 && var52 >= 0 && var51 < world.getSizeX() && var52 < world.getSizeZ()) {
                ChangeLocationRequest.method13876(Statics.field3161, var51, var52, var56, var49, var54, var55);
            }
        } else if (ZoneProt.field2812 == arg0) {
            int var57 = buf.g4s();
            int var58 = buf.g1();
            world.getLocTypeList().get(var57).method11411(var58);
        } else if (ZoneProt.field2800 == arg0) {
            int var59 = buf.g1();
            int var60 = (var59 >> 4 & 0x7) + Statics.field6803;
            int var61 = (var59 & 0x7) + Statics.field3907;
            int var62 = buf.g2();
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = buf.g2();
            int var64 = buf.g2();
            int var65 = buf.g1();
            int var66 = buf.g2s();
            if (world.method6132() != RebuildType.field3839 && (var60 >= 0 && var61 >= 0 && var60 < world.getSizeX() && var61 < world.getSizeZ())) {
                if (var62 == -1) {
                    SpotAnimationEntityNode var67 = (SpotAnimationEntityNode) field9090.getNode((long) (var60 << 16 | var61));
                    if (var67 != null) {
                        var67.field10296.method17182();
                        var67.remove();
                    }
                } else {
                    int var68 = var60 * 512 + 256;
                    int var69 = var61 * 512 + 256;
                    int var70 = Statics.field3161;
                    if (var70 < 3 && world.getSceneLevelTileFlags().isLinkBelow(var60, var61)) {
                        var70++;
                    }
                    SpotAnimation var71 = new SpotAnimation(world.getScene(), var62, var64, Statics.field3161, var70, var68, getHeightmapY(var68, var69, Statics.field3161) - var63, var69, var60, var60, var61, var61, var65, false, var66);
                    field9090.put(new SpotAnimationEntityNode(var71), (long) (var60 << 16 | var61));
                }
            }
        } else if (ZoneProt.field2810 == arg0) {
            int var72 = buf.g2_alt1();
            int var73 = buf.g2_alt1();
            int var74 = buf.g1_alt2();
            CoordGrid var75 = world.getBase();
            int var76 = (var74 & 0x7) + Statics.field3907;
            int var77 = var75.z + var76;
            int var78 = (var74 >> 4 & 0x7) + Statics.field6803;
            int var79 = var75.x + var78;
            boolean var80 = var78 >= 0 && var76 >= 0 && var78 < world.getSizeX() && var76 < world.getSizeZ();
            if (var80 || world.method6132().method6251()) {
                method11367(Statics.field3161, var79, var77, new Obj(var73, var72));
                if (var80) {
                    sortObjStacks(Statics.field3161, var78, var76);
                }
            }
        } else if (ZoneProt.field2805 == arg0) {
            int var81 = buf.g1();
            boolean var82 = (var81 & 0x80) != 0;
            int var83 = (var81 >> 3 & 0x7) + Statics.field6803;
            int var84 = (var81 & 0x7) + Statics.field3907;
            int var85 = var83 + buf.g1b();
            int var86 = var84 + buf.g1b();
            int var87 = buf.g2s();
            int var88 = buf.g2();
            int var89 = buf.g1() * 4;
            int var90 = buf.g1() * 4;
            int var91 = buf.g2();
            int var92 = buf.g2();
            int var93 = buf.g1();
            int var94 = buf.g2();
            int var95 = buf.g2s();
            if (var93 == 255) {
                var93 = -1;
            }
            if (world.method6132() != RebuildType.field3839 && (var83 >= 0 && var84 >= 0 && var83 < world.getSizeX() && var84 < world.getSizeZ() && var85 >= 0 && var86 >= 0 && var85 < world.getSizeX() && var86 < world.getSizeZ() && var88 != 65535)) {
                int var96 = var83 * 512 + 256;
                int var97 = var84 * 512 + 256;
                int var98 = var85 * 512 + 256;
                int var99 = var86 * 512 + 256;
                int var100 = var89 << 2;
                int var101 = var90 << 2;
                int var102 = var94 << 2;
                ProjectileAnimation var103 = new ProjectileAnimation(world.getScene(), var88, Statics.field3161, Statics.field3161, var96, var97, var100, loopCycle + var91, loopCycle + var92, var93, var102, 0, var87, var101, var82, -1, var95);
                var103.method17162(var98, var99, getHeightmapY(var98, var99, Statics.field3161) - var101, loopCycle + var91);
                field9007.addFirst(new ProjectileEntityNode(var103));
            }
        } else if (ZoneProt.field2807 == arg0) {
            int var104 = buf.g1();
            int var105 = (var104 >> 4 & 0xF) + Statics.field6803 * 2;
            int var106 = (var104 & 0xF) + Statics.field3907 * 2;
            int var107 = buf.g1();
            boolean var108 = (var107 & 0x1) != 0;
            boolean var109 = (var107 & 0x2) != 0;
            int var110 = var109 ? var107 >> 2 : -1;
            int var111 = var105 + buf.g1b();
            int var112 = var106 + buf.g1b();
            int var113 = buf.g2s();
            int var114 = buf.g2s();
            int var115 = buf.g2();
            int var116 = buf.g1();
            int var117;
            if (var109) {
                var117 = (byte) var116;
            } else {
                var117 = var116 * 4;
            }
            int var118 = buf.g1() * 4;
            int var119 = buf.g2();
            int var120 = buf.g2();
            int var121 = buf.g1();
            int var122 = buf.g2();
            if (var121 == 255) {
                var121 = -1;
            }
            int var123 = buf.g2s();
            if (world.method6132() != RebuildType.field3839 && (var105 >= 0 && var106 >= 0 && var105 < world.getSizeX() * 2 && var106 < world.getSizeX() * 2 && var111 >= 0 && var112 >= 0 && var111 < world.getSizeZ() * 2 && var112 < world.getSizeZ() * 2 && var115 != 65535)) {
                int var124 = var105 * 256;
                int var125 = var106 * 256;
                int var126 = var111 * 256;
                int var127 = var112 * 256;
                int var128 = var117 << 2;
                int var129 = var118 << 2;
                int var130 = var122 << 2;
                Statics.method11760(var115, var113, var114, var110, var128, var129, var124, var125, var126, var127, var119, var120, var121, var130, var108, var123);
            }
        } else if (ZoneProt.field2802 == arg0) {
            int var131 = buf.g1();
            int var132 = (var131 >> 4 & 0x7) + Statics.field6803;
            int var133 = (var131 & 0x7) + Statics.field3907;
            int var134 = buf.g2();
            if (var134 == 65535) {
                var134 = -1;
            }
            int var135 = buf.g1();
            int var136 = var135 >> 4 & 0xF;
            int var137 = var135 & 0x7;
            int var138 = buf.g1();
            int var139 = buf.g1();
            int var140 = buf.g2();
            boolean var141 = buf.g1() == 1;
            if (world.method6132() != RebuildType.field3839 && (var132 >= 0 && var133 >= 0 && var132 < world.getSizeX() && var133 < world.getSizeZ())) {
                int var142 = var136 + 1;
                if (Statics.localPlayerEntity.routeWaypointX[0] >= var132 - var142 && Statics.localPlayerEntity.routeWaypointX[0] <= var132 + var142 && Statics.localPlayerEntity.routeWaypointZ[0] >= var133 - var142 && Statics.localPlayerEntity.routeWaypointZ[0] <= var133 + var142) {
                    AudioRenderer.method12739(var134, var137, var138, var139, (var133 << 8) + (Statics.field3161 << 24) + (var132 << 16) + var136, var141, var140);
                }
            }
        } else if (ZoneProt.field2801 == arg0) {
            int var143 = buf.g1_alt2();
            int var144 = (var143 >> 4 & 0x7) + Statics.field6803;
            int var145 = (var143 & 0x7) + Statics.field3907;
            int var146 = buf.g1_alt1();
            int var147 = var146 >> 2;
            int var148 = var146 & 0x3;
            int var149 = field8986[var147];
            if (world.method6132().method6251() || var144 >= 0 && var145 >= 0 && var144 < world.getSizeX() && var145 < world.getSizeZ()) {
                ChangeLocationRequest.method13876(Statics.field3161, var144, var145, var149, -1, var147, var148);
            }
        } else if (ZoneProt.field2808 == arg0) {
            int var150 = buf.g1();
            int var151 = (var150 >> 4 & 0x7) + Statics.field6803;
            int var152 = (var150 & 0x7) + Statics.field3907;
            int var153 = buf.g2();
            if (var153 == 65535) {
                var153 = -1;
            }
            int var154 = buf.g1();
            int var155 = var154 >> 4 & 0xF;
            int var156 = var154 & 0x7;
            int var157 = buf.g1();
            int var158 = buf.g1();
            int var159 = buf.g2();
            if (world.method6132() != RebuildType.field3839 && (var151 >= 0 && var152 >= 0 && var151 < world.getSizeX() && var152 < world.getSizeZ())) {
                int var160 = var155 + 1;
                if (Statics.localPlayerEntity.routeWaypointX[0] >= var151 - var160 && Statics.localPlayerEntity.routeWaypointX[0] <= var151 + var160 && Statics.localPlayerEntity.routeWaypointZ[0] >= var152 - var160 && Statics.localPlayerEntity.routeWaypointZ[0] <= var152 + var160) {
                    AudioRenderer.method1356(var153, var156, var157, var158, (var152 << 8) + (Statics.field3161 << 24) + (var151 << 16) + var155, var159);
                }
            }
        } else if (ZoneProt.field2804 == arg0) {
            int var161 = buf.g4s_alt2();
            int var162 = buf.g1_alt3();
            int var163 = var162 >> 2;
            int var164 = var162 & 0x3;
            int var165 = field8986[var163];
            int var166 = buf.g1();
            int var167 = (var166 >> 4 & 0x7) + Statics.field6803;
            int var168 = (var166 & 0x7) + Statics.field3907;
            if (world.method6132() != RebuildType.field3839) {
                method3302(Statics.field3161, var167, var168, var165, var163, var164, var161);
            }
        } else if (ZoneProt.field2803 == arg0) {
            int var169 = buf.g2_alt1();
            int var170 = buf.g1_alt1();
            CoordGrid var171 = world.getBase();
            int var172 = (var170 & 0x7) + Statics.field3907;
            int var173 = var171.z + var172;
            int var174 = (var170 >> 4 & 0x7) + Statics.field6803;
            int var175 = var171.x + var174;
            int var176 = buf.g2_alt1();
            int var177 = buf.g2();
            if (currentPlayerUid != var176) {
                boolean var178 = var174 >= 0 && var172 >= 0 && var174 < world.getSizeX() && var172 < world.getSizeZ();
                if (var178 || world.method6132().method6251()) {
                    method11367(Statics.field3161, var175, var173, new Obj(var177, var169));
                    if (var178) {
                        sortObjStacks(Statics.field3161, var174, var172);
                    }
                }
            }
        } else {
            JagException.method16252("" + arg0, new RuntimeException());
            logout(false);
        }
    }

    @ObfuscatedName("sg.jz(IIILact;B)V")
    public static void method11367(int arg0, int arg1, int arg2, Obj arg3) {
        long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
        ObjStackList var6 = (ObjStackList) field9088.getNode(var4);
        if (var6 == null) {
            ObjStackList var7 = new ObjStackList();
            field9088.put(var7, var4);
            var7.field9313.addFirst(arg3);
            return;
        }
        ObjType var8 = Statics.objTypes.get(arg3.field9311);
        int var9 = var8.field7080;
        if (var8.field7078 == 1) {
            var9 = (arg3.field9310 + 1) * var9;
        }
        for (Obj var10 = (Obj) var6.field9313.last(); var10 != null; var10 = (Obj) var6.field9313.prev()) {
            ObjType var11 = Statics.objTypes.get(var10.field9311);
            int var12 = var11.field7080;
            if (var11.field7078 == 1) {
                var12 = (var10.field9310 + 1) * var12;
            }
            if (var9 > var12) {
                IterableQueue.method2546(arg3, var10);
                return;
            }
        }
        var6.field9313.addFirst(arg3);
    }

    @ObfuscatedName("ads.jn(IIII)V")
    public static void sortObjStacks(int arg0, int arg1, int arg2) {
        CoordGrid var3 = world.getBase();
        int var4 = var3.x + arg1;
        int var5 = var3.z + arg2;
        if (world.getScene() == null || world.method6132() == RebuildType.field3839 || arg1 < 0 || arg2 < 0 || arg1 >= world.getSizeX() || arg2 >= world.getSizeZ()) {
            return;
        }
        long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
        ObjStackList var8 = (ObjStackList) field9088.getNode(var6);
        if (var8 == null) {
            world.getScene().method7429(arg0, arg1, arg2);
            return;
        }
        Obj var9 = (Obj) var8.field9313.last();
        if (var9 == null) {
            world.getScene().method7429(arg0, arg1, arg2);
            return;
        }
        ObjStackEntity var10 = (ObjStackEntity) world.getScene().method7429(arg0, arg1, arg2);
        if (var10 == null) {
            var10 = new ObjStackEntity(world.getScene(), arg1 << 265, world.getScene().field4498[arg0].method199(arg1, arg2), arg2 << 265, arg0, arg0);
        } else {
            var10.field10609 = -1;
            var10.field10607 = -1;
            var10.field9808 = world.getScene();
        }
        var10.field10611 = var9.field9311;
        var10.field10605 = var9.field9310;
        label53:
        while (true) {
            Obj var12 = (Obj) var8.field9313.prev();
            if (var12 == null) {
                break;
            }
            if (var10.field10611 != var12.field9311) {
                var10.field10607 = var12.field9311;
                var10.field10608 = var12.field9310;
                while (true) {
                    Obj var13 = (Obj) var8.field9313.prev();
                    if (var13 == null) {
                        break label53;
                    }
                    if (var10.field10611 != var13.field9311 && var10.field10607 != var13.field9311) {
                        var10.field10609 = var13.field9311;
                        var10.field10610 = var13.field9310;
                    }
                }
            }
        }
        int var14 = getHeightmapY((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
        var10.method8552((float) (arg1 << 265), (float) var14, (float) (arg2 << 265));
        var10.field10606 = 0;
        var10.level = (byte) arg0;
        var10.field9809 = (byte) arg0;
        if (world.getSceneLevelTileFlags().isLinkBelow(arg1, arg2)) {
            var10.field9809++;
        }
        world.getScene().method7499(arg0, arg1, arg2, var14, var10);
    }

    @ObfuscatedName("fw.jq(ZB)V")
    public static final void method3676(boolean arg0) {
        field8972 = 0;
        field8969 = 0;
        field8971++;
        method8068();
        System.out.println(gameConnection.in.pos + " " + gameConnection.packetSize);
        method189(arg0);
        System.out.println(gameConnection.in.pos + " " + gameConnection.packetSize);
        method4745();
        System.out.println(gameConnection.in.pos + " " + gameConnection.packetSize);
        boolean var1 = false;
        for (int var2 = 0; var2 < field8972; var2++) {
            int var3 = field8973[var2];
            ObjectNode var4 = (ObjectNode) npcs.getNode((long) var3);
            NpcEntity var5 = (NpcEntity) var4.value;
            if (field8971 != var5.field8618) {
                if (MiniMenu.open && MiniMenu.method11169(var3)) {
                    MiniMenu.close();
                }
                if (var5.type.method12511()) {
                    PositionedSound.method2547(var5);
                }
                var5.method16149(null);
                var4.remove();
                var1 = true;
            }
        }
        if (var1) {
            int var6 = field8966;
            field8966 = npcs.length();
            int var7 = 0;
            Iterator var8 = npcs.iterator();
            while (var8.hasNext()) {
                ObjectNode var9 = (ObjectNode) var8.next();
                field8965[var7++] = var9;
            }
            for (int var10 = field8966; var10 < var6; var10++) {
                field8965[var10] = null;
            }
        }
        if (gameConnection.packetSize != gameConnection.in.pos) {
            throw new RuntimeException(gameConnection.in.pos + " " + gameConnection.packetSize);
        }
        for (int var11 = 0; var11 < npcCount; var11++) {
            if (npcs.getNode((long) field9056[var11]) == null) {
                throw new RuntimeException(var11 + " " + npcCount);
            }
        }
        if (field8966 - npcCount != 0) {
            throw new RuntimeException("" + (field8966 - npcCount));
        }
        for (int var12 = 0; var12 < field8966; var12++) {
            if (field8971 != ((PathingEntity) field8965[var12].value).field8618) {
                throw new RuntimeException("" + ((PathingEntity) field8965[var12].value).localPlayerIndex);
            }
        }
    }

    @ObfuscatedName("qq.jk(B)V")
    public static final void method8068() {
        PacketBit var0 = gameConnection.in;
        var0.bits();
        int var1 = var0.gBit(8);
        if (var1 < npcCount) {
            for (int var2 = var1; var2 < npcCount; var2++) {
                field8973[++field8972 - 1] = field9056[var2];
            }
        }
        if (var1 > npcCount) {
            throw new RuntimeException();
        }
        npcCount = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field9056[var3];
            NpcEntity var5 = (NpcEntity) ((ObjectNode) npcs.getNode((long) var4)).value;
            int var6 = var0.gBit(1);
            if (var6 == 0) {
                field9056[++npcCount - 1] = var4;
                var5.field8618 = field8971;
            } else {
                int var7 = var0.gBit(2);
                if (var7 == 0) {
                    field9056[++npcCount - 1] = var4;
                    var5.field8618 = field8971;
                    field8970[++field8969 - 1] = var4;
                } else if (var7 == 1) {
                    field9056[++npcCount - 1] = var4;
                    var5.field8618 = field8971;
                    CompassPoint var8 = (CompassPoint) SerializableEnums.decode(Statics.method3921(), var0.gBit(3));
                    var5.method16152(var8, MoveSpeed.field3921.id);
                    int var9 = var0.gBit(1);
                    if (var9 == 1) {
                        field8970[++field8969 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field9056[++npcCount - 1] = var4;
                    var5.field8618 = field8971;
                    if (var0.gBit(1) == 1) {
                        CompassPoint var10 = (CompassPoint) SerializableEnums.decode(Statics.method3921(), var0.gBit(3));
                        var5.method16152(var10, MoveSpeed.field3922.id);
                        CompassPoint var11 = (CompassPoint) SerializableEnums.decode(Statics.method3921(), var0.gBit(3));
                        var5.method16152(var11, MoveSpeed.field3922.id);
                    } else {
                        CompassPoint var12 = (CompassPoint) SerializableEnums.decode(Statics.method3921(), var0.gBit(3));
                        var5.method16152(var12, MoveSpeed.field3920.id);
                    }
                    int var13 = var0.gBit(1);
                    if (var13 == 1) {
                        field8970[++field8969 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field8973[++field8972 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ta.jb(ZI)V")
    public static final void method189(boolean arg0) {
        PacketBit buf = gameConnection.in;
        while (buf.bitsAvailable(gameConnection.packetSize) >= 15) {
            int var2 = buf.gBit(15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            ObjectNode var4 = (ObjectNode) npcs.getNode((long) var2);
            if (var4 == null) {
                NpcEntity var5 = new NpcEntity(world.getScene());
                var5.localPlayerIndex = var2;
                var4 = new ObjectNode(var5);
                npcs.put(var4, (long) var2);
                field8965[++field8966 - 1] = var4;
                var3 = true;
            }
            NpcEntity var6 = (NpcEntity) var4.value;
            field9056[++npcCount - 1] = var2;
            var6.field8618 = field8971;
            if (var6.type != null && var6.type.method12511()) {
                PositionedSound.method2547(var6);
            }
            var6.method16149(Statics.field3774.method12565(buf.gBit(15)));
            int var7 = buf.gBit(1);
            if (var7 == 1) {
                field8970[++field8969 - 1] = var2;
            }
            int var8 = buf.gBit(3) + 4 << 11 & 0x3FFF;
            int var9 = buf.gBit(1);
            int var10;
            if (arg0) {
                var10 = buf.gBit(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = buf.gBit(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11 = buf.gBit(2);
            int var12;
            if (arg0) {
                var12 = buf.gBit(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = buf.gBit(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var6.setSize(var6.type.field7213);
            var6.field8636 = var6.type.field7241 << 3;
            if (var3) {
                var6.method13946(var8, true);
            }
            var6.method16153(var11, Statics.localPlayerEntity.routeWaypointX[0] + var10, Statics.localPlayerEntity.routeWaypointZ[0] + var12, var9 == 1, var6.size());
            if (var6.type.method12511()) {
                PositionedSound.add(var6.level, var6.routeWaypointX[0], var6.routeWaypointZ[0], 0, null, var6, null);
            }
        }
        buf.bytes();
    }

    @ObfuscatedName("jf.jl(B)V")
    public static final void method4745() {
        PacketBit buf = gameConnection.in;
        for (int var1 = 0; var1 < field8969; var1++) {
            int var2 = field8970[var1];
            NpcEntity var3 = (NpcEntity) ((ObjectNode) npcs.getNode((long) var2)).value;
            int extendedInfo = buf.g1();
            if ((extendedInfo & 0x4) != 0) {
                extendedInfo += buf.g1() << 8;
            }
            if ((extendedInfo & 0x400) != 0) {
                extendedInfo += buf.g1() << 16;
            }
            if ((extendedInfo & 0x20000) != 0) {
                extendedInfo += buf.g1() << 24;
            }

            if ((extendedInfo & 0x800000) != 0) {
                var3.vislevel = buf.g2_alt3();
                if (var3.vislevel == 65535) {
                    var3.vislevel = var3.type.field7233;
                }
            }
            if ((extendedInfo & 0x8000) != 0) {
                var3.field8619 = buf.g1b();
                var3.field8621 = buf.g1b();
                var3.field8591 = buf.g1b_alt3();
                var3.field8605 = buf.g1b_alt1();
                var3.forceMoveEndCycle = buf.g2_alt3() + loopCycle;
                var3.forceMoveStartCycle = buf.g2() + loopCycle;
                var3.field8625 = buf.g2();
                var3.field8619 = var3.field8619 + var3.routeWaypointX[0];
                var3.field8621 = var3.field8621 + var3.routeWaypointZ[0];
                var3.field8591 = var3.field8591 + var3.routeWaypointX[0];
                var3.field8605 = var3.field8605 + var3.routeWaypointZ[0];
                var3.routeLength = 1;
                var3.field8646 = 0;
            }
            if ((extendedInfo & 0x100) != 0) {
                var3.field10069 = buf.g2_alt1();
                if (var3.field10069 == 65535) {
                    var3.field10069 = -1;
                }
            }
            if ((extendedInfo & 0x400000) != 0) {
                var3.field10078.method2420();
                int var5 = buf.data[++buf.pos - 1] & 0xFF;
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = buf.g2_alt2();
                    int var8 = buf.g4s_alt1();
                    var3.field10078.method2418(var7, var8);
                }
            }
            if ((extendedInfo & 0x80) != 0) {
                if (var3.type.method12511()) {
                    PositionedSound.method2547(var3);
                }
                var3.method16149(Statics.field3774.method12565(buf.gSmart2or4null()));
                var3.setSize(var3.type.field7213);
                var3.field8636 = var3.type.field7241 << 3;
                if (var3.type.method12511()) {
                    PositionedSound.add(var3.level, var3.routeWaypointX[0], var3.routeWaypointZ[0], 0, null, var3, null);
                }
            }
            if ((extendedInfo & 0x2000) != 0) {
                int var9 = var3.type.field7214.length;
                int var10 = 0;
                if (var3.type.field7267 != null) {
                    var10 = var3.type.field7267.length;
                }
                int var11 = 0;
                if (var3.type.field7270 != null) {
                    var11 = var3.type.field7270.length;
                }
                int var12 = buf.g1_alt3();
                if ((var12 & 0x1) == 1) {
                    var3.field10073 = null;
                } else {
                    int[] var13 = null;
                    if ((var12 & 0x2) == 2) {
                        var13 = new int[var9];
                        for (int var14 = 0; var14 < var9; var14++) {
                            var13[var14] = buf.gSmart2or4null();
                        }
                    }
                    short[] var15 = null;
                    if ((var12 & 0x4) == 4) {
                        var15 = new short[var10];
                        for (int var16 = 0; var16 < var10; var16++) {
                            var15[var16] = (short) buf.g2_alt3();
                        }
                    }
                    short[] var17 = null;
                    if ((var12 & 0x8) == 8) {
                        var17 = new short[var11];
                        for (int var18 = 0; var18 < var11; var18++) {
                            var17[var18] = (short) buf.g2_alt1();
                        }
                    }
                    long var19 = (long) (++NpcEntity.field10076 - 1);
                    var3.field10073 = new NPCTypeCustomisation(var19, var13, var15, var17);
                }
            }
            if ((extendedInfo & 0x20) != 0) {
                var3.field8624 = buf.g2_alt2();
                if (var3.field8624 == 65535) {
                    var3.field8624 = -1;
                }
            }
            if ((extendedInfo & 0x4000) != 0) {
                int var21 = buf.g1_alt1();
                int[] var22 = new int[var21];
                int[] var23 = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = buf.g2_alt2();
                    if ((var25 & 0xC000) == 49152) {
                        int var26 = buf.g2_alt3();
                        var22[var24] = var25 << 16 | var26;
                    } else {
                        var22[var24] = var25;
                    }
                    var23[var24] = buf.g2_alt2();
                }
                var3.method13948(var22, var23);
            }
            if ((extendedInfo & 0x1000) != 0) {
                int var27 = buf.g1();
                int[] var28 = new int[var27];
                int[] var29 = new int[var27];
                int[] var30 = new int[var27];
                for (int var31 = 0; var31 < var27; var31++) {
                    int var32 = buf.gSmart2or4null();
                    var28[var31] = var32;
                    var29[var31] = buf.g1_alt3();
                    var30[var31] = buf.g2_alt1();
                }
                method12477(var3, var28, var29, var30);
            }
            if ((extendedInfo & 0x40000) != 0) {
                var3.name = buf.gjstr();
                if ("".equals(var3.name) || var3.name.equals(var3.type.name)) {
                    var3.name = var3.type.name;
                }
            }
            if ((extendedInfo & 0x1000000) != 0) {
                int var33 = buf.g2_alt2();
                int var34 = buf.g4s_alt2();
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var35 = buf.g1();
                int var36 = var35 & 0x7;
                int var37 = var35 >> 3 & 0xF;
                if (var37 == 15) {
                    var37 = -1;
                }
                boolean var38 = (var35 >> 7 & 0x1) == 1;
                var3.method13950(var33, var34, var36, var37, var38, 3);
            }
            if ((extendedInfo & 0x200000) != 0) {
                int var39 = buf.data[++buf.pos - 1] & 0xFF;
                for (int var40 = 0; var40 < var39; var40++) {
                    int var41 = buf.g1_alt3();
                    int var42 = buf.g4s_alt3();
                    int var43 = buf.g3_alt3();
                    var3.method16158(var41, var42, var43);
                }
            }
            if ((extendedInfo & 0x80000) != 0) {
                var3.field8596 = buf.g1b_alt2();
                var3.field8602 = buf.g1b_alt3();
                var3.field8617 = buf.g1b_alt2();
                var3.field8631 = (byte) buf.g1_alt1();
                var3.field8626 = loopCycle + buf.g2_alt1();
                var3.field8632 = loopCycle + buf.g2_alt2();
            }
            if ((extendedInfo & 0x2) != 0) {
                var3.field10080 = buf.g2();
                var3.field10070 = buf.g2();
            }
            if ((extendedInfo & 0x200) != 0) {
                int var44 = buf.g2_alt1();
                int var45 = buf.g4s_alt1();
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var46 = buf.g1_alt3();
                int var47 = var46 & 0x7;
                int var48 = var46 >> 3 & 0xF;
                if (var48 == 15) {
                    var48 = -1;
                }
                boolean var49 = (var46 >> 7 & 0x1) == 1;
                var3.method13950(var44, var45, var47, var48, var49, 1);
            }
            if ((extendedInfo & 0x100000) != 0) {
                int var50 = buf.data[++buf.pos - 1] & 0xFF;
                for (int var51 = 0; var51 < var50; var51++) {
                    int var52 = buf.g2_alt1();
                    int var53 = buf.g4s_alt1();
                    var3.field10078.method2418(var52, var53);
                }
            }
            if ((extendedInfo & 0x1) != 0) {
                int[] var54 = new int[MoveSpeed.values().length];
                for (int var55 = 0; var55 < MoveSpeed.values().length; var55++) {
                    var54[var55] = buf.gSmart2or4null();
                }
                int var56 = buf.g1_alt3();
                method8263(var3, var54, var56, true);
            }
            if ((extendedInfo & 0x40) != 0) {
                int var57 = buf.g2_alt3();
                int var58 = buf.g4s();
                if (var57 == 65535) {
                    var57 = -1;
                }
                int var59 = buf.g1_alt1();
                int var60 = var59 & 0x7;
                int var61 = var59 >> 3 & 0xF;
                if (var61 == 15) {
                    var61 = -1;
                }
                boolean var62 = (var59 >> 7 & 0x1) == 1;
                var3.method13950(var57, var58, var60, var61, var62, 0);
            }
            if ((extendedInfo & 0x10) != 0) {
                var3.method16148(buf.gjstr(), 0, 0);
            }
            if ((extendedInfo & 0x2000000) != 0) {
                int var63 = buf.g2();
                int var64 = buf.g4s();
                if (var63 == 65535) {
                    var63 = -1;
                }
                int var65 = buf.g1_alt2();
                int var66 = var65 & 0x7;
                int var67 = var65 >> 3 & 0xF;
                if (var67 == 15) {
                    var67 = -1;
                }
                boolean var68 = (var65 >> 7 & 0x1) == 1;
                var3.method13950(var63, var64, var66, var67, var68, 2);
            }
            if ((extendedInfo & 0x8) != 0) {
                int var69 = buf.g1_alt2();
                if (var69 > 0) {
                    for (int var70 = 0; var70 < var69; var70++) {
                        int var71 = -1;
                        boolean var72 = true;
                        int var73 = -1;
                        int var74 = buf.gSmart1or2();
                        int var75;
                        if (var74 == 32767) {
                            var74 = buf.gSmart1or2();
                            var75 = buf.gSmart1or2();
                            var71 = buf.gSmart1or2();
                            var73 = buf.gSmart1or2();
                        } else if (var74 == 32766) {
                            var74 = -1;
                            var75 = buf.g1_alt1();
                        } else {
                            var75 = buf.gSmart1or2();
                        }
                        int var76 = buf.gSmart1or2();
                        var3.method13953(var74, var75, var71, var73, loopCycle, var76);
                    }
                }
                int var77 = buf.g1();
                if (var77 > 0) {
                    for (int var78 = 0; var78 < var77; var78++) {
                        int var79 = buf.gSmart1or2();
                        int var80 = buf.gSmart1or2();
                        if (var80 == 32767) {
                            var3.method13990(var79);
                        } else {
                            int var81 = buf.gSmart1or2();
                            int var82 = buf.g1_alt1();
                            int var83 = var80 > 0 ? buf.g1_alt3() : var82;
                            var3.method13944(var79, loopCycle, var80, var81, var82, var83);
                        }
                    }
                }
            }
            if ((extendedInfo & 0x10000) != 0) {
                int var84 = var3.type.field7215.length;
                int var85 = 0;
                if (var3.type.field7267 != null) {
                    var85 = var3.type.field7267.length;
                }
                byte var86 = 0;
                if (var3.type.field7270 != null) {
                    var85 = var3.type.field7270.length;
                }
                int var87 = buf.g1_alt2();
                if ((var87 & 0x1) != 1) {
                    int[] var88 = null;
                    if ((var87 & 0x2) == 2) {
                        var88 = new int[var84];
                        for (int var89 = 0; var89 < var84; var89++) {
                            var88[var89] = buf.gSmart2or4null();
                        }
                    }
                    short[] var90 = null;
                    if ((var87 & 0x4) == 4) {
                        var90 = new short[var85];
                        for (int var91 = 0; var91 < var85; var91++) {
                            var90[var91] = (short) buf.g2_alt1();
                        }
                    }
                    short[] var92 = null;
                    if ((var87 & 0x8) == 8) {
                        var92 = new short[var86];
                        for (int var93 = 0; var93 < var86; var93++) {
                            var92[var93] = (short) buf.g2_alt2();
                        }
                    }
                    long var94 = (long) (++NpcEntity.field10074 - 1);
                    new NPCTypeCustomisation(var94, var88, var90, var92);
                }
            }
        }
    }

    @ObfuscatedName("qc.kr(Laay;[IIZI)V")
    public static void method8263(PathingEntity arg0, int[] arg1, int arg2, boolean arg3) {
        if (arg0.field8615 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field8615.length; var5++) {
                if (arg0.field8615[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            AnimationNode var6 = arg0.field8597;
            if (var4 && var6.method11767()) {
                SeqType var7 = arg0.field8597.method11804();
                int var8 = var7.field6331;
                if (var8 == 1) {
                    var6.method11786(arg2);
                }
                if (var8 == 2) {
                    var6.method11806();
                }
            }
        }
        boolean var9 = true;
        for (int var10 = 0; var10 < arg1.length; var10++) {
            if (arg1[var10] != -1) {
                var9 = false;
            }
            if (arg0.field8615 == null || arg0.field8615[var10] == -1 || Statics.field566.method11144(arg1[var10]).field6325 >= Statics.field566.method11144(arg0.field8615[var10]).field6325) {
                arg0.field8615 = arg1;
                arg0.field8597.method11791(arg2);
                if (arg3) {
                    arg0.field8646 = arg0.routeLength;
                }
            }
        }
        if (!var9) {
            return;
        }
        arg0.field8615 = arg1;
        arg0.field8597.method11791(arg2);
        if (arg3) {
            arg0.field8646 = arg0.routeLength;
        }
    }

    @ObfuscatedName("ef.kh(IIIIIIII)V")
    public static void method3302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 0 || arg2 < 0 || arg1 >= world.getSizeX() - 1 || arg2 >= world.getSizeZ() - 1) {
            return;
        }
        if (world.getScene() == null) {
            return;
        }
        if (arg3 == 0) {
            Location var7 = (Location) world.getScene().method7433(arg0, arg1, arg2);
            Location var8 = (Location) world.getScene().method7442(arg0, arg1, arg2);
            if (var7 != null && arg4 != 2) {
                if (var7 instanceof DynamicWallEntity) {
                    ((DynamicWallEntity) var7).field7576.method2451(arg6);
                } else {
                    ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var7.getType(), arg5, arg4, arg6);
                }
            }
            if (var8 != null) {
                if (var8 instanceof DynamicWallEntity) {
                    ((DynamicWallEntity) var8).field7576.method2451(arg6);
                } else {
                    ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var8.getType(), arg5, arg4, arg6);
                }
            }
        } else if (arg3 == 1) {
            Location var9 = (Location) world.getScene().method7435(arg0, arg1, arg2);
            if (var9 != null) {
                if (var9 instanceof DynamicWallDecorEntity) {
                    ((DynamicWallDecorEntity) var9).field7570.method2451(arg6);
                } else {
                    int var10 = var9.getType();
                    if (arg4 == 4 || arg4 == 5) {
                        ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var10, arg5, 4, arg6);
                    } else if (arg4 == 6) {
                        ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
                    } else if (arg4 == 7) {
                        ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 0x3) + 4, 4, arg6);
                    } else if (arg4 == 8) {
                        ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
                        ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 0x3) + 4, 4, arg6);
                    }
                }
            }
        } else if (arg3 == 2) {
            Location var11 = (Location) world.getScene().method7437(arg0, arg1, arg2, field9216);
            if (var11 != null) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                if (var11 instanceof DynamicSceneryEntity) {
                    ((DynamicSceneryEntity) var11).field7524.method2451(arg6);
                } else {
                    ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var11.getType(), arg5, arg4, arg6);
                }
            }
        } else if (arg3 == 3) {
            Location var12 = (Location) world.getScene().method7517(arg0, arg1, arg2);
            if (var12 != null) {
                if (var12 instanceof DynamicGroundDecorEntity) {
                    ((DynamicGroundDecorEntity) var12).field7530.method2451(arg6);
                } else {
                    ChangeLocationRequest.method11120(arg0, arg3, arg1, arg2, var12.getType(), arg5, arg4, arg6);
                }
            }
        }
    }

    @ObfuscatedName("pl.kb(IIIIB)V")
    public static final void requestRedrawAtPoint(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field9000; var4++) {
            Rectangle var5 = field9167[var4];
            if (var5.x + var5.width > arg0 && var5.x < arg0 + arg2 && var5.y + var5.height > arg1 && var5.y < arg1 + arg3) {
                field9204[var4] = true;
            }
        }
    }

    @ObfuscatedName("oe.ki(Ljava/lang/String;I)V")
    public static void method7323(String arg0) {
        if (!targetModeActive || (Statics.targetMask & 0x18) == 0) {
            return;
        }
        boolean var1 = false;
        int var2 = ReceivePlayerPositions.highResolutionsCount;
        int[] var3 = ReceivePlayerPositions.highResolutionsIndices;
        for (int var4 = 0; var4 < var2; var4++) {
            PlayerEntity var5 = players[var3[var4]];
            if (var5.nameUnfiltered != null && var5.nameUnfiltered.equalsIgnoreCase(arg0) && (Statics.localPlayerEntity == var5 && (Statics.targetMask & 0x10) != 0 || (Statics.targetMask & 0x8) != 0)) {
                ClientMessage var6 = ClientMessage.createMessage(ClientProt.OPPLAYERT, gameConnection.randomOut);
                var6.buf.p2_alt2(activeComponentInvobject);
                var6.buf.p1(0);
                var6.buf.p4(Statics.activeComponentParentLayer);
                var6.buf.p2(activeComponentId);
                var6.buf.p2_alt1(var3[var4]);
                gameConnection.queue(var6);
                int var7 = var5.size();
                method2677(var5.routeWaypointX[0], var5.routeWaypointZ[0], true, PathFinderEntityRelated.method11404(var5.routeWaypointX[0], var5.routeWaypointZ[0], var7, var7, 0));
                var1 = true;
                break;
            }
        }
        if (!var1) {
            ChatHistory.method1587(4, LocalisedText.field6907.get(Statics.language) + arg0);
        }
        if (targetModeActive) {
            cancelTargetMode();
        }
    }

    @ObfuscatedName("sh.kv(I)V")
    public static void cancelTargetMode() {
        if (!targetModeActive) {
            return;
        }
        Component var0 = Component.get(Statics.activeComponentParentLayer, activeComponentId);
        if (var0 != null && var0.field1873 != null) {
            HookRequest var1 = new HookRequest();
            var1.component = var0;
            var1.onop = var0.field1873;
            ScriptRunner.runHook(var1);
        }
        defaultCursor = -1;
        activeComponentInvobject = -1;
        targetModeActive = false;
        if (var0 != null) {
            requestRedrawComponent(var0);
        }
    }

    @ObfuscatedName("rn.kp(Lew;Lew;I)V")
    public static void method11058(Component arg0, Component arg1) {
        ClientMessage var2 = ClientMessage.createMessage(ClientProt.IF_BUTTOND, gameConnection.randomOut);
        var2.buf.p2_alt3(arg1.invobject);
        var2.buf.p2_alt1(arg1.parentlayer);
        var2.buf.p4_alt2(arg1.id);
        var2.buf.p2(arg0.parentlayer);
        var2.buf.p4_alt3(arg0.id);
        var2.buf.p2_alt3(arg0.invobject);
        gameConnection.queue(var2);
    }

    @ObfuscatedName("abm.kq(Lew;I)V")
    public static void method14206(Component arg0) {
        if (!targetModeActive) {
            return;
        }
        if (arg0.field1788 != null) {
            Component var1 = Component.get(Statics.activeComponentParentLayer, activeComponentId);
            if (var1 != null) {
                HookRequest var2 = new HookRequest();
                var2.component = arg0;
                var2.drop = var1;
                var2.onop = arg0.field1788;
                ScriptRunner.runHook(var2);
            }
        }
        ClientMessage var3 = ClientMessage.createMessage(ClientProt.IF_BUTTONT, gameConnection.randomOut);
        var3.buf.p2_alt1(activeComponentInvobject);
        var3.buf.p4_alt1(arg0.id);
        var3.buf.p4_alt1(Statics.activeComponentParentLayer);
        var3.buf.p2_alt2(activeComponentId);
        var3.buf.p2(arg0.parentlayer);
        var3.buf.p2_alt3(arg0.invobject);
        gameConnection.queue(var3);
    }

    @ObfuscatedName("lh.kc(IIILjava/lang/String;I)V")
    public static void method5716(int arg0, int arg1, int arg2, String arg3) {
        Component var4 = Component.get(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.op != null) {
            HookRequest var5 = new HookRequest();
            var5.component = var4;
            var5.opindex = arg0;
            var5.opbase = arg3;
            var5.onop = var4.op;
            ScriptRunner.runHook(var5);
        }
        if (!getComponentEvents(var4).isOpTransmitted(arg0 - 1)) {
            return;
        }
        ServerConnection var6 = getCurrentConnection();
        if (state != 15 && state != 1) {
            return;
        }
        if (arg0 == 1) {
            ClientMessage var7 = ClientMessage.createMessage(ClientProt.IF_BUTTON1, var6.randomOut);
            method12592(var7, arg1, arg2, var4.invobject);
            var6.queue(var7);
        }
        if (arg0 == 2) {
            ClientMessage var8 = ClientMessage.createMessage(ClientProt.IF_BUTTON2, var6.randomOut);
            method12592(var8, arg1, arg2, var4.invobject);
            var6.queue(var8);
        }
        if (arg0 == 3) {
            ClientMessage var9 = ClientMessage.createMessage(ClientProt.IF_BUTTON3, var6.randomOut);
            method12592(var9, arg1, arg2, var4.invobject);
            var6.queue(var9);
        }
        if (arg0 == 4) {
            ClientMessage var10 = ClientMessage.createMessage(ClientProt.IF_BUTTON4, var6.randomOut);
            method12592(var10, arg1, arg2, var4.invobject);
            var6.queue(var10);
        }
        if (arg0 == 5) {
            ClientMessage var11 = ClientMessage.createMessage(ClientProt.IF_BUTTON5, var6.randomOut);
            method12592(var11, arg1, arg2, var4.invobject);
            var6.queue(var11);
        }
        if (arg0 == 6) {
            ClientMessage var12 = ClientMessage.createMessage(ClientProt.IF_BUTTON6, var6.randomOut);
            method12592(var12, arg1, arg2, var4.invobject);
            var6.queue(var12);
        }
        if (arg0 == 7) {
            ClientMessage var13 = ClientMessage.createMessage(ClientProt.IF_BUTTON7, var6.randomOut);
            method12592(var13, arg1, arg2, var4.invobject);
            var6.queue(var13);
        }
        if (arg0 == 8) {
            ClientMessage var14 = ClientMessage.createMessage(ClientProt.IF_BUTTON8, var6.randomOut);
            method12592(var14, arg1, arg2, var4.invobject);
            var6.queue(var14);
        }
        if (arg0 == 9) {
            ClientMessage var15 = ClientMessage.createMessage(ClientProt.IF_BUTTON9, var6.randomOut);
            method12592(var15, arg1, arg2, var4.invobject);
            var6.queue(var15);
        }
        if (arg0 == 10) {
            ClientMessage var16 = ClientMessage.createMessage(ClientProt.IF_BUTTON10, var6.randomOut);
            method12592(var16, arg1, arg2, var4.invobject);
            var6.queue(var16);
        }
    }

    @ObfuscatedName("wv.kx(Lada;IIIB)V")
    public static void method12592(ClientMessage arg0, int arg1, int arg2, int arg3) {
        arg0.buf.p2_alt3(arg3);
        arg0.buf.p2_alt3(arg2);
        arg0.buf.p4_alt3(arg1);
    }

    @ObfuscatedName("id.kn(I)V")
    public static final void method4593() {
        Statics.field4667 = null;
        method11892(topLevelInterface, 0, 0, Statics.canvasWid, Statics.canvasHei, 0, 0, -1);
        if (Statics.field4667 != null) {
            method2709(Statics.field4667, -1412584499, 0, 0, Statics.canvasWid, Statics.canvasHei, Statics.field562, Statics.field5185, Statics.field9561 == field9116 ? -1 : field9116.field1926, true);
            Statics.field4667 = null;
        }
    }

    @ObfuscatedName("ub.ko(IIIIIIIII)V")
    public static final void method11892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Component.openInterface(arg0, null)) {
            method2709(Statics.field1756[arg0].getComponents(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field9204[var8] = true;
            }
        } else {
            field9204[arg7] = true;
        }
    }

    @ObfuscatedName("dh.kt([Lew;IIIIIIIIZI)V")
    public static final void method2709(Component[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        Statics.renderer.r(arg2, arg3, arg4, arg5);
        for (int var10 = 0; var10 < arg0.length; var10++) {
            Component var11 = arg0[var10];
            if (var11 != null && (var11.field1886 == arg1 || arg1 == -1412584499 && dragComponent == var11)) {
                int var12;
                if (arg8 == -1) {
                    field9167[field9000].setBounds(var11.field1776 + arg6, var11.field1777 + arg7, var11.renderwidth, var11.renderheight);
                    var12 = ++field9000 - 1;
                } else {
                    var12 = arg8;
                }
                var11.field1926 = var12;
                var11.field1927 = loopCycle;
                if (!method14315(var11)) {
                    if (var11.clientcode != 0) {
                        Statics.method8633(var11);
                    }
                    int var13 = var11.field1776 + arg6;
                    int var14 = var11.field1777 + arg7;
                    int var15 = var11.field1794;
                    if (field9111 && (getComponentEvents(var11).field9416 != 0 || var11.type == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (dragComponent == var11) {
                        if (arg1 != -1412584499 && (Component.field1921 == var11.field1859 || Component.field1808 == var11.field1859 || getComponentEvents(var11).method14933())) {
                            Statics.field4667 = arg0;
                            Statics.field562 = arg6;
                            Statics.field5185 = arg7;
                            continue;
                        }
                        if (field8991 && field9037) {
                            int var16 = Statics.mouse.getX();
                            int var17 = Statics.mouse.getY();
                            int var18 = var16 - field9160;
                            int var19 = var17 - field8977;
                            if (var18 < field9203) {
                                var18 = field9203;
                            }
                            if (var11.renderwidth + var18 > field9203 + field9123) {
                                var18 = field9203 + field9123 - var11.renderwidth;
                            }
                            if (var19 < field8942) {
                                var19 = field8942;
                            }
                            if (var11.renderheight + var19 > field8968 + field8942) {
                                var19 = field8968 + field8942 - var11.renderheight;
                            }
                            if (getComponentEvents(var11).method14933()) {
                                requestRedrawAtPoint(var18, var19, var11.renderwidth, var11.renderheight);
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (Component.field1808 == var11.field1859) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.type == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else {
                        int var24 = var11.renderwidth + var13;
                        int var25 = var11.renderheight + var14;
                        if (var11.type == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var24 < arg4 ? var24 : arg4;
                        var23 = var25 < arg5 ? var25 : arg5;
                    }

                    if (var20 < var22 && var21 < var23) {
                        if (var11.clientcode != 0) {
                            if (Component.field1847 == var11.clientcode || Component.field1742 == var11.clientcode) {
                                Statics.renderer.method509();
                                method14742(var13, var14, var11.renderwidth, var11.renderheight, Component.field1742 == var11.clientcode);
                                method12995(var12, var20, var21, var22, var23, var13, var14);
                                Statics.renderer.method490();
                                Statics.renderer.r(arg2, arg3, arg4, arg5);
                                field9204[var12] = true;
                                continue;
                            }

                            if (Component.MINIMAP == var11.clientcode && field8988 == 2) {
                                if (var11.method3124(Statics.renderer) != null) {
                                    AudioRenderer.method3461();
                                    MiniMap.method3655(Statics.renderer, var11, var13, var14);
                                    Statics.renderer.r(arg2, arg3, arg4, arg5);
                                }

                                continue;
                            }

                            if (Component.COLOR_CHOOSER_HUE == var11.clientcode) {
                                WorldMapRenderer.method8599(Statics.renderer, var13, var14, var11);
                                continue;
                            }

                            if (Component.COLOR_CHOOSER_SAT == var11.clientcode) {
                                WorldMapRenderer.method3303(Statics.renderer, var13, var14, var11, var11.colour % 64);
                                continue;
                            }

                            if (Component.COMPASS == var11.clientcode) {
                                if (var11.method3124(Statics.renderer) != null) {
                                    Statics.renderer.method509();
                                    method11873(var11, var13, var14);
                                    Statics.renderer.r(arg2, arg3, arg4, arg5);
                                }

                                continue;
                            }

                            if (Component.WORLD_MAP == var11.clientcode) {
                                ClientWorldMap.drawMain(Statics.renderer, Statics.field8465, var13, var14, var11.renderwidth, var11.renderheight);
                                field9204[var12] = true;
                                Statics.renderer.r(arg2, arg3, arg4, arg5);
                                continue;
                            }

                            if (Component.WORLD_MAP_OVERVIEW == var11.clientcode) {
                                ClientWorldMap.drawOverview(Statics.renderer, var13, var14, var11.renderwidth, var11.renderheight);
                                field9204[var12] = true;
                                Statics.renderer.r(arg2, arg3, arg4, arg5);
                                continue;
                            }

                            if (Component.DEBUG == var11.clientcode) {
                                if (field8926 || field9169) {
                                    drawDebug(var13, var14, var11);
                                    field9204[var12] = true;
                                }

                                continue;
                            }
                        }

                        if (var11.type == 0) {
                            if (Component.CUTSCENE_FADE == var11.clientcode && Statics.renderer.method600()) {
                                Statics.renderer.method514(0, 0, Statics.canvasWid, Statics.canvasHei);
                            }

                            method2709(arg0, var11.id, var20, var21, var22, var23, var13 - var11.scrollx, var14 - var11.scrolly, var12, arg9);
                            if (var11.sortedsubcomponents != null) {
                                method2709(var11.sortedsubcomponents, var11.id, var20, var21, var22, var23, var13 - var11.scrollx, var14 - var11.scrolly, var12, arg9);
                            }

                            SubInterface var26 = (SubInterface) field9075.getNode((long) var11.id);
                            if (var26 != null) {
                                method11892(var26.field9679, var20, var21, var22, var23, var13, var14, var12);
                            }

                            if (Component.CUTSCENE_FADE == var11.clientcode) {
                                if (Statics.renderer.method600()) {
                                    Statics.renderer.method545();
                                }
                                if (field8988 == 0) {
                                    int var27 = field8994;
                                    int var28 = field9147;
                                    int var29 = field8996;
                                    int var30 = field8997;
                                    if (loopCycle < field8993) {
                                        float var31 = (float) (loopCycle - field8992) * 1.0F / (float) (field8993 - field8992);
                                        var27 = (int) ((1.0F - var31) * (float) Statics.field4666 + (float) field8994 * var31);
                                        var28 = (int) ((1.0F - var31) * (float) Statics.field6400 + (float) field9147 * var31);
                                        var29 = (int) ((1.0F - var31) * (float) Statics.field6565 + (float) field8996 * var31);
                                        var30 = (int) ((1.0F - var31) * (float) Statics.field2631 + (float) field8997 * var31);
                                    }
                                    if (var27 > 0) {
                                        Statics.renderer.fillRectangle(var20, var21, var22 - var20, var23 - var21, var27 << 24 | var28 << 16 | var29 << 8 | var30);
                                    }
                                }
                            }

                            Statics.renderer.r(arg2, arg3, arg4, arg5);
                        }

                        if (field9166[var12] || field8929 > 1) {
                            if (var11.type == 3) {
                                if (var15 == 0) {
                                    if (var11.field1741) {
                                        Statics.renderer.B(var13, var14, var11.renderwidth, var11.renderheight, var11.colour | 0xFF000000, 0);
                                    } else {
                                        Statics.renderer.drawRectangle(var13, var14, var11.renderwidth, var11.renderheight, var11.colour | 0xFF000000, 0);
                                    }
                                } else if (var11.field1741) {
                                    Statics.renderer.B(var13, var14, var11.renderwidth, var11.renderheight, 255 - (var15 & 0xFF) << 24 | var11.colour & 0xFFFFFF, 1);
                                } else {
                                    Statics.renderer.drawRectangle(var13, var14, var11.renderwidth, var11.renderheight, 255 - (var15 & 0xFF) << 24 | var11.colour & 0xFFFFFF, 1);
                                }
                            } else if (var11.type == 4) {
                                int var32 = 255 - (var15 & 0xFF);
                                if (var32 != 0) {
                                    Font var33 = var11.method3116(Statics.field6784, field8914);
                                    if (var33 != null) {
                                        int var34 = var11.colour;
                                        String var35 = var11.text;
                                        if (var11.invobject != -1) {
                                            ObjType var36 = Statics.objTypes.get(var11.invobject);
                                            var35 = var36.name;
                                            if (var35 == null) {
                                                var35 = "null";
                                            }
                                            if ((var36.field7078 == 1 || var11.invcount != 1) && var11.invcount != -1) {
                                                var35 = TextUtil.createColourTag(16748608) + var35 + TextUtil.END_COLOUR_TAG + " x" + formatObjectCount(var11.invcount);
                                            }
                                        }
                                        if (var11.field1737 != -1) {
                                            var35 = VideoTypeList.method1723(var11.field1737);
                                            if (var35 == null) {
                                                var35 = "";
                                            }
                                        }
                                        if (field9108 == var11) {
                                            var35 = LocalisedText.field6999.get(Statics.language);
                                            var34 = var11.colour;
                                        }
                                        if (field9114) {
                                            Statics.renderer.o(var13, var14, var11.renderwidth + var13, var11.renderheight + var14);
                                        }
                                        int var37 = var32 << 24;
                                        if (var11.field1860) {
                                            var33.method842(var35, var13, var14, var11.renderwidth, var11.renderheight, var37 | var34, var11.field1901 ? var37 : -1, var11.field1836, var11.field1837, field9207, Statics.field2113, field8920, Statics.field8538, null);
                                        } else {
                                            var33.method832(var35, var13, var14, var11.renderwidth, var11.renderheight, var37 | var34, var11.field1901 ? var37 : -1, var11.field1836, var11.field1837, var11.field1835, var11.field1839, Statics.field8538, null, null, 0, 0);
                                        }
                                        if (field9114) {
                                            Statics.renderer.r(arg2, arg3, arg4, arg5);
                                        }
                                    } else if (Component.field1761) {
                                        requestRedrawComponent(var11);
                                    }
                                }
                            } else if (var11.type == 5) {
                                if (var11.field1906 >= 0) {
                                    var11.method3181(Statics.field4678, Statics.field6360).method6368(Statics.renderer, 0, var13, var14, var11.renderwidth, var11.renderheight, var11.field1907 << 3, var11.field1908 << 3, 0, 0);
                                } else {
                                    Sprite var39;
                                    if (var11.invobject != -1) {
                                        PlayerModel var38 = var11.invwearcol ? Statics.localPlayerEntity.model : null;
                                        var39 = Statics.objTypes.getCachedIcon(Statics.renderer, var11.invobject, var11.invcount, var11.outline, var11.graphicshadow | 0xFF000000, var11.invcountvis, var38);
                                    } else if (var11.field1737 == -1) {
                                        var39 = var11.method3151(Statics.renderer);
                                    } else {
                                        var39 = VideoTypeList.method4742(Statics.renderer, var11.field1737);
                                    }
                                    if (var39 != null) {
                                        int var40 = var39.method1042();
                                        int var41 = var39.method1047();
                                        int var42 = 255 - (var15 & 0xFF);
                                        if (var42 != 0) {
                                            int var43;
                                            if (var11.colour == -1) {
                                                var43 = 16777215;
                                            } else {
                                                var43 = var11.colour & 0xFFFFFF;
                                                if (var43 == 0) {
                                                    var43 = 16777215;
                                                }
                                            }
                                            int var44 = var43 | var42 << 24;
                                            boolean var45 = var44 != -1;
                                            if (var11.field1799) {
                                                Statics.renderer.o(var13, var14, var11.renderwidth + var13, var11.renderheight + var14);
                                                if (var11.field1783 != 0) {
                                                    int var46 = (var11.renderwidth + (var40 - 1)) / var40;
                                                    int var47 = (var11.renderheight + (var41 - 1)) / var41;
                                                    for (int var48 = 0; var48 < var46; var48++) {
                                                        for (int var49 = 0; var49 < var47; var49++) {
                                                            if (var45) {
                                                                var39.method2531((float) var40 / 2.0F + (float) (var40 * var48 + var13), (float) var41 / 2.0F + (float) (var41 * var49 + var14), 4096, var11.field1783, 0, var44, 1);
                                                            } else {
                                                                var39.method2503((float) var40 / 2.0F + (float) (var40 * var48 + var13), (float) var41 / 2.0F + (float) (var41 * var49 + var14), 4096, var11.field1783);
                                                            }
                                                        }
                                                    }
                                                } else if (var45) {
                                                    var39.method1070(var13, var14, var11.renderwidth, var11.renderheight, 0, var44, 1);
                                                } else {
                                                    var39.method2511(var13, var14, var11.renderwidth, var11.renderheight);
                                                }
                                                Statics.renderer.r(arg2, arg3, arg4, arg5);
                                            } else if (var45) {
                                                if (var11.field1783 != 0) {
                                                    var39.method2531((float) var11.renderwidth / 2.0F + (float) var13, (float) var11.renderheight / 2.0F + (float) var14, var11.renderwidth * 4096 / var40, var11.field1783, 0, var44, 1);
                                                } else if (var11.renderwidth == var40 && var11.renderheight == var41) {
                                                    var39.method1054(var13, var14, 0, var44, 1);
                                                } else {
                                                    var39.method2502(var13, var14, var11.renderwidth, var11.renderheight, 0, var44, 1);
                                                }
                                            } else if (var11.field1783 != 0) {
                                                var39.method2503((float) var11.renderwidth / 2.0F + (float) var13, (float) var11.renderheight / 2.0F + (float) var14, var11.renderwidth * 4096 / var40, var11.field1783);
                                            } else if (var11.renderwidth == var40 && var11.renderheight == var41) {
                                                var39.method2500(var13, var14);
                                            } else {
                                                var39.method2513(var13, var14, var11.renderwidth, var11.renderheight);
                                            }
                                        }
                                    } else if (Component.field1761) {
                                        requestRedrawComponent(var11);
                                    }
                                }
                            } else if (var11.type == 6) {
                                Statics.renderer.method509();
                                world.getEnvironmentManager().method8158();
                                Model var50 = null;
                                int var51 = 2048;
                                if (var11.field1831 != 0) {
                                    var51 |= 0x80000;
                                }
                                int var52 = 0;
                                if (var11.invobject != -1) {
                                    ObjType var53 = Statics.objTypes.get(var11.invobject);
                                    if (var53 != null) {
                                        ObjType var54 = var53.method12242(var11.invcount);
                                        var50 = var54.method12241(Statics.renderer, var51, 1, var11.invwearcol ? Statics.localPlayerEntity.model : null, var11.field1789, 0, 0, 0, 0);
                                        if (var50 == null) {
                                            requestRedrawComponent(var11);
                                        } else {
                                            var52 = -var50.YA() >> 1;
                                        }
                                    }
                                } else if (var11.field1806 == 3) {
                                    int var55 = var11.field1838;
                                    if (var55 >= 0 && var55 < 2048) {
                                        PlayerEntity var56 = players[var55];
                                        if (var56 != null && (currentPlayerUid == var55 || StringTools.method1347(var56.nameUnfiltered) == var11.field1832)) {
                                            var50 = var11.method3174(Statics.renderer, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.objTypes, Statics.field566, Statics.field2669, var11.field1789, var56.model);
                                            if (var50 == null && Component.field1761) {
                                                requestRedrawComponent(var11);
                                            }
                                        }
                                    }
                                } else if (var11.field1806 == 5) {
                                    int var57 = var11.field1838;
                                    if (var57 >= 0 && var57 < 2048) {
                                        PlayerEntity var58 = players[var57];
                                        if (var58 != null && (currentPlayerUid == var57 || StringTools.method1347(var58.nameUnfiltered) == var11.field1832)) {
                                            var50 = var58.model.method8244(Statics.renderer, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.objTypes, Statics.field566, Statics.field2669, var11.field1789, null, null, null, 0, true, Statics.wearposDefaults);
                                        }
                                    }
                                } else if (var11.field1806 == 8 || var11.field1806 == 9) {
                                    ClientInvCache var59 = ClientInvCache.method11708(var11.field1838, false);
                                    if (var59 != null) {
                                        var50 = var59.method14751(Statics.renderer, var51, var11.field1789, var11.field1832, var11.field1806 == 9, var11.invwearcol ? Statics.localPlayerEntity.model : null);
                                    }
                                } else if (var11.field1789 != null && var11.field1789.method11767()) {
                                    var50 = var11.method3174(Statics.renderer, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.objTypes, Statics.field566, Statics.field2669, var11.field1789, Statics.localPlayerEntity.model);
                                    if (var50 == null && Component.field1761) {
                                        requestRedrawComponent(var11);
                                    }
                                } else {
                                    var50 = var11.method3174(Statics.renderer, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.objTypes, Statics.field566, Statics.field2669, null, Statics.localPlayerEntity.model);
                                    if (var50 == null && Component.field1761) {
                                        requestRedrawComponent(var11);
                                    }
                                }
                                if (var50 != null) {
                                    if (var11.field1831 != 0) {
                                        var50.PA(var11.field1828, var11.field1809, var11.field1830, var11.field1831);
                                    }
                                    int var60;
                                    if (var11.field1819 > 0) {
                                        var60 = (var11.renderwidth << 9) / var11.field1819;
                                    } else {
                                        var60 = 512;
                                    }
                                    int var61;
                                    if (var11.field1895 > 0) {
                                        var61 = (var11.renderheight << 9) / var11.field1895;
                                    } else {
                                        var61 = 512;
                                    }
                                    int var62 = var11.renderwidth / 2 + var13;
                                    int var63 = var11.renderheight / 2 + var14;
                                    if (!var11.field1816) {
                                        var62 += var11.field1811 * var60 >> 9;
                                        var63 += var11.field1916 * var61 >> 9;
                                    }
                                    field8925.method5157();
                                    Statics.renderer.method524(field8925);
                                    Matrix4x4 var64 = Statics.renderer.method781();
                                    int var65 = world.method6096();
                                    int var66 = world.method6108();
                                    int var67 = var11.field1818 + var66;
                                    if (var11.field1821) {
                                        if (Statics.cameraState == 2) {
                                            if (var11.field1816) {
                                                var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, Statics.cam2.method3732(), Statics.cam2.method3778(), (float) Statics.canvasWid, (float) Statics.canvasHei, (float) var11.field1818);
                                            } else {
                                                var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, Statics.cam2.method3732(), Statics.cam2.method3778(), (float) Statics.canvasWid, (float) Statics.canvasHei, (float) (var11.field1818 << 2));
                                            }
                                        } else if (var11.field1816) {
                                            var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.canvasWid, (float) Statics.canvasHei, (float) var11.field1818);
                                        } else {
                                            var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.canvasWid, (float) Statics.canvasHei, (float) (var11.field1818 << 2));
                                        }
                                    } else if (Statics.cameraState == 2) {
                                        var64.method5397((float) var62, (float) var63, (float) var60, (float) var61, Statics.cam2.method3732(), Statics.cam2.method3778(), (float) Statics.canvasWid, (float) Statics.canvasHei);
                                    } else {
                                        var64.method5397((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.canvasWid, (float) Statics.canvasHei);
                                    }
                                    Statics.renderer.method784(var64);
                                    Statics.renderer.ba(2, 0);
                                    if (var11.field1822) {
                                        Statics.renderer.RA(false);
                                    }
                                    if (var11.field1816) {
                                        field8979.method5106(1.0F, 0.0F, 0.0F, Trig1.method5096(var11.field1812));
                                        field8979.method5178(0.0F, 1.0F, 0.0F, Trig1.method5096(var11.field1813));
                                        field8979.method5178(0.0F, 0.0F, 1.0F, Trig1.method5096(var11.field1814));
                                        field8979.method5116((float) var11.field1811, (float) var11.field1916, (float) var11.field1817);
                                    } else {
                                        int var68 = (var11.field1818 << 2) * Trig1.sin[var11.field1812 << 3] >> 14;
                                        int var69 = (var11.field1818 << 2) * Trig1.cos[var11.field1812 << 3] >> 14;
                                        field8979.method5106(0.0F, 0.0F, 1.0F, Trig1.method5096(-var11.field1814 << 3));
                                        field8979.method5178(0.0F, 1.0F, 0.0F, Trig1.method5096(var11.field1813 << 3));
                                        field8979.method5116((float) (var11.field1810 << 2), (float) ((var11.field1824 << 2) + var68 + var52), (float) ((var11.field1824 << 2) + var69));
                                        field8979.method5178(1.0F, 0.0F, 0.0F, Trig1.method5096(var11.field1812 << 3));
                                    }
                                    var11.method3119(Statics.renderer, var50, field8979, loopCycle);
                                    Statics.renderer.method515(true);
                                    Statics.renderer.r(arg2, arg3, arg4, arg5);
                                    if (field9114) {
                                        Statics.renderer.o(var13, var14, var11.renderwidth + var13, var11.renderheight + var14);
                                    }
                                    var50.method271(field8979, null, 1);
                                    if (!var11.field1821 && var11.field1840 != null) {
                                        Statics.renderer.method733(var11.field1840.method8109());
                                    }
                                    if (field9114) {
                                        Statics.renderer.r(arg2, arg3, arg4, arg5);
                                    }
                                    Statics.renderer.method515(false);
                                    Statics.renderer.L();
                                    Statics.renderer.r(arg2, arg3, arg4, arg5);
                                    if (var11.field1822) {
                                        Statics.renderer.RA(true);
                                    }
                                }
                            } else if (var11.type == 9) {
                                int var70;
                                int var71;
                                int var72;
                                int var73;
                                if (var11.field1796) {
                                    var70 = var13;
                                    var71 = var11.renderheight + var14;
                                    var72 = var11.renderwidth + var13;
                                    var73 = var14;
                                } else {
                                    var70 = var13;
                                    var71 = var14;
                                    var72 = var11.renderwidth + var13;
                                    var73 = var11.renderheight + var14;
                                }
                                if (var11.field1791 == 1) {
                                    Statics.renderer.method825(var70, var71, var72, var73, var11.colour | 0xFF000000, 0);
                                } else {
                                    Statics.renderer.method499(var70, var71, var72, var73, var11.colour | 0xFF000000, var11.field1791, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.kl(IILew;B)V")
    public static void drawDebug(int arg0, int arg1, Component arg2) {
        int var3 = arg2.renderwidth + arg0;
        int var4 = arg1 + 15;
        if (!field8926) {
            return;
        }
        int var5 = -256;
        if (field4121 < 20) {
            var5 = -65536;
        }
        Statics.field560.method862("Fps:" + field4121, var3, var4, var5, -1);
        var4 += 15;
        Runtime var6 = Runtime.getRuntime();
        long var7 = var6.totalMemory() / 1024L;
        long var9 = var7 - var6.freeMemory() / 1024L;
        int var11 = -256;
        if (var9 > 262144L) {
            var11 = -65536;
        }
        Statics.field560.method862("Mem:" + var9 + "/" + var7 + "k", var3, var4, var11, -1);
        var4 += 15;
        long var12 = gameConnection.pingProvider.method1232();
        String var14 = "N/A";
        if (var12 != -1L) {
            var14 = var12 + "ms";
            if (var12 > 500L) {
                var14 = TextUtil.createColourTag(16711680) + var14 + TextUtil.createColourTag(16776960);
            }
        }
        Statics.field560.method862("Game: In:" + gameConnection.inBytesPerSecond + "B/s " + "Out:" + gameConnection.outBytesPerSecond + "B/s " + "Ping:" + var14, var3, var4, -256, -1);
        var4 += 15;
        long var15 = lobbyConnection.pingProvider.method1232();
        String var17 = "N/A";
        if (var15 != -1L) {
            var17 = var15 + "ms";
            if (var15 > 500L) {
                var17 = TextUtil.createColourTag(16711680) + var17 + TextUtil.createColourTag(16776960);
            }
        }
        Statics.field560.method862("Lobby: In:" + lobbyConnection.inBytesPerSecond + "B/s " + "Out:" + lobbyConnection.outBytesPerSecond + "B/s " + "Ping:" + var17, var3, var4, -256, -1);
        var4 += 15;
        int var18 = Statics.renderer.za() / 1024;
        Statics.field560.method862("Offheap:" + var18 + "k", var3, var4, var18 > 65536 ? -65536 : -256, -1);
        var4 += 15;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field4456.length; var22++) {
            if (Statics.field4456[var22] != null) {
                var19 += Statics.field4456[var22].method14245();
                var20 += Statics.field4456[var22].method14241();
                var21 += Statics.field4456[var22].method14242();
            }
        }
        int var23 = var21 * 100 / var19;
        int var24 = var20 * 10000 / var19;
        String var25 = "Cache:" + StringComparator.method11664((long) var24, 2, true, Language.field6376) + "% (" + var23 + "%)";
        Statics.field2163.method862(var25, var3, var4, -256, -1);
        var4 += 12;
    }

    @ObfuscatedName("ps.ka(IB)Ljava/lang/String;")
    public static final String formatObjectCount(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + TextUtil.field488 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + TextUtil.createColourTag(65408) + var1.substring(0, var1.length() - 8) + LocalisedText.field6896.get(Statics.language) + " (" + var1 + ")" + TextUtil.END_COLOUR_TAG;
        } else if (var1.length() > 6) {
            return " " + TextUtil.createColourTag(16777215) + var1.substring(0, var1.length() - 4) + LocalisedText.field7004.get(Statics.language) + " (" + var1 + ")" + TextUtil.END_COLOUR_TAG;
        } else {
            return " " + TextUtil.createColourTag(16776960) + var1 + TextUtil.END_COLOUR_TAG;
        }
    }

    @ObfuscatedName("jx.kd(Lej;Lew;I)Lew;")
    public static final Component method4752(Interface arg0, Component arg1) {
        if (arg1.field1886 != -1) {
            return arg0.method3108(arg1.field1886);
        }
        if (!arg0.field1734) {
            int var2 = arg1.id >>> 16;
            IterableMapIterator var3 = new IterableMapIterator(field9075);
            for (SubInterface var4 = (SubInterface) var3.method11955(); var4 != null; var4 = (SubInterface) var3.next()) {
                if (var4.field9679 == var2) {
                    return Component.method11381((int) var4.field4228);
                }
            }
        }
        return null;
    }

    @ObfuscatedName("ae.kz(ZI)V")
    public static final void method1969(boolean arg0) {
        method11241(topLevelInterface, Statics.canvasWid, Statics.canvasHei, arg0);
    }

    @ObfuscatedName("eo.kf(Lej;Lew;B)V")
    public static void method3293(Interface arg0, Component arg1) {
        Component var2 = method4752(arg0, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.canvasWid;
            var4 = Statics.canvasHei;
        } else {
            var3 = var2.renderwidth;
            var4 = var2.renderheight;
        }
        method8063(arg1, var3, var4, false);
        method1742(arg1, var3, var4);
    }

    @ObfuscatedName("wb.kj(Lej;Lew;ZB)V")
    public static void method12722(Interface arg0, Component arg1, boolean arg2) {
        method5831(arg0.field1732, arg1, arg2);
    }

    @ObfuscatedName("lu.kw([Lew;Lew;ZI)V")
    public static void method5831(Component[] arg0, Component arg1, boolean arg2) {
        int var3 = arg1.field1790 == 0 ? arg1.renderwidth : arg1.field1790;
        int var4 = arg1.field1894 == 0 ? arg1.renderheight : arg1.field1894;
        method11323(arg0, arg1.id, var3, var4, arg2);
        if (arg1.sortedsubcomponents != null) {
            method11323(arg1.sortedsubcomponents, arg1.id, var3, var4, arg2);
        }
        SubInterface var5 = (SubInterface) field9075.getNode((long) arg1.id);
        if (var5 != null) {
            method11241(var5.field9679, var3, var4, arg2);
        }
        if (gameScreen != arg1) {
            return;
        }
        int var6 = ReceivePlayerPositions.highResolutionsCount;
        int[] var7 = ReceivePlayerPositions.highResolutionsIndices;
        for (int var8 = 0; var8 < var6; var8++) {
            PlayerEntity var9 = players[var7[var8]];
            if (var9 != null) {
                var9.method13969(var3, var4, arg2);
            }
        }
        for (int var10 = 0; var10 < npcCount; var10++) {
            int var11 = field9056[var10];
            ObjectNode var12 = (ObjectNode) npcs.getNode((long) var11);
            if (var12 != null) {
                ((PathingEntity) var12.value).method13969(var3, var4, arg2);
            }
        }
    }

    @ObfuscatedName("sq.ke(IIIZB)V")
    public static final void method11241(int arg0, int arg1, int arg2, boolean arg3) {
        if (Component.openInterface(arg0, null)) {
            method11323(Statics.field1756[arg0].field1732, -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("sr.km([Lew;IIIZI)V")
    public static void method11323(Component[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            Component var6 = arg0[var5];
            if (var6 != null && var6.field1886 == arg1) {
                method8063(var6, arg2, arg3, arg4);
                method1742(var6, arg2, arg3);
                if (var6.scrollx > var6.field1790 - var6.renderwidth) {
                    var6.scrollx = var6.field1790 - var6.renderwidth;
                }
                if (var6.scrollx < 0) {
                    var6.scrollx = 0;
                }
                if (var6.scrolly > var6.field1894 - var6.renderheight) {
                    var6.scrolly = var6.field1894 - var6.renderheight;
                }
                if (var6.scrolly < 0) {
                    var6.scrolly = 0;
                }
                if (var6.type == 0) {
                    method5831(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("qx.kg(Lew;IIZI)V")
    public static void method8063(Component arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.renderwidth;
        int var5 = arg0.renderheight;
        if (arg0.field1856 == 0) {
            arg0.renderwidth = arg0.field1910;
        } else if (arg0.field1856 == 1) {
            arg0.renderwidth = arg1 - arg0.field1910;
        } else if (arg0.field1856 == 2) {
            arg0.renderwidth = arg0.field1910 * arg1 >> 14;
        }
        if (arg0.field1771 == 0) {
            arg0.renderheight = arg0.field1775;
        } else if (arg0.field1771 == 1) {
            arg0.renderheight = arg2 - arg0.field1775;
        } else if (arg0.field1771 == 2) {
            arg0.renderheight = arg0.field1775 * arg2 >> 14;
        }
        if (arg0.field1856 == 4) {
            arg0.renderwidth = arg0.renderheight * arg0.field1923 / arg0.field1781;
        }
        if (arg0.field1771 == 4) {
            arg0.renderheight = arg0.renderwidth * arg0.field1781 / arg0.field1923;
        }
        if (field9111 && (getComponentEvents(arg0).field9416 != 0 || arg0.type == 0)) {
            if (arg0.renderheight < 5 && arg0.renderwidth < 5) {
                arg0.renderheight = 5;
                arg0.renderwidth = 5;
            } else {
                if (arg0.renderheight <= 0) {
                    arg0.renderheight = 5;
                }
                if (arg0.renderwidth <= 0) {
                    arg0.renderwidth = 5;
                }
            }
        }
        if (Component.field1847 == arg0.clientcode) {
            gameScreen = arg0;
        }
        if (arg3 && arg0.field1778 != null && (arg0.renderwidth != var4 || arg0.renderheight != var5)) {
            HookRequest var6 = new HookRequest();
            var6.component = arg0;
            var6.onop = arg0.field1778;
            hookRequests.addFirst(var6);
        }
    }

    @ObfuscatedName("ag.kk(Lew;III)V")
    public static void method1742(Component arg0, int arg1, int arg2) {
        if (arg0.field1829 == 0) {
            arg0.field1776 = arg0.field1772;
        } else if (arg0.field1829 == 1) {
            arg0.field1776 = (arg1 - arg0.renderwidth) / 2 + arg0.field1772;
        } else if (arg0.field1829 == 2) {
            arg0.field1776 = arg1 - arg0.renderwidth - arg0.field1772;
        } else if (arg0.field1829 == 3) {
            arg0.field1776 = arg0.field1772 * arg1 >> 14;
        } else if (arg0.field1829 == 4) {
            arg0.field1776 = (arg0.field1772 * arg1 >> 14) + (arg1 - arg0.renderwidth) / 2;
        } else {
            arg0.field1776 = arg1 - arg0.renderwidth - (arg0.field1772 * arg1 >> 14);
        }
        if (arg0.field1769 == 0) {
            arg0.field1777 = arg0.field1774;
        } else if (arg0.field1769 == 1) {
            arg0.field1777 = (arg2 - arg0.renderheight) / 2 + arg0.field1774;
        } else if (arg0.field1769 == 2) {
            arg0.field1777 = arg2 - arg0.renderheight - arg0.field1774;
        } else if (arg0.field1769 == 3) {
            arg0.field1777 = arg0.field1774 * arg2 >> 14;
        } else if (arg0.field1769 == 4) {
            arg0.field1777 = (arg0.field1774 * arg2 >> 14) + (arg2 - arg0.renderheight) / 2;
        } else {
            arg0.field1777 = arg2 - arg0.renderheight - (arg0.field1774 * arg2 >> 14);
        }
        if (!field9111 || getComponentEvents(arg0).field9416 == 0 && arg0.type != 0) {
            return;
        }
        if (arg0.field1776 < 0) {
            arg0.field1776 = 0;
        } else if (arg0.renderwidth + arg0.field1776 > arg1) {
            arg0.field1776 = arg1 - arg0.renderwidth;
        }
        if (arg0.field1777 < 0) {
            arg0.field1777 = 0;
        } else if (arg0.renderheight + arg0.field1777 > arg2) {
            arg0.field1777 = arg2 - arg0.renderheight;
        }
    }

    @ObfuscatedName("oc.lk(I)V")
    public static void method7380() {
        world.method6111();
        MiniMap.method7992();
        method5025(true);
        VideoTypeList.method4743();
        System.gc();
        Statics.renderer.ba(2, 0);
    }

    @ObfuscatedName("py.li(I)V")
    public static void closeMAp() {
        setState(16);
        ClientWorldMap.method3465();
        System.gc();
    }

    @ObfuscatedName("jr.lb(I)V")
    public static final void updateTopLevelInterface() {
        if (topLevelInterface == -1) {
            return;
        }
        int var0 = Statics.mouse.getX();
        int var1 = Statics.mouse.getY();
        BasicMouseEvent var2 = (BasicMouseEvent) field9136.last();
        if (var2 != null) {
            var0 = var2.getX();
            var1 = var2.getY();
        }
        if (dragComponent != null && Statics.field9561 == field9116) {
            field9037 = true;
            field9203 = 0;
            field8942 = 0;
            field9123 = Statics.canvasWid;
            field8968 = Statics.canvasHei;
        }
        updateInterface(null, topLevelInterface, 0, 0, Statics.canvasWid, Statics.canvasHei, 0, 0, var0, var1);
        if (Statics.field4960 != null) {
            ClientWorldMap.updateComponent(var0, var1);
        }
    }

    @ObfuscatedName("afv.lv(Laep;IIIIIIIIII)V")
    public static final void updateInterface(SubInterface arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!Component.openInterface(arg1, null)) {
            return;
        }
        if (arg0 == null || arg0.process()) {
            Interface var10 = Statics.field1756[arg1];
            updateLayer(var10, var10.getComponents(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        } else {
            closeSubInterface(arg0, true, false);
        }
    }

    @ObfuscatedName("client.ls(Lej;[Lew;IIIIIIIII)V")
    public static final void updateLayer(Interface arg0, Component[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int mouseX, int mouseY) {
        label998:
        for (int var11 = 0; var11 < arg1.length; var11++) {
            Component var12 = arg1[var11];
            if (var12 != null && var12.field1886 == arg2) {
                int var13 = var12.field1776 + arg7;
                int var14 = var12.field1777 + arg8;
                int var15;
                int var16;
                int var17;
                int var18;
                if (var12.type == 2) {
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                    var18 = arg6;
                } else {
                    int var19 = var12.renderwidth + var13;
                    int var20 = var12.renderheight + var14;
                    if (var12.type == 9) {
                        var19++;
                        var20++;
                    }
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var14 > arg4 ? var14 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                    var18 = var20 < arg6 ? var20 : arg6;
                }
                if (var12.type == 0 || var12.hashook || getComponentEvents(var12).field9416 != 0 || field9116 == var12 || Component.MINIMAP == var12.clientcode || Component.MOUSE_OVER_TEXT == var12.clientcode || Component.field1847 == var12.clientcode || Component.field1742 == var12.clientcode) {
                    if (!method14315(var12)) {
                        if (dragComponent == var12 && method12723(dragComponent)) {
                            field9080 = true;
                            field9126 = var13;
                            field9127 = var14;
                        }
                        if (var12.field1842 || var15 < var17 && var16 < var18) {
                            if (var12.field1787 && mouseX >= var15 && mouseY >= var16 && mouseX < var17 && mouseY < var18) {
                                for (HookRequest var21 = (HookRequest) hookRequests.last(); var21 != null; var21 = (HookRequest) hookRequests.prev()) {
                                    if (var21.isMouseHook) {
                                        var21.remove();
                                        var21.component.field1917 = false;
                                    }
                                }
                                if (Statics.field8727 == 0) {
                                    dragComponent = null;
                                    field9116 = null;
                                }
                                field9150 = 0;
                                ClientWorldMap.field9754 = false;
                                minimapClicked = false;
                                if (!MiniMenu.open) {
                                    MiniMenu.method1401();
                                }
                            }
                            boolean var22 = var12.field1805 && var12.type == 5 && var12.field1794 == 0 && var12.field1906 < 0 && var12.invobject == -1 && var12.field1737 == -1 && !var12.field1799 && var12.field1783 == 0;
                            boolean var23 = false;
                            if (mouseX >= var15 && mouseY >= var16 && mouseX < var17 && mouseY < var18) {
                                if (var22) {
                                    Graphic var24 = var12.method3124(Statics.renderer);
                                    if (var24 != null && var12.renderwidth == var24.field1728 && var12.renderheight == var24.field1727) {
                                        int var25 = mouseX - var13;
                                        int var26 = mouseY - var14;
                                        if (var26 >= 0 && var26 < var24.field1729.length) {
                                            int var27 = var24.field1729[var26];
                                            if (var25 >= var27 && var25 <= var24.field1726[var26] + var27) {
                                                var23 = true;
                                            }
                                        }
                                    } else {
                                        var23 = true;
                                    }
                                } else {
                                    var23 = true;
                                }
                            }
                            if (!targetModeActive && var23) {
                                if (var12.field1786 >= 0) {
                                    defaultCursor = var12.field1786;
                                } else if (var12.field1787) {
                                    defaultCursor = -1;
                                }
                            }
                            if (!MiniMenu.open && var23 && !arg0.field1734) {
                                MiniMenu.method881(var12, mouseX - var13, mouseY - var14);
                            }
                            boolean var28 = false;
                            if (Statics.mouse.method7250() && var23) {
                                var28 = true;
                            }
                            boolean var29 = false;
                            BasicMouseEvent var30 = (BasicMouseEvent) field9136.last();
                            if (var30 != null && var30.method15181() == 0 && var30.getX() >= var15 && var30.getY() >= var16 && var30.getX() < var17 && var30.getY() < var18) {
                                if (var22) {
                                    Graphic var31 = var12.method3124(Statics.renderer);
                                    if (var31 != null && var12.renderwidth == var31.field1728 && var12.renderheight == var31.field1727) {
                                        int var32 = var30.getX() - var13;
                                        int var33 = var30.getY() - var14;
                                        if (var33 >= 0 && var33 < var31.field1729.length) {
                                            int var34 = var31.field1729[var33];
                                            if (var32 >= var34 && var32 <= var31.field1726[var33] + var34) {
                                                var29 = true;
                                            }
                                        }
                                    } else {
                                        var29 = true;
                                    }
                                } else {
                                    var29 = true;
                                }
                            }
                            if (var12.field1842 && !DeveloperConsole.method14925()) {
                                for (int var35 = 0; var35 < var12.field1905.length; var35++) {
                                    boolean var36 = false;
                                    boolean var37 = false;
                                    if (var12.field1846[var35] > 0) {
                                        for (int var38 = 0; var38 < field8950; var38++) {
                                            if (var12.field1846[var35] == field8951[var38].method7298()) {
                                                var36 = true;
                                                if (var12.field1851 == null || var12.field1851[var35] <= loopCycle) {
                                                    var37 = true;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    if (!var36 && var12.field1905[var35] != null) {
                                        for (int var39 = 0; var39 < var12.field1905[var35].length; var39++) {
                                            if (Statics.keyboard.isKeyHeld(var12.field1905[var35][var39])) {
                                                var36 = true;
                                                if (var12.field1851 != null && var12.field1851[var35] > loopCycle) {
                                                    break;
                                                }
                                                byte var40 = var12.field1844[var35][var39];
                                                if (var40 == 0 || ((var40 & 0x8) == 0 || !Statics.keyboard.isKeyHeld(86) && !Statics.keyboard.isKeyHeld(82) && !Statics.keyboard.isKeyHeld(81)) && ((var40 & 0x2) == 0 || Statics.keyboard.isKeyHeld(86)) && ((var40 & 0x1) == 0 || Statics.keyboard.isKeyHeld(82)) && ((var40 & 0x4) == 0 || Statics.keyboard.isKeyHeld(81))) {
                                                    var37 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (var37) {
                                        if (var35 < 10) {
                                            method5716(var35 + 1, var12.id, var12.parentlayer, "");
                                        } else if (var35 == 10) {
                                            cancelTargetMode();
                                            ServerKeyProperties var41 = getComponentEvents(var12);
                                            Statics.method11974(var12, var41.method14928(), var41.field9423);
                                            field9103 = getComponentTargetVerb(var12);
                                            if (field9103 == null) {
                                                field9103 = "Null";
                                            }
                                            field9151 = var12.opbase + TextUtil.createColourTag(16777215);
                                        }
                                        int var42 = var12.field1845[var35];
                                        if (var12.field1851 == null) {
                                            var12.field1851 = new int[var12.field1905.length];
                                        }
                                        if (var42 == 0) {
                                            var12.field1851[var35] = Integer.MAX_VALUE;
                                        } else {
                                            var12.field1851[var35] = loopCycle + var42;
                                        }
                                    }
                                    if (!var36 && var12.field1851 != null) {
                                        var12.field1851[var35] = 0;
                                    }
                                }
                            }
                            if (var29) {
                                method8390(var12, var30.getX() - var13, var30.getY() - var14);
                            }
                            if (dragComponent != null && dragComponent != var12 && var23 && getComponentEvents(var12).method14930()) {
                                field9119 = var12;
                            }
                            if (field9116 == var12) {
                                field9037 = true;
                                field9203 = var13;
                                field8942 = var14;
                                field9123 = field9116.renderwidth;
                                field8968 = field9116.renderheight;
                            }

                            if (var12.hashook || var12.clientcode != 0) {
                                if (var23 && field9002 != 0 && var12.onscrollwheel != null) {
                                    HookRequest var43 = new HookRequest();
                                    var43.isMouseHook = true;
                                    var43.component = var12;
                                    var43.mouseY = field9002;
                                    var43.onop = var12.onscrollwheel;
                                    hookRequests.addFirst(var43);
                                }

                                if (dragComponent != null) {
                                    var29 = false;
                                    var28 = false;
                                } else if (MiniMenu.open || Component.WORLD_MAP != var12.clientcode && field9150 > 0) {
                                    var29 = false;
                                    var28 = false;
                                    var23 = false;
                                }

                                if (var12.clientcode != 0) {
                                    if (Component.field1847 == var12.clientcode || Component.field1742 == var12.clientcode) {
                                        gameScreen = var12;
                                        Environment var66 = world.getEnvironmentManager().getEnvironment();
                                        if (var66.getSkybox() != null && !Statics.asyncRebuild.processingRequest()) {
                                            var66.getSkybox().method6366(Statics.renderer, var12.renderheight, Statics.options.skyDetail.getValue());
                                        }

                                        if (Component.field1847 == var12.clientcode) {
                                            if (!MiniMenu.open && mouseX >= var15 && mouseY >= var16 && mouseX < var17 && mouseY < var18) {
                                                MiniMenu.method4866(Statics.renderer, mouseX, mouseY);

                                                for (CoverMarkerClickbox var67 = (CoverMarkerClickbox) coverMarkerClickboxes.method11649(); var67 != null; var67 = (CoverMarkerClickbox) coverMarkerClickboxes.method11644()) {
                                                    if (mouseX >= var67.minX && mouseX < var67.maxX && mouseY >= var67.minY && mouseY < var67.maxY) {
                                                        MiniMenu.method1401();
                                                        MiniMenu.addPathingEntityEntries(var67.field9250);
                                                    }
                                                }
                                            }
                                        }

                                        int var68 = ReceivePlayerPositions.highResolutionsCount;
                                        int[] var69 = ReceivePlayerPositions.highResolutionsIndices;

                                        for (int var70 = 0; var70 < var68; var70++) {
                                            PlayerEntity var71 = players[var69[var70]];
                                            if (var71 != null) {
                                                ScriptRunner.method2842(ClientTriggerType.field7300, -1, -1, var71, var69[var70]);
                                                var71.method13967(var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, mouseX, mouseY);
                                            }
                                        }

                                        int var72 = 0;
                                        while (true) {
                                            if (var72 >= npcCount) {
                                                continue label998;
                                            }
                                            int var73 = field9056[var72];
                                            ObjectNode var74 = (ObjectNode) npcs.getNode((long) var73);
                                            if (var74 != null) {
                                                ScriptRunner.method2842(ClientTriggerType.field7315, ((NpcEntity) var74.value).type.field7211, -1, (PathingEntity) var74.value, var73);
                                                ((PathingEntity) var74.value).method13967(var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, mouseX, mouseY);
                                            }
                                            var72++;
                                        }
                                    }

                                    if (Component.MINIMAP == var12.clientcode) {
                                        Graphic var44 = var12.method3124(Statics.renderer);
                                        if (var44 == null || MiniMap.field762 != 0 && MiniMap.field762 != 3 || MiniMenu.open || mouseX < var15 || mouseY < var16 || mouseX >= var17 || mouseY >= var18) {
                                            continue;
                                        }

                                        int var45 = mouseX - var13;
                                        int var46 = mouseY - var14;
                                        int var47 = var44.field1729[var46];
                                        if (var45 < var47 || var45 > var44.field1726[var46] + var47) {
                                            continue;
                                        }

                                        int var48 = var45 - var12.renderwidth / 2;
                                        int var49 = var46 - var12.renderheight / 2;
                                        int var50;
                                        if (Statics.cameraState == 5) {
                                            var50 = (int) field9021 & 0x3FFF;
                                        } else if (Statics.cameraState == 2) {
                                            var50 = (int) ((double) Statics.cam2.method3791() * 2607.5945876176133D);
                                        } else {
                                            var50 = field9087 + (int) field9021 & 0x3FFF;
                                        }

                                        int var51 = Trig1.sin[var50];
                                        int var52 = Trig1.cos[var50];
                                        if (Statics.cameraState != 5) {
                                            var51 = (field8976 + 256) * var51 >> 8;
                                            var52 = (field8976 + 256) * var52 >> 8;
                                        }

                                        int var53 = var48 * var52 + var49 * var51 >> 14;
                                        int var54 = var49 * var52 - var48 * var51 >> 14;
                                        int var55;
                                        int var56;
                                        if (Statics.cameraState == 5) {
                                            var55 = (field9154 >> 9) + (var53 >> 2);
                                            var56 = (field9019 >> 9) - (var54 >> 2);
                                        } else {
                                            int var57 = (Statics.localPlayerEntity.size() - 1) * 256;
                                            Vector3 var58 = Statics.localPlayerEntity.getTransform().trans;
                                            var55 = ((int) var58.x - var57 >> 9) + (var53 >> 2);
                                            var56 = ((int) var58.z - var57 >> 9) - (var54 >> 2);
                                        }

                                        if (targetModeActive && (Statics.targetMask & 0x40) != 0) {
                                            Component var59 = Component.get(Statics.activeComponentParentLayer, activeComponentId);
                                            if (var59 == null) {
                                                cancelTargetMode();
                                            } else {
                                                Statics.addEntry(field9103, " " + TextUtil.ARROW, Statics.targetCursor, 59, var12.invobject, 1L, var55, var56, true, false, (long) (var12.parentlayer << 32 | var12.id), true);
                                            }
                                            continue;
                                        }

                                        if (modeGame == ModeGame.STELLARDAWN) {
                                            Statics.addEntry(LocalisedText.MINIMENU_FACE_HERE.get(Statics.language), "", -1, 60, -1, 1L, var55, var56, true, false, 0L, true);
                                        }

                                        Statics.addEntry(Statics.field2400, "", field9172, 23, -1, 1L, var55, var56, true, false, 0L, true);
                                        continue;
                                    }

                                    if (Component.WORLD_MAP == var12.clientcode) {
                                        Statics.field4960 = var12;

                                        if (var23) {
                                            ClientWorldMap.field9754 = true;
                                        }

                                        if (var29) {
                                            int var60 = (int) ((double) (var30.getX() - var13 - var12.renderwidth / 2) * 2.0D / (double) Statics.zoom);
                                            int var61 = (int) -((double) (var30.getY() - var14 - var12.renderheight / 2) * 2.0D / (double) Statics.zoom);
                                            int var62 = Statics.displayX + var60 + Statics.currentAreaDisplayMinX;
                                            int var63 = Statics.displayZ + var61 + Statics.currentAreaDisplayMinZ;
                                            WorldMapAreaMetadata var64 = ClientWorldMap.getCurrentArea();
                                            if (var64 == null) {
                                                continue;
                                            }

                                            int[] var65 = new int[3];
                                            var64.getSourceCoord(var62, var63, var65);
                                            if (var65 != null) {
                                                if (Statics.keyboard.isKeyHeld(82) && userStaffModLevel > 0) {
                                                    Statics.method2617(var65[0], var65[1], var65[2]);
                                                    continue;
                                                }

                                                minimapClicked = true;
                                                Statics.field669 = var65[0];
                                                Statics.field9405 = var65[1];
                                                Statics.field6665 = var65[2];
                                            }

                                            field9150 = 1;
                                            field9013 = false;
                                            field9160 = Statics.mouse.getX();
                                            field8977 = Statics.mouse.getY();
                                            continue;
                                        }

                                        if (var28 && field9150 > 0) {
                                            if (field9150 == 1 && (field9160 != Statics.mouse.getX() || field8977 != Statics.mouse.getY())) {
                                                Statics.field5014 = Statics.displayX;
                                                Statics.field7338 = Statics.displayZ;
                                                field9150 = 2;
                                            }

                                            if (field9150 == 2) {
                                                field9013 = true;
                                                ClientWorldMap.setDisplayX(Statics.field5014 + (int) ((double) (field9160 - Statics.mouse.getX()) * 2.0D / (double) Statics.targetZoom));
                                                ClientWorldMap.setDisplayY(Statics.field7338 - (int) ((double) (field8977 - Statics.mouse.getY()) * 2.0D / (double) Statics.targetZoom));
                                            }

                                            continue;
                                        }

                                        if (field9150 > 0 && !field9013) {
                                            if ((field8933 == 1 || MiniMenu.method16114()) && MiniMenu.length > 2) {
                                                MiniMenu.method13889(field9160, field8977);
                                            } else if (MiniMenu.hasEntries()) {
                                                MiniMenu.method13889(field9160, field8977);
                                            }
                                        }

                                        field9150 = 0;
                                        continue;
                                    }

                                    if (Component.WORLD_MAP_OVERVIEW == var12.clientcode) {
                                        if (var28) {
                                            ClientWorldMap.method12692(Statics.mouse.getX() - var13, Statics.mouse.getY() - var14, var12.renderwidth, var12.renderheight);
                                        }

                                        continue;
                                    }

                                    if (Component.MOUSE_OVER_TEXT == var12.clientcode) {
                                        MiniMenu.updateMouseOverText(var12, var13, var14);
                                        continue;
                                    }
                                }

                                if (!var12.field1858 && var29) {
                                    var12.field1858 = true;
                                    if (var12.field1912 != null) {
                                        HookRequest var75 = new HookRequest();
                                        var75.isMouseHook = true;
                                        var75.component = var12;
                                        var75.mouseX = var30.getX() - var13;
                                        var75.mouseY = var30.getY() - var14;
                                        var75.onop = var12.field1912;
                                        hookRequests.addFirst(var75);
                                    }
                                }
                                if (var12.field1858 && var28 && var12.field1864 != null) {
                                    HookRequest var76 = new HookRequest();
                                    var76.isMouseHook = true;
                                    var76.component = var12;
                                    var76.mouseX = Statics.mouse.getX() - var13;
                                    var76.mouseY = Statics.mouse.getY() - var14;
                                    var76.onop = var12.field1864;
                                    hookRequests.addFirst(var76);
                                }
                                if (var12.field1858 && !var28) {
                                    var12.field1858 = false;
                                    if (var12.field1773 != null) {
                                        HookRequest var77 = new HookRequest();
                                        var77.isMouseHook = true;
                                        var77.component = var12;
                                        var77.mouseX = Statics.mouse.getX() - var13;
                                        var77.mouseY = Statics.mouse.getY() - var14;
                                        var77.onop = var12.field1773;
                                        field9125.addFirst(var77);
                                    }
                                }
                                if (var28 && var12.field1866 != null) {
                                    HookRequest var78 = new HookRequest();
                                    var78.isMouseHook = true;
                                    var78.component = var12;
                                    var78.mouseX = Statics.mouse.getX() - var13;
                                    var78.mouseY = Statics.mouse.getY() - var14;
                                    var78.onop = var12.field1866;
                                    hookRequests.addFirst(var78);
                                }
                                if (!var12.field1917 && var23) {
                                    var12.field1917 = true;
                                    if (var12.field1867 != null) {
                                        HookRequest var79 = new HookRequest();
                                        var79.isMouseHook = true;
                                        var79.component = var12;
                                        var79.mouseX = Statics.mouse.getX() - var13;
                                        var79.mouseY = Statics.mouse.getY() - var14;
                                        var79.onop = var12.field1867;
                                        hookRequests.addFirst(var79);
                                    }
                                }
                                if (var12.field1917 && var23 && var12.field1868 != null) {
                                    HookRequest var80 = new HookRequest();
                                    var80.isMouseHook = true;
                                    var80.component = var12;
                                    var80.mouseX = Statics.mouse.getX() - var13;
                                    var80.mouseY = Statics.mouse.getY() - var14;
                                    var80.onop = var12.field1868;
                                    hookRequests.addFirst(var80);
                                }
                                if (var12.field1917 && !var23) {
                                    var12.field1917 = false;
                                    if (var12.field1888 != null) {
                                        HookRequest var81 = new HookRequest();
                                        var81.isMouseHook = true;
                                        var81.component = var12;
                                        var81.mouseX = Statics.mouse.getX() - var13;
                                        var81.mouseY = Statics.mouse.getY() - var14;
                                        var81.onop = var12.field1888;
                                        field9125.addFirst(var81);
                                    }
                                }
                                if (var12.field1784 != null) {
                                    HookRequest var82 = new HookRequest();
                                    var82.component = var12;
                                    var82.onop = var12.field1784;
                                    field9159.addFirst(var82);
                                }
                                if (var12.field1880 != null && field9036 > var12.field1869) {
                                    if (var12.field1843 == null || field9036 - var12.field1869 > 32) {
                                        HookRequest var87 = new HookRequest();
                                        var87.component = var12;
                                        var87.onop = var12.field1880;
                                        hookRequests.addFirst(var87);
                                    } else {
                                        label835:
                                        for (int var83 = var12.field1869; var83 < field9036; var83++) {
                                            int var84 = field9141[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var12.field1843.length; var85++) {
                                                if (var12.field1843[var85] == var84) {
                                                    HookRequest var86 = new HookRequest();
                                                    var86.component = var12;
                                                    var86.onop = var12.field1880;
                                                    hookRequests.addFirst(var86);
                                                    break label835;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1869 = field9036;
                                }
                                if (var12.field1882 != null && field9144 > var12.field1924) {
                                    if (var12.field1883 == null || field9144 - var12.field1924 > 32) {
                                        HookRequest var92 = new HookRequest();
                                        var92.component = var12;
                                        var92.onop = var12.field1882;
                                        hookRequests.addFirst(var92);
                                    } else {
                                        label811:
                                        for (int var88 = var12.field1924; var88 < field9144; var88++) {
                                            int var89 = field9143[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var12.field1883.length; var90++) {
                                                if (var12.field1883[var90] == var89) {
                                                    HookRequest var91 = new HookRequest();
                                                    var91.component = var12;
                                                    var91.onop = var12.field1882;
                                                    hookRequests.addFirst(var91);
                                                    break label811;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1924 = field9144;
                                }
                                if (var12.field1874 != null && field9183 > var12.field1920) {
                                    if (var12.field1875 == null || field9183 - var12.field1920 > 32) {
                                        HookRequest var97 = new HookRequest();
                                        var97.component = var12;
                                        var97.onop = var12.field1874;
                                        hookRequests.addFirst(var97);
                                    } else {
                                        label787:
                                        for (int var93 = var12.field1920; var93 < field9183; var93++) {
                                            int var94 = field9135[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var12.field1875.length; var95++) {
                                                if (var12.field1875[var95] == var94) {
                                                    HookRequest var96 = new HookRequest();
                                                    var96.component = var12;
                                                    var96.onop = var12.field1874;
                                                    hookRequests.addFirst(var96);
                                                    break label787;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1920 = field9183;
                                }
                                if (var12.field1876 != null && field9158 > var12.field1820) {
                                    if (var12.field1877 == null || field9158 - var12.field1820 > 32) {
                                        HookRequest var102 = new HookRequest();
                                        var102.component = var12;
                                        var102.onop = var12.field1876;
                                        hookRequests.addFirst(var102);
                                    } else {
                                        label763:
                                        for (int var98 = var12.field1820; var98 < field9158; var98++) {
                                            int var99 = field9137[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var12.field1877.length; var100++) {
                                                if (var12.field1877[var100] == var99) {
                                                    HookRequest var101 = new HookRequest();
                                                    var101.component = var12;
                                                    var101.onop = var12.field1876;
                                                    hookRequests.addFirst(var101);
                                                    break label763;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1820 = field9158;
                                }
                                if (var12.field1878 != null && field9140 > var12.field1922) {
                                    if (var12.field1879 == null || field9140 - var12.field1922 > 32) {
                                        HookRequest var107 = new HookRequest();
                                        var107.component = var12;
                                        var107.onop = var12.field1878;
                                        hookRequests.addFirst(var107);
                                    } else {
                                        label739:
                                        for (int var103 = var12.field1922; var103 < field9140; var103++) {
                                            int var104 = field9139[var103 & 0x1F];
                                            for (int var105 = 0; var105 < var12.field1879.length; var105++) {
                                                if (var12.field1879[var105] == var104) {
                                                    HookRequest var106 = new HookRequest();
                                                    var106.component = var12;
                                                    var106.onop = var12.field1878;
                                                    hookRequests.addFirst(var106);
                                                    break label739;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1922 = field9140;
                                }
                                if (var12.field1884 != null && field9146 > var12.field1925) {
                                    if (var12.field1885 == null || field9146 - var12.field1925 > 32) {
                                        HookRequest var112 = new HookRequest();
                                        var112.component = var12;
                                        var112.onop = var12.field1884;
                                        hookRequests.addFirst(var112);
                                    } else {
                                        label715:
                                        for (int var108 = var12.field1925; var108 < field9146; var108++) {
                                            int var109 = field9145[var108 & 0x1F];
                                            for (int var110 = 0; var110 < var12.field1885.length; var110++) {
                                                if (var12.field1885[var110] == var109) {
                                                    HookRequest var111 = new HookRequest();
                                                    var111.component = var12;
                                                    var111.onop = var12.field1884;
                                                    hookRequests.addFirst(var111);
                                                    break label715;
                                                }
                                            }
                                        }
                                    }
                                    var12.field1925 = field9146;
                                }
                                if (field9130 > var12.field1919 && var12.field1890 != null) {
                                    HookRequest var113 = new HookRequest();
                                    var113.component = var12;
                                    var113.onop = var12.field1890;
                                    hookRequests.addFirst(var113);
                                }
                                if (field9148 > var12.field1919 && var12.field1892 != null) {
                                    HookRequest var114 = new HookRequest();
                                    var114.component = var12;
                                    var114.onop = var12.field1892;
                                    hookRequests.addFirst(var114);
                                }
                                if (field9161 > var12.field1919 && var12.field1893 != null) {
                                    HookRequest var115 = new HookRequest();
                                    var115.component = var12;
                                    var115.onop = var12.field1893;
                                    hookRequests.addFirst(var115);
                                }
                                if (field9149 > var12.field1919 && var12.field1758 != null) {
                                    HookRequest var116 = new HookRequest();
                                    var116.component = var12;
                                    var116.onop = var12.field1758;
                                    hookRequests.addFirst(var116);
                                }
                                if (field8917 > var12.field1919 && var12.field1881 != null) {
                                    HookRequest var117 = new HookRequest();
                                    var117.component = var12;
                                    var117.onop = var12.field1881;
                                    hookRequests.addFirst(var117);
                                }
                                if (field9152 > var12.field1919 && var12.field1897 != null) {
                                    HookRequest var118 = new HookRequest();
                                    var118.component = var12;
                                    var118.onop = var12.field1897;
                                    hookRequests.addFirst(var118);
                                }
                                if (miscTransmitNum > var12.field1919 && var12.field1896 != null) {
                                    HookRequest var119 = new HookRequest();
                                    var119.component = var12;
                                    var119.onop = var12.field1896;
                                    hookRequests.addFirst(var119);
                                }
                                var12.field1919 = interfaceUpdateNum;
                                if (var12.field1891 != null) {
                                    for (int var120 = 0; var120 < field8950; var120++) {
                                        HookRequest var121 = new HookRequest();
                                        var121.component = var12;
                                        var121.key = field8951[var120].method7286();
                                        var121.keychar = field8951[var120].method7298();
                                        var121.onop = var12.field1891;
                                        hookRequests.addFirst(var121);
                                    }
                                }
                                if (cameraFinished && var12.field1900 != null) {
                                    HookRequest var122 = new HookRequest();
                                    var122.component = var12;
                                    var122.onop = var12.field1900;
                                    hookRequests.addFirst(var122);
                                }
                            }
                            if (var12.type == 5 && var12.field1906 != -1) {
                                var12.method3181(Statics.field4678, Statics.field6360).method6366(Statics.renderer, var12.renderheight, Statics.options.skyDetail.getValue());
                            }
                            Statics.method5567(var12);
                            if (var12.type == 0) {
                                updateLayer(arg0, arg1, var12.id, var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, mouseX, mouseY);
                                if (var12.sortedsubcomponents != null) {
                                    updateLayer(arg0, var12.sortedsubcomponents, var12.id, var15, var16, var17, var18, var13 - var12.scrollx, var14 - var12.scrolly, mouseX, mouseY);
                                }
                                SubInterface var123 = (SubInterface) field9075.getNode((long) var12.id);
                                if (var123 != null) {
                                    if (modeGame == ModeGame.field6407 && var123.field9678 == 0 && !MiniMenu.open && var23 && !field9111) {
                                        MiniMenu.method1401();
                                    }
                                    updateInterface(var123, var123.field9679, var15, var16, var17, var18, var13, var14, mouseX, mouseY);
                                }
                            }
                        }
                    }
                } else if (var15 < var17 && var16 < var18) {
                    Statics.method5567(var12);
                }
            }
        }
    }

    @ObfuscatedName("lr.ly(III)V")
    public static final void method6032(int arg0, int arg1) {
        if (Component.openInterface(arg0, null)) {
            method1609(Statics.field1756[arg0].field1732, arg1);
        }
    }

    @ObfuscatedName("k.lo([Lew;II)V")
    public static final void method1609(Component[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            Component var3 = arg0[var2];
            if (var3 != null) {
                if (var3.type == 0) {
                    if (var3.sortedsubcomponents != null) {
                        method1609(var3.sortedsubcomponents, arg1);
                    }
                    SubInterface var4 = (SubInterface) field9075.getNode((long) var3.id);
                    if (var4 != null) {
                        method6032(var4.field9679, arg1);
                    }
                }
                if (arg1 == 0 && var3.field1898 != null) {
                    HookRequest var5 = new HookRequest();
                    var5.component = var3;
                    var5.onop = var3.field1898;
                    ScriptRunner.runHook(var5);
                }
                if (arg1 == 1 && var3.field1782 != null) {
                    if (var3.parentlayer >= 0) {
                        Component var6 = Component.method11381(var3.id);
                        if (var6 == null || var6.field1915 == null || var3.parentlayer >= var6.field1915.length || var6.field1915[var3.parentlayer] != var3) {
                            continue;
                        }
                    }
                    HookRequest var7 = new HookRequest();
                    var7.component = var3;
                    var7.onop = var3.field1782;
                    ScriptRunner.runHook(var7);
                }
            }
        }
    }

    @ObfuscatedName("qs.lg(Lew;III)V")
    public static final void method8390(Component arg0, int arg1, int arg2) {
        if (dragComponent != null || MiniMenu.open || (arg0 == null || !method12723(arg0))) {
            return;
        }
        dragComponent = arg0;
        field9116 = method1397(arg0);
        field9160 = arg1;
        field8977 = arg2;
        Statics.field8727 = 0;
        field8991 = false;
    }

    @ObfuscatedName("ow.lu(I)V")
    public static final void method7350() {
        requestRedrawComponent(dragComponent);
        Statics.field8727++;
        if (field9080 && field9037) {
            int var0 = Statics.mouse.getX();
            int var1 = Statics.mouse.getY();
            int var2 = var0 - field9160;
            int var3 = var1 - field8977;
            if (var2 < field9203) {
                var2 = field9203;
            }
            if (dragComponent.renderwidth + var2 > field9203 + field9123) {
                var2 = field9203 + field9123 - dragComponent.renderwidth;
            }
            if (var3 < field8942) {
                var3 = field8942;
            }
            if (dragComponent.renderheight + var3 > field8968 + field8942) {
                var3 = field8968 + field8942 - dragComponent.renderheight;
            }
            int var4;
            int var5;
            if (Statics.field9561 == field9116) {
                var4 = var2;
                var5 = var3;
            } else {
                var4 = field9116.scrollx + (var2 - field9203);
                var5 = field9116.scrolly + (var3 - field8942);
            }
            if (Statics.mouse.method7248()) {
                if (Statics.field8727 > dragComponent.field1870) {
                    int var7 = var2 - field9126;
                    int var8 = var3 - field9127;
                    if (var7 > dragComponent.field1848 || var7 < -dragComponent.field1848 || var8 > dragComponent.field1848 || var8 < -dragComponent.field1848) {
                        field8991 = true;
                    }
                }
                if (dragComponent.field1750 != null && field8991) {
                    HookRequest var9 = new HookRequest();
                    var9.component = dragComponent;
                    var9.mouseX = var4;
                    var9.mouseY = var5;
                    var9.onop = dragComponent.field1750;
                    ScriptRunner.runHook(var9);
                }
            } else {
                if (field8991) {
                    cancelTargetMode();
                    if (dragComponent.field1871 != null) {
                        HookRequest var6 = new HookRequest();
                        var6.component = dragComponent;
                        var6.mouseX = var4;
                        var6.mouseY = var5;
                        var6.drop = field9119;
                        var6.onop = dragComponent.field1871;
                        ScriptRunner.runHook(var6);
                    }
                    if (field9119 != null && method14332(dragComponent) != null) {
                        method11058(dragComponent, field9119);
                    }
                } else if ((field8933 == 1 || MiniMenu.method16114()) && MiniMenu.length > 2) {
                    MiniMenu.method13889(field9160 + field9126, field9127 + field8977);
                } else if (MiniMenu.hasEntries()) {
                    MiniMenu.method13889(field9160 + field9126, field9127 + field8977);
                }
                dragComponent = null;
                field9116 = null;
            }
        } else if (Statics.field8727 > 1) {
            dragComponent = null;
            field9116 = null;
        }
    }

    @ObfuscatedName("yy.lq(Lew;I)V")
    public static void requestRedrawComponent(Component arg0) {
        if (field8960 == arg0.field1927) {
            field9204[arg0.field1926] = true;
        }
    }

    @ObfuscatedName("ar.lt(I)V")
    public static void method1703() {
        for (int var0 = 0; var0 < 100; var0++) {
            field9204[var0] = true;
        }
    }

    @ObfuscatedName("q.ln(Lew;I)Lew;")
    public static Component method1397(Component arg0) {
        Component var1 = method14332(arg0);
        if (var1 == null) {
            var1 = arg0.field1759;
        }
        return var1;
    }

    @ObfuscatedName("wb.lw(Lew;B)Z")
    public static boolean method12723(Component arg0) {
        ServerKeyProperties var1 = getComponentEvents(arg0);
        if (var1.method14946() > 0) {
            return true;
        } else if (var1.method14933()) {
            return true;
        } else {
            return arg0.field1759 != null;
        }
    }

    @ObfuscatedName("aep.lc([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method15472(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + " ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("lf.ld(I[II)V")
    public static final void method6068(int arg0, int[] arg1) {
        if (!Component.openInterface(arg0, arg1)) {
            return;
        }
        Component[] var2 = Statics.field1756[arg0].field1732;
        for (int var3 = 0; var3 < var2.length; var3++) {
            Component var4 = var2[var3];
            if (var4 != null && var4.field1789 != null) {
                var4.field1789.method11785();
            }
        }
    }

    @ObfuscatedName("aex.ll(IS)V")
    public static final void method15619(int arg0) {
        if (Component.openInterface(arg0, null)) {
            method15148(Statics.field1756[arg0].field1732, -1);
        }
    }

    @ObfuscatedName("ado.lm([Lew;II)V")
    public static final void method15148(Component[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            Component var3 = arg0[var2];
            if (var3 != null && var3.field1886 == arg1 && !method14315(var3)) {
                if (var3.type == 0) {
                    method15148(arg0, var3.id);
                    if (var3.sortedsubcomponents != null) {
                        method15148(var3.sortedsubcomponents, var3.id);
                    }
                    SubInterface var4 = (SubInterface) field9075.getNode((long) var3.id);
                    if (var4 != null) {
                        method15619(var4.field9679);
                    }
                }
                if (var3.type == 6 && var3.field1747 != -1) {
                    if (var3.field1789 == null) {
                        var3.field1789 = new InterfaceAnimationNode();
                        var3.field1789.method11769(var3.field1747);
                    }
                    if (var3.field1789.method11787(sceneDelta) && var3.field1789.method11784()) {
                        var3.field1789.method11785();
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.lj(IB)V")
    public static final void method4113(int arg0) {
        PositionedSound.method12174();
        int var1 = Statics.field6667.method4890(arg0).field3310;
        if (var1 == 0) {
            return;
        }
        int var2 = Statics.field2669.field661[arg0];
        if (var1 == 5) {
            field8933 = var2;
        }
        if (var1 == 6) {
            field9107 = var2;
        }
    }

    @ObfuscatedName("rh.lz(ZI)V")
    public static final void ifClose(boolean arg0) {
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.CLOSE_MODAL, gameConnection.randomOut);
        gameConnection.queue(var1);
        for (SubInterface var2 = (SubInterface) field9075.method11928(); var2 != null; var2 = (SubInterface) field9075.method11929()) {
            if (!var2.method6982()) {
                var2 = (SubInterface) field9075.method11928();
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field9678 == 0) {
                closeSubInterface(var2, true, arg0);
            }
        }
        if (field9108 != null) {
            requestRedrawComponent(field9108);
            field9108 = null;
        }
    }

    @ObfuscatedName("fx.lx(ILaep;[IZI)Laep;")
    public static final SubInterface method3589(int arg0, SubInterface arg1, int[] arg2, boolean arg3) {
        SubInterface var4 = (SubInterface) field9075.getNode((long) arg0);
        if (var4 != null) {
            closeSubInterface(var4, arg1.field9679 != var4.field9679, arg3);
        }
        field9075.put(arg1, (long) arg0);
        method6068(arg1.field9679, arg2);
        Component var5 = Component.method11381(arg0);
        if (var5 != null) {
            requestRedrawComponent(var5);
        }
        if (field9108 != null) {
            requestRedrawComponent(field9108);
            field9108 = null;
        }
        MiniMenu.method8628();
        if (var5 != null) {
            method12722(Statics.field1756[var5.id >>> 16], var5, !arg3);
        }
        if (!arg3) {
            ScriptRunner.method11505(arg1.field9679, arg2);
        }
        if (!arg3 && topLevelInterface != -1) {
            method6032(topLevelInterface, 1);
        }
        return arg1;
    }

    @ObfuscatedName("of.lp(Laep;ZZB)V")
    public static final void closeSubInterface(SubInterface arg0, boolean arg1, boolean arg2) {
        int var3 = arg0.field9679;
        int var4 = (int) arg0.field4228;
        arg0.remove();
        if (arg1) {
            Component.method13890(var3);
        }
        Statics.method8587(var3);
        Component var5 = Component.method11381(var4);
        if (var5 != null) {
            requestRedrawComponent(var5);
        }
        MiniMenu.method8628();
        if (!arg2 && topLevelInterface != -1) {
            method6032(topLevelInterface, 1);
        }
        IterableMapIterator var6 = new IterableMapIterator(field9075);
        for (SubInterface var7 = (SubInterface) var6.method11955(); var7 != null; var7 = (SubInterface) var6.next()) {
            if (!var7.method6982()) {
                var7 = (SubInterface) var6.method11955();
                if (var7 == null) {
                    break;
                }
            }
            if (var7.field9678 == 3) {
                int var8 = (int) var7.field4228;
                if (var8 >>> 16 == var3) {
                    closeSubInterface(var7, true, arg2);
                }
            }
        }
    }

    @ObfuscatedName("up.lr(Lew;III)V")
    public static void method11873(Component arg0, int arg1, int arg2) {
        Graphic var3 = arg0.method3124(Statics.renderer);
        if (var3 == null) {
            return;
        }
        Statics.renderer.r(arg1, arg2, arg0.renderwidth + arg1, arg0.renderheight + arg2);
        if (MiniMap.field762 >= 3) {
            Statics.renderer.DA(-16777216, var3.field1730, arg1, arg2);
            return;
        }
        int var4;
        if (Statics.cameraState == 2) {
            var4 = (int) ((double) Statics.cam2.method3791() * 2607.5945876176133D);
        } else {
            var4 = (int) -field9021;
        }
        int var5 = field9087 * 2 + var4 & 0x3FFF;
        int var6 = var5 << 2;
        Statics.field7290.method2506((float) arg0.renderwidth / 2.0F + (float) arg1, (float) arg0.renderheight / 2.0F + (float) arg2, 4224, var6, var3.field1730, arg1, arg2);
    }

    @ObfuscatedName("ro.la(Ljava/lang/String;I)I")
    public static final int method8729(String arg0) {
        if (arg0 == null) {
            return -1;
        }
        for (int var1 = 0; var1 < field9206; var1++) {
            if (arg0.equalsIgnoreCase(field9209[var1].field649)) {
                return var1;
            }
        }
        return -1;
    }

    @ObfuscatedName("sz.lf(Ljava/lang/String;B)I")
    public static final int method11161(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var1 = 0; var1 < field9211; var1++) {
            if (arg0.equalsIgnoreCase(field8999[var1].field639)) {
                return var1;
            }
        }
        return -1;
    }

    @ObfuscatedName("fp.mx(Ljava/lang/String;B)Z")
    public static boolean method3546(String arg0) {
        if (arg0 == null) {
            return false;
        }
        for (int var1 = 0; var1 < field9206; var1++) {
            if (arg0.equalsIgnoreCase(field9209[var1].field649)) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(Statics.localPlayerEntity.nameUnfiltered)) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("sl.mf(Ljava/lang/String;B)Z")
    public static boolean method11167(String arg0) {
        if (arg0 == null) {
            return false;
        }
        for (int var1 = 0; var1 < field9211; var1++) {
            Ignore var2 = field8999[var1];
            if (arg0.equalsIgnoreCase(var2.field639)) {
                return true;
            }
            if (arg0.equalsIgnoreCase(var2.field638)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("mp.mo(Ljava/lang/String;IB)V")
    public static final void method6257(String arg0, int arg1) {
        ServerConnection var2 = getCurrentConnection();
        ClientMessage var3 = ClientMessage.createMessage(ClientProt.FRIEND_SETRANK, var2.randomOut);
        var3.buf.p1(Packet.pjstrlen(arg0) + 1);
        var3.buf.p1_alt3(arg1);
        var3.buf.pjstr(arg0);
        var2.queue(var3);
    }

    @ObfuscatedName("vl.ml(Ljava/lang/String;B)V")
    public static final void method12449(String arg0) {
        if (Statics.field5180 == null) {
            return;
        }
        ServerConnection var1 = getCurrentConnection();
        ClientMessage var2 = ClientMessage.createMessage(ClientProt.CLAN_KICKUSER, var1.randomOut);
        var2.buf.p1(Packet.pjstrlen(arg0));
        var2.buf.pjstr(arg0);
        var1.queue(var2);
    }

    @ObfuscatedName("gq.mp(Ljava/lang/String;B)V")
    public static final void method3925(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        ServerConnection var1 = getCurrentConnection();
        ClientMessage var2 = ClientMessage.createMessage(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var1.randomOut);
        var2.buf.p1(Packet.pjstrlen(arg0));
        var2.buf.pjstr(arg0);
        var1.queue(var2);
    }

    @ObfuscatedName("gh.mv(B)V")
    public static final void method3979() {
        ServerConnection var0 = getCurrentConnection();
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.CLAN_JOINCHAT_LEAVECHAT, var0.randomOut);
        var1.buf.p1(0);
        var0.queue(var1);
    }

    @ObfuscatedName("wc.mj(ZII)V")
    public static final void method12622(boolean arg0, int arg1) {
        ClanChannel var2 = arg0 ? Statics.field8458 : Statics.field1515;
        if (var2 == null || arg1 < 0 || arg1 >= var2.field9430) {
            return;
        }
        ClanChannelUser var3 = var2.field9429[arg1];
        if (var3.field2342 != -1) {
            return;
        }
        String var4 = var3.field2343;
        ServerConnection var5 = getCurrentConnection();
        ClientMessage var6 = ClientMessage.createMessage(ClientProt.CLANCHANNEL_KICKUSER, var5.randomOut);
        var6.buf.p1(Packet.pjstrlen(var4) + 3);
        var6.buf.p1(arg0 ? 1 : 0);
        var6.buf.p2(arg1);
        var6.buf.pjstr(var4);
        var5.queue(var6);
    }

    @ObfuscatedName("qx.mn(II)V")
    public static final void method8064(int arg0) {
        if (Statics.field8458 == null || (arg0 < 0 || arg0 >= Statics.field8458.field9430)) {
            return;
        }
        ClanChannelUser var1 = Statics.field8458.field9429[arg0];
        if (var1.field2342 != -1) {
            return;
        }
        ServerConnection var2 = getCurrentConnection();
        ClientMessage var3 = ClientMessage.createMessage(ClientProt.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL, var2.randomOut);
        var3.buf.p1(Packet.pjstrlen(var1.field2343) + 2);
        var3.buf.p2(arg0);
        var3.buf.pjstr(var1.field2343);
        var2.queue(var3);
    }

    @ObfuscatedName("eg.mz(Ljava/lang/String;I)V")
    public static final void method2940(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (field9206 >= 200 && !field8998 || field9206 >= 200) {
            ChatHistory.method1587(4, LocalisedText.field6899.get(Statics.language));
            return;
        }
        String var1 = NamespaceUtil.method4744(arg0);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field9206; var2++) {
            Friend var3 = field9209[var2];
            String var4 = NamespaceUtil.method4744(var3.field649);
            if (var4 != null && var4.equals(var1)) {
                ChatHistory.method1587(4, arg0 + LocalisedText.field7018.get(Statics.language));
                return;
            }
            if (var3.field646 != null) {
                String var5 = NamespaceUtil.method4744(var3.field646);
                if (var5 != null && var5.equals(var1)) {
                    ChatHistory.method1587(4, arg0 + LocalisedText.field7018.get(Statics.language));
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field9211; var6++) {
            Ignore var7 = field8999[var6];
            String var8 = NamespaceUtil.method4744(var7.field639);
            if (var8 != null && var8.equals(var1)) {
                ChatHistory.method1587(4, LocalisedText.field6923.get(Statics.language) + arg0 + LocalisedText.field6990.get(Statics.language));
                return;
            }
            if (var7.field638 != null) {
                String var9 = NamespaceUtil.method4744(var7.field638);
                if (var9 != null && var9.equals(var1)) {
                    ChatHistory.method1587(4, LocalisedText.field6923.get(Statics.language) + arg0 + LocalisedText.field6990.get(Statics.language));
                    return;
                }
            }
        }
        if (NamespaceUtil.method4744(Statics.localPlayerEntity.nameUnfiltered).equals(var1)) {
            ChatHistory.method1587(4, LocalisedText.field7011.get(Statics.language));
            return;
        }
        ServerConnection var10 = getCurrentConnection();
        ClientMessage var11 = ClientMessage.createMessage(ClientProt.FRIENDLIST_ADD, var10.randomOut);
        var11.buf.p1(Packet.pjstrlen(arg0));
        var11.buf.pjstr(arg0);
        var10.queue(var11);
    }

    @ObfuscatedName("zd.mk(Ljava/lang/String;ZB)V")
    public static final void method13904(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field9211 >= 100) {
            ChatHistory.method1587(4, LocalisedText.field7020.get(Statics.language));
            return;
        }
        String var2 = NamespaceUtil.method4744(arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field9211; var3++) {
            Ignore var4 = field8999[var3];
            String var5 = NamespaceUtil.method4744(var4.field639);
            if (var5 != null && var5.equals(var2)) {
                ChatHistory.method1587(4, arg0 + LocalisedText.field7010.get(Statics.language));
                return;
            }
            if (var4.field638 != null) {
                String var6 = NamespaceUtil.method4744(var4.field638);
                if (var6 != null && var6.equals(var2)) {
                    ChatHistory.method1587(4, arg0 + LocalisedText.field7010.get(Statics.language));
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field9206; var7++) {
            Friend var8 = field9209[var7];
            String var9 = NamespaceUtil.method4744(var8.field649);
            if (var9 != null && var9.equals(var2)) {
                ChatHistory.method1587(4, LocalisedText.field7021.get(Statics.language) + arg0 + LocalisedText.field7034.get(Statics.language));
                return;
            }
            if (var8.field646 != null) {
                String var10 = NamespaceUtil.method4744(var8.field646);
                if (var10 != null && var10.equals(var2)) {
                    ChatHistory.method1587(4, LocalisedText.field7021.get(Statics.language) + arg0 + LocalisedText.field7034.get(Statics.language));
                    return;
                }
            }
        }
        if (NamespaceUtil.method4744(Statics.localPlayerEntity.nameUnfiltered).equals(var2)) {
            ChatHistory.method1587(4, LocalisedText.field7012.get(Statics.language));
            return;
        }
        ServerConnection var11 = getCurrentConnection();
        ClientMessage var12 = ClientMessage.createMessage(ClientProt.IGNORELIST_ADD, var11.randomOut);
        var12.buf.p1(Packet.pjstrlen(arg0) + 1);
        var12.buf.pjstr(arg0);
        var12.buf.p1(arg1 ? 1 : 0);
        var11.queue(var12);
    }

    @ObfuscatedName("client.mi(Lew;)Lace;")
    public static ServerKeyProperties getComponentEvents(Component arg0) {
        ServerKeyProperties var1 = (ServerKeyProperties) field9010.getNode(((long) arg0.id << 32) + (long) arg0.parentlayer);
        return var1 == null ? arg0.field1841 : var1;
    }

    @ObfuscatedName("client.mr(Lew;)Lew;")
    public static Component method14332(Component arg0) {
        ServerKeyProperties var1 = getComponentEvents(arg0);
        if (var1.method14933()) {
            return Statics.field9561;
        }
        int var2 = var1.method14946();
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = method4752(Component.method14993(arg0.id), arg0);
            if (arg0 == null) {
                return Statics.field9561;
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.mt(Lew;)Z")
    public static boolean method14315(Component arg0) {
        if (field9111) {
            if (getComponentEvents(arg0).field9416 != 0) {
                return false;
            }
            if (arg0.type == 0) {
                return false;
            }
        }
        return arg0.field1807;
    }

    @ObfuscatedName("ak.mb(Lew;IB)I")
    public static int getComponentOpCursor(Component arg0, int arg1) {
        if (!getComponentEvents(arg0).isOpTransmitted(arg1) && arg0.op == null) {
            return -1;
        } else if (arg0.field1854 == null || arg0.field1854.length <= arg1) {
            return -1;
        } else {
            return arg0.field1854[arg1];
        }
    }

    @ObfuscatedName("abz.ms(Lew;I)Ljava/lang/String;")
    public static String getComponentTargetVerb(Component arg0) {
        if (getComponentEvents(arg0).method14928() == 0) {
            return null;
        } else if (arg0.field1914 == null || arg0.field1914.trim().length() == 0) {
            return field9111 ? "Hidden-use" : null;
        } else {
            return arg0.field1914;
        }
    }

    @ObfuscatedName("dc.mg(B)Z")
    public static boolean incrementVerifyId() {
        currentIncrementVerifyId++;
        field8978 = true;
        return true;
    }

    @ObfuscatedName("ae.me(I)V")
    public static void notifyIncrementIdVerification() {
        ClientMessage var0 = ClientMessage.createMessage(ClientProt.TRANSMITVAR_VERIFYID, gameConnection.randomOut);
        var0.buf.p4(currentIncrementVerifyId);
        gameConnection.queue(var0);
    }

    @ObfuscatedName("zp.ma(Ljava/lang/String;ZI)V")
    public static void method13898(String arg0, boolean arg1) {
        method11081(arg0, arg1, -1, -1);
    }

    @ObfuscatedName("n.mm(Ljava/lang/String;ZILjava/lang/String;I)V")
    public static void method1379(String arg0, boolean arg1, int arg2, String arg3) {
        method4602(arg0, arg1, arg2, -1, arg3, true);
    }

    @ObfuscatedName("rq.md(Ljava/lang/String;ZIII)V")
    public static void method11081(String arg0, boolean arg1, int arg2, int arg3) {
        method4602(arg0, arg1, arg2, arg3, null, false);
    }

    @ObfuscatedName("io.mc(Ljava/lang/String;ZIILjava/lang/String;ZI)V")
    public static void method4602(String arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5) {
        String var6 = arg0.toLowerCase();
        short[] var7 = new short[16];
        int var8 = -1;
        String var9 = null;
        if (arg2 != -1) {
            ParamType var10 = Statics.paramTypes.get(arg2);
            if (var10 == null || var10.method12586() != arg5) {
                return;
            }
            if (var10.method12586()) {
                var9 = var10.field7288;
            } else {
                var8 = var10.defaultint;
            }
        }
        int var11 = 0;
        for (int var12 = 0; var12 < Statics.objTypes.field7144; var12++) {
            ObjType var13 = Statics.objTypes.get(var12);
            if ((!arg1 || var13.field7117) && var13.field7108 == -1 && var13.field7064 == -1 && var13.field7123 == -1 && var13.field7060 == 0 && var13.name.toLowerCase().indexOf(var6) != -1) {
                if (arg2 != -1) {
                    if (arg5) {
                        if (!arg4.equals(var13.method12248(arg2, var9))) {
                            continue;
                        }
                    } else if (arg3 != var13.method12250(arg2, var8)) {
                        continue;
                    }
                }
                if (var11 >= 250) {
                    Statics.field1539 = -1;
                    Statics.field579 = null;
                    return;
                }
                if (var11 >= var7.length) {
                    short[] var14 = new short[var7.length * 2];
                    for (int var15 = 0; var15 < var11; var15++) {
                        var14[var15] = var7[var15];
                    }
                    var7 = var14;
                }
                var7[var11++] = (short) var12;
            }
        }
        Statics.field579 = var7;
        Statics.field8729 = 0;
        Statics.field1539 = var11;
        String[] var16 = new String[Statics.field1539];
        for (int var17 = 0; var17 < Statics.field1539; var17++) {
            var16[var17] = Statics.objTypes.get(var7[var17]).name;
        }
        Algorithms.method4783(var16, Statics.field579);
    }

    @ObfuscatedName("ud.my(Ljava/lang/String;ZI)V")
    public static void method12143(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        int var5 = arg1 ? 32768 : 0;
        int var6 = var5 + (arg1 ? Statics.field3779.field6832 : Statics.field3779.field6825);
        for (int var7 = var5; var7 < var6; var7++) {
            QuickChatPhraseType var8 = Statics.field3779.method12176(var7);
            if (var8.field10395 && var8.method16750().toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 50) {
                    Statics.field1539 = -1;
                    Statics.field579 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var9 = new short[var3.length * 2];
                    for (int var10 = 0; var10 < var4; var10++) {
                        var9[var10] = var3[var10];
                    }
                    var3 = var9;
                }
                var3[var4++] = (short) var7;
            }
        }
        Statics.field579 = var3;
        Statics.field8729 = 0;
        Statics.field1539 = var4;
        String[] var11 = new String[Statics.field1539];
        for (int var12 = 0; var12 < Statics.field1539; var12++) {
            var11[var12] = Statics.field3779.method12176(var3[var12]).method16750();
        }
        Algorithms.method4783(var11, Statics.field579);
    }

    @ObfuscatedName("aam.mu(J)Ljava/lang/String;")
    public static String method14047(long arg0) {
        return TimeZones.method2901(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
    }

    @ObfuscatedName("px.ng(Ljava/lang/String;I)V")
    public static void method7723(String arg0) {
        field8947 = arg0;
        if (Statics.getEnvironment() == GameShellEnvironment.APPLICATION) {
            return;
        }
        try {
            String var1 = Statics.field6387.getParameter(JavConfigParameter.field3245.field3261);
            String var2 = Statics.field6387.getParameter(JavConfigParameter.field3246.field3261);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + method14047(MonotonicTime.get() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            Statics.method12166(Statics.field6387, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("qr.ni(I)V")
    public static void method8095() {
        if (Statics.getEnvironment() == GameShellEnvironment.APPLICATION) {
            return;
        }
        try {
            String var0 = Statics.field6387.getParameter(JavConfigParameter.field3246.field3261);
            int var1 = (int) (MonotonicTime.get() / 86400000L) - 11745;
            String var2 = "usrdob=" + var1 + "; version=1; path=/; domain=" + var0;
            Statics.method12166(Statics.field6387, "document.cookie=\"" + var2 + "\"");
        } catch (Throwable var4) {
        }
    }

    @ObfuscatedName("to.nf(B)Ljava/lang/String;")
    public static String method11406() {
        String var0 = "www";
        if (Statics.field6683 == ModeWhere.field6366) {
            var0 = "www-wtrc";
        } else if (Statics.field6683 == ModeWhere.field6362) {
            var0 = "www-wtqa";
        } else if (Statics.field6683 == ModeWhere.field6369) {
            var0 = "www-wtwip";
        } else if (Statics.field6683 == ModeWhere.field6364) {
            var0 = "www-wti";
        }
        String var1 = "";
        if (field8947 != null) {
            var1 = "/p=" + field8947;
        }
        String var2 = modeGame.field6404 + ".com";
        return "http://" + var0 + "." + var2 + "/l=" + Statics.language + "/a=" + field9043 + var1 + "/";
    }

    @ObfuscatedName("nc.nt(IIIIIILjava/lang/String;I)V")
    public static void method6854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        TextCoord var7 = new TextCoord();
        var7.field9257 = arg0;
        var7.field9256 = arg1;
        var7.field9255 = arg2;
        var7.field9259 = loopCycle + arg4;
        var7.field9260 = arg3 * 4;
        var7.field9261 = arg6;
        var7.field9258 = arg5;
        field9091.method11640(var7);
    }

    @ObfuscatedName("vq.ny(I)V")
    public static void method12288() {
        if (Statics.field6683 != ModeWhere.field6363) {
            JavascriptFunction.field3150.method4761();
        }
    }
}
