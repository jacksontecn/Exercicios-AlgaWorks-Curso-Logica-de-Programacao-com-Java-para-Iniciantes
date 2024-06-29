import java.util.Scanner;

public class Exercicio02_Variaveis_e_constantes {
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = readConsole.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = readConsole.nextLine();
        System.out.println("Seja bem vindo " + nome + " " + sobrenome);

        readConsole.close();
    }
}
