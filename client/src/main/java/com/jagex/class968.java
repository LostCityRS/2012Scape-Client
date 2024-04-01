package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajh")
public class class968 extends class816 {

	@ObfuscatedName("ajh.m")
	public final ObjReference field10479;

	public class968(int arg0, int arg1, ObjReference arg2) {
		super(arg0, arg1);
		this.field10479 = arg2;
	}

	@ObfuscatedName("ajh.u(B)Z")
	public boolean method15469() {
		ObjStackEntity var1 = this.field10479.method11076();
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.runObj(ClientTriggerType.IF_PROCESS_ACTIVE_OBJ, this.field9679, -1, this.field10479, var1);
			return true;
		}
	}
}
