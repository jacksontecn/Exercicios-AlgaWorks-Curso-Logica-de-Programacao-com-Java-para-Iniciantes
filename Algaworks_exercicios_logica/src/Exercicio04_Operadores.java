import java.util.Scanner;

public class Exercicio04_Operadores {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
        final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

        System.out.print("Digite sua idade: ");
        Integer idade = readLine.nextInt();

        System.out.print("Digite seu tempo de contribuição: ");
        Integer tempoContribuido = readLine.nextInt();

        Boolean idadeAposenta = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        Boolean contribuicao = tempoContribuido >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        if (idadeAposenta && contribuicao){
            System.out.println("Você pode se aposentar.");
        }else {
            System.out.println("Você não pode se aposentar.");
        }

        readLine.close();
    }
}
