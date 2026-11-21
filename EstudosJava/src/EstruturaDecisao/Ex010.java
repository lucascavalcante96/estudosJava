package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        double salarioFinal;
        double reajuste;
        double percentualAumento;

        if (salario <= 280) {
            reajuste = salario * 0.2;
            salarioFinal = salario + reajuste;
            percentualAumento = 20;
        }
        else if (salario > 280 && salario <= 700) {
            reajuste = salario * 0.15;
            salarioFinal = salario + reajuste;
            percentualAumento = 15;
        } else if (salario > 700 && salario <= 1500) {
            reajuste = salario * 0.1;
            salarioFinal = salario + reajuste;
            percentualAumento = 10;
        }
        else {
            reajuste = salario * 0.05;
            salarioFinal = salario + reajuste;
            percentualAumento = 5;
        }

        System.out.println("Seu salário antes do reajuste: " + salario);
        System.out.println("O percentual de aumento foi de: " + percentualAumento);
        System.out.println("O valor do aumento foi de: " + reajuste);
        System.out.println("Seu novo salário é de: " + salarioFinal);
        sc.close();
    }
}
