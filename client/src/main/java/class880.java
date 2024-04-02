
import deob.ObfuscatedName;
import java.io.File;
import javax.swing.filechooser.FileFilter;

@ObfuscatedName("agt")
public class class880 extends FileFilter {

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
