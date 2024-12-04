import java.util.Scanner;
import java.util.Locale;

public class Condicional04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Duração do jogo!");
            System.out.print("Digite a hora inicial do jogo: ");
            int horaInicial = sc.nextInt();
            System.out.print("Agora, a hora final: ");
            int horaFinal = sc.nextInt();

            int duracao;

            if (horaInicial < horaFinal) {
                duracao = horaFinal - horaInicial;
            }
            else {
                duracao = 24 - horaInicial + horaFinal;
            }

            System.out.println("O jogo durou " + duracao + " horas!");

        sc.close();

    }    
}