package lib.interfaces;

public interface UnorderedListADT<T> extends ListADT<T> {
  void addToFront(T obj);
  void addToRear(T obj);
  void addAfter(T element, T target);
}
