
package lib.classes;

import lib.interfaces.QueueADT;

public class ArrayQueue<T> implements QueueADT<T> {
  private final Object[] elements = new Object[3];
  private int size = 0;
  private int front = 0;
  private static final int CAPACITY = 3;

  public ArrayQueue() {
  }

  public void enqueue(T element) {
    if (this.size == 3) {
      System.err.println("Queue is full");
      System.exit(0);
    }

    int avail = (this.front + this.size) % 3;
    this.elements[avail] = element;
    ++this.size;
  }

  public T dequeue() {
    if (this.size() == 0) {
      System.err.println("Queue is empty");
      return null;
    } else {
      T answer = (T) this.elements[this.front];
      this.elements[this.front] = null;
      this.front = (this.front + 1) % 3;
      --this.size;
      return answer;
    }
  }

  public T first() {
    return this.isEmpty() ? null : (T) this.elements[this.front];
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
    int copy_front = this.front;

    for(int count = 0; count != this.size; ++count) {
      returno = returno + this.elements[copy_front] + "<-";
      copy_front = (copy_front + 1) % 3;
    }

    return returno;
  }

}
