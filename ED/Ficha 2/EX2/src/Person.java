import java.util.Objects;

public class Person<T1 extends Comparable> {
  private T1 name;
  private T1 address;
  private Person next;

  public Person() {
    this.address = null;
    this.name = null;
    this.next = null;
  }

  public Person(T1 name, T1 address, Person next) {
    this.name = name;
    this.address = address;
    this.next = next;
  }

  public T1 getName() {
    return name;
  }

  public boolean hasName() {
    System.out.println(this.getName() == null);
    if (this.getName() != null) {
      return true;
    }
    return false;
  }

  public Person getNext() {
    return next;
  }

  public void setNext(Person next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Person{"
        + "name='" + name + '\''
        + ", address='" + address + '\''
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) && Objects.equals(address, person.address);
  }


}
