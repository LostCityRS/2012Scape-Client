import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.List;

@ObfuscatedName("w")
public class MiniMenu {

    @ObfuscatedName("w.s")
    public static int field582 = 16;

    @ObfuscatedName("w.t")
    public static boolean open = false;

    @ObfuscatedName("w.l")
    public static boolean field586 = false;

    @ObfuscatedName("w.f")
    public static MiniMenuSubMenu submenu = null;

    @ObfuscatedName("w.o")
    public static int field602 = 0;

    @ObfuscatedName("w.x")
    public static int length = 0;

    @ObfuscatedName("w.i")
    public static int field594 = 0;

    @ObfuscatedName("w.v")
    public static LinkedList entries = new LinkedList();

    @ObfuscatedName("w.k")
    public static HashTable field609 = new HashTable(16);

    @ObfuscatedName("w.h")
    public static SecondaryLinkedList submenus = new SecondaryLinkedList();

    @ObfuscatedName("w.r")
    public static LinkedList field598 = new LinkedList();

    @ObfuscatedName("w.g")
    public static LinkedList field599 = new LinkedList();

    @ObfuscatedName("w.y")
    public static SoftLruHashTable field600 = new SoftLruHashTable(30);

    @ObfuscatedName("w.ai")
    public static Component mouseOverTextComponent = null;

    @ObfuscatedName("w.ao")
    public static int mouseOverTextX = -1;

    @ObfuscatedName("w.al")
    public static int mouseOverTextY = -1;

    @ObfuscatedName("w.at")
    public static int field606 = -1;

    @ObfuscatedName("w.ax")
    public static int field607 = -1;

    @ObfuscatedName("w.aw")
    public static int viewportWidth = 0;

    @ObfuscatedName("w.aa")
    public static int viewportHeight = 0;

    @ObfuscatedName("w.am")
    public static Matrix4x4 field610 = null;

    @ObfuscatedName("w.ad")
    public static Matrix4x4 field596 = new Matrix4x4();

    @ObfuscatedName("w.az")
    public static Matrix4x3 field612 = new Matrix4x3();

    @ObfuscatedName("w.ak")
    public static boolean formatted = false;

    @ObfuscatedName("w.br")
    public static int field615 = 0;

    @ObfuscatedName("w.bi")
    public static int subMenuMinLength = -1;

    @ObfuscatedName("w.bx")
    public static SoftLruHashTable field620 = new SoftLruHashTable(8);

    @ObfuscatedName("w.bo")
    public static float[] field618 = new float[4];

    public MiniMenu() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.u(I)Z")
    public static boolean method3496() {
        return testBinding(Statics.field1736.field5129);
    }

    @ObfuscatedName("xb.j(I)Z")
    public static boolean method12751() {
        return testBinding(Statics.field1736.field5125);
    }

    @ObfuscatedName("fk.s(Lpf;B)Z")
    public static boolean testBinding(KeyHeldBinding arg0) {
        return testBinding(arg0, null);
    }

    @ObfuscatedName("cc.c(Lpr;Ladv;I)Z")
    public static boolean testBinding(Binding arg0, BasicMouseEvent arg1) {
        return arg0 != null && arg0.test(arg1, client.keyboardEvents, client.field8953, Statics.keyboard);
    }

    @ObfuscatedName("ey.m(S)V")
    public static void method3475() {
        Statics.field7187 = new MiniMenuEntry(LocalisedText.MINIMENU_CANCEL.get(Statics.language), "", client.defaultCursor, 1006, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @ObfuscatedName("fc.t(I)V")
    public static void update() {
        if (client.cutsceneId >= 0) {
            return;
        }
        FontMetrics var0 = method8078();
        if (!open) {
            field586 = subMenuMinLength != -1 && length >= subMenuMinLength || (formatted ? 26 : 22) + length * field582 > Statics.canvasHei;
        }
        field598.clearBridged();
        field599.clearBridged();
        for (MiniMenuEntry var1 = (MiniMenuEntry) entries.head(); var1 != null; var1 = (MiniMenuEntry) entries.next()) {
            int var2 = var1.opcode;
            if (var2 < 1000) {
                var1.unlink();
                if (var2 == 59 || var2 == 2 || var2 == 8 || var2 == 17 || var2 == 15 || var2 == 16 || var2 == 58) {
                    field599.addTail(var1);
                } else {
                    field598.addTail(var1);
                }
            }
        }
        field598.method11601(entries);
        field599.method11601(entries);
        if (length > 1) {
            if (method12751() && length > 2) {
                Statics.field6655 = (MiniMenuEntry) entries.sentinel.prev.prev;
            } else {
                Statics.field6655 = (MiniMenuEntry) entries.sentinel.prev;
            }
            Statics.field2654 = (MiniMenuEntry) entries.sentinel.prev;
            if (length > 2) {
                Statics.field627 = (MiniMenuEntry) Statics.field2654.prev;
            } else {
                Statics.field627 = null;
            }
        } else {
            Statics.field6655 = null;
            Statics.field2654 = null;
            Statics.field627 = null;
        }
        BasicMouseEvent var3 = (BasicMouseEvent) client.field9136.head();
        int var4;
        int var5;
        if (var3 == null) {
            var4 = Statics.mouse.getX();
            var5 = Statics.mouse.getY();
        } else {
            var4 = var3.getX();
            var5 = var3.getY();
        }
        if (!open) {
            boolean var36 = testBinding(Statics.field1736.field5120, var3);
            boolean var37 = testBinding(Statics.field1736.field5121, var3);
            boolean var38 = testBinding(Statics.field1736.field5122, var3);
            if ((var36 || var37) && (client.field8933 == 1 && length > 2 || method16114())) {
                var38 = true;
            }
            if (var38 && length > 0) {
                if (client.dragComponent == null && client.field9150 == 0) {
                    Statics.open(var4, var5);
                } else {
                    field602 = 2;
                }
            } else if (var37) {
                if (Statics.field627 != null) {
                    Statics.handleEntryClicked(Statics.field627, var4, var5);
                }
            } else if (var36) {
                if (Statics.field6655 != null) {
                    boolean var39 = client.dragComponent != null || client.field9150 > 0;
                    if (var39) {
                        field602 = 1;
                        Statics.field5136 = Statics.field6655;
                    } else {
                        Statics.handleEntryClicked(Statics.field6655, var4, var5);
                    }
                } else if (client.targetModeActive) {
                    client.cancelTargetMode();
                }
            }
            if (client.dragComponent == null && client.field9150 == 0) {
                field602 = 0;
                Statics.field5136 = null;
            }
        } else if (!testBinding(Statics.field1736.field5123, var3)) {
            boolean var27 = false;
            if (submenu != null) {
                if (var4 >= Statics.field384 - 10 && var4 <= Statics.field603 + Statics.field384 + 10 && var5 >= Statics.field9294 - 10 && var5 <= Statics.field9294 + Statics.field567 + 10) {
                    var27 = true;
                } else {
                    closeSubmenu();
                }
            }
            if (!var27) {
                if (var4 < Statics.field4756 - 10 || var4 > Statics.field4756 + Statics.field1571 + 10 || var5 < Statics.field2325 - 10 || var5 > Statics.field611 + Statics.field2325 + 10) {
                    close();
                } else if (field586) {
                    int var28 = -1;
                    int var29 = -1;
                    for (int var30 = 0; var30 < field594; var30++) {
                        if (formatted) {
                            int var31 = field582 * var30 + var0.field7176 + Statics.field2325 + 20 + 1;
                            if (var5 > var31 - var0.field7176 - 1 && var5 < var0.field7177 + var31) {
                                var28 = var30;
                                var29 = var31 - var0.field7176 - 1;
                                break;
                            }
                        } else {
                            int var32 = field582 * var30 + Statics.field2325 + 31;
                            if (var5 > var32 - 13 && var5 < var32 + 3) {
                                var28 = var30;
                                var29 = var32 - 13;
                                break;
                            }
                        }
                    }
                    if (var28 != -1) {
                        int var33 = 0;
                        SecondaryLinkedListIterator var34 = new SecondaryLinkedListIterator(submenus);
                        for (MiniMenuSubMenu var35 = (MiniMenuSubMenu) var34.method11715(); var35 != null; var35 = (MiniMenuSubMenu) var34.next()) {
                            if (var28 == var33) {
                                if (var35.size > 1) {
                                    method1672(var35, var29);
                                }
                                break;
                            }
                            var33++;
                        }
                    }
                }
            }
        } else if (submenu != null && var4 >= Statics.field384 && var4 <= Statics.field603 + Statics.field384 && var5 >= Statics.field9294 && var5 <= Statics.field9294 + Statics.field567) {
            int var6 = -1;
            for (int var7 = 0; var7 < submenu.size; var7++) {
                if (formatted) {
                    int var8 = field582 * var7 + var0.field7176 + Statics.field9294 + 20 + 1;
                    if (var5 > var8 - var0.field7176 - 1 && var5 < var0.field7177 + var8) {
                        var6 = var7;
                    }
                } else {
                    int var9 = field582 * var7 + Statics.field9294 + 31;
                    if (var5 > var9 - 13 && var5 < var9 + 3) {
                        var6 = var7;
                    }
                }
            }
            if (var6 != -1) {
                int var10 = 0;
                SecondaryLinkedListIterator var11 = new SecondaryLinkedListIterator(submenu.field10345);
                for (MiniMenuEntry var12 = (MiniMenuEntry) var11.method11715(); var12 != null; var12 = (MiniMenuEntry) var11.next()) {
                    if (var6 == var10) {
                        Statics.handleEntryClicked(var12, var4, var5);
                        break;
                    }
                    var10++;
                }
            }
            close();
        } else if (var4 >= Statics.field4756 && var4 <= Statics.field4756 + Statics.field1571 && var5 >= Statics.field2325 && var5 <= Statics.field611 + Statics.field2325) {
            if (field586) {
                int var20 = -1;
                for (int var21 = 0; var21 < field594; var21++) {
                    if (formatted) {
                        int var22 = field582 * var21 + var0.field7176 + Statics.field2325 + 20 + 1;
                        if (var5 > var22 - var0.field7176 - 1 && var5 < var0.field7177 + var22) {
                            var20 = var21;
                            break;
                        }
                    } else {
                        int var23 = field582 * var21 + Statics.field2325 + 31;
                        if (var5 > var23 - 13 && var5 < var23 + 3) {
                            var20 = var21;
                            break;
                        }
                    }
                }
                if (var20 != -1) {
                    int var24 = 0;
                    SecondaryLinkedListIterator var25 = new SecondaryLinkedListIterator(submenus);
                    for (MiniMenuSubMenu var26 = (MiniMenuSubMenu) var25.method11715(); var26 != null; var26 = (MiniMenuSubMenu) var25.next()) {
                        if (var20 == var24) {
                            Statics.handleEntryClicked((MiniMenuEntry) var26.field10345.sentinel.secondaryNext, var4, var5);
                            close();
                            break;
                        }
                        var24++;
                    }
                }
            } else {
                int var13 = -1;
                for (int var14 = 0; var14 < length; var14++) {
                    if (formatted) {
                        int var15 = field582 * (length - 1 - var14) + var0.field7176 + Statics.field2325 + 20 + 1;
                        if (var5 > var15 - var0.field7176 - 1 && var5 < var0.field7177 + var15) {
                            var13 = var14;
                        }
                    } else {
                        int var16 = field582 * (length - 1 - var14) + Statics.field2325 + 31;
                        if (var5 > var16 - 13 && var5 < var16 + 3) {
                            var13 = var14;
                        }
                    }
                }
                if (var13 != -1) {
                    int var17 = 0;
                    IterableQueueIterator var18 = new IterableQueueIterator(entries);
                    for (MiniMenuEntry var19 = (MiniMenuEntry) var18.method11701(); var19 != null; var19 = (MiniMenuEntry) var18.next()) {
                        if (var13 == var17) {
                            Statics.handleEntryClicked(var19, var4, var5);
                            break;
                        }
                        var17++;
                    }
                }
                close();
            }
        }
    }

    @ObfuscatedName("zs.l(III)V")
    public static void method13889(int arg0, int arg1) {
        if (field602 == 1) {
            Statics.handleEntryClicked(Statics.field5136, arg0, arg1);
        } else if (field602 == 2) {
            Statics.open(arg0, arg1);
        }
        field602 = 0;
        Statics.field5136 = null;
    }

    @ObfuscatedName("ahj.f(I)Z")
    public static boolean method16114() {
        if (Statics.field2654 == null) {
            return false;
        } else {
            if (Statics.field2654.opcode >= 2000) {
                Statics.field2654.opcode -= 2000;
            }
            return Statics.field2654.opcode == 1007;
        }
    }

    @ObfuscatedName("e.z(Lajz;II)V")
    public static void method1672(MiniMenuSubMenu arg0, int arg1) {
        if (!open) {
            return;
        }
        FontMetrics var2 = method8078();
        int var3 = 0;
        for (MiniMenuEntry var4 = (MiniMenuEntry) arg0.field10345.head(); var4 != null; var4 = (MiniMenuEntry) arg0.field10345.next()) {
            int var5 = method5560(var4, var2);
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field582 * arg0.size + 21;
        Statics.field567 = (formatted ? 26 : 22) + field582 * arg0.size;
        int var7 = Statics.field4756 + Statics.field1571;
        if (var3 + var7 > Statics.canvasWid) {
            var7 = Statics.field4756 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = formatted ? var2.field7176 + 20 + 1 : 31;
        int var9 = var2.field7176 + (arg1 - var8) + 1;
        if (var6 + var9 > Statics.canvasHei) {
            var9 = Statics.canvasHei - var6;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field384 = var7;
        Statics.field9294 = var9;
        Statics.field603 = var3;
        submenu = arg0;
    }

    @ObfuscatedName("qo.n(I)Lvm;")
    public static FontMetrics method8078() {
        FontMetrics var0;
        if (!formatted) {
            var0 = Statics.field2399;
        } else if (Statics.field10523 == null || Statics.field2136 == null) {
            var0 = Statics.field2399;
        } else {
            var0 = Statics.field2136;
        }
        field582 = var0.field7177 + var0.field7176;
        return var0;
    }

    @ObfuscatedName("fn.o(I)V")
    public static void close() {
        closeSubmenu();
        open = false;
        client.requestRedrawAtPoint(Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611);
        Statics.field6655 = null;
        Statics.field627 = null;
    }

    @ObfuscatedName("oo.q(I)V")
    public static void closeSubmenu() {
        if (submenu != null) {
            submenu = null;
            client.requestRedrawAtPoint(Statics.field384, Statics.field9294, Statics.field603, Statics.field567);
        }
    }

    @ObfuscatedName("cd.w(Lajs;B)V")
    public static void addEntry(MiniMenuEntry arg0) {
        if (arg0 == null) {
            return;
        }
        entries.addTail(arg0);
        length++;
        Object var1 = null;
        MiniMenuSubMenu var4;
        if (arg0.field10338 || "".equals(arg0.opbase)) {
            var4 = new MiniMenuSubMenu(arg0.opbase);
            field594++;
        } else {
            long var2 = arg0.field10330;
            for (var4 = (MiniMenuSubMenu) field609.get(var2); var4 != null && !var4.field10344.equals(arg0.opbase); var4 = (MiniMenuSubMenu) field609.nextWithKey()) {
            }
            if (var4 == null) {
                var4 = (MiniMenuSubMenu) field600.get(var2);
                if (var4 != null && !var4.field10344.equals(arg0.opbase)) {
                    var4 = null;
                }
                if (var4 == null) {
                    var4 = new MiniMenuSubMenu(arg0.opbase);
                }
                field609.put(var4, var2);
                field594++;
            }
        }
        if (var4.method16644(arg0)) {
            method7720(var4);
        }
    }

    @ObfuscatedName("px.b(Lajz;I)V")
    public static void method7720(MiniMenuSubMenu arg0) {
        boolean var1 = false;
        arg0.unlinkSecondary();
        for (MiniMenuSubMenu var2 = (MiniMenuSubMenu) submenus.head(); var2 != null; var2 = (MiniMenuSubMenu) submenus.next()) {
            if (method5825(arg0.method16648(), var2.method16648())) {
                SecondaryLinkedList.insertAfter(arg0, var2);
                var1 = true;
                break;
            }
        }
        if (!var1) {
            submenus.addFirst(arg0);
        }
    }

    @ObfuscatedName("l.x(Lew;III)V")
    public static void method881(Component arg0, int arg1, int arg2) {
        if (client.targetModeActive) {
            ParamType var3 = Statics.targetParam == -1 ? null : Statics.paramTypes.get(Statics.targetParam);
            if (client.getComponentEvents(arg0).method14931() && (Statics.targetMask & 0x20) != 0 && (var3 == null || arg0.getIntParam(Statics.targetParam, var3.defaultint) != var3.defaultint)) {
                Statics.addEntry(client.field9103, client.field9151 + " " + TextUtil.ARROW + " " + arg0.opbase, Statics.targetCursor, 58, arg0.invobject, 0L, arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
            }
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var5 = getComponentOp(arg0, var4);
            if (var5 != null) {
                Statics.addEntry(var5, arg0.opbase, client.getComponentOpCursor(arg0, var4), 1007, arg0.invobject, (long) (var4 + 1), arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
            }
        }
        String var6 = client.getComponentTargetVerb(arg0);
        if (var6 != null) {
            Statics.addEntry(var6, arg0.opbase, arg0.field1855, 25, arg0.invobject, 0L, arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = getComponentOp(arg0, var7);
            if (var8 != null) {
                Statics.addEntry(var8, arg0.opbase, client.getComponentOpCursor(arg0, var7), 57, arg0.invobject, (long) (var7 + 1), arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
            }
        }
        if (client.getComponentEvents(arg0).isPauseButton()) {
            if (arg0.pausetext == null) {
                Statics.addEntry(LocalisedText.MINIMENU_CONTINUE.get(Statics.language), "", -1, 30, arg0.invobject, 0L, arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
            } else {
                Statics.addEntry(arg0.pausetext, "", -1, 30, arg0.invobject, 0L, arg0.parentlayer, arg0.id, true, false, (long) (arg0.parentlayer << 32 | arg0.id), false);
            }
        }
    }

    @ObfuscatedName("dv.i(Laay;B)V")
    public static void addPathingEntityEntries(PathingEntity arg0) {
        if (arg0 instanceof NpcEntity) {
            NpcEntity var1 = (NpcEntity) arg0;
            if (var1.type != null) {
                addNPCEntityEntries(var1, Statics.localPlayerEntity.level != var1.level);
            }
        } else if (arg0 instanceof PlayerEntity) {
            PlayerEntity var2 = (PlayerEntity) arg0;
            Statics.addPlayerEntityEntries(var2, Statics.localPlayerEntity.level != var2.level);
        }
    }

    @ObfuscatedName("je.v(Lra;III)V")
    public static void method4866(RendererToolkit arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg2 < 0 || field610 == null) {
            return;
        }
        CoordGrid var3 = client.world.getBase();
        Matrix4x4 var4 = arg0.method781();
        arg0.method784(field610);
        arg0.method524(field612);
        arg0.r(field606, field607, viewportWidth + field606, field607 + viewportHeight);
        arg0.method474(field606, field607, viewportWidth, viewportHeight);
        var4.method5385(field612);
        var4.method5384(field610);
        var4.method5387();
        int var5 = arg1 - field606;
        int var6 = arg2 - field607;
        if (client.world.getScene() != null && (!client.targetModeActive || (Statics.targetMask & 0x40) != 0)) {
            int var7 = -1;
            int var8 = -1;
            float var9 = (float) var5 * 2.0F / (float) viewportWidth - 1.0F;
            float var10 = (float) var6 * 2.0F / (float) viewportHeight - 1.0F;
            var4.method5390(var9, var10, -1.0F, field618);
            float var11 = field618[0] / field618[3];
            float var12 = field618[1] / field618[3];
            float var13 = field618[2] / field618[3];
            var4.method5390(var9, var10, 1.0F, field618);
            float var14 = field618[0] / field618[3];
            float var15 = field618[1] / field618[3];
            float var16 = field618[2] / field618[3];
            float var17 = method16791(var11, var12, var13, var14, var15, var16, 4);
            if (var17 > 0.0F) {
                float var18 = var14 - var11;
                float var19 = var16 - var13;
                int var20 = (int) (var17 * var18 + var11);
                int var21 = (int) (var17 * var19 + var13);
                var7 = var20 + (Statics.localPlayerEntity.size() - 1 << 8) >> 9;
                var8 = var21 + (Statics.localPlayerEntity.size() - 1 << 8) >> 9;
                byte var22 = Statics.localPlayerEntity.level;
                if (var22 < 3 && (client.world.getSceneLevelTileFlags().levelTileFlags[1][var20 >> 9][var21 >> 9] & 0x2) != 0) {
                    int var91 = var22 + 1;
                }
            }
            if (var7 != -1 && var8 != -1) {
                if (client.targetModeActive && (Statics.targetMask & 0x40) != 0) {
                    Component var23 = Component.get(Statics.activeComponentParentLayer, client.activeComponentId);
                    if (var23 == null) {
                        client.cancelTargetMode();
                    } else {
                        Statics.addEntry(client.field9103, " " + TextUtil.ARROW + " ", Statics.targetCursor, 59, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
                    }
                } else {
                    if (Statics.field6371) {
                        Statics.addEntry(LocalisedText.MINIMENU_FACE_HERE.get(Statics.language), "", -1, 60, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
                    }
                    Statics.addEntry(Statics.field2400, "", client.field9172, 23, -1, 0L, var7, var8, true, false, (long) (var7 << 32 | var8), true);
                }
            }
        }
        PickableEntityList var24 = client.world.getScene().pickableEntities;
        int var25 = arg1;
        int var26 = arg2;
        List var27 = var24.field4471;
        Iterator var28 = var27.iterator();
        while (true) {
            int var32;
            int var33;
            Location var83;
            LocType var84;
            String[] var86;
            do {
                PickableEntity var29;
                do {
                    do {
                        do {
                            while (true) {
                                while (true) {
                                    do {
                                        do {
                                            if (!var28.hasNext()) {
                                                return;
                                            }
                                            var29 = (PickableEntity) var28.next();
                                        } while (!client.field8940 && Statics.localPlayerEntity.level != var29.field4563.level);
                                    } while (!var29.method7568(arg0, var25, var26));
                                    boolean var30 = false;
                                    boolean var31 = false;
                                    if (var29.field4563 instanceof PrimaryLayerEntity) {
                                        var32 = ((PrimaryLayerEntity) var29.field4563).field10510;
                                        var33 = ((PrimaryLayerEntity) var29.field4563).field10509;
                                    } else {
                                        Vector3 var34 = var29.field4563.getTransform().trans;
                                        var32 = (int) var34.x >> 9;
                                        var33 = (int) var34.z >> 9;
                                    }
                                    if (!(var29.field4563 instanceof PlayerEntity)) {
                                        break;
                                    }
                                    PlayerEntity var35 = (PlayerEntity) var29.field4563;
                                    int var36 = var35.size();
                                    Vector3 var37 = var35.getTransform().trans;
                                    if ((var36 & 0x1) == 0 && ((int) var37.x & 0x1FF) == 0 && ((int) var37.z & 0x1FF) == 0 || (var36 & 0x1) == 1 && ((int) var37.x & 0x1FF) == 256 && ((int) var37.z & 0x1FF) == 256) {
                                        int var38 = (int) var37.x - (var35.size() - 1 << 8);
                                        int var39 = (int) var37.z - (var35.size() - 1 << 8);
                                        for (int var40 = 0; var40 < client.npcSlotCount; var40++) {
                                            ObjectNode var41 = (ObjectNode) client.npcEntities.get((long) client.npcSlots[var40]);
                                            if (var41 != null) {
                                                NpcEntity var42 = (NpcEntity) var41.value;
                                                if (client.loopCycle != var42.field8635 && var42.field8634) {
                                                    Vector3 var43 = var42.getTransform().trans;
                                                    int var44 = (int) var43.x - (var42.type.size - 1 << 8);
                                                    int var45 = (int) var43.z - (var42.type.size - 1 << 8);
                                                    if (var44 >= var38 && var42.type.size <= var35.size() - (var44 - var38 >> 9) && var45 >= var39 && var42.type.size <= var35.size() - (var45 - var39 >> 9)) {
                                                        addNPCEntityEntries(var42, Statics.localPlayerEntity.level != var29.field4563.level);
                                                        var42.field8635 = client.loopCycle;
                                                    }
                                                }
                                            }
                                        }
                                        int var46 = ReceivePlayerPositions.highResolutionsCount;
                                        int[] var47 = ReceivePlayerPositions.highResolutionsIndices;
                                        for (int var48 = 0; var48 < var46; var48++) {
                                            PlayerEntity var49 = client.players[var47[var48]];
                                            if (var49 != null && client.loopCycle != var49.field8635 && var35 != var49 && var49.field8634) {
                                                Vector3 var50 = var49.getTransform().trans;
                                                int var51 = (int) var50.x - (var49.size() - 1 << 8);
                                                int var52 = (int) var50.z - (var49.size() - 1 << 8);
                                                if (var51 >= var38 && var49.size() <= var35.size() - (var51 - var38 >> 9) && var52 >= var39 && var49.size() <= var35.size() - (var52 - var39 >> 9)) {
                                                    Statics.addPlayerEntityEntries(var49, Statics.localPlayerEntity.level != var29.field4563.level);
                                                    var49.field8635 = client.loopCycle;
                                                }
                                            }
                                        }
                                    }
                                    if (client.loopCycle != var35.field8635) {
                                        Statics.addPlayerEntityEntries(var35, Statics.localPlayerEntity.level != var29.field4563.level);
                                        var35.field8635 = client.loopCycle;
                                        break;
                                    }
                                }
                                if (!(var29.field4563 instanceof NpcEntity)) {
                                    break;
                                }
                                NpcEntity var53 = (NpcEntity) var29.field4563;
                                if (var53.type == null) {
                                    break;
                                }
                                Vector3 var54 = var53.getTransform().trans;
                                if ((var53.type.size & 0x1) == 0 && ((int) var54.x & 0x1FF) == 0 && ((int) var54.z & 0x1FF) == 0 || (var53.type.size & 0x1) == 1 && ((int) var54.x & 0x1FF) == 256 && ((int) var54.z & 0x1FF) == 256) {
                                    int var55 = (int) var54.x - (var53.type.size - 1 << 8);
                                    int var56 = (int) var54.z - (var53.type.size - 1 << 8);
                                    for (int var57 = 0; var57 < client.npcSlotCount; var57++) {
                                        ObjectNode var58 = (ObjectNode) client.npcEntities.get((long) client.npcSlots[var57]);
                                        if (var58 != null) {
                                            NpcEntity var59 = (NpcEntity) var58.value;
                                            if (client.loopCycle != var59.field8635 && var53 != var59 && var59.field8634) {
                                                Vector3 var60 = var59.getTransform().trans;
                                                int var61 = (int) var60.x - (var59.type.size - 1 << 8);
                                                int var62 = (int) var60.z - (var59.type.size - 1 << 8);
                                                if (var61 >= var55 && var59.type.size <= var53.type.size - (var61 - var55 >> 9) && var62 >= var56 && var59.type.size <= var53.type.size - (var62 - var56 >> 9)) {
                                                    addNPCEntityEntries(var59, Statics.localPlayerEntity.level != var29.field4563.level);
                                                    var59.field8635 = client.loopCycle;
                                                }
                                            }
                                        }
                                    }
                                    int var63 = ReceivePlayerPositions.highResolutionsCount;
                                    int[] var64 = ReceivePlayerPositions.highResolutionsIndices;
                                    for (int var65 = 0; var65 < var63; var65++) {
                                        PlayerEntity var66 = client.players[var64[var65]];
                                        if (var66 != null && client.loopCycle != var66.field8635 && var66.field8634) {
                                            Vector3 var67 = var66.getTransform().trans;
                                            int var68 = (int) var67.x - (var66.size() - 1 << 8);
                                            int var69 = (int) var67.z - (var66.size() - 1 << 8);
                                            if (var68 >= var55 && var66.size() <= var53.type.size - (var68 - var55 >> 9) && var69 >= var56 && var66.size() <= var53.type.size - (var69 - var56 >> 9)) {
                                                Statics.addPlayerEntityEntries(var66, Statics.localPlayerEntity.level != var29.field4563.level);
                                                var66.field8635 = client.loopCycle;
                                            }
                                        }
                                    }
                                }
                                if (client.loopCycle != var53.field8635) {
                                    addNPCEntityEntries(var53, Statics.localPlayerEntity.level != var29.field4563.level);
                                    var53.field8635 = client.loopCycle;
                                    break;
                                }
                            }
                            if (var29.field4563 instanceof ObjStackEntity) {
                                int var70 = var3.x + var32;
                                int var71 = var3.z + var33;
                                ObjStackList var72 = (ObjStackList) client.field9088.get((long) (var29.field4563.level << 28 | var71 << 14 | var70));
                                if (var72 != null) {
                                    int var73 = 0;
                                    Obj var74 = (Obj) var72.field9313.tail();
                                    while (var74 != null) {
                                        ObjType var75 = Statics.objTypes.get(var74.field9311);
                                        int var76;
                                        if (var75.field7086) {
                                            var76 = var75.field7097;
                                        } else if (var75.field7099) {
                                            var76 = Statics.field1736.field5127;
                                        } else {
                                            var76 = Statics.field1736.field5128;
                                        }
                                        if (client.targetModeActive && Statics.localPlayerEntity.level == var29.field4563.level) {
                                            ParamType var77 = Statics.targetParam == -1 ? null : Statics.paramTypes.get(Statics.targetParam);
                                            if ((Statics.targetMask & 0x1) != 0 && (var77 == null || var75.method12250(Statics.targetParam, var77.defaultint) != var77.defaultint)) {
                                                Statics.addEntry(client.field9103, client.field9151 + " " + TextUtil.ARROW + " " + TextUtil.createColourTag(var76) + var75.name, Statics.targetCursor, 17, -1, (long) var74.field9311, var32, var33, true, false, (long) var73, false);
                                            }
                                        }
                                        if (Statics.localPlayerEntity.level == var29.field4563.level) {
                                            String[] var78 = var75.field7082;
                                            for (int var79 = var78.length - 1; var79 >= 0; var79--) {
                                                if (var78[var79] != null) {
                                                    short var80 = 0;
                                                    int var81 = client.field9098;
                                                    if (var79 == 0) {
                                                        var80 = 18;
                                                    }
                                                    if (var79 == 1) {
                                                        var80 = 19;
                                                    }
                                                    if (var79 == 2) {
                                                        var80 = 20;
                                                    }
                                                    if (var79 == 3) {
                                                        var80 = 21;
                                                    }
                                                    if (var79 == 4) {
                                                        var80 = 22;
                                                    }
                                                    if (var79 == 5) {
                                                        var80 = 1004;
                                                    }
                                                    int var82 = var75.method12251(var79);
                                                    if (var82 != -1) {
                                                        var81 = var82;
                                                    }
                                                    Statics.addEntry(var78[var79], TextUtil.createColourTag(var76) + var75.name, var81, var80, -1, (long) var74.field9311, var32, var33, true, false, (long) var73, false);
                                                }
                                            }
                                        }
                                        var74 = (Obj) var72.field9313.prev();
                                        var73++;
                                    }
                                }
                            }
                        } while (!(var29.field4563 instanceof Location));
                        var83 = (Location) var29.field4563;
                        var84 = client.world.getLocTypeList().get(var83.getType());
                        if (var84.multiloc != null) {
                            var84 = var84.getMultiLoc(Statics.field2669);
                        }
                    } while (var84 == null);
                    if (client.targetModeActive && Statics.localPlayerEntity.level == var29.field4563.level) {
                        ParamType var85 = Statics.targetParam == -1 ? null : Statics.paramTypes.get(Statics.targetParam);
                        if ((Statics.targetMask & 0x4) != 0 && (var85 == null || var84.method11444(Statics.targetParam, var85.defaultint) != var85.defaultint)) {
                            Statics.addEntry(client.field9103, client.field9151 + " " + TextUtil.ARROW + " " + TextUtil.createColourTag(65535) + var84.field6490, Statics.targetCursor, 2, -1, method14745(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
                        }
                    }
                } while (Statics.localPlayerEntity.level != var29.field4563.level);
                var86 = var84.field6505;
            } while (var86 == null);
            for (int var87 = var86.length - 1; var87 >= 0; var87--) {
                if (var86[var87] != null) {
                    short var88 = 0;
                    int var89 = client.field9098;
                    if (var87 == 0) {
                        var88 = 3;
                    }
                    if (var87 == 1) {
                        var88 = 4;
                    }
                    if (var87 == 2) {
                        var88 = 5;
                    }
                    if (var87 == 3) {
                        var88 = 6;
                    }
                    if (var87 == 4) {
                        var88 = 1001;
                    }
                    if (var87 == 5) {
                        var88 = 1002;
                    }
                    int var90 = var84.method11413(var87);
                    if (var90 != -1) {
                        var89 = var90;
                    }
                    Statics.addEntry(var86[var87], TextUtil.createColourTag(65535) + var84.field6490, var89, var88, -1, method14745(var83, var32, var33), var32, var33, true, false, (long) var83.hashCode(), false);
                }
            }
        }
    }

    @ObfuscatedName("acr.k(Lca;III)J")
    public static long method14745(Location arg0, int arg1, int arg2) {
        long var3 = 0x400000L;
        long var5 = Long.MIN_VALUE;
        LocType var7 = client.world.getLocTypeList().get(arg0.getType());
        long var8 = (long) (arg1 | arg2 << 7 | arg0.method2390() << 14 | arg0.method2391() << 20 | 0x40000000);
        if (var7.active == 0) {
            var8 |= var5;
        }
        if (var7.raiseobject == 1) {
            var8 |= var3;
        }
        return var8 | (long) arg0.getType() << 32;
    }

    @ObfuscatedName("nf.h(Lajs;S)V")
    public static void method6643(MiniMenuEntry arg0) {
        if (open) {
            return;
        }
        arg0.unlink();
        length--;
        if (!arg0.field10338) {
            long var1 = arg0.field10330;
            MiniMenuSubMenu var3;
            for (var3 = (MiniMenuSubMenu) field609.get(var1); var3 != null && !var3.field10344.equals(arg0.opbase); var3 = (MiniMenuSubMenu) field609.nextWithKey()) {
            }
            if (var3 != null && var3.method16650(arg0)) {
                method7720(var3);
            }
            return;
        }
        for (MiniMenuSubMenu var4 = (MiniMenuSubMenu) submenus.head(); var4 != null; var4 = (MiniMenuSubMenu) submenus.next()) {
            if (var4.field10344.equals(arg0.opbase)) {
                boolean var5 = false;
                for (MiniMenuEntry var6 = (MiniMenuEntry) var4.field10345.head(); var6 != null; var6 = (MiniMenuEntry) var4.field10345.next()) {
                    if (arg0 == var6) {
                        if (var4.method16650(arg0)) {
                            method7720(var4);
                        }
                        var5 = true;
                        break;
                    }
                }
                if (var5) {
                    break;
                }
            }
        }
    }

    @ObfuscatedName("ru.r(B)V")
    public static void method8628() {
        for (MiniMenuEntry var0 = (MiniMenuEntry) entries.head(); var0 != null; var0 = (MiniMenuEntry) entries.next()) {
            if (Statics.method1367(var0.opcode)) {
                method6643(var0);
            }
        }
    }

    @ObfuscatedName("sl.g(II)Z")
    public static boolean method11169(int arg0) {
        for (MiniMenuEntry var1 = (MiniMenuEntry) entries.head(); var1 != null; var1 = (MiniMenuEntry) entries.next()) {
            if (method8731(var1.opcode) && var1.field10333 == (long) arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("eq.y(I)Z")
    public static boolean hasEntries() {
        return length > 0;
    }

    @ObfuscatedName("abm.e(Lra;I)V")
    public static void draw(RendererToolkit arg0) {
        if (open) {
            drawOpen(arg0);
        } else {
            drawClosed(arg0);
        }
    }

    @ObfuscatedName("q.ay(I)V")
    public static void method1401() {
        for (MiniMenuSubMenu var0 = (MiniMenuSubMenu) submenus.head(); var0 != null; var0 = (MiniMenuSubMenu) submenus.next()) {
            if (var0.size > 1) {
                var0.size = 0;
                field600.method7937(var0, ((MiniMenuEntry) var0.field10345.sentinel.secondaryNext).field10330);
                var0.field10345.clear();
            }
        }
        field594 = 0;
        length = 0;
        entries.clearBridged();
        field609.clear();
        submenus.clear();
        addEntry(Statics.field7187);
    }

    @ObfuscatedName("sv.af(I)V")
    public static void method11300() {
        for (MiniMenuSubMenu var0 = (MiniMenuSubMenu) submenus.head(); var0 != null; var0 = (MiniMenuSubMenu) submenus.next()) {
            if (var0.size > 1) {
                var0.size = 0;
                field600.method7937(var0, ((MiniMenuEntry) var0.field10345.sentinel.secondaryNext).field10330);
                var0.field10345.clear();
            }
        }
        field594 = 0;
        length = 0;
        entries.clearBridged();
        field609.clear();
        submenus.clear();
        open = false;
    }

    @ObfuscatedName("zy.ar(B)V")
    public static void clearFormatting() {
        Statics.field8491 = null;
        Statics.field1557 = null;
        Statics.field2652 = null;
        Statics.field6392 = null;
        Statics.field6819 = null;
        Statics.field8519 = null;
        Statics.field3925 = null;
        Statics.field3411 = null;
        Statics.field10523 = null;
        Statics.field2136 = null;
    }

    @ObfuscatedName("gc.an(I)V")
    public static void setFormattingDefault() {
        clearFormatting();
        Statics.field383 = null;
    }

    @ObfuscatedName("eo.ap([Lce;B)V")
    public static void method3288(Sprite[] arg0) {
        Statics.field4161 = arg0.length;
        Statics.field383 = new Sprite[Statics.field4161 + 10];
        Statics.field2187 = new int[Statics.field4161 + 10];
        System.arraycopy(arg0, 0, Statics.field383, 0, Statics.field4161);
        for (int var1 = 0; var1 < Statics.field4161; var1++) {
            Statics.field2187[var1] = Statics.field383[var1].method1047();
        }
        for (int var2 = Statics.field4161; var2 < Statics.field383.length; var2++) {
            Statics.field2187[var2] = 12;
        }
    }

    @ObfuscatedName("ig.as(Lew;III)V")
    public static void updateMouseOverText(Component com, int x, int y) {
        mouseOverTextComponent = com;
        mouseOverTextX = x;
        mouseOverTextY = y;
    }

    @ObfuscatedName("aai.ai(I)I")
    public static int method14087() {
        if (client.dragComponent == null) {
            if (open) {
                FontMetrics var0 = method8078();
                int var1 = Statics.mouse.getX();
                int var2 = Statics.mouse.getY();
                if (field586) {
                    if (var1 > Statics.field4756 && var1 < Statics.field4756 + Statics.field1571) {
                        int var10 = -1;
                        for (int var11 = 0; var11 < field594; var11++) {
                            if (formatted) {
                                int var12 = field582 * var11 + var0.field7176 + Statics.field2325 + 20 + 1;
                                if (var2 > var12 - var0.field7176 - 1 && var2 < var0.field7177 + var12) {
                                    var10 = var11;
                                }
                            } else {
                                int var13 = field582 * var11 + Statics.field2325 + 31;
                                if (var2 > var13 - var0.field7176 - 1 && var2 < var0.field7177 + var13) {
                                    var10 = var11;
                                }
                            }
                        }
                        if (var10 != -1) {
                            int var14 = 0;
                            SecondaryLinkedListIterator var15 = new SecondaryLinkedListIterator(submenus);
                            for (MiniMenuSubMenu var16 = (MiniMenuSubMenu) var15.method11715(); var16 != null; var16 = (MiniMenuSubMenu) var15.next()) {
                                if (var14++ == var10) {
                                    return ((MiniMenuEntry) var16.field10345.sentinel.secondaryNext).field10331;
                                }
                            }
                        }
                    } else if (submenu != null && var1 > Statics.field384 && var1 < Statics.field603 + Statics.field384) {
                        int var17 = -1;
                        for (int var18 = 0; var18 < submenu.size; var18++) {
                            if (formatted) {
                                int var19 = field582 * var18 + var0.field7176 + Statics.field9294 + 20 + 1;
                                if (var2 > var19 - var0.field7176 - 1 && var2 < var0.field7177 + var19) {
                                    var17 = var18;
                                }
                            } else {
                                int var20 = field582 * var18 + Statics.field9294 + 31;
                                if (var2 > var20 - var0.field7176 - 1 && var2 < var0.field7177 + var20) {
                                    var17 = var18;
                                }
                            }
                        }
                        if (var17 != -1) {
                            int var21 = 0;
                            SecondaryLinkedListIterator var22 = new SecondaryLinkedListIterator(submenu.field10345);
                            for (MiniMenuEntry var23 = (MiniMenuEntry) var22.method11715(); var23 != null; var23 = (MiniMenuEntry) var22.next()) {
                                if (var21++ == var17) {
                                    return var23.field10331;
                                }
                            }
                        }
                    }
                } else if (var1 > Statics.field4756 && var1 < Statics.field4756 + Statics.field1571) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < length; var4++) {
                        if (formatted) {
                            int var5 = field582 * (length - 1 - var4) + var0.field7176 + Statics.field2325 + 20 + 1;
                            if (var2 > var5 - var0.field7176 - 1 && var2 < var0.field7177 + var5) {
                                var3 = var4;
                            }
                        } else {
                            int var6 = field582 * (length - 1 - var4) + Statics.field2325 + 31;
                            if (var2 > var6 - var0.field7176 - 1 && var2 < var0.field7177 + var6) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var7 = 0;
                        IterableQueueIterator var8 = new IterableQueueIterator(entries);
                        for (MiniMenuEntry var9 = (MiniMenuEntry) var8.method11701(); var9 != null; var9 = (MiniMenuEntry) var8.next()) {
                            if (var7++ == var3) {
                                return var9.field10331;
                            }
                        }
                    }
                }
            } else if (Statics.field1736.field5124) {
                if (Statics.field627 != null) {
                    return Statics.field627.field10331;
                }
            } else if (Statics.field6655 != null) {
                return Statics.field6655.field10331;
            }
        }
        return -1;
    }

    @ObfuscatedName("qr.ao(III)Z")
    public static boolean isOpen(int arg0, int arg1) {
        if (!open) {
            return false;
        }

        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (Statics.field1756[var2] == null || Statics.field1756[var2].field1732[var3] == null) {
            return false;
        }

        Component var4 = Statics.field1756[var2].field1732[var3];
        if (arg1 == -1 && var4.type == 0) {
            for (MiniMenuEntry var5 = (MiniMenuEntry) entries.head(); var5 != null; var5 = (MiniMenuEntry) entries.next()) {
                if (var5.opcode == 58 || var5.opcode == 1007 || var5.opcode == 25 || var5.opcode == 57 || var5.opcode == 30) {
                    for (Component var6 = Component.method11381(var5.field10335); var6 != null; var6 = client.method4752(Statics.field1756[var6.id >> 16], var6)) {
                        if (var4.id == var6.id) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (MiniMenuEntry var7 = (MiniMenuEntry) entries.head(); var7 != null; var7 = (MiniMenuEntry) entries.next()) {
                if (var7.field10329 == arg1 && var4.id == var7.field10335 && (var7.opcode == 58 || var7.opcode == 1007 || var7.opcode == 25 || var7.opcode == 57 || var7.opcode == 30)) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("rv.al(I)Lajs;")
    public static MiniMenuEntry getActiveEntry() {
        return Statics.field6655;
    }

    @ObfuscatedName("oe.at(I)Lajs;")
    public static MiniMenuEntry method7326() {
        return Statics.field627;
    }

    @ObfuscatedName("fm.aw(Lajs;I)Ljava/lang/String;")
    public static String getEntryOpBase(MiniMenuEntry arg0) {
        if (open || arg0 == null) {
            return "";
        } else if ((arg0.opbase == null || arg0.opbase.length() == 0) && arg0.field10341 != null && arg0.field10341.length() > 0) {
            return arg0.field10341;
        } else {
            return arg0.opbase;
        }
    }

    @ObfuscatedName("sh.aa(Lajs;I)I")
    public static int getEntryEntityType(MiniMenuEntry arg0) {
        if (open) {
            return 6;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var1 = arg0.opcode;
            if (Statics.method1367(var1)) {
                return 1;
            } else if (method5562(var1)) {
                return 2;
            } else if (method1676(var1)) {
                return 3;
            } else if (method8731(var1)) {
                return 4;
            } else if (method5597(var1)) {
                return 7;
            } else if (var1 == 16) {
                return 8;
            } else {
                return 5;
            }
        }
    }

    @ObfuscatedName("mp.am(Lajs;I)Ljava/lang/String;")
    public static String method6256(MiniMenuEntry arg0) {
        if (open || arg0 == null) {
            return "";
        } else {
            int[] var1 = Statics.method3289(arg0);
            return var1 == null ? "" : method11875(var1);
        }
    }

    @ObfuscatedName("er.ad(Lkc;Lka;III)V")
    public static void method2994(Matrix4x3 arg0, Matrix4x4 arg1, int arg2, int arg3) {
        if (field610 == null) {
            field610 = new Matrix4x4(arg1);
        } else {
            field610.method5412(arg1);
        }
        field612.method5115(arg0);
        viewportWidth = arg2;
        viewportHeight = arg3;
    }

    @ObfuscatedName("u.ak(Lra;B)V")
    public static void drawOpen(RendererToolkit arg0) {
        if (formatted) {
            drawOpenFormatted(arg0);
        } else {
            method5017(arg0);
        }
    }

    @ObfuscatedName("fr.av(Lra;B)V")
    public static void drawClosed(RendererToolkit arg0) {
        if (length < 2 && !client.targetModeActive || client.dragComponent != null) {
            return;
        }
        String var1;
        if (client.targetModeActive && length < 2) {
            var1 = client.field9103 + LocalisedText.field6984.get(Statics.language) + client.field9151 + " " + TextUtil.ARROW;
        } else if (method12751() && length > 2) {
            var1 = method12186(Statics.field6655);
        } else {
            MiniMenuEntry var2 = Statics.field6655;
            if (var2 == null) {
                return;
            }
            var1 = method12186(var2);
            int[] var3 = Statics.method3289(var2);
            if (var3 != null) {
                var1 = var1 + method11875(var3);
            }
        }
        if (length > 2) {
            var1 = var1 + TextUtil.createColourTag(16777215) + " / " + (length - 2) + LocalisedText.field6993.get(Statics.language);
        }
        if (mouseOverTextComponent == null) {
            return;
        }
        Font var4 = mouseOverTextComponent.method3116(Statics.field6784, client.field8914);
        if (var4 == null) {
            var4 = Statics.field670;
        }
        var4.method842(var1, mouseOverTextX, mouseOverTextY, mouseOverTextComponent.renderwidth, mouseOverTextComponent.renderheight, mouseOverTextComponent.colour, mouseOverTextComponent.graphicshadow, mouseOverTextComponent.field1836, mouseOverTextComponent.field1837, client.field9207, Statics.field2113, client.field8920, Statics.field383, Statics.field2187);
        client.requestRedrawAtPoint(client.field8920[0], client.field8920[1], client.field8920[2], client.field8920[3]);
    }

    @ObfuscatedName("ya.aj(Lra;IIIIIIB)V")
    public static void method12996(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        arg0.fillRectangle(arg1, arg2, arg3, arg4, arg5);
        arg0.fillRectangle(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
        arg0.drawRectangle(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
    }

    @ObfuscatedName("x.ae(IIIIIIILajz;Ll;Lvm;III)V")
    public static void drawEntry(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, MiniMenuSubMenu arg7, Font arg8, FontMetrics arg9, int arg10, int arg11) {
        if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.field7176 - 1 && arg1 < arg9.field7177 + arg6) {
            arg10 = arg11;
        }
        String var12 = Statics.method3322(arg7);
        arg8.method841(var12, arg2 + 3, arg6, arg10, 0, client.field9207, Statics.field2113, Statics.field383, Statics.field2187);
    }

    @ObfuscatedName("ky.ac(Lra;I)V")
    public static void method5017(RendererToolkit arg0) {
        int var1 = 0xff5d5447;
        method12996(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var1, 0xff000000);
        Statics.field670.method833(LocalisedText.CHOOSE_OPTION.get(Statics.language), Statics.field4756 + 3, Statics.field2325 + 14, var1, -1);

        int mouseX = Statics.mouse.getX();
        int mouseY = Statics.mouse.getY();

        if (!field586) {
            int var4 = 0;
            for (MiniMenuEntry var5 = (MiniMenuEntry) entries.head(); var5 != null; var5 = (MiniMenuEntry) entries.next()) {
                int var6 = field582 * (length - 1 - var4) + Statics.field2325 + 31;
                Statics.drawEntryInner(mouseX, mouseY, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var6, var5, Statics.field670, Statics.field2399, -1, -256);
                var4++;
            }
            return;
        }

        int var7 = 0;
        for (MiniMenuSubMenu inner = (MiniMenuSubMenu) submenus.head(); inner != null; inner = (MiniMenuSubMenu) submenus.next()) {
            int var9 = field582 * var7 + Statics.field2325 + 31;
            if (inner.size == 1) {
                Statics.drawEntryInner(mouseX, mouseY, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var9, (MiniMenuEntry) inner.field10345.sentinel.secondaryNext, Statics.field670, Statics.field2399, -1, -256);
            } else {
                drawEntry(mouseX, mouseY, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var9, inner, Statics.field670, Statics.field2399, -1, -256);
            }
            var7++;
        }

        if (submenu != null) {
            method12996(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var1, -16777216);
            Statics.field670.method833(submenu.field10344, Statics.field384 + 3, Statics.field9294 + 14, var1, -1);
            int var10 = 0;
            for (MiniMenuEntry var11 = (MiniMenuEntry) submenu.field10345.head(); var11 != null; var11 = (MiniMenuEntry) submenu.field10345.next()) {
                int var12 = field582 * var10 + Statics.field9294 + 31;
                Statics.drawEntryInner(mouseX, mouseY, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var12, var11, Statics.field670, Statics.field2399, -1, -256);
                var10++;
            }
        }
    }

    @ObfuscatedName("ta.aq(Lra;IIIIILl;Lvm;Ljava/lang/String;I)V")
    public static void method190(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Font arg6, FontMetrics arg7, String arg8) {
        int var9 = 255 - Statics.field6566 - field615;
        if (var9 < 0) {
            var9 = 0;
        }
        if (Statics.field2652 == null || Statics.field8491 == null) {
            if (Statics.field7387.method5630(Statics.field8531) && Statics.field7387.method5630(Statics.field6372)) {
                Statics.field2652 = arg0.method517(SpriteDataProvider.method2590(Statics.field7387, Statics.field8531, 0), true);
                SpriteData var10 = SpriteDataProvider.method2590(Statics.field7387, Statics.field6372, 0);
                Statics.field8491 = arg0.method517(var10, true);
                var10.flipHorizontally();
                Statics.field1557 = arg0.method517(var10, true);
            } else {
                arg0.B(arg1, arg2, arg3, arg5, var9 << 24 | Statics.field9426, 1);
            }
        }
        if (Statics.field2652 != null && Statics.field8491 != null) {
            int var11 = (arg3 - Statics.field8491.method1061() * 2) / Statics.field2652.method1061();
            for (int var12 = 0; var12 < var11; var12++) {
                Statics.field2652.method2500(arg1 + Statics.field8491.method1061() + var12 * Statics.field2652.method1061(), arg2);
            }
            Statics.field8491.method2500(arg1, arg2);
            Statics.field1557.method2500(arg1 + arg3 - Statics.field1557.method1061(), arg2);
        }
        arg6.method833(arg8, arg1 + 3, (20 - arg7.field7176) / 2 + arg7.field7176 + arg2, Statics.field8718 | 0xFF000000, -1);
        arg0.B(arg1, arg2 + arg5, arg3, arg4 - arg5, var9 << 24 | Statics.field9426, 1);
    }

    @ObfuscatedName("ag.ab(Lra;IIIIII)V")
    public static void method1740(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((Statics.field8519 == null || Statics.field6392 == null || Statics.field3925 == null) && Statics.field7387.method5630(Statics.field2333) && Statics.field7387.method5630(Statics.field617) && Statics.field7387.method5630(Statics.field2338)) {
            SpriteData var6 = SpriteDataProvider.method2590(Statics.field7387, Statics.field617, 0);
            Statics.field6392 = arg0.method517(var6, true);
            var6.flipHorizontally();
            Statics.field6819 = arg0.method517(var6, true);
            Statics.field8519 = arg0.method517(SpriteDataProvider.method2590(Statics.field7387, Statics.field2333, 0), true);
            SpriteData var7 = SpriteDataProvider.method2590(Statics.field7387, Statics.field2338, 0);
            Statics.field3925 = arg0.method517(var7, true);
            var7.flipHorizontally();
            Statics.field3411 = arg0.method517(var7, true);
        }
        if (Statics.field8519 == null || Statics.field6392 == null || Statics.field3925 == null) {
            return;
        }
        int var8 = (arg3 - Statics.field3925.method1061() * 2) / Statics.field8519.method1061();
        for (int var9 = 0; var9 < var8; var9++) {
            Statics.field8519.method2500(arg1 + Statics.field3925.method1061() + var9 * Statics.field8519.method1061(), arg2 + arg4 - Statics.field8519.method1045());
        }
        int var10 = (arg4 - arg5 - Statics.field3925.method1045()) / Statics.field6392.method1045();
        for (int var11 = 0; var11 < var10; var11++) {
            Statics.field6392.method2500(arg1, arg2 + arg5 + var11 * Statics.field6392.method1045());
            Statics.field6819.method2500(arg1 + arg3 - Statics.field6819.method1061(), arg2 + arg5 + var11 * Statics.field6392.method1045());
        }
        Statics.field3925.method2500(arg1, arg2 + arg4 - Statics.field3925.method1045());
        Statics.field3411.method2500(arg1 + arg3 - Statics.field3925.method1061(), arg2 + arg4 - Statics.field3925.method1045());
    }

    @ObfuscatedName("pj.bq(Lra;I)V")
    public static void drawOpenFormatted(RendererToolkit arg0) {
        int var1 = Statics.field4756;
        int var2 = Statics.field2325;
        int var3 = Statics.field1571;
        int var4 = Statics.field611 - 3;
        byte var5 = 20;
        if (Statics.field10523 == null || Statics.field2136 == null) {
            Statics.field10523 = (Font) Statics.field6784.method4859(client.field8914, Statics.field1387, true, true);
            Statics.field2136 = Statics.field6784.method4843(client.field8914, Statics.field1387);
            if (Statics.field10523 != null && Statics.field2136 != null) {
                close();
                int var6 = var3 / 2 + var1;
                if (var3 + var6 > Statics.canvasWid) {
                    var6 = Statics.canvasWid - var3;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                Statics.open(var6, Statics.field2325);
                return;
            }
        }
        Font var7;
        if (Statics.field10523 == null || Statics.field2136 == null) {
            var7 = Statics.field670;
        } else {
            var7 = Statics.field10523;
        }
        FontMetrics var8 = method8078();
        method190(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var5, var7, var8, LocalisedText.CHOOSE_OPTION.get(Statics.language));
        int var9 = 255 - Statics.field5052 - field615;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = Statics.mouse.getX();
        int var11 = Statics.mouse.getY();
        if (field586) {
            int var15 = 0;
            for (MiniMenuSubMenu var16 = (MiniMenuSubMenu) submenus.head(); var16 != null; var16 = (MiniMenuSubMenu) submenus.next()) {
                int var17 = field582 * var15 + var8.field7176 + var2 + var5 + 1;
                if (var10 > Statics.field4756 && var10 < Statics.field4756 + Statics.field1571 && var11 > var17 - var8.field7176 - 1 && var11 < var8.field7177 + var17 && (var16.size > 1 || ((MiniMenuEntry) var16.field10345.sentinel.secondaryNext).field10336)) {
                    arg0.B(Statics.field4756, var17 - var8.field7176, Statics.field1571, field582, var9 << 24 | Statics.field1477, 1);
                }
                var15++;
            }
            if (submenu != null) {
                method190(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var5, var7, var8, submenu.field10344);
                int var18 = 0;
                for (MiniMenuEntry var19 = (MiniMenuEntry) submenu.field10345.head(); var19 != null; var19 = (MiniMenuEntry) submenu.field10345.next()) {
                    int var20 = field582 * var18 + var8.field7176 + Statics.field9294 + var5 + 1;
                    if (var10 > Statics.field384 && var10 < Statics.field603 + Statics.field384 && var11 > var20 - var8.field7176 - 1 && var11 < var8.field7177 + var20 && var19.field10336) {
                        arg0.B(Statics.field384, var20 - var8.field7176, Statics.field603, field582, var9 << 24 | Statics.field1477, 1);
                    }
                    var18++;
                }
                method1740(arg0, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var5);
            }
        } else {
            int var12 = 0;
            for (MiniMenuEntry var13 = (MiniMenuEntry) entries.head(); var13 != null; var13 = (MiniMenuEntry) entries.next()) {
                int var14 = field582 * (length - 1 - var12) + var8.field7176 + var2 + var5 + 1;
                if (var10 > Statics.field4756 && var10 < Statics.field4756 + Statics.field1571 && var11 > var14 - var8.field7176 - 1 && var11 < var8.field7177 + var14 && var13.field10336) {
                    arg0.B(Statics.field4756, var14 - var8.field7176, Statics.field1571, field582, var9 << 24 | Statics.field1477, 1);
                }
                var12++;
            }
        }
        method1740(arg0, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var5);
        if (!field586) {
            int var21 = 0;
            for (MiniMenuEntry var22 = (MiniMenuEntry) entries.head(); var22 != null; var22 = (MiniMenuEntry) entries.next()) {
                int var23 = field582 * (length - 1 - var21) + var8.field7176 + var2 + var5 + 1;
                Statics.drawEntryInner(var10, var11, var1, var2, var3, var4, var23, var22, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
                var21++;
            }
            return;
        }
        int var24 = 0;
        for (MiniMenuSubMenu var25 = (MiniMenuSubMenu) submenus.head(); var25 != null; var25 = (MiniMenuSubMenu) submenus.next()) {
            int var26 = field582 * var24 + var8.field7176 + Statics.field2325 + var5 + 1;
            if (var25.size == 1) {
                Statics.drawEntryInner(var10, var11, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var26, (MiniMenuEntry) var25.field10345.sentinel.secondaryNext, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
            } else {
                drawEntry(var10, var11, Statics.field4756, Statics.field2325, Statics.field1571, Statics.field611, var26, var25, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
            }
            var24++;
        }
        if (submenu == null) {
            return;
        }
        int var27 = 0;
        for (MiniMenuEntry var28 = (MiniMenuEntry) submenu.field10345.head(); var28 != null; var28 = (MiniMenuEntry) submenu.field10345.next()) {
            int var29 = field582 * var27 + var8.field7176 + Statics.field9294 + var5 + 1;
            Statics.drawEntryInner(var10, var11, Statics.field384, Statics.field9294, Statics.field603, Statics.field567, var29, var28, var7, var8, Statics.field8718 | 0xFF000000, Statics.field5086 | 0xFF000000);
            var27++;
        }
    }

    @ObfuscatedName("va.bz(Lajs;I)Ljava/lang/String;")
    public static String method12186(MiniMenuEntry arg0) {
        if (arg0.field10341 == null || arg0.field10341.length() == 0) {
            return arg0.opbase == null || arg0.opbase.length() <= 0 ? arg0.field10339 : arg0.field10339 + LocalisedText.field6984.get(Statics.language) + arg0.opbase;
        } else if (arg0.opbase == null || arg0.opbase.length() <= 0) {
            return arg0.field10339 + LocalisedText.field6984.get(Statics.language) + arg0.field10341;
        } else {
            return arg0.field10339 + LocalisedText.field6984.get(Statics.language) + arg0.opbase + LocalisedText.field6984.get(Statics.language) + arg0.field10341;
        }
    }

    @ObfuscatedName("q.bj(Lajz;Lvm;B)I")
    public static int method1399(MiniMenuSubMenu arg0, FontMetrics arg1) {
        String var2 = Statics.method3322(arg0);
        return arg1.method12390(var2, Statics.field383);
    }

    @ObfuscatedName("km.bf(Lajs;Lvm;I)I")
    public static int method5560(MiniMenuEntry arg0, FontMetrics arg1) {
        String var2 = method12186(arg0);
        int[] var3 = Statics.method3289(arg0);
        if (var3 != null) {
            var2 = var2 + method11875(var3);
        }
        int var4 = arg1.method12390(var2, Statics.field383);
        if (arg0.field10337) {
            var4 += Statics.field6385.method1061() + 4;
        }
        return var4;
    }

    @ObfuscatedName("up.bt([II)Ljava/lang/String;")
    public static String method11875(int[] arg0) {
        StringBuilder var1 = new StringBuilder();
        int var2 = Statics.field4161;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            QuestType var4 = Statics.field4959.method8401(arg0[var3]);
            if (var4.field5079 != -1) {
                Sprite var5 = (Sprite) field620.get((long) var4.field5079);
                if (var5 == null) {
                    SpriteData var6 = SpriteDataProvider.method2590(Statics.field7387, var4.field5079, 0);
                    if (var6 != null) {
                        var5 = Statics.renderer.method517(var6, true);
                        field620.method7937(var5, (long) var4.field5079);
                    }
                }
                if (var5 != null) {
                    Statics.field383[var2] = var5;
                    var1.append(" <img=").append(var2).append(">");
                    var2++;
                }
            }
        }
        return var1.toString();
    }

    @ObfuscatedName("kg.bl(II)Z")
    public static boolean method5562(int arg0) {
        if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
            return true;
        } else {
            return arg0 == 17;
        }
    }

    @ObfuscatedName("ro.bk(II)Z")
    public static boolean method8731(int arg0) {
        if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @ObfuscatedName("lb.bs(II)Z")
    public static boolean method5597(int arg0) {
        return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
    }

    @ObfuscatedName("ay.bn(II)Z")
    public static boolean method1676(int arg0) {
        if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
            return true;
        } else {
            return arg0 == 2;
        }
    }

    @ObfuscatedName("ew.ba(Lahs;ZI)V")
    public static void addNPCEntityEntries(NpcEntity arg0, boolean arg1) {
        if (length >= 406) {
            return;
        }
        NPCType var2 = arg0.type;
        String var3 = arg0.name;
        if (var2.multinpc != null) {
            var2 = var2.getMultiNPC(Statics.field2669);
            if (var2 == null) {
                return;
            }
            var3 = var2.name;
        }
        if (!var2.active) {
            return;
        }
        if (arg0.vislevel != 0) {
            String var4 = client.modeGame == ModeGame.STELLARDAWN ? LocalisedText.field6998.get(Statics.language) : LocalisedText.field6996.get(Statics.language);
            var3 = var3 + method2609(arg0.vislevel, Statics.localPlayerEntity.combatLevel) + TextUtil.field489 + var4 + arg0.vislevel + TextUtil.field487;
        }
        if (client.targetModeActive && !arg1) {
            ParamType var5 = Statics.targetParam == -1 ? null : Statics.paramTypes.get(Statics.targetParam);
            if ((Statics.targetMask & 0x2) != 0 && (var5 == null || var2.method12514(Statics.targetParam, var5.defaultint) != var5.defaultint)) {
                Statics.addEntry(client.field9103, client.field9151 + " " + TextUtil.ARROW + " " + TextUtil.createColourTag(16776960) + var3, Statics.targetCursor, 8, -1, (long) arg0.slot, 0, 0, true, false, (long) arg0.slot, false);
            }
        }
        if (arg1) {
            return;
        }
        String[] var6 = var2.op;
        if (client.field9112) {
            var6 = client.method15472(var6);
        }
        if (var6 == null) {
            return;
        }
        for (int var7 = var6.length - 1; var7 >= 0; var7--) {
            if (var6[var7] != null && (var2.field7248 == 0 || !var6[var7].equalsIgnoreCase(LocalisedText.field6991.get(Statics.language)) && !var6[var7].equalsIgnoreCase(LocalisedText.field6874.get(Statics.language)))) {
                short var8 = 0;
                int var9 = client.field9098;
                if (var7 == 0) {
                    var8 = 9;
                }
                if (var7 == 1) {
                    var8 = 10;
                }
                if (var7 == 2) {
                    var8 = 11;
                }
                if (var7 == 3) {
                    var8 = 12;
                }
                if (var7 == 4) {
                    var8 = 13;
                }
                if (var7 == 5) {
                    var8 = 1003;
                }
                int var10 = var2.method12543(var7);
                if (var10 != -1) {
                    var9 = var10;
                }
                Statics.addEntry(var6[var7], TextUtil.createColourTag(16776960) + var3, var6[var7].equalsIgnoreCase(LocalisedText.field6991.get(Statics.language)) ? var2.field7222 : var9, var8, -1, (long) arg0.slot, 0, 0, true, false, (long) arg0.slot, false);
            }
        }
        if (var2.field7248 != 1) {
            return;
        }
        for (int var11 = 0; var11 < var6.length; var11++) {
            if (var6[var11] != null && (var6[var11].equalsIgnoreCase(LocalisedText.field6991.get(Statics.language)) || var6[var11].equalsIgnoreCase(LocalisedText.field6874.get(Statics.language)))) {
                short var12 = 0;
                if (arg0.vislevel > Statics.localPlayerEntity.combatLevel) {
                    var12 = 2000;
                }
                short var13 = 0;
                int var14 = client.field9098;
                if (var11 == 0) {
                    var13 = 9;
                }
                if (var11 == 1) {
                    var13 = 10;
                }
                if (var11 == 2) {
                    var13 = 11;
                }
                if (var11 == 3) {
                    var13 = 12;
                }
                if (var11 == 4) {
                    var13 = 13;
                }
                if (var11 == 5) {
                    var13 = 1003;
                }
                if (var13 != 0) {
                    var13 += var12;
                }
                int var15 = var2.method12543(var11);
                if (var15 != -1) {
                    var14 = var15;
                }
                Statics.addEntry(var6[var11], TextUtil.createColourTag(16776960) + var3, var6[var11].equalsIgnoreCase(LocalisedText.field6991.get(Statics.language)) ? var2.field7222 : var14, var13, -1, (long) arg0.slot, 0, 0, true, false, (long) arg0.slot, false);
            }
        }
    }

    @ObfuscatedName("el.bc(Lew;II)Ljava/lang/String;")
    public static String getComponentOp(Component arg0, int arg1) {
        if (!client.getComponentEvents(arg0).isOpTransmitted(arg1) && arg0.op == null) {
            return null;
        } else if (arg0.field1852 == null || arg0.field1852.length <= arg1 || arg0.field1852[arg1] == null || arg0.field1852[arg1].trim().length() == 0) {
            return client.field9111 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field1852[arg1];
        }
    }

    @ObfuscatedName("dj.br(III)Ljava/lang/String;")
    public static String method2609(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return TextUtil.createColourTag(0xff0000);
        } else if (var2 < -6) {
            return TextUtil.createColourTag(0xff3000);
        } else if (var2 < -3) {
            return TextUtil.createColourTag(0xff7000);
        } else if (var2 < 0) {
            return TextUtil.createColourTag(0xffb000);
        } else if (var2 > 9) {
            return TextUtil.createColourTag(0xff00);
        } else if (var2 > 6) {
            return TextUtil.createColourTag(0x40ff00);
        } else if (var2 > 3) {
            return TextUtil.createColourTag(0x80ff00);
        } else if (var2 > 0) {
            return TextUtil.createColourTag(0xc0ff00);
        } else {
            return TextUtil.createColourTag(0xffff00);
        }
    }

    @ObfuscatedName("am.bi(IIII)Lada;")
    public static ClientMessage createMoveMessage(int arg0, int arg1, int arg2) {
        ClientMessage var3 = null;
        if (arg2 == 0) {
            var3 = ClientMessage.createMessage(ClientProt.MOVE_GAMECLICK, client.gameConnection.randomOut);
        }
        if (arg2 == 1) {
            var3 = ClientMessage.createMessage(ClientProt.MOVE_MINIMAPCLICK, client.gameConnection.randomOut);
        }
        CoordGrid var4 = client.world.getBase();
        var3.buf.p2(var4.z + arg1);
        var3.buf.p2_alt3(var4.x + arg0);
        var3.buf.p1(method3496() ? 1 : 0);
        MiniMap.mapFlagX = arg0;
        MiniMap.mapFlagZ = arg1;
        MiniMap.mapFlag = false;
        DelayedStateChange.onType15();
        return var3;
    }

    @ObfuscatedName("lu.bx(III)Z")
    public static boolean method5825(int arg0, int arg1) {
        if (arg1 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg0 >= 1000) {
            return arg1 >= 1000 && arg0 >= 1000;
        } else if (method11182(arg0)) {
            return true;
        } else {
            return !method11182(arg1);
        }
    }

    @ObfuscatedName("sm.bm(IB)Z")
    public static boolean method11182(int arg0) {
        return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
    }

    @ObfuscatedName("aju.bb(FFFFFFIB)F")
    public static float method16791(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        float var7 = 0.0F;
        float var8 = arg3 - arg0;
        float var9 = arg4 - arg1;
        float var10 = arg5 - arg2;
        float var11 = 0.0F;
        float var12 = 0.0F;
        float var13 = 0.0F;
        Scene var14 = client.world.getScene();
        while (var7 < 1.1F) {
            float var15 = var7 * var8 + arg0;
            float var16 = var7 * var9 + arg1;
            float var17 = var7 * var10 + arg2;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < client.world.getSizeX() && var19 < client.world.getSizeZ()) {
                int var20 = Statics.localPlayerEntity.level;
                if (var20 < 3 && (client.world.getSceneLevelTileFlags().levelTileFlags[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = var14.field4527[var20].getFineHeight((int) var15, (int) var17);
                if ((float) var21 < var16) {
                    if (arg6 >= 2) {
                        return var7 - 0.1F + method16791(var11, var12, var13, var15, var16, var17, arg6 - 1) * 0.1F;
                    }
                    return var7;
                }
            }
            var11 = var15;
            var12 = var16;
            var13 = var17;
            var7 += 0.1F;
        }
        return -1.0F;
    }
}
