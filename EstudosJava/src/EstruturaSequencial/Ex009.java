package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro1 = sc.nextInt();
        System.out.print("Digite um segundo número inteiro: ");
        int inteiro2 = sc.nextInt();
        System.out.print("Digite um número real: ");
        double real = sc.nextDouble();


        double calc1 = (inteiro1 * 2) * ((double) inteiro2 / 2);
        double calc2 = (inteiro1 * 3) + real;
        double calc3 = Math.pow(real, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + calc1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + calc2);
        System.out.println("O terceiro elevado ao cubo: " + calc3);
        sc.close();
    }
}
