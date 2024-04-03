import deob.ObfuscatedName;

@ObfuscatedName("oe")
public class HeadbarType {

    @ObfuscatedName("oe.u")
    public HeadbarTypeList field4439;

    @ObfuscatedName("oe.a")
    public int field4446 = 255;

    @ObfuscatedName("oe.s")
    public int field4442 = 255;

    @ObfuscatedName("oe.c")
    public int field4443 = -1;

    @ObfuscatedName("oe.m")
    public int field4444 = 1;

    @ObfuscatedName("oe.t")
    public int field4445 = 70;

    @ObfuscatedName("oe.l")
    public int field4441 = -1;

    @ObfuscatedName("oe.f")
    public int field4447 = -1;

    @ObfuscatedName("oe.d")
    public int field4448 = -1;

    @ObfuscatedName("oe.z")
    public int field4449 = -1;

    @ObfuscatedName("oe.u(Laet;S)V")
    public void method7302(Packet arg0) {
        while (true) {
            int var2 = arg0.method15220();
            if (var2 == 0) {
                return;
            }
            this.method7306(arg0, var2);
        }
    }

    @ObfuscatedName("oe.j(Laet;II)V")
    public void method7306(Packet arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method15239();
        } else if (arg1 == 2) {
            this.field4446 = arg0.method15220();
        } else if (arg1 == 3) {
            this.field4442 = arg0.method15220();
        } else if (arg1 == 4) {
            this.field4443 = 0;
        } else if (arg1 == 5) {
            this.field4445 = arg0.method15239();
        } else if (arg1 == 6) {
            arg0.method15220();
        } else if (arg1 == 7) {
            this.field4441 = arg0.method15411();
        } else if (arg1 == 8) {
            this.field4447 = arg0.method15411();
        } else if (arg1 == 9) {
            this.field4448 = arg0.method15411();
        } else if (arg1 == 10) {
            this.field4449 = arg0.method15411();
        } else if (arg1 == 11) {
            this.field4443 = arg0.method15239();
        }
    }

    @ObfuscatedName("oe.a(Lra;I)Lce;")
    public Sprite method7304(RendererToolkit arg0) {
        if (this.field4441 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4441);
        if (var2 == null) {
            this.method7318(arg0);
            var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4441);
        }
        return var2;
    }

    @ObfuscatedName("oe.s(Lra;I)Lce;")
    public Sprite method7305(RendererToolkit arg0) {
        if (this.field4447 < 0) {
            return null;
        }
        Sprite var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4447);
        if (var2 == null) {
            this.method7318(arg0);
            var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4447);
        }
        return var2;
    }

    @ObfuscatedName("oe.c(Lra;I)Lce;")
    public Sprite method7301(RendererToolkit arg0) {
        if (this.field4448 < 0) {
            return this.method7304(arg0);
        }
        Sprite var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4448);
        if (var2 == null) {
            this.method7318(arg0);
            var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4448);
        }
        return var2;
    }

    @ObfuscatedName("oe.m(Lra;I)Lce;")
    public Sprite method7307(RendererToolkit arg0) {
        if (this.field4449 < 0) {
            return this.method7305(arg0);
        }
        Sprite var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4449);
        if (var2 == null) {
            this.method7318(arg0);
            var2 = (Sprite) this.field4439.field4454.method7916((long) this.field4449);
        }
        return var2;
    }

    @ObfuscatedName("oe.t(Lra;B)V")
    public void method7318(RendererToolkit arg0) {
        Js5 var2 = this.field4439.field4451;
        if (this.field4441 >= 0 && this.field4439.field4454.method7916((long) this.field4441) == null && var2.method5630(this.field4441)) {
            SpriteData var3 = SpriteDataProvider.method2598(var2, this.field4441);
            this.field4439.field4454.method7937(arg0.method517(var3, true), (long) this.field4441);
        }
        if (this.field4447 >= 0 && this.field4439.field4454.method7916((long) this.field4447) == null && var2.method5630(this.field4447)) {
            SpriteData var4 = SpriteDataProvider.method2598(var2, this.field4447);
            this.field4439.field4454.method7937(arg0.method517(var4, true), (long) this.field4447);
        }
        if (this.field4448 >= 0 && this.field4439.field4454.method7916((long) this.field4448) == null && var2.method5630(this.field4448)) {
            SpriteData var5 = SpriteDataProvider.method2598(var2, this.field4448);
            this.field4439.field4454.method7937(arg0.method517(var5, true), (long) this.field4448);
        }
        if (this.field4449 >= 0 && this.field4439.field4454.method7916((long) this.field4449) == null && var2.method5630(this.field4449)) {
            SpriteData var6 = SpriteDataProvider.method2598(var2, this.field4449);
            this.field4439.field4454.method7937(arg0.method517(var6, true), (long) this.field4449);
        }
    }
}
