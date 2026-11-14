package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        double valorHora = sc.nextDouble();

        System.out.printf("Digite quantas horas você trabalha por mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.printf("O seu salário ao final do mês será de: %.2f", salario);
        sc.close();

    }
}
