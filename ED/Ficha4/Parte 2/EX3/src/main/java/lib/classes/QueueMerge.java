package lib.classes;

import lib.interfaces.QueueADT;

public class QueueMerge {

  public static <T extends Comparable<T>> QueueADT<T> mergeSort(QueueADT<T> merge) {


    if (merge.size() == 1) {
      return merge;
    } else {
      int halfSize = merge.size() / 2;
      QueueADT<T> firstHalf = new linkedQueue<T>();
      for (int i = 0; i < halfSize; i++) {
        firstHalf.enqueue(merge.dequeue());
      }
      QueueADT<T> secondHalf = merge;
      return merge(mergeSort(firstHalf), mergeSort(secondHalf));
    }

  }

  public static <T extends Comparable<T>> QueueADT<T> merge(QueueADT<T> a, QueueADT<T> b) {
    QueueADT<T> merged = new linkedQueue<>();

    while (!a.isEmpty() && !b.isEmpty()) {
      if (b.first().compareTo(a.first()) < 0) {
        merged.enqueue(b.dequeue());
      } else {
        merged.enqueue(a.dequeue());
      }
    }
    while (!a.isEmpty()) {
      merged.enqueue(a.dequeue());
    }

    while (!b.isEmpty()) {
      merged.enqueue(b.dequeue());
    }
    return merged;
  }


  public static <T extends Comparable<T>> QueueADT N_StringQueue(String[] args0) {


    QueueADT<QueueADT> all_queue = new linkedQueue();
    for (int i = 0; i < args0.length; i++) {
      QueueADT temp_queue = new linkedQueue();
      temp_queue.enqueue(args0[i]);
      System.out.println("I " + i + ". " + args0[i]);
      all_queue.enqueue(temp_queue);
    }

    while (all_queue.size() != 1) {
      QueueADT first = all_queue.dequeue();
      QueueADT second = all_queue.dequeue();
      System.out.println(first);
      System.out.println(second);
      all_queue.enqueue(merge(first, second));
    }
    return all_queue;
  }

  public static void main(String[] args) {

    String[] a = {"Samuel", "Santos", "Marcio", "Ribeiro"};
    System.out.println(N_StringQueue(a));

/* lq[0] = (linkedQueue) merge(lq[0], lq[1]);
    lq[2] = (linkedQueue) merge(lq[2], lq[3]);
    System.out.println(lq[0]);
    System.out.println(lq[2]);

    lq[0] = (linkedQueue) merge(lq[0], lq[2]);
    System.out.println(lq[0].size());
* */


    /*Exercio 3 - Implementar um programa que dadas 2 queues
    ordenadas as junte numa tambem ordernada.
    Exemplo:
    a.enqueue(1);
    a.enqueue(2);
    b.enqueue(3);
    b.enqueue(1);

    QueueADT c = QueueMerge.merge(a, b);


    System.out.println(c.toString());
    * */

    /* linkedQueue<Integer> a = new linkedQueue<>();
    ArrayQueue<Integer> b = new ArrayQueue<Integer>();

    a.enqueue(4);
    a.enqueue(1);
    b.enqueue(3);
    b.enqueue(2);

    QueueADT c = QueueMerge.merge(a, b);


    System.out.println(c.toString());

    System.out.println(mergeSort(c));
    * */

  }
}
