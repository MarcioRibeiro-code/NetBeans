package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.UnorderedListADT;

public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
  @Override
  public void addToFront(Object obj) {

    DoubleNode<T> toAdd = new DoubleNode<T>((T) obj);

    toAdd.setNext(pre.getNext());
    toAdd.setPrevious(pre);
    pre.getNext().setPrevious(toAdd);
    pre.setNext(toAdd);
    size++;
  }

  @Override
  public void addToRear(Object obj) {
    DoubleNode<T> toAdd = new DoubleNode<T>((T) obj);

    toAdd.setNext(post);
    toAdd.setPrevious(post.getPrevious());
    post.getPrevious().setNext(toAdd);
    post.setPrevious(toAdd);
    size++;
  }

  @Override
  public void addAfter(Object element, Object target) {

    DoublelinkListIterator it = (DoublelinkListIterator) iterator();

    while (it.hasNext()) {
      if (it.current.getElement() != null && it.current.getElement().equals(target)) {
        DoubleNode<T> toAdd = new DoubleNode<T>((T) element);
        toAdd.setNext(it.current.getNext());
        toAdd.setPrevious(it.current);
        it.current.getNext().setPrevious(toAdd);
        it.current.setNext(toAdd);
        size++;
        return;
      }

      it.next();
    }
  }

  public static void main(String[] args) {
    UnorderedDoubleLinkedList<String> udll = new UnorderedDoubleLinkedList<>();
    udll.addToFront(1);
    udll.addToRear(2);
    udll.addAfter(3,1);
    try {
      udll.remove(3);
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    System.out.println(udll.toString());
  }

}
