
import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aem")
public final class JavaKeyboard extends Keyboard implements KeyListener, FocusListener {

	@ObfuscatedName("aem.di")
	public IterableQueue field9773 = new IterableQueue();

	@ObfuscatedName("aem.dg")
	public IterableQueue field9771 = new IterableQueue();

	@ObfuscatedName("aem.do")
	public boolean[] field9775 = new boolean[112];

	@ObfuscatedName("aem.db")
	public Component field9776;

	@ObfuscatedName("aem.dx")
	public static int[] field9772 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("acz.x(I)V")
	public static void method14809() {
		field9772[44] = 71;
		field9772[45] = 26;
		field9772[46] = 72;
		field9772[47] = 73;
		field9772[59] = 57;
		field9772[61] = 27;
		field9772[91] = 42;
		field9772[92] = 74;
		field9772[93] = 43;
		field9772[192] = 28;
		field9772[222] = 58;
		field9772[520] = 59;
	}

	public JavaKeyboard(Component arg0) {
		method14809();
		this.method15584(arg0);
	}

	@ObfuscatedName("aem.i(Ljava/awt/Component;I)V")
	public void method15584(Component arg0) {
		this.method15570();
		this.field9776 = arg0;
		this.field9776.addKeyListener(this);
		this.field9776.addFocusListener(this);
	}

	@ObfuscatedName("aem.v(B)V")
	public void method15570() {
		if (this.field9776 == null) {
			return;
		}
		this.field9776.removeKeyListener(this);
		this.field9776.removeFocusListener(this);
		this.field9776 = null;
		for (int var1 = 0; var1 < 112; var1++) {
			this.field9775[var1] = false;
		}
		this.field9773.method11557();
		this.field9771.method11557();
	}

	@ObfuscatedName("aem.k(ICII)V")
	public void method15571(int arg0, char arg1, int arg2) {
		BasicKeyboardEvent var4 = new BasicKeyboardEvent();
		var4.field9581 = arg0;
		var4.field9582 = arg1;
		var4.field9583 = arg2;
		var4.field9584 = MonotonicTime.method5554();
		this.field9771.method11558(var4);
	}

	@ObfuscatedName("aem.s(I)Lox;")
	public KeyboardEvent method7237() {
		return (KeyboardEvent) this.field9773.method11560();
	}

	@ObfuscatedName("aem.a(IB)Z")
	public boolean method7243(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.field9775[arg0] : false;
	}

	@ObfuscatedName("aem.j(B)V")
	public synchronized void method7231() {
		this.field9773.method11557();
		for (BasicKeyboardEvent var1 = (BasicKeyboardEvent) this.field9771.method11560(); var1 != null; var1 = (BasicKeyboardEvent) this.field9771.method11560()) {
			var1.field9580 = this.method15572();
			if (var1.field9581 == 0) {
				if (!this.field9775[var1.field9583]) {
					BasicKeyboardEvent var2 = new BasicKeyboardEvent();
					var2.field9581 = 0;
					var2.field9582 = (char) 65535;
					var2.field9583 = var1.field9583;
					var2.field9584 = var1.field9584;
					var2.field9580 = var1.field9580;
					this.field9773.method11558(var2);
					this.field9775[var1.field9583] = true;
				}
				var1.field9581 = 2;
				this.field9773.method11558(var1);
			} else if (var1.field9581 == 1) {
				if (this.field9775[var1.field9583]) {
					this.field9773.method11558(var1);
					this.field9775[var1.field9583] = false;
				}
			} else if (var1.field9581 == -1) {
				for (int var3 = 0; var3 < 112; var3++) {
					if (this.field9775[var3]) {
						BasicKeyboardEvent var4 = new BasicKeyboardEvent();
						var4.field9581 = 1;
						var4.field9582 = (char) 65535;
						var4.field9583 = var3;
						var4.field9584 = var1.field9584;
						var4.field9580 = var1.field9580;
						this.field9773.method11558(var4);
						this.field9775[var3] = false;
					}
				}
			} else if (var1.field9581 == 3) {
				this.field9773.method11558(var1);
			}
		}
	}

	@ObfuscatedName("aem.h(B)I")
	public int method15572() {
		int var1 = 0;
		if (this.field9775[81]) {
			var1 |= 0x1;
		}
		if (this.field9775[82]) {
			var1 |= 0x4;
		}
		if (this.field9775[86]) {
			var1 |= 0x2;
		}
		return var1;
	}

	@ObfuscatedName("aem.c(B)V")
	public void method7233() {
		this.method15570();
	}

	@ObfuscatedName("aem.r(Ljava/awt/event/KeyEvent;II)V")
	public void method15573(KeyEvent arg0, int arg1) {
		int var3 = arg0.getKeyCode();
		int var5;
		if (var3 == 0) {
			var5 = 0;
		} else if (var3 >= 0 && var3 < field9772.length) {
			int var4 = field9772[var3];
			if (arg1 == 0 && (var4 & 0x80) != 0) {
				var5 = 0;
			} else {
				var5 = var4 & 0xFFFFFF7F;
			}
		} else {
			var5 = 0;
		}
		if (var5 != 0) {
			this.method15571(arg1, (char) 65535, var5);
			arg0.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent arg0) {
		this.method15573(arg0, 0);
	}

	public synchronized void keyReleased(KeyEvent arg0) {
		this.method15573(arg0, 1);
	}

	public synchronized void keyTyped(KeyEvent arg0) {
		char var2 = arg0.getKeyChar();
		if (var2 != 65535 && Cp1252.method11687(var2)) {
			this.method15571(3, var2, -1);
			arg0.consume();
		}
	}

	public void focusGained(FocusEvent arg0) {
	}

	public synchronized void focusLost(FocusEvent arg0) {
		this.method15571(-1, '\u0000', 0);
	}
}
