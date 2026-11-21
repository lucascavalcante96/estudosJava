package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Quantas horas trabalhadas por mês: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double ir = 0;
        double descontoIR = 0;
        double salarioLiquido;

        if (salarioBruto <= 900) {
            salarioLiquido = salarioBruto - inss;
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = 5;
            descontoIR = salarioBruto * (ir / 100);
            salarioLiquido = salarioBruto - descontoIR - inss;
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = 10;
            descontoIR = salarioBruto * (ir / 100);
            salarioLiquido = salarioBruto - descontoIR - inss;
        }
        else {
            ir = 20;
            descontoIR = salarioBruto * (ir / 100);
            salarioLiquido = salarioBruto - descontoIR - inss;
        }

        double totalDescontos = descontoIR + inss;

        System.out.printf("Salário Bruto: (%.0f * %d)        : R$ %.2f\n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f %%)                    : R$   %.2f\n", ir, descontoIR);
        System.out.printf("(-) INSS (10%%)                  : R$  %.2f\n", inss);
        System.out.printf("FGTS (11%%)                      : R$  %.2f\n", fgts);
        System.out.printf("Total de descontos              : R$  %.2f\n", totalDescontos);
        System.out.printf("Salário Liquido                 : R$  %.2f\n", salarioLiquido);
        sc.close();
    }
}
