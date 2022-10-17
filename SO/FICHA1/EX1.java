import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        Double value1 = myObj.nextDouble();
        System.out.println("Segundo valor: ");
        Double value2 = myObj.nextDouble();

        System.out.println("Soma:" + (value1 + value2));
        System.out.println("Subtração:" + (value1 - value2));
        System.out.println("Multiplicação:" + (value1 * value2));
        System.out.println("Divisao:" + (value1 / value2));

    }

}
