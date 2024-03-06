package curso_01.capitulo_02;

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 42.90;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        System.out.println("O valor a ser pago é: R$" + total);
    }
}
