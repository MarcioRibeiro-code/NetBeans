package ex4;

public class Counter {
    private int number = 0;

    public synchronized void add(int value) {
        this.number+=value;
    }

    public int getNumber() {
        return this.number;
    }

}