import deob.ObfuscatedName;

@ObfuscatedName("d")
public class ClientCameraTrackableProvider implements CameraTrackableProvider {

    @ObfuscatedName("d.u(Lfw;II)Lfs;")
    public CameraTrackable method1355(CameraTrackableType arg0, int arg1) {
        if (CameraTrackableType.field2216 == arg0) {
            return client.field9070[arg1];
        }
        if (CameraTrackableType.field2217 == arg0) {
            ObjectNode var3 = (ObjectNode) client.field8964.method11923((long) arg1);
            if (var3 != null) {
                return (CameraTrackable) var3.field9550;
            }
        }
        return null;
    }
}
