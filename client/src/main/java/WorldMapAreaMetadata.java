import deob.ObfuscatedName;

@ObfuscatedName("ajo")
public class WorldMapAreaMetadata extends SecondaryNode {

    @ObfuscatedName("ajo.t")
    public int id;

    @ObfuscatedName("ajo.l")
    public String debugname;

    @ObfuscatedName("ajo.f")
    public String field10372;

    @ObfuscatedName("ajo.d")
    public IterableQueue field10363;

    @ObfuscatedName("ajo.z")
    public int field10365;

    @ObfuscatedName("ajo.n")
    public int field10366 = -1;

    @ObfuscatedName("ajo.o")
    public int zoom = -1;

    @ObfuscatedName("ajo.q")
    public int displayMinX = 12800;

    @ObfuscatedName("ajo.p")
    public int displayMaxX = 0;

    @ObfuscatedName("ajo.w")
    public int displayMinZ = 12800;

    @ObfuscatedName("ajo.b")
    public int displayMaxZ = 0;

    @ObfuscatedName("ajo.x")
    public boolean field10361 = true;

    public WorldMapAreaMetadata(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.id = arg0;
        this.debugname = arg1;
        this.field10372 = arg2;
        this.field10365 = arg3;
        this.field10366 = arg4;
        this.field10361 = arg5;
        this.zoom = arg6;
        if (this.zoom == 255) {
            this.zoom = 0;
        }
        BuildAreaSize.forId(arg7);
        this.field10363 = new IterableQueue();
    }

    @ObfuscatedName("ajo.u(III)Z")
    public boolean method16717(int arg0, int arg1) {
        for (WorldMapSubarea var3 = (WorldMapSubarea) this.field10363.last(); var3 != null; var3 = (WorldMapSubarea) this.field10363.prev()) {
            if (var3.method15167(arg0, arg1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ajo.j(II[II)Z")
    public boolean getSourceCoord(int arg0, int arg1, int[] arg2) {
        for (WorldMapSubarea var4 = (WorldMapSubarea) this.field10363.last(); var4 != null; var4 = (WorldMapSubarea) this.field10363.prev()) {
            if (var4.method15168(arg0, arg1)) {
                var4.method15169(arg0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ajo.a(II[II)Z")
    public boolean method16708(int arg0, int arg1, int[] arg2) {
        for (WorldMapSubarea var4 = (WorldMapSubarea) this.field10363.last(); var4 != null; var4 = (WorldMapSubarea) this.field10363.prev()) {
            if (var4.method15167(arg0, arg1)) {
                var4.method15170(arg0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ajo.s(III[IB)Z")
    public boolean getDisplayCoord(int arg0, int arg1, int arg2, int[] arg3) {
        for (WorldMapSubarea var5 = (WorldMapSubarea) this.field10363.last(); var5 != null; var5 = (WorldMapSubarea) this.field10363.prev()) {
            if (var5.method15166(arg0, arg1, arg2)) {
                var5.method15170(arg1, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ajo.c(B)V")
    public void method16710() {
        this.displayMinX = 12800;
        this.displayMaxX = 0;
        this.displayMinZ = 12800;
        this.displayMaxZ = 0;
        for (WorldMapSubarea var1 = (WorldMapSubarea) this.field10363.last(); var1 != null; var1 = (WorldMapSubarea) this.field10363.prev()) {
            if (var1.field9576 < this.displayMinX) {
                this.displayMinX = var1.field9576;
            }
            if (var1.field9575 > this.displayMaxX) {
                this.displayMaxX = var1.field9575;
            }
            if (var1.field9577 < this.displayMinZ) {
                this.displayMinZ = var1.field9577;
            }
            if (var1.field9579 > this.displayMaxZ) {
                this.displayMaxZ = var1.field9579;
            }
        }
    }

    @ObfuscatedName("yt.m(Lls;III)Lajo;")
    public static WorldMapAreaMetadata method13263(Js5 arg0, int arg1, int arg2) {
        Packet var3 = new Packet(arg0.method5627(arg1, arg2));
        WorldMapAreaMetadata var4 = new WorldMapAreaMetadata(arg2, var3.gjstr(), var3.gjstr(), var3.g4s(), var3.g4s(), var3.g1() == 1, var3.g1(), var3.g1());
        int var5 = var3.g1();
        for (int var6 = 0; var6 < var5; var6++) {
            var4.field10363.addFirst(new WorldMapSubarea(var3.g1(), var3.g2(), var3.g2(), var3.g2(), var3.g2(), var3.g2(), var3.g2(), var3.g2(), var3.g2()));
        }
        var4.method16710();
        return var4;
    }
}
