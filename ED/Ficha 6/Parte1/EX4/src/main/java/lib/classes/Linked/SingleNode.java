package lib.classes.Linked;

public class SingleNode<T> {
  private SingleNode<T> next;
  private final T value;

  public SingleNode() {
    next = null;
    value = null;
  }

  public SingleNode(T element) {
    next = null;
    this.value = element;
  }

  public SingleNode<T> getNext() {
    return next;
  }

  public void setNext(SingleNode<T> next) {
    this.next = next;
  }

  public T getElement() {
    return value;
  }


}