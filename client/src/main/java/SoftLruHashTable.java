import deob.ObfuscatedName;

@ObfuscatedName("pm")
public final class SoftLruHashTable {

    @ObfuscatedName("pm.u")
    public int field4826;

    @ObfuscatedName("pm.j")
    public int available;

    @ObfuscatedName("pm.a")
    public HashTable table;

    @ObfuscatedName("pm.s")
    public SecondaryLinkedList queue;

    public SoftLruHashTable(int capacity) {
        this(capacity, capacity);
    }

    public SoftLruHashTable(int capacity, int size) {
        this.queue = new SecondaryLinkedList();
        this.field4826 = capacity;
        this.available = capacity;
        int bucketCount;
        for (bucketCount = 1; bucketCount + bucketCount < capacity && bucketCount < size; bucketCount += bucketCount) {
        }
        this.table = new HashTable(bucketCount);
    }

    @ObfuscatedName("pm.u(J)Ljava/lang/Object;")
    public Object get(long key) {
        ReferenceNode node = (ReferenceNode) this.table.get(key);
        if (node == null) {
            return null;
        }
        Object value = node.get();
        if (value == null) {
            node.unlink();
            node.unlinkSecondary();
            this.available += node.weight;
            return null;
        }
        if (node.isSoft()) {
            HardReferenceNode hardNode = new HardReferenceNode(value, node.weight);
            this.table.put(hardNode, node.key);
            this.queue.addFirst(hardNode);
            hardNode.secondaryKey = 0L;
            node.unlink();
            node.unlinkSecondary();
        } else {
            this.queue.addFirst(node);
            node.secondaryKey = 0L;
        }
        return value;
    }

    @ObfuscatedName("pm.j(J)V")
    public void method7917(long key) {
        ReferenceNode node = (ReferenceNode) this.table.get(key);
        this.method7950(node);
    }

    @ObfuscatedName("pm.a(Lajc;B)V")
    public void method7950(ReferenceNode node) {
        if (node != null) {
            node.unlink();
            node.unlinkSecondary();
            this.available += node.weight;
        }
    }

    @ObfuscatedName("pm.s(Ljava/lang/Object;J)V")
    public void method7937(Object arg0, long arg1) {
        this.method7918(arg0, arg1, 1);
    }

    @ObfuscatedName("pm.c(Ljava/lang/Object;JII)V")
    public void method7918(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field4826) {
            throw new IllegalStateException();
        }
        this.method7917(arg1);
        this.available -= arg2;
        while (this.available < 0) {
            ReferenceNode var5 = (ReferenceNode) this.queue.removeHead();
            this.method7950(var5);
        }
        HardReferenceNode var6 = new HardReferenceNode(arg0, arg2);
        this.table.put(var6, arg1);
        this.queue.addFirst(var6);
        var6.secondaryKey = 0L;
    }

    @ObfuscatedName("pm.m(II)V")
    public void method7921(int arg0) {
        for (ReferenceNode var2 = (ReferenceNode) this.queue.head(); var2 != null; var2 = (ReferenceNode) this.queue.next()) {
            if (var2.isSoft()) {
                if (var2.get() == null) {
                    var2.unlink();
                    var2.unlinkSecondary();
                    this.available += var2.weight;
                }
            } else if (++var2.secondaryKey > (long) arg0) {
                SoftReferenceNode var3 = new SoftReferenceNode(var2.get(), var2.weight);
                this.table.put(var3, var2.key);
                SecondaryLinkedList.insertAfter(var3, var2);
                var2.unlink();
                var2.unlinkSecondary();
            }
        }
    }

    @ObfuscatedName("pm.t(S)V")
    public void method7922() {
        this.queue.clear();
        this.table.clear();
        this.available = this.field4826;
    }

    @ObfuscatedName("pm.l(B)I")
    public int method7923() {
        return this.field4826;
    }

    @ObfuscatedName("pm.f(I)I")
    public int getAvailable() {
        return this.available;
    }

    @ObfuscatedName("pm.d(I)I")
    public int size() {
        int size = 0;
        for (ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
            if (!node.isSoft()) {
                size++;
            }
        }
        return size;
    }

    @ObfuscatedName("pm.z(B)V")
    public void removeSoft() {
        for (ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
            if (node.isSoft()) {
                node.unlink();
                node.unlinkSecondary();
                this.available += node.weight;
            }
        }
    }

    @ObfuscatedName("pm.n(B)Ljava/lang/Object;")
    public Object method7931() {
        ReferenceNode var1 = (ReferenceNode) this.table.head();
        while (var1 != null) {
            Object var2 = var1.get();
            if (var2 != null) {
                return var2;
            }
            ReferenceNode var3 = var1;
            var1 = (ReferenceNode) this.table.next();
            var3.unlink();
            var3.unlinkSecondary();
            this.available += var3.weight;
        }
        return null;
    }

    @ObfuscatedName("pm.o(B)Ljava/lang/Object;")
    public Object method7949() {
        ReferenceNode var1 = (ReferenceNode) this.table.next();
        while (var1 != null) {
            Object var2 = var1.get();
            if (var2 != null) {
                return var2;
            }
            ReferenceNode var3 = var1;
            var1 = (ReferenceNode) this.table.next();
            var3.unlink();
            var3.unlinkSecondary();
            this.available += var3.weight;
        }
        return null;
    }
}
