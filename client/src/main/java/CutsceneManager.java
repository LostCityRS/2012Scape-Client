import deob.ObfuscatedName;

@ObfuscatedName("dd")
public class CutsceneManager {

    @ObfuscatedName("dd.u")
    public static IterableQueue field1534 = new IterableQueue();

    @ObfuscatedName("dd.t")
    public static IterableMap field1529 = new IterableMap(32);

    @ObfuscatedName("dd.l")
    public static int field1530 = 1;

    @ObfuscatedName("dd.f")
    public static int field1527 = 0;

    @ObfuscatedName("dd.d")
    public static int field1531 = 0;

    @ObfuscatedName("dd.z")
    public static boolean field1526 = false;

    @ObfuscatedName("dd.w")
    public static int field1536 = -1;

    @ObfuscatedName("dd.b")
    public static int field1533 = -1;

    @ObfuscatedName("dd.i")
    public static final VarIntDomain field1538 = new CutsceneVarDomain();

    public CutsceneManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.u(II)Z")
    public static boolean method2467(int arg0) {
        if (field1533 != arg0 || Statics.field10188 == null) {
            method2911();
            Statics.field10188 = CutsceneLoadingStage.field1541;
            field1533 = arg0;
        }
        if (Statics.field10188 == CutsceneLoadingStage.field1541) {
            byte[] var1 = Statics.field4824.method5635(arg0);
            if (var1 == null) {
                return false;
            }
            Packet var2 = new Packet(var1);
            method7325(var2);
            int var3 = var2.g1();
            for (int var4 = 0; var4 < var3; var4++) {
                field1534.addTail(new CutsceneTemplate(var2));
            }
            int var5 = var2.gSmart1or2();
            Statics.field10534 = new CutsceneSpline[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                Statics.field10534[var6] = new CutsceneSpline(var2);
            }
            int var7 = var2.gSmart1or2();
            Statics.field1537 = new CutsceneEntity[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                Statics.field1537[var8] = new CutsceneEntity(var2, var8);
            }
            int var9 = var2.gSmart1or2();
            Statics.field1528 = new CutsceneLocation[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                Statics.field1528[var10] = new CutsceneLocation(var2);
            }
            int var11 = var2.gSmart1or2();
            Statics.field5181 = new CutsceneRoute[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                Statics.field5181[var12] = new CutsceneRoute(var2);
            }
            int var13 = var2.gSmart1or2();
            Statics.field6396 = new CutsceneAction[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                Statics.field6396[var14] = CutsceneAction.method3928(var2);
            }
            Statics.field10188 = CutsceneLoadingStage.field1540;
        }
        if (Statics.field10188 == CutsceneLoadingStage.field1540) {
            boolean var15 = true;
            CutsceneEntity[] var16 = Statics.field1537;
            for (int var17 = 0; var17 < var16.length; var17++) {
                CutsceneEntity var18 = var16[var17];
                if (!var18.method2860()) {
                    var15 = false;
                }
            }
            CutsceneAction[] var19 = Statics.field6396;
            for (int var20 = 0; var20 < var19.length; var20++) {
                CutsceneAction var21 = var19[var20];
                if (!var21.method2883()) {
                    var15 = false;
                }
            }
            CutsceneLocation[] var22 = Statics.field1528;
            for (int var23 = 0; var23 < var22.length; var23++) {
                CutsceneLocation var24 = var22[var23];
                if (!var24.method2831()) {
                    var15 = false;
                }
            }
            if (!var15) {
                return false;
            }
            Statics.field10188 = CutsceneLoadingStage.field1542;
        }
        return true;
    }

    @ObfuscatedName("oe.j(Laet;B)V")
    public static void method7325(Packet arg0) {
        while (true) {
            int var1 = arg0.g1();
            switch (var1) {
                case 0:
                    field1527 = arg0.g2();
                    field1531 = arg0.g2();
                    break;
                case 255:
                    return;
            }
        }
    }

    @ObfuscatedName("et.a(I)V")
    public static void method2911() {
        field1529.clear();
        field1534.clearBridged();
        Statics.field10534 = null;
        Statics.field1537 = null;
        Statics.field1528 = null;
        Statics.field5181 = null;
        Statics.field6396 = null;
        field1530 = 1;
        field1527 = 0;
        field1531 = 0;
        Statics.field10188 = null;
        field1533 = -1;
        field1536 = -1;
        if (!field1526) {
            return;
        }
        client.field9199 = Statics.field1532;
        client.field9200 = Statics.field10533;
        client.field9197 = Statics.field1535;
        client.field9188 = Statics.field784;
        field1526 = false;
    }

    @ObfuscatedName("n.s(I)V")
    public static void method1383() {
        Statics.field1532 = client.field9199;
        Statics.field10533 = client.field9200;
        Statics.field1535 = client.field9197;
        Statics.field784 = client.field9188;
        field1526 = true;
        field1536 = AudioRenderer.field4202;
        if (field1531 != 0 && field1527 != 0) {
            client.field9197 = 334;
            client.field9188 = 334;
            client.field9200 = client.field9199 = (short) (field1531 * 512 / field1527);
        }
    }

    @ObfuscatedName("acy.c(ZI)V")
    public static void method14961(boolean arg0) {
        if (client.field8988 == 1 || client.field8988 == 2) {
            return;
        }
        if (!arg0) {
            CutsceneAction[] var1 = Statics.field6396;
            for (int var2 = 0; var2 < var1.length; var2++) {
                CutsceneAction var3 = var1[var2];
                var3.method2874();
            }
            if (field1536 != -1) {
                MidiPlayer.method8662();
                AudioRenderer.field4202 = -1;
                AudioRenderer.method11057(field1536, 255, 50);
            }
        }
        client.field8988 = 1;
        Statics.field4561 = null;
        Statics.field416 = null;
        client.field8989 = false;
        if (field1533 > 0) {
            ScriptRunner.method1372(ClientTriggerType.field7312, field1533, -1);
        }
        method2911();
        ClientMessage var4 = ClientMessage.createMessage(ClientProt.CUTSCENE_FINISHED, client.gameConnection.randomOut);
        var4.buf.p1(arg0 ? 1 : 0);
        client.gameConnection.queue(var4);
    }
}
