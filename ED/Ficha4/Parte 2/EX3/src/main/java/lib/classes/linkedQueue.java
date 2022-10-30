
package lib.classes;

import lib.interfaces.QueueADT;

public class linkedQueue<T extends Comparable<T>> implements QueueADT<T> {
  private int size = 0;
  private LinearNode<T> front = null;
  private LinearNode<T> rear = null;

  public linkedQueue() {
  }

  public T dequeue() {
    if (this.isEmpty()) {
      System.err.println("Empty Queue - 0 elements to remove");
    }

    LinearNode<T> removed = this.front;
    this.front = removed.getNext();
    size--;
    return removed.getElement();
  }

  public void enqueue(T element) {
    if (this.front == null) {
      this.rear = new LinearNode(element);
      this.front = this.rear;
    } else {
      this.rear.setNext(new LinearNode(element));
      this.rear = this.rear.getNext();
    }

    ++this.size;
  }

  public T first() {
    if (this.isEmpty()) {
      System.err.println("EMPTY QUEUE - to see first element");
      return null;
    } else {
      return this.front.getElement();
    }
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public int size() {
    return this.size;
  }

  @Override
  public String toString() {
    String returno = "";

    for (LinearNode<T> current = this.front; current != null; current = current.getNext()) {
      returno = returno + (current.getElement() != null ? current.getElement() + "<-" : "");
    }

    return returno.length() != 0 ? returno : "Empty Queue";
  }
}
