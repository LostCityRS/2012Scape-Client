import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("ks")
public class Loading {

    @ObfuscatedName("ks.u")
    public static final int[] field3425 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0};

    @ObfuscatedName("ks.s")
    public static int field3423 = -1;

    @ObfuscatedName("ks.w")
    public static boolean field3421 = false;

    @ObfuscatedName("ks.i")
    public static int field3424 = -1;

    public Loading() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ta.u(B)V")
    public static void method186() {
        field3421 = true;
        Statics.field6391 = LoginManager.field533;
        Statics.field4814 = LoginManager.field534;
        client.logout(false);
        Statics.field3420 = null;
        Statics.field3562 = null;
        client.setState(12);
    }

    @ObfuscatedName("wo.j(I)V")
    public static void method12645() {
        if (Statics.field3420 == null) {
            Statics.field3420 = Statics.method5013();
            Statics.field1208 = Statics.field3420[0];
            Statics.field1931 = MonotonicTime.get();
        }
        if (Statics.field6789 == null) {
            method3460();
        }
        LoadingStage var0 = Statics.field1208;
        int var1 = method1610();
        if (Statics.field1208 == var0) {
            Statics.field2324 = Statics.field1208.field3405.get(Statics.language);
            if (Statics.field1208.field3406) {
                Statics.field4455 = (Statics.field1208.field3398 - Statics.field1208.field3410) * var1 / 100 + Statics.field1208.field3410;
            }
            if (Statics.field1208.field3409) {
                Statics.field2324 = Statics.field2324 + Statics.field4455 + "%";
            }
        } else if (Statics.field1208 == LoadingStage.field3403) {
            Statics.field6789 = null;
            client.setState(6);
            if (field3421) {
                field3421 = false;
                LoginManager.method12220(Statics.field6391, Statics.field4814);
            }
        } else {
            Statics.field2324 = var0.field3397.get(Statics.language);
            if (Statics.field1208.field3409) {
                Statics.field2324 = Statics.field2324 + var0.field3398 + "%";
            }
            Statics.field4455 = var0.field3398;
            if (Statics.field1208.field3406 || var0.field3406) {
                Statics.field1931 = MonotonicTime.get();
            }
        }
        if (Statics.field6789 == null) {
            return;
        }
        Statics.field6789.method4956(Statics.field1931, Statics.field2324, Statics.field4455, Statics.field1208);
        if (Statics.field3422 == null) {
            return;
        }
        for (int var2 = field3423 + 1; var2 < Statics.field3422.length; var2++) {
            if (Statics.field3422[var2].method4981() >= 100 && field3423 == var2 - 1 && client.state != 12 && Statics.field6789.method4954()) {
                try {
                    Statics.field3422[var2].method5006();
                } catch (Exception var4) {
                    Statics.field3422 = null;
                    break;
                }
                Statics.field6789.method4973(Statics.field3422[var2]);
                field3423++;
                if (field3423 >= Statics.field3422.length - 1 && Statics.field3422.length > 1) {
                    field3423 = Statics.field7348.method12703() ? 0 : -1;
                }
            }
        }
    }

    @ObfuscatedName("em.a(I)V")
    public static void method3460() {
        if (Statics.field1208 != null) {
            Statics.field6789 = new LoadingScreenRenderer();
            Statics.field6789.method4956(Statics.field1931, Statics.field1208.field3405.get(Statics.language), Statics.field1208.field3410, Statics.field1208);
            Statics.field2668 = new Thread(Statics.field6789, "");
            Statics.field2668.start();
        }
    }

    @ObfuscatedName("aev.s(ZI)V")
    public static void method15611(boolean arg0) {
        if (Statics.field6789 == null) {
            method3460();
        }
        if (arg0) {
            Statics.field6789.method4969();
        }
    }

    @ObfuscatedName("fx.c(I)I")
    public static int method3587() {
        return Statics.field6789.method4952();
    }

    @ObfuscatedName("fd.m(B)V")
    public static void method3502() {
        if (Statics.field3422 == null) {
            return;
        }
        LoadingScreen[] var0 = Statics.field3422;
        for (int var1 = 0; var1 < var0.length; var1++) {
            LoadingScreen var2 = var0[var1];
            var2.method5006();
        }
    }

    @ObfuscatedName("ji.t(B)I")
    public static int method4789() {
        int var0 = Statics.field1208.field3404;
        if (var0 < Statics.field3420.length - 1) {
            Statics.field1208 = Statics.field3420[var0 + 1];
        }
        return 100;
    }

    @ObfuscatedName("k.l(I)I")
    public static int method1610() {
        if (Statics.options.field9669.method15877() == 0) {
            for (int var0 = 0; var0 < client.field8950; var0++) {
                if (client.field8951[var0].method7298() == 's' || client.field8951[var0].method7298() == 'S') {
                    Statics.options.method15448(Statics.options.field9669, 1);
                    client.field8912 = true;
                    GraphicsPacketQueue.method12023(ToolkitType.field7363);
                    break;
                }
            }
        }
        if (Statics.field1208 == LoadingStage.field3390) {
            if (Statics.field3562 == null) {
                Statics.field3562 = new Js5Client(Statics.field848, Statics.field1210, PublicKeys.field665, PublicKeys.field668);
            }
            if (!Statics.field3562.method5587()) {
                return 0;
            }
            client.method11054(0, null, true);
            Statics.field5109 = !MainLoadingScreen.method4590();
            Statics.field4761 = client.method7706(Statics.field5109 ? Js5Archive.LOADING_SPRITES_RAW : Js5Archive.LOADING_SPRITES, false, 1, true);
            Statics.field1937 = client.method7706(Js5Archive.LOADING_SCREEN, false, 1, true);
            Statics.field8745 = client.method7706(Js5Archive.FONTMETRICS, false, 1, true);
        }
        if (Statics.field1208 == LoadingStage.field3394) {
            boolean var1 = Statics.field1937.method5662();
            int var2 = Statics.field4456[Js5Archive.LOADING_SCREEN.method3089()].method14244();
            int var3 = var2 + Statics.field4456[Statics.field5109 ? Js5Archive.LOADING_SPRITES_RAW.method3089() : Js5Archive.LOADING_SPRITES.method3089()].method14244();
            int var4 = var3 + Statics.field4456[Js5Archive.FONTMETRICS.method3089()].method14244();
            int var5 = var4 + (var1 ? 100 : Statics.field1937.method5634());
            if (var5 != 400) {
                return var5 / 4;
            }
            Statics.field9896 = Statics.field4761.method5622();
            Statics.field1625 = Statics.field1937.method5622();
            DefaultSprites.method11376(Statics.field4761);
            int var6 = Statics.options.field9668.method15859();
            Statics.field7348 = new LoadingRelated3(client.modeGame, Statics.language, Statics.field1937);
            LoadingRelated1[] var7 = Statics.field7348.method12706(var6);
            if (var7.length == 0) {
                var7 = Statics.field7348.method12706(0);
            }
            LoadingScreenElementFactory var8 = new LoadingScreenElementFactory(Statics.field4761, Statics.field8745);
            if (var7.length > 0) {
                Statics.field3422 = new LoadingScreen[var7.length];
                for (int var9 = 0; var9 < Statics.field3422.length; var9++) {
                    Statics.field3422[var9] = new MainLoadingScreen(Statics.field7348.method12708(var7[var9].field7396), var7[var9].field7397, var7[var9].field7398, var8);
                }
            }
        }
        if (Statics.field1208 == LoadingStage.field3388) {
            Statics.field6784 = new FontProvider(Statics.field4761, Statics.field8745, DefaultSprites.method6244());
        }
        if (Statics.field1208 == LoadingStage.field3407) {
            int var10 = Statics.field6784.method4839();
            int var11 = Statics.field6784.method4841();
            if (var10 < var11) {
                return var10 * 100 / var11;
            }
        }
        if (Statics.field1208 == LoadingStage.field3386) {
            if (Statics.field3422 != null && Statics.field3422.length > 0) {
                if (Statics.field3422[0].method4981() < 100) {
                    return 0;
                }
                if (Statics.field3422.length > 1 && Statics.field7348.method12703() && Statics.field3422[1].method4981() < 100) {
                    return 0;
                }
            }
            Statics.field6784.method4837(client.field8914);
            DefaultSprites.method2931(Statics.renderer);
            client.setState(2);
        }
        if (Statics.field1208 == LoadingStage.field3389) {
            Statics.field7387 = client.method7706(Js5Archive.SPRITES, false, 1, false);
            Statics.field7567 = client.method7706(Js5Archive.ANIMS, false, 1, false);
            Statics.field6690 = client.method7706(Js5Archive.BASES, false, 1, false);
            Statics.field7435 = client.method7706(Js5Archive.CONFIG, false, 1, true);
            Statics.field2653 = client.method7706(Js5Archive.INTERFACES, false, 1, true);
            Statics.field5197 = client.method7706(Js5Archive.SYNTH_SOUNDS, false, 1, false);
            Statics.field7343 = client.method7706(Js5Archive.MAPS, true, 1, false);
            Statics.field9367 = client.method7706(Js5Archive.MIDI_SONGS, true, 1, false);
            Statics.field4560 = client.method7706(Js5Archive.MODELS, false, 1, false);
            Statics.field808 = client.method7706(Js5Archive.TEXTURES, true, 1, false);
            Statics.field6435 = client.method7706(Js5Archive.field1723, true, 1, false);
            Statics.field3523 = client.method7706(Js5Archive.BINARY, false, 1, false);
            Statics.field1509 = client.method7706(Js5Archive.MIDI_JINGLES, false, 1, false);
            Statics.field6651 = client.method7706(Js5Archive.CLIENTSCRIPTS, false, 1, true);
            Statics.field3156 = client.method7706(Js5Archive.VORBIS, false, 1, false);
            Statics.field5104 = client.method7706(Js5Archive.MIDI_INSTRUMENTS, false, 1, false);
            Statics.field1565 = client.method7706(Js5Archive.CONFIG_LOC, false, 1, true);
            Statics.field6451 = client.method7706(Js5Archive.CONFIG_ENUM, false, 1, true);
            Statics.field5080 = client.method7706(Js5Archive.CONFIG_NPC, false, 1, true);
            Statics.field5130 = client.method7706(Js5Archive.CONFIG_OBJ, false, 1, true);
            Statics.field3897 = client.method7706(Js5Archive.CONFIG_SEQ, false, 1, true);
            Statics.field2070 = client.method7706(Js5Archive.CONFIG_SPOT, false, 1, true);
            Statics.field4229 = client.method7706(Js5Archive.CONFIG_VARBIT, false, 1, true);
            Statics.field4059 = client.method7706(Js5Archive.WORLDMAPDATA, true, 1, false);
            Statics.field6343 = client.method7706(Js5Archive.QUICKCHAT, false, 1, true);
            Statics.field6712 = client.method7706(Js5Archive.QUICKCHAT_GLOBAL, false, 1, true);
            Statics.field7572 = client.method7706(Js5Archive.MATERIALS, true, 1, true);
            Statics.field8655 = client.method7706(Js5Archive.CONFIG_PARTICLE, false, 1, true);
            Statics.field849 = client.method7706(Js5Archive.DEFAULTS, true, 1, true);
            Statics.field8734 = client.method7706(Js5Archive.CONFIG_BILLBOARD, false, 1, true);
            Statics.field4824 = client.method7706(Js5Archive.CUTSCENES, true, 1, false);
            Statics.field663 = client.method7706(Js5Archive.DLLS, true, 1, false);
            Statics.field2670 = client.method7706(Js5Archive.SHADERS, true, 1, true);
            Statics.field2117 = client.method7706(Js5Archive.field1722, true, 2, false);
        }
        if (Statics.field1208 == LoadingStage.field3392) {
            int var12 = 0;
            for (int var13 = 0; var13 < Statics.field4456.length; var13++) {
                if (Statics.field4456[var13] != null) {
                    var12 += Statics.field4456[var13].method14244() * field3425[var13] / 100;
                }
            }
            if (var12 != 100) {
                if (field3424 < 0) {
                    field3424 = var12;
                }
                return (var12 - field3424) * 100 / (100 - field3424);
            }
            DefaultSprites.method8388(Statics.field7387);
            Statics.field6784 = new FontProvider(Statics.field7387, Statics.field8745, DefaultSprites.method6244());
        }
        if (Statics.field1208 == LoadingStage.field3393) {
            byte[] var14 = Statics.field849.method5635(DefaultsGroup.field5143.field5145);
            if (var14 == null) {
                return 0;
            }
            method3560(var14);
            Statics.method4790();
            client.setState(10);
        }
        if (Statics.field1208 == LoadingStage.field3391 && Statics.field2137 == null) {
            Statics.field2137 = new HardwarePlatformLoader(Statics.field663);
            NativeLibraries.method5010(Statics.field2137);
        }
        if (Statics.field1208 == LoadingStage.field3395) {
            int var15 = LoadableResourceManager.method6562();
            if (var15 < 100) {
                return var15;
            }
            method7678(Statics.field849.method5635(DefaultsGroup.field5144.field5145));
            Statics.field4825 = new GraphicsDefaults(Statics.field849);
            Statics.field5009 = Statics.field4825.field5146;
            Statics.field5010 = Statics.field4825.field5161;
            if (Statics.field4825.field5166 != -1 && Statics.field4825.field5167 != -1) {
                client.field9067 = Statics.field4825.field5166;
                client.field9068 = Statics.field4825.field5167;
            }
            Statics.wearposDefaults = new WearposDefaults(Statics.field849);
            Statics.field1736 = new MiniMenuDefaults(Statics.field849);
            Statics.field2190 = new CutsceneDefaults(Statics.field849);
        }
        if (Statics.field1208 == LoadingStage.field3396) {
            if (Statics.field4825.field5156 != -1 && !Statics.field4560.method5629(Statics.field4825.field5156, 0)) {
                return 99;
            }
            Statics.field8465 = new BasicMaterialTypeList(Statics.field7572, Statics.field808, Statics.field6435);
            Statics.field4464 = new ParamTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field3769 = new BASTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.wearposDefaults);
            Statics.field3770 = new CursorTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field7387);
            Statics.field1244 = new EnumTypeList(client.modeGame, Statics.language, Statics.field6451);
            Statics.field3615 = new FloorOverlayTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field4450 = new FloorUnderlayTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field5037 = new HitmarkTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field7387);
            Statics.field6705 = new HeadbarTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field7387);
            Statics.field7650 = new IDKTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field4560);
            Statics.field495 = new InvTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field785 = new LightTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field10355 = new LocTypeList(client.modeGame, Statics.language, true, Statics.field1565, Statics.field4560);
            client.world.method6159(Statics.field10355);
            Statics.asyncRebuild.method6038(new LocTypeList(client.modeGame, Statics.language, true, Statics.field1565, Statics.field4560));
            Statics.field8499 = new MapElementTypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field7387);
            Statics.field850 = new MSITypeList(client.modeGame, Statics.language, Statics.field7435, Statics.field7387);
            Statics.field3774 = new NPCTypeList(client.modeGame, Statics.language, true, Statics.field5080, Statics.field4560);
            Statics.objTypes = new ObjTypeList(client.modeGame, Statics.language, true, Statics.field4464, Statics.field5130, Statics.field4560);
            Statics.field4959 = new QuestTypeList(client.modeGame, Statics.language, Statics.field7435, true);
            Statics.field566 = new SeqTypeList(client.modeGame, Statics.language, Statics.field3897, Statics.field7567, Statics.field6690);
            Statics.field4678 = new SkyBoxTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field6360 = new SkyDecorTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field4213 = new EffectAnimTypeList(client.modeGame, Statics.language, Statics.field2070, Statics.field4560);
            Statics.field4214 = new StructTypeList(client.modeGame, Statics.language, Statics.field7435, true);
            Statics.field8514 = new VarcStrTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field8455 = new VarClientTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field4645 = new VarBitTypeList(client.modeGame, Statics.language, Statics.field4229);
            Statics.field6667 = new VarPlayerTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field1510 = new VarnTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field7196 = new VarnBitTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field7390 = new VarClanTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.field1202 = new VarClanSettingTypeList(client.modeGame, Statics.language, Statics.field7435);
            Statics.method3529(Statics.field2653, Statics.field4560, Statics.field7387, Statics.field8745);
            BillboardType.method8409(Statics.field8734);
            Statics.field3262 = new QuickChatCatTypeList(Statics.language, Statics.field6343, Statics.field6712);
            Statics.field3779 = new QuickChatPhraseTypeList(Statics.language, Statics.field6343, Statics.field6712, new ClientDynamicProvider());
            Statics.field2669 = new VarRelated1();
            client.method13901();
            AnimationNode.method6490(Statics.field566);
            ParticleSystemRenderer.method12208(Statics.field8655);
            SkyBox.method12289(Statics.field4560, Statics.field8465);
            Huffman var16 = new Huffman(Statics.field3523.method5645("huffman", ""));
            WordPack.method15896(var16);
            Statics.field8481 = Statics.method4777();
            Statics.field2305 = new HardwarePlatform(true);
        }
        if (Statics.field1208 == LoadingStage.field3387) {
            int var17 = DefaultSprites.method12092(Statics.field7387) + Statics.field6784.method4840(true);
            int var18 = DefaultSprites.method1589() + Statics.field6784.method4841();
            if (var17 < var18) {
                return var17 * 100 / var18;
            }
        }
        if (Statics.field1208 == LoadingStage.field3408) {
            WorldMap.method7080(Statics.field4059, Statics.field3615, Statics.field4450, client.world.method6103(), Statics.field8499, Statics.field850, Statics.field2669);
        }
        if (Statics.field1208 == LoadingStage.field3399) {
            Statics.field6666 = new int[Statics.field8455.field7160];
            Statics.field2210 = new boolean[Statics.field8455.field7160];
            Statics.field3498 = new String[Statics.field8514.field7322];
            for (int var19 = 0; var19 < Statics.field8455.field7160; var19++) {
                if (Statics.field8455.method12359(var19).field7156 == 0) {
                    Statics.field2210[var19] = true;
                    client.field9155++;
                }
                Statics.field6666[var19] = -1;
            }
            method2862();
            Statics.field7343.method5636(false, true);
            Statics.field9367.method5636(true, true);
            Statics.field7387.method5636(true, true);
            Statics.field8745.method5636(true, true);
            Statics.field3523.method5636(true, true);
            client.field8938 = true;
        }
        if (Statics.field1208 == LoadingStage.field3400) {
            if (!Component.openInterface(Statics.field4825.field5162, null)) {
                return 0;
            }
            boolean var20 = true;
            for (int var21 = 0; var21 < Statics.field1756[Statics.field4825.field5162].field1732.length; var21++) {
                Component var22 = Statics.field1756[Statics.field4825.field5162].field1732[var21];
                if (var22.type == 5 && var22.field1797 != -1 && !Statics.field7387.method5629(var22.field1797, 0)) {
                    var20 = false;
                }
            }
            if (!var20) {
                return 0;
            }
        }
        if (Statics.field1208 == LoadingStage.field3401) {
            client.method12035(true);
        }
        if (Statics.field1208 == LoadingStage.field3402) {
            Statics.field6789.method4975();
            try {
                Statics.field2668.join();
            } catch (InterruptedException var24) {
                return 0;
            }
            Statics.field6789 = null;
            Statics.field2668 = null;
            Statics.field4761 = null;
            Statics.field1937 = null;
            Statics.field7348 = null;
            Statics.field3422 = null;
            MainLoadingScreen.method6065();
            client.field8911 = Statics.options.field9669.method15877() == 1;
            Statics.options.method15448(Statics.options.field9669, 1);
            if (client.field8911) {
                Statics.options.method15448(Statics.options.field9670, 0);
            } else if (Statics.options.field9670.field9844 && Statics.field2305.field9703 < 512 && Statics.field2305.field9703 != 0) {
                Statics.options.method15448(Statics.options.field9670, 0);
            }
            Statics.method1245();
            if (client.field8911) {
                Statics.method5600(0, false);
                if (!client.field8912) {
                    GraphicsPacketQueue.method12023(ToolkitType.field7356);
                }
            } else {
                Statics.method5600(Statics.options.field9670.getValue(), false);
                if (Statics.options.field9670.getValue() == 0) {
                    GraphicsPacketQueue.method12023(ToolkitType.field7364);
                }
            }
            client.setWindowMode(Statics.options.maxScreenSize.getValue(), -1, -1, false);
            Statics.field6784.method4837(client.field8914);
            DefaultSprites.method2931(Statics.renderer);
            DefaultSprites.method15812(Statics.renderer, Statics.field7387);
            MiniMenu.method3288(Statics.field8538);
        }
        return method4789();
    }

    @ObfuscatedName("pd.f([BB)V")
    public static void method7678(byte[] arg0) {
        Packet var1 = new Packet(arg0);
        while (true) {
            int var2 = var1.g1();
            if (var2 == 0) {
                return;
            }
            if (var2 == 1) {
                int[] var3 = Statics.field9860 = new int[6];
                var3[0] = var1.g2();
                var3[1] = var1.g2();
                var3[2] = var1.g2();
                var3[3] = var1.g2();
                var3[4] = var1.g2();
                var3[5] = var1.g2();
            }
        }
    }

    @ObfuscatedName("fn.d([BI)V")
    public static void method3560(byte[] arg0) {
        Packet var1 = new Packet(arg0);
        while (true) {
            int var2 = var1.g1();
            if (var2 == 0) {
                return;
            }
            if (var2 == 1) {
                int var3 = var1.g2();
                if (AudioRenderer.field4205 == -1) {
                    AudioRenderer.field4205 = var3;
                }
            }
        }
    }

    @ObfuscatedName("dn.z(I)V")
    public static void method2862() {
        FileOnDisk var0 = null;
        try {
            var0 = GameShell.method4031("2", client.modeGame.field6404, false);
            byte[] var1 = new byte[(int) var0.method12077()];
            int var3;
            for (int var2 = 0; var2 < var1.length; var2 += var3) {
                var3 = var0.method12078(var1, var2, var1.length - var2);
                if (var3 == -1) {
                    throw new IOException();
                }
            }
            method3665(new Packet(var1));
        } catch (Exception var7) {
        }
        try {
            if (var0 != null) {
                var0.method12076();
            }
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("fi.n(Laet;I)V")
    public static void method3665(Packet arg0) {
        if (arg0.data.length - arg0.pos < 1) {
            return;
        }
        int var1 = arg0.g1();
        if (var1 < 0 || var1 > 1 || arg0.data.length - arg0.pos < 2) {
            return;
        }
        int var2 = arg0.g2();
        if (arg0.data.length - arg0.pos < var2 * 6) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = arg0.g2();
            int var5 = arg0.g4s();
            if (var4 < Statics.field6666.length && Statics.field2210[var4] && (Statics.field8455.method12359(var4).field7153 != '1' || var5 >= -1 && var5 <= 1)) {
                Statics.field6666[var4] = var5;
            }
        }
    }

    @ObfuscatedName("iu.o(I)I")
    public static int method4671() {
        return Statics.field1625;
    }

    @ObfuscatedName("mv.q(I)I")
    public static int method6307() {
        return Statics.field9896;
    }

    @ObfuscatedName("oq.p(I)V")
    public static void method7247() {
        if (Statics.field6789 != null) {
            Statics.field6789.method4975();
        }
        if (Statics.field2668 == null) {
            return;
        }
        while (true) {
            try {
                Statics.field2668.join();
                break;
            } catch (InterruptedException var1) {
            }
        }
    }
}
