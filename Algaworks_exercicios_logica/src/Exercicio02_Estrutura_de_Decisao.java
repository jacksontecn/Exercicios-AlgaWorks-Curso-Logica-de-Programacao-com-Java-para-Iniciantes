import java.util.Scanner;

public class Exercicio02_Estrutura_de_Decisao {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        System.out.print("Digite a meta anual do ano anterior: ");
        Double metaAnual = readLine.nextDouble();

        System.out.print("Digite o faturamento real do último ano: ");
        Double faturamentoReal = readLine.nextDouble();

        System.out.print("Digite a média salarial: ");
        Double mediaSalarial = readLine.nextDouble();

        Boolean faturamento = faturamentoReal >= metaAnual;
        Boolean bonusOitenta = faturamentoReal >= (metaAnual * 80/100);

        if (faturamento){
            System.out.println("Os funcionarios receberão um bônus de R$: " + mediaSalarial);
        } else if (bonusOitenta) {
            System.out.println("Os funcionarios receberão 80% de bônus da média salarial R$: " + (mediaSalarial*80/100));
        }else {
            System.out.println("O funcionario não receberá um bônus.");
        }

        readLine.close();
    }
}
