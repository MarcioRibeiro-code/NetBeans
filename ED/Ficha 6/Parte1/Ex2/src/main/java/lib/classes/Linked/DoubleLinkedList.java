package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {
  protected DoubleNode<T> pre;
  protected DoubleNode<T> post;
  protected int size;

  DoubleLinkedList() {
    pre = post = null;
    size = 0;
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("Empty List");
    }
    final T value = pre.getElement();

    if (pre.getNext() == pre) {
      pre = null;
    } else {
      post = pre;

      DoublelinkListIterator iterator = (DoublelinkListIterator) iterator();
      while (iterator.hasNext()) {
        iterator.next();
      }
      pre = pre.getNext();
      iterator.current.setNext(pre);
    }
    size--;
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("Empty List");
    }
    final T value = post.getElement();

    if (pre.getNext() == pre) {
      pre = null;
    } else {
      DoubleNode<T> tempNode = pre;
      DoublelinkListIterator iterator = (DoublelinkListIterator) iterator();
      while (iterator.current.getNext().getNext() != pre) {
        iterator.next();
        tempNode = iterator.current;
      }
      tempNode.setNext(pre);

    }
    size--;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    DoubleNode current = pre, prev = null;

    DoublelinkListIterator iterator = (DoublelinkListIterator) iterator();
    while (iterator.hasNext() && !iterator.current.getElement().equals(element)) {
      if (iterator.current.getNext() == pre) {
        throw new NoSuchElementException("List doesnt have node with value: " + element);
      }
      prev = iterator.current;
      iterator.next();
      current = iterator.current;
    }

    if (iterator.current.getNext() == pre && prev == null) {
      final T value = pre.getElement();
      pre = null;
      return value;
    }
    final T value = iterator.current.getElement();
    if (iterator.current == pre) {

      prev = pre.getPrevious();
      pre = pre.getNext();

      prev.setNext(pre);
      pre.setPrevious(prev);
    } else if (iterator.current.getNext() == pre) {
      prev.setNext(pre);
      pre.setPrevious(prev);
    } else {
      DoubleNode temp = iterator.current.getNext();
      prev.setNext(temp);
      temp.setPrevious(prev);
    }

    size--;
    return value;
  }


  @Override
  public T first() {
    return pre.getElement();
  }

  @Override
  public T last() {

    return post.getElement();
  }

  @Override
  public boolean isEmpty() {
    return (size() == 0);
  }

  @Override
  public int size() {
    return this.size;
  }

  class DoublelinkListIterator implements Iterator<T> {

    DoubleNode<T> current;
    int count = 0;

    DoublelinkListIterator() {
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
      final T value = current.getElement();
      current = current.getNext();
      count++;
      return value;
    }

  }


  @Override
  public Iterator<T> iterator() {
    return new DoublelinkListIterator();
  }


  @Override
  public String toString() {
    DoublelinkListIterator iterator = (DoublelinkListIterator) iterator();
    String returno = "pre";
    while (iterator.hasNext()) {
      returno += iterator.next();
    }

    return returno + "post";
  }


}
