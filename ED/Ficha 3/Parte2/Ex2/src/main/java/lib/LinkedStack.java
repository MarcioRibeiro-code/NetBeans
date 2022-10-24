package lib;

import lib.Exceptions.EmptyCollectionException;
import lib.interfaces.StackAdt;

public class LinkedStack<T> implements StackAdt<T> {

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
      LinkedStack<T> oldHead = (LinkedStack<T>) getNext();
      newHead.setObj(oldHead);
    }
    this.obj = newHead;


    size++;
  }


  public T pop() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("EMPTY STACK");
    }
    LinkedStack<T> chosen = obj;
    T t = chosen.value;
    obj = (LinkedStack<T>) obj.getNext();
    size--;
    return t;
  }

  @Override
  public T peek() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("EMPTY STACK");
    }
    LinkedStack<T> chosen = obj;

    return chosen.value;
  }

  @Override
  public Object getNext() {

    return this.obj;
  }

  @Override
  public String toString() {
    String returns = "";
    LinkedStack<T> current = this;

    do {


      returns += (current.value != null) ? ("->" + current.value) : "";
      current = (LinkedStack<T>) current.getNext();
    } while (current != null);

    return returns;
  }
}

