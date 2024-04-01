package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ff")
public class BuildAreaSize {

	@ObfuscatedName("ff.u")
	public static final BuildAreaSize field2139 = new BuildAreaSize(0, 104);

	@ObfuscatedName("ff.j")
	public static final BuildAreaSize field2141 = new BuildAreaSize(1, 120);

	@ObfuscatedName("ff.a")
	public static final BuildAreaSize field2140 = new BuildAreaSize(2, 136);

	@ObfuscatedName("ff.s")
	public static final BuildAreaSize field2138 = new BuildAreaSize(3, 168);

	@ObfuscatedName("ff.c")
	public static final BuildAreaSize field2142 = new BuildAreaSize(4, 72);

	@ObfuscatedName("ff.m")
	public final int id;

	@ObfuscatedName("ff.t")
	public final int size;

	@ObfuscatedName("em.u(B)[Lff;")
	public static BuildAreaSize[] values() {
		return new BuildAreaSize[] { field2139, field2142, field2141, field2140, field2138 };
	}

	public BuildAreaSize(int id, int size) {
		this.id = id;
		this.size = size;
	}

	@ObfuscatedName("cj.j(II)Lff;")
	public static BuildAreaSize get(int id) {
		BuildAreaSize[] all = values();
		for (int i = 0; i < all.length; i++) {
			BuildAreaSize buildArea = all[i];
			if (buildArea.id == id) {
				return buildArea;
			}
		}
		return null;
	}
}
