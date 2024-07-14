package Exercicio_Estrutura_de_Decisao;

import java.util.Scanner;

public class Exercicio01_Estrutura_de_Decisao {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        System.out.print("Digite sua nota de português: ");
        Integer portugues = readLine.nextInt();

        System.out.print("Digite sua nota de matemática: ");
        Integer matematica = readLine.nextInt();
        Integer notaGeral = portugues + matematica;

        boolean notaMaxima = notaGeral >= 150;
        boolean minimaPortugues = portugues > 59;
        boolean minimaMatematica = matematica > 59;

        if (notaMaxima && minimaPortugues && minimaMatematica){
            System.out.println("Nota de português: " + portugues);
            System.out.println("Nota de matemática: " + matematica);
            System.out.println("Você conseguiu a vaga com a nota geral: " + notaGeral);
        }else {
            System.out.println("Você não conseguiu a vaga.");
        }

        readLine.close();
    }
}
