import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("tv")
public class SecondaryLinkedList implements Iterable {

    @ObfuscatedName("tv.u")
    public SecondaryNode sentinel = new SecondaryNode();

    @ObfuscatedName("tv.j")
    public SecondaryNode cursor;

    public SecondaryLinkedList() {
        this.sentinel.secondaryNext = this.sentinel;
        this.sentinel.secondaryPrev = this.sentinel;
    }

    @ObfuscatedName("tv.u(I)V")
    public void clear() {
        while (this.sentinel.secondaryNext != this.sentinel) {
            this.sentinel.secondaryNext.unlinkSecondary();
        }
    }

    @ObfuscatedName("tv.j(Ladi;I)V")
    public void addFirst(SecondaryNode node) {
        if (node.secondaryPrev != null) {
            node.unlinkSecondary();
        }
        node.secondaryPrev = this.sentinel.secondaryPrev;
        node.secondaryNext = this.sentinel;
        node.secondaryPrev.secondaryNext = node;
        node.secondaryNext.secondaryPrev = node;
    }

    @ObfuscatedName("rs.a(Ladi;Ladi;I)V")
    public static void insertBefore(SecondaryNode node, SecondaryNode position) {
        if (node.secondaryPrev != null) {
            node.unlinkSecondary();
        }
        node.secondaryPrev = position.secondaryPrev;
        node.secondaryNext = position;
        node.secondaryPrev.secondaryNext = node;
        node.secondaryNext.secondaryPrev = node;
    }

    @ObfuscatedName("cr.s(Ladi;Ladi;B)V")
    public static void insertAfter(SecondaryNode node, SecondaryNode position) {
        if (node.secondaryPrev != null) {
            node.unlinkSecondary();
        }
        node.secondaryPrev = position;
        node.secondaryNext = position.secondaryNext;
        node.secondaryPrev.secondaryNext = node;
        node.secondaryNext.secondaryPrev = node;
    }

    @ObfuscatedName("tv.c(I)Ladi;")
    public SecondaryNode removeHead() {
        SecondaryNode head = this.sentinel.secondaryNext;
        if (this.sentinel == head) {
            return null;
        } else {
            head.unlinkSecondary();
            return head;
        }
    }

    @ObfuscatedName("tv.m(I)Ladi;")
    public SecondaryNode head() {
        return this.method11731(null);
    }

    @ObfuscatedName("tv.t(Ladi;I)Ladi;")
    public SecondaryNode method11731(SecondaryNode position) {
        SecondaryNode node;
        if (position == null) {
            node = this.sentinel.secondaryNext;
        } else {
            node = position;
        }
        if (this.sentinel == node) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = node.secondaryNext;
            return node;
        }
    }

    @ObfuscatedName("tv.l(I)Ladi;")
    public SecondaryNode next() {
        SecondaryNode node = this.cursor;
        if (this.sentinel == node) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = node.secondaryNext;
            return node;
        }
    }

    @ObfuscatedName("tv.f(I)I")
    public int size() {
        int size = 0;
        for (SecondaryNode node = this.sentinel.secondaryNext; node != this.sentinel; node = node.secondaryNext) {
            size++;
        }
        return size;
    }

    public Iterator iterator() {
        return new SecondaryLinkedListIterator(this);
    }
}
