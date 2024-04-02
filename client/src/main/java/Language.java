
import deob.ObfuscatedName;
import java.util.Locale;

@ObfuscatedName("sn")
public class Language implements SerializableEnum {

	@ObfuscatedName("sn.u")
	public static final Language field6376 = new Language("EN", "en", "English", ModeWhere.field6368, 0, "GB");

	@ObfuscatedName("sn.j")
	public static final Language field6374 = new Language("DE", "de", "German", ModeWhere.field6368, 1, "DE");

	@ObfuscatedName("sn.a")
	public static final Language field6375 = new Language("FR", "fr", "French", ModeWhere.field6368, 2, "FR");

	@ObfuscatedName("sn.s")
	public static final Language field6384 = new Language("PT", "pt", "Portuguese", ModeWhere.field6368, 3, "BR");

	@ObfuscatedName("sn.c")
	public static final Language field6377 = new Language("NL", "nl", "Dutch", ModeWhere.field6369, 4, "NL");

	@ObfuscatedName("sn.m")
	public static final Language field6373 = new Language("ES", "es", "Spanish", ModeWhere.field6369, 5, "ES");

	@ObfuscatedName("sn.t")
	public final String field6379;

	@ObfuscatedName("sn.f")
	public final String field6378;

	@ObfuscatedName("sn.d")
	public final int field6382;

	@ObfuscatedName("sn.z")
	public final Locale field6383;

	@ObfuscatedName("sn.n")
	public static final Language[] field6381;

	static {
		Language[] var0 = Statics.method11191();
		field6381 = new Language[var0.length];
		Language[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Language var3 = var1[var2];
			if (field6381[var3.field6382] != null) {
				throw new IllegalStateException();
			}
			field6381[var3.field6382] = var3;
		}
	}

	public Language(String arg0, String arg1, String arg2, ModeWhere arg3, int arg4, String arg5) {
		this.field6379 = arg0;
		this.field6378 = arg1;
		this.field6382 = arg4;
		if (arg5 == null) {
			this.field6383 = new Locale(arg1.substring(0, 2));
		} else {
			this.field6383 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@ObfuscatedName("sn.a(I)Ljava/lang/String;")
	public String method11187() {
		return this.field6378;
	}

	@ObfuscatedName("sn.j(B)I")
	public int method6339() {
		return this.field6382;
	}

	@ObfuscatedName("sn.m(I)Ljava/util/Locale;")
	public Locale method11188() {
		return this.field6383;
	}

	@ObfuscatedName("sn.t(II)Lsn;")
	public static Language method11189(int arg0) {
		return arg0 >= 0 && arg0 < field6381.length ? field6381[arg0] : null;
	}

	public String toString() {
		return this.method11187().toLowerCase(Locale.ENGLISH);
	}
}
