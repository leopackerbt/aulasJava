import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Integer calculo;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        Integer numero = input.nextInt();

        System.out.println(numero);
        for (Integer contador = 0; contador <= 10; contador++) {
            calculo = numero * contador;
            System.out.println(String.format("%d x %d = %d", numero, contador, calculo));
        }
    }
}
