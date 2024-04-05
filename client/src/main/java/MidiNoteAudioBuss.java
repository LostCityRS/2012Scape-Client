import deob.ObfuscatedName;

@ObfuscatedName("aij")
public class MidiNoteAudioBuss extends AudioBuss {

    @ObfuscatedName("aij.l")
    public MidiAudioBuss parent;

    @ObfuscatedName("aij.f")
    public LinkedList notes = new LinkedList();

    @ObfuscatedName("aij.d")
    public MixerAudioBuss mixer = new MixerAudioBuss();

    public MidiNoteAudioBuss(MidiAudioBuss arg0) {
        this.parent = arg0;
    }

    @ObfuscatedName("aij.j()Ladc;")
    public AudioBuss firstSubStream() {
        MidiNote var1 = (MidiNote) this.notes.head();
        if (var1 == null) {
            return null;
        } else if (var1.stream == null) {
            return this.nextSubStream();
        } else {
            return var1.stream;
        }
    }

    @ObfuscatedName("aij.a()Ladc;")
    public AudioBuss nextSubStream() {
        MidiNote var1;
        do {
            var1 = (MidiNote) this.notes.next();
            if (var1 == null) {
                return null;
            }
        } while (var1.stream == null);
        return var1.stream;
    }

    @ObfuscatedName("aij.s()I")
    public int method15035() {
        return 0;
    }

    @ObfuscatedName("aij.m([III)V")
    public void read(int[] arg0, int arg1, int arg2) {
        this.mixer.read(arg0, arg1, arg2);
        for (MidiNote var4 = (MidiNote) this.notes.head(); var4 != null; var4 = (MidiNote) this.notes.next()) {
            if (!this.parent.method16296(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field9392) {
                        this.method16255(var4, arg0, var5, var6, var5 + var6);
                        var4.field9392 -= var6;
                        break;
                    }
                    this.method16255(var4, arg0, var5, var4.field9392, var5 + var6);
                    var5 += var4.field9392;
                    var6 -= var4.field9392;
                } while (!this.parent.method16338(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("aij.t(I)V")
    public void skip(int arg0) {
        this.mixer.skip(arg0);
        for (MidiNote var2 = (MidiNote) this.notes.head(); var2 != null; var2 = (MidiNote) this.notes.next()) {
            if (!this.parent.method16296(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field9392) {
                        this.method16256(var2, var3);
                        var2.field9392 -= var3;
                        break;
                    }
                    this.method16256(var2, var2.field9392);
                    var3 -= var2.field9392;
                } while (!this.parent.method16338(var2, null, 0, var3));
            }
        }
    }

    @ObfuscatedName("aij.an(Laci;[IIIII)V")
    public void method16255(MidiNote arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.parent.channelFlags[arg0.channel] & 0x4) != 0 && arg0.field9402 < 0) {
            int var6 = this.parent.field10250[arg0.channel] / Statics.sampleRate;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field9398) / var6;
                if (var7 > arg3) {
                    arg0.field9398 += arg3 * var6;
                    break;
                }
                arg0.stream.read(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field9398 += var6 * var7 - 1048576;
                int var8 = Statics.sampleRate / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                SoundAudioBuss var10 = arg0.stream;
                if (this.parent.field10248[arg0.channel] == 0) {
                    arg0.stream = arg0.sound.create(var10.method16397(), var10.method16442(), var10.method16426());
                } else {
                    arg0.stream = arg0.sound.create(var10.method16397(), 0, var10.method16426());
                    this.parent.method16280(arg0, arg0.instrument.field9406[arg0.midiKey] < 0);
                    arg0.stream.method16399(var8, var10.method16442());
                }
                if (arg0.instrument.field9406[arg0.midiKey] < 0) {
                    arg0.stream.setLoops(-1);
                }
                var10.method16418(var8);
                var10.read(arg1, arg2, arg4 - arg2);
                if (var10.method16383()) {
                    this.mixer.addSubStream(var10);
                }
            }
        }
        arg0.stream.read(arg1, arg2, arg3);
    }

    @ObfuscatedName("aij.ap(Laci;II)V")
    public void method16256(MidiNote instrument, int arg1) {
        if ((this.parent.channelFlags[instrument.channel] & 0x4) != 0 && instrument.field9402 < 0) {
            int var3 = this.parent.field10250[instrument.channel] / Statics.sampleRate;
            int var4 = (var3 + 1048575 - instrument.field9398) / var3;
            instrument.field9398 = instrument.field9398 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                SoundAudioBuss var5 = instrument.stream;
                if (this.parent.field10248[instrument.channel] == 0) {
                    instrument.stream = instrument.sound.create(var5.method16397(), var5.method16442(), var5.method16426());
                } else {
                    instrument.stream = instrument.sound.create(var5.method16397(), 0, var5.method16426());
                    this.parent.method16280(instrument, instrument.instrument.field9406[instrument.midiKey] < 0);
                }
                if (instrument.instrument.field9406[instrument.midiKey] < 0) {
                    instrument.stream.setLoops(-1);
                }
                arg1 = instrument.field9398 / var3;
            }
        }
        instrument.stream.skip(arg1);
    }
}
