package EstruturaDecisao;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int maior = num1;
        int menor = num1;
        int numeroMeio = num1;
        if(num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                menor = num3;
                numeroMeio = num2;
            }
            else  {
                menor = num2;
                numeroMeio = num3;
            }
        } else if(num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                menor = num3;
                numeroMeio = num1;
            }
            else {
                menor = num1;
                numeroMeio = num3;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                menor = num2;
                numeroMeio = num1;
            }
            else{
                menor = num1;
                numeroMeio = num2;
            }

        }

        System.out.println(maior);
        System.out.println(numeroMeio);
        System.out.println(menor);
        sc.close();
    }
}
