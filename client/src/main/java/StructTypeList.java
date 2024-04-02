
import deob.ObfuscatedName;

@ObfuscatedName("vi")
public class StructTypeList {

	@ObfuscatedName("vi.u")
	public final Js5 field7172;

	@ObfuscatedName("vi.j")
	public int field7171;

	@ObfuscatedName("vi.a")
	public StructType[] field7170;

	public StructTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
		this.field7172 = arg2;
		this.field7171 = this.field7172.method5637(class161.field1651.field1668);
		if (arg3) {
			this.field7170 = new StructType[this.field7171];
			for (int var5 = 0; var5 < this.field7171; var5++) {
				Js5 var6 = this.field7172;
				byte[] var7;
				synchronized (this.field7172) {
					var7 = this.field7172.method5627(class161.field1651.field1668, var5);
				}
				StructType var9 = new StructType();
				if (var7 != null) {
					var9.method16778(new Packet(var7));
				}
				this.field7170[var5] = var9;
			}
		}
	}

	@ObfuscatedName("vi.u(II)Laju;")
	public StructType method12383(int arg0) {
		return arg0 < 0 ? new StructType() : this.field7170[arg0];
	}
}
