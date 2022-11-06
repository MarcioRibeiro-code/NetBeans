package ex1;

public class BankAccount {
    private int saldo = 0;

    public  void putMoney(int value) {
        saldo += value;
    }

    public  void getMoney(int value) {
        saldo -= value;
    }

    public  int getSaldo() {
        return saldo;
    }

}