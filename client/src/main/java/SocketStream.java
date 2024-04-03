import deob.ObfuscatedName;

import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("aey")
public class SocketStream extends Stream {

    @ObfuscatedName("aey.u")
    public Socket field9770;

    @ObfuscatedName("aey.j")
    public SocketStreamReader field9769;

    @ObfuscatedName("aey.a")
    public SocketStreamWriter field9768;

    public SocketStream(Socket arg0, int arg1) throws IOException {
        this.field9770 = arg0;
        this.field9770.setSoTimeout(30000);
        this.field9770.setTcpNoDelay(true);
        this.field9769 = new SocketStreamReader(this.field9770.getInputStream(), arg1);
        this.field9768 = new SocketStreamWriter(this.field9770.getOutputStream(), arg1);
    }

    @ObfuscatedName("aey.j(II)Z")
    public boolean method7212(int arg0) throws IOException {
        return this.field9769.method7158(arg0);
    }

    @ObfuscatedName("aey.a(I)I")
    public int method7189() throws IOException {
        return this.field9769.method7154();
    }

    @ObfuscatedName("aey.s([BIII)I")
    public int method7196(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.field9769.method7148(arg0, arg1, arg2);
    }

    @ObfuscatedName("aey.c([BIIB)V")
    public void method7193(byte[] arg0, int arg1, int arg2) throws IOException {
        this.field9768.method7219(arg0, arg1, arg2);
    }

    @ObfuscatedName("aey.m(I)V")
    public void method7192() {
        this.field9768.method7222();
        try {
            this.field9770.close();
        } catch (IOException var2) {
        }
        this.field9769.method7146();
    }

    @ObfuscatedName("aey.t(B)V")
    public void method7203() {
        this.field9769.method7150();
        this.field9768.method7220();
    }

    public void finalize() {
        this.method7192();
    }
}
