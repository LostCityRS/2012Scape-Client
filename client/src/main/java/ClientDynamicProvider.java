import deob.ObfuscatedName;

@ObfuscatedName("im")
public class ClientDynamicProvider implements QuickChatDynamicProvider {

    @ObfuscatedName("im.u(Lqz;[IJ)Ljava/lang/String;")
    public String method4638(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
        if (QuickChatDynamicCommand.field5031 == arg0) {
            EnumType var5 = Statics.field1244.method12116(arg1[0]);
            return var5.method12120((int) arg2);
        } else if (QuickChatDynamicCommand.field5017 == arg0 || QuickChatDynamicCommand.field5023 == arg0) {
            ObjType var6 = client.objTypes.get((int) arg2);
            return var6.name;
        } else if (QuickChatDynamicCommand.field5019 == arg0 || QuickChatDynamicCommand.field5020 == arg0 || QuickChatDynamicCommand.field5024 == arg0) {
            return Statics.field1244.method12116(arg1[0]).method12120((int) arg2);
        } else {
            return null;
        }
    }
}
