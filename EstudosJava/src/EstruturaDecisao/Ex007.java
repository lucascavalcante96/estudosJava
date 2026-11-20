package EstruturaDecisao;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int maior, menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num3) {
            maior = num2;
        }
        else {
            maior = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        }
        else if (num2 < num3) {
            menor = num2;
        }
        else {
            menor = num3;
        }

        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);

        sc.close();
    }
}
