import deob.ObfuscatedName;

@ObfuscatedName("md")
public class SoundBank {

    @ObfuscatedName("md.u")
    public Js5 synthArchive;

    @ObfuscatedName("md.j")
    public Js5 vorbisArchive;

    @ObfuscatedName("md.a")
    public HashTable vorbisCache = new HashTable(256);

    @ObfuscatedName("md.s")
    public HashTable vorbisPacketCache = new HashTable(256);

    @ObfuscatedName("md.c")
    public HashTable synthPacketCache = new HashTable(256);

    public SoundBank(Js5 arg0, Js5 arg1) {
        this.synthArchive = arg0;
        this.vorbisArchive = arg1;
    }

    @ObfuscatedName("md.u(II[II)Lalu;")
    public SynthSoundPacket getSynthSound(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        SynthSoundPacket var8 = (SynthSoundPacket) this.synthPacketCache.get(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            SynthSound var9 = SynthSound.method6466(this.synthArchive, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            SynthSoundPacket var10 = var9.toSoundPacket();
            this.synthPacketCache.put(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.samples.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("md.j(II[II)Laly;")
    public VorbisSoundPacket getVorbisSound(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        VorbisSoundPacket var8 = (VorbisSoundPacket) this.vorbisPacketCache.get(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            VorbisSound var9 = (VorbisSound) this.vorbisCache.get(var6);
            if (var9 == null) {
                var9 = VorbisSound.method15065(this.vorbisArchive, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.vorbisCache.put(var9, var6);
            }
            VorbisSoundPacket var10 = var9.method15099();
            if (var10 == null) {
                return null;
            } else {
                var9.unlink();
                this.vorbisPacketCache.put(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("md.a(I[II)Lalu;")
    public SynthSoundPacket getSynthSound(int arg0, int[] arg1) {
        if (this.synthArchive.capacity() == 1) {
            return this.getSynthSound(0, arg0, arg1);
        } else if (this.synthArchive.getGroupCapacity(arg0) == 1) {
            return this.getSynthSound(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("md.s(I[II)Laly;")
    public VorbisSoundPacket getVorbisSound(int arg0, int[] arg1) {
        if (this.vorbisArchive.capacity() == 1) {
            return this.getVorbisSound(0, arg0, arg1);
        } else if (this.vorbisArchive.getGroupCapacity(arg0) == 1) {
            return this.getVorbisSound(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
