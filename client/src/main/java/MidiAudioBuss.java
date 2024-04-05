import deob.ObfuscatedName;

@ObfuscatedName("aih")
public class MidiAudioBuss extends AudioBuss {

    @ObfuscatedName("aih.l")
    public IterableMap instruments;

    @ObfuscatedName("aih.f")
    public int volume = 256;

    @ObfuscatedName("aih.d")
    public int field10261 = 256;

    @ObfuscatedName("aih.z")
    public int field10231 = 1000000;

    @ObfuscatedName("aih.n")
    public int[] field10232 = new int[16];

    @ObfuscatedName("aih.o")
    public int[] channelVolume = new int[16];

    @ObfuscatedName("aih.q")
    public int[] channelPan = new int[16];

    @ObfuscatedName("aih.p")
    public int[] channelExpression = new int[16];

    @ObfuscatedName("aih.w")
    public int[] defaultChannelProgram = new int[16];

    @ObfuscatedName("aih.b")
    public int[] channelProgram = new int[16];

    @ObfuscatedName("aih.x")
    public int[] channelBank = new int[16];

    @ObfuscatedName("aih.i")
    public int[] field10244 = new int[16];

    @ObfuscatedName("aih.v")
    public int[] channelModulation = new int[16];

    @ObfuscatedName("aih.k")
    public int[] channelPortamento = new int[16];

    @ObfuscatedName("aih.y")
    public int[] channelFlags = new int[16];

    @ObfuscatedName("aih.e")
    public int[] channelParameter = new int[16];

    @ObfuscatedName("aih.ay")
    public int[] field10247 = new int[16];

    @ObfuscatedName("aih.af")
    public int[] field10248 = new int[16];

    @ObfuscatedName("aih.ar")
    public int[] field10228 = new int[16];

    @ObfuscatedName("aih.an")
    public int[] field10250 = new int[16];

    @ObfuscatedName("aih.ap")
    public MidiNote[][] notes = new MidiNote[16][128];

    @ObfuscatedName("aih.ag")
    public MidiNote[][] field10252 = new MidiNote[16][128];

    @ObfuscatedName("aih.as")
    public MidiDecoder decoder = new MidiDecoder();

    @ObfuscatedName("aih.ai")
    public boolean field10254;

    @ObfuscatedName("aih.ao")
    public int track;

    @ObfuscatedName("aih.al")
    public int time;

    @ObfuscatedName("aih.at")
    public long field10257;

    @ObfuscatedName("aih.ax")
    public long timeMillis;

    @ObfuscatedName("aih.aw")
    public MidiNoteAudioBuss noteStream = new MidiNoteAudioBuss(this);

    @ObfuscatedName("aih.aa")
    public MidiSong song;

    @ObfuscatedName("aih.am")
    public int field10249;

    @ObfuscatedName("aih.ad")
    public boolean field10238;

    public MidiAudioBuss() {
        this.instruments = new IterableMap(128);
        this.method16266(-1, 256);
        this.reset(true);
    }

    public MidiAudioBuss(MidiAudioBuss arg0) {
        this.instruments = arg0.instruments;
        this.method16266(-1, 256);
        this.reset(true);
    }

    @ObfuscatedName("aih.an(II)V")
    public synchronized void method16263(int arg0) {
        this.volume = arg0;
    }

    @ObfuscatedName("aih.ap(I)I")
    public int method16264() {
        return this.volume;
    }

    @ObfuscatedName("aih.ag(II)V")
    public synchronized void method16265(int arg0) {
        this.field10261 = arg0;
    }

    @ObfuscatedName("aih.as(III)V")
    public synchronized void method16266(int arg0, int arg1) {
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.field10232[var3] = arg1;
            }
        } else {
            this.field10232[arg0] = arg1;
        }
    }

    @ObfuscatedName("aih.ai(Lacw;Lls;Lmd;II)Z")
    public synchronized boolean method16375(MidiSong arg0, Js5 arg1, SoundBank arg2, int arg3) {
        arg0.method14906();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[]{arg3};
        }
        for (ObjectNode var7 = (ObjectNode) arg0.field9382.method11928(); var7 != null; var7 = (ObjectNode) arg0.field9382.method11929()) {
            int var8 = (int) var7.field4228;
            MidiInstrument var9 = (MidiInstrument) this.instruments.getNode((long) var8);
            if (var9 == null) {
                var9 = MidiInstrument.method14060(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.instruments.put(var9, (long) var8);
            }
            if (!var9.method14918(arg2, (byte[]) var7.value, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method14907();
        }
        return var5;
    }

    @ObfuscatedName("aih.ao(B)V")
    public synchronized void method16324() {
        for (MidiInstrument var1 = (MidiInstrument) this.instruments.method11928(); var1 != null; var1 = (MidiInstrument) this.instruments.method11929()) {
            var1.method14916();
        }
    }

    @ObfuscatedName("aih.al(I)V")
    public synchronized void method16269() {
        for (MidiInstrument var1 = (MidiInstrument) this.instruments.method11928(); var1 != null; var1 = (MidiInstrument) this.instruments.method11929()) {
            var1.unlink();
        }
    }

    @ObfuscatedName("aih.at(Lacw;ZI)V")
    public synchronized void method16311(MidiSong arg0, boolean arg1) {
        this.method16271(arg0, arg1, true);
    }

    @ObfuscatedName("aih.ax(Lacw;ZZB)V")
    public synchronized void method16271(MidiSong song, boolean arg1, boolean allSoundOff) {
        this.method16325(allSoundOff);
        this.decoder.init(song.midiBytes);
        this.field10254 = arg1;
        this.field10257 = 0L;
        int tracks = this.decoder.getTrackCount();
        for (int i = 0; i < tracks; i++) {
            this.decoder.loadTrackPosition(i);
            this.decoder.addDeltaTime(i);
            this.decoder.saveTrackPosition(i);
        }
        this.track = this.decoder.getNextTrack();
        this.time = this.decoder.times[this.track];
        this.timeMillis = this.decoder.getTimeMillis(this.time);
    }

    @ObfuscatedName("aih.aw(Lacw;ZZJ)V")
    public synchronized void method16272(MidiSong arg0, boolean arg1, boolean arg2, long arg3) {
        this.method16271(arg0, arg1, arg2);
        this.method16261((long) this.decoder.field1606 * arg3);
    }

    @ObfuscatedName("aih.aa(B)V")
    public synchronized void method16273() {
        this.method16325(true);
    }

    @ObfuscatedName("aih.am(ZI)V")
    public synchronized void method16325(boolean arg0) {
        this.decoder.release();
        this.song = null;
        this.reset(arg0);
    }

    @ObfuscatedName("aih.ad(I)Z")
    public synchronized boolean method16299() {
        return this.decoder.isValid();
    }

    @ObfuscatedName("aih.az(III)V")
    public synchronized void method16283(int arg0, int arg1) {
        this.method16277(arg0, arg1);
    }

    @ObfuscatedName("aih.ak(III)V")
    public void method16277(int channel, int program) {
        this.defaultChannelProgram[channel] = program;
        this.channelBank[channel] = program & 0xFFFFFF80;
        this.setProgram(channel, program);
    }

    @ObfuscatedName("aih.av(III)V")
    public void setProgram(int channel, int program) {
        if (this.channelProgram[channel] != program) {
            this.channelProgram[channel] = program;
            for (int key = 0; key < 128; key++) {
                this.field10252[channel][key] = null;
            }
        }
    }

    @ObfuscatedName("aih.aj(IIII)V")
    public void noteOn(int channel, int key, int arg2) {
        this.noteOff(channel, key, 64);
        if ((this.channelFlags[channel] & 0x2) != 0) {
            for (MidiNote note = (MidiNote) this.noteStream.notes.tail(); note != null; note = (MidiNote) this.noteStream.notes.prev()) {
                if (note.channel == channel && note.field9402 < 0) {
                    this.notes[channel][note.midiKey] = null;
                    this.notes[channel][key] = note;
                    int var5 = (note.field9393 * note.field9389 >> 12) + note.field9386;
                    note.field9386 += key - note.midiKey << 8;
                    note.field9389 = var5 - note.field9386;
                    note.field9393 = 4096;
                    note.midiKey = key;
                    return;
                }
            }
        }
        MidiInstrument instrument = (MidiInstrument) this.instruments.getNode((long) this.channelProgram[channel]);
        if (instrument == null) {
            return;
        }
        BasicSoundPacket sound = instrument.sounds[key];
        if (sound == null) {
            return;
        }
        MidiNote note = new MidiNote();
        note.channel = channel;
        note.instrument = instrument;
        note.sound = sound;
        note.field9391 = instrument.field9413[key];
        note.field9387 = instrument.field9412[key];
        note.midiKey = key;
        note.field9404 = instrument.field9411 * arg2 * arg2 * instrument.field9409[key] + 1024 >> 11;
        note.pan = instrument.field9410[key] & 0xFF;
        note.field9386 = (key << 8) - (instrument.field9406[key] & 0x7FFF);
        note.field9394 = 0;
        note.field9395 = 0;
        note.field9396 = 0;
        note.field9402 = -1;
        note.field9397 = 0;
        if (this.field10248[channel] == 0) {
            note.stream = sound.create(this.method16302(note), this.getVolume(note), this.getPan(note));
        } else {
            note.stream = sound.create(this.method16302(note), 0, this.getPan(note));
            this.method16280(note, instrument.field9406[key] < 0);
        }
        if (instrument.field9406[key] < 0) {
            note.stream.setLoops(-1);
        }
        if (note.field9387 >= 0) {
            MidiNote var9 = this.field10252[channel][note.field9387];
            if (var9 != null && var9.field9402 < 0) {
                this.notes[channel][var9.midiKey] = null;
                var9.field9402 = 0;
            }
            this.field10252[channel][note.field9387] = note;
        }
        this.noteStream.notes.addTail(note);
        this.notes[channel][key] = note;
    }

    @ObfuscatedName("aih.ah(Laci;ZI)V")
    public void method16280(MidiNote arg0, boolean arg1) {
        int var3 = arg0.sound.getSampleLength();
        int var5;
        if (arg1 && arg0.sound.field10293) {
            int var4 = var3 + var3 - arg0.sound.start;
            var5 = (int) ((long) this.field10248[arg0.channel] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.stream.method16413(true);
            }
        } else {
            var5 = (int) ((long) this.field10248[arg0.channel] * (long) var3 >> 6);
        }
        arg0.stream.method16421(var5);
    }

    @ObfuscatedName("aih.au(IIII)V")
    public void noteOff(int arg0, int arg1, int arg2) {
        MidiNote var4 = this.notes[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.notes[arg0][arg1] = null;
        if ((this.channelFlags[arg0] & 0x2) == 0) {
            var4.field9402 = 0;
            return;
        }
        for (MidiNote var5 = (MidiNote) this.noteStream.notes.head(); var5 != null; var5 = (MidiNote) this.noteStream.notes.next()) {
            if (var4.channel == var5.channel && var5.field9402 < 0 && var4 != var5) {
                var4.field9402 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("aih.ae(IIII)V")
    public void setKeyPressure(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("aih.ac(III)V")
    public void setChannelPressure(int arg0, int arg1) {
    }

    @ObfuscatedName("aih.aq(III)V")
    public void setPitch(int arg0, int arg1) {
        this.field10244[arg0] = arg1;
    }

    @ObfuscatedName("aih.ab(II)V")
    public void allSoundOff(int arg0) {
        for (MidiNote var2 = (MidiNote) this.noteStream.notes.head(); var2 != null; var2 = (MidiNote) this.noteStream.notes.next()) {
            if (arg0 < 0 || var2.channel == arg0) {
                if (var2.stream != null) {
                    var2.stream.method16418(Statics.sampleRate / 100);
                    if (var2.stream.method16383()) {
                        this.noteStream.mixer.addSubStream(var2.stream);
                    }
                    var2.release();
                }
                if (var2.field9402 < 0) {
                    this.notes[var2.channel][var2.midiKey] = null;
                }
                var2.unlink();
            }
        }
    }

    @ObfuscatedName("aih.bq(II)V")
    public void resetAllControllers(int channel) {
        if (channel < 0) {
            for (int i = 0; i < 16; i++) {
                this.resetAllControllers(i);
            }

            return;
        }

        this.channelVolume[channel] = 12800;
        this.channelPan[channel] = 8192;
        this.channelExpression[channel] = 16383;
        this.field10244[channel] = 8192;
        this.channelModulation[channel] = 0;
        this.channelPortamento[channel] = 8192;
        this.method16323(channel);
        this.method16289(channel);
        this.channelFlags[channel] = 0;
        this.channelParameter[channel] = 32767;
        this.field10247[channel] = 256;
        this.field10248[channel] = 0;
        this.method16291(channel, 8192);
    }

    @ObfuscatedName("aih.bz(II)V")
    public void allNotesOff(int channel) {
        for (MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
            if ((channel < 0 || note.channel == channel) && note.field9402 < 0) {
                this.notes[note.channel][note.midiKey] = null;
                note.field9402 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bv(ZB)V")
    public void reset(boolean allSoundOff) {
        if (allSoundOff) {
            this.allSoundOff(-1);
        } else {
            this.allNotesOff(-1);
        }
        this.resetAllControllers(-1);
        for (int i = 0; i < 16; i++) {
            this.channelProgram[i] = this.defaultChannelProgram[i];
        }
        for (int i = 0; i < 16; i++) {
            this.channelBank[i] = this.defaultChannelProgram[i] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("aih.bj(IB)V")
    public void method16323(int channel) {
        if ((this.channelFlags[channel] & 0x2) == 0) {
            return;
        }
        for (MidiNote note = (MidiNote) this.noteStream.notes.head(); note != null; note = (MidiNote) this.noteStream.notes.next()) {
            if (note.channel == channel && this.notes[channel][note.midiKey] == null && note.field9402 < 0) {
                note.field9402 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bf(II)V")
    public void method16289(int arg0) {
        if ((this.channelFlags[arg0] & 0x4) == 0) {
            return;
        }
        for (MidiNote var2 = (MidiNote) this.noteStream.notes.head(); var2 != null; var2 = (MidiNote) this.noteStream.notes.next()) {
            if (var2.channel == arg0) {
                var2.field9398 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bt(II)V")
    public void processMessage(int message) {
        int type = message & 0xF0;
        if (type == 128) {
            int var3 = message & 0xF;
            int var4 = message >> 8 & 0x7F;
            int var5 = message >> 16 & 0x7F;
            this.noteOff(var3, var4, var5);
        } else if (type == 144) {
            int channel = message & 0xF;
            int key = message >> 8 & 0x7F;
            int velocity = message >> 16 & 0x7F;
            if (velocity > 0) {
                this.noteOn(channel, key, velocity);
            } else {
                this.noteOff(channel, key, 64);
            }
        } else if (type == 160) {
            int channel = message & 0xF;
            int key = message >> 8 & 0x7F;
            int pressure = message >> 16 & 0x7F;
            this.setKeyPressure(channel, key, pressure);
        } else if (type == 176) {
            int channel = message & 0xF;
            int controller = message >> 8 & 0x7F;
            int value = message >> 16 & 0x7F;
            if (controller == 0) {
                this.channelBank[channel] = (value << 14) + (this.channelBank[channel] & 0xFFE03FFF);
            }
            if (controller == 32) {
                this.channelBank[channel] = (value << 7) + (this.channelBank[channel] & 0xFFFFC07F);
            }
            if (controller == 1) {
                this.channelModulation[channel] = (value << 7) + (this.channelModulation[channel] & 0xFFFFC07F);
            }
            if (controller == 33) {
                this.channelModulation[channel] = (this.channelModulation[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 5) {
                this.channelPortamento[channel] = (value << 7) + (this.channelPortamento[channel] & 0xFFFFC07F);
            }
            if (controller == 37) {
                this.channelPortamento[channel] = (this.channelPortamento[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 7) {
                this.channelVolume[channel] = (value << 7) + (this.channelVolume[channel] & 0xFFFFC07F);
            }
            if (controller == 39) {
                this.channelVolume[channel] = (this.channelVolume[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 10) {
                this.channelPan[channel] = (value << 7) + (this.channelPan[channel] & 0xFFFFC07F);
            }
            if (controller == 42) {
                this.channelPan[channel] = (this.channelPan[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 11) {
                this.channelExpression[channel] = (value << 7) + (this.channelExpression[channel] & 0xFFFFC07F);
            }
            if (controller == 43) {
                this.channelExpression[channel] = (this.channelExpression[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 64) {
                if (value >= 64) {
                    this.channelFlags[channel] |= 0x1;
                } else {
                    this.channelFlags[channel] &= 0xFFFFFFFE;
                }
            }
            if (controller == 65) {
                if (value >= 64) {
                    this.channelFlags[channel] |= 0x2;
                } else {
                    this.method16323(channel);
                    this.channelFlags[channel] &= 0xFFFFFFFD;
                }
            }
            if (controller == 99) {
                this.channelParameter[channel] = (value << 7) + (this.channelParameter[channel] & 0x7F);
            }
            if (controller == 98) {
                this.channelParameter[channel] = (this.channelParameter[channel] & 0x3F80) + value;
            }
            if (controller == 101) {
                this.channelParameter[channel] = (value << 7) + (this.channelParameter[channel] & 0x7F) + 16384;
            }
            if (controller == 100) {
                this.channelParameter[channel] = (this.channelParameter[channel] & 0x3F80) + 16384 + value;
            }
            if (controller == 120) {
                this.allSoundOff(channel);
            }
            if (controller == 121) {
                this.resetAllControllers(channel);
            }
            if (controller == 123) {
                this.allNotesOff(channel);
            }
            if (controller == 6) {
                int parameter = this.channelParameter[channel];
                if (parameter == 16384) {
                    this.field10247[channel] = (value << 7) + (this.field10247[channel] & 0xFFFFC07F);
                }
            }
            if (controller == 38) {
                int parameter = this.channelParameter[channel];
                if (parameter == 16384) {
                    this.field10247[channel] = (this.field10247[channel] & 0xFFFFFF80) + value;
                }
            }
            if (controller == 16) {
                this.field10248[channel] = (value << 7) + (this.field10248[channel] & 0xFFFFC07F);
            }
            if (controller == 48) {
                this.field10248[channel] = (this.field10248[channel] & 0xFFFFFF80) + value;
            }
            if (controller == 81) {
                if (value >= 64) {
                    this.channelFlags[channel] |= 0x4;
                } else {
                    this.method16289(channel);
                    this.channelFlags[channel] &= 0xFFFFFFFB;
                }
            }
            if (controller == 17) {
                this.method16291(channel, (value << 7) + (this.field10228[channel] & 0xFFFFC07F));
            }
            if (controller == 49) {
                this.method16291(channel, (this.field10228[channel] & 0xFFFFFF80) + value);
            }
        } else if (type == 192) {
            int channel = message & 0xF;
            int program = message >> 8 & 0x7F;
            this.setProgram(channel, this.channelBank[channel] + program);
        } else if (type == 208) {
            int channel = message & 0xF;
            int pressure = message >> 8 & 0x7F;
            this.setChannelPressure(channel, pressure);
        } else if (type == 224) {
            int pitch = message & 0xF;
            int channel = (message >> 9 & 0x3F80) + (message >> 8 & 0x7F);
            this.setPitch(pitch, channel);
        } else {
            int status = message & 0xFF;
            if (status == 255) {
                this.reset(true);
            }
        }
    }

    @ObfuscatedName("aih.bg(IIB)V")
    public void method16291(int arg0, int arg1) {
        this.field10228[arg0] = arg1;
        this.field10250[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @ObfuscatedName("aih.bl(Laci;I)I")
    public int method16302(MidiNote arg0) {
        int var2 = (arg0.field9393 * arg0.field9389 >> 12) + arg0.field9386;
        int var3 = ((this.field10244[arg0.channel] - 8192) * this.field10247[arg0.channel] >> 12) + var2;
        MidiRelated2 var4 = arg0.field9391;
        if (var4.field1620 > 0 && (var4.field1621 > 0 || this.channelModulation[arg0.channel] > 0)) {
            int var5 = var4.field1621 << 2;
            int var6 = var4.field1623 << 1;
            if (arg0.field9399 < var6) {
                var5 = arg0.field9399 * var5 / var6;
            }
            int var7 = (this.channelModulation[arg0.channel] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field9383 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.sound.field10295 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.sampleRate + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("aih.bk(Laci;I)I")
    public int getVolume(MidiNote note) {
        if (this.field10232[note.channel] == 0) {
            return 0;
        }
        MidiRelated2 var2 = note.field9391;
        int volume = this.channelExpression[note.channel] * this.channelVolume[note.channel] + 4096 >> 13;
        int var4 = volume * volume + 16384 >> 15;
        int var5 = note.field9404 * var4 + 16384 >> 15;
        int var6 = this.volume * var5 + 128 >> 8;
        int var7 = this.field10261 * var6 >> 8;
        int var8 = this.field10232[note.channel] * var7 + 128 >> 8;
        if (var2.field1618 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) note.field9394 * 1.953125E-5D * (double) var2.field1618) + 0.5D);
        }
        if (var2.field1622 != null) {
            int var9 = note.field9395;
            int var10 = var2.field1622[note.field9396 + 1];
            if (note.field9396 < var2.field1622.length - 2) {
                int var11 = (var2.field1622[note.field9396] & 0xFF) << 8;
                int var12 = (var2.field1622[note.field9396 + 2] & 0xFF) << 8;
                var10 += (var2.field1622[note.field9396 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (note.field9402 > 0 && var2.field1616 != null) {
            int var13 = note.field9402;
            int var14 = var2.field1616[note.field9397 + 1];
            if (note.field9397 < var2.field1616.length - 2) {
                int var15 = (var2.field1616[note.field9397] & 0xFF) << 8;
                int var16 = (var2.field1616[note.field9397 + 2] & 0xFF) << 8;
                var14 += (var2.field1616[note.field9397 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @ObfuscatedName("aih.bs(Laci;B)I")
    public int getPan(MidiNote arg0) {
        int var2 = this.channelPan[arg0.channel];
        return var2 < 8192 ? arg0.pan * var2 + 32 >> 6 : 16384 - ((128 - arg0.pan) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("aih.j()Ladc;")
    public synchronized AudioBuss firstSubStream() {
        return this.noteStream;
    }

    @ObfuscatedName("aih.a()Ladc;")
    public synchronized AudioBuss nextSubStream() {
        return null;
    }

    @ObfuscatedName("aih.s()I")
    public synchronized int method15035() {
        return 0;
    }

    @ObfuscatedName("aih.m([III)V")
    public synchronized void read(int[] arg0, int arg1, int arg2) {
        if (this.decoder.isValid()) {
            int var4 = this.field10231 * this.decoder.field1606 / Statics.sampleRate;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field10257;
                if (this.timeMillis - var5 >= 0L) {
                    this.field10257 = var5;
                    break;
                }
                int var7 = (int) ((this.timeMillis - this.field10257 + (long) var4 - 1L) / (long) var4);
                this.field10257 += (long) var4 * (long) var7;
                this.noteStream.read(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method16362();
            } while (this.decoder.isValid());
        }
        this.noteStream.read(arg0, arg1, arg2);
    }

    @ObfuscatedName("aih.t(I)V")
    public synchronized void skip(int arg0) {
        if (this.decoder.isValid()) {
            int var2 = this.field10231 * this.decoder.field1606 / Statics.sampleRate;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field10257;
                if (this.timeMillis - var3 >= 0L) {
                    this.field10257 = var3;
                    break;
                }
                int var5 = (int) ((this.timeMillis - this.field10257 + (long) var2 - 1L) / (long) var2);
                this.field10257 += (long) var2 * (long) var5;
                this.noteStream.skip(var5);
                arg0 -= var5;
                this.method16362();
            } while (this.decoder.isValid());
        }
        this.noteStream.skip(arg0);
    }

    @ObfuscatedName("aih.bn(J)V")
    public void method16261(long arg0) {
        while (this.timeMillis <= arg0) {
            int track = this.track;
            int time = this.time;
            long timeMillis = this.timeMillis;
            while (this.time == time) {
                while (this.decoder.times[track] == time) {
                    this.decoder.loadTrackPosition(track);
                    int event = this.decoder.getNextEvent(track);
                    if (event == 1) {
                        this.decoder.loadEndOfTrackPosition();
                        this.decoder.saveTrackPosition(track);
                        if (this.decoder.hasNextTrack()) {
                            if (!this.field10254 || time == 0) {
                                this.reset(true);
                                this.decoder.release();
                                return;
                            }
                            this.decoder.setStartMillis(timeMillis);
                        }
                        break;
                    }
                    if ((event & 0x80) != 0 && (event & 0xF0) != 144) {
                        this.processMessage(event);
                    }
                    this.decoder.addDeltaTime(track);
                    this.decoder.saveTrackPosition(track);
                }
                this.field10257 = timeMillis;
                track = this.decoder.getNextTrack();
                time = this.decoder.times[track];
                timeMillis = this.decoder.getTimeMillis(time);
            }
            this.track = track;
            this.time = time;
            this.timeMillis = timeMillis;
        }
    }

    @ObfuscatedName("aih.ba(B)V")
    public void method16362() {
        int track = this.track;
        int time = this.time;
        long timeMillis = this.timeMillis;
        if (this.song != null && this.field10249 == time) {
            this.method16271(this.song, this.field10254, this.field10238);
            this.method16362();
            return;
        }
        while (this.time == time) {
            while (this.decoder.times[track] == time) {
                this.decoder.loadTrackPosition(track);
                int event = this.decoder.getNextEvent(track);
                if (event == 1) {
                    this.decoder.loadEndOfTrackPosition();
                    this.decoder.saveTrackPosition(track);
                    if (this.decoder.hasNextTrack()) {
                        if (this.song != null) {
                            this.method16311(this.song, this.field10254);
                            this.method16362();
                            return;
                        }
                        if (!this.field10254 || time == 0) {
                            this.reset(true);
                            this.decoder.release();
                            return;
                        }
                        this.decoder.setStartMillis(timeMillis);
                    }
                    break;
                }
                if ((event & 0x80) != 0) {
                    this.processMessage(event);
                }
                this.decoder.addDeltaTime(track);
                this.decoder.saveTrackPosition(track);
            }
            track = this.decoder.getNextTrack();
            time = this.decoder.times[track];
            timeMillis = this.decoder.getTimeMillis(time);
        }
        this.track = track;
        this.time = time;
        this.timeMillis = timeMillis;
        if (this.song != null && this.field10249 < time) {
            this.track = -1;
            this.time = this.field10249;
            this.timeMillis = this.decoder.getTimeMillis(this.time);
        }
    }

    @ObfuscatedName("aih.bd(Laci;S)Z")
    public boolean method16296(MidiNote arg0) {
        if (arg0.stream != null) {
            return false;
        }
        if (arg0.field9402 >= 0) {
            arg0.unlink();
            if (arg0.field9387 > 0 && this.field10252[arg0.channel][arg0.field9387] == arg0) {
                this.field10252[arg0.channel][arg0.field9387] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("aih.bc(Laci;[IIIB)Z")
    public boolean method16338(MidiNote note, int[] samples, int off, int len) {
        note.field9392 = Statics.sampleRate / 100;
        if (note.field9402 >= 0 && (note.stream == null || note.stream.method16393())) {
            note.release();
            note.unlink();
            if (note.field9387 > 0 && this.field10252[note.channel][note.field9387] == note) {
                this.field10252[note.channel][note.field9387] = null;
            }
            return true;
        }
        int var5 = note.field9393;
        if (var5 > 0) {
            int var6 = var5 - (int) (Math.pow(2.0D, (double) this.channelPortamento[note.channel] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            note.field9393 = var6;
        }
        note.stream.method16396(this.method16302(note));
        MidiRelated2 var7 = note.field9391;
        boolean var8 = false;
        note.field9399++;
        note.field9383 += var7.field1620;
        double var9 = (double) ((note.midiKey - 60 << 8) + (note.field9393 * note.field9389 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1618 > 0) {
            if (var7.field1617 > 0) {
                note.field9394 += (int) (Math.pow(2.0D, (double) var7.field1617 * var9) * 128.0D + 0.5D);
            } else {
                note.field9394 += 128;
            }
            if (note.field9394 * var7.field1618 >= 819200) {
                var8 = true;
            }
        }
        if (var7.field1622 != null) {
            if (var7.field1615 > 0) {
                note.field9395 += (int) (Math.pow(2.0D, (double) var7.field1615 * var9) * 128.0D + 0.5D);
            } else {
                note.field9395 += 128;
            }
            while (note.field9396 < var7.field1622.length - 2 && note.field9395 > (var7.field1622[note.field9396 + 2] & 0xFF) << 8) {
                note.field9396 = note.field9396 + 2;
            }
            if (note.field9396 == var7.field1622.length - 2 && var7.field1622[note.field9396 + 1] == 0) {
                var8 = true;
            }
        }
        if (note.field9402 >= 0 && var7.field1616 != null && (this.channelFlags[note.channel] & 0x1) == 0 && (note.field9387 < 0 || this.field10252[note.channel][note.field9387] != note)) {
            if (var7.field1619 > 0) {
                note.field9402 += (int) (Math.pow(2.0D, (double) var7.field1619 * var9) * 128.0D + 0.5D);
            } else {
                note.field9402 += 128;
            }
            while (note.field9397 < var7.field1616.length - 2 && note.field9402 > (var7.field1616[note.field9397 + 2] & 0xFF) << 8) {
                note.field9397 = note.field9397 + 2;
            }
            if (note.field9397 == var7.field1616.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            note.stream.method16395(note.field9392, this.getVolume(note), this.getPan(note));
            return false;
        }
        note.stream.method16418(note.field9392);
        if (samples == null) {
            note.stream.skip(len);
        } else {
            note.stream.read(samples, off, len);
        }
        if (note.stream.method16383()) {
            this.noteStream.mixer.addSubStream(note.stream);
        }
        note.release();
        if (note.field9402 >= 0) {
            note.unlink();
            if (note.field9387 > 0 && this.field10252[note.channel][note.field9387] == note) {
                this.field10252[note.channel][note.field9387] = null;
            }
        }
        return true;
    }
}
