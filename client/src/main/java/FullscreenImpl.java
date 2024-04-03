import deob.ObfuscatedName;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

@ObfuscatedName("ub")
public class FullscreenImpl {

    @ObfuscatedName("ub.u")
    public GraphicsDevice field6703;

    @ObfuscatedName("ub.j")
    public DisplayMode field6704;

    public FullscreenImpl() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field6703 = var1.getDefaultScreenDevice();
        if (!this.field6703.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field6703 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @ObfuscatedName("ub.u(I)[I")
    public int[] method11883() {
        DisplayMode[] var1 = this.field6703.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @ObfuscatedName("ub.j(Ljava/awt/Frame;IIIII)V")
    public void method11884(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6704 = this.field6703.getDisplayMode();
        if (this.field6704 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method11886(arg0);
        if (arg4 == 0) {
            int var6 = this.field6704.getRefreshRate();
            DisplayMode[] var7 = this.field6703.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && var7[var9].getHeight() == arg2 && var7[var9].getBitDepth() == arg3) {
                    int var10 = var7[var9].getRefreshRate();
                    if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                        arg4 = var10;
                        var8 = true;
                    }
                }
            }
            if (!var8) {
                arg4 = var6;
            }
        }
        this.field6703.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("ub.a(I)V")
    public void method11885() {
        if (this.field6704 != null) {
            DisplayMode[] var1 = this.field6703.getDisplayModes();
            boolean var2 = false;
            DisplayMode[] var3 = var1;
            for (int var4 = 0; var4 < var3.length; var4++) {
                DisplayMode var5 = var3[var4];
                if (var5.equals(this.field6704)) {
                    this.field6703.setDisplayMode(this.field6704);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                try {
                    Field var6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
                    var6.setAccessible(true);
                    var6.set(this.field6703, null);
                } catch (Throwable var8) {
                }
            }
            this.field6704 = null;
        }
        this.method11886(null);
    }

    @ObfuscatedName("ub.s(Ljava/awt/Frame;I)V")
    public void method11886(Frame arg0) {
        boolean var2 = false;
        try {
            Field var3 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var3.setAccessible(true);
            boolean var4 = (Boolean) var3.get(this.field6703);
            if (var4) {
                var3.set(this.field6703, Boolean.FALSE);
                var2 = true;
            }
        } catch (Throwable var16) {
        }
        try {
            this.field6703.setFullScreenWindow(arg0);
        } finally {
            if (var2) {
                try {
                    Field var9 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var9.set(this.field6703, Boolean.TRUE);
                } catch (Throwable var15) {
                }
            }
        }
    }
}
