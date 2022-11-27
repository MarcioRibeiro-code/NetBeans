package lib.classes;

import lib.exception.EmptyCollectionException;
import lib.interfaces.UnorderedListADT;

import java.util.NoSuchElementException;

public class UnorderedSingleLinkedList<T extends Comparable<T>> extends SingleLinkedList<T> implements UnorderedListADT<T> {


  @Override
  public void addToFront(Object obj) {
    SingleNode<T> toAdd = new SingleNode<T>((T) obj);


    toAdd.setNext(pre);
    pre = toAdd;
    size++;
  }

  @Override
  public void addToRear(Object obj) {
    SingleNode<T> toAdd = new SingleNode<>((T) obj);

    if (pre == null) {
      pre = toAdd;
      toAdd.setNext(pre);
    } else {
      SingleNodeIterator iterator = (SingleNodeIterator) iterator();
      SingleNode current = pre;
      while (iterator.hasNext() && current.getNext() != null) {
        iterator.next();
        current = iterator.current;
      }
      current.setNext(toAdd);
    }
    size++;
  }

  @Override
  public void addAfter(Object element, Object target) throws EmptyCollectionException {

    if (pre == null) {
      throw new EmptyCollectionException("Empty List");
    } else {
      SingleNode<T> toAdd = new SingleNode<T>((T) element);
      SingleNode<T> current = pre;
      SingleNodeIterator iterator = (SingleNodeIterator) iterator();
      while (iterator.hasNext() && current.getNext().getElement().compareTo(toAdd.getElement()) < 0) {
        iterator.next();
      }
      toAdd.setNext(current.getNext());
      current.setNext(toAdd);
    }
    size++;

  }

  public static void main(String[] args) {
    UnorderedSingleLinkedList<String> udll = new UnorderedSingleLinkedList<>();
    udll.addToFront(1);
     udll.addToFront(2);
    udll.addToFront(3);


   /* try {
      udll.addAfter(4, 2);
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    udll.addToRear(5);*/
    System.out.println(udll.toString());
    try {
      System.out.println(String.valueOf(udll.remove(2)));
    } catch (EmptyCollectionException | NoSuchElementException e) {
      throw new RuntimeException(e);
    }
    System.out.println(udll.toString());

  }

}
