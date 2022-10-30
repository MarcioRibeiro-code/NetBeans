//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lib.interfaces;

public interface QueueADT<T> {
  void enqueue(T var1);

  T dequeue();

  T first();

  boolean isEmpty();

  int size();

  String toString();
}
