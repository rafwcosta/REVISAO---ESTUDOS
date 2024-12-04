import java.util.Scanner;
import java.util.Locale;

public class Condicional03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("São múltiplos, ou não?");
            System.out.print("Digite o valor inteiro de A: ");
            int a = sc.nextInt();
            System.out.print("Agora, B: ");
            int b = sc.nextInt();

            if (a % b == 0 || b % a == 0) {
                System.out.println("São múltiplos!");
            }
            else {
                System.out.println("Não são múltiplos!");
            }

        sc.close();

    }
}