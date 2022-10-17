public class Person<T1> {
  private T1 value;
  private Person<T1> next;
  private Person<T1> previous;

  public Person() {
    this.value = null;
    this.next = null;
    this.previous = null;
  }

  public T1 getValue() {
    return value;
  }

  public Person(T1 value) {
    new Person();
    this.value = value;
  }

  public Person<T1> getNext() {
    return next;
  }

  public void setNext(Person<T1> next) {
    this.next = next;
  }

  public Person<T1> getPrevious() {
    return previous;
  }

  public void setPrevious(Person<T1> previous) {
    this.previous = previous;
  }

  private String checkValue(Person<T1> value) {
    if (value == null) {
      return "is empty";
    }
    return value.toString();
  }

  @Override
  public String toString() {
    return (this.value != null)? this.value.toString() : "null";
  }
}
