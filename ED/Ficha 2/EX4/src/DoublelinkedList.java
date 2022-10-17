import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class DoublelinkedList<T1> {
  private final Person<T1> head;
  private final Person<T1> tail;

  public DoublelinkedList() {
    this.head = new Person<T1>(null);
    this.tail = new Person<T1>(null);

    this.head.setNext(this.tail);
    this.tail.setPrevious(this.head);
  }

  private Person<T1> getHead() {
    return head;
  }

  public void addAtHead(T1 value) {

    Person<T1> newNode = new Person<>(value);

    Person<T1> current = this.head;

    newNode.setNext(current.getNext());
    newNode.setPrevious(current);

    current.getNext().setPrevious(newNode);
    current.setNext(newNode);
  }

  public void addAtTail(T1 value) {

    Person<T1> newNode = new Person<>(value);

    Person<T1> current = this.tail;

    newNode.setPrevious(current.getPrevious());
    newNode.setNext(current);
    current.getPrevious().setNext(newNode);
    //current.getPrevious().setNext(newNode);
    current.setPrevious(newNode);

  }

  public void removeAtHead() {
    Person<T1> current = this.head;
    Person<T1> next = this.head.getNext();

    if (!checkIfEmpty()) {

      current.setNext(next.getNext());
      next.getNext().setPrevious(current);
    }

  }

  public void removeAtTail() {
    Person<T1> current = this.tail;
    Person<T1> prev = current.getPrevious();

    if (!checkIfEmpty()) {
      prev.getPrevious().setNext(current);
      current.setPrevious(prev.getPrevious());
    }


  }

  public boolean checkIfEmpty() {
    return this.head.getNext().equals(this.tail)
        && this.tail.getPrevious().equals(this.head);
  }

  public Collection<? extends Person<T1>> getElements() {
    List<Person<T1>> arrayList = new ArrayList<Person<T1>>();

    Person<T1> current = this.head;

    while (current != null) {

      if (current.getValue() != null) {
        arrayList.add(current);
      }
      current = current.getNext();
    }
    return arrayList;
  }

  public Collection<? extends Person<T1>> getElementsUntil(T1 value) {
    List<Person<T1>> arrayList = new ArrayList<Person<T1>>();


    for (Person<T1> p : (List<Person<T1>>) getElements()) {


      if (p != null && !p.getValue().equals(value)) {
        arrayList.add(p);
      } else {
        break;
      }

    }
    return arrayList;
  }

  public Collection<? extends Person<T1>> getElementsAfter(T1 value) {
    List<Person<T1>> arrayList = new ArrayList<Person<T1>>();
    Person<T1> found = null;

    for (Person<T1> p1 : (List<Person<T1>>) getElements()) {
      if (p1.getValue().equals(value)) {
        found = p1.getNext();
      }
    }

    while (found.getValue() != null) {
      arrayList.add(found);
      found = found.getNext();
    }

    return arrayList;
  }

  public Collection<? extends Person<T1>> getElementsinBetween(T1 value1, T1 value2) {
    List<Person<T1>> arrayList_after = new ArrayList<Person<T1>>();
    List<Person<T1>> arrayList_before = new ArrayList<Person<T1>>();

    arrayList_after = (List<Person<T1>>) getElementsAfter(value1);
    arrayList_before = (List<Person<T1>>) getElementsUntil(value2);

    arrayList_after.retainAll(arrayList_before);

    return arrayList_after;
  }

  public static <T1 extends Integer> DoublelinkedList getElementPair(DoublelinkedList<T1> dll) {
    DoublelinkedList<T1> retrn = new DoublelinkedList<T1>();

    for (Person p : dll.getElements()) {
      if (((Integer) p.getValue() % 2) == 0) {
        retrn.addAtTail((T1) p.getValue());
      }
    }

    return retrn;
  }

  public void removeElements(T1 value) {
    Person current = this.head;

    while (current != null) {

      if (value.equals(current.getValue())) {
       current.getNext().setPrevious(current.getPrevious());
       current.getPrevious().setNext(current.getNext());
      }

      current = current.getNext();
    }
  }


  @Override
  public String toString() {
    String returno = "";
    Person<T1> current = this.head;

    do {


      returno += (current.getValue() != null) ? ("->" + current.getValue().toString()) : "";
      current = current.getNext();
    } while (current != null);

    return returno;
  }
}
