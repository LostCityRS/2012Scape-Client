import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("uk")
public class HashTableIterator implements Iterator {

    @ObfuscatedName("uk.u")
    public HashTable table;

    @ObfuscatedName("uk.j")
    public Node cursor;

    @ObfuscatedName("uk.a")
    public int bucket;

    @ObfuscatedName("uk.s")
    public Node field6728 = null;

    public HashTableIterator(HashTable table) {
        this.table = table;
        this.method11950();
    }

    @ObfuscatedName("uk.f(I)V")
    public void method11950() {
        this.cursor = this.table.buckets[0].next;
        this.bucket = 1;
        this.field6728 = null;
    }

    @ObfuscatedName("uk.d(B)Lnz;")
    public Node method11955() {
        this.method11950();
        return (Node) this.next();
    }

    public Object next() {
        if (this.table.buckets[this.bucket - 1] != this.cursor) {
            Node node = this.cursor;
            this.cursor = node.next;
            this.field6728 = node;
            return node;
        }
        Node node;
        do {
            if (this.bucket >= this.table.bucketCount) {
                return null;
            }
            node = this.table.buckets[++this.bucket - 1].next;
        } while (this.table.buckets[this.bucket - 1] == node);
        this.cursor = node.next;
        this.field6728 = node;
        return node;
    }

    public boolean hasNext() {
        if (this.table.buckets[this.bucket - 1] != this.cursor) {
            return true;
        }
        while (this.bucket < this.table.bucketCount) {
            if (this.table.buckets[++this.bucket - 1].next != this.table.buckets[this.bucket - 1]) {
                this.cursor = this.table.buckets[this.bucket - 1].next;
                return true;
            }
            this.cursor = this.table.buckets[this.bucket - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field6728 == null) {
            throw new IllegalStateException();
        }
        this.field6728.unlink();
        this.field6728 = null;
    }
}
