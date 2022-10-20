package lib;

public class LinkedList<T> implements lib.Interfaces.LinkedList<T> {

  private T value;
  private int size;
  private LinkedList<T> obj;

  public LinkedList() {
    size = 0;
  }

  public LinkedList(T value) {
    size = 0;
    obj = null;
    this.value = value;
  }


  public void setObj(LinkedList<T> ls) {
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
    LinkedList<T> newHead = new LinkedList<T>(t);
    if (!isEmpty()) {
      LinkedList<T> oldHead = (LinkedList<T>) getNext();
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
    LinkedList<T> chosen = obj;
    T t = chosen.value;
    obj = (LinkedList<T>) obj.getNext();
    size--;
    return t;
  }

  @Override
  public T peek() {
    if (isEmpty()) {
      System.err.println("EMPTY STACK");
    }
    LinkedList<T> chosen = obj;

    return chosen.value;
  }

  @Override
  public Object getNext() {

    return this.obj;
  }

  @Override
  public String toString() {
    String returno = "";
    LinkedList<T> current = this;

    do {


      returno += (current.value != null) ? ("->" + current.value.toString()) : "";
      current = (LinkedList<T>) current.getNext();
    } while (current != null);

    return returno;
  }
}

