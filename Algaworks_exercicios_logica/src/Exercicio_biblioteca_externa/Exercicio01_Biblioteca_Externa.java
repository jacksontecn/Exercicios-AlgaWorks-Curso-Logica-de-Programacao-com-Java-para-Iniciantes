package Exercicio_biblioteca_externa;

import org.apache.commons.mail.EmailException;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01_Biblioteca_Externa {
    public static void main(String[] args) throws EmailException {
        Scanner readLine = new Scanner(System.in);
        ArrayList<String> linhas =  new ArrayList<String>();

        Integer index = 0;
        System.out.print("Digite sua tarefa nº " + (index += 1) + " ou [ X ] para encerrar: ");
        String preparandoEmail = "";
        String fim = "Programa encerrado!";

        String atividade = readLine.nextLine();

        if (atividade.equalsIgnoreCase("x")){
            System.out.println(fim);
        }else {
            linhas.add(atividade);
            while (!atividade.equalsIgnoreCase("x")) {
                if (!atividade.equalsIgnoreCase("x")) {
                    System.out.print("Digite sua atividade nº " + (index + 1) + " : ");
                    atividade = readLine.nextLine();
                    linhas.add(atividade);
                    index++;
                } else {
                    System.out.println("Email será enviado sem assunto");
                }

            }

            for (int i = 0; i < linhas.size(); i++) {
                if(!linhas.get(i).equalsIgnoreCase("x")){
                    preparandoEmail += "Tafera nº " + (i+1) + ": " + linhas.get(i) + "\n";
                }else {
                    break;
                }

            }

            Sedex.escreverEEnviar(readLine,preparandoEmail);

        }

        readLine.close();

    }
}
