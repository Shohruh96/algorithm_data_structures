package org.example.src.algorithms.doublyLinkedList;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
    private DoublyLinkedNode<T> head;
    private DoublyLinkedNode<T> tail;
    private int count;

    public void addFirst(T value) {
        addFirst(new DoublyLinkedNode<T>(value));
    }

    private void addFirst(DoublyLinkedNode<T> node) {
        DoublyLinkedNode<T> temp = head;
        head = node;
        head.setNext(temp);

        if (isEmpty()) {
            tail = head;
        } else {
            temp.setPrevious(head);
        }

        count++;
    }

    public void addLast(T value) {
        addLast(new DoublyLinkedNode<T>(value));
    }
    private void addLast(DoublyLinkedNode<T> node) {
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        count++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        head = head.getNext();
        count--;

        if (isEmpty()) {
            tail = null;
        } else {
            head.setPrevious(null);
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        if (count == 1) {
            head = null;
            tail = null;
        } else {
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }

        count--;
    }

    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator();
    }
    private class DoublyLinkedListIterator implements Iterator<T> {
        private DoublyLinkedNode<T> current = head;

        public boolean hasNext() {
            return current != null;
        }
        public T next() {
            T value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}








