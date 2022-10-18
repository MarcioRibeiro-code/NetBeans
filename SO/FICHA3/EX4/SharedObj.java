package EX4;

public class SharedObj {

    private volatile int number ;
    private volatile String name;

    public  synchronized String getName() {
        return name;
    }

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void setName(String s) {
        name = s;
    }

    public synchronized void setNumber(int x) {

        number = x;
    }

    public SharedObj() {
        this.number = 0;
    }
}
