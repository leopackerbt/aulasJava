import java.util.Scanner;
import java.util.Random;

public class Loteria {


    public static void main(String[] args) {
        Integer tentativas = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 10");
        Integer numero = input.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("Numero inválido");
        }
        else {
            Random sortear = new Random();
            Integer aleatorio = sortear.nextInt(10);

            while (aleatorio != numero) {
                aleatorio = sortear.nextInt(10);
                System.out.println(aleatorio);
                tentativas++;
            }
            System.out.println(String.format("Foram necessárias %d tentativas.", tentativas));
            if (tentativas <= 3) {
                System.out.println("Você é MUITO sortudo");
            }
            else if (tentativas <= 10) {
                System.out.println("Você é sortudo");
            }
            else {
                System.out.println("É melhor você ser trabalhador");
            }
        }
    }
}
