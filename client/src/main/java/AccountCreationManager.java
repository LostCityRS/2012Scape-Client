import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("b")
public class AccountCreationManager {

    @ObfuscatedName("b.a")
    public static int field634 = 0;

    @ObfuscatedName("b.s")
    public static int field631 = 0;

    public AccountCreationManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aeb.j(B)V")
    public static void method15481() {
        Statics.field633 = CreateConnectStage.field564;
        Statics.field629 = ConnectReply.field6432;
        Statics.field4011 = CreateAccountReply.field6449;
        Statics.field9312 = CheckEmailReply.field6457;
    }

    @ObfuscatedName("vl.s(Ljava/lang/String;I)V")
    public static void method12448(String arg0) {
        if (client.state != 14) {
            return;
        }
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.CREATE_CHECK_EMAIL, client.lobbyConnection.randomOut);
        var1.buf.p2(0);
        int var2 = var1.buf.pos;
        var1.buf.pjstr(arg0);
        var1.buf.pos += 7;
        var1.buf.tinyenc(Statics.field630, var2, var1.buf.pos);
        var1.buf.psize2(var1.buf.pos - var2);
        client.lobbyConnection.queue(var1);
        Statics.field9312 = CheckEmailReply.field6453;
    }

    @ObfuscatedName("gz.m(II)V")
    public static void method3942(int arg0) {
        if (client.state == 14) {
            ClientMessage var1 = ClientMessage.createMessage(ClientProt.CREATE_LOG_PROGRESS, client.lobbyConnection.randomOut);
            var1.buf.p1(arg0);
            client.lobbyConnection.queue(var1);
        }
    }

    @ObfuscatedName("eq.t(B)Lty;")
    public static ConnectReply method3012() {
        return Statics.field629 == null ? ConnectReply.field6425 : Statics.field629;
    }

    @ObfuscatedName("rz.l(B)Ltk;")
    public static CreateAccountReply method8659() {
        return Statics.field4011 == null ? CreateAccountReply.field6449 : Statics.field4011;
    }

    @ObfuscatedName("sz.f(I)Ltc;")
    public static CheckEmailReply method11157() {
        return Statics.field9312 == null ? CheckEmailReply.field6457 : Statics.field9312;
    }

    @ObfuscatedName("na.d(Ltk;I)V")
    public static void method1219(CreateAccountReply arg0) {
        Statics.field4011 = arg0;
    }

    @ObfuscatedName("ig.z(Ltc;I)V")
    public static void method4554(CheckEmailReply arg0) {
        Statics.field9312 = arg0;
    }

    @ObfuscatedName("lw.n(I)V")
    public static void method5945() {
        if (Statics.field633 == null) {
            return;
        }
        try {
            short var0;
            if (field631 == 0) {
                var0 = 250;
            } else {
                var0 = 2000;
            }
            field634++;
            if (field634 > var0) {
                Statics.method5540();
            }
            if (Statics.field633 == CreateConnectStage.field564) {
                client.lobbyConnection.method1911(Stream.method12184(Statics.field6782.method12025(), 15000), Statics.field6782.field6765);
                client.lobbyConnection.method1935();
                ClientMessage var1 = ClientMessage.method4876();
                var1.buf.p1(LoginProt.CREATE_ACCOUNT_CONNECT.id);
                var1.buf.p2(0);
                int var2 = var1.buf.pos;
                var1.buf.p2(client.REVISION);
                var1.buf.p2(client.SUBREVISION);
                Statics.field630 = method11380(var1);
                int var3 = var1.buf.pos;
                var1.buf.pjstr(client.gamepack);
                var1.buf.p2(client.field9043);
                var1.buf.p8(client.field8910);
                var1.buf.pjstr(Statics.field6817);
                var1.buf.p1(Statics.language.getId());
                var1.buf.p1(client.modeGame.game);
                GameShell.method3615(var1.buf);
                String var4 = client.createAdditionalInfo;
                var1.buf.p1(var4 == null ? 0 : 1);
                if (var4 != null) {
                    var1.buf.pjstr(var4);
                }
                Statics.field2305.createHardwareBlock(var1.buf);
                var1.buf.pos += 7;
                var1.buf.tinyenc(Statics.field630, var3, var1.buf.pos);
                var1.buf.psize2(var1.buf.pos - var2);
                client.lobbyConnection.queue(var1);
                client.lobbyConnection.method1912();
                Statics.field633 = CreateConnectStage.field565;
            }
            if (Statics.field633 == CreateConnectStage.field565) {
                if (client.lobbyConnection.getStream() == null) {
                    Statics.method5540();
                    return;
                }
                if (!client.lobbyConnection.getStream().method7212(1)) {
                    return;
                }
                client.lobbyConnection.getStream().method7196(client.lobbyConnection.in.data, 0, 1);
                Statics.field629 = (ConnectReply) SerializableEnums.decode(ConnectReply.method8658(), client.lobbyConnection.in.data[0] & 0xFF);
                if (Statics.field629 == ConnectReply.field6424) {
                    client.lobbyConnection.randomOut = new Isaac(Statics.field630);
                    int[] var5 = new int[4];
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] = Statics.field630[var6] + 50;
                    }
                    client.lobbyConnection.randomIn = new Isaac(var5);
                    new Isaac(var5);
                    client.lobbyConnection.in.setIsaac(client.lobbyConnection.randomIn);
                    client.setState(14);
                    client.lobbyConnection.method1935();
                    client.lobbyConnection.in.pos = 0;
                    client.lobbyConnection.lastPacketType0 = null;
                    client.lobbyConnection.lastPacketType1 = null;
                    client.lobbyConnection.lastPacketType2 = null;
                    client.lobbyConnection.idleNetCycles = 0;
                } else {
                    client.lobbyConnection.method1916();
                }
                client.lobbyConnection.packetType = null;
                Statics.field633 = null;
            }
        } catch (IOException var8) {
            Statics.method5540();
        }
    }

    @ObfuscatedName("tk.o(Lada;B)[I")
    public static int[] method11380(ClientMessage arg0) {
        Packet var1 = new Packet(518);
        int[] var2 = new int[4];
        for (int var3 = 0; var3 < 4; var3++) {
            var2[var3] = (int) (Math.random() * 9.9999999E7D);
        }
        var1.p1(10);
        var1.p4(var2[0]);
        var1.p4(var2[1]);
        var1.p4(var2[2]);
        var1.p4(var2[3]);
        for (int var4 = 0; var4 < 10; var4++) {
            var1.p4((int) (Math.random() * 9.9999999E7D));
        }
        var1.p2((int) (Math.random() * 9.9999999E7D));
        var1.rsaenc(PublicKeys.field666, PublicKeys.field667);
        arg0.buf.pdata(var1.data, 0, var1.pos);
        return var2;
    }
}
