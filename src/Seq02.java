import java.util.Scanner;
import java.util.Locale;

public class Seq02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do raio do círculo: ");
        double raioDoCirculo = sc.nextDouble();

        double area = 3.14159 * (raioDoCirculo * raioDoCirculo);

        System.out.printf("Área: %.4f%n", area);

        sc.close();

    }
}