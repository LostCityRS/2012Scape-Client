import deob.ObfuscatedName;

@ObfuscatedName("qg")
public class QuestTypeList {

    @ObfuscatedName("qg.u")
    public final Js5 field5054;

    @ObfuscatedName("qg.j")
    public int field5053;

    @ObfuscatedName("qg.a")
    public QuestType[] field5055;

    public QuestTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
        this.field5054 = arg2;
        if (this.field5054 == null) {
            this.field5053 = 0;
        } else {
            this.field5053 = this.field5054.getGroupCapacity(Js5ConfigGroup.QUESTTYPE.field1668);
        }
        if (arg3) {
            this.field5055 = new QuestType[this.field5053];
            for (int var5 = 0; var5 < this.field5053; var5++) {
                Js5 var6 = this.field5054;
                byte[] var7;
                synchronized (this.field5054) {
                    var7 = this.field5054.fetchFile(Js5ConfigGroup.QUESTTYPE.field1668, var5);
                }
                QuestType var9 = new QuestType();
                if (var7 != null) {
                    var9.method8412(new Packet(var7));
                }
                var9.method8438();
                this.field5055[var5] = var9;
                this.field5055[var5].field5064 = this;
            }
        }
    }

    @ObfuscatedName("qg.u(IB)Lqb;")
    public QuestType method8401(int arg0) {
        return this.field5055[arg0];
    }

    @ObfuscatedName("qg.j(Lug;B)I")
    public int method8402(VarIntDomain arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5053; var3++) {
            QuestType var4 = this.method8401(var3);
            if (var4.method8429(arg0)) {
                var2 += var4.field5065;
            }
        }
        return var2;
    }
}
