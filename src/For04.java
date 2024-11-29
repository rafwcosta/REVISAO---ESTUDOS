import java.util.Scanner;
import java.util.Locale;

public class For04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
            System.out.print("Digite o valor de N: ");
            int n = sc.nextInt();
            System.out.println();
            
            for (int i = 0; i < n; i++) {

                System.out.println();
                System.out.print("Digite o valor de X: ");
                int x = sc.nextInt();
                System.out.print("Digite o valor de Y: ");
                int y = sc.nextInt();

                if (y == 0) {
                    System.out.println("Divisão impossível!");
                }
                else {
                    double divisao = (double) x / y;
                    System.out.printf("Resultado: %.1f%n", divisao);
                }

            }

        sc.close();

    }
}