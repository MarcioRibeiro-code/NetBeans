package lib.classes.Array;

import lib.interfaces.OrderedListADT;

import java.util.Arrays;


public class ArrayOrderedList<T extends Comparable<T>> extends ArrayList<T> implements OrderedListADT<T> {

  ArrayOrderedList() {
    super();
  }

  @Override
  public void add(Comparable element) {
    ArrayIterator at = (ArrayIterator) iterator();

    int count = 0;
    Comparable<T> temp;
    try {
      temp =  element;
    } catch (ClassCastException ex) {
      return;
    }


    while (at.hasNext() && temp.compareTo(at.next()) >= 0) {
      count++;
    }

    /*for (int moved = rear; moved > count; moved--) {
      list[moved] = list[moved - 1];
    }*/

    System.arraycopy(list, count, list, count + 1, rear);
    list[count] = (T) element;
    rear++;
  }

  public static void main(String[] args) {
    ArrayOrderedList<String> al = new ArrayOrderedList<>();
    al.add("2");
    al.add("1");
    al.add("3");
    al.add("1");

    System.out.println(al.size());
    System.out.println(Arrays.toString(al.list));
  }
}