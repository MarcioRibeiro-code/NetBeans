package lib.classes.Array;

import lib.interfaces.UnorderedListADT;

public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {
  @Override
  public void addToFront(Object obj) {

    //check for size

    for (int scan = rear; scan > 0; scan--) {
      list[scan] = list[scan - 1];
    }
    list[0] = obj;
    rear++;
  }

  @Override
  public void addToRear(Object obj) {
    //check for size
    list[rear++] = obj;
  }

  @Override
  public void addAfter(Object element, Object target) {

    ArrayIterator it = (ArrayIterator) iterator();

    while (it.hasNext()) {

      if (it.next().equals(target)) {
        for (int scan = rear; scan > it.current; scan--) {
          list[scan] = list[scan - 1];
        }
        list[it.current] = element;
        rear++;
        return;
      }
    }
  }

  public static void main(String[] args) {
    ArrayUnorderedList<String> aul = new ArrayUnorderedList<>();
    aul.addToFront("1");
    aul.addToRear("2");
    aul.addAfter("1", "1");

    System.out.println(aul.toString());
  }
}
