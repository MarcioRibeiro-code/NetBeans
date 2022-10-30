package codifiedmessage.lib.classes;

import javax.print.attribute.IntegerSyntax;

public class cipher {
    private linkedQueue<Integer> lq;
    private ArrayQueue<Integer> aq;

    public cipher(int[] param2) {
        lq = new linkedQueue<Integer>();
        aq = new ArrayQueue<Integer>();
        for (int temp : param2) {
            lq.enqueue(temp);
            aq.enqueue(temp);
        }
    }

    public linkedQueue<Integer> getlLinkedQueue() {
        return lq;
    }

    public ArrayQueue<Integer> getlArrayQueue() {
        return aq;
    }

    public static char[] cipherWord(String param1, linkedQueue<Integer> lq) {

        char[] stringRepresentation = param1.toCharArray();

        for (int i = 0; i < stringRepresentation.length; i++) {
            Integer value;
            if (Character.isAlphabetic(stringRepresentation[i])) {
                value = lq.dequeue();
            } else {
                continue;
            }

            if (Character.isUpperCase(stringRepresentation[i])) {
                stringRepresentation[i] = (char) ((((stringRepresentation[i] - 65) + value) % 26) + 65);
            } else if (Character.isLowerCase(stringRepresentation[i])) {
                stringRepresentation[i] = (char) ((((stringRepresentation[i] - 97) + value) % 26) + 97);
            }
            lq.enqueue(value);
        }

        return stringRepresentation;
    }

    public static char[] cipherWord(String param1, ArrayQueue<Integer> aq) {

        char[] stringRepresentation = param1.toCharArray();

        for (int i = 0; i < stringRepresentation.length; i++) {
            Integer value;
            if (Character.isAlphabetic(stringRepresentation[i])) {
                value = aq.dequeue();
            } else {
                continue;
            }

            if (Character.isUpperCase(stringRepresentation[i])) {
                stringRepresentation[i] = (char) ((((stringRepresentation[i] - 65) + value) % 26) + 65);
            } else if (Character.isLowerCase(stringRepresentation[i])) {
                stringRepresentation[i] = (char) ((((stringRepresentation[i] - 97) + value) % 26) + 97);
            }
            aq.enqueue(value);
        }

        return stringRepresentation;
    }

}
