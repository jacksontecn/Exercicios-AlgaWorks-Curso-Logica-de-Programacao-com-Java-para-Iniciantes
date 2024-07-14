package Exercicio_Leitura_e_Escrita_em_Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01_Leitura_e_Escrita {
    public static void main(String[] args) throws IOException {
        Scanner readLine = new Scanner(System.in);
        ArrayList<String> linhas =  new ArrayList<String>();
        Path arquivo = Paths.get("C:\\Users\\Jackson\\Documents\\arquivos\\arquivo-texto.txt");

        Integer index = 0;
        System.out.print("Digite sua atividade nº " + (index += 1) + " ou [ X ] para encerrar: ");

        String atividade = readLine.nextLine();
        linhas.add(atividade);
        while (!atividade.equalsIgnoreCase("x")){
            System.out.print("Digite sua atividade nº " + (index + 1) + " : ");
            atividade = readLine.nextLine();
            linhas.add(atividade);
            index++;
        }
        System.out.println("Programa encerrado.");

        Files.write(arquivo, linhas);

        readLine.close();
    }
}
