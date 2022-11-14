package lib;


import lib.Exception.EmptyCollectionException;
import lib.Interfaces.StackADT;


/**
 * .
 * Opera&ccedil;&otilde;es da Stack
 * push - ADDS to the top
 * pop - Removes an element from the top
 * peek - Examines the element at the top
 * isEmpty - Determines if the stack is empty
 * size - Determines the number of elements
 */
public class ArrayStack<T> implements StackADT<T> {

  protected int top;
  protected T[] stack;

  /**
   * .
   * Default Constructor.
   * ArraySize = 100 (default_capacity)
   */
  public ArrayStack() {
    top = 0;
    int defaultCapacity = 100;
    stack = (T[]) (new Object[defaultCapacity]);
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

  private void expandCapacity() {
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
    return top;
  }


  @Override
  public String toString() {
    String returno = "";

    for (int i = 0; i < size(); i++) {
      returno += this.stack[i] + " ";
    }

    return returno;
  }
}