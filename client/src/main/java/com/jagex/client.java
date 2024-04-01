package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.ping.Ping;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;

public final class client extends GameShell {

    public static final boolean ENABLE_RSA = false;
    public static final boolean ENABLE_JS5_RSA = false;
    public static final boolean ENABLE_HOST_CHECK = false;
    public static final boolean ENABLE_ISAAC = false;

	@ObfuscatedName("client.bx")
	public static class527 field9163 = null;

	@ObfuscatedName("client.bb")
	public static boolean field8903 = false;

	@ObfuscatedName("client.be")
	public static boolean field9193 = false;

	@ObfuscatedName("client.bw")
	public static String field8947 = null;

	@ObfuscatedName("client.bh")
	public static int field9043 = 0;

	@ObfuscatedName("client.bu")
	public static int field8907 = 0;

	@ObfuscatedName("client.cl")
	public static boolean field9004 = false;

	@ObfuscatedName("client.cq")
	public static byte[] field8909 = null;

	@ObfuscatedName("client.co")
	public static long field8910 = 0L;

	@ObfuscatedName("client.cm")
	public static boolean field8911 = false;

	@ObfuscatedName("client.cw")
	public static boolean field8912 = false;

	@ObfuscatedName("client.cx")
	public static String field9099 = null;

	@ObfuscatedName("client.cn")
	public static String field9020 = null;

	@ObfuscatedName("client.cf")
	public static boolean field8915 = false;

	@ObfuscatedName("client.cs")
	public static boolean field9218 = false;

	@ObfuscatedName("client.cr")
	public static boolean field8987 = false;

	@ObfuscatedName("client.cp")
	public static boolean field8918 = false;

	@ObfuscatedName("client.ci")
	public static int field8919 = 0;

	@ObfuscatedName("client.ca")
	public static int field9015 = -1;

	@ObfuscatedName("client.ch")
	public static String field8921 = null;

	@ObfuscatedName("client.cv")
	public static String field8922 = null;

	@ObfuscatedName("client.cd")
	public static int field8923 = 12;

	@ObfuscatedName("client.ce")
	public static class320 field8924 = new class320();

	@ObfuscatedName("client.ct")
	public static class314 field8925 = new class314();

	@ObfuscatedName("client.cu")
	public static class314 field8979 = new class314();

	@ObfuscatedName("client.cz")
	public static long field8927 = 0L;

	@ObfuscatedName("client.dl")
	public static boolean field8928 = false;

	@ObfuscatedName("client.dj")
	public static boolean field9226 = true;

	@ObfuscatedName("client.dw")
	public static int field8930 = 0;

	@ObfuscatedName("client.di")
	public static int field9213 = 0;

	@ObfuscatedName("client.dg")
	public static boolean field8932 = true;

	@ObfuscatedName("client.do")
	public static boolean field8926 = false;

	@ObfuscatedName("client.db")
	public static boolean field9169 = false;

	@ObfuscatedName("client.dh")
	public static int field8935 = 0;

	@ObfuscatedName("client.de")
	public static class60[] field8936 = new class60[8];

	@ObfuscatedName("client.dk")
	public static class396[] field9044 = new class396[10];

	@ObfuscatedName("client.dz")
	public static boolean field8938 = false;

	@ObfuscatedName("client.dc")
	public static boolean field8939 = false;

	@ObfuscatedName("client.dt")
	public static boolean field8940 = true;

	@ObfuscatedName("client.dd")
	public static long field9138 = (long) (Math.random() * 9.999999999E9D);

	@ObfuscatedName("client.da")
	public static boolean field9165 = false;

	@ObfuscatedName("client.dr")
	public static int field8943 = 0;

	@ObfuscatedName("client.df")
	public static boolean field8944 = false;

	@ObfuscatedName("client.dv")
	public static int field9017 = 0;

	@ObfuscatedName("client.dm")
	public static boolean field8946 = false;

	@ObfuscatedName("client.et")
	public static class547 field9136 = new class547();

	@ObfuscatedName("client.eu")
	public static int field9002 = 0;

	@ObfuscatedName("client.er")
	public static int field8950 = 0;

	@ObfuscatedName("client.eq")
	public static class415[] field8951 = new class415[132];

	@ObfuscatedName("client.ez")
	public static int field8953 = 0;

	@ObfuscatedName("client.eh")
	public static class415[] field9072 = new class415[77];

	@ObfuscatedName("client.ed")
	public static Color[] field8974 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@ObfuscatedName("client.ee")
	public static Color[] field8956 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@ObfuscatedName("client.es")
	public static Color[] field8902 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@ObfuscatedName("client.ef")
	public static int field8958 = 0;

	@ObfuscatedName("client.ex")
	public static int field9164 = 0;

	@ObfuscatedName("client.gz")
	public static int field9215 = 0;

	@ObfuscatedName("client.gc")
	public static WeightedCache field9131 = new WeightedCache(8);

	@ObfuscatedName("client.gm")
	public static String field8962 = null;

	@ObfuscatedName("client.gr")
	public static final class291 field8914 = new class34();

	@ObfuscatedName("client.hz")
	public static IterableMap field8964 = new IterableMap(64);

	@ObfuscatedName("client.hp")
	public static class798[] field8965 = new class798[1024];

	@ObfuscatedName("client.hr")
	public static int field8966 = 0;

	@ObfuscatedName("client.hv")
	public static int field9104 = 0;

	@ObfuscatedName("client.hg")
	public static int[] field9056 = new int[1024];

	@ObfuscatedName("client.hi")
	public static int field8969 = 0;

	@ObfuscatedName("client.ip")
	public static int[] field8970 = new int[251];

	@ObfuscatedName("client.ir")
	public static int field8971 = 0;

	@ObfuscatedName("client.ie")
	public static int field8972 = 0;

	@ObfuscatedName("client.ii")
	public static int[] field8973 = new int[1005];

	@ObfuscatedName("client.ih")
	public static final class64 field8959 = new class64();

	@ObfuscatedName("client.ig")
	public static final class64 field8975 = new class64();

	@ObfuscatedName("client.ia")
	public static final class64[] field9011 = new class64[] { field8975, field8959 };

	@ObfuscatedName("client.iw")
	public static int field9023 = 0;

	@ObfuscatedName("client.iq")
	public static boolean field8978 = false;

	@ObfuscatedName("client.iv")
	public static class497 field9192 = new class497();

	@ObfuscatedName("client.io")
	public static class359 field8980 = new class359(false);

	@ObfuscatedName("client.ix")
	public static volatile boolean field8981 = false;

	@ObfuscatedName("client.iz")
	public static Object field8982 = new Object();

	@ObfuscatedName("client.is")
	public static Object field8983 = new Object();

	@ObfuscatedName("client.im")
	public static int[] field8984 = new int[64];

	@ObfuscatedName("client.ik")
	public static int field8985 = 0;

	@ObfuscatedName("client.iu")
	public static final int[] field8986 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.il")
	public static int field9059 = -1;

	@ObfuscatedName("client.it")
	public static int field8988 = 2;

	@ObfuscatedName("client.jv")
	public static boolean field8989 = false;

	@ObfuscatedName("client.jm")
	public static int field8906 = -1;

	@ObfuscatedName("client.jc")
	public static int field9029 = 0;

	@ObfuscatedName("client.jj")
	public static int field8992 = -1;

	@ObfuscatedName("client.jr")
	public static int field8993 = -1;

	@ObfuscatedName("client.jp")
	public static int field8994 = 255;

	@ObfuscatedName("client.jo")
	public static int field9147 = 0;

	@ObfuscatedName("client.jd")
	public static int field8996 = 0;

	@ObfuscatedName("client.je")
	public static int field8997 = 0;

	@ObfuscatedName("client.jw")
	public static int[] field9128 = new int[4096];

	@ObfuscatedName("client.jg")
	public static int[] field9231 = new int[4096];

	@ObfuscatedName("client.jt")
	public static int[] field9001 = new int[50];

	@ObfuscatedName("client.jy")
	public static int[] field9065 = new int[50];

	@ObfuscatedName("client.jq")
	public static final int[] field9003 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@ObfuscatedName("client.jk")
	public static int field9050 = 0;

	@ObfuscatedName("client.jb")
	public static int field9005 = -105766596;

	@ObfuscatedName("client.jl")
	public static int field9006 = 0;

	@ObfuscatedName("client.kr")
	public static int field9100 = 574862020;

	@ObfuscatedName("client.kh")
	public static int field9008 = 0;

	@ObfuscatedName("client.kb")
	public static int field9009 = 1;

	@ObfuscatedName("client.ky")
	public static int field9174 = 0;

	@ObfuscatedName("client.ki")
	public static int field9087 = 0;

	@ObfuscatedName("client.ks")
	public static int field9012 = -1235639024;

	@ObfuscatedName("client.kv")
	public static int field8976 = 0;

	@ObfuscatedName("client.ku")
	public static int field9014 = 1;

	@ObfuscatedName("client.kp")
	public static int field9122 = 0;

	@ObfuscatedName("client.kc")
	public static Random field9207 = new Random();

	@ObfuscatedName("client.kx")
	public static int field8931 = 0;

	@ObfuscatedName("client.kn")
	public static int field9154 = 0;

	@ObfuscatedName("client.ko")
	public static int field9019 = 0;

	@ObfuscatedName("client.kj")
	public static float field9171 = 1057.0F;

	@ObfuscatedName("client.kw")
	public static float field9021 = 0.0F;

	@ObfuscatedName("client.ke")
	public static float field9022 = 0.0F;

	@ObfuscatedName("client.km")
	public static float field8990 = 0.0F;

	@ObfuscatedName("client.kg")
	public static boolean field9016 = false;

	@ObfuscatedName("client.kk")
	public static boolean field8913 = false;

	@ObfuscatedName("client.lb")
	public static int field9026 = 28;

	@ObfuscatedName("client.lv")
	public static int field9027 = field9026 * 784 + 200;

	@ObfuscatedName("client.ls")
	public static boolean field9028 = true;

	@ObfuscatedName("client.lh")
	public static int field9173 = 0;

	@ObfuscatedName("client.lg")
	public static int[][][] field9076 = new int[2][][];

	@ObfuscatedName("client.lu")
	public static int field9033 = -1;

	@ObfuscatedName("client.lq")
	public static int field9034 = -1;

	@ObfuscatedName("client.lt")
	public static int field9035 = 0;

	@ObfuscatedName("client.ln")
	public static int field8995 = 0;

	@ObfuscatedName("client.lw")
	public static int field9219 = 0;

	@ObfuscatedName("client.lc")
	public static int field9038 = 0;

	@ObfuscatedName("client.ld")
	public static int field9039 = 0;

	@ObfuscatedName("client.ll")
	public static boolean field9040 = false;

	@ObfuscatedName("client.lm")
	public static boolean field8908 = false;

	@ObfuscatedName("client.le")
	public static int field9042 = 0;

	@ObfuscatedName("client.lz")
	public static int[] field9153 = new int[505];

	@ObfuscatedName("client.lx")
	public static int[] field9062 = new int[514];

	@ObfuscatedName("client.lp")
	public static int field9045 = 0;

	@ObfuscatedName("client.lr")
	public static class548 field9046 = new class548();

	@ObfuscatedName("client.la")
	public static int field9047 = 0;

	@ObfuscatedName("client.lf")
	public static float[] field9048 = new float[3];

	@ObfuscatedName("client.mx")
	public static int field9049 = 0;

	@ObfuscatedName("client.mf")
	public static int field9032 = 0;

	@ObfuscatedName("client.mo")
	public static int field9051 = 0;

	@ObfuscatedName("client.ml")
	public static int field9052 = 0;

	@ObfuscatedName("client.mv")
	public static int field9053 = 0;

	@ObfuscatedName("client.mh")
	public static int field9210 = -1;

	@ObfuscatedName("client.mw")
	public static int[] field9058 = new int[2];

	@ObfuscatedName("client.mi")
	public static int[] field9222 = new int[2];

	@ObfuscatedName("client.mr")
	public static int[] field9097 = new int[2];

	@ObfuscatedName("client.mt")
	public static int[] field9061 = new int[2];

	@ObfuscatedName("client.mb")
	public static int[] field8945 = new int[2];

	@ObfuscatedName("client.ms")
	public static long field9063 = 0L;

	@ObfuscatedName("client.mg")
	public static boolean field9064 = true;

	@ObfuscatedName("client.me")
	public static int field9129 = 32;

	@ObfuscatedName("client.ma")
	public static int field9066 = 16;

	@ObfuscatedName("client.mm")
	public static int field9067 = 765;

	@ObfuscatedName("client.md")
	public static int field9068 = 553;

	@ObfuscatedName("client.my")
	public static class902[] field9070 = new class902[2048];

	@ObfuscatedName("client.ng")
	public static int field9071 = -1;

	@ObfuscatedName("client.nf")
	public static boolean field8998 = false;

	@ObfuscatedName("client.nt")
	public static boolean field9142 = false;

	@ObfuscatedName("client.ny")
	public static int field9074 = 0;

	@ObfuscatedName("client.nb")
	public static int field8916 = 0;

	@ObfuscatedName("client.nu")
	public static boolean field9054 = false;

	@ObfuscatedName("client.nx")
	public static boolean field9077 = false;

	@ObfuscatedName("client.nk")
	public static boolean field9078 = false;

	@ObfuscatedName("client.nc")
	public static boolean field9079 = false;

	@ObfuscatedName("client.na")
	public static boolean field9176 = true;

	@ObfuscatedName("client.nh")
	public static boolean field9081 = false;

	@ObfuscatedName("client.nn")
	public static final short[] field9083 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };

	@ObfuscatedName("client.ne")
	public static int[] field9084 = new int[8];

	@ObfuscatedName("client.nj")
	public static String[] field9085 = new String[8];

	@ObfuscatedName("client.ns")
	public static boolean[] field9086 = new boolean[8];

	@ObfuscatedName("client.nz")
	public static int field9172 = -1;

	@ObfuscatedName("client.ox")
	public static IterableMap field9088 = new IterableMap(64);

	@ObfuscatedName("client.oe")
	public static class547 field9007 = new class547();

	@ObfuscatedName("client.ow")
	public static IterableMap field9090 = new IterableMap(16);

	@ObfuscatedName("client.oi")
	public static class548 field9091 = new class548();

	@ObfuscatedName("client.ot")
	public static int[] field9092 = new int[25];

	@ObfuscatedName("client.oc")
	public static int[] field9093 = new int[25];

	@ObfuscatedName("client.oy")
	public static int[] field9094 = new int[25];

	@ObfuscatedName("client.op")
	public static int field8933 = 0;

	@ObfuscatedName("client.oo")
	public static int field9096 = -1;

	@ObfuscatedName("client.ou")
	public static int field9235 = -1;

	@ObfuscatedName("client.oz")
	public static int field9098 = -1;

	@ObfuscatedName("client.oj")
	public static int field9018 = -1;

	@ObfuscatedName("client.or")
	public static boolean field9117 = false;

	@ObfuscatedName("client.ok")
	public static int field9101 = -1;

	@ObfuscatedName("client.oh")
	public static int field9102 = -1;

	@ObfuscatedName("client.pp")
	public static String field9103 = null;

	@ObfuscatedName("client.pq")
	public static String field9151 = null;

	@ObfuscatedName("client.px")
	public static volatile int openedTopInterface = -1;

	@ObfuscatedName("client.pt")
	public static IterableMap openedSubInterfaces = new IterableMap(8);

	@ObfuscatedName("client.pa")
	public static int field9107 = 0;

	@ObfuscatedName("client.ps")
	public static class165 field9108 = null;

	@ObfuscatedName("client.pn")
	public static int field9109 = 0;

	@ObfuscatedName("client.po")
	public static int field8905 = 0;

	@ObfuscatedName("client.pb")
	public static boolean field9111 = false;

	@ObfuscatedName("client.pw")
	public static boolean field9112 = false;

	@ObfuscatedName("client.ph")
	public static class165 field9113 = null;

	@ObfuscatedName("client.pr")
	public static boolean field9114 = false;

	@ObfuscatedName("client.pc")
	public static class165 field9115 = null;

	@ObfuscatedName("client.pj")
	public static class165 field9116 = null;

	@ObfuscatedName("client.pi")
	public static int field9160 = 0;

	@ObfuscatedName("client.pl")
	public static int field8977 = 0;

	@ObfuscatedName("client.pf")
	public static class165 field9119 = null;

	@ObfuscatedName("client.pk")
	public static boolean field9037 = false;

	@ObfuscatedName("client.pz")
	public static int field9203 = -1;

	@ObfuscatedName("client.pg")
	public static int field8942 = -1;

	@ObfuscatedName("client.py")
	public static int field9123 = -1;

	@ObfuscatedName("client.pu")
	public static int field8968 = -1;

	@ObfuscatedName("client.qu")
	public static boolean field9080 = false;

	@ObfuscatedName("client.qd")
	public static int field9126 = -1;

	@ObfuscatedName("client.qm")
	public static int field9127 = -1;

	@ObfuscatedName("client.qi")
	public static boolean field8991 = false;

	@ObfuscatedName("client.qo")
	public static int field9150 = 0;

	@ObfuscatedName("client.qr")
	public static boolean field9013 = false;

	@ObfuscatedName("client.qp")
	public static boolean field9041 = false;

	@ObfuscatedName("client.qj")
	public static int field9132 = 1;

	@ObfuscatedName("client.qv")
	public static int[] field9135 = new int[32];

	@ObfuscatedName("client.qe")
	public static int field9183 = 0;

	@ObfuscatedName("client.qy")
	public static int[] field9137 = new int[32];

	@ObfuscatedName("client.qs")
	public static int field9158 = 0;

	@ObfuscatedName("client.qk")
	public static int[] field9139 = new int[32];

	@ObfuscatedName("client.qg")
	public static int field9140 = 0;

	@ObfuscatedName("client.qb")
	public static int[] field9141 = new int[32];

	@ObfuscatedName("client.rk")
	public static int field9036 = 0;

	@ObfuscatedName("client.ry")
	public static int[] field9143 = new int[32];

	@ObfuscatedName("client.rd")
	public static int field9144 = 0;

	@ObfuscatedName("client.rs")
	public static int[] field9145 = new int[32];

	@ObfuscatedName("client.ri")
	public static int field9146 = 0;

	@ObfuscatedName("client.rx")
	public static int field9130 = 0;

	@ObfuscatedName("client.rm")
	public static int field9148 = 0;

	@ObfuscatedName("client.rj")
	public static int field9161 = 0;

	@ObfuscatedName("client.rw")
	public static int field9149 = 0;

	@ObfuscatedName("client.rc")
	public static int field8917 = 0;

	@ObfuscatedName("client.rh")
	public static int field9152 = 0;

	@ObfuscatedName("client.rt")
	public static int field9120 = 0;

	@ObfuscatedName("client.rf")
	public static int field9155 = 0;

	@ObfuscatedName("client.rl")
	public static boolean field9156 = false;

	@ObfuscatedName("client.rz")
	public static long field9157 = -1L;

	@ObfuscatedName("client.ro")
	public static class547 field9089 = new class547();

	@ObfuscatedName("client.rb")
	public static class547 field9159 = new class547();

	@ObfuscatedName("client.rn")
	public static class547 field9125 = new class547();

	@ObfuscatedName("client.rr")
	public static IterableMap field9010 = new IterableMap(512);

	@ObfuscatedName("client.se")
	public static int field9000 = 0;

	@ObfuscatedName("client.sd")
	public static int field8960 = -2;

	@ObfuscatedName("client.so")
	public static boolean[] field9204 = new boolean[100];

	@ObfuscatedName("client.st")
	public static boolean[] field9166 = new boolean[100];

	@ObfuscatedName("client.sz")
	public static Rectangle[] field9167 = new Rectangle[100];

	@ObfuscatedName("client.sb")
	public static int field8929;

	@ObfuscatedName("client.sa")
	public static final int[] field8920;

	@ObfuscatedName("client.sl")
	public static int field9170;

	@ObfuscatedName("client.sf")
	public static int field9105;

	@ObfuscatedName("client.sw")
	public static int[] field9198;

	@ObfuscatedName("client.sy")
	public static int[] field8967;

	@ObfuscatedName("client.sm")
	public static int[] field9186;

	@ObfuscatedName("client.sn")
	public static class117[] field9175;

	@ObfuscatedName("client.su")
	public static final int[] field9073;

	@ObfuscatedName("client.sh")
	public static int field9177;

	@ObfuscatedName("client.sq")
	public static int field9178;

	@ObfuscatedName("client.sc")
	public static long[] field9180;

	@ObfuscatedName("client.sx")
	public static int field9181;

	@ObfuscatedName("client.sv")
	public static String field9182;

	@ObfuscatedName("client.sj")
	public static String field9220;

	@ObfuscatedName("client.tb")
	public static class352[] field9184;

	@ObfuscatedName("client.tf")
	public static int field9185;

	@ObfuscatedName("client.tl")
	public static class37 field8948;

	@ObfuscatedName("client.uw")
	public static boolean[] field9057;

	@ObfuscatedName("client.ub")
	public static int[] field9189;

	@ObfuscatedName("client.us")
	public static int[] field9190;

	@ObfuscatedName("client.ux")
	public static int[] field9191;

	@ObfuscatedName("client.uc")
	public static int[] field9110;

	@ObfuscatedName("client.uo")
	public static short field8904;

	@ObfuscatedName("client.uk")
	public static short field9194;

	@ObfuscatedName("client.ug")
	public static short field9195;

	@ObfuscatedName("client.ue")
	public static short field9196;

	@ObfuscatedName("client.uj")
	public static short field9197;

	@ObfuscatedName("client.uz")
	public static short field9188;

	@ObfuscatedName("client.ua")
	public static short field9199;

	@ObfuscatedName("client.ui")
	public static short field9200;

	@ObfuscatedName("client.uh")
	public static int field9201;

	@ObfuscatedName("client.uf")
	public static int field9202;

	@ObfuscatedName("client.uu")
	public static int field9025;

	@ObfuscatedName("client.ut")
	public static int field9168;

	@ObfuscatedName("client.un")
	public static int field9205;

	@ObfuscatedName("client.um")
	public static int field9206;

	@ObfuscatedName("client.uq")
	public static int field9121;

	@ObfuscatedName("client.ur")
	public static class47[] field9209;

	@ObfuscatedName("client.uv")
	public static class548 field8934;

	@ObfuscatedName("client.uy")
	public static int field9211;

	@ObfuscatedName("client.vx")
	public static class45[] field8999;

	@ObfuscatedName("client.vt")
	public static Calendar field9214;

	@ObfuscatedName("client.vg")
	public static byte field9030;

	@ObfuscatedName("client.vo")
	public static class426 field9216;

	@ObfuscatedName("client.vn")
	public static long field9106;

	@ObfuscatedName("client.vq")
	public static long field9124;

	@ObfuscatedName("client.wf")
	public static final int[] field8955;

	static {
		for (int var0 = 0; var0 < 100; var0++) {
			field9167[var0] = new Rectangle();
		}
		field8929 = 0;
		field8920 = new int[4];
		field9170 = 0;
		field9105 = 50;
		field9198 = new int[field9105];
		field8967 = new int[field9105];
		field9186 = new int[field9105];
		field9175 = new class117[field9105];
		field9073 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		field9177 = 0;
		field9178 = 0;
		field9180 = new long[100];
		field9181 = 0;
		field9182 = null;
		field9220 = null;
		field9184 = new class352[6];
		field9185 = 0;
		field8948 = new class37();
		field9057 = new boolean[5];
		field9189 = new int[5];
		field9190 = new int[5];
		field9191 = new int[5];
		field9110 = new int[5];
		field8904 = 256;
		field9194 = 205;
		field9195 = 256;
		field9196 = 320;
		field9197 = 1;
		field9188 = 32767;
		field9199 = 1;
		field9200 = 32767;
		field9201 = 0;
		field9202 = 0;
		field9025 = 0;
		field9168 = 0;
		field9205 = 0;
		field9206 = 0;
		field9121 = 0;
		field9209 = new class47[200];
		field8934 = new class548();
		field9211 = 0;
		field8999 = new class45[100];
		field9214 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		field9030 = -6;
		field9216 = new class38();
		field9106 = -1L;
		field9124 = -1L;
		field8955 = new int[4];
	}

	public final void init() {
		if (!this.method6660()) {
			return;
		}
		String var1 = "";
		class288[] var2 = class288.method2019();
		for (int var3 = 0; var3 < var2.length; var3++) {
			class288 var4 = var2[var3];
			String var5 = Statics.field6387.getParameter(var4.field3261);
			if (var5 != null) {
				switch(Integer.parseInt(var4.field3261)) {
					case 1:
						field9015 = Integer.parseInt(var5);
						break;
					case 2:
						field9099 = var5;
						if (field9099.length() > 100) {
							field9099 = null;
						}
					case 3:
					case 4:
						break;
					case 5:
						field9020 = var5;
						break;
					case 6:
						Statics.field7543 = Integer.parseInt(var5);
						break;
					case 7:
						field9163 = class527.method14061(Integer.parseInt(var5));
						break;
					case 8:
						if (Statics.field6782 == null) {
							Statics.field6782 = new class573();
						}
						Statics.field6782.field6768 = Integer.parseInt(var5);
						break;
					case 9:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field8998 = true;
						}
						break;
					case 10:
						if (Statics.field6782 == null) {
							Statics.field6782 = new class573();
						}
						Statics.field6782.field6765 = var5;
						break;
					case 11:
						Statics.field6683 = (class515) class518.method8032(class515.method11173(), Integer.parseInt(var5));
						if (Statics.field6683 == class515.field6363) {
							Statics.field6683 = class515.field6369;
						} else if (!class515.method11177(Statics.field6683) && Statics.field6683 != class515.field6368) {
							Statics.field6683 = class515.field6368;
						}
						break;
					case 12:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field9193 = true;
						} else {
							field9193 = false;
						}
						break;
					case 13:
						Statics.field2308 = class519.method11189(Integer.parseInt(var5));
						break;
					case 14:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field8918 = true;
						} else {
							field8918 = false;
						}
						break;
					case 15:
						if (var5.equals(class32.field493)) {
							field9004 = true;
						} else {
							field9004 = false;
						}
						break;
					case 16:
						field8907 = Integer.parseInt(var5);
						if (field8907 < 0 || field8907 >= field8974.length) {
							field8907 = 0;
						}
						break;
					case 17:
						field8922 = var5;
						break;
					case 18:
						Statics.field6773 = new class573();
						Statics.field6773.field6768 = Integer.parseInt(var5);
						break;
					case 19:
					default:
						class983.report("", new RuntimeException());
						break;
					case 20:
						field9043 = Integer.parseInt(var5);
						break;
					case 21:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field8903 = true;
						} else {
							field8903 = false;
						}
						break;
					case 22:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field8915 = true;
						} else {
							field8915 = false;
						}
						break;
					case 23:
						var1 = var5;
						break;
					case 24:
						if (var5 != null) {
							field8909 = class525.method2608(class637.method8264(var5));
							if (field8909.length < 16) {
								field8909 = null;
							}
						}
						break;
					case 25:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field9218 = true;
						} else {
							field9218 = false;
						}
						break;
					case 26:
						if (var5.equalsIgnoreCase(class32.field493)) {
							field8987 = true;
						} else {
							field8987 = false;
						}
						break;
					case 27:
						if (var5.equals(class32.field493)) {
							field8946 = true;
						} else {
							field8946 = false;
						}
						break;
					case 28:
						field8947 = var5;
						break;
					case 29:
						Statics.field4685 = var5;
						break;
					case 30:
						field8921 = var5;
						break;
					case 31:
						Statics.field8439 = var5;
						break;
					case 32:
						Statics.field6817 = var5;
						break;
					case 33:
						Statics.field496 = class545.method7734(Integer.parseInt(var5));
						if (Statics.field496 != class545.field6638 && Statics.field496 != class545.field6640 && Statics.field496 != class545.field6639 && Statics.field496 != class545.field6641) {
							Statics.field496 = class545.field6641;
						}
						break;
					case 34:
						Statics.field7046 = Integer.parseInt(var5);
						break;
					case 35:
						field8910 = Long.parseLong(var5);
				}
			}
		}
		if (field8947 == null) {
			field8947 = "";
		}
		class392 var6 = new class392(field9067, field9068, field9129, field9066, field9163.field6401);
		Statics.field1543 = this;
		String var7 = Statics.field496.field6643;
		int var8 = Statics.field496.field6644 + 32;
		if (!var1.equals("")) {
			var7 = var7 + "_" + var1;
			var8 = 0;
		}
		this.method6717(var6, field9163.field6404, var7, var8, Statics.method15963(), 742, 1, field8918);
	}

	@ObfuscatedName("client.af(B)V")
	public final void method6671() {
		Frame var1 = new Frame(" ");
		var1.pack();
		var1.dispose();
		Statics.field9561 = new class165();
		method13896();
		Statics.field1210 = new class336();
		Statics.field848 = new class758();
		int[] var2 = new int[] { 20, 260 };
		int[] var3 = new int[] { 1000, 100 };
		if (var2 == null || var3 == null) {
			Statics.field642 = null;
			Statics.field6421 = null;
			Statics.field6422 = null;
		} else {
			Statics.field642 = var2;
			Statics.field6421 = new int[var2.length];
			Statics.field6422 = new byte[var2.length][][];
			for (int var4 = 0; var4 < Statics.field642.length; var4++) {
				Statics.field6422[var4] = new byte[var3[var4]][];
			}
		}
		Vector3.method5323(100);
		class316.method5208(10);
		class414.method12209(100);
		Statics.method15563(100);
		if (Statics.field6683 != class515.field6368) {
			Statics.field2391 = new byte[50][];
		}
		Statics.field4961 = Statics.method2808();
		if (Statics.field4961.field9667.method15884() == 1) {
			class423.field4504 = false;
		}
		if (Statics.field6683 == class515.field6368) {
			Statics.field6773.field6765 = Statics.field6387.getCodeBase().getHost();
		} else if (class515.method11177(Statics.field6683)) {
			Statics.field6773.field6765 = Statics.field6387.getCodeBase().getHost();
			Statics.field6773.field6764 = Statics.field6773.field6768 + 40000;
			Statics.field6782.field6764 = Statics.field6782.field6768 + 40000;
			Statics.field6773.field6766 = Statics.field6773.field6768 + 50000;
			Statics.field6782.field6766 = Statics.field6782.field6768 + 50000;
		} else if (Statics.field6683 == class515.field6363) {
			Statics.field6773.field6765 = class32.field494;
			Statics.field6782.field6765 = class32.field494;
			Statics.field6773.field6764 = Statics.field6773.field6768 + 40000;
			Statics.field6782.field6764 = Statics.field6782.field6768 + 40000;
			Statics.field6773.field6766 = Statics.field6773.field6768 + 50000;
			Statics.field6782.field6766 = Statics.field6782.field6768 + 50000;
		}
		Statics.field6772 = Statics.field6773;
		if (field9163 == class527.field6407) {
			field8940 = false;
		}
		Statics.field2744 = class540.field6530 = class611.field7209 = class592.field7118 = new short[256];
		try {
			Statics.field8726 = GameShell.method16494().getToolkit().getSystemClipboard();
		} catch (Exception var6) {
		}
		Statics.field2131 = Statics.method11115(Statics.field1231);
		Statics.field7136 = class414.method8198(Statics.field1231, true);
		Statics.field1307 = new class720(field8948);
		if (Statics.field6683 != class515.field6368) {
			field8926 = true;
		}
		field4128 = class588.field6938.method12206(Statics.field2308);
		Statics.field8656 = new class354();
		(new Thread(Statics.field8656)).start();
	}

	@ObfuscatedName("client.ar(B)V")
	public final void method6672() {
		if (Statics.field4961.field9661.method15781() != 2) {
			this.method14427();
			return;
		}
		try {
			this.method14427();
		} catch (ThreadDeath var3) {
			throw var3;
		} catch (Throwable var4) {
			class983.report(var4.getMessage() + " " + this.method6701(), var4);
			field8928 = true;
			class558.method12023(class628.field7362);
			Statics.method5600(0, false);
		}
	}

	@ObfuscatedName("client.ea(B)V")
	public void method14427() {
		if (field8923 == 13) {
			return;
		}
		if (field8981) {
			Object var1 = field8983;
			synchronized (field8983) {
				field8983.notify();
			}
			Object var3 = field8982;
			synchronized (field8982) {
				try {
					field8982.wait();
				} catch (InterruptedException var13) {
				}
			}
			field8981 = false;
		}
		field9213++;
		if (field9213 % 1000 == 1) {
			GregorianCalendar var6 = new GregorianCalendar();
			Statics.field2113 = var6.get(11) * 600 + var6.get(12) * 10 + var6.get(13) / 6;
			field9207.setSeed((long) Statics.field2113);
		}
		field8975.method1933();
		field8959.method1933();
		this.method14320();
		if (Statics.field3562 != null) {
			Statics.field3562.method5576();
		}
		class395.method7228();
		class521.method16665();
		Statics.field2131.method7231();
		Statics.field7136.method7249();
		if (Statics.field5187 != null) {
			Statics.field5187.method444((int) class153.method5554());
		}
		field8950 = 0;
		field8953 = 0;
		for (class415 var7 = Statics.field2131.method7237(); var7 != null; var7 = Statics.field2131.method7237()) {
			int var8 = var7.method7297();
			if (var8 == 2 || var8 == 3) {
				char var9 = var7.method7298();
				if (class62.method5548() && (var9 == '`' || var9 == 167 || var9 == 178)) {
					if (class62.method14925()) {
						class62.method16885();
					} else {
						class62.method11726();
					}
				} else if (field8950 < 132) {
					field8951[field8950] = var7;
					field8950++;
				}
			} else if (var8 == 0) {
				if (field9074 >= 2 && class62.method5548() && var7.method7286() == 28 && Statics.field2131.method7243(82)) {
					if (class46.method14782()) {
						class46.method8391();
					} else {
						class46.method8497();
					}
				}
				if (field8953 < 77) {
					field9072[field8953] = var7;
					field8953++;
				}
			}
		}
		field9002 = 0;
		for (class809 var10 = Statics.field7136.method7256(); var10 != null; var10 = Statics.field7136.method7256()) {
			int var11 = var10.method15181();
			if (var11 == -1) {
				class477.method4631(var10);
			} else if (var11 == 6) {
				field9002 += var10.method15184();
				var10.method15186();
			} else if (class809.method3926(var11)) {
				field9136.method11558(var10);
				if (field9136.method11613() > 10) {
					class809 var12 = (class809) field9136.method11560();
					if (var12 != null) {
						var12.method15186();
					}
				}
			}
		}
		if (class62.method14925()) {
			class62.method12621();
		}
		if (Statics.method2888(field8923)) {
			Loading.method12645();
			GameShell.method2427();
		} else if (method12326(field8923)) {
			field8980.method6128();
		}
		if (method11059(field8923) && !method12326(field8923)) {
			this.method14639();
			class43.method5945();
			class33.method6853();
		} else if (method12902(field8923) && !method12326(field8923)) {
			this.method14639();
			class33.method6853();
		} else if (field8923 == 4) {
			class33.method6853();
		} else if (method1608(field8923) && !method12326(field8923)) {
			Statics.method6848();
		} else if (field8923 == 9 || field8923 == 0) {
			class33.method6853();
			if (class33.field538 != -3 && class33.field538 != 2 && class33.field538 != 15) {
				if (field8923 == 0) {
					class33.field546 = class33.field509;
					class33.field540 = class33.field543;
					class33.field547 = class33.field538;
					if (Statics.field6776) {
						class574.method8621(Statics.field6775.field6768, Statics.field6775.field6765);
						field8975.method1917();
						method11307(9);
					} else {
						method13897(class33.field536);
					}
				} else {
					method13897(false);
				}
			}
		}
		class52.method185(Statics.field5187);
		field9136.method11560();
	}

	@ObfuscatedName("client.an(I)V")
	public final void method6673() {
		if (Statics.field4961.field9661.method15781() != 2) {
			this.method14317();
			return;
		}
		try {
			this.method14317();
		} catch (ThreadDeath var3) {
			throw var3;
		} catch (Throwable var4) {
			class983.report(var4.getMessage() + " " + this.method6701(), var4);
			field8928 = true;
			class558.method12023(class628.field7362);
			Statics.method5600(0, false);
		}
	}

	@ObfuscatedName("client.em(B)V")
	public void method14317() {
		if (field8923 == 13) {
			return;
		}
		long var1 = GameShell.method13883() / 1000000L - field8927;
		field8927 = GameShell.method13883() / 1000000L;
		boolean var3 = class155.method7075();
		if (var3 && class395.field4203 && Statics.field5198 != null) {
			Statics.field5198.method6497();
		}
		if (method6478(field8923)) {
			if (field9063 != 0L && class153.method5554() > field9063) {
				method7282(method12476(), -1, -1, false);
			} else if (!Statics.field5187.method447() && field4131) {
				method2867();
			}
		}
		if (Statics.field1587 == null) {
			Container var4 = GameShell.method16494();
			int var5 = var4.getSize().width;
			int var6 = var4.getSize().height;
			if (Statics.field1197 == var4) {
				Insets var7 = Statics.field1197.getInsets();
				var5 -= var7.right + var7.left;
				var6 -= var7.top + var7.bottom;
			}
			if (Statics.field2204 != var5 || Statics.field10343 != var6 || field9165) {
				if (Statics.field5187 == null || Statics.field5187.method448()) {
					method13896();
				} else {
					Statics.field2204 = var5;
					Statics.field10343 = var6;
				}
				field9063 = class153.method5554() + 500L;
				field9165 = false;
			}
		}
		if (class560.field6700 && Statics.field1587 != null && !Statics.field578 && method6478(field8923)) {
			method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
		boolean var8 = false;
		if (field4143) {
			field4143 = false;
			var8 = true;
		}
		if (var8) {
			method3536();
		}
		if (Statics.field5187 != null && Statics.field5187.method447() || method12476() != 1) {
			method1703();
		}
		if (Statics.method2888(field8923)) {
			Loading.method15611(var8);
		} else if (method3223(field8923)) {
			method2868();
		} else if (method8612(field8923)) {
			method2868();
		} else if (method12326(field8923)) {
			if (field8980.method6087() == class355.field3775) {
				int var9 = field8980.method6088() / 2;
				Statics.method2579(class588.field6938.method12206(Statics.field2308) + class32.field492 + "(" + var9 + "%)", true, Statics.field5187, Statics.field560, Statics.field9813);
			} else if (field8980.method6087() == class355.field3776) {
				int var10 = field8980.method6224() / 2 + 50;
				Statics.method2579(class588.field6938.method12206(Statics.field2308) + class32.field492 + "(" + var10 + "%)", true, Statics.field5187, Statics.field560, Statics.field9813);
			} else {
				Statics.method2579(class588.field6938.method12206(Statics.field2308), true, Statics.field5187, Statics.field560, Statics.field9813);
			}
		} else if (field8923 == 1) {
			method8591(var1);
		} else if (field8923 == 9) {
			Statics.method2579(class588.field6961.method12206(Statics.field2308) + class32.field492 + class588.field7025.method12206(Statics.field2308), false, Statics.field5187, Statics.field560, Statics.field9813);
		} else if (field8923 == 0) {
			Statics.method2579(class588.field6999.method12206(Statics.field2308), false, Statics.field5187, Statics.field560, Statics.field9813);
		}
		if (field8929 == 3) {
			for (int var11 = 0; var11 < field9000; var11++) {
				Rectangle var12 = field9167[var11];
				if (field9166[var11]) {
					Statics.field5187.method482(var12.x, var12.y, var12.width, var12.height, -65281);
				} else {
					Statics.field5187.method482(var12.x, var12.y, var12.width, var12.height, -16711936);
				}
			}
		}
		if (class62.method14925()) {
			class62.method12188(Statics.field5187);
		}
		if (!Statics.method2888(field8923) && !method12326(field8923) && openedTopInterface != -1) {
			try {
				Statics.field5187.method509();
				Statics.field5187.method466();
			} catch (class881 var15) {
				class983.report(var15.getMessage() + " " + this.method6701(), var15);
				switch(Statics.field4961.field9661.method15781()) {
					case 3:
						class558.method1838(var15.method15970());
						Statics.method5600(1, false);
						break;
					default:
						Statics.method5600(0, false);
				}
			}
		}
		class521.method12632();
		int var14 = Statics.field4961.field9652.method15874();
		if (var14 == 0) {
			class154.method7052(15L);
		} else if (var14 == 1) {
			class154.method7052(10L);
		} else if (var14 == 2) {
			class154.method7052(5L);
		} else if (var14 == 3) {
			class154.method7052(2L);
		}
		if (field8938) {
			method2923();
		}
		if (Statics.field4961.field9669.method15877() == 1 && field8923 == 6 && openedTopInterface != -1) {
			Statics.field4961.method15448(Statics.field4961.field9669, 0);
			Statics.method1245();
		}
	}

	@ObfuscatedName("gb.ey(I)V")
	public static final void method4010() {
		String var0 = Statics.field8439 == null ? method11406() : Statics.field8439;
		class383.method3613(var0, false, Statics.field4961.field9661.method15781() == 5, field8915, field9218);
	}

	@ObfuscatedName("client.ap(I)V")
	public final void method6674() {
		if (field9156) {
			method831();
		}
		Loading.method7247();
		if (Statics.field5187 != null) {
			Statics.field5187.method442();
		}
		if (class560.field6700 && Statics.field1587 != null) {
			Statics.method2431(Statics.field4013, Statics.field1587);
			Statics.field1587 = null;
		}
		field8975.method1916();
		field8975.field847.method1223();
		field8959.method1916();
		field8959.field847.method1223();
		Statics.method12330();
		Statics.field848.method5777();
		Statics.field1210.method5723();
		if (field9192 != null) {
			field9192.method8636();
			field9192 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable var4) {
		}
		class477.method16253();
		try {
			class62.method11118();
		} catch (Exception var3) {
		}
		if (field4146) {
			method4010();
		}
	}

	@ObfuscatedName("client.r(I)Ljava/lang/String;")
	public String method6701() {
		String var1 = " ";
		try {
			class453 var2 = field8980.method6214();
			var1 = var1 + var2.field4836 + class32.field488 + var2.field4838 + class32.field488 + field8980.method6220() + class32.field488 + field8980.method6193() + " ";
			if (Statics.field2119 == null) {
				var1 = var1 + Statics.field7324 + class32.field488 + Statics.field7324 + class32.field488 + Statics.field7324 + class32.field488 + " ";
			} else {
				var1 = var1 + Statics.field7324 + class32.field488 + (var2.field4836 + Statics.field2119.field8642[0]) + class32.field488 + (var2.field4838 + Statics.field2119.field8643[0]) + " ";
			}
			var1 = var1 + Statics.field4961.field9661.method15781() + " " + Statics.field4961.field9637.method15829() + " " + method12476() + " " + Statics.field4125 + class32.field488 + Statics.field4677 + " ";
			var1 = var1 + Statics.field4961.field9650.method15667() + " ";
			var1 = var1 + Statics.field4961.field9651.method15747() + " ";
			var1 = var1 + Statics.field4961.field9666.method15755() + " ";
			var1 = var1 + Statics.field4961.field9659.method15686() + " ";
			var1 = var1 + Statics.field4961.field9673.method15816() + " ";
			var1 = var1 + "0 ";
			var1 = var1 + field4152 + " ";
			var1 = var1 + field8923 + " ";
			if (Statics.field2305 == null) {
				var1 = var1 + -1;
			} else {
				var1 = var1 + Statics.field2305.field9703;
			}
			var1 = var1 + " ";
			if (field8921 == null) {
				var1 = var1 + class32.field488;
			} else {
				var1 = var1 + field8921;
			}
			try {
				if (Statics.field4961.field9661.method15781() == 2) {
					Class var3 = Class.forName("java.lang.ClassLoader");
					Field var4 = var3.getDeclaredField("nativeLibraries");
					Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
					Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
					var6.invoke(var4, Boolean.TRUE);
					Vector var7 = (Vector) var4.get(client.class.getClassLoader());
					for (int var8 = 0; var8 < var7.size(); var8++) {
						try {
							Object var9 = var7.elementAt(var8);
							Field var10 = var9.getClass().getDeclaredField("name");
							var6.invoke(var10, Boolean.TRUE);
							try {
								String var11 = (String) var10.get(var9);
								if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
									Field var12 = var9.getClass().getDeclaredField("handle");
									var6.invoke(var12, Boolean.TRUE);
									var1 = var1 + " " + Long.toHexString(var12.getLong(var9));
									var6.invoke(var12, Boolean.FALSE);
								}
							} catch (Throwable var17) {
							}
							var6.invoke(var10, Boolean.FALSE);
						} catch (Throwable var18) {
						}
					}
				}
			} catch (Throwable var19) {
			}
		} catch (Throwable var20) {
		}
		return var1;
	}

	@ObfuscatedName("mb.ep(II)Z")
	public static boolean method6478(int arg0) {
		return arg0 == 6 || arg0 == 15 || arg0 == 11 || arg0 == 1;
	}

	@ObfuscatedName("vc.fd(II)Z")
	public static boolean method12490(int arg0) {
		return arg0 == 11 || arg0 == 7;
	}

	@ObfuscatedName("vj.fr(II)Z")
	public static boolean method12326(int arg0) {
		return arg0 == 5 || arg0 == 19 || arg0 == 16 || arg0 == 7 || arg0 == 17;
	}

	@ObfuscatedName("rn.fa(II)Z")
	public static boolean method11059(int arg0) {
		return arg0 == 6 || arg0 == 5 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
	}

	@ObfuscatedName("ei.fc(II)Z")
	public static boolean method3223(int arg0) {
		return arg0 == 6 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
	}

	@ObfuscatedName("yf.fp(II)Z")
	public static boolean method12902(int arg0) {
		return arg0 == 15 || arg0 == 19 || arg0 == 11 || arg0 == 7;
	}

	@ObfuscatedName("rc.fv(IB)Z")
	public static boolean method8612(int arg0) {
		return arg0 == 15 || arg0 == 11;
	}

	@ObfuscatedName("k.fn(II)Z")
	public static boolean method1608(int arg0) {
		return arg0 == 1 || arg0 == 16 || arg0 == 4;
	}

	@ObfuscatedName("sj.fl(II)V")
	public static void method11307(int arg0) {
		if (field8923 == arg0) {
			return;
		}
		field9017 = 0;
		if (arg0 == 9 || arg0 == 0) {
			class33.method3950();
		}
		if (arg0 != 9 && Statics.field3529 != null) {
			Statics.field3529.method7192();
			Statics.field3529 = null;
		}
		if (arg0 == 6) {
			method12035(field8923 == 14 || field8923 == 8 || openedTopInterface != Statics.field4825.field5162);
		}
		if (arg0 == 15) {
			method1350(openedTopInterface != Statics.field4825.field5158);
		}
		if (arg0 == 3 || arg0 == 4) {
			if (!class33.method7860()) {
				return;
			}
		} else if (arg0 == 18 || arg0 == 11 && field8923 != 7) {
			if (!class33.method3950()) {
				return;
			}
		} else if (arg0 == 8) {
			class43.method15481();
		}
		if (method12326(arg0)) {
			field8980.method6112();
			class822.method7184(true);
		}
		if (arg0 == 16 || arg0 == 6) {
			method12288();
		}
		boolean var1 = arg0 == 10 || method11059(arg0) || method12902(arg0);
		boolean var2 = field8923 == 10 || method11059(field8923) || method12902(field8923);
		if (var1 != var2) {
			if (var1) {
				class395.field4202 = class395.field4205;
				if (Statics.field4961.field9675.method15899() == 0) {
					class155.method3311(2);
				} else {
					class155.method11764(2, Statics.field9367, class395.field4205, 0, Statics.field4961.field9675.method15899(), false);
					class395.method2572();
				}
				Statics.field848.method5744(false);
			} else {
				class155.method3311(2);
				Statics.field848.method5744(true);
			}
		}
		if (method12326(arg0) || arg0 == 9 || arg0 == 0) {
			Statics.field5187.method587();
		}
		field8923 = arg0;
	}

	@ObfuscatedName("client.ff(B)V")
	public void method14320() {
		boolean var1 = Statics.field848.method5742();
		if (!var1) {
			this.method14321();
		}
	}

	@ObfuscatedName("client.fx(I)V")
	public void method14321() {
		if (Statics.field848.field3602 > field9215) {
			Statics.field6772.method12026();
			field9164 = Statics.field848.field3602 * 250 - 250;
			if (field9164 > 3000) {
				field9164 = 3000;
			}
			if (Statics.field848.field3602 >= 2 && Statics.field848.field3591 == 6) {
				this.method6675("js5connect_outofdate");
				field8923 = 13;
				return;
			}
			if (Statics.field848.field3602 >= 1 && Statics.field848.field3591 == 48) {
				this.method6675("sessionexpired");
				field8923 = 13;
				return;
			}
			if (Statics.field848.field3602 >= 4 && Statics.field848.field3591 == -1) {
				this.method6675("js5crc");
				field8923 = 13;
				return;
			}
			if (Statics.field848.field3602 >= 4 && Statics.method2888(field8923)) {
				if (Statics.field848.field3591 == 7 || Statics.field848.field3591 == 9) {
					this.method6675("js5connect_full");
				} else if (Statics.field848.field3591 <= 0) {
					this.method6675("js5io");
				} else if (field8962 == null) {
					this.method6675("js5connect");
				} else {
					this.method6675("js5proxy_" + field8962.trim());
				}
				field8923 = 13;
				return;
			}
		}
		field9215 = Statics.field848.field3602;
		if (field9164 > 0) {
			field9164--;
			return;
		}
		try {
			if (field8958 == 0) {
				Statics.field4215 = Statics.field6772.method12025();
				field8958++;
			}
			if (field8958 == 1) {
				Statics.field3614 = class411.method12184(Statics.field4215, 125000);
				int var1 = field8921.length() + 9;
				Packet var2 = new Packet(var1 + 2);
				var2.method15308(class281.field2960.field2970);
				var2.method15308(var1);
				var2.method15223(742);
				var2.method15223(2);
				var2.method15228(field8921);
				Statics.field3614.method7193(var2.data, 0, var1 + 2);
				field8958++;
				Statics.field4263 = class153.method5554();
			}
			if (field8958 == 2) {
				if (Statics.field3614.method7212(1)) {
					byte[] var3 = new byte[1];
					int var4 = Statics.field3614.method7196(var3, 0, 1);
					if (var3[0] != 0) {
						this.method14702(var4);
						return;
					}
					field8958++;
				} else if (class153.method5554() - Statics.field4263 > 30000L) {
					this.method14702(1001);
					return;
				}
			}
			if (field8958 == 3) {
				class587[] var5 = class587.method12194();
				int var6 = var5.length * 4;
				if (Statics.field3614.method7212(var6)) {
					Packet var7 = new Packet(var6);
					Statics.field3614.method7196(var7.data, 0, var7.data.length);
					for (int var8 = 0; var8 < var5.length; var8++) {
						var5[var8].method12191(var7.g4s());
					}
					boolean var9 = Statics.method2888(field8923) || method11059(field8923) || method12902(field8923);
					Statics.field848.method5743(Statics.field3614, !var9);
					Statics.field4215 = null;
					Statics.field3614 = null;
					field8958 = 0;
				}
			}
		} catch (IOException var11) {
			this.method14702(1002);
		}
	}

	@ObfuscatedName("client.fy(II)V")
	public void method14702(int arg0) {
		Statics.field4215 = null;
		Statics.field3614 = null;
		field8958 = 0;
		Statics.field848.field3602++;
		Statics.field848.field3591 = arg0;
	}

	@ObfuscatedName("uf.fj(ZB)V")
	public static void method12035(boolean arg0) {
		if (arg0) {
			if (openedTopInterface != -1) {
				class165.method13890(openedTopInterface);
			}
			for (class816 var1 = (class816) openedSubInterfaces.method11928(); var1 != null; var1 = (class816) openedSubInterfaces.method11929()) {
				if (!var1.method6982()) {
					var1 = (class816) openedSubInterfaces.method11928();
					if (var1 == null) {
						break;
					}
				}
				method7069(var1, true, false);
			}
			openedTopInterface = -1;
			openedSubInterfaces = new IterableMap(8);
			Statics.method4591();
			openedTopInterface = Statics.field4825.field5162;
			method1969(false);
			method1703();
			ScriptRunner.runOnLoad(openedTopInterface, null);
		}
		class33.method12896();
		class33.field536 = false;
		class42.method3475();
		field9235 = -1;
		Statics.method7913(field9096);
		Statics.field2119 = new class902(null);
		Statics.field2119.method8552((float) (field8980.method6220() * 512 / 2), 0.0F, (float) (field8980.method6193() * 512 / 2));
		Statics.field2119.field8642[0] = field8980.method6220() / 2;
		Statics.field2119.field8643[0] = field8980.method6193() / 2;
		Statics.field8424 = 0;
		Statics.field6769 = 0;
		if (Statics.field2671 == 3) {
			Statics.field6769 = Statics.field1577 * 512 << 9;
			Statics.field8424 = Statics.field2123 << 9;
		} else {
			method6648();
		}
		field8980.method6139().method8154();
	}

	@ObfuscatedName("t.fo(ZI)V")
	public static void method1350(boolean arg0) {
		if (arg0) {
			if (openedTopInterface != -1) {
				class165.method13890(openedTopInterface);
			}
			for (class816 var1 = (class816) openedSubInterfaces.method11928(); var1 != null; var1 = (class816) openedSubInterfaces.method11929()) {
				if (!var1.method6982()) {
					var1 = (class816) openedSubInterfaces.method11928();
					if (var1 == null) {
						break;
					}
				}
				method7069(var1, true, false);
			}
			openedTopInterface = -1;
			openedSubInterfaces = new IterableMap(8);
			Statics.method4591();
			openedTopInterface = Statics.field4825.field5158;
			method1969(false);
			method1703();
			ScriptRunner.runOnLoad(openedTopInterface, null);
		}
		class33.field536 = true;
	}

	@ObfuscatedName("pp.fm(Lee;ZIZB)Lls;")
	public static class334 method7706(class162 arg0, boolean arg1, int arg2, boolean arg3) {
		if (Statics.field4456 == null) {
			Statics.field4456 = new class757[Statics.method15963()];
		}
		class410 var4 = null;
		int var5 = arg0.method3089();
		if (field4119 != null) {
			var4 = new class410(var5, field4119, Statics.field4245[var5], 1500000);
		}
		Statics.field4456[var5] = Statics.field3562.method5579(var5, var4, Statics.field7137);
		Statics.field4456[var5].method14250();
		return new class334(Statics.field4456[var5], arg1, arg2);
	}

	@ObfuscatedName("ga.fk(I)Lad;")
	public static class64 method4104() {
		return method12902(field8923) ? field8959 : field8975;
	}

	@ObfuscatedName("iw.fu(ILjava/lang/String;ZS)V")
	public static void method4567(int arg0, String arg1, boolean arg2) {
		Loading.method7247();
		method11395();
		method11119();
		method11054(arg0, arg1, arg2);
		Statics.field6784.method4838();
		Statics.field6784.method4837(field8914);
		class35.method2931(Statics.field5187);
		class35.method15812(Statics.field5187, Statics.field7387);
		class42.method3963();
		class42.method3288(Statics.field8538);
		method1703();
		method13901();
		if (field8923 == 6) {
			method11307(5);
		} else if (field8923 == 15) {
			method11307(19);
		} else if (field8923 == 11) {
			method11307(7);
		} else if (field8923 == 1) {
			method11307(16);
		} else if (field8923 == 2 || field8923 == 10) {
			Loading.method3502();
		} else if (field8923 == 14) {
			method11307(17);
		} else if (field8923 == 16) {
			class797.method6259(false);
		}
	}

	@ObfuscatedName("rb.fh(ILjava/lang/String;ZI)V")
	public static void method11054(int arg0, String arg1, boolean arg2) {
		if (arg0 == 0) {
			Statics.field5187 = class14.method11222(0, Statics.field1231, Statics.field8465, Statics.field2670, Statics.field4961.field9665.method15829() * 2);
			if (arg1 != null) {
				Statics.field5187.method505(1, 0);
				class603 var3 = class603.method12156(Statics.field8745, Statics.field552, 0);
				class15 var4 = Statics.field5187.method712(var3, (class685[]) class125.method2591(Statics.field7387, Statics.field552, 0), true);
				method3536();
				Statics.method2579(arg1, true, Statics.field5187, var4, var3);
			}
		} else {
			label230: {
				class14 var5 = null;
				if (arg1 != null) {
					var5 = class14.method11222(0, Statics.field1231, Statics.field8465, Statics.field2670, 0);
					var5.method505(1, 0);
					class603 var6 = class603.method12156(Statics.field8745, Statics.field552, 0);
					class15 var7 = var5.method712(var6, (class685[]) class125.method2591(Statics.field7387, Statics.field552, 0), true);
					method3536();
					Statics.method2579(arg1, true, var5, var7, var6);
				}
				try {
					try {
						Statics.field5187 = class14.method11222(arg0, Statics.field1231, Statics.field8465, Statics.field2670, Statics.field4961.field9665.method15829() * 2);
						if (arg1 != null) {
							var5.method505(1, 0);
							class603 var8 = class603.method12156(Statics.field8745, Statics.field552, 0);
							class15 var9 = var5.method712(var8, (class685[]) class125.method2591(Statics.field7387, Statics.field552, 0), true);
							method3536();
							Statics.method2579(arg1, true, var5, var9, var8);
						}
						if (Statics.field5187.method629()) {
							boolean var10 = true;
							try {
								var10 = Statics.field2305.field9703 > 256;
							} catch (Throwable var26) {
							}
							class28 var12;
							if (var10) {
								var12 = Statics.field5187.method593(146800640);
							} else {
								var12 = Statics.field5187.method593(104857600);
							}
							Statics.field5187.method502(var12);
						}
						break label230;
					} catch (Throwable var27) {
						switch(arg0) {
							case 1:
								class558.method12023(class628.field7357);
								break;
							case 2:
								class558.method12023(class628.field7365);
								break;
							case 3:
								class558.method12023(class628.field7358);
						}
					}
					int var15 = Statics.field4961.field9661.method15781();
					if (var15 == 2) {
						field8928 = true;
					}
					Statics.field4961.method15448(Statics.field4961.field9661, 0);
					method11054(var15, arg1, arg2);
				} finally {
					if (var5 != null) {
						try {
							var5.method442();
						} catch (Throwable var25) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			Statics.field4961.method15449(Statics.field4961.field9661, !arg2);
		}
		Statics.field4961.method15448(Statics.field4961.field9661, arg0);
		if (!arg2) {
			Statics.field4961.method15449(Statics.field4961.field9661, !arg2);
		}
		Statics.method7897();
		Statics.field5187.method673(10000);
		Statics.field5187.method531(32);
		field8980.method6235();
		if (Statics.field5187.method450()) {
			method1741(Statics.field4961.field9673.method15816() == 1);
		}
		field8980.method6086();
		field8980.method6139().method8154();
		field8932 = false;
		field9165 = true;
		Statics.field8518 = null;
		Statics.field5187.method475(0.0F, 1.0F);
	}

	@ObfuscatedName("ud.fz(Lka;ZFFFFIII)V")
	public static void method12142(class320 arg0, boolean arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
		int var8 = field8980.method6108();
		int var9 = field8980.method6096();
		arg0.method5397(arg2, arg3, arg4, arg5, (float) var9, (float) var8, (float) arg6, (float) arg7);
	}

	@ObfuscatedName("tb.fi(B)V")
	public static void method11395() {
		if (Statics.field5187 == null) {
			return;
		}
		field8980.method6111();
		class58.method7992();
		class42.method3963();
		Statics.method3616();
		field8980.method6086();
		class366.method2612();
		method5025(false);
		class35.method3095();
		class822.method7184(true);
		class822.method7071();
		Loading.method3502();
		for (int var0 = 0; var0 < field9044.length; var0++) {
			if (field9044[var0] != null) {
			}
		}
		for (int var1 = 0; var1 < 2048; var1++) {
			class902 var2 = field9070[var1];
			if (var2 != null) {
				for (int var3 = 0; var3 < var2.field8651.length; var3++) {
					var2.field8651[var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field8966; var4++) {
			class903 var5 = (class903) field8965[var4].field9550;
			if (var5 != null) {
				for (int var6 = 0; var6 < var5.field8651.length; var6++) {
					var5.field8651[var6] = null;
				}
			}
		}
		field9090.method11925();
		Statics.field5187.method442();
		Statics.field5187 = null;
	}

	@ObfuscatedName("sd.fb(I)V")
	public static void method11119() {
		Statics.field2131.method7233();
		Statics.field7136.method7257();
		Statics.field1543.method6657();
		Statics.field1231.setBackground(Color.black);
		field9018 = -1;
		Statics.field2131 = Statics.method11115(Statics.field1231);
		Statics.field7136 = class414.method8198(Statics.field1231, true);
	}

	@ObfuscatedName("dn.fw(B)V")
	public static void method2867() {
		if (Statics.field5187.method455()) {
			Statics.field5187.method461(Statics.field1231);
			method11119();
			Dimension var0 = Statics.field1231.getSize();
			Statics.field5187.method459(Statics.field1231, var0.width, var0.height);
			Statics.field5187.method462(Statics.field1231);
		} else {
			Statics.method5600(Statics.field4961.field9661.method15781(), false);
		}
		method1703();
	}

	@ObfuscatedName("n.fs(III)I")
	public static int method1380(int arg0, int arg1) {
		if (Statics.field4825.field5156 == -1) {
			return 1;
		}
		if (arg0 != Statics.field4961.field9661.method15781()) {
			method4567(arg0, class588.field6960.method12206(Statics.field2308), true);
			if (Statics.field4961.field9661.method15781() != arg0) {
				return -1;
			}
		}
		try {
			Dimension var2 = Statics.field1231.getSize();
			Statics.method2579(class588.field6960.method12206(Statics.field2308), true, Statics.field5187, Statics.field560, Statics.field9813);
			class129 var3 = class129.method2664(Statics.field4560, Statics.field4825.field5156, 0);
			long var4 = class153.method5554();
			Statics.field5187.method753();
			field8925.method5114(0.0F, 256.0F, 0.0F);
			Statics.field5187.method524(field8925);
			class320 var6 = Statics.field5187.method781();
			var6.method5397((float) (var2.width / 2), (float) (var2.height / 2), 512.0F, 512.0F, (float) field8980.method6096(), (float) field8980.method6108(), (float) var2.width, (float) var2.height);
			Statics.field5187.method784(var6);
			Statics.field5187.method529(1.0F);
			Statics.field5187.method530(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			class13 var7 = Statics.field5187.method625(var3, 2048, 64, 64, 768);
			int var8 = 0;
			label42: for (int var9 = 0; var9 < 500; var9++) {
				Statics.field5187.method505(3, 0);
				for (int var10 = 15; var10 >= 0; var10--) {
					for (int var11 = 0; var11 <= var10; var11++) {
						field8979.method5114((float) (((float) var11 - (float) var10 / 2.0F) * 512.0F), 0.0F, (float) ((var10 + 1) * 512));
						var7.method271(field8979, null, 0);
						var8++;
						if (class153.method5554() - var4 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Statics.field5187.method441();
			long var12 = (long) (var8 * 1000) / (class153.method5554() - var4);
			Statics.field5187.method505(3, 0);
			return (int) var12;
		} catch (Throwable var15) {
			var15.printStackTrace();
			return -1;
		}
	}

	@ObfuscatedName("vy.fe(B)I")
	public static int method12476() {
		if (class560.field6700 && Statics.field1587 != null) {
			return 3;
		} else if (field9064) {
			return 2;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("ob.fq(IIIZI)V")
	public static void method7282(int arg0, int arg1, int arg2, boolean arg3) {
		field9063 = 0L;
		int var4 = method12476();
		if (arg0 == 3 || var4 == 3) {
			arg3 = true;
		}
		if (!Statics.field5187.method448()) {
			arg3 = true;
		}
		method3588(var4, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("fx.ft(IIIIZB)V")
	public static void method3588(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (class560.field6700 && Statics.field1587 != null && (arg1 != 3 || Statics.field6693 != arg2 || Statics.field3315 != arg3)) {
			Statics.method2431(Statics.field4013, Statics.field1587);
			Statics.field1587 = null;
		}
		if (class560.field6700 && arg1 == 3 && Statics.field1587 == null) {
			Statics.field1587 = class560.method6036(Statics.field4013, arg2, arg3, 0, 0);
			if (Statics.field1587 != null) {
				Statics.field6693 = arg2;
				Statics.field3315 = arg3;
				Statics.method1245();
			}
		}
		if (arg1 == 3 && (!class560.field6700 || Statics.field1587 == null)) {
			method3588(arg0, Statics.field4961.field9663.method15766(), -1, -1, true);
			return;
		}
		Container var5 = GameShell.method16494();
		if (Statics.field1587 != null) {
			Statics.field2204 = arg2;
			Statics.field10343 = arg3;
		} else if (Statics.field1197 == null) {
			Statics.field2204 = var5.getSize().width;
			Statics.field10343 = var5.getSize().height;
		} else {
			Insets var6 = Statics.field1197.getInsets();
			int var10001 = var6.right + var6.left;
			Statics.field2204 = Statics.field1197.getSize().width - var10001;
			int var9 = var6.top + var6.bottom;
			Statics.field10343 = Statics.field1197.getSize().height - var9;
		}
		if (Statics.field2204 <= 0) {
			Statics.field2204 = 1;
		}
		if (Statics.field10343 <= 0) {
			Statics.field10343 = 1;
		}
		if (arg1 == 1) {
			Statics.field4125 = field9067;
			field4147 = (Statics.field2204 - field9067) / 2;
			Statics.field4677 = field9068;
			field4127 = 0;
		} else {
			method4635();
		}
		if (Statics.field6683 != class515.field6368 && Statics.field4125 < 1024 && Statics.field4677 < 768) {
		}
		if (arg4) {
			method2867();
		} else {
			Statics.field1231.setSize(Statics.field4125, Statics.field4677);
			Statics.field5187.method463(Statics.field1231, Statics.field4125, Statics.field4677);
			if (Statics.field1197 == var5) {
				Insets var7 = Statics.field1197.getInsets();
				Statics.field1231.setLocation(field4147 + var7.left, field4127 + var7.top);
			} else {
				Statics.field1231.setLocation(field4147, field4127);
			}
		}
		if (arg1 >= 2) {
			field9064 = true;
		} else {
			field9064 = false;
		}
		method3538();
		if (openedTopInterface != -1) {
			method1969(true);
		}
		if (field8975.method1927() != null && method1608(field8923)) {
			method15612();
		}
		for (int var8 = 0; var8 < 100; var8++) {
			field9204[var8] = true;
		}
		field4143 = true;
	}

	@ObfuscatedName("aev.gw(B)V")
	public static void method15612() {
		class792 var0 = class792.method14781(class280.field2880, field8975.field834);
		var0.field9467.method15308(method12476());
		var0.field9467.method15287(Statics.field4125);
		var0.field9467.method15287(Statics.field4677);
		var0.field9467.method15308(Statics.field4961.field9665.method15829());
		field8975.method1913(var0);
	}

	@ObfuscatedName("zq.gn(B)V")
	public static void method13896() {
		client var0 = Statics.field1543;
		synchronized (Statics.field1543) {
			if (Statics.field1587 == null) {
				Container var1 = GameShell.method16494();
				if (var1 != null) {
					Statics.field2204 = var1.getSize().width;
					Statics.field10343 = var1.getSize().height;
					if (Statics.field1197 == var1) {
						Insets var2 = Statics.field1197.getInsets();
						Statics.field2204 -= var2.right + var2.left;
						Statics.field10343 -= var2.top + var2.bottom;
					}
					if (Statics.field2204 <= 0) {
						Statics.field2204 = 1;
					}
					if (Statics.field10343 <= 0) {
						Statics.field10343 = 1;
					}
					if (method12476() == 1) {
						Statics.field4125 = field9067;
						field4147 = (Statics.field2204 - field9067) / 2;
						Statics.field4677 = field9068;
						field4127 = 0;
					} else {
						method4635();
					}
					if (Statics.field6683 != class515.field6368 && Statics.field4125 < 1024 && Statics.field4677 < 768) {
					}
					Statics.field1231.setSize(Statics.field4125, Statics.field4677);
					if (Statics.field5187 != null) {
						Statics.field5187.method463(Statics.field1231, Statics.field4125, Statics.field4677);
					}
					if (Statics.field1197 == var1) {
						Insets var3 = Statics.field1197.getInsets();
						Statics.field1231.setLocation(field4147 + var3.left, field4127 + var3.top);
					} else {
						Statics.field1231.setLocation(field4147, field4127);
					}
					method3538();
					if (openedTopInterface != -1) {
						method1969(true);
					}
					method3536();
				}
			}
		}
	}

	@ObfuscatedName("fc.gp(S)V")
	public static void method3538() {
		int var0 = Statics.field4125;
		int var1 = Statics.field4677;
		if (Statics.field2204 < var0) {
			var0 = Statics.field2204;
		}
		if (Statics.field10343 < var1) {
			var1 = Statics.field10343;
		}
		try {
			class284.field3144.method4763(new Object[] { var0, var1, method12476(), Statics.field4961.field9677.method15794() });
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("is.gq(I)V")
	public static void method4635() {
		int var0 = 0;
		if (Statics.field4961 != null) {
			var0 = Statics.field4961.field9677.method15794();
		}
		if (var0 == 2) {
			int var1 = Statics.field2204 > 800 ? 800 : Statics.field2204;
			int var2 = Statics.field10343 > 600 ? 600 : Statics.field10343;
			Statics.field4125 = var1;
			field4147 = (Statics.field2204 - var1) / 2;
			Statics.field4677 = var2;
			field4127 = 0;
		} else if (var0 == 1) {
			int var3 = Statics.field2204 > 1024 ? 1024 : Statics.field2204;
			int var4 = Statics.field10343 > 768 ? 768 : Statics.field10343;
			Statics.field4125 = var3;
			field4147 = (Statics.field2204 - var3) / 2;
			Statics.field4677 = var4;
			field4127 = 0;
		} else {
			Statics.field4125 = Statics.field2204;
			field4147 = 0;
			Statics.field4677 = Statics.field10343;
			field4127 = 0;
		}
	}

	@ObfuscatedName("fc.gz(I)V")
	public static void method3536() {
		if (Statics.field1587 != null) {
			return;
		}
		int var0 = field4147;
		int var1 = field4127;
		int var2 = Statics.field2204 - Statics.field4125 - var0;
		int var3 = Statics.field10343 - Statics.field4677 - var1;
		if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
			return;
		}
		try {
			Container var4 = GameShell.method16494();
			int var5 = 0;
			int var6 = 0;
			if (Statics.field1197 == var4) {
				Insets var7 = Statics.field1197.getInsets();
				var5 = var7.left;
				var6 = var7.top;
			}
			Graphics var8 = var4.getGraphics();
			var8.setColor(Color.black);
			if (var0 > 0) {
				var8.fillRect(var5, var6, var0, Statics.field10343);
			}
			if (var1 > 0) {
				var8.fillRect(var5, var6, Statics.field2204, var1);
			}
			if (var2 > 0) {
				var8.fillRect(Statics.field2204 + var5 - var2, var6, var2, Statics.field10343);
			}
			if (var3 > 0) {
				var8.fillRect(var5, Statics.field10343 + var6 - var3, Statics.field2204, var3);
			}
		} catch (Exception var10) {
		}
	}

	@ObfuscatedName("ag.gk(ZI)Z")
	public static boolean method1741(boolean arg0) {
		boolean var1 = Statics.field5187.method600();
		if (arg0 == var1) {
			return true;
		}
		if (!arg0) {
			Statics.field5187.method558();
		} else if (!Statics.field5187.method539()) {
			arg0 = false;
		}
		if (arg0 == var1) {
			return false;
		} else {
			Statics.field4961.method15448(Statics.field4961.field9673, arg0 ? 1 : 0);
			Statics.method1245();
			return true;
		}
	}

	@ObfuscatedName("zx.gm(B)V")
	public static void method13901() {
		int var0 = 0;
		if (Statics.field4961.field9650.method15667() == 1) {
			int var1 = var0 | 0x1;
			int var2 = var1 | 0x10;
			int var3 = var2 | 0x20;
			int var4 = var3 | 0x2;
			var0 = var4 | 0x4;
		}
		if (Statics.field4961.field9659.method15686() == 0) {
			var0 |= 0x40;
		}
		class165.method1903(var0);
		field8980.method6103().method11473(var0);
		Statics.field8656.method6040().method6103().method11473(var0);
		Statics.field3492.method12295(var0);
		Statics.field3774.method12557(var0);
		Statics.field4213.method11084(var0);
		class60.method5011(var0);
		class396.method3109(var0);
		class48.method7280(var0);
		Statics.method7906(var0);
		class769.method1319(var0);
		field8980.method6102();
	}

	@ObfuscatedName("pt.gh(I)V")
	public static final void method7731() {
		field9059 = -1;
		field8988 = 2;
		Statics.field4561 = null;
		Statics.field416 = null;
		class144.method2911();
	}

	@ObfuscatedName("zp.gr(ZB)V")
	public static final void method13897(boolean arg0) {
		class64[] var1 = field9011;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class64 var3 = var1[var2];
			try {
				var3.method1912();
			} catch (IOException var7) {
			}
			var3.method1916();
		}
		class33.method14090();
		method5025(false);
		field8980.method6111();
		field8980.method6110();
		class822.method7184(false);
		class46.method8391();
		class155.method3311(2);
		class395.field4202 = -1;
		class395.field4203 = false;
		class395.method2572();
		class797.method6259(true);
		class822.method3465();
		class822.method3318();
		Statics.method1681();
		if (arg0) {
			method11307(4);
			return;
		}
		method11307(6);
		try {
			class582.method12167(Statics.field6387, "loggedout");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("et.gf(B)V")
	public static final void method2923() {
		Statics.field3615.method8501(5);
		Statics.field4450.method11896(5);
		Statics.field7650.method3911(5);
		field8980.method6103().method11487(5);
		Statics.field3774.method12556(5);
		Statics.field3492.method12291(5);
		Statics.field566.method11147(5);
		Statics.field4213.method11085(5);
		Statics.field4645.method7661(5);
		Statics.field6667.method4882(5);
		Statics.field1510.method12006(5);
		Statics.field7196.method11310(5);
		Statics.field7390.method12674(5);
		Statics.field1202.method8292(5);
		Statics.field3769.method7775(5);
		Statics.field8499.method7865(5);
		Statics.field850.method12495(5);
		Statics.field4464.method12596(5);
		Statics.field4678.method7368(5);
		Statics.field6360.method3608(5);
		Statics.field785.method12455(5);
		Statics.field3770.method12373(5);
		Statics.field5037.method7818(5);
		Statics.field6705.method7327(5);
		class471.method4781(5);
		class165.method11405(50);
		Statics.field6784.method4846(50);
		class60.method8096(5);
		class48.method8061(5);
		field9131.method7921(5);
		class42.field620.method7921(5);
		ScriptRunner.field5207.method7921(5);
	}

	@ObfuscatedName("ki.gb(ZI)V")
	public static final void method5025(boolean arg0) {
		if (!arg0) {
			Statics.field3615.method8500();
			Statics.field4450.method11894();
			Statics.field7650.method3910();
			field8980.method6103().method11479();
			Statics.field3774.method12558();
			Statics.field3492.method12296();
			Statics.field566.method11143();
			Statics.field4213.method11088();
			Statics.field4645.method7660();
			Statics.field6667.method4881();
			Statics.field1510.method12005();
			Statics.field7196.method11312();
			Statics.field7390.method12671();
			Statics.field1202.method8291();
			Statics.field3769.method7774();
			Statics.field850.method12496();
			Statics.field8499.method7864();
			Statics.field4464.method12595();
			Statics.field4678.method7363();
			Statics.field6360.method3602();
			Statics.field785.method12464();
			Statics.field3770.method12372();
			Statics.field5037.method7817();
			Statics.field6705.method7329();
			class471.method1323();
			class165.method7973();
			Statics.field6784.method4849();
			class769.method6970();
			if (Statics.field6683 != class515.field6368) {
				for (int var1 = 0; var1 < Statics.field2391.length; var1++) {
					Statics.field2391[var1] = null;
				}
				field8930 = 0;
			}
			field8980.method6139().method8178();
			class60.method7558();
			class48.method4036();
			class273.method4807();
			class274.method7882();
			ScriptRunner.field5207.method7922();
			field9131.method7922();
			class42.field620.method7922();
		}
		Statics.method4012();
		Statics.method7897();
	}

	@ObfuscatedName("qi.go(I)V")
	public static final void method8047() {
		if (method12902(field8923) || method11059(field8923)) {
			method13897(false);
		} else {
			Statics.field3529 = field8975.method1927();
			field8975.method1917();
			method11307(9);
		}
	}

	@ObfuscatedName("ra.gi(I)V")
	public static void method831() {
		class576 var0 = null;
		try {
			var0 = GameShell.method4031("2", field9163.field6404, true);
			Packet var1 = new Packet(field9155 * 6 + 3);
			var1.method15308(1);
			var1.method15287(field9155);
			for (int var2 = 0; var2 < Statics.field6666.length; var2++) {
				if (Statics.field2210[var2]) {
					var1.method15287(var2);
					var1.method15223(Statics.field6666[var2]);
				}
			}
			var0.method12075(var1.data, 0, var1.pos);
		} catch (Exception var6) {
		}
		try {
			if (var0 != null) {
				var0.method12076();
			}
		} catch (Exception var5) {
		}
		field9157 = class153.method5554();
		field9156 = false;
	}

	@ObfuscatedName("client.ga(I)V")
	public final void method14639() {
		if (field8923 == 15 && !Statics.method16489() || field8923 == 11 && class33.field538 == 42 || field8923 == 3 && (class33.field537 == 49 || class33.field537 == 52) || field8923 == 14) {
			if (field8935 > 1) {
				field8935--;
				field9120 = field9132;
			}
			if (!class42.field585) {
				class42.method1401();
			}
			if (field8923 != 3 || class33.field537 != 49 && class33.field537 != 52) {
				for (int var1 = 0; var1 < 100 && method4610(field8959); var1++) {
				}
			}
		}
		method8601();
		class477.method4689();
		field8931++;
		Statics.method11384(-1, -1);
		class42.method4560(null, -1, -1);
		method4782();
		field9132++;
		for (int var2 = 0; var2 < field8966; var2++) {
			class903 var3 = (class903) field8965[var2].field9550;
			if (var3 != null) {
				byte var4 = var3.field10075.field7220;
				if ((var4 & 0x1) != 0) {
					int var5 = var3.method13954();
					if ((var4 & 0x2) != 0 && var3.field8628 == 0 && Math.random() * 1000.0D < 10.0D) {
						int var6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (var6 != 0 || var7 != 0) {
							int var8 = var3.field8642[0] + var6;
							int var9 = var3.field8643[0] + var7;
							if (var8 < 0) {
								var8 = 0;
							} else if (var8 > field8980.method6220() - var5 - 1) {
								var8 = field8980.method6220() - var5 - 1;
							}
							if (var9 < 0) {
								var9 = 0;
							} else if (var9 > field8980.method6193() - var5 - 1) {
								var9 = field8980.method6193() - var5 - 1;
							}
							int var10 = class363.method15625(var3.field8642[0], var3.field8643[0], var5, class434.method6645(var8, var9, var5, var5, 0), field8980.method6101(var3.field9807), true, field9001, field9065);
							if (var10 > 0) {
								if (var10 > 9) {
									var10 = 9;
								}
								for (int var11 = 0; var11 < var10; var11++) {
									var3.field8642[var11] = field9001[var10 - var11 - 1];
									var3.field8643[var11] = field9065[var10 - var11 - 1];
									var3.field8645[var11] = class365.field3921.field3924;
								}
								var3.field8628 = var10;
							}
						}
					}
					method7376(var3, true);
					int var12 = Statics.method3510(var3);
					method4714(var3);
					method3581(var3, Statics.field6762, Statics.field2089, var12);
					method12736(var3, Statics.field6762);
					Statics.method11843(var3);
					class316 var13 = class316.method5206();
					var13.method5217(class312.method5096(var3.field8638.method1387()), class312.method5096(var3.field8611.method1387()), class312.method5096(var3.field8639.method1387()));
					var3.method8550(var13);
					var13.method5209();
				}
			}
		}
		if ((field8923 == 6 || field8923 == 11 || field8923 == 15 || field8923 == 14) && (!Statics.method16489() || field8923 == 11 && class33.field538 == 42 || field8923 == 3 && (class33.field537 == 49 || class33.field537 == 52)) && !Statics.method8399()) {
			if (Statics.field2671 == 3) {
				method11197();
			} else {
				method6648();
			}
			if (Statics.field6769 >> 9 < 14 || Statics.field6769 >> 9 >= field8980.method6220() - 14 || Statics.field8424 >> 9 < 14 || Statics.field8424 >> 9 >= field8980.method6193() - 14) {
				field8980.method6135(new class358(class360.field3838, null));
			}
		}
		while (true) {
			HookRequest var14;
			class165 var15;
			class165 var16;
			do {
				var14 = (HookRequest) field9159.method11560();
				if (var14 == null) {
					while (true) {
						HookRequest var17;
						class165 var18;
						class165 var19;
						do {
							var17 = (HookRequest) field9125.method11560();
							if (var17 == null) {
								while (true) {
									HookRequest var20;
									class165 var21;
									class165 var22;
									do {
										var20 = (HookRequest) field9089.method11560();
										if (var20 == null) {
											if (field9115 != null) {
												method7350();
											}
											if (field9213 % 1500 == 0) {
												method12288();
											}
											if (field8923 == 15 && !Statics.method16489() || field8923 == 11 && class33.field538 == 42 || field8923 == 3 && (class33.field537 == 49 || class33.field537 == 52)) {
												class42.method3534();
											}
											class574.method11538();
											if (field9156 && field9157 < class153.method5554() - 60000L) {
												method831();
											}
											for (class765 var23 = (class765) field8934.method11649(); var23 != null; var23 = (class765) field8934.method11644()) {
												if ((long) var23.field9262 < class153.method5554() / 1000L - 5L) {
													if (var23.field9264 > 0) {
														class175.method3943(5, 0, "", "", "", var23.field9263 + class588.field6986.method12206(Statics.field2308));
													}
													if (var23.field9264 == 0) {
														class175.method3943(5, 0, "", "", "", var23.field9263 + class588.field6987.method12206(Statics.field2308));
													}
													var23.method6975();
												}
											}
											if (field8923 == 15 && !Statics.method16489() || field8923 == 11 && class33.field538 == 42 || field8923 == 3 && (class33.field537 == 49 || class33.field537 == 52) || field8923 == 14) {
												if (field8923 != 11 && field8959.method1927() == null) {
													method13897(false);
													return;
												}
												if (field8959 != null) {
													field8959.field839++;
													if (field8959.field839 > 50) {
														class792 var24 = class792.method14781(class280.field2873, field8959.field834);
														field8959.method1913(var24);
													}
													try {
														field8959.method1912();
													} catch (IOException var26) {
														if (field8923 == 11) {
															field8959.method1916();
														} else {
															method13897(false);
														}
													}
												}
											}
											return;
										}
										var21 = var20.component;
										if (var21.id < 0) {
											break;
										}
										var22 = class165.method11381(var21.layer);
									} while (var22 == null || var22.subcomponents == null || var21.id >= var22.subcomponents.length || var22.subcomponents[var21.id] != var21);
									ScriptRunner.runHook(var20);
								}
							}
							var18 = var17.component;
							if (var18.id < 0) {
								break;
							}
							var19 = class165.method11381(var18.layer);
						} while (var19 == null || var19.subcomponents == null || var18.id >= var19.subcomponents.length || var19.subcomponents[var18.id] != var18);
						ScriptRunner.runHook(var17);
					}
				}
				var15 = var14.component;
				if (var15.id < 0) {
					break;
				}
				var16 = class165.method11381(var15.layer);
			} while (var16 == null || var16.subcomponents == null || var15.id >= var16.subcomponents.length || var16.subcomponents[var15.id] != var15);
			ScriptRunner.runHook(var14);
		}
	}

	@ObfuscatedName("rj.gd(I)V")
	public static final void method8601() {
		for (int var0 = Statics.field2669.method1640(true); var0 != -1; var0 = Statics.field2669.method1640(false)) {
			method4113(var0);
			field9135[++field9183 - 1 & 0x1F] = var0;
		}
		for (class943 var1 = class943.method12910(); var1 != null; var1 = class943.method12910()) {
			int var2 = var1.method16508();
			long var3 = var1.method16612();
			if (var2 == 1) {
				Statics.field6666[(int) var3] = var1.field10321;
				field9156 |= Statics.field2210[(int) var3];
				field9141[++field9036 - 1 & 0x1F] = (int) var3;
			} else if (var2 == 2) {
				Statics.field3498[(int) var3] = var1.field10300;
				field9143[++field9144 - 1 & 0x1F] = (int) var3;
			} else if (var2 == 3) {
				class165 var5 = class165.method11381((int) var3);
				if (!var1.field10300.equals(var5.field1825)) {
					var5.field1825 = var1.field10300;
					requestRedrawComponent(var5);
				}
			} else if (var2 == 22) {
				class165 var6 = class165.method11381((int) var3);
				if (var6.field1860 != (var1.field10321 == 1)) {
					var6.field1860 = var1.field10321 == 1;
					requestRedrawComponent(var6);
				}
			} else if (var2 == 4) {
				class165 var7 = class165.method11381((int) var3);
				int var8 = var1.field10321;
				int var9 = var1.field10298;
				int var10 = var1.field10299;
				if (var7.field1806 != var8 || var7.field1838 != var9 || var7.field1832 != var10) {
					var7.field1806 = var8;
					var7.field1838 = var9;
					var7.field1832 = var10;
					var7.field1930 = null;
					requestRedrawComponent(var7);
				}
			} else if (var2 == 5) {
				class165 var11 = class165.method11381((int) var3);
				if (var1.field10321 != var11.field1747) {
					if (var1.field10321 == -1) {
						var11.field1789 = null;
					} else {
						if (var11.field1789 == null) {
							var11.field1789 = new class873();
						}
						var11.field1789.method11769(var1.field10321);
					}
					var11.field1747 = var1.field10321;
					requestRedrawComponent(var11);
				}
			} else if (var2 == 6) {
				int var12 = var1.field10321;
				int var13 = var12 >> 10 & 0x1F;
				int var14 = var12 >> 5 & 0x1F;
				int var15 = var12 & 0x1F;
				int var16 = (var15 << 3) + (var13 << 19) + (var14 << 11);
				class165 var17 = class165.method11381((int) var3);
				if (var17.field1792 != var16) {
					var17.field1792 = var16;
					requestRedrawComponent(var17);
				}
			} else if (var2 == 7) {
				class165 var18 = class165.method11381((int) var3);
				boolean var19 = var1.field10321 == 1;
				if (var18.field1807 != var19) {
					var18.field1807 = var19;
					requestRedrawComponent(var18);
				}
			} else if (var2 == 8) {
				class165 var20 = class165.method11381((int) var3);
				if (var1.field10321 != var20.field1812 || var1.field10298 != var20.field1813 || var1.field10299 != var20.field1818) {
					var20.field1812 = var1.field10321;
					var20.field1813 = var1.field10298;
					var20.field1818 = var1.field10299;
					if (var20.field1903 != -1) {
						if (var20.field1819 > 0) {
							var20.field1818 = var20.field1818 * 32 / var20.field1819;
						} else if (var20.field1910 > 0) {
							var20.field1818 = var20.field1818 * 32 / var20.field1910;
						}
					}
					requestRedrawComponent(var20);
				}
			} else if (var2 == 9) {
				class165 var21 = class165.method11381((int) var3);
				if (var1.field10321 != var21.field1903 || var1.field10298 != var21.field1904) {
					var21.field1903 = var1.field10321;
					var21.field1904 = var1.field10298;
					requestRedrawComponent(var21);
				}
			} else if (var2 == 10) {
				class165 var22 = class165.method11381((int) var3);
				if (var1.field10321 != var22.field1810 || var1.field10298 != var22.field1824 || var1.field10299 != var22.field1814) {
					var22.field1810 = var1.field10321;
					var22.field1824 = var1.field10298;
					var22.field1814 = var1.field10299;
					requestRedrawComponent(var22);
				}
			} else if (var2 == 11) {
				class165 var23 = class165.method11381((int) var3);
				var23.field1829 = 0;
				var23.field1776 = var23.field1772 = var1.field10321;
				var23.field1769 = 0;
				var23.field1777 = var23.field1774 = var1.field10298;
				requestRedrawComponent(var23);
			} else if (var2 == 12) {
				class165 var24 = class165.method11381((int) var3);
				int var25 = var1.field10321;
				if (var24 != null && var24.type == 0) {
					if (var25 > var24.field1894 - var24.field1929) {
						var25 = var24.field1894 - var24.field1929;
					}
					if (var25 < 0) {
						var25 = 0;
					}
					if (var24.field1739 != var25) {
						var24.field1739 = var25;
						requestRedrawComponent(var24);
					}
				}
			} else if (var2 == 14) {
				class165 var26 = class165.method11381((int) var3);
				var26.field1797 = var1.field10321;
			} else if (var2 == 15) {
				class58.field766 = true;
				class58.field763 = var1.field10321;
				class58.field764 = var1.field10298;
			} else if (var2 == 16) {
				class165 var27 = class165.method11381((int) var3);
				var27.field1793 = var1.field10321;
			} else if (var2 == 20) {
				class165 var28 = class165.method11381((int) var3);
				var28.field1833 = var1.field10321 == 1;
			} else if (var2 == 21) {
				class165 var29 = class165.method11381((int) var3);
				var29.field1805 = var1.field10321 == 1;
			} else if (var2 == 17) {
				class165 var30 = class165.method11381((int) var3);
				var30.field1737 = var1.field10321;
			} else if (var2 == 18) {
				class165 var31 = class165.method11381((int) var3);
				int var32 = (int) (var3 >> 32);
				var31.method3158(var32, (short) var1.field10321, (short) var1.field10298);
			} else if (var2 == 19) {
				class165 var33 = class165.method11381((int) var3);
				int var34 = (int) (var3 >> 32);
				var33.method3131(var34, (short) var1.field10321, (short) var1.field10298);
			}
		}
	}

	@ObfuscatedName("tb.gj(I)V")
	public static final void method11396() {
		class58.method3580(Statics.field5187);
		if (Statics.field7324 != field9210) {
			Statics.method7076();
		}
	}

	@ObfuscatedName("acx.gu(I)V")
	public static final void method14780() {
		int[] var0 = class55.field727;
		for (int var1 = 0; var1 < class55.field732; var1++) {
			class902 var2 = field9070[var0[var1]];
			if (var2 != null) {
				var2.method13962();
			}
		}
		for (int var3 = 0; var3 < field9104; var3++) {
			long var4 = (long) field9056[var3];
			class798 var6 = (class798) field8964.method11923(var4);
			if (var6 != null) {
				((PathingEntity) var6.field9550).method13962();
			}
		}
		if (field8988 != 0) {
			return;
		}
		for (int var7 = 0; var7 < Statics.field1537.length; var7++) {
			class149 var8 = Statics.field1537[var7];
			if (var8.field1563) {
				var8.method2854().method13962();
			}
		}
	}

	@ObfuscatedName("e.gy(I)[Lus;")
	public static class562[] method1671() {
		if (Statics.field8518 == null) {
			class562[] var0 = Statics.method11507(Statics.field4013);
			class562[] var1 = new class562[var0.length];
			int var2 = 0;
			int var3 = Statics.field4961.field9677.method15794();
			label71: for (int var4 = 0; var4 < var0.length; var4++) {
				class562 var5 = var0[var4];
				if ((var5.field6708 <= 0 || var5.field6708 >= 24) && var5.field6709 >= 800 && var5.field6707 >= 600 && (var3 != 2 || var5.field6709 <= 800 && var5.field6707 <= 600) && (var3 != 1 || var5.field6709 <= 1024 && var5.field6707 <= 768)) {
					for (int var6 = 0; var6 < var2; var6++) {
						class562 var7 = var1[var6];
						if (var5.field6709 == var7.field6709 && var5.field6707 == var7.field6707) {
							if (var5.field6708 > var7.field6708) {
								var1[var6] = var5;
							}
							continue label71;
						}
					}
					var1[var2] = var5;
					var2++;
				}
			}
			Statics.field8518 = new class562[var2];
			System.arraycopy(var1, 0, Statics.field8518, 0, var2);
			int[] var8 = new int[Statics.field8518.length];
			for (int var9 = 0; var9 < Statics.field8518.length; var9++) {
				class562 var10 = Statics.field8518[var9];
				var8[var9] = var10.field6709 * var10.field6707;
			}
			class485.method15733(var8, Statics.field8518);
		}
		return Statics.field8518;
	}

	@ObfuscatedName("nt.gt(I)V")
	public static final void method6648() {
		if (field9033 == -1 || field9034 == -1) {
			return;
		}
		int var0 = (field9219 * (field9039 - field9038) >> 16) + field9038;
		field9219 += var0;
		if (field9219 >= 65535) {
			field9219 = 65535;
			if (field8908) {
				field9040 = false;
			} else {
				field9040 = true;
			}
			field8908 = true;
		} else {
			field9040 = false;
			field8908 = false;
		}
		float var1 = (float) field9219 / 65535.0F;
		float[] var2 = new float[3];
		int var3 = field9035 * 2;
		for (int var4 = 0; var4 < 3; var4++) {
			int var5 = field9076[field9033][var3][var4] * 3;
			int var6 = field9076[field9033][var3 + 1][var4] * 3;
			int var7 = (field9076[field9033][var3 + 2][var4] - (field9076[field9033][var3 + 3][var4] - field9076[field9033][var3 + 2][var4])) * 3;
			int var8 = field9076[field9033][var3][var4];
			int var9 = var6 - var5;
			int var10 = var5 - var6 * 2 + var7;
			int var11 = field9076[field9033][var3 + 2][var4] - var8 + var6 - var7;
			var2[var4] = (((float) var11 * var1 + (float) var10) * var1 + (float) var9) * var1 + (float) var8;
		}
		class453 var12 = field8980.method6214();
		Statics.field6769 = (int) var2[0] - var12.field4836 * 512;
		Statics.field8423 = (int) var2[1] * -1;
		Statics.field8424 = (int) var2[2] - var12.field4838 * 512;
		float[] var13 = new float[3];
		int var14 = field8995 * 2;
		for (int var15 = 0; var15 < 3; var15++) {
			int var16 = field9076[field9034][var14][var15] * 3;
			int var17 = field9076[field9034][var14 + 1][var15] * 3;
			int var18 = (field9076[field9034][var14 + 2][var15] - (field9076[field9034][var14 + 3][var15] - field9076[field9034][var14 + 2][var15])) * 3;
			int var19 = field9076[field9034][var14][var15];
			int var20 = var17 - var16;
			int var21 = var16 - var17 * 2 + var18;
			int var22 = field9076[field9034][var14 + 2][var15] - var19 + var17 - var18;
			var13[var15] = (((float) var22 * var1 + (float) var21) * var1 + (float) var20) * var1 + (float) var19;
		}
		float var23 = var13[0] - var2[0];
		float var24 = (var13[1] - var2[1]) * -1.0F;
		float var25 = var13[2] - var2[2];
		double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
		Statics.field2328 = (int) (Math.atan2((double) var24, var26) * 2607.5945876176133D) & 0x3FFF;
		Statics.field664 = (int) (-Math.atan2((double) var23, (double) var25) * 2607.5945876176133D) & 0x3FFF;
		Statics.field7183 = (field9219 * (field9076[field9033][var3 + 2][3] - field9076[field9033][var3][3]) >> 16) + field9076[field9033][var3][3];
	}

	@ObfuscatedName("su.gx(B)V")
	public static final void method11197() {
		int var0 = Statics.field1577 * 262144 + 256;
		int var1 = Statics.field2123 * 512 + 256;
		int var2 = method8663(var0, var1, Statics.field7324) - Statics.field4194;
		if (Statics.field2611 >= 100) {
			Statics.field6769 = Statics.field1577 * 262144 + 256;
			Statics.field8424 = Statics.field2123 * 512 + 256;
			Statics.field8423 = method8663(Statics.field6769, Statics.field8424, Statics.field7324) - Statics.field4194;
		} else {
			if (Statics.field6769 < var0) {
				Statics.field6769 += Statics.field2611 * (var0 - Statics.field6769) / 1000 + Statics.field3385;
				if (Statics.field6769 > var0) {
					Statics.field6769 = var0;
				}
			}
			if (Statics.field6769 > var0) {
				Statics.field6769 -= Statics.field2611 * (Statics.field6769 - var0) / 1000 + Statics.field3385;
				if (Statics.field6769 < var0) {
					Statics.field6769 = var0;
				}
			}
			if (Statics.field8423 < var2) {
				Statics.field8423 += Statics.field2611 * (var2 - Statics.field8423) / 1000 + Statics.field3385;
				if (Statics.field8423 > var2) {
					Statics.field8423 = var2;
				}
			}
			if (Statics.field8423 > var2) {
				Statics.field8423 -= Statics.field2611 * (Statics.field8423 - var2) / 1000 + Statics.field3385;
				if (Statics.field8423 < var2) {
					Statics.field8423 = var2;
				}
			}
			if (Statics.field8424 < var1) {
				Statics.field8424 += Statics.field2611 * (var1 - Statics.field8424) / 1000 + Statics.field3385;
				if (Statics.field8424 > var1) {
					Statics.field8424 = var1;
				}
			}
			if (Statics.field8424 > var1) {
				Statics.field8424 -= Statics.field2611 * (Statics.field8424 - var1) / 1000 + Statics.field3385;
				if (Statics.field8424 < var1) {
					Statics.field8424 = var1;
				}
			}
		}
		int var3 = Statics.field2799 * 512 + 256;
		int var4 = Statics.field4855 * 512 + 256;
		int var5 = method8663(var3, var4, Statics.field7324) - Statics.field9680;
		int var6 = var3 - Statics.field6769;
		int var7 = var5 - Statics.field8423;
		int var8 = var4 - Statics.field8424;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 2607.5945876176133D) & 0x3FFF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -2607.5945876176133D) & 0x3FFF;
		if (var10 < 1024) {
			var10 = 1024;
		}
		if (var10 > 3072) {
			var10 = 3072;
		}
		if (Statics.field2328 < var10) {
			Statics.field2328 += (var10 - Statics.field2328 >> 3) * Statics.field3785 / 1000 + Statics.field9277 << 3;
			if (Statics.field2328 > var10) {
				Statics.field2328 = var10;
			}
		}
		if (Statics.field2328 > var10) {
			Statics.field2328 -= (Statics.field2328 - var10 >> 3) * Statics.field3785 / 1000 + Statics.field9277 << 3;
			if (Statics.field2328 < var10) {
				Statics.field2328 = var10;
			}
		}
		int var12 = var11 - Statics.field664;
		if (var12 > 8192) {
			var12 -= 16384;
		}
		if (var12 < -8192) {
			var12 += 16384;
		}
		int var13 = var12 >> 3;
		if (var13 > 0) {
			Statics.field664 += Statics.field3785 * var13 / 1000 + Statics.field9277 << 3;
			Statics.field664 &= 0x3FFF;
		}
		if (var13 < 0) {
			Statics.field664 -= Statics.field3785 * -var13 / 1000 + Statics.field9277 << 3;
			Statics.field664 &= 0x3FFF;
		}
		int var14 = var11 - Statics.field664;
		if (var14 > 8192) {
			var14 -= 16384;
		}
		if (var14 < -8192) {
			var14 += 16384;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			Statics.field664 = var11;
		}
		Statics.field7183 = 0;
	}

	@ObfuscatedName("aac.he(J)V")
	public static final void method14083(long arg0) {
		Vector3 var2 = Statics.field2119.method8565().field3464;
		int var3 = field9050 + (int) var2.field3475;
		int var4 = field9006 + (int) var2.field3477;
		if (Statics.field2297 - var3 < -2000 || Statics.field2297 - var3 > 2000 || Statics.field6818 - var4 < -2000 || Statics.field6818 - var4 > 2000) {
			Statics.field2297 = var3;
			Statics.field6818 = var4;
		}
		if (Statics.field2297 != var3) {
			int var5 = var3 - Statics.field2297;
			int var6 = (int) ((long) var5 * arg0 / 320L);
			if (var5 > 0) {
				if (var6 == 0) {
					var6 = 1;
				} else if (var6 > var5) {
					var6 = var5;
				}
			} else if (var6 == 0) {
				var6 = -1;
			} else if (var6 < var5) {
				var6 = var5;
			}
			Statics.field2297 += var6;
		}
		if (Statics.field6818 != var4) {
			int var7 = var4 - Statics.field6818;
			int var8 = (int) ((long) var7 * arg0 / 320L);
			if (var7 > 0) {
				if (var8 == 0) {
					var8 = 1;
				} else if (var8 > var7) {
					var8 = var7;
				}
			} else if (var8 == 0) {
				var8 = -1;
			} else if (var8 < var7) {
				var8 = var7;
			}
			Statics.field6818 += var8;
		}
		field9021 += (float) arg0 * field9022 / 6.0F;
		field9171 += (float) arg0 * field8990 / 6.0F;
		method12187();
	}

	@ObfuscatedName("aex.hk(J)V")
	public static final void method15618(long arg0) {
		int var2 = field9154;
		int var3 = field9019;
		if (Statics.field2297 != var2) {
			int var4 = var2 - Statics.field2297;
			int var5 = (int) ((long) var4 * arg0 / 320L);
			if (var4 > 0) {
				if (var5 == 0) {
					var5 = 1;
				} else if (var5 > var4) {
					var5 = var4;
				}
			} else if (var5 == 0) {
				var5 = -1;
			} else if (var5 < var4) {
				var5 = var4;
			}
			Statics.field2297 += var5;
		}
		if (Statics.field6818 != var3) {
			int var6 = var3 - Statics.field6818;
			int var7 = (int) ((long) var6 * arg0 / 320L);
			if (var6 > 0) {
				if (var7 == 0) {
					var7 = 1;
				} else if (var7 > var6) {
					var7 = var6;
				}
			} else if (var7 == 0) {
				var7 = -1;
			} else if (var7 < var6) {
				var7 = var6;
			}
			Statics.field6818 += var7;
		}
		field9021 += (float) arg0 * field9022 / 40.0F * 8.0F;
		field9171 += (float) arg0 * field8990 / 40.0F * 8.0F;
		method12187();
	}

	@ObfuscatedName("ei.hq(B)V")
	public static final void method3224() {
		if (!field9016) {
			field8990 += (-12.0F - field8990) / 2.0F;
			field9028 = true;
			field9016 = true;
		}
	}

	@ObfuscatedName("ru.hx(I)V")
	public static final void method8624() {
		if (!field8913) {
			field9022 += (24.0F - field9022) / 2.0F;
			field9028 = true;
			field8913 = true;
		}
	}

	@ObfuscatedName("dj.hs(I)V")
	public static final void method2613() {
		if (!field8913) {
			field9022 += (-24.0F - field9022) / 2.0F;
			field9028 = true;
			field8913 = true;
		}
	}

	@ObfuscatedName("rk.ha(IIII)V")
	public static void method8486(int arg0, int arg1, int arg2) {
		int var3 = arg0 << 3;
		int var4 = arg1 << 3;
		int var5 = arg2 << 3;
		field9171 = var3;
		field9021 = var4;
		if (Statics.field2671 == 3) {
			Statics.field2328 = var3;
			Statics.field664 = var4;
			Statics.field7183 = var5;
		}
		method12187();
		field9028 = true;
	}

	@ObfuscatedName("va.hb(I)V")
	public static final void method12187() {
		if (field9171 < 1089.0F) {
			field9171 = 1089.0F;
		}
		if (field9171 > 2985.0F) {
			field9171 = 2985.0F;
		}
		while (field9021 >= 16384.0F) {
			field9021 -= 16384.0F;
		}
		while (field9021 < 0.0F) {
			field9021 += 16384.0F;
		}
		class338 var0 = field8980.method6100();
		class423 var1 = field8980.method6098();
		int var2 = Statics.field2297 >> 9;
		int var3 = Statics.field6818 >> 9;
		int var4 = method8663(Statics.field2297, Statics.field6818, Statics.field7324);
		int var5 = 0;
		if (var2 > 3 && var3 > 3 && var2 < field8980.method6220() - 4 && var3 < field8980.method6193() - 4) {
			for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					int var8 = Statics.field7324;
					if (var8 < 3 && var0.method5794(var6, var7)) {
						var8++;
					}
					int var9 = 0;
					byte[][] var10 = field8980.method6099(var8);
					if (var10 != null) {
						var9 = (var10[var6][var7] & 0xFF) * 8 << 2;
					}
					if (var1.field4498 != null && var1.field4498[var8] != null) {
						int var11 = var4 - (var1.field4498[var8].method199(var6, var7) - var9);
						if (var11 > var5) {
							var5 = var11;
						}
					}
				}
			}
		}
		int var12 = (var5 >> 2) * 1536;
		if (var12 > 786432) {
			var12 = 786432;
		}
		if (var12 < 262144) {
			var12 = 262144;
		}
		if (var12 > field9173) {
			field9173 += (var12 - field9173) / 24;
		} else if (var12 < field9173) {
			field9173 += (var12 - field9173) / 80;
		}
	}

	@ObfuscatedName("rj.hc(IIIIIZI)V")
	public static final void method8600(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		Statics.field1577 = arg0 * 512;
		Statics.field2123 = arg1 * 262144;
		Statics.field4194 = arg2;
		Statics.field3385 = arg3;
		Statics.field2611 = arg4;
		if (arg5 && Statics.field2611 >= 100) {
			Statics.field6769 = Statics.field1577 * 262144 + 256;
			Statics.field8424 = Statics.field2123 * 512 + 256;
			Statics.field8423 = method8663(Statics.field6769, Statics.field8424, Statics.field7324) - Statics.field4194;
		}
		Statics.field2671 = 3;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
	}

	@ObfuscatedName("qz.hn(IIIIII)V")
	public static final void method8271(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Statics.field2799 = arg0;
		Statics.field4855 = arg1;
		Statics.field9680 = arg2;
		Statics.field9277 = arg3;
		Statics.field3785 = arg4;
		if (Statics.field3785 >= 100) {
			int var5 = Statics.field2799 * 512 + 256;
			int var6 = Statics.field4855 * 512 + 256;
			int var7 = method8663(var5, var6, Statics.field7324) - Statics.field9680;
			int var8 = var5 - Statics.field6769;
			int var9 = var7 - Statics.field8423;
			int var10 = var6 - Statics.field8424;
			int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
			Statics.field2328 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
			Statics.field664 = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
			Statics.field7183 = 0;
			if (Statics.field2328 < 1024) {
				Statics.field2328 = 1024;
			}
			if (Statics.field2328 > 3072) {
				Statics.field2328 = 3072;
			}
		}
		Statics.field2671 = 3;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
	}

	@ObfuscatedName("aay.hd(B)V")
	public static final void method14029() {
		for (int var0 = 0; var0 < 5; var0++) {
			field9057[var0] = false;
		}
		field9033 = -1;
		field9034 = -1;
		Statics.field9277 = 0;
		Statics.field3785 = 0;
		Statics.field2671 = 4;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
	}

	@ObfuscatedName("we.hw(B)V")
	public static final void method12690() {
		for (int var0 = 0; var0 < 5; var0++) {
			field9057[var0] = false;
		}
		field9033 = -1;
		field9034 = -1;
		Statics.field9277 = 0;
		Statics.field3785 = 0;
		Statics.field2671 = 6;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
		field9185 = field9213;
		Statics.field6412 = Statics.field6769;
		Statics.field2632 = Statics.field8423;
		Statics.field3493 = Statics.field8424;
		Statics.field6692 = Statics.field2328;
		Statics.field7298 = Statics.field664;
	}

	@ObfuscatedName("fw.hu(I)V")
	public static final void method3678() {
		int var0 = class55.field732;
		int[] var1 = class55.field727;
		for (int var2 = 0; var2 < var0; var2++) {
			class902 var3 = field9070[var1[var2]];
			if (var3 != null) {
				method7985(var3, false);
			}
		}
	}

	@ObfuscatedName("st.ht(I)V")
	public static final void method11154() {
		for (int var0 = 0; var0 < field9104; var0++) {
			int var1 = field9056[var0];
			class798 var2 = (class798) field8964.method11923((long) var1);
			if (var2 != null) {
				class903 var3 = (class903) var2.field9550;
				method7985(var3, false);
			}
		}
	}

	@ObfuscatedName("py.hl(Laay;ZI)V")
	public static final void method7985(PathingEntity arg0, boolean arg1) {
		int var2 = class365.field3923.field3924;
		int var3 = 0;
		if (arg0.field8649 > field9213) {
			method1625(arg0);
		} else if (arg0.field8620 >= field9213) {
			method8457(arg0);
		} else {
			method7376(arg0, arg1);
			var2 = Statics.field6762;
			var3 = Statics.field2089;
		}
		Vector3 var4 = arg0.method8565().field3464;
		if ((int) var4.field3475 < 512 || (int) var4.field3477 < 512 || (int) var4.field3475 >= (field8980.method6220() - 1) * 512 || (int) var4.field3477 >= (field8980.method6193() - 1) * 512) {
			arg0.field8597.method11769(-1);
			for (int var5 = 0; var5 < arg0.field8641.length; var5++) {
				arg0.field8641[var5].field1204 = -1;
				arg0.field8641[var5].field1203.method11769(-1);
			}
			arg0.field8615 = null;
			arg0.field8649 = 0;
			arg0.field8620 = 0;
			var2 = class365.field3923.field3924;
			var3 = 0;
			arg0.method8552((float) (arg0.field8642[0] * 512 + arg0.method13954() * 256), var4.field3476, (float) (arg0.field8643[0] * 512 + arg0.method13954() * 256));
			arg0.method13952();
		}
		if (Statics.field2119 == arg0 && ((int) var4.field3475 < 6144 || (int) var4.field3477 < 6144 || (int) var4.field3475 >= (field8980.method6220() - 12) * 512 || (int) var4.field3477 >= (field8980.method6193() - 12) * 512)) {
			arg0.field8597.method11769(-1);
			for (int var6 = 0; var6 < arg0.field8641.length; var6++) {
				arg0.field8641[var6].field1204 = -1;
				arg0.field8641[var6].field1203.method11769(-1);
			}
			arg0.field8615 = null;
			arg0.field8649 = 0;
			arg0.field8620 = 0;
			var2 = class365.field3923.field3924;
			var3 = 0;
			arg0.method8552((float) (arg0.field8642[0] * 512 + arg0.method13954() * 256), var4.field3476, (float) (arg0.field8643[0] * 512 + arg0.method13954() * 256));
			arg0.method13952();
		}
		int var7 = Statics.method3510(arg0);
		method4714(arg0);
		method3581(arg0, var2, var3, var7);
		method12736(arg0, var2);
		Statics.method11843(arg0);
		class316 var8 = class316.method5206();
		var8.method5217(class312.method5096(arg0.field8638.method1387()), class312.method5096(arg0.field8611.method1387()), class312.method5096(arg0.field8639.method1387()));
		arg0.method8550(var8);
		var8.method5209();
	}

	@ObfuscatedName("g.hj(Laay;I)V")
	public static final void method1625(PathingEntity arg0) {
		int var1 = arg0.field8649 - field9213;
		int var2 = arg0.field8619 * 512 + arg0.method13954() * 256;
		int var3 = arg0.field8621 * 512 + arg0.method13954() * 256;
		Vector3 var4 = arg0.method8565().field3464;
		arg0.method8552((float) ((var2 - (int) var4.field3475) / var1 + (int) var4.field3475), (float) var4.field3476, (float) ((var3 - (int) var4.field3477) / var1 + (int) var4.field3477));
		arg0.field8648 = 0;
		arg0.method14013(arg0.field8625);
	}

	@ObfuscatedName("qb.hf(Laay;B)V")
	public static final void method8457(PathingEntity arg0) {
		class553 var1 = arg0.field8597;
		if (field9213 == arg0.field8620 || !var1.method11767() || var1.method11788(1)) {
			int var2 = arg0.field8620 - arg0.field8649;
			int var3 = field9213 - arg0.field8649;
			int var4 = arg0.field8619 * 512 + arg0.method13954() * 256;
			int var5 = arg0.field8621 * 512 + arg0.method13954() * 256;
			int var6 = arg0.field8591 * 512 + arg0.method13954() * 256;
			int var7 = arg0.field8605 * 512 + arg0.method13954() * 256;
			Vector3 var8 = arg0.method8565().field3464;
			arg0.method8552((float) (((var2 - var3) * var4 + var3 * var6) / var2), (float) var8.field3476, (float) (((var2 - var3) * var5 + var3 * var7) / var2));
		}
		arg0.field8648 = 0;
		arg0.method13946(arg0.field8625, false);
	}

	@ObfuscatedName("ot.hz(Laay;ZI)V")
	public static final void method7376(PathingEntity arg0, boolean arg1) {
		class439 var2 = arg0.method13959();
		if (arg0.field8628 == 0) {
			arg0.field8648 = 0;
			Statics.field6762 = class365.field3923.field3924;
			Statics.field2089 = 0;
			return;
		}
		if (arg0.field8597.method11767() && !arg0.field8597.method11776()) {
			class509 var3 = arg0.field8597.method11804();
			if (arg0.field8646 > 0 && var3.field6323 == 0) {
				arg0.field8648++;
				Statics.field6762 = class365.field3923.field3924;
				Statics.field2089 = 0;
				return;
			}
			if (arg0.field8646 <= 0 && var3.field6330 == 0) {
				arg0.field8648++;
				Statics.field6762 = class365.field3923.field3924;
				Statics.field2089 = 0;
				return;
			}
		}
		for (int var4 = 0; var4 < arg0.field8641.length; var4++) {
			if (arg0.field8641[var4].field1204 != -1 && arg0.field8641[var4].field1203.method11776()) {
				class507 var5 = Statics.field4213.method11082(arg0.field8641[var4].field1204);
				if (var5.field5264 && var5.field5252 != -1) {
					class509 var6 = Statics.field566.method11144(var5.field5252);
					if (arg0.field8646 > 0 && var6.field6323 == 0) {
						arg0.field8648++;
						Statics.field6762 = class365.field3923.field3924;
						Statics.field2089 = 0;
						return;
					}
					if (arg0.field8646 <= 0 && var6.field6330 == 0) {
						arg0.field8648++;
						Statics.field6762 = class365.field3923.field3924;
						Statics.field2089 = 0;
						return;
					}
				}
			}
		}
		Vector3 var7 = Vector3.method5290(arg0.method8565().field3464);
		int var8 = (int) var7.field3475;
		int var9 = (int) var7.field3477;
		int var10 = arg0.field8642[arg0.field8628 - 1] * 512 + arg0.method13954() * 256;
		int var11 = arg0.field8643[arg0.field8628 - 1] * 512 + arg0.method13954() * 256;
		if (var8 < var10) {
			if (var9 < var11) {
				arg0.method14013(10240);
			} else if (var9 > var11) {
				arg0.method14013(14336);
			} else {
				arg0.method14013(12288);
			}
		} else if (var8 > var10) {
			if (var9 < var11) {
				arg0.method14013(6144);
			} else if (var9 > var11) {
				arg0.method14013(2048);
			} else {
				arg0.method14013(4096);
			}
		} else if (var9 < var11) {
			arg0.method14013(8192);
		} else if (var9 > var11) {
			arg0.method14013(0);
		}
		byte var12 = arg0.field8645[arg0.field8628 - 1];
		if (!arg1 && (var10 - var8 > 1024 || var10 - var8 < -1024 || var11 - var9 > 1024 || var11 - var9 < -1024)) {
			arg0.method8552((float) var10, var7.field3476, (float) var11);
			arg0.method13946(arg0.field8637, false);
			arg0.field8628--;
			if (arg0.field8646 > 0) {
				arg0.field8646--;
			}
			Statics.field6762 = class365.field3923.field3924;
			Statics.field2089 = 0;
			var7.method5291();
			return;
		}
		int var13 = 16;
		boolean var14 = true;
		if (arg0 instanceof class903) {
			var14 = ((class903) arg0).field10075.field7259;
		}
		if (var14) {
			int var15 = arg0.field8637 - arg0.field8638.field574;
			if (var15 != 0 && arg0.field8624 == -1 && arg0.field8636 != 0) {
				var13 = 8;
			}
			if (!arg1 && arg0.field8628 > 2) {
				var13 = 24;
			}
			if (!arg1 && arg0.field8628 > 3) {
				var13 = 32;
			}
		} else {
			if (!arg1 && arg0.field8628 > 1) {
				var13 = 24;
			}
			if (!arg1 && arg0.field8628 > 2) {
				var13 = 32;
			}
		}
		if (arg0.field8648 > 0 && arg0.field8628 > 1) {
			var13 = 32;
			arg0.field8648--;
		}
		if (class365.field3922.field3924 == var12) {
			var13 <<= 0x1;
		} else if (class365.field3920.field3924 == var12) {
			var13 >>= 0x1;
		}
		if (var2.field4704 != -1) {
			int var16 = var13 << 9;
			if (arg0.field8628 == 1) {
				int var17 = arg0.field8647 * arg0.field8647;
				int var18 = ((int) var7.field3475 > var10 ? (int) var7.field3475 - var10 : var10 - (int) var7.field3475) << 9;
				int var19 = ((int) var7.field3477 > var11 ? (int) var7.field3477 - var11 : var11 - (int) var7.field3477) << 9;
				int var20 = var18 > var19 ? var18 : var19;
				int var21 = var2.field4704 * 2 * var20;
				if (var17 > var21) {
					arg0.field8647 /= 2;
				} else if (var17 / 2 > var20) {
					arg0.field8647 -= var2.field4704;
					if (arg0.field8647 < 0) {
						arg0.field8647 = 0;
					}
				} else if (arg0.field8647 < var16) {
					arg0.field8647 += var2.field4704;
					if (arg0.field8647 > var16) {
						arg0.field8647 = var16;
					}
				}
			} else if (arg0.field8647 < var16) {
				arg0.field8647 += var2.field4704;
				if (arg0.field8647 > var16) {
					arg0.field8647 = var16;
				}
			} else if (arg0.field8647 > 0) {
				arg0.field8647 -= var2.field4704;
				if (arg0.field8647 < 0) {
					arg0.field8647 = 0;
				}
			}
			var13 = arg0.field8647 >> 9;
			if (var13 < 1) {
				var13 = 1;
			}
		}
		Statics.field2089 = 0;
		if (var8 == var10 && var9 == var11) {
			Statics.field6762 = class365.field3923.field3924;
		} else {
			if (var8 < var10) {
				var7.field3475 += var13;
				Statics.field2089 |= 0x4;
				if (var7.field3475 > (float) var10) {
					var7.field3475 = var10;
				}
			} else if (var8 > var10) {
				var7.field3475 -= var13;
				Statics.field2089 |= 0x8;
				if (var7.field3475 < (float) var10) {
					var7.field3475 = var10;
				}
			}
			if (var9 < var11) {
				var7.field3477 += var13;
				Statics.field2089 |= 0x1;
				if (var7.field3477 > (float) var11) {
					var7.field3477 = var11;
				}
			} else if (var9 > var11) {
				var7.field3477 -= var13;
				Statics.field2089 |= 0x2;
				if (var7.field3477 < (float) var11) {
					var7.field3477 = var11;
				}
			}
			arg0.method8551(var7);
			if (var13 >= 32) {
				Statics.field6762 = class365.field3922.field3924;
			} else {
				Statics.field6762 = var12;
			}
		}
		if ((int) var7.field3475 == var10 && (int) var7.field3477 == var11) {
			arg0.field8628--;
			if (arg0.field8646 > 0) {
				arg0.field8646--;
			}
		}
		var7.method5291();
	}

	@ObfuscatedName("it.hr(Laay;I)V")
	public static final void method4714(PathingEntity arg0) {
		if (arg0.field8614 == null && arg0.field8654 == null) {
			return;
		}
		boolean var1 = true;
		class453 var2 = field8980.method6214();
		for (int var3 = 0; var3 < arg0.field8614.length; var3++) {
			int var4 = -1;
			if (arg0.field8614 != null) {
				var4 = arg0.field8614[var3];
			}
			if (var4 != -1) {
				var1 = false;
				boolean var5 = false;
				boolean var6 = false;
				Vector3 var7 = arg0.method8565().field3464;
				int var11;
				int var12;
				if ((var4 & -1073741824) == -1073741824) {
					int var8 = var4 & 0xFFFFFFF;
					int var9 = var8 >> 14;
					int var10 = var8 & 0x3FFF;
					var11 = (int) var7.field3475 - ((var9 - var2.field4836) * 512 + 256);
					var12 = (int) var7.field3477 - ((var10 - var2.field4838) * 512 + 256);
				} else if ((var4 & 0x8000) == 0) {
					class798 var16 = (class798) field8964.method11923((long) var4);
					if (var16 == null) {
						arg0.method13949(var3, -1);
						continue;
					}
					class903 var17 = (class903) var16.field9550;
					Vector3 var18 = var17.method8565().field3464;
					var11 = (int) var7.field3475 - (int) var18.field3475;
					var12 = (int) var7.field3477 - (int) var18.field3477;
				} else {
					int var13 = var4 & 0x7FFF;
					class902 var14 = field9070[var13];
					if (var14 == null) {
						arg0.method13949(var3, -1);
						continue;
					}
					Vector3 var15 = var14.method8565().field3464;
					var11 = (int) var7.field3475 - (int) var15.field3475;
					var12 = (int) var7.field3477 - (int) var15.field3477;
				}
				if (var11 != 0 || var12 != 0) {
					arg0.method13949(var3, (int) (Math.atan2((double) var11, (double) var12) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method13949(var3, -1)) {
				var1 = false;
			}
		}
		if (var1) {
			arg0.field8614 = null;
			arg0.field8654 = null;
		}
	}

	@ObfuscatedName("xx.hv(Laay;II)V")
	public static void method12736(PathingEntity arg0, int arg1) {
		if (arg0.field8615 == null) {
			return;
		}
		class365 var2 = (class365) class518.method8032(class365.method2553(), arg1);
		int var3 = arg0.field8615[var2.method6349()];
		if (var3 != arg0.field8597.method11812()) {
			arg0.field8597.method11771(var3, arg0.field8597.method11777());
			arg0.field8646 = arg0.field8628;
		}
	}

	@ObfuscatedName("ff.hg(Laay;IIIB)V")
	public static void method3581(PathingEntity arg0, int arg1, int arg2, int arg3) {
		class439 var4 = arg0.method13959();
		class874 var5 = arg0.field8616;
		int var6 = arg0.field8637 - arg0.field8638.field574 & 0x3FFF;
		if (class365.field3923.field3924 == arg1) {
			if (var6 == 0 && arg0.field8599 <= 25) {
				if (!var5.field9899 || !var4.method7749(var5.method11812())) {
					var5.method11773(var4.method7748(), false, true);
					var5.field9899 = var5.method11767();
				}
			} else if (arg3 < 0 && var4.field4691 != -1) {
				var5.method11773(var4.field4691, false, true);
				var5.field9899 = false;
			} else if (arg3 > 0 && var4.field4703 != -1) {
				var5.method11773(var4.field4703, false, true);
				var5.field9899 = false;
			} else if (!var5.field9899 || !var4.method7749(var5.method11812())) {
				var5.method11773(var4.method7748(), false, true);
				var5.field9899 = arg0.field8616.method11767();
			}
		} else if (arg0.field8624 != -1 && (var6 >= 10240 || var6 <= 2048)) {
			int var7 = field9003[arg2] - arg0.field8638.field574 & 0x3FFF;
			if (class365.field3922.field3924 == arg1 && var4.field4710 != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.field4701 != -1) {
					var5.method11773(var4.field4701, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.field4726 != -1) {
					var5.method11773(var4.field4726, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.field4699 == -1) {
					var5.method11773(var4.field4710, false, true);
				} else {
					var5.method11773(var4.field4699, false, true);
				}
			} else if (class365.field3920.field3924 == arg1 && var4.field4702 != -1) {
				if (var7 > 2048 && var7 <= 6144 && var4.field4705 != -1) {
					var5.method11773(var4.field4705, false, true);
				} else if (var7 >= 10240 && var7 < 14336 && var4.field4697 != -1) {
					var5.method11773(var4.field4697, false, true);
				} else if (var7 <= 6144 || var7 >= 10240 || var4.field4692 == -1) {
					var5.method11773(var4.field4702, false, true);
				} else {
					var5.method11773(var4.field4692, false, true);
				}
			} else if (var7 > 2048 && var7 <= 6144 && var4.field4717 != -1) {
				var5.method11773(var4.field4717, false, true);
			} else if (var7 >= 10240 && var7 < 14336 && var4.field4696 != -1) {
				var5.method11773(var4.field4696, false, true);
			} else if (var7 <= 6144 || var7 >= 10240 || var4.field4695 == -1) {
				var5.method11773(var4.field4694, false, true);
			} else {
				var5.method11773(var4.field4695, false, true);
			}
			var5.field9899 = false;
		} else if (var6 == 0 && arg0.field8599 <= 25) {
			if (class365.field3922.field3924 == arg1 && var4.field4710 != -1) {
				var5.method11773(var4.field4710, false, true);
			} else if (class365.field3920.field3924 == arg1 && var4.field4702 != -1) {
				var5.method11773(var4.field4702, false, true);
			} else {
				var5.method11773(var4.field4694, false, true);
			}
			var5.field9899 = false;
		} else {
			if (class365.field3922.field3924 == arg1 && var4.field4710 != -1) {
				if (arg3 < 0 && var4.field4708 != -1) {
					var5.method11773(var4.field4708, false, true);
				} else if (arg3 <= 0 || var4.field4709 == -1) {
					var5.method11773(var4.field4710, false, true);
				} else {
					var5.method11773(var4.field4709, false, true);
				}
			} else if (class365.field3920.field3924 == arg1 && var4.field4702 != -1) {
				if (arg3 < 0 && var4.field4706 != -1) {
					var5.method11773(var4.field4706, false, true);
				} else if (arg3 <= 0 || var4.field4707 == -1) {
					var5.method11773(var4.field4702, false, true);
				} else {
					var5.method11773(var4.field4707, false, true);
				}
			} else if (arg3 < 0 && var4.field4693 != -1) {
				var5.method11773(var4.field4693, false, true);
			} else if (arg3 <= 0 || var4.field4711 == -1) {
				var5.method11773(var4.field4694, false, true);
			} else {
				var5.method11773(var4.field4711, false, true);
			}
			var5.field9899 = false;
		}
	}

	@ObfuscatedName("vy.ir(Laay;[I[I[IB)V")
	public static void method12477(PathingEntity arg0, int[] arg1, int[] arg2, int[] arg3) {
		for (int var4 = 0; var4 < arg1.length; var4++) {
			int var5 = arg1[var4];
			int var6 = arg3[var4];
			int var7 = arg2[var4];
			int var8 = 0;
			while (var6 != 0 && var8 < arg0.field8633.length) {
				if ((var6 & 0x1) != 0) {
					if (var5 == -1) {
						arg0.field8633[var8] = null;
					} else {
						class509 var9 = Statics.field566.method11144(var5);
						int var10 = var9.field6331;
						class977 var11 = arg0.field8633[var8];
						if (var11 != null && var11.method11767()) {
							if (var5 == var11.method11812()) {
								if (var10 == 0) {
									arg0.field8633[var8] = null;
									var11 = null;
								} else if (var10 == 1) {
									var11.method11785();
									var11.field10516 = var7;
								} else if (var10 == 2) {
									var11.method11806();
								}
							} else if (var9.field6325 >= var11.method11804().field6325) {
								arg0.field8633[var8] = null;
								var11 = null;
							}
						}
						if (var11 == null || !var11.method11767()) {
							class977 var12 = arg0.field8633[var8] = new class977(arg0);
							var12.method11769(var5);
							var12.field10516 = var7;
						}
					}
				}
				var8++;
				var6 >>>= 0x1;
			}
		}
	}

	@ObfuscatedName("dn.ie(I)V")
	public static final void method2868() {
		class466.method2847(Statics.field5187, (long) field9213);
		if (openedTopInterface != -1) {
			method15619(openedTopInterface);
		}
		for (int var0 = 0; var0 < field9000; var0++) {
			field9166[var0] = field9204[var0];
			field9204[var0] = false;
		}
		field8960 = field9213;
		if (openedTopInterface != -1) {
			field9000 = 0;
			method4593();
		}
		Statics.field5187.method753();
		class42.method14209(Statics.field5187);
		int var1 = class42.method14087();
		if (var1 == -1) {
			var1 = field9235;
		}
		if (var1 == -1) {
			var1 = field9096;
		}
		Statics.method7913(var1);
		field8931 = 0;
	}

	@ObfuscatedName("rm.ii(J)V")
	public static final void method8591(long arg0) {
		if (field8980.method6098() != null) {
			if (Statics.field2671 == 4 || Statics.field2671 == 6) {
				method14083(arg0);
			} else if (Statics.field2671 == 5) {
				method15618(arg0);
			}
		}
		class466.method2847(Statics.field5187, (long) field9213);
		if (openedTopInterface != -1) {
			method15619(openedTopInterface);
		}
		for (int var2 = 0; var2 < field9000; var2++) {
			field9166[var2] = field9204[var2];
			field9204[var2] = false;
		}
		field8960 = field9213;
		Statics.method11384(-1, -1);
		if (openedTopInterface != -1) {
			field9000 = 0;
			method4593();
		}
		Statics.field5187.method753();
		class42.method14209(Statics.field5187);
		int var3 = class42.method14087();
		if (var3 == -1) {
			var3 = field9235;
		}
		if (var3 == -1) {
			var3 = field9096;
		}
		Statics.method7913(var3);
		int var4 = Statics.field2119.method13954() << 8;
		Vector3 var5 = Statics.field2119.method8565().field3464;
		class797.method6033(Statics.field2119.field9807, (int) var5.field3475 + var4, (int) var5.field3477 + var4, field8931);
		field8931 = 0;
	}

	@ObfuscatedName("acm.in(IIIIZB)V")
	public static final void method14742(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (field8980.method6098() == null) {
			Statics.field5187.method496(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		Vector3 var5 = Statics.field2119.method8565().field3464;
		boolean var6 = false;
		if (field8988 == 2) {
			if ((int) var5.field3475 < 0 || (int) var5.field3475 >= field8980.method6220() * 512 || (int) var5.field3477 < 0 || (int) var5.field3477 >= field8980.method6193() * 512) {
				var6 = true;
			}
			if (Statics.field2671 == 2 && !Statics.field1307.method3735()) {
				var6 = true;
			}
		} else if (!field8989) {
			var6 = true;
		}
		if (var6) {
			Statics.field5187.method496(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		field9042++;
		if (Statics.field2119 != null && (int) var5.field3475 - (Statics.field2119.method13954() - 1) * 256 >> 9 == class58.field763 && (int) var5.field3477 - (Statics.field2119.method13954() - 1) * 256 >> 9 == class58.field764) {
			class58.field763 = -1;
			class58.field764 = -1;
			class943.method13915();
		}
		method11164();
		if (!arg4) {
			Statics.method12183();
		}
		method16189();
		Statics.method11240(arg0, arg1, arg2, arg3, true);
		int var7 = field9201;
		int var8 = field9202;
		int var9 = field9025;
		int var10 = field9168;
		Statics.method11384(var7, var8);
		if (Statics.field2671 == 4) {
			int var11 = (int) field9171;
			if (field9173 >> 8 > var11) {
				var11 = field9173 >> 8;
			}
			if (field9057[4] && field9190[4] + 128 > var11) {
				var11 = field9190[4] + 128;
			}
			int var12 = field9008 + (int) field9021 & 0x3FFF;
			method7768(Statics.field2297, method8663((int) var5.field3475, (int) var5.field3477, Statics.field7324) - field9027, Statics.field6818, var11, var12, (var11 >> 3) * 3 + 600 << 2, var10);
		} else if (Statics.field2671 == 5) {
			int var13 = (int) field9171;
			if (field9173 >> 8 > var13) {
				var13 = field9173 >> 8;
			}
			if (field9057[4] && field9190[4] + 128 > var13) {
				var13 = field9190[4] + 128;
			}
			int var14 = (int) field9021 & 0x3FFF;
			method7768(Statics.field2297, method8663(field9154, field9019, Statics.field7324) - field9027, Statics.field6818, var13, var14, (var13 >> 3) * 3 + 600 << 2, var10);
		} else if (Statics.field2671 == 6) {
			Statics.method14216(var10);
		}
		int var15 = Statics.field6769;
		int var16 = Statics.field8423;
		int var17 = Statics.field8424;
		int var18 = Statics.field2328;
		int var19 = Statics.field664;
		for (int var20 = 0; var20 < 5; var20++) {
			if (field9057[var20]) {
				int var21 = (int) (Math.random() * (double) (field9189[var20] * 2 + 1) - (double) field9189[var20] + Math.sin((double) field9191[var20] / 100.0D * (double) field9110[var20]) * (double) field9190[var20]);
				if (var20 == 0) {
					Statics.field6769 += var21 << 2;
				}
				if (var20 == 1) {
					Statics.field8423 += var21 << 2;
				}
				if (var20 == 2) {
					Statics.field8424 += var21 << 2;
				}
				if (var20 == 3) {
					Statics.field664 = Statics.field664 + var21 & 0x3FFF;
				}
				if (var20 == 4) {
					Statics.field2328 += var21;
					if (Statics.field2328 < 1024) {
						Statics.field2328 = 1024;
					} else if (Statics.field2328 > 3072) {
						Statics.field2328 = 3072;
					}
				}
			}
		}
		if (Statics.field6769 < 0) {
			Statics.field6769 = 0;
		}
		if (Statics.field6769 > (field8980.method6098().field4495 << 9) - 1) {
			Statics.field6769 = (field8980.method6098().field4495 << 9) - 1;
		}
		if (Statics.field8424 < 0) {
			Statics.field8424 = 0;
		}
		if (Statics.field8424 > (field8980.method6098().field4496 << 9) - 1) {
			Statics.field8424 = (field8980.method6098().field4496 << 9) - 1;
		}
		method4694();
		Statics.field5187.method474(var7, var8, var9, var10);
		Statics.field5187.method659(var7, var8, var7 + var9, var8 + var10);
		class470 var22 = field8980.method6139().method8174();
		int var23 = var22.method8226();
		class195 var24 = new class195();
		class453 var25 = field8980.method6214();
		if (class46.method14782()) {
			Statics.field3780.method3713(var24, field8925, field8924, var25.field4836 << 9, var25.field4838 << 9);
		} else if (Statics.field2671 == 2) {
			Statics.field1307.method3713(var24, field8925, field8924, var25.field4836 << 9, var25.field4838 << 9);
		} else {
			field8925.method5114((float) -Statics.field6769, (float) -Statics.field8423, (float) -Statics.field8424);
			field8925.method5178(0.0F, -1.0F, 0.0F, class312.method5096(-Statics.field664 & 0x3FFF));
			field8925.method5178(-1.0F, 0.0F, 0.0F, class312.method5096(-Statics.field2328 & 0x3FFF));
			field8925.method5178(0.0F, 0.0F, -1.0F, class312.method5096(-Statics.field7183 & 0x3FFF));
			method12142(field8924, true, (float) (var9 / 2), (float) (var10 / 2), (float) (field9205 << 1), (float) (field9205 << 1), var9, var10);
		}
		Statics.field5187.method524(field8925);
		Statics.field5187.method784(field8924);
		if (var22.method8210() == null) {
			Statics.field5187.method505(3, var23);
		} else {
			Statics.field5187.method529(1.0F);
			Statics.field5187.method530(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			var22.method8210().method6369(Statics.field5187, Statics.field3358 << 3, var7, var8, var9, var10, Statics.field2328, Statics.field664, Statics.field7183, var23, true, false);
		}
		class42.method2994(field8925, field8924, var9, var10);
		field8980.method6139().method8144(field8980);
		byte var26 = Statics.field4961.field9655.method15735() == 2 ? (byte) field9042 : 1;
		if (class46.method14782() || Statics.field2671 == 2) {
			field8980.method6098().method7419(field9213, var24.field2212, var24.field2211, var24.field2213, field8980.method6129(), field9058, field9222, field9097, field9061, field8945, Statics.field2119.field9807 + 1, var26, (int) var5.field3475 >> 9, (int) var5.field3477 >> 9, Statics.field4961.field9645.method15679() == 0, true, 0, true);
		} else {
			field8980.method6098().method7419(field9213, Statics.field6769, Statics.field8423, Statics.field8424, field8980.method6129(), field9058, field9222, field9097, field9061, field8945, Statics.field2119.field9807 + 1, var26, (int) var5.field3475 >> 9, (int) var5.field3477 >> 9, Statics.field4961.field9645.method15679() == 0, true, 0, true);
		}
		field9017++;
		class395.method3461();
		if (field8923 == 1) {
			method11759(var7, var8, var9, var10, 256, 256);
			method12631(var7, var8, var9, var10, 256, 256);
			method1682(var7, var8, var9, var10, 256, 256);
			method2714(var7, var8, var9, var10);
		}
		field8980.method6098().method7423();
		Statics.field6769 = var15;
		Statics.field8423 = var16;
		Statics.field8424 = var17;
		Statics.field2328 = var18;
		Statics.field664 = var19;
		if (field9226 && Statics.field848.method5764() == 0) {
			field9226 = false;
		}
		if (field9226) {
			Statics.field5187.method496(var7, var8, var9, var10, -16777216);
			Statics.method2579(class588.field6938.method12206(Statics.field2308), false, Statics.field5187, Statics.field560, Statics.field9813);
		}
		method12142(field8924, false, (float) (var9 / 2 + var7), (float) (var10 / 2 + var8), (float) (field9205 << 1), (float) (field9205 << 1), var9, var10);
		Statics.field5187.method784(field8924);
		Statics.method3626(field8924);
	}

	@ObfuscatedName("nz.ia(BB)V")
	public static final void method6987(byte arg0) {
		byte[][][] var1 = field8980.method6129();
		if (var1 == null) {
			var1 = new byte[4][field8980.method6220()][field8980.method6193()];
			field8980.method6107(var1);
		}
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < field8980.method6220(); var3++) {
				for (int var4 = 0; var4 < field8980.method6193(); var4++) {
					var1[var2][var3][var4] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("qs.iw(II)V")
	public static final void method8389(int arg0) {
		field9058 = new int[arg0];
		field9222 = new int[arg0];
		field9097 = new int[arg0];
		field9061 = new int[arg0];
		field8945 = new int[arg0];
	}

	@ObfuscatedName("ee.iq(I)V")
	public static final void method3096() {
		int var0 = 0;
		class423 var1 = field8980.method6098();
		for (int var2 = 0; var2 < field8980.method6220(); var2++) {
			for (int var3 = 0; var3 < field8980.method6193(); var3++) {
				if (method14118(var1.field4497, var0, var2, var3, true)) {
					var0++;
				}
				if (var0 >= 512) {
					return;
				}
			}
		}
	}

	@ObfuscatedName("ic.iv(B)V")
	public static final void method4694() {
		if (Statics.field4961.field9655.method15735() != 2) {
			return;
		}
		byte[][][] var0 = field8980.method6129();
		byte var1 = (byte) (field9042 - 4 & 0xFF);
		int var2 = field9042 % field8980.method6220();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < field8980.method6193(); var4++) {
				var0[var3][var2][var4] = var1;
			}
		}
		if (Statics.field7324 == 3) {
			return;
		}
		for (int var5 = 0; var5 < 2; var5++) {
			field9058[var5] = -1000000;
			field9222[var5] = 1000000;
			field9097[var5] = 0;
			field8945[var5] = 1000000;
			field9061[var5] = 0;
		}
		Vector3 var6 = Statics.field2119.method8565().field3464;
		int var7 = (int) var6.field3475;
		int var8 = (int) var6.field3477;
		class338 var9 = field8980.method6100();
		class423 var10 = field8980.method6098();
		if (Statics.field2671 != 4 && Statics.field1941 == -1) {
			int var11 = method8663(Statics.field6769, Statics.field8424, Statics.field7324);
			if (var11 - Statics.field8423 < 3200 && (var9.field3606[Statics.field7324][Statics.field6769 >> 9][Statics.field8424 >> 9] & 0x4) != 0) {
				method14118(var10.field4497, 1, Statics.field6769 >> 9, Statics.field8424 >> 9, false);
			}
			return;
		}
		if (Statics.field2671 != 4) {
			var7 = Statics.field1941;
			var8 = Statics.field3308;
		}
		if ((var9.field3606[Statics.field7324][var7 >> 9][var8 >> 9] & 0x4) != 0) {
			method14118(var10.field4497, 0, var7 >> 9, var8 >> 9, false);
			return;
		}
		int var12 = Statics.field6769 >> 9;
		int var13 = Statics.field8424 >> 9;
		int var14 = var7 >> 9;
		int var15 = var8 >> 9;
		if (var9.method5797(var12, var13)) {
			int var16 = method8663(Statics.field6769, Statics.field8424, 3);
			if (Statics.field8423 >= var16) {
				method14118(var10.field4497, 1, var12, var13, false);
			}
			return;
		}
		if (Statics.field2328 >= 2560) {
			return;
		}
		int var17;
		if (var14 > var12) {
			var17 = var14 - var12;
		} else {
			var17 = var12 - var14;
		}
		int var18;
		if (var15 > var13) {
			var18 = var15 - var13;
		} else {
			var18 = var13 - var15;
		}
		if (var17 == 0 && var18 == 0 || var17 <= -field8980.method6220() || var17 >= field8980.method6220() || var18 <= -field8980.method6193() || var18 >= field8980.method6193()) {
			class453 var23 = field8980.method6214();
			class983.report(var12 + class32.field488 + var13 + " " + var14 + class32.field488 + var15 + " " + var23.field4836 + class32.field488 + var23.field4838, new RuntimeException());
			return;
		}
		if (var17 <= var18) {
			int var21 = var17 * 65536 / var18;
			int var22 = 32768;
			while (var13 != var15) {
				if (var13 < var15) {
					var13++;
				} else if (var13 > var15) {
					var13--;
				}
				if ((var9.field3606[Statics.field7324][var12][var13] & 0x4) != 0) {
					method14118(var10.field4497, 1, var12, var13, false);
					break;
				}
				var22 += var21;
				if (var22 >= 65536) {
					var22 -= 65536;
					if (var12 < var14) {
						var12++;
					} else if (var12 > var14) {
						var12--;
					}
					if ((var9.field3606[Statics.field7324][var12][var13] & 0x4) != 0) {
						method14118(var10.field4497, 1, var12, var13, false);
						break;
					}
				}
			}
			return;
		}
		int var19 = var18 * 65536 / var17;
		int var20 = 32768;
		while (var12 != var14) {
			if (var12 < var14) {
				var12++;
			} else if (var12 > var14) {
				var12--;
			}
			if ((var9.field3606[Statics.field7324][var12][var13] & 0x4) != 0) {
				method14118(var10.field4497, 1, var12, var13, false);
				break;
			}
			var20 += var19;
			if (var20 >= 65536) {
				var20 -= 65536;
				if (var13 < var15) {
					var13++;
				} else if (var13 > var15) {
					var13--;
				}
				if ((var9.field3606[Statics.field7324][var12][var13] & 0x4) != 0) {
					method14118(var10.field4497, 1, var12, var13, false);
					break;
				}
			}
		}
	}

	@ObfuscatedName("aav.ij([[[Lou;IIIZI)Z")
	public static final boolean method14118(class424[][][] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		byte[][][] var5 = field8980.method6129();
		byte var6 = arg4 ? 1 : (byte) (field9042 & 0xFF);
		if (var5[Statics.field7324][arg2][arg3] == var6) {
			return false;
		}
		class338 var7 = field8980.method6100();
		if ((var7.field3606[Statics.field7324][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		byte var8 = 0;
		int var9 = 0;
		field9128[var8] = arg2;
		int var36 = var8 + 1;
		field9231[var8] = arg3;
		var5[Statics.field7324][arg2][arg3] = var6;
		while (var36 != var9) {
			int var10 = field9128[var9] & 0xFFFF;
			int var11 = field9128[var9] >> 16 & 0xFF;
			int var12 = field9128[var9] >> 24 & 0xFF;
			int var13 = field9231[var9] & 0xFFFF;
			int var14 = field9231[var9] >> 16 & 0xFF;
			var9 = var9 + 1 & 0xFFF;
			boolean var15 = false;
			if ((var7.field3606[Statics.field7324][var10][var13] & 0x4) == 0) {
				var15 = true;
			}
			boolean var16 = false;
			if (arg0 != null) {
				label242: for (int var17 = Statics.field7324 + 1; var17 <= 3; var17++) {
					if (arg0[var17] != null && (var7.field3606[var17][var10][var13] & 0x8) == 0) {
						if (var15 && arg0[var17][var10][var13] != null) {
							if (arg0[var17][var10][var13].field4548 != null) {
								int var18 = method7881(var11);
								if (arg0[var17][var10][var13].field4548.field10507 == var18 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var18) {
									continue;
								}
								if (var12 != 0) {
									int var19 = method7881(var12);
									if (arg0[var17][var10][var13].field4548.field10507 == var19 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var19) {
										continue;
									}
								}
								if (var14 != 0) {
									int var20 = method7881(var14);
									if (arg0[var17][var10][var13].field4548.field10507 == var20 || arg0[var17][var10][var13].field4550 != null && arg0[var17][var10][var13].field4550.field10507 == var20) {
										continue;
									}
								}
							}
							class424 var21 = arg0[var17][var10][var13];
							if (var21.field4554 != null) {
								for (class430 var22 = var21.field4554; var22 != null; var22 = var22.field4641) {
									class974 var23 = var22.field4642;
									if (var23 instanceof Location) {
										Location var24 = (Location) var23;
										int var25 = var24.method2390();
										int var26 = var24.method2391();
										if (var25 == 21) {
											var25 = 19;
										}
										int var27 = var25 | var26 << 6;
										if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
											continue label242;
										}
									}
								}
							}
						}
						class424 var28 = arg0[var17][var10][var13];
						if (var28 != null && var28.field4554 != null) {
							for (class430 var29 = var28.field4554; var29 != null; var29 = var29.field4641) {
								class974 var30 = var29.field4642;
								if (var30.field10510 != var30.field10508 || var30.field10511 != var30.field10509) {
									for (int var31 = var30.field10510; var31 <= var30.field10508; var31++) {
										for (int var32 = var30.field10509; var32 <= var30.field10511; var32++) {
											var5[var17][var31][var32] = var6;
										}
									}
								}
							}
						}
						var5[var17][var10][var13] = var6;
						var16 = true;
					}
				}
			}
			if (var16) {
				int var33 = field8980.method6098().field4498[Statics.field7324 + 1].method199(var10, var13);
				if (field9058[arg1] < var33) {
					field9058[arg1] = var33;
				}
				int var34 = var10 << 9;
				int var35 = var13 << 9;
				if (field9222[arg1] > var34) {
					field9222[arg1] = var34;
				} else if (field9097[arg1] < var34) {
					field9097[arg1] = var34;
				}
				if (field8945[arg1] > var35) {
					field8945[arg1] = var35;
				} else if (field9061[arg1] < var35) {
					field9061[arg1] = var35;
				}
			}
			if (!var15) {
				if (var10 >= 1 && var5[Statics.field7324][var10 - 1][var13] != var6) {
					field9128[var36] = var10 - 1 | 0x120000 | 0xD3000000;
					field9231[var36] = var13 | 0x130000;
					var36 = var36 + 1 & 0xFFF;
					var5[Statics.field7324][var10 - 1][var13] = var6;
				}
				var13++;
				if (var13 < field8980.method6193()) {
					if (var10 - 1 >= 0 && var5[Statics.field7324][var10 - 1][var13] != var6 && (var7.field3606[Statics.field7324][var10][var13] & 0x4) == 0 && (var7.field3606[Statics.field7324][var10 - 1][var13 - 1] & 0x4) == 0) {
						field9128[var36] = var10 - 1 | 0x120000 | 0x52000000;
						field9231[var36] = var13 | 0x130000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10 - 1][var13] = var6;
					}
					if (var5[Statics.field7324][var10][var13] != var6) {
						field9128[var36] = var10 | 0x520000 | 0x13000000;
						field9231[var36] = var13 | 0x530000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10][var13] = var6;
					}
					if (var10 + 1 < field8980.method6220() && var5[Statics.field7324][var10 + 1][var13] != var6 && (var7.field3606[Statics.field7324][var10][var13] & 0x4) == 0 && (var7.field3606[Statics.field7324][var10 + 1][var13 - 1] & 0x4) == 0) {
						field9128[var36] = var10 + 1 | 0x520000 | 0x92000000;
						field9231[var36] = var13 | 0x530000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10 + 1][var13] = var6;
					}
				}
				var13--;
				if (var10 + 1 < field8980.method6220() && var5[Statics.field7324][var10 + 1][var13] != var6) {
					field9128[var36] = var10 + 1 | 0x920000 | 0x53000000;
					field9231[var36] = var13 | 0x930000;
					var36 = var36 + 1 & 0xFFF;
					var5[Statics.field7324][var10 + 1][var13] = var6;
				}
				var13--;
				if (var13 >= 0) {
					if (var10 - 1 >= 0 && var5[Statics.field7324][var10 - 1][var13] != var6 && (var7.field3606[Statics.field7324][var10][var13] & 0x4) == 0 && (var7.field3606[Statics.field7324][var10 - 1][var13 + 1] & 0x4) == 0) {
						field9128[var36] = var10 - 1 | 0xD20000 | 0x12000000;
						field9231[var36] = var13 | 0xD30000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10 - 1][var13] = var6;
					}
					if (var5[Statics.field7324][var10][var13] != var6) {
						field9128[var36] = var10 | 0xD20000 | 0x93000000;
						field9231[var36] = var13 | 0xD30000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10][var13] = var6;
					}
					if (var10 + 1 < field8980.method6220() && var5[Statics.field7324][var10 + 1][var13] != var6 && (var7.field3606[Statics.field7324][var10][var13] & 0x4) == 0 && (var7.field3606[Statics.field7324][var10 + 1][var13 + 1] & 0x4) == 0) {
						field9128[var36] = var10 + 1 | 0x920000 | 0xD2000000;
						field9231[var36] = var13 | 0x930000;
						var36 = var36 + 1 & 0xFFF;
						var5[Statics.field7324][var10 + 1][var13] = var6;
					}
				}
			}
		}
		if (field9058[arg1] != -1000000) {
			field9058[arg1] += 40;
			field9222[arg1] -= 512;
			field9097[arg1] += 512;
			field9061[arg1] += 512;
			field8945[arg1] -= 512;
		}
		return true;
	}

	@ObfuscatedName("ph.id(II)I")
	public static final int method7881(int arg0) {
		int var1 = arg0 & 0x3F;
		int var2 = arg0 >> 6 & 0x3;
		if (var1 == 18) {
			if (var2 == 0) {
				return 1;
			}
			if (var2 == 1) {
				return 2;
			}
			if (var2 == 2) {
				return 4;
			}
			if (var2 == 3) {
				return 8;
			}
		} else if (var1 == 19 || var1 == 21) {
			if (var2 == 0) {
				return 16;
			}
			if (var2 == 1) {
				return 32;
			}
			if (var2 == 2) {
				return 64;
			}
			if (var2 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@ObfuscatedName("sb.io(I)V")
	public static final void method11164() {
		for (class763 var0 = (class763) field9046.method11642(); var0 != null; var0 = (class763) field9046.method11642()) {
			Statics.method14063(var0);
		}
		byte var1 = 0;
		byte var2 = 3;
		if (field8988 == 0) {
			for (int var3 = var1; var3 <= var2; var3++) {
				method14327(var3);
			}
			method14343();
			return;
		}
		method14608();
		for (int var4 = var1; var4 <= var2; var4++) {
			method14325();
			method14538(var4);
			method14327(var4);
		}
		method14328();
		method14343();
	}

	@ObfuscatedName("client.ib()V")
	public static final void method14608() {
		int var0 = class55.field732;
		int[] var1 = class55.field727;
		int var2 = Statics.field4961.field9649.method15837();
		boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
		for (int var4 = 0; var4 < var0; var4++) {
			class902 var5 = field9070[var1[var4]];
			if (!var5.method16125()) {
				var5.field8600 = -1;
			} else if (var5.field10066) {
				var5.field8600 = -1;
			} else {
				var5.method14006();
				if (var5.field10510 >= 0 && var5.field10509 >= 0 && var5.field10508 < field8980.method6220() && var5.field10511 < field8980.method6193()) {
					var5.field10050 = var5.field8616.field9899 ? var3 : false;
					if (Statics.field2119 == var5) {
						var5.field8600 = Integer.MAX_VALUE;
					} else {
						int var6 = 0;
						if (!var5.field8634) {
							var6++;
						}
						if (!var5.field8612.method11647()) {
							var6 += 2;
						}
						int var7 = var6 + (5 - var5.method13954() << 2);
						if (var5.field10065 || var5.field10067) {
							var7 += 512;
						} else {
							if (field9047 == 0) {
								var7 += 32;
							} else {
								var7 += 128;
							}
							var7 += 256;
						}
						var5.field8600 = var7 + 1;
					}
				} else {
					var5.field8600 = -1;
				}
			}
		}
		for (int var8 = 0; var8 < field9104; var8++) {
			class903 var9 = (class903) ((class798) field8964.method11923((long) field9056[var8])).field9550;
			if (var9.method16154() && var9.field10075.method12517(Statics.field2669)) {
				var9.method14006();
				if (var9.field10510 >= 0 && var9.field10509 >= 0 && var9.field10508 < field8980.method6220() && var9.field10511 < field8980.method6193()) {
					int var10 = 0;
					if (!var9.field8634) {
						var10++;
					}
					if (!var9.field8612.method11647()) {
						var10 += 2;
					}
					int var11 = var10 + (5 - var9.method13954() << 2);
					if (field9047 == 0) {
						if (var9.field10075.field7238) {
							var11 += 64;
						} else {
							var11 += 128;
						}
					} else if (field9047 == 1) {
						if (var9.field10075.field7238) {
							var11 += 32;
						} else {
							var11 += 64;
						}
					}
					if (var9.field10075.field7246) {
						var11 += 1024;
					} else if (!var9.field10075.field7237) {
						var11 += 256;
					}
					var9.field8600 = var11 + 1;
				} else {
					var9.field8600 = -1;
				}
			} else {
				var9.field8600 = -1;
			}
		}
		for (int var12 = 0; var12 < field8936.length; var12++) {
			class60 var13 = field8936[var12];
			if (var13 != null) {
				if (var13.field776 == 1) {
					class798 var14 = (class798) field8964.method11923((long) var13.field772);
					if (var14 != null) {
						class903 var15 = (class903) var14.field9550;
						if (var15.field8600 >= 0) {
							var15.field8600 += 2048;
						}
					}
				} else if (var13.field776 == 10) {
					class902 var16 = field9070[var13.field772];
					if (var16 != null && Statics.field2119 != var16 && var16.field8600 >= 0) {
						var16.field8600 += 2048;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.ix()V")
	public static final void method14325() {
		int[][] var0 = field8980.method6133();
		int var1 = field8980.method6220();
		int var2 = field8980.method6193();
		for (int var3 = 0; var3 < var1; var3++) {
			int[] var4 = var0[var3];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = 0;
			}
		}
	}

	@ObfuscatedName("client.iz(I)V")
	public static final void method14538(int arg0) {
		int var1 = class55.field732;
		int[] var2 = class55.field727;
		int[][] var3 = field8980.method6133();
		int[][] var4 = field8980.method6105();
		int var5;
		if (field8988 == 0) {
			var5 = Statics.field1537.length;
		} else {
			var5 = field9104 + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (field8988 == 0) {
				class149 var7 = Statics.field1537[var6];
				if (!var7.field1563) {
					continue;
				}
				var8 = var7.method2854();
			} else {
				if (var6 < var1) {
					var8 = field9070[var2[var6]];
				} else {
					var8 = (PathingEntity) ((class798) field8964.method11923((long) field9056[var6 - var1])).field9550;
				}
				if (var8.field9807 != arg0 || var8.field8600 < 0) {
					continue;
				}
			}
			int var9 = var8.method13954();
			Vector3 var10 = var8.method8565().field3464;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.field3475 & 0x1FF) != 0 || ((int) var10.field3477 & 0x1FF) != 0) {
					continue;
				}
			} else if (((int) var10.field3475 & 0x1FF) != 256 || ((int) var10.field3477 & 0x1FF) != 256) {
				continue;
			}
			int var10002;
			if (var9 == 1) {
				int var11 = (int) var10.field3475 >> 9;
				int var12 = (int) var10.field3477 >> 9;
				if (var8.field8600 > var3[var11][var12]) {
					var3[var11][var12] = var8.field8600;
					var4[var11][var12] = 1;
				} else if (var8.field8600 == var3[var11][var12]) {
					var10002 = var4[var11][var12]++;
				}
			} else {
				int var13 = (var9 - 1) * 256 + 60;
				int var14 = (int) var10.field3475 - var13 >> 9;
				int var15 = (int) var10.field3477 - var13 >> 9;
				int var16 = (int) var10.field3475 + var13 >> 9;
				int var17 = (int) var10.field3477 + var13 >> 9;
				for (int var18 = var14; var18 <= var16; var18++) {
					for (int var19 = var15; var19 <= var17; var19++) {
						if (var8.field8600 > var3[var18][var19]) {
							var3[var18][var19] = var8.field8600;
							var4[var18][var19] = 1;
						} else if (var8.field8600 == var3[var18][var19]) {
							var10002 = var4[var18][var19]++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.is(I)V")
	public static final void method14327(int arg0) {
		int var1 = class55.field732;
		int[] var2 = class55.field727;
		int[][] var3 = field8980.method6133();
		int[][] var4 = field8980.method6105();
		int var5;
		if (field8988 == 0) {
			var5 = Statics.field1537.length;
		} else {
			var5 = field8939 ? var1 : field9104 + var1;
		}
		for (int var6 = 0; var6 < var5; var6++) {
			PathingEntity var8;
			if (field8988 == 0) {
				class149 var7 = Statics.field1537[var6];
				if (!var7.field1563) {
					continue;
				}
				var8 = var7.method2854();
			} else {
				if (var6 < var1) {
					var8 = field9070[var2[var6]];
				} else {
					var8 = (PathingEntity) ((class798) field8964.method11923((long) field9056[var6 - var1])).field9550;
				}
				if (var8.field9807 != arg0) {
					continue;
				}
				if (var8.field8600 < 0) {
					var8.field8634 = false;
					continue;
				}
			}
			var8.field8598 = 0;
			int var9 = var8.method13954();
			Vector3 var10 = var8.method8565().field3464;
			if ((var9 & 0x1) == 0) {
				if (((int) var10.field3475 & 0x1FF) != 0 || ((int) var10.field3477 & 0x1FF) != 0) {
					var8.field8634 = false;
					continue;
				}
			} else if (((int) var10.field3475 & 0x1FF) != 256 || ((int) var10.field3477 & 0x1FF) != 256) {
				var8.field8634 = false;
				continue;
			}
			if (field8988 != 0) {
				int var10002;
				if (var9 == 1) {
					int var11 = (int) var10.field3475 >> 9;
					int var12 = (int) var10.field3477 >> 9;
					if (var8.field8600 != var3[var11][var12]) {
						var8.field8634 = true;
						continue;
					}
					if (var4[var11][var12] > 1) {
						var10002 = var4[var11][var12]--;
						var8.field8634 = true;
						continue;
					}
				} else {
					int var13 = (var9 - 1) * 256 + 252;
					int var14 = (int) var10.field3475 - var13 >> 9;
					int var15 = (int) var10.field3477 - var13 >> 9;
					int var16 = (int) var10.field3475 + var13 >> 9;
					int var17 = (int) var10.field3477 + var13 >> 9;
					if (!method16493(var3, var4, var8.field8600, var14, var15, var16, var17)) {
						for (int var18 = var14; var18 <= var16; var18++) {
							for (int var19 = var15; var19 <= var17; var19++) {
								if (var8.field8600 == var3[var18][var19]) {
									var10002 = var4[var18][var19]--;
								}
							}
						}
						var8.field8634 = true;
						continue;
					}
				}
			}
			var8.field8634 = false;
			var8.method8552(var10.field3475, (float) method8663((int) var10.field3475, (int) var10.field3477, var8.field9807), var10.field3477);
			field8980.method6098().method7412(var8, true);
		}
	}

	@ObfuscatedName("aiq.im([[I[[IIIIIII)Z")
	public static final boolean method16493(int[][] arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		for (int var7 = arg3; var7 <= arg5; var7++) {
			for (int var8 = arg4; var8 <= arg6; var8++) {
				if (arg0[var7][var8] == arg2 && arg1[var7][var8] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("client.ik()V")
	public static final void method14328() {
		field9045 = 0;
		for (int var0 = 0; var0 < field9104; var0++) {
			class903 var1 = (class903) ((class798) field8964.method11923((long) field9056[var0])).field9550;
			if (var1.field8634 && var1.method13961() != -1) {
				int var2 = (var1.method13954() - 1) * 256 + 252;
				Vector3 var3 = var1.method8565().field3464;
				int var4 = (int) var3.field3475 - var2 >> 9;
				int var5 = (int) var3.field3477 - var2 >> 9;
				PathingEntity var6 = method11160(var1.field9807, var4, var5);
				if (var6 != null) {
					int var7 = var6.field8593;
					if (var6 instanceof class903) {
						var7 += 2048;
					}
					if (var6.field8598 == 0 && var6.method13961() != -1) {
						field9153[field9045] = var7;
						field9062[field9045] = var7;
						field9045++;
						var6.field8598++;
					}
					field9153[field9045] = var7;
					field9062[field9045] = var1.field8593 + 2048;
					field9045++;
					var6.field8598++;
				}
			}
		}
		class485.method4811(field9062, field9153, 0, field9045 - 1);
	}

	@ObfuscatedName("sz.iu(IIIB)Laay;")
	public static PathingEntity method11160(int arg0, int arg1, int arg2) {
		class424 var3 = field8980.method6098().field4497[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		PathingEntity var4 = null;
		int var5 = -1;
		for (class430 var6 = var3.field4554; var6 != null; var6 = var6.field4641) {
			class974 var7 = var6.field4642;
			if (var7 instanceof PathingEntity) {
				PathingEntity var8 = (PathingEntity) var7;
				int var9 = (var8.method13954() - 1) * 256 + 252;
				Vector3 var10 = var8.method8565().field3464;
				int var11 = (int) var10.field3475 - var9 >> 9;
				int var12 = (int) var10.field3477 - var9 >> 9;
				int var13 = (int) var10.field3475 + var9 >> 9;
				int var14 = (int) var10.field3477 + var9 >> 9;
				if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
					int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
					if (var15 > var5) {
						var4 = var8;
						var5 = var15;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("client.ic()V")
	public static final void method14343() {
		int var0 = class55.field732;
		int[] var1 = class55.field727;
		int var2;
		if (field8988 == 0) {
			var2 = Statics.field1537.length;
		} else {
			var2 = field8939 ? var0 : field9104 + var0;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			PathingEntity var5;
			if (field8988 == 0) {
				class149 var4 = Statics.field1537[var3];
				if (!var4.field1563) {
					continue;
				}
				var5 = var4.method2854();
			} else {
				if (var3 < var0) {
					var5 = field9070[var1[var3]];
				} else {
					var5 = (PathingEntity) ((class798) field8964.method11923((long) field9056[var3 - var0])).field9550;
				}
				if (var5.field8600 < 0) {
					continue;
				}
			}
			int var6 = var5.method13954();
			Vector3 var7 = var5.method8565().field3464;
			if ((var6 & 0x1) == 0) {
				if (((int) var7.field3475 & 0x1FF) == 0 && ((int) var7.field3477 & 0x1FF) == 0) {
					continue;
				}
			} else if (((int) var7.field3475 & 0x1FF) == 256 && ((int) var7.field3477 & 0x1FF) == 256) {
				continue;
			}
			var5.method8552(var7.field3475, (float) method8663((int) var7.field3475, (int) var7.field3477, var5.field9807), var7.field3477);
			field8980.method6098().method7412(var5, true);
		}
	}

	@ObfuscatedName("wx.if(I)V")
	public static final void method12652() {
		Iterator var0 = field9090.iterator();
		while (var0.hasNext()) {
			class942 var1 = (class942) var0.next();
			class1010 var2 = var1.field10296;
			var2.method17177(1);
			if (var2.method17184()) {
				var1.method6979();
				var2.method17182();
			}
		}
	}

	@ObfuscatedName("aha.il(I)V")
	public static final void method16189() {
		Iterator var0 = field9090.iterator();
		while (var0.hasNext()) {
			class942 var1 = (class942) var0.next();
			class1010 var2 = var1.field10296;
			if (field8980.method6098() != null && var2.method17178()) {
				field8980.method6098().method7412(var2, true);
			}
		}
	}

	@ObfuscatedName("tv.it(IIIIIII)V")
	public static final void method11759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		for (class764 var6 = (class764) field9091.method11649(); var6 != null; var6 = (class764) field9091.method11644()) {
			if (field9213 >= var6.field9259) {
				var6.method6975();
			} else {
				Statics.method7732(var6.field9257, (var6.field9256 << 9) + 256, (var6.field9255 << 9) + 256, var6.field9260 * 2);
				Statics.field670.method834(var6.field9261, (int) (field9048[0] + (float) arg0), (int) (field9048[1] + (float) arg1), var6.field9258 | 0xFF000000, 0);
			}
		}
	}

	@ObfuscatedName("ay.jv(IIIIIII)V")
	public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class60[] var6 = field8936;
		for (int var7 = 0; var7 < var6.length; var7++) {
			class60 var8 = var6[var7];
			if (var8 != null && var8.field776 == 2) {
				Statics.method7732(var8.field775, var8.field778 * 512, var8.field777 * 262144, var8.field781 * 2);
				if (field9048[0] > -1.0F && field9213 % 20 < 10) {
					class118 var9 = Statics.field6361[var8.field773];
					int var10 = (int) (field9048[0] + (float) arg0 - 12.0F);
					int var11 = (int) (field9048[1] + (float) arg1 - 28.0F);
					var9.method2500(var10, var11);
				}
			}
		}
	}

	@ObfuscatedName("wl.jm(IIIIIII)V")
	public static final void method12631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = class55.field732;
		int[] var7 = class55.field727;
		field9170 = 0;
		int var8;
		if (field8988 == 0) {
			var8 = Statics.field1537.length;
		} else {
			var8 = field9104 + var6;
		}
		for (int var9 = 0; var9 < var8; var9++) {
			class611 var10 = null;
			PathingEntity var12;
			if (field8988 == 0) {
				class149 var11 = Statics.field1537[var9];
				if (!var11.field1563) {
					continue;
				}
				var12 = var11.method2854();
				if (field9042 != var12.field9810) {
					continue;
				}
				if (var11.field1560 >= 0) {
					var10 = ((class903) var12).field10075;
					if (var10.field7244 != null) {
						var10 = var10.method12516(Statics.field2669);
						if (var10 == null) {
							continue;
						}
					}
				}
			} else {
				if (var9 < var6) {
					var12 = field9070[var7[var9]];
				} else {
					var12 = (PathingEntity) ((class798) field8964.method11923((long) field9056[var9 - var6])).field9550;
					var10 = ((class903) var12).field10075;
					if (var10.field7244 != null) {
						var10 = var10.method12516(Statics.field2669);
						if (var10 == null) {
							continue;
						}
					}
				}
				if (var12.field8600 < 0 || field9042 != var12.field9810 && Statics.field2119.field9807 != var12.field9807) {
					continue;
				}
			}
			method7396(var12, var12.method12811());
			if (!(field9048[0] < 0.0F)) {
				if (var12.method13942()) {
					class117 var13 = var12.method13963();
					if (var13 != null && field9170 < field9105) {
						field9186[field9170] = Statics.field2399.method12418(var13.method2477()) / 2;
						field9198[field9170] = (int) field9048[0];
						field8967[field9170] = (int) field9048[1];
						field9175[field9170] = var13;
						field9170++;
					}
				}
				int var14 = (int) (field9048[1] + (float) arg1);
				int var15 = var14 - Statics.field2399.field7176;
				boolean var16 = false;
				if (!var12.field8634 && !var12.field8612.method11647()) {
					for (class767 var17 = (class767) var12.field8612.method11649(); var17 != null; var17 = (class767) var12.field8612.method11644()) {
						class768 var18 = var17.method14734(field9213);
						if (var18 != null) {
							class416 var19 = var17.field9268;
							class902 var20 = field9070[var7[var9]];
							class118 var21;
							class118 var22;
							if (var20 != null && var20.field10065) {
								var21 = var19.method7307(Statics.field5187);
								var22 = var19.method7301(Statics.field5187);
							} else {
								var21 = var19.method7305(Statics.field5187);
								var22 = var19.method7304(Statics.field5187);
							}
							if (var21 != null && var22 != null) {
								int var23 = 255;
								boolean var24 = true;
								int var25 = field9213 - var18.field9271;
								int var26 = var22.method1061() * var18.field9270 / 255;
								int var29;
								if (var18.field9272 > var25) {
									int var27 = var19.field4444 == 0 ? 0 : var25 / var19.field4444 * var19.field4444;
									int var28 = var22.method1061() * var18.field9269 / 255;
									var29 = (var26 - var28) * var27 / var18.field9272 + var28;
								} else {
									var29 = var26;
									int var30 = var18.field9272 + var19.field4445 - var25;
									if (var19.field4443 >= 0) {
										var23 = (var30 << 8) / (var19.field4445 - var19.field4443);
									}
								}
								if (var18.field9270 > 0 && var29 < 2) {
									var29 = 2;
								}
								int var31 = var21.method1045();
								int var32 = (int) (field9048[0] + (float) arg0 - (float) (var21.method1061() >> 1));
								var15 -= var31;
								if (var23 >= 0 && var23 < 255) {
									int var33 = var23 << 24;
									int var34 = var33 | 0xFFFFFF;
									var21.method1054(var32, var15, 0, var34, 1);
									Statics.field5187.method478(var32, var15, var29 + var32, var15 + var31);
									var22.method1054(var32, var15, 0, var34, 1);
								} else {
									var21.method2500(var32, var15);
									Statics.field5187.method478(var32, var15, var29 + var32, var15 + var31);
									var22.method2500(var32, var15);
								}
								Statics.field5187.method659(arg0, arg1, arg0 + arg2, arg1 + arg3);
								var15 -= 2;
								var16 = true;
							}
						} else if (var17.method14735()) {
							var17.method6975();
						}
					}
				}
				if (!var16) {
					var15 -= Statics.field4825.field5164 + 2;
				}
				if (!var12.field8634) {
					if (var10 == null) {
						class902 var35 = (class902) var12;
						if (var35.field10045 != -1) {
							class118 var36 = Statics.field2209[var35.field10045];
							var15 -= var36.method1045();
							var36.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15);
							var15 -= 2;
						}
						if (var35.field10053 != -1) {
							class118 var37 = Statics.field9904[var35.field10053];
							var15 -= var37.method1045();
							var37.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15);
							var15 -= 2;
						}
					} else if (var10.field7231 >= 0 && var10.field7231 < Statics.field9904.length) {
						class118 var38 = Statics.field9904[var10.field7231];
						var15 -= var38.method1045();
						var38.method2500((int) (field9048[0] + (float) arg0 - (float) (var38.method1061() >> 1)), var15);
						var15 -= 2;
					}
				}
				int var10000;
				if (!(var12 instanceof class902)) {
					int var45 = 0;
					class60[] var46 = field8936;
					for (int var47 = 0; var47 < var46.length; var47++) {
						class60 var48 = var46[var47];
						if (var48 != null && var48.field776 == 1 && var48.field772 == field9056[var9 - var6]) {
							class118 var49 = Statics.field6361[var48.field773];
							if (var49.method1045() > var45) {
								var45 = var49.method1045();
							}
							boolean var50;
							if (var48.field774 == 0) {
								var50 = true;
							} else {
								int var51 = GameShell.method2809() * 1000 / var48.field774 / 2;
								var50 = field9213 % (var51 * 2) < var51;
							}
							if (var50) {
								var49.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15 - var49.method1045());
							}
						}
					}
					if (var45 > 0) {
						var10000 = var15 - (var45 + 2);
					}
				} else if (var9 >= 0) {
					int var39 = 0;
					class60[] var40 = field8936;
					for (int var41 = 0; var41 < var40.length; var41++) {
						class60 var42 = var40[var41];
						if (var42 != null && var42.field776 == 10 && var42.field772 == var7[var9]) {
							class118 var43 = Statics.field6361[var42.field773];
							if (var43.method1045() > var39) {
								var39 = var43.method1045();
							}
							var43.method2500((int) (field9048[0] + (float) arg0 - 12.0F), var15 - var43.method1045());
						}
					}
					if (var39 > 0) {
						var10000 = var15 - (var39 + 2);
					}
				}
				for (int var53 = 0; var53 < Statics.field4825.field5147; var53++) {
					int var54 = var12.field8609[var53];
					int var55 = var12.field8607[var53];
					class441 var56 = null;
					int var57 = 0;
					if (var55 >= 0) {
						if (var54 <= field9213) {
							continue;
						}
						var56 = Statics.field5037.method7826(var12.field8607[var53]);
						var57 = var56.field4750;
					} else if (var54 < 0) {
						continue;
					}
					int var58 = var12.field8610[var53];
					class441 var59 = null;
					if (var58 >= 0) {
						var59 = Statics.field5037.method7826(var58);
					}
					if (var54 - var57 <= field9213) {
						if (var56 == null) {
							var12.field8609[var53] = -1;
						} else {
							int var60 = var12.method12811() / 2;
							method7396(var12, var60);
							if (field9048[0] > -1.0F) {
								field9048[0] += Statics.field4825.field5155[var53];
								field9048[1] += Statics.field4825.field5148[var53];
								Object var61 = null;
								Object var62 = null;
								Object var63 = null;
								Object var64 = null;
								int var65 = 0;
								int var66 = 0;
								int var67 = 0;
								int var68 = 0;
								int var69 = 0;
								int var70 = 0;
								int var71 = 0;
								int var72 = 0;
								class118 var73 = null;
								class118 var74 = null;
								class118 var75 = null;
								class118 var76 = null;
								int var77 = 0;
								int var78 = 0;
								int var79 = 0;
								int var80 = 0;
								int var81 = 0;
								int var82 = 0;
								int var83 = 0;
								int var84 = 0;
								int var85 = 0;
								class118 var86 = var56.method7794(Statics.field5187);
								if (var86 != null) {
									var65 = var86.method1061();
									int var87 = var86.method1045();
									if (var87 > var85) {
										var85 = var87;
									}
									var86.method1063(field8955);
									var69 = field8955[0];
								}
								class118 var88 = var56.method7796(Statics.field5187);
								if (var88 != null) {
									var66 = var88.method1061();
									int var89 = var88.method1045();
									if (var89 > var85) {
										var85 = var89;
									}
									var88.method1063(field8955);
									var70 = field8955[0];
								}
								class118 var90 = var56.method7797(Statics.field5187);
								if (var90 != null) {
									var67 = var90.method1061();
									int var91 = var90.method1045();
									if (var91 > var85) {
										var85 = var91;
									}
									var90.method1063(field8955);
									var71 = field8955[0];
								}
								class118 var92 = var56.method7804(Statics.field5187);
								if (var92 != null) {
									var68 = var92.method1061();
									int var93 = var92.method1045();
									if (var93 > var85) {
										var85 = var93;
									}
									var92.method1063(field8955);
									var72 = field8955[0];
								}
								if (var59 != null) {
									var73 = var59.method7794(Statics.field5187);
									if (var73 != null) {
										var77 = var73.method1061();
										int var94 = var73.method1045();
										if (var94 > var85) {
											var85 = var94;
										}
										var73.method1063(field8955);
										var81 = field8955[0];
									}
									var74 = var59.method7796(Statics.field5187);
									if (var74 != null) {
										var78 = var74.method1061();
										int var95 = var74.method1045();
										if (var95 > var85) {
											var85 = var95;
										}
										var74.method1063(field8955);
										var82 = field8955[0];
									}
									var75 = var59.method7797(Statics.field5187);
									if (var75 != null) {
										var79 = var75.method1061();
										int var96 = var75.method1045();
										if (var96 > var85) {
											var85 = var96;
										}
										var75.method1063(field8955);
										var83 = field8955[0];
									}
									var76 = var59.method7804(Statics.field5187);
									if (var76 != null) {
										var80 = var76.method1061();
										int var97 = var76.method1045();
										if (var97 > var85) {
											var85 = var97;
										}
										var76.method1063(field8955);
										var84 = field8955[0];
									}
								}
								class15 var98 = Statics.field2163;
								class15 var99 = Statics.field2163;
								class603 var100 = Statics.field559;
								class603 var101 = Statics.field559;
								int var102 = var56.field4744;
								if (var102 >= 0) {
									class15 var103 = (class15) Statics.field6784.method4859(field8914, var102, true, var56.field4742);
									class603 var104 = Statics.field6784.method4843(field8914, var102);
									if (var103 != null && var104 != null) {
										var98 = var103;
										var100 = var104;
									}
								}
								if (var59 != null) {
									int var105 = var59.field4744;
									if (var105 >= 0) {
										class15 var106 = (class15) Statics.field6784.method4859(field8914, var105, true, var59.field4742);
										class603 var107 = Statics.field6784.method4843(field8914, var105);
										if (var106 != null && var107 != null) {
											var99 = var106;
											var101 = var107;
										}
									}
								}
								Object var108 = null;
								String var109 = null;
								boolean var110 = false;
								int var111 = 0;
								String var112 = var56.method7793(var12.field8608[var53]);
								int var113 = var100.method12418(var112);
								if (var59 != null) {
									var109 = var59.method7793(var12.field8623[var53]);
									var111 = var101.method12418(var109);
								}
								int var114 = 0;
								int var115 = 0;
								if (var66 > 0) {
									var114 = var113 / var66 + 1;
								}
								if (var59 != null && var78 > 0) {
									var115 = var111 / var78 + 1;
								}
								int var116 = 0;
								int var117 = var116;
								if (var65 > 0) {
									var116 += var65;
								}
								var116 += 2;
								int var118 = var116;
								if (var67 > 0) {
									var116 += var67;
								}
								int var119 = var116;
								int var120 = var116;
								int var122;
								if (var66 > 0) {
									int var121 = var66 * var114;
									var122 = var116 + var121;
									var120 = (var121 - var113) / 2 + var116;
								} else {
									var122 = var113 + var116;
								}
								int var123 = var122;
								if (var68 > 0) {
									var122 += var68;
								}
								int var124 = 0;
								int var125 = 0;
								int var126 = 0;
								int var127 = 0;
								int var128 = 0;
								if (var59 != null) {
									var122 += 2;
									var124 = var122;
									if (var77 > 0) {
										var122 += var77;
									}
									var122 += 2;
									var125 = var122;
									if (var79 > 0) {
										var122 += var79;
									}
									var126 = var122;
									var128 = var122;
									if (var78 > 0) {
										int var129 = var78 * var115;
										var122 += var129;
										var128 += (var129 - var111) / 2;
									} else {
										var122 += var111;
									}
									var127 = var122;
									if (var80 > 0) {
										var122 += var80;
									}
								}
								int var130 = var12.field8609[var53] - field9213;
								int var131 = var56.field4738 - var56.field4738 * var130 / var56.field4750;
								int var132 = var56.field4751 * var130 / var56.field4750 + -var56.field4751;
								int var133 = (int) (field9048[0] + (float) arg0 - (float) (var122 >> 1) + (float) var131);
								int var134 = (int) (field9048[1] + (float) arg1 - 12.0F + (float) var132);
								int var135 = var134;
								int var136 = var85 + var134;
								int var137 = var56.field4755 + var134 + 15;
								int var138 = var137 - var100.field7176;
								int var139 = var100.field7177 + var137;
								if (var138 < var134) {
									var135 = var138;
								}
								if (var139 > var136) {
									var136 = var139;
								}
								int var140 = 0;
								if (var59 != null) {
									var140 = var59.field4755 + var134 + 15;
									int var141 = var140 - var101.field7176;
									int var142 = var101.field7177 + var140;
									if (var141 < var135) {
										;
									}
									if (var142 > var136) {
										;
									}
								}
								int var145 = 255;
								if (var56.field4752 >= 0) {
									var145 = (var130 << 8) / (var56.field4750 - var56.field4752);
								}
								if (var145 >= 0 && var145 < 255) {
									int var146 = var145 << 24;
									int var147 = var146 | 0xFFFFFF;
									if (var86 != null) {
										var86.method1054(var117 + var133 - var69, var134, 0, var147, 1);
									}
									if (var90 != null) {
										var90.method1054(var118 + var133 - var71, var134, 0, var147, 1);
									}
									if (var88 != null) {
										for (int var148 = 0; var148 < var114; var148++) {
											var88.method1054(var66 * var148 + (var119 + var133 - var70), var134, 0, var147, 1);
										}
									}
									if (var92 != null) {
										var92.method1054(var123 + var133 - var72, var134, 0, var147, 1);
									}
									var98.method833(var112, var120 + var133, var137, var56.field4736 | var146, 0);
									if (var59 != null) {
										if (var73 != null) {
											var73.method1054(var124 + var133 - var81, var134, 0, var147, 1);
										}
										if (var75 != null) {
											var75.method1054(var125 + var133 - var83, var134, 0, var147, 1);
										}
										if (var74 != null) {
											for (int var149 = 0; var149 < var115; var149++) {
												var74.method1054(var78 * var149 + (var126 + var133 - var82), var134, 0, var147, 1);
											}
										}
										if (var76 != null) {
											var76.method1054(var127 + var133 - var84, var134, 0, var147, 1);
										}
										var99.method833(var109, var128 + var133, var140, var59.field4736 | var146, 0);
									}
								} else {
									if (var86 != null) {
										var86.method2500(var117 + var133 - var69, var134);
									}
									if (var90 != null) {
										var90.method2500(var118 + var133 - var71, var134);
									}
									if (var88 != null) {
										for (int var150 = 0; var150 < var114; var150++) {
											var88.method2500(var66 * var150 + (var119 + var133 - var70), var134);
										}
									}
									if (var92 != null) {
										var92.method2500(var123 + var133 - var72, var134);
									}
									var98.method833(var112, var120 + var133, var137, var56.field4736 | 0xFF000000, 0);
									if (var59 != null) {
										if (var73 != null) {
											var73.method2500(var124 + var133 - var81, var134);
										}
										if (var75 != null) {
											var75.method2500(var125 + var133 - var83, var134);
										}
										if (var74 != null) {
											for (int var151 = 0; var151 < var115; var151++) {
												var74.method2500(var78 * var151 + (var126 + var133 - var82), var134);
											}
										}
										if (var76 != null) {
											var76.method2500(var127 + var133 - var84, var134);
										}
										var99.method833(var109, var128 + var133, var140, var59.field4736 | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int var152 = 0; var152 < field9045; var152++) {
			int var153 = field9153[var152];
			PathingEntity var154;
			if (var153 < 2048) {
				var154 = field9070[var153];
			} else {
				var154 = (PathingEntity) ((class798) field8964.method11923((long) (var153 - 2048))).field9550;
			}
			int var155 = field9062[var152];
			PathingEntity var156;
			if (var155 < 2048) {
				var156 = field9070[var155];
			} else {
				var156 = (PathingEntity) ((class798) field8964.method11923((long) (var155 - 2048))).field9550;
			}
			Statics.method12479(var154, var156, --var154.field8598, arg0, arg1, arg2, arg3, arg4, arg5);
		}
		int var157 = Statics.field2399.field7177 + Statics.field2399.field7176 + 2;
		for (int var158 = 0; var158 < field9170; var158++) {
			int var159 = field9198[var158];
			int var160 = field8967[var158];
			int var161 = field9186[var158];
			boolean var162 = true;
			while (var162) {
				var162 = false;
				for (int var163 = 0; var163 < var158; var163++) {
					if (var160 + 2 > field8967[var163] - var157 && var160 - var157 < field8967[var163] + 2 && var159 - var161 < field9198[var163] + field9186[var163] && var159 + var161 > field9198[var163] - field9186[var163] && field8967[var163] - var157 < var160) {
						var160 = field8967[var163] - var157;
						var162 = true;
					}
				}
			}
			field8967[var158] = var160;
			String var164 = field9175[var158].method2477();
			if (field9107 == 0) {
				int var165 = 16776960;
				int var166 = field9175[var158].method2480();
				if (var166 < 6) {
					var165 = field9073[var166];
				}
				if (var166 == 6) {
					var165 = field9042 % 20 < 10 ? 16711680 : 16776960;
				}
				if (var166 == 7) {
					var165 = field9042 % 20 < 10 ? 255 : 65535;
				}
				if (var166 == 8) {
					var165 = field9042 % 20 < 10 ? 45056 : 8454016;
				}
				if (var166 == 9) {
					int var167 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					if (var167 < 50) {
						var165 = var167 * 1280 + 16711680;
					} else if (var167 < 100) {
						var165 = 16776960 - (var167 - 50) * 327680;
					} else if (var167 < 150) {
						var165 = (var167 - 100) * 5 + 65280;
					}
				}
				if (var166 == 10) {
					int var168 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					if (var168 < 50) {
						var165 = var168 * 5 + 16711680;
					} else if (var168 < 100) {
						var165 = 16711935 - (var168 - 50) * 327680;
					} else if (var168 < 150) {
						var165 = (var168 - 100) * 327680 + 255 - (var168 - 100) * 5;
					}
				}
				if (var166 == 11) {
					int var169 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					if (var169 < 50) {
						var165 = 16777215 - var169 * 327685;
					} else if (var169 < 100) {
						var165 = (var169 - 50) * 327685 + 65280;
					} else if (var169 < 150) {
						var165 = 16777215 - (var169 - 100) * 327680;
					}
				}
				int var170 = var165 | 0xFF000000;
				int var171 = field9175[var158].method2479();
				if (var171 == 0) {
					Statics.field670.method834(var164, arg0 + var159, arg1 + var160, var170, -16777216);
				}
				if (var171 == 1) {
					Statics.field670.method838(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042);
				}
				if (var171 == 2) {
					Statics.field670.method839(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042);
				}
				if (var171 == 3) {
					int var172 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					Statics.field670.method840(var164, arg0 + var159, arg1 + var160, var170, -16777216, field9042, var172);
				}
				if (var171 == 4) {
					int var173 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					int var174 = var173 * (Statics.field2399.method12418(var164) + 100) / 150;
					Statics.field5187.method478(arg0 + var159 - 50, arg1, arg0 + var159 + 50, arg1 + arg3);
					Statics.field670.method833(var164, arg0 + var159 + 50 - var174, arg1 + var160, var170, -16777216);
					Statics.field5187.method659(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (var171 == 5) {
					int var175 = 150 - field9175[var158].method2481() * 150 / field9175[var158].method2482();
					int var176 = 0;
					if (var175 < 25) {
						var176 = var175 - 25;
					} else if (var175 > 125) {
						var176 = var175 - 125;
					}
					int var177 = Statics.field2399.field7177 + Statics.field2399.field7176;
					Statics.field5187.method478(arg0, arg1 + var160 - var177 - 1, arg0 + arg2, arg1 + var160 + 5);
					Statics.field670.method834(var164, arg0 + var159, arg1 + var160 + var176, var170, -16777216);
					Statics.field5187.method659(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Statics.field670.method834(var164, arg0 + var159, arg1 + var160, -256, -16777216);
			}
		}
	}

	@ObfuscatedName("dk.jf(IIIIB)V")
	public static final void method2714(int arg0, int arg1, int arg2, int arg3) {
		int var4 = field9049;
		int var5 = field9032;
		if (field9052 == 1) {
			class118 var6 = Statics.field2618[field9051 * 20 / 100];
			var6.method2500(var4 - 8, var5 - 8);
		}
		if (field9052 == 2) {
			class118 var7 = Statics.field2618[field9051 * 20 / 100 + 4];
			var7.method2500(var4 - 8, var5 - 8);
		}
	}

	@ObfuscatedName("ya.jx(IIIIIIIB)V")
	public static final void method12995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field8988 != 2) {
			return;
		}
		int var7 = class55.field732;
		int[] var8 = class55.field727;
		for (int var9 = 0; var9 < var7; var9++) {
			class902 var10 = field9070[var8[var9]];
			if (var10 != null) {
				var10.method13968(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
		for (int var11 = 0; var11 < field9104; var11++) {
			int var12 = field9056[var11];
			class798 var13 = (class798) field8964.method11923((long) var12);
			if (var13 != null) {
				((PathingEntity) var13.field9550).method13968(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
	}

	@ObfuscatedName("ph.jj(Laes;II)V")
	public static final void method7883(class836 arg0, int arg1) {
		method8592(arg0, arg1, true);
	}

	@ObfuscatedName("oy.jr(Laes;II)V")
	public static final void method7396(class836 arg0, int arg1) {
		method8592(arg0, arg1, false);
	}

	@ObfuscatedName("rm.jh(Laes;IZB)V")
	public static final void method8592(class836 arg0, int arg1, boolean arg2) {
		int var6;
		int var7;
		if (arg0 instanceof class974 && arg0 instanceof Location) {
			class974 var3 = (class974) arg0;
			int var4 = var3.field10508 - var3.field10510 + 1 << 9;
			int var5 = var3.field10511 - var3.field10509 + 1 << 9;
			var6 = (var3.field10510 << 9) + var4 / 2;
			var7 = (var3.field10509 << 9) + var5 / 2;
		} else {
			Vector3 var8 = arg0.method8565().field3464;
			var6 = (int) var8.field3475;
			var7 = (int) var8.field3477;
		}
		method1979(arg0.field9807, var6, var7, 0, arg1, arg2);
	}

	@ObfuscatedName("ac.js(IIIIIZB)V")
	public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (field8980.method6220() - 2) * 512 || arg2 > (field8980.method6193() - 2) * 512)) {
			float[] var6 = field9048;
			field9048[1] = -1.0F;
			var6[0] = -1.0F;
			return;
		}
		int var7 = method8663(arg1, arg2, arg0) - arg4;
		field8925.method5115(Statics.field5187.method525());
		field8925.method5116((float) arg3, 0.0F, 0.0F);
		Statics.field5187.method524(field8925);
		if (arg5) {
			Statics.field5187.method550((float) arg1, (float) var7, (float) arg2, field9048);
		} else {
			Statics.field5187.method567((float) arg1, (float) var7, (float) arg2, field9048);
		}
		field8925.method5116((float) -arg3, 0.0F, 0.0F);
		Statics.field5187.method524(field8925);
		field9048[0] -= field9201;
		field9048[1] -= field9202;
	}

	@ObfuscatedName("re.ja(IIIB)I")
	public static final int method8663(int arg0, int arg1, int arg2) {
		if (field8980.method6098() == null) {
			return 0;
		}
		int var3 = arg0 >> 9;
		int var4 = arg1 >> 9;
		if (var3 < 0 || var4 < 0 || var3 > field8980.method6220() - 1 || var4 > field8980.method6193() - 1) {
			return 0;
		}
		int var5 = arg2;
		if (arg2 < 3 && (field8980.method6100().field3606[1][var3][var4] & 0x2) != 0) {
			var5 = arg2 + 1;
		}
		return field8980.method6098().field4498[var5].method196(arg0, arg1);
	}

	@ObfuscatedName("vi.jp(IIIIII)I")
	public static final int method12385(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field8980.method6098() == null) {
			return 0;
		}
		if (arg4 < 3) {
			class338 var5 = field8980.method6100();
			int var6 = arg0 >> 9;
			int var7 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > field8980.method6220() - 1 || arg3 > field8980.method6193() - 1) {
				return 0;
			}
			if (var6 < 1 || var7 < 1 || var6 > field8980.method6220() - 1 || var7 > field8980.method6193() - 1) {
				return 0;
			}
			boolean var8 = (var5.field3606[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			if ((arg0 & 0x1FF) == 0) {
				boolean var9 = (var5.field3606[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
				boolean var10 = (var5.field3606[1][var6][arg1 >> 9] & 0x2) != 0;
				if (var9 != var10) {
					var8 = (var5.field3606[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				boolean var11 = (var5.field3606[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
				boolean var12 = (var5.field3606[1][arg0 >> 9][var7] & 0x2) != 0;
				if (var11 != var12) {
					var8 = (var5.field3606[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (var8) {
				arg4++;
			}
		}
		return field8980.method6098().field4498[arg4].method196(arg0, arg1);
	}

	@ObfuscatedName("ps.jo(IIIIIIIS)V")
	public static final void method7768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg6 - 334;
		if (var7 < 0) {
			var7 = 0;
		} else if (var7 > 100) {
			var7 = 100;
		}
		int var8 = (field9196 - field9195) * var7 / 100 + field9195;
		int var9 = arg5 * var8 >> 8;
		int var10 = 16384 - arg3 & 0x3FFF;
		int var11 = 16384 - arg4 & 0x3FFF;
		int var12 = 0;
		int var13 = 0;
		int var14 = var9;
		if (var10 != 0) {
			var13 = class312.field3439[var10] * -var9 >> 14;
			var14 = class312.field3447[var10] * var9 >> 14;
		}
		if (var11 != 0) {
			var12 = class312.field3439[var11] * var14 >> 14;
			var14 = class312.field3447[var11] * var14 >> 14;
		}
		Statics.field6769 = arg0 - var12;
		Statics.field8423 = arg1 - var13;
		Statics.field8424 = arg2 - var14;
		Statics.field2328 = arg3;
		Statics.field664 = arg4;
		Statics.field7183 = 0;
	}

	@ObfuscatedName("lu.jd(IIJ)V")
	public static final void method5830(int arg0, int arg1, long arg2) {
		int var4 = (int) arg2 >> 14 & 0x1F;
		int var5 = (int) arg2 >> 20 & 0x3;
		int var6 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		class542 var7 = (class542) class518.method8032(class542.method6247(), var4);
		class435 var8;
		if (class542.field6572 == var7 || class542.field6588 == var7 || class542.field6589 == var7) {
			class540 var9 = field8980.method6103().method11471(var6);
			int var10;
			int var11;
			if (var5 == 0 || var5 == 2) {
				var10 = var9.field6489;
				var11 = var9.field6503;
			} else {
				var10 = var9.field6503;
				var11 = var9.field6489;
			}
			if (var5 != 0) {
			}
			var8 = class434.method1767(arg0, arg1, var10, var11, class542.field6591, 0);
		} else if (class542.method2616(var7.field6590)) {
			var8 = class434.method1767(arg0, arg1, 0, 0, var7, var5);
		} else {
			var8 = class434.method7893(arg0, arg1, 0, 0, var7, var5);
		}
		method2677(arg0, arg1, true, var8);
	}

	@ObfuscatedName("ww.je(IIB)V")
	public static final void method12668(int arg0, int arg1) {
		if (field9163 == class527.field6402) {
			if (method2677(arg0, arg1, false, class434.method11404(arg0, arg1, 1, 1, 0))) {
				return;
			}
			method2677(arg0, arg1, false, Statics.method7914(arg0, arg1, 1, 1));
		} else if (method2677(arg0, arg1, false, Statics.method7914(arg0, arg1, 1, 1))) {
			return;
		} else {
			method2677(arg0, arg1, false, class434.method11404(arg0, arg1, 1, 1, 0));
		}
	}

	@ObfuscatedName("di.ju(IIZLpq;I)Z")
	public static final boolean method2677(int arg0, int arg1, boolean arg2, class435 arg3) {
		int var4 = Statics.field2119.field8642[0];
		int var5 = Statics.field2119.field8643[0];
		if (var4 < 0 || var4 >= field8980.method6220() || var5 < 0 || var5 >= field8980.method6193()) {
			return false;
		} else if (arg0 >= 0 && arg0 < field8980.method6220() && arg1 >= 0 && arg1 < field8980.method6193()) {
			int var6 = class363.method15625(var4, var5, Statics.field2119.method13954(), arg3, field8980.method6101(Statics.field2119.field9807), arg2, field9001, field9065);
			if (var6 < 1) {
				return false;
			}
			class58.field763 = field9001[var6 - 1];
			class58.field764 = field9065[var6 - 1];
			class58.field766 = false;
			class943.method13915();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("lr.jw(Lahg;IIBI)V")
	public static final void method6031(class902 arg0, int arg1, int arg2, byte arg3) {
		int var4 = arg0.field8642[0];
		int var5 = arg0.field8643[0];
		if (var4 < 0 || var4 >= field8980.method6220() || var5 < 0 || var5 >= field8980.method6193() || (arg1 < 0 || arg1 >= field8980.method6220() || arg2 < 0 || arg2 >= field8980.method6193())) {
			return;
		}
		int var6 = class363.method15625(var4, var5, arg0.method13954(), class434.method3645(arg1, arg2), field8980.method6101(arg0.field9807), true, field9001, field9065);
		if (var6 >= 1 && var6 <= 3) {
			for (int var7 = 0; var7 < var6 - 1; var7++) {
				arg0.method16124(field9001[var7], field9065[var7], arg3);
			}
		}
	}

	@ObfuscatedName("ib.jg(Lad;I)Z")
	public static final boolean method4610(class64 arg0) {
		try {
			return method7692(arg0);
		} catch (IOException var6) {
			if (field8923 == 11) {
				arg0.method1917();
				return false;
			} else {
				method8047();
				return true;
			}
		} catch (Exception var7) {
			class453 var3 = field8980.method6214();
			String var4 = (arg0.field840 == null ? -1 : arg0.field840.field3138) + class32.field488 + (arg0.field844 == null ? -1 : arg0.field844.field3138) + class32.field488 + (arg0.field831 == null ? -1 : arg0.field831.field3138) + " " + arg0.field835 + class32.field488 + (var3.field4836 + Statics.field2119.field8642[0]) + class32.field488 + (var3.field4838 + Statics.field2119.field8643[0]) + " ";
			for (int var5 = 0; var5 < arg0.field835 && var5 < 50; var5++) {
				var4 = var4 + arg0.field832.data[var5] + class32.field488;
			}
			class983.report(var4, var7);
			method13897(false);
			return true;
		}
	}

	@ObfuscatedName("pe.jt(Lad;I)Z")
	public static final boolean method7692(class64 arg0) throws IOException {
		class411 var1 = arg0.method1927();
		class964 var2 = arg0.field832;
		if (var1 == null) {
			return false;
		}
		if (arg0.field840 == null) {
			if (arg0.field836) {
				if (!var1.method7212(1)) {
					return false;
				}
				var1.method7196(arg0.field832.data, 0, 1);
				arg0.field842++;
				arg0.field837 = 0;
				arg0.field836 = false;
			}
			var2.pos = 0;
			if (var2.method16859()) {
				if (!var1.method7212(1)) {
					return false;
				}
				var1.method7196(arg0.field832.data, 1, 1);
				arg0.field842++;
				arg0.field837 = 0;
			}
			arg0.field836 = true;
			class283[] var3 = class283.method14807();
			int var4 = var2.method16883();
			if (var4 < 0 || var4 >= var3.length) {
				throw new IOException(var4 + " " + var2.pos);
			}
			arg0.field840 = var3[var4];
			arg0.field835 = arg0.field840.field3139;
		}
		if (arg0.field835 == -1) {
			if (!var1.method7212(1)) {
				return false;
			}
			var1.method7196(var2.data, 0, 1);
			arg0.field835 = var2.data[0] & 0xFF;
			arg0.field842++;
			arg0.field837 = 0;
		}
		if (arg0.field835 == -2) {
			if (!var1.method7212(2)) {
				return false;
			}
			var1.method7196(var2.data, 0, 2);
			var2.pos = 0;
			arg0.field835 = var2.g2();
			arg0.field842 += 2;
			arg0.field837 = 0;
		}
		if (arg0.field835 > 0) {
			if (!var1.method7212(arg0.field835)) {
				return false;
			}
			var2.pos = 0;
			var1.method7196(var2.data, 0, arg0.field835);
			arg0.field842 += arg0.field835;
			arg0.field837 = 0;
		}
		arg0.field831 = arg0.field844;
		arg0.field844 = arg0.field843;
		arg0.field843 = arg0.field840;
		if (class283.field3010 == arg0.field840) {
			method13897(class33.field536);
			arg0.field840 = null;
			return false;
		} else if (class283.field3108 == arg0.field840) {
			method13900(class278.field2800);
			arg0.field840 = null;
			return true;
		} else if (class283.field2982 == arg0.field840) {
			int var5 = var2.method15331();
			int var6 = var2.g4s();
			int var7 = var2.method15311();
			int var8 = var2.method15342();
			int var9 = var2.method15281();
			int var10 = var2.method15342();
			int var11 = var2.method15272();
			int var12 = var2.method15311();
			int var13 = var2.method15272();
			int var14 = var13 >> 2;
			int var15 = var13 & 0x3;
			class453 var16 = new class453(var2.method15342());
			method2793();
			method3589(var10, new class966(var9, var11, new class501(var16, var14, var15, var8)), new int[] { var12, var5, var6, var7 }, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3094 == arg0.field840) {
			int var17 = var2.method15391();
			if (var17 == 65535) {
				var17 = -1;
			}
			int var18 = var2.method15273();
			int var19 = var2.method15286();
			class395.method5596(var17, var19, var18);
			arg0.field840 = null;
			return true;
		} else if (class283.field3004 == arg0.field840) {
			String var20 = var2.gjstr();
			Object[] var21 = new Object[var20.length() + 1];
			for (int var22 = var20.length() - 1; var22 >= 0; var22--) {
				if (var20.charAt(var22) == 's') {
					var21[var22 + 1] = var2.gjstr();
				} else {
					var21[var22 + 1] = Integer.valueOf(var2.g4s());
				}
			}
			var21[0] = Integer.valueOf(var2.g4s());
			method2793();
			HookRequest var23 = new HookRequest();
			var23.onOp = var21;
			ScriptRunner.runHook(var23);
			arg0.field840 = null;
			return true;
		} else if (class283.field3106 == arg0.field840) {
			String var24 = var2.gjstr();
			int var25 = var2.g2();
			method2793();
			class943.method14096(var25, var24);
			arg0.field840 = null;
			return true;
		} else if (class283.field3062 == arg0.field840) {
			Statics.field5051 = null;
			arg0.field840 = null;
			return true;
		} else if (class283.field3001 == arg0.field840) {
			int var26 = var2.g2();
			byte var27 = var2.method15238();
			if (Statics.field5051 == null) {
				Statics.field5051 = new Object[Statics.field7390.field7345];
			}
			Statics.field5051[var26] = Integer.valueOf(var27);
			field9145[++field9146 - 1 & 0x1F] = var26;
			arg0.field840 = null;
			return true;
		} else if (class283.field3057 == arg0.field840) {
			int var28 = var2.method15273();
			byte var29 = var2.method15275();
			method2793();
			class395.method1349(var29, var28);
			arg0.field840 = null;
			return true;
		} else if (class283.field3005 == arg0.field840) {
			method13900(class278.field2810);
			arg0.field840 = null;
			return true;
		} else if (class283.field3070 == arg0.field840) {
			int var30 = var2.method15342();
			int var31 = var2.g4s();
			method2793();
			class943.method1639(var30, var31);
			arg0.field840 = null;
			return true;
		} else if (class283.field3014 == arg0.field840) {
			int var32 = var2.method15331();
			int var33 = var2.method15342();
			int var34 = var2.g2();
			method2793();
			class943.method2995(var33, 5, var34, var32);
			arg0.field840 = null;
			return true;
		} else if (class283.field3117 == arg0.field840) {
			int var35 = var2.method15342();
			method2793();
			class943.method2995(var35, 5, field9071, 0);
			arg0.field840 = null;
			return true;
		} else if (class283.field3038 == arg0.field840) {
			int var36 = var2.method15331();
			method2793();
			if (var36 == -1) {
				Statics.field1941 = -1;
				Statics.field3308 = -1;
			} else {
				class453 var37 = field8980.method6214();
				int var38 = var36 >> 14 & 0x3FFF;
				int var39 = var36 & 0x3FFF;
				int var40 = var38 - var37.field4836;
				if (var40 < 0) {
					var40 = 0;
				} else if (var40 >= field8980.method6220()) {
					var40 = field8980.method6220();
				}
				int var41 = var39 - var37.field4838;
				if (var41 < 0) {
					var41 = 0;
				} else if (var41 >= field8980.method6193()) {
					var41 = field8980.method6193();
				}
				Statics.field1941 = (var40 << 9) + 256;
				Statics.field3308 = (var41 << 9) + 256;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2997 == arg0.field840) {
			byte var42 = var2.method15238();
			int var43 = var2.method15391();
			method2793();
			class943.method3667(var43, var42);
			arg0.field840 = null;
			return true;
		} else if (class283.field3128 == arg0.field840) {
			class964 var44 = new class964(arg0.field835);
			System.arraycopy(arg0.field832.data, arg0.field832.pos, var44.data, 0, arg0.field835);
			method7731();
			if (Statics.field4961.field9667.method15884() == 1) {
				Statics.field8656.method6053(new class358(class360.field3835, var44));
			} else {
				field8980.method6135(new class358(class360.field3835, var44));
			}
			arg0.field840 = null;
			return false;
		} else if (class283.field3027 == arg0.field840) {
			field9030 = var2.method15238();
			if (field9030 == 0 || field9030 == 1) {
				field9079 = true;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3132 == arg0.field840) {
			method13900(class278.field2804);
			arg0.field840 = null;
			return true;
		} else if (class283.field3046 == arg0.field840) {
			method13900(class278.field2809);
			arg0.field840 = null;
			return true;
		} else if (class283.field3009 == arg0.field840) {
			Loading.method186();
			arg0.field840 = null;
			return false;
		} else if (class283.field3085 == arg0.field840) {
			class453 var45 = new class453(var2.method15342());
			int var46 = var2.method15342();
			int var47 = var2.method15391();
			int var48 = var2.method15331();
			int var49 = var2.g4s();
			int var50 = var2.method15331();
			int var51 = var2.method15273();
			int var52 = var2.method15391();
			int var53 = var2.method15342();
			method2793();
			method3589(var46, new class968(var52, var51, new ObjReference(var45, var47)), new int[] { var49, var50, var48, var53 }, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3104 == arg0.field840) {
			int var54 = var2.g4s();
			int var55 = var2.method15311();
			int var56 = var55 >> 28 & 0x3;
			int var57 = var55 >> 14 & 0x3FFF;
			int var58 = var55 & 0x3FFF;
			int var59 = var2.method15273();
			int var60 = var59 >> 2;
			int var61 = var59 & 0x3;
			int var62 = field8986[var60];
			class453 var63 = field8980.method6214();
			int var64 = var57 - var63.field4836;
			int var65 = var58 - var63.field4838;
			method3302(var56, var64, var65, var62, var60, var61, var54);
			arg0.field840 = null;
			return true;
		} else if (class283.field3008 == arg0.field840) {
			int var66 = var2.g4s();
			int var67 = var2.method15248();
			int var68 = var2.method15311();
			method2793();
			class943.method2995(var66, 3, var67, var68);
			arg0.field840 = null;
			return true;
		} else if (class283.field3033 == arg0.field840) {
			int var69 = var2.g2();
			String var70 = var2.gjstr();
			boolean var71 = var2.g1() == 1;
			Statics.field6775 = Statics.field6772;
			Statics.field6776 = var71;
			class574.method8621(var69, var70);
			Object var72 = null;
			method11307(0);
			arg0.field840 = null;
			return false;
		} else if (class283.field3125 == arg0.field840) {
			int var73 = var2.method15272();
			int[] var74 = new int[class365.method2553().length];
			for (int var75 = 0; var75 < class365.method2553().length; var75++) {
				var74[var75] = var2.method15311();
			}
			int var76 = var2.method15248();
			class798 var77 = (class798) field8964.method11923((long) var76);
			if (var77 != null) {
				method8263((PathingEntity) var77.field9550, var74, var73, true);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3091 == arg0.field840) {
			String var78 = var2.gjstr();
			class62.method7065(var78, false, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3115 == arg0.field840) {
			while (var2.pos < arg0.field835) {
				boolean var79 = var2.g1() == 1;
				String var80 = var2.gjstr();
				String var81 = var2.gjstr();
				int var82 = var2.g2();
				int var83 = var2.g1();
				boolean var84 = var2.g1() == 1;
				String var85 = "";
				int var86 = -1;
				int var87 = 0;
				if (var82 > 0) {
					var85 = var2.gjstr();
					var86 = var2.g1();
					var87 = var2.g4s();
				}
				for (int var88 = 0; var88 < field9206; var88++) {
					class47 var89 = field9209[var88];
					if (var79) {
						if (var81.equals(var89.field649)) {
							var89.field649 = var80;
							var89.field646 = var81;
							var80 = null;
							break;
						}
					} else if (var80.equals(var89.field649)) {
						if (var89.field647 != var82) {
							boolean var90 = true;
							for (class765 var91 = (class765) field8934.method11649(); var91 != null; var91 = (class765) field8934.method11644()) {
								if (var91.field9263.equals(var80)) {
									if (var82 != 0 && var91.field9264 == 0) {
										var91.method6975();
										var90 = false;
									} else if (var82 == 0 && var91.field9264 != 0) {
										var91.method6975();
										var90 = false;
									}
								}
							}
							if (var90) {
								field8934.method11640(new class765(var80, var82));
							}
							var89.field647 = var82;
						}
						var89.field646 = var81;
						var89.field648 = var85;
						var89.field645 = var83;
						var89.field650 = var86;
						var89.field651 = var84;
						var89.field652 = var87;
						var80 = null;
						break;
					}
				}
				if (var80 != null && field9206 < 200) {
					class47 var92 = new class47();
					field9209[field9206] = var92;
					var92.field649 = var80;
					var92.field646 = var81;
					var92.field647 = var82;
					var92.field648 = var85;
					var92.field645 = var83;
					var92.field650 = var86;
					var92.field651 = var84;
					var92.field652 = var87;
					field9206++;
				}
			}
			field9121 = 2;
			field9148 = field9132;
			boolean var93 = false;
			int var94 = field9206;
			while (var94 > 0) {
				boolean var95 = true;
				var94--;
				for (int var96 = 0; var96 < var94; var96++) {
					boolean var97 = false;
					class47 var98 = field9209[var96];
					class47 var99 = field9209[var96 + 1];
					if (Statics.field6772.field6768 != var98.field647 && Statics.field6772.field6768 == var99.field647) {
						var97 = true;
					}
					if (!var97 && var98.field647 == 0 && var99.field647 != 0) {
						var97 = true;
					}
					if (!var97 && !var98.field651 && var99.field651) {
						var97 = true;
					}
					if (var97) {
						class47 var100 = field9209[var96];
						field9209[var96] = field9209[var96 + 1];
						field9209[var96 + 1] = var100;
						var95 = false;
					}
				}
				if (var95) {
					break;
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3031 == arg0.field840) {
			Statics.field8469 = var2.method15242();
			field9054 = var2.g1() == 1;
			arg0.field840 = null;
			return true;
		} else if (class283.field3055 == arg0.field840) {
			boolean var101 = var2.g1() == 1;
			String var102 = var2.gjstr();
			String var103 = var102;
			if (var101) {
				var103 = var2.gjstr();
			}
			int var104 = var2.g1();
			boolean var105 = false;
			if (var104 <= 1) {
				if (field9054 && !field9077 || field9081) {
					var105 = true;
				} else if (var104 <= 1 && method11167(var103)) {
					var105 = true;
				}
			}
			if (!var105) {
				String var106 = class121.method4597(class178.method1205(var2));
				if (var104 == 2) {
					class175.method13903(24, 0, class32.method6076(1) + var102, class32.method6076(1) + var103, var102, var106, null, -1);
				} else if (var104 == 1) {
					class175.method13903(24, 0, class32.method6076(0) + var102, class32.method6076(0) + var103, var102, var106, null, -1);
				} else {
					class175.method13903(24, 0, var102, var103, var102, var106, null, -1);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3029 == arg0.field840) {
			field8905 = var2.method15240();
			field9120 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field3103 == arg0.field840) {
			int var107 = var2.g2();
			int var108 = var2.g1();
			method2793();
			class521.method7358(var107, var108, true);
			arg0.field840 = null;
			return true;
		} else if (class283.field3080 == arg0.field840) {
			int var109 = var2.g2();
			if (var109 == 65535) {
				var109 = -1;
			}
			int var110 = var2.g1();
			int var111 = var2.g2();
			int var112 = var2.g1();
			int var113 = var2.g2();
			class395.method1717(var109, var110, var111, var112, false, var113);
			arg0.field840 = null;
			return true;
		} else if (class283.field2992 == arg0.field840) {
			int var114 = var2.method15342();
			int var115 = var2.method15311();
			method2793();
			class943.method1974(var115, var114);
			arg0.field840 = null;
			return true;
		} else if (class283.field2989 == arg0.field840) {
			int var116 = var2.method15342();
			int var117 = var2.method15331();
			method2793();
			class943.method12119(var116, var117);
			arg0.field840 = null;
			return true;
		} else if (class283.field3056 == arg0.field840) {
			int var118 = var2.method15311();
			if (Statics.field3210 != var118) {
				Statics.field3210 = var118;
				ScriptRunner.runTrigger(ClientTriggerType.JCOINS_UPDATED, -1, -1);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3081 == arg0.field840) {
			int var119 = var2.method15281();
			String var120 = var2.gjstr();
			method2793();
			class943.method14096(var119, var120);
			arg0.field840 = null;
			return true;
		} else if (class283.field3042 == arg0.field840) {
			int var121 = var2.g2();
			int var122 = var2.g1();
			boolean var123 = (var122 & 0x1) == 1;
			class769.method12901(var121, var123);
			int var124 = var2.g2();
			for (int var125 = 0; var125 < var124; var125++) {
				int var126 = var2.g1();
				if (var126 == 255) {
					var126 = var2.method15331();
				}
				int var127 = var2.g2();
				class769.method14728(var121, var125, var127 - 1, var126, var123);
			}
			field9137[++field9158 - 1 & 0x1F] = var121;
			arg0.field840 = null;
			return true;
		} else if (class283.field3015 == arg0.field840) {
			int var128 = var2.g1();
			class535 var129 = (class535) class518.method8032(Statics.method2615(), var128);
			if (var129 == null) {
				var129 = class535.field6444;
			}
			class43.method1219(var129);
			arg0.field840 = null;
			return true;
		} else if (class283.field3064 == arg0.field840) {
			class964 var130 = new class964(arg0.field835);
			System.arraycopy(arg0.field832.data, arg0.field832.pos, var130.data, 0, arg0.field835);
			method7731();
			if (Statics.field4961.field9667.method15884() == 1) {
				Statics.field8656.method6053(new class358(class360.field3836, var130));
			} else {
				field8980.method6135(new class358(class360.field3836, var130));
			}
			arg0.field840 = null;
			return false;
		} else if (class283.field3069 == arg0.field840) {
			int var131 = var2.g2();
			int var132 = var2.g1();
			boolean var133 = (var132 & 0x1) == 1;
			while (var2.pos < arg0.field835) {
				int var134 = var2.method15277();
				int var135 = var2.g2();
				int var136 = 0;
				if (var135 != 0) {
					var136 = var2.g1();
					if (var136 == 255) {
						var136 = var2.g4s();
					}
				}
				class769.method14728(var131, var134, var135 - 1, var136, var133);
			}
			field9137[++field9158 - 1 & 0x1F] = var131;
			arg0.field840 = null;
			return true;
		} else if (class283.field3133 == arg0.field840) {
			Statics.field769 = class559.method11235(var2.g1());
			arg0.field840 = null;
			return true;
		} else if (class283.field3032 == arg0.field840) {
			method13900(class278.field2803);
			arg0.field840 = null;
			return true;
		} else if (class283.field3022 == arg0.field840) {
			int var137 = var2.method15331();
			int var138 = var2.method15331();
			int var139 = var2.method15342();
			int var140 = var2.method15273();
			int var141 = var2.method15391();
			int var142 = var2.method15342();
			int var143 = var2.method15342();
			method2793();
			method3589(var139, new class816(var141, var140), new int[] { var137, var138, var142, var143 }, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3101 == arg0.field840) {
			int var144 = var2.g2();
			if (var144 == 65535) {
				var144 = -1;
			}
			int var145 = var2.method15391();
			if (var145 == 65535) {
				var145 = -1;
			}
			int var146 = var2.method15331();
			int var147 = var2.method15248();
			method2793();
			for (int var148 = var145; var148 <= var144; var148++) {
				long var149 = ((long) var146 << 32) + (long) var148;
				class785 var151 = (class785) field9010.method11923(var149);
				class785 var152;
				if (var151 != null) {
					var152 = new class785(var151.field9416, var147);
					var151.method6979();
				} else if (var148 == -1) {
					var152 = new class785(class165.method11381(var146).field1841.field9416, var147);
				} else {
					var152 = new class785(0, var147);
				}
				field9010.pushNode(var152, var149);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3111 == arg0.field840) {
			method13900(class278.field2813);
			arg0.field840 = null;
			return true;
		} else if (class283.field3090 == arg0.field840) {
			int var153 = var2.method15248();
			int var154 = var2.method15391();
			int var155 = var2.method15331();
			int var156 = var2.method15391();
			method2793();
			class943.method2995(var155, 7, var156 << 16 | var154, var153);
			arg0.field840 = null;
			return true;
		} else if (class283.field2975 == arg0.field840) {
			String var157 = var2.gjstr();
			int var158 = var2.method15272();
			int var159 = var2.method15391();
			if (var159 == 65535) {
				var159 = -1;
			}
			int var160 = var2.g1();
			if (var158 >= 1 && var158 <= 8) {
				if (var157.equalsIgnoreCase("null")) {
					var157 = null;
				}
				field9085[var158 - 1] = var157;
				field9084[var158 - 1] = var159;
				field9086[var158 - 1] = var160 == 0;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3096 == arg0.field840) {
			int var161 = var2.g2();
			int var162 = var2.g2();
			int var163 = var2.g2();
			method2793();
			if (Statics.interfaces[var161] != null) {
				for (int var164 = var162; var164 < var163; var164++) {
					int var165 = var2.method15241();
					if (var164 < Statics.interfaces[var161].components.length && Statics.interfaces[var161].components[var164] != null) {
						Statics.interfaces[var161].components[var164].field1850 = var165;
					}
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3041 == arg0.field840) {
			boolean var166 = var2.g1() == 1;
			String var167 = var2.gjstr();
			long var168 = (long) var2.g2();
			long var170 = (long) var2.method15241();
			int var172 = var2.g1();
			int var173 = var2.g2();
			long var174 = (var168 << 32) + var170;
			boolean var176 = false;
			Object var177 = null;
			class788 var178 = var166 ? Statics.field8458 : Statics.field1515;
			if (var178 == null) {
				var176 = true;
			} else {
				int var179 = 0;
				while (true) {
					if (var179 >= 100) {
						if (var172 <= 1 && method11167(var167)) {
							var176 = true;
						}
						break;
					}
					if (field9180[var179] == var174) {
						var176 = true;
						break;
					}
					var179++;
				}
			}
			if (!var176) {
				field9180[field9181] = var174;
				field9181 = (field9181 + 1) % 100;
				String var180 = Statics.field3779.method12176(var173).method16749(var2);
				int var181 = var166 ? 42 : 45;
				if (var172 == 2 || var172 == 3) {
					class175.method13903(var181, 0, class32.method6076(1) + var167, class32.method6076(1) + var167, var167, var180, var178.field9427, var173);
				} else if (var172 == 1) {
					class175.method13903(var181, 0, class32.method6076(0) + var167, class32.method6076(0) + var167, var167, var180, var178.field9427, var173);
				} else {
					class175.method13903(var181, 0, var167, var167, var167, var180, var178.field9427, var173);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3121 == arg0.field840) {
			String var182 = var2.gjstr();
			int var183 = var2.g2();
			String var184 = Statics.field3779.method12176(var183).method16749(var2);
			class175.method13903(19, 0, var182, var182, var182, var184, null, var183);
			arg0.field840 = null;
			return true;
		} else if (class283.field3136 == arg0.field840) {
			field9149 = field9132;
			boolean var185 = var2.g1() == 1;
			class219 var186 = new class219(var2);
			class218 var187;
			if (var185) {
				var187 = Statics.field2972;
			} else {
				var187 = Statics.field913;
			}
			var186.method4109(var187);
			arg0.field840 = null;
			return true;
		} else if (class283.field3000 == arg0.field840) {
			class590.method2794(var2, arg0.field835);
			arg0.field840 = null;
			return true;
		} else if (class283.field3116 == arg0.field840) {
			var2.pos += 28;
			if (var2.method15267()) {
				Statics.method12450(var2, var2.pos - 28);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3017 == arg0.field840) {
			int var188 = var2.g4s();
			int var189 = var2.method15342();
			int var190 = var2.method15248();
			if (var190 == 65535) {
				var190 = -1;
			}
			method2793();
			class943.method15973(var188, var190, var189);
			class592 var191 = Statics.field3492.method12316(var190);
			class943.method3599(var188, var191.field7073, var191.field7077, var191.field7072);
			class943.method12633(var188, var191.field7076, var191.field7075, var191.field7088);
			arg0.field840 = null;
			return true;
		} else if (class283.field3109 == arg0.field840) {
			while (var2.pos < arg0.field835) {
				int var192 = var2.g1();
				boolean var193 = (var192 & 0x1) == 1;
				String var194 = var2.gjstr();
				String var195 = var2.gjstr();
				for (int var196 = 0; var196 < field9211; var196++) {
					class45 var197 = field8999[var196];
					if (var193) {
						if (var195.equals(var197.field639)) {
							var197.field639 = var194;
							var197.field638 = var195;
							var194 = null;
							break;
						}
					} else if (var194.equals(var197.field639)) {
						var197.field639 = var194;
						var197.field638 = var195;
						var194 = null;
						break;
					}
				}
				if (var194 != null && field9211 < 100) {
					class45 var198 = new class45();
					field8999[field9211] = var198;
					var198.field639 = var194;
					var198.field638 = var195;
					var198.field640 = (var192 & 0x2) == 2;
					field9211++;
				}
			}
			field9148 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field2999 == arg0.field840) {
			int var199 = var2.g4s();
			Statics.field771 = new class44(var199);
			Thread var200 = new Thread(Statics.field771);
			var200.setPriority(1);
			var200.start();
			arg0.field840 = null;
			return true;
		} else if (class283.field3012 == arg0.field840) {
			int var201 = var2.method15342();
			int var202 = var2.method15272();
			method2793();
			class943.method7351(var201, var202);
			arg0.field840 = null;
			return true;
		} else if (class283.field3025 == arg0.field840) {
			int var203 = var2.method15277();
			int var204 = var2.g4s();
			int var205 = var2.g1();
			String var206 = "";
			String var207 = var206;
			if ((var205 & 0x1) != 0) {
				var206 = var2.gjstr();
				if ((var205 & 0x2) == 0) {
					var207 = var206;
				} else {
					var207 = var2.gjstr();
				}
			}
			String var208 = var2.gjstr();
			if (var203 == 99) {
				class62.method1958(var208);
			} else if (var203 == 98) {
				class62.method11224(var208);
			} else if (var207.equals("") || !method11167(var207)) {
				class175.method3943(var203, var204, var206, var207, var206, var208);
			} else {
				arg0.field840 = null;
				return true;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2981 == arg0.field840) {
			Statics.field3161 = var2.g1();
			Statics.field6803 = var2.method15238() << 3;
			Statics.field3907 = var2.method15238() << 3;
			arg0.field840 = null;
			return true;
		} else if (class283.field3061 == arg0.field840) {
			boolean var209 = var2.g1() == 1;
			String var210 = var2.gjstr();
			String var211 = var210;
			if (var209) {
				var211 = var2.gjstr();
			}
			long var212 = var2.g8();
			long var214 = (long) var2.g2();
			long var216 = (long) var2.method15241();
			int var218 = var2.g1();
			long var219 = (var214 << 32) + var216;
			boolean var221 = false;
			int var222 = 0;
			while (true) {
				if (var222 >= 100) {
					if (var218 <= 1) {
						if (field9054 && !field9077 || field9081) {
							var221 = true;
						} else if (method11167(var211)) {
							var221 = true;
						}
					}
					break;
				}
				if (field9180[var222] == var219) {
					var221 = true;
					break;
				}
				var222++;
			}
			if (!var221) {
				field9180[field9181] = var219;
				field9181 = (field9181 + 1) % 100;
				String var223 = class121.method4597(class178.method1205(var2));
				if (var218 == 2 || var218 == 3) {
					class175.method13903(9, 0, class32.method6076(1) + var210, class32.method6076(1) + var211, var210, var223, class523.method8066(var212), -1);
				} else if (var218 == 1) {
					class175.method13903(9, 0, class32.method6076(0) + var210, class32.method6076(0) + var211, var210, var223, class523.method8066(var212), -1);
				} else {
					class175.method13903(9, 0, var210, var211, var210, var223, class523.method8066(var212), -1);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2986 == arg0.field840) {
			field8919 = var2.method15240();
			arg0.field840 = null;
			return true;
		} else if (class283.field3054 == arg0.field840) {
			int var224 = var2.method15311();
			boolean var225 = var2.g1() == 1;
			if (Statics.field3497 != var225 || Statics.field3584 != var224) {
				Statics.field3497 = var225;
				Statics.field3584 = var224;
				ScriptRunner.runTrigger(ClientTriggerType.LOYALTY_UPDATED, -1, -1);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3134 == arg0.field840) {
			class58.field762 = var2.g1();
			arg0.field840 = null;
			return true;
		} else if (class283.field3034 == arg0.field840) {
			if (class560.field6700 && Statics.field1587 != null) {
				method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
			}
			byte[] var226 = new byte[arg0.field835];
			var2.method16861(var226, 0, arg0.field835);
			String var227 = class524.method6881(var226, 0, arg0.field835);
			String var228 = "opensn";
			if (!field8903 || !class383.method1814(var227, 1, var228)) {
				class383.method5599(var227, true, Statics.field4961.field9661.method15781() == 5, var228, field8915, field9218);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3051 == arg0.field840) {
			method13900(class278.field2801);
			arg0.field840 = null;
			return true;
		} else if (class283.field3075 == arg0.field840) {
			int var229 = var2.method15281();
			method2793();
			class521.method2930(var229);
			arg0.field840 = null;
			return true;
		} else if (class283.field3087 == arg0.field840) {
			boolean var230 = var2.method15272() == 1;
			int var231 = var2.method15311();
			method2793();
			class943.method15850(var231, var230);
			arg0.field840 = null;
			return true;
		} else if (class283.field3052 == arg0.field840) {
			int var232 = var2.g1();
			int var233 = var2.method15248();
			boolean var234 = (var232 & 0x1) == 1;
			class769.method5568(var233, var234);
			field9137[++field9158 - 1 & 0x1F] = var233;
			arg0.field840 = null;
			return true;
		} else if (class283.field3112 == arg0.field840) {
			int var235 = var2.g1();
			if (var2.g1() == 0) {
				field9184[var235] = new class352();
			} else {
				var2.pos--;
				field9184[var235] = new class352(var2);
			}
			field9152 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field3044 == arg0.field840) {
			field9109 = var2.g1();
			field9120 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field3082 == arg0.field840) {
			boolean var236 = var2.g1() == 1;
			String var237 = var2.gjstr();
			long var238 = (long) var2.g2();
			long var240 = (long) var2.method15241();
			int var242 = var2.g1();
			long var243 = (var238 << 32) + var240;
			boolean var245 = false;
			Object var246 = null;
			class788 var247 = var236 ? Statics.field8458 : Statics.field1515;
			if (var247 == null) {
				var245 = true;
			} else {
				int var248 = 0;
				while (true) {
					if (var248 >= 100) {
						if (var242 <= 1) {
							if (field9054 && !field9077 || field9081) {
								var245 = true;
							} else if (method11167(var237)) {
								var245 = true;
							}
						}
						break;
					}
					if (field9180[var248] == var243) {
						var245 = true;
						break;
					}
					var248++;
				}
			}
			if (!var245) {
				field9180[field9181] = var243;
				field9181 = (field9181 + 1) % 100;
				String var249 = class121.method4597(class178.method1205(var2));
				int var250 = var236 ? 41 : 44;
				if (var242 == 2 || var242 == 3) {
					class175.method13903(var250, 0, class32.method6076(1) + var237, class32.method6076(1) + var237, var237, var249, var247.field9427, -1);
				} else if (var242 == 1) {
					class175.method13903(var250, 0, class32.method6076(0) + var237, class32.method6076(0) + var237, var237, var249, var247.field9427, -1);
				} else {
					class175.method13903(var250, 0, var237, var237, var237, var249, var247.field9427, -1);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3105 == arg0.field840) {
			int var251 = var2.g1();
			int var252 = var2.method15411();
			if (field9044[var251] != null) {
				field9044[var251].method6952(field8980.method6098());
				field9044[var251] = null;
			}
			if (var252 != -1) {
				field9044[var251] = new class396(Statics.field5187, var2, var252);
				field9044[var251].method6951(field8980.method6098());
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3110 == arg0.field840) {
			for (int var253 = 0; var253 < field9070.length; var253++) {
				if (field9070[var253] != null) {
					field9070[var253].field8615 = null;
					field9070[var253].field8597.method11769(-1);
				}
			}
			for (int var254 = 0; var254 < field8966; var254++) {
				((PathingEntity) field8965[var254].field9550).field8615 = null;
				((PathingEntity) field8965[var254].field9550).field8597.method11769(-1);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3093 == arg0.field840) {
			int var255 = var2.method15331();
			int var256 = var2.method15281();
			if (var256 == 65535) {
				var256 = -1;
			}
			int var257 = var2.method15342();
			int var258 = var2.g2();
			if (var258 == 65535) {
				var258 = -1;
			}
			method2793();
			for (int var259 = var258; var259 <= var256; var259++) {
				long var260 = ((long) var257 << 32) + (long) var259;
				class785 var262 = (class785) field9010.method11923(var260);
				class785 var263;
				if (var262 != null) {
					var263 = new class785(var255, var262.field9423);
					var262.method6979();
				} else if (var259 == -1) {
					var263 = new class785(var255, class165.method11381(var257).field1841.field9423);
				} else {
					var263 = new class785(var255, -1);
				}
				field9010.pushNode(var263, var260);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3100 == arg0.field840) {
			Statics.field1307.method14033(var2, arg0.field835);
			arg0.field840 = null;
			return true;
		} else if (class283.field3037 == arg0.field840) {
			Statics.field3161 = var2.g1();
			Statics.field3907 = var2.method15392() << 3;
			Statics.field6803 = var2.method15392() << 3;
			class453 var264 = field8980.method6214();
			for (class774 var265 = (class774) field9088.method11928(); var265 != null; var265 = (class774) field9088.method11929()) {
				int var266 = (int) (var265.field4228 >> 28 & 0x3L);
				int var267 = (int) (var265.field4228 & 0x3FFFL);
				int var268 = var267 - var264.field4836;
				int var269 = (int) (var265.field4228 >> 14 & 0x3FFFL);
				int var270 = var269 - var264.field4838;
				if (Statics.field3161 == var266 && var268 >= Statics.field6803 && var268 < Statics.field6803 + 8 && var270 >= Statics.field3907 && var270 < Statics.field3907 + 8) {
					var265.method6979();
					if (var268 >= 0 && var270 >= 0 && var268 < field8980.method6220() && var270 < field8980.method6193()) {
						method15178(Statics.field3161, var268, var270);
					}
				}
			}
			for (class770 var271 = (class770) class770.field9278.method11563(); var271 != null; var271 = (class770) class770.field9278.method11567()) {
				if (var271.field9291 >= Statics.field6803 && var271.field9291 < Statics.field6803 + 8 && var271.field9280 >= Statics.field3907 && var271.field9280 < Statics.field3907 + 8 && Statics.field3161 == var271.field9281) {
					var271.field9290 = true;
				}
			}
			for (class770 var272 = (class770) class770.field9292.method11563(); var272 != null; var272 = (class770) class770.field9292.method11567()) {
				if (var272.field9291 >= Statics.field6803 && var272.field9291 < Statics.field6803 + 8 && var272.field9280 >= Statics.field3907 && var272.field9280 < Statics.field3907 + 8 && Statics.field3161 == var272.field9281) {
					var272.field9290 = true;
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3039 == arg0.field840) {
			int var273 = var2.method15311();
			int var274 = var2.method15391();
			int var275 = var2.method15331();
			int var276 = var2.method15272();
			int var277 = var2.method15311();
			int var278 = var2.method15331();
			int var279 = var2.method15391();
			int var280 = var2.method15311();
			method2793();
			method3589(var277, new class965(var274, var276, var279), new int[] { var275, var278, var280, var273 }, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3028 == arg0.field840) {
			int var281 = var2.method15281();
			int var282 = var2.method15311();
			method2793();
			class943.method12737(var282, var281);
			arg0.field840 = null;
			return true;
		} else if (class283.field3079 == arg0.field840) {
			int var283 = var2.method15281();
			method2793();
			class521.method11689(var283);
			arg0.field840 = null;
			return true;
		} else if (class283.field3083 == arg0.field840) {
			int var284 = var2.method15248();
			int var285 = var2.g4s();
			method2793();
			class943.method11469(var285, var284);
			arg0.field840 = null;
			return true;
		} else if (class283.field3123 == arg0.field840) {
			int var286 = var2.method15331();
			method2793();
			class816 var287 = (class816) openedSubInterfaces.method11923((long) var286);
			if (var287 != null) {
				method7069(var287, true, false);
			}
			if (field9108 != null) {
				requestRedrawComponent(field9108);
				field9108 = null;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2990 == arg0.field840) {
			int var288 = var2.g2();
			if (var288 == 65535) {
				var288 = -1;
			}
			int var289 = var2.g1();
			int var290 = var2.g2();
			int var291 = var2.g1();
			int var292 = var2.g2();
			class395.method14082(var288, var289, var290, var291, var292);
			arg0.field840 = null;
			return true;
		} else if (class283.field3067 == arg0.field840) {
			int var293 = var2.g2();
			if (var293 == 65535) {
				var293 = -1;
			}
			class395.method5712(var293);
			arg0.field840 = null;
			return true;
		} else if (class283.field3076 == arg0.field840) {
			int var294 = var2.g1();
			int var295 = var2.method15272();
			if (var294 == 255) {
				var294 = -1;
				var295 = -1;
			}
			class943.method3292(var294, var295);
			arg0.field840 = null;
			return true;
		} else if (class283.field3073 == arg0.field840) {
			int var296 = var2.g1();
			class536 var297 = (class536) class518.method8032(class536.method8272(), var296);
			if (var297 == null) {
				var297 = class536.field6455;
			}
			class43.method4554(var297);
			arg0.field840 = null;
			return true;
		} else if (class283.field3124 == arg0.field840) {
			method7723(var2.gjstr());
			arg0.field840 = null;
			return true;
		} else if (class283.field3026 == arg0.field840) {
			method13900(class278.field2812);
			arg0.field840 = null;
			return true;
		} else if (class283.field2987 == arg0.field840) {
			arg0.field840 = null;
			return false;
		} else if (class283.field3003 == arg0.field840) {
			method2793();
			method14029();
			arg0.field840 = null;
			return true;
		} else if (class283.field3119 == arg0.field840) {
			int var298 = var2.g2();
			int var299 = var2.g4s();
			if (Statics.field5051 == null) {
				Statics.field5051 = new Object[Statics.field7390.field7345];
			}
			Statics.field5051[var298] = Integer.valueOf(var299);
			field9145[++field9146 - 1 & 0x1F] = var298;
			arg0.field840 = null;
			return true;
		} else if (class283.field3007 == arg0.field840) {
			boolean var300 = var2.g1() == 1;
			if (var300) {
				Statics.field2671 = 2;
			} else {
				method14029();
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3021 == arg0.field840) {
			method13900(class278.field2807);
			arg0.field840 = null;
			return true;
		} else if (class283.field3074 == arg0.field840) {
			int var301 = var2.g2();
			field8906 = -1;
			field9059 = var301;
			field8988 = 4;
			Statics.field4824.method5630(field9059);
			class42.method3561();
			class42.method1401();
			int var302 = var2.g2();
			Statics.field4561 = new int[var302][4];
			for (int var303 = 0; var303 < var302; var303++) {
				for (int var304 = 0; var304 < 4; var304++) {
					Statics.field4561[var303][var304] = var2.g4s();
				}
			}
			int var305 = var2.g1();
			Statics.field416 = new Packet(var305);
			Statics.field416.method15276(var2.data, var2.pos, var305);
			var2.pos += var305;
			arg0.field840 = null;
			return false;
		} else if (class283.field3097 == arg0.field840) {
			boolean var306 = var2.g1() == 1;
			byte[] var307 = new byte[arg0.field835 - 1];
			var2.method15263(var307, 0, arg0.field835 - 1);
			class574.method2587(var306, var307);
			arg0.field840 = null;
			return true;
		} else if (class283.field3049 == arg0.field840) {
			int var308 = var2.g1();
			int var309 = var308 >> 5;
			int var310 = var308 & 0x1F;
			if (var310 == 0) {
				field8936[var309] = null;
				arg0.field840 = null;
				return true;
			}
			class60 var311 = new class60();
			var311.field776 = var310;
			var311.field773 = var2.g1();
			if (var311.field773 >= 0 && var311.field773 < Statics.field6361.length) {
				if (var311.field776 == 1 || var311.field776 == 10) {
					var311.field772 = var2.g2();
					var311.field774 = var2.g2();
					var2.pos += 4;
				} else if (var311.field776 >= 2 && var311.field776 <= 6) {
					if (var311.field776 == 2) {
						var311.field778 = 131072;
						var311.field777 = 256;
					}
					if (var311.field776 == 3) {
						var311.field778 = 0;
						var311.field777 = 256;
					}
					if (var311.field776 == 4) {
						var311.field778 = 262144;
						var311.field777 = 256;
					}
					if (var311.field776 == 5) {
						var311.field778 = 131072;
						var311.field777 = 0;
					}
					if (var311.field776 == 6) {
						var311.field778 = 131072;
						var311.field777 = 512;
					}
					var311.field776 = 2;
					var311.field775 = var2.g1();
					class453 var312 = field8980.method6214();
					var311.field778 = var311.field778 * 262144 + (var2.g2() - var312.field4836 << 9) * 512;
					var311.field777 = var311.field777 * 262144 + (var2.g2() - var312.field4838 << 9);
					var311.field781 = (var2.g1() << 2) * 4;
					var311.field780 = var2.g2();
				}
				var311.field779 = var2.g4s();
				field8936[var309] = var311;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3023 == arg0.field840) {
			if (openedTopInterface != -1) {
				method6032(openedTopInterface, 0);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3122 == arg0.field840) {
			String var313 = var2.gjstr();
			int var314 = var2.method15311();
			method2793();
			class943.method16188(var314, var313);
			arg0.field840 = null;
			return true;
		} else if (class283.field3050 == arg0.field840) {
			field9177 = var2.method15272();
			field9178 = var2.method15272();
			arg0.field840 = null;
			return true;
		} else if (class283.field2995 == arg0.field840) {
			int var315 = var2.g2();
			long var316 = var2.g8();
			if (Statics.field5051 == null) {
				Statics.field5051 = new Object[Statics.field7390.field7345];
			}
			Statics.field5051[var315] = Long.valueOf(var316);
			field9145[++field9146 - 1 & 0x1F] = var315;
			arg0.field840 = null;
			return true;
		} else if (class283.field3098 == arg0.field840) {
			field8917 = field9132;
			boolean var318 = var2.g1() == 1;
			if (arg0.field835 != 1) {
				if (var318) {
					Statics.field8458 = new class788(var2);
				} else {
					Statics.field1515 = new class788(var2);
				}
				arg0.field840 = null;
				return true;
			}
			if (var318) {
				Statics.field8458 = null;
			} else {
				Statics.field1515 = null;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3071 == arg0.field840) {
			method13900(class278.field2808);
			arg0.field840 = null;
			return true;
		} else if (class283.field3036 == arg0.field840) {
			String var319 = var2.gjstr();
			boolean var320 = var2.g1() == 1;
			String var321;
			if (var320) {
				var321 = var2.gjstr();
			} else {
				var321 = var319;
			}
			int var322 = var2.g2();
			byte var323 = var2.method15238();
			boolean var324 = false;
			if (var323 == -128) {
				var324 = true;
			}
			if (var324) {
				if (Statics.field7045 == 0) {
					arg0.field840 = null;
					return true;
				}
				boolean var325 = false;
				int var326;
				for (var326 = 0; var326 < Statics.field7045 && (!Statics.field5180[var326].field786.equals(var321) || Statics.field5180[var326].field789 != var322); var326++) {
				}
				if (var326 < Statics.field7045) {
					while (var326 < Statics.field7045 - 1) {
						Statics.field5180[var326] = Statics.field5180[var326 + 1];
						var326++;
					}
					Statics.field7045--;
					Statics.field5180[Statics.field7045] = null;
				}
			} else {
				String var327 = var2.gjstr();
				class61 var328 = new class61();
				var328.field791 = var319;
				var328.field786 = var321;
				var328.field787 = class625.method4744(var328.field786);
				var328.field789 = var322;
				var328.field788 = var323;
				var328.field790 = var327;
				int var329;
				for (var329 = Statics.field7045 - 1; var329 >= 0; var329--) {
					int var330 = Statics.field5180[var329].field787.compareTo(var328.field787);
					if (var330 == 0) {
						Statics.field5180[var329].field789 = var322;
						Statics.field5180[var329].field788 = var323;
						Statics.field5180[var329].field790 = var327;
						if (var321.equals(Statics.field2119.field10040)) {
							Statics.field7353 = var323;
						}
						field9161 = field9132;
						arg0.field840 = null;
						return true;
					}
					if (var330 < 0) {
						break;
					}
				}
				if (Statics.field7045 >= Statics.field5180.length) {
					arg0.field840 = null;
					return true;
				}
				for (int var331 = Statics.field7045 - 1; var331 > var329; var331--) {
					Statics.field5180[var331 + 1] = Statics.field5180[var331];
				}
				if (Statics.field7045 == 0) {
					Statics.field5180 = new class61[100];
				}
				Statics.field5180[var329 + 1] = var328;
				Statics.field7045++;
				if (var321.equals(Statics.field2119.field10040)) {
					Statics.field7353 = var323;
				}
			}
			field9161 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field3113 == arg0.field840) {
			class395.method6849();
			arg0.field840 = null;
			return true;
		} else if (class283.field3077 == arg0.field840) {
			int var332 = var2.g2();
			if (var332 == 65535) {
				var332 = -1;
			}
			int var333 = var2.g1();
			int var334 = var2.g2();
			int var335 = var2.g1();
			class395.method1717(var332, var333, var334, var335, true, 256);
			arg0.field840 = null;
			return true;
		} else if (class283.field3002 == arg0.field840) {
			Statics.field5051 = new Object[Statics.field7390.field7345];
			arg0.field840 = null;
			return true;
		} else if (class283.field3135 == arg0.field840) {
			int var336 = var2.method15342();
			int var337 = var2.method15273();
			int var338 = var2.method15311();
			int var339 = var2.method15281();
			int var340 = var2.method15281();
			int var341 = var2.method15311();
			int var342 = var2.method15342();
			int var343 = var2.g4s();
			method2793();
			method3589(var343, new class967(var339, var337, var340), new int[] { var342, var341, var338, var336 }, false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3053 == arg0.field840) {
			int var344 = var2.method15331();
			int var345 = var2.method15342();
			method2793();
			class943.method2995(var344, 1, var345, -1);
			arg0.field840 = null;
			return true;
		} else if (class283.field2988 == arg0.field840) {
			int var346 = var2.method15248();
			int var347 = var2.g2();
			int var348 = var2.g4s();
			method2793();
			class943.method7186(var348, (var346 << 16) + var347);
			arg0.field840 = null;
			return true;
		} else if (class283.field3063 == arg0.field840) {
			int var349 = var2.method15281();
			int var350 = var2.method15391();
			method2793();
			method8486(var349, var350, 0);
			arg0.field840 = null;
			return true;
		} else if (class283.field3065 == arg0.field840) {
			class55.method1805(var2, arg0.field835);
			arg0.field840 = null;
			return true;
		} else if (class283.field3084 == arg0.field840) {
			int var351 = var2.g1();
			int var352 = var2.method15273();
			int var353 = var2.method15272();
			int var354 = var2.g1();
			int var355 = var2.method15281() << 2;
			method2793();
			method8271(var354, var351, var355, var353, var352);
			arg0.field840 = null;
			return true;
		} else if (class283.field3066 == arg0.field840) {
			field8917 = field9132;
			boolean var356 = var2.g1() == 1;
			class220 var357 = new class220(var2);
			class788 var358;
			if (var356) {
				var358 = Statics.field8458;
			} else {
				var358 = Statics.field1515;
			}
			var357.method4115(var358);
			arg0.field840 = null;
			return true;
		} else if (class283.field2984 == arg0.field840) {
			method2793();
			method12690();
			arg0.field840 = null;
			return true;
		} else if (class283.field3011 == arg0.field840) {
			int var359 = var2.g2();
			String var360 = var2.gjstr();
			if (Statics.field5051 == null) {
				Statics.field5051 = new Object[Statics.field7390.field7345];
			}
			Statics.field5051[var359] = var360;
			field9145[++field9146 - 1 & 0x1F] = var359;
			arg0.field840 = null;
			return true;
		} else if (class283.field2977 == arg0.field840) {
			int var361 = var2.method15331();
			int var362 = var2.g2();
			Statics.field2669.method1663(var362, var361);
			arg0.field840 = null;
			return true;
		} else if (class283.field3030 == arg0.field840) {
			int var363 = var2.method15331();
			int var364 = var2.method15281();
			Statics.field2669.method1643(var364, var363);
			arg0.field840 = null;
			return true;
		} else if (class283.field2996 == arg0.field840) {
			method13897(false);
			arg0.field840 = null;
			return false;
		} else if (class283.field3047 == arg0.field840) {
			method3676(false);
			arg0.field840 = null;
			return true;
		} else if (class283.field3013 == arg0.field840) {
			int var365 = var2.g4s();
			int var366 = var2.method15281();
			method2793();
			class943.method4033(var365, var366);
			arg0.field840 = null;
			return true;
		} else if (class283.field3130 == arg0.field840) {
			int var367 = var2.method15391();
			int var368 = var2.g2();
			int var369 = var2.method15272() * 4;
			int var370 = var2.method15281();
			int var371 = var2.method15248();
			int var372 = var2.method15391();
			byte var373 = var2.method15275();
			int var374 = var2.method15391();
			byte var375 = var2.method15275();
			int var376 = var2.method15240();
			int var377 = var2.g1();
			int var378 = var2.method15273();
			if (var378 == 255) {
				var378 = -1;
			}
			int var379 = var2.method15283();
			int var380 = var2.method15271();
			boolean var381 = (var377 & 0x1) != 0;
			boolean var382 = (var377 & 0x2) != 0;
			int var383 = var382 ? var377 >> 2 : -1;
			int var384;
			if (var382) {
				var384 = (byte) var380;
			} else {
				var384 = var380 * 4;
			}
			class453 var385 = field8980.method6214();
			int var386 = var370 - var385.field4836 * 2;
			int var387 = var372 - var385.field4838 * 2;
			int var388 = var375 + var386;
			int var389 = var373 + var387;
			if (var386 >= 0 && var387 >= 0 && var386 < field8980.method6220() * 2 && var387 < field8980.method6220() * 2 && var388 >= 0 && var389 >= 0 && var388 < field8980.method6193() * 2 && var389 < field8980.method6193() * 2 && var368 != 65535) {
				int var390 = var386 * 256;
				int var391 = var387 * 256;
				int var392 = var388 * 256;
				int var393 = var389 * 256;
				int var394 = var384 << 2;
				int var395 = var369 << 2;
				int var396 = var367 << 2;
				Statics.method11760(var368, var376, var379, var383, var394, var395, var390, var391, var392, var393, var374, var371, var378, var396, var381, 0);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3019 == arg0.field840) {
			boolean var397 = var2.g1() == 1;
			String var398 = var2.gjstr();
			String var399 = var398;
			if (var397) {
				var399 = var2.gjstr();
			}
			long var400 = var2.g8();
			long var402 = (long) var2.g2();
			long var404 = (long) var2.method15241();
			int var406 = var2.g1();
			int var407 = var2.g2();
			long var408 = (var402 << 32) + var404;
			boolean var410 = false;
			int var411 = 0;
			while (true) {
				if (var411 >= 100) {
					if (var406 <= 1 && method11167(var399)) {
						var410 = true;
					}
					break;
				}
				if (field9180[var411] == var408) {
					var410 = true;
					break;
				}
				var411++;
			}
			if (!var410) {
				field9180[field9181] = var408;
				field9181 = (field9181 + 1) % 100;
				String var412 = Statics.field3779.method12176(var407).method16749(var2);
				if (var406 == 2) {
					class175.method13903(20, 0, class32.method6076(1) + var398, class32.method6076(1) + var399, var398, var412, class523.method8066(var400), var407);
				} else if (var406 == 1) {
					class175.method13903(20, 0, class32.method6076(0) + var398, class32.method6076(0) + var399, var398, var412, class523.method8066(var400), var407);
				} else {
					class175.method13903(20, 0, var398, var399, var398, var412, class523.method8066(var400), var407);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2983 == arg0.field840) {
			Statics.field2400 = arg0.field835 > 2 ? var2.gjstr() : class588.field6994.method12206(Statics.field2308);
			field9172 = arg0.field835 > 0 ? var2.g2() : -1;
			if (field9172 == 65535) {
				field9172 = -1;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3129 == arg0.field840) {
			boolean var413 = var2.g1() == 1;
			method2793();
			Statics.field6371 = var413;
			arg0.field840 = null;
			return true;
		} else if (class283.field3107 == arg0.field840) {
			method13900(class278.field2811);
			arg0.field840 = null;
			return true;
		} else if (class283.field3035 == arg0.field840) {
			int var414 = var2.g4s();
			int var415 = var2.method15342();
			int var416 = var2.method15271();
			int var417 = var2.method15272();
			int var418 = var2.method15272();
			int var419 = var414 >> 28;
			int var420 = var414 >> 14 & 0x3FFF;
			int var421 = var414 & 0x3FFF;
			class395.method15962(var419, var420, var421, var416, var417, var415, var418);
			arg0.field840 = null;
			return true;
		} else if (class283.field3102 == arg0.field840) {
			method13900(class278.field2805);
			arg0.field840 = null;
			return true;
		} else if (class283.field3016 == arg0.field840) {
			method13900(class278.field2806);
			arg0.field840 = null;
			return true;
		} else if (class283.field3058 == arg0.field840) {
			int var422 = var2.method15311();
			boolean var423 = var2.g1() == 1;
			method2793();
			class943.method3226(var422, var423);
			arg0.field840 = null;
			return true;
		} else if (class283.field2978 == arg0.field840) {
			if (class560.field6700 && Statics.field1587 != null) {
				method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
			}
			byte[] var424 = new byte[arg0.field835 - 1];
			boolean var425 = var2.g1() == 1;
			var2.method16861(var424, 0, arg0.field835 - 1);
			Packet var426 = new Packet(var424);
			String var427 = var426.gjstr();
			if (var425) {
				String var428 = var426.gjstr();
				if (var428.length() == 0) {
					var428 = var427;
				}
				if (!field8903 || Statics.field2247.startsWith("mac") || !class383.method1814(var427, 1, class284.field3143.method4757())) {
					class383.method3613(var428, true, Statics.field4961.field9661.method15781() == 5, field8915, field9218);
				}
			} else {
				class383.method3613(var427, true, Statics.field4961.field9661.method15781() == 5, field8915, field9218);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3006 == arg0.field840) {
			String var429 = var2.gjstr();
			String var430 = class121.method4597(class178.method1205(var2));
			class175.method3943(6, 0, var429, var429, var429, var430);
			arg0.field840 = null;
			return true;
		} else if (class283.field3137 == arg0.field840) {
			Statics.field3161 = var2.method15273();
			Statics.field3907 = var2.method15275() << 3;
			Statics.field6803 = var2.method15238() << 3;
			while (var2.pos < arg0.field835) {
				class278 var431 = Statics.method8301()[var2.g1()];
				method13900(var431);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3048 == arg0.field840) {
			int var432 = var2.method15271();
			method2793();
			field9047 = var432;
			arg0.field840 = null;
			return true;
		} else if (class283.field3131 == arg0.field840) {
			int var433 = var2.method15391();
			int var434 = var2.method15272();
			Statics.field2669.method1663(var433, var434);
			arg0.field840 = null;
			return true;
		} else if (class283.field3114 == arg0.field840) {
			boolean var435 = var2.g1() == 1;
			String var436 = var2.gjstr();
			String var437 = var436;
			if (var435) {
				var437 = var2.gjstr();
			}
			int var438 = var2.g1();
			int var439 = var2.g2();
			boolean var440 = false;
			if (var438 <= 1 && method11167(var437)) {
				var440 = true;
			}
			if (!var440) {
				String var441 = Statics.field3779.method12176(var439).method16749(var2);
				if (var438 == 2) {
					class175.method13903(25, 0, class32.method6076(1) + var436, class32.method6076(1) + var437, var436, var441, null, var439);
				} else if (var438 == 1) {
					class175.method13903(25, 0, class32.method6076(0) + var436, class32.method6076(0) + var437, var436, var441, null, var439);
				} else {
					class175.method13903(25, 0, var436, var437, var436, var441, null, var439);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3092 == arg0.field840) {
			int var442 = var2.g2();
			class902 var443;
			if (field9071 == var442) {
				var443 = Statics.field2119;
			} else {
				var443 = field9070[var442];
			}
			if (var443 == null) {
				arg0.field840 = null;
				return true;
			}
			int var444 = var2.g2();
			int var445 = var2.g1();
			boolean var446 = (var444 & 0x8000) != 0;
			if (var443.field10040 != null && var443.field10044 != null) {
				boolean var447 = false;
				if (var445 <= 1) {
					if (!var446 && (field9054 && !field9077 || field9081)) {
						var447 = true;
					} else if (method11167(var443.field10040)) {
						var447 = true;
					}
				}
				if (!var447) {
					int var448 = -1;
					String var450;
					if (var446) {
						var444 &= 0x7FFF;
						class270 var449 = class270.method2602(var2);
						var448 = var449.field2655;
						var450 = var449.field2656.method16749(var2);
					} else {
						var450 = class121.method4597(class178.method1205(var2));
					}
					var443.method16127(var450.trim(), var444 >> 8, var444 & 0xFF);
					int var451;
					if (var445 == 1 || var445 == 2) {
						var451 = var446 ? 17 : 1;
					} else {
						var451 = var446 ? 17 : 2;
					}
					if (var445 == 2) {
						class175.method13903(var451, 0, class32.method6076(1) + var443.method16120(true), class32.method6076(1) + var443.method16121(false), var443.field10063, var450, null, var448);
					} else if (var445 == 1) {
						class175.method13903(var451, 0, class32.method6076(0) + var443.method16120(true), class32.method6076(0) + var443.method16121(false), var443.field10063, var450, null, var448);
					} else {
						class175.method13903(var451, 0, var443.method16120(true), var443.method16121(false), var443.field10063, var450, null, var448);
					}
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3126 == arg0.field840) {
			int var452 = var2.g4s();
			int var453 = var2.g4s();
			class792 var454 = class792.method14781(class280.field2940, arg0.field834);
			var454.field9467.method15269(field4121);
			var454.field9467.method15289(var452);
			var454.field9467.method15223(var453);
			arg0.method1913(var454);
			arg0.field840 = null;
			return true;
		} else if (class283.field3127 == arg0.field840) {
			int var455 = var2.method15331();
			int var456 = var2.g2();
			int var457 = var2.g2();
			int var458 = var2.method15281();
			method2793();
			class943.method3599(var455, var458, var457, var456);
			arg0.field840 = null;
			return true;
		} else if (class283.field2985 == arg0.field840) {
			byte var459 = var2.method15329();
			int var460 = var2.method15248();
			Statics.field2669.method1643(var460, var459);
			arg0.field840 = null;
			return true;
		} else if (class283.field3060 == arg0.field840) {
			int var461 = var2.g4s();
			int var462 = var2.method15391();
			if (var462 == 65535) {
				var462 = -1;
			}
			int var463 = var2.method15271();
			int var464 = var2.method15273();
			int var465 = var2.method15391();
			int var466 = var2.method15281();
			int var467 = var464 & 0x7;
			int var468 = var464 >> 3 & 0xF;
			if (var468 == 15) {
				var468 = -1;
			}
			boolean var469 = (var464 >> 7 & 0x1) == 1;
			if (var461 >> 30 != 0) {
				class453 var470 = field8980.method6214();
				int var471 = var461 >> 28 & 0x3;
				int var472 = (var461 >> 14 & 0x3FFF) - var470.field4836;
				int var473 = (var461 & 0x3FFF) - var470.field4838;
				if (var472 >= 0 && var473 >= 0 && var472 < field8980.method6220() && var473 < field8980.method6193()) {
					if (var462 == -1) {
						class942 var474 = (class942) field9090.method11923((long) (var472 << 16 | var473));
						if (var474 != null) {
							var474.field10296.method17182();
							var474.method6979();
						}
					} else {
						int var475 = var472 * 512 + 256;
						int var476 = var473 * 512 + 256;
						int var477 = var471;
						if (var471 < 3 && field8980.method6100().method5794(var472, var473)) {
							var477 = var471 + 1;
						}
						class1010 var478 = new class1010(field8980.method6098(), var462, var466, var471, var477, var475, method8663(var475, var476, var471) - var465, var476, var472, var472, var473, var473, var467, var469, 0);
						field9090.pushNode(new class942(var478), (long) (var472 << 16 | var473));
					}
				}
			} else if (var461 >> 29 != 0) {
				int var479 = var461 & 0xFFFF;
				class798 var480 = (class798) field8964.method11923((long) var479);
				if (var480 != null) {
					class903 var481 = (class903) var480.field9550;
					class115 var482 = var481.field8641[var463];
					if (var462 == 65535) {
						var462 = -1;
					}
					boolean var483 = true;
					int var484 = var482.field1204;
					if (var462 != -1 && var484 != -1) {
						if (var462 == var484) {
							class507 var485 = Statics.field4213.method11082(var462);
							if (var485.field5264 && var485.field5252 != -1) {
								class509 var486 = Statics.field566.method11144(var485.field5252);
								int var487 = var486.field6331;
								if (var487 == 0 || var487 == 2) {
									var483 = false;
								} else if (var487 == 1) {
									var483 = true;
								}
							}
						} else {
							class507 var488 = Statics.field4213.method11082(var462);
							class507 var489 = Statics.field4213.method11082(var484);
							if (var488.field5252 != -1 && var489.field5252 != -1) {
								class509 var490 = Statics.field566.method11144(var488.field5252);
								class509 var491 = Statics.field566.method11144(var489.field5252);
								if (var490.field6325 < var491.field6325) {
									var483 = false;
								}
							}
						}
					}
					if (var483) {
						var482.field1204 = var462;
						var482.field1205 = var465;
						var482.field1206 = var468;
						if (var462 == -1) {
							var482.field1203.method11769(-1);
						} else {
							class507 var492 = Statics.field4213.method11082(var462);
							int var493 = var492.field5264 ? 0 : 2;
							if (var469) {
								var493 = 1;
							}
							var482.field1203.method11803(var492.field5252, var466, var493, false);
						}
					}
				}
			} else if (var461 >> 28 != 0) {
				int var494 = var461 & 0xFFFF;
				class902 var495;
				if (field9071 == var494) {
					var495 = Statics.field2119;
				} else {
					var495 = field9070[var494];
				}
				if (var495 != null) {
					class115 var496 = var495.field8641[var463];
					if (var462 == 65535) {
						var462 = -1;
					}
					boolean var497 = true;
					int var498 = var496.field1204;
					if (var462 != -1 && var498 != -1) {
						if (var462 == var498) {
							class507 var499 = Statics.field4213.method11082(var462);
							if (var499.field5264 && var499.field5252 != -1) {
								class509 var500 = Statics.field566.method11144(var499.field5252);
								int var501 = var500.field6331;
								if (var501 == 0 || var501 == 2) {
									var497 = false;
								} else if (var501 == 1) {
									var497 = true;
								}
							}
						} else {
							class507 var502 = Statics.field4213.method11082(var462);
							class507 var503 = Statics.field4213.method11082(var498);
							if (var502.field5252 != -1 && var503.field5252 != -1) {
								class509 var504 = Statics.field566.method11144(var502.field5252);
								class509 var505 = Statics.field566.method11144(var503.field5252);
								if (var504.field6325 < var505.field6325) {
									var497 = false;
								}
							}
						}
					}
					if (var497) {
						var496.field1204 = var462;
						var496.field1205 = var465;
						var496.field1206 = var468;
						var496.field1207 = var467;
						if (var462 == -1) {
							var496.field1203.method11769(-1);
						} else {
							class507 var506 = Statics.field4213.method11082(var462);
							int var507 = var506.field5264 ? 0 : 2;
							if (var469) {
								var507 = 1;
							}
							var496.field1203.method11803(var506.field5252, var466, var507, false);
						}
					}
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3118 == arg0.field840) {
			boolean var508 = var2.g1() == 1;
			String var509 = var2.gjstr();
			String var510 = var509;
			if (var508) {
				var510 = var2.gjstr();
			}
			long var511 = (long) var2.g2();
			long var513 = (long) var2.method15241();
			int var515 = var2.g1();
			int var516 = var2.g2();
			long var517 = (var511 << 32) + var513;
			boolean var519 = false;
			int var520 = 0;
			while (true) {
				if (var520 >= 100) {
					if (var515 <= 1 && method11167(var510)) {
						var519 = true;
					}
					break;
				}
				if (field9180[var520] == var517) {
					var519 = true;
					break;
				}
				var520++;
			}
			if (!var519) {
				field9180[field9181] = var517;
				field9181 = (field9181 + 1) % 100;
				String var521 = Statics.field3779.method12176(var516).method16749(var2);
				if (var515 == 2) {
					class175.method13903(18, 0, class32.method6076(1) + var509, class32.method6076(1) + var510, var509, var521, null, var516);
				} else if (var515 == 1) {
					class175.method13903(18, 0, class32.method6076(0) + var509, class32.method6076(0) + var510, var509, var521, null, var516);
				} else {
					class175.method13903(18, 0, var509, var510, var509, var521, null, var516);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3043 == arg0.field840) {
			byte[] var522 = new byte[arg0.field835];
			var2.method16861(var522, 0, arg0.field835);
			String var523 = class524.method6881(var522, 0, arg0.field835);
			if (field8903) {
				try {
					class284.field3151.method4758(new Object[] { var523 });
				} catch (Throwable var600) {
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3024 == arg0.field840) {
			int var525 = var2.method15331();
			method2793();
			class943.method2995(var525, 3, field9071, 0);
			arg0.field840 = null;
			return true;
		} else if (class283.field2980 == arg0.field840) {
			int var526 = var2.method15272();
			int var527 = var2.method15272();
			int var528 = var2.method15273();
			int var529 = var2.g2();
			int var530 = var2.method15271();
			method2793();
			field9057[var526] = true;
			field9189[var526] = var528;
			field9190[var526] = var530;
			field9191[var526] = var527;
			field9110[var526] = var529;
			arg0.field840 = null;
			return true;
		} else if (class283.field3072 == arg0.field840) {
			int var531 = var2.method15311();
			int var532 = var2.g4s();
			method2793();
			class943.method2995(var532, 2, var531, -1);
			arg0.field840 = null;
			return true;
		} else if (class283.field3088 == arg0.field840) {
			boolean var533 = var2.g1() == 1;
			String var534 = var2.gjstr();
			String var535 = var534;
			if (var533) {
				var535 = var2.gjstr();
			}
			long var536 = (long) var2.g2();
			long var538 = (long) var2.method15241();
			int var540 = var2.g1();
			long var541 = (var536 << 32) + var538;
			boolean var543 = false;
			int var544 = 0;
			while (true) {
				if (var544 >= 100) {
					if (var540 <= 1) {
						if (field9054 && !field9077 || field9081) {
							var543 = true;
						} else if (method11167(var535)) {
							var543 = true;
						}
					}
					break;
				}
				if (field9180[var544] == var541) {
					var543 = true;
					break;
				}
				var544++;
			}
			if (!var543) {
				field9180[field9181] = var541;
				field9181 = (field9181 + 1) % 100;
				String var545 = class121.method4597(class178.method1205(var2));
				if (var540 == 2) {
					class175.method13903(7, 0, class32.method6076(1) + var534, class32.method6076(1) + var535, var534, var545, null, -1);
				} else if (var540 == 1) {
					class175.method13903(7, 0, class32.method6076(0) + var534, class32.method6076(0) + var535, var534, var545, null, -1);
				} else {
					class175.method13903(3, 0, var534, var535, var534, var545, null, -1);
				}
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3040 == arg0.field840) {
			method3676(true);
			arg0.field840 = null;
			return true;
		} else if (class283.field2976 == arg0.field840) {
			field9149 = field9132;
			boolean var546 = var2.g1() == 1;
			if (arg0.field835 != 1) {
				if (var546) {
					Statics.field2972 = new class218(var2);
				} else {
					Statics.field913 = new class218(var2);
				}
				arg0.field840 = null;
				return true;
			}
			if (var546) {
				Statics.field2972 = null;
			} else {
				Statics.field913 = null;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2993 == arg0.field840) {
			field9121 = 1;
			field9148 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field3095 == arg0.field840) {
			if (method12902(field8923)) {
				field8935 = (int) ((float) var2.g2() * 2.5F);
			} else {
				field8935 = var2.g2() * 30;
			}
			field9120 = field9132;
			arg0.field840 = null;
			return true;
		} else if (class283.field2991 == arg0.field840) {
			int var547 = var2.method15283();
			int var548 = var2.method15311();
			int var549 = var2.method15284();
			method2793();
			class943.method6312(var548, var549, var547);
			arg0.field840 = null;
			return true;
		} else if (class283.field3068 == arg0.field840) {
			int var550 = var2.g1();
			int var551 = var2.g2();
			if (var551 == 65535) {
				var551 = -1;
			}
			int var552 = var2.method15273();
			class395.method11057(var551, var550, var552);
			arg0.field840 = null;
			return true;
		} else if (class283.field3078 == arg0.field840) {
			int var553 = var2.method15248();
			int var554 = var2.method15331();
			int var555 = var2.method15271();
			int var556 = var2.method15281();
			method2793();
			class943.method2497(var554, var555, var556, var553);
			arg0.field840 = null;
			return true;
		} else if (class283.field2979 == arg0.field840) {
			int var557 = var2.method15271();
			int var558 = var2.g1();
			int var559 = var2.method15311();
			field9094[var557] = var559;
			field9092[var557] = var558;
			field9093[var557] = 1;
			int var560 = class490.field5134[var557] - 1;
			for (int var561 = 0; var561 < var560; var561++) {
				if (var559 >= class490.field5135[var561]) {
					field9093[var557] = var561 + 2;
				}
			}
			field9139[++field9140 - 1 & 0x1F] = var557;
			arg0.field840 = null;
			return true;
		} else if (class283.field3089 == arg0.field840) {
			int var562 = var2.method15331();
			int var563 = var2.method15391();
			method2793();
			class943.method3667(var563, var562);
			arg0.field840 = null;
			return true;
		} else if (class283.field2994 == arg0.field840) {
			Statics.field2669.method1647();
			field9183 += 32;
			arg0.field840 = null;
			return true;
		} else if (class283.field3045 == arg0.field840) {
			int var564 = var2.method15273();
			int var565 = var2.method15273();
			int var566 = var2.g1();
			int var567 = var2.method15273();
			int var568 = var2.method15391() << 2;
			method2793();
			method8600(var567, var566, var568, var564, var565, true);
			arg0.field840 = null;
			return true;
		} else if (class283.field3018 == arg0.field840) {
			method13900(class278.field2814);
			arg0.field840 = null;
			return true;
		} else if (class283.field3059 == arg0.field840) {
			int var569 = var2.method15311();
			int var570 = var2.method15391();
			int var571 = var2.g1();
			int var572 = var2.g2();
			method2793();
			class943.method15139(var569, var571, var572, var570);
			arg0.field840 = null;
			return true;
		} else if (class283.field3120 == arg0.field840) {
			int var573 = var2.g2();
			class62.method2848(var573);
			arg0.field840 = null;
			return true;
		} else if (class283.field3086 == arg0.field840) {
			field9176 = var2.method15273() == 1;
			arg0.field840 = null;
			return true;
		} else if (class283.field3020 == arg0.field840) {
			int var574 = var2.method15331();
			int var575 = var2.method15391();
			int var576 = var2.method15342();
			int var577 = var2.method15273();
			int var578 = var2.g4s();
			int var579 = var2.g4s();
			method2793();
			if (var577 == 2) {
				method7983();
			}
			int[] var580 = new int[] { var574, var576, var579, var578 };
			openedTopInterface = var575;
			method6068(var575, var580);
			method1969(false);
			ScriptRunner.runOnLoad(openedTopInterface, var580);
			for (int var581 = 0; var581 < 100; var581++) {
				field9204[var581] = true;
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field3099 == arg0.field840) {
			int var582 = var2.method15311();
			int var583 = var2.method15342();
			method2793();
			class816 var584 = (class816) openedSubInterfaces.method11923((long) var582);
			class816 var585 = (class816) openedSubInterfaces.method11923((long) var583);
			if (var585 != null) {
				method7069(var585, var584 == null || var584.field9679 != var585.field9679, false);
			}
			if (var584 != null) {
				var584.method6979();
				openedSubInterfaces.pushNode(var584, (long) var583);
			}
			class165 var586 = class165.method11381(var582);
			if (var586 != null) {
				requestRedrawComponent(var586);
			}
			class165 var587 = class165.method11381(var583);
			if (var587 != null) {
				requestRedrawComponent(var587);
				method12722(Statics.interfaces[var587.parentLayer >>> 16], var587, true);
			}
			if (openedTopInterface != -1) {
				method6032(openedTopInterface, 1);
			}
			arg0.field840 = null;
			return true;
		} else if (class283.field2998 == arg0.field840) {
			field9161 = field9132;
			if (arg0.field835 == 0) {
				field9182 = null;
				field9220 = null;
				Statics.field7045 = 0;
				Statics.field5180 = null;
				arg0.field840 = null;
				return true;
			}
			field9220 = var2.gjstr();
			boolean var588 = var2.g1() == 1;
			if (var588) {
				var2.gjstr();
			}
			long var589 = var2.g8();
			field9182 = Statics.method5925(var589);
			Statics.field4311 = var2.method15238();
			int var591 = var2.g1();
			if (var591 == 255) {
				arg0.field840 = null;
				return true;
			}
			Statics.field7045 = var591;
			class61[] var592 = new class61[100];
			for (int var593 = 0; var593 < Statics.field7045; var593++) {
				var592[var593] = new class61();
				var592[var593].field791 = var2.gjstr();
				boolean var594 = var2.g1() == 1;
				if (var594) {
					var592[var593].field786 = var2.gjstr();
				} else {
					var592[var593].field786 = var592[var593].field791;
				}
				var592[var593].field787 = class625.method4744(var592[var593].field786);
				var592[var593].field789 = var2.g2();
				var592[var593].field788 = var2.method15238();
				var592[var593].field790 = var2.gjstr();
				if (var592[var593].field786.equals(Statics.field2119.field10040)) {
					Statics.field7353 = var592[var593].field788;
				}
			}
			boolean var595 = false;
			int var596 = Statics.field7045;
			while (var596 > 0) {
				boolean var597 = true;
				var596--;
				for (int var598 = 0; var598 < var596; var598++) {
					if (var592[var598].field787.compareTo(var592[var598 + 1].field787) > 0) {
						class61 var599 = var592[var598];
						var592[var598] = var592[var598 + 1];
						var592[var598 + 1] = var599;
						var597 = false;
					}
				}
				if (var597) {
					break;
				}
			}
			Statics.field5180 = var592;
			arg0.field840 = null;
			return true;
		} else {
			class983.report((arg0.field840 == null ? -1 : arg0.field840.field3138) + class32.field488 + (arg0.field844 == null ? -1 : arg0.field844.field3138) + class32.field488 + (arg0.field831 == null ? -1 : arg0.field831.field3138) + " " + arg0.field835, new RuntimeException());
			method13897(false);
			return true;
		}
	}

	@ObfuscatedName("zo.jy(Lit;B)V")
	public static final void method13900(class278 arg0) {
		class964 var1 = field8975.field832;
		if (class278.field2806 == arg0) {
			int var2 = var1.g1();
			class453 var3 = field8980.method6214();
			int var4 = (var2 & 0x7) + Statics.field3907;
			int var5 = var3.field4838 + var4;
			int var6 = (var2 >> 4 & 0x7) + Statics.field6803;
			int var7 = var3.field4836 + var6;
			int var8 = var1.g2();
			int var9 = var1.g2();
			int var10 = var1.g2();
			if (field9088 != null) {
				class774 var11 = (class774) field9088.method11923((long) (Statics.field3161 << 28 | var5 << 14 | var7));
				if (var11 != null) {
					for (class773 var12 = (class773) var11.field9313.method11563(); var12 != null; var12 = (class773) var11.field9313.method11567()) {
						if ((var8 & 0x7FFF) == var12.field9311 && var12.field9310 == var9) {
							var12.method6979();
							var12.field9310 = var10;
							method11367(Statics.field3161, var7, var5, var12);
							break;
						}
					}
					if (var6 >= 0 && var4 >= 0 && var6 < field8980.method6220() && var4 < field8980.method6193()) {
						method15178(Statics.field3161, var6, var4);
					}
				}
			}
		} else if (class278.field2809 == arg0) {
			int var13 = var1.method15248();
			int var14 = var1.method15273();
			class453 var15 = field8980.method6214();
			int var16 = (var14 & 0x7) + Statics.field3907;
			int var17 = var15.field4838 + var16;
			int var18 = (var14 >> 4 & 0x7) + Statics.field6803;
			int var19 = var15.field4836 + var18;
			class774 var20 = (class774) field9088.method11923((long) (Statics.field3161 << 28 | var17 << 14 | var19));
			if (var20 != null) {
				for (class773 var21 = (class773) var20.field9313.method11563(); var21 != null; var21 = (class773) var20.field9313.method11567()) {
					if ((var13 & 0x7FFF) == var21.field9311) {
						var21.method6979();
						break;
					}
				}
				if (var20.field9313.method11585()) {
					var20.method6979();
				}
				if (var18 >= 0 && var16 >= 0 && var18 < field8980.method6220() && var16 < field8980.method6193()) {
					method15178(Statics.field3161, var18, var16);
				}
			}
		} else if (class278.field2811 == arg0) {
			int var22 = var1.method15273();
			int var23 = var22 >> 2;
			int var24 = field8986[var23];
			int var25 = var1.method15273();
			int var26 = var1.method15311();
			class540 var27 = field8980.method6103().method11471(var26);
			int var28 = var1.method15273();
			int var29 = (var28 >> 4 & 0x7) + Statics.field6803;
			int var30 = (var28 & 0x7) + Statics.field3907;
			if (class542.field6588.field6590 == var23) {
				var23 = class542.field6572.field6590;
			}
			int var31 = 0;
			if (var27.field6475 != null) {
				int var32 = -1;
				for (int var33 = 0; var33 < var27.field6475.length; var33++) {
					if (var27.field6475[var33] == var23) {
						var32 = var33;
						break;
					}
				}
				var31 = var27.field6471[var32].length;
			}
			int var34 = 0;
			if (var27.field6479 != null) {
				var34 = var27.field6479.length;
			}
			int var35 = 0;
			if (var27.field6482 != null) {
				var35 = var27.field6482.length;
			}
			if ((var25 & 0x1) == 1) {
				class770.method14721(Statics.field3161, var29, var30, var24, var26, var23, null);
			} else {
				int[] var36 = null;
				if ((var25 & 0x2) == 2) {
					var36 = new int[var31];
					for (int var37 = 0; var37 < var31; var37++) {
						var36[var37] = var1.g4s();
					}
				}
				short[] var38 = null;
				if ((var25 & 0x4) == 4) {
					var38 = new short[var34];
					for (int var39 = 0; var39 < var34; var39++) {
						var38[var39] = (short) var1.g2();
					}
				}
				short[] var40 = null;
				if ((var25 & 0x8) == 8) {
					var40 = new short[var35];
					for (int var41 = 0; var41 < var35; var41++) {
						var40[var41] = (short) var1.g2();
					}
				}
				class770.method14721(Statics.field3161, var29, var30, var24, var26, var23, new class539(class770.field9279, var36, var38, var40));
				class770.field9279++;
			}
		} else if (class278.field2813 == arg0) {
			var1.g1();
			int var42 = var1.g1();
			int var43 = (var42 >> 4 & 0x7) + Statics.field6803;
			int var44 = (var42 & 0x7) + Statics.field3907;
			int var45 = var1.g2();
			int var46 = var1.g1();
			int var47 = var1.method15241();
			String var48 = var1.gjstr();
			if (field8980.method6132() != class360.field3839) {
				method6854(Statics.field3161, var43, var44, var46, var45, var47, var48);
			}
		} else if (class278.field2814 == arg0) {
			int var49 = var1.method15311();
			int var50 = var1.method15273();
			int var51 = (var50 >> 4 & 0x7) + Statics.field6803;
			int var52 = (var50 & 0x7) + Statics.field3907;
			int var53 = var1.method15271();
			int var54 = var53 >> 2;
			int var55 = var53 & 0x3;
			int var56 = field8986[var54];
			if (field8980.method6132().method6251() || var51 >= 0 && var52 >= 0 && var51 < field8980.method6220() && var52 < field8980.method6193()) {
				class770.method13876(Statics.field3161, var51, var52, var56, var49, var54, var55);
			}
		} else if (class278.field2812 == arg0) {
			int var57 = var1.g4s();
			int var58 = var1.g1();
			field8980.method6103().method11471(var57).method11411(var58);
		} else if (class278.field2800 == arg0) {
			int var59 = var1.g1();
			int var60 = (var59 >> 4 & 0x7) + Statics.field6803;
			int var61 = (var59 & 0x7) + Statics.field3907;
			int var62 = var1.g2();
			if (var62 == 65535) {
				var62 = -1;
			}
			int var63 = var1.g2();
			int var64 = var1.g2();
			int var65 = var1.g1();
			int var66 = var1.method15240();
			if (field8980.method6132() != class360.field3839 && (var60 >= 0 && var61 >= 0 && var60 < field8980.method6220() && var61 < field8980.method6193())) {
				if (var62 == -1) {
					class942 var67 = (class942) field9090.method11923((long) (var60 << 16 | var61));
					if (var67 != null) {
						var67.field10296.method17182();
						var67.method6979();
					}
				} else {
					int var68 = var60 * 512 + 256;
					int var69 = var61 * 512 + 256;
					int var70 = Statics.field3161;
					if (var70 < 3 && field8980.method6100().method5794(var60, var61)) {
						var70++;
					}
					class1010 var71 = new class1010(field8980.method6098(), var62, var64, Statics.field3161, var70, var68, method8663(var68, var69, Statics.field3161) - var63, var69, var60, var60, var61, var61, var65, false, var66);
					field9090.pushNode(new class942(var71), (long) (var60 << 16 | var61));
				}
			}
		} else if (class278.field2810 == arg0) {
			int var72 = var1.method15248();
			int var73 = var1.method15248();
			int var74 = var1.method15272();
			class453 var75 = field8980.method6214();
			int var76 = (var74 & 0x7) + Statics.field3907;
			int var77 = var75.field4838 + var76;
			int var78 = (var74 >> 4 & 0x7) + Statics.field6803;
			int var79 = var75.field4836 + var78;
			boolean var80 = var78 >= 0 && var76 >= 0 && var78 < field8980.method6220() && var76 < field8980.method6193();
			if (var80 || field8980.method6132().method6251()) {
				method11367(Statics.field3161, var79, var77, new class773(var73, var72));
				if (var80) {
					method15178(Statics.field3161, var78, var76);
				}
			}
		} else if (class278.field2805 == arg0) {
			int var81 = var1.g1();
			boolean var82 = (var81 & 0x80) != 0;
			int var83 = (var81 >> 3 & 0x7) + Statics.field6803;
			int var84 = (var81 & 0x7) + Statics.field3907;
			int var85 = var83 + var1.method15238();
			int var86 = var84 + var1.method15238();
			int var87 = var1.method15240();
			int var88 = var1.g2();
			int var89 = var1.g1() * 4;
			int var90 = var1.g1() * 4;
			int var91 = var1.g2();
			int var92 = var1.g2();
			int var93 = var1.g1();
			int var94 = var1.g2();
			int var95 = var1.method15240();
			if (var93 == 255) {
				var93 = -1;
			}
			if (field8980.method6132() != class360.field3839 && (var83 >= 0 && var84 >= 0 && var83 < field8980.method6220() && var84 < field8980.method6193() && var85 >= 0 && var86 >= 0 && var85 < field8980.method6220() && var86 < field8980.method6193() && var88 != 65535)) {
				int var96 = var83 * 512 + 256;
				int var97 = var84 * 512 + 256;
				int var98 = var85 * 512 + 256;
				int var99 = var86 * 512 + 256;
				int var100 = var89 << 2;
				int var101 = var90 << 2;
				int var102 = var94 << 2;
				class1009 var103 = new class1009(field8980.method6098(), var88, Statics.field3161, Statics.field3161, var96, var97, var100, field9213 + var91, field9213 + var92, var93, var102, 0, var87, var101, var82, -1, var95);
				var103.method17162(var98, var99, method8663(var98, var99, Statics.field3161) - var101, field9213 + var91);
				field9007.method11558(new class945(var103));
			}
		} else if (class278.field2807 == arg0) {
			int var104 = var1.g1();
			int var105 = (var104 >> 4 & 0xF) + Statics.field6803 * 2;
			int var106 = (var104 & 0xF) + Statics.field3907 * 2;
			int var107 = var1.g1();
			boolean var108 = (var107 & 0x1) != 0;
			boolean var109 = (var107 & 0x2) != 0;
			int var110 = var109 ? var107 >> 2 : -1;
			int var111 = var105 + var1.method15238();
			int var112 = var106 + var1.method15238();
			int var113 = var1.method15240();
			int var114 = var1.method15240();
			int var115 = var1.g2();
			int var116 = var1.g1();
			int var117;
			if (var109) {
				var117 = (byte) var116;
			} else {
				var117 = var116 * 4;
			}
			int var118 = var1.g1() * 4;
			int var119 = var1.g2();
			int var120 = var1.g2();
			int var121 = var1.g1();
			int var122 = var1.g2();
			if (var121 == 255) {
				var121 = -1;
			}
			int var123 = var1.method15240();
			if (field8980.method6132() != class360.field3839 && (var105 >= 0 && var106 >= 0 && var105 < field8980.method6220() * 2 && var106 < field8980.method6220() * 2 && var111 >= 0 && var112 >= 0 && var111 < field8980.method6193() * 2 && var112 < field8980.method6193() * 2 && var115 != 65535)) {
				int var124 = var105 * 256;
				int var125 = var106 * 256;
				int var126 = var111 * 256;
				int var127 = var112 * 256;
				int var128 = var117 << 2;
				int var129 = var118 << 2;
				int var130 = var122 << 2;
				Statics.method11760(var115, var113, var114, var110, var128, var129, var124, var125, var126, var127, var119, var120, var121, var130, var108, var123);
			}
		} else if (class278.field2802 == arg0) {
			int var131 = var1.g1();
			int var132 = (var131 >> 4 & 0x7) + Statics.field6803;
			int var133 = (var131 & 0x7) + Statics.field3907;
			int var134 = var1.g2();
			if (var134 == 65535) {
				var134 = -1;
			}
			int var135 = var1.g1();
			int var136 = var135 >> 4 & 0xF;
			int var137 = var135 & 0x7;
			int var138 = var1.g1();
			int var139 = var1.g1();
			int var140 = var1.g2();
			boolean var141 = var1.g1() == 1;
			if (field8980.method6132() != class360.field3839 && (var132 >= 0 && var133 >= 0 && var132 < field8980.method6220() && var133 < field8980.method6193())) {
				int var142 = var136 + 1;
				if (Statics.field2119.field8642[0] >= var132 - var142 && Statics.field2119.field8642[0] <= var132 + var142 && Statics.field2119.field8643[0] >= var133 - var142 && Statics.field2119.field8643[0] <= var133 + var142) {
					class395.method12739(var134, var137, var138, var139, (var133 << 8) + (Statics.field3161 << 24) + (var132 << 16) + var136, var141, var140);
				}
			}
		} else if (class278.field2801 == arg0) {
			int var143 = var1.method15272();
			int var144 = (var143 >> 4 & 0x7) + Statics.field6803;
			int var145 = (var143 & 0x7) + Statics.field3907;
			int var146 = var1.method15271();
			int var147 = var146 >> 2;
			int var148 = var146 & 0x3;
			int var149 = field8986[var147];
			if (field8980.method6132().method6251() || var144 >= 0 && var145 >= 0 && var144 < field8980.method6220() && var145 < field8980.method6193()) {
				class770.method13876(Statics.field3161, var144, var145, var149, -1, var147, var148);
			}
		} else if (class278.field2808 == arg0) {
			int var150 = var1.g1();
			int var151 = (var150 >> 4 & 0x7) + Statics.field6803;
			int var152 = (var150 & 0x7) + Statics.field3907;
			int var153 = var1.g2();
			if (var153 == 65535) {
				var153 = -1;
			}
			int var154 = var1.g1();
			int var155 = var154 >> 4 & 0xF;
			int var156 = var154 & 0x7;
			int var157 = var1.g1();
			int var158 = var1.g1();
			int var159 = var1.g2();
			if (field8980.method6132() != class360.field3839 && (var151 >= 0 && var152 >= 0 && var151 < field8980.method6220() && var152 < field8980.method6193())) {
				int var160 = var155 + 1;
				if (Statics.field2119.field8642[0] >= var151 - var160 && Statics.field2119.field8642[0] <= var151 + var160 && Statics.field2119.field8643[0] >= var152 - var160 && Statics.field2119.field8643[0] <= var152 + var160) {
					class395.method1356(var153, var156, var157, var158, (var152 << 8) + (Statics.field3161 << 24) + (var151 << 16) + var155, var159);
				}
			}
		} else if (class278.field2804 == arg0) {
			int var161 = var1.method15342();
			int var162 = var1.method15273();
			int var163 = var162 >> 2;
			int var164 = var162 & 0x3;
			int var165 = field8986[var163];
			int var166 = var1.g1();
			int var167 = (var166 >> 4 & 0x7) + Statics.field6803;
			int var168 = (var166 & 0x7) + Statics.field3907;
			if (field8980.method6132() != class360.field3839) {
				method3302(Statics.field3161, var167, var168, var165, var163, var164, var161);
			}
		} else if (class278.field2803 == arg0) {
			int var169 = var1.method15248();
			int var170 = var1.method15271();
			class453 var171 = field8980.method6214();
			int var172 = (var170 & 0x7) + Statics.field3907;
			int var173 = var171.field4838 + var172;
			int var174 = (var170 >> 4 & 0x7) + Statics.field6803;
			int var175 = var171.field4836 + var174;
			int var176 = var1.method15248();
			int var177 = var1.g2();
			if (field9071 != var176) {
				boolean var178 = var174 >= 0 && var172 >= 0 && var174 < field8980.method6220() && var172 < field8980.method6193();
				if (var178 || field8980.method6132().method6251()) {
					method11367(Statics.field3161, var175, var173, new class773(var177, var169));
					if (var178) {
						method15178(Statics.field3161, var174, var172);
					}
				}
			}
		} else {
			class983.report("" + arg0, new RuntimeException());
			method13897(false);
		}
	}

	@ObfuscatedName("sg.jz(IIILact;B)V")
	public static void method11367(int arg0, int arg1, int arg2, class773 arg3) {
		long var4 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		class774 var6 = (class774) field9088.method11923(var4);
		if (var6 == null) {
			class774 var7 = new class774();
			field9088.pushNode(var7, var4);
			var7.field9313.method11558(arg3);
			return;
		}
		class592 var8 = Statics.field3492.method12316(arg3.field9311);
		int var9 = var8.field7080;
		if (var8.field7078 == 1) {
			var9 = (arg3.field9310 + 1) * var9;
		}
		for (class773 var10 = (class773) var6.field9313.method11563(); var10 != null; var10 = (class773) var6.field9313.method11567()) {
			class592 var11 = Statics.field3492.method12316(var10.field9311);
			int var12 = var11.field7080;
			if (var11.field7078 == 1) {
				var12 = (var10.field9310 + 1) * var12;
			}
			if (var9 > var12) {
				class547.method2546(arg3, var10);
				return;
			}
		}
		var6.field9313.method11558(arg3);
	}

	@ObfuscatedName("ads.jn(IIII)V")
	public static void method15178(int arg0, int arg1, int arg2) {
		class453 var3 = field8980.method6214();
		int var4 = var3.field4836 + arg1;
		int var5 = var3.field4838 + arg2;
		if (field8980.method6098() == null || field8980.method6132() == class360.field3839 || arg1 < 0 || arg2 < 0 || arg1 >= field8980.method6220() || arg2 >= field8980.method6193()) {
			return;
		}
		long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
		class774 var8 = (class774) field9088.method11923(var6);
		if (var8 == null) {
			field8980.method6098().method7429(arg0, arg1, arg2);
			return;
		}
		class773 var9 = (class773) var8.field9313.method11563();
		if (var9 == null) {
			field8980.method6098().method7429(arg0, arg1, arg2);
			return;
		}
		ObjStackEntity var10 = (ObjStackEntity) field8980.method6098().method7429(arg0, arg1, arg2);
		if (var10 == null) {
			var10 = new ObjStackEntity(field8980.method6098(), arg1 << 265, field8980.method6098().field4498[arg0].method199(arg1, arg2), arg2 << 265, arg0, arg0);
		} else {
			var10.field10609 = -1;
			var10.field10607 = -1;
			var10.field9808 = field8980.method6098();
		}
		var10.field10611 = var9.field9311;
		var10.field10605 = var9.field9310;
		label53: while (true) {
			class773 var12 = (class773) var8.field9313.method11567();
			if (var12 == null) {
				break;
			}
			if (var10.field10611 != var12.field9311) {
				var10.field10607 = var12.field9311;
				var10.field10608 = var12.field9310;
				while (true) {
					class773 var13 = (class773) var8.field9313.method11567();
					if (var13 == null) {
						break label53;
					}
					if (var10.field10611 != var13.field9311 && var10.field10607 != var13.field9311) {
						var10.field10609 = var13.field9311;
						var10.field10610 = var13.field9310;
					}
				}
			}
		}
		int var14 = method8663((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		var10.method8552((float) (arg1 << 265), (float) var14, (float) (arg2 << 265));
		var10.field10606 = 0;
		var10.field9807 = (byte) arg0;
		var10.field9809 = (byte) arg0;
		if (field8980.method6100().method5794(arg1, arg2)) {
			var10.field9809++;
		}
		field8980.method6098().method7499(arg0, arg1, arg2, var14, var10);
	}

	@ObfuscatedName("fw.jq(ZB)V")
	public static final void method3676(boolean arg0) {
		field8972 = 0;
		field8969 = 0;
		field8971++;
		method8068();
		method189(arg0);
		method4745();
		boolean var1 = false;
		for (int var2 = 0; var2 < field8972; var2++) {
			int var3 = field8973[var2];
			class798 var4 = (class798) field8964.method11923((long) var3);
			class903 var5 = (class903) var4.field9550;
			if (field8971 != var5.field8618) {
				if (class42.field585 && class42.method11169(var3)) {
					class42.method3561();
				}
				if (var5.field10075.method12511()) {
					class797.method2547(var5);
				}
				var5.method16149(null);
				var4.method6979();
				var1 = true;
			}
		}
		if (var1) {
			int var6 = field8966;
			field8966 = field8964.method11926();
			int var7 = 0;
			Iterator var8 = field8964.iterator();
			while (var8.hasNext()) {
				class798 var9 = (class798) var8.next();
				field8965[var7++] = var9;
			}
			for (int var10 = field8966; var10 < var6; var10++) {
				field8965[var10] = null;
			}
		}
		if (field8975.field835 != field8975.field832.pos) {
			throw new RuntimeException(field8975.field832.pos + " " + field8975.field835);
		}
		for (int var11 = 0; var11 < field9104; var11++) {
			if (field8964.method11923((long) field9056[var11]) == null) {
				throw new RuntimeException(var11 + " " + field9104);
			}
		}
		if (field8966 - field9104 != 0) {
			throw new RuntimeException("" + (field8966 - field9104));
		}
		for (int var12 = 0; var12 < field8966; var12++) {
			if (field8971 != ((PathingEntity) field8965[var12].field9550).field8618) {
				throw new RuntimeException("" + ((PathingEntity) field8965[var12].field9550).field8593);
			}
		}
	}

	@ObfuscatedName("qq.jk(B)V")
	public static final void method8068() {
		class964 var0 = field8975.field832;
		var0.method16862();
		int var1 = var0.method16863(8);
		if (var1 < field9104) {
			for (int var2 = var1; var2 < field9104; var2++) {
				field8973[++field8972 - 1] = field9056[var2];
			}
		}
		if (var1 > field9104) {
			throw new RuntimeException();
		}
		field9104 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = field9056[var3];
			class903 var5 = (class903) ((class798) field8964.method11923((long) var4)).field9550;
			int var6 = var0.method16863(1);
			if (var6 == 0) {
				field9056[++field9104 - 1] = var4;
				var5.field8618 = field8971;
			} else {
				int var7 = var0.method16863(2);
				if (var7 == 0) {
					field9056[++field9104 - 1] = var4;
					var5.field8618 = field8971;
					field8970[++field8969 - 1] = var4;
				} else if (var7 == 1) {
					field9056[++field9104 - 1] = var4;
					var5.field8618 = field8971;
					class364 var8 = (class364) class518.method8032(Statics.method3921(), var0.method16863(3));
					var5.method16152(var8, class365.field3921.field3924);
					int var9 = var0.method16863(1);
					if (var9 == 1) {
						field8970[++field8969 - 1] = var4;
					}
				} else if (var7 == 2) {
					field9056[++field9104 - 1] = var4;
					var5.field8618 = field8971;
					if (var0.method16863(1) == 1) {
						class364 var10 = (class364) class518.method8032(Statics.method3921(), var0.method16863(3));
						var5.method16152(var10, class365.field3922.field3924);
						class364 var11 = (class364) class518.method8032(Statics.method3921(), var0.method16863(3));
						var5.method16152(var11, class365.field3922.field3924);
					} else {
						class364 var12 = (class364) class518.method8032(Statics.method3921(), var0.method16863(3));
						var5.method16152(var12, class365.field3920.field3924);
					}
					int var13 = var0.method16863(1);
					if (var13 == 1) {
						field8970[++field8969 - 1] = var4;
					}
				} else if (var7 == 3) {
					field8973[++field8972 - 1] = var4;
				}
			}
		}
	}

	@ObfuscatedName("ta.jb(ZI)V")
	public static final void method189(boolean arg0) {
		class964 var1 = field8975.field832;
		while (var1.method16865(field8975.field835) >= 15) {
			int var2 = var1.method16863(15);
			if (var2 == 32767) {
				break;
			}
			boolean var3 = false;
			class798 var4 = (class798) field8964.method11923((long) var2);
			if (var4 == null) {
				class903 var5 = new class903(field8980.method6098());
				var5.field8593 = var2;
				var4 = new class798(var5);
				field8964.pushNode(var4, (long) var2);
				field8965[++field8966 - 1] = var4;
				var3 = true;
			}
			class903 var6 = (class903) var4.field9550;
			field9056[++field9104 - 1] = var2;
			var6.field8618 = field8971;
			if (var6.field10075 != null && var6.field10075.method12511()) {
				class797.method2547(var6);
			}
			var6.method16149(Statics.field3774.method12565(var1.method16863(15)));
			int var7 = var1.method16863(1);
			if (var7 == 1) {
				field8970[++field8969 - 1] = var2;
			}
			int var8 = var1.method16863(3) + 4 << 11 & 0x3FFF;
			int var9 = var1.method16863(1);
			int var10;
			if (arg0) {
				var10 = var1.method16863(8);
				if (var10 > 127) {
					var10 -= 256;
				}
			} else {
				var10 = var1.method16863(5);
				if (var10 > 15) {
					var10 -= 32;
				}
			}
			int var11 = var1.method16863(2);
			int var12;
			if (arg0) {
				var12 = var1.method16863(8);
				if (var12 > 127) {
					var12 -= 256;
				}
			} else {
				var12 = var1.method16863(5);
				if (var12 > 15) {
					var12 -= 32;
				}
			}
			var6.method13979(var6.field10075.field7213);
			var6.field8636 = var6.field10075.field7241 << 3;
			if (var3) {
				var6.method13946(var8, true);
			}
			var6.method16153(var11, Statics.field2119.field8642[0] + var10, Statics.field2119.field8643[0] + var12, var9 == 1, var6.method13954());
			if (var6.field10075.method12511()) {
				class797.method14954(var6.field9807, var6.field8642[0], var6.field8643[0], 0, null, var6, null);
			}
		}
		var1.method16881();
	}

	@ObfuscatedName("jf.jl(B)V")
	public static final void method4745() {
		class964 var0 = field8975.field832;
		for (int var1 = 0; var1 < field8969; var1++) {
			int var2 = field8970[var1];
			class903 var3 = (class903) ((class798) field8964.method11923((long) var2)).field9550;
			int var4 = var0.g1();
			if ((var4 & 0x4) != 0) {
				var4 += var0.g1() << 8;
			}
			if ((var4 & 0x400) != 0) {
				var4 += var0.g1() << 16;
			}
			if ((var4 & 0x20000) != 0) {
				var4 += var0.g1() << 24;
			}
			if ((var4 & 0x800000) != 0) {
				var3.field10072 = var0.method15391();
				if (var3.field10072 == 65535) {
					var3.field10072 = var3.field10075.field7233;
				}
			}
			if ((var4 & 0x8000) != 0) {
				var3.field8619 = var0.method15238() * 262144;
				var3.field8621 = var0.method15238() * 262144;
				var3.field8591 = var0.method15329() * 262144;
				var3.field8605 = var0.method15392() * 262144;
				var3.field8649 = var0.method15391() + field9213;
				var3.field8620 = var0.g2() + field9213;
				var3.field8625 = var0.g2();
				var3.field8619 = var3.field8619 * 262144 + var3.field8642[0] * 262144;
				var3.field8621 = var3.field8621 * 262144 + var3.field8643[0] * 262144;
				var3.field8591 = var3.field8591 * 262144 + var3.field8642[0] * 262144;
				var3.field8605 = var3.field8605 * 262144 + var3.field8643[0] * 262144;
				var3.field8628 = 1;
				var3.field8646 = 0;
			}
			if ((var4 & 0x100) != 0) {
				var3.field10069 = var0.method15248();
				if (var3.field10069 == 65535) {
					var3.field10069 = -1;
				}
			}
			if ((var4 & 0x400000) != 0) {
				var3.field10078.method2420();
				int var5 = var0.data[++var0.pos - 1] & 0xFF;
				for (int var6 = 0; var6 < var5; var6++) {
					int var7 = var0.method15281();
					int var8 = var0.method15331();
					var3.field10078.method2418(var7, var8);
				}
			}
			if ((var4 & 0x80) != 0) {
				if (var3.field10075.method12511()) {
					class797.method2547(var3);
				}
				var3.method16149(Statics.field3774.method12565(var0.method15411()));
				var3.method13979(var3.field10075.field7213);
				var3.field8636 = var3.field10075.field7241 << 3;
				if (var3.field10075.method12511()) {
					class797.method14954(var3.field9807, var3.field8642[0], var3.field8643[0], 0, null, var3, null);
				}
			}
			if ((var4 & 0x2000) != 0) {
				int var9 = var3.field10075.field7214.length;
				int var10 = 0;
				if (var3.field10075.field7267 != null) {
					var10 = var3.field10075.field7267.length;
				}
				int var11 = 0;
				if (var3.field10075.field7270 != null) {
					var11 = var3.field10075.field7270.length;
				}
				int var12 = var0.method15273();
				if ((var12 & 0x1) == 1) {
					var3.field10073 = null;
				} else {
					int[] var13 = null;
					if ((var12 & 0x2) == 2) {
						var13 = new int[var9];
						for (int var14 = 0; var14 < var9; var14++) {
							var13[var14] = var0.method15411();
						}
					}
					short[] var15 = null;
					if ((var12 & 0x4) == 4) {
						var15 = new short[var10];
						for (int var16 = 0; var16 < var10; var16++) {
							var15[var16] = (short) var0.method15391();
						}
					}
					short[] var17 = null;
					if ((var12 & 0x8) == 8) {
						var17 = new short[var11];
						for (int var18 = 0; var18 < var11; var18++) {
							var17[var18] = (short) var0.method15248();
						}
					}
					long var19 = (long) (++class903.field10076 - 1);
					var3.field10073 = new class610(var19, var13, var15, var17);
				}
			}
			if ((var4 & 0x20) != 0) {
				var3.field8624 = var0.method15281();
				if (var3.field8624 == 65535) {
					var3.field8624 = -1;
				}
			}
			if ((var4 & 0x4000) != 0) {
				int var21 = var0.method15271();
				int[] var22 = new int[var21];
				int[] var23 = new int[var21];
				for (int var24 = 0; var24 < var21; var24++) {
					int var25 = var0.method15281();
					if ((var25 & 0xC000) == 49152) {
						int var26 = var0.method15391();
						var22[var24] = var25 << 16 | var26;
					} else {
						var22[var24] = var25;
					}
					var23[var24] = var0.method15281();
				}
				var3.method13948(var22, var23);
			}
			if ((var4 & 0x1000) != 0) {
				int var27 = var0.g1();
				int[] var28 = new int[var27];
				int[] var29 = new int[var27];
				int[] var30 = new int[var27];
				for (int var31 = 0; var31 < var27; var31++) {
					int var32 = var0.method15411();
					var28[var31] = var32;
					var29[var31] = var0.method15273();
					var30[var31] = var0.method15248();
				}
				method12477(var3, var28, var29, var30);
			}
			if ((var4 & 0x40000) != 0) {
				var3.field10077 = var0.gjstr();
				if ("".equals(var3.field10077) || var3.field10077.equals(var3.field10075.field7212)) {
					var3.field10077 = var3.field10075.field7212;
				}
			}
			if ((var4 & 0x1000000) != 0) {
				int var33 = var0.method15281();
				int var34 = var0.method15342();
				if (var33 == 65535) {
					var33 = -1;
				}
				int var35 = var0.g1();
				int var36 = var35 & 0x7;
				int var37 = var35 >> 3 & 0xF;
				if (var37 == 15) {
					var37 = -1;
				}
				boolean var38 = (var35 >> 7 & 0x1) == 1;
				var3.method13950(var33, var34, var36, var37, var38, 3);
			}
			if ((var4 & 0x200000) != 0) {
				int var39 = var0.data[++var0.pos - 1] & 0xFF;
				for (int var40 = 0; var40 < var39; var40++) {
					int var41 = var0.method15273();
					int var42 = var0.method15311();
					int var43 = var0.method15286();
					var3.method16158(var41, var42, var43);
				}
			}
			if ((var4 & 0x80000) != 0) {
				var3.field8596 = var0.method15275();
				var3.field8602 = var0.method15329();
				var3.field8617 = var0.method15275();
				var3.field8631 = (byte) var0.method15271();
				var3.field8626 = field9213 + var0.method15248();
				var3.field8632 = field9213 + var0.method15281();
			}
			if ((var4 & 0x2) != 0) {
				var3.field10080 = var0.g2();
				var3.field10070 = var0.g2();
			}
			if ((var4 & 0x200) != 0) {
				int var44 = var0.method15248();
				int var45 = var0.method15331();
				if (var44 == 65535) {
					var44 = -1;
				}
				int var46 = var0.method15273();
				int var47 = var46 & 0x7;
				int var48 = var46 >> 3 & 0xF;
				if (var48 == 15) {
					var48 = -1;
				}
				boolean var49 = (var46 >> 7 & 0x1) == 1;
				var3.method13950(var44, var45, var47, var48, var49, 1);
			}
			if ((var4 & 0x100000) != 0) {
				int var50 = var0.data[++var0.pos - 1] & 0xFF;
				for (int var51 = 0; var51 < var50; var51++) {
					int var52 = var0.method15248();
					int var53 = var0.method15331();
					var3.field10078.method2418(var52, var53);
				}
			}
			if ((var4 & 0x1) != 0) {
				int[] var54 = new int[class365.method2553().length];
				for (int var55 = 0; var55 < class365.method2553().length; var55++) {
					var54[var55] = var0.method15411();
				}
				int var56 = var0.method15273();
				method8263(var3, var54, var56, true);
			}
			if ((var4 & 0x40) != 0) {
				int var57 = var0.method15391();
				int var58 = var0.g4s();
				if (var57 == 65535) {
					var57 = -1;
				}
				int var59 = var0.method15271();
				int var60 = var59 & 0x7;
				int var61 = var59 >> 3 & 0xF;
				if (var61 == 15) {
					var61 = -1;
				}
				boolean var62 = (var59 >> 7 & 0x1) == 1;
				var3.method13950(var57, var58, var60, var61, var62, 0);
			}
			if ((var4 & 0x10) != 0) {
				var3.method16148(var0.gjstr(), 0, 0);
			}
			if ((var4 & 0x2000000) != 0) {
				int var63 = var0.g2();
				int var64 = var0.g4s();
				if (var63 == 65535) {
					var63 = -1;
				}
				int var65 = var0.method15272();
				int var66 = var65 & 0x7;
				int var67 = var65 >> 3 & 0xF;
				if (var67 == 15) {
					var67 = -1;
				}
				boolean var68 = (var65 >> 7 & 0x1) == 1;
				var3.method13950(var63, var64, var66, var67, var68, 2);
			}
			if ((var4 & 0x8) != 0) {
				int var69 = var0.method15272();
				if (var69 > 0) {
					for (int var70 = 0; var70 < var69; var70++) {
						int var71 = -1;
						boolean var72 = true;
						int var73 = -1;
						int var74 = var0.method15277();
						int var75;
						if (var74 == 32767) {
							var74 = var0.method15277();
							var75 = var0.method15277();
							var71 = var0.method15277();
							var73 = var0.method15277();
						} else if (var74 == 32766) {
							var74 = -1;
							var75 = var0.method15271();
						} else {
							var75 = var0.method15277();
						}
						int var76 = var0.method15277();
						var3.method13953(var74, var75, var71, var73, field9213, var76);
					}
				}
				int var77 = var0.g1();
				if (var77 > 0) {
					for (int var78 = 0; var78 < var77; var78++) {
						int var79 = var0.method15277();
						int var80 = var0.method15277();
						if (var80 == 32767) {
							var3.method13990(var79);
						} else {
							int var81 = var0.method15277();
							int var82 = var0.method15271();
							int var83 = var80 > 0 ? var0.method15273() : var82;
							var3.method13944(var79, field9213, var80, var81, var82, var83);
						}
					}
				}
			}
			if ((var4 & 0x10000) != 0) {
				int var84 = var3.field10075.field7215.length;
				int var85 = 0;
				if (var3.field10075.field7267 != null) {
					var85 = var3.field10075.field7267.length;
				}
				byte var86 = 0;
				if (var3.field10075.field7270 != null) {
					var85 = var3.field10075.field7270.length;
				}
				int var87 = var0.method15272();
				if ((var87 & 0x1) != 1) {
					int[] var88 = null;
					if ((var87 & 0x2) == 2) {
						var88 = new int[var84];
						for (int var89 = 0; var89 < var84; var89++) {
							var88[var89] = var0.method15411();
						}
					}
					short[] var90 = null;
					if ((var87 & 0x4) == 4) {
						var90 = new short[var85];
						for (int var91 = 0; var91 < var85; var91++) {
							var90[var91] = (short) var0.method15248();
						}
					}
					short[] var92 = null;
					if ((var87 & 0x8) == 8) {
						var92 = new short[var86];
						for (int var93 = 0; var93 < var86; var93++) {
							var92[var93] = (short) var0.method15281();
						}
					}
					long var94 = (long) (++class903.field10074 - 1);
					new class610(var94, var88, var90, var92);
				}
			}
		}
	}

	@ObfuscatedName("qc.kr(Laay;[IIZI)V")
	public static void method8263(PathingEntity arg0, int[] arg1, int arg2, boolean arg3) {
		if (arg0.field8615 != null) {
			boolean var4 = true;
			for (int var5 = 0; var5 < arg0.field8615.length; var5++) {
				if (arg0.field8615[var5] != arg1[var5]) {
					var4 = false;
					break;
				}
			}
			class553 var6 = arg0.field8597;
			if (var4 && var6.method11767()) {
				class509 var7 = arg0.field8597.method11804();
				int var8 = var7.field6331;
				if (var8 == 1) {
					var6.method11786(arg2);
				}
				if (var8 == 2) {
					var6.method11806();
				}
			}
		}
		boolean var9 = true;
		for (int var10 = 0; var10 < arg1.length; var10++) {
			if (arg1[var10] != -1) {
				var9 = false;
			}
			if (arg0.field8615 == null || arg0.field8615[var10] == -1 || Statics.field566.method11144(arg1[var10]).field6325 >= Statics.field566.method11144(arg0.field8615[var10]).field6325) {
				arg0.field8615 = arg1;
				arg0.field8597.method11791(arg2);
				if (arg3) {
					arg0.field8646 = arg0.field8628;
				}
			}
		}
		if (!var9) {
			return;
		}
		arg0.field8615 = arg1;
		arg0.field8597.method11791(arg2);
		if (arg3) {
			arg0.field8646 = arg0.field8628;
		}
	}

	@ObfuscatedName("ef.kh(IIIIIIII)V")
	public static void method3302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= field8980.method6220() - 1 || arg2 >= field8980.method6193() - 1) {
			return;
		}
		if (field8980.method6098() == null) {
			return;
		}
		if (arg3 == 0) {
			Location var7 = (Location) field8980.method6098().method7433(arg0, arg1, arg2);
			Location var8 = (Location) field8980.method6098().method7442(arg0, arg1, arg2);
			if (var7 != null && arg4 != 2) {
				if (var7 instanceof class663) {
					((class663) var7).field7576.method2451(arg6);
				} else {
					class770.method11120(arg0, arg3, arg1, arg2, var7.method2401(), arg5, arg4, arg6);
				}
			}
			if (var8 != null) {
				if (var8 instanceof class663) {
					((class663) var8).field7576.method2451(arg6);
				} else {
					class770.method11120(arg0, arg3, arg1, arg2, var8.method2401(), arg5, arg4, arg6);
				}
			}
		} else if (arg3 == 1) {
			Location var9 = (Location) field8980.method6098().method7435(arg0, arg1, arg2);
			if (var9 != null) {
				if (var9 instanceof class662) {
					((class662) var9).field7570.method2451(arg6);
				} else {
					int var10 = var9.method2401();
					if (arg4 == 4 || arg4 == 5) {
						class770.method11120(arg0, arg3, arg1, arg2, var10, arg5, 4, arg6);
					} else if (arg4 == 6) {
						class770.method11120(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
					} else if (arg4 == 7) {
						class770.method11120(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 0x3) + 4, 4, arg6);
					} else if (arg4 == 8) {
						class770.method11120(arg0, arg3, arg1, arg2, var10, arg5 + 4, 4, arg6);
						class770.method11120(arg0, arg3, arg1, arg2, var10, (arg5 + 2 & 0x3) + 4, 4, arg6);
					}
				}
			}
		} else if (arg3 == 2) {
			Location var11 = (Location) field8980.method6098().method7437(arg0, arg1, arg2, field9216);
			if (var11 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (var11 instanceof class657) {
					((class657) var11).field7524.method2451(arg6);
				} else {
					class770.method11120(arg0, arg3, arg1, arg2, var11.method2401(), arg5, arg4, arg6);
				}
			}
		} else if (arg3 == 3) {
			Location var12 = (Location) field8980.method6098().method7517(arg0, arg1, arg2);
			if (var12 != null) {
				if (var12 instanceof class658) {
					((class658) var12).field7530.method2451(arg6);
				} else {
					class770.method11120(arg0, arg3, arg1, arg2, var12.method2401(), arg5, arg4, arg6);
				}
			}
		}
	}

	@ObfuscatedName("pl.kb(IIIIB)V")
	public static final void method7910(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field9000; var4++) {
			Rectangle var5 = field9167[var4];
			if (var5.x + var5.width > arg0 && var5.x < arg0 + arg2 && var5.y + var5.height > arg1 && var5.y < arg1 + arg3) {
				field9204[var4] = true;
			}
		}
	}

	@ObfuscatedName("oe.ki(Ljava/lang/String;I)V")
	public static void method7323(String arg0) {
		if (!field9117 || (Statics.field4822 & 0x18) == 0) {
			return;
		}
		boolean var1 = false;
		int var2 = class55.field732;
		int[] var3 = class55.field727;
		for (int var4 = 0; var4 < var2; var4++) {
			class902 var5 = field9070[var3[var4]];
			if (var5.field10040 != null && var5.field10040.equalsIgnoreCase(arg0) && (Statics.field2119 == var5 && (Statics.field4822 & 0x10) != 0 || (Statics.field4822 & 0x8) != 0)) {
				class792 var6 = class792.method14781(class280.field2955, field8975.field834);
				var6.field9467.method15278(field9102);
				var6.field9467.method15308(0);
				var6.field9467.method15223(Statics.field4166);
				var6.field9467.method15287(field9101);
				var6.field9467.method15293(var3[var4]);
				field8975.method1913(var6);
				int var7 = var5.method13954();
				method2677(var5.field8642[0], var5.field8643[0], true, class434.method11404(var5.field8642[0], var5.field8643[0], var7, var7, 0));
				var1 = true;
				break;
			}
		}
		if (!var1) {
			class175.method1587(4, class588.field6907.method12206(Statics.field2308) + arg0);
		}
		if (field9117) {
			method11223();
		}
	}

	@ObfuscatedName("sh.kv(I)V")
	public static void method11223() {
		if (!field9117) {
			return;
		}
		class165 var0 = class165.method15145(Statics.field4166, field9101);
		if (var0 != null && var0.field1873 != null) {
			HookRequest var1 = new HookRequest();
			var1.component = var0;
			var1.onOp = var0.field1873;
			ScriptRunner.runHook(var1);
		}
		field9235 = -1;
		field9102 = -1;
		field9117 = false;
		if (var0 != null) {
			requestRedrawComponent(var0);
		}
	}

	@ObfuscatedName("rn.kp(Lew;Lew;I)V")
	public static void method11058(class165 arg0, class165 arg1) {
		class792 var2 = class792.method14781(class280.field2856, field8975.field834);
		var2.field9467.method15279(arg1.field1903);
		var2.field9467.method15293(arg1.id);
		var2.field9467.method15397(arg1.parentLayer);
		var2.field9467.method15287(arg0.id);
		var2.field9467.method15289(arg0.parentLayer);
		var2.field9467.method15279(arg0.field1903);
		field8975.method1913(var2);
	}

	@ObfuscatedName("abm.kq(Lew;I)V")
	public static void method14206(class165 arg0) {
		if (!field9117) {
			return;
		}
		if (arg0.field1788 != null) {
			class165 var1 = class165.method15145(Statics.field4166, field9101);
			if (var1 != null) {
				HookRequest var2 = new HookRequest();
				var2.component = arg0;
				var2.drop = var1;
				var2.onOp = arg0.field1788;
				ScriptRunner.runHook(var2);
			}
		}
		class792 var3 = class792.method14781(class280.field2869, field8975.field834);
		var3.field9467.method15293(field9102);
		var3.field9467.method15345(arg0.parentLayer);
		var3.field9467.method15345(Statics.field4166);
		var3.field9467.method15278(field9101);
		var3.field9467.method15287(arg0.id);
		var3.field9467.method15279(arg0.field1903);
		field8975.method1913(var3);
	}

	@ObfuscatedName("lh.kc(IIILjava/lang/String;I)V")
	public static void method5716(int arg0, int arg1, int arg2, String arg3) {
		class165 var4 = class165.method15145(arg1, arg2);
		if (var4 == null) {
			return;
		}
		if (var4.field1887 != null) {
			HookRequest var5 = new HookRequest();
			var5.component = var4;
			var5.opIndex = arg0;
			var5.opBase = arg3;
			var5.onOp = var4.field1887;
			ScriptRunner.runHook(var5);
		}
		if (!method14331(var4).method14948(arg0 - 1)) {
			return;
		}
		class64 var6 = method4104();
		if (field8923 != 15 && field8923 != 1) {
			return;
		}
		if (arg0 == 1) {
			class792 var7 = class792.method14781(class280.field2853, var6.field834);
			method12592(var7, arg1, arg2, var4.field1903);
			var6.method1913(var7);
		}
		if (arg0 == 2) {
			class792 var8 = class792.method14781(class280.field2871, var6.field834);
			method12592(var8, arg1, arg2, var4.field1903);
			var6.method1913(var8);
		}
		if (arg0 == 3) {
			class792 var9 = class792.method14781(class280.field2898, var6.field834);
			method12592(var9, arg1, arg2, var4.field1903);
			var6.method1913(var9);
		}
		if (arg0 == 4) {
			class792 var10 = class792.method14781(class280.field2857, var6.field834);
			method12592(var10, arg1, arg2, var4.field1903);
			var6.method1913(var10);
		}
		if (arg0 == 5) {
			class792 var11 = class792.method14781(class280.field2908, var6.field834);
			method12592(var11, arg1, arg2, var4.field1903);
			var6.method1913(var11);
		}
		if (arg0 == 6) {
			class792 var12 = class792.method14781(class280.field2910, var6.field834);
			method12592(var12, arg1, arg2, var4.field1903);
			var6.method1913(var12);
		}
		if (arg0 == 7) {
			class792 var13 = class792.method14781(class280.field2886, var6.field834);
			method12592(var13, arg1, arg2, var4.field1903);
			var6.method1913(var13);
		}
		if (arg0 == 8) {
			class792 var14 = class792.method14781(class280.field2918, var6.field834);
			method12592(var14, arg1, arg2, var4.field1903);
			var6.method1913(var14);
		}
		if (arg0 == 9) {
			class792 var15 = class792.method14781(class280.field2915, var6.field834);
			method12592(var15, arg1, arg2, var4.field1903);
			var6.method1913(var15);
		}
		if (arg0 == 10) {
			class792 var16 = class792.method14781(class280.field2877, var6.field834);
			method12592(var16, arg1, arg2, var4.field1903);
			var6.method1913(var16);
		}
	}

	@ObfuscatedName("wv.kx(Lada;IIIB)V")
	public static void method12592(class792 arg0, int arg1, int arg2, int arg3) {
		arg0.field9467.method15279(arg3);
		arg0.field9467.method15279(arg2);
		arg0.field9467.method15289(arg1);
	}

	@ObfuscatedName("id.kn(I)V")
	public static final void method4593() {
		Statics.field4667 = null;
		method11892(openedTopInterface, 0, 0, Statics.field4125, Statics.field4677, 0, 0, -1);
		if (Statics.field4667 != null) {
			method2709(Statics.field4667, -1412584499, 0, 0, Statics.field4125, Statics.field4677, Statics.field562, Statics.field5185, Statics.field9561 == field9116 ? -1 : field9116.field1926, true);
			Statics.field4667 = null;
		}
	}

	@ObfuscatedName("ub.ko(IIIIIIIII)V")
	public static final void method11892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (class165.openInterface(arg0, null)) {
			method2709(Statics.interfaces[arg0].method3104(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
		} else if (arg7 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				field9204[var8] = true;
			}
		} else {
			field9204[arg7] = true;
		}
	}

	@ObfuscatedName("dh.kt([Lew;IIIIIIIIZI)V")
	public static final void method2709(class165[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
		Statics.field5187.method659(arg2, arg3, arg4, arg5);
		for (int var10 = 0; var10 < arg0.length; var10++) {
			class165 var11 = arg0[var10];
			if (var11 != null && (var11.layer == arg1 || arg1 == -1412584499 && field9115 == var11)) {
				int var12;
				if (arg8 == -1) {
					field9167[field9000].setBounds(var11.field1776 + arg6, var11.field1777 + arg7, var11.field1863, var11.field1929);
					var12 = ++field9000 - 1;
				} else {
					var12 = arg8;
				}
				var11.field1926 = var12;
				var11.field1927 = field9213;
				if (!method14315(var11)) {
					if (var11.field1767 != 0) {
						Statics.method8633(var11);
					}
					int var13 = var11.field1776 + arg6;
					int var14 = var11.field1777 + arg7;
					int var15 = var11.field1794;
					if (field9111 && (method14331(var11).field9416 != 0 || var11.type == 0) && var15 > 127) {
						var15 = 127;
					}
					if (field9115 == var11) {
						if (arg1 != -1412584499 && (class165.field1921 == var11.field1859 || class165.field1808 == var11.field1859 || method14331(var11).method14933())) {
							Statics.field4667 = arg0;
							Statics.field562 = arg6;
							Statics.field5185 = arg7;
							continue;
						}
						if (field8991 && field9037) {
							int var16 = Statics.field7136.method7254();
							int var17 = Statics.field7136.method7255();
							int var18 = var16 - field9160;
							int var19 = var17 - field8977;
							if (var18 < field9203) {
								var18 = field9203;
							}
							if (var11.field1863 + var18 > field9203 + field9123) {
								var18 = field9203 + field9123 - var11.field1863;
							}
							if (var19 < field8942) {
								var19 = field8942;
							}
							if (var11.field1929 + var19 > field8968 + field8942) {
								var19 = field8968 + field8942 - var11.field1929;
							}
							if (method14331(var11).method14933()) {
								method7910(var18, var19, var11.field1863, var11.field1929);
							}
							var13 = var18;
							var14 = var19;
						}
						if (class165.field1808 == var11.field1859) {
							var15 = 128;
						}
					}
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.type == 2) {
						var20 = arg2;
						var21 = arg3;
						var22 = arg4;
						var23 = arg5;
					} else {
						int var24 = var11.field1863 + var13;
						int var25 = var11.field1929 + var14;
						if (var11.type == 9) {
							var24++;
							var25++;
						}
						var20 = var13 > arg2 ? var13 : arg2;
						var21 = var14 > arg3 ? var14 : arg3;
						var22 = var24 < arg4 ? var24 : arg4;
						var23 = var25 < arg5 ? var25 : arg5;
					}
					if (var20 < var22 && var21 < var23) {
						if (var11.field1767 != 0) {
							if (class165.field1847 == var11.field1767 || class165.field1742 == var11.field1767) {
								Statics.field5187.method509();
								method14742(var13, var14, var11.field1863, var11.field1929, class165.field1742 == var11.field1767);
								method12995(var12, var20, var21, var22, var23, var13, var14);
								Statics.field5187.method490();
								Statics.field5187.method659(arg2, arg3, arg4, arg5);
								field9204[var12] = true;
								continue;
							}
							if (class165.field1743 == var11.field1767 && field8988 == 2) {
								if (var11.method3124(Statics.field5187) != null) {
									class395.method3461();
									class58.method3655(Statics.field5187, var11, var13, var14);
									Statics.field5187.method659(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (class165.field1899 == var11.field1767) {
								class41.method8599(Statics.field5187, var13, var14, var11);
								continue;
							}
							if (class165.field1751 == var11.field1767) {
								class41.method3303(Statics.field5187, var13, var14, var11, var11.field1792 % 64);
								continue;
							}
							if (class165.field1744 == var11.field1767) {
								if (var11.method3124(Statics.field5187) != null) {
									Statics.field5187.method509();
									method11873(var11, var13, var14);
									Statics.field5187.method659(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (class165.field1865 == var11.field1767) {
								class822.method13877(Statics.field5187, Statics.field8465, var13, var14, var11.field1863, var11.field1929);
								field9204[var12] = true;
								Statics.field5187.method659(arg2, arg3, arg4, arg5);
								continue;
							}
							if (class165.field1746 == var11.field1767) {
								class822.method4707(Statics.field5187, var13, var14, var11.field1863, var11.field1929);
								field9204[var12] = true;
								Statics.field5187.method659(arg2, arg3, arg4, arg5);
								continue;
							}
							if (class165.field1815 == var11.field1767) {
								if (field8926 || field9169) {
									method3451(var13, var14, var11);
									field9204[var12] = true;
								}
								continue;
							}
						}
						if (var11.type == 0) {
							if (class165.field1749 == var11.field1767 && Statics.field5187.method600()) {
								Statics.field5187.method514(0, 0, Statics.field4125, Statics.field4677);
							}
							method2709(arg0, var11.parentLayer, var20, var21, var22, var23, var13 - var11.field1857, var14 - var11.field1739, var12, arg9);
							if (var11.sortedsubcomponents != null) {
								method2709(var11.sortedsubcomponents, var11.parentLayer, var20, var21, var22, var23, var13 - var11.field1857, var14 - var11.field1739, var12, arg9);
							}
							class816 var26 = (class816) openedSubInterfaces.method11923((long) var11.parentLayer);
							if (var26 != null) {
								method11892(var26.field9679, var20, var21, var22, var23, var13, var14, var12);
							}
							if (class165.field1749 == var11.field1767) {
								if (Statics.field5187.method600()) {
									Statics.field5187.method545();
								}
								if (field8988 == 0) {
									int var27 = field8994;
									int var28 = field9147;
									int var29 = field8996;
									int var30 = field8997;
									if (field9213 < field8993) {
										float var31 = (float) (field9213 - field8992) * 1.0F / (float) (field8993 - field8992);
										var27 = (int) ((1.0F - var31) * (float) Statics.field4666 + (float) field8994 * var31);
										var28 = (int) ((1.0F - var31) * (float) Statics.field6400 + (float) field9147 * var31);
										var29 = (int) ((1.0F - var31) * (float) Statics.field6565 + (float) field8996 * var31);
										var30 = (int) ((1.0F - var31) * (float) Statics.field2631 + (float) field8997 * var31);
									}
									if (var27 > 0) {
										Statics.field5187.method496(var20, var21, var22 - var20, var23 - var21, var27 << 24 | var28 << 16 | var29 << 8 | var30);
									}
								}
							}
							Statics.field5187.method659(arg2, arg3, arg4, arg5);
						}
						if (field9166[var12] || field8929 > 1) {
							if (var11.type == 3) {
								if (var15 == 0) {
									if (var11.field1741) {
										Statics.field5187.method489(var13, var14, var11.field1863, var11.field1929, var11.field1792 | 0xFF000000, 0);
									} else {
										Statics.field5187.method488(var13, var14, var11.field1863, var11.field1929, var11.field1792 | 0xFF000000, 0);
									}
								} else if (var11.field1741) {
									Statics.field5187.method489(var13, var14, var11.field1863, var11.field1929, 255 - (var15 & 0xFF) << 24 | var11.field1792 & 0xFFFFFF, 1);
								} else {
									Statics.field5187.method488(var13, var14, var11.field1863, var11.field1929, 255 - (var15 & 0xFF) << 24 | var11.field1792 & 0xFFFFFF, 1);
								}
							} else if (var11.type == 4) {
								int var32 = 255 - (var15 & 0xFF);
								if (var32 != 0) {
									class15 var33 = var11.method3116(Statics.field6784, field8914);
									if (var33 != null) {
										int var34 = var11.field1792;
										String var35 = var11.field1825;
										if (var11.field1903 != -1) {
											class592 var36 = Statics.field3492.method12316(var11.field1903);
											var35 = var36.field7125;
											if (var35 == null) {
												var35 = "null";
											}
											if ((var36.field7078 == 1 || var11.field1904 != 1) && var11.field1904 != -1) {
												var35 = class32.method3978(16748608) + var35 + class32.field490 + " x" + method7769(var11.field1904);
											}
										}
										if (var11.field1737 != -1) {
											var35 = class521.method1723(var11.field1737);
											if (var35 == null) {
												var35 = "";
											}
										}
										if (field9108 == var11) {
											var35 = class588.field6999.method12206(Statics.field2308);
											var34 = var11.field1792;
										}
										if (field9114) {
											Statics.field5187.method478(var13, var14, var11.field1863 + var13, var11.field1929 + var14);
										}
										int var37 = var32 << 24;
										if (var11.field1860) {
											var33.method842(var35, var13, var14, var11.field1863, var11.field1929, var37 | var34, var11.field1901 ? var37 : -1, var11.field1836, var11.field1837, field9207, Statics.field2113, field8920, Statics.field8538, null);
										} else {
											var33.method832(var35, var13, var14, var11.field1863, var11.field1929, var37 | var34, var11.field1901 ? var37 : -1, var11.field1836, var11.field1837, var11.field1835, var11.field1839, Statics.field8538, null, null, 0, 0);
										}
										if (field9114) {
											Statics.field5187.method659(arg2, arg3, arg4, arg5);
										}
									} else if (class165.field1761) {
										requestRedrawComponent(var11);
									}
								}
							} else if (var11.type == 5) {
								if (var11.field1906 >= 0) {
									var11.method3181(Statics.field4678, Statics.field6360).method6368(Statics.field5187, 0, var13, var14, var11.field1863, var11.field1929, var11.field1907 << 3, var11.field1908 << 3, 0, 0);
								} else {
									class118 var39;
									if (var11.field1903 != -1) {
										class471 var38 = var11.field1913 ? Statics.field2119.field10044 : null;
										var39 = Statics.field3492.method12293(Statics.field5187, var11.field1903, var11.field1904, var11.field1800, var11.field1801 | 0xFF000000, var11.field1823, var38);
									} else if (var11.field1737 == -1) {
										var39 = var11.method3151(Statics.field5187);
									} else {
										var39 = class521.method4742(Statics.field5187, var11.field1737);
									}
									if (var39 != null) {
										int var40 = var39.method1042();
										int var41 = var39.method1047();
										int var42 = 255 - (var15 & 0xFF);
										if (var42 != 0) {
											int var43;
											if (var11.field1792 == -1) {
												var43 = 16777215;
											} else {
												var43 = var11.field1792 & 0xFFFFFF;
												if (var43 == 0) {
													var43 = 16777215;
												}
											}
											int var44 = var43 | var42 << 24;
											boolean var45 = var44 != -1;
											if (var11.field1799) {
												Statics.field5187.method478(var13, var14, var11.field1863 + var13, var11.field1929 + var14);
												if (var11.field1783 != 0) {
													int var46 = (var11.field1863 + (var40 - 1)) / var40;
													int var47 = (var11.field1929 + (var41 - 1)) / var41;
													for (int var48 = 0; var48 < var46; var48++) {
														for (int var49 = 0; var49 < var47; var49++) {
															if (var45) {
																var39.method2531((float) var40 / 2.0F + (float) (var40 * var48 + var13), (float) var41 / 2.0F + (float) (var41 * var49 + var14), 4096, var11.field1783, 0, var44, 1);
															} else {
																var39.method2503((float) var40 / 2.0F + (float) (var40 * var48 + var13), (float) var41 / 2.0F + (float) (var41 * var49 + var14), 4096, var11.field1783);
															}
														}
													}
												} else if (var45) {
													var39.method1070(var13, var14, var11.field1863, var11.field1929, 0, var44, 1);
												} else {
													var39.method2511(var13, var14, var11.field1863, var11.field1929);
												}
												Statics.field5187.method659(arg2, arg3, arg4, arg5);
											} else if (var45) {
												if (var11.field1783 != 0) {
													var39.method2531((float) var11.field1863 / 2.0F + (float) var13, (float) var11.field1929 / 2.0F + (float) var14, var11.field1863 * 4096 / var40, var11.field1783, 0, var44, 1);
												} else if (var11.field1863 == var40 && var11.field1929 == var41) {
													var39.method1054(var13, var14, 0, var44, 1);
												} else {
													var39.method2502(var13, var14, var11.field1863, var11.field1929, 0, var44, 1);
												}
											} else if (var11.field1783 != 0) {
												var39.method2503((float) var11.field1863 / 2.0F + (float) var13, (float) var11.field1929 / 2.0F + (float) var14, var11.field1863 * 4096 / var40, var11.field1783);
											} else if (var11.field1863 == var40 && var11.field1929 == var41) {
												var39.method2500(var13, var14);
											} else {
												var39.method2513(var13, var14, var11.field1863, var11.field1929);
											}
										}
									} else if (class165.field1761) {
										requestRedrawComponent(var11);
									}
								}
							} else if (var11.type == 6) {
								Statics.field5187.method509();
								field8980.method6139().method8158();
								class13 var50 = null;
								int var51 = 2048;
								if (var11.field1831 != 0) {
									var51 |= 0x80000;
								}
								int var52 = 0;
								if (var11.field1903 != -1) {
									class592 var53 = Statics.field3492.method12316(var11.field1903);
									if (var53 != null) {
										class592 var54 = var53.method12242(var11.field1904);
										var50 = var54.method12241(Statics.field5187, var51, 1, var11.field1913 ? Statics.field2119.field10044 : null, var11.field1789, 0, 0, 0, 0);
										if (var50 == null) {
											requestRedrawComponent(var11);
										} else {
											var52 = -var50.method278() >> 1;
										}
									}
								} else if (var11.field1806 == 3) {
									int var55 = var11.field1838;
									if (var55 >= 0 && var55 < 2048) {
										class902 var56 = field9070[var55];
										if (var56 != null && (field9071 == var55 || class526.method1347(var56.field10040) == var11.field1832)) {
											var50 = var11.method3174(Statics.field5187, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.field3492, Statics.field566, Statics.field2669, var11.field1789, var56.field10044);
											if (var50 == null && class165.field1761) {
												requestRedrawComponent(var11);
											}
										}
									}
								} else if (var11.field1806 == 5) {
									int var57 = var11.field1838;
									if (var57 >= 0 && var57 < 2048) {
										class902 var58 = field9070[var57];
										if (var58 != null && (field9071 == var57 || class526.method1347(var58.field10040) == var11.field1832)) {
											var50 = var58.field10044.method8244(Statics.field5187, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.field3492, Statics.field566, Statics.field2669, var11.field1789, null, null, null, 0, true, Statics.field3226);
										}
									}
								} else if (var11.field1806 == 8 || var11.field1806 == 9) {
									class769 var59 = class769.method11708(var11.field1838, false);
									if (var59 != null) {
										var50 = var59.method14751(Statics.field5187, var51, var11.field1789, var11.field1832, var11.field1806 == 9, var11.field1913 ? Statics.field2119.field10044 : null);
									}
								} else if (var11.field1789 != null && var11.field1789.method11767()) {
									var50 = var11.method3174(Statics.field5187, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.field3492, Statics.field566, Statics.field2669, var11.field1789, Statics.field2119.field10044);
									if (var50 == null && class165.field1761) {
										requestRedrawComponent(var11);
									}
								} else {
									var50 = var11.method3174(Statics.field5187, var51, Statics.field3769, Statics.field7650, Statics.field3774, Statics.field3492, Statics.field566, Statics.field2669, null, Statics.field2119.field10044);
									if (var50 == null && class165.field1761) {
										requestRedrawComponent(var11);
									}
								}
								if (var50 != null) {
									if (var11.field1831 != 0) {
										var50.method290(var11.field1828, var11.field1809, var11.field1830, var11.field1831);
									}
									int var60;
									if (var11.field1819 > 0) {
										var60 = (var11.field1863 << 9) / var11.field1819;
									} else {
										var60 = 512;
									}
									int var61;
									if (var11.field1895 > 0) {
										var61 = (var11.field1929 << 9) / var11.field1895;
									} else {
										var61 = 512;
									}
									int var62 = var11.field1863 / 2 + var13;
									int var63 = var11.field1929 / 2 + var14;
									if (!var11.field1816) {
										var62 += var11.field1811 * var60 >> 9;
										var63 += var11.field1916 * var61 >> 9;
									}
									field8925.method5157();
									Statics.field5187.method524(field8925);
									class320 var64 = Statics.field5187.method781();
									int var65 = field8980.method6096();
									int var66 = field8980.method6108();
									int var67 = var11.field1818 + var66;
									if (var11.field1821) {
										if (Statics.field2671 == 2) {
											if (var11.field1816) {
												var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, Statics.field1307.method3732(), Statics.field1307.method3778(), (float) Statics.field4125, (float) Statics.field4677, (float) var11.field1818);
											} else {
												var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, Statics.field1307.method3732(), Statics.field1307.method3778(), (float) Statics.field4125, (float) Statics.field4677, (float) (var11.field1818 << 2));
											}
										} else if (var11.field1816) {
											var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.field4125, (float) Statics.field4677, (float) var11.field1818);
										} else {
											var64.method5398((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.field4125, (float) Statics.field4677, (float) (var11.field1818 << 2));
										}
									} else if (Statics.field2671 == 2) {
										var64.method5397((float) var62, (float) var63, (float) var60, (float) var61, Statics.field1307.method3732(), Statics.field1307.method3778(), (float) Statics.field4125, (float) Statics.field4677);
									} else {
										var64.method5397((float) var62, (float) var63, (float) var60, (float) var61, (float) var65, (float) var67, (float) Statics.field4125, (float) Statics.field4677);
									}
									Statics.field5187.method784(var64);
									Statics.field5187.method505(2, 0);
									if (var11.field1822) {
										Statics.field5187.method526(false);
									}
									if (var11.field1816) {
										field8979.method5106(1.0F, 0.0F, 0.0F, class312.method5096(var11.field1812));
										field8979.method5178(0.0F, 1.0F, 0.0F, class312.method5096(var11.field1813));
										field8979.method5178(0.0F, 0.0F, 1.0F, class312.method5096(var11.field1814));
										field8979.method5116((float) var11.field1811, (float) var11.field1916, (float) var11.field1817);
									} else {
										int var68 = (var11.field1818 << 2) * class312.field3439[var11.field1812 << 3] >> 14;
										int var69 = (var11.field1818 << 2) * class312.field3447[var11.field1812 << 3] >> 14;
										field8979.method5106(0.0F, 0.0F, 1.0F, class312.method5096(-var11.field1814 << 3));
										field8979.method5178(0.0F, 1.0F, 0.0F, class312.method5096(var11.field1813 << 3));
										field8979.method5116((float) (var11.field1810 << 2), (float) ((var11.field1824 << 2) + var68 + var52), (float) ((var11.field1824 << 2) + var69));
										field8979.method5178(1.0F, 0.0F, 0.0F, class312.method5096(var11.field1812 << 3));
									}
									var11.method3119(Statics.field5187, var50, field8979, field9213);
									Statics.field5187.method515(true);
									Statics.field5187.method659(arg2, arg3, arg4, arg5);
									if (field9114) {
										Statics.field5187.method478(var13, var14, var11.field1863 + var13, var11.field1929 + var14);
									}
									var50.method271(field8979, null, 1);
									if (!var11.field1821 && var11.field1840 != null) {
										Statics.field5187.method733(var11.field1840.method8109());
									}
									if (field9114) {
										Statics.field5187.method659(arg2, arg3, arg4, arg5);
									}
									Statics.field5187.method515(false);
									Statics.field5187.method753();
									Statics.field5187.method659(arg2, arg3, arg4, arg5);
									if (var11.field1822) {
										Statics.field5187.method526(true);
									}
								}
							} else if (var11.type == 9) {
								int var70;
								int var71;
								int var72;
								int var73;
								if (var11.field1796) {
									var70 = var13;
									var71 = var11.field1929 + var14;
									var72 = var11.field1863 + var13;
									var73 = var14;
								} else {
									var70 = var13;
									var71 = var14;
									var72 = var11.field1863 + var13;
									var73 = var11.field1929 + var14;
								}
								if (var11.field1791 == 1) {
									Statics.field5187.method825(var70, var71, var72, var73, var11.field1792 | 0xFF000000, 0);
								} else {
									Statics.field5187.method499(var70, var71, var72, var73, var11.field1792 | 0xFF000000, var11.field1791, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.kl(IILew;B)V")
	public static void method3451(int arg0, int arg1, class165 arg2) {
		int var3 = arg2.field1863 + arg0;
		int var4 = arg1 + 15;
		if (!field8926) {
			return;
		}
		int var5 = -256;
		if (field4121 < 20) {
			var5 = -65536;
		}
		Statics.field560.method862("Fps:" + field4121, var3, var4, var5, -1);
		var4 += 15;
		Runtime var6 = Runtime.getRuntime();
		long var7 = var6.totalMemory() / 1024L;
		long var9 = var7 - var6.freeMemory() / 1024L;
		int var11 = -256;
		if (var9 > 262144L) {
			var11 = -65536;
		}
		Statics.field560.method862("Mem:" + var9 + "/" + var7 + "k", var3, var4, var11, -1);
		var4 += 15;
		long var12 = field8975.field847.method1232();
		String var14 = "N/A";
		if (var12 != -1L) {
			var14 = var12 + "ms";
			if (var12 > 500L) {
				var14 = class32.method3978(16711680) + var14 + class32.method3978(16776960);
			}
		}
		Statics.field560.method862("Game: In:" + field8975.field838 + "B/s " + "Out:" + field8975.field841 + "B/s " + "Ping:" + var14, var3, var4, -256, -1);
		var4 += 15;
		long var15 = field8959.field847.method1232();
		String var17 = "N/A";
		if (var15 != -1L) {
			var17 = var15 + "ms";
			if (var15 > 500L) {
				var17 = class32.method3978(16711680) + var17 + class32.method3978(16776960);
			}
		}
		Statics.field560.method862("Lobby: In:" + field8959.field838 + "B/s " + "Out:" + field8959.field841 + "B/s " + "Ping:" + var17, var3, var4, -256, -1);
		var4 += 15;
		int var18 = Statics.field5187.method552() / 1024;
		Statics.field560.method862("Offheap:" + var18 + "k", var3, var4, var18 > 65536 ? -65536 : -256, -1);
		var4 += 15;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < Statics.field4456.length; var22++) {
			if (Statics.field4456[var22] != null) {
				var19 += Statics.field4456[var22].method14245();
				var20 += Statics.field4456[var22].method14241();
				var21 += Statics.field4456[var22].method14242();
			}
		}
		int var23 = var21 * 100 / var19;
		int var24 = var20 * 10000 / var19;
		String var25 = "Cache:" + class522.method11664((long) var24, 2, true, class519.field6376) + "% (" + var23 + "%)";
		Statics.field2163.method862(var25, var3, var4, -256, -1);
		var4 += 12;
	}

	@ObfuscatedName("ps.ka(IB)Ljava/lang/String;")
	public static final String method7769(int arg0) {
		String var1 = Integer.toString(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + class32.field488 + var1.substring(var2);
		}
		if (var1.length() > 9) {
			return " " + class32.method3978(65408) + var1.substring(0, var1.length() - 8) + class588.field6896.method12206(Statics.field2308) + " (" + var1 + ")" + class32.field490;
		} else if (var1.length() > 6) {
			return " " + class32.method3978(16777215) + var1.substring(0, var1.length() - 4) + class588.field7004.method12206(Statics.field2308) + " (" + var1 + ")" + class32.field490;
		} else {
			return " " + class32.method3978(16776960) + var1 + class32.field490;
		}
	}

	@ObfuscatedName("jx.kd(Lej;Lew;I)Lew;")
	public static final class165 method4752(class164 arg0, class165 arg1) {
		if (arg1.layer != -1) {
			return arg0.method3108(arg1.layer);
		}
		if (!arg0.field1734) {
			int var2 = arg1.parentLayer >>> 16;
			class566 var3 = new class566(openedSubInterfaces);
			for (class816 var4 = (class816) var3.method11955(); var4 != null; var4 = (class816) var3.next()) {
				if (var4.field9679 == var2) {
					return class165.method11381((int) var4.field4228);
				}
			}
		}
		return null;
	}

	@ObfuscatedName("ae.kz(ZI)V")
	public static final void method1969(boolean arg0) {
		method11241(openedTopInterface, Statics.field4125, Statics.field4677, arg0);
	}

	@ObfuscatedName("eo.kf(Lej;Lew;B)V")
	public static void method3293(class164 arg0, class165 arg1) {
		class165 var2 = method4752(arg0, arg1);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Statics.field4125;
			var4 = Statics.field4677;
		} else {
			var3 = var2.field1863;
			var4 = var2.field1929;
		}
		method8063(arg1, var3, var4, false);
		method1742(arg1, var3, var4);
	}

	@ObfuscatedName("wb.kj(Lej;Lew;ZB)V")
	public static void method12722(class164 arg0, class165 arg1, boolean arg2) {
		method5831(arg0.components, arg1, arg2);
	}

	@ObfuscatedName("lu.kw([Lew;Lew;ZI)V")
	public static void method5831(class165[] arg0, class165 arg1, boolean arg2) {
		int var3 = arg1.field1790 == 0 ? arg1.field1863 : arg1.field1790;
		int var4 = arg1.field1894 == 0 ? arg1.field1929 : arg1.field1894;
		method11323(arg0, arg1.parentLayer, var3, var4, arg2);
		if (arg1.sortedsubcomponents != null) {
			method11323(arg1.sortedsubcomponents, arg1.parentLayer, var3, var4, arg2);
		}
		class816 var5 = (class816) openedSubInterfaces.method11923((long) arg1.parentLayer);
		if (var5 != null) {
			method11241(var5.field9679, var3, var4, arg2);
		}
		if (field9113 != arg1) {
			return;
		}
		int var6 = class55.field732;
		int[] var7 = class55.field727;
		for (int var8 = 0; var8 < var6; var8++) {
			class902 var9 = field9070[var7[var8]];
			if (var9 != null) {
				var9.method13969(var3, var4, arg2);
			}
		}
		for (int var10 = 0; var10 < field9104; var10++) {
			int var11 = field9056[var10];
			class798 var12 = (class798) field8964.method11923((long) var11);
			if (var12 != null) {
				((PathingEntity) var12.field9550).method13969(var3, var4, arg2);
			}
		}
	}

	@ObfuscatedName("sq.ke(IIIZB)V")
	public static final void method11241(int arg0, int arg1, int arg2, boolean arg3) {
		if (class165.openInterface(arg0, null)) {
			method11323(Statics.interfaces[arg0].components, -1, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("sr.km([Lew;IIIZI)V")
	public static void method11323(class165[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
		for (int var5 = 0; var5 < arg0.length; var5++) {
			class165 var6 = arg0[var5];
			if (var6 != null && var6.layer == arg1) {
				method8063(var6, arg2, arg3, arg4);
				method1742(var6, arg2, arg3);
				if (var6.field1857 > var6.field1790 - var6.field1863) {
					var6.field1857 = var6.field1790 - var6.field1863;
				}
				if (var6.field1857 < 0) {
					var6.field1857 = 0;
				}
				if (var6.field1739 > var6.field1894 - var6.field1929) {
					var6.field1739 = var6.field1894 - var6.field1929;
				}
				if (var6.field1739 < 0) {
					var6.field1739 = 0;
				}
				if (var6.type == 0) {
					method5831(arg0, var6, arg4);
				}
			}
		}
	}

	@ObfuscatedName("qx.kg(Lew;IIZI)V")
	public static void method8063(class165 arg0, int arg1, int arg2, boolean arg3) {
		int var4 = arg0.field1863;
		int var5 = arg0.field1929;
		if (arg0.field1856 == 0) {
			arg0.field1863 = arg0.field1910;
		} else if (arg0.field1856 == 1) {
			arg0.field1863 = arg1 - arg0.field1910;
		} else if (arg0.field1856 == 2) {
			arg0.field1863 = arg0.field1910 * arg1 >> 14;
		}
		if (arg0.field1771 == 0) {
			arg0.field1929 = arg0.field1775;
		} else if (arg0.field1771 == 1) {
			arg0.field1929 = arg2 - arg0.field1775;
		} else if (arg0.field1771 == 2) {
			arg0.field1929 = arg0.field1775 * arg2 >> 14;
		}
		if (arg0.field1856 == 4) {
			arg0.field1863 = arg0.field1929 * arg0.field1923 / arg0.field1781;
		}
		if (arg0.field1771 == 4) {
			arg0.field1929 = arg0.field1863 * arg0.field1781 / arg0.field1923;
		}
		if (field9111 && (method14331(arg0).field9416 != 0 || arg0.type == 0)) {
			if (arg0.field1929 < 5 && arg0.field1863 < 5) {
				arg0.field1929 = 5;
				arg0.field1863 = 5;
			} else {
				if (arg0.field1929 <= 0) {
					arg0.field1929 = 5;
				}
				if (arg0.field1863 <= 0) {
					arg0.field1863 = 5;
				}
			}
		}
		if (class165.field1847 == arg0.field1767) {
			field9113 = arg0;
		}
		if (arg3 && arg0.field1778 != null && (arg0.field1863 != var4 || arg0.field1929 != var5)) {
			HookRequest var6 = new HookRequest();
			var6.component = arg0;
			var6.onOp = arg0.field1778;
			field9089.method11558(var6);
		}
	}

	@ObfuscatedName("ag.kk(Lew;III)V")
	public static void method1742(class165 arg0, int arg1, int arg2) {
		if (arg0.field1829 == 0) {
			arg0.field1776 = arg0.field1772;
		} else if (arg0.field1829 == 1) {
			arg0.field1776 = (arg1 - arg0.field1863) / 2 + arg0.field1772;
		} else if (arg0.field1829 == 2) {
			arg0.field1776 = arg1 - arg0.field1863 - arg0.field1772;
		} else if (arg0.field1829 == 3) {
			arg0.field1776 = arg0.field1772 * arg1 >> 14;
		} else if (arg0.field1829 == 4) {
			arg0.field1776 = (arg0.field1772 * arg1 >> 14) + (arg1 - arg0.field1863) / 2;
		} else {
			arg0.field1776 = arg1 - arg0.field1863 - (arg0.field1772 * arg1 >> 14);
		}
		if (arg0.field1769 == 0) {
			arg0.field1777 = arg0.field1774;
		} else if (arg0.field1769 == 1) {
			arg0.field1777 = (arg2 - arg0.field1929) / 2 + arg0.field1774;
		} else if (arg0.field1769 == 2) {
			arg0.field1777 = arg2 - arg0.field1929 - arg0.field1774;
		} else if (arg0.field1769 == 3) {
			arg0.field1777 = arg0.field1774 * arg2 >> 14;
		} else if (arg0.field1769 == 4) {
			arg0.field1777 = (arg0.field1774 * arg2 >> 14) + (arg2 - arg0.field1929) / 2;
		} else {
			arg0.field1777 = arg2 - arg0.field1929 - (arg0.field1774 * arg2 >> 14);
		}
		if (!field9111 || method14331(arg0).field9416 == 0 && arg0.type != 0) {
			return;
		}
		if (arg0.field1776 < 0) {
			arg0.field1776 = 0;
		} else if (arg0.field1863 + arg0.field1776 > arg1) {
			arg0.field1776 = arg1 - arg0.field1863;
		}
		if (arg0.field1777 < 0) {
			arg0.field1777 = 0;
		} else if (arg0.field1929 + arg0.field1777 > arg2) {
			arg0.field1777 = arg2 - arg0.field1929;
		}
	}

	@ObfuscatedName("oc.lk(I)V")
	public static void method7380() {
		field8980.method6111();
		class58.method7992();
		method5025(true);
		class521.method4743();
		System.gc();
		Statics.field5187.method505(2, 0);
	}

	@ObfuscatedName("py.li(I)V")
	public static void method7983() {
		method11307(16);
		class822.method3465();
		System.gc();
	}

	@ObfuscatedName("jr.lb(I)V")
	public static final void method4782() {
		if (openedTopInterface == -1) {
			return;
		}
		int var0 = Statics.field7136.method7254();
		int var1 = Statics.field7136.method7255();
		class809 var2 = (class809) field9136.method11563();
		if (var2 != null) {
			var0 = var2.method15182();
			var1 = var2.method15183();
		}
		if (field9115 != null && Statics.field9561 == field9116) {
			field9037 = true;
			field9203 = 0;
			field8942 = 0;
			field9123 = Statics.field4125;
			field8968 = Statics.field4677;
		}
		method15857(null, openedTopInterface, 0, 0, Statics.field4125, Statics.field4677, 0, 0, var0, var1);
		if (Statics.field4960 != null) {
			class822.method12144(var0, var1);
		}
	}

	@ObfuscatedName("afv.lv(Laep;IIIIIIIIII)V")
	public static final void method15857(class816 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (!class165.openInterface(arg1, null)) {
			return;
		}
		if (arg0 == null || arg0.method15469()) {
			class164 var10 = Statics.interfaces[arg1];
			method14330(var10, var10.method3104(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			method7069(arg0, true, false);
		}
	}

	@ObfuscatedName("client.ls(Lej;[Lew;IIIIIIIII)V")
	public static final void method14330(class164 arg0, class165[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		label998: for (int var11 = 0; var11 < arg1.length; var11++) {
			class165 var12 = arg1[var11];
			if (var12 != null && var12.layer == arg2) {
				int var13 = var12.field1776 + arg7;
				int var14 = var12.field1777 + arg8;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12.type == 2) {
					var15 = arg3;
					var16 = arg4;
					var17 = arg5;
					var18 = arg6;
				} else {
					int var19 = var12.field1863 + var13;
					int var20 = var12.field1929 + var14;
					if (var12.type == 9) {
						var19++;
						var20++;
					}
					var15 = var13 > arg3 ? var13 : arg3;
					var16 = var14 > arg4 ? var14 : arg4;
					var17 = var19 < arg5 ? var19 : arg5;
					var18 = var20 < arg6 ? var20 : arg6;
				}
				if (var12.type == 0 || var12.field1861 || method14331(var12).field9416 != 0 || field9116 == var12 || class165.field1743 == var12.field1767 || class165.field1748 == var12.field1767 || class165.field1847 == var12.field1767 || class165.field1742 == var12.field1767) {
					if (!method14315(var12)) {
						if (field9115 == var12 && method12723(field9115)) {
							field9080 = true;
							field9126 = var13;
							field9127 = var14;
						}
						if (var12.field1842 || var15 < var17 && var16 < var18) {
							if (var12.field1787 && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								for (HookRequest var21 = (HookRequest) field9089.method11563(); var21 != null; var21 = (HookRequest) field9089.method11567()) {
									if (var21.field9608) {
										var21.method6979();
										var21.component.field1917 = false;
									}
								}
								if (Statics.field8727 == 0) {
									field9115 = null;
									field9116 = null;
								}
								field9150 = 0;
								class822.field9754 = false;
								field9041 = false;
								if (!class42.field585) {
									class42.method1401();
								}
							}
							boolean var22 = var12.field1805 && var12.type == 5 && var12.field1794 == 0 && var12.field1906 < 0 && var12.field1903 == -1 && var12.field1737 == -1 && !var12.field1799 && var12.field1783 == 0;
							boolean var23 = false;
							if (arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
								if (var22) {
									class163 var24 = var12.method3124(Statics.field5187);
									if (var24 != null && var12.field1863 == var24.field1728 && var12.field1929 == var24.field1727) {
										int var25 = arg9 - var13;
										int var26 = arg10 - var14;
										if (var26 >= 0 && var26 < var24.field1729.length) {
											int var27 = var24.field1729[var26];
											if (var25 >= var27 && var25 <= var24.field1726[var26] + var27) {
												var23 = true;
											}
										}
									} else {
										var23 = true;
									}
								} else {
									var23 = true;
								}
							}
							if (!field9117 && var23) {
								if (var12.field1786 >= 0) {
									field9235 = var12.field1786;
								} else if (var12.field1787) {
									field9235 = -1;
								}
							}
							if (!class42.field585 && var23 && !arg0.field1734) {
								class42.method881(var12, arg9 - var13, arg10 - var14);
							}
							boolean var28 = false;
							if (Statics.field7136.method7250() && var23) {
								var28 = true;
							}
							boolean var29 = false;
							class809 var30 = (class809) field9136.method11563();
							if (var30 != null && var30.method15181() == 0 && var30.method15182() >= var15 && var30.method15183() >= var16 && var30.method15182() < var17 && var30.method15183() < var18) {
								if (var22) {
									class163 var31 = var12.method3124(Statics.field5187);
									if (var31 != null && var12.field1863 == var31.field1728 && var12.field1929 == var31.field1727) {
										int var32 = var30.method15182() - var13;
										int var33 = var30.method15183() - var14;
										if (var33 >= 0 && var33 < var31.field1729.length) {
											int var34 = var31.field1729[var33];
											if (var32 >= var34 && var32 <= var31.field1726[var33] + var34) {
												var29 = true;
											}
										}
									} else {
										var29 = true;
									}
								} else {
									var29 = true;
								}
							}
							if (var12.field1842 && !class62.method14925()) {
								for (int var35 = 0; var35 < var12.field1905.length; var35++) {
									boolean var36 = false;
									boolean var37 = false;
									if (var12.field1846[var35] > 0) {
										for (int var38 = 0; var38 < field8950; var38++) {
											if (var12.field1846[var35] == field8951[var38].method7298()) {
												var36 = true;
												if (var12.field1851 == null || var12.field1851[var35] <= field9213) {
													var37 = true;
												}
												break;
											}
										}
									}
									if (!var36 && var12.field1905[var35] != null) {
										for (int var39 = 0; var39 < var12.field1905[var35].length; var39++) {
											if (Statics.field2131.method7243(var12.field1905[var35][var39])) {
												var36 = true;
												if (var12.field1851 != null && var12.field1851[var35] > field9213) {
													break;
												}
												byte var40 = var12.field1844[var35][var39];
												if (var40 == 0 || ((var40 & 0x8) == 0 || !Statics.field2131.method7243(86) && !Statics.field2131.method7243(82) && !Statics.field2131.method7243(81)) && ((var40 & 0x2) == 0 || Statics.field2131.method7243(86)) && ((var40 & 0x1) == 0 || Statics.field2131.method7243(82)) && ((var40 & 0x4) == 0 || Statics.field2131.method7243(81))) {
													var37 = true;
													break;
												}
											}
										}
									}
									if (var37) {
										if (var35 < 10) {
											method5716(var35 + 1, var12.parentLayer, var12.id, "");
										} else if (var35 == 10) {
											method11223();
											class785 var41 = method14331(var12);
											Statics.method11974(var12, var41.method14928(), var41.field9423);
											field9103 = method14722(var12);
											if (field9103 == null) {
												field9103 = "Null";
											}
											field9151 = var12.field1795 + class32.method3978(16777215);
										}
										int var42 = var12.field1845[var35];
										if (var12.field1851 == null) {
											var12.field1851 = new int[var12.field1905.length];
										}
										if (var42 == 0) {
											var12.field1851[var35] = Integer.MAX_VALUE;
										} else {
											var12.field1851[var35] = field9213 + var42;
										}
									}
									if (!var36 && var12.field1851 != null) {
										var12.field1851[var35] = 0;
									}
								}
							}
							if (var29) {
								method8390(var12, var30.method15182() - var13, var30.method15183() - var14);
							}
							if (field9115 != null && field9115 != var12 && var23 && method14331(var12).method14930()) {
								field9119 = var12;
							}
							if (field9116 == var12) {
								field9037 = true;
								field9203 = var13;
								field8942 = var14;
								field9123 = field9116.field1863;
								field8968 = field9116.field1929;
							}
							if (var12.field1861 || var12.field1767 != 0) {
								if (var23 && field9002 != 0 && var12.field1889 != null) {
									HookRequest var43 = new HookRequest();
									var43.field9608 = true;
									var43.component = var12;
									var43.mouseY = field9002;
									var43.onOp = var12.field1889;
									field9089.method11558(var43);
								}
								if (field9115 != null) {
									var29 = false;
									var28 = false;
								} else if (class42.field585 || class165.field1865 != var12.field1767 && field9150 > 0) {
									var29 = false;
									var28 = false;
									var23 = false;
								}
								if (var12.field1767 != 0) {
									if (class165.field1847 == var12.field1767 || class165.field1742 == var12.field1767) {
										field9113 = var12;
										class470 var66 = field8980.method6139().method8174();
										if (var66.method8210() != null && !Statics.field8656.method6042()) {
											var66.method8210().method6366(Statics.field5187, var12.field1929, Statics.field4961.field9657.method15807());
										}
										if (class165.field1847 == var12.field1767 && !class42.field585 && arg9 >= var15 && arg10 >= var16 && arg9 < var17 && arg10 < var18) {
											class42.method4866(Statics.field5187, arg9, arg10);
											for (class763 var67 = (class763) field9046.method11649(); var67 != null; var67 = (class763) field9046.method11644()) {
												if (arg9 >= var67.field9251 && arg9 < var67.field9253 && arg10 >= var67.field9252 && arg10 < var67.field9254) {
													class42.method1401();
													class42.method2845(var67.field9250);
												}
											}
										}
										int var68 = class55.field732;
										int[] var69 = class55.field727;
										for (int var70 = 0; var70 < var68; var70++) {
											class902 var71 = field9070[var69[var70]];
											if (var71 != null) {
												ScriptRunner.runPathingEntity(ClientTriggerType.PROCESS_PLAYER, -1, -1, var71, var69[var70]);
												var71.method13967(var15, var16, var17, var18, var13 - var12.field1857, var14 - var12.field1739, arg9, arg10);
											}
										}
										int var72 = 0;
										while (true) {
											if (var72 >= field9104) {
												continue label998;
											}
											int var73 = field9056[var72];
											class798 var74 = (class798) field8964.method11923((long) var73);
											if (var74 != null) {
												ScriptRunner.runPathingEntity(ClientTriggerType.PROCESS_NPC, ((class903) var74.field9550).field10075.field7211, -1, (PathingEntity) var74.field9550, var73);
												((PathingEntity) var74.field9550).method13967(var15, var16, var17, var18, var13 - var12.field1857, var14 - var12.field1739, arg9, arg10);
											}
											var72++;
										}
									}
									if (class165.field1743 == var12.field1767) {
										class163 var44 = var12.method3124(Statics.field5187);
										if (var44 == null || class58.field762 != 0 && class58.field762 != 3 || class42.field585 || arg9 < var15 || arg10 < var16 || arg9 >= var17 || arg10 >= var18) {
											continue;
										}
										int var45 = arg9 - var13;
										int var46 = arg10 - var14;
										int var47 = var44.field1729[var46];
										if (var45 < var47 || var45 > var44.field1726[var46] + var47) {
											continue;
										}
										int var48 = var45 - var12.field1863 / 2;
										int var49 = var46 - var12.field1929 / 2;
										int var50;
										if (Statics.field2671 == 5) {
											var50 = (int) field9021 & 0x3FFF;
										} else if (Statics.field2671 == 2) {
											var50 = (int) ((double) Statics.field1307.method3791() * 2607.5945876176133D);
										} else {
											var50 = field9087 + (int) field9021 & 0x3FFF;
										}
										int var51 = class312.field3439[var50];
										int var52 = class312.field3447[var50];
										if (Statics.field2671 != 5) {
											var51 = (field8976 + 256) * var51 >> 8;
											var52 = (field8976 + 256) * var52 >> 8;
										}
										int var53 = var48 * var52 + var49 * var51 >> 14;
										int var54 = var49 * var52 - var48 * var51 >> 14;
										int var55;
										int var56;
										if (Statics.field2671 == 5) {
											var55 = (field9154 >> 9) + (var53 >> 2);
											var56 = (field9019 >> 9) - (var54 >> 2);
										} else {
											int var57 = (Statics.field2119.method13954() - 1) * 256;
											Vector3 var58 = Statics.field2119.method8565().field3464;
											var55 = ((int) var58.field3475 - var57 >> 9) + (var53 >> 2);
											var56 = ((int) var58.field3477 - var57 >> 9) - (var54 >> 2);
										}
										if (field9117 && (Statics.field4822 & 0x40) != 0) {
											class165 var59 = class165.method15145(Statics.field4166, field9101);
											if (var59 == null) {
												method11223();
											} else {
												Statics.method8140(field9103, " " + class32.field491, Statics.field477, 59, var12.field1903, 1L, var55, var56, true, false, (long) (var12.id << 32 | var12.parentLayer), true);
											}
											continue;
										}
										if (field9163 == class527.field6402) {
											Statics.method8140(class588.field6995.method12206(Statics.field2308), "", -1, 60, -1, 1L, var55, var56, true, false, 0L, true);
										}
										Statics.method8140(Statics.field2400, "", field9172, 23, -1, 1L, var55, var56, true, false, 0L, true);
										continue;
									}
									if (class165.field1865 == var12.field1767) {
										Statics.field4960 = var12;
										if (var23) {
											class822.field9754 = true;
										}
										if (var29) {
											int var60 = (int) ((double) (var30.method15182() - var13 - var12.field1863 / 2) * 2.0D / (double) Statics.field4279);
											int var61 = (int) -((double) (var30.method15183() - var14 - var12.field1929 / 2) * 2.0D / (double) Statics.field4279);
											int var62 = Statics.field4465 + var60 + Statics.field4283;
											int var63 = Statics.field6770 + var61 + Statics.field4284;
											class951 var64 = class822.method12024();
											if (var64 == null) {
												continue;
											}
											int[] var65 = new int[3];
											var64.method16707(var62, var63, var65);
											if (var65 != null) {
												if (Statics.field2131.method7243(82) && field9074 > 0) {
													Statics.method2617(var65[0], var65[1], var65[2]);
													continue;
												}
												field9041 = true;
												Statics.field669 = var65[0];
												Statics.field9405 = var65[1];
												Statics.field6665 = var65[2];
											}
											field9150 = 1;
											field9013 = false;
											field9160 = Statics.field7136.method7254();
											field8977 = Statics.field7136.method7255();
											continue;
										}
										if (var28 && field9150 > 0) {
											if (field9150 == 1 && (field9160 != Statics.field7136.method7254() || field8977 != Statics.field7136.method7255())) {
												Statics.field5014 = Statics.field4465;
												Statics.field7338 = Statics.field6770;
												field9150 = 2;
											}
											if (field9150 == 2) {
												field9013 = true;
												class822.method4746(Statics.field5014 + (int) ((double) (field9160 - Statics.field7136.method7254()) * 2.0D / (double) Statics.field4269));
												class822.method12163(Statics.field7338 - (int) ((double) (field8977 - Statics.field7136.method7255()) * 2.0D / (double) Statics.field4269));
											}
											continue;
										}
										if (field9150 > 0 && !field9013) {
											if ((field8933 == 1 || class42.method16114()) && class42.field588 > 2) {
												class42.method13889(field9160, field8977);
											} else if (class42.method3011()) {
												class42.method13889(field9160, field8977);
											}
										}
										field9150 = 0;
										continue;
									}
									if (class165.field1746 == var12.field1767) {
										if (var28) {
											class822.method12692(Statics.field7136.method7254() - var13, Statics.field7136.method7255() - var14, var12.field1863, var12.field1929);
										}
										continue;
									}
									if (class165.field1748 == var12.field1767) {
										class42.method4560(var12, var13, var14);
										continue;
									}
								}
								if (!var12.field1858 && var29) {
									var12.field1858 = true;
									if (var12.field1912 != null) {
										HookRequest var75 = new HookRequest();
										var75.field9608 = true;
										var75.component = var12;
										var75.mouseX = var30.method15182() - var13;
										var75.mouseY = var30.method15183() - var14;
										var75.onOp = var12.field1912;
										field9089.method11558(var75);
									}
								}
								if (var12.field1858 && var28 && var12.field1864 != null) {
									HookRequest var76 = new HookRequest();
									var76.field9608 = true;
									var76.component = var12;
									var76.mouseX = Statics.field7136.method7254() - var13;
									var76.mouseY = Statics.field7136.method7255() - var14;
									var76.onOp = var12.field1864;
									field9089.method11558(var76);
								}
								if (var12.field1858 && !var28) {
									var12.field1858 = false;
									if (var12.field1773 != null) {
										HookRequest var77 = new HookRequest();
										var77.field9608 = true;
										var77.component = var12;
										var77.mouseX = Statics.field7136.method7254() - var13;
										var77.mouseY = Statics.field7136.method7255() - var14;
										var77.onOp = var12.field1773;
										field9125.method11558(var77);
									}
								}
								if (var28 && var12.field1866 != null) {
									HookRequest var78 = new HookRequest();
									var78.field9608 = true;
									var78.component = var12;
									var78.mouseX = Statics.field7136.method7254() - var13;
									var78.mouseY = Statics.field7136.method7255() - var14;
									var78.onOp = var12.field1866;
									field9089.method11558(var78);
								}
								if (!var12.field1917 && var23) {
									var12.field1917 = true;
									if (var12.field1867 != null) {
										HookRequest var79 = new HookRequest();
										var79.field9608 = true;
										var79.component = var12;
										var79.mouseX = Statics.field7136.method7254() - var13;
										var79.mouseY = Statics.field7136.method7255() - var14;
										var79.onOp = var12.field1867;
										field9089.method11558(var79);
									}
								}
								if (var12.field1917 && var23 && var12.field1868 != null) {
									HookRequest var80 = new HookRequest();
									var80.field9608 = true;
									var80.component = var12;
									var80.mouseX = Statics.field7136.method7254() - var13;
									var80.mouseY = Statics.field7136.method7255() - var14;
									var80.onOp = var12.field1868;
									field9089.method11558(var80);
								}
								if (var12.field1917 && !var23) {
									var12.field1917 = false;
									if (var12.field1888 != null) {
										HookRequest var81 = new HookRequest();
										var81.field9608 = true;
										var81.component = var12;
										var81.mouseX = Statics.field7136.method7254() - var13;
										var81.mouseY = Statics.field7136.method7255() - var14;
										var81.onOp = var12.field1888;
										field9125.method11558(var81);
									}
								}
								if (var12.field1784 != null) {
									HookRequest var82 = new HookRequest();
									var82.component = var12;
									var82.onOp = var12.field1784;
									field9159.method11558(var82);
								}
								if (var12.field1880 != null && field9036 > var12.field1869) {
									if (var12.field1843 == null || field9036 - var12.field1869 > 32) {
										HookRequest var87 = new HookRequest();
										var87.component = var12;
										var87.onOp = var12.field1880;
										field9089.method11558(var87);
									} else {
										label835: for (int var83 = var12.field1869; var83 < field9036; var83++) {
											int var84 = field9141[var83 & 0x1F];
											for (int var85 = 0; var85 < var12.field1843.length; var85++) {
												if (var12.field1843[var85] == var84) {
													HookRequest var86 = new HookRequest();
													var86.component = var12;
													var86.onOp = var12.field1880;
													field9089.method11558(var86);
													break label835;
												}
											}
										}
									}
									var12.field1869 = field9036;
								}
								if (var12.field1882 != null && field9144 > var12.field1924) {
									if (var12.field1883 == null || field9144 - var12.field1924 > 32) {
										HookRequest var92 = new HookRequest();
										var92.component = var12;
										var92.onOp = var12.field1882;
										field9089.method11558(var92);
									} else {
										label811: for (int var88 = var12.field1924; var88 < field9144; var88++) {
											int var89 = field9143[var88 & 0x1F];
											for (int var90 = 0; var90 < var12.field1883.length; var90++) {
												if (var12.field1883[var90] == var89) {
													HookRequest var91 = new HookRequest();
													var91.component = var12;
													var91.onOp = var12.field1882;
													field9089.method11558(var91);
													break label811;
												}
											}
										}
									}
									var12.field1924 = field9144;
								}
								if (var12.field1874 != null && field9183 > var12.field1920) {
									if (var12.field1875 == null || field9183 - var12.field1920 > 32) {
										HookRequest var97 = new HookRequest();
										var97.component = var12;
										var97.onOp = var12.field1874;
										field9089.method11558(var97);
									} else {
										label787: for (int var93 = var12.field1920; var93 < field9183; var93++) {
											int var94 = field9135[var93 & 0x1F];
											for (int var95 = 0; var95 < var12.field1875.length; var95++) {
												if (var12.field1875[var95] == var94) {
													HookRequest var96 = new HookRequest();
													var96.component = var12;
													var96.onOp = var12.field1874;
													field9089.method11558(var96);
													break label787;
												}
											}
										}
									}
									var12.field1920 = field9183;
								}
								if (var12.field1876 != null && field9158 > var12.field1820) {
									if (var12.field1877 == null || field9158 - var12.field1820 > 32) {
										HookRequest var102 = new HookRequest();
										var102.component = var12;
										var102.onOp = var12.field1876;
										field9089.method11558(var102);
									} else {
										label763: for (int var98 = var12.field1820; var98 < field9158; var98++) {
											int var99 = field9137[var98 & 0x1F];
											for (int var100 = 0; var100 < var12.field1877.length; var100++) {
												if (var12.field1877[var100] == var99) {
													HookRequest var101 = new HookRequest();
													var101.component = var12;
													var101.onOp = var12.field1876;
													field9089.method11558(var101);
													break label763;
												}
											}
										}
									}
									var12.field1820 = field9158;
								}
								if (var12.field1878 != null && field9140 > var12.field1922) {
									if (var12.field1879 == null || field9140 - var12.field1922 > 32) {
										HookRequest var107 = new HookRequest();
										var107.component = var12;
										var107.onOp = var12.field1878;
										field9089.method11558(var107);
									} else {
										label739: for (int var103 = var12.field1922; var103 < field9140; var103++) {
											int var104 = field9139[var103 & 0x1F];
											for (int var105 = 0; var105 < var12.field1879.length; var105++) {
												if (var12.field1879[var105] == var104) {
													HookRequest var106 = new HookRequest();
													var106.component = var12;
													var106.onOp = var12.field1878;
													field9089.method11558(var106);
													break label739;
												}
											}
										}
									}
									var12.field1922 = field9140;
								}
								if (var12.field1884 != null && field9146 > var12.field1925) {
									if (var12.field1885 == null || field9146 - var12.field1925 > 32) {
										HookRequest var112 = new HookRequest();
										var112.component = var12;
										var112.onOp = var12.field1884;
										field9089.method11558(var112);
									} else {
										label715: for (int var108 = var12.field1925; var108 < field9146; var108++) {
											int var109 = field9145[var108 & 0x1F];
											for (int var110 = 0; var110 < var12.field1885.length; var110++) {
												if (var12.field1885[var110] == var109) {
													HookRequest var111 = new HookRequest();
													var111.component = var12;
													var111.onOp = var12.field1884;
													field9089.method11558(var111);
													break label715;
												}
											}
										}
									}
									var12.field1925 = field9146;
								}
								if (field9130 > var12.field1919 && var12.field1890 != null) {
									HookRequest var113 = new HookRequest();
									var113.component = var12;
									var113.onOp = var12.field1890;
									field9089.method11558(var113);
								}
								if (field9148 > var12.field1919 && var12.field1892 != null) {
									HookRequest var114 = new HookRequest();
									var114.component = var12;
									var114.onOp = var12.field1892;
									field9089.method11558(var114);
								}
								if (field9161 > var12.field1919 && var12.field1893 != null) {
									HookRequest var115 = new HookRequest();
									var115.component = var12;
									var115.onOp = var12.field1893;
									field9089.method11558(var115);
								}
								if (field9149 > var12.field1919 && var12.field1758 != null) {
									HookRequest var116 = new HookRequest();
									var116.component = var12;
									var116.onOp = var12.field1758;
									field9089.method11558(var116);
								}
								if (field8917 > var12.field1919 && var12.field1881 != null) {
									HookRequest var117 = new HookRequest();
									var117.component = var12;
									var117.onOp = var12.field1881;
									field9089.method11558(var117);
								}
								if (field9152 > var12.field1919 && var12.field1897 != null) {
									HookRequest var118 = new HookRequest();
									var118.component = var12;
									var118.onOp = var12.field1897;
									field9089.method11558(var118);
								}
								if (field9120 > var12.field1919 && var12.field1896 != null) {
									HookRequest var119 = new HookRequest();
									var119.component = var12;
									var119.onOp = var12.field1896;
									field9089.method11558(var119);
								}
								var12.field1919 = field9132;
								if (var12.field1891 != null) {
									for (int var120 = 0; var120 < field8950; var120++) {
										HookRequest var121 = new HookRequest();
										var121.component = var12;
										var121.key = field8951[var120].method7286();
										var121.keyChar = field8951[var120].method7298();
										var121.onOp = var12.field1891;
										field9089.method11558(var121);
									}
								}
								if (field9040 && var12.field1900 != null) {
									HookRequest var122 = new HookRequest();
									var122.component = var12;
									var122.onOp = var12.field1900;
									field9089.method11558(var122);
								}
							}
							if (var12.type == 5 && var12.field1906 != -1) {
								var12.method3181(Statics.field4678, Statics.field6360).method6366(Statics.field5187, var12.field1929, Statics.field4961.field9657.method15807());
							}
							Statics.method5567(var12);
							if (var12.type == 0) {
								method14330(arg0, arg1, var12.parentLayer, var15, var16, var17, var18, var13 - var12.field1857, var14 - var12.field1739, arg9, arg10);
								if (var12.sortedsubcomponents != null) {
									method14330(arg0, var12.sortedsubcomponents, var12.parentLayer, var15, var16, var17, var18, var13 - var12.field1857, var14 - var12.field1739, arg9, arg10);
								}
								class816 var123 = (class816) openedSubInterfaces.method11923((long) var12.parentLayer);
								if (var123 != null) {
									if (field9163 == class527.field6407 && var123.field9678 == 0 && !class42.field585 && var23 && !field9111) {
										class42.method1401();
									}
									method15857(var123, var123.field9679, var15, var16, var17, var18, var13, var14, arg9, arg10);
								}
							}
						}
					}
				} else if (var15 < var17 && var16 < var18) {
					Statics.method5567(var12);
				}
			}
		}
	}

	@ObfuscatedName("lr.ly(III)V")
	public static final void method6032(int arg0, int arg1) {
		if (class165.openInterface(arg0, null)) {
			method1609(Statics.interfaces[arg0].components, arg1);
		}
	}

	@ObfuscatedName("k.lo([Lew;II)V")
	public static final void method1609(class165[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			class165 var3 = arg0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.sortedsubcomponents != null) {
						method1609(var3.sortedsubcomponents, arg1);
					}
					class816 var4 = (class816) openedSubInterfaces.method11923((long) var3.parentLayer);
					if (var4 != null) {
						method6032(var4.field9679, arg1);
					}
				}
				if (arg1 == 0 && var3.field1898 != null) {
					HookRequest var5 = new HookRequest();
					var5.component = var3;
					var5.onOp = var3.field1898;
					ScriptRunner.runHook(var5);
				}
				if (arg1 == 1 && var3.field1782 != null) {
					if (var3.id >= 0) {
						class165 var6 = class165.method11381(var3.parentLayer);
						if (var6 == null || var6.subcomponents == null || var3.id >= var6.subcomponents.length || var6.subcomponents[var3.id] != var3) {
							continue;
						}
					}
					HookRequest var7 = new HookRequest();
					var7.component = var3;
					var7.onOp = var3.field1782;
					ScriptRunner.runHook(var7);
				}
			}
		}
	}

	@ObfuscatedName("qs.lg(Lew;III)V")
	public static final void method8390(class165 arg0, int arg1, int arg2) {
		if (field9115 != null || class42.field585 || (arg0 == null || !method12723(arg0))) {
			return;
		}
		field9115 = arg0;
		field9116 = method1397(arg0);
		field9160 = arg1;
		field8977 = arg2;
		Statics.field8727 = 0;
		field8991 = false;
	}

	@ObfuscatedName("ow.lu(I)V")
	public static final void method7350() {
		requestRedrawComponent(field9115);
		Statics.field8727++;
		if (field9080 && field9037) {
			int var0 = Statics.field7136.method7254();
			int var1 = Statics.field7136.method7255();
			int var2 = var0 - field9160;
			int var3 = var1 - field8977;
			if (var2 < field9203) {
				var2 = field9203;
			}
			if (field9115.field1863 + var2 > field9203 + field9123) {
				var2 = field9203 + field9123 - field9115.field1863;
			}
			if (var3 < field8942) {
				var3 = field8942;
			}
			if (field9115.field1929 + var3 > field8968 + field8942) {
				var3 = field8968 + field8942 - field9115.field1929;
			}
			int var4;
			int var5;
			if (Statics.field9561 == field9116) {
				var4 = var2;
				var5 = var3;
			} else {
				var4 = field9116.field1857 + (var2 - field9203);
				var5 = field9116.field1739 + (var3 - field8942);
			}
			if (Statics.field7136.method7248()) {
				if (Statics.field8727 > field9115.field1870) {
					int var7 = var2 - field9126;
					int var8 = var3 - field9127;
					if (var7 > field9115.field1848 || var7 < -field9115.field1848 || var8 > field9115.field1848 || var8 < -field9115.field1848) {
						field8991 = true;
					}
				}
				if (field9115.field1750 != null && field8991) {
					HookRequest var9 = new HookRequest();
					var9.component = field9115;
					var9.mouseX = var4;
					var9.mouseY = var5;
					var9.onOp = field9115.field1750;
					ScriptRunner.runHook(var9);
				}
			} else {
				if (field8991) {
					method11223();
					if (field9115.field1871 != null) {
						HookRequest var6 = new HookRequest();
						var6.component = field9115;
						var6.mouseX = var4;
						var6.mouseY = var5;
						var6.drop = field9119;
						var6.onOp = field9115.field1871;
						ScriptRunner.runHook(var6);
					}
					if (field9119 != null && method14332(field9115) != null) {
						method11058(field9115, field9119);
					}
				} else if ((field8933 == 1 || class42.method16114()) && class42.field588 > 2) {
					class42.method13889(field9160 + field9126, field9127 + field8977);
				} else if (class42.method3011()) {
					class42.method13889(field9160 + field9126, field9127 + field8977);
				}
				field9115 = null;
				field9116 = null;
			}
		} else if (Statics.field8727 > 1) {
			field9115 = null;
			field9116 = null;
		}
	}

	@ObfuscatedName("yy.lq(Lew;I)V")
	public static void requestRedrawComponent(class165 arg0) {
		if (field8960 == arg0.field1927) {
			field9204[arg0.field1926] = true;
		}
	}

	@ObfuscatedName("ar.lt(I)V")
	public static void method1703() {
		for (int var0 = 0; var0 < 100; var0++) {
			field9204[var0] = true;
		}
	}

	@ObfuscatedName("q.ln(Lew;I)Lew;")
	public static class165 method1397(class165 arg0) {
		class165 var1 = method14332(arg0);
		if (var1 == null) {
			var1 = arg0.field1759;
		}
		return var1;
	}

	@ObfuscatedName("wb.lw(Lew;B)Z")
	public static boolean method12723(class165 arg0) {
		class785 var1 = method14331(arg0);
		if (var1.method14946() > 0) {
			return true;
		} else if (var1.method14933()) {
			return true;
		} else {
			return arg0.field1759 != null;
		}
	}

	@ObfuscatedName("aep.lc([Ljava/lang/String;S)[Ljava/lang/String;")
	public static final String[] method15472(String[] arg0) {
		String[] var1 = new String[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = var2 + " ";
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = var1[var2] + arg0[var2];
			}
		}
		return var1;
	}

	@ObfuscatedName("lf.ld(I[II)V")
	public static final void method6068(int arg0, int[] arg1) {
		if (!class165.openInterface(arg0, arg1)) {
			return;
		}
		class165[] var2 = Statics.interfaces[arg0].components;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class165 var4 = var2[var3];
			if (var4 != null && var4.field1789 != null) {
				var4.field1789.method11785();
			}
		}
	}

	@ObfuscatedName("aex.ll(IS)V")
	public static final void method15619(int arg0) {
		if (class165.openInterface(arg0, null)) {
			method15148(Statics.interfaces[arg0].components, -1);
		}
	}

	@ObfuscatedName("ado.lm([Lew;II)V")
	public static final void method15148(class165[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			class165 var3 = arg0[var2];
			if (var3 != null && var3.layer == arg1 && !method14315(var3)) {
				if (var3.type == 0) {
					method15148(arg0, var3.parentLayer);
					if (var3.sortedsubcomponents != null) {
						method15148(var3.sortedsubcomponents, var3.parentLayer);
					}
					class816 var4 = (class816) openedSubInterfaces.method11923((long) var3.parentLayer);
					if (var4 != null) {
						method15619(var4.field9679);
					}
				}
				if (var3.type == 6 && var3.field1747 != -1) {
					if (var3.field1789 == null) {
						var3.field1789 = new class873();
						var3.field1789.method11769(var3.field1747);
					}
					if (var3.field1789.method11787(field8931) && var3.field1789.method11784()) {
						var3.field1789.method11785();
					}
				}
			}
		}
	}

	@ObfuscatedName("gs.lj(IB)V")
	public static final void method4113(int arg0) {
		class797.method12174();
		int var1 = Statics.field6667.method4890(arg0).field3310;
		if (var1 == 0) {
			return;
		}
		int var2 = Statics.field2669.field661[arg0];
		if (var1 == 5) {
			field8933 = var2;
		}
		if (var1 == 6) {
			field9107 = var2;
		}
	}

	@ObfuscatedName("rh.lz(ZI)V")
	public static final void method8618(boolean arg0) {
		class792 var1 = class792.method14781(class280.field2906, field8975.field834);
		field8975.method1913(var1);
		for (class816 var2 = (class816) openedSubInterfaces.method11928(); var2 != null; var2 = (class816) openedSubInterfaces.method11929()) {
			if (!var2.method6982()) {
				var2 = (class816) openedSubInterfaces.method11928();
				if (var2 == null) {
					break;
				}
			}
			if (var2.field9678 == 0) {
				method7069(var2, true, arg0);
			}
		}
		if (field9108 != null) {
			requestRedrawComponent(field9108);
			field9108 = null;
		}
	}

	@ObfuscatedName("fx.lx(ILaep;[IZI)Laep;")
	public static final class816 method3589(int arg0, class816 arg1, int[] arg2, boolean arg3) {
		class816 var4 = (class816) openedSubInterfaces.method11923((long) arg0);
		if (var4 != null) {
			method7069(var4, arg1.field9679 != var4.field9679, arg3);
		}
		openedSubInterfaces.pushNode(arg1, (long) arg0);
		method6068(arg1.field9679, arg2);
		class165 var5 = class165.method11381(arg0);
		if (var5 != null) {
			requestRedrawComponent(var5);
		}
		if (field9108 != null) {
			requestRedrawComponent(field9108);
			field9108 = null;
		}
		class42.method8628();
		if (var5 != null) {
			method12722(Statics.interfaces[var5.parentLayer >>> 16], var5, !arg3);
		}
		if (!arg3) {
			ScriptRunner.runOnLoad(arg1.field9679, arg2);
		}
		if (!arg3 && openedTopInterface != -1) {
			method6032(openedTopInterface, 1);
		}
		return arg1;
	}

	@ObfuscatedName("of.lp(Laep;ZZB)V")
	public static final void method7069(class816 arg0, boolean arg1, boolean arg2) {
		int var3 = arg0.field9679;
		int var4 = (int) arg0.field4228;
		arg0.method6979();
		if (arg1) {
			class165.method13890(var3);
		}
		Statics.method8587(var3);
		class165 var5 = class165.method11381(var4);
		if (var5 != null) {
			requestRedrawComponent(var5);
		}
		class42.method8628();
		if (!arg2 && openedTopInterface != -1) {
			method6032(openedTopInterface, 1);
		}
		class566 var6 = new class566(openedSubInterfaces);
		for (class816 var7 = (class816) var6.method11955(); var7 != null; var7 = (class816) var6.next()) {
			if (!var7.method6982()) {
				var7 = (class816) var6.method11955();
				if (var7 == null) {
					break;
				}
			}
			if (var7.field9678 == 3) {
				int var8 = (int) var7.field4228;
				if (var8 >>> 16 == var3) {
					method7069(var7, true, arg2);
				}
			}
		}
	}

	@ObfuscatedName("up.lr(Lew;III)V")
	public static void method11873(class165 arg0, int arg1, int arg2) {
		class163 var3 = arg0.method3124(Statics.field5187);
		if (var3 == null) {
			return;
		}
		Statics.field5187.method659(arg1, arg2, arg0.field1863 + arg1, arg0.field1929 + arg2);
		if (class58.field762 >= 3) {
			Statics.field5187.method684(-16777216, var3.field1730, arg1, arg2);
			return;
		}
		int var4;
		if (Statics.field2671 == 2) {
			var4 = (int) ((double) Statics.field1307.method3791() * 2607.5945876176133D);
		} else {
			var4 = (int) -field9021;
		}
		int var5 = field9087 * 2 + var4 & 0x3FFF;
		int var6 = var5 << 2;
		Statics.field7290.method2506((float) arg0.field1863 / 2.0F + (float) arg1, (float) arg0.field1929 / 2.0F + (float) arg2, 4224, var6, var3.field1730, arg1, arg2);
	}

	@ObfuscatedName("ro.la(Ljava/lang/String;I)I")
	public static final int method8729(String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < field9206; var1++) {
			if (arg0.equalsIgnoreCase(field9209[var1].field649)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("sz.lf(Ljava/lang/String;B)I")
	public static final int method11161(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (int var1 = 0; var1 < field9211; var1++) {
			if (arg0.equalsIgnoreCase(field8999[var1].field639)) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("fp.mx(Ljava/lang/String;B)Z")
	public static boolean method3546(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field9206; var1++) {
			if (arg0.equalsIgnoreCase(field9209[var1].field649)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Statics.field2119.field10040)) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sl.mf(Ljava/lang/String;B)Z")
	public static boolean method11167(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field9211; var1++) {
			class45 var2 = field8999[var1];
			if (arg0.equalsIgnoreCase(var2.field639)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(var2.field638)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("mp.mo(Ljava/lang/String;IB)V")
	public static final void method6257(String arg0, int arg1) {
		class64 var2 = method4104();
		class792 var3 = class792.method14781(class280.field2875, var2.field834);
		var3.field9467.method15308(Statics.method1724(arg0) + 1);
		var3.field9467.method15318(arg1);
		var3.field9467.method15228(arg0);
		var2.method1913(var3);
	}

	@ObfuscatedName("vl.ml(Ljava/lang/String;B)V")
	public static final void method12449(String arg0) {
		if (Statics.field5180 == null) {
			return;
		}
		class64 var1 = method4104();
		class792 var2 = class792.method14781(class280.field2894, var1.field834);
		var2.field9467.method15308(Statics.method1724(arg0));
		var2.field9467.method15228(arg0);
		var1.method1913(var2);
	}

	@ObfuscatedName("gq.mp(Ljava/lang/String;B)V")
	public static final void method3925(String arg0) {
		if (arg0.equals("")) {
			return;
		}
		class64 var1 = method4104();
		class792 var2 = class792.method14781(class280.field2941, var1.field834);
		var2.field9467.method15308(Statics.method1724(arg0));
		var2.field9467.method15228(arg0);
		var1.method1913(var2);
	}

	@ObfuscatedName("gh.mv(B)V")
	public static final void method3979() {
		class64 var0 = method4104();
		class792 var1 = class792.method14781(class280.field2941, var0.field834);
		var1.field9467.method15308(0);
		var0.method1913(var1);
	}

	@ObfuscatedName("wc.mj(ZII)V")
	public static final void method12622(boolean arg0, int arg1) {
		class788 var2 = arg0 ? Statics.field8458 : Statics.field1515;
		if (var2 == null || arg1 < 0 || arg1 >= var2.field9430) {
			return;
		}
		class217 var3 = var2.field9429[arg1];
		if (var3.field2342 != -1) {
			return;
		}
		String var4 = var3.field2343;
		class64 var5 = method4104();
		class792 var6 = class792.method14781(class280.field2858, var5.field834);
		var6.field9467.method15308(Statics.method1724(var4) + 3);
		var6.field9467.method15308(arg0 ? 1 : 0);
		var6.field9467.method15287(arg1);
		var6.field9467.method15228(var4);
		var5.method1913(var6);
	}

	@ObfuscatedName("qx.mn(II)V")
	public static final void method8064(int arg0) {
		if (Statics.field8458 == null || (arg0 < 0 || arg0 >= Statics.field8458.field9430)) {
			return;
		}
		class217 var1 = Statics.field8458.field9429[arg0];
		if (var1.field2342 != -1) {
			return;
		}
		class64 var2 = method4104();
		class792 var3 = class792.method14781(class280.field2864, var2.field834);
		var3.field9467.method15308(Statics.method1724(var1.field2343) + 2);
		var3.field9467.method15287(arg0);
		var3.field9467.method15228(var1.field2343);
		var2.method1913(var3);
	}

	@ObfuscatedName("eg.mz(Ljava/lang/String;I)V")
	public static final void method2940(String arg0) {
		if (arg0 == null) {
			return;
		}
		if (field9206 >= 200 && !field8998 || field9206 >= 200) {
			class175.method1587(4, class588.field6899.method12206(Statics.field2308));
			return;
		}
		String var1 = class625.method4744(arg0);
		if (var1 == null) {
			return;
		}
		for (int var2 = 0; var2 < field9206; var2++) {
			class47 var3 = field9209[var2];
			String var4 = class625.method4744(var3.field649);
			if (var4 != null && var4.equals(var1)) {
				class175.method1587(4, arg0 + class588.field7018.method12206(Statics.field2308));
				return;
			}
			if (var3.field646 != null) {
				String var5 = class625.method4744(var3.field646);
				if (var5 != null && var5.equals(var1)) {
					class175.method1587(4, arg0 + class588.field7018.method12206(Statics.field2308));
					return;
				}
			}
		}
		for (int var6 = 0; var6 < field9211; var6++) {
			class45 var7 = field8999[var6];
			String var8 = class625.method4744(var7.field639);
			if (var8 != null && var8.equals(var1)) {
				class175.method1587(4, class588.field6923.method12206(Statics.field2308) + arg0 + class588.field6990.method12206(Statics.field2308));
				return;
			}
			if (var7.field638 != null) {
				String var9 = class625.method4744(var7.field638);
				if (var9 != null && var9.equals(var1)) {
					class175.method1587(4, class588.field6923.method12206(Statics.field2308) + arg0 + class588.field6990.method12206(Statics.field2308));
					return;
				}
			}
		}
		if (class625.method4744(Statics.field2119.field10040).equals(var1)) {
			class175.method1587(4, class588.field7011.method12206(Statics.field2308));
			return;
		}
		class64 var10 = method4104();
		class792 var11 = class792.method14781(class280.field2887, var10.field834);
		var11.field9467.method15308(Statics.method1724(arg0));
		var11.field9467.method15228(arg0);
		var10.method1913(var11);
	}

	@ObfuscatedName("zd.mk(Ljava/lang/String;ZB)V")
	public static final void method13904(String arg0, boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (field9211 >= 100) {
			class175.method1587(4, class588.field7020.method12206(Statics.field2308));
			return;
		}
		String var2 = class625.method4744(arg0);
		if (var2 == null) {
			return;
		}
		for (int var3 = 0; var3 < field9211; var3++) {
			class45 var4 = field8999[var3];
			String var5 = class625.method4744(var4.field639);
			if (var5 != null && var5.equals(var2)) {
				class175.method1587(4, arg0 + class588.field7010.method12206(Statics.field2308));
				return;
			}
			if (var4.field638 != null) {
				String var6 = class625.method4744(var4.field638);
				if (var6 != null && var6.equals(var2)) {
					class175.method1587(4, arg0 + class588.field7010.method12206(Statics.field2308));
					return;
				}
			}
		}
		for (int var7 = 0; var7 < field9206; var7++) {
			class47 var8 = field9209[var7];
			String var9 = class625.method4744(var8.field649);
			if (var9 != null && var9.equals(var2)) {
				class175.method1587(4, class588.field7021.method12206(Statics.field2308) + arg0 + class588.field7034.method12206(Statics.field2308));
				return;
			}
			if (var8.field646 != null) {
				String var10 = class625.method4744(var8.field646);
				if (var10 != null && var10.equals(var2)) {
					class175.method1587(4, class588.field7021.method12206(Statics.field2308) + arg0 + class588.field7034.method12206(Statics.field2308));
					return;
				}
			}
		}
		if (class625.method4744(Statics.field2119.field10040).equals(var2)) {
			class175.method1587(4, class588.field7012.method12206(Statics.field2308));
			return;
		}
		class64 var11 = method4104();
		class792 var12 = class792.method14781(class280.field2892, var11.field834);
		var12.field9467.method15308(Statics.method1724(arg0) + 1);
		var12.field9467.method15228(arg0);
		var12.field9467.method15308(arg1 ? 1 : 0);
		var11.method1913(var12);
	}

	@ObfuscatedName("client.mi(Lew;)Lace;")
	public static class785 method14331(class165 arg0) {
		class785 var1 = (class785) field9010.method11923(((long) arg0.parentLayer << 32) + (long) arg0.id);
		return var1 == null ? arg0.field1841 : var1;
	}

	@ObfuscatedName("client.mr(Lew;)Lew;")
	public static class165 method14332(class165 arg0) {
		class785 var1 = method14331(arg0);
		if (var1.method14933()) {
			return Statics.field9561;
		}
		int var2 = var1.method14946();
		if (var2 == 0) {
			return null;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			arg0 = method4752(class165.method14993(arg0.parentLayer), arg0);
			if (arg0 == null) {
				return Statics.field9561;
			}
		}
		return arg0;
	}

	@ObfuscatedName("client.mt(Lew;)Z")
	public static boolean method14315(class165 arg0) {
		if (field9111) {
			if (method14331(arg0).field9416 != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.field1807;
	}

	@ObfuscatedName("ak.mb(Lew;IB)I")
	public static int method1956(class165 arg0, int arg1) {
		if (!method14331(arg0).method14948(arg1) && arg0.field1887 == null) {
			return -1;
		} else if (arg0.field1854 == null || arg0.field1854.length <= arg1) {
			return -1;
		} else {
			return arg0.field1854[arg1];
		}
	}

	@ObfuscatedName("abz.ms(Lew;I)Ljava/lang/String;")
	public static String method14722(class165 arg0) {
		if (method14331(arg0).method14928() == 0) {
			return null;
		} else if (arg0.field1914 == null || arg0.field1914.trim().length() == 0) {
			return field9111 ? "Hidden-use" : null;
		} else {
			return arg0.field1914;
		}
	}

	@ObfuscatedName("dc.mg(B)Z")
	public static boolean method2793() {
		field9023++;
		field8978 = true;
		return true;
	}

	@ObfuscatedName("ae.me(I)V")
	public static void method1970() {
		class792 var0 = class792.method14781(class280.field2920, field8975.field834);
		var0.field9467.method15223(field9023);
		field8975.method1913(var0);
	}

	@ObfuscatedName("zp.ma(Ljava/lang/String;ZI)V")
	public static void method13898(String arg0, boolean arg1) {
		method11081(arg0, arg1, -1, -1);
	}

	@ObfuscatedName("n.mm(Ljava/lang/String;ZILjava/lang/String;I)V")
	public static void method1379(String arg0, boolean arg1, int arg2, String arg3) {
		method4602(arg0, arg1, arg2, -1, arg3, true);
	}

	@ObfuscatedName("rq.md(Ljava/lang/String;ZIII)V")
	public static void method11081(String arg0, boolean arg1, int arg2, int arg3) {
		method4602(arg0, arg1, arg2, arg3, null, false);
	}

	@ObfuscatedName("io.mc(Ljava/lang/String;ZIILjava/lang/String;ZI)V")
	public static void method4602(String arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5) {
		String var6 = arg0.toLowerCase();
		short[] var7 = new short[16];
		int var8 = -1;
		String var9 = null;
		if (arg2 != -1) {
			class613 var10 = Statics.field4464.method12600(arg2);
			if (var10 == null || var10.method12586() != arg5) {
				return;
			}
			if (var10.method12586()) {
				var9 = var10.field7288;
			} else {
				var8 = var10.field7287;
			}
		}
		int var11 = 0;
		for (int var12 = 0; var12 < Statics.field3492.field7144; var12++) {
			class592 var13 = Statics.field3492.method12316(var12);
			if ((!arg1 || var13.field7117) && var13.field7108 == -1 && var13.field7064 == -1 && var13.field7123 == -1 && var13.field7060 == 0 && var13.field7125.toLowerCase().indexOf(var6) != -1) {
				if (arg2 != -1) {
					if (arg5) {
						if (!arg4.equals(var13.method12248(arg2, var9))) {
							continue;
						}
					} else if (arg3 != var13.method12250(arg2, var8)) {
						continue;
					}
				}
				if (var11 >= 250) {
					Statics.field1539 = -1;
					Statics.field579 = null;
					return;
				}
				if (var11 >= var7.length) {
					short[] var14 = new short[var7.length * 2];
					for (int var15 = 0; var15 < var11; var15++) {
						var14[var15] = var7[var15];
					}
					var7 = var14;
				}
				var7[var11++] = (short) var12;
			}
		}
		Statics.field579 = var7;
		Statics.field8729 = 0;
		Statics.field1539 = var11;
		String[] var16 = new String[Statics.field1539];
		for (int var17 = 0; var17 < Statics.field1539; var17++) {
			var16[var17] = Statics.field3492.method12316(var7[var17]).field7125;
		}
		class485.method4783(var16, Statics.field579);
	}

	@ObfuscatedName("ud.my(Ljava/lang/String;ZI)V")
	public static void method12143(String arg0, boolean arg1) {
		String var2 = arg0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;
		int var5 = arg1 ? 32768 : 0;
		int var6 = var5 + (arg1 ? Statics.field3779.field6832 : Statics.field3779.field6825);
		for (int var7 = var5; var7 < var6; var7++) {
			class955 var8 = Statics.field3779.method12176(var7);
			if (var8.field10395 && var8.method16750().toLowerCase().indexOf(var2) != -1) {
				if (var4 >= 50) {
					Statics.field1539 = -1;
					Statics.field579 = null;
					return;
				}
				if (var4 >= var3.length) {
					short[] var9 = new short[var3.length * 2];
					for (int var10 = 0; var10 < var4; var10++) {
						var9[var10] = var3[var10];
					}
					var3 = var9;
				}
				var3[var4++] = (short) var7;
			}
		}
		Statics.field579 = var3;
		Statics.field8729 = 0;
		Statics.field1539 = var4;
		String[] var11 = new String[Statics.field1539];
		for (int var12 = 0; var12 < Statics.field1539; var12++) {
			var11[var12] = Statics.field3779.method12176(var3[var12]).method16750();
		}
		class485.method4783(var11, Statics.field579);
	}

	@ObfuscatedName("aam.mu(J)Ljava/lang/String;")
	public static String method14047(long arg0) {
		return class152.method2901(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}

	@ObfuscatedName("px.ng(Ljava/lang/String;I)V")
	public static void method7723(String arg0) {
		field8947 = arg0;
		if (Statics.method5937() == class384.field4118) {
			return;
		}
		try {
			String var1 = Statics.field6387.getParameter(class288.field3245.field3261);
			String var2 = Statics.field6387.getParameter(class288.field3246.field3261);
			String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
			String var4;
			if (arg0.length() == 0) {
				var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var3 + "; Expires=" + method14047(class153.method5554() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Statics.method12166(Statics.field6387, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var6) {
		}
	}

	@ObfuscatedName("qr.ni(I)V")
	public static void method8095() {
		if (Statics.method5937() == class384.field4118) {
			return;
		}
		try {
			String var0 = Statics.field6387.getParameter(class288.field3246.field3261);
			int var1 = (int) (class153.method5554() / 86400000L) - 11745;
			String var2 = "usrdob=" + var1 + "; version=1; path=/; domain=" + var0;
			Statics.method12166(Statics.field6387, "document.cookie=\"" + var2 + "\"");
		} catch (Throwable var4) {
		}
	}

	@ObfuscatedName("to.nf(B)Ljava/lang/String;")
	public static String method11406() {
		String var0 = "www";
		if (Statics.field6683 == class515.field6366) {
			var0 = "www-wtrc";
		} else if (Statics.field6683 == class515.field6362) {
			var0 = "www-wtqa";
		} else if (Statics.field6683 == class515.field6369) {
			var0 = "www-wtwip";
		} else if (Statics.field6683 == class515.field6364) {
			var0 = "www-wti";
		}
		String var1 = "";
		if (field8947 != null) {
			var1 = "/p=" + field8947;
		}
		String var2 = field9163.field6404 + ".com";
		return "http://" + var0 + "." + var2 + "/l=" + Statics.field2308 + "/a=" + field9043 + var1 + "/";
	}

	@ObfuscatedName("nc.nt(IIIIIILjava/lang/String;I)V")
	public static void method6854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
		class764 var7 = new class764();
		var7.field9257 = arg0;
		var7.field9256 = arg1;
		var7.field9255 = arg2;
		var7.field9259 = field9213 + arg4;
		var7.field9260 = arg3 * 4;
		var7.field9261 = arg6;
		var7.field9258 = arg5;
		field9091.method11640(var7);
	}

	@ObfuscatedName("vq.ny(I)V")
	public static void method12288() {
		if (Statics.field6683 != class515.field6363) {
			class284.field3150.method4761();
		}
	}
}
