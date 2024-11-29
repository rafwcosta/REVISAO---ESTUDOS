import java.util.Scanner;
import java.util.Locale;

public class For03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de N: ");
            int n = sc.nextInt();

            for (int i = 0; i <= n; i++) {

                System.out.print("Digite o valor de A: ");
                double a = sc.nextDouble();
                System.out.print("Digite o valor de B: ");
                double b = sc.nextDouble();
                System.out.print("Digite o valor de C: ");
                double c = sc.nextDouble();

                double media = (a * 2.0) + (b * 3.0) + (c * 5.0) / 10.0;

                System.out.printf("Média ponderada dos valores: %.1f%n", media);

            }

        sc.close();

    }
}