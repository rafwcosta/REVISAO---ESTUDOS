import java.util.Scanner;
import java.util.Locale;

public class For01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int x = sc.nextInt();

            for (int i = 1; i <= x; i++) {

                if (i % 2 != 0) {
                    System.out.println("Número ímpares: " + i);
                }

            }

        sc.close();

    }
}