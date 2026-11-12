package EstruturaSequencial;

//Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]":

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextInt();

        System.out.printf("O número informado foi %.1f", numero);
    }
}
