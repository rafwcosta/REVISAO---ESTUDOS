import java.util.Scanner;
import java.util.Locale;

public class Sequencial05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Valor a ser pago pelas peças!");
            System.out.print("N° de peças 1: ");
            int numeroUm = sc.nextInt();
            System.out.print("Valor unitário de cada peça 1: ");
            double valorUm = sc.nextDouble();
            System.out.println();
            System.out.print("N° de peças 2: ");
            int numeroDois = sc.nextInt();
            System.out.print("Valor unitário de cada peça 2: ");
            double valorDois = sc.nextDouble();

            double total = (numeroUm * valorUm) + (numeroDois * valorDois);

            System.out.println();
            System.out.printf("Total a ser pago: R$ %.2f%n", total);


        sc.close();

    }
}