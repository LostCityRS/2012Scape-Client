package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajq")
public class class966 extends class816 {

	@ObfuscatedName("ajq.m")
	public final class501 field10477;

	public class966(int arg0, int arg1, class501 arg2) {
		super(arg0, arg1);
		this.field10477 = arg2;
	}

	@ObfuscatedName("ajq.u(B)Z")
	public boolean method15469() {
		Location var1 = this.field10477.method8725();
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.runLoc(ClientTriggerType.IF_PROCESS_ACTIVE_LOC, this.field9679, -1, var1);
			return true;
		}
	}
}
