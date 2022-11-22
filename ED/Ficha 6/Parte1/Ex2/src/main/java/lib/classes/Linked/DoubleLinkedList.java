package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {
  protected DoubleNode<T> pre;
  protected DoubleNode<T> post;
  protected int size = 0;

  DoubleLinkedList() {
    pre = new DoubleNode<>();
    post = new DoubleNode<>();
    pre.setNext(post);
    post.setPrevious(pre);
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {
    final T value = pre.getNext().getElement();


    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    pre.setNext(pre.getNext().getNext());
    pre.getNext().setPrevious(pre);
    size--;
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }

    final T value = post.getPrevious().getElement();
    post.getPrevious().getPrevious().setNext(post);
    post.setPrevious(post.getPrevious().getPrevious());
    size--;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("list");
    }


    Object value = null;
    DoublelinkListIterator it = (DoublelinkListIterator) iterator();

    while (it.hasNext()) {
      if (it.current.getElement().equals(element)) {
        it.remove();
        break;
      }
      it.next();
    }


    return (T) value;
  }


  @Override
  public T first() {
    return pre.getNext().getElement();
  }

  @Override
  public T last() {

    return post.getPrevious().getElement();
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
      current = pre.getNext();
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
      current.getPrevious().setNext(current.getNext());
      current.getNext().setPrevious(current.getPrevious());
    }

  }


  @Override
  public Iterator<T> iterator() {
    return new DoublelinkListIterator();
  }


  @Override
  public String toString() {
    DoubleNode<T> current = post;
    String returno = "";
    while (current != null) {
      returno += (current.getElement() != null) ? current.getElement() : "";
      current = current.getPrevious();
    }
    return returno;
  }


}
