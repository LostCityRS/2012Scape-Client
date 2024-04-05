import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("uo")
public final class HashTable implements Iterable {

    @ObfuscatedName("uo.u")
    public int bucketCount;

    @ObfuscatedName("uo.j")
    public Node[] buckets;

    @ObfuscatedName("uo.a")
    public long searchKey;

    @ObfuscatedName("uo.s")
    public Node searchCursor;

    @ObfuscatedName("uo.c")
    public Node iteratorCursor;

    @ObfuscatedName("uo.m")
    public int iteratorBucket = 0;

    public HashTable(int bucketCount) {
        this.bucketCount = bucketCount;
        this.buckets = new Node[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            Node sentinel = this.buckets[i] = new Node();
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
        }
    }

    @ObfuscatedName("uo.u(J)Lnz;")
    public Node get(long key) {
        this.searchKey = key;
        Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
        for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
            if (this.searchCursor.key == key) {
                Node value = this.searchCursor;
                this.searchCursor = this.searchCursor.next;
                return value;
            }
        }
        this.searchCursor = null;
        return null;
    }

    @ObfuscatedName("uo.j(I)Lnz;")
    public Node nextWithKey() {
        if (this.searchCursor == null) {
            return null;
        }
        Node sentinel = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
        while (this.searchCursor != sentinel) {
            if (this.searchCursor.key == this.searchKey) {
                Node node = this.searchCursor;
                this.searchCursor = this.searchCursor.next;
                return node;
            }
            this.searchCursor = this.searchCursor.next;
        }
        this.searchCursor = null;
        return null;
    }

    @ObfuscatedName("uo.a([Lnz;I)I")
    public int toArray(Node[] array) {
        int size = 0;
        for (int i = 0; i < this.bucketCount; i++) {
            Node sentinel = this.buckets[i];
            for (Node node = sentinel.next; node != sentinel; node = node.next) {
                array[size++] = node;
            }
        }
        return size;
    }

    @ObfuscatedName("uo.s(B)I")
    public int size() {
        int size = 0;
        for (int i = 0; i < this.bucketCount; i++) {
            Node sentinel = this.buckets[i];
            for (Node var4 = sentinel.next; var4 != sentinel; var4 = var4.next) {
                size++;
            }
        }
        return size;
    }

    @ObfuscatedName("uo.c(Lnz;J)V")
    public void put(Node value, long key) {
        if (value.prev != null) {
            value.unlink();
        }
        Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
        value.prev = sentinel.prev;
        value.next = sentinel;
        value.prev.next = value;
        value.next.prev = value;
        value.key = key;
    }

    @ObfuscatedName("uo.m(I)V")
    public void clear() {
        for (int i = 0; i < this.bucketCount; i++) {
            Node sentinel = this.buckets[i];
            while (true) {
                Node node = sentinel.next;
                if (sentinel == node) {
                    break;
                }
                node.unlink();
            }
        }
        this.searchCursor = null;
        this.iteratorCursor = null;
    }

    @ObfuscatedName("uo.t(B)Lnz;")
    public Node head() {
        this.iteratorBucket = 0;
        return this.next();
    }

    @ObfuscatedName("uo.l(B)Lnz;")
    public Node next() {
        if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
            Node node = this.iteratorCursor;
            this.iteratorCursor = node.next;
            return node;
        }
        Node node;
        do {
            if (this.iteratorBucket >= this.bucketCount) {
                return null;
            }
            node = this.buckets[++this.iteratorBucket - 1].next;
        } while (this.buckets[this.iteratorBucket - 1] == node);
        this.iteratorCursor = node.next;
        return node;
    }

    public Iterator iterator() {
        return new HashTableIterator(this);
    }
}
