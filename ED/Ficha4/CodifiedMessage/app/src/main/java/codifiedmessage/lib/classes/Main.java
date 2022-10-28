package codifiedmessage.lib.classes;

public class Main {
    public static void main(String[] args) {

        cipher cp = new cipher(new int[] { 3, 1, 7, 4, 2, 5 });
        System.out.println(cipher.cipherWord("knowledge is power",
                cp.getlArrayQueue()));

        System.out.println(cipher.cipherWord("knowledge is power",
                cp.getlLinkedQueue()));

    }
}
