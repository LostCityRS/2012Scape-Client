import deob.ObfuscatedName;

import java.util.zip.Inflater;

@ObfuscatedName("xb")
public class GZip {

    @ObfuscatedName("xb.u")
    public Inflater field7434;

    public GZip() {
        this(-1, 1000000, 1000000);
    }

    public GZip(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("xb.u([BB)[B")
    public byte[] method12747(byte[] arg0) {
        Packet var2 = new Packet(arg0);
        var2.field9626 = arg0.length - 4;
        int var3 = var2.method15341();
        byte[] var4 = new byte[var3];
        var2.field9626 = 0;
        this.method12743(var2, var4);
        return var4;
    }

    @ObfuscatedName("xb.j(Laet;[BB)V")
    public void method12743(Packet arg0, byte[] arg1) {
        if (arg0.field9629[arg0.field9626] != 31 || arg0.field9629[arg0.field9626 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field7434 == null) {
            this.field7434 = new Inflater(true);
        }
        try {
            this.field7434.setInput(arg0.field9629, arg0.field9626 + 10, arg0.field9629.length - (arg0.field9626 + 10 + 8));
            this.field7434.inflate(arg1);
        } catch (Exception var4) {
            this.field7434.reset();
            throw new RuntimeException("");
        }
        this.field7434.reset();
    }
}
