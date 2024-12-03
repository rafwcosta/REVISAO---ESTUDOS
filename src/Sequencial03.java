import java.util.Scanner;
import java.util.Locale;

public class Sequencial03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // PARA MUDAR O IDIOMA DO CÓDIGO
        Scanner sc = new Scanner(System.in);

            // ENTRADAS
            System.out.println("Diferença do produto de A e B pelo produto de C e D!");
            System.out.print("Digite o valor de A: ");
            int a = sc.nextInt();
            System.out.print("B: ");
            int b = sc.nextInt();
            System.out.print("C: ");
            int c = sc.nextInt();
            System.out.print("D: ");
            int d = sc.nextInt();

            // CÁLCULO / PROCESSAMENTO
            int diferenca = (a * b - c * d);

            // SAÍDA
            System.out.println("Resultado: " + diferenca);

        sc.close(); // FECHAMENTO DO CÓDIGO

    }
}