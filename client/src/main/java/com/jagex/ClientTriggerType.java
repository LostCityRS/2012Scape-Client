package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wy")
public class ClientTriggerType implements TriggerType {

	@ObfuscatedName("wy.u")
	public static final ClientTriggerType OPWORLDMAPELEMENT1 = new ClientTriggerType("", 10);

	@ObfuscatedName("wy.j")
	public static final ClientTriggerType OPWORLDMAPELEMENT2 = new ClientTriggerType("", 11);

	@ObfuscatedName("wy.a")
	public static final ClientTriggerType OPWORLDMAPELEMENT3 = new ClientTriggerType("", 12);

	@ObfuscatedName("wy.s")
	public static final ClientTriggerType OPWORLDMAPELEMENT4 = new ClientTriggerType("", 13);

	@ObfuscatedName("wy.c")
	public static final ClientTriggerType OPWORLDMAPELEMENT5 = new ClientTriggerType("", 14);

	@ObfuscatedName("wy.m")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSEOVER = new ClientTriggerType("", 15);

	@ObfuscatedName("wy.t")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSELEAVE = new ClientTriggerType("", 16);

	@ObfuscatedName("wy.l")
	public static final ClientTriggerType WORLDMAPELEMENTMOUSEREPEAT = new ClientTriggerType("", 17);

	@ObfuscatedName("wy.f")
	public static final ClientTriggerType VIDEO_END = new ClientTriggerType("", 18);

	@ObfuscatedName("wy.d")
	public static final ClientTriggerType JCOINS_UPDATED = new ClientTriggerType("", 19);

	@ObfuscatedName("wy.z")
	public static final ClientTriggerType CUTSCENE_SUBTITLE = new ClientTriggerType("", 20);

	@ObfuscatedName("wy.n")
	public static final ClientTriggerType LOYALTY_UPDATED = new ClientTriggerType("", 21);

	@ObfuscatedName("wy.o")
	public static final ClientTriggerType PROCESS_NPC = new ClientTriggerType("", 22);

	@ObfuscatedName("wy.q")
	public static final ClientTriggerType PROCESS_PLAYER = new ClientTriggerType("", 23);

	@ObfuscatedName("wy.p")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_NPC = new ClientTriggerType("", 24);

	@ObfuscatedName("wy.w")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_PLAYER = new ClientTriggerType("", 25);

	@ObfuscatedName("wy.b")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_LOC = new ClientTriggerType("", 26);

	@ObfuscatedName("wy.x")
	public static final ClientTriggerType IF_PROCESS_ACTIVE_OBJ = new ClientTriggerType("", 27);

	@ObfuscatedName("wy.i")
	public static final ClientTriggerType CUTSCENE_END = new ClientTriggerType("", 28);

	@ObfuscatedName("wy.v")
	public static final ClientTriggerType PROC = new ClientTriggerType("", 73);

	@ObfuscatedName("wy.k")
	public static final ClientTriggerType CLIENTSCRIPT = new ClientTriggerType("", 76);

	@ObfuscatedName("wy.h")
	public final int id;

	public ClientTriggerType(String name, int id) {
		this.id = id;
	}
}
