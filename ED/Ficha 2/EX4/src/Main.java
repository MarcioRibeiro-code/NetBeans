public class Main {
  private static Person<String> person;

  public static void main(String[] args) {
    DoublelinkedList<Integer> ls = new DoublelinkedList<>();
    ls.addAtHead(1);
    ls.addAtHead(2);
    ls.addAtHead(3);
    ls.addAtHead(4);
    ls.addAtHead(1);
    //System.out.println(ls.getElements());

    //System.out.println(ls.toString());
    // ls.removeAtTail();
    System.out.println(ls.getElements());
    //System.out.println(ls.getElementsUntil(3));
    // System.out.println(ls.getElementsAfter(1));
    //System.out.println(ls.getElementsinBetween(1, 3));
    //System.out.println(ls.getElementPair(ls));
    ls.removeElements(1);
    System.out.println(ls.toString());
  }
}