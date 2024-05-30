import deob.ObfuscatedName;

@ObfuscatedName("aif")
public class DelayedStateChange extends SecondaryNode {

    @ObfuscatedName("aif.t")
    public int intArg1;

    @ObfuscatedName("aif.l")
    public int intArg2;

    @ObfuscatedName("aif.f")
    public int intArg3;

    @ObfuscatedName("aif.d")
    public String stringArg;

    @ObfuscatedName("aif.as")
    public static SecondaryLinkedList changeQueue = new SecondaryLinkedList();

    @ObfuscatedName("aif.ai")
    public static SecondaryLinkedList eventQueue = new SecondaryLinkedList();

    @ObfuscatedName("aif.ao")
    public static HashTable changes = new HashTable(16);

    public DelayedStateChange(int type, long id) {
        this.key = (long) type << 56 | id;
    }

    @ObfuscatedName("qv.u(IJ)Laif;")
    public static DelayedStateChange create(int type, long id) {
        DelayedStateChange change = (DelayedStateChange) changes.get((long) type << 56 | id);
        if (change == null) {
            change = new DelayedStateChange(type, id);
            changes.put(change, change.key);
        }
        return change;
    }

    @ObfuscatedName("ws.j(I)V")
    public static void method12620() {
        changes.clear();
        eventQueue.clear();
        changeQueue.clear();
    }

    @ObfuscatedName("yw.a(I)Laif;")
    public static DelayedStateChange poll() {
        DelayedStateChange serverChange = (DelayedStateChange) changeQueue.head();
        if (serverChange != null) {
            serverChange.unlink();
            serverChange.unlinkSecondary();
            return serverChange;
        }
        DelayedStateChange clientChange;
        do {
            clientChange = (DelayedStateChange) eventQueue.head();
            if (clientChange == null) {
                return null;
            }
            if (clientChange.getTime() > MonotonicTime.get()) {
                return null;
            }
            clientChange.unlink();
            clientChange.unlinkSecondary();
        } while ((clientChange.secondaryKey & Long.MIN_VALUE) == 0L);
        return clientChange;
    }

    @ObfuscatedName("kw.s(IB)V")
    public static void onVarClientInt(int id) {
        DelayedStateChange change = create(1, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("uu.c(II)V")
    public static void onVarClientString(int id) {
        DelayedStateChange change = create(2, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("gq.m(II)V")
    public static void onComponentText(int id) {
        DelayedStateChange change = create(3, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("n.t(IS)V")
    public static void onComponentClickMask(int id) {
        DelayedStateChange change = create(22, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("pc.f(II)V")
    public static void onComponentModelAnim(int id) {
        DelayedStateChange change = create(5, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("aec.d(II)V")
    public static void onComponentColour(int id) {
        DelayedStateChange change = create(6, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("ee.z(II)V")
    public static void onComponentHide(int id) {
        DelayedStateChange change = create(7, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("rg.n(II)V")
    public static void onComponentAngle(int id) {
        DelayedStateChange change = create(8, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("me.o(II)V")
    public static void onComponentObject(int id) {
        DelayedStateChange change = create(9, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("vj.q(IS)V")
    public static void onComponentModelAngle(int id) {
        DelayedStateChange change = create(10, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("on.x(II)V")
    public static void onComponentPosition(int id) {
        DelayedStateChange change = create(11, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("afw.k(IB)V")
    public static void onComponentScrollPos(int id) {
        DelayedStateChange change = create(12, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("afp.h(IB)V")
    public static void onType14(int id) {
        DelayedStateChange change = create(14, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("tf.y(IB)V")
    public static void onType16(int id) {
        DelayedStateChange change = create(16, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("zg.ay(II)V")
    public static void onType20(int id) {
        DelayedStateChange change = create(20, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("iw.af(II)V")
    public static void onType21(int id) {
        DelayedStateChange change = create(21, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("lb.ar(IB)V")
    public static void onType17(int id) {
        DelayedStateChange change = create(17, id);
        change.enqueueEvent();
    }

    @ObfuscatedName("aaw.an(I)V")
    public static void onMiniMapFlag() {
        DelayedStateChange change = create(15, 0L);
        change.enqueueEvent();
    }

    @ObfuscatedName("ac.ap(III)V")
    public static void onType18(int id, int arg1) {
        DelayedStateChange change = create(18, (long) arg1 << 32 | (long) id);
        change.enqueueEvent();
    }

    @ObfuscatedName("wt.ag(IIB)V")
    public static void onType19(int id, int arg1) {
        DelayedStateChange change = create(19, (long) arg1 << 32 | (long) id);
        change.enqueueEvent();
    }

    @ObfuscatedName("fi.as(III)V")
    public static void setVarClientInt(int id, int value) {
        DelayedStateChange change = create(1, id);
        change.enqueueChange();
        change.intArg1 = value;
    }

    @ObfuscatedName("aaq.ai(ILjava/lang/String;B)V")
    public static void setVarClientString(int id, String value) {
        DelayedStateChange change = create(2, id);
        change.enqueueChange();
        change.stringArg = value;
    }

    @ObfuscatedName("ahs.ao(ILjava/lang/String;B)V")
    public static void setComponentText(int id, String text) {
        DelayedStateChange change = create(3, id);
        change.enqueueChange();
        change.stringArg = text;
    }

    @ObfuscatedName("ei.al(IZI)V")
    public static void setComponentClickMask(int id, boolean arg1) {
        DelayedStateChange change = create(22, id);
        change.enqueueChange();
        change.intArg1 = arg1 ? 1 : 0;
    }

    @ObfuscatedName("er.at(IIIII)V")
    public static void setComponentModel(int id, int type, int modelId, int arg3) {
        DelayedStateChange var4 = create(4, id);
        var4.enqueueChange();
        var4.intArg1 = type;
        var4.intArg2 = modelId;
        var4.intArg3 = arg3;
    }

    @ObfuscatedName("ae.ax(IIB)V")
    public static void setComponentAnim(int id, int seqId) {
        DelayedStateChange change = create(5, id);
        change.enqueueChange();
        change.intArg1 = seqId;
    }

    @ObfuscatedName("tg.aw(III)V")
    public static void setComponentColour(int id, int color) {
        DelayedStateChange change = create(6, id);
        change.enqueueChange();
        change.intArg1 = color;
    }

    @ObfuscatedName("ow.aa(III)V")
    public static void setComponentHide(int id, int hidden) {
        DelayedStateChange change = create(7, id);
        change.enqueueChange();
        change.intArg1 = hidden;
    }

    @ObfuscatedName("fy.am(IIIIB)V")
    public static void setComponentModelAngle(int id, int xAngle, int yAngle, int zoom) {
        DelayedStateChange change = create(8, id);
        change.enqueueChange();
        change.intArg1 = xAngle;
        change.intArg2 = yAngle;
        change.intArg3 = zoom;
    }

    @ObfuscatedName("agz.ad(IIIB)V")
    public static void setComponentObject(int id, int objId, int count) {
        DelayedStateChange change = create(9, id);
        change.enqueueChange();
        change.intArg1 = objId;
        change.intArg2 = count;
    }

    @ObfuscatedName("wl.az(IIIII)V")
    public static void setComponentModelOffset(int id, int xOffset2d, int yOffset2d, int zAngle2d) {
        DelayedStateChange var4 = create(10, id);
        var4.enqueueChange();
        var4.intArg1 = xOffset2d;
        var4.intArg2 = yOffset2d;
        var4.intArg3 = zAngle2d;
    }

    @ObfuscatedName("mv.ak(IIII)V")
    public static void setComponentPosition(int id, int x, int y) {
        DelayedStateChange var3 = create(11, id);
        var3.enqueueChange();
        var3.intArg1 = x;
        var3.intArg2 = y;
    }

    @ObfuscatedName("go.av(III)V")
    public static void setType12(int id, int arg1) {
        DelayedStateChange change = create(12, (long) id);
        change.enqueueChange();
        change.intArg1 = arg1;
    }

    @ObfuscatedName("on.aj(III)V")
    public static void setType13(int id, int arg1) {
        DelayedStateChange change = create(13, (long) id);
        change.enqueueChange();
        change.intArg1 = arg1;
    }

    @ObfuscatedName("uq.ah(III)V")
    public static void setType14(int id, int arg1) {
        DelayedStateChange change = create(14, id);
        change.enqueueChange();
        change.intArg1 = arg1;
    }

    @ObfuscatedName("y.au(III)V")
    public static void setType16(int id, int arg1) {
        DelayedStateChange change = create(16, id);
        change.enqueueChange();
        change.intArg1 = arg1;
    }

    @ObfuscatedName("afj.ae(IZI)V")
    public static void setType21(int id, boolean arg1) {
        DelayedStateChange change = create(21, id);
        change.enqueueChange();
        change.intArg1 = arg1 ? 1 : 0;
    }

    @ObfuscatedName("xx.ac(III)V")
    public static void setType17(int id, int arg1) {
        DelayedStateChange change = create(17, id);
        change.enqueueChange();
        change.intArg1 = arg1;
    }

    @ObfuscatedName("eo.aq(III)V")
    public static void setMiniMapFlag(int arg0, int arg1) {
        DelayedStateChange change = create(15, 0L);
        change.enqueueChange();
        change.intArg1 = arg0;
        change.intArg2 = arg1;
    }

    @ObfuscatedName("cd.ab(IIIII)V")
    public static void setType18(int id, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = create(18, (long) arg1 << 32 | (long) id);
        var4.enqueueChange();
        var4.intArg1 = arg2;
        var4.intArg2 = arg3;
    }

    @ObfuscatedName("adt.bq(IIIII)V")
    public static void setType19(int id, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = create(19, (long) arg1 << 32 | (long) id);
        var4.enqueueChange();
        var4.intArg1 = arg2;
        var4.intArg2 = arg3;
    }

    @ObfuscatedName("aif.bz(I)V")
    public void enqueueEvent() {
        this.secondaryKey = this.secondaryKey & Long.MIN_VALUE | MonotonicTime.get() + 500L;
        eventQueue.addFirst(this);
    }

    @ObfuscatedName("aif.bv(I)V")
    public void enqueueChange() {
        this.secondaryKey |= Long.MIN_VALUE;
        if (this.getTime() == 0L) {
            changeQueue.addFirst(this);
        }
    }

    @ObfuscatedName("aif.bj(I)I")
    public int getType() {
        return (int) (this.key >>> 56 & 0xFFL);
    }

    @ObfuscatedName("aif.bf(I)J")
    public long getId() {
        return this.key & 0xFFFFFFFFFFFFFFL;
    }

    @ObfuscatedName("aif.bt(I)J")
    public long getTime() {
        return this.secondaryKey & Long.MAX_VALUE;
    }
}
