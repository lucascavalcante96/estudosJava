package EstruturaDecisao;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o segundo lado do triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triangulo Equilátero");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo Isóceles");
            }
            else {
                System.out.println("Triangulo Escaleno");
            }
        }
        else {
            System.out.println("Os valores informados nao formam um triangulo.");
        }
        sc.close();
    }
}
