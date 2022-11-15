package lib.classes.Linked;

import lib.exception.EmptyCollectionException;
import lib.interfaces.UnorderedListADT;

public class UnorderedSingleLinkedList<T> extends SingleLinkedList<T> implements UnorderedListADT<T> {

  SingleNode addToEmpty(SingleNode last, T data) {
    // This function is only for empty list
    if (last != null)
      return last;

    // Creating a node dynamically.
    SingleNode temp = new SingleNode(data);

    // Assigning the data.
    last = temp;
    // Note : list was empty. We link single node
    // to itself.
    temp.setNext(last);

    return last;
  }


  @Override
  public void addToFront(Object obj) {
    if (post == null) {
      addToEmpty(post, (T) obj);
    }
    SingleNode temp = new SingleNode(obj);
    temp.setNext(post.getNext());
    post.setNext(temp);
  }

  @Override
  public void addToRear(Object obj) {
    if (post == null)
      addToEmpty(post, (T) obj);

    // Creating a node dynamically.
    SingleNode temp = new SingleNode(obj);


    // Adjusting the links.
    temp.setNext(post.getNext());
    post.setNext(temp);
    post = temp;

  }

  @Override
  public void addAfter(Object element, Object target) {

    if (post == null)
      return;

    SingleNode temp, p;
    p = post.getNext();
    do {
      if (p.getElement().equals(target)) {
        temp = new SingleNode(element);
        temp.setNext(p.getNext());
        p.setNext(temp);

        if (p == post)
          post = temp;
        return;
      }
      p = p.getNext();
    } while (p != post.getNext());
  }

  public static void main(String[] args) {
    UnorderedSingleLinkedList<String> udll = new UnorderedSingleLinkedList<>();
    udll.addToFront(1);
    udll.addToFront(2);
    udll.addToFront(3);
    System.out.println(udll.toString());
    try {

      udll.removeLast();
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    System.out.println(udll.toString());
  }

}
