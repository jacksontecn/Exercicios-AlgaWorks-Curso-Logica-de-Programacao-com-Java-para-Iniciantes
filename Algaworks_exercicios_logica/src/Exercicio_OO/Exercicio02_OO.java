package Exercicio_OO;

public class Exercicio02_OO {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.setCodigo(1);
        pedido.setSubtotal(10.00);
        pedido.setDesconto(1.0);
        System.out.println("Código do pedido: " + pedido.getCodigo());
        System.out.println("Valor total do pedido: " + pedido.getTotal());
    }
}
