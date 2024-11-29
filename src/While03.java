import java.util.Scanner;
import java.util.Locale;

public class While03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            // ENTRADAS
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Finalizar o código");
            System.out.println();
            System.out.print("Tipo de combustível: ");
            int tipo = sc.nextInt();

            // VARIÁVEIS
            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;

            // LOOP WHILE / PROCESSAMENTOS
            while (tipo != 4) {
                
                if (tipo == 1) {
                    alcool += 1;
                }
                else if (tipo == 2) {
                    gasolina += 1;
                }
                else if (tipo == 3) {
                    diesel += 1;
                }

                System.out.print("Tipo de combustível: ");
                tipo = sc.nextInt();

            }

            // SAÍDAS
            System.out.println();
            System.out.println("Muito obrigado!");
            System.out.println();
            System.out.println("Álcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

        sc.close();

    }
}