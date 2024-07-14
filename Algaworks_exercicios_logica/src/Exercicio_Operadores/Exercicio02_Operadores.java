package Exercicio_Operadores;

import java.util.Scanner;

public class Exercicio02_Operadores {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = readLine.nextDouble();

        final Double FRETE = 15.00;

        Boolean freteGratis = valorProduto >= 100.00;

        Double valorFinalCompra;

        if (freteGratis){
            valorFinalCompra = valorProduto;
        }else {
            valorFinalCompra = valorProduto + FRETE;
        }

        System.out.println("Valor final da compra é: " + valorFinalCompra);
        readLine.close();
    }
}
