import deob.ObfuscatedName;

@ObfuscatedName("ajz")
public class MiniMenuSubMenu extends SecondaryNode {

    @ObfuscatedName("ajz.t")
    public final String field10344;

    @ObfuscatedName("ajz.l")
    public final SecondaryLinkedList field10345;

    @ObfuscatedName("ajz.f")
    public int size;

    public MiniMenuSubMenu(String arg0) {
        this.field10344 = arg0;
        this.field10345 = new SecondaryLinkedList();
    }

    @ObfuscatedName("ajz.u(I)I")
    public int method16648() {
        return this.field10345.sentinel.secondaryNext == this.field10345.sentinel ? -1 : ((MiniMenuEntry) this.field10345.sentinel.secondaryNext).menuAction;
    }

    @ObfuscatedName("ajz.j(Lajs;I)Z")
    public boolean method16644(MiniMenuEntry arg0) {
        boolean var2 = true;
        arg0.unlinkSecondary();
        MiniMenuEntry var3 = (MiniMenuEntry) this.field10345.head();
        while (var3 != null) {
            if (MiniMenu.method5825(arg0.menuAction, var3.menuAction)) {
                SecondaryLinkedList.insertBefore(arg0, var3);
                this.size++;
                return !var2;
            }
            var3 = (MiniMenuEntry) this.field10345.next();
            var2 = false;
        }
        this.field10345.addFirst(arg0);
        this.size++;
        return var2;
    }

    @ObfuscatedName("ajz.a(Lajs;I)Z")
    public boolean method16650(MiniMenuEntry arg0) {
        int var2 = this.method16648();
        arg0.unlinkSecondary();
        this.size--;
        if (this.size != 0) {
            return var2 != this.method16648();
        }
        this.unlink();
        this.unlinkSecondary();
        MiniMenu.field594--;
        MiniMenu.field600.method7937(this, arg0.field10330);
        return false;
    }
}
