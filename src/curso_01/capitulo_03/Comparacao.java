package curso_01.capitulo_03;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira dois números inteiros:\n");
        System.out.printf("Primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.printf("\nSegundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.printf("Os números são diferentes.\n");
            System.out.printf("O primeiro número %d é maior que o segundo número %d.", numero1, numero2);
        }
        else if(numero1 < numero2){
            System.out.printf("Os números são diferentes.\n");
            System.out.printf("O primeiro número %d é menor que o segundo número %d.", numero1, numero2);
        }
        else {
            System.out.printf("Os números são iguais.\n");
            System.out.printf("O primeiro número %d é igual que o segundo número %d.", numero1, numero2);
        }

        scanner.close();
    }
}
