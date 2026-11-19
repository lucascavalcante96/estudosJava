package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos Gigabytes tem o arquivo: ");
        double gigabytes = sc.nextDouble();

        double megabytes = gigabytes * 1024;
        double kilobytes = gigabytes * 1024 * 1024;

        System.out.printf("%.1f GB convertidos para Megabytes é: %.2f\n", gigabytes, megabytes);
        System.out.printf("%.1f GB convertidos para Kilobytes é: %.2f", gigabytes, kilobytes);

        sc.close();
    }
}
