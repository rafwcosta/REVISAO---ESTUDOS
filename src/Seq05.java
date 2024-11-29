import java.util.Scanner;
import java.util.Locale;

public class Seq05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Número de peças 1: ");
            int numUm = sc.nextInt();
            System.out.print("Valor por cada peça 1: ");
            double valorUm = sc.nextDouble();

            System.out.print("Número de peças 2: ");
            int numDois = sc.nextInt();
            System.out.print("Valor por cada peça 2: ");
            double valorDois = sc.nextDouble();

            double total = (numUm * valorUm) + (numDois * valorDois);

            System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();

    }
}