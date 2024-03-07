package curso_01.capitulo_03;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println(numero  + " é um número positivo.");
        }
        else if(numero < 0){
            System.out.println(numero + " é um número negativo.");
        }
        else {
            System.out.println(numero + " é um número neutro.");
        }

        scanner.close();
    }
}
