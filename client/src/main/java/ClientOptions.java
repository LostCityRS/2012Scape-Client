import deob.ObfuscatedName;

@ObfuscatedName("aeg")
public class ClientOptions extends Node {

    @ObfuscatedName("aeg.l")
    public final ModeGame field9639;

    @ObfuscatedName("aeg.f")
    public final ClientOptionsHardwareInfo field9638;

    @ObfuscatedName("aeg.d")
    public ClientOptionsAntiAliasing field9637;

    @ObfuscatedName("aeg.z")
    public ClientOptionsAntiAliasing field9665;

    @ObfuscatedName("aeg.n")
    public ClientOptionsBloom field9673;

    @ObfuscatedName("aeg.o")
    public ClientOptionsBrightness field9642;

    @ObfuscatedName("aeg.q")
    public ClientOptionsBuildArea buildArea;

    @ObfuscatedName("aeg.p")
    public ClientOptionsDrawDistance field9644;

    @ObfuscatedName("aeg.w")
    public ClientOptionsFlickeringEffects field9645;

    @ObfuscatedName("aeg.b")
    public ClientOptionsFog field9646;

    @ObfuscatedName("aeg.x")
    public ClientOptionsGroundBlending field9647;

    @ObfuscatedName("aeg.i")
    public ClientOptionsGroundDecoration field9671;

    @ObfuscatedName("aeg.v")
    public ClientOptionsIdleAnimations field9649;

    @ObfuscatedName("aeg.k")
    public ClientOptionsLightingDetail field9650;

    @ObfuscatedName("aeg.h")
    public ClientOptionsSceneryShadows field9651;

    @ObfuscatedName("aeg.r")
    public ClientOptionsOrthographic field9641;

    @ObfuscatedName("aeg.g")
    public ClientOptionsParticles field9648;

    @ObfuscatedName("aeg.y")
    public ClientOptionsRemoveRoofs field9660;

    @ObfuscatedName("aeg.e")
    public ClientOptionsRemoveRoofs field9655;

    @ObfuscatedName("aeg.ay")
    public ClientOptionsScreenSize field9677;

    @ObfuscatedName("aeg.af")
    public ClientOptionsSkyboxes skyDetail;

    @ObfuscatedName("aeg.ar")
    public ClientOptionsCharacterShadows field9658;

    @ObfuscatedName("aeg.an")
    public ClientOptionsTextures field9659;

    @ObfuscatedName("aeg.ap")
    public ClientOptionsDisplayMode field9670;

    @ObfuscatedName("aeg.ag")
    public ClientOptionsDisplayMode field9661;

    @ObfuscatedName("aeg.as")
    public ClientOptionsWaterDetail field9666;

    @ObfuscatedName("aeg.ai")
    public ClientOptionsMaxScreenSize maxScreenSize;

    @ObfuscatedName("aeg.ao")
    public ClientOptionsMaxScreenSize field9664;

    @ObfuscatedName("aeg.al")
    public ClientOptionsCustomCursors field9640;

    @ObfuscatedName("aeg.at")
    public ClientOptionsPreset field9633;

    @ObfuscatedName("aeg.ax")
    public ClientOptionsCpuUsage field9652;

    @ObfuscatedName("aeg.aw")
    public ClientOptionsLoadingScreen field9668;

    @ObfuscatedName("aeg.aa")
    public ClientOptionsUnknown1 field9669;

    @ObfuscatedName("aeg.am")
    public ClientOptionsUnknown2 field9667;

    @ObfuscatedName("aeg.ad")
    public ClientOptionsVolume field9654;

    @ObfuscatedName("aeg.az")
    public ClientOptionsVolume field9672;

    @ObfuscatedName("aeg.ak")
    public ClientOptionsVolume field9653;

    @ObfuscatedName("aeg.av")
    public ClientOptionsVolume field9674;

    @ObfuscatedName("aeg.aj")
    public ClientOptionsVolume field9675;

    @ObfuscatedName("aeg.ah")
    public ClientOptionsStereo field9676;

    public ClientOptions(ModeGame arg0, int arg1) {
        this.field9639 = arg0;
        this.field9638 = new ClientOptionsHardwareInfo(GameShell.field4152, GameShell.field4144, Statics.field4150.toLowerCase().indexOf("arm") != -1);
        this.field9661 = new ClientOptionsDisplayMode(arg1, this);
        this.method15445(true);
    }

    public ClientOptions(Packet arg0, ModeGame arg1, int arg2) {
        this.field9639 = arg1;
        this.field9638 = new ClientOptionsHardwareInfo(GameShell.field4152, GameShell.field4144, Statics.field4150.indexOf("arm") != -1);
        this.field9661 = new ClientOptionsDisplayMode(arg2, this);
        this.method15443(arg0);
    }

    @ObfuscatedName("aeg.u(Laet;I)V")
    public void method15443(Packet arg0) {
        if (arg0 == null || arg0.data == null) {
            this.method15445(true);
        } else {
            int var2 = arg0.g1();
            if (var2 < 23) {
                try {
                    this.method15446(arg0, var2);
                } catch (Exception var4) {
                    this.method15445(true);
                }
                this.method15445(false);
            } else if (var2 > 27) {
                this.method15445(true);
            } else {
                this.field9637 = new ClientOptionsAntiAliasing(arg0.g1(), this);
                this.field9665 = new ClientOptionsAntiAliasing(this.field9637.method15829(), this);
                this.field9673 = new ClientOptionsBloom(arg0.g1(), this);
                this.field9642 = new ClientOptionsBrightness(arg0.g1(), this);
                this.buildArea = new ClientOptionsBuildArea(arg0.g1(), this);
                if (var2 >= 27) {
                    this.field9644 = new ClientOptionsDrawDistance(arg0.g1(), this);
                }
                this.field9645 = new ClientOptionsFlickeringEffects(arg0.g1(), this);
                this.field9646 = new ClientOptionsFog(arg0.g1(), this);
                this.field9647 = new ClientOptionsGroundBlending(arg0.g1(), this);
                this.field9671 = new ClientOptionsGroundDecoration(arg0.g1(), this);
                this.field9649 = new ClientOptionsIdleAnimations(arg0.g1(), this);
                this.field9650 = new ClientOptionsLightingDetail(arg0.g1(), this);
                this.field9651 = new ClientOptionsSceneryShadows(arg0.g1(), this);
                if (var2 >= 24) {
                    this.field9641 = new ClientOptionsOrthographic(arg0.g1(), this);
                }
                this.field9648 = new ClientOptionsParticles(arg0.g1(), this);
                this.field9660 = new ClientOptionsRemoveRoofs(arg0.g1(), this);
                this.field9655 = new ClientOptionsRemoveRoofs(this.field9660.method15735(), this);
                this.field9677 = new ClientOptionsScreenSize(arg0.g1(), this);
                if (var2 >= 25) {
                    this.skyDetail = new ClientOptionsSkyboxes(arg0.g1(), this);
                }
                this.field9658 = new ClientOptionsCharacterShadows(arg0.g1(), this);
                if (var2 <= 25) {
                    arg0.pos++;
                }
                this.field9659 = new ClientOptionsTextures(arg0.g1(), this);
                this.field9670 = new ClientOptionsDisplayMode(arg0.g1(), this);
                this.field9661 = new ClientOptionsDisplayMode(this.field9670.getValue(), this);
                arg0.g1();
                this.field9666 = new ClientOptionsWaterDetail(arg0.g1(), this);
                this.maxScreenSize = new ClientOptionsMaxScreenSize(arg0.g1(), this);
                this.field9664 = new ClientOptionsMaxScreenSize(this.maxScreenSize.getValue(), this);
                this.field9640 = new ClientOptionsCustomCursors(arg0.g1(), this);
                this.field9633 = new ClientOptionsPreset(arg0.g1(), this);
                this.field9652 = new ClientOptionsCpuUsage(arg0.g1(), this);
                this.field9668 = new ClientOptionsLoadingScreen(arg0.g1(), this);
                this.field9669 = new ClientOptionsUnknown1(arg0.g1(), this);
                if (var2 >= 26) {
                    this.field9667 = new ClientOptionsUnknown2(arg0.g1(), this);
                }
                this.field9654 = new ClientOptionsVolume(arg0.g1(), this);
                this.field9672 = new ClientOptionsVolume(arg0.g1(), this);
                this.field9653 = new ClientOptionsVolume(arg0.g1(), this);
                this.field9674 = new ClientOptionsVolume(arg0.g1(), this);
                this.field9675 = new ClientOptionsVolume(arg0.g1(), this);
                this.field9676 = new ClientOptionsStereo(arg0.g1(), this);
                this.method15445(false);
            }
        }
        this.method15444();
    }

    @ObfuscatedName("aeg.j(ZB)V")
    public void method15445(boolean arg0) {
        if (arg0 || this.field9637 == null) {
            this.field9637 = new ClientOptionsAntiAliasing(this);
        }
        if (arg0 || this.field9665 == null) {
            this.field9665 = new ClientOptionsAntiAliasing(this.field9637.method15829(), this);
        }
        if (arg0 || this.field9673 == null) {
            this.field9673 = new ClientOptionsBloom(this);
        }
        if (arg0 || this.field9642 == null) {
            this.field9642 = new ClientOptionsBrightness(this);
        }
        if (arg0 || this.buildArea == null) {
            this.buildArea = new ClientOptionsBuildArea(this);
        }
        if (arg0 || this.field9644 == null) {
            this.field9644 = new ClientOptionsDrawDistance(this);
        }
        if (arg0 || this.field9645 == null) {
            this.field9645 = new ClientOptionsFlickeringEffects(this);
        }
        if (arg0 || this.field9646 == null) {
            this.field9646 = new ClientOptionsFog(this);
        }
        if (arg0 || this.field9647 == null) {
            this.field9647 = new ClientOptionsGroundBlending(this);
        }
        if (arg0 || this.field9671 == null) {
            this.field9671 = new ClientOptionsGroundDecoration(this);
        }
        if (arg0 || this.field9649 == null) {
            this.field9649 = new ClientOptionsIdleAnimations(this);
        }
        if (arg0 || this.field9650 == null) {
            this.field9650 = new ClientOptionsLightingDetail(this);
        }
        if (arg0 || this.field9651 == null) {
            this.field9651 = new ClientOptionsSceneryShadows(this);
        }
        if (arg0 || this.field9641 == null) {
            this.field9641 = new ClientOptionsOrthographic(this);
        }
        if (arg0 || this.field9648 == null) {
            this.field9648 = new ClientOptionsParticles(this);
        }
        if (arg0 || this.field9660 == null) {
            this.field9660 = new ClientOptionsRemoveRoofs(this);
        }
        if (arg0 || this.field9655 == null) {
            this.field9655 = new ClientOptionsRemoveRoofs(this.field9660.method15735(), this);
        }
        if (arg0 || this.field9677 == null) {
            this.field9677 = new ClientOptionsScreenSize(this);
        }
        if (arg0 || this.skyDetail == null) {
            this.skyDetail = new ClientOptionsSkyboxes(this);
        }
        if (arg0 || this.field9658 == null) {
            this.field9658 = new ClientOptionsCharacterShadows(this);
        }
        if (arg0 || this.field9659 == null) {
            this.field9659 = new ClientOptionsTextures(this);
        }
        if (arg0 || this.field9670 == null) {
            this.field9670 = new ClientOptionsDisplayMode(this);
        }
        if (arg0 || this.field9661 == null) {
            this.field9661 = new ClientOptionsDisplayMode(this.field9670.getValue(), this);
        }
        if (arg0 || this.field9666 == null) {
            this.field9666 = new ClientOptionsWaterDetail(this);
        }
        if (arg0 || this.maxScreenSize == null) {
            this.maxScreenSize = new ClientOptionsMaxScreenSize(this);
        }
        if (arg0 || this.field9664 == null) {
            this.field9664 = new ClientOptionsMaxScreenSize(this.maxScreenSize.getValue(), this);
        }
        if (arg0 || this.field9640 == null) {
            this.field9640 = new ClientOptionsCustomCursors(this);
        }
        if (arg0 || this.field9633 == null) {
            this.field9633 = new ClientOptionsPreset(this);
        }
        if (arg0 || this.field9652 == null) {
            this.field9652 = new ClientOptionsCpuUsage(this);
        }
        if (arg0 || this.field9668 == null) {
            this.field9668 = new ClientOptionsLoadingScreen(this);
        }
        if (arg0 || this.field9669 == null) {
            this.field9669 = new ClientOptionsUnknown1(this);
        }
        if (arg0 || this.field9667 == null) {
            this.field9667 = new ClientOptionsUnknown2(this);
        }
        if (arg0 || this.field9654 == null) {
            this.field9654 = new ClientOptionsVolume(this);
        }
        if (arg0 || this.field9672 == null) {
            this.field9672 = new ClientOptionsVolume(this);
        }
        if (arg0 || this.field9653 == null) {
            this.field9653 = new ClientOptionsVolume(this);
        }
        if (arg0 || this.field9674 == null) {
            this.field9674 = new ClientOptionsVolume(this);
        }
        if (arg0 || this.field9675 == null) {
            this.field9675 = new ClientOptionsVolume(this);
        }
        if (arg0 || this.field9676 == null) {
            this.field9676 = new ClientOptionsStereo(this);
        }
    }

    @ObfuscatedName("aeg.a(Laet;II)V")
    public void method15446(Packet arg0, int arg1) {
        this.field9642 = new ClientOptionsBrightness(arg0.g1(), this);
        arg0.pos++;
        this.field9660 = new ClientOptionsRemoveRoofs(arg0.g1() + 1, this);
        this.field9671 = new ClientOptionsGroundDecoration(arg0.g1(), this);
        arg0.pos++;
        this.field9649 = new ClientOptionsIdleAnimations(arg0.g1(), this);
        this.field9645 = new ClientOptionsFlickeringEffects(arg0.g1(), this);
        arg0.g1();
        this.field9658 = new ClientOptionsCharacterShadows(arg0.g1(), this);
        int var3 = arg0.g1();
        int var4 = 0;
        if (arg1 >= 17) {
            var4 = arg0.g1();
        }
        this.field9651 = new ClientOptionsSceneryShadows(var3 > var4 ? var3 : var4, this);
        boolean var5 = true;
        boolean var6 = true;
        boolean var7;
        if (arg1 >= 2) {
            var7 = arg0.g1() == 1;
            if (arg1 >= 17) {
                var6 = arg0.g1() == 1;
            }
        } else {
            var7 = arg0.g1() == 1;
            arg0.g1();
        }
        this.field9650 = new ClientOptionsLightingDetail(var7 | var6 ? 1 : 0, this);
        this.field9666 = new ClientOptionsWaterDetail(arg0.g1(), this);
        this.field9646 = new ClientOptionsFog(arg0.g1(), this);
        this.field9637 = new ClientOptionsAntiAliasing(arg0.g1(), this);
        this.field9676 = new ClientOptionsStereo(arg0.g1(), this);
        this.field9654 = new ClientOptionsVolume(arg0.g1(), this);
        if (arg1 >= 20) {
            this.field9653 = new ClientOptionsVolume(arg0.g1(), this);
        } else {
            this.field9653 = new ClientOptionsVolume(this.field9654.method15899(), this);
        }
        this.field9674 = new ClientOptionsVolume(arg0.g1(), this);
        this.field9672 = new ClientOptionsVolume(arg0.g1(), this);
        if (arg1 >= 21) {
            this.field9675 = new ClientOptionsVolume(arg0.g1(), this);
        } else {
            this.field9675 = new ClientOptionsVolume(this.field9674.method15899(), this);
        }
        if (arg1 >= 1) {
            arg0.g2();
            arg0.g2();
        }
        if (arg1 >= 3 && arg1 < 6) {
            arg0.g1();
        }
        if (arg1 >= 4) {
            this.field9648 = new ClientOptionsParticles(arg0.g1(), this);
        }
        arg0.g4s();
        if (arg1 >= 6) {
            this.maxScreenSize = new ClientOptionsMaxScreenSize(arg0.g1(), this);
        }
        if (arg1 >= 7) {
            this.field9669 = new ClientOptionsUnknown1(arg0.g1(), this);
        }
        if (arg1 >= 8) {
            arg0.g1();
        }
        if (arg1 >= 9) {
            this.buildArea = new ClientOptionsBuildArea(arg0.g1(), this);
        }
        if (arg1 >= 10) {
            this.field9673 = new ClientOptionsBloom(arg0.g1(), this);
        }
        if (arg1 >= 11) {
            this.field9640 = new ClientOptionsCustomCursors(arg0.g1(), this);
        }
        if (arg1 >= 12) {
            this.field9649 = new ClientOptionsIdleAnimations(arg0.g1(), this);
        }
        if (arg1 >= 13) {
            this.field9647 = new ClientOptionsGroundBlending(arg0.g1(), this);
        }
        if (arg1 >= 14) {
            this.field9670 = new ClientOptionsDisplayMode(arg0.g1(), this);
        }
        if (arg1 >= 15) {
            this.field9652 = new ClientOptionsCpuUsage(arg0.g1(), this);
        }
        if (arg1 >= 16) {
            this.field9659 = new ClientOptionsTextures(arg0.g1(), this);
        }
        if (arg1 >= 18) {
            this.field9633 = new ClientOptionsPreset(arg0.g1(), this);
        }
        if (arg1 >= 19) {
            this.field9677 = new ClientOptionsScreenSize(arg0.g1(), this);
        }
        if (arg1 >= 22) {
            this.field9668 = new ClientOptionsLoadingScreen(arg0.g1(), this);
        }
    }

    @ObfuscatedName("aeg.s(I)Laet;")
    public Packet createPreferencesBlock() {
        Packet var1 = new Packet(40);
        var1.p1(27);
        var1.p1(this.field9637.method15829());
        var1.p1(this.field9673.method15816());
        var1.p1(this.field9642.method15672());
        var1.p1(this.buildArea.getValue());
        var1.p1(this.field9644.method15853());
        var1.p1(this.field9645.method15679());
        var1.p1(this.field9646.method15696());
        var1.p1(this.field9647.method15843());
        var1.p1(this.field9671.method15725());
        var1.p1(this.field9649.method15837());
        var1.p1(this.field9650.method15667());
        var1.p1(this.field9651.method15747());
        var1.p1(this.field9641.method15741());
        var1.p1(this.field9648.method15716());
        var1.p1(this.field9660.method15735());
        var1.p1(this.field9677.method15794());
        var1.p1(this.skyDetail.getValue());
        var1.p1(this.field9658.method15709());
        var1.p1(this.field9659.method15686());
        var1.p1(this.field9670.getValue());
        var1.p1(0);
        var1.p1(this.field9666.method15755());
        var1.p1(this.maxScreenSize.getValue());
        var1.p1(this.field9640.method15908());
        var1.p1(this.field9633.method15868());
        var1.p1(this.field9652.method15874());
        var1.p1(this.field9668.method15859());
        var1.p1(this.field9669.method15877());
        var1.p1(this.field9667.method15884());
        var1.p1(this.field9654.method15899());
        var1.p1(this.field9672.method15899());
        var1.p1(this.field9653.method15899());
        var1.p1(this.field9674.method15899());
        var1.p1(this.field9675.method15899());
        var1.p1(this.field9676.method15891());
        return var1;
    }

    @ObfuscatedName("aeg.c(Ltb;II)V")
    public void method15448(ClientOption arg0, int arg1) {
        arg0.method11388(arg1);
        this.method15444();
    }

    @ObfuscatedName("aeg.m(Lafs;ZI)V")
    public void method15449(ClientOptionsDisplayMode arg0, boolean arg1) {
        arg0.method15780(arg1);
        this.method15444();
    }

    @ObfuscatedName("aeg.t(I)V")
    public void method15444() {
        this.field9637.method15826();
        this.field9665.method15826();
        this.field9673.method15818();
        this.field9642.method15673();
        this.buildArea.method15789();
        this.field9644.method15851();
        this.field9645.method15677();
        this.field9646.method15695();
        this.field9647.method15841();
        this.field9671.method15723();
        this.field9649.method15835();
        this.field9650.method15665();
        this.field9651.method15748();
        this.field9641.method15746();
        this.field9648.method15715();
        this.field9660.method15734();
        this.field9655.method15734();
        this.field9677.method15796();
        this.skyDetail.method15804();
        this.field9658.method15706();
        this.field9659.method15685();
        this.field9670.method15773();
        this.field9661.method15773();
        this.field9666.method15754();
        this.maxScreenSize.method15764();
        this.field9664.method15764();
        this.field9640.method15906();
        this.field9633.method15867();
        this.field9652.method15873();
        this.field9668.method15860();
        this.field9669.method15878();
        this.field9667.method15883();
        this.field9654.method15897();
        this.field9672.method15897();
        this.field9653.method15897();
        this.field9674.method15897();
        this.field9675.method15897();
        this.field9676.method15888();
    }

    @ObfuscatedName("aeg.l(I)Lsv;")
    public ModeGame method15452() {
        return this.field9639;
    }

    @ObfuscatedName("aeg.f(B)Ltr;")
    public ClientOptionsHardwareInfo method15462() {
        return this.field9638;
    }
}
