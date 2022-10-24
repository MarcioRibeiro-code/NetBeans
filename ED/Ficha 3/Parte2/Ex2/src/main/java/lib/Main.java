package lib;

public class Main {
  public static void main(String[] args) {
    Postfix pf = new Postfix();

    System.out.println(pf.calculate("483*+"));
  }
}
