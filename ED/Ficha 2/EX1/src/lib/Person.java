package lib;

import java.util.*;

public class Person<T1 extends Comparable> {
  private T1 name;
  private T1 address;
  private Person person;

  public Person(T1 name, T1 address, Person person) {
    this.name = name;
    this.address = address;
    this.person = person;
  }

  public Person(T1 name, T1 address) {
    this.name = name;
    this.address = address;
    System.out.println(this.getName().getClass());
  }

  public Person() {
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  public T1 getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person<?> person = (Person<?>) o;
    return Objects.equals(name, person.name) && Objects.equals(address, person.address);
  }

  @Override
  public String toString() {
    return "Person{"
        + "name=" + name
        + ", address=" + address
        + '}';
  }
}
