package Exercicio_Metodos;

import java.util.Scanner;

public class Exercicio03_Metodos {
    public static void main(String[] args) {
        Scanner readLine =  new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        Integer primeiroNumero = readLine.nextInt();
        System.out.print("Digite o segundo numero: ");
        Integer segundoNumero = readLine.nextInt();
        System.out.println("Digite a operação: [1] Adição [2] Subtração [3] Multiplicação [4] Divisão.");
        Integer operacao = readLine.nextInt();

        switch (operacao){
            case 1:
                Integer resultadoAdicao = adicao(primeiroNumero, segundoNumero);
                System.out.println("O resultado da adição é: " + resultadoAdicao); break;
            case 2:
                Integer resultadoSubtracao = subtracao(primeiroNumero, segundoNumero);
                System.out.println("O resultado da subtração é: " + resultadoSubtracao); break;
            case 3:
                Integer resultadoMultiplicacao = multiplicacao(primeiroNumero, segundoNumero);
                System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao); break;
            case 4:
                Integer resultadoDivisao = divisao(primeiroNumero, segundoNumero);
                System.out.println("O resultado da divisão é: " + resultadoDivisao); break;
            default:
                System.err.println("Operação escolhida inválida");
                System.exit(1);

        }

        readLine.close();
    }

    static Integer adicao(Integer numero1, Integer numero2){
        Integer resultado = numero1 + numero2;
        return resultado;
    }

    static Integer subtracao(Integer numero1, Integer numero2){
        Integer resultado = numero1 - numero2;
        return resultado;
    }

    static Integer multiplicacao(Integer numero1, Integer numero2){
        Integer resultado = numero1 * numero2;
        return resultado;
    }

    static Integer divisao(Integer numero1, Integer numero2){
        Integer resultado = numero1 / numero2;
        return resultado;
    }

}
