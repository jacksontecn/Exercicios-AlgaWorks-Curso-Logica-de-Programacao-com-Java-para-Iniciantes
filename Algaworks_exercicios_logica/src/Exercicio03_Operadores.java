import java.util.Scanner;

public class Exercicio03_Operadores {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        double resultado = 0.0;

        System.out.print("Digite o valor da conta de luz: ");
        Double contaLuz = readLine.nextDouble();
        resultado += contaLuz;

        System.out.print("Digite o valor da conta de água: ");
        Double contaAgua = readLine.nextDouble();
        resultado += contaAgua;

        System.out.print("Digite o valor da conta de telefone: ");
        Double contaTelefone = readLine.nextDouble();
        resultado += contaTelefone;

        System.out.print("Digite o valor da escola do filho: ");
        Double escolaFilho = readLine.nextDouble();
        resultado += escolaFilho;

        System.out.print("Digite o valor da fatura do cartão: ");
        Double faturaCartao = readLine.nextDouble();
        resultado += faturaCartao;

        System.out.print("Digite o valor dos gastos com supermercado: ");
        Double gastoSupermercado = readLine.nextDouble();
        resultado += gastoSupermercado;

        System.out.println("O gasto total da sua família é: " + resultado);
        readLine.close();
    }
}
