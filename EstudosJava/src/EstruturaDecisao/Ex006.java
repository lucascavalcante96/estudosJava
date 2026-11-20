package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println(num1);
        }
        else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        sc.close();
    }
}
