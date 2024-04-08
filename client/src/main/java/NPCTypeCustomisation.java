import deob.ObfuscatedName;

@ObfuscatedName("wf")
public class NPCTypeCustomisation {

    @ObfuscatedName("wf.u")
    public long uid;

    @ObfuscatedName("wf.j")
    public int[] models;

    @ObfuscatedName("wf.a")
    public short[] recol;

    @ObfuscatedName("wf.s")
    public short[] retex;

    public NPCTypeCustomisation(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.uid = arg0;
        this.models = arg1;
        this.recol = arg2;
        this.retex = arg3;
    }

    public NPCTypeCustomisation(NPCType arg0, boolean arg1) {
        if (arg1) {
            this.models = new int[arg0.model.length];
            System.arraycopy(arg0.model, 0, this.models, 0, this.models.length);
        } else {
            this.models = new int[arg0.headmodel.length];
            System.arraycopy(arg0.headmodel, 0, this.models, 0, this.models.length);
        }
        if (arg0.recol_d != null) {
            this.recol = new short[arg0.recol_d.length];
            System.arraycopy(arg0.recol_d, 0, this.recol, 0, this.recol.length);
        }
        if (arg0.retex_d != null) {
            this.retex = new short[arg0.retex_d.length];
            System.arraycopy(arg0.retex_d, 0, this.retex, 0, this.retex.length);
        }
    }
}
