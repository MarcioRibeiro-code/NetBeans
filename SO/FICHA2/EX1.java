import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
//Processo Externo = ProcessBuilder

//Possivel passar um ou mais argumentos para o programa externo

public class EX1 {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Modo de uso Java Shell <comando>");
            System.exit(0);
        }

        // args[0] comando a executar

        for (String s : args) {
            ProcessBuilder pb = new ProcessBuilder(s);
            Process process = pb.start();
            System.out.println("Inicio do comando:" + s);

            try {
                process.waitFor();
                System.out.println("Fim do comando:" + s);
            } catch (InterruptedException e) {
            }

        }

    }

}