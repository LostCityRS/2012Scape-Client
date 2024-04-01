package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajd")
public class class967 extends class816 {

	@ObfuscatedName("ajd.m")
	public final int field10478;

	public class967(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field10478 = arg2;
	}

	@ObfuscatedName("ajd.u(B)Z")
	public boolean method15469() {
		class902 var1 = client.field9070[this.field10478];
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.runPathingEntity(ClientTriggerType.IF_PROCESS_ACTIVE_PLAYER, this.field9679, -1, var1, this.field10478);
			return true;
		}
	}
}
