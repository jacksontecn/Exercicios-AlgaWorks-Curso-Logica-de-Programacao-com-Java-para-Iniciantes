package Exercicio_OO;

public class Exercicio01_OO {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Banana";
        produto.quantidadeEstoque = 9;

        if (verificarEstoque(produto) || produto.verificarEstoque()){
            System.out.println("Necessita repor o estoque do produto " + produto.nome + ".");
        }else {
            System.out.println("O produto " + produto.nome + " esta abastecido.");
        }



    }

    static Boolean verificarEstoque(Produto produto){
        boolean resultado = false;

         if(produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA){
            resultado = true;
        }
         return resultado;
    }
}
