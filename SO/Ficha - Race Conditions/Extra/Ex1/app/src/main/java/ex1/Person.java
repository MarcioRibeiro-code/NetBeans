package ex1;

import java.util.Random;

public class Person extends Thread {
    private BankAccount bk = null;
    private final static int NUM_MESES = 6;
    private final static int SALARIO = 1250;

    Person(BankAccount bk) {
        this.bk = bk;
    }

    public void run() {

        for (int i = 0; i < NUM_MESES; i++) {
            putSalaryInAccount(SALARIO, i);
            System.out.println("Salario: " + Thread.currentThread().getName());
            for (int j = 0; j < 10; j++) {

                int randomNum = randomizeAmount(150, 350);
                makeCashWithdrawal(randomNum);

            }

        }

    }

    private void putSalaryInAccount(int salary, int month) {
        String name = Thread.currentThread().getName();

        synchronized (bk) {
            System.out.println(name + ": " + "just got my eur " + salary + " salary for month " + month + "!");
            bk.putMoney(salary); // método não precisa ser sinchronized... no então, um lock é reentrante ;)
            System.out.println(name + ": " + "account balance now is eur " + bk.getSaldo());
        }
    }

    private void makeCashWithdrawal(int amount) {
        String name = Thread.currentThread().getName();

        synchronized (bk) { // em vez disto, uma alternativa passa por usar métodos com a keyword
                            // synchronized
            System.out.println(name + ": " + "trying to get eur " + amount);
            int balance = bk.getSaldo();

            if (balance >= amount) {
                System.out.println(name + ": " + "cool, there's eur " + balance + " avaliable!");

                bk.getMoney(amount);
                System.out.println(name + ": eur " + amount + " is with me :)");
            } else {
                System.out.println(name + ": " + "there's not enough money, only eur " + balance + "...");
            }
        }
    }

    private int randomizeAmount(int min, int max) {
        Random r = new Random();

        return r.nextInt(max - min) + min;
    }

}
