import java.util.Scanner;
import java.util.Locale;

public class Sequencial04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Salário do funcionário!");
            System.out.print("Horas trabalhadas (mensais): "); int horasTrabalhadas = sc.nextInt();
            System.out.print("Valor que recebe (por hora): "); double valorPorHora = sc.nextDouble();

            double salario = horasTrabalhadas * valorPorHora;

            System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();

    }
}