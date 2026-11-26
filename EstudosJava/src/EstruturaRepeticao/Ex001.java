package EstruturaRepeticao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificador = false;
        do {
            System.out.println("Digite uma nota de 0 a 10");
            int nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Digite uma nota Valida!");
                System.out.println("Digite uma nota de 0 a 10");
                nota = sc.nextInt();
            }
            else {
                verificador = true;
            }
        }while (verificador == false);

        sc.close();
    }
}
