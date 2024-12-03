import java.util.Scanner;
import java.util.Locale;

public class Sequencial02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Raio de um círculo!");
            System.out.print("Digite o valor do raio: ");
            double raio = sc.nextDouble();

            double areaDoCirculo = 3.14159 * (raio * raio);

            System.out.printf("Resultado: %.4f%n", areaDoCirculo);

        sc.close();

    }
}