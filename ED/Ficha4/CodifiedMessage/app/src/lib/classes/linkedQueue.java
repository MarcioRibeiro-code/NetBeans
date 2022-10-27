package lib.classes;

import java.util.LinkedList;

import lib.interfaces.QueueADT;

public class linkedQueue<T> implements QueueADT<T> {

    private T value;
    private int size;
    private linkedQueue<T> next;

    // Constructs Head
    public linkedQueue() {
        this.value = null;
        size = 0;
        this.next = null;
    }

    @Override
    public T dequeue() {

        if (isEmpty()) {
            System.err.println("Empty Queue - 0 elements to remove");
        }

        // getNext
        LinkedList<T> removed = this.next;

        // get value
        T t = removed.value;
        obj = (LinkedList<T>) next.getNext();
        size--;

        return t;
    }

    @Override
    public void enqueue(T element) {
        LinkedList<T> newElement = new LinkedList<T>(element);

        if (!isEmpty()) {
            this.getNext().setNext(newElement);
            this.size++;
        } else {
            this.setNext(newElement);
            this.size++;
        }

    }

    @Override
    public T first() {

        if (isEmpty()) {
            System.err.println("EMPTY QUEUE - to see first element");
        }
        LinkedList<T> first = this.getNext();

        // Get Values missing
        return first.value;
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

    public Object getNext() {
        return this.next;
    }

    public Object setNext(Object element) {
        this.next = (LinkedList<T>) element;
    }

    @Override
    public String toString() {
        String returno = "";
        LinkedList<T> current = this;

        do {

            returno += (current.value != null) ? ("->" + current.value.toString()) : "";
            current = (LinkedList<T>) current.getNext();
        } while (current != null);

        return returno;
    }

}