import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("un")
public final class FileOnDisk {

    @ObfuscatedName("un.u")
    public RandomAccessFile field6787;

    @ObfuscatedName("un.j")
    public final long field6786;

    @ObfuscatedName("un.a")
    public long field6788;

    public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field6787 = new RandomAccessFile(arg0, arg1);
        this.field6786 = arg2;
        this.field6788 = 0L;
        int var5 = this.field6787.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6787.seek(0L);
            this.field6787.write(var5);
        }
        this.field6787.seek(0L);
    }

    @ObfuscatedName("un.u(J)V")
    public final void method12074(long arg0) throws IOException {
        this.field6787.seek(arg0);
        this.field6788 = arg0;
    }

    @ObfuscatedName("un.j([BIIB)V")
    public final void method12075(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field6788 + (long) arg2 > this.field6786) {
            this.field6787.seek(this.field6786);
            this.field6787.write(1);
            throw new EOFException();
        } else {
            this.field6787.write(arg0, arg1, arg2);
            this.field6788 += arg2;
        }
    }

    @ObfuscatedName("un.a(B)V")
    public final void method12076() throws IOException {
        if (this.field6787 != null) {
            this.field6787.close();
            this.field6787 = null;
        }
    }

    @ObfuscatedName("un.s(B)J")
    public final long method12077() throws IOException {
        return this.field6787.length();
    }

    @ObfuscatedName("un.c([BIIB)I")
    public final int method12078(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field6787.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field6788 += var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field6787 != null) {
            System.out.println("");
            this.method12076();
        }
    }
}
