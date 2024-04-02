package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rq")
public class ObjReference {

	@ObfuscatedName("rq.u")
	public final CoordGrid field5241;

	@ObfuscatedName("rq.j")
	public final int field5242;

	public ObjReference(CoordGrid arg0, int arg1) {
		this.field5241 = arg0;
		this.field5242 = arg1;
	}

	@ObfuscatedName("rq.u(I)Lali;")
	public ObjStackEntity method11076() {
		class774 var1 = (class774) client.field9088.method11923((long) (this.field5241.field4837 << 28 | this.field5241.z << 14 | this.field5241.x));
		if (var1 == null) {
			return null;
		}
		CoordGrid var2 = client.world.method6214();
		int var3 = this.field5241.x - var2.x;
		int var4 = this.field5241.z - var2.z;
		if (var3 >= 0 && var4 >= 0 && var3 < client.world.getSizeX() && var4 < client.world.getSizeZ()) {
			for (class773 var5 = (class773) var1.field9313.method11563(); var5 != null; var5 = (class773) var1.field9313.method11567()) {
				if (this.field5242 == var5.field9311) {
					return (ObjStackEntity) client.world.getScene().method7436(this.field5241.field4837, var3, var4);
				}
			}
		}
		return null;
	}
}
