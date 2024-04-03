import deob.ObfuscatedName;

@ObfuscatedName("ei")
public class ProgramData {

    @ObfuscatedName("ei.u")
    public String field1935;

    @ObfuscatedName("ei.j")
    public String field1933;

    @ObfuscatedName("ei.a")
    public String field1934;

    @ObfuscatedName("ei.s")
    public ProgramDefineData[] field1932;

    @ObfuscatedName("ei.c")
    public ProgramDefineData[] field1936;

    @ObfuscatedName("ei.u(Lef;B)V")
    public void method3216(ShaderDataReader arg0) {
        this.field1935 = arg0.method3295();
        this.field1933 = arg0.method3295();
        this.field1934 = arg0.method3295();
        int var2 = arg0.method3294();
        int var3 = arg0.method3294();
        this.field1932 = var2 == 0 ? null : new ProgramDefineData[var2];
        this.field1936 = var3 == 0 ? null : new ProgramDefineData[var3];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1932[var4] = new ProgramDefineData();
            this.field1932[var4].method3313(arg0);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            this.field1936[var5] = new ProgramDefineData();
            this.field1936[var5].method3313(arg0);
        }
    }
}
