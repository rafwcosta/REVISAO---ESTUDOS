import java.util.Scanner;
import java.util.Locale;

public class Seq06 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            // ENTRADAS
            System.out.print("Digite o 1° valor: ");
            double a = sc.nextDouble();
            System.out.print("Digite o 2° valor: ");
            double b = sc.nextDouble();
            System.out.print("Digite o 3° valor: ");
            double c = sc.nextDouble();

            // CÁLCULOS / PROCESSAMENTO
            double trianguloRetangulo = (a * c) / 2;
            double circulo = 3.14159 * (c * c);
            double trapezio = ((a + b) * c) / 2;
            double quadrado = b * b;
            double retangulo = a * b;
            
            // SAÍDAS
            System.out.println();
            System.out.printf("Área do triângulo retângulo: %.3f%n", trianguloRetangulo);
            System.out.printf("Área do círculo: %.3f%n", circulo);
            System.out.printf("Área do trapézio: %.3f%n", trapezio);
            System.out.printf("Área do quadrado: %.3f%n", quadrado);
            System.out.printf("Área do retângulo: %.3f%n", retangulo);
            System.out.println();

        sc.close();

    }
}