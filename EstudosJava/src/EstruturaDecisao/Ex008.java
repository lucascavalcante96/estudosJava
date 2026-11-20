package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto 1: ");
        double preco1 = sc.nextDouble();
        System.out.print("Digite o preço do produto 2: ");
        double preco2 = sc.nextDouble();
        System.out.print("Digite o preço do produto 3: ");
        double preco3 = sc.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("A escolha deve ser o produto 1");
        } else if (preco2 < preco3) {
            System.out.println("A escolha deve ser o produto 2");
        }
        else {
            System.out.println("A escolha deve ser o produto 3");
        }

        sc.close();
    }
}
