package lib.exception;

public class EmptyCollectionException extends Exception {
  private String message;

  public EmptyCollectionException(String list) {
    this.message = list;
  }

  @Override
  public String toString() {
    return this.message;
  }
}