import java.util.Scanner;

public class Acumulador {

    public static void main(String[] args) {
        Double soma;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double numero = input.nextDouble();
        soma = numero;

        while (numero != 0) {
            System.out.println("Digite um número: ");
            numero = input.nextDouble();
            soma = soma + numero;
        }
            System.out.println(soma);
        }
}
