import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("ahz")
public class class893 extends class675 {

    @ObfuscatedName("ahz.u")
    public final GlToolkit field9946;

    @ObfuscatedName("ahz.j")
    public final Canvas field9941;

    @ObfuscatedName("ahz.a")
    public final OpenGL field9943;

    @ObfuscatedName("ahz.s")
    public final long field9944;

    @ObfuscatedName("ahz.c")
    public int field9945;

    @ObfuscatedName("ahz.m")
    public int field9942;

    @ObfuscatedName("ahz.t")
    public boolean field9947;

    public class893(GlToolkit arg0, Canvas arg1) {
        this(arg0, arg1, arg0.field8079.prepareSurface(arg1));
    }

    public class893(GlToolkit arg0, Canvas arg1, long arg2) {
        this.field9947 = false;
        this.field9946 = arg0;
        this.field9941 = arg1;
        this.field9943 = arg0.field8079;
        this.field9944 = arg2;
        this.method16013();
    }

    @ObfuscatedName("ahz.u()I")
    public int method921() {
        return this.field9945;
    }

    @ObfuscatedName("ahz.j()I")
    public int method922() {
        return this.field9942;
    }

    @ObfuscatedName("ahz.ar(II)V")
    public void method923(int arg0, int arg1) {
        if (this.field9947) {
            throw new IllegalStateException();
        }
        this.field9943.surfaceResized(this.field9944);
        this.method16013();
        if (this.field9946.method457() == this) {
            this.field9946.method13270();
        }
    }

    @ObfuscatedName("ahz.n()V")
    public void method16013() {
        Dimension var1 = this.field9941.getSize();
        this.field9942 = var1.height;
        this.field9945 = var1.width;
    }

    @ObfuscatedName("ahz.ay()I")
    public int method918() {
        if (this.field9947) {
            throw new IllegalStateException();
        }
        this.field9943.swapBuffers(this.field9944);
        return 0;
    }

    @ObfuscatedName("ahz.af(II)I")
    public int method919(int arg0, int arg1) {
        return 0;
    }

    @ObfuscatedName("ahz.s()Z")
    public boolean method954() {
        if (this.field9947) {
            throw new IllegalStateException();
        }
        this.field9943.setSurface(this.field9944);
        this.field9946.method13462();
        return true;
    }

    @ObfuscatedName("ahz.c()Z")
    public boolean method925() {
        return true;
    }

    @ObfuscatedName("ahz.a()V")
    public void method944() {
        if (this.field9947) {
            throw new IllegalStateException();
        }
        this.field9943.releaseSurface(this.field9941, this.field9944);
        this.field9947 = true;
    }
}
