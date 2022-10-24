package lib.interfaces;

import lib.Exceptions.EmptyCollectionException;

/**
 * .
 * <p>
 * Interface Describing a LIFO structure.
 * Stacks are typically used to store the state of a recursively solved problem.
 * </p>
 *
 * @param <T> Tipo Abstrato.
 */
public interface StackAdt<T> {

  /**
   * .
   * <p>
   * Returns the number of elements in the stack.
   * </p>
   *
   * @return int - Number of Elements in a LinkedStack.
   */
  int size();

  /**
   * .
   * <p>
   * Returns true iff the stack is empty.
   * </p>
   *
   * @return boolean - true if empty otherwise false.
   */
  boolean isEmpty();

  /**
   * .
   * <p>
   * Add an element to top of stack.
   * </p>
   *
   * @param t - Tipo Abstrato.
   */
  void push(T t);

  /**
   * .
   * <p>
   * Remove an element from the top of the stack.
   * </p>
   *
   * @return T - element that was removed.
   */
  T pop() throws EmptyCollectionException;

  /**
   * .
   * <p>
   * Fetch a reference to the top element of the stack.
   * </p>
   *
   * @return T - Top element.
   */
  T peek() throws EmptyCollectionException;

  /**
   * .
   * <p>Fetch a reference to the next object.</p>
   *
   * @return Object - Next Object of a previous object.
   */
  Object getNext();

  @Override
  String toString();
}
