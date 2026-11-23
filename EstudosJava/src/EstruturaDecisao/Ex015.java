package EstruturaDecisao;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número abaixo: ");
        int n1 = sc.nextInt();

        if (n1 % 2 == 0) {
            System.out.printf("O número %d é Par", n1);
        }
        else {
            System.out.printf("O número %d é Impar", n1);
        }

        sc.close();
    }
}
