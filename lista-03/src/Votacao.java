import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        Integer votosMussarela = 0, votosCalabresa = 0, votosQuatroQueijos = 0;
        Scanner input = new Scanner(System.in);

        for (Integer contador = 0; contador <= 10; contador++) {
        System.out.println("Vote em uma pizza (5 = mussarela / 25 = calabresa / 50 = 4 queijos");
        Integer numero = input.nextInt();

        if (numero == 5) {
            votosMussarela++;
        }
        if (numero == 25) {
            votosCalabresa++;
        }
        if (numero == 50) {
            votosQuatroQueijos++;
        }
        }
        System.out.println(String.format("A pizza sabor Mussarela teve %d votos", votosMussarela));
        System.out.println(String.format("A pizza sabor Calabresa teve %d votos", votosCalabresa));
        System.out.println(String.format("A pizza sabor Quatro Queijos teve %d votos", votosQuatroQueijos));

        if (votosCalabresa > votosMussarela) {
            if (votosCalabresa > votosQuatroQueijos) {
                System.out.println("O sabor de pizza favorito é Calabresa");
            }
            else {
                System.out.println("O sabor de pizza favorito é Quatro Queijos");
            }
        }
        else {
            if (votosMussarela > votosQuatroQueijos) {
                System.out.println("O sabor de pizza favorito é Mussarela");
            }
        }
        }
}
