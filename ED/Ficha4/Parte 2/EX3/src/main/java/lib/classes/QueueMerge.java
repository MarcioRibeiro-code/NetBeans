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

  public static void main(String[] args) {

    String[] a = {"Marcio", "Ribeiro", "Santos", "Samuel"};
    linkedQueue[] lq = new linkedQueue[a.length];

    for (int i = 0; i < lq.length; i++) {
      lq[i] = new linkedQueue<String>();
      lq[i].enqueue(a[i]);
    }
    int count = 1;
    while (count != a.length ) {
      lq[0] = (linkedQueue) merge(lq[0], lq[count]);
      count++;
    }


    System.out.println(mergeSort(lq[0]));
  }
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

