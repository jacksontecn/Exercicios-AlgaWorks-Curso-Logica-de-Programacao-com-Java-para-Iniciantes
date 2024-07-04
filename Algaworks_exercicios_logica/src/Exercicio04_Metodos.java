import java.util.Scanner;

public class Exercicio04_Metodos {
    public static void main(String[] args) {
        // Atividade utilizando recursividade
        Scanner readLine = new Scanner(System.in);
        System.out.print("Digite o numero que terá a tabuada: ");
        Integer multiplicando = readLine.nextInt();
        imprimirTabuada(multiplicando, 0);
    }

    static void imprimirTabuada(Integer multiplicando, Integer multiplicador){
        Integer resultado = multiplicando * multiplicador;
        System.out.println(multiplicando + " * " + multiplicador + " = " + resultado);
        if (multiplicador < 10){
            imprimirTabuada(multiplicando, ++ multiplicador);
        }
    }

}
