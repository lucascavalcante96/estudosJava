package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num  = sc.nextDouble();

        if (num < 0){
            System.out.println("Numero negativo");
        }
        else {
            System.out.println("Numero positivo");
        }
        sc.close();

    }
}
