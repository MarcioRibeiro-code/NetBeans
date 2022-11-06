package ex5;

import java.util.Random;

public class Main {

    public static int[] random_1000numbers() {

        int[] array = new int[1000];

        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = random_1000numbers();
        Thread[] th = new Search_thread[5];
        Max max = new Max();

        for (int i = 0; i < 5; i++) {
            int start = i * (array.length / 5);
            int end = start + (array.length / 5);
            th[i] = new Search_thread(array, start, end, max);
            th[i].setName("[TH" + i + "]");
            th[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                th[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("MAX:"+max.getMax());
    }
}