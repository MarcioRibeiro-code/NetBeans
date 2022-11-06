package ex5;

public class Search_thread extends Thread {

    private int[] array;
    private int start;
    private int end;
    private Max max;

    Search_thread(int[] array, int start, int end, Max max) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.max = max;
    }

    public void run() {

        synchronized (max) {
            for (int i = start; i < end; i++) {
                if (max.getMax() < array[i]) {
                    max.setMax(array[i]);
                }
            }
        }

    }

}
