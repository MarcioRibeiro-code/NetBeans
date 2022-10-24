package lib;

import lib.Exceptions.EmptyCollectionException;

public class Postfix {

  private final LinkedStack<Integer> linkedStack;

  public Postfix() {
    this.linkedStack = new LinkedStack<>();
  }

  public float calculate(String string) {


    for (int i = 0; i < string.length(); i++) {
      if (Character.isDigit(string.charAt(i))) {
        linkedStack.push((string.toCharArray()[i] - '0'));
      } else {
        int op1 = 0;
        int op2 = 0;
        try {
          op1 = linkedStack.pop();
          op2 = linkedStack.pop();
        } catch (EmptyCollectionException e) {
          System.out.println(e.getString());
        }

        switch (string.charAt(i)) {
          case '+':
            linkedStack.push(op2 + op1);
            break;
          case '-':
            linkedStack.push(op2 - op1);
            break;
          case '/':
            linkedStack.push(op2 / op1);
            break;
          case '*':
            linkedStack.push(op2 * op1);
            break;
        }

      }
    }
    float return_ = 0;
    try {
      return_ = linkedStack.pop();
    } catch (EmptyCollectionException e) {
      System.out.println(e.getString());
    }

    return return_;
  }


}