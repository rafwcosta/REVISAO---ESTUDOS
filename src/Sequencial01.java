import java.util.Scanner;
import java.util.Locale;

public class Sequencial01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            // ENTRADAS
            System.out.println("Soma de algoritmos!");
            System.out.print("Digite o valor de A: ");
            int a = sc.nextInt();
            System.out.print("Digite o valor de B: ");
            int b = sc.nextInt();

            // CÁLCULO / PROCESSAMENTO
            int soma = a + b;

            // SAÍDA
            System.out.println("Resultado: " + soma);

        sc.close();

    }
}