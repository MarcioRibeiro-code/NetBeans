package lib.Interfaces;

import lib.Exception.EmptyCollectionException;

public interface SmackADT<T> extends StackADT<T> {
  public T smack() throws EmptyCollectionException;
}
