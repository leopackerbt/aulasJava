
public class ContadorVariado {

    public static void main(String[] args) {

        for (Double contador = 0.15; contador <= 5; contador += 0.15)
            System.out.println(String.format("%.2f", contador));

    }
}
