import java.util.Scanner;

public class Exercicio03_Estrutura_de_Decisao {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        System.out.print("Digite um numero de 1 - 7: ");
        Integer dia = readLine.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda-Feira");
            break;
            case 3:
                System.out.println("Terça-Feira");
            break;
            case 4:
                System.out.println("Quarta-Feira");
            break;
            case 5:
                System.out.println("Quinta-Feira");
            break;
            case 6:
                System.out.println("Sexta-Feira");
            break;
            case 7:
                System.out.println("Sábado");
            break;
            default:
                System.err.println("Dia não encontrado!");
                System.exit(1);
        }

        readLine.close();
    }
}
