
import deob.ObfuscatedName;
import java.util.HashMap;

@ObfuscatedName("sm")
public class SerializableEnums {

	static {
		new HashMap();
	}

	public SerializableEnums() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qm.u([Lsy;IB)Lsy;")
	public static SerializableEnum method8032(SerializableEnum[] arg0, int arg1) {
		SerializableEnum[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			SerializableEnum var4 = var2[var3];
			if (arg1 == var4.method6339()) {
				return var4;
			}
		}
		return null;
	}
}
