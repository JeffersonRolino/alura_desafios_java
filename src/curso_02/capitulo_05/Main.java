package curso_02.capitulo_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        int escolha = 1;

        System.out.println("Digite o limite de seu cartão de crédito:");
        double limite = scanner.nextDouble();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        while (escolha != 0){
            System.out.println("Digite a descrição da compra: ");
            String nomeDoProduto = scanner.next();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            if(valor <= cartaoDeCredito.getSaldo()){
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");

                Compra compra = new Compra(nomeDoProduto, valor);
                cartaoDeCredito.realizarCompra(compra);

                escolha = scanner.nextInt();
            }
            else {
                System.out.println("Transação inválida! Você atingiu o limite do cartão...");
                escolha = 0;
            }
        }

        Collections.sort(cartaoDeCredito.getCompras());

        System.out.println("\n***********************************");
        System.out.println("COMPRAS REALIZADAS\n");

        for (Compra item : cartaoDeCredito.getCompras()){
            System.out.println(item + "\tR$" + item.getValor());
        }

        System.out.println("\n***********************************");
        System.out.println("\nSaldo no cartão: R$" + cartaoDeCredito.getSaldo());
    }
}
