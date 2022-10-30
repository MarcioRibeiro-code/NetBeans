package codifiedmessage.lib.classes;

import codifiedmessage.lib.interfaces.QueueADT;

/** Implementation of the QueueADT using a fixed-length array */
public class ArrayQueue<T> implements QueueADT<T> {
    // instance variables
    private Object[] elements; // Object array used to storage generics elements
    private int size; // current number of elements
    private int front; // index of the front element
    private final static int CAPACITY = 3;

    // Default constructor
    public ArrayQueue() {
        this.elements = new Object[CAPACITY];
        this.size = 0;
        this.front = 0;
    }

    /**
     * Inserts an element at the rear of the queue
     * 
     * @param element element to be inserted at the rear
     */
    @Override
    public void enqueue(T element) {
        if (this.size == CAPACITY) {
            System.err.println("Queue is full");
            System.exit(0);
        }

        int avail = (front + size) % CAPACITY;
        elements[avail] = element;
        size++;
    }

    /**
     * Removes and returns the first element of the queue (null if empty)
     * 
     * @return T First element of the queue (null if empty)
     */
    @Override
    public T dequeue() {
        if (size() == 0) {
            System.err.println("Queue is empty");
            return null;
        }

        T answer = (T) elements[front];
        elements[front] = null;

        this.front = (front + 1) % CAPACITY;
        size--;
        return answer;
    }

    /**
     * Returns, but doesnt remove, the first element of the queue (null if empty)
     * 
     * @return T
     */
    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }

        return (T) elements[front];
    }

    /**
     * Tests whether the queue is empty
     * 
     * @return boolean Result of the test
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (this.size == 0);
    }

    /**
     * Returns the number of elements in the queue
     * 
     * @return int Number of elements in the queue
     */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return this.size;
    }

    /**
     * Returns the String representation of the ArrayQueue
     * 
     * @return String string representation of the ArrayQueue
     */
    @Override
    public String toString() {

        String returno = "";
        int copy_front = this.front; // copy of front, to not alter the data
        int count = 0; // counter

        /** Run through the arrayqueue, until count isnt equal to size */
        while (count != size) {

            returno += this.elements[copy_front] + "<-";

            copy_front = (copy_front + 1) % CAPACITY; // Example (2+3)%3 = 0, the next element will be 0
            count++;
        }

        return returno;
    }

}
