import java.util.Scanner;
import java.util.Locale;

public class While01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a senha (4 digitos): ");
            int senha = sc.nextInt();

            while (senha != 2002) {
                System.out.println("Senha inválida!");
                System.out.println();
                System.out.print("Digite a senha (4 digitos): ");
                senha = sc.nextInt();
            }

            System.out.println("Acesso permitido!");

        sc.close();

    }
}