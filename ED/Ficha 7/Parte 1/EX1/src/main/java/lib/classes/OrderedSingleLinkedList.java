package lib.classes;


import lib.interfaces.OrderedListADT;

public class OrderedSingleLinkedList<T extends Comparable<T>> extends SingleLinkedList<T> implements OrderedListADT<T> {
  @Override
  public void add(Comparable element) {
    SingleNode<T> toAdd = new SingleNode<T>((T) element);
    SingleNode<T> current;

    if (pre == null || pre.getElement().compareTo((T) element) >= 0) {
      toAdd.setNext(pre);
      pre = toAdd;
      size++;
    } else {
      current = pre;
      while (current.getNext() != null && current.getNext().getElement().compareTo(toAdd.getElement()) < 0) {
        current = current.getNext();
      }
      toAdd.setNext(current.getNext());
      current.setNext(toAdd);
      size++;
    }

  }

  public static void main(String[] args) {

    OrderedSingleLinkedList<Integer> orderedSingleLinkedList
        = new OrderedSingleLinkedList<Integer>();

    orderedSingleLinkedList.add(4);
    orderedSingleLinkedList.add(3);
    orderedSingleLinkedList.add(51);

    System.out.println(orderedSingleLinkedList.toString());

  }

}