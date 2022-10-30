package codifiedmessage.lib.classes;

public class Main {
    public static void main(String[] args) {
        /*
         * cipher cp = new cipher(new int[] { 3, 1, 7, 4, 2, 5 });
         * System.out.println(cipher.cipherWord("knowledge is power",
         * cp.getlArrayQueue()));
         * 
         * //System.out.println(cipher.cipherWord("knowledge is power",
         * cp.getlLinkedQueue()));
         */
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println(arrayQueue.toString());
        arrayQueue.dequeue();
        //System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.toString());
    }
}
