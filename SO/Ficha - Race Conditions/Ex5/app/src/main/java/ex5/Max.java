package ex5;

public class Max {
    private int max = 0;

    public synchronized void setMax(int value) {
        this.max = value;
    }

    public synchronized int getMax() {
        return this.max;
    }

}
