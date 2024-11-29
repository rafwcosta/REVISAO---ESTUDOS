import java.util.Scanner;
import java.util.Locale;

public class Seq01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println(a + " + " + b + " = " + soma);

        sc.close();

    }
}