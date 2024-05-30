import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("ov")
public abstract class Stream {

    @ObfuscatedName("va.u(Ljava/net/Socket;IB)Lov;")
    public static Stream method12184(Socket arg0, int arg1) throws IOException {
        return new SocketStream(arg0, arg1);
    }

    @ObfuscatedName("ov.a(I)I")
    public abstract int method7189() throws IOException;

    @ObfuscatedName("ov.m(I)V")
    public abstract void closeGracefully();

    @ObfuscatedName("ov.c([BIIB)V")
    public abstract void write(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ov.s([BIII)I")
    public abstract int read(byte[] arg0, int arg1, int arg2) throws IOException;

    @ObfuscatedName("ov.t(B)V")
    public abstract void method7203();

    @ObfuscatedName("ov.j(II)Z")
    public abstract boolean hasAvailable(int arg0) throws IOException;
}
