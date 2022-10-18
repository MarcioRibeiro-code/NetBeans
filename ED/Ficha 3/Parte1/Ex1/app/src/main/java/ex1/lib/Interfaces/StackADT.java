package ex1.lib.Interfaces;

import ex1.lib.Exception.EmptyCollectionException;

public interface StackADT<T>{
public void push(T element);
public T pop() throws EmptyCollectionException;
public T peek() throws EmptyCollectionException;
public boolean isEmpty();
public int size();

@Override
public String toString();
}