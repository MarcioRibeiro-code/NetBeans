public class Main {
  public static void main(String[] args) {

    LinkedlistSentinelnodes <String> list = new LinkedlistSentinelnodes<String>();
    list.add("1", "1");
    list.add("2", "2");
    list.add("3", "3");
    System.out.println(list.toString());
    list.remove("1","1");
    System.out.println(list.toString());
  }
}