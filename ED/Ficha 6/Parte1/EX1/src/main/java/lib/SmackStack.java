package lib;

import lib.Exception.EmptyCollectionException;
import lib.Interfaces.SmackADT;

public class SmackStack<T> extends ArrayStack<T> implements SmackADT<T> {
  @Override
  public T smack() throws EmptyCollectionException {

    if (isEmpty()) {
      throw new EmptyCollectionException("Stack");
    }

    int i = 0;

    while (i < (size() - 1)) {
      i++;
    }
    T result = stack[i];
    stack[i] = null;
    top--;
    return result;
  }

  public static void main(String[] args) {
    SmackADT<String> smackADT = new SmackStack<>();
    smackADT.push("1");
    smackADT.push("2");
    smackADT.push("3");
    System.out.println(smackADT.toString());
    try {
      System.out.println(smackADT.smack());
    } catch (EmptyCollectionException e) {
      throw new RuntimeException(e);
    }
    System.out.println(smackADT.toString());
  }

}
