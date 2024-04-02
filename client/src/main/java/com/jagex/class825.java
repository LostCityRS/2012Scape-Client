package com.jagex;

import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aeo")
public class class825 extends class414 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@ObfuscatedName("aeo.s")
	public int field9787;

	@ObfuscatedName("aeo.c")
	public int field9781;

	@ObfuscatedName("aeo.m")
	public int field9783;

	@ObfuscatedName("aeo.t")
	public class547 field9784 = new class547();

	@ObfuscatedName("aeo.l")
	public int field9785;

	@ObfuscatedName("aeo.f")
	public int field9786;

	@ObfuscatedName("aeo.d")
	public int field9789;

	@ObfuscatedName("aeo.z")
	public class547 field9782 = new class547();

	@ObfuscatedName("aeo.n")
	public Component field9778;

	@ObfuscatedName("aeo.o")
	public boolean field9790;

	public class825(Component arg0, boolean arg1) {
		this.method15593(arg0);
		this.field9790 = arg1;
	}

	@ObfuscatedName("aeo.ap(Ljava/awt/Component;I)V")
	public void method15593(Component arg0) {
		this.method15594();
		this.field9778 = arg0;
		this.field9778.addMouseListener(this);
		this.field9778.addMouseMotionListener(this);
		this.field9778.addMouseWheelListener(this);
	}

	@ObfuscatedName("aeo.ag(B)V")
	public void method15594() {
		if (this.field9778 == null) {
			return;
		}
		this.field9778.removeMouseWheelListener(this);
		this.field9778.removeMouseMotionListener(this);
		this.field9778.removeMouseListener(this);
		this.field9778 = null;
		this.field9783 = 0;
		this.field9781 = 0;
		this.field9787 = 0;
		this.field9789 = 0;
		this.field9786 = 0;
		this.field9785 = 0;
		this.field9784 = null;
		this.field9782 = null;
	}

	@ObfuscatedName("aeo.as(IIIII)V")
	public void method15595(int arg0, int arg1, int arg2, int arg3) {
		class961 var5 = class961.method7559(arg0, arg1, arg2, class153.method5554(), arg3);
		this.field9782.method11558(var5);
	}

	@ObfuscatedName("aeo.ai(IIB)V")
	public void method15598(int arg0, int arg1) {
		this.field9785 = arg0 * -1029444347;
		this.field9786 = arg1 * -1630997521;
		if (this.field9790) {
			this.method15595(-1, arg0, arg1, 0);
		}
	}

	@ObfuscatedName("aeo.d(B)Ladv;")
	public class809 method7256() {
		return (class809) this.field9784.method11560();
	}

	@ObfuscatedName("aeo.a(I)V")
	public synchronized void method7249() {
		this.field9787 = this.field9785 * 1054878145;
		this.field9781 = this.field9786 * -15904645;
		this.field9783 = this.field9789 * -154143175;
		class547 var1 = this.field9784;
		this.field9784 = this.field9782;
		this.field9782 = var1;
		this.field9782.method11557();
	}

	@ObfuscatedName("aeo.s(B)Z")
	public boolean method7250() {
		return (this.field9783 * 1982961849 & 0x1) != 0;
	}

	@ObfuscatedName("aeo.c(I)Z")
	public boolean method7251() {
		return (this.field9783 * 1982961849 & 0x2) != 0;
	}

	@ObfuscatedName("aeo.m(B)Z")
	public boolean method7252() {
		return (this.field9783 * 1982961849 & 0x4) != 0;
	}

	@ObfuscatedName("aeo.l(I)I")
	public int method7254() {
		return this.field9787 * 1698625805;
	}

	@ObfuscatedName("aeo.f(I)I")
	public int method7255() {
		return this.field9781 * 443628925;
	}

	@ObfuscatedName("aeo.z(I)V")
	public void method7257() {
		this.method15594();
	}

	public synchronized void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseEntered(MouseEvent arg0) {
		this.method15598(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseExited(MouseEvent arg0) {
		this.method15598(arg0.getX(), arg0.getY());
	}

	@ObfuscatedName("aeo.ao(Ljava/awt/event/MouseEvent;B)I")
	public int method15599(MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	public synchronized void mousePressed(MouseEvent arg0) {
		int var2 = this.method15599(arg0);
		if (var2 == 1) {
			this.method15595(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (var2 == 4) {
			this.method15595(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (var2 == 2) {
			this.method15595(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.field9789 = (this.field9789 * 1029949233 | var2) * -393596463;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseReleased(MouseEvent arg0) {
		int var2 = this.method15599(arg0);
		if ((this.field9789 * 1029949233 & var2) == 0) {
			var2 = this.field9789 * 1029949233;
		}
		if ((var2 & 0x1) != 0) {
			this.method15595(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((var2 & 0x4) != 0) {
			this.method15595(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((var2 & 0x2) != 0) {
			this.method15595(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.field9789 = (this.field9789 * 1029949233 & ~var2) * -393596463;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseDragged(MouseEvent arg0) {
		this.method15598(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseMoved(MouseEvent arg0) {
		this.method15598(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		int var4 = arg0.getWheelRotation();
		this.method15595(6, var2, var3, var4);
		arg0.consume();
	}
}
