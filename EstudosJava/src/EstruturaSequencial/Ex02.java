package EstruturaSequencial;

// Faça um programa que peça dois números e imprima a soma:

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero1 = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.printf("A soma do %.1f + %.1f = %.1f\n", numero1, numero2, soma);

        sc.close();
    }
}
