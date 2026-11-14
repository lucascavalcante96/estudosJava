package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            double nota = sc.nextDouble();
            soma += nota;

        }

        media = soma / 4;

        System.out.printf("A média foi: %.2f" , media);
        sc.close();
    }
}
