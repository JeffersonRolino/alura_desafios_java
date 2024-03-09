package curso_04.capitulo_04;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("arquivo.txt");
        fileWriter.write("Conteúdo a ser gravado no arquivo.");
        System.out.println("Dados gravados com sucesso.");
        fileWriter.close();
    }
}
