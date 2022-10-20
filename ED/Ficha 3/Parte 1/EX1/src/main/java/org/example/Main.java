package org.example;

import lib.ArrayStack;
import lib.Exception.EmptyCollectionException;
import lib.Numbers;

public class Main {

  public static void main(String[] args) {
    Numbers<String> arStack = new Numbers<>();

    for (int i = 0; i < 10; i++) {
      arStack.addElement(String.valueOf(i));
    }
    System.out.println(arStack.toString());

      arStack.removeElement();
      System.out.println(arStack.toString());

      arStack.getLast();


  }

}