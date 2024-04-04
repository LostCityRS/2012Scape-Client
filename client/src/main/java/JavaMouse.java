import deob.ObfuscatedName;

import java.awt.event.*;

@ObfuscatedName("aeo")
public class JavaMouse extends Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

    @ObfuscatedName("aeo.s")
    public int field9787;

    @ObfuscatedName("aeo.c")
    public int field9781;

    @ObfuscatedName("aeo.m")
    public int field9783;

    @ObfuscatedName("aeo.t")
    public IterableQueue field9784 = new IterableQueue();

    @ObfuscatedName("aeo.l")
    public int field9785;

    @ObfuscatedName("aeo.f")
    public int field9786;

    @ObfuscatedName("aeo.d")
    public int field9789;

    @ObfuscatedName("aeo.z")
    public IterableQueue field9782 = new IterableQueue();

    @ObfuscatedName("aeo.n")
    public java.awt.Component field9778;

    @ObfuscatedName("aeo.o")
    public boolean field9790;

    public JavaMouse(java.awt.Component arg0, boolean arg1) {
        this.method15593(arg0);
        this.field9790 = arg1;
    }

    @ObfuscatedName("aeo.ap(Ljava/awt/Component;I)V")
    public void method15593(java.awt.Component arg0) {
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
        JavaMouseEvent var5 = JavaMouseEvent.method7559(arg0, arg1, arg2, MonotonicTime.get(), arg3);
        this.field9782.addFirst(var5);
    }

    @ObfuscatedName("aeo.ai(IIB)V")
    public void method15598(int arg0, int arg1) {
        this.field9785 = arg0;
        this.field9786 = arg1;
        if (this.field9790) {
            this.method15595(-1, arg0, arg1, 0);
        }
    }

    @ObfuscatedName("aeo.d(B)Ladv;")
    public JavaMouseEvent method7256() {
        return (JavaMouseEvent) this.field9784.method11560();
    }

    @ObfuscatedName("aeo.a(I)V")
    public synchronized void method7249() {
        this.field9787 = this.field9785;
        this.field9781 = this.field9786;
        this.field9783 = this.field9789;
        IterableQueue var1 = this.field9784;
        this.field9784 = this.field9782;
        this.field9782 = var1;
        this.field9782.clearBridged();
    }

    @ObfuscatedName("aeo.s(B)Z")
    public boolean method7250() {
        return (this.field9783 & 0x1) != 0;
    }

    @ObfuscatedName("aeo.c(I)Z")
    public boolean method7251() {
        return (this.field9783 & 0x2) != 0;
    }

    @ObfuscatedName("aeo.m(B)Z")
    public boolean method7252() {
        return (this.field9783 & 0x4) != 0;
    }

    @ObfuscatedName("aeo.l(I)I")
    public int getX() {
        return this.field9787;
    }

    @ObfuscatedName("aeo.f(I)I")
    public int getY() {
        return this.field9781;
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
        this.field9789 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method15599(arg0);
        if ((this.field9789 & var2) == 0) {
            var2 = this.field9789;
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
        this.field9789 &= ~var2;
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
