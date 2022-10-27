package lib;

import lib.Exception.EmptyCollectionException;

public class Numbers<T> {
  private ArrayStack<T> arrayStack;

  public Numbers() {
    this.arrayStack = new ArrayStack<T>();
  }

  public Numbers(int size) {
    this.arrayStack = new ArrayStack<T>(size);
  }

  public void addElement(T value) {
    arrayStack.push(value);
  }

  public void removeElement() {
    try {
      System.out.println("Element Removed: " + arrayStack.pop());
    } catch (EmptyCollectionException e) {
      System.err.println(e.getString());
    }
  }

  public void getLast() {
    try {
      System.out.println("Last: " + arrayStack.peek());
    } catch (EmptyCollectionException e) {
      System.err.println(e.getString());
    }
  }

  @Override
  public String toString() {
    return "Numbers{" + "arrayStack="
        + arrayStack + '}';

  }
}
