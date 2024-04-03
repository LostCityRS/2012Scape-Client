import deob.ObfuscatedName;

@ObfuscatedName("wf")
public class NPCTypeCustomisation {

    @ObfuscatedName("wf.u")
    public long field7203;

    @ObfuscatedName("wf.j")
    public int[] field7204;

    @ObfuscatedName("wf.a")
    public short[] field7205;

    @ObfuscatedName("wf.s")
    public short[] field7206;

    public NPCTypeCustomisation(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field7203 = arg0;
        this.field7204 = arg1;
        this.field7205 = arg2;
        this.field7206 = arg3;
    }

    public NPCTypeCustomisation(NPCType arg0, boolean arg1) {
        if (arg1) {
            this.field7204 = new int[arg0.field7214.length];
            System.arraycopy(arg0.field7214, 0, this.field7204, 0, this.field7204.length);
        } else {
            this.field7204 = new int[arg0.field7215.length];
            System.arraycopy(arg0.field7215, 0, this.field7204, 0, this.field7204.length);
        }
        if (arg0.field7267 != null) {
            this.field7205 = new short[arg0.field7267.length];
            System.arraycopy(arg0.field7267, 0, this.field7205, 0, this.field7205.length);
        }
        if (arg0.field7270 != null) {
            this.field7206 = new short[arg0.field7270.length];
            System.arraycopy(arg0.field7270, 0, this.field7206, 0, this.field7206.length);
        }
    }
}
