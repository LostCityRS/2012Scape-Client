import deob.ObfuscatedName;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;

@ObfuscatedName("an")
public class class53 implements Runnable {

    @ObfuscatedName("an.u")
    public String field675;

    @ObfuscatedName("an.j")
    public boolean field676;

    @ObfuscatedName("an.a")
    public File field677 = null;

    @ObfuscatedName("an.s")
    public boolean field678 = false;

    public class53(String arg0, boolean arg1) {
        this.field675 = arg0;
        this.field676 = arg1;
        (new Thread(this)).start();
    }

    public void run() {
        Container var1 = GameShell.method16494();
        Frame var2 = null;
        if (Statics.field1197 == null) {
            while (var1 != null) {
                if (var1 instanceof Frame) {
                    var2 = (Frame) var1;
                    break;
                }
                var1 = var1.getParent();
            }
        } else {
            var2 = Statics.field1197;
        }
        if (var2 == null) {
            throw new RuntimeException("");
        }
        JFileChooser var3 = new JFileChooser("");
        var3.setDialogTitle(this.field675);
        var3.setFileFilter(new class880(this, this));
        var3.setFileSelectionMode(1);
        var3.setAcceptAllFileFilterUsed(false);
        int var4 = var3.showOpenDialog(var2);
        if (var4 == 0) {
            this.field677 = var3.getSelectedFile();
        }
        this.field678 = true;
    }

    @ObfuscatedName("an.u(I)Ljava/io/File;")
    public File method1705() {
        return this.field677;
    }

    @ObfuscatedName("an.j(S)Z")
    public boolean method1706() {
        return this.field678;
    }

    @ObfuscatedName("an.a(I)Z")
    public boolean method1710() {
        return this.field676;
    }

    @ObfuscatedName("agt")
    public static class class880 extends FileFilter {

        // $FF: synthetic field
        public final class53 this$0;

        @ObfuscatedName("agt.u")
        public class53 field9907;

        public class880(class53 arg0, class53 arg1) {
            this.this$0 = arg0;
            this.field9907 = arg1;
        }

        public boolean accept(File arg0) {
            if (this.field9907.method1710() && arg0.isDirectory()) {
                return true;
            } else {
                return !this.field9907.method1710();
            }
        }

        public String getDescription() {
            return null;
        }
    }
}
