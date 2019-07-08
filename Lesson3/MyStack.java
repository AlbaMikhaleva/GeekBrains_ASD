package Lesson3;

import java.util.NoSuchElementException;

public class MyStack<Item> {

    private int size;
    private Object[] stack = new Object[1];

    public int size() {
        return size;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] tmp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = stack[i];
        }
        stack = tmp;
    }

    public void push(Item item) {
        if (size == stack.length) {
            resize(stack.length * 2);
        }
        stack[size] = item;
        size++;
    }

    public Item pop() {
        if (IsEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        Item item = (Item) stack[size - 1];
        stack[size - 1] = null;
        size--;
        if (size == stack.length / 4 && size >0) {
            resize(stack.length / 2);
        }
        return item;
    }

    public Item peek() {
        if (IsEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return (Item) stack[size - 1];
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(stack[i] + " ");
        }
        return str.toString();
    }
}
