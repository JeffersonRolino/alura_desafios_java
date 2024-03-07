package curso_01.capitulo_03;

import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- MENU -----");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        int opcao = scanner.nextInt();

        if(opcao == 1){
            System.out.println("Digite o valor do lado do quadrado: ");
            double lado = scanner.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é " + areaQuadrado);
        }
        else if (opcao == 2){
            System.out.println("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            double areaDoCirculo = (raio * raio) * Math.PI;
            System.out.println("A área do círculo é " + areaDoCirculo);
        }
        else {
            System.out.println("Valor inválido...");
        }

        scanner.close();
    }
}
