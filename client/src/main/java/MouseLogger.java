import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("qs")
public abstract class MouseLogger {

    @ObfuscatedName("qs.u")
    public final LinkedList field5050 = new LinkedList();

    @ObfuscatedName("qs.j")
    public long field5047 = -1L;

    @ObfuscatedName("qs.a")
    public long field5048 = -1L;

    @ObfuscatedName("qs.s")
    public int field5049 = -1;

    @ObfuscatedName("qs.c")
    public int field5046 = -1;

    @ObfuscatedName("qs.u(I)V")
    public void method8371() {
        if (this.method8358()) {
            ClientMessage var1 = null;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            Iterator var5 = this.field5050.iterator();
            label102:
            while (true) {
                while (true) {
                    if (!var5.hasNext()) {
                        break label102;
                    }
                    BasicMouseEvent var6 = (BasicMouseEvent) var5.next();
                    if (var1 != null && var1.buf.pos - var2 >= 252 - (this.method8355() + 6)) {
                        break label102;
                    }
                    var6.unlink();
                    int var7 = var6.getY();
                    if (var7 < -1) {
                        var7 = -1;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    int var8 = var6.getX();
                    if (var8 < -1) {
                        var8 = -1;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (this.field5049 == var8 && this.field5046 == var7) {
                        var6.method15186();
                    } else {
                        if (var1 == null) {
                            var1 = this.method8375();
                            var1.buf.p1(0);
                            var2 = var1.buf.pos;
                            var1.buf.pos += 2;
                            var3 = 0;
                            var4 = 0;
                        }
                        int var9;
                        int var10;
                        int var11;
                        if (this.field5048 == -1L) {
                            var9 = var8;
                            var10 = var7;
                            var11 = Integer.MAX_VALUE;
                        } else {
                            var9 = var8 - this.field5049;
                            var10 = var7 - this.field5046;
                            var11 = (int) ((var6.method15185() - this.field5048) / 20L);
                            var3 = (int) ((long) var3 + (var6.method15185() - this.field5048) % 20L);
                        }
                        this.field5049 = var8;
                        this.field5046 = var7;
                        if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            var1.buf.p2((var9 << 6) + (var11 << 12) + var10);
                        } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            var1.buf.p1(var11 + 128);
                            var1.buf.p2((var9 << 8) + var10);
                        } else if (var11 < 32) {
                            var1.buf.p1(var11 + 192);
                            if (var8 == -1 || var7 == -1) {
                                var1.buf.p4(Integer.MIN_VALUE);
                            } else {
                                var1.buf.p4(var8 | var7 << 16);
                            }
                        } else {
                            var1.buf.p2((var11 & 0x1FFF) + 57344);
                            if (var8 == -1 || var7 == -1) {
                                var1.buf.p4(Integer.MIN_VALUE);
                            } else {
                                var1.buf.p4(var8 | var7 << 16);
                            }
                        }
                        var4++;
                        this.method8356(var1.buf, var6);
                        this.field5048 = var6.method15185();
                        var6.method15186();
                    }
                }
            }
            if (var1 != null) {
                var1.buf.psize1(var1.buf.pos - var2);
                int var12 = var1.buf.pos;
                var1.buf.pos = var2;
                var1.buf.p1(var3 / var4);
                var1.buf.p1(var3 % var4);
                var1.buf.pos = var12;
                client.gameConnection.queue(var1);
            }
        }
        this.method8357();
    }

    @ObfuscatedName("qs.j(B)V")
    public void method8350() {
        this.field5050.clearBridged();
        this.field5047 = -1L;
        this.field5048 = -1L;
        this.field5049 = -1;
        this.field5046 = -1;
    }

    @ObfuscatedName("qs.a(Ladv;B)V")
    public void method8370(BasicMouseEvent arg0) {
        this.field5050.addTail(arg0);
    }

    @ObfuscatedName("qs.s(Ladv;IB)I")
    public int method8354(BasicMouseEvent arg0, int arg1) {
        long var3;
        if (this.field5047 == -1L) {
            var3 = arg1;
        } else {
            var3 = arg0.method15185() - this.field5047;
            if (var3 > (long) arg1) {
                var3 = arg1;
            }
        }
        this.field5047 = arg0.method15185();
        return (int) var3;
    }

    @ObfuscatedName("qs.c(I)I")
    public abstract int method8355();

    @ObfuscatedName("qs.m(Laet;Ladv;B)V")
    public abstract void method8356(Packet arg0, BasicMouseEvent arg1);

    @ObfuscatedName("qs.t(B)V")
    public abstract void method8357();

    @ObfuscatedName("qs.l(I)Z")
    public abstract boolean method8358();

    @ObfuscatedName("qs.f(I)Lada;")
    public abstract ClientMessage method8375();
}
