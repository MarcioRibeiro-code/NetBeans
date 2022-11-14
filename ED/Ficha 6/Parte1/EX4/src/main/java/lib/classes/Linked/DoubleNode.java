package lib.classes.Linked;

public class DoubleNode<T> {

  //reference to next node in list
  private DoubleNode<T> next;
  //element stored at this node
  private T element;
  //reference to previous node in list
  private DoubleNode<T> previous;

  /**
   * .
   * Creates an empty node
   */
  public DoubleNode() {
    next = null;
    element = null;
    previous = null;
  }

  /**
   * Creates a node storing the specified element.
   *
   * @param element element to be stored.
   */
  public DoubleNode(T element) {
    next = null;
    this.element = element;
    previous = null;
  }


  /**
   * Returns the next node.
   *
   * @return DoubleNode reference to next node
   */
  public DoubleNode<T> getNext() {
    return next;
  }

  /**
   * Returns the previous node.
   *
   * @return DoubleNode reference to next node
   */
  public DoubleNode<T> getPrevious() {
    return previous;
  }


  /**
   * Sets the next node.
   *
   * @param node node to follow this one
   */
  public void setNext(DoubleNode<T> node) {
    next = node;
  }

  /**
   * Sets the previous node.
   *
   * @param node node to follow this one
   */
  public void setPrevious(DoubleNode<T> node) {
    previous = node;
  }

  /**
   * Returns the element stored in this node.
   *
   * @return T element stored at this node
   */
  public T getElement() {
    return element;
  }


  /**
   * Sets the element stored in this node.
   *
   * @param elem element to be stored at this node
   */
  public void setElement(T elem) {
    element = elem;
  }


}
