package lib.classes.Array;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements ListADT<T> {
  protected final int DEFAULT_CAPACITY = 100;
  private final int NOT_FOUND = -1;
  protected int rear;
  protected Object[] list;

  class ArrayIterator implements Iterator<T> {

    protected int current;

    ArrayIterator() {
      this.current = 0;
    }

    @Override
    public boolean hasNext() {
      return (this.current < rear);
    }

    @Override
    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }


      return (T) list[this.current++];
    }

    @Override
    public void remove() {
      list[this.current - 1] = null;
      System.arraycopy(list, this.current, list, this.current - 1, rear);
      rear--;
    }
  }

  public ArrayList() {
    this.list = (T[]) new Object[DEFAULT_CAPACITY];
    this.rear = 0;
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    ArrayIterator at = (ArrayIterator) iterator();
    T value = at.next();
    at.remove();
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    T value = (T) this.list[--rear];
    this.list[rear] = null;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    T value = null;
    ArrayIterator at = (ArrayIterator) iterator();

    while (at.hasNext()) {
      value = at.next();
      if (value.equals(element)) {
        at.remove();
      }
    }


    return value;
  }

  @Override
  public T first() {
    return (T) list[0];
  }

  @Override
  public T last() {
    return (T) list[rear];
  }

  @Override
  public boolean isEmpty() {
    return (size() == 0);
  }

  @Override
  public int size() {

    return this.rear;
  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayIterator();
  }

  @Override
  public String toString() {
    ArrayIterator it = (ArrayIterator) iterator();
    String returno = "";
    while (it.hasNext()) {
      returno += it.next();
    }
    return returno;
  }

}
