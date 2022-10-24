package lib.Exceptions;

public class EmptyCollectionException extends Exception {

  private String exceptionString;

  public EmptyCollectionException(String string) {
    this.exceptionString = string;
  }

  public String getString() {
    return this.exceptionString;
  }

}

