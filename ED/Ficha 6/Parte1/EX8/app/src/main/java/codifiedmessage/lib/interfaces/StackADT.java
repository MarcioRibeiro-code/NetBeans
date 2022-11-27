package codifiedmessage.lib.interfaces;

import codifiedmessage.lib.classes.LinkedStack;

public interface StackADT<T> {

  int size();

  boolean isEmpty();

  void push(T t);

  T pop();

  T peek();

  LinkedStack<T> getNext();

  /**
   * .
   * <p>
   * Interface Describing a LIFO structure.
   * Stacks are typically used to store the state of a recursively solved problem.
   * </p>
   *
   * @param <T> Tipo Abstrato.
   */
  public interface LinkedList<T> {

    /**
     * .
     * <p>
     * Returns the number of elements in the stack.
     * </p>
     *
     * @return int - Number of Elements in a LinkedStack.
     */
    public int size();

    /**
     * .
     * <p>
     * Returns true iff the stack is empty.
     * </p>
     *
     * @return boolean - true if empty otherwise false.
     */
    public boolean isEmpty();

    /**
     * .
     * <p>
     * Add an element to top of stack.
     * </p>
     *
     * @param t - Tipo Abstrato.
     */
    public void push(T t);

    /**
     * .
     * <p>
     * Remove an element from the top of the stack.
     * </p>
     *
     * @return T - element that was removed.
     */
    public T pop();

    /**
     * .
     * <p>
     * Fetch a reference to the top element of the stack.
     * </p>
     *
     * @return T - Top element.
     */
    public T peek();

    /**
     * .
     * <p>Fetch a reference to the next object.</p>
     *
     * @return Object - Next Object of a previous object.
     */
    public Object getNext();

    @Override
    public String toString();
  }
}
