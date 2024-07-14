package Exercicio_Vetores;

import java.util.Scanner;

public class Exercicio01_Vetores {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        String [] tarefas = new String[5];

        for (int i = 0; i < tarefas.length; i++){
            System.out.print("Digite sua tarefa de numero " + (i+1) + ": " );
            tarefas[i] = readLine.nextLine();
        }
        System.out.println();
        for (int i = 0; i < tarefas.length; i++){
            System.out.println("Sua tarefa de numero " + (i+1) + " é: " + tarefas[i]);
        }


    }
}
