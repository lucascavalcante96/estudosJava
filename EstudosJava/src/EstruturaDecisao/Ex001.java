package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número foi: " + num1);
        } else if (num1 == num2) {
            System.out.println("Os dois números são iguais");
        }
        else {
            System.out.println("O maior numero foi: " + num2);
        }

        sc.close();
    }
}
