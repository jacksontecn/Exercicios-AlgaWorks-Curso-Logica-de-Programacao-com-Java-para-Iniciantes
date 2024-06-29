import java.util.Scanner;

public class Exercicio03_Variaveis_e_constantes {
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        Integer notaAluno = readConsole.nextInt();

        final Integer MEDIA = 70;

        Boolean aprovado = notaAluno >= MEDIA;


        if (aprovado){
            System.out.println("Aluno passou.");
        }else {
            System.out.println("Aluno não passou.");
        }
        readConsole.close();
    }
}
