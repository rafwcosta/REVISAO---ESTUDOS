import java.util.Scanner;
import java.util.Locale;

public class For02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de N: ");
            int n = sc.nextInt();

            int dentro = 0;
            int fora = 0;

            for (int i = 0; i <= n; i++) {

                System.out.print("Digite o valor de X: ");
                int x = sc.nextInt();

                if (x >= 10 && x <= 20) {
                    dentro += 1;
                }
                else {
                    fora += 1;
                }

            }

            System.out.println(dentro + " dentro");
		    System.out.println(fora + " fora");

        sc.close();

    }
}