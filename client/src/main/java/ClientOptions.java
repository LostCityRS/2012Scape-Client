import deob.ObfuscatedName;

@ObfuscatedName("aeg")
public class ClientOptions extends Node {

    @ObfuscatedName("aeg.l")
    public final ModeGame field9639;

    @ObfuscatedName("aeg.f")
    public final ClientOptionsHardwareInfo field9638;

    @ObfuscatedName("aeg.d")
    public ClientOptionsAntiAliasing antialiasingDefault;

    @ObfuscatedName("aeg.z")
    public ClientOptionsAntiAliasing antialiasing;

    @ObfuscatedName("aeg.n")
    public ClientOptionsBloom bloom;

    @ObfuscatedName("aeg.o")
    public ClientOptionsBrightness brightness;

    @ObfuscatedName("aeg.q")
    public ClientOptionsBuildArea buildArea;

    @ObfuscatedName("aeg.p")
    public ClientOptionsDrawDistance drawDistance;

    @ObfuscatedName("aeg.w")
    public ClientOptionsFlickeringEffects flickeringEffects;

    @ObfuscatedName("aeg.b")
    public ClientOptionsFog fog;

    @ObfuscatedName("aeg.x")
    public ClientOptionsGroundBlending groundBlending;

    @ObfuscatedName("aeg.i")
    public ClientOptionsGroundDecoration groundDecor;

    @ObfuscatedName("aeg.v")
    public ClientOptionsIdleAnimations idleAnims;

    @ObfuscatedName("aeg.k")
    public ClientOptionsLightingDetail lightDetail;

    @ObfuscatedName("aeg.h")
    public ClientOptionsSceneryShadows sceneryShadows;

    @ObfuscatedName("aeg.r")
    public ClientOptionsOrthographic orthographic;

    @ObfuscatedName("aeg.g")
    public ClientOptionsParticles particles;

    @ObfuscatedName("aeg.y")
    public ClientOptionsRemoveRoofs removeRoof;

    @ObfuscatedName("aeg.e")
    public ClientOptionsRemoveRoofs removeRoofOverride;

    @ObfuscatedName("aeg.ay")
    public ClientOptionsScreenSize maxScreensize;

    @ObfuscatedName("aeg.af")
    public ClientOptionsSkyboxes skyDetail;

    @ObfuscatedName("aeg.ar")
    public ClientOptionsCharacterShadows characterShadows;

    @ObfuscatedName("aeg.an")
    public ClientOptionsTextures texturing;

    @ObfuscatedName("aeg.ap")
    public ClientOptionsDisplayMode toolkitDefault;

    @ObfuscatedName("aeg.ag")
    public ClientOptionsDisplayMode toolkit;

    @ObfuscatedName("aeg.as")
    public ClientOptionsWaterDetail waterDetail;

    @ObfuscatedName("aeg.ai")
    public ClientOptionsMaxScreenSize maxScreenSize;

    @ObfuscatedName("aeg.ao")
    public ClientOptionsMaxScreenSize field9664;

    @ObfuscatedName("aeg.al")
    public ClientOptionsCustomCursors customCursors;

    @ObfuscatedName("aeg.at")
    public ClientOptionsPreset preset;

    @ObfuscatedName("aeg.ax")
    public ClientOptionsCpuUsage cpuUsage;

    @ObfuscatedName("aeg.aw")
    public ClientOptionsLoadingScreen loadingScreen;

    @ObfuscatedName("aeg.aa")
    public ClientOptionsUnknown1 field9669;

    @ObfuscatedName("aeg.am")
    public ClientOptionsUnknown2 field9667;

    @ObfuscatedName("aeg.ad")
    public ClientOptionsVolume volumeMainEffects;

    @ObfuscatedName("aeg.az")
    public ClientOptionsVolume volumeBackgroundEffects;

    @ObfuscatedName("aeg.ak")
    public ClientOptionsVolume volumeSpeech;

    @ObfuscatedName("aeg.av")
    public ClientOptionsVolume volumeMainMusic;

    @ObfuscatedName("aeg.aj")
    public ClientOptionsVolume volumeLoginMusic;

    @ObfuscatedName("aeg.ah")
    public ClientOptionsStereo stereo;

    public ClientOptions(ModeGame arg0, int arg1) {
        this.field9639 = arg0;
        this.field9638 = new ClientOptionsHardwareInfo(GameShell.field4152, GameShell.field4144, Statics.field4150.toLowerCase().indexOf("arm") != -1);
        this.toolkit = new ClientOptionsDisplayMode(arg1, this);
        this.init(true);
    }

    public ClientOptions(Packet arg0, ModeGame arg1, int arg2) {
        this.field9639 = arg1;
        this.field9638 = new ClientOptionsHardwareInfo(GameShell.field4152, GameShell.field4144, Statics.field4150.indexOf("arm") != -1);
        this.toolkit = new ClientOptionsDisplayMode(arg2, this);
        this.method15443(arg0);
    }

    @ObfuscatedName("aeg.u(Laet;I)V")
    public void method15443(Packet arg0) {
        if (arg0 == null || arg0.data == null) {
            this.init(true);
        } else {
            int var2 = arg0.g1();
            if (var2 < 23) {
                try {
                    this.method15446(arg0, var2);
                } catch (Exception var4) {
                    this.init(true);
                }
                this.init(false);
            } else if (var2 > 27) {
                this.init(true);
            } else {
                this.antialiasingDefault = new ClientOptionsAntiAliasing(arg0.g1(), this);
                this.antialiasing = new ClientOptionsAntiAliasing(this.antialiasingDefault.getValue(), this);
                this.bloom = new ClientOptionsBloom(arg0.g1(), this);
                this.brightness = new ClientOptionsBrightness(arg0.g1(), this);
                this.buildArea = new ClientOptionsBuildArea(arg0.g1(), this);
                if (var2 >= 27) {
                    this.drawDistance = new ClientOptionsDrawDistance(arg0.g1(), this);
                }
                this.flickeringEffects = new ClientOptionsFlickeringEffects(arg0.g1(), this);
                this.fog = new ClientOptionsFog(arg0.g1(), this);
                this.groundBlending = new ClientOptionsGroundBlending(arg0.g1(), this);
                this.groundDecor = new ClientOptionsGroundDecoration(arg0.g1(), this);
                this.idleAnims = new ClientOptionsIdleAnimations(arg0.g1(), this);
                this.lightDetail = new ClientOptionsLightingDetail(arg0.g1(), this);
                this.sceneryShadows = new ClientOptionsSceneryShadows(arg0.g1(), this);
                if (var2 >= 24) {
                    this.orthographic = new ClientOptionsOrthographic(arg0.g1(), this);
                }
                this.particles = new ClientOptionsParticles(arg0.g1(), this);
                this.removeRoof = new ClientOptionsRemoveRoofs(arg0.g1(), this);
                this.removeRoofOverride = new ClientOptionsRemoveRoofs(this.removeRoof.getValue(), this);
                this.maxScreensize = new ClientOptionsScreenSize(arg0.g1(), this);
                if (var2 >= 25) {
                    this.skyDetail = new ClientOptionsSkyboxes(arg0.g1(), this);
                }
                this.characterShadows = new ClientOptionsCharacterShadows(arg0.g1(), this);
                if (var2 <= 25) {
                    arg0.pos++;
                }
                this.texturing = new ClientOptionsTextures(arg0.g1(), this);
                this.toolkitDefault = new ClientOptionsDisplayMode(arg0.g1(), this);
                this.toolkit = new ClientOptionsDisplayMode(this.toolkitDefault.getValue(), this);
                arg0.g1();
                this.waterDetail = new ClientOptionsWaterDetail(arg0.g1(), this);
                this.maxScreenSize = new ClientOptionsMaxScreenSize(arg0.g1(), this);
                this.field9664 = new ClientOptionsMaxScreenSize(this.maxScreenSize.getValue(), this);
                this.customCursors = new ClientOptionsCustomCursors(arg0.g1(), this);
                this.preset = new ClientOptionsPreset(arg0.g1(), this);
                this.cpuUsage = new ClientOptionsCpuUsage(arg0.g1(), this);
                this.loadingScreen = new ClientOptionsLoadingScreen(arg0.g1(), this);
                this.field9669 = new ClientOptionsUnknown1(arg0.g1(), this);
                if (var2 >= 26) {
                    this.field9667 = new ClientOptionsUnknown2(arg0.g1(), this);
                }
                this.volumeMainEffects = new ClientOptionsVolume(arg0.g1(), this);
                this.volumeBackgroundEffects = new ClientOptionsVolume(arg0.g1(), this);
                this.volumeSpeech = new ClientOptionsVolume(arg0.g1(), this);
                this.volumeMainMusic = new ClientOptionsVolume(arg0.g1(), this);
                this.volumeLoginMusic = new ClientOptionsVolume(arg0.g1(), this);
                this.stereo = new ClientOptionsStereo(arg0.g1(), this);
                this.init(false);
            }
        }
        this.method15444();
    }

    @ObfuscatedName("aeg.j(ZB)V")
    public void init(boolean reset) {
        if (reset || this.antialiasingDefault == null) {
            this.antialiasingDefault = new ClientOptionsAntiAliasing(this);
        }
        if (reset || this.antialiasing == null) {
            this.antialiasing = new ClientOptionsAntiAliasing(this.antialiasingDefault.getValue(), this);
        }
        if (reset || this.bloom == null) {
            this.bloom = new ClientOptionsBloom(this);
        }
        if (reset || this.brightness == null) {
            this.brightness = new ClientOptionsBrightness(this);
        }
        if (reset || this.buildArea == null) {
            this.buildArea = new ClientOptionsBuildArea(this);
        }
        if (reset || this.drawDistance == null) {
            this.drawDistance = new ClientOptionsDrawDistance(this);
        }
        if (reset || this.flickeringEffects == null) {
            this.flickeringEffects = new ClientOptionsFlickeringEffects(this);
        }
        if (reset || this.fog == null) {
            this.fog = new ClientOptionsFog(this);
        }
        if (reset || this.groundBlending == null) {
            this.groundBlending = new ClientOptionsGroundBlending(this);
        }
        if (reset || this.groundDecor == null) {
            this.groundDecor = new ClientOptionsGroundDecoration(this);
        }
        if (reset || this.idleAnims == null) {
            this.idleAnims = new ClientOptionsIdleAnimations(this);
        }
        if (reset || this.lightDetail == null) {
            this.lightDetail = new ClientOptionsLightingDetail(this);
        }
        if (reset || this.sceneryShadows == null) {
            this.sceneryShadows = new ClientOptionsSceneryShadows(this);
        }
        if (reset || this.orthographic == null) {
            this.orthographic = new ClientOptionsOrthographic(this);
        }
        if (reset || this.particles == null) {
            this.particles = new ClientOptionsParticles(this);
        }
        if (reset || this.removeRoof == null) {
            this.removeRoof = new ClientOptionsRemoveRoofs(this);
        }
        if (reset || this.removeRoofOverride == null) {
            this.removeRoofOverride = new ClientOptionsRemoveRoofs(this.removeRoof.getValue(), this);
        }
        if (reset || this.maxScreensize == null) {
            this.maxScreensize = new ClientOptionsScreenSize(this);
        }
        if (reset || this.skyDetail == null) {
            this.skyDetail = new ClientOptionsSkyboxes(this);
        }
        if (reset || this.characterShadows == null) {
            this.characterShadows = new ClientOptionsCharacterShadows(this);
        }
        if (reset || this.texturing == null) {
            this.texturing = new ClientOptionsTextures(this);
        }
        if (reset || this.toolkitDefault == null) {
            this.toolkitDefault = new ClientOptionsDisplayMode(this);
        }
        if (reset || this.toolkit == null) {
            this.toolkit = new ClientOptionsDisplayMode(this.toolkitDefault.getValue(), this);
        }
        if (reset || this.waterDetail == null) {
            this.waterDetail = new ClientOptionsWaterDetail(this);
        }
        if (reset || this.maxScreenSize == null) {
            this.maxScreenSize = new ClientOptionsMaxScreenSize(this);
        }
        if (reset || this.field9664 == null) {
            this.field9664 = new ClientOptionsMaxScreenSize(this.maxScreenSize.getValue(), this);
        }
        if (reset || this.customCursors == null) {
            this.customCursors = new ClientOptionsCustomCursors(this);
        }
        if (reset || this.preset == null) {
            this.preset = new ClientOptionsPreset(this);
        }
        if (reset || this.cpuUsage == null) {
            this.cpuUsage = new ClientOptionsCpuUsage(this);
        }
        if (reset || this.loadingScreen == null) {
            this.loadingScreen = new ClientOptionsLoadingScreen(this);
        }
        if (reset || this.field9669 == null) {
            this.field9669 = new ClientOptionsUnknown1(this);
        }
        if (reset || this.field9667 == null) {
            this.field9667 = new ClientOptionsUnknown2(this);
        }
        if (reset || this.volumeMainEffects == null) {
            this.volumeMainEffects = new ClientOptionsVolume(this);
        }
        if (reset || this.volumeBackgroundEffects == null) {
            this.volumeBackgroundEffects = new ClientOptionsVolume(this);
        }
        if (reset || this.volumeSpeech == null) {
            this.volumeSpeech = new ClientOptionsVolume(this);
        }
        if (reset || this.volumeMainMusic == null) {
            this.volumeMainMusic = new ClientOptionsVolume(this);
        }
        if (reset || this.volumeLoginMusic == null) {
            this.volumeLoginMusic = new ClientOptionsVolume(this);
        }
        if (reset || this.stereo == null) {
            this.stereo = new ClientOptionsStereo(this);
        }
    }

    @ObfuscatedName("aeg.a(Laet;II)V")
    public void method15446(Packet arg0, int arg1) {
        this.brightness = new ClientOptionsBrightness(arg0.g1(), this);
        arg0.pos++;
        this.removeRoof = new ClientOptionsRemoveRoofs(arg0.g1() + 1, this);
        this.groundDecor = new ClientOptionsGroundDecoration(arg0.g1(), this);
        arg0.pos++;
        this.idleAnims = new ClientOptionsIdleAnimations(arg0.g1(), this);
        this.flickeringEffects = new ClientOptionsFlickeringEffects(arg0.g1(), this);
        arg0.g1();
        this.characterShadows = new ClientOptionsCharacterShadows(arg0.g1(), this);
        int var3 = arg0.g1();
        int var4 = 0;
        if (arg1 >= 17) {
            var4 = arg0.g1();
        }
        this.sceneryShadows = new ClientOptionsSceneryShadows(var3 > var4 ? var3 : var4, this);
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
        this.lightDetail = new ClientOptionsLightingDetail(var7 | var6 ? 1 : 0, this);
        this.waterDetail = new ClientOptionsWaterDetail(arg0.g1(), this);
        this.fog = new ClientOptionsFog(arg0.g1(), this);
        this.antialiasingDefault = new ClientOptionsAntiAliasing(arg0.g1(), this);
        this.stereo = new ClientOptionsStereo(arg0.g1(), this);
        this.volumeMainEffects = new ClientOptionsVolume(arg0.g1(), this);
        if (arg1 >= 20) {
            this.volumeSpeech = new ClientOptionsVolume(arg0.g1(), this);
        } else {
            this.volumeSpeech = new ClientOptionsVolume(this.volumeMainEffects.getValue(), this);
        }
        this.volumeMainMusic = new ClientOptionsVolume(arg0.g1(), this);
        this.volumeBackgroundEffects = new ClientOptionsVolume(arg0.g1(), this);
        if (arg1 >= 21) {
            this.volumeLoginMusic = new ClientOptionsVolume(arg0.g1(), this);
        } else {
            this.volumeLoginMusic = new ClientOptionsVolume(this.volumeMainMusic.getValue(), this);
        }
        if (arg1 >= 1) {
            arg0.g2();
            arg0.g2();
        }
        if (arg1 >= 3 && arg1 < 6) {
            arg0.g1();
        }
        if (arg1 >= 4) {
            this.particles = new ClientOptionsParticles(arg0.g1(), this);
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
            this.bloom = new ClientOptionsBloom(arg0.g1(), this);
        }
        if (arg1 >= 11) {
            this.customCursors = new ClientOptionsCustomCursors(arg0.g1(), this);
        }
        if (arg1 >= 12) {
            this.idleAnims = new ClientOptionsIdleAnimations(arg0.g1(), this);
        }
        if (arg1 >= 13) {
            this.groundBlending = new ClientOptionsGroundBlending(arg0.g1(), this);
        }
        if (arg1 >= 14) {
            this.toolkitDefault = new ClientOptionsDisplayMode(arg0.g1(), this);
        }
        if (arg1 >= 15) {
            this.cpuUsage = new ClientOptionsCpuUsage(arg0.g1(), this);
        }
        if (arg1 >= 16) {
            this.texturing = new ClientOptionsTextures(arg0.g1(), this);
        }
        if (arg1 >= 18) {
            this.preset = new ClientOptionsPreset(arg0.g1(), this);
        }
        if (arg1 >= 19) {
            this.maxScreensize = new ClientOptionsScreenSize(arg0.g1(), this);
        }
        if (arg1 >= 22) {
            this.loadingScreen = new ClientOptionsLoadingScreen(arg0.g1(), this);
        }
    }

    @ObfuscatedName("aeg.s(I)Laet;")
    public Packet createPreferencesBlock() {
        Packet var1 = new Packet(40);
        var1.p1(27);
        var1.p1(this.antialiasingDefault.getValue());
        var1.p1(this.bloom.getValue());
        var1.p1(this.brightness.method15672());
        var1.p1(this.buildArea.getValue());
        var1.p1(this.drawDistance.method15853());
        var1.p1(this.flickeringEffects.method15679());
        var1.p1(this.fog.method15696());
        var1.p1(this.groundBlending.method15843());
        var1.p1(this.groundDecor.method15725());
        var1.p1(this.idleAnims.method15837());
        var1.p1(this.lightDetail.getValue());
        var1.p1(this.sceneryShadows.getValue());
        var1.p1(this.orthographic.method15741());
        var1.p1(this.particles.method15716());
        var1.p1(this.removeRoof.getValue());
        var1.p1(this.maxScreensize.method15794());
        var1.p1(this.skyDetail.getValue());
        var1.p1(this.characterShadows.method15709());
        var1.p1(this.texturing.getValue());
        var1.p1(this.toolkitDefault.getValue());
        var1.p1(0);
        var1.p1(this.waterDetail.getValue());
        var1.p1(this.maxScreenSize.getValue());
        var1.p1(this.customCursors.method15908());
        var1.p1(this.preset.method15868());
        var1.p1(this.cpuUsage.method15874());
        var1.p1(this.loadingScreen.method15859());
        var1.p1(this.field9669.method15877());
        var1.p1(this.field9667.method15884());
        var1.p1(this.volumeMainEffects.getValue());
        var1.p1(this.volumeBackgroundEffects.getValue());
        var1.p1(this.volumeSpeech.getValue());
        var1.p1(this.volumeMainMusic.getValue());
        var1.p1(this.volumeLoginMusic.getValue());
        var1.p1(this.stereo.getValue());
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
        this.antialiasingDefault.method15826();
        this.antialiasing.method15826();
        this.bloom.method15818();
        this.brightness.method15673();
        this.buildArea.method15789();
        this.drawDistance.method15851();
        this.flickeringEffects.method15677();
        this.fog.method15695();
        this.groundBlending.method15841();
        this.groundDecor.method15723();
        this.idleAnims.method15835();
        this.lightDetail.method15665();
        this.sceneryShadows.method15748();
        this.orthographic.method15746();
        this.particles.method15715();
        this.removeRoof.method15734();
        this.removeRoofOverride.method15734();
        this.maxScreensize.method15796();
        this.skyDetail.method15804();
        this.characterShadows.method15706();
        this.texturing.method15685();
        this.toolkitDefault.method15773();
        this.toolkit.method15773();
        this.waterDetail.method15754();
        this.maxScreenSize.method15764();
        this.field9664.method15764();
        this.customCursors.method15906();
        this.preset.method15867();
        this.cpuUsage.method15873();
        this.loadingScreen.method15860();
        this.field9669.method15878();
        this.field9667.method15883();
        this.volumeMainEffects.checkValue();
        this.volumeBackgroundEffects.checkValue();
        this.volumeSpeech.checkValue();
        this.volumeMainMusic.checkValue();
        this.volumeLoginMusic.checkValue();
        this.stereo.method15888();
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
