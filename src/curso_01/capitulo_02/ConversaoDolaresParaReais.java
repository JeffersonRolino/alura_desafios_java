package curso_01.capitulo_02;

public class ConversaoDolaresParaReais {
    public static void main(String[] args) {
        double valorEmDolares = 295.73;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.printf("O valor em reais é R$%.2f%n", valorEmReais);
    }
}
