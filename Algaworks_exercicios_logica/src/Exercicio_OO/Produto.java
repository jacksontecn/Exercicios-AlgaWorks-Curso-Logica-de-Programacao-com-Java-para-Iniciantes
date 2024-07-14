package Exercicio_OO;

public class Produto {
    //Classe criada para o Exercicio01 do assunto de orientação a objetos

    static  final Integer QUANTIDADE_MINIMA = 10;
    String nome;
    Integer quantidadeEstoque;

    //Metodo de estancia criado para atividade do exercicio 02 de orientação a objetos

    Boolean verificarEstoque(){
        boolean resultado = false;

        if(this.quantidadeEstoque < QUANTIDADE_MINIMA){
            resultado = true;
        }
        return resultado;
    }



}
