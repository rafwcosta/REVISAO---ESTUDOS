import java.util.Scanner;
import java.util.Locale;

public class Seq03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            int a = sc.nextInt();
            System.out.print("Digite o valor de B: ");
            int b = sc.nextInt();
            System.out.print("Digite o valor de C: ");
            int c = sc.nextInt();
            System.out.print("Digite o valor de D: ");
            int d = sc.nextInt();

            int diferenca = (a * b - c * d);

            System.out.println("Diferença: " + diferenca);

        sc.close();

    }
}