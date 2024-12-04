import java.util.Scanner;
import java.util.Locale;

public class Condicional01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Número positivo ou negativo?");
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("Resultado: Positivo");
            }
            else {
                System.out.println("Resultado: Negativo");
            }

        sc.close();

    }
}