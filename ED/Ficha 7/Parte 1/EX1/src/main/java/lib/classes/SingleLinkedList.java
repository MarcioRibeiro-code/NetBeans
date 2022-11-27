package lib.classes;

import lib.exception.EmptyCollectionException;
import lib.interfaces.ListADT;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T extends Comparable<T>> implements ListADT<T> {
  protected SingleNode<T> pre;
  int size;

  public SingleLinkedList() {
    this.size = 0;
    this.pre = null;
  }


  @Override
  public T removeFirst() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("Empty singly linked list");
    }

    final T value = this.pre.getElement();
    pre = pre.getNext();
    size--;
    return value;
  }

  @Override
  public T removeLast() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("Empty singly linked list");
    }

    if (size() == 1) {
      return removeFirst();
    }


    SingleNode<T> current = pre;
    SingleNodeIterator iterator = (SingleNodeIterator) iterator();
    while (iterator.hasNext() && current.getNext().getNext() != null) {
      iterator.next();
      current = iterator.getCurrent();
    }
    final T value = current.getNext().getElement();
    current.setNext(current.getNext().getNext());
    size--;
    return value;
  }

  @Override
  public T remove(Object element) throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("Empty singly linked list");
    }

    SingleNode<T> current = pre;
    SingleNode<T> previous = null;
    SingleNodeIterator iterator = (SingleNodeIterator) iterator();
    while (iterator.hasNext() && !current.getElement().equals(element)) {
      previous = current;
      iterator.next();
      current = iterator.getCurrent();
    }

    if (current == pre) {
      return removeFirst();
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
    return (size() == 0);
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public Iterator iterator() {
    return new SingleNodeIterator();
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
      SingleNode previous = current;
      current = current.getNext();
      count++;
      return (T) previous.getElement();
    }

    private SingleNode getCurrent() {
      return this.current;
    }
  }


  @Override
  public String toString() {

    /*
    SingleNodeIterator iterator = (SingleNodeIterator) iterator();
    String returno = "";
    while (iterator.hasNext()) {

      returno += iterator.next() + "->";
    }*/

    if (isEmpty()) {
      return "List is Empty";
    }

    return toString(pre);
  }

  /**
   * .
   * EX1
   * <p>
   * Escrever um metodo recursivo que imprime todos os elementos de uma lista simplesmente ligada,
   * do primeiro ao ultimo elemento. Deverá ser possivel usar o metodo para qualquer lista ligada à sua escolha.
   * Testar a solução desenvolvida.
   * </p>
   */
  private String toString(SingleNode node) {

    if (node.getNext() == null) {
      return node.getElement() + "";
    } else {
      return node.getElement() + toString(node.getNext());
    }
  }

}
