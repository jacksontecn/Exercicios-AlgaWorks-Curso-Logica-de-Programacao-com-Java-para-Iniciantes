package Exercicio_Variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio04_Variaveis_e_constantes {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double produto = readLine.nextDouble();
        System.out.print("Quantidade do produto: ");
        Integer quantidade = readLine.nextInt();

        Double subtotalProduto = produto * quantidade;

        Double percentualDesconto;

        if (quantidade >= 10){
            percentualDesconto = subtotalProduto * 10 / 100;
        }else{
            percentualDesconto = 0.00;
        }

        double valorFinalTotal = subtotalProduto - percentualDesconto;
        System.out.println("Valor total do produto: " + valorFinalTotal);
        readLine.close();
    }

}
