package org.example;

import lib.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> ls = new LinkedList<>();
    ls.push("1");
    ls.push("2");

    System.out.println(ls.toString());
    //ls.pop();
    //System.out.println(ls.toString());
    System.out.println(ls.pop());
    System.out.println(ls.toString());
  }
}