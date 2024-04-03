package org.example.src.algorithms.stack;

import java.util.Iterator;

public class ArrayStack<T> implements Iterable<T> {
    private T[] _items;
    private int Count;

    public ArrayStack() {
        final int defaultCapacity = 4;
        _items = (T[]) new Object[defaultCapacity];
    }

    public ArrayStack(int capacity) {
        _items = (T[]) new Object[capacity];
    }

    public T peek() {
        if (isEmpty())
            throw new IllegalStateException();
        return _items[Count - 1];
    }

    public void pop() {
        if (isEmpty())
            throw new IllegalStateException();

        _items[--Count] = null;
    }

    public void push(T item) {
        if (_items.length == Count) {
            T[] largerArray = (T[]) new Object[Count * 2];
            System.arraycopy(_items, 0, largerArray, 0, Count);

            _items = largerArray;
        }
        _items[Count++] = item;
    }

    public boolean isEmpty() {
        return Count == 0;
    }

    public int getCount() {
        return Count;
    }

    public int getCapacity() {
        return _items.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<T> {
        private int currentIndex = Count - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public T next() {
            return _items[currentIndex--];
        }
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(21);
        stack.push(3);
        stack.push(7);
        stack.push(111);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
