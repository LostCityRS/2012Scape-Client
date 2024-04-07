import deob.ObfuscatedName;
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

@ObfuscatedName("aeb")
public class HardwarePlatform extends Node {

    @ObfuscatedName("aeb.f")
    public int field9698;

    @ObfuscatedName("aeb.d")
    public boolean field9687;

    @ObfuscatedName("aeb.g")
    public int field9715;

    @ObfuscatedName("aeb.ar")
    public int field9706;

    @ObfuscatedName("aeb.an")
    public int field9707;

    @ObfuscatedName("aeb.ap")
    public int field9713;

    @ObfuscatedName("aeb.ag")
    public int field9701;

    @ObfuscatedName("aeb.as")
    public boolean field9710;

    @ObfuscatedName("aeb.ai")
    public int field9711;

    @ObfuscatedName("aeb.al")
    public int field9705;

    @ObfuscatedName("aeb.ax")
    public int field9703;

    @ObfuscatedName("aeb.aw")
    public int field9716;

    @ObfuscatedName("aeb.aa")
    public String field9717;

    @ObfuscatedName("aeb.am")
    public String field9718;

    @ObfuscatedName("aeb.ad")
    public String field9719;

    @ObfuscatedName("aeb.az")
    public String field9720;

    @ObfuscatedName("aeb.ak")
    public int field9721;

    @ObfuscatedName("aeb.av")
    public int field9722;

    @ObfuscatedName("aeb.aj")
    public int field9728;

    @ObfuscatedName("aeb.ah")
    public int field9724;

    @ObfuscatedName("aeb.au")
    public String field9725;

    @ObfuscatedName("aeb.ae")
    public String field9726;

    @ObfuscatedName("aeb.ac")
    public int[] field9727 = new int[3];

    @ObfuscatedName("aeb.aq")
    public int field9685;

    public HardwarePlatform(boolean arg0) {
        if (arg0) {
            if (Statics.field2247.startsWith("win")) {
                this.field9698 = 1;
            } else if (Statics.field2247.startsWith("mac")) {
                this.field9698 = 2;
            } else if (Statics.field2247.startsWith("linux")) {
                this.field9698 = 3;
            } else {
                this.field9698 = 4;
            }
            if (Statics.field4150.startsWith("amd64") || Statics.field4150.startsWith("x86_64")) {
                this.field9687 = true;
            } else {
                this.field9687 = false;
            }
            if (this.field9698 == 1) {
                if (Statics.field862.indexOf("4.0") != -1) {
                    this.field9715 = 1;
                } else if (Statics.field862.indexOf("4.1") != -1) {
                    this.field9715 = 2;
                } else if (Statics.field862.indexOf("4.9") != -1) {
                    this.field9715 = 3;
                } else if (Statics.field862.indexOf("5.0") != -1) {
                    this.field9715 = 4;
                } else if (Statics.field862.indexOf("5.1") != -1) {
                    this.field9715 = 5;
                } else if (Statics.field862.indexOf("5.2") != -1) {
                    this.field9715 = 8;
                } else if (Statics.field862.indexOf("6.0") != -1) {
                    this.field9715 = 6;
                } else if (Statics.field862.indexOf("6.1") != -1) {
                    this.field9715 = 7;
                } else if (Statics.field862.indexOf("6.2") != -1) {
                    this.field9715 = 9;
                }
            } else if (this.field9698 == 2) {
                if (Statics.field862.indexOf("10.4") != -1) {
                    this.field9715 = 20;
                } else if (Statics.field862.indexOf("10.5") != -1) {
                    this.field9715 = 21;
                } else if (Statics.field862.indexOf("10.6") != -1) {
                    this.field9715 = 22;
                } else if (Statics.field862.indexOf("10.7") != -1) {
                    this.field9715 = 23;
                }
            }
            if (Statics.field3788.toLowerCase().indexOf("sun") != -1) {
                this.field9706 = 1;
            } else if (Statics.field3788.toLowerCase().indexOf("microsoft") != -1) {
                this.field9706 = 2;
            } else if (Statics.field3788.toLowerCase().indexOf("apple") == -1) {
                this.field9706 = 4;
            } else {
                this.field9706 = 3;
            }
            int var2 = 2;
            int var3 = 0;
            try {
                while (var2 < Statics.field726.length()) {
                    char var4 = Statics.field726.charAt(var2);
                    if (var4 < '0' || var4 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + (var4 - '0');
                    var2++;
                }
            } catch (Exception var48) {
            }
            this.field9707 = var3;
            int var6 = Statics.field726.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < Statics.field726.length()) {
                    char var8 = Statics.field726.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + (var8 - '0');
                    var6++;
                }
            } catch (Exception var47) {
            }
            this.field9713 = var7;
            int var10 = Statics.field726.indexOf(95, 4) + 1;
            int var11 = 0;
            try {
                while (var10 < Statics.field726.length()) {
                    char var12 = Statics.field726.charAt(var10);
                    if (var12 < '0' || var12 > '9') {
                        break;
                    }
                    var11 = var11 * 10 + (var12 - '0');
                    var10++;
                }
            } catch (Exception var46) {
            }
            this.field9701 = var11;
            this.field9710 = false;
            this.field9711 = GameShell.field4152;
            if (this.field9707 > 3) {
                this.field9705 = GameShell.field4144;
            } else {
                this.field9705 = 0;
            }
            try {
                int[] var14 = HardwareInfo.getCPUInfo();
                if (var14 != null && var14.length == 3) {
                    this.field9728 = var14[0];
                    this.field9716 = var14[1];
                    this.field9703 = var14[2];
                }
                int[] var15 = HardwareInfo.getRawCPUInfo();
                if (var15 != null && var15.length % 5 == 0) {
                    HashMap var16 = new HashMap();
                    for (int var17 = 0; var17 < var15.length / 5; var17++) {
                        int var18 = var15[var17 * 5];
                        int var19 = var15[var17 * 5 + 1];
                        int var20 = var15[var17 * 5 + 2];
                        int var21 = var15[var17 * 5 + 3];
                        int var22 = var15[var17 * 5 + 4];
                        RawCpuInfo var23 = new RawCpuInfo(var18, var19, var20, var21, var22);
                        var16.put(var18, var23);
                    }
                    RawCpuInfo var24 = (RawCpuInfo) var16.get(0);
                    if (var24 != null) {
                        Packet var25 = new Packet(13);
                        var25.ip4(var24.field6822);
                        var25.ip4(var24.field6820);
                        var25.ip4(var24.field6823);
                        var25.pos = 0;
                        this.field9725 = var25.gjstr();
                    }
                    RawCpuInfo var26 = (RawCpuInfo) var16.get(1);
                    if (var26 != null) {
                        this.field9685 = var26.field6821;
                        int var27 = var26.field6822;
                        this.field9724 = var27 >> 16 & 0xFF;
                        this.field9727[0] = var26.field6823;
                        this.field9727[1] = var26.field6820;
                    }
                    RawCpuInfo var28 = (RawCpuInfo) var16.get(-2147483647);
                    if (var28 != null) {
                        this.field9727[2] = var28.field6820;
                    }
                    Packet var29 = new Packet(49);
                    for (int var30 = -2147483646; var30 <= -2147483644; var30++) {
                        RawCpuInfo var31 = (RawCpuInfo) var16.get(var30);
                        if (var31 != null) {
                            var29.ip4(var31.field6821);
                            var29.ip4(var31.field6822);
                            var29.ip4(var31.field6823);
                            var29.ip4(var31.field6820);
                        }
                    }
                    var29.pos = 0;
                    this.field9726 = var29.gjstr();
                }
                String[][] var32 = HardwareInfo.getDXDiagDisplayDevicesProps();
                if (var32 != null && var32.length > 0 && var32[0] != null) {
                    for (int var33 = 0; var33 < var32[0].length; var33 += 2) {
                        if (var32[0][var33].equalsIgnoreCase("szDescription")) {
                            this.field9717 = var32[0][var33 + 1];
                        } else if (var32[0][var33].equalsIgnoreCase("szDriverDateEnglish")) {
                            String var34 = var32[0][var33 + 1];
                            try {
                                int var35 = var34.indexOf("/");
                                int var36 = var34.indexOf("/", var35 + 1);
                                this.field9722 = Integer.parseInt(var34.substring(0, var35));
                                this.field9721 = Integer.parseInt(var34.substring(var36 + 1, var34.indexOf(" ", var36)));
                            } catch (Exception var44) {
                            }
                        }
                    }
                }
                String[] var38 = HardwareInfo.getDXDiagSystemProps();
                if (var38 != null) {
                    String var39 = "";
                    String var40 = "";
                    String var41 = "";
                    for (int var42 = 0; var42 < var38.length; var42 += 2) {
                        if (var38[var42].equalsIgnoreCase("dwDirectXVersionMajor")) {
                            var39 = var38[var42 + 1];
                        } else if (var38[var42].equalsIgnoreCase("dwDirectXVersionMinor")) {
                            var40 = var38[var42 + 1];
                        } else if (var38[var42].equalsIgnoreCase("dwDirectXVersionLetter")) {
                            var41 = var38[var42 + 1];
                        }
                    }
                    this.field9719 = var39 + "." + var40 + var41;
                }
            } catch (Throwable var45) {
                this.field9703 = 0;
            }
        }
        if (this.field9717 == null) {
            this.field9717 = "";
        }
        if (this.field9718 == null) {
            this.field9718 = "";
        }
        if (this.field9719 == null) {
            this.field9719 = "";
        }
        if (this.field9720 == null) {
            this.field9720 = "";
        }
        if (this.field9725 == null) {
            this.field9725 = "";
        }
        if (this.field9726 == null) {
            this.field9726 = "";
        }
        this.method15474();
    }

    @ObfuscatedName("aeb.u(I)V")
    public void method15474() {
        if (this.field9717.length() > 40) {
            this.field9717 = this.field9717.substring(0, 40);
        }
        if (this.field9718.length() > 40) {
            this.field9718 = this.field9718.substring(0, 40);
        }
        if (this.field9719.length() > 10) {
            this.field9719 = this.field9719.substring(0, 10);
        }
        if (this.field9720.length() > 10) {
            this.field9720 = this.field9720.substring(0, 10);
        }
    }

    @ObfuscatedName("aeb.j(Laet;I)V")
    public void createHardwareBlock(Packet buf) {
        buf.p1(6);
        buf.p1(this.field9698);
        buf.p1(this.field9687 ? 1 : 0);
        buf.p1(this.field9715);
        buf.p1(this.field9706);
        buf.p1(this.field9707);
        buf.p1(this.field9713);
        buf.p1(this.field9701);
        buf.p1(this.field9710 ? 1 : 0);
        buf.p2(this.field9711);
        buf.p1(this.field9705);
        buf.p3(this.field9703);
        buf.p2(this.field9716);
        buf.pjstr2(this.field9717);
        buf.pjstr2(this.field9718);
        buf.pjstr2(this.field9719);
        buf.pjstr2(this.field9720);
        buf.p1(this.field9722);
        buf.p2(this.field9721);
        buf.pjstr2(this.field9725);
        buf.pjstr2(this.field9726);
        buf.p1(this.field9728);
        buf.p1(this.field9724);
        for (int var2 = 0; var2 < this.field9727.length; var2++) {
            buf.p4(this.field9727[var2]);
        }
        buf.p4(this.field9685);
    }

    @ObfuscatedName("aeb.a(I)I")
    public int method15476() {
        byte var1 = 38;
        int var2 = var1 + Packet.pjstr2len(this.field9717);
        int var3 = var2 + Packet.pjstr2len(this.field9718);
        int var4 = var3 + Packet.pjstr2len(this.field9719);
        int var5 = var4 + Packet.pjstr2len(this.field9720);
        int var6 = var5 + Packet.pjstr2len(this.field9725);
        return var6 + Packet.pjstr2len(this.field9726);
    }
}
