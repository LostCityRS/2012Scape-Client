
import deob.ObfuscatedName;

@ObfuscatedName("fw")
public class CameraTrackableType {

	@ObfuscatedName("fw.u")
	public static final CameraTrackableType field2216 = new CameraTrackableType(0);

	@ObfuscatedName("fw.j")
	public static final CameraTrackableType field2217 = new CameraTrackableType(1);

	@ObfuscatedName("fw.a")
	public int field2215;

	public CameraTrackableType(int arg0) {
		this.field2215 = arg0;
	}

	@ObfuscatedName("jm.u(II)Lfw;")
	public static CameraTrackableType method4728(int arg0) {
		if (field2216.field2215 == arg0) {
			return field2216;
		} else if (field2217.field2215 == arg0) {
			return field2217;
		} else {
			return null;
		}
	}
}
