import deob.ObfuscatedName;

@ObfuscatedName("em")
public class ShaderData {

    @ObfuscatedName("em.u")
    public String field2086;

    @ObfuscatedName("em.s")
    public ProgramUniformData[] field2088;

    @ObfuscatedName("em.c")
    public ProgramUniformData[] field2082;

    @ObfuscatedName("em.m")
    public ProgramData[] field2087;

    public ShaderData(byte[] arg0) throws ShaderDataException {
        this.method3456(arg0);
    }

    @ObfuscatedName("em.u([BI)V")
    public void method3456(byte[] arg0) throws ShaderDataException {
        ShaderDataReader var2 = new ShaderDataReader(arg0);
        int var3 = var2.method3294();
        if (var3 != 4) {
            throw new ShaderDataException(this, var3, 4);
        }
        this.field2086 = var2.method3295();
        this.field2088 = new ProgramUniformData[var2.method3294()];
        this.field2082 = new ProgramUniformData[var2.method3294()];
        this.field2087 = new ProgramData[var2.method3294()];
        for (int var4 = 0; var4 < this.field2088.length; var4++) {
            this.field2088[var4] = new ProgramUniformData();
            this.field2088[var4].method3468(var2);
        }
        for (int var5 = 0; var5 < this.field2082.length; var5++) {
            this.field2082[var5] = new ProgramUniformData();
            this.field2082[var5].method3468(var2);
        }
        for (int var6 = 0; var6 < this.field2087.length; var6++) {
            this.field2087[var6] = new ProgramData();
            this.field2087[var6].method3216(var2);
        }
    }

    @ObfuscatedName("agz")
    public static class ShaderDataException extends Exception {

        // $FF: synthetic field
        public final ShaderData this$0;

        public ShaderDataException(ShaderData arg0, int arg1, int arg2) {
            super("");
            this.this$0 = arg0;
        }
    }
}
