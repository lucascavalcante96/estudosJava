package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite quantas horas você trabalhou no mês: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato =  salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println("+ Salário Bruto: " + salarioBruto);
        System.out.println("- Imposto Renda: " + impostoDeRenda);
        System.out.println("- Inss: " + inss);
        System.out.println("- Sindicato: " + sindicato);
        System.out.println("= Salario Liquido: " + salarioLiquido);

        sc.close();
    }
}
