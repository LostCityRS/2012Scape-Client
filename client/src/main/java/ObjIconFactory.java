import deob.ObfuscatedName;

import java.awt.Canvas;

@ObfuscatedName("ar")
public class ObjIconFactory {

    @ObfuscatedName("ar.a")
    public static IterableQueue requests = new IterableQueue();

    public ObjIconFactory() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ro.u(Lra;Lew;B)V")
    public static void ensureIconExists(RendererToolkit arg0, Component arg1) {
        boolean var2 = Statics.objTypes.getCachedIcon(arg0, arg1.invobject, arg1.invcount, arg1.outline, arg1.graphicshadow | 0xFF000000, arg1.invcountvis, arg1.invwearcol ? Statics.localPlayerEntity.model : null) == null;
        if (var2) {
            requests.addFirst(new ObjIconRequest(arg1.invobject, arg1.invcount, arg1.outline, arg1.graphicshadow | 0xFF000000, arg1.invcountvis, arg1.invwearcol));
            client.requestRedrawComponent(arg1);
        }
    }

    @ObfuscatedName("ta.j(Lra;I)V")
    public static void method185(RendererToolkit arg0) {
        if (requests.sizeBridged() == 0) {
            return;
        }

        if (Statics.options.field9661.getValue() == 0) {
            for (ObjIconRequest var1 = (ObjIconRequest) requests.last(); var1 != null; var1 = (ObjIconRequest) requests.method11567()) {
                Statics.objTypes.getIcon(arg0, arg0, var1.object, var1.count, var1.outline, var1.shadow, false, false, var1.countvis, Statics.field2163, var1.wearcol ? Statics.localPlayerEntity.model : null);
                var1.remove();
            }

            client.method1703();
        } else {
            if (Statics.softwareRenderer == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                Statics.softwareRenderer = RendererToolkit.create(0, var2, Statics.field8465, Statics.field2670, 0);
                Statics.softwareFont = Statics.softwareRenderer.createFont(FontMetrics.create(Statics.field8745, Statics.field551, 0), (PalettedSpriteData[]) SpriteDataProvider.get(Statics.field7387, Statics.field551, 0), true);
            }
            for (ObjIconRequest var3 = (ObjIconRequest) requests.last(); var3 != null; var3 = (ObjIconRequest) requests.method11567()) {
                Statics.objTypes.getIcon(Statics.softwareRenderer, arg0, var3.object, var3.count, var3.outline, var3.shadow, false, false, var3.countvis, Statics.softwareFont, var3.wearcol ? Statics.localPlayerEntity.model : null);
                var3.remove();
            }
        }
    }
}
