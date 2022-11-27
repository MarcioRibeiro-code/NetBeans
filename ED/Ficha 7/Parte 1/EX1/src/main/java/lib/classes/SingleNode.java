package lib.classes;

public class SingleNode<T extends Comparable<T>> implements Comparable<T> {
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

  @Override
  public int compareTo(T o) {
    return this.getElement().compareTo(o);
  }
}