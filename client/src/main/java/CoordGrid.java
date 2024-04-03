import deob.ObfuscatedName;

@ObfuscatedName("pz")
public class CoordGrid {

    @ObfuscatedName("pz.u")
    public int level;

    @ObfuscatedName("pz.j")
    public int x;

    @ObfuscatedName("pz.a")
    public int z;

    public CoordGrid() {
        this.level = -1;
    }

    public CoordGrid(int level, int x, int z) {
        this.level = level;
        this.x = x;
        this.z = z;
    }

    public CoordGrid(int packed) {
        if (packed == -1) {
            this.level = -1;
        } else {
            this.level = packed >> 28 & 0x3;
            this.x = packed >> 14 & 0x3FFF;
            this.z = packed & 0x3FFF;
        }
    }

    public String toString() {
        return this.level + "," + (this.x >> 6) + "," + (this.z >> 6) + "," + (this.x & 0x3F) + "," + (this.z & 0x3F);
    }
}
