package lib.classes.Linked;

import lib.interfaces.OrderedListADT;

public class OrderedSingleLinkedList<T extends Comparable<T>> extends SingleLinkedList<T> implements OrderedListADT<T> {
  @Override
  public void add(Comparable element) {
    SingleNode<T> toAdd = new SingleNode(element);


    if (pre == null) {
      pre = toAdd;
      post = toAdd;
      toAdd.setNext(pre);
    } else {

      if (element.compareTo(pre.getElement()) <= 0) {
        toAdd.setNext(pre);
        pre=toAdd;
        size++;
        return;
      }

      SingleNodeIterator iterator = (SingleNodeIterator) iterator();
      while (iterator.hasNext() && element.compareTo(iterator.current.getElement()) >= 0) {
        iterator.next();
      }
      toAdd.setNext(iterator.current.getNext());
      iterator.current.setNext(toAdd);
    }
    size++;


  }

  public static void main(String[] args) {

    OrderedSingleLinkedList<Integer> orderedSingleLinkedList = new OrderedSingleLinkedList<Integer>();

    orderedSingleLinkedList.add(4);
    orderedSingleLinkedList.add(40);
    orderedSingleLinkedList.add(1);

    System.out.println(orderedSingleLinkedList.toString());

  }

}
