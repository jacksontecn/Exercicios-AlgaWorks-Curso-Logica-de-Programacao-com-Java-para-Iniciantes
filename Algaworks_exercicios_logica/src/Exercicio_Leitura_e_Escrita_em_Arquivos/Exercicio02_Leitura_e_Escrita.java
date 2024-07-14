package Exercicio_Leitura_e_Escrita_em_Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02_Leitura_e_Escrita {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Jackson\\Documents\\arquivos\\arquivo-texto.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for (int i = 0; i < linhas.size(); i++){
            String atividade = linhas.get(i);
            if (!atividade.equalsIgnoreCase("x")){
                System.out.println("Atividade nº " + (i+1) + ": " + atividade);
            }else {
                break;
            }
        }
        System.out.println("Leitura encerrada.");

    }
}
