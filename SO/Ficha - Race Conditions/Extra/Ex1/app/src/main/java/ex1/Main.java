package ex1;

public class Main {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        Person Alice = new Person(bk);
        Person Bruno = new Person(bk);

        Alice.setName("Alice");
        Bruno.setName("Bruno");

        Alice.start();
        Bruno.start();

        try {
            Alice.join();
            Bruno.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(bk.getSaldo());
    }
}
