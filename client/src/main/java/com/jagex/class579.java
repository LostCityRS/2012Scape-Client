package com.jagex;

import deob.ObfuscatedName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ud")
public class class579 {

	@ObfuscatedName("ud.u")
	public char field6807;

	@ObfuscatedName("ud.j")
	public char field6806;

	@ObfuscatedName("ud.a")
	public String field6808 = "null";

	@ObfuscatedName("ud.s")
	public int field6809;

	@ObfuscatedName("ud.c")
	public Map field6810;

	@ObfuscatedName("ud.m")
	public Object[] field6811;

	@ObfuscatedName("ud.t")
	public int field6812 = 0;

	@ObfuscatedName("ud.l")
	public HashMap field6813;

	@ObfuscatedName("ud.u(Laet;I)V")
	public void method12121(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method12122(arg0, var2);
		}
	}

	@ObfuscatedName("ud.j(Laet;II)V")
	public void method12122(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field6807 = class524.method16898(arg0.method15238());
		} else if (arg1 == 2) {
			this.field6806 = class524.method16898(arg0.method15238());
		} else if (arg1 == 3) {
			this.field6808 = arg0.method15337();
		} else if (arg1 == 4) {
			this.field6809 = arg0.method15379();
		} else if (arg1 == 5 || arg1 == 6) {
			this.field6812 = arg0.method15239();
			this.field6810 = new HashMap(this.field6812);
			for (int var6 = 0; var6 < this.field6812; var6++) {
				int var7 = arg0.method15379();
				Object var8;
				if (arg1 == 5) {
					var8 = arg0.method15337();
				} else {
					var8 = Integer.valueOf(arg0.method15379());
				}
				this.field6810.put(Integer.valueOf(var7), var8);
			}
		} else if (arg1 == 7 || arg1 == 8) {
			int var3 = arg0.method15239();
			this.field6812 = arg0.method15239();
			this.field6811 = new Object[var3];
			for (int var4 = 0; var4 < this.field6812; var4++) {
				int var5 = arg0.method15239();
				if (arg1 == 7) {
					this.field6811[var5] = arg0.method15337();
				} else {
					this.field6811[var5] = Integer.valueOf(arg0.method15379());
				}
			}
		}
	}

	@ObfuscatedName("ud.a(II)I")
	public int method12123(int arg0) {
		Object var2 = this.method12125(arg0);
		return var2 == null ? this.field6809 : (Integer) var2;
	}

	@ObfuscatedName("ud.s(II)Ljava/lang/String;")
	public String method12120(int arg0) {
		Object var2 = this.method12125(arg0);
		return var2 == null ? this.field6808 : (String) var2;
	}

	@ObfuscatedName("ud.c(II)Ljava/lang/Object;")
	public Object method12125(int arg0) {
		if (this.field6811 == null) {
			return this.field6810 == null ? null : this.field6810.get(Integer.valueOf(arg0));
		} else if (arg0 >= 0 && arg0 < this.field6811.length) {
			return this.field6811[arg0];
		} else {
			return null;
		}
	}

	@ObfuscatedName("ud.m(Ljava/lang/Object;I)Z")
	public boolean method12127(Object arg0) {
		if (this.field6812 == 0) {
			return false;
		} else {
			if (this.field6813 == null) {
				this.method12129();
			}
			return this.field6813.containsKey(arg0);
		}
	}

	@ObfuscatedName("ud.t(Ljava/lang/Object;I)[I")
	public int[] method12141(Object arg0) {
		if (this.field6812 == 0) {
			return null;
		} else {
			if (this.field6813 == null) {
				this.method12129();
			}
			return (int[]) this.field6813.get(arg0);
		}
	}

	@ObfuscatedName("ud.l(B)I")
	public int method12128() {
		return this.field6812;
	}

	@ObfuscatedName("ud.f(B)V")
	public void method12129() {
		HashMap var1 = new HashMap();
		if (this.field6811 == null) {
			if (this.field6810 == null) {
				throw new IllegalStateException();
			}
			Iterator var5 = this.field6810.entrySet().iterator();
			while (var5.hasNext()) {
				Entry var6 = (Entry) var5.next();
				Object var7 = var6.getValue();
				List var8 = (List) var1.get(var7);
				if (var8 == null) {
					var8 = new LinkedList();
					var1.put(var7, var8);
				}
				var8.add(var6.getKey());
			}
		} else {
			for (int var2 = 0; var2 < this.field6811.length; var2++) {
				if (this.field6811[var2] != null) {
					Object var3 = this.field6811[var2];
					List var4 = (List) var1.get(var3);
					if (var4 == null) {
						var4 = new LinkedList();
						var1.put(var3, var4);
					}
					var4.add(Integer.valueOf(var2));
				}
			}
		}
		this.field6813 = new HashMap();
		Iterator var9 = var1.entrySet().iterator();
		while (var9.hasNext()) {
			Entry var10 = (Entry) var9.next();
			List var11 = (List) var10.getValue();
			int[] var12 = new int[var11.size()];
			int var13 = 0;
			Iterator var14 = var11.iterator();
			while (var14.hasNext()) {
				Integer var15 = (Integer) var14.next();
				var12[var13++] = var15;
			}
			if (this.field6811 == null) {
				Arrays.sort(var12);
			}
			this.field6813.put(var10.getKey(), var12);
		}
	}
}
