package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rn")
public class ClientScriptState {

	@ObfuscatedName("rn.u")
	public int[] intLocals;

	@ObfuscatedName("rn.j")
	public Object[] objectLocals;

	@ObfuscatedName("rn.a")
	public long[] longLocals;

	@ObfuscatedName("rn.s")
	public boolean secondary;

	@ObfuscatedName("rn.c")
	public int[] field5237 = new int[5];

	@ObfuscatedName("rn.m")
	public int[][] field5224 = new int[5][5000];

	@ObfuscatedName("rn.t")
	public int[] intStack = new int[1000];

	@ObfuscatedName("rn.l")
	public int isp = 0;

	@ObfuscatedName("rn.f")
	public Object[] objectStack = new Object[1000];

	@ObfuscatedName("rn.d")
	public int osp = 0;

	@ObfuscatedName("rn.z")
	public long[] longStack = new long[1000];

	@ObfuscatedName("rn.n")
	public int lsp = 0;

	@ObfuscatedName("rn.o")
	public int fp = 0;

	@ObfuscatedName("rn.q")
	public ScriptFrame[] frames = new ScriptFrame[50];

	@ObfuscatedName("rn.p")
	public class504 activeComponent = new class504();

	@ObfuscatedName("rn.w")
	public class504 activeComponent2 = new class504();

	@ObfuscatedName("rn.b")
	public class270 field5213;

	@ObfuscatedName("rn.x")
	public class218 field5226;

	@ObfuscatedName("rn.i")
	public class788 field5217;

	@ObfuscatedName("rn.v")
	public PathingEntity activeEntity;

	@ObfuscatedName("rn.k")
	public Location activeLoc;

	@ObfuscatedName("rn.h")
	public ObjStackEntity activeObj;

	@ObfuscatedName("rn.r")
	public int nestedCount = 0;

	@ObfuscatedName("rn.g")
	public int field5232;

	@ObfuscatedName("rn.y")
	public class53 field5233;

	@ObfuscatedName("rn.e")
	public int[] intOperands;

	@ObfuscatedName("rn.ay")
	public ClientScriptCommand[] instructions;

	@ObfuscatedName("rn.af")
	public int pc = -1;

	@ObfuscatedName("rn.ar")
	public ClientScript script;
}
