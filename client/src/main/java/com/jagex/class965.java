package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aji")
public class class965 extends class816 {

	@ObfuscatedName("aji.m")
	public final int field10476;

	public class965(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field10476 = arg2;
	}

	@ObfuscatedName("aji.u(B)Z")
	public boolean method15469() {
		class798 var1 = (class798) client.field8964.method11923((long) this.field10476);
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.runPathingEntity(ClientTriggerType.IF_PROCESS_ACTIVE_NPC, this.field9679, -1, (PathingEntity) var1.field9550, this.field10476);
			return true;
		}
	}
}
