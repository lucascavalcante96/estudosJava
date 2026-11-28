package EstruturaRepeticao;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do usuário: ");
        String  nome = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        while (true) {
            if (senha.equals(nome)) {
                System.out.println("Sua senha não pode ser igual ao Login!");
                System.out.print("Digite a senha: ");
                senha = sc.nextLine();
            }
            else {
                System.out.println("Logado com sucesso!");
                break;
            }
        }
    }
}
