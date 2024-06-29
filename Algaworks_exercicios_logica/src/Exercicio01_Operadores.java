import java.util.Scanner;

public class Exercicio01_Operadores {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        Integer primeiroNumero = readLine.nextInt();
        System.out.println("Menu de operação:");
        System.out.println(" 1 - adição.");
        System.out.println(" 2 - subtração.");
        System.out.println(" 3 - multiplicação.");
        System.out.println(" 4 - divisão.");
        System.out.print("Escolha a operação: ");
        Integer operacao = readLine.nextInt();
        System.out.print("Digite o segundo numero: ");
        Integer segundoNumero = readLine.nextInt();

        if (operacao == 1){
            System.out.println("Resultado da adição é: " + (primeiroNumero + segundoNumero));
        } else if (operacao == 2) {
            System.out.println("Resultado da subtração é: " + (primeiroNumero - segundoNumero));
        } else if (operacao == 3) {
            System.out.println("Resultado da multiplicação é: " + (primeiroNumero * segundoNumero));
        }else {
            System.out.println("Resultado da divisão é: " + (primeiroNumero / segundoNumero));
        }

        readLine.close();
    }
}
