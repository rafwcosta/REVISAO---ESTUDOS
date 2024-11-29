import java.util.Scanner;
import java.util.Locale;

public class Seq04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número de horas trabalhadas: ");
            double horasTrabalhadas = sc.nextDouble();
            System.out.print("Digite o valor que recebe por hora: ");
            double valorPorHora = sc.nextDouble();

            double salario = horasTrabalhadas * valorPorHora;

            System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();

    }
}