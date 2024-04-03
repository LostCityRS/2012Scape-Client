import deob.ObfuscatedName;

@ObfuscatedName("ey")
public class ProgramUniformData {

    @ObfuscatedName("ey.u")
    public UniformType field2095;

    @ObfuscatedName("ey.j")
    public UniformType field2091;

    @ObfuscatedName("ey.a")
    public int field2092 = -1;

    @ObfuscatedName("ey.s")
    public String field2093;

    @ObfuscatedName("ey.c")
    public String field2094;

    @ObfuscatedName("ey.m")
    public int[] field2090;

    @ObfuscatedName("ey.t")
    public int[] field2096;

    @ObfuscatedName("ey.u(Lef;B)V")
    public void method3468(ShaderDataReader arg0) {
        int var2 = arg0.method3294();
        this.field2095 = UniformType.method12201()[var2];
        if (UniformType.field1977 == this.field2095) {
            int var3 = arg0.method3294();
            this.field2091 = UniformType.method12201()[var3];
            this.field2092 = arg0.method3294();
        }
        this.field2093 = arg0.method3295();
        this.field2094 = arg0.method3295();
        int var4 = arg0.method3294();
        this.field2090 = new int[var4];
        this.field2096 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            this.field2090[var5] = arg0.method3294();
            this.field2096[var5] = arg0.method3294();
        }
    }
}
