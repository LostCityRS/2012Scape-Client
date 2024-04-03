import deob.ObfuscatedName;

@ObfuscatedName("dy")
public class ScreenBoundingBox {

    @ObfuscatedName("dy.u")
    public boolean field1521 = false;

    @ObfuscatedName("dy.j")
    public int field1516;

    @ObfuscatedName("dy.a")
    public int field1518;

    @ObfuscatedName("dy.s")
    public int field1519;

    @ObfuscatedName("dy.c")
    public int field1520;

    @ObfuscatedName("dy.m")
    public int field1517;

    @ObfuscatedName("dy.u(II)Z")
    public boolean method2795(int arg0, int arg1) {
        if (!this.field1521) {
            return false;
        }
        int var3 = this.field1519 - this.field1516;
        int var4 = this.field1520 - this.field1518;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1518 * var4 + this.field1516 * var3);
        if (var6 <= 0) {
            int var7 = this.field1516 - arg0;
            int var8 = this.field1518 - arg1;
            return var7 * var7 + var8 * var8 < this.field1517 * this.field1517;
        } else if (var6 > var5) {
            int var9 = this.field1519 - arg0;
            int var10 = this.field1520 - arg1;
            return var9 * var9 + var10 * var10 < this.field1517 * this.field1517;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1516 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1518 - arg1;
            return var12 * var12 + var13 * var13 < this.field1517 * this.field1517;
        }
    }
}
