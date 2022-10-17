import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class EX2 {

    private static List<String> readFile() {

        try {
            Charset ENCODING = StandardCharsets.UTF_8;

            Path path = Paths.get("comandos.txt");

            List<String> linhas = Files.readAllLines(path, ENCODING);
            return linhas;
        } catch (IOException ex) {

            System.out.println("Erro no acesso ao ficheiro");
        }
        return null;
    }

    public static void main(String[] args) {

        List<String> linhas = readFile();
        Process process[] = new Process[linhas.size()];
        for (int i = 0; i < linhas.size(); i++) {
            try {
                ProcessBuilder pb = new ProcessBuilder(linhas.get(i));

                pb.inheritIO();
                process[i] = pb.start();

                System.out.println("Inicio do comando:" + linhas.get(i));
            } catch (IOException ex) {
            }

        }

        for (int j = 0; j < linhas.size(); j++) {
            try {

                process[j].waitFor();
                System.out.println("Fim do comando:" + linhas.get(j));
            } catch (InterruptedException e) {
            }
        }

    }

}