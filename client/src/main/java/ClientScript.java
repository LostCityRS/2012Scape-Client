import deob.ObfuscatedName;

@ObfuscatedName("ajg")
public class ClientScript extends SecondaryNode {

    @ObfuscatedName("ajg.t")
    public ClientTriggerType trigger;

    @ObfuscatedName("ajg.l")
    public String name;

    @ObfuscatedName("ajg.f")
    public ClientScriptCommand[] instructions;

    @ObfuscatedName("ajg.d")
    public int[] intOperands;

    @ObfuscatedName("ajg.z")
    public Object[] objectOperands;

    @ObfuscatedName("ajg.n")
    public long[] longOperands;

    @ObfuscatedName("ajg.o")
    public int intLocalCount;

    @ObfuscatedName("ajg.q")
    public int objectLocalCount;

    @ObfuscatedName("ajg.p")
    public int longLocalCount;

    @ObfuscatedName("ajg.w")
    public int intArgCount;

    @ObfuscatedName("ajg.b")
    public int objectArgCount;

    @ObfuscatedName("ajg.x")
    public int longArgCount;

    @ObfuscatedName("ajg.i")
    public HashTable[] switches;

    public ClientScript(Packet buf) {
        int var2 = this.decodeHeader(buf);
        int var3 = 0;
        ClientScriptCommand[] all = ClientScriptCommand.values();
        while (buf.pos < var2) {
            ClientScriptCommand command = this.readCommand(buf, all);
            this.decodeInstruction(buf, var3, command);
            var3++;
        }
    }

    @ObfuscatedName("ajg.u(Laet;[Lsd;I)Lsd;")
    public ClientScriptCommand readCommand(Packet buf, ClientScriptCommand[] all) {
        int id = buf.g2();
        if (id < 0 || id >= all.length) {
            throw new RuntimeException("");
        }
        return ClientScriptCommand.TRANSLATE_BY_ID[id]; // all[id];
    }

    @ObfuscatedName("ajg.j(Laet;S)I")
    public int decodeHeader(Packet buf) {
        buf.pos = buf.data.length - 2;
        int var2 = buf.g2();
        int var3 = buf.data.length - 2 - var2 - 16;
        buf.pos = var3;
        int var4 = buf.g4s();
        this.intLocalCount = buf.g2();
        this.objectLocalCount = buf.g2();
        this.longLocalCount = buf.g2();
        this.intArgCount = buf.g2();
        this.objectArgCount = buf.g2();
        this.longArgCount = buf.g2();
        int var5 = buf.g1();
        if (var5 > 0) {
            this.switches = new HashTable[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = buf.g2();
                HashTable var8 = new HashTable(IntMath.method2839(var7));
                this.switches[var6] = var8;
                while (var7-- > 0) {
                    int var9 = buf.g4s();
                    int var10 = buf.g4s();
                    var8.put(new IntNode(var10), (long) var9);
                }
            }
        }
        buf.pos = 0;
        this.name = buf.fastgstr();
        this.instructions = new ClientScriptCommand[var4];
        return var3;
    }

    @ObfuscatedName("ajg.a(Laet;ILsd;I)V")
    public void decodeInstruction(Packet arg0, int arg1, ClientScriptCommand arg2) {
        int var4 = this.instructions.length;
        if (ClientScriptCommand.PUSH_CONSTANT_STRING == arg2) {
            if (this.objectOperands == null) {
                this.objectOperands = new String[var4];
            }
            this.objectOperands[arg1] = arg0.gjstr().intern();
        } else if (ClientScriptCommand.PUSH_CONSTANT_LONG == arg2) {
            if (this.longOperands == null) {
                this.longOperands = new long[var4];
            }
            this.longOperands[arg1] = arg0.g8();
        } else {
            if (this.intOperands == null) {
                this.intOperands = new int[var4];
            }
            if (arg2.field6315) {
                this.intOperands[arg1] = arg0.g4s();
            } else {
                this.intOperands[arg1] = arg0.g1();
            }
        }
        this.instructions[arg1] = arg2;
    }
}
