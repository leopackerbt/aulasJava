import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma base");
        Integer base = input.nextInt();

        System.out.println("Digite um expoente");
        Integer expoente = input.nextInt();
        System.out.println(potencia(base,expoente));
    }

    public static Integer potencia(Integer base, Integer expoente){
        // potência base elevada a 1
        Integer soma = base;

        for (Integer i = 0; i < expoente - 1; i++) {
            soma = soma * base;
        }
        return soma;
    }
}
