
import deob.ObfuscatedName;
import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

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
		Container var1 = class385.method16494();
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
}
