package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T extends Comparable<T>> implements ListADT<T> {
  protected SingleNode<T> pre;
  protected SingleNode<T> post;
  int size;

  public SingleLinkedList() {
    this.size = 0;
    pre = null;
    post = null;
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("List is Empty");
    }
    final T value = post.getNext().getElement();

    if (size() > 1) {
      pre = pre.getNext();
      post.setNext(pre);
    } else {
      pre = post = null;
    }
    size--;
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("List is Empty");
    }

    SingleNodeIterator iterator = new SingleNodeIterator();
    while (iterator.hasNext() && !iterator.current.getNext().equals(post)) {
      iterator.next();
    }
    final T value = iterator.current.getNext().getElement();
    post = iterator.current;
    post.setNext(pre);
    size--;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("List is Empty");
    }

    SingleNode<T> current = pre;
    SingleNode<T> previous = null;

    SingleNodeIterator iterator = (SingleNodeIterator) iterator();

    while (iterator.hasNext() && !iterator.current.getElement().equals(element)) {

      if (current.getNext() == pre) {
        throw new NoSuchElementException("Given Node is not found in the list");
      }

      previous = iterator.current;
      iterator.next();
      current = iterator.current;
    }

    if (current == pre && current.getNext() == pre) {
      final T value = pre.getElement();
      pre = null;
      size--;
      return value;
    }

    if (current == pre) {
      final T value = current.getElement();
      previous = pre;
      while (previous.getNext() != pre) {
        previous = previous.getNext();
      }
      pre = current.getNext();
      previous.setNext(pre);
      size--;
      return value;
    } else if (current.getNext() == pre) {
      final T value = current.getElement();

      previous.setNext(pre);
      size--;
      return value;
    } else {
      final T value = current.getElement();
      previous.setNext(current.getNext());
      size--;
      return value;
    }

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
    return returno + "post";
  }

}
