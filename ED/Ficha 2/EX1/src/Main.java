import lib.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> lk = new LinkedList<Integer>();

    lk.addAtEnd(1, 1);
    lk.addAtHead(1, 1);
    lk.addAtHead(3, 3);

    System.out.println(lk.toString());
    lk.remove(3,3);
    System.out.println(lk.toString());
  }
}