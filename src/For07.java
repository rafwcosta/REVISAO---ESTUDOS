import java.util.Scanner;
import java.util.Locale;

public class For07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número positivo N: ");
            int n = sc.nextInt();

            for (int i=1; i<=n; i++) {

                int first = i;
                int second = i * i;
                int third = i * i * i;

                System.out.printf("%d %d %d%n", first, second, third);

            }

        sc.close();

    }
}