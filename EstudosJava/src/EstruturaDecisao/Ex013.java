package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1= sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2= sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10){
            System.out.println("A");
        }
        else if (media >= 7.5 && media < 9){
            System.out.println("B");
        }
        else if (media >= 6 && media < 7.5){
            System.out.println("C");
        }
        else if (media >= 4 && media < 6){
            System.out.println("D");
        }
        else if (media >0 && media < 4){
            System.out.println("E");
        }
        else {
            System.out.println("Você digitou um valor errado");
        }

        System.out.printf("As notas digitadas foram: %.1f %.1f\n",  nota1, nota2);
        System.out.printf("A media foi: %.1f\n", media);

        if (media >= 6 && media <= 10){
            System.out.println("Aprovado");
        }
        else if (media >0 && media <6){
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Média fora dos padrões!");
        }
        sc.close();
    }
}
