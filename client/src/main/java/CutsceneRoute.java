import deob.ObfuscatedName;

@ObfuscatedName("dq")
public class CutsceneRoute {

    @ObfuscatedName("dq.a")
    public final int[] field1569;

    @ObfuscatedName("dq.s")
    public final int[] field1570;

    public CutsceneRoute(Packet arg0) {
        int var2 = arg0.method15277();
        this.field1569 = new int[var2];
        this.field1570 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = arg0.method15220();
            this.field1569[var3] = var4;
            int var5 = arg0.method15239();
            int var6 = arg0.method15239();
            this.field1570[var3] = (var5 << 16) + var6;
        }
    }

    @ObfuscatedName("dq.u(Ldn;IS)V")
    public void method2891(CutsceneEntity arg0, int arg1) {
        int var3 = this.field1570[0];
        arg0.method2853(arg1, var3 >>> 16, var3 & 0xFFFF);
        PathingEntity var4 = arg0.method2854();
        var4.field8628 = 0;
        for (int var5 = this.field1569.length - 1; var5 >= 0; var5--) {
            int var6 = this.field1569[var5];
            int var7 = this.field1570[var5];
            var4.field8642[var4.field8628] = var7 >> 16;
            var4.field8643[var4.field8628] = var7 & 0xFFFF;
            byte var8 = MoveSpeed.field3921.field3924;
            if (var6 == 0) {
                var8 = MoveSpeed.field3920.field3924;
            } else if (var6 == 2) {
                var8 = MoveSpeed.field3922.field3924;
            }
            var4.field8645[var4.field8628] = var8;
            var4.field8628++;
        }
    }
}
