import java.util.Scanner;

public class GrenaisCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grenais = 0;
        int interWins = 0;
        int gremioWins = 0;
        int draws = 0;

        while (true) {
            int interGoals = scanner.nextInt();
            int gremioGoals = scanner.nextInt();

            if (interGoals > gremioGoals) {
                interWins++;
            } else if (gremioGoals > interGoals) {
                gremioWins++;
            } else {
                draws++;
            }

            grenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            if (scanner.nextInt()==2)break;
        }

        scanner.close();

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);

        if (interWins > gremioWins) {
            System.out.println("Inter venceu mais");
        } else if (gremioWins > interWins) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }
    }
}
