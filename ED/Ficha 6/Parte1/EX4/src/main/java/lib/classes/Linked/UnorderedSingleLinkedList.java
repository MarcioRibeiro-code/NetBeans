package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.UnorderedListADT;

import java.util.NoSuchElementException;

public class UnorderedSingleLinkedList<T extends Comparable<T>> extends SingleLinkedList<T> implements UnorderedListADT<T> {


  @Override
  public void addToFront(Object obj) {
    SingleNode<T> toAdd = new SingleNode<T>((T) obj);
    if (pre == null) {
      pre = toAdd;
      post = toAdd;
      toAdd.setNext(pre);
    } else {
      toAdd.setNext(pre);
      pre = toAdd;
      post.setNext(pre);
    }
    size++;
  }

  @Override
  public void addToRear(Object obj) {
    SingleNode<T> toAdd = new SingleNode<>((T) obj);

    if (pre == null) {
      pre = toAdd;
      post = toAdd;
      toAdd.setNext(pre);
    } else {
      post.setNext(toAdd);
      post = toAdd;
      post.setNext(pre);
    }
    size++;
  }

  @Override
  public void addAfter(Object element, Object target) {

    if (pre == null) {
      throw new NoSuchElementException();
    } else {
      SingleNode toAdd = new SingleNode((Comparable) element);
      SingleNodeIterator iterator = (SingleNodeIterator) iterator();
      while (iterator.hasNext() && iterator.current.compareTo((T) target) > 0) {
        iterator.next();
      }
      toAdd.setNext(iterator.current.getNext());
      iterator.current.setNext(toAdd);
    }
    size++;

  }

  public static void main(String[] args) {
    UnorderedSingleLinkedList<String> udll = new UnorderedSingleLinkedList<>();
    udll.addToFront(1);
    udll.addToFront(2);
    //udll.addToFront(3);



   udll.addAfter(4, 2);
    udll.addToRear(4);

   /* try {
      System.out.println(String.valueOf(udll.removeLast()));
    } catch (EmptyCollectionException | NoSuchElementException e) {
      throw new RuntimeException(e);
    }*/
    System.out.println(udll.toString());

  }

}
