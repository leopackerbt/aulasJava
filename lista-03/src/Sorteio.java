import java.util.Scanner;
import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        Integer numeroSorteado = null;
        Integer vezesSorteadas = 0;
        Integer numeroPares = 0;
        Integer numeroImpares = 0;
        Random sortear = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 100");
        Integer numero = input.nextInt();
        Integer aleatorio = sortear.nextInt(10);

        for (Integer sorteio = 0; sorteio <= 199; sorteio++) {
            aleatorio = sortear.nextInt(10);
            vezesSorteadas++;

            if (aleatorio == numero && numeroSorteado == null) {
                numeroSorteado = vezesSorteadas;
            }
            if (aleatorio % 2 == 0) {
                numeroPares += 1;
            }
            else {
                numeroImpares += 1;
            }
        }
        if (numeroSorteado > 0) {
            System.out.println(String.format("Seu número foi sorteado pela primeira vez no %d° sorteio", numeroSorteado));
        }
        else {
            System.out.println("Seu número não foi sorteado");
        }
            System.out.println(String.format("Foram sorteados %d números pares", numeroPares));
            System.out.println(String.format("Foram sorteados %d números impares", numeroImpares));

        }
}
