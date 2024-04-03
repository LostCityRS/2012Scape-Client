import deob.ObfuscatedName;

@ObfuscatedName("aco")
public class AnimBase extends Node {

    @ObfuscatedName("aco.q")
    public int field9357;

    @ObfuscatedName("aco.p")
    public int field9362;

    @ObfuscatedName("aco.w")
    public int[] field9365;

    @ObfuscatedName("aco.b")
    public int[][] field9364;

    @ObfuscatedName("aco.x")
    public boolean[] field9361;

    @ObfuscatedName("aco.i")
    public int[] field9352;

    public AnimBase(int arg0, byte[] arg1) {
        this.field9357 = arg0;
        Packet var3 = new Packet(arg1);
        this.field9362 = var3.method15239();
        this.field9365 = new int[this.field9362];
        this.field9364 = new int[this.field9362][];
        this.field9361 = new boolean[this.field9362];
        this.field9352 = new int[this.field9362];
        for (int var4 = 0; var4 < this.field9362; var4++) {
            this.field9365[var4] = var3.method15220();
            if (this.field9365[var4] == 6) {
                this.field9365[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field9362; var5++) {
            this.field9361[var5] = var3.method15220() == 1;
        }
        for (int var6 = 0; var6 < this.field9362; var6++) {
            this.field9352[var6] = var3.method15239();
        }
        for (int var7 = 0; var7 < this.field9362; var7++) {
            this.field9364[var7] = new int[var3.method15277()];
        }
        for (int var8 = 0; var8 < this.field9362; var8++) {
            for (int var9 = 0; var9 < this.field9364[var8].length; var9++) {
                this.field9364[var8][var9] = var3.method15277();
            }
        }
    }
}
