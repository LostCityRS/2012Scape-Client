import deob.ObfuscatedName;

import java.math.BigInteger;

@ObfuscatedName("li")
public class Js5Client {

    @ObfuscatedName("li.u")
    public Js5TcpClient field3540;

    @ObfuscatedName("li.j")
    public Js5DiskCache field3539;

    @ObfuscatedName("li.a")
    public BigInteger field3543;

    @ObfuscatedName("li.s")
    public BigInteger field3541;

    @ObfuscatedName("li.c")
    public Js5NetRequest field3542;

    @ObfuscatedName("li.m")
    public Packet field3538;

    @ObfuscatedName("li.t")
    public Js5NetResourceProvider[] field3544;

    public Js5Client(Js5TcpClient arg0, Js5DiskCache arg1, BigInteger arg2, BigInteger arg3) {
        this.field3540 = arg0;
        this.field3539 = arg1;
        this.field3543 = arg2;
        this.field3541 = arg3;
        if (!this.field3540.method5738()) {
            this.field3542 = this.field3540.method5765(255, 255, (byte) 0, true);
        }
    }

    @ObfuscatedName("li.u(B)Z")
    public boolean method5587() {
        if (this.field3538 != null) {
            return true;
        }
        if (this.field3542 == null) {
            if (this.field3540.method5738()) {
                return false;
            }
            this.field3542 = this.field3540.method5765(255, 255, (byte) 0, true);
        }
        if (this.field3542.field10352) {
            return false;
        }
        Packet var1 = new Packet(this.field3542.method16685());
        var1.pos = 5;
        int var2 = var1.g1();
        var1.pos += var2 * 72;
        byte[] var3 = new byte[var1.data.length - var1.pos];
        var1.gdata(var3, 0, var3.length);
        byte[] var6;
        if (this.field3543 == null || this.field3541 == null || !client.ENABLE_JS5_RSA) {
            var6 = var3;
        } else {
            BigInteger var4 = new BigInteger(var3);
            BigInteger var5 = var4.modPow(this.field3543, this.field3541);
            var6 = var5.toByteArray();
        }
        if (var6.length != 65) {
            throw new RuntimeException();
        }
        byte[] var7 = Whirlpool.method2920(var1.data, 5, var1.pos - var3.length - 5);
        for (int var8 = 0; var8 < 64; var8++) {
            if (var6[var8 + 1] != var7[var8]) {
                throw new RuntimeException();
            }
        }
        this.field3538 = var1;
        if (this.field3544 == null) {
            this.field3544 = new Js5NetResourceProvider[var2];
        } else {
            for (int var9 = 0; var9 < this.field3544.length; var9++) {
                if (this.field3544[var9] != null) {
                    this.field3538.pos = var9 * 72 + 6;
                    int var10 = this.field3538.g4s();
                    int var11 = this.field3538.g4s();
                    byte[] var12 = new byte[64];
                    this.field3538.gdata(var12, 0, 64);
                    this.field3544[var9].method14234(var10, var12, var11);
                }
            }
        }
        return true;
    }

    @ObfuscatedName("li.j(ILon;Lon;I)Labt;")
    public Js5NetResourceProvider method5579(int arg0, DiskStore arg1, DiskStore arg2) {
        return this.method5578(arg0, arg1, arg2, true);
    }

    @ObfuscatedName("li.a(ILon;Lon;ZB)Labt;")
    public Js5NetResourceProvider method5578(int arg0, DiskStore arg1, DiskStore arg2, boolean arg3) {
        if (this.field3538 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || arg0 >= this.field3544.length) {
            throw new RuntimeException();
        } else if (this.field3544[arg0] == null) {
            this.field3538.pos = arg0 * 72 + 6;
            int var5 = this.field3538.g4s();
            int var6 = this.field3538.g4s();
            byte[] var7 = new byte[64];
            this.field3538.gdata(var7, 0, 64);
            Js5NetResourceProvider var8 = new Js5NetResourceProvider(arg0, arg1, arg2, this.field3540, this.field3539, var5, var7, var6, arg3);
            this.field3544[arg0] = var8;
            return var8;
        } else {
            return this.field3544[arg0];
        }
    }

    @ObfuscatedName("li.s(I)V")
    public void method5576() {
        if (this.field3544 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3544.length; var1++) {
            if (this.field3544[var1] != null) {
                this.field3544[var1].method14238();
            }
        }
        for (int var2 = 0; var2 < this.field3544.length; var2++) {
            if (this.field3544[var2] != null) {
                this.field3544[var2].method14239();
            }
        }
    }
}
