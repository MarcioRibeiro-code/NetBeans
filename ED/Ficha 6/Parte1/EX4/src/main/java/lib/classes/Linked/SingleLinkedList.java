package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T> implements ListADT<T> {
  protected SingleNode<T> pre;
  protected SingleNode<T> post;
  int size;

  public SingleLinkedList() {
    this.size = 0;
    pre = null;
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {
    final T value = pre.getElement();


    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    pre = pre.getNext();
    post.setNext(pre);
    size--;
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    SingleNodeIterator iterator = new SingleNodeIterator();
    while (iterator.current.getNext() != post) {
      iterator.next();
    }
    iterator.current.setNext(post.getNext());
    T value = this.post.getElement();
    this.post = iterator.current;

    size--;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }


    return null;
  }

  @Override
  public T first() {
    return pre.getElement();
  }

  @Override
  public T last() {

    SingleNodeIterator iterator = (SingleNodeIterator) iterator();
    T value = null;
    while (iterator.hasNext()) {
      value = iterator.next();
    }

    return value;
  }

  @Override
  public boolean isEmpty() {
    return (size == 0);
  }

  @Override
  public int size() {
    return size;
  }

  class SingleNodeIterator implements Iterator<T> {
    SingleNode<T> current;
    int count = 0;

    SingleNodeIterator() {
      current = pre;
    }

    @Override
    public boolean hasNext() {
      return (count < size());
    }

    @Override
    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      current = current.getNext();
      count++;
      return current.getElement();
    }

    @Override
    public void remove() {
      current.setNext(current.getNext());
    }
  }

  @Override
  public Iterator<T> iterator() {
    return new SingleNodeIterator();
  }


  public String toString() {
    SingleNodeIterator singleNodeIterator = (SingleNodeIterator) iterator();
    String returno = "pre";
    while (singleNodeIterator.hasNext()) {
      returno += singleNodeIterator.current.getElement();
      singleNodeIterator.next();
    }
    return returno;
  }

}
