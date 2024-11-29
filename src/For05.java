import java.util.Scanner;
import java.util.Locale;

public class For05 {
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de N: ");
            int n = sc.nextInt();

            int fatorial = 1;

            for (int i = 1; i <= n; i++) {

                fatorial *= i;

            }

            System.out.println("Resultado: " + fatorial);

        sc.close();
        
    }
}