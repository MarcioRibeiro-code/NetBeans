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
        size--;
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
    DoubleNode<T> current = pre;
    String returno = "";
    while (current != null) {
      returno += (current.getElement() != null) ? current.getElement() : "";
      current = current.getNext();
    }
    return returno;
  }


  private static DoubleNode ReverseHelper(DoubleNode node) {
    // If empty list, return
    if (node == null)
      return null;

    // Otherwise, swap the next and prev
    DoubleNode temp = node.getNext();
    node.setNext(node.getPrevious());
    node.setPrevious(temp);

    // If the prev is now null, the list
    // has been fully reversed
    if (node.getPrevious() == null)
      return node;

    // Otherwise, keep going
    return ReverseHelper(node.getPrevious());
  }

  public void rec_reverse() {

    DoubleNode current = ReverseHelper(pre);
    DoubleNode temp = pre;
    pre = post;
    post = temp;
  }

  public void reverse() {
    //Node current will point to head
    DoubleNode current = pre, temp = null;

    //Swap the previous and next pointers of each node to reverse the direction of the list
    while (current != null) {
      temp = current.getNext();
      current.setNext(current.getPrevious());
      current.setPrevious(temp);
      current = current.getPrevious();
    }
    //Swap the head and tail pointers.
    temp = pre;
    pre = post;
    post = temp;
  }

  public void replace(T existingElement, T newElement) {
    replaceHelper(this.pre, existingElement, newElement);
  }

  private void replaceHelper(DoubleNode<T> node, T target, T element) {
    if (node == null) {
      return;
    }


    if (node.getElement() != null && node.getElement().equals(target)) {
      node.setElement(element);
    }


    // Otherwise, keep going
    replaceHelper(node.getNext(), target, element);

  }


}