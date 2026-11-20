package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
