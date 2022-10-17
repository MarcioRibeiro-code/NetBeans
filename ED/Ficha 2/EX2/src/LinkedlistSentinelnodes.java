public class LinkedlistSentinelnodes<T1 extends Comparable> {
  Person<T1> list;

  public LinkedlistSentinelnodes() {
    Person<T1> tail = new Person<T1>(null, null, null);
    this.list = new Person<T1>(null, null, tail);
  }

  public void add(T1 name, T1 address) {
    Person<T1> next = new Person<T1>(name, address, null);

    next.setNext(this.list.getNext());

    this.list.setNext(next);
  }

  public void remove(T1 name, T1 address) {

    Person<T1> find = new Person<T1>(name, address, null);
    Person<T1> current = this.list.getNext();
    Person<T1> temp;


    while (current.getNext() != null) {
      // System.out.println("remove"+current.hasName());
      if (current.getNext().equals(find) && (current.getNext().hasName())) {

        temp = current.getNext();
        current.setNext(temp.getNext());
        temp = null;
        return;
      }
      current = current.getNext();
    }


  }


  @Override
  public String toString() {
    String returno = "";
    if (this.list == null) {
      return ("List is empty");
    }
    Person current = this.list;

    int i = 0;
    while (current != null) {
      returno += current.toString() + "->";

      //System.out.println("Posicao:" + (i++) + "; text:" + current.toString());
      current = current.getNext();
    }
    return returno;
  }
}
