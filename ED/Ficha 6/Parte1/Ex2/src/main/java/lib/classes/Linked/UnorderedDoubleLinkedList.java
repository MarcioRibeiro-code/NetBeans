package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.UnorderedListADT;

public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
  @Override
  public void addToFront(Object obj) {

    /*
    pre==null
     */
    DoubleNode<T> toAdd = new DoubleNode<T>((T) obj);
    if (pre == null) {
      pre = post = toAdd;
      toAdd.setPrevious(toAdd);
      toAdd.setNext(toAdd);
      pre = toAdd;
      size++;
      return;
    }


    DoubleNode<T> last = pre.getPrevious();


    toAdd.setNext(pre);
    toAdd.setPrevious(last);
    last.setNext(toAdd);
    pre.setPrevious(toAdd);
    pre = toAdd;
    size++;
  }

  @Override
  public void addToRear(Object obj) {
    DoubleNode<T> toAdd = new DoubleNode<T>((T) obj);
    if (pre == null) {
      toAdd.setPrevious(toAdd);
      toAdd.setNext(toAdd);
      pre = post = toAdd;
      size++;
      return;
    }

    post = pre.getPrevious();
    post.setNext(toAdd);
    toAdd.setPrevious(post);
    toAdd.setNext(pre);
    pre.setPrevious(toAdd);
    post = toAdd;
    size++;
  }

  @Override
  public void addAfter(Object element, Object target) throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("Empty List");
    }

    DoubleNode<T> toAdd = new DoubleNode<T>((T) element);
    DoublelinkListIterator iterator = (DoublelinkListIterator) iterator();

    while (iterator.hasNext() && !target.equals(iterator.current.getElement())) {
      iterator.next();
    }
    DoubleNode next = iterator.current.getNext();
    iterator.current.setNext(toAdd);
    toAdd.setPrevious(iterator.current);
    toAdd.setNext(next);
    next.setPrevious(toAdd);
    size++;
  }

  public static void main(String[] args) {
    UnorderedDoubleLinkedList<String> udll = new UnorderedDoubleLinkedList<>();
    udll.addToFront(1);
    udll.addToRear(2);
    udll.addToFront(3);
    try {
      udll.addAfter(4, 2);
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }



    try {
      udll.remove(1);
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    System.out.println(udll.toString());
  }

}
