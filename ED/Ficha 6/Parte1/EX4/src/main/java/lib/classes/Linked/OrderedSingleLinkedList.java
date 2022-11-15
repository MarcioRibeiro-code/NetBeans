package lib.classes.Linked;

import lib.interfaces.OrderedListADT;

public class OrderedSingleLinkedList<T extends Comparable<T>> extends SingleLinkedList<T> implements OrderedListADT<T> {
  @Override
  public void add(Comparable element) {
    SingleNode<T> toAdd = new SingleNode<>((T) element);

    if (size() > 0) {
      SingleNodeIterator it = (SingleNodeIterator) iterator();
      Comparable<T> temp = (Comparable<T>) element;


      while (it.hasNext() && temp.compareTo(it.current.getElement()) < 0) {
        System.out.println("Elemnet:" + it.current.getElement());
        it.next();
      }
      System.out.println("Elemnet after:" + it.current.getElement());
      toAdd.setNext(it.current.getNext());
      it.current.setNext(toAdd);
      // it.current.setPrevious(toAdd);
      size++;
    } else {
      toAdd.setNext(pre.getNext());
      // toAdd.setPrevious(pre);
      //  pre.getNext().setPrevious(toAdd);
      pre.setNext(toAdd);
      size++;
    }

  }

  public static void main(String[] args) {

    OrderedSingleLinkedList<String> orderedSingleLinkedList = new OrderedSingleLinkedList<>();

    orderedSingleLinkedList.add("1");
    orderedSingleLinkedList.add("3");
    orderedSingleLinkedList.add("2");

    System.out.println(orderedSingleLinkedList.toString());

  }

}
