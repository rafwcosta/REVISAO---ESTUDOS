import java.util.Scanner;
import java.util.Locale;

public class While02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Valor da coordenada X: ");
            int x = sc.nextInt();
            System.out.print("Valor da coordenada Y: ");
            int y = sc.nextInt();

            while (x != 0 && y != 0) {

                if (x > 0 && y > 0) {
                    System.out.println();
                    System.out.println("1° quadrante!");
                }
                else if (x < 0 && y > 0) {
                    System.out.println();
                    System.out.println("2° quadrante!");
                }
                else if (x < 0 && y < 0) {
                    System.out.println();
                    System.out.println("3° quadrante!");
                }
                else {
                    System.out.println();
                    System.out.println("4° quadrante!");
                }

                System.out.print("Valor da coordenada X: ");
                x = sc.nextInt();
                System.out.print("Valor da coordenada Y: ");
                y = sc.nextInt();

            }

            System.out.println();
            System.out.println("Ponto nulo no plano cartesiano.");

        sc.close();

    }
}