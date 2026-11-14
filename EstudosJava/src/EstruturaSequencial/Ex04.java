package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos metros deseja converter: ");

        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("%.2f metros convertidos para centimetros é %.2f cm", metros, centimetros);

        sc.close();
    }
}
