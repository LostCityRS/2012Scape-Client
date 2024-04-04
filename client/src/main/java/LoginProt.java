import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class LoginProt {

    @ObfuscatedName("jc.u")
    public static final LoginProt INIT_GAME_CONNECTION = new LoginProt(14, 0);

    @ObfuscatedName("jc.j")
    public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, -1);

    @ObfuscatedName("jc.a")
    public static final LoginProt GAMELOGIN = new LoginProt(16, -2);

    @ObfuscatedName("jc.s")
    public static final LoginProt LOBBYLOGIN = new LoginProt(19, -2);

    @ObfuscatedName("jc.c")
    public static final LoginProt REQUEST_WORLDLIST = new LoginProt(23, 4);

    @ObfuscatedName("jc.m")
    public static final LoginProt CHECK_WORLD_SUITABILITY = new LoginProt(24, -1);

    @ObfuscatedName("jc.t")
    public static final LoginProt GAMELOGIN_CONTINUE = new LoginProt(26, 0);

    @ObfuscatedName("jc.l")
    public static final LoginProt SSL_WEBCONNECTION = new LoginProt(27, 0);

    @ObfuscatedName("jc.f")
    public static final LoginProt CREATE_ACCOUNT_CONNECT = new LoginProt(28, -2);

    @ObfuscatedName("jc.d")
    public static final LoginProt INIT_SOCIAL_NETWORK_CONNECTION = new LoginProt(29, -2);

    @ObfuscatedName("jc.z")
    public static final LoginProt SOCIAL_NETWORK_LOGIN = new LoginProt(30, -2);

    @ObfuscatedName("jc.n")
    public final int id;

    @ObfuscatedName("jc.o")
    public static final LoginProt[] BY_ID = new LoginProt[32];

    static {
        LoginProt[] var0 = values();
        for (int var1 = 0; var1 < var0.length; var1++) {
            BY_ID[var0[var1].id] = var0[var1];
        }
    }

    @ObfuscatedName("nn.u(I)[Ljc;")
    public static LoginProt[] values() {
        return new LoginProt[]{REQUEST_WORLDLIST, CHECK_WORLD_SUITABILITY, INIT_JS5REMOTE_CONNECTION, GAMELOGIN, INIT_GAME_CONNECTION, GAMELOGIN_CONTINUE, SSL_WEBCONNECTION, INIT_SOCIAL_NETWORK_CONNECTION, CREATE_ACCOUNT_CONNECT, SOCIAL_NETWORK_LOGIN, LOBBYLOGIN};
    }

    public LoginProt(int id, int size) {
        this.id = id;
    }
}
