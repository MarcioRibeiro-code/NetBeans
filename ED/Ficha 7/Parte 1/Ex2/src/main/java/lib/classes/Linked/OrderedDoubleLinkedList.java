package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.OrderedListADT;

public class OrderedDoubleLinkedList<T extends Comparable<T>> extends DoubleLinkedList<T> implements OrderedListADT<T> {
  @Override
  public void add(Comparable<T> element) {

    T value;
    try {
      value = (T) element;
    } catch (ClassCastException e) {
      throw new RuntimeException();
    }

    DoubleNode<T> toAdd = new DoubleNode<>((T) element);
    System.out.println("Size:" + size());
    if (size() > 0) {
      DoublelinkListIterator it = (DoublelinkListIterator) iterator();
      while (it.hasNext() && ((T) element).compareTo(it.current.getElement()) > 0) {
        it.next();
      }
      System.out.println("Elemnet:" + it.current.getElement());
      toAdd.setNext(it.current);
      toAdd.setPrevious(it.current.getPrevious());
      it.current.getPrevious().setNext(toAdd);
      it.current.setPrevious(toAdd);
      size++;
    } else {
      toAdd.setNext(pre.getNext());
      toAdd.setPrevious(pre);
      pre.getNext().setPrevious(toAdd);
      pre.setNext(toAdd);
      size++;
    }


  }


  public static void main(String[] args) {
    OrderedDoubleLinkedList<String> dll = new OrderedDoubleLinkedList<String>();
    dll.add("2");
    dll.add("2");

    dll.add("4");
    try {
      dll.remove("5");
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    dll.rec_reverse();
    System.out.println(dll.toString());

   /* dll.add("3");


    try {
      //dll.removeFirst();
      //dll.removeLast();
      System.out.println(dll.remove("3"));
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }

    System.out.println(dll.toString());*/
  }
}
