package ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        List<String> linhas = null;
        Path p = Paths.get("src/ex2/robos.txt");

        try {
            linhas = Files.readAllLines(p);
        } catch (IOException e) {
            System.out.println("O ficheiro não existe ou não é visivel");
        }

        for(String frase : linhas){
            //ignora o cabeçalho
            if(frase.contains("Jogador"))break;
            if(frase != null) {
                String[] temp = frase.split("[\\w]+");

            }
        }
    }
}
