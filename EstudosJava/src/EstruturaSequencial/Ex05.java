package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio de um circulo: ");
        double raio = sc.nextDouble();

        double area = 3.1416 * (raio * raio);

        System.out.printf("A area do circulo é de: %.2f", area);


        sc.close();
    }
}
