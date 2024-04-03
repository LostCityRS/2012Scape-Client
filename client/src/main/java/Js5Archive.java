import deob.ObfuscatedName;

@ObfuscatedName("ee")
public class Js5Archive {

    @ObfuscatedName("ee.u")
    public static final Js5Archive ANIMS = new Js5Archive(0, "", false, false);

    @ObfuscatedName("ee.j")
    public static final Js5Archive BASES = new Js5Archive(1, "", false, false);

    @ObfuscatedName("ee.a")
    public static final Js5Archive CONFIG = new Js5Archive(2, "", true, false);

    @ObfuscatedName("ee.s")
    public static final Js5Archive INTERFACES = new Js5Archive(3, "", true, false);

    @ObfuscatedName("ee.c")
    public static final Js5Archive SYNTH_SOUNDS = new Js5Archive(4, "", false, false);

    @ObfuscatedName("ee.m")
    public static final Js5Archive MAPS = new Js5Archive(5, "", false, false);

    @ObfuscatedName("ee.t")
    public static final Js5Archive MIDI_SONGS = new Js5Archive(6, "", false, false);

    @ObfuscatedName("ee.l")
    public static final Js5Archive MODELS = new Js5Archive(7, "", false, false);

    @ObfuscatedName("ee.f")
    public static final Js5Archive SPRITES = new Js5Archive(8, "", false, false);

    @ObfuscatedName("ee.d")
    public static final Js5Archive TEXTURES = new Js5Archive(9, "", false, false);

    @ObfuscatedName("ee.z")
    public static final Js5Archive BINARY = new Js5Archive(10, "", false, false);

    @ObfuscatedName("ee.n")
    public static final Js5Archive MIDI_JINGLES = new Js5Archive(11, "", false, false);

    @ObfuscatedName("ee.o")
    public static final Js5Archive CLIENTSCRIPTS = new Js5Archive(12, "", false, false);

    @ObfuscatedName("ee.q")
    public static final Js5Archive FONTMETRICS = new Js5Archive(13, "", false, false);

    @ObfuscatedName("ee.p")
    public static final Js5Archive VORBIS = new Js5Archive(14, "", false, false);

    @ObfuscatedName("ee.w")
    public static final Js5Archive MIDI_INSTRUMENTS = new Js5Archive(15, "", false, false);

    @ObfuscatedName("ee.b")
    public static final Js5Archive CONFIG_LOC = new Js5Archive(16, "", true, false);

    @ObfuscatedName("ee.x")
    public static final Js5Archive CONFIG_ENUM = new Js5Archive(17, "", true, false);

    @ObfuscatedName("ee.i")
    public static final Js5Archive CONFIG_NPC = new Js5Archive(18, "", true, false);

    @ObfuscatedName("ee.v")
    public static final Js5Archive CONFIG_OBJ = new Js5Archive(19, "", true, false);

    @ObfuscatedName("ee.k")
    public static final Js5Archive CONFIG_SEQ = new Js5Archive(20, "", true, false);

    @ObfuscatedName("ee.h")
    public static final Js5Archive CONFIG_SPOT = new Js5Archive(21, "", true, false);

    @ObfuscatedName("ee.r")
    public static final Js5Archive CONFIG_VARBIT = new Js5Archive(22, "", true, false);

    @ObfuscatedName("ee.g")
    public static final Js5Archive WORLDMAPDATA = new Js5Archive(23, "", true, false);

    @ObfuscatedName("ee.y")
    public static final Js5Archive QUICKCHAT = new Js5Archive(24, "", true, false);

    @ObfuscatedName("ee.e")
    public static final Js5Archive QUICKCHAT_GLOBAL = new Js5Archive(25, "", true, false);

    @ObfuscatedName("ee.ay")
    public static final Js5Archive MATERIALS = new Js5Archive(26, "", false, false);

    @ObfuscatedName("ee.af")
    public static final Js5Archive CONFIG_PARTICLE = new Js5Archive(27, "", false, false);

    @ObfuscatedName("ee.ar")
    public static final Js5Archive DEFAULTS = new Js5Archive(28, "", false, false);

    @ObfuscatedName("ee.an")
    public static final Js5Archive CONFIG_BILLBOARD = new Js5Archive(29, "", false, false);

    @ObfuscatedName("ee.ap")
    public static final Js5Archive DLLS = new Js5Archive(30, "", false, false);

    @ObfuscatedName("ee.ag")
    public static final Js5Archive SHADERS = new Js5Archive(31, "", false, false);

    @ObfuscatedName("ee.as")
    public static final Js5Archive LOADING_SPRITES = new Js5Archive(32, "", false, false);

    @ObfuscatedName("ee.ai")
    public static final Js5Archive LOADING_SCREEN = new Js5Archive(33, "", false, false);

    @ObfuscatedName("ee.ao")
    public static final Js5Archive LOADING_SPRITES_RAW = new Js5Archive(34, "", false, false);

    @ObfuscatedName("ee.al")
    public static final Js5Archive CUTSCENES = new Js5Archive(35, "", true, false);

    @ObfuscatedName("ee.at")
    public static final Js5Archive field1722 = new Js5Archive(36, "", false, false);

    @ObfuscatedName("ee.ax")
    public static final Js5Archive field1723 = new Js5Archive(37, "", false, false);

    @ObfuscatedName("ee.aw")
    public final int field1724;

    @ObfuscatedName("ee.aa")
    public static int field1699 = -1;

    @ObfuscatedName("gm.u(B)[Lee;")
    public static Js5Archive[] method3969() {
        return new Js5Archive[]{MODELS, SPRITES, MATERIALS, field1722, CONFIG_SEQ, SHADERS, CONFIG_ENUM, CONFIG_VARBIT, VORBIS, BASES, CONFIG, DLLS, MAPS, field1723, LOADING_SCREEN, INTERFACES, QUICKCHAT_GLOBAL, BINARY, TEXTURES, MIDI_INSTRUMENTS, LOADING_SPRITES, CONFIG_OBJ, LOADING_SPRITES_RAW, WORLDMAPDATA, CONFIG_LOC, FONTMETRICS, QUICKCHAT, CONFIG_SPOT, ANIMS, CONFIG_NPC, MIDI_SONGS, MIDI_JINGLES, SYNTH_SOUNDS, CLIENTSCRIPTS, CONFIG_BILLBOARD, CONFIG_PARTICLE, DEFAULTS, CUTSCENES};
    }

    public Js5Archive(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field1724 = arg0;
    }

    @ObfuscatedName("ee.j(B)I")
    public int method3089() {
        return this.field1724;
    }
}
