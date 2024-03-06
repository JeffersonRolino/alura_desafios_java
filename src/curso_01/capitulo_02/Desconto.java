package curso_01.capitulo_02;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 100.0;

        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);

        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + precoComDesconto);
    }
}
