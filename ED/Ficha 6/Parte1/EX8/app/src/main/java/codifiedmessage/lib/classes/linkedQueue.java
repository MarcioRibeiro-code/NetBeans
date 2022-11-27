package codifiedmessage.lib.classes;

import codifiedmessage.lib.interfaces.QueueADT;

import java.util.Iterator;

;

public class linkedQueue<T> implements QueueADT<T>, Iterable<T> {

  private int size;

  private LinearNode<T> front;
  private LinearNode<T> rear;

  // Constructs Head
  public linkedQueue() {
    super();
    this.size = 0;
    this.rear = null;
    this.front = null;
  }

  @Override
  public T dequeue() {

    if (isEmpty()) {
      System.err.println("Empty Queue - 0 elements to remove");
    }

    LinearNode<T> removed = this.front;

    this.front = removed.getNext();

    return removed.getElement();
  }

  @Override
  public void enqueue(T element) {

    if (rear == null) {
      rear = new LinearNode<T>(element);
      this.front = rear;
    } else {
      this.rear.setNext(new LinearNode<T>(element));
      rear = rear.getNext();
    }
    size++;
  }

  @Override
  public T first() {

    if (isEmpty()) {
      System.err.println("EMPTY QUEUE - to see first element");
      return null;
    }

    // Get Values missing
    return this.rear.getElement();
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return (this.size == 0);
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return this.size;
  }

  @Override
  public String toString() {
    String returno = "";
    LinearNode<T> current = this.front;

    while (current != null) {

      returno += (current.getElement() != null) ? ("->" + current.getElement()) : "";
      current = (LinearNode<T>) current.getNext();
    }

    return returno.length() != 0 ? returno : "Empty Queue";
  }

  @Override
  public Iterator<T> iterator() {
    return new LinkedQueueIterator();
  }

  public class LinkedQueueIterator implements Iterator<T> {

    protected LinearNode<T> current;
    int count;

    public LinkedQueueIterator() {
      current = front;
      count = 0;
    }

    @Override
    public boolean hasNext() {
      return (count < size());
    }

    @Override
    public T next() {

      if (!hasNext()) {
        return null;
      }

      final T itemReturn = current.getElement();
      current = current.getNext();
      count++;

      return itemReturn;
    }
  }


}