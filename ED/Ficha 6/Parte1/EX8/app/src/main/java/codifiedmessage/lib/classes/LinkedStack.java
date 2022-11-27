package codifiedmessage.lib.classes;

import codifiedmessage.lib.interfaces.StackADT;

public class LinkedStack<T> implements StackADT<T> {

  private T value;
  private int size;
  private LinkedStack<T> obj;

  public LinkedStack() {
    size = 0;
  }

  public LinkedStack(T value) {
    size = 0;
    obj = null;
    this.value = value;
  }


  public void setObj(LinkedStack<T> ls) {
    this.obj = ls;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return (this.size == 0);
  }

  @Override
  public void push(T t) {
    LinkedStack<T> newHead = new LinkedStack<>(t);
    if (!isEmpty()) {
      LinkedStack<T> oldHead = getNext();
      newHead.setObj(oldHead);
      this.obj = newHead;
    } else {
      this.obj = newHead;
    }


    size++;
  }

  @Override
  public T pop() {
    if (isEmpty()) {
      System.err.println("EMPTY STACK");
    }
    LinkedStack<T> chosen = obj;
    T t = chosen.value;
    obj = obj.getNext();
    size--;
    return t;
  }

  @Override
  public T peek() {
    if (isEmpty()) {
      System.err.println("EMPTY STACK");
    }
    LinkedStack<T> chosen = obj;

    return chosen.value;
  }

  @Override
  public LinkedStack<T> getNext() {

    return this.obj;
  }

  @Override
  public String toString() {
    String returno = "";
    LinkedStack<T> current = this;

    do {


      returno += (current.value != null) ? ("->" + current.value.toString()) : "";
      current = current.getNext();
    } while (current != null);

    return returno;
  }
}
