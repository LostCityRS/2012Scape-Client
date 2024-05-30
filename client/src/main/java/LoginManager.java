import deob.ObfuscatedName;

import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class LoginManager {

    @ObfuscatedName("s.c")
    public static boolean field498 = false;

    @ObfuscatedName("s.t")
    public static boolean field504 = false;

    @ObfuscatedName("s.l")
    public static int ssoKey = -1;

    @ObfuscatedName("s.f")
    public static long socialKey = -1L;

    @ObfuscatedName("s.ai")
    public static int loginState = 7;

    @ObfuscatedName("s.ao")
    public static long socialName = 0L;

    @ObfuscatedName("s.al")
    public static String username = "";

    @ObfuscatedName("s.at")
    public static String password = "";

    @ObfuscatedName("s.ax")
    public static int field535 = 0;

    @ObfuscatedName("s.aw")
    public static int field516 = 0;

    @ObfuscatedName("s.az")
    public static int enterLobbyReply = -2;

    @ObfuscatedName("s.ak")
    public static int enterGameReply = -2;

    @ObfuscatedName("s.av")
    public static int field547 = -2;

    @ObfuscatedName("s.aj")
    public static int field540 = -1;

    @ObfuscatedName("s.ah")
    public static int field546 = -1;

    @ObfuscatedName("s.au")
    public static int field526 = 0;

    @ObfuscatedName("s.ae")
    public static int field543 = -1;

    @ObfuscatedName("s.ac")
    public static int field509 = -1;

    @ObfuscatedName("s.aq")
    public static int field545 = 0;

    @ObfuscatedName("s.ab")
    public static boolean field536 = false;

    @ObfuscatedName("s.bq")
    public static int field507 = 0;

    @ObfuscatedName("s.bz")
    public static boolean field548 = false;

    public LoginManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.u(B)Z")
    public static boolean method3950() {
        if (client.field8909 == null) {
            return ssoKey == -1 ? method11239(username, password) : method1201();
        } else {
            return method11920();
        }
    }

    @ObfuscatedName("pw.j(I)Z")
    public static boolean method7860() {
        if (client.field8909 == null) {
            return ssoKey == -1 ? method4741(username, password) : method11994();
        } else {
            return method2710();
        }
    }

    @ObfuscatedName("aau.a(I)V")
    public static final void resetLoginState() {
        loginState = 7;
        enterGameReply = -2;
        enterLobbyReply = -2;
    }

    @ObfuscatedName("kj.s(I)V")
    public static final void resetSocialKeys() {
        socialKey = -1L;
        socialName = 0L;
        ssoKey = -1;
    }

    @ObfuscatedName("la.c(I)V")
    public static final void cancelLogin() {
        if (loginState != 7) {
            Statics.connection.closeGracefully();
            resetLoginState();
            updateLoginState();
        }
    }

    @ObfuscatedName("aiq.m(I)Z")
    public static final boolean isInProgress() {
        return loginState != 7;
    }

    @ObfuscatedName("gb.t(B)V")
    public static void continueLogin() {
        if (loginState == 106) {
            loginState = 113;
        }
    }

    @ObfuscatedName("vg.l(Ljava/lang/String;Ljava/lang/String;I)V")
    public static void requestLogin(String arg0, String arg1) {
        if (arg0.length() <= 320 && isLoginReady()) {
            resetSocialKeys();
            username = arg0;
            password = arg1;
            client.setState(18);
        }
    }

    @ObfuscatedName("st.f(II)V")
    public static void method11156(int arg0) {
        if (!isLoginReady()) {
            return;
        }
        if (ssoKey != arg0) {
            socialKey = -1L;
        }
        ssoKey = arg0;
        client.setState(18);
    }

    @ObfuscatedName("abm.d(Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method14208(String arg0, String arg1) {
        if (arg0.length() > 320 || !isLoginReady()) {
            return;
        }
        client.lobbyConnection.closeGracefully();
        resetSocialKeys();
        username = arg0;
        password = arg1;
        client.setState(3);
    }

    @ObfuscatedName("sf.z(II)V")
    public static void method11170(int arg0) {
        if (!isLoginReady()) {
            return;
        }
        if (ssoKey != arg0) {
            socialKey = -1L;
        }
        ssoKey = arg0;
        client.lobbyConnection.closeGracefully();
        client.setState(3);
    }

    @ObfuscatedName("yh.o(I)V")
    public static void method12896() {
        password = "";
        username = "";
    }

    @ObfuscatedName("jc.q(Ljava/lang/String;Ljava/lang/String;S)Z")
    public static boolean method4741(String arg0, String arg1) {
        if (!client.ENABLE_LOBBY) {
            return method11239(arg0, arg1);
        }

        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        return method6245(false, false, arg0, arg1, -1L);
    }

    @ObfuscatedName("dh.p(I)Z")
    public static boolean method2710() {
        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        if (client.field8909 != null) {
            Packet var0 = new Packet(client.field8909);
            socialKey = var0.g8();
            socialName = var0.g8();
        }
        if (socialKey < 0L) {
            method7972(35);
            return false;
        } else {
            return method6245(false, true, "", "", socialKey);
        }
    }

    @ObfuscatedName("sq.w(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static boolean method11239(String arg0, String arg1) {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        return method6245(false, false, arg0, arg1, -1L);
    }

    @ObfuscatedName("uc.b(I)Z")
    public static boolean method11920() {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        if (client.field8909 != null) {
            Packet var0 = new Packet(client.field8909);
            socialKey = var0.g8();
            socialName = var0.g8();
        }
        if (socialKey < 0L) {
            method7972(35);
            return false;
        } else {
            return method6245(false, true, "", "", socialKey);
        }
    }

    @ObfuscatedName("v.x(B)Z")
    public static boolean method1201() {
        Statics.field500 = 223;
        Statics.connection = client.gameConnection;
        return method6245(socialKey == -1L, true, "", "", socialKey);
    }

    @ObfuscatedName("uj.i(S)Z")
    public static boolean method11994() {
        Statics.field500 = 154;
        Statics.connection = client.lobbyConnection;
        return method6245(socialKey == -1L, true, "", "", socialKey);
    }

    @ObfuscatedName("ml.v(ZZLjava/lang/String;Ljava/lang/String;J)Z")
    public static boolean method6245(boolean arg0, boolean arg1, String arg2, String arg3, long arg4) {
        field504 = arg0;
        if (!arg1) {
            ssoKey = -1;
        }
        field498 = arg1;
        username = arg2;
        password = arg3;
        socialKey = arg4;
        if (!field498 && (username.equals("") || password.equals(""))) {
            method7972(3);
            updateLoginState();
            return false;
        }
        if (Statics.field500 != 154) {
            field526 = 0;
            field509 = -1;
            field543 = -1;
        }
        Statics.connection.disconnected = false;
        method7972(-3);
        loginState = 12;
        field535 = 0;
        field516 = 0;
        return true;
    }

    @ObfuscatedName("nc.k(I)V")
    public static final void login() {
        if (loginState == 7 || loginState == 106) {
            return;
        }
        try {
            short var0;
            if (field516 == 0) {
                var0 = 500;
            } else {
                var0 = 2000;
            }
            if (field504 && loginState >= 61) {
                var0 = 6000;
            }
            if (Statics.field500 == 223 && loginState != 208 && enterGameReply != 42 || Statics.field500 == 154 && enterLobbyReply != 49 && enterLobbyReply != 52) {
                field535++;
            }
            if (field535 > var0) {
                Statics.connection.closeGracefully();
                if (field516 >= 3) {
                    loginState = 7;
                    method7972(-5);
                    updateLoginState();
                    return;
                }
                if (Statics.field500 == 223) {
                    Statics.field6772.method12026();
                } else {
                    Statics.field6782.method12026();
                }
                field535 = 0;
                field516++;
                loginState = 12;
            }
            if (loginState == 12) {
                if (Statics.field500 == 223) {
                    Statics.connection.method1911(Stream.method12184(Statics.field6772.method12025(), 15000), Statics.field6772.field6765);
                } else {
                    Statics.connection.method1911(Stream.method12184(Statics.field6782.method12025(), 15000), Statics.field6782.field6765);
                }
                Statics.connection.method1935();
                ClientMessage var1 = ClientMessage.method4876();
                if (field504) {
                    var1.buf.p1(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
                    var1.buf.p2(0);
                    int var2 = var1.buf.pos;
                    var1.buf.p4(client.REVISION);
                    var1.buf.p4(client.SUBREVISION);
                    if (Statics.field500 == 223) {
                        var1.buf.p1(client.state == 9 ? 1 : 0);
                    }
                    Packet var3 = method8625();
                    var3.p1(ssoKey);
                    var3.p2((int) (Math.random() * 9.9999999E7D));
                    var3.p1(Statics.language.getId());
                    var3.p4(client.field9043);
                    for (int var4 = 0; var4 < 6; var4++) {
                        var3.p4((int) (Math.random() * 9.9999999E7D));
                    }
                    var3.p8(client.field9138);
                    var3.p1(client.modeGame.game);
                    var3.p1((int) (Math.random() * 9.9999999E7D));
                    var3.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
                    var1.buf.pdata(var3.data, 0, var3.pos);
                    var1.buf.psize2(var1.buf.pos - var2);
                } else {
                    var1.buf.p1(LoginProt.INIT_GAME_CONNECTION.id);
                }
                Statics.connection.queue(var1);
                Statics.connection.method1912();
                loginState = 35;
            }
            if (loginState == 35) {
                if (!Statics.connection.getStream().method7212(1)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                Statics.connection.in.pos = 0;
                int var5 = Statics.connection.in.g1();
                if (var5 != 0) {
                    loginState = 7;
                    method2898(var5);
                    method7972(var5);
                    Statics.connection.closeGracefully();
                    updateLoginState();
                    return;
                }
                Statics.connection.in.pos = 0;
                if (field504) {
                    loginState = 40;
                } else {
                    loginState = 82;
                }
            }
            if (loginState == 40) {
                if (!Statics.connection.getStream().method7212(2)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 2);
                Statics.connection.in.pos = 0;
                Statics.connection.in.pos = Statics.connection.in.g2();
                loginState = 55;
            }
            if (loginState == 55) {
                if (!Statics.connection.getStream().method7212(Statics.connection.in.pos)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, Statics.connection.in.pos);
                Statics.connection.in.tinydec(Statics.field541);
                Statics.connection.in.pos = 0;
                String var6 = Statics.connection.in.gjstr2();
                Statics.connection.in.pos = 0;
                String var7 = JavascriptFunction.field3152.method4757();
                if (!client.field8903 || !Browser.method1814(var6, 1, var7)) {
                    Browser.method5599(var6, true, Statics.options.toolkit.getValue() == 5, var7, client.field8915, client.field9218);
                }
                loginState = 61;
            }
            if (loginState == 61) {
                if (!Statics.connection.getStream().method7212(1)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                if ((Statics.connection.in.data[0] & 0xFF) == 1) {
                    loginState = 76;
                }
            }
            if (loginState == 76) {
                if (!Statics.connection.getStream().method7212(16)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 16);
                Statics.connection.in.pos = 16;
                Statics.connection.in.tinydec(Statics.field541);
                Statics.connection.in.pos = 0;
                socialKey = Statics.connection.in.g8();
                socialName = Statics.connection.in.g8();
                loginState = 82;
            }
            if (loginState == 82) {
                Statics.connection.in.pos = 0;
                Statics.connection.method1935();
                ClientMessage var8 = ClientMessage.method4876();
                PacketBit buf = var8.buf;
                if (Statics.field500 == 223) {
                    LoginProt var10;
                    if (field504) {
                        var10 = LoginProt.SOCIAL_NETWORK_LOGIN;
                    } else {
                        var10 = LoginProt.GAMELOGIN;
                    }
                    buf.p1(var10.id);
                    buf.p2(0);
                    int var11 = buf.pos;
                    int var12 = buf.pos;
                    if (!field504) {
                        buf.p4(client.REVISION);
                        buf.p4(client.SUBREVISION);
                        if (client.CUSTOM_SEND_MAC_ADDRESS) {
                            buf.pjstr("userMacAddress");
                        }
                        buf.p1(client.state == 9 ? 1 : 0);
                        if (client.CUSTOM_SEND_MAC_ADDRESS) {
                            buf.pjstr("userMacAddress");
                        }
                        int var13 = buf.pos;
                        Packet var14 = method5564();
                        buf.pdata(var14.data, 0, var14.pos);
                        var12 = buf.pos;
                        buf.p1(socialKey == -1L ? 1 : 0);
                        if (socialKey == -1L) {
                            buf.pjstr(username);
                        } else {
                            buf.p8(socialKey);
                        }
                    }
                    buf.p1(client.method12476());
                    buf.p2(Statics.canvasWid);
                    buf.p2(Statics.canvasHei);
                    buf.p1(Statics.options.antialiasing.getValue());
                    GameShell.method3615(buf);
                    buf.pjstr(client.field8947);
                    buf.p4(client.field9043);
                    Packet var15 = Statics.options.createPreferencesBlock();
                    buf.p1(var15.pos);
                    buf.pdata(var15.data, 0, var15.pos);
                    client.preferencesChangeNotified = true;
                    Packet var16 = new Packet(Statics.field2305.method15476());
                    Statics.field2305.createHardwareBlock(var16);
                    buf.pdata(var16.data, 0, var16.data.length);
                    buf.p4(client.currentIncrementVerifyId);
                    buf.p8(client.field8910);
                    buf.pjstr(Statics.field6817);
                    buf.p1(client.createAdditionalInfo == null ? 0 : 1);
                    if (client.createAdditionalInfo != null) {
                        buf.pjstr(client.createAdditionalInfo);
                    }
                    buf.p1(Statics.field2137.method6799("jagtheora") ? 1 : 0);
                    buf.p1(client.field8903 ? 1 : 0);
                    buf.p1(client.field8987 ? 1 : 0);
                    buf.p1(Statics.field7543);
                    buf.p4(client.field9015);
                    buf.pjstr(client.gamepack);
                    buf.p1(Statics.field6779 != null && Statics.field6779.field6768 == Statics.field6772.field6768 ? 0 : 1);
                    method4896(buf);
                    buf.tinyenc(Statics.field541, var12, buf.pos);
                    buf.psize2(buf.pos - var11);
                } else {
                    LoginProt var17;
                    if (field504) {
                        var17 = LoginProt.SOCIAL_NETWORK_LOGIN;
                    } else {
                        var17 = LoginProt.LOBBYLOGIN;
                    }
                    buf.p1(var17.id);
                    buf.p2(0);
                    int var18 = buf.pos;
                    int var19 = buf.pos;
                    if (!field504) {
                        buf.p4(client.REVISION);
                        buf.p4(client.SUBREVISION);
                        Packet var20 = method5564();
                        buf.pdata(var20.data, 0, var20.pos);
                        var19 = buf.pos;
                        buf.p1(socialKey == -1L ? 1 : 0);
                        if (socialKey == -1L) {
                            buf.pjstr(username);
                        } else {
                            buf.p8(socialKey);
                        }
                    }
                    buf.p1(client.modeGame.game);
                    buf.p1(Statics.language.getId());
                    GameShell.method3615(buf);
                    buf.pjstr(client.field8947);
                    Packet var21 = Statics.options.createPreferencesBlock();
                    buf.p1(var21.pos);
                    buf.pdata(var21.data, 0, var21.pos);
                    Packet var22 = new Packet(Statics.field2305.method15476());
                    Statics.field2305.createHardwareBlock(var22);
                    buf.pdata(var22.data, 0, var22.data.length);
                    buf.pjstr(Statics.field6817);
                    buf.p4(client.field9043);
                    buf.p4(client.field9015);
                    buf.pjstr(client.gamepack);
                    method4896(buf);
                    buf.tinyenc(Statics.field541, var19, buf.pos);
                    buf.psize2(buf.pos - var18);
                }
                Statics.connection.queue(var8);
                Statics.connection.method1912();
                Statics.connection.randomOut = new Isaac(Statics.field541);
                for (int var23 = 0; var23 < 4; var23++) {
                    Statics.field541[var23] += 50;
                }
                Statics.connection.randomIn = new Isaac(Statics.field541);
                new Isaac(Statics.field541);
                Statics.connection.in.setIsaac(Statics.connection.randomIn);
                Statics.field541 = null;
                loginState = 96;
            }
            if (loginState == 96) {
                if (!Statics.connection.getStream().method7212(1)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                int var24 = Statics.connection.in.g1();
                Statics.connection.in.pos = 0;
                if (var24 == 21) {
                    loginState = 120;
                } else if (var24 == 29 || var24 == 45) {
                    Statics.field1025 = var24;
                    loginState = 183;
                } else if (var24 == 1) {
                    loginState = 106;
                    method7972(var24);
                    return;
                } else if (var24 == 52) {
                    Statics.field1025 = var24;
                    loginState = 213;
                } else if (var24 == 2) {
                    if (field548) {
                        field548 = false;
                        loginState = 12;
                        return;
                    }
                    loginState = 136;
                } else if (var24 == 15) {
                    Statics.connection.packetSize = -2;
                    loginState = 197;
                } else if (var24 == 23 && field516 < 3) {
                    field535 = 0;
                    field516++;
                    loginState = 12;
                    Statics.connection.closeGracefully();
                    return;
                } else if (var24 == 42) {
                    loginState = 208;
                    method7972(var24);
                    return;
                } else if (Statics.field500 == 154 && var24 == 49 && client.state != 4) {
                    if (enterLobbyReply != 52) {
                        method7972(var24);
                    }
                    return;
                } else if (!field498 || field504 || ssoKey == -1 || var24 != 35) {
                    if (var24 != 53) {
                        loginState = 7;
                        method7972(var24);
                        Statics.connection.closeGracefully();
                        updateLoginState();
                        return;
                    }
                    loginState = 235;
                } else {
                    field504 = true;
                    field535 = 0;
                    loginState = 12;
                    Statics.connection.closeGracefully();
                    return;
                }
            }
            if (loginState == 113) {
                Statics.connection.method1935();
                ClientMessage var25 = ClientMessage.method4876();
                PacketBit var26 = var25.buf;
                var26.setIsaac(Statics.connection.randomOut);
                var26.pIsaac1(LoginProt.GAMELOGIN_CONTINUE.id);
                Statics.connection.queue(var25);
                Statics.connection.method1912();
                loginState = 96;
                return;
            }
            if (loginState == 120) {
                if (!Statics.connection.getStream().method7212(1)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                int var27 = Statics.connection.in.data[0] & 0xFF;
                field526 = var27 * 50;
                loginState = 7;
                method7972(21);
                Statics.connection.closeGracefully();
                updateLoginState();
                return;
            }
            if (loginState == 208) {
                if (!Statics.connection.getStream().method7212(2)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 2);
                field545 = ((Statics.connection.in.data[0] & 0xFF) << 8) + (Statics.connection.in.data[1] & 0xFF);
                loginState = 96;
                return;
            }
            if (loginState == 235) {
                if (!Statics.connection.getStream().method7212(4)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 4);
                field507 = Statics.connection.in.g4s();
                Statics.connection.in.pos = 0;
                loginState = 7;
                method7972(53);
                Statics.connection.closeGracefully();
                updateLoginState();
                return;
            }
            if (loginState == 183) {
                if (Statics.field1025 == 29) {
                    if (!Statics.connection.getStream().method7212(1)) {
                        return;
                    }
                    Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                    field509 = Statics.connection.in.data[0] & 0xFF;
                } else if (Statics.field1025 == 45) {
                    if (!Statics.connection.getStream().method7212(3)) {
                        return;
                    }
                    Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 3);
                    field509 = Statics.connection.in.data[0] & 0xFF;
                    field543 = ((Statics.connection.in.data[1] & 0xFF) << 8) + (Statics.connection.in.data[2] & 0xFF);
                } else {
                    throw new IllegalStateException();
                }
                loginState = 7;
                method7972(Statics.field1025);
                Statics.connection.closeGracefully();
                updateLoginState();
                return;
            }
            if (loginState == 213) {
                if (!Statics.connection.getStream().method7212(2)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 2);
                Statics.connection.in.pos = 0;
                Statics.field10389 = Statics.connection.in.g2();
                Statics.connection.in.pos = 0;
                loginState = 225;
                return;
            }
            if (loginState == 225) {
                if (!Statics.connection.getStream().method7212(Statics.field10389)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, Statics.field10389);
                Statics.connection.in.pos = 0;
                byte[] var28 = new byte[Statics.field10389 + 1];
                Statics.connection.in.gIsaacArrayBuffer(var28, 0, Statics.field10389);
                Statics.connection.in.pos = 0;
                Packet var29 = new Packet(var28);
                String var30 = var29.gjstr();
                Browser.method3613(var30, true, Statics.options.toolkit.getValue() == 5, client.field8915, client.field9218);
                method7972(Statics.field1025);
                if (Statics.field500 == 154 && client.state != 4) {
                    loginState = 96;
                } else {
                    loginState = 7;
                    Statics.connection.closeGracefully();
                    updateLoginState();
                }
                return;
            }
            if (loginState == 136) {
                if (!Statics.connection.getStream().method7212(1)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 1);
                Statics.field8459 = Statics.connection.in.data[0] & 0xFF;
                loginState = 145;
                return;
            }
            if (loginState == 145) {
                PacketBit var31 = Statics.connection.in;
                if (Statics.field500 == 223) {
                    if (!Statics.connection.getStream().method7212(Statics.field8459)) {
                        return;
                    }
                    Statics.connection.getStream().method7196(var31.data, 0, Statics.field8459);
                    var31.pos = 0;
                    client.userStaffModLevel = var31.g1();
                    client.field8916 = var31.g1();
                    client.field9054 = var31.g1() == 1;
                    client.field9077 = var31.g1() == 1;
                    client.field9078 = var31.g1() == 1;
                    client.field9081 = var31.g1() == 1;
                    client.currentPlayerUid = var31.g2();
                    client.field8998 = var31.g1() == 1;
                    Statics.field8469 = var31.g3s();
                    client.field9142 = var31.g1() == 1;
                    Statics.field4685 = var31.gjstr();
                    client.world.getLocTypeList().method11472(client.field9142);
                    Statics.asyncRebuild.method6040().getLocTypeList().method11472(client.field9142);
                    Statics.objTypes.method12304(client.field9142);
                    Statics.npcTypes.method12561(client.field9142);
                } else if (Statics.connection.getStream().method7212(Statics.field8459)) {
                    Statics.connection.getStream().method7196(var31.data, 0, Statics.field8459);
                    var31.pos = 0;
                    client.userStaffModLevel = var31.g1();
                    client.field8916 = var31.g1();
                    client.field9054 = var31.g1() == 1;
                    Statics.field8469 = var31.g3s();
                    Statics.localPlayerEntity.gender = (byte) var31.g1();
                    client.field9077 = var31.g1() == 1;
                    client.field9078 = var31.g1() == 1;
                    Statics.field6701 = var31.g8();
                    Statics.field3384 = Statics.field6701 - MonotonicTime.get() - var31.g5();
                    int var32 = var31.g1();
                    client.field8998 = (var32 & 0x1) != 0;
                    Statics.field628 = (var32 & 0x2) != 0;
                    Statics.field3210 = var31.g4s();
                    Statics.field3497 = var31.g1() == 1;
                    Statics.field3584 = var31.g4s();
                    Statics.field3585 = var31.g2();
                    Statics.field5056 = var31.g2();
                    Statics.field4225 = var31.g2();
                    Statics.field8466 = var31.g4s();
                    Statics.hostNameProvider = new HostNameProvider(Statics.field8466);
                    (new Thread(Statics.hostNameProvider)).start();
                    Statics.field1685 = var31.g1();
                    Statics.field1599 = var31.g2();
                    Statics.field7157 = var31.g2();
                    Statics.field8432 = var31.g1() == 1;
                    Statics.localPlayerEntity.nameUnfiltered = Statics.localPlayerEntity.name = Statics.user = var31.gjstr2();
                    Statics.field563 = var31.g1();
                    Statics.field8537 = var31.g4s();
                    client.field9079 = var31.g1() == 1;
                    Statics.field6779 = new ServerAddress();
                    Statics.field6779.field6768 = var31.g2();
                    if (Statics.field6779.field6768 == 65535) {
                        Statics.field6779.field6768 = -1;
                    }
                    Statics.field6779.field6765 = var31.gjstr2();
                    if (Statics.field6683 != ModeWhere.LIVE) {
                        Statics.field6779.field6764 = Statics.field6779.field6768 + 40000;
                        Statics.field6779.field6766 = Statics.field6779.field6768 + 50000;
                    }
                    if (Statics.field6683 != ModeWhere.field6363 && (Statics.field6683 != ModeWhere.field6362 || client.userStaffModLevel < 2) && Statics.field6772.method12027(Statics.field6773)) {
                        Statics.method12022();
                    }
                } else {
                    return;
                }
                if (client.field9054 && !client.field9078 || client.field8998) {
                    try {
                        BrowserControl.method12167(Statics.field6387, "zap");
                    } catch (Throwable var44) {
                        if (client.field9193) {
                            try {
                                Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var43) {
                            }
                        }
                    }
                } else {
                    try {
                        BrowserControl.method12167(Statics.field6387, "unzap");
                    } catch (Throwable var42) {
                    }
                }
                if (Statics.field6683 == ModeWhere.LIVE) {
                    JavascriptFunction.field3141.method4761();
                }
                if (Statics.field500 != 223) {
                    loginState = 7;
                    method7972(2);
                    method3222();
                    client.setState(15);
                    Statics.connection.packetType = null;
                    return;
                }
                loginState = 166;
            }
            if (loginState == 166) {
                if (!Statics.connection.getStream().method7212(3)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 3);
                loginState = 173;
            }
            if (loginState == 173) {
                PacketBit var36 = Statics.connection.in;
                var36.pos = 0;
                if (var36.isIsaac1or2()) {
                    if (!Statics.connection.getStream().method7212(1)) {
                        return;
                    }
                    Statics.connection.getStream().method7196(var36.data, 3, 1);
                }
                Statics.connection.packetType = ServerProt.values()[var36.gIsaac1or2()];
                Statics.connection.packetSize = var36.g2();
                loginState = 153;
            }
            if (loginState == 153) {
                if (!Statics.connection.getStream().method7212(Statics.connection.packetSize)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, Statics.connection.packetSize);
                Statics.connection.in.pos = 0;
                int var37 = Statics.connection.packetSize;
                loginState = 7;
                method7972(2);
                method3965();
                ReceivePlayerPositions.method12667(Statics.connection.in);
                int var38 = var37 - Statics.connection.in.pos;
                PacketBit var39 = new PacketBit(var38);
                System.arraycopy(Statics.connection.in.data, Statics.connection.in.pos, var39.data, 0, var38);
                Statics.connection.in.pos += var38;
                if (ServerProt.REBUILD_REGION == Statics.connection.packetType) {
                    client.world.method6135(new RebuildRequest(RebuildType.REBUILD_REGION, var39));
                } else {
                    client.world.method6135(new RebuildRequest(RebuildType.REBUILD_NORMAL, var39));
                }
                if (Statics.connection.in.pos != var37) {
                    throw new RuntimeException(Statics.connection.in.pos + " " + var37);
                }
                Statics.connection.packetType = null;
                return;
            }
            if (loginState == 197) {
                if (Statics.connection.packetSize == -2) {
                    if (!Statics.connection.getStream().method7212(2)) {
                        return;
                    }
                    Statics.connection.getStream().method7196(Statics.connection.in.data, 0, 2);
                    Statics.connection.in.pos = 0;
                    Statics.connection.packetSize = Statics.connection.in.g2();
                }
                if (!Statics.connection.getStream().method7212(Statics.connection.packetSize)) {
                    return;
                }
                Statics.connection.getStream().method7196(Statics.connection.in.data, 0, Statics.connection.packetSize);
                Statics.connection.in.pos = 0;
                int var40 = Statics.connection.packetSize;
                loginState = 7;
                method7972(15);
                Statics.method1237();
                ReceivePlayerPositions.method12667(Statics.connection.in);
                if (Statics.connection.in.pos != var40) {
                    throw new RuntimeException(Statics.connection.in.pos + " " + var40);
                }
                Statics.connection.packetType = null;
                return;
            }
        } catch (IOException var45) {
            Statics.connection.closeGracefully();
            if (field516 < 3) {
                if (Statics.field500 == 223) {
                    Statics.field6772.method12026();
                } else {
                    Statics.field6782.method12026();
                }
                field535 = 0;
                field516++;
                loginState = 12;
            } else {
                loginState = 7;
                method7972(-4);
                updateLoginState();
            }
        }
    }

    @ObfuscatedName("dq.h(II)V")
    public static void method2898(int arg0) {
    }

    @ObfuscatedName("ru.r(I)Laet;")
    public static Packet method8625() {
        Packet var0 = new Packet(518);
        Statics.field541 = new int[4];
        Statics.field541[0] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[1] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[2] = (int) (Math.random() * 9.9999999E7D);
        Statics.field541[3] = (int) (Math.random() * 9.9999999E7D);
        var0.p1(10);
        var0.p4(Statics.field541[0]);
        var0.p4(Statics.field541[1]);
        var0.p4(Statics.field541[2]);
        var0.p4(Statics.field541[3]);
        return var0;
    }

    @ObfuscatedName("kg.g(S)Laet;")
    public static Packet method5564() {
        Packet var0 = method8625();
        var0.p8(0L);
        var0.pjstr(password);
        var0.p8(socialName);
        var0.p8(client.field9138);
        var0.rsaenc(PublicKeys.LOGIN_RSAE, PublicKeys.LOGIN_RSAN);
        return var0;
    }

    @ObfuscatedName("pz.y(II)V")
    public static void method7972(int arg0) {
        if (Statics.field500 == 154) {
            enterLobbyReply = arg0;
        } else if (Statics.field500 == 223) {
            enterGameReply = arg0;
        }
    }

    @ObfuscatedName("ta.e(I)V")
    public static void updateLoginState() {
        if (client.method12490(client.state)) {
            if (client.lobbyConnection.getStream() == null) {
                client.setState(3);
            } else {
                client.setState(15);
            }
        } else if (client.state == 3 || client.state == 18) {
            client.setState(6);
        } else if (client.state == 4) {
            client.setState(6);
        }
    }

    @ObfuscatedName("jw.ay(Lajl;I)V")
    public static void method4896(PacketBit arg0) {
        arg0.p4(Statics.field7567.method5622());
        arg0.p4(Statics.field6690.method5622());
        arg0.p4(Statics.field7435.method5622());
        arg0.p4(Statics.field2653.method5622());
        arg0.p4(Statics.synthSounds.method5622());
        arg0.p4(Statics.field7343.method5622());
        arg0.p4(Statics.midiSongs.method5622());
        arg0.p4(Statics.field4560.method5622());
        arg0.p4(Statics.field7387.method5622());
        arg0.p4(Statics.field808.method5622());
        arg0.p4(Statics.field3523.method5622());
        arg0.p4(Statics.field1509.method5622());
        arg0.p4(Statics.field6651.method5622());
        arg0.p4(Statics.field8745.method5622());
        arg0.p4(Statics.vorbis.method5622());
        arg0.p4(Statics.midiInstruments.method5622());
        arg0.p4(Statics.field1565.method5622());
        arg0.p4(Statics.field6451.method5622());
        arg0.p4(Statics.field5080.method5622());
        arg0.p4(Statics.field5130.method5622());
        arg0.p4(Statics.field3897.method5622());
        arg0.p4(Statics.field2070.method5622());
        arg0.p4(Statics.field4229.method5622());
        arg0.p4(Statics.field4059.method5622());
        arg0.p4(Statics.field6343.method5622());
        arg0.p4(Statics.field6712.method5622());
        arg0.p4(Statics.field7572.method5622());
        arg0.p4(Statics.field8655.method5622());
        arg0.p4(Statics.field849.method5622());
        arg0.p4(Statics.field8734.method5622());
        arg0.p4(Statics.field663.method5622());
        arg0.p4(Statics.field2670.method5622());
        arg0.p4(Loading.method6307());
        arg0.p4(Loading.method4671());
        arg0.p4(Statics.field4824.method5622());
        arg0.p4(Statics.field2117.method5622());
        arg0.p4(Statics.field6435.method5622());
    }

    @ObfuscatedName("gr.af(I)V")
    public static void method3988() {
        Statics.connection.method1935();
        Statics.connection.in.pos = 0;
        Statics.connection.lastPacketType0 = null;
        Statics.connection.lastPacketType1 = null;
        Statics.connection.lastPacketType2 = null;
        Statics.connection.idleNetCycles = 0;
        client.systemUpdateTimer = 0;
        Statics.method12634();
        client.field9121 = 0;
        client.field9206 = 0;
        client.field9211 = 0;
        client.field9182 = null;
        Statics.field7045 = 0;
        Statics.field5180 = null;
        Statics.field913 = null;
        Statics.field2972 = null;
        ClientWatch.method5946();
        for (int var0 = 0; var0 < 25; var0++) {
            client.field9092[var0] = 0;
            client.field9093[var0] = 0;
            client.field9094[var0] = 0;
        }
    }

    @ObfuscatedName("ei.ar(I)V")
    public static void method3222() {
        method3988();
    }

    @ObfuscatedName("gc.an(B)V")
    public static void method3965() {
        if (client.state == 0) {
            Statics.method1681();
        }
        method3988();
        client.lobbyConnection.closeGracefully();
        Statics.field578 = true;
        ReflectionCheck.clear();
        for (int var0 = 0; var0 < client.field8936.length; var0++) {
            client.field8936[var0] = null;
        }
        client.targetModeActive = false;
        AudioRenderer.method2387();
        client.field9050 = (int) (Math.random() * 100.0D) - 50;
        client.field9006 = (int) (Math.random() * 110.0D) - 55;
        client.field9008 = (int) (Math.random() * 80.0D) - 40;
        client.field9087 = (int) (Math.random() * 120.0D) - 60;
        client.field8976 = (int) (Math.random() * 30.0D) - 20;
        client.field9021 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
        MiniMap.method7163();
        for (int var1 = 0; var1 < 2048; var1++) {
            client.players[var1] = null;
        }
        Statics.localPlayerEntity = null;
        client.npcSlotCount = 0;
        client.npcCount = 0;
        client.npcEntities.clear();
        client.field9007.clearBridged();
        client.field9090.clear();
        client.field9091.method11653();
        client.field9088.clear();
        ChangeLocationRequest.field9278 = new LinkedList();
        ChangeLocationRequest.field9292 = new LinkedList();
        client.localPlayerGameState.method1647();
        DelayedStateChange.method12620();
        client.cameraMoveToX = 0;
        client.cameraMoveToZ = 0;
        Statics.cameraMoveToY = 0;
        Statics.cameraMoveToStep = 0;
        client.cameraMoveToRate = 0;
        Statics.cameraLookX = 0;
        Statics.cameraLookZ = 0;
        Statics.cameraLookY = 0;
        Statics.cameraRotateAcceleration = 0;
        Statics.cameraRotateSpeed = 0;
        for (int var2 = 0; var2 < Statics.field6666.length; var2++) {
            if (!Statics.field2210[var2]) {
                Statics.field6666[var2] = -1;
            }
        }
        if (client.topLevelInterface != -1) {
            Component.method13890(client.topLevelInterface);
        }
        for (SubInterface var3 = (SubInterface) client.field9075.head(); var3 != null; var3 = (SubInterface) client.field9075.next()) {
            if (!var3.isLinked()) {
                var3 = (SubInterface) client.field9075.head();
                if (var3 == null) {
                    break;
                }
            }
            client.closeSubInterface(var3, true, false);
        }
        client.topLevelInterface = -1;
        client.field9075 = new HashTable(8);
        Statics.method4591();
        client.field9108 = null;
        for (int var4 = 0; var4 < 8; var4++) {
            client.field9085[var4] = null;
            client.field9086[var4] = false;
            client.field9084[var4] = -1;
        }
        ClientInvCache.method8048();
        client.field9226 = true;
        for (int var5 = 0; var5 < 100; var5++) {
            client.field9204[var5] = true;
        }
        for (int var6 = 0; var6 < 6; var6++) {
            client.field9184[var6] = new StockMarketSlot();
        }
        client.world.getEnvironmentManager().method8154();
        client.field9028 = true;
        Statics.field2744 = LocType.field6530 = NPCType.field7209 = ObjType.field7118 = new short[256];
        Statics.field2400 = LocalisedText.field6994.get(Statics.language);
        Statics.options.method15448(Statics.options.removeRoofOverride, Statics.options.removeRoof.getValue());
        client.currentIncrementVerifyId = 0;
        MiniMenu.method11300();
        client.method15612();
        Statics.field3357 = null;
        Statics.field3307 = 0L;
    }

    @ObfuscatedName("vq.ag(I)Z")
    public static boolean isLoginReady() {
        if (client.state == 6) {
            return !isInProgress() && !Statics.method8399();
        } else {
            return false;
        }
    }
}
