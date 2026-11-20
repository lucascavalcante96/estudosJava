package EstruturaDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 'F' para Feminino ou 'M' para masculino: ");
        char sexo =  sc.next().charAt(0);
        sexo = Character.toLowerCase(sexo);

        if (sexo == 'f'){
            System.out.printf("Feminino");
        }
        else if (sexo == 'm'){
            System.out.printf("Masculino");
        }
        else{
            System.out.println("Sexo invalido");
        }
    }
}
