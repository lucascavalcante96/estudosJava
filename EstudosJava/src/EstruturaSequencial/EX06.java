package EstruturaSequencial;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado, area;

        System.out.println("Digite abaixo o lado do quadrado:");

        lado = sc.nextDouble();
        area = lado * lado;

        double dobroDaArea = area * 2;

        System.out.printf("A area do quadrado é de: %.2f\n", area);

        System.out.printf("O dobro da area é: %.2f", dobroDaArea);

        sc.close();
    }
}
