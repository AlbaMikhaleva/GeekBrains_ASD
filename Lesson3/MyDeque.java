package Lesson3;

import java.util.NoSuchElementException;

public class MyDeque<Item> {
    private int size;
    private Object[] deque = new Object[1];
    private int right;
    private int left;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] tmp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = deque[i];
        }
        deque = tmp;
    }

    public void insertLeft(Item item) {
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        for (int i = size; i > 0; i--) {
            deque[i] = deque[i - 1];
        }
        deque[0] = item;
        size++;
    }

    public void insertRight(Item item) {
        right = size;
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        deque[size] = item;
        size++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(deque[i] + " ");
        }
        return str.toString();
    }

    public Item removeLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = (Item) deque [0];
        deque[0] = null;
        for (int i = 0; i < size ; i++) {
            deque[i] = deque [i+1];
        }
        --size;
        if (size == deque.length / 4 && size > 0) {
            resize(deque.length / 2);
        }
        return item;
    }

    public Item  removeRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = (Item) deque [size-1];
        deque[size-1] = null;
        --size;
        if (size == deque.length / 4 && size > 0) {
            resize(deque.length / 2);
        }
        return item;
    }

}
