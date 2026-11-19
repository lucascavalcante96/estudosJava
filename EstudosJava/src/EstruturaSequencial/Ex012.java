package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite abaixo quantos Kilos de peixe.");
        double kg = sc.nextDouble();

        double excesso = kg - 50;

        double multa = excesso * 4;

        System.out.printf("Você pescou %.1f Kilos de peixe.\n", kg);
        System.out.printf("O total excesso foi de: %.2f\n", excesso);
        System.out.printf("O total multa foi de: %.2f\n", multa);

        sc.close();
    }
}
