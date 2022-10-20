package ex1.lib;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        ArrayStack<String> arStack = new ArrayStack<String>();

        for (int i = 0; i < 10; i++) {
            arStack.push(String.valueOf(i));
        }

        System.out.println(arStack.toString());

    }
}
