import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class EX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String value = "";
        if (args.length < 1) {
            System.exit(0);
        }
        for (int i = 0; i < args.length; i++) {

            if (args[i].contains(".txt")) {
                value = args[i];
                break;
            }
        }

        try {
            Charset ENCODING = StandardCharsets.UTF_8;
            Path path = Paths.get(value);

            List<String> linhas = Files.readAllLines(path, ENCODING);

            ArrayList<Double> arrlist = new ArrayList<Double>(2);

            for (int i = 0; i < linhas.size(); i++) {
                arrlist.add(Double.parseDouble(linhas.get(i)));
            }

            System.out.println("SOMA:"+(arrlist.get(0) + arrlist.get(1) ));
            
            System.out.println("Subtracao:"+(arrlist.get(0) - arrlist.get(1) ));
            
            System.out.println("Multiplicação:"+ (arrlist.get(0) * arrlist.get(1) ));
            
            System.out.println("Divisao:"+(arrlist.get(0) / arrlist.get(1) ));

        } catch (IOException ex) {
            System.err.println("ERRO: O ficheiro <"+ value +"> nao existe!!!");
        }
    }

}
