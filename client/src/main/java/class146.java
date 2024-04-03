import deob.ObfuscatedName;

@ObfuscatedName("dr")
public class class146 {

    @ObfuscatedName("dr.u")
    public final int[] field1546;

    @ObfuscatedName("dr.j")
    public final int[] field1545;

    @ObfuscatedName("dr.a")
    public final int[] field1544;

    @ObfuscatedName("dr.s")
    public final int[] field1547;

    @ObfuscatedName("dr.c")
    public final int[] field1548;

    @ObfuscatedName("dr.m")
    public final int[] field1549;

    @ObfuscatedName("dr.t")
    public final int[] field1550;

    public class146(Packet arg0) {
        int var2 = arg0.method15277();
        this.field1546 = new int[var2];
        this.field1545 = new int[var2];
        this.field1544 = new int[var2];
        this.field1547 = new int[var2];
        this.field1548 = new int[var2];
        this.field1549 = new int[var2];
        this.field1550 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1546[var3] = arg0.method15239() - 5120;
            this.field1544[var3] = arg0.method15239() - 5120;
            this.field1545[var3] = arg0.method15240();
            this.field1548[var3] = arg0.method15239() - 5120;
            this.field1550[var3] = arg0.method15239() - 5120;
            this.field1549[var3] = arg0.method15240();
            this.field1547[var3] = arg0.method15240();
        }
    }

    @ObfuscatedName("dr.u(II)V")
    public void method2821(int arg0) {
        int[][] var2 = new int[this.field1546.length << 1][4];
        for (int var3 = 0; var3 < this.field1546.length; var3++) {
            var2[var3 * 2][0] = this.field1546[var3];
            var2[var3 * 2][1] = this.field1545[var3];
            var2[var3 * 2][2] = this.field1544[var3];
            var2[var3 * 2][3] = this.field1547[var3];
            var2[var3 * 2 + 1][0] = this.field1548[var3];
            var2[var3 * 2 + 1][1] = this.field1549[var3];
            var2[var3 * 2 + 1][2] = this.field1550[var3];
            var2[var3 * 2 + 1][3] = this.field1547[var3];
        }
        client.field9076[arg0] = var2;
    }
}
