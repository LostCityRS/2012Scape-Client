import deob.ObfuscatedName;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
// import netscape.javascript.JSObject;

public class Statics {

	@ObfuscatedName("ais.x")
	public static class145 field10188;

	@ObfuscatedName("ain.bx")
	public static int field10208;

	@ObfuscatedName("air.q")
	public static FontMetrics field10224;

	@ObfuscatedName("bj.ad")
	public static int field1025;

	@ObfuscatedName("ajz.z")
	public static int field10343;

	@ObfuscatedName("aje.l")
	public static Js5 field10347;

	@ObfuscatedName("ajf.gg")
	public static LocTypeList field10355;

	@ObfuscatedName("ajg.am")
	public static int field10389;

	@ObfuscatedName("ajw.o")
	public static int field10432;

	@ObfuscatedName("akr.b")
	public static final int field10505 = 1;

	@ObfuscatedName("akt.bd")
	public static FontType field10523;

	@ObfuscatedName("akf.c")
	public static Applet field10526;

	@ObfuscatedName("akf.j")
	public static String field10527;

	@ObfuscatedName("akf.a")
	public static int field10528;

	@ObfuscatedName("akf.s")
	public static int field10530;

	@ObfuscatedName("akf.u")
	public static long field10532;

	@ObfuscatedName("akf.q")
	public static short field10533;

	@ObfuscatedName("akd.j")
	public static class146[] field10534;

	@ObfuscatedName("bp.n")
	public static Object field1085;

	@ObfuscatedName("bp.z")
	public static Object field1087;

	@ObfuscatedName("bp.o")
	public static Object field1089;

	@ObfuscatedName("bu.x")
	public static float field1134;

	@ObfuscatedName("cr.k")
	public static Js5 field1191;

	@ObfuscatedName("ci.v")
	public static Frame field1197;

	@ObfuscatedName("ci.t")
	public static int field1198;

	@ObfuscatedName("ch.b")
	public static boolean field1201;

	@ObfuscatedName("ch.hw")
	public static class475 field1202;

	@ObfuscatedName("cv.p")
	public static LoadingStage field1208;

	@ObfuscatedName("cv.y")
	public static Image field1209;

	@ObfuscatedName("cv.ei")
	public static Js5DiskCache field1210;

	@ObfuscatedName("ck.h")
	public static Canvas field1231;

	@ObfuscatedName("ct.gb")
	public static EnumTypeList field1244;

	@ObfuscatedName("cc.r")
	public static class377 field1279;

	@ObfuscatedName("cg.ay")
	public static int field1290;

	@ObfuscatedName("cy.ts")
	public static BasicCamera field1307;

	@ObfuscatedName("db.u")
	public static int field1364;

	@ObfuscatedName("db.t")
	public static int field1365;

	@ObfuscatedName("db.a")
	public static int field1366;

	@ObfuscatedName("db.s")
	public static int[] field1367;

	@ObfuscatedName("db.c")
	public static int field1368;

	@ObfuscatedName("db.j")
	public static int field1369;

	@ObfuscatedName("db.m")
	public static int field1370;

	@ObfuscatedName("db.l")
	public static int field1371;

	@ObfuscatedName("dx.bz")
	public static int field1387;

	@ObfuscatedName("dx.bn")
	public static class56 field1388;

	@ObfuscatedName("dk.ah")
	public static int field1477;

	@ObfuscatedName("dz.ff")
	public static Js5 field1509;

	@ObfuscatedName("dz.hn")
	public static class571 field1510;

	@ObfuscatedName("dc.tk")
	public static ClanChannel field1515;

	@ObfuscatedName("dd.s")
	public static class147[] field1528;

	@ObfuscatedName("dd.n")
	public static short field1532;

	@ObfuscatedName("dd.o")
	public static short field1535;

	@ObfuscatedName("dd.a")
	public static CutsceneEntity[] field1537;

	@ObfuscatedName("dd.vu")
	public static int field1539;

	@ObfuscatedName("da.ds")
	public static client field1543;

	@ObfuscatedName("dv.bj")
	public static Sprite field1557;

	@ObfuscatedName("dn.fk")
	public static Js5 field1565;

	@ObfuscatedName("dq.af")
	public static int field1571;

	@ObfuscatedName("et.a")
	public static Map field1572;

	@ObfuscatedName("eu.u")
	public static long field1575;

	@ObfuscatedName("eu.j")
	public static long field1576;

	@ObfuscatedName("eu.to")
	public static int field1577;

	@ObfuscatedName("eg.bl")
	public static class56 field1578;

	@ObfuscatedName("ev.j")
	public static Js5 field1580;

	@ObfuscatedName("ev.a")
	public static Js5 field1581;

	@ObfuscatedName("ev.u")
	public static Js5 field1586;

	@ObfuscatedName("ev.k")
	public static Frame field1587;

	@ObfuscatedName("eq.au")
	public static int field1597;

	@ObfuscatedName("eq.ai")
	public static int[] field1598;

	@ObfuscatedName("eq.on")
	public static int field1599;

	@ObfuscatedName("eq.h")
	public static Js5 field1600;

	@ObfuscatedName("eh.f")
	public static int field1625;

	@ObfuscatedName("ed.og")
	public static int field1685;

	@ObfuscatedName("ej.s")
	public static class937 field1735;

	@ObfuscatedName("ej.bw")
	public static MiniMenuDefaults field1736;

	@ObfuscatedName("ew.x")
	public static IfType[] field1756;

	@ObfuscatedName("ew.i")
	public static boolean[] field1834;

	@ObfuscatedName("ew.v")
	public static Js5 field1928;

	@ObfuscatedName("el.n")
	public static long field1931;

	@ObfuscatedName("ei.t")
	public static Js5 field1937;

	@ObfuscatedName("eo.tu")
	public static int field1941;

	@ObfuscatedName("ex.fi")
	public static Js5 field2070;

	@ObfuscatedName("ec.ak")
	public static int field2081;

	@ObfuscatedName("em.jn")
	public static int field2089;

	@ObfuscatedName("ek.j")
	public static int field2098;

	@ObfuscatedName("ek.m")
	public static int field2101;

	@ObfuscatedName("ep.x")
	public static Font field2112;

	@ObfuscatedName("ep.kq")
	public static int field2113;

	@ObfuscatedName("fd.fm")
	public static Js5 field2117;

	@ObfuscatedName("fr.u")
	public static class177 field2118;

	@ObfuscatedName("fr.ni")
	public static PlayerEntity field2119;

	@ObfuscatedName("fc.tg")
	public static int field2123;

	@ObfuscatedName("fp.eg")
	public static Keyboard field2131;

	@ObfuscatedName("fl.bc")
	public static FontMetrics field2136;

	@ObfuscatedName("fl.gh")
	public static HardwarePlatformLoader field2137;

	@ObfuscatedName("fj.i")
	public static FontType field2163;

	@ObfuscatedName("fm.be")
	public static int[] field2187;

	@ObfuscatedName("fk.hf")
	public static CutsceneDefaults field2190;

	@ObfuscatedName("fh.d")
	public static int field2204;

	@ObfuscatedName("fz.h")
	public static Sprite[] field2209;

	@ObfuscatedName("fz.ru")
	public static boolean[] field2210;

	@ObfuscatedName("fi.bq")
	public static Sprite field2214;

	@ObfuscatedName("fe.bs")
	public static String field2247;

	@ObfuscatedName("gp.lk")
	public static int field2297;

	@ObfuscatedName("gz.aw")
	public static int field2304;

	@ObfuscatedName("gz.cy")
	public static class817 field2305;

	@ObfuscatedName("gk.bm")
	public static Language field2308;

	@ObfuscatedName("ge.o")
	public static String field2324;

	@ObfuscatedName("ge.ay")
	public static int field2325;

	@ObfuscatedName("gr.d")
	public static class937 field2327;

	@ObfuscatedName("gr.kd")
	public static int field2328;

	@ObfuscatedName("gr.c")
	public static int field2329;

	@ObfuscatedName("gf.ab")
	public static int field2333;

	@ObfuscatedName("gb.bq")
	public static int field2338;

	@ObfuscatedName("gb.ac")
	public static String[] field2339;

	@ObfuscatedName("gs.ax")
	public static File field2390;

	@ObfuscatedName("gs.dp")
	public static byte[][] field2391;

	@ObfuscatedName("gd.x")
	public static FontMetrics field2399;

	@ObfuscatedName("gd.nq")
	public static String field2400;

	@ObfuscatedName("gj.o")
	public static Object field2403;

	@ObfuscatedName("gj.n")
	public static Object field2407;

	@ObfuscatedName("gj.z")
	public static Object field2411;

	@ObfuscatedName("hw.w")
	public static float field2514;

	@ObfuscatedName("iq.tn")
	public static int field2611;

	@ObfuscatedName("id.ay")
	public static Sprite[] field2618;

	@ObfuscatedName("ib.ja")
	public static int field2631;

	@ObfuscatedName("ib.th")
	public static int field2632;

	@ObfuscatedName("ib.ul")
	public static long field2633;

	@ObfuscatedName("iz.bf")
	public static Sprite field2652;

	@ObfuscatedName("iz.ek")
	public static Js5 field2653;

	@ObfuscatedName("iz.w")
	public static MiniMenuEntry field2654;

	@ObfuscatedName("ik.j")
	public static Js5 field2663;

	@ObfuscatedName("ik.z")
	public static Thread field2668;

	@ObfuscatedName("ik.dy")
	public static class49 field2669;

	@ObfuscatedName("ik.gn")
	public static Js5 field2670;

	@ObfuscatedName("ik.tr")
	public static int field2671;

	@ObfuscatedName("iu.s")
	public static Js5 field2675;

	@ObfuscatedName("iu.mn")
	public static short[] field2744;

	@ObfuscatedName("ic.o")
	public static Js5 field2757;

	@ObfuscatedName("il.tm")
	public static int field2799;

	@ObfuscatedName("jc.ty")
	public static ClanSettings field2972;

	@ObfuscatedName("jj.fj")
	public static Js5 field3156;

	@ObfuscatedName("jr.b")
	public static class375 field3160;

	@ObfuscatedName("jr.ic")
	public static int field3161;

	@ObfuscatedName("jh.nw")
	public static int field3210;

	@ObfuscatedName("ji.hl")
	public static WearposDefaults field3226;

	@ObfuscatedName("js.hu")
	public static QuickChatCatTypeList field3262;

	@ObfuscatedName("js.bs")
	public static class56 field3263;

	@ObfuscatedName("je.n")
	public static long field3306;

	@ObfuscatedName("je.ij")
	public static long field3307;

	@ObfuscatedName("je.tj")
	public static int field3308;

	@ObfuscatedName("ju.y")
	public static Sprite[] field3311;

	@ObfuscatedName("jw.p")
	public static int field3315;

	@ObfuscatedName("kh.id")
	public static PingRequest field3357;

	@ObfuscatedName("kh.lj")
	public static int field3358;

	@ObfuscatedName("kb.nm")
	public static long field3384;

	@ObfuscatedName("kb.tz")
	public static int field3385;

	@ObfuscatedName("ky.bs")
	public static Sprite field3411;

	@ObfuscatedName("ks.j")
	public static LoadingStage[] field3420;

	@ObfuscatedName("ks.a")
	public static LoadingScreen[] field3422;

	@ObfuscatedName("kn.j")
	public static int field3466;

	@ObfuscatedName("kn.a")
	public static int field3467;

	@ObfuscatedName("ko.a")
	public static int field3472;

	@ObfuscatedName("ko.j")
	public static int field3474;

	@ObfuscatedName("kj.t")
	public static int field3489;

	@ObfuscatedName("kw.gv")
	public static ObjTypeList field3492;

	@ObfuscatedName("kw.tp")
	public static int field3493;

	@ObfuscatedName("ke.u")
	public static LoadableResource[] field3496;

	@ObfuscatedName("ke.nd")
	public static boolean field3497;

	@ObfuscatedName("ke.re")
	public static String[] field3498;

	@ObfuscatedName("km.bn")
	public static String field3501;

	@ObfuscatedName("km.m")
	public static int field3502;

	@ObfuscatedName("kg.fl")
	public static Js5 field3523;

	@ObfuscatedName("kk.in")
	public static Stream field3529;

	@ObfuscatedName("lk.w")
	public static class374 field3536;

	@ObfuscatedName("lk.b")
	public static int field3537;

	@ObfuscatedName("lb.eo")
	public static Js5Client field3562;

	@ObfuscatedName("lh.nr")
	public static int field3584;

	@ObfuscatedName("lh.of")
	public static int field3585;

	@ObfuscatedName("lu.ew")
	public static Stream field3614;

	@ObfuscatedName("lu.go")
	public static FloorOverlayTypeList field3615;

	@ObfuscatedName("lw.l")
	public static int field3716;

	@ObfuscatedName("lc.q")
	public static int field3723;

	@ObfuscatedName("lr.gf")
	public static BASTypeList field3769;

	@ObfuscatedName("lr.gl")
	public static CursorTypeList field3770;

	@ObfuscatedName("la.gx")
	public static NPCTypeList field3774;

	@ObfuscatedName("lf.ht")
	public static QuickChatPhraseTypeList field3779;

	@ObfuscatedName("mx.j")
	public static BasicCamera field3780;

	@ObfuscatedName("mf.tq")
	public static int field3785;

	@ObfuscatedName("mo.bl")
	public static String field3788;

	@ObfuscatedName("ta.bb")
	public static Sprite[] field383;

	@ObfuscatedName("ta.an")
	public static int field384;

	@ObfuscatedName("mp.n")
	public static int field3845;

	@ObfuscatedName("mj.fz")
	public static Js5 field3897;

	@ObfuscatedName("mn.m")
	public static int field3898;

	@ObfuscatedName("mn.c")
	public static int field3902;

	@ObfuscatedName("mn.if")
	public static int field3907;

	@ObfuscatedName("mz.at")
	public static File field3918;

	@ObfuscatedName("mk.bk")
	public static Sprite field3925;

	@ObfuscatedName("mh.af")
	public static Model field3977;

	@ObfuscatedName("mh.ar")
	public static Sprite field3978;

	@ObfuscatedName("mh.an")
	public static Sprite field3979;

	@ObfuscatedName("mw.n")
	public static boolean[] field3981;

	@ObfuscatedName("mw.d")
	public static int[] field3982;

	@ObfuscatedName("mw.z")
	public static int[] field3990;

	@ObfuscatedName("mb.t")
	public static CreateAccountReply field4011;

	@ObfuscatedName("ms.ar")
	public static FullscreenImpl field4013;

	@ObfuscatedName("mg.j")
	public static int field4015;

	@ObfuscatedName("mg.a")
	public static boolean field4016;

	@ObfuscatedName("mg.s")
	public static int field4017;

	@ObfuscatedName("mg.c")
	public static class372 field4027;

	@ObfuscatedName("md.v")
	public static class156 field4058;

	@ObfuscatedName("md.gq")
	public static Js5 field4059;

	@ObfuscatedName("ng.f")
	public static int field4093;

	@ObfuscatedName("ng.l")
	public static float field4100;

	@ObfuscatedName("nv.n")
	public static int field4125;

	@ObfuscatedName("nv.as")
	public static CursorManager field4133;

	@ObfuscatedName("nv.u")
	public static int field4138;

	@ObfuscatedName("nv.ba")
	public static String field4150;

	@ObfuscatedName("ra.jx")
	public static Packet field416;

	@ObfuscatedName("nb.bm")
	public static int field4161;

	@ObfuscatedName("nx.j")
	public static File field4162;

	@ObfuscatedName("nx.c")
	public static class374 field4165;

	@ObfuscatedName("nx.od")
	public static int field4166;

	@ObfuscatedName("nc.w")
	public static int field4167;

	@ObfuscatedName("nn.ta")
	public static int field4194;

	@ObfuscatedName("ne.q")
	public static class939 field4201;

	@ObfuscatedName("ne.o")
	public static class157 field4206;

	@ObfuscatedName("ne.hm")
	public static EffectAnimTypeList field4213;

	@ObfuscatedName("ne.hq")
	public static StructTypeList field4214;

	@ObfuscatedName("ne.ej")
	public static Socket field4215;

	@ObfuscatedName("nq.oa")
	public static int field4225;

	@ObfuscatedName("nz.fb")
	public static Js5 field4229;

	@ObfuscatedName("nd.ah")
	public static BufferedFile[] field4245;

	@ObfuscatedName("ol.k")
	public static class937 field4262;

	@ObfuscatedName("ol.eb")
	public static long field4263;

	@ObfuscatedName("om.l")
	public static Js5 field4264;

	@ObfuscatedName("om.j")
	public static FloorUnderlayTypeList field4265;

	@ObfuscatedName("om.a")
	public static LocTypeList field4266;

	@ObfuscatedName("om.g")
	public static int[] field4267;

	@ObfuscatedName("om.c")
	public static MSITypeList field4268;

	@ObfuscatedName("om.b")
	public static float field4269;

	@ObfuscatedName("om.aw")
	public static int field4270;

	@ObfuscatedName("om.n")
	public static byte[][][] field4275;

	@ObfuscatedName("om.o")
	public static int field4276;

	@ObfuscatedName("om.u")
	public static FloorOverlayTypeList field4278;

	@ObfuscatedName("om.w")
	public static float field4279;

	@ObfuscatedName("om.ay")
	public static short[] field4280;

	@ObfuscatedName("om.x")
	public static WorldMapRelated field4281;

	@ObfuscatedName("om.r")
	public static int field4282;

	@ObfuscatedName("om.v")
	public static int field4283;

	@ObfuscatedName("om.k")
	public static int field4284;

	@ObfuscatedName("om.h")
	public static int field4285;

	@ObfuscatedName("om.ax")
	public static int field4286;

	@ObfuscatedName("om.af")
	public static byte[] field4287;

	@ObfuscatedName("om.y")
	public static byte[] field4288;

	@ObfuscatedName("om.e")
	public static byte[] field4289;

	@ObfuscatedName("om.s")
	public static MapElementTypeList field4290;

	@ObfuscatedName("om.ar")
	public static byte[] field4291;

	@ObfuscatedName("om.t")
	public static WorldMapAreaMetadata field4292;

	@ObfuscatedName("om.an")
	public static Object[] field4293;

	@ObfuscatedName("om.ap")
	public static byte[] field4294;

	@ObfuscatedName("om.ag")
	public static ArrayList[][][] field4295;

	@ObfuscatedName("om.as")
	public static int field4296;

	@ObfuscatedName("om.ai")
	public static int field4297;

	@ObfuscatedName("om.ao")
	public static int field4298;

	@ObfuscatedName("om.m")
	public static VarIntDomain field4299;

	@ObfuscatedName("om.at")
	public static int field4300;

	@ObfuscatedName("om.al")
	public static int field4302;

	@ObfuscatedName("om.aa")
	public static int field4303;

	@ObfuscatedName("og.sr")
	public static byte field4311;

	@ObfuscatedName("os.bd")
	public static class56 field4325;

	@ObfuscatedName("za.m")
	public static long field435;

	@ObfuscatedName("oe.gi")
	public static FloorUnderlayTypeList field4450;

	@ObfuscatedName("ow.q")
	public static int field4455;

	@ObfuscatedName("ow.ec")
	public static Js5NetResourceProvider[] field4456;

	@ObfuscatedName("ot.he")
	public static ParamTypeList field4464;

	@ObfuscatedName("ot.ae")
	public static int field4465;

	@ObfuscatedName("oc.bi")
	public static int field4469;

	@ObfuscatedName("ou.b")
	public static int[] field4559;

	@ObfuscatedName("ou.fa")
	public static Js5 field4560;

	@ObfuscatedName("ou.jf")
	public static int[][] field4561;

	@ObfuscatedName("oz.p")
	public static PalettedSpriteData[] field4566;

	@ObfuscatedName("od.e")
	public static RendererToolkit field4625;

	@ObfuscatedName("oh.s")
	public static PrimaryLayerEntityList field4644;

	@ObfuscatedName("oh.ha")
	public static class432 field4645;

	@ObfuscatedName("pd.jh")
	public static int field4666;

	@ObfuscatedName("pd.qq")
	public static ComType[] field4667;

	@ObfuscatedName("pp.o")
	public static int field4677;

	@ObfuscatedName("pp.ho")
	public static SkyBoxTypeList field4678;

	@ObfuscatedName("pq.q")
	public static int field4683;

	@ObfuscatedName("pq.bt")
	public static class56 field4684;

	@ObfuscatedName("px.dx")
	public static String field4685;

	@ObfuscatedName("pt.u")
	public static List field4686;

	@ObfuscatedName("po.e")
	public static int field4756;

	@ObfuscatedName("pb.m")
	public static Js5 field4761;

	@ObfuscatedName("v.pe")
	public static int field477;

	@ObfuscatedName("pj.x")
	public static String field4814;

	@ObfuscatedName("pi.q")
	public static String[] field4817;

	@ObfuscatedName("pl.pv")
	public static int field4822;

	@ObfuscatedName("pf.gp")
	public static Js5 field4824;

	@ObfuscatedName("pf.hj")
	public static GraphicsDefaults field4825;

	@ObfuscatedName("pk.h")
	public static class782 field4835;

	@ObfuscatedName("pu.tx")
	public static int field4855;

	@ObfuscatedName("qx.f")
	public static GWCLocation[] field4869;

	@ObfuscatedName("qx.m")
	public static int field4871;

	@ObfuscatedName("qx.c")
	public static GWCWorld[] field4873;

	@ObfuscatedName("qx.t")
	public static int field4875;

	@ObfuscatedName("qx.l")
	public static int field4876;

	@ObfuscatedName("qx.ag")
	public static Sprite[] field4878;

	@ObfuscatedName("qr.j")
	public static class991[] field4919;

	@ObfuscatedName("qr.c")
	public static ParticleSystem[] field4927;

	@ObfuscatedName("qr.i")
	public static boolean field4930;

	@ObfuscatedName("j.gj")
	public static InvTypeList field495;

	@ObfuscatedName("ql.hk")
	public static QuestTypeList field4959;

	@ObfuscatedName("j.bp")
	public static class545 field496;

	@ObfuscatedName("ql.aq")
	public static ComType field4960;

	@ObfuscatedName("ql.cj")
	public static ClientOptions field4961;

	@ObfuscatedName("j.q")
	public static int field497;

	@ObfuscatedName("qp.z")
	public static class127 field4971;

	@ObfuscatedName("s.a")
	public static int field500;

	@ObfuscatedName("qc.n")
	public static short[][] field5009;

	@ObfuscatedName("s.s")
	public static ServerConnection field501;

	@ObfuscatedName("qc.o")
	public static short[][][] field5010;

	@ObfuscatedName("qc.qw")
	public static int field5014;

	@ObfuscatedName("qh.ga")
	public static HitmarkTypeList field5037;

	@ObfuscatedName("qs.rg")
	public static Object[] field5051;

	@ObfuscatedName("qk.au")
	public static int field5052;

	@ObfuscatedName("qg.ol")
	public static int field5056;

	@ObfuscatedName("qb.fu")
	public static Js5 field5080;

	@ObfuscatedName("rk.a")
	public static int[] field5083;

	@ObfuscatedName("rk.s")
	public static int[] field5084;

	@ObfuscatedName("rk.c")
	public static int[] field5085;

	@ObfuscatedName("rk.ba")
	public static int field5086;

	@ObfuscatedName("ry.fo")
	public static Js5 field5104;

	@ObfuscatedName("rd.v")
	public static boolean field5109;

	@ObfuscatedName("rx.fh")
	public static Js5 field5130;

	@ObfuscatedName("rw.q")
	public static MiniMenuEntry field5136;

	@ObfuscatedName("rh.vz")
	public static GarbageCollectorMXBean field5168;

	@ObfuscatedName("ru.s")
	public static int field5179;

	@ObfuscatedName("ru.si")
	public static class61[] field5180;

	@ObfuscatedName("rf.c")
	public static class151[] field5181;

	@ObfuscatedName("rl.qt")
	public static int field5185;

	@ObfuscatedName("rz.cc")
	public static RendererToolkit field5187;

	@ObfuscatedName("re.n")
	public static class366 field5193;

	@ObfuscatedName("ro.ep")
	public static Js5 field5197;

	@ObfuscatedName("ro.p")
	public static class374 field5198;

	@ObfuscatedName("rq.n")
	public static SpriteData field5243;

	@ObfuscatedName("se.bm")
	public static IterableQueue field5267;

	@ObfuscatedName("s.m")
	public static int[] field541;

	@ObfuscatedName("c.b")
	public static Js5 field549;

	@ObfuscatedName("t.d")
	public static int field550;

	@ObfuscatedName("t.u")
	public static int field551;

	@ObfuscatedName("t.j")
	public static int field552;

	@ObfuscatedName("t.c")
	public static int field553;

	@ObfuscatedName("t.m")
	public static int field554;

	@ObfuscatedName("t.l")
	public static int field555;

	@ObfuscatedName("t.f")
	public static int field556;

	@ObfuscatedName("t.a")
	public static int field557;

	@ObfuscatedName("t.o")
	public static int field558;

	@ObfuscatedName("t.w")
	public static FontMetrics field559;

	@ObfuscatedName("t.v")
	public static FontType field560;

	@ObfuscatedName("t.af")
	public static Sprite[] field561;

	@ObfuscatedName("t.qn")
	public static int field562;

	@ObfuscatedName("t.oq")
	public static int field563;

	@ObfuscatedName("f.hy")
	public static SeqTypeList field566;

	@ObfuscatedName("d.as")
	public static int field567;

	@ObfuscatedName("q.d")
	public static int field575;

	@ObfuscatedName("p.ag")
	public static boolean field578;

	@ObfuscatedName("p.va")
	public static short[] field579;

	@ObfuscatedName("w.ag")
	public static int field603;

	@ObfuscatedName("w.ar")
	public static int field611;

	@ObfuscatedName("w.aq")
	public static int field617;

	@ObfuscatedName("w.b")
	public static MiniMenuEntry field627;

	@ObfuscatedName("w.nl")
	public static boolean field628;

	@ObfuscatedName("b.m")
	public static ConnectReply field629;

	@ObfuscatedName("b.j")
	public static int[] field630;

	@ObfuscatedName("b.c")
	public static CreateConnectStage field633;

	@ObfuscatedName("st.fw")
	public static Js5 field6343;

	@ObfuscatedName("st.aj")
	public static int field6344;

	@ObfuscatedName("b.d")
	public static int field635;

	@ObfuscatedName("sb.az")
	public static int field6354;

	@ObfuscatedName("sa.l")
	public static long field6356;

	@ObfuscatedName("sa.p")
	public static Sprite field6357;

	@ObfuscatedName("sl.hh")
	public static SkyDecorTypeList field6360;

	@ObfuscatedName("sf.g")
	public static Sprite[] field6361;

	@ObfuscatedName("sf.bp")
	public static boolean field6371;

	@ObfuscatedName("sm.ae")
	public static int field6372;

	@ObfuscatedName("sn.ap")
	public static Sprite field6385;

	@ObfuscatedName("su.r")
	public static Applet field6387;

	@ObfuscatedName("sh.b")
	public static String field6391;

	@ObfuscatedName("sh.bt")
	public static Sprite field6392;

	@ObfuscatedName("sp.m")
	public static CutsceneAction[] field6396;

	@ObfuscatedName("sc.ji")
	public static int field6400;

	@ObfuscatedName("k.o")
	public static int field641;

	@ObfuscatedName("sj.ti")
	public static int field6412;

	@ObfuscatedName("k.t")
	public static int[] field642;

	@ObfuscatedName("sg.l")
	public static int[] field6421;

	@ObfuscatedName("sg.f")
	public static byte[][][] field6422;

	@ObfuscatedName("sg.av")
	public static int field6423;

	@ObfuscatedName("r.a")
	public static int field643;

	@ObfuscatedName("ty.fv")
	public static Js5 field6435;

	@ObfuscatedName("tk.fg")
	public static Js5 field6451;

	@ObfuscatedName("y.j")
	public static int field653;

	@ObfuscatedName("tz.js")
	public static int field6565;

	@ObfuscatedName("tz.aj")
	public static int field6566;

	@ObfuscatedName("e.gw")
	public static Js5 field663;

	@ObfuscatedName("e.kz")
	public static int field664;

	@ObfuscatedName("tq.p")
	public static int field6648;

	@ObfuscatedName("tf.fx")
	public static Js5 field6651;

	@ObfuscatedName("th.p")
	public static MiniMenuEntry field6655;

	@ObfuscatedName("th.b")
	public static int field6658;

	@ObfuscatedName("tv.f")
	public static int field6664;

	@ObfuscatedName("tv.qa")
	public static int field6665;

	@ObfuscatedName("tv.rp")
	public static int[] field6666;

	@ObfuscatedName("tv.hb")
	public static class294 field6667;

	@ObfuscatedName("tt.bi")
	public static ModeWhere field6683;

	@ObfuscatedName("af.qc")
	public static int field669;

	@ObfuscatedName("tu.em")
	public static Js5 field6690;

	@ObfuscatedName("tj.tv")
	public static int field6692;

	@ObfuscatedName("tl.q")
	public static int field6693;

	@ObfuscatedName("af.k")
	public static FontType field670;

	@ObfuscatedName("uw.no")
	public static long field6701;

	@ObfuscatedName("uw.z")
	public static Js5 field6702;

	@ObfuscatedName("ub.gs")
	public static HeadbarTypeList field6705;

	@ObfuscatedName("ux.fs")
	public static Js5 field6712;

	@ObfuscatedName("ar.u")
	public static RendererToolkit field672;

	@ObfuscatedName("ar.j")
	public static FontType field673;

	@ObfuscatedName("ar.t")
	public static Js5 field674;

	@ObfuscatedName("uh.j")
	public static class263 field6761;

	@ObfuscatedName("uh.jz")
	public static int field6762;

	@ObfuscatedName("uf.kt")
	public static int field6769;

	@ObfuscatedName("uf.ac")
	public static int field6770;

	@ObfuscatedName("uu.j")
	public static ServerAddress field6772;

	@ObfuscatedName("uu.a")
	public static ServerAddress field6773;

	@ObfuscatedName("uu.c")
	public static ServerAddress field6775;

	@ObfuscatedName("uu.m")
	public static boolean field6776;

	@ObfuscatedName("uu.f")
	public static Packet field6778;

	@ObfuscatedName("uu.s")
	public static ServerAddress field6779;

	@ObfuscatedName("uu.u")
	public static ServerAddress field6782;

	@ObfuscatedName("ut.ge")
	public static class292 field6784;

	@ObfuscatedName("ut.x")
	public static MaterialTypeList field6785;

	@ObfuscatedName("un.d")
	public static LoadingScreenRenderer field6789;

	@ObfuscatedName("un.bg")
	public static class56 field6790;

	@ObfuscatedName("um.iy")
	public static int field6803;

	@ObfuscatedName("ur.z")
	public static int field6816;

	@ObfuscatedName("ur.cb")
	public static String field6817;

	@ObfuscatedName("ur.li")
	public static int field6818;

	@ObfuscatedName("ur.bg")
	public static Sprite field6819;

	@ObfuscatedName("vg.a")
	public static int field7037;

	@ObfuscatedName("vg.j")
	public static int field7038;

	@ObfuscatedName("vg.s")
	public static int[] field7040;

	@ObfuscatedName("vg.c")
	public static int[] field7041;

	@ObfuscatedName("vg.n")
	public static int field7042;

	@ObfuscatedName("vo.sg")
	public static int field7045;

	@ObfuscatedName("vo.bo")
	public static int field7046;

	@ObfuscatedName("vz.ak")
	public static int field7054;

	@ObfuscatedName("vq.dq")
	public static Mouse field7136;

	@ObfuscatedName("vq.gk")
	public static DiskStore field7137;

	@ObfuscatedName("vq.br")
	public static EventQueue field7138;

	@ObfuscatedName("vr.ov")
	public static int field7157;

	@ObfuscatedName("vr.ba")
	public static class56 field7158;

	@ObfuscatedName("vl.kf")
	public static int field7183;

	@ObfuscatedName("vp.a")
	public static MiniMenuEntry field7187;

	@ObfuscatedName("vc.hd")
	public static class529 field7196;

	@ObfuscatedName("wf.p")
	public static int field7207;

	@ObfuscatedName("ap.bk")
	public static String field726;

	@ObfuscatedName("wv.an")
	public static Sprite field7290;

	@ObfuscatedName("wl.tt")
	public static int field7298;

	@ObfuscatedName("wg.mu")
	public static int field7324;

	@ObfuscatedName("wx.ql")
	public static int field7338;

	@ObfuscatedName("ww.fd")
	public static Js5 field7343;

	@ObfuscatedName("wz.f")
	public static int field7347;

	@ObfuscatedName("wz.c")
	public static class631 field7348;

	@ObfuscatedName("we.sk")
	public static byte field7353;

	@ObfuscatedName("wt.pd")
	public static int field7366;

	@ObfuscatedName("wu.fc")
	public static Js5 field7387;

	@ObfuscatedName("wm.hc")
	public static class626 field7390;

	@ObfuscatedName("xh.s")
	public static int field7432;

	@ObfuscatedName("xb.ey")
	public static Js5 field7435;

	@ObfuscatedName("xy.bc")
	public static String field7436;

	@ObfuscatedName("ai.u")
	public static class265 field748;

	@ObfuscatedName("ai.t")
	public static int field749;

	@ObfuscatedName("ai.a")
	public static int field750;

	@ObfuscatedName("ai.c")
	public static int field751;

	@ObfuscatedName("ai.s")
	public static int field752;

	@ObfuscatedName("ai.z")
	public static SpriteData field753;

	@ObfuscatedName("ai.w")
	public static int field754;

	@ObfuscatedName("yp.ck")
	public static int field7543;

	@ObfuscatedName("ye.ea")
	public static Js5 field7567;

	@ObfuscatedName("yh.fn")
	public static Js5 field7572;

	@ObfuscatedName("yd.i")
	public static int field7589;

	@ObfuscatedName("yd.e")
	public static int field7593;

	@ObfuscatedName("yd.n")
	public static int field7600;

	@ObfuscatedName("yd.q")
	public static int field7601;

	@ObfuscatedName("yd.p")
	public static int field7603;

	@ObfuscatedName("yd.w")
	public static int field7604;

	@ObfuscatedName("yd.x")
	public static int field7606;

	@ObfuscatedName("yd.o")
	public static int field7607;

	@ObfuscatedName("yd.v")
	public static int field7608;

	@ObfuscatedName("yd.k")
	public static int field7609;

	@ObfuscatedName("yd.h")
	public static int field7610;

	@ObfuscatedName("yd.r")
	public static int field7611;

	@ObfuscatedName("yd.g")
	public static int field7612;

	@ObfuscatedName("yd.y")
	public static int field7613;

	@ObfuscatedName("yd.b")
	public static int field7614;

	@ObfuscatedName("yd.ay")
	public static int field7615;

	@ObfuscatedName("yd.af")
	public static int field7616;

	@ObfuscatedName("yy.gd")
	public static IDKTypeList field7650;

	@ObfuscatedName("ao.ss")
	public static class559 field769;

	@ObfuscatedName("al.du")
	public static HostNameProvider field771;

	@ObfuscatedName("at.n")
	public static int field783;

	@ObfuscatedName("at.p")
	public static short field784;

	@ObfuscatedName("at.gu")
	public static LightTypeList field785;

	@ObfuscatedName("yz.bw")
	public static int field7855;

	@ObfuscatedName("yz.bi")
	public static long[] field7914;

	@ObfuscatedName("aw.s")
	public static String[] field792;

	@ObfuscatedName("yz.bo")
	public static int field7920;

	@ObfuscatedName("yz.bh")
	public static int field7921;

	@ObfuscatedName("yz.by")
	public static boolean field7922;

	@ObfuscatedName("aw.a")
	public static int field794;

	@ObfuscatedName("yg.by")
	public static class229 field7997;

	@ObfuscatedName("aw.j")
	public static int field803;

	@ObfuscatedName("aw.p")
	public static FileOutputStream field804;

	@ObfuscatedName("aw.fp")
	public static Js5 field808;

	@ObfuscatedName("aw.bz")
	public static int field809;

	@ObfuscatedName("zu.kl")
	public static int field8423;

	@ObfuscatedName("zu.ka")
	public static int field8424;

	@ObfuscatedName("zw.os")
	public static boolean field8432;

	@ObfuscatedName("zb.by")
	public static String field8439;

	@ObfuscatedName("ze.hs")
	public static class598 field8455;

	@ObfuscatedName("zz.tc")
	public static ClanChannel field8458;

	@ObfuscatedName("zz.aa")
	public static int field8459;

	@ObfuscatedName("zi.cg")
	public static MaterialTypeList field8465;

	@ObfuscatedName("zi.om")
	public static int field8466;

	@ObfuscatedName("zt.nv")
	public static int field8469;

	@ObfuscatedName("ad.el")
	public static Js5TcpClient field848;

	@ObfuscatedName("zm.s")
	public static Timer field8481;

	@ObfuscatedName("ad.ft")
	public static Js5 field849;

	@ObfuscatedName("zq.bv")
	public static Sprite field8491;

	@ObfuscatedName("zp.gy")
	public static MapElementTypeList field8499;

	@ObfuscatedName("ad.gt")
	public static MSITypeList field850;

	@ObfuscatedName("zj.hx")
	public static class621 field8514;

	@ObfuscatedName("zj.x")
	public static long field8515;

	@ObfuscatedName("zd.mj")
	public static class562[] field8518;

	@ObfuscatedName("zd.bl")
	public static Sprite field8519;

	@ObfuscatedName("aak.q")
	public static SeqTypeList field8530;

	@ObfuscatedName("aak.ac")
	public static int field8531;

	@ObfuscatedName("aab.ob")
	public static int field8537;

	@ObfuscatedName("aab.ar")
	public static Sprite[] field8538;

	@ObfuscatedName("az.bd")
	public static String field862;

	@ObfuscatedName("aay.fe")
	public static Js5 field8655;

	@ObfuscatedName("aay.ib")
	public static AsyncRebuild field8656;

	@ObfuscatedName("aat.av")
	public static int field8716;

	@ObfuscatedName("aac.bn")
	public static int field8718;

	@ObfuscatedName("aal.o")
	public static SpriteData field8719;

	@ObfuscatedName("aai.rq")
	public static Clipboard field8726;

	@ObfuscatedName("aai.qx")
	public static int field8727;

	@ObfuscatedName("aau.ve")
	public static int field8729;

	@ObfuscatedName("aaq.fq")
	public static Js5 field8734;

	@ObfuscatedName("aav.fy")
	public static Js5 field8745;

	@ObfuscatedName("ak.dn")
	public static Spline field909;

	@ObfuscatedName("aj.tw")
	public static ClanSettings field913;

	@ObfuscatedName("acx.td")
	public static int field9277;

	@ObfuscatedName("ach.ap")
	public static int field9294;

	@ObfuscatedName("act.l")
	public static CheckEmailReply field9312;

	@ObfuscatedName("acj.f")
	public static int[] field9319;

	@ObfuscatedName("aco.fr")
	public static Js5 field9367;

	@ObfuscatedName("aci.qf")
	public static int field9405;

	@ObfuscatedName("acy.av")
	public static int field9426;

	@ObfuscatedName("ac.ae")
	public static String[] field943;

	@ObfuscatedName("ada.mp")
	public static ComType field9471;

	@ObfuscatedName("adr.ai")
	public static int[] field9478;

	@ObfuscatedName("adr.o")
	public static int field9481;

	@ObfuscatedName("adr.e")
	public static float[] field9484;

	@ObfuscatedName("adr.z")
	public static int field9485;

	@ObfuscatedName("adr.n")
	public static int field9486;

	@ObfuscatedName("adr.q")
	public static int field9488;

	@ObfuscatedName("adr.p")
	public static class378[] field9489;

	@ObfuscatedName("adr.w")
	public static class368[] field9490;

	@ObfuscatedName("adr.b")
	public static class382[] field9491;

	@ObfuscatedName("adr.d")
	public static byte[] field9492;

	@ObfuscatedName("adr.i")
	public static boolean[] field9493;

	@ObfuscatedName("adr.v")
	public static int[] field9494;

	@ObfuscatedName("adr.x")
	public static class376[] field9501;

	@ObfuscatedName("adr.af")
	public static float[] field9502;

	@ObfuscatedName("adr.ar")
	public static float[] field9503;

	@ObfuscatedName("adr.an")
	public static float[] field9504;

	@ObfuscatedName("adr.ap")
	public static float[] field9505;

	@ObfuscatedName("adr.ag")
	public static float[] field9506;

	@ObfuscatedName("adr.as")
	public static int[] field9507;

	@ObfuscatedName("adr.ay")
	public static float[] field9508;

	@ObfuscatedName("adg.bk")
	public static class56 field9549;

	@ObfuscatedName("adk.pm")
	public static ComType field9561;

	@ObfuscatedName("aep.te")
	public static int field9680;

	@ObfuscatedName("aer.b")
	public static FontMetrics field9813;

	@ObfuscatedName("afa.e")
	public static Sprite[] field9826;

	@ObfuscatedName("aft.d")
	public static int[] field9860;

	@ObfuscatedName("agi.y")
	public static int[] field9879;

	@ObfuscatedName("agf.l")
	public static int field9896;

	@ObfuscatedName("agm.r")
	public static Sprite[] field9904;

	@ObfuscatedName("agb.u")
	public static class617 field9905;

	@ObfuscatedName("agj.u")
	public static volatile NativeMouse field9906;

	@ObfuscatedName("ju.u(I)[Lfx;")
	public static class185[] method4877() {
		return new class185[] { class185.field2148, class185.field2146, class185.field2147 };
	}

	@ObfuscatedName("jj.u(I)Lnk;")
	public static Timer method4777() {
		try {
			return new MillisTimer();
		} catch (Throwable var1) {
			return new NanoTimer();
		}
	}

	@ObfuscatedName("gd.u([BZB)Ljava/lang/Object;")
	public static Object method4122(byte[] arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			ByteBuffer var2 = ByteBuffer.allocateDirect(arg0.length);
			var2.position(0);
			var2.put(arg0);
			return var2;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("pv.u(II)Lfc;")
	public static class179 method7654(int arg0) {
		if (class179.field2122.field2121 == arg0) {
			return class179.field2122;
		} else if (class179.field2120.field2121 == arg0) {
			return class179.field2120;
		} else {
			return null;
		}
	}

	@ObfuscatedName("xm.u(I)V")
	public static void method12860() {
	}

	@ObfuscatedName("uy.u(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method12166(Applet arg0, String arg1) throws Throwable {
		// JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("tm.u(Lub;I)[Lus;")
	public static class562[] method11507(FullscreenImpl arg0) {
		int[] var1 = arg0.method11883();
		class562[] var2 = new class562[var1.length >> 2];
		for (int var3 = 0; var3 < var2.length; var3++) {
			class562 var4 = new class562();
			var2[var3] = var4;
			var4.field6709 = var1[var3 << 2];
			var4.field6707 = var1[(var3 << 2) + 1];
			var4.field6708 = var1[(var3 << 2) + 2];
			var4.field6706 = var1[(var3 << 2) + 3];
		}
		return var2;
	}

	@ObfuscatedName("l.j([SI)[S")
	public static short[] method879(short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			short[] var1 = new short[arg0.length];
			System.arraycopy(arg0, 0, var1, 0, arg0.length);
			return var1;
		}
	}

	@ObfuscatedName("ji.u(Ljava/lang/CharSequence;B)J")
	public static long method4796(CharSequence arg0) {
		long var1 = 0L;
		int var3 = arg0.length();
		for (int var4 = 0; var4 < var3; var4++) {
			var1 *= 37L;
			char var5 = arg0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += var5 + 1 - 65;
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += var5 + 1 - 97;
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += var5 + 27 - 48;
			}
			if (var1 >= 177917621779460413L) {
				break;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("gb.u(I)V")
	public static void method4012() {
		ClientScriptHelpers.field5186.method7959();
	}

	@ObfuscatedName("gq.u(B)[Lmz;")
	public static CompassPoint[] method3921() {
		return new CompassPoint[] { CompassPoint.field3908, CompassPoint.field3915, CompassPoint.field3912, CompassPoint.field3914, CompassPoint.field3909, CompassPoint.field3910, CompassPoint.field3913, CompassPoint.field3911 };
	}

	@ObfuscatedName("ow.j(Ljava/lang/String;I)V")
	public static void method7348(String arg0) {
		ChatHistory.method3943(0, 0, "", "", "", arg0);
	}

	@ObfuscatedName("qv.u(I)[Lit;")
	public static ZoneProt[] method8301() {
		return new ZoneProt[] { ZoneProt.field2802, ZoneProt.field2801, ZoneProt.field2810, ZoneProt.field2803, ZoneProt.field2804, ZoneProt.field2805, ZoneProt.field2814, ZoneProt.field2807, ZoneProt.field2808, ZoneProt.field2809, ZoneProt.field2812, ZoneProt.field2811, ZoneProt.field2800, ZoneProt.field2813, ZoneProt.field2806 };
	}

	@ObfuscatedName("sg.u(IS)[B")
	public static synchronized byte[] method11364(int arg0) {
		if (arg0 == 100 && class532.field6417 > 0) {
			byte[] var1 = class532.field6418[--class532.field6417];
			class532.field6418[class532.field6417] = null;
			return var1;
		} else if (arg0 == 5000 && class532.field6415 > 0) {
			byte[] var2 = class532.field6416[--class532.field6415];
			class532.field6416[class532.field6415] = null;
			return var2;
		} else if (arg0 == 30000 && class532.field6419 > 0) {
			byte[] var3 = class532.field6420[--class532.field6419];
			class532.field6420[class532.field6419] = null;
			return var3;
		} else {
			if (field6422 != null) {
				for (int var4 = 0; var4 < field642.length; var4++) {
					if (field642[var4] == arg0 && field6421[var4] > 0) {
						byte[] var5 = field6422[var4][--field6421[var4]];
						field6422[var4][field6421[var4]] = null;
						return var5;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@ObfuscatedName("dp.u(I)[Ltk;")
	public static CreateAccountReply[] method2615() {
		return new CreateAccountReply[] { CreateAccountReply.field6439, CreateAccountReply.field6446, CreateAccountReply.field6448, CreateAccountReply.field6440, CreateAccountReply.field6436, CreateAccountReply.field6443, CreateAccountReply.field6437, CreateAccountReply.field6442, CreateAccountReply.field6438, CreateAccountReply.field6445, CreateAccountReply.field6447, CreateAccountReply.field6449, CreateAccountReply.field6444, CreateAccountReply.field6441 };
	}

	@ObfuscatedName("dz.s(Lrn;I)V")
	public static void method2717(ClientScriptState arg0) {
		arg0.field5215[arg0.field5216 - 1] = field4959.method8401(arg0.field5215[arg0.field5216 - 1]).field5063;
	}

	@ObfuscatedName("dq.j(Ljava/lang/Object;ZI)[B")
	public static byte[] method2896(Object arg0, boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			byte[] var2 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(var2, var2.length) : var2;
		} else if (arg0 instanceof ByteBuffer) {
			ByteBuffer var3 = (ByteBuffer) arg0;
			byte[] var4 = new byte[var3.capacity()];
			var3.position(0);
			var3.get(var4);
			return var4;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fp.a(Laet;I)Lpf;")
	public static class450 method3541(Packet arg0) {
		int var1 = arg0.method15220();
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = arg0.method15220();
		}
		return new class450(var2);
	}

	@ObfuscatedName("pf.j(IIIIB)Lpq;")
	public static class435 method7914(int arg0, int arg1, int arg2, int arg3) {
		class434.field4672.field4682 = arg0;
		class434.field4672.field4680 = arg1;
		class434.field4672.field4681 = arg2;
		class434.field4672.field4679 = arg3;
		return class434.field4672;
	}

	@ObfuscatedName("aaf.s(Lacp;B)V")
	public static void method14063(CoverMarkerClickbox arg0) {
		arg0.field9250 = null;
		if (CoverMarkerClickbox.field9249 < 20) {
			CoverMarkerClickbox.field9248.method11640(arg0);
			CoverMarkerClickbox.field9249++;
		}
	}

	@ObfuscatedName("lq.j(J)Ljava/lang/String;")
	public static String method5925(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
				var2++;
			}
			StringBuilder var5 = new StringBuilder(var2);
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var5.append(Base37.field6393[(int) (var6 - arg0 * 37L)]);
			}
			return var5.reverse().toString();
		}
	}

	@ObfuscatedName("wu.m(Lrn;I)V")
	public static void method12700(ClientScriptState arg0) {
		arg0.field5215[arg0.field5216 - 1] = field4959.method8401(arg0.field5215[arg0.field5216 - 1]).field5065;
	}

	@ObfuscatedName("lp.u(I)V")
	public static void method6024() {
		if (client.field8923 == 6 && (!method16489() && !method8399())) {
			client.method11307(8);
		}
	}

	@ObfuscatedName("aer.j(IB)Lqz;")
	public static class473 method15663(int arg0) {
		class473[] var1 = class473.method12694();
		for (int var2 = 0; var2 < var1.length; var2++) {
			if (var1[var2].field5029 == arg0) {
				return var1[var2];
			}
		}
		return null;
	}

	@ObfuscatedName("ky.u(I)[Lky;")
	public static LoadingStage[] method5013() {
		return new LoadingStage[] { LoadingStage.field3390, LoadingStage.field3394, LoadingStage.field3388, LoadingStage.field3407, LoadingStage.field3386, LoadingStage.field3389, LoadingStage.field3392, LoadingStage.field3393, LoadingStage.field3391, LoadingStage.field3395, LoadingStage.field3396, LoadingStage.field3387, LoadingStage.field3408, LoadingStage.field3399, LoadingStage.field3400, LoadingStage.field3401, LoadingStage.field3402, LoadingStage.field3403 };
	}

	@ObfuscatedName("fj.a(I)V")
	public static void method3616() {
		Stack var0 = PickableEntity.field4565;
		synchronized (PickableEntity.field4565) {
			PickableEntity.field4565 = new Stack();
		}
	}

	@ObfuscatedName("sn.u(I)[Lsn;")
	public static Language[] method11191() {
		return new Language[] { Language.field6376, Language.field6377, Language.field6375, Language.field6384, Language.field6373, Language.field6374 };
	}

	@ObfuscatedName("fj.u(Lls;Lls;Lls;Laih;Lmg;I)Z")
	public static boolean method3612(Js5 arg0, Js5 arg1, Js5 arg2, class937 arg3, class374 arg4) {
		field1586 = arg0;
		field1580 = arg1;
		field1581 = arg2;
		field1735 = arg3;
		field4165 = arg4;
		field4559 = new int[16];
		for (int var5 = 0; var5 < 16; var5++) {
			field4559[var5] = 255;
		}
		return true;
	}

	@ObfuscatedName("cu.l(Lrn;I)V")
	public static void method2549(ClientScriptState arg0) {
		arg0.field5215[arg0.field5216 - 2] = field4959.method8401(arg0.field5215[arg0.field5216 - 2]).field5076[arg0.field5215[arg0.field5216 - 1]];
		arg0.field5216--;
	}

	@ObfuscatedName("aay.u(I)[Loc;")
	public static SkyBoxFillMode[] method14028() {
		return new SkyBoxFillMode[] { SkyBoxFillMode.field4468, SkyBoxFillMode.field4467 };
	}

	@ObfuscatedName("dc.a([BIII)Ljava/lang/String;")
	public static String method2786(byte[] arg0, int arg1, int arg2) {
		char[] var3 = new char[arg2];
		int var4 = 0;
		int var5 = arg1;
		int var6 = arg1 + arg2;
		while (var5 < var6) {
			int var7 = arg0[var5++] & 0xFF;
			int var8;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (arg0[var5] & 0xC0) == 128) {
					var8 = (var7 & 0x1F) << 6 | arg0[var5++] & 0x3F;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128) {
					var8 = (var7 & 0xF) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 >= 248) {
				var8 = 65533;
			} else if (var5 + 2 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128 && (arg0[var5 + 2] & 0xC0) == 128) {
				int var9 = (var7 & 0x7) << 18 | (arg0[var5++] & 0x3F) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
				if (var9 >= 65536 && var9 <= 1114111) {
					var8 = 65533;
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
			var3[var4++] = (char) var8;
		}
		return new String(var3, 0, var4);
	}

	@ObfuscatedName("qk.a(I)Z")
	public static boolean method8399() {
		return field633 != null;
	}

	@ObfuscatedName("ux.u(CI)I")
	public static int method11908(char arg0) {
		return arg0 >= 0 && arg0 < class525.field6399.length ? class525.field6399[arg0] : -1;
	}

	@ObfuscatedName("pn.a(CB)Z")
	public static final boolean method7788(char arg0) {
		return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@ObfuscatedName("cp.c(ZB)V")
	public static synchronized void method2362(boolean arg0) {
		class111.field1193 = arg0;
	}

	@ObfuscatedName("aeq.ar(II)V")
	public static void method15563(int arg0) {
		field2081 = arg0;
		NativeMouseEvent.field10450 = new NativeMouseEvent[arg0];
		field8716 = 0;
	}

	@ObfuscatedName("wy.l(B)V")
	public static void method12634() {
		for (int var0 = 0; var0 < 100; var0++) {
			ChatHistory.field2097[var0] = null;
		}
		field2098 = 0;
	}

	@ObfuscatedName("pj.a(I)V")
	public static void method7897() {
		if (field672 != null) {
			field672.method442();
			field672 = null;
			field673 = null;
		}
	}

	@ObfuscatedName("is.j(Ljava/lang/String;[BII)I")
	public static int method4633(String arg0, byte[] arg1, int arg2) {
		int var3 = arg2;
		int var4 = arg0.length();
		for (int var5 = 0; var5 < var4; var5 += 4) {
			int var6 = method11908(arg0.charAt(var5));
			int var7 = var5 + 1 < var4 ? method11908(arg0.charAt(var5 + 1)) : -1;
			int var8 = var5 + 2 < var4 ? method11908(arg0.charAt(var5 + 2)) : -1;
			int var9 = var5 + 3 < var4 ? method11908(arg0.charAt(var5 + 3)) : -1;
			arg1[arg2++] = (byte) (var6 << 2 | var7 >>> 4);
			if (var8 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((var7 & 0xF) << 4 | var8 >>> 2);
			if (var9 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((var8 & 0x3) << 6 | var9);
		}
		return arg2 - var3;
	}

	@ObfuscatedName("cv.a(Lub;Ljava/awt/Frame;I)V")
	public static void method2431(FullscreenImpl arg0, Frame arg1) {
		arg0.method11885();
		arg1.setVisible(false);
		arg1.dispose();
	}

	@ObfuscatedName("pi.s([Ljava/lang/String;[IIIB)V")
	public static void method7899(String[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		String var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
				String var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				int var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method7899(arg0, arg1, arg2, var5 - 1);
		method7899(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("ws.j(I)V")
	public static void method12620() {
		DelayedStateChange.field10326.method11925();
		DelayedStateChange.field10317.method11733();
		DelayedStateChange.field10323.method11733();
	}

	@ObfuscatedName("dd.u(I)Laeg;")
	public static ClientOptions method2808() {
		FileOnDisk var0 = null;
		ClientOptions var1 = new ClientOptions(client.field9163, 0);
		try {
			var0 = GameShell.method4031("", client.field9163.field6404, false);
			byte[] var2 = new byte[(int) var0.method12077()];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.method12078(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}
			var1 = new ClientOptions(new Packet(var2), client.field9163, 0);
		} catch (Exception var8) {
		}
		try {
			if (var0 != null) {
				var0.method12076();
			}
		} catch (Exception var7) {
		}
		return var1;
	}

	@ObfuscatedName("ji.u(I)V")
	public static void method4790() {
		class374.method6512(22050, field4961.field9676.method15891() == 1, 2);
		field5198 = class374.method6494(field1231, 0, 22050);
		class395.method3658(true, class395.method6082(null));
		field3536 = class374.method6494(field1231, 1, 2048);
		field4201 = new class939();
		field3536.method6521(field4201);
		field3160 = new class375(22050, field4015);
		class395.method2572();
	}

	@ObfuscatedName("agj.a(I)I")
	public static int method15963() {
		if (class162.field1699 == -1) {
			class162[] var0 = class162.method3969();
			for (int var1 = 0; var1 < var0.length; var1++) {
				class162 var2 = var0[var1];
				if (var2.field1724 > class162.field1699) {
					class162.field1699 = var2.field1724;
				}
			}
			class162.field1699++;
		}
		return class162.field1699;
	}

	@ObfuscatedName("pn.c(Ljava/lang/String;Ljava/lang/String;IZB)V")
	public static void method7789(String arg0, String arg1, int arg2, boolean arg3) {
		if (client.field8923 != 14) {
			return;
		}
		ClientMessage var4 = ClientMessage.method14781(ClientProt.field2924, client.field8959.field834);
		var4.field9467.method15287(0);
		int var5 = var4.field9467.field9626;
		var4.field9467.method15228(arg0);
		var4.field9467.method15228(arg1);
		var4.field9467.method15308(arg2);
		var4.field9467.method15308(arg3 ? 1 : 0);
		var4.field9467.field9626 += 7;
		var4.field9467.method15280(field630, var5, var4.field9467.field9626);
		var4.field9467.method15233(var4.field9467.field9626 - var5);
		client.field8959.method1913(var4);
		if (arg2 < 13) {
			client.field8946 = true;
			client.method8095();
		}
		field4011 = CreateAccountReply.field6437;
	}

	@ObfuscatedName("uh.s(B)V")
	public static void method12022() {
		if (field6779.field6768 != -1) {
			WorldSwitcher.method8621(field6779.field6768, field6779.field6765);
		}
	}

	@ObfuscatedName("y.s(B)V")
	public static void method1638() {
		ParticleSystemRenderer.field4924 = new IterableMap(8);
		ParticleSystemRenderer.field4920 = 0;
		Iterator var0 = field4686.iterator();
		while (var0.hasNext()) {
			ParticleSystem var1 = (ParticleSystem) var0.next();
			var1.method8101();
		}
	}

	@ObfuscatedName("j.j(I)V")
	public static void method1245() {
		FileOnDisk var0 = null;
		try {
			var0 = GameShell.method4031("", client.field9163.field6404, true);
			Packet var1 = field4961.method15447();
			var0.method12075(var1.field9629, 0, var1.field9626);
		} catch (Exception var5) {
		}
		try {
			if (var0 != null) {
				var0.method12076();
			}
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("vj.c(I)V")
	public static void method12330() {
		if (field5198 != null) {
			field5198.method6498();
		}
		if (field3536 != null) {
			field3536.method6498();
		}
	}

	@ObfuscatedName("es.m(I)I")
	public static int method3102() {
		return ParticleSystemRenderer.field4929;
	}

	@ObfuscatedName("cj.a(Ljava/lang/String;ZLra;Ll;Lvm;I)V")
	public static void method2579(String arg0, boolean arg1, RendererToolkit arg2, FontType arg3, FontMetrics arg4) {
		boolean var5 = !field1201 || class57.method14267();
		if (!var5) {
			return;
		}
		if (field1201 && var5) {
			FontMetrics var6 = field10224;
			FontType var7 = arg2.method712(var6, field4566, true);
			int var8 = var6.method12393(arg0, 250, null);
			int var9 = var6.method12395(arg0, 250, var6.field7175, null);
			int var10 = field5243.method2721();
			int var11 = var10 + 4;
			int var12 = var11 * 2 + var8;
			int var13 = var11 * 2 + var9;
			if (var12 < field751) {
				var12 = field751;
			}
			if (var13 < field3502) {
				var13 = field3502;
			}
			int var14 = field748.method4586(var12, client.field9067) + field750;
			int var15 = field6761.method4574(var13, client.field9068) + field752;
			arg2.method517(field8719, false).method1070(var14 + field753.method2721(), var15 + field753.method2763(), var12 - field753.method2721() * 2, var13 - field753.method2763() * 2, 1, -1, 0);
			arg2.method517(field753, true).method2500(var14, var15);
			field753.method2757();
			arg2.method517(field753, true).method2500(var12 + var14 - var10, var15);
			field753.method2778();
			arg2.method517(field753, true).method2500(var12 + var14 - var10, var13 + var15 - var10);
			field753.method2757();
			arg2.method517(field753, true).method2500(var14, var13 + var15 - var10);
			field753.method2778();
			arg2.method517(field5243, true).method2511(var14, var15 + field753.method2763(), var10, var13 - field753.method2763() * 2);
			field5243.method2733();
			arg2.method517(field5243, true).method2511(var14 + field753.method2721(), var15, var12 - field753.method2721() * 2, var10);
			field5243.method2733();
			arg2.method517(field5243, true).method2511(var12 + var14 - var10, var15 + field753.method2763(), var10, var13 - field753.method2763() * 2);
			field5243.method2733();
			arg2.method517(field5243, true).method2511(var14 + field753.method2721(), var13 + var15 - var10, var12 - field753.method2721() * 2, var10);
			field5243.method2733();
			var7.method836(arg0, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, field754 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			client.method7910(var14, var15, var12, var13);
		} else {
			int var16 = arg4.method12393(arg0, 250, null);
			int var17 = arg4.method12394(arg0, 250, null) * 13;
			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;
			arg2.method489(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -16777216, 0);
			arg2.method488(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18, -1, 0);
			arg3.method836(arg0, var19, var20, var16, var17, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			client.method7910(var19 - var18, var20 - var18, var16 + var18 + var18, var17 + var18 + var18);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method509();
			arg2.method466();
		} catch (class881 var22) {
		}
	}

	@ObfuscatedName("cj.c(Lra;II)Z")
	public static boolean method2581(RendererToolkit arg0, int arg1) {
		arg0.method509();
		MonotonicTime.method5554();
		if (!arg0.method495()) {
			return false;
		}
		int var2 = client.field8980.method6220();
		int var3 = client.field8980.method6193();
		SceneLevelTileFlags var4 = client.field8980.method6100();
		Scene var5 = client.field8980.method6098();
		int var6 = var2 / 2;
		byte var7 = 0;
		byte var8 = 0;
		boolean var9 = true;
		for (int var10 = var7; var10 < var2 + var7; var10++) {
			for (int var11 = var8; var11 < var3 + var8; var11++) {
				for (int var12 = arg1; var12 <= 3; var12++) {
					if (var4.method5795(arg1, var12, var10, var11)) {
						int var13 = var12;
						if (var4.method5794(var10, var11)) {
							var13 = var12 - 1;
						}
						if (var13 >= 0) {
							var9 &= MiniMap.method7787(var13, var10, var11);
						}
					}
				}
			}
		}
		if (!var9) {
			return false;
		}
		int var14 = var2 * 4 + 48 + 48;
		int[] var15 = new int[var14 * var14];
		for (int var16 = 0; var16 < var15.length; var16++) {
			var15[var16] = -16777216;
		}
		class674 var17 = null;
		byte var18 = 0;
		byte var19 = 0;
		if (MiniMap.field756) {
			field6357 = arg0.method658(var14, var14, false, true);
			var17 = arg0.method467();
			var17.method1206(0, field6357.method1049());
			class132 var20 = arg0.method637(var14, var14);
			var17.method1207(var20);
			arg0.method464(var17);
			var6 = var2;
			var18 = 48;
			var19 = 48;
			arg0.method505(1, 0);
		} else {
			field6357 = arg0.method506(var15, 0, var14, var14, var14);
		}
		client.field8980.method6139().method8158();
		int var21 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		int var22 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		int var23 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		boolean[][] var24 = new boolean[var6 + 1 + 2][var6 + 1 + 2];
		for (int var25 = var7; var25 < var2 + var7; var25 += var6) {
			for (int var26 = var8; var26 < var3 + var8; var26 += var6) {
				int var27 = var18;
				int var28 = var19;
				int var29 = var25;
				if (var25 > 0) {
					var29 = var25 - 1;
					var27 = var18 + 4;
				}
				int var30 = var26;
				if (var26 > 0) {
					var30 = var26 - 1;
				}
				int var31 = var6 + var25;
				if (var31 < var2) {
					var31++;
				}
				int var32 = var6 + var26;
				if (var32 < var3) {
					var32++;
					var28 = var19 + 4;
				}
				if (MiniMap.field768) {
					arg0.method753();
				} else {
					arg0.method659(0, 0, var6 * 4 + var27, var6 * 4 + var28);
				}
				arg0.method505(3, -16777216);
				int var33 = var6;
				if (var6 > var2 - 1) {
					var33 = var2 - 1;
				}
				for (int var34 = arg1; var34 <= 3; var34++) {
					for (int var35 = 0; var35 <= var33; var35++) {
						for (int var36 = 0; var36 <= var33; var36++) {
							var24[var35][var36] = var4.method5795(arg1, var34, var29 + var35, var30 + var36);
						}
					}
					var5.field4527[var34].method191(var18, var19, 1024, var29, var30, var31, var32, var24);
					if (!MiniMap.field755) {
						for (int var37 = -4; var37 < var6; var37++) {
							for (int var38 = -4; var38 < var6; var38++) {
								int var39 = var25 + var37;
								int var40 = var26 + var38;
								if (var39 >= var7 && var40 >= var8 && var4.method5795(arg1, var34, var39, var40)) {
									int var41 = var34;
									if (var4.method5794(var39, var40)) {
										var41 = var34 - 1;
									}
									if (var41 >= 0) {
										MiniMap.method8094(arg0, var41, var39, var40, var37 * 4 + var27, (var6 - var38) * 4 + var28 - 4, var21, var22);
									}
								}
							}
						}
					}
				}
				if (MiniMap.field755) {
					class361 var42 = client.field8980.method6101(arg1);
					for (int var43 = 0; var43 < var6; var43++) {
						for (int var44 = 0; var44 < var6; var44++) {
							int var45 = var25 + var43;
							int var46 = var26 + var44;
							int var47 = var42.field3896[var45 - var42.field3857][var46 - var42.field3893];
							if ((var47 & 0x40240000) != 0) {
								arg0.method496(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, 4, -1713569622);
							} else if ((var47 & 0x800000) != 0) {
								arg0.method485(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
							} else if ((var47 & 0x2000000) != 0) {
								arg0.method486(var43 * 4 + var27 + 3, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
							} else if ((var47 & 0x8000000) != 0) {
								arg0.method485(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4 + 3, 4, -1713569622);
							} else if ((var47 & 0x20000000) != 0) {
								arg0.method486(var43 * 4 + var27, (var6 - var44) * 4 + var28 - 4, 4, -1713569622);
							}
						}
					}
				}
				arg0.method489(var27, var28, var6 * 4, var6 * 4, var23, 2);
				arg0.method509();
				if (!MiniMap.field756) {
					field6357.method1086((var25 - var7) * 4 + 48, var3 * 4 + 48 - (var26 - var8) * 4 - var6 * 4, var6 * 4, var6 * 4, var27, var28);
					if (MiniMap.field768) {
						field6357.method2500(256, 0);
						try {
							arg0.method466();
							PreciseSleep.method7052(2000L);
						} catch (Exception var76) {
						}
					}
				}
			}
		}
		if (MiniMap.field756) {
			arg0.method696(var17);
			if (MiniMap.field768) {
				field6357.method2500(256, 0);
				try {
					arg0.method466();
					PreciseSleep.method7052(2000L);
				} catch (Exception var75) {
				}
			}
		}
		arg0.method753();
		arg0.method505(1, 1);
		client.method1703();
		LocTypeList var50 = client.field8980.method6103();
		MiniMap.field767 = 0;
		MiniMap.field758.method11557();
		if (!MiniMap.field755) {
			for (int var51 = var7; var51 < var2 + var7; var51++) {
				for (int var52 = var8; var52 < var3 + var8; var52++) {
					for (int var53 = arg1; var53 <= arg1 + 1 && var53 <= 3; var53++) {
						if (var4.method5795(arg1, var53, var51, var52)) {
							Location var54 = (Location) var5.method7517(var53, var51, var52);
							if (var54 == null) {
								var54 = (Location) var5.method7437(var53, var51, var52, client.field9216);
							}
							if (var54 == null) {
								var54 = (Location) var5.method7433(var53, var51, var52);
							}
							if (var54 == null) {
								var54 = (Location) var5.method7435(var53, var51, var52);
							}
							if (var54 != null) {
								LocType var55 = var50.method11471(var54.method2401());
								if (!var55.field6542 || client.field9142) {
									int var56 = var55.field6495;
									if (var55.field6534 != null) {
										for (int var57 = 0; var57 < var55.field6534.length; var57++) {
											if (var55.field6534[var57] != -1) {
												LocType var58 = var50.method11471(var55.field6534[var57]);
												if (var58.field6495 >= 0) {
													var56 = var58.field6495;
												}
											}
										}
									}
									if (var56 >= 0) {
										boolean var59 = false;
										if (var56 >= 0) {
											MapElementType var60 = field8499.method7862(var56);
											if (var60 != null && var60.field4774) {
												var59 = true;
											}
										}
										int var61 = var51;
										int var62 = var52;
										if (var59) {
											int[][] var63 = client.field8980.method6101(var53).field3896;
											int var64 = client.field8980.method6101(var53).field3857;
											int var65 = client.field8980.method6101(var53).field3893;
											for (int var66 = 0; var66 < 10; var66++) {
												int var67 = (int) (Math.random() * 4.0D);
												if (var67 == 0 && var61 > var7 && var61 > var51 - 3 && (var63[var61 - 1 - var64][var62 - var65] & 0x2C0108) == 0) {
													var61--;
												}
												if (var67 == 1 && var61 < var2 + var7 - 1 && var61 < var51 + 3 && (var63[var61 + 1 - var64][var62 - var65] & 0x2C0180) == 0) {
													var61++;
												}
												if (var67 == 2 && var62 > var8 && var62 > var52 - 3 && (var63[var61 - var64][var62 - 1 - var65] & 0x2C0102) == 0) {
													var62--;
												}
												if (var67 == 3 && var62 < var3 + var8 - 1 && var62 < var52 + 3 && (var63[var61 - var64][var62 + 1 - var65] & 0x2C0120) == 0) {
													var62++;
												}
											}
										}
										MiniMap.field761[MiniMap.field767] = var55.field6474;
										MiniMap.field759[MiniMap.field767] = var61;
										MiniMap.field757[MiniMap.field767] = var62;
										MiniMap.field767++;
									}
								}
							}
						}
					}
				}
			}
			WorldMapRelated var68 = client.field8980.method6093();
			if (var68 != null) {
				field8499.method7876(1024, 64);
				CoordGrid var69 = client.field8980.method6214();
				for (int var70 = 0; var70 < var68.field4255; var70++) {
					int var71 = var68.field4254[var70];
					if (var71 >> 28 == field2119.field9807) {
						int var72 = (var71 >> 14 & 0x3FFF) - var69.field4836;
						int var73 = (var71 & 0x3FFF) - var69.field4838;
						if (var72 >= 0 && var72 < var2 && var73 >= 0 && var73 < var3) {
							MiniMap.field758.method11558(new IntNode(var70));
						} else {
							MapElementType var74 = field8499.method7862(var68.field4253[var70]);
							if (var74.field4788 != null && var74.field4792 + var72 >= 0 && var74.field4790 + var72 < var2 && var74.field4773 + var73 >= 0 && var74.field4791 + var73 < var3) {
								MiniMap.field758.method11558(new IntNode(var70));
							}
						}
					}
				}
				field8499.method7876(128, 64);
			}
		}
		return true;
	}

	@ObfuscatedName("ga.l(IS)V")
	public static void method4107(int arg0) {
		DelayedStateChange var1 = DelayedStateChange.method8304(4, (long) arg0);
		var1.method16506();
	}

	@ObfuscatedName("kw.s(B)V")
	public static void method5550() {
		if (field5084 != null) {
			return;
		}
		field5084 = new int[65536];
		field5085 = new int[65536];
		double var0 = Math.random() * 0.03D - 0.015D + 0.7D;
		for (int var2 = 0; var2 < 65536; var2++) {
			double var3 = (double) (var2 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			double var5 = (double) (var2 >> 7 & 0x7) / 8.0D + 0.0625D;
			double var7 = (double) (var2 & 0x7F) / 128.0D;
			double var9 = var7;
			double var11 = var7;
			double var13 = var7;
			if (var5 != 0.0D) {
				double var15;
				if (var7 < 0.5D) {
					var15 = (var5 + 1.0D) * var7;
				} else {
					var15 = var5 + var7 - var5 * var7;
				}
				double var17 = var7 * 2.0D - var15;
				double var19 = var3 + 0.3333333333333333D;
				if (var19 > 1.0D) {
					var19--;
				}
				double var23 = var3 - 0.3333333333333333D;
				if (var23 < 0.0D) {
					var23++;
				}
				if (var19 * 6.0D < 1.0D) {
					var9 = (var15 - var17) * 6.0D * var19 + var17;
				} else if (var19 * 2.0D < 1.0D) {
					var9 = var15;
				} else if (var19 * 3.0D < 2.0D) {
					var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
				} else {
					var9 = var17;
				}
				if (var3 * 6.0D < 1.0D) {
					var11 = (var15 - var17) * 6.0D * var3 + var17;
				} else if (var3 * 2.0D < 1.0D) {
					var11 = var15;
				} else if (var3 * 3.0D < 2.0D) {
					var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
				} else {
					var11 = var17;
				}
				if (var23 * 6.0D < 1.0D) {
					var13 = (var15 - var17) * 6.0D * var23 + var17;
				} else if (var23 * 2.0D < 1.0D) {
					var13 = var15;
				} else if (var23 * 3.0D < 2.0D) {
					var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
				} else {
					var13 = var17;
				}
			}
			double var25 = Math.pow(var9, var0);
			double var27 = Math.pow(var11, var0);
			double var29 = Math.pow(var13, var0);
			int var31 = (int) (var25 * 256.0D);
			int var32 = (int) (var27 * 256.0D);
			int var33 = (int) (var29 * 256.0D);
			int var34 = (var31 << 16) + (var32 << 8) + var33;
			field5084[var2] = var34 & 0xFFFFFF;
			int var35 = (var32 << 8) + (var33 << 16) + var31;
			field5085[var2] = var35;
		}
	}

	@ObfuscatedName("ta.f(IIB)I")
	public static int method187(int arg0, int arg1) {
		int var2 = arg0 >>> 31;
		return (arg0 + var2) / arg1 - var2;
	}

	@ObfuscatedName("tz.f(IIIIIIB)J")
	public static long method11488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class604.field7179.clear();
		class604.field7179.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return class604.field7179.getTime().getTime();
	}

	@ObfuscatedName("q.s(I)Lagp;")
	public static class876 method1395() {
		class876 var0 = new class876();
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = false;
		if (field2305.field9703 < 512 && field2305.field9703 != 0) {
			var1 = false;
			var0.method15941(128);
		}
		boolean var4;
		if (field2247.startsWith("win")) {
			var3 = true;
			var4 = true;
		} else {
			var4 = true;
		}
		if (class63.field823) {
			var0.method15941(8);
			var1 = false;
		}
		if (class63.field824) {
			var0.method15941(16);
			var4 = false;
		}
		if (class63.field812) {
			var0.method15941(32);
			var3 = false;
		}
		if (!var1 && !var4 && !var3) {
			class63.method6480(var0);
			return var0;
		}
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		if (var1) {
			try {
				var5 = client.method1380(2, 1000);
				if (field4961.field9661.method15781() == 2) {
					var0.method15941(1);
				}
			} catch (Exception var20) {
				var0.method15941(1024);
			}
		}
		if (var3) {
			try {
				var7 = client.method1380(3, 1000);
				if (field4961.field9661.method15781() == 3) {
					var0.method15941(4);
					ToolkitInfo var9 = field5187.method456();
					long var10 = var9.field1289 & 0xFFFFFFFFFFFFL;
					switch(var9.field1285) {
						case 4098:
							boolean var12 = var10 >= 60129613779L;
							var4 &= var12;
							if (!var12) {
								var0.method15941(512);
							}
							break;
						case 4318:
							boolean var13 = var10 >= 64425238954L;
							var4 &= var13;
							if (!var13) {
								var0.method15941(256);
							}
					}
				}
			} catch (Exception var19) {
				var0.method15941(4096);
			}
		}
		if (var4) {
			try {
				var6 = client.method1380(1, 1000);
				if (field4961.field9661.method15781() == 1) {
					var0.method15941(2);
				}
			} catch (Exception var18) {
				var0.method15941(2048);
			}
		}
		if (var5 == -1 && var6 == -1 && var7 == -1) {
			class63.method6480(var0);
			return var0;
		}
		var0.method15942(3, var7);
		var0.method15942(1, var6);
		var0.method15942(2, var5);
		int var16 = (int) ((float) var7 * 1.3F);
		int var17 = (int) ((float) var6 * 1.1F);
		if (var5 > var16 && var5 > var17) {
			class63.method2788(var0, var5);
		} else if (var16 > var17) {
			class63.method11555(var0, 3, var16);
		} else {
			class63.method11555(var0, 1, var17);
		}
		return var0;
	}

	@ObfuscatedName("kf.d(II)J")
	public static long method5541(int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@ObfuscatedName("k.c([BI)Lce;")
	public static Sprite method1604(byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				Image var1 = Toolkit.getDefaultToolkit().createImage(arg0);
				MediaTracker var2 = new MediaTracker(field6387);
				var2.addImage(var1, 0);
				var2.waitForAll();
				int var3 = var1.getWidth(field6387);
				int var4 = var1.getHeight(field6387);
				if (!var2.isErrorAny() && var3 >= 0 && var4 >= 0) {
					int[] var5 = new int[var3 * var4];
					PixelGrabber var6 = new PixelGrabber(var1, 0, 0, var3, var4, var5, 0, var3);
					var6.grabPixels();
					return field5187.method506(var5, 0, var3, var3, var4);
				}
				throw new RuntimeException("");
			} catch (InterruptedException var8) {
			}
		}
	}

	@ObfuscatedName("se.u(Ljava/awt/Component;B)Loq;")
	public static Keyboard method11115(Component arg0) {
		return new JavaKeyboard(arg0);
	}

	@ObfuscatedName("ap.o(Ljava/lang/String;B)I")
	public static int method1724(String arg0) {
		return arg0.length() + 1;
	}

	@ObfuscatedName("aiq.m(I)Z")
	public static final boolean method16489() {
		return LoginManager.field531 != 7;
	}

	@ObfuscatedName("gb.t(B)V")
	public static void method4011() {
		if (LoginManager.field531 == 106) {
			LoginManager.field531 = 113;
		}
	}

	@ObfuscatedName("qe.t([BI)Ljava/lang/String;")
	public static String method8318(byte[] arg0) {
		return Cp1252.method6881(arg0, 0, arg0.length);
	}

	@ObfuscatedName("s.a(I)Z")
	public static boolean method1314() {
		return MiniMenu.method3635(field1736.field5126);
	}

	@ObfuscatedName("yu.o(CI)Z")
	public static boolean method12993(char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("fc.i(Lqa;Ltt;Ltt;I)V")
	public static final void method3537(Model arg0, AnimationNode arg1, AnimationNode arg2) {
		if (arg1.method11790() && arg2.method11790()) {
			SeqType var3 = arg1.field6671;
			SeqType var4 = arg2.field6671;
			arg0.method301(arg1.field6681.field6687, arg1.field6681.field6689, arg1.field6681.field6688, arg1.field6681.field6686, arg1.field6672, var3.field6321[arg1.field6670], arg2.field6681.field6687, arg2.field6681.field6689, arg2.field6681.field6688, arg2.field6681.field6686, arg2.field6672, var4.field6321[arg2.field6670], var3.field6324, var3.field6332 | var4.field6332);
		}
	}

	@ObfuscatedName("sf.z(II)V")
	public static void method11170(int arg0) {
		if (!LoginManager.method12287()) {
			return;
		}
		if (LoginManager.field499 != arg0) {
			LoginManager.field506 = -1L;
		}
		LoginManager.field499 = arg0;
		client.field8959.method1916();
		client.method11307(3);
	}

	@ObfuscatedName("un.w(Ljava/lang/String;CLjava/lang/String;B)Ljava/lang/String;")
	public static String method12093(String arg0, char arg1, String arg2) {
		int var3 = arg0.length();
		int var4 = arg2.length();
		int var5 = var3;
		int var6 = var4 - 1;
		if (var6 != 0) {
			int var7 = 0;
			while (true) {
				var7 = arg0.indexOf(arg1, var7);
				if (var7 < 0) {
					break;
				}
				var7++;
				var5 += var6;
			}
		}
		StringBuilder var8 = new StringBuilder(var5);
		int var9 = 0;
		while (true) {
			int var10 = arg0.indexOf(arg1, var9);
			if (var10 < 0) {
				var8.append(arg0.substring(var9));
				return var8.toString();
			}
			var8.append(arg0.substring(var9, var10));
			var8.append(arg2);
			var9 = var10 + 1;
		}
	}

	@ObfuscatedName("zr.n(I)V")
	public static void method13891() {
		if (client.field8923 == 15 && (!method16489() && !method8399())) {
			client.method11307(11);
		}
	}

	@ObfuscatedName("oy.c(Lajl;IB)V")
	public static void method7394(PacketBit arg0, int arg1) {
		CoordGrid var2 = client.field8980.method6214();
		boolean var3 = arg0.method16863(1) == 1;
		if (var3) {
			ReceivePlayerPositions.field738[++ReceivePlayerPositions.field728 - 1] = arg1;
		}
		int var4 = arg0.method16863(2);
		PlayerEntity var5 = client.field9070[arg1];
		if (var4 == 0) {
			if (var3) {
				var5.field10062 = false;
			} else if (client.field9071 == arg1) {
				throw new RuntimeException();
			} else {
				class39 var6 = ReceivePlayerPositions.field733[arg1] = new class39();
				var6.field570 = (var2.field4838 + var5.field8643[0] >> 6) + (var2.field4836 + var5.field8642[0] >> 6 << 14) + (var5.field9807 << 28);
				if (var5.field10058 == -1) {
					var6.field572 = var5.field8638.method1387();
				} else {
					var6.field572 = var5.field10058;
				}
				var6.field569 = var5.field8624;
				var6.field571 = var5.field10065;
				var6.field568 = var5.field10067;
				if (var5.field10039 > 0) {
					PositionedSound.method7377(var5);
				}
				client.field9070[arg1] = null;
				if (arg0.method16863(1) != 0) {
					method3110(arg0, arg1);
				}
			}
		} else if (var4 == 1) {
			int var7 = arg0.method16863(3);
			int var8 = var5.field8642[0];
			int var9 = var5.field8643[0];
			if (var7 == 0) {
				var8--;
				var9--;
			} else if (var7 == 1) {
				var9--;
			} else if (var7 == 2) {
				var8++;
				var9--;
			} else if (var7 == 3) {
				var8--;
			} else if (var7 == 4) {
				var8++;
			} else if (var7 == 5) {
				var8--;
				var9++;
			} else if (var7 == 6) {
				var9++;
			} else if (var7 == 7) {
				var8++;
				var9++;
			}
			if (var3) {
				var5.field10052 = var8;
				var5.field10064 = var9;
				var5.field10062 = true;
			} else {
				var5.method16131(var8, var9, ReceivePlayerPositions.field730[arg1]);
			}
		} else if (var4 == 2) {
			int var10 = arg0.method16863(4);
			int var11 = var5.field8642[0];
			int var12 = var5.field8643[0];
			if (var10 == 0) {
				var11 -= 2;
				var12 -= 2;
			} else if (var10 == 1) {
				var11--;
				var12 -= 2;
			} else if (var10 == 2) {
				var12 -= 2;
			} else if (var10 == 3) {
				var11++;
				var12 -= 2;
			} else if (var10 == 4) {
				var11 += 2;
				var12 -= 2;
			} else if (var10 == 5) {
				var11 -= 2;
				var12--;
			} else if (var10 == 6) {
				var11 += 2;
				var12--;
			} else if (var10 == 7) {
				var11 -= 2;
			} else if (var10 == 8) {
				var11 += 2;
			} else if (var10 == 9) {
				var11 -= 2;
				var12++;
			} else if (var10 == 10) {
				var11 += 2;
				var12++;
			} else if (var10 == 11) {
				var11 -= 2;
				var12 += 2;
			} else if (var10 == 12) {
				var11--;
				var12 += 2;
			} else if (var10 == 13) {
				var12 += 2;
			} else if (var10 == 14) {
				var11++;
				var12 += 2;
			} else if (var10 == 15) {
				var11 += 2;
				var12 += 2;
			}
			if (var3) {
				var5.field10052 = var11;
				var5.field10064 = var12;
				var5.field10062 = true;
			} else {
				var5.method16131(var11, var12, ReceivePlayerPositions.field730[arg1]);
			}
		} else {
			int var13 = arg0.method16863(1);
			if (var13 == 0) {
				int var14 = arg0.method16863(12);
				int var15 = var14 >> 10;
				int var16 = var14 >> 5 & 0x1F;
				if (var16 > 15) {
					var16 -= 32;
				}
				int var17 = var14 & 0x1F;
				if (var17 > 15) {
					var17 -= 32;
				}
				int var18 = var5.field8642[0] + var16;
				int var19 = var5.field8643[0] + var17;
				if (var3) {
					var5.field10052 = var18;
					var5.field10064 = var19;
					var5.field10062 = true;
				} else {
					var5.method16131(var18, var19, ReceivePlayerPositions.field730[arg1]);
				}
				var5.field9807 = var5.field9809 = (byte) (var5.field9807 + var15 & 0x3);
				if (client.field8980.method6100().method5794(var18, var19)) {
					var5.field9809++;
				}
				if (client.field9071 == arg1 && field7324 != var5.field9807) {
					field7324 = var5.field9807;
				}
			} else {
				int var20 = arg0.method16863(30);
				int var21 = var20 >> 28;
				int var22 = var20 >> 14 & 0x3FFF;
				int var23 = var20 & 0x3FFF;
				int var24 = (var2.field4836 + var5.field8642[0] + var22 & 0x3FFF) - var2.field4836;
				int var25 = (var2.field4838 + var5.field8643[0] + var23 & 0x3FFF) - var2.field4838;
				if (var3) {
					var5.field10052 = var24;
					var5.field10064 = var25;
					var5.field10062 = true;
				} else {
					var5.method16131(var24, var25, ReceivePlayerPositions.field730[arg1]);
				}
				var5.field9807 = var5.field9809 = (byte) (var5.field9807 + var21 & 0x3);
				if (client.field8980.method6100().method5794(var24, var25)) {
					var5.field9809++;
				}
				if (client.field9071 == arg1) {
					field7324 = var5.field9807;
				}
			}
		}
	}

	@ObfuscatedName("vw.d(Lso;ILaes;I)V")
	public static void method12343(SeqType arg0, int arg1, GraphEntity arg2) {
		if (class395.field4209 >= 50 || (arg0 == null || arg0.field6338 == null || arg1 >= arg0.field6338.length || arg0.field6338[arg1] == null || field2119.field9807 != arg2.field9807)) {
			return;
		}
		int var3 = arg0.field6338[arg1][0];
		int var4 = var3 >> 8;
		int var5 = var3 >> 5 & 0x7;
		int var6 = var3 & 0x1F;
		if (arg0.field6338[arg1].length > 1) {
			int var7 = (int) (Math.random() * (double) arg0.field6338[arg1].length);
			if (var7 > 0) {
				var4 = arg0.field6338[arg1][var7];
			}
		}
		int var8 = 256;
		if (arg0.field6316 != null && arg0.field6337 != null) {
			var8 = (int) (Math.random() * (double) (arg0.field6337[arg1] - arg0.field6316[arg1])) + arg0.field6316[arg1];
		}
		int var9 = arg0.field6335 == null ? 255 : arg0.field6335[arg1];
		if (var6 != 0) {
			if (field2119 == arg2) {
				if (field4961.field9654.method15899() == 0) {
					return;
				}
			} else if (field4961.field9672.method15899() == 0) {
				return;
			}
			if (arg0.field6339 != -1) {
				int var10 = 0;
				if (arg2 instanceof PathingEntity) {
					var10 = ((PathingEntity) arg2).method13970();
				} else if (arg2 instanceof SpotAnimation) {
					var10 = ((SpotAnimation) arg2).method17176();
				} else if (arg2 instanceof ProjectileAnimation) {
					var10 = ((ProjectileAnimation) arg2).method17154();
				}
				if (var10 != 0 && var10 != field2119.method13970() && client.field8919 != var10) {
					var9 = arg0.field6339 * var9 / 100;
					if (var9 < 0) {
						var9 = 0;
					} else if (var9 > 255) {
						var9 = 255;
					}
				}
			}
			Vector3 var11 = arg2.method8565().field3464;
			int var12 = (int) var11.field3475 - 256 >> 9;
			int var13 = (int) var11.field3477 - 256 >> 9;
			int var14 = field2119 == arg2 ? 0 : (var13 << 8) + (arg2.field9807 << 24) + (var12 << 16) + var6;
			class395.field4195[++class395.field4209 - 1] = new class393((byte) (arg0.field6334 ? 2 : 1), var4, var5, 0, var9, var14, var8, arg2);
		} else if (field2119 == arg2) {
			if (arg0.field6334) {
				class395.method1717(var4, var5, 0, var9, false, var8);
			} else {
				class395.method14082(var4, var5, 0, var9, var8);
			}
		}
	}

	@ObfuscatedName("kf.q(I)V")
	public static void method5540() {
		client.field8959.method1916();
		if (AccountCreationManager.field631 < 2) {
			field6782.method12026();
			AccountCreationManager.field634 = 0;
			AccountCreationManager.field631++;
			field633 = CreateConnectStage.field564;
		} else {
			field633 = null;
			field629 = ConnectReply.field6428;
			client.method11307(6);
		}
	}

	@ObfuscatedName("agt.c(IIIIIFZB)[I")
	public static int[] method15969(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6) {
		int[] var7 = new int[arg0];
		NoiseGenerator var8 = new NoiseGenerator();
		var8.field10488 = arg1;
		var8.field10493 = arg6;
		var8.field10489 = arg2;
		var8.field10490 = arg3;
		var8.field10491 = arg4;
		var8.field10492 = (int) (arg5 * 4096.0F);
		var8.method16890();
		class589.method12214(arg0, 1);
		var8.method16887(0, var7);
		return var7;
	}

	@ObfuscatedName("aiv.c(Ljava/lang/String;S)Ljava/lang/Class;")
	public static Class method16251(String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@ObfuscatedName("aay.z(IIB)I")
	public static final int method14030(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("fr.u(Lls;Lls;Lls;Lls;I)V")
	public static void method3529(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		field1928 = arg0;
		field1191 = arg1;
		field1600 = arg2;
		field1756 = new IfType[field1928.method5638()];
		field1834 = new boolean[field1928.method5638()];
	}

	@ObfuscatedName("jv.z(Lso;IB)V")
	public static void method4719(SeqType arg0, int arg1) {
		if (class395.field4209 >= 50 || (arg0 == null || arg0.field6338 == null || arg1 >= arg0.field6338.length || arg0.field6338[arg1] == null)) {
			return;
		}
		int var2 = arg0.field6338[arg1][0];
		int var3 = var2 >> 8;
		int var4 = var2 >> 5 & 0x7;
		if (arg0.field6338[arg1].length > 1) {
			int var5 = (int) (Math.random() * (double) arg0.field6338[arg1].length);
			if (var5 > 0) {
				var3 = arg0.field6338[arg1][var5];
			}
		}
		int var6 = 256;
		if (arg0.field6316 != null && arg0.field6337 != null) {
			var6 = class395.method4688(arg0.field6316[arg1], arg0.field6337[arg1]);
		}
		int var7 = arg0.field6335 == null ? 255 : arg0.field6335[arg1];
		if (arg0.field6334) {
			class395.method1717(var3, var4, 0, var7, false, var6);
		} else {
			class395.method14082(var3, var4, 0, var7, var6);
		}
	}

	@ObfuscatedName("el.n(ILjava/lang/String;IB)V")
	public static void method3211(int arg0, String arg1, int arg2) {
		ClientScript var3 = ClientScriptHelpers.method15968(ClientTriggerType.field7309, arg0, -1);
		if (var3 == null) {
			return;
		}
		ClientScriptState var4 = ScriptRunner.method8088();
		var4.field5235 = new int[var3.field10379];
		var4.field5211 = new String[var3.field10387];
		var4.field5211[0] = arg1;
		var4.field5235[0] = arg2;
		ScriptRunner.method6355(var3, 200000, var4);
	}

	@ObfuscatedName("ic.p(B)V")
	public static void method4693() {
	}

	@ObfuscatedName("ej.m(Lajl;II)Z")
	public static boolean method3110(PacketBit arg0, int arg1) {
		int var2 = arg0.method16863(2);
		if (var2 == 0) {
			if (arg0.method16863(1) != 0) {
				method3110(arg0, arg1);
			}
			int var3 = arg0.method16863(6);
			int var4 = arg0.method16863(6);
			boolean var5 = arg0.method16863(1) == 1;
			if (var5) {
				ReceivePlayerPositions.field738[++ReceivePlayerPositions.field728 - 1] = arg1;
			}
			if (client.field9070[arg1] != null) {
				throw new RuntimeException();
			}
			class39 var6 = ReceivePlayerPositions.field733[arg1];
			PlayerEntity var7 = client.field9070[arg1] = new PlayerEntity(client.field8980.method6098());
			var7.field8593 = arg1;
			if (ReceivePlayerPositions.field731[arg1] != null) {
				var7.method16116(ReceivePlayerPositions.field731[arg1]);
			}
			var7.method13946(var6.field572, true);
			var7.field8624 = var6.field569;
			int var8 = var6.field570;
			int var9 = var8 >> 28;
			int var10 = var8 >> 14 & 0xFF;
			int var11 = var8 & 0xFF;
			CoordGrid var12 = client.field8980.method6214();
			int var13 = (var10 << 6) + var3 - var12.field4836;
			int var14 = (var11 << 6) + var4 - var12.field4838;
			var7.field10065 = var6.field571;
			var7.field10067 = var6.field568;
			var7.field8645[0] = ReceivePlayerPositions.field730[arg1];
			var7.field9807 = var7.field9809 = (byte) var9;
			if (client.field8980.method6100().method5794(var13, var14)) {
				var7.field9809++;
			}
			var7.method16123(var13, var14);
			var7.field10062 = false;
			ReceivePlayerPositions.field733[arg1] = null;
			return true;
		} else if (var2 == 1) {
			int var15 = arg0.method16863(2);
			int var16 = ReceivePlayerPositions.field733[arg1].field570;
			ReceivePlayerPositions.field733[arg1].field570 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
			return false;
		} else if (var2 == 2) {
			int var17 = arg0.method16863(5);
			int var18 = var17 >> 3;
			int var19 = var17 & 0x7;
			int var20 = ReceivePlayerPositions.field733[arg1].field570;
			int var21 = (var20 >> 28) + var18 & 0x3;
			int var22 = var20 >> 14 & 0xFF;
			int var23 = var20 & 0xFF;
			if (var19 == 0) {
				var22--;
				var23--;
			}
			if (var19 == 1) {
				var23--;
			}
			if (var19 == 2) {
				var22++;
				var23--;
			}
			if (var19 == 3) {
				var22--;
			}
			if (var19 == 4) {
				var22++;
			}
			if (var19 == 5) {
				var22--;
				var23++;
			}
			if (var19 == 6) {
				var23++;
			}
			if (var19 == 7) {
				var22++;
				var23++;
			}
			ReceivePlayerPositions.field733[arg1].field570 = (var21 << 28) + (var22 << 14) + var23;
			return false;
		} else {
			int var24 = arg0.method16863(18);
			int var25 = var24 >> 16;
			int var26 = var24 >> 8 & 0xFF;
			int var27 = var24 & 0xFF;
			int var28 = ReceivePlayerPositions.field733[arg1].field570;
			int var29 = (var28 >> 28) + var25 & 0x3;
			int var30 = (var28 >> 14) + var26 & 0xFF;
			int var31 = var27 + var28 & 0xFF;
			ReceivePlayerPositions.field733[arg1].field570 = (var29 << 28) + (var30 << 14) + var31;
			return false;
		}
	}

	@ObfuscatedName("lh.d(III)V")
	public static void method5718(int arg0, int arg1) {
		if (!field4825.field5159) {
			if (MiniMenu.field588 == 1) {
				return;
			}
			if (field6371 && MiniMenu.field588 == 2 && field2654.field10339.equals(LocalisedText.field6995.method12206(field2308))) {
				return;
			}
		}
		FontMetrics var2 = MiniMenu.method8078();
		int var3 = var2.method12418(LocalisedText.field6992.method12206(field2308));
		int var6;
		if (MiniMenu.field586) {
			for (class946 var7 = (class946) MiniMenu.field592.method11756(); var7 != null; var7 = (class946) MiniMenu.field592.method11744()) {
				int var8;
				if (var7.field10346 == 1) {
					var8 = MiniMenu.method5560((MiniMenuEntry) var7.field10345.field6662.field9552, var2);
				} else {
					var8 = MiniMenu.method1399(var7, var2);
				}
				if (var8 > var3) {
					var3 = var8;
				}
			}
			var3 += 8;
			var6 = MiniMenu.field594 * MiniMenu.field582 + 21;
			field611 = (MiniMenu.field613 ? 26 : 22) + MiniMenu.field594 * MiniMenu.field582;
		} else {
			for (MiniMenuEntry var4 = (MiniMenuEntry) MiniMenu.field595.method11563(); var4 != null; var4 = (MiniMenuEntry) MiniMenu.field595.method11567()) {
				int var5 = MiniMenu.method5560(var4, var2);
				if (var5 > var3) {
					var3 = var5;
				}
			}
			var3 += 8;
			var6 = MiniMenu.field588 * MiniMenu.field582 + 21;
			field611 = (MiniMenu.field613 ? 26 : 22) + MiniMenu.field588 * MiniMenu.field582;
		}
		var3 += 10;
		int var9 = arg0 - var3 / 2;
		if (var3 + var9 > field4125) {
			var9 = field4125 - var3;
		}
		if (var9 < 0) {
			var9 = 0;
		}
		int var10 = arg1;
		if (var6 + arg1 > field4677) {
			var10 = field4677 - var6;
		}
		if (var10 < 0) {
			var10 = 0;
		}
		field4756 = var9;
		field2325 = var10;
		field1571 = var3;
		MiniMenu.field615 = (int) (Math.random() * 24.0D);
		MiniMenu.field585 = true;
	}

	@ObfuscatedName("afd.g(Lnp;I)V")
	public static void method15704(class393 arg0) {
		if (arg0.field4188 == null) {
			arg0.field4179 = Integer.MIN_VALUE;
		} else {
			field4201.method16445(arg0.field4188);
		}
	}

	@ObfuscatedName("x.ag([BB)[B")
	public static final byte[] method1598(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.method15220();
		int var3 = var1.method15379();
		if (var3 < 0 || Js5.field3573 != 0 && var3 > Js5.field3573) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.method15263(var4, 0, var3);
			return var4;
		} else {
			int var5 = var1.method15379();
			if (var5 < 0 || Js5.field3573 != 0 && var5 > Js5.field3573) {
				throw new RuntimeException();
			}
			byte[] var6 = new byte[var5];
			if (var2 == 1) {
				class544.method11511(var6, var5, arg0, var3, 9);
			} else {
				GZip var7 = Js5.field3566;
				synchronized (Js5.field3566) {
					Js5.field3566.method12743(var1, var6);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("vl.n(Laet;IB)V")
	public static void method12450(Packet arg0, int arg1) {
		if (GameShell.field4155 == null) {
			return;
		}
		try {
			GameShell.field4155.method12109(0L);
			GameShell.field4155.method12102(arg0.field9629, arg1, 24);
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("pl.z(II)V")
	public static void method7906(int arg0) {
		field3537 = arg0;
		WeightedCache var1 = PlayerModel.field4998;
		synchronized (PlayerModel.field4998) {
			PlayerModel.field4998.method7922();
		}
		WeightedCache var3 = PlayerModel.field5012;
		synchronized (PlayerModel.field5012) {
			PlayerModel.field5012.method7922();
		}
	}

	@ObfuscatedName("oz.q(I)V")
	public static void method7573() {
		WeightedCache var0 = PlayerModel.field5012;
		synchronized (PlayerModel.field5012) {
			PlayerModel.field5012.method7925();
		}
		WeightedCache var2 = PlayerModel.field4998;
		synchronized (PlayerModel.field4998) {
			PlayerModel.field4998.method7925();
		}
	}

	@ObfuscatedName("ql.p(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZI)V")
	public static void method8140(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
		if (!MiniMenu.field585 && MiniMenu.field588 < 502) {
			int var14 = arg2 == -1 ? client.field9235 : arg2;
			MiniMenuEntry var15 = new MiniMenuEntry(arg0, arg1, var14, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			MiniMenu.method2494(var15);
		}
	}

	@ObfuscatedName("id.h(I)V")
	public static void method4591() {
		field1756 = new IfType[field1928.method5638()];
		field1834 = new boolean[field1928.method5638()];
	}

	@ObfuscatedName("wq.w(Lew;Lta;IIIILce;I)V")
	public static void method12552(ComType arg0, class11 arg1, int arg2, int arg3, int arg4, int arg5, Sprite arg6) {
		if (arg6 == null) {
			return;
		}
		int var7;
		if (field2671 == 5) {
			var7 = (int) client.field9021 & 0x3FFF;
		} else {
			var7 = client.field9087 + (int) client.field9021 & 0x3FFF;
		}
		int var8 = Math.max(arg0.field1863 / 2, arg0.field1929 / 2) + 10;
		int var9 = arg4 * arg4 + arg5 * arg5;
		if (var9 > var8 * var8) {
			return;
		}
		int var10 = Trig1.field3439[var7];
		int var11 = Trig1.field3447[var7];
		if (field2671 != 5) {
			var10 = var10 * 256 / (client.field8976 + 256);
			var11 = var11 * 256 / (client.field8976 + 256);
		}
		int var12 = arg4 * var11 + arg5 * var10 >> 14;
		int var13 = arg5 * var11 - arg4 * var10 >> 14;
		arg6.method1056(arg0.field1863 / 2 + arg2 + var12 - arg6.method1042() / 2, arg0.field1929 / 2 + arg3 - var13 - arg6.method1047() / 2, arg1, arg2, arg3);
	}

	@ObfuscatedName("ln.ax(B)Lnt;")
	public static GameShellEnvironment method5937() {
		return GameShell.field4148;
	}

	@ObfuscatedName("tc.ag(III)V")
	public static void method11384(int arg0, int arg1) {
		MiniMenu.field606 = arg0;
		MiniMenu.field607 = arg1;
	}

	@ObfuscatedName("u.ap(I)V")
	public static void method1237() {
		field501.method1935();
		field501.field832.field9626 = 0;
		field501.field840 = null;
		field501.field843 = null;
		field501.field844 = null;
		field501.field831 = null;
		field501.field835 = 0;
		field501.field837 = 0;
		client.field8935 = 0;
		MiniMenu.method11300();
		MiniMap.method1202();
		for (int var0 = 0; var0 < 2048; var0++) {
			client.field9070[var0] = null;
		}
		field2119 = null;
		for (int var1 = 0; var1 < client.field8966; var1++) {
			PathingEntity var2 = (PathingEntity) client.field8965[var1].field9550;
			if (var2 != null) {
				var2.field8624 = -1;
			}
		}
		ClientInvCache.method8048();
		field2671 = 4;
		field3308 = -1;
		field1941 = -1;
		client.method11307(1);
		for (int var3 = 0; var3 < 100; var3++) {
			client.field9204[var3] = true;
		}
		client.method15612();
		field3357 = null;
		field3307 = 0L;
		client.method7731();
	}

	@ObfuscatedName("j.ax(Lajs;I)Ljava/lang/String;")
	public static String method1246(MiniMenuEntry arg0) {
		return MiniMenu.field585 || arg0 == null ? "" : arg0.field10339;
	}

	@ObfuscatedName("fm.az(Lka;B)V")
	public static void method3626(Matrix4x4 arg0) {
		MiniMenu.field596.method5412(arg0);
	}

	@ObfuscatedName("eo.ah(Lajs;I)[I")
	public static int[] method3289(MiniMenuEntry arg0) {
		int[] var1 = null;
		if (MiniMenu.method5562(arg0.field10340)) {
			var1 = field3492.method12316((int) arg0.field10333).field7057;
		} else if (arg0.field10332 != -1) {
			var1 = field3492.method12316(arg0.field10332).field7057;
		} else if (MiniMenu.method8731(arg0.field10340)) {
			ObjectNode var2 = (ObjectNode) client.field8964.method11923((long) arg0.field10333);
			if (var2 != null) {
				NpcEntity var3 = (NpcEntity) var2.field9550;
				NPCType var4 = var3.field10075;
				if (var4.field7244 != null) {
					var4 = var4.method12516(field2669);
				}
				if (var4 != null) {
					var1 = var4.field7269;
				}
			}
		} else if (MiniMenu.method1676(arg0.field10340)) {
			LocType var5 = client.field8980.method6103().method11471((int) (arg0.field10333 >>> 32 & 0x7FFFFFFFL));
			if (var5.field6534 != null) {
				var5 = var5.method11431(field2669);
			}
			if (var5 != null) {
				var1 = var5.field6545;
			}
		}
		return var1;
	}

	@ObfuscatedName("age.au(IIIIIIILajs;Ll;Lvm;III)V")
	public static void method15995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, MiniMenuEntry arg7, FontType arg8, FontMetrics arg9, int arg10, int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field7176 - 1 && arg1 < arg9.field7177 + arg6 && arg7.field10336) {
			arg10 = arg11;
		}
		int[] var12 = method3289(arg7);
		String var13 = MiniMenu.method12186(arg7);
		if (var12 != null) {
			var13 = var13 + MiniMenu.method11875(var12);
		}
		arg8.method841(var13, arg2 + 3, arg6, arg10, 0, client.field9207, field2113, field383, field2187);
		if (arg7.field10337) {
			field6385.method2500(arg2 + 5 + arg9.method12418(var13), arg6 - arg9.field7176);
		}
	}

	@ObfuscatedName("eb.bv(Lajz;I)Ljava/lang/String;")
	public static String method3322(class946 arg0) {
		return arg0.field10344 + TextUtil.method3978(16777215) + " >";
	}

	@ObfuscatedName("z.bg(IB)Z")
	public static boolean method1367(int arg0) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
	}

	@ObfuscatedName("aar.bd(Lahg;ZI)V")
	public static void method13909(PlayerEntity arg0, boolean arg1) {
		if (MiniMenu.field588 >= 406) {
			return;
		}
		if (field2119 != arg0) {
			String var6;
			if (arg0.field10046 == 0) {
				boolean var2 = true;
				if (field2119.field10049 != -1 && arg0.field10049 != -1) {
					int var3 = field2119.field10049 < arg0.field10049 ? field2119.field10049 : arg0.field10049;
					int var4 = field2119.field10047 - arg0.field10047;
					if (var4 < 0) {
						var4 = -var4;
					}
					if (var4 > var3) {
						var2 = false;
					}
				}
				String var5 = client.field9163 == ModeGame.field6402 ? LocalisedText.field6998.method12206(field2308) : LocalisedText.field6996.method12206(field2308);
				if (arg0.field10047 >= arg0.field10048) {
					var6 = arg0.method16120(true) + (var2 ? MiniMenu.method2609(arg0.field10047, field2119.field10047) : TextUtil.method3978(16777215)) + TextUtil.field489 + var5 + arg0.field10047 + TextUtil.field487;
				} else {
					var6 = arg0.method16120(true) + (var2 ? MiniMenu.method2609(arg0.field10047, field2119.field10047) : TextUtil.method3978(16777215)) + TextUtil.field489 + var5 + arg0.field10047 + "+" + (arg0.field10048 - arg0.field10047) + TextUtil.field487;
				}
			} else if (arg0.field10046 == -1) {
				var6 = arg0.method16120(true);
			} else {
				var6 = arg0.method16120(true) + TextUtil.field489 + LocalisedText.field6988.method12206(field2308) + arg0.field10046 + TextUtil.field487;
			}
			if (client.field9117 && !arg1 && (field4822 & 0x8) != 0) {
				method8140(client.field9103, client.field9151 + " " + TextUtil.field491 + " " + TextUtil.method3978(16777215) + var6, field477, 15, -1, (long) arg0.field8593, 0, 0, true, false, (long) arg0.field8593, false);
			}
			if (arg1) {
				method8140(TextUtil.method3978(13421772) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long) arg0.field8593, false);
			} else {
				for (int var7 = 7; var7 >= 0; var7--) {
					if (client.field9085[var7] != null) {
						short var8 = 0;
						if (client.field9163 == ModeGame.field6407 && client.field9085[var7].equalsIgnoreCase(LocalisedText.field6991.method12206(field2308))) {
							if (client.field9176 && arg0.field10047 > field2119.field10047) {
								var8 = 2000;
							}
							if (field2119.field10061 == 0 || arg0.field10061 == 0) {
								if (arg0.field10067) {
									var8 = 2000;
								}
							} else if (field2119.field10061 == arg0.field10061) {
								var8 = 2000;
							} else {
								var8 = 0;
							}
						} else if (client.field9086[var7]) {
							var8 = 2000;
						}
						short var9 = (short) (client.field9083[var7] + var8);
						int var10 = client.field9084[var7] == -1 ? client.field9098 : client.field9084[var7];
						method8140(client.field9085[var7], TextUtil.method3978(16777215) + var6, var10, var9, -1, (long) arg0.field8593, 0, 0, true, false, (long) arg0.field8593, false);
					}
				}
			}
			if (!arg1) {
				for (MiniMenuEntry var11 = (MiniMenuEntry) MiniMenu.field595.method11563(); var11 != null; var11 = (MiniMenuEntry) MiniMenu.field595.method11567()) {
					if (var11.field10340 == 23) {
						var11.field10341 = TextUtil.method3978(16777215) + var6;
						break;
					}
				}
			}
		} else if (client.field9117 && (field4822 & 0x10) != 0) {
			method8140(client.field9103, client.field9151 + " " + TextUtil.field491 + " " + TextUtil.method3978(16777215) + LocalisedText.field7007.method12206(field2308), field477, 16, -1, 0L, 0, 0, true, false, (long) arg0.field8593, false);
		}
	}

	@ObfuscatedName("dm.ek(II)Z")
	public static boolean method2888(int arg0) {
		return arg0 == 12 || arg0 == 2 || arg0 == 10;
	}

	@ObfuscatedName("agw.bp(Lajs;III)V")
	public static void method15936(MiniMenuEntry arg0, int arg1, int arg2) {
		if (arg0 == null || MiniMenu.field595.field6647 == arg0) {
			return;
		}
		int var3 = arg0.field10329;
		int var4 = arg0.field10335;
		int var5 = arg0.field10340;
		int var6 = (int) arg0.field10333;
		long var7 = arg0.field10333;
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		CoordGrid var9 = client.field8980.method6214();
		if (var5 == 15) {
			PlayerEntity var10 = client.field9070[var6];
			if (var10 != null) {
				client.field9049 = arg1;
				client.field9032 = arg2;
				client.field9052 = 2;
				client.field9051 = 0;
				ClientMessage var11 = ClientMessage.method14781(ClientProt.field2955, client.field8975.field834);
				var11.field9467.method15278(client.field9102);
				var11.field9467.method15308(MiniMenu.method3496() ? 1 : 0);
				var11.field9467.method15223(field4166);
				var11.field9467.method15287(client.field9101);
				var11.field9467.method15293(var6);
				client.field8975.method1913(var11);
				client.method2677(var10.field8642[0], var10.field8643[0], true, class434.method11404(var10.field8642[0], var10.field8643[0], var10.method13954(), var10.method13954(), 0));
			}
		}
		if (var5 == 59) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 1;
			client.field9051 = 0;
			ClientMessage var12 = ClientMessage.method14781(ClientProt.field2948, client.field8975.field834);
			var12.field9467.method15279(client.field9102);
			var12.field9467.method15279(var9.field4838 + var4);
			var12.field9467.method15287(client.field9101);
			var12.field9467.method15287(var9.field4836 + var3);
			var12.field9467.method15223(field4166);
			client.field8975.method1913(var12);
			client.method2677(var3, var4, true, class434.method3645(var3, var4));
		}
		ClientProt var13 = null;
		if (var5 == 18) {
			var13 = ClientProt.field2900;
		} else if (var5 == 19) {
			var13 = ClientProt.field2883;
		} else if (var5 == 20) {
			var13 = ClientProt.field2911;
		} else if (var5 == 21) {
			var13 = ClientProt.field2876;
		} else if (var5 == 22) {
			var13 = ClientProt.field2872;
		} else if (var5 == 1004) {
			var13 = ClientProt.field2891;
		}
		if (var13 != null) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 2;
			client.field9051 = 0;
			ClientMessage var14 = ClientMessage.method14781(var13, client.field8975.field834);
			var14.field9467.method15308(MiniMenu.method3496() ? 1 : 0);
			var14.field9467.method15293(var9.field4838 + var4);
			var14.field9467.method15287(var9.field4836 + var3);
			var14.field9467.method15287(var6);
			client.field8975.method1913(var14);
			client.method12668(var3, var4);
		}
		if (var5 == 2) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 2;
			client.field9051 = 0;
			ClientMessage var15 = ClientMessage.method14781(ClientProt.field2905, client.field8975.field834);
			var15.field9467.method15278(var9.field4838 + var4);
			var15.field9467.method15279(var9.field4836 + var3);
			var15.field9467.method15287(client.field9102);
			var15.field9467.method15269(MiniMenu.method3496() ? 1 : 0);
			var15.field9467.method15223((int) (var7 >>> 32) & Integer.MAX_VALUE);
			var15.field9467.method15345(field4166);
			var15.field9467.method15279(client.field9101);
			client.field8975.method1913(var15);
			client.method5830(var3, var4, var7);
		}
		ClientProt var16 = null;
		if (var5 == 3) {
			var16 = ClientProt.field2889;
		} else if (var5 == 4) {
			var16 = ClientProt.field2851;
		} else if (var5 == 5) {
			var16 = ClientProt.field2865;
		} else if (var5 == 6) {
			var16 = ClientProt.field2934;
		} else if (var5 == 1001) {
			var16 = ClientProt.field2912;
		} else if (var5 == 1002) {
			var16 = ClientProt.field2863;
		}
		if (var16 != null) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 2;
			client.field9051 = 0;
			ClientMessage var17 = ClientMessage.method14781(var16, client.field8975.field834);
			var17.field9467.method15269(MiniMenu.method3496() ? 1 : 0);
			var17.field9467.method15279(var9.field4838 + var4);
			var17.field9467.method15345((int) (var7 >>> 32) & Integer.MAX_VALUE);
			var17.field9467.method15279(var9.field4836 + var3);
			client.field8975.method1913(var17);
			client.method5830(var3, var4, var7);
		}
		if (var5 == 30 && client.field9108 == null) {
			method11509(var4, var3);
			client.field9108 = ComType.method15145(var4, var3);
			if (client.field9108 != null) {
				client.method12939(client.field9108);
			}
		}
		if (var5 == 57 || var5 == 1007) {
			client.method5716(var6, var4, var3, arg0.field10334);
		}
		if (var5 == 23) {
			if (client.field9074 > 0 && method1314()) {
				method2617(field2119.field9807, var9.field4836 + var3, var9.field4838 + var4);
			} else {
				ClientMessage var18 = MiniMenu.method1910(var3, var4, var6);
				if (var6 == 1) {
					var18.field9467.method15308(-1);
					var18.field9467.method15308(-1);
					var18.field9467.method15287((int) client.field9021);
					var18.field9467.method15308(57);
					var18.field9467.method15308(client.field9087);
					var18.field9467.method15308(client.field8976);
					var18.field9467.method15308(89);
					Vector3 var19 = field2119.method8565().field3464;
					var18.field9467.method15287((int) var19.field3475);
					var18.field9467.method15287((int) var19.field3477);
					var18.field9467.method15308(63);
				} else {
					client.field9049 = arg1;
					client.field9032 = arg2;
					client.field9052 = 1;
					client.field9051 = 0;
				}
				client.field8975.method1913(var18);
				client.method2677(var3, var4, true, class434.method3645(var3, var4));
			}
		}
		if (var5 == 16) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 2;
			client.field9051 = 0;
			ClientMessage var20 = ClientMessage.method14781(ClientProt.field2955, client.field8975.field834);
			var20.field9467.method15278(client.field9102);
			var20.field9467.method15308(MiniMenu.method3496() ? 1 : 0);
			var20.field9467.method15223(field4166);
			var20.field9467.method15287(client.field9101);
			var20.field9467.method15293(field2119.field8593);
			client.field8975.method1913(var20);
		}
		if (var5 == 25) {
			ComType var21 = ComType.method15145(var4, var3);
			if (var21 != null) {
				client.method11223();
				ServerKeyProperties var22 = client.method14331(var21);
				method11974(var21, var22.method14928(), var22.field9423);
				client.field9103 = client.method14722(var21);
				if (client.field9103 == null) {
					client.field9103 = "Null";
				}
				client.field9151 = var21.field1795 + TextUtil.method3978(16777215);
			}
			return;
		}
		if (var5 == 17) {
			client.field9049 = arg1;
			client.field9032 = arg2;
			client.field9052 = 2;
			client.field9051 = 0;
			ClientMessage var23 = ClientMessage.method14781(ClientProt.field2874, client.field8975.field834);
			var23.field9467.method15279(var9.field4838 + var4);
			var23.field9467.method15223(field4166);
			var23.field9467.method15278(client.field9101);
			var23.field9467.method15279(var6);
			var23.field9467.method15278(client.field9102);
			var23.field9467.method15287(var9.field4836 + var3);
			var23.field9467.method15318(MiniMenu.method3496() ? 1 : 0);
			client.field8975.method1913(var23);
			client.method12668(var3, var4);
		}
		if (var5 == 60) {
			if (client.field9074 > 0 && method1314()) {
				method2617(field2119.field9807, var9.field4836 + var3, var9.field4838 + var4);
			} else {
				client.field9049 = arg1;
				client.field9032 = arg2;
				client.field9052 = 1;
				client.field9051 = 0;
				ClientMessage var24 = ClientMessage.method14781(ClientProt.field2897, client.field8975.field834);
				var24.field9467.method15279(var9.field4836 + var3);
				var24.field9467.method15279(var9.field4838 + var4);
				client.field8975.method1913(var24);
			}
		}
		ClientProt var25 = null;
		if (var5 == 44) {
			var25 = ClientProt.field2916;
		} else if (var5 == 45) {
			var25 = ClientProt.field2928;
		} else if (var5 == 46) {
			var25 = ClientProt.field2899;
		} else if (var5 == 47) {
			var25 = ClientProt.field2866;
		} else if (var5 == 48) {
			var25 = ClientProt.field2907;
		} else if (var5 == 49) {
			var25 = ClientProt.field2885;
		} else if (var5 == 50) {
			var25 = ClientProt.field2884;
		} else if (var5 == 51) {
			var25 = ClientProt.field2904;
		} else if (var5 == 52) {
			var25 = ClientProt.field2902;
		} else if (var5 == 53) {
			var25 = ClientProt.field2895;
		}
		if (var25 != null) {
			PlayerEntity var26 = client.field9070[var6];
			if (var26 != null) {
				client.field9049 = arg1;
				client.field9032 = arg2;
				client.field9052 = 2;
				client.field9051 = 0;
				ClientMessage var27 = ClientMessage.method14781(var25, client.field8975.field834);
				var27.field9467.method15279(var6);
				var27.field9467.method15308(MiniMenu.method3496() ? 1 : 0);
				client.field8975.method1913(var27);
				client.method2677(var26.field8642[0], var26.field8643[0], true, class434.method11404(var26.field8642[0], var26.field8643[0], var26.method13954(), var26.method13954(), 0));
			}
		}
		if (var5 == 8) {
			ObjectNode var28 = (ObjectNode) client.field8964.method11923((long) var6);
			if (var28 != null) {
				NpcEntity var29 = (NpcEntity) var28.field9550;
				client.field9049 = arg1;
				client.field9032 = arg2;
				client.field9052 = 2;
				client.field9051 = 0;
				ClientMessage var30 = ClientMessage.method14781(ClientProt.field2855, client.field8975.field834);
				var30.field9467.method15279(var6);
				var30.field9467.method15397(field4166);
				var30.field9467.method15278(client.field9102);
				var30.field9467.method15287(client.field9101);
				var30.field9467.method15318(MiniMenu.method3496() ? 1 : 0);
				client.field8975.method1913(var30);
				client.method2677(var29.field8642[0], var29.field8643[0], true, class434.method11404(var29.field8642[0], var29.field8643[0], var29.method13954(), var29.method13954(), 0));
			}
		}
		ClientProt var31 = null;
		if (var5 == 9) {
			var31 = ClientProt.field2921;
		} else if (var5 == 10) {
			var31 = ClientProt.field2903;
		} else if (var5 == 11) {
			var31 = ClientProt.field2938;
		} else if (var5 == 12) {
			var31 = ClientProt.field2937;
		} else if (var5 == 13) {
			var31 = ClientProt.field2945;
		} else if (var5 == 1003) {
			var31 = ClientProt.field2909;
		}
		if (var31 != null) {
			ObjectNode var32 = (ObjectNode) client.field8964.method11923((long) var6);
			if (var32 != null) {
				NpcEntity var33 = (NpcEntity) var32.field9550;
				client.field9049 = arg1;
				client.field9032 = arg2;
				client.field9052 = 2;
				client.field9051 = 0;
				ClientMessage var34 = ClientMessage.method14781(var31, client.field8975.field834);
				var34.field9467.method15293(var6);
				var34.field9467.method15308(MiniMenu.method3496() ? 1 : 0);
				client.field8975.method1913(var34);
				client.method2677(var33.field8642[0], var33.field8643[0], true, class434.method11404(var33.field8642[0], var33.field8643[0], var33.method13954(), var33.method13954(), 0));
			}
		}
		if (var5 == 58) {
			ComType var35 = ComType.method15145(var4, var3);
			if (var35 != null) {
				client.method14206(var35);
			}
		}
		if (var5 == 1008 || var5 == 1009 || var5 == 1010 || var5 == 1011 || var5 == 1012) {
			ClientWorldMap.method13878(var5, var6, var3);
		}
		if (client.field9117) {
			client.method11223();
		}
		if (field9471 != null && client.field9053 == 0) {
			client.method12939(field9471);
		}
	}

	@ObfuscatedName("lb.fg(IZI)V")
	public static void method5600(int arg0, boolean arg1) {
		client.method4567(arg0, LocalisedText.field6938.method12206(field2308), arg1);
	}

	@ObfuscatedName("pf.gc(II)V")
	public static void method7913(int arg0) {
		if (field4961.field9640.method15908() == 0) {
			arg0 = -1;
		}
		if (client.field9018 == arg0) {
			return;
		}
		if (arg0 != -1) {
			CursorType var1 = field3770.method12378(arg0);
			SpriteData var2 = var1.method12363();
			if (var2 == null) {
				arg0 = -1;
			} else {
				field4133.setcustomcursor(field1231, var2.method2735(true), var2.method2762(), var2.method2728(), new Point(var1.field7163, var1.field7165));
				client.field9018 = arg0;
			}
		}
		if (arg0 == -1 && client.field9018 != -1) {
			field4133.setcustomcursor(field1231, null, -1, -1, new Point());
			client.field9018 = -1;
		}
	}

	@ObfuscatedName("ay.ge(I)V")
	public static final void method1681() {
		client.method7731();
		client.field8980.method6110();
		for (int var0 = 0; var0 < client.field8936.length; var0++) {
			client.field8936[var0] = null;
		}
		for (int var1 = 0; var1 < client.field9044.length; var1++) {
			client.field9044[var1] = null;
		}
		ReceivePlayerPositions.method15786();
		for (int var2 = 0; var2 < 2048; var2++) {
			client.field9070[var2] = null;
		}
		client.field9104 = 0;
		client.field8964.method11925();
		client.field8966 = 0;
		client.field9088.method11925();
		client.method14029();
		client.field9023 = 0;
		field2669.method1647();
		field913 = null;
		field2972 = null;
		field1515 = null;
		field8458 = null;
		field3357 = null;
		field3307 = 0L;
		MiniMenu.method3561();
		MiniMenu.method1401();
	}

	@ObfuscatedName("lh.gl(I)V")
	public static final void method5715() {
		field3615.method8502();
		field4450.method11899();
		field7650.method3917();
		client.field8980.method6103().method11477();
		field3774.method12555();
		field3492.method12300();
		field566.method11148();
		field4213.method11087();
		field4645.method7662();
		field6667.method4883();
		field1510.method12010();
		field7196.method11313();
		field7390.method12672();
		field1202.method8293();
		field3769.method7776();
		field850.method12494();
		field8499.method7866();
		field4464.method12597();
		field4678.method7364();
		field6360.method3600();
		field785.method12456();
		field3770.method12374();
		field5037.method7819();
		field6705.method7331();
		method7573();
		ComType.method4114();
		field6784.method4842();
		HintArrow.method5713();
		class48.method6026();
		client.field9131.method7925();
		MiniMenu.field620.method7925();
		ScriptRunner.field5207.method7925();
	}

	@ObfuscatedName("nk.gs(I)V")
	public static final void method6848() {
		if (client.field8935 > 1) {
			client.field8935--;
			client.field9120 = client.field9132;
		}
		if (client.field8975.field846) {
			client.field8975.field846 = false;
			client.method8047();
			return;
		}
		if (!MiniMenu.field585) {
			MiniMenu.method1401();
		}
		for (int var0 = 0; var0 < 100 && client.method4610(client.field8975); var0++) {
		}
		if (client.field8923 != 1) {
			return;
		}
		while (class590.method3320()) {
			ClientMessage var1 = ClientMessage.method14781(ClientProt.field2943, client.field8975.field834);
			var1.field9467.method15308(0);
			int var2 = var1.field9467.field9626;
			class590.method5552(var1.field9467);
			var1.field9467.method15251(var1.field9467.field9626 - var2);
			client.field8975.method1913(var1);
		}
		if (field3357 == null) {
			if (MonotonicTime.method5554() >= field3307) {
				field3357 = client.field9192.method8637(field6772.field6765);
			}
		} else if (field3357.field5178 != -1) {
			ClientMessage var3 = ClientMessage.method14781(ClientProt.field2933, client.field8975.field834);
			if (field5168 == null || !field5168.isValid()) {
				try {
					Iterator var4 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (var4.hasNext()) {
						GarbageCollectorMXBean var5 = (GarbageCollectorMXBean) var4.next();
						if (var5.isValid()) {
							field5168 = var5;
							client.field9124 = -1L;
							client.field9106 = -1L;
						}
					}
				} catch (Throwable var46) {
				}
			}
			long var7 = MonotonicTime.method5554();
			int var9 = -1;
			if (field5168 != null) {
				long var10 = field5168.getCollectionTime();
				if (client.field9106 != -1L) {
					long var12 = var10 - client.field9106;
					long var14 = var7 - client.field9124;
					if (var14 != 0L) {
						var9 = (int) (var12 * 100L / var14);
					}
				}
				client.field9106 = var10;
				client.field9124 = var7;
			}
			var3.field9467.method15308(client.field4121);
			var3.field9467.method15308(var9);
			var3.field9467.method15278(field3357.field5178);
			client.field8975.method1913(var3);
			field3357 = null;
			field3307 = var7 + 30000L;
		}
		class477.method2676();
		class558.method4786();
		BasicMouseEvent var16 = (BasicMouseEvent) client.field9136.method11563();
		if (client.field8980.method6098() != null) {
			if (field2671 == 3) {
				client.method11197();
			} else if (field2671 == 1) {
				client.method6648();
			}
		}
		if (client.field9016) {
			client.field9016 = false;
		} else {
			client.field8990 /= 2.0F;
		}
		if (client.field8913) {
			client.field8913 = false;
		} else {
			client.field9022 /= 2.0F;
		}
		if (CameraManager.method14782()) {
			CameraManager.method3312();
		} else {
			try {
				if (field2671 != 2) {
					field1307.method3691(CameraControlMode.field2203);
					if (field1307.method3699() == null) {
						field1307.method3693(PositionMode.field2192, false);
					}
					if (field1307.method3716() == null) {
						field1307.method3692(LookatMode.field2167, false);
					}
					if (field1307.method3719() != PositionMode.field2192) {
						field1307.method3693(PositionMode.field2192, false);
					}
					field1307.method3771(Vector3.method5294(99999.0F, 99999.0F, 99999.0F));
					field1307.method3755(Vector3.method5294(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
					PositionPoint var17 = (PositionPoint) field1307.method3699();
					CoordGrid var18 = client.field8980.method6214();
					var17.method14091(CoordFine.method8611(field7324, field6769 + var18.field4836 * 512, -field8423, field8424 + var18.field4838 * 512));
					if (field1307.method3751() != LookatMode.field2167) {
						field1307.method3692(LookatMode.field2167, false);
					}
					field1307.method3700(Vector3.method5294(99999.0F, 99999.0F, 99999.0F));
					field1307.method3698(Vector3.method5294(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
					LookatPoint var19 = (LookatPoint) field1307.method3716();
					var19.method15915(field2119.method3684());
				}
				field1307.method3727((float) (MonotonicTime.method5554() - field2633) / 1000.0F, client.field8980.method6101(field7324), client.field8980.method6157().field3697);
				field2633 = MonotonicTime.method5554();
			} catch (CameraException var45) {
			}
		}
		client.method11396();
		if (client.field8923 != 1) {
			return;
		}
		client.field8980.method6139().method8144(client.field8980);
		class770.method3590();
		class395.method1677();
		if (client.field9017 > 10) {
			client.field8975.field837++;
		}
		if (client.field8975.field837 > 2250) {
			client.method8047();
			return;
		}
		if (client.field8988 == 2) {
			client.method3678();
			client.method11154();
		} else if (field2190.field5132.method7884(var16, client.field9072, client.field8953, field2131)) {
			CutsceneManager.method14961(false);
		} else {
			if (client.field8988 == 4 && CutsceneManager.method2467(client.field9059)) {
				client.field8980.method6135(new RebuildRequest(RebuildType.field3839, null));
				client.field8988 = 3;
			}
			if (client.field8988 == 3 && client.field8923 != 16) {
				CutsceneManager.field1529.method11925();
				client.field8988 = 0;
				client.field8906 = client.field9213;
				client.field9029 = 0;
				CutsceneManager.method1383();
			}
			if (client.field8988 == 0) {
				int var21 = client.field9213 - client.field8906;
				if (client.field9029 < field6396.length) {
					do {
						CutsceneAction var22 = field6396[client.field9029];
						if (var22.field1566 > var21) {
							break;
						}
						var22.method2873();
					} while (client.field8988 == 0 && ++client.field9029 < field6396.length);
				}
				if (client.field8988 == 0) {
					for (int var23 = 0; var23 < field1537.length; var23++) {
						CutsceneEntity var24 = field1537[var23];
						if (var24.field1563) {
							PathingEntity var25 = var24.method2854();
							client.method7985(var25, true);
						}
					}
				}
			}
		}
		client.method14780();
		client.method12652();
		client.method8601();
		client.field8931++;
		if (client.field9052 != 0) {
			client.field9051 = client.field9051 * 400 + 400;
			if (client.field9051 * 20 >= 400) {
				client.field9052 = 0;
			}
		}
		if (field9471 != null) {
			client.field9053++;
			if (client.field9053 >= 15) {
				client.method12939(field9471);
				field9471 = null;
			}
		}
		client.field9119 = null;
		client.field9080 = false;
		client.field9037 = false;
		field4960 = null;
		MiniMenu.method4560(null, -1, -1);
		if (!client.field9117) {
			client.field9235 = -1;
		}
		client.method4782();
		client.field9132++;
		if (client.field9041) {
			ClientMessage var26 = ClientMessage.method14781(ClientProt.field2942, client.field8975.field834);
			var26.field9467.method15345(field669 << 28 | field9405 << 14 | field6665);
			client.field8975.method1913(var26);
			client.field9041 = false;
		}
		while (true) {
			HookRequest var27;
			ComType var28;
			ComType var29;
			do {
				var27 = (HookRequest) client.field9159.method11560();
				if (var27 == null) {
					while (true) {
						HookRequest var30;
						ComType var31;
						ComType var32;
						do {
							var30 = (HookRequest) client.field9125.method11560();
							if (var30 == null) {
								while (true) {
									HookRequest var33;
									ComType var34;
									ComType var35;
									do {
										var33 = (HookRequest) client.field9089.method11560();
										if (var33 == null) {
											if (field4960 == null) {
												client.field9150 = 0;
											}
											if (client.field9115 != null) {
												client.method7350();
											}
											MiniMenu.method3534();
											if (client.field9074 > 0 && field2131.method7243(82) && field2131.method7243(81) && client.field9002 != 0) {
												int var36 = field2119.field9807 - client.field9002;
												if (var36 < 0) {
													var36 = 0;
												} else if (var36 > 3) {
													var36 = 3;
												}
												CoordGrid var37 = client.field8980.method6214();
												method2617(var36, var37.field4836 + field2119.field8642[0], var37.field4838 + field2119.field8643[0]);
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = client.field9110[var38]++;
											}
											if (client.field9156 && client.field9157 < MonotonicTime.method5554() - 60000L) {
												client.method831();
											}
											for (TimestampMessage var39 = (TimestampMessage) client.field8934.method11649(); var39 != null; var39 = (TimestampMessage) client.field8934.method11644()) {
												if ((long) var39.field9262 < MonotonicTime.method5554() / 1000L - 5L) {
													if (var39.field9264 > 0) {
														ChatHistory.method3943(5, 0, "", "", "", var39.field9263 + LocalisedText.field6986.method12206(field2308));
													}
													if (var39.field9264 == 0) {
														ChatHistory.method3943(5, 0, "", "", "", var39.field9263 + LocalisedText.field6987.method12206(field2308));
													}
													var39.method6975();
												}
											}
											client.field9174++;
											if (client.field9174 > 506) {
												client.field9174 = 0;
												int var40 = (int) (Math.random() * 8.0D);
												if ((var40 & 0x1) == 1) {
													client.field9050 += client.field9005 * -2;
												}
												if ((var40 & 0x2) == 2) {
													client.field9006 += client.field9100 * 2;
												}
												if ((var40 & 0x4) == 4) {
													client.field9008 += client.field9009;
												}
											}
											if (client.field9050 < -54) {
												client.field9005 = -105766596;
											}
											if (client.field9050 > 54) {
												client.field9005 = 105766596;
											}
											if (client.field9006 < -59) {
												client.field9100 = 574862020;
											}
											if (client.field9006 > 57) {
												client.field9100 = -574862020;
											}
											if (client.field9008 < -44) {
												client.field9009 = 1;
											}
											if (client.field9008 > 43) {
												client.field9009 = -1;
											}
											client.field9122++;
											if (client.field9122 > 502) {
												client.field9122 = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x1) == 1) {
													client.field9087 += client.field9012 * 2;
												}
												if ((var41 & 0x2) == 2) {
													client.field8976 += client.field9014;
												}
											}
											if (client.field9087 < -61) {
												client.field9012 = -1235639024;
											}
											if (client.field9087 > 62) {
												client.field9012 = 1235639024;
											}
											if (client.field8976 < -20) {
												client.field9014 = 1;
											}
											if (client.field8976 > 12) {
												client.field9014 = -1;
											}
											client.field8975.field839++;
											if (client.field8975.field839 > 50) {
												ClientMessage var42 = ClientMessage.method14781(ClientProt.field2873, client.field8975.field834);
												client.field8975.method1913(var42);
											}
											if (client.field8978) {
												client.method1970();
												client.field8978 = false;
											}
											try {
												client.field8975.method1912();
											} catch (IOException var44) {
												client.method8047();
											}
											return;
										}
										var34 = var33.field9609;
										if (var34.field1765 < 0) {
											break;
										}
										var35 = ComType.method11381(var34.field1886);
									} while (var35 == null || var35.field1915 == null || var34.field1765 >= var35.field1915.length || var35.field1915[var34.field1765] != var34);
									ScriptRunner.method8605(var33);
								}
							}
							var31 = var30.field9609;
							if (var31.field1765 < 0) {
								break;
							}
							var32 = ComType.method11381(var31.field1886);
						} while (var32 == null || var32.field1915 == null || var31.field1765 >= var32.field1915.length || var32.field1915[var31.field1765] != var31);
						ScriptRunner.method8605(var30);
					}
				}
				var28 = var27.field9609;
				if (var28.field1765 < 0) {
					break;
				}
				var29 = ComType.method11381(var28.field1886);
			} while (var29 == null || var29.field1915 == null || var28.field1765 >= var29.field1915.length || var29.field1915[var28.field1765] != var28);
			ScriptRunner.method8605(var27);
		}
	}

	@ObfuscatedName("dp.gg(IIII)V")
	public static final void method2617(int arg0, int arg1, int arg2) {
		String var3 = "tele " + arg0 + TextUtil.field488 + (arg1 >> 6) + TextUtil.field488 + (arg2 >> 6) + TextUtil.field488 + (arg1 & 0x3F) + TextUtil.field488 + (arg2 & 0x3F);
		System.out.println(var3);
		class62.method7065(var3, true, false);
	}

	@ObfuscatedName("abh.gv(II)V")
	public static final void method14216(int arg0) {
		int var1 = client.field9213 - client.field9185;
		if (var1 >= 100) {
			field2671 = 4;
			field3308 = -1;
			field1941 = -1;
			return;
		}
		int var2 = (int) client.field9171;
		if (client.field9173 >> 8 > var2) {
			var2 = client.field9173 >> 8;
		}
		if (client.field9057[4] && client.field9190[4] + 128 > var2) {
			var2 = client.field9190[4] + 128;
		}
		int var3 = client.field9008 + (int) client.field9021 & 0x3FFF;
		Vector3 var4 = field2119.method8565().field3464;
		client.method7768(field2297, client.method8663((int) var4.field3475, (int) var4.field3477, field7324) - client.field9027, field6818, var2, var3, (var2 >> 3) * 3 + 600 << 2, arg0);
		float var5 = 1.0F - (float) ((100 - var1) * (100 - var1) * (100 - var1)) / 1000000.0F;
		field6769 = (int) ((float) (field6769 - field6412) * var5 + (float) field6412);
		field8423 = (int) ((float) (field8423 - field2632) * var5 + (float) field2632);
		field8424 = (int) ((float) (field8424 - field3493) * var5 + (float) field3493);
		field2328 = (int) ((float) (field2328 - field6692) * var5 + (float) field6692);
		int var6 = field664 - field7298;
		if (var6 > 8192) {
			var6 -= 16384;
		} else if (var6 < -8192) {
			var6 += 16384;
		}
		field664 = (int) ((float) var6 * var5 + (float) field7298);
		field664 &= 0x3FFF;
	}

	@ObfuscatedName("vk.hy(I)V")
	public static final void method12381() {
		if (!client.field9016) {
			client.field8990 += (12.0F - client.field8990) / 2.0F;
			client.field9028 = true;
			client.field9016 = true;
		}
	}

	@ObfuscatedName("aax.y(Lrn;B)V")
	public static final void method14037(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] != arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("rg.as(Lrn;B)V")
	public static final void method8720(ClientScriptState arg0) {
		if (arg0.field5221 == 0) {
			return;
		}
		class499 var1 = arg0.field5225[--arg0.field5221];
		arg0.field5218 = var1.field5191;
		arg0.field5214 = arg0.field5218.field10378;
		arg0.field5227 = arg0.field5218.field10385;
		arg0.field5236 = var1.field5189;
		arg0.field5235 = var1.field5188;
		arg0.field5211 = var1.field5190;
		arg0.field5212 = var1.field5192;
	}

	@ObfuscatedName("po.ao(Lrn;I)V")
	public static final void method7814(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		field2669.method1644(var1, arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("py.ad(Lrn;B)V")
	public static final void method7981(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5230 -= var1;
		String var2 = StringTools.method3527(arg0.field5222, arg0.field5230, var1);
		arg0.field5222[++arg0.field5230 - 1] = var2;
	}

	@ObfuscatedName("fd.hp(Laay;I)I")
	public static final int method3510(PathingEntity arg0) {
		if (arg0.field8636 == 0) {
			return 0;
		}
		if (arg0.field8624 != -1) {
			PathingEntity var1 = null;
			if (arg0.field8624 < 32768) {
				ObjectNode var2 = (ObjectNode) client.field8964.method11923((long) arg0.field8624);
				if (var2 != null) {
					var1 = (PathingEntity) var2.field9550;
				}
			} else if (arg0.field8624 >= 32768) {
				var1 = client.field9070[arg0.field8624 - 32768];
			}
			if (var1 != null) {
				Vector3 var3 = Vector3.method5377(arg0.method8565().field3464, var1.method8565().field3464);
				int var4 = (int) var3.field3475;
				int var5 = (int) var3.field3477;
				if (var4 != 0 || var5 != 0) {
					arg0.method14013((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof PlayerEntity) {
			PlayerEntity var6 = (PlayerEntity) arg0;
			if (var6.field10058 != -1 && (var6.field8628 == 0 || var6.field8648 > 0)) {
				var6.method14013(var6.field10058);
				var6.field10058 = -1;
			}
		} else if (arg0 instanceof NpcEntity) {
			NpcEntity var7 = (NpcEntity) arg0;
			if (var7.field10080 != -1 && (var7.field8628 == 0 || var7.field8648 > 0)) {
				Vector3 var8 = var7.method8565().field3464;
				CoordGrid var9 = client.field8980.method6214();
				int var10 = (int) var8.field3475 - (var7.field10080 * 256 - var9.field4836 * 256 - var9.field4836 * 256);
				int var11 = (int) var8.field3477 - (var7.field10070 * 256 - var9.field4838 * 256 - var9.field4838 * 256);
				if (var10 != 0 || var11 != 0) {
					var7.method14013((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
				}
				var7.field10080 = -1;
			}
		}
		return arg0.method13947();
	}

	@ObfuscatedName("jm.bq(Lrn;I)V")
	public static final void method4729(ClientScriptState arg0) {
		IterableMap var1 = arg0.field5218.field10383[arg0.field5227[arg0.field5236]];
		IntNode var2 = (IntNode) var1.method11923((long) arg0.field5215[--arg0.field5216]);
		if (var2 != null) {
			arg0.field5236 += var2.field9556;
		}
	}

	@ObfuscatedName("jw.bz(Lrn;I)V")
	public static final void method4893(ClientScriptState arg0) {
		arg0.field5219[++arg0.field5220 - 1] = arg0.field5218.field10381[arg0.field5236];
	}

	@ObfuscatedName("da.bg(Lrn;I)V")
	public static final void method2820(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] == arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("pu.bd(Lrn;I)V")
	public static final void method7988(ClientScriptState arg0) {
		if (arg0.field5215[--arg0.field5216] == 0) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("tj.bm(Lrn;I)V")
	public static final void method11851(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		class474 var2 = field1202.method8290(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Integer var3 = arg0.field5226.method4080(client.field9163.field6408 << 16 | var2.field5033, var2.field5035, var2.field5034);
		int var4;
		if (var3 == null) {
			var4 = 0;
		} else {
			var4 = var3;
		}
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("tu.hi(Laay;I)V")
	public static final void method11843(PathingEntity arg0) {
		EntityWalkAnimationNode var1 = arg0.field8616;
		if (var1.method11767() && var1.method11787(1) && var1.method11784()) {
			if (var1.field9899) {
				var1.method11773(arg0.method13959().method7748(), false, true);
				var1.field9899 = var1.method11767();
			}
			var1.method11785();
		}
		for (int var2 = 0; var2 < arg0.field8641.length; var2++) {
			if (arg0.field8641[var2].field1204 != -1) {
				AnimationNode var3 = arg0.field8641[var2].field1203;
				if (var3.method11776()) {
					EffectAnimType var4 = field4213.method11082(arg0.field8641[var2].field1204);
					SeqType var5 = var3.method11804();
					if (var4.field5264) {
						if (var5.field6323 == 3) {
							if (arg0.field8646 > 0 && arg0.field8649 <= client.field9213 && arg0.field8620 < client.field9213) {
								var3.method11769(-1);
								arg0.field8641[var2].field1204 = -1;
								continue;
							}
						} else if (var5.field6323 == 1 && arg0.field8646 > 0 && arg0.field8649 <= client.field9213 && arg0.field8620 < client.field9213) {
							continue;
						}
					}
				}
				if (var3.method11787(1) && var3.method11784()) {
					var3.method11769(-1);
					arg0.field8641[var2].field1204 = -1;
				}
			}
		}
		AnimationNode var6 = arg0.field8597;
		if (var6.method11767()) {
			label84: {
				SeqType var7 = var6.method11804();
				if (var7.field6323 == 3) {
					if (arg0.field8646 > 0 && arg0.field8649 <= client.field9213 && arg0.field8620 < client.field9213) {
						arg0.field8615 = null;
						var6.method11769(-1);
						break label84;
					}
				} else if (var7.field6323 == 1) {
					if (arg0.field8646 > 0 && arg0.field8649 <= client.field9213 && arg0.field8620 < client.field9213) {
						var6.method11791(1);
						break label84;
					}
					var6.method11791(0);
				}
				if (var6.method11787(1) && var6.method11784()) {
					arg0.field8615 = null;
					var6.method11769(-1);
				}
			}
		}
		for (int var8 = 0; var8 < arg0.field8633.length; var8++) {
			UnknownEntityAnimationNode var9 = arg0.field8633[var8];
			if (var9 != null) {
				if (var9.field10516 > 0) {
					var9.field10516--;
				} else if (var9.method11787(1) && var9.method11784()) {
					arg0.field8633[var8] = null;
				}
			}
		}
	}

	@ObfuscatedName("ajk.cl(ZLrn;I)V")
	public static final void method16642(boolean arg0, ClientScriptState arg1) {
		int var2 = arg1.field5215[--arg1.field5216];
		ComType var3 = ComType.method11381(var2);
		IfType var4 = field1756[var2 >> 16];
		if (arg0) {
			ScriptRunner.method2840(var4, var3);
		} else {
			ScriptRunner.method15937(var4, var3);
		}
	}

	@ObfuscatedName("ge.cm(Lew;Lrn;B)V")
	public static final void method3983(ComType arg0, ClientScriptState arg1) {
		if (client.method14331(arg0).method14927() && client.field9108 == null) {
			method11509(arg0.field1764, arg0.field1765);
			client.field9108 = ComType.method15145(arg0.field1764, arg0.field1765);
			client.method12939(client.field9108);
		}
	}

	@ObfuscatedName("sj.ip(Lahg;IIB)V")
	public static void method11308(PlayerEntity arg0, int arg1, int arg2) {
		int[] var3 = new int[MoveSpeed.method2553().length];
		Arrays.fill(var3, 0, var3.length, arg1);
		client.method8263(arg0, var3, arg2, false);
	}

	@ObfuscatedName("ln.dp(Lrn;I)V")
	public static final void method5938(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method7912(var2, var3, arg0);
	}

	@ObfuscatedName("aey.di(Lew;Lej;Lrn;B)V")
	public static final void method15567(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1741 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("sq.ih(IIIIZI)V")
	public static final void method11240(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		int var5 = arg3 - 334;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 > 100) {
			var5 = 100;
		}
		int var6 = (client.field9194 - client.field8904) * var5 / 100 + client.field8904;
		int var7 = arg3 * var6 * 512 / (arg2 * 334);
		if (var7 < client.field9199) {
			short var8 = client.field9199;
			var6 = arg2 * var8 * 334 / (arg3 * 512);
			if (var6 > client.field9188) {
				var6 = client.field9188;
				int var9 = arg3 * var6 * 512 / (var8 * 334);
				int var10 = (arg2 - var9) / 2;
				if (arg4) {
					field5187.method753();
					field5187.method496(arg0, arg1, var10, arg3, -16777216);
					field5187.method496(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
				}
				arg0 += var10;
				arg2 -= var10 * 2;
			}
		} else if (var7 > client.field9200) {
			short var11 = client.field9200;
			var6 = arg2 * var11 * 334 / (arg3 * 512);
			if (var6 < client.field9197) {
				var6 = client.field9197;
				int var12 = arg2 * var11 * 334 / (var6 * 512);
				int var13 = (arg3 - var12) / 2;
				if (arg4) {
					field5187.method753();
					field5187.method496(arg0, arg1, arg2, var13, -16777216);
					field5187.method496(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
				}
				arg1 += var13;
				arg3 -= var13 * 2;
			}
		}
		client.field9205 = arg3 * var6 / 334;
		client.field9201 = arg0;
		client.field9202 = arg1;
		client.field9025 = (short) arg2;
		client.field9168 = (short) arg3;
	}

	@ObfuscatedName("gq.dh(Lrn;I)V")
	public static final void method3922(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method3060(var2, var3, arg0);
	}

	@ObfuscatedName("ol.ig(S)V")
	public static final void method7076() {
		int var0 = field4961.field9655.method15735();
		if (var0 == 0) {
			client.field8980.method6107(null);
			client.method8389(0);
		} else if (var0 == 1) {
			client.method6987((byte) 0);
			client.method8389(512);
			if (client.field8980.method6098() != null) {
				client.method3096();
			}
		} else {
			client.method6987((byte) (client.field9042 - 4 & 0xFF));
			client.method8389(2);
		}
		client.field9210 = field7324;
	}

	@ObfuscatedName("dr.df(Lrn;B)V")
	public static final void method2823(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method6308(var2, var3, arg0);
	}

	@ObfuscatedName("pb.ee(Lrn;B)V")
	public static final void method7831(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method4103(var2, var3, arg0);
	}

	@ObfuscatedName("rj.ea(Lrn;B)V")
	public static final void method8597(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method3463(var2, var3, arg0);
	}

	@ObfuscatedName("qv.fp(Lrn;I)V")
	public static final void method8303(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method2787(var2, var3, arg0);
	}

	@ObfuscatedName("pd.fv(Lrn;I)V")
	public static final void method7676(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method2787(var2, var3, arg0);
	}

	@ObfuscatedName("ig.fy(Lrn;B)V")
	public static final void method4555(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method1626(var2, var3, arg0);
	}

	@ObfuscatedName("yu.fg(Lew;Lej;Lrn;B)V")
	public static final void method12994(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1804 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("nh.fb(Lrn;B)V")
	public static final void method6876(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method2604(var2, var3, arg0);
	}

	@ObfuscatedName("zl.fe(Lrn;B)V")
	public static final void method13893(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method8485(var2, var3, arg0);
	}

	@ObfuscatedName("pk.gz(Lew;Lej;Lrn;S)V")
	public static final void method7967(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		int var3 = arg2.field5215[arg2.field5216];
		int var4 = arg2.field5215[arg2.field5216 + 1];
		ParamType var5 = field4464.method12600(var3);
		if (var5.field7287 == var4) {
			arg0.method3129(var3);
		} else {
			arg0.method3127(var3, var4);
		}
	}

	@ObfuscatedName("dv.gc(Lrn;B)V")
	public static final void method2843(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7967(var2, var3, arg0);
	}

	@ObfuscatedName("on.gs(Lew;Lej;Lrn;I)V")
	public static final void method7179(ComType arg0, IfType arg1, ClientScriptState arg2) {
		if (arg0.field1766 == 4) {
			ScriptRunner.method8481(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("fl.he(Lrn;B)V")
	public static final void method3571(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5216 -= 2;
		int var3 = arg0.field5215[arg0.field5216];
		int var4 = arg0.field5215[arg0.field5216 + 1];
		ParamType var5 = field4464.method12600(var3);
		if (var5.field7287 == var4) {
			var2.method3129(var3);
		} else {
			var2.method3127(var3, var4);
		}
	}

	@ObfuscatedName("vx.iy(B)V")
	public static final void method12183() {
		for (class945 var0 = (class945) client.field9007.method11563(); var0 != null; var0 = (class945) client.field9007.method11567()) {
			ProjectileAnimation var1 = var0.field10342;
			if (client.field9213 > var1.field10622) {
				var0.method6979();
				var1.method17159();
			} else if (client.field9213 >= var1.field10625) {
				var1.method17152();
				if (var1.field10626 > 0) {
					if (client.field8988 == 0) {
						PathingEntity var2 = field1537[var1.field10626 - 1].method2854();
						if (var2 != null) {
							Vector3 var3 = var2.method8565().field3464;
							if ((int) var3.field3475 >= 0 && (int) var3.field3475 < client.field8980.method6220() * 512 && (int) var3.field3477 >= 0 && (int) var3.field3477 < client.field8980.method6193() * 512) {
								var1.method17162((int) var3.field3475, (int) var3.field3477, client.method8663((int) var3.field3475, (int) var3.field3477, var2.field9807) - var1.field10620, client.field9213);
							}
						}
					} else {
						ObjectNode var4 = (ObjectNode) client.field8964.method11923((long) (var1.field10626 - 1));
						if (var4 != null) {
							NpcEntity var5 = (NpcEntity) var4.field9550;
							Vector3 var6 = var5.method8565().field3464;
							if ((int) var6.field3475 >= 0 && (int) var6.field3475 < client.field8980.method6220() * 512 && (int) var6.field3477 >= 0 && (int) var6.field3477 < client.field8980.method6193() * 512) {
								var1.method17162((int) var6.field3475, (int) var6.field3477, client.method8663((int) var6.field3475, (int) var6.field3477, var1.field9807) - var1.field10620, client.field9213);
							}
						}
					}
				}
				if (var1.field10626 < 0) {
					int var7 = -var1.field10626 - 1;
					PlayerEntity var8;
					if (client.field9071 == var7) {
						var8 = field2119;
					} else {
						var8 = client.field9070[var7];
					}
					if (var8 != null) {
						Vector3 var9 = var8.method8565().field3464;
						if ((int) var9.field3475 >= 0 && (int) var9.field3475 < client.field8980.method6220() * 512 && (int) var9.field3477 >= 0 && (int) var9.field3477 < client.field8980.method6193() * 512) {
							var1.method17162((int) var9.field3475, (int) var9.field3477, client.method8663((int) var9.field3475, (int) var9.field3477, var1.field9807) - var1.field10620, client.field9213);
						}
					}
				}
				var1.method17157(client.field8931);
				client.field8980.method6098().method7412(var1, true);
			}
		}
	}

	@ObfuscatedName("qi.hb(Lew;Lej;Lrn;I)V")
	public static final void method8049(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 3;
		arg0.field1838 = client.field9071;
		arg0.field1832 = 0;
		if (arg0.field1765 == -1 && !arg1.field1734) {
			method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("dq.hp(Lrn;I)V")
	public static final void method2894(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method7651(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("nv.ii(Lew;Lej;Lrn;I)V")
	public static final void method6788(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 5;
		arg0.field1838 = arg2.field5215[--arg2.field5216];
		if (arg0.field1765 == -1 && !arg1.field1734) {
			method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("am.iv(Lrn;I)V")
	public static final void method1905(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method14903(var2, var3, arg0);
	}

	@ObfuscatedName("fp.ji(Lrn;I)V")
	public static final void method3542(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method11906(var2, var3, arg0);
	}

	@ObfuscatedName("eb.jd(Lew;Lej;Lrn;I)V")
	public static final void method3319(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1852 = null;
	}

	@ObfuscatedName("ks.jl(Lew;Lej;Lrn;I)V")
	public static final void method5069(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1855 = arg2.field5215[--arg2.field5216];
	}

	@ObfuscatedName("fg.ki(Lrn;I)V")
	public static final void method3638(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		ScriptRunner.method8614(var2, arg0);
	}

	@ObfuscatedName("xb.kp(Lrn;I)V")
	public static final void method12749(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		ScriptRunner.method7054(var2, arg0);
	}

	@ObfuscatedName("zm.kx(Lrn;I)V")
	public static final void method13892(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		byte[] var1 = new byte[] { (byte) arg0.field5215[arg0.field5216] };
		byte[] var2 = new byte[] { (byte) arg0.field5215[arg0.field5216 + 1] };
		int var3 = arg0.field5215[arg0.field5216 + 2];
		ComType var4 = ComType.method11381(var3);
		ScriptRunner.method2813(var4, var1, var2, arg0);
	}

	@ObfuscatedName("vy.jc(Laay;Laay;IIIIIIIB)V")
	public static final void method12479(PathingEntity arg0, PathingEntity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = arg1.method13961();
		if (var9 == -1) {
			return;
		}
		Object var10 = null;
		Sprite var11 = (Sprite) client.field9131.method7916((long) var9);
		if (var11 == null) {
			SpriteData[] var12 = SpriteDataProvider.method2591(field7387, var9, 0);
			if (var12 == null) {
				return;
			}
			var11 = field5187.method517(var12[0], true);
			client.field9131.method7937(var11, (long) var9);
		}
		Vector3 var13 = arg0.method8565().field3464;
		client.method1979(arg0.field9807, (int) var13.field3475, (int) var13.field3477, arg0.method13954() * 256, 0, false);
		int var14 = (int) (client.field9048[0] + (float) arg3 - 18.0F);
		int var15 = (int) (client.field9048[1] + (float) arg4 - 16.0F - 54.0F);
		int var16 = arg2 / 4 * 18 + var14;
		int var17 = arg2 % 4 * 18 + var15;
		var11.method2500(var16, var17);
		if (arg0 == arg1) {
			field5187.method482(var16 - 1, var17 - 1, 18, 18, -256);
		}
		CoverMarkerClickbox var18 = CoverMarkerClickbox.method12327();
		var18.field9250 = arg1;
		var18.field9251 = var16;
		var18.field9252 = var17;
		var18.field9253 = var16 + 16;
		var18.field9254 = var17 + 16;
		client.field9046.method11640(var18);
	}

	@ObfuscatedName("pi.ka(Lew;Lej;Lrn;I)V")
	public static final void method7900(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1786 = arg2.field5215[--arg2.field5216];
	}

	@ObfuscatedName("pk.kj(Lrn;S)V")
	public static final void method7968(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method6973(var2, var3, arg0);
	}

	@ObfuscatedName("pt.ji(IIIIB)V")
	public static final void method7732(int arg0, int arg1, int arg2, int arg3) {
		client.method1979(arg0, arg1, arg2, 0, arg3, false);
	}

	@ObfuscatedName("iv.ll(Lew;Lej;Lrn;I)V")
	public static final void method4583(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (ScriptRunner.method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1873 = ScriptRunner.method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("aes.le(Lew;Lej;Lrn;B)V")
	public static final void method15654(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		int[] var4 = ScriptRunner.method3662(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1874 = ScriptRunner.method8142(var3, arg2);
		arg0.field1875 = var4;
		arg0.field1861 = true;
	}

	@ObfuscatedName("eh.lp(Lew;Lej;Lrn;I)V")
	public static final void method3070(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (ScriptRunner.method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1784 = ScriptRunner.method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vw.md(Lrn;B)V")
	public static final void method12347(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ScriptRunner.method3497(var2, var3, arg0);
	}

	@ObfuscatedName("eu.nk(Lew;Lej;Lrn;I)V")
	public static final void method2929(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (ScriptRunner.method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1896 = ScriptRunner.method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("jw.nz(Lrn;B)V")
	public static final void method4895(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method8454(var2, var3, arg0);
	}

	@ObfuscatedName("re.of(Lrn;B)V")
	public static final void method8660(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = field1756[var1 >> 16];
		ScriptRunner.method12221(var2, var3, arg0);
	}

	@ObfuscatedName("pm.qu(Lrn;I)V")
	public static final void method7955(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1793;
	}

	@ObfuscatedName("gz.qd(Lrn;I)V")
	public static final void method3944(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1903;
	}

	@ObfuscatedName("vv.qi(Lrn;I)V")
	public static final void method12369(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1765;
	}

	@ObfuscatedName("if.qp(Lrn;I)V")
	public static final void method4706(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		ScriptRunner.method2816(var2, arg0);
	}

	@ObfuscatedName("lh.qe(Lew;Lrn;I)V")
	public static final void method5714(ComType arg0, ClientScriptState arg1) {
		int var2 = arg1.field5215[--arg1.field5216];
		int var3 = arg1.field5215[--arg1.field5216] - 1;
		if (arg0.field1806 != 2) {
			throw new RuntimeException("");
		}
		NPCType var4 = field3774.method12565(arg0.field1838);
		if (arg0.field1930 == null) {
			arg0.field1930 = new class610(var4, false);
		}
		arg0.field1930.field7203 = ScriptRunner.method3530();
		if (var3 < 0 || var3 >= var4.field7215.length) {
			throw new RuntimeException("");
		}
		arg0.field1930.field7204[var3] = var2;
		client.method12939(arg0);
	}

	@ObfuscatedName("aar.rp(Lrn;B)V")
	public static final void method13908(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1739;
	}

	@ObfuscatedName("xb.rq(Lrn;I)V")
	public static final void method12748(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1783;
	}

	@ObfuscatedName("tq.st(Lrn;I)V")
	public static final void method11638(ClientScriptState arg0) {
		ComType var1 = ComType.method11381(arg0.field5215[--arg0.field5216]);
		arg0.field5215[++arg0.field5216 - 1] = var1.field1903;
	}

	@ObfuscatedName("wm.sj(Lrn;I)V")
	public static final void method12702(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ActiveComponent var3 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		client.method8390(var3.field5240, var1, var2);
	}

	@ObfuscatedName("pg.tc(Lrn;I)V")
	public static final void method7975(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2929, client.field8975.field834);
		var2.field9467.method15308(var1.length() + 1);
		var2.field9467.method15228(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("qk.tn(Lrn;B)V")
	public static final void method8398(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		class395.method1717(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], false, 256);
	}

	@ObfuscatedName("nv.tt(Lrn;I)V")
	public static final void method6790(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9093[var1];
	}

	@ObfuscatedName("nt.tl(Lrn;I)V")
	public static final void method6646(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = var1 >> 14 & 0x3FFF;
	}

	@ObfuscatedName("fc.uo(Lrn;I)V")
	public static final void method3531(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field6772.field6768;
	}

	@ObfuscatedName("k.ue(Lrn;I)V")
	public static final void method1605(ClientScriptState arg0) {
		if (client.field8916 >= 5 && client.field8916 <= 9) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("lu.vx(Lrn;B)V")
	public static final void method5827(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field7136.method7255();
	}

	@ObfuscatedName("cj.vv(Lrn;I)V")
	public static final void method2576(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = field1244.method12116(var2);
		if (var4.field6806 != var1) {
			throw new RuntimeException();
		}
		int[] var5 = var4.method12141(var3);
		int var6 = 0;
		if (var5 != null) {
			var6 = var5.length;
		}
		arg0.field5215[++arg0.field5216 - 1] = var6;
	}

	@ObfuscatedName("aev.wd(Lrn;B)V")
	public static final void method15610(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9209[var1].field645;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ik.wp(Lrn;I)V")
	public static final void method4654(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		client.method13904(var1, false);
	}

	@ObfuscatedName("vp.wt(Lrn;B)V")
	public static final void method12465(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 0 || var1 >= client.field9211) {
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		Ignore var2 = client.field8999[var1];
		arg0.field5222[++arg0.field5230 - 1] = var2.field639;
		if (var2.field638 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field638;
		}
	}

	@ObfuscatedName("ji.wh(Lrn;I)V")
	public static final void method4793(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 >= 0 && var1 < client.field9206) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9209[var1].field650;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ph.xy(Lrn;I)V")
	public static final void method7879(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field8999[var1].field640 ? 1 : 0;
	}

	@ObfuscatedName("gz.xq(Lrn;I)V")
	public static final void method3939(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2354;
	}

	@ObfuscatedName("ol.yo(Lrn;B)V")
	public static final void method7074(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5217.field9429[var1].field2343;
	}

	@ObfuscatedName("sp.yv(Lrn;I)V")
	public static final void method11255(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		client.method12622(field8458 == arg0.field5217, var1);
	}

	@ObfuscatedName("gp.yi(Lrn;B)V")
	public static final void method3907(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 + var2;
	}

	@ObfuscatedName("mf.zn(Lrn;I)V")
	public static final void method6081(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 | 0x1 << var2;
	}

	@ObfuscatedName("aaf.zk(Lrn;I)V")
	public static final void method14062(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = ~var1;
	}

	@ObfuscatedName("ac.za(Lrn;I)V")
	public static final void method1977(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5222[++arg0.field5230 - 1] = var1.toLowerCase();
	}

	@ObfuscatedName("lk.aay(Lrn;I)V")
	public static final void method5571(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = StringTools.method8060((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("ji.aam(Lrn;I)V")
	public static final void method4795(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1.length();
		}
	}

	@ObfuscatedName("al.aat(Lrn;I)V")
	public static final void method1822(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Character.toUpperCase((char) var1);
	}

	@ObfuscatedName("nt.abp(Lrn;I)V")
	public static final void method6647(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field3492.method12316(var1).field7078 == 1 ? 1 : 0;
	}

	@ObfuscatedName("gz.aby(Lrn;I)V")
	public static final void method3945(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ObjType var2 = field3492.method12316(var1);
		if (var2.field7108 == -1 && var2.field7107 >= 0) {
			arg0.field5215[++arg0.field5216 - 1] = var2.field7107;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1;
		}
	}

	@ObfuscatedName("ew.abj(Lrn;I)V")
	public static final void method3207(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field3492.method12316(var1).field7085;
	}

	@ObfuscatedName("nx.abk(Lrn;B)V")
	public static final void method6829(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field3492.method12316(var1).field7068;
	}

	@ObfuscatedName("lr.acm(Lrn;I)V")
	public static final void method6035(ClientScriptState arg0) {
		if (field769 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = field769.field6699;
		}
	}

	@ObfuscatedName("np.acx(Lrn;I)V")
	public static final void method6879(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (client.field9074 == 0 && (client.field9054 && !client.field9077 || client.field9081)) {
			return;
		}
		String var2 = var1.toLowerCase();
		byte var3 = 0;
		if (var2.startsWith(LocalisedText.field7024.method12206(Language.field6376))) {
			var3 = 0;
			var1 = var1.substring(LocalisedText.field7024.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7019.method12206(Language.field6376))) {
			var3 = 1;
			var1 = var1.substring(LocalisedText.field7019.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field6915.method12206(Language.field6376))) {
			var3 = 2;
			var1 = var1.substring(LocalisedText.field6915.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field6869.method12206(Language.field6376))) {
			var3 = 3;
			var1 = var1.substring(LocalisedText.field6869.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7022.method12206(Language.field6376))) {
			var3 = 4;
			var1 = var1.substring(LocalisedText.field7022.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7006.method12206(Language.field6376))) {
			var3 = 5;
			var1 = var1.substring(LocalisedText.field7006.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field6985.method12206(Language.field6376))) {
			var3 = 6;
			var1 = var1.substring(LocalisedText.field6985.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field6888.method12206(Language.field6376))) {
			var3 = 7;
			var1 = var1.substring(LocalisedText.field6888.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7026.method12206(Language.field6376))) {
			var3 = 8;
			var1 = var1.substring(LocalisedText.field7026.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field6926.method12206(Language.field6376))) {
			var3 = 9;
			var1 = var1.substring(LocalisedText.field6926.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7028.method12206(Language.field6376))) {
			var3 = 10;
			var1 = var1.substring(LocalisedText.field7028.method12206(Language.field6376).length());
		} else if (var2.startsWith(LocalisedText.field7029.method12206(Language.field6376))) {
			var3 = 11;
			var1 = var1.substring(LocalisedText.field7029.method12206(Language.field6376).length());
		} else if (field2308 != Language.field6376) {
			if (var2.startsWith(LocalisedText.field7024.method12206(field2308))) {
				var3 = 0;
				var1 = var1.substring(LocalisedText.field7024.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7019.method12206(field2308))) {
				var3 = 1;
				var1 = var1.substring(LocalisedText.field7019.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field6915.method12206(field2308))) {
				var3 = 2;
				var1 = var1.substring(LocalisedText.field6915.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field6869.method12206(field2308))) {
				var3 = 3;
				var1 = var1.substring(LocalisedText.field6869.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7022.method12206(field2308))) {
				var3 = 4;
				var1 = var1.substring(LocalisedText.field7022.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7006.method12206(field2308))) {
				var3 = 5;
				var1 = var1.substring(LocalisedText.field7006.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field6985.method12206(field2308))) {
				var3 = 6;
				var1 = var1.substring(LocalisedText.field6985.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field6888.method12206(field2308))) {
				var3 = 7;
				var1 = var1.substring(LocalisedText.field6888.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7026.method12206(field2308))) {
				var3 = 8;
				var1 = var1.substring(LocalisedText.field7026.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field6926.method12206(field2308))) {
				var3 = 9;
				var1 = var1.substring(LocalisedText.field6926.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7028.method12206(field2308))) {
				var3 = 10;
				var1 = var1.substring(LocalisedText.field7028.method12206(field2308).length());
			} else if (var2.startsWith(LocalisedText.field7029.method12206(field2308))) {
				var3 = 11;
				var1 = var1.substring(LocalisedText.field7029.method12206(field2308).length());
			}
		}
		String var4 = var1.toLowerCase();
		byte var5 = 0;
		if (var4.startsWith(LocalisedText.field7030.method12206(Language.field6376))) {
			var5 = 1;
			var1 = var1.substring(LocalisedText.field7030.method12206(Language.field6376).length());
		} else if (var4.startsWith(LocalisedText.field6940.method12206(Language.field6376))) {
			var5 = 2;
			var1 = var1.substring(LocalisedText.field6940.method12206(Language.field6376).length());
		} else if (var4.startsWith(LocalisedText.field7032.method12206(Language.field6376))) {
			var5 = 3;
			var1 = var1.substring(LocalisedText.field7032.method12206(Language.field6376).length());
		} else if (var4.startsWith(LocalisedText.field7033.method12206(Language.field6376))) {
			var5 = 4;
			var1 = var1.substring(LocalisedText.field7033.method12206(Language.field6376).length());
		} else if (var4.startsWith(LocalisedText.field6866.method12206(Language.field6376))) {
			var5 = 5;
			var1 = var1.substring(LocalisedText.field6866.method12206(Language.field6376).length());
		} else if (field2308 != Language.field6376) {
			if (var4.startsWith(LocalisedText.field7030.method12206(field2308))) {
				var5 = 1;
				var1 = var1.substring(LocalisedText.field7030.method12206(field2308).length());
			} else if (var4.startsWith(LocalisedText.field6940.method12206(field2308))) {
				var5 = 2;
				var1 = var1.substring(LocalisedText.field6940.method12206(field2308).length());
			} else if (var4.startsWith(LocalisedText.field7032.method12206(field2308))) {
				var5 = 3;
				var1 = var1.substring(LocalisedText.field7032.method12206(field2308).length());
			} else if (var4.startsWith(LocalisedText.field7033.method12206(field2308))) {
				var5 = 4;
				var1 = var1.substring(LocalisedText.field7033.method12206(field2308).length());
			} else if (var4.startsWith(LocalisedText.field6866.method12206(field2308))) {
				var5 = 5;
				var1 = var1.substring(LocalisedText.field6866.method12206(field2308).length());
			}
		}
		ServerConnection var6 = client.method4104();
		ClientMessage var7 = ClientMessage.method14781(ClientProt.field2935, var6.field834);
		var7.field9467.method15308(0);
		int var8 = var7.field9467.field9626;
		var7.field9467.method15308(var3);
		var7.field9467.method15308(var5);
		class178.method14081(var7.field9467, var1);
		var7.field9467.method15251(var7.field9467.field9626 - var8);
		var6.method1913(var7);
	}

	@ObfuscatedName("jj.acf(Lrn;B)V")
	public static final void method4771(ClientScriptState arg0) {
		String var1;
		if (field2119 == null || field2119.field10063 == null) {
			var1 = "";
		} else {
			var1 = field2119.method16120(true);
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("qx.ky(ILjava/lang/String;I)V")
	public static void method8062(int arg0, String arg1) {
		int var2 = ReceivePlayerPositions.field732;
		int[] var3 = ReceivePlayerPositions.field727;
		boolean var4 = false;
		for (int var5 = 0; var5 < var2; var5++) {
			PlayerEntity var6 = client.field9070[var3[var5]];
			if (var6 != null && field2119 != var6 && var6.field10040 != null && var6.field10040.equalsIgnoreCase(arg1)) {
				ClientProt var7 = null;
				if (arg0 == 1) {
					var7 = ClientProt.field2916;
				} else if (arg0 == 4) {
					var7 = ClientProt.field2866;
				} else if (arg0 == 5) {
					var7 = ClientProt.field2907;
				} else if (arg0 == 6) {
					var7 = ClientProt.field2885;
				} else if (arg0 == 7) {
					var7 = ClientProt.field2884;
				} else if (arg0 == 9) {
					var7 = ClientProt.field2902;
				}
				if (var7 != null) {
					ClientMessage var8 = ClientMessage.method14781(var7, client.field8975.field834);
					var8.field9467.method15279(var3[var5]);
					var8.field9467.method15308(0);
					client.field8975.method1913(var8);
				}
				var4 = true;
				break;
			}
		}
		if (!var4) {
			ChatHistory.method1587(4, LocalisedText.field6907.method12206(field2308) + arg1);
		}
	}

	@ObfuscatedName("ue.ks(Lew;III)V")
	public static void method11974(ComType arg0, int arg1, int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.field1872 != null) {
			HookRequest var3 = new HookRequest();
			var3.field9609 = arg0;
			var3.field9613 = arg0.field1872;
			ScriptRunner.method8605(var3);
		}
		client.field9117 = true;
		field4166 = arg0.field1764;
		client.field9101 = arg0.field1765;
		field4822 = arg1;
		field7366 = arg2;
		client.field9102 = arg0.field1903;
		field477 = arg0.field1827;
		client.field9235 = arg0.field1763;
		client.method12939(arg0);
	}

	@ObfuscatedName("io.adi(Lrn;I)V")
	public static final void method4599(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = field3779.method12176(var1).method16752(var2).field5029;
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("tm.ku(IIB)V")
	public static void method11509(int arg0, int arg1) {
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2932, client.field8975.field834);
		var2.field9467.method15293(arg1);
		var2.field9467.method15397(arg0);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("nw.ads(Lrn;B)V")
	public static final void method7050(ClientScriptState arg0) {
		ServerConnection var1 = client.method4104();
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2936, var1.field834);
		var2.field9467.method15308(0);
		int var3 = var2.field9467.field9626;
		var2.field9467.method15308(2);
		var2.field9467.method15287(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.field9626 - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("fg.aew(Lrn;I)V")
	public static final void method3642(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ClientWorldMap.field9753 == 100 ? 1 : 0;
	}

	@ObfuscatedName("qg.aef(Lrn;I)V")
	public static final void method8406(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ClientWorldMap.method12730(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
	}

	@ObfuscatedName("fx.aev(Lrn;I)V")
	public static final void method3585(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = ClientWorldMap.method12024();
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
			return;
		}
		boolean var2 = var1.method16707(field4465 + field4283, field6770 + field4284, ScriptRunner.field5200);
		if (var2) {
			arg0.field5215[++arg0.field5216 - 1] = ScriptRunner.field5200[1];
			arg0.field5215[++arg0.field5216 - 1] = ScriptRunner.field5200[2];
		} else {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
		}
	}

	@ObfuscatedName("pa.afd(Lrn;I)V")
	public static final void method7744(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = var2 >> 14 & 0x3FFF;
		int var4 = var2 & 0x3FFF;
		int var5 = ClientWorldMap.method7984(var1, var3, var4);
		if (var5 < 0) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var5;
		}
	}

	@ObfuscatedName("fc.afm(Lrn;I)V")
	public static final void method3532(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.method12476();
	}

	@ObfuscatedName("rb.afr(Lrn;I)V")
	public static final void method11055(ClientScriptState arg0) {
		arg0.field5216 -= 7;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1] << 1;
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		int var5 = arg0.field5215[arg0.field5216 + 4];
		int var6 = arg0.field5215[arg0.field5216 + 5];
		int var7 = arg0.field5215[arg0.field5216 + 6];
		if (var1 >= 0 && var1 < 2 && client.field9076[var1] != null && var2 >= 0 && var2 < client.field9076[var1].length) {
			client.field9076[var1][var2] = new int[] { (var3 >> 14 & 0x3FFF) << 9, var4 << 2, (var3 & 0x3FFF) << 9, var7 };
			client.field9076[var1][var2 + 1] = new int[] { (var5 >> 14 & 0x3FFF) << 9, var6 << 2, (var5 & 0x3FFF) << 9 };
		}
	}

	@ObfuscatedName("dj.afq(Lrn;B)V")
	public static final void method2611(ClientScriptState arg0) {
		int var1 = client.field9076[arg0.field5215[--arg0.field5216]].length >> 1;
		arg0.field5215[++arg0.field5216 - 1] = var1;
	}

	@ObfuscatedName("ahj.afe(Lrn;B)V")
	public static final void method16113(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		client.field9096 = arg0.field5215[arg0.field5216];
		client.field9098 = arg0.field5215[arg0.field5216 + 1];
	}

	@ObfuscatedName("nw.agx(Lrn;B)V")
	public static final void method7053(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9171 >> 3;
	}

	@ObfuscatedName("fo.ain(Lrn;I)V")
	public static final void method3622(ClientScriptState arg0) throws CameraException {
		field1307.method3696((float) arg0.field5215[--arg0.field5216] / 1000.0F);
	}

	@ObfuscatedName("iy.aio(Lrn;I)V")
	public static final void method4697(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		float var1 = (float) arg0.field5215[arg0.field5216];
		float var2 = (float) arg0.field5215[arg0.field5216 + 1];
		float var3 = (float) arg0.field5215[arg0.field5216 + 2];
		float var4 = (float) arg0.field5215[arg0.field5216 + 3] / 1000.0F;
		field1307.method3768(Vector3.method5294(var1, var2, var3), var4);
	}

	@ObfuscatedName("pe.aiy(Lrn;I)V")
	public static final void method7693(ClientScriptState arg0) {
		method4011();
	}

	@ObfuscatedName("qr.aip(Lrn;I)V")
	public static final void method8091(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field507;
	}

	@ObfuscatedName("eu.ajc(Lrn;I)V")
	public static final void method2932(ClientScriptState arg0) {
		if (client.field8923 == 3) {
			ClientMessage var1 = ClientMessage.method14781(ClientProt.field2949, client.field8959.field834);
			client.field8959.method1913(var1);
		}
	}

	@ObfuscatedName("aah.ajt(Lrn;B)V")
	public static final void method13912(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8946 ? 1 : 0;
	}

	@ObfuscatedName("lv.ajr(Lrn;I)V")
	public static final void method5615(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field545;
	}

	@ObfuscatedName("pq.ajw(Lrn;I)V")
	public static final void method7717(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		LoginManager.method11156(var1);
	}

	@ObfuscatedName("rt.akt(Lrn;I)V")
	public static final void method8622(ClientScriptState arg0) {
		field4961.method15448(field4961.field9672, arg0.field5215[--arg0.field5216]);
		method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("kk.lh(Lew;I)V")
	public static void method5567(ComType arg0) {
		if (arg0.field1766 == 5 && arg0.field1903 != -1) {
			class52.method8730(field5187, arg0);
		}
	}

	@ObfuscatedName("lf.akf(Lrn;I)V")
	public static final void method6069(ClientScriptState arg0) {
		field4961.method15448(field4961.field9643, arg0.field5215[--arg0.field5216]);
		method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("it.akl(Lrn;I)V")
	public static final void method4711(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		boolean var2 = arg0.field5215[arg0.field5216 + 1] == 1;
		field4961.method15448(field4961.field9670, var1);
		if (!var2) {
			field4961.method15448(field4961.field9633, 0);
		}
		method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("abq.aln(Lrn;B)V")
	public static final void method14199(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9660.method15735() == 2 ? 1 : 0;
	}

	@ObfuscatedName("gm.ali(Lrn;I)V")
	public static final void method3967(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9676.method15891() == 1 ? 1 : 0;
	}

	@ObfuscatedName("wb.alf(Lrn;I)V")
	public static final void method12728(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9674.method15899();
	}

	@ObfuscatedName("rf.le(Lew;I)V")
	public static final void method8633(ComType arg0) {
		if (ComType.field1740 != arg0.field1767) {
			return;
		}
		if (field2119.field10040 == null) {
			arg0.field1838 = 0;
			arg0.field1832 = 0;
			return;
		}
		arg0.field1812 = 150;
		arg0.field1813 = (int) (Math.sin((double) client.field9213 / 40.0D) * 256.0D) & 0x7FF;
		arg0.field1806 = 5;
		arg0.field1838 = client.field9071;
		arg0.field1832 = StringTools.method1347(field2119.field10040);
		EntityWalkAnimationNode var1 = field2119.field8616;
		if (var1 == null) {
			arg0.field1789 = null;
			return;
		}
		if (arg0.field1789 == null) {
			arg0.field1789 = new InterfaceAnimationNode();
		}
		arg0.field1747 = var1.method11812();
		arg0.field1789.method11766(var1);
	}

	@ObfuscatedName("yw.ano(Lrn;I)V")
	public static final void method12909(ClientScriptState arg0) {
		method12022();
	}

	@ObfuscatedName("wk.mq(Ljava/lang/String;I)V")
	public static final void method12716(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = NamespaceUtil.method4744(arg0);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < client.field9206; var2++) {
			Friend var3 = client.field9209[var2];
			String var4 = var3.field649;
			String var5 = NamespaceUtil.method4744(var4);
			if (class160.method7055(arg0, var1, var4, var5)) {
				client.field9206--;
				for (int var6 = var2; var6 < client.field9206; var6++) {
					client.field9209[var6] = client.field9209[var6 + 1];
				}
				client.field9148 = client.field9132;
				ServerConnection var7 = client.method4104();
				ClientMessage var8 = ClientMessage.method14781(ClientProt.field2930, var7.field834);
				var8.field9467.method15308(method1724(arg0));
				var8.field9467.method15228(arg0);
				var7.method1913(var8);
				break;
			}
		}
	}

	@ObfuscatedName("sg.mh(Ljava/lang/String;I)V")
	public static final void method11369(String arg0) {
		if (arg0 == null) {
			return;
		}
		String var1 = NamespaceUtil.method4744(arg0);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < client.field9211; var2++) {
			Ignore var3 = client.field8999[var2];
			String var4 = var3.field639;
			String var5 = NamespaceUtil.method4744(var4);
			if (class160.method7055(arg0, var1, var4, var5)) {
				client.field9211--;
				for (int var6 = var2; var6 < client.field9211; var6++) {
					client.field8999[var6] = client.field8999[var6 + 1];
				}
				client.field9148 = client.field9132;
				ServerConnection var7 = client.method4104();
				ClientMessage var8 = ClientMessage.method14781(ClientProt.field2931, var7.field834);
				var8.field9467.method15308(method1724(arg0));
				var8.field9467.method15228(arg0);
				var7.method1913(var8);
				break;
			}
		}
	}

	@ObfuscatedName("aiq.ani(Lrn;I)V")
	public static final void method16476(ClientScriptState arg0) {
	}

	@ObfuscatedName("rx.mw(II)V")
	public static void method8587(int arg0) {
		for (Node var1 = client.field9010.method11928(); var1 != null; var1 = client.field9010.method11929()) {
			if ((var1.field4228 >> 48 & 0xFFFFL) == (long) arg0) {
				var1.method6979();
			}
		}
	}

	@ObfuscatedName("ch.aok(Lrn;I)V")
	public static final void method2426(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = (int) (field6701 / 60000L);
		arg0.field5215[++arg0.field5216 - 1] = (int) ((field6701 - MonotonicTime.method5554() - field3384) / 60000L);
		arg0.field5215[++arg0.field5216 - 1] = field628 ? 1 : 0;
	}

	@ObfuscatedName("tv.nv(IIIIIIIIIIIIIIZII)V")
	public static void method11760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15) {
		if (arg1 != 0 && arg3 != -1) {
			PathingEntity var16 = null;
			if (arg1 < 0) {
				int var17 = -arg1 - 1;
				if (client.field9071 == var17) {
					var16 = field2119;
				} else {
					var16 = client.field9070[var17];
				}
			} else {
				int var18 = arg1 - 1;
				ObjectNode var19 = (ObjectNode) client.field8964.method11923((long) var18);
				if (var19 != null) {
					var16 = (PathingEntity) var19.field9550;
				}
			}
			if (var16 != null) {
				BASType var20 = var16.method13959();
				if (var20.field4716 != null && var20.field4716[arg3] != null) {
					arg4 -= var20.field4716[arg3][1];
				}
				if (var20.field4729 != null && var20.field4729[arg3] != null) {
					arg4 -= var20.field4729[arg3][1];
				}
			}
		}
		ProjectileAnimation var21 = new ProjectileAnimation(client.field8980.method6098(), arg0, field3161, field3161, arg6, arg7, arg4, client.field9213 + arg10, client.field9213 + arg11, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		var21.method17162(arg8, arg9, client.method8663(arg8, arg9, field3161) - arg5, client.field9213 + arg10);
		client.field9007.method11558(new class945(var21));
	}

	@ObfuscatedName("lg.apb(Lrn;I)V")
	public static final void method5810(ClientScriptState arg0) {
		class63.method1886(true);
		client.field8980.method6102();
		method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("vj.api(Lrn;I)V")
	public static final void method12325(ClientScriptState arg0) {
		boolean var1 = true;
		if (client.field8903) {
			try {
				Object var2 = JavascriptFunction.field3148.method4759();
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("cj.aqk(Lrn;I)V")
	public static final void method2577(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9651.method11387(var1);
	}

	@ObfuscatedName("pu.aqi(Lrn;B)V")
	public static final void method7991(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9659.method11387(var1);
	}

	@ObfuscatedName("ix.aqm(Lrn;B)V")
	public static final void method4615(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9677.method11387(var1);
	}

	@ObfuscatedName("xa.aqb(Lrn;B)V")
	public static final void method234(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = field4961.field9641.method11387(var1);
	}

	@ObfuscatedName("al.aqf(Lrn;I)V")
	public static final void method1821(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ActiveComponent var3;
		if (arg0.field5238) {
			var3 = arg0.field5210;
		} else {
			var3 = arg0.field5223;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3.method11066(arg0.field5228.field8652, var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("va.arw(Lrn;B)V")
	public static final void method12185(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ((NpcEntity) arg0.field5228).field10075.field7211;
	}

	@ObfuscatedName("ak.ark(Lrn;I)V")
	public static final void method1954(ClientScriptState arg0) {
		client.method7883(arg0.field5234, arg0.field5215[--arg0.field5216]);
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[0];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[1];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[2];
	}

	@ObfuscatedName("ro.arg(Lrn;I)V")
	public static final void method8728(ClientScriptState arg0) {
		ScriptRunner.method1680(arg0.field5228, arg0);
	}
}