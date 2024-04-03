import deob.ObfuscatedName;

@ObfuscatedName("acm")
public class Headbar extends Link {

    @ObfuscatedName("acm.a")
    public HeadbarType field9268;

    @ObfuscatedName("acm.s")
    public LinkQueue field9267 = new LinkQueue();

    public Headbar(HeadbarType arg0) {
        this.field9268 = arg0;
    }

    @ObfuscatedName("acm.a(IIIII)V")
    public void method14733(int arg0, int arg1, int arg2, int arg3) {
        HeadbarUpdate var5 = null;
        int var6 = 0;
        for (HeadbarUpdate var7 = (HeadbarUpdate) this.field9267.method11649(); var7 != null; var7 = (HeadbarUpdate) this.field9267.method11644()) {
            var6++;
            if (var7.field9271 == arg0) {
                var7.method14744(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field9271 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            LinkQueue.method1968(new HeadbarUpdate(arg0, arg1, arg2, arg3), var5);
            if (var6 >= Statics.field4825.field5151) {
                this.field9267.method11649().method6975();
            }
        } else if (var6 < Statics.field4825.field5151) {
            this.field9267.method11641(new HeadbarUpdate(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("acm.s(II)Lacr;")
    public HeadbarUpdate method14734(int arg0) {
        HeadbarUpdate var2 = (HeadbarUpdate) this.field9267.method11649();
        if (var2 == null || var2.field9271 > arg0) {
            return null;
        }
        for (HeadbarUpdate var3 = (HeadbarUpdate) this.field9267.method11644(); var3 != null && var3.field9271 <= arg0; var3 = (HeadbarUpdate) this.field9267.method11644()) {
            var2.method6975();
            var2 = var3;
        }
        if (this.field9268.field4445 + var2.field9272 + var2.field9271 > arg0) {
            return var2;
        } else {
            var2.method6975();
            return null;
        }
    }

    @ObfuscatedName("acm.c(I)Z")
    public boolean method14735() {
        return this.field9267.method11647();
    }
}
