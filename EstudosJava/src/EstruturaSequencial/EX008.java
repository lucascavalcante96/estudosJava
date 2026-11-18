package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EX008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperatura = sc.nextDouble();

        double C = 5 * ((temperatura - 32) / 9);

        System.out.printf("A temperatura %.1fº F convertida para Celsius é %.1fºC.",  temperatura, C);
        sc.close();
    }
}
