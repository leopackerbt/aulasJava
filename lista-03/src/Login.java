import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String nome, senha;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome de usuário");
        nome = input.next();

        System.out.println("Digite a senha");
        senha = input.next();

        if (nome.equals("admin") && senha.equals("#Bandtec")) {
            System.out.println("Login realizado com sucesso");
        }
        else {
            System.out.println("Login e/ou senha inválidos");
        }
    }
}
