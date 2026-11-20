package EstruturaDecisao;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' ||letra == 'O' || letra == 'U') {
            System.out.println("Vogal");
        }
        else {
            System.out.println("Consoante");
        }

        sc.close();
    }
}
