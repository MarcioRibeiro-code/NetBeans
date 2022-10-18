package ex1.lib;

import ex1.lib.Interfaces.*;
import ex1.lib.Exception.*;

public class ArrayStack<T> implements StackADT<T> {

    private final int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initialCap) {
        top = 0;
        stack = (T[]) (new Object[initialCap]);
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top++] = element;
    }

    public void expandCapacity() {
        T[] expanded = (T[]) (new Object[size() * 2]);

        System.arraycopy(this.stack, 0, expanded, 0, top);

    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }
        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }

        return this.stack[top - 1];
    }

    @Override
    public boolean isEmpty() {

        return (top == 0);
    }

    @Override
    public int size() {
        return (top - 1);
    }

    /**
     * Operações da Stack
     * push - ADDS to the top
     * pop - Removes an element from the top
     * peek - Examines the element at the top
     * isEmpty - Determines if the stack is empty
     * size - Determines the number of elements
     */

}