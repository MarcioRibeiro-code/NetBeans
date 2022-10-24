package org.example;

import lib.ArrayStack;
import lib.Exception.EmptyCollectionException;
import lib.postfix;

public class Main {

  public static void main(String[] args) {
    postfix pf = new postfix();
    System.out.println(pf.calculate("483*+"));

  }

}