import deob.ObfuscatedName;

import java.awt.Canvas;

@ObfuscatedName("ar")
public class ObjIconFactory {

    @ObfuscatedName("ar.a")
    public static IterableQueue field671 = new IterableQueue();

    public ObjIconFactory() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ro.u(Lra;Lew;B)V")
    public static void method8730(RendererToolkit arg0, Component arg1) {
        boolean var2 = Statics.objTypes.method12293(arg0, arg1.invobject, arg1.field1904, arg1.field1800, arg1.field1801 | 0xFF000000, arg1.field1823, arg1.field1913 ? Statics.localPlayerEntity.field10044 : null) == null;
        if (var2) {
            field671.method11558(new ObjIconRequest(arg1.invobject, arg1.field1904, arg1.field1800, arg1.field1801 | 0xFF000000, arg1.field1823, arg1.field1913));
            client.requestRedrawComponent(arg1);
        }
    }

    @ObfuscatedName("ta.j(Lra;I)V")
    public static void method185(RendererToolkit arg0) {
        if (field671.method11613() == 0) {
            return;
        }
        if (Statics.options.field9661.method15781() == 0) {
            for (ObjIconRequest var1 = (ObjIconRequest) field671.method11563(); var1 != null; var1 = (ObjIconRequest) field671.method11567()) {
                Statics.objTypes.method12294(arg0, arg0, var1.field9309, var1.field9304, var1.field9305, var1.field9307, false, false, var1.field9308, Statics.field2163, var1.field9306 ? Statics.localPlayerEntity.field10044 : null);
                var1.method6979();
            }
            client.method1703();
            return;
        }
        if (Statics.field672 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            Statics.field672 = RendererToolkit.method11222(0, var2, Statics.field8465, Statics.field2670, 0);
            Statics.field673 = Statics.field672.method712(FontMetrics.method12156(Statics.field8745, Statics.field551, 0), (PalettedSpriteData[]) SpriteDataProvider.method2591(Statics.field7387, Statics.field551, 0), true);
        }
        for (ObjIconRequest var3 = (ObjIconRequest) field671.method11563(); var3 != null; var3 = (ObjIconRequest) field671.method11567()) {
            Statics.objTypes.method12294(Statics.field672, arg0, var3.field9309, var3.field9304, var3.field9305, var3.field9307, false, false, var3.field9308, Statics.field673, var3.field9306 ? Statics.localPlayerEntity.field10044 : null);
            var3.method6979();
        }
    }
}
