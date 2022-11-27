package lib.interfaces;

import lib.exception.EmptyCollectionException;

public interface UnorderedListADT<T> extends ListADT<T> {
  void addToFront(Object obj);
  void addToRear(Object obj);
  void addAfter(Object element, Object target) throws EmptyCollectionException;
}