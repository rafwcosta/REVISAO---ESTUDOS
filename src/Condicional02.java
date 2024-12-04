import java.util.Scanner;
import java.util.Locale;

public class Condicional02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Número par, ou ímpar?");
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Número par");
            }
            else {
                System.out.println("Número ímpar");
            }

        sc.close();

    }    
}